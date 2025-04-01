package thiGK.ntu64132072.HoTanTai_BaiThiGK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping("/dashboard")
	public String trangChu() {
		return "home";
	}
	
}
