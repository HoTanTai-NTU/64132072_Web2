package thiGK.ntu64132072.HoTanTai_BaiThiGK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping("/dashboard")
	public String trangChu() {
		return "home";
	}
	@GetMapping("/dashboard")
	public String dsTopic() {
		return "topiclist";
	}
	@GetMapping("/dashboard")
	public String themTopic() {
		return "addtopic";
	}
	@GetMapping("/dashboard")
	public String viewTopic() {
		return "viewtopic";
	}
	@GetMapping("/dashboard")
	public String xoaTopic() {
		return "deletetopic";
	}
}
