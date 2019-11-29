package ie.seirbhisi.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {

	@RequestMapping("/index")
	public String handleIndex() {
	    return "pages/index";
	}
	@RequestMapping("/")
	public String index() {
		return "pages/index";
	}
	@RequestMapping("/two")
	public String pageTwo() {
		return "pages/pageTwo";
	}
	@RequestMapping("/three")
	public String pageThree() {
		return "pages/pageThree";
	}
}
