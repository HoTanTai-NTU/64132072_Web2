package htt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	//http://ten-mien:cong/HelloSpringMVC/say-hi
	@RequestMapping("say-hi")
	public String SayHello() {
		return "chao";
	}
}
