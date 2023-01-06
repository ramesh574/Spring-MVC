package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;
@Controller
public class ContactController {
	@Autowired
	private UserService service;
	
  @RequestMapping("/contact")
  public String showForm()
  {
	  return "contact";
  }
   @ModelAttribute
   public void dataForModel(Model model)
   {
	  // model.addAttribute("head","Learn Code with RAY");
	  model.addAttribute("man", "Your Most welcome");
   }
  
//  @RequestMapping(path="/processform",method=RequestMethod.POST)
//  public String handleForm(HttpServletRequest request )
//  { 
//	  String email=request.getParameter("email");
//	  System.out.println("user email is = "+email);
//	  return"";
//  }
  
  @RequestMapping(path="/processform",method=RequestMethod.POST)
  public String handleForm(@ModelAttribute User user,Model model)
  {
	  System.out.println(user);
	  if(user.getUserName().isBlank() || user.getEmail().isBlank() ||user.getUserPassword().isBlank()) {
			return "redirect:/contact";
		}
	 
	  this.service.createUser(user);
	  model.addAttribute("msg"," User created with id "+user.getId());
	  return"success";
  }
  
  
//  @RequestMapping(path="/processform",method=RequestMethod.POST)
//  public String handleForm(@RequestParam("userName") String name,
//		                   @RequestParam ("email") String email,
//		                   @RequestParam ("userPassword") String password,
//		                   Model model)
//  {
//	  System.out.println("name"+name);
//	  System.out.println("email"+email);
//	  System.out.println("password"+password);
//	  //proccess
//	  model.addAttribute("name",name );
//	  model.addAttribute("email",email );
//	  model.addAttribute("password",password );
//	  return "success";
//  }
  /*@RequestMapping(path="/processform",method=RequestMethod.POST)
  public String handleForm(@RequestParam("userName") String name,
		                   @RequestParam ("email") String email,
		                   @RequestParam ("userPassword") String password,
		                   Model model)
  {
	  User user=new User();
	  user.setEmail(email);
	  user.setUserName(name);
	  user.setUserPassword(password);
	  System.out.println(user);
	  //proccess
//	  model.addAttribute("name",name );
//	  model.addAttribute("email",email );
//	  model.addAttribute("password",password );
	  model.addAttribute("user",user);
	  return "success";
  }*/
  
  
  
  
  
}
