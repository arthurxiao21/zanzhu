package com.zanzhu.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zanzhu.mapper.CompanyMapper;
import com.zanzhu.mapper.CommunityMapper;
import com.zanzhu.mapper.UserMapper;
import com.zanzhu.pojo.Company;
import com.zanzhu.pojo.CompanyExample;
import com.zanzhu.pojo.Community;
import com.zanzhu.pojo.CommunityExample;
import com.zanzhu.pojo.User;
import com.zanzhu.pojo.UserExample;
import com.zanzhu.pojo.UserExample.Criteria;
import com.zanzhu.util.FileUtil;
import com.zanzhu.util.HashKit;
import com.zanzhu.util.WebUtils;

@Controller
public class UserController {
	@Autowired
	UserMapper userMapper;
	@Autowired
	CompanyMapper companyMapper;
	@Autowired
	CommunityMapper communityMapper;
	@Autowired
	WebUtils webUtils;

	@RequestMapping(value = "/registerCompany", method = RequestMethod.POST)
	public String registerCompany(@RequestParam(name = "name", required = true) String name,
			@RequestParam(name = "user_password", required = true) String user_pass,
			@RequestParam(name = "contact_name", required = true) String c_name,
			@RequestParam(name = "contact_email", required = true) String c_email,
			@RequestParam(name = "contact_phone", required = true) String c_phone, Map<String, Object> map) {
		CompanyExample example = new CompanyExample();
		com.zanzhu.pojo.CompanyExample.Criteria criteria = example.createCriteria();
		criteria.andCompanyNameEqualTo(name);
		if (!companyMapper.selectByExample(example).isEmpty()) {
			map.put("msg", "name_occupied");
			return "status";
		}
		// 先保存user再保存company
		User user = new User();
		user.setUserPassword(HashKit.md5(user_pass));
		user.setUserRole("0");
		user.setContactEmail(c_email);
		user.setContactName(c_name);
		user.setContactPhone(c_phone);
		userMapper.insertAndGetID(user);
		Company company = new Company();
		company.setUserId(user.getUserId());
		company.setCompanyName(name);
		companyMapper.insert(company);
		map.put("msg", "register_success");
		return "status";
	}

	@RequestMapping(value = "/registerCommunity", method = RequestMethod.POST)
	public String registerCommunity(@RequestParam(name = "name", required = true) String name,
			@RequestParam(name = "user_password", required = true) String user_pass,
			@RequestParam(name = "contact_name", required = true) String c_name,
			@RequestParam(name = "contact_email", required = true) String c_email,
			@RequestParam(name = "contact_phone", required = true) String c_phone, Map<String, Object> map) {
		CommunityExample example = new CommunityExample();
		com.zanzhu.pojo.CommunityExample.Criteria criteria = example.createCriteria();
		criteria.andCommunityNameEqualTo(name);
		if (!communityMapper.selectByExample(example).isEmpty()) {
			map.put("msg", "name_occupied");
			return "status";
		}
		User user = new User();
		user.setUserPassword(HashKit.md5(user_pass));
		user.setUserRole("1");
		user.setContactEmail(c_email);
		user.setContactName(c_name);
		user.setContactPhone(c_phone);
		userMapper.insertAndGetID(user);
		System.out.println(user.getUserId());
		Community community = new Community();
		community.setUserId(user.getUserId());
		community.setCommunityName(name);
		communityMapper.insert(community);
		map.put("msg", "register_success");
		return "status";
	}

