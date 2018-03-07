package com.zanzhu.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zanzhu.mapper.CompanyMapper;
import com.zanzhu.mapper.SponsorMapper;
import com.zanzhu.mapper.UserMapper;
import com.zanzhu.pojo.Sponsor;
import com.zanzhu.pojo.SponsorExample;
import com.zanzhu.pojo.SponsorExample.Criteria;
import com.zanzhu.pojo.User;
import com.zanzhu.util.ConditionUtils;
import com.zanzhu.util.FileUtil;
import com.zanzhu.util.PageBean;
import com.zanzhu.util.ParamBean;
import com.zanzhu.util.WebUtils;

@Controller
public class SponsorController {

	public static int PAGE_SIZE = 10;
	@Autowired
	WebUtils webUtils;

	@Autowired
	CompanyMapper companyMapper;

	@Autowired
	SponsorMapper sponsorMapper;
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping(value="/sponsor")
	public String defaultSponsor(){
		return "redirect:/sponsor/0-0-0-0";
	}

	@RequestMapping(value = "/sponsor/publish")
	public String publish(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		User user = webUtils.currentUser(request, response);
		map.put("user", user);
		return "sponsorpublish";
	}

	@RequestMapping(value = "/sponsorPub", method = RequestMethod.POST)
	public @ResponseBody String doPublish(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "file", required = false) MultipartFile file,
			@RequestParam(value = "sponsor_name", required = true) String sponsor_name,
			@RequestParam(value = "sponsor_money", required = true) String sponsor_money,
			@RequestParam(value = "sponsor_category", required = true) String sponsor_category,
			@RequestParam(value = "sponsor_address_1", required = true) String sponsor_address_1,
			@RequestParam(value = "sponsor_address_2", required = true) String sponsor_address_2,
			@RequestParam(value = "start_time", required = true) String start_time,
			@RequestParam(value = "end_time", required = true) String end_time,
			@RequestParam(value = "sponsor_plan", required = true) String sponsor_plan, Map<String, Object> map) {
		User user = webUtils.currentUser(request, response);
		Sponsor sponsor = new Sponsor();
		System.out.println("!!!!!!!!!!!!!!!!!!");
		if (file != null) {
			String fileName;
			String contentType = file.getContentType();
			fileName = file.getOriginalFilename();
			/*
			 * System.out.println("fileName-->" + fileName);
			 * System.out.println("getContentType-->" + contentType);
			 */
			String filePath = request.getSession().getServletContext().getRealPath("upload/file/");
			try {
				FileUtil.uploadFile(file.getBytes(), filePath, fileName);
			} catch (Exception e) {
				// TODO: handle exception
			}
			sponsor.setSponsorAttachment(fileName);
		}
		// 保存sponsor
		sponsor.setSponsorName(sponsor_name);
		sponsor.setSponsorMoney(BigDecimal.valueOf(Double.parseDouble(sponsor_money)));
		sponsor.setSponsorCategory(sponsor_category);
		sponsor.setSponsorAddress(sponsor_address_1 + "-" + sponsor_address_2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

		try {
			sponsor.setStartTime(sdf.parse(start_time));
			sponsor.setEndTime(sdf.parse(end_time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sponsor.setSponsorPlan(sponsor_plan);
		sponsor.setSponsorCompanyId(user.getUserId());
		//
		sponsorMapper.insert(sponsor);

		return "success";
	}

	@RequestMapping(value = { "/sponsor/{digits}/{current_page}", "/sponsor/{digits}" })
	public String sponsor(@PathVariable(value = "digits") String digits,
			@PathVariable(value = "curren_page", required = false) Integer current_page, HttpServletRequest request,
			HttpServletResponse response, Map<String, Object> map) {
		User user = webUtils.currentUser(request, response);
		map.put("user", user);
		int[] digit = ConditionUtils.parse(digits);
		int first = digit[0];
		int second = digit[1];
		int third = digit[2];
		int fourth = digit[3];
		current_page = current_page == null ? 1 : current_page;
		System.out.println(current_page);
		List<Sponsor> list = null;
		if (first == 0) {
			list = sponsorMapper.selectByExample(new SponsorExample());
			SponsorExample sponsorExample = new SponsorExample();
			Criteria criteria = sponsorExample.createCriteria();
			if (third != 0) {
				int[] money = ConditionUtils.money[third - 1];
				criteria.andSponsorMoneyBetween(new BigDecimal(money[0]), new BigDecimal(money[1]));
			}
			if (fourth != 0) {
				String kind = ConditionUtils.kind[fourth - 1];
				criteria.andSponsorCategoryEqualTo(kind);
			}
			list = sponsorMapper.selectByExample(sponsorExample);
		}
		if (first != 0 && second != 0) {
			String address = ConditionUtils.address2String(first, second);
			SponsorExample sponsorExample = new SponsorExample();
			Criteria criteria = sponsorExample.createCriteria();
			if (third != 0) {
				int[] money = ConditionUtils.money[third - 1];
				criteria.andSponsorMoneyBetween(new BigDecimal(money[0]), new BigDecimal(money[1]));
			}
			if (fourth != 0) {
				String kind = ConditionUtils.kind[fourth - 1];
				criteria.andSponsorCategoryEqualTo(kind);
			}
			criteria.andSponsorAddressLike(address);
			list = sponsorMapper.selectByExample(sponsorExample);

		} else if (first != 0 && second == 0) {
			String address = ConditionUtils.ADDRESS1[first - 1];
			SponsorExample sponsorExample = new SponsorExample();
			Criteria criteria = sponsorExample.createCriteria();
			if (third != 0) {
				int[] money = ConditionUtils.money[third - 1];
				criteria.andSponsorMoneyBetween(new BigDecimal(money[0]), new BigDecimal(money[1]));
			}
			if (fourth != 0) {
				String kind = ConditionUtils.kind[fourth - 1];
				criteria.andSponsorCategoryEqualTo(kind);
			}
			criteria.andSponsorAddressLike(address);
			list = sponsorMapper.selectByExample(sponsorExample);
		}
		PageBean pageBean = new PageBean();
		pageBean.setTotalPage(list.size() % PAGE_SIZE == 0 ? list.size() / PAGE_SIZE : list.size() / PAGE_SIZE + 1);
		pageBean.setTotalRecord(list.size());
		pageBean.setCurrentPage(current_page > pageBean.getTotalPage() ? 1 : current_page);
		pageBean.setCurrentRecord((current_page + 1) > pageBean.getTotalPage()
				? pageBean.getTotalRecord() - (current_page - 1) * 10 : 10);
		List<Sponsor> splitList = list.subList((current_page - 1) * 10,
				(current_page - 1) * 10 + pageBean.getCurrentRecord());
		ParamBean paramBean = new ParamBean();
		paramBean.setFirst(first);
		paramBean.setSecond(second);
		paramBean.setThird(third);
		paramBean.setFourth(fourth);
		map.put("paramBean", paramBean);
		map.put("sponsorList", splitList);
		map.put("pageBean", pageBean);
		if (first != 0)
			map.put("address2", ConditionUtils.ADDRESS2[first - 1]);
		return "sponsor";
	}

	@RequestMapping(value = "/sponsor/details/{sponsor_id}")
	public String details(@PathVariable(value = "sponsor_id") int sponsor_id, HttpServletRequest request,
			HttpServletResponse response, Map<String, Object> map) {
		User user = webUtils.currentUser(request, response);
		Sponsor sponsor = sponsorMapper.selectByPrimaryKey(sponsor_id);
		User pubUser = userMapper.selectByPrimaryKey(sponsor.getSponsorCompanyId());
		map.put("user", user);
		map.put("sponsor", sponsor);
		map.put("pubUser", pubUser);
		return "details";
	}
}
