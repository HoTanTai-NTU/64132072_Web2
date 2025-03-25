package ntu.edu.TongHopGK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping("/")
	public String trangChu() {
		return "home";
	}
	
	@GetMapping("/about")
	public String gioiThieu() {
		return "about";
	}
	
	@GetMapping("/studentlist")
	public String danhSach() {
		return "studentlist";
	}
	
	@GetMapping("/add")
	public String themMoi() {
		return "addnew";
	}
}
