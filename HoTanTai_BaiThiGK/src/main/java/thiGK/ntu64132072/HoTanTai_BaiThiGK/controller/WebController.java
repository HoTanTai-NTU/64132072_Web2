package thiGK.ntu64132072.HoTanTai_BaiThiGK.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;

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
	@RequestMapping("/topic")
	public class PageController {

	    @GetMapping("/all")
	    public String listPages(ModelMap model) {
	        model.addAttribute("topics", topics);
	        return "list";
	    }

	    @GetMapping("/new")
	    public String addNewTopicForm(ModelMap model) {
	        return "addnew";
	    }
}
