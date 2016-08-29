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
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String first() {
		return "first";
	}
	@RequestMapping(value = "/socialAnalysis", method = RequestMethod.GET)
	public String socialAnalysis() {
		return "socialAnalysis";
	}
	@RequestMapping(value = "/thr", method = RequestMethod.GET)
	public String thr() {
		return "thr";
	}
	
	
	@RequestMapping(value = "/socialAnalysisMain", method = RequestMethod.GET)
	public String socialAnalysisMain() {
		return "socialAnalysis/socialAnalysisMain";
	}
	@RequestMapping(value = "/socialAnalysisFirst", method = RequestMethod.GET)
	public String socialAnalysisFirst() {
		return "socialAnalysis/socialAnalysisFirst";
	}
	@RequestMapping(value = "/socialAnalysisSec", method = RequestMethod.GET)
	public String socialAnalysisSec() {
		return "socialAnalysis/socialAnalysisSec";
	}
	
	
}
