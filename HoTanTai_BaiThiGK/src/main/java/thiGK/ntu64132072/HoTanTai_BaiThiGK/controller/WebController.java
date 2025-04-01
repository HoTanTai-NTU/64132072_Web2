package thiGK.ntu64132072.HoTanTai_BaiThiGK.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import thiGK.ntu64132072.HoTanTai_BaiThiGK.model.Topic;

@Controller
	@RequestMapping("/dashboard")
	public class WebController {
	private ArrayList<Topic> topics = new ArrayList<>(Arrays.asList(
		    new Topic(1, "Trang chủ", "Trang chính của hệ thống", 101, "Web"),
		    new Topic(2, "Giới thiệu", "Thông tin giới thiệu", 102, "Thuyết trình"),
		    new Topic(3, "Liên hệ", "Trang liên hệ", 103, "Web")
		));
	@GetMapping("/topic/all")
    public String listTopics(ModelMap model) {
        model.addAttribute("topics", topics);
        return "topiclist";
    }

    @GetMapping("/topic/new")
    public String addNewTopicForm() {
        return "addtopic";
    }

    @PostMapping("/topic/add")
    public String addTopic(@RequestParam("id") int id, 
            @RequestParam("topicName") String topicName, 
            @RequestParam("topicDescription") String topicDescription, 
            @RequestParam("supervisorId") int supervisorId,
            @RequestParam("topicType") String topicType, 
            ModelMap model) {
    	topics.add(new Topic(id, topicName, topicDescription, supervisorId, topicType));
    	model.addAttribute("topics", topics);
    	return "list";
    }
}
