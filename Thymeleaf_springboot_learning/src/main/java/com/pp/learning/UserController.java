package com.pp.learning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pp.learning.model.User;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	
	@GetMapping("/ifelse")
	public String ifelse(Model model) {
		List<User> users = new ArrayList<>();
		users.add(new User("prabhat", "prabhat@123", "devops"));
		users.add(new User("priya", "priya@123", "hr"));
		users.add(new User("puja", "puja@123", "IT"));
		users.add(new User("riya", "riya@123", "ADMIN"));
		users.add(new User("amey", "amey@123", "finance"));
		model.addAttribute("users", users);
		return "if-unless";
	}
	
	@GetMapping("/switch-case")
	public String getMethodName(Model model) {
	    User user = new User("Ramesh", "prabhatpandey31052gmail.com","ADMIN");
	    model.addAttribute("user", user);
	    return "switch-case";
	}
	
}

