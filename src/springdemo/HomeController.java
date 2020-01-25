package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@RequestMapping("home")
public class HomeController {
	@RequestMapping("/home")
	public String showPage() {
		System.out.println("~~~~~~ Hello App ~~~~~~");
		return "page-home";
	}
}
