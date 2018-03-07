package com.zanzhu.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zanzhu.pojo.User;
import com.zanzhu.util.WebUtils;

@Controller
public class IndexController {

	@Autowired
	WebUtils webUtils;
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response,Map<String,Object> map){
		User user = webUtils.currentUser(request, response);
		map.put("user",user);
		return "index";
	}
}
