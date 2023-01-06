package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("THis is home URL");
		model.addAttribute("name","Ramesh Kumar Parjapati");
		model.addAttribute("Id",1234);
		List<String> friends=new ArrayList<String>();
		friends.add("Ramesh Kumar");
		friends.add("Amit Patel");
		friends.add("Ankit Sharma");
		friends.add("Yogesh Vishwkarma");
		model.addAttribute("f",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		//creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		//setting the data
		modelAndView.addObject("name","Ramesh");
		modelAndView.addObject("Id",123);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		//now.toString();
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}

	
	
}
