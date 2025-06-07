package web2.ntu64132072.HoTanTai_DoAnWeb2.controller;

import java.io.InputStream;
import java.nio.file.*;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import web2.ntu64132072.HoTanTai_DoAnWeb2.model.Product;
import web2.ntu64132072.HoTanTai_DoAnWeb2.model.ProductDTO;
import web2.ntu64132072.HoTanTai_DoAnWeb2.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@GetMapping({"", "/"})
	public String productList(Model model) {
		List<Product> products = repo.findAll();
		model.addAttribute("products", products);
		return "products/list";
	}
	
	@GetMapping("/create")
	public String showCreateForm(Model model) {
		ProductDTO productDTO = new ProductDTO();
		model.addAttribute("productDTO", productDTO);
		return "products/create";
	}
	
	@PostMapping("/create")
	public String createProduct(@Valid @ModelAttribute ProductDTO productDTO, 
			BindingResult result) {
		if (productDTO.getImageFile().isEmpty()) {
			result.addError(new FieldError("productDTO", "imageFile", "Thiếu ảnh để tạo"));
		}
		if (result.hasErrors()) {
			return "products/create";
		}
		MultipartFile image = productDTO.getImageFile();
		Date dateCreated = new Date();
		String storageFileName = image.getOriginalFilename();
		try {
			String uploadDir = "uploads/";
			Path uploadPath = Paths.get(uploadDir);
			if (!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}
			try (InputStream inputStream = image.getInputStream()) {
				Files.copy(inputStream, Paths.get(uploadDir + storageFileName), 
						StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		Product product = new Product();
		product.setName(productDTO.getName());
		product.setBrand(productDTO.getBrand());
		product.setCategory(productDTO.getCategory());
		product.setPrice(productDTO.getPrice());
		product.setDescription(productDTO.getDescription());
		product.setDateCreated(dateCreated);
		product.setImageFileName(storageFileName);
		repo.save(product);
		return "redirect:/products";
	}
	@GetMapping("/edit")
	public String showEditForm(Model model, @RequestParam int id) {
		try {
			Product product = repo.findById(id).get();
			model.addAttribute("product", product);
			ProductDTO productDTO = new ProductDTO();
			productDTO.setName(productDTO.getName());
			productDTO.setBrand(productDTO.getBrand());
			productDTO.setCategory(productDTO.getCategory());
			productDTO.setPrice(productDTO.getPrice());
			productDTO.setDescription(productDTO.getDescription());
			model.addAttribute("productDTO", productDTO);
		} catch(Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
			return "redirect:/products";
		}
		return "products/edit";
	}
	@PostMapping("/edit")
	public String updateProduct(Model model, @RequestParam int id, 
			@Valid @ModelAttribute ProductDTO productDTO, BindingResult result) {
		try {
			Product product = repo.findById(id).get();
			model.addAttribute("product", product);
			if (result.hasErrors()) {
				return "products/edit";
			}
			if (!productDTO.getImageFile().isEmpty()) {
				String uploadDir = "uploads/";
				Path oldImagePath = Paths.get(uploadDir + product.getImageFileName());
				try {
					Files.delete(oldImagePath);
				} catch(Exception ex) {
					System.out.println("Exception: " + ex.getMessage());
				}
				MultipartFile image = productDTO.getImageFile();
				Date dateCreated = new Date();
				String storageFileName = image.getOriginalFilename();
				try (InputStream inputStream = image.getInputStream()) {
					Files.copy(inputStream, Paths.get(uploadDir + storageFileName), 
							StandardCopyOption.REPLACE_EXISTING);
				}
				product.setImageFileName(storageFileName);
			}
			product.setName(productDTO.getName());
			product.setBrand(productDTO.getBrand());
			product.setCategory(productDTO.getCategory());
			product.setPrice(productDTO.getPrice());
			product.setDescription(productDTO.getDescription());
			repo.save(product);
		} catch(Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
			
		}
		return "redirect:/products";
	}
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam int id) {
		try {
			Product product = repo.findById(id).get();
			Path imagePath = Paths.get("images/" + product.getImageFileName());
			try {
				Files.delete(imagePath);
			} catch(Exception ex) {
				System.out.println("Exception: " + ex.getMessage());
			}
			repo.delete(product);
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		return "redirect:/products";
	}
}

