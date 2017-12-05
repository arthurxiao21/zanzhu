package com.zanzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActivityController {

	@RequestMapping("/activity")
	public String tempActivity() {
		return "activity";
	}
}
