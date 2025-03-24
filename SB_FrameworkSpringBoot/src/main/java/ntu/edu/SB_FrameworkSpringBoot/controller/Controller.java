package ntu.edu.SB_FrameworkSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
	@GetMapping("/")
	public String trangChu() {
		return "frontEndViews/index";
	}
	
	@GetMapping("/about")
	public String gioiThieu() {
		return "frontEndViews/about";
	}
}