	@RequestMapping("/register")
	public String register() {

		return "register";
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(name = "name", required = true) String name,
			@RequestParam(name = "password", required = true) String password, Map<String, Object> map) {
		if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
			map.put("msg", "wrong");
			return "loginStatus";
		}
		if (name.contains("@")) {
			UserExample example = new UserExample();
			Criteria criteria = example.createCriteria();
			criteria.andContactEmailEqualTo(name);
			if (userMapper.selectByExample(example).isEmpty()) {
				map.put("msg", "wrong");
				return "status";
			}
			User user = userMapper.selectByExample(example).get(0);
			if (user.getUserPassword().equals(HashKit.md5(password))) {
				WebUtils.loginUser(request, response, user, true);
				map.put("msg", "login_success");
				return "status";
			}
			map.put("msg", "wrong");
			return "status";
		}
		User user = userMapper.selectByPrimaryKey(Integer.valueOf(name));
		if (user == null) {
			map.put("msg", "wrong");
			return "status";
		}
		if (user.getUserPassword().equals(HashKit.md5(password))) {
			WebUtils.loginUser(request, response, user, true);
			map.put("msg", "login_uccess");
			System.out.println(user.getUserId());
			return "status";
		} else {
			map.put("msg", "wrong");
			return "status";
		}

	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		WebUtils.logoutUser(request, response);
		return "index";
	}

	@RequestMapping("/member/{id}")
	public String member(@PathVariable("id") Integer id, Map<String, Object> map) {
		User user = userMapper.selectByPrimaryKey(id);
		if (user.getUserRole().equals("0")) {
			Company company = companyMapper.selectByPrimaryKey(id);
			map.put("user", user);
			map.put("company", company);
			return "member";
		} else {
			Community community = communityMapper.selectByPrimaryKey(id);
			map.put("community", community);
			map.put("user", user);
			return "member";
		}
	}

	@RequestMapping("/member/{id}/alter")
	public String memberAlter(@PathVariable("id") Integer id, Map<String, Object> map) {
		User user = userMapper.selectByPrimaryKey(id);
		map.put("user", user);
		System.out.println(user.getUserRole());
		if (user.getUserRole().equals("0")) {
			Company company = companyMapper.selectByPrimaryKey(id);
			map.put("company", company);
			return "memberAlter";
		}
		Community community = communityMapper.selectByPrimaryKey(id);
		map.put("community", community);
		return "memberAlter";
	}

	@RequestMapping(value = "/doAvatarAlter", method = RequestMethod.POST)
	public @ResponseBody String doAvatarAlter(@RequestParam("file") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) {
		String contentType = file.getContentType();
		String fileName = file.getOriginalFilename();
		/*
		 * System.out.println("fileName-->" + fileName);
		 * System.out.println("getContentType-->" + contentType);
		 */
		String filePath = request.getSession().getServletContext().getRealPath("upload/avatar/");
		try {
			FileUtil.uploadFile(file.getBytes(), filePath, fileName);
		} catch (Exception e) {
			// TODO: handle exception
		}
		User user = webUtils.currentUser(request, response);
		user.setAvatar(fileName);
		userMapper.updateByPrimaryKey(user);
		// 返回json
		return "uploadimg success";
	}

	@RequestMapping(value = "/doCompanyAlter", method = RequestMethod.POST)
	public @ResponseBody String doCompanyAlter(@RequestParam("name") String name, 
			@RequestParam("c_name") String c_name,
			@RequestParam("c_phone") String c_phone, 
			@RequestParam("c_email") String c_email,
			@RequestParam("c_sex") String c_sex, 
			@RequestParam("company_kind") String company_kind,
			@RequestParam("company_cate") String comany_cate, 
			@RequestParam("company_size") String company_size,
			@RequestParam("company_intro") String company_intro, 
			HttpServletRequest request,
			HttpServletResponse response) {
		User user = webUtils.currentUser(request, response);
		user.setContactEmail(c_email);
		user.setContactName(c_name);
		user.setContactPhone(c_phone);
		user.setContactSex(c_sex);
		userMapper.updateByPrimaryKey(user);
		Company company = companyMapper.selectByPrimaryKey(user.getUserId());
		company.setCompanyKind(company_kind);
		company.setCompanyCategory(comany_cate);
		company.setCompanySize(company_size);
		company.setCompanyIntro(company_intro);
		companyMapper.updateByPrimaryKey(company);
		return "修改成功";
	}

	@RequestMapping(value = "/doCommunityAlter", method = RequestMethod.POST)
	public @ResponseBody String doCommunityAlter(@RequestParam("name") String name, @RequestParam("c_name") String c_name,
			@RequestParam("c_phone") String c_phone, @RequestParam("c_email") String c_email,
			@RequestParam("c_sex") String c_sex, @RequestParam("company_kind") String company_kind,
			@RequestParam("company_cate") String comany_cate, @RequestParam("company_size") String company_size,
			@RequestParam("company_intro") String company_intro, HttpServletRequest request,
			HttpServletResponse response) {
		User user = webUtils.currentUser(request, response);
		user.setContactEmail(c_email);
		user.setContactName(c_name);
		user.setContactPhone(c_phone);
		user.setContactSex(c_sex);
		userMapper.updateByPrimaryKey(user);
		Company company = companyMapper.selectByPrimaryKey(user.getUserId());
		company.setCompanyKind(company_kind);
		company.setCompanyCategory(comany_cate);
		company.setCompanySize(company_size);
		company.setCompanyIntro(company_intro);
		companyMapper.updateByPrimaryKey(company);
		return "修改成功";
	}
}
