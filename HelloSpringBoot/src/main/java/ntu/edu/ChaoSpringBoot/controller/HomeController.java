package ntu.edu.ChaoSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String trangChu() {
		return "index";
	}
	@GetMapping("/truyenObject")
	public String hamABCD(ModelMap m) {
		return null;
		
	}
	@GetMapping("/truyendsObject")
	public String hamMNK(ModelMap m) {
		return null;
		
	}
}