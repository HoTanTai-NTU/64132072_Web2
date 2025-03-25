package ntu.edu.TongHopGK.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebController {
	@GetMapping("/")
	public String trangChu() {
		return "home";
	}
	
	@GetMapping("/about")
	public String gioiThieu() {
		return "about";
	}
	
	@GetMapping("/")
	public String list() {
		return "studentlist";
	}
	
	@GetMapping("/about")
	public String addNew() {
		return "addnew";
	}
}
