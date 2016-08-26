package com.daumsoft.sitemesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value = "first", method = RequestMethod.GET)
	public String first() {
		return "first";
	}
	@RequestMapping(value = "sec", method = RequestMethod.GET)
	public String sec() {
		return "sec";
	}
	@RequestMapping(value = "thr", method = RequestMethod.GET)
	public String thr() {
		return "thr";
	}
	
	
}
