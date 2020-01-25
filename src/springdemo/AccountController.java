package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/account")
public class AccountController {

	@RequestMapping("/login")
	public String login() {
		System.out.println("~~~~~~~~~~ Login Page ~~~~~~~~~~");
		return "account/login";
	}

	@RequestMapping("/register")
	public String register() {
		System.out.println("~~~~~~~~~~ Register Page ~~~~~~~~~~");
		return "account/register";
	}

}