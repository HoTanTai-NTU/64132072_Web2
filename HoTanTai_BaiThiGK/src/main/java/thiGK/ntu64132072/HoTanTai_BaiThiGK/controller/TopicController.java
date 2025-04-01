package thiGK.ntu64132072.HoTanTai_BaiThiGK.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import thiGK.ntu64132072.HoTanTai_BaiThiGK.model.Topic;

@Controller
public class TopicController {
@GetMapping("/dashboard")
public String dashboard() {
	return "home";
}
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
	String viewUrl = "/topic/view/" + id;
    String editUrl = "/topic/edit/" + id;
    String deleteUrl = "/topic/delete/" + id;
	topics.add(new Topic(id, topicName, topicDescription, supervisorId, topicType, viewUrl, editUrl, deleteUrl));
	model.addAttribute("topics", topics);
	return "topiclist";
}
}
