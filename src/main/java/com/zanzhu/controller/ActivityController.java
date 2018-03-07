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

import com.zanzhu.mapper.ActivityMapper;
import com.zanzhu.mapper.CommunityMapper;
import com.zanzhu.mapper.UserMapper;
import com.zanzhu.pojo.Activity;
import com.zanzhu.pojo.ActivityExample;
import com.zanzhu.pojo.ActivityExample.Criteria;
import com.zanzhu.pojo.User;
import com.zanzhu.util.ConditionUtils;
import com.zanzhu.util.FileUtil;
import com.zanzhu.util.PageBean;
import com.zanzhu.util.ParamBean;
import com.zanzhu.util.WebUtils;

@Controller
public class ActivityController {

	public static int PAGE_SIZE = 10;
	@Autowired
	WebUtils webUtils;

	@Autowired
	CommunityMapper communityMapper;

	@Autowired
	ActivityMapper activityMapper;
	@Autowired
	UserMapper userMapper;

	@RequestMapping(value = "/activity")
	public String defaultactivity() {
		return "redirect:/activity/0-0-0-0";
	}

	@RequestMapping(value = "/activity/publish")
	public String publish(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		User user = webUtils.currentUser(request, response);
		map.put("user", user);
		return "activityPublish";
	}

	@RequestMapping(value = "/activityPub", method = RequestMethod.POST)
	public @ResponseBody String doPublish(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "file", required = false) MultipartFile file,
			@RequestParam(value = "activity_name", required = true) String acvitity_name,
			@RequestParam(value = "activity_money", required = true) String activity_money,
			@RequestParam(value = "activity_category", required = true) String activity_category,
			@RequestParam(value = "activity_address_1", required = true) String activity_address_1,
			@RequestParam(value = "activity_address_2", required = true) String activity_address_2,
			@RequestParam(value = "start_time", required = true) String start_time,
			@RequestParam(value = "end_time", required = true) String end_time,
			@RequestParam(value = "activity_plan", required = true) String activity_plan, Map<String, Object> map) {
		User user = webUtils.currentUser(request, response);
		Activity activity = new Activity();
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
			activity.setActivityAttachment(fileName);
		}
		// 保存activity
		activity.setActivityName(acvitity_name);
		activity.setActivityMoney(BigDecimal.valueOf(Double.parseDouble(activity_money)));
		activity.setActivityCategory(activity_category);
		activity.setActivityAddress(activity_address_1 + "-" + activity_address_2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

		try {
			activity.setStartTime(sdf.parse(start_time));
			activity.setEndTime(sdf.parse(end_time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		activity.setActivityPlan(activity_plan);
		activity.setActivityCommunityId(user.getUserId());		//
		activityMapper.insert(activity);

		return "success";
	}

	@RequestMapping(value = { "/activity/{digits}/{current_page}", "/activity/{digits}" })
	public String activity(@PathVariable(value = "digits") String digits,
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
		List<Activity> list = null;
		if (first == 0) {
			list = activityMapper.selectByExample(new ActivityExample());
			ActivityExample activityExample = new ActivityExample();
			Criteria criteria = activityExample.createCriteria();
			if (third != 0) {
				int[] money = ConditionUtils.money[third - 1];
				criteria.andActivityMoneyBetween(new BigDecimal(money[0]), new BigDecimal(money[1]));
			}
			if (fourth != 0) {
				String kind = ConditionUtils.kind[fourth - 1];
				criteria.andActivityCategoryEqualTo(kind);
			}
			list = activityMapper.selectByExample(activityExample);
		}
		if (first != 0 && second != 0) {
			String address = ConditionUtils.address2String(first, second);
			ActivityExample activityExample = new ActivityExample();
			Criteria criteria = activityExample.createCriteria();
			if (third != 0) {
				int[] money = ConditionUtils.money[third - 1];
				criteria.andActivityMoneyBetween(new BigDecimal(money[0]), new BigDecimal(money[1]));
			}
			if (fourth != 0) {
				String kind = ConditionUtils.kind[fourth - 1];
				criteria.andActivityCategoryEqualTo(kind);
			}
			criteria.andActivityAddressLike(address);
			list = activityMapper.selectByExample(activityExample);

		} else if (first != 0 && second == 0) {
			String address = ConditionUtils.ADDRESS1[first - 1];
			ActivityExample activityExample = new ActivityExample();
			Criteria criteria = activityExample.createCriteria();
			if (third != 0) {
				int[] money = ConditionUtils.money[third - 1];
				criteria.andActivityMoneyBetween(new BigDecimal(money[0]), new BigDecimal(money[1]));
			}
			if (fourth != 0) {
				String kind = ConditionUtils.kind[fourth - 1];
				criteria.andActivityCategoryEqualTo(kind);
			}
			criteria.andActivityAddressLike(address);
			list = activityMapper.selectByExample(activityExample);
		}
		PageBean pageBean = new PageBean();
		pageBean.setTotalPage(list.size() % PAGE_SIZE == 0 ? list.size() / PAGE_SIZE : list.size() / PAGE_SIZE + 1);
		pageBean.setTotalRecord(list.size());
		pageBean.setCurrentPage(current_page > pageBean.getTotalPage() ? 1 : current_page);
		pageBean.setCurrentRecord((current_page + 1) > pageBean.getTotalPage()
				? pageBean.getTotalRecord() - (current_page - 1) * 10 : 10);
		List<Activity> splitList = list.subList((current_page - 1) * 10,
				(current_page - 1) * 10 + pageBean.getCurrentRecord());
		ParamBean paramBean = new ParamBean();
		paramBean.setFirst(first);
		paramBean.setSecond(second);
		paramBean.setThird(third);
		paramBean.setFourth(fourth);
		map.put("paramBean", paramBean);
		map.put("activityList", splitList);
		map.put("pageBean", pageBean);
		if (first != 0)
			map.put("address2", ConditionUtils.ADDRESS2[first - 1]);
		return "activity";
	}

	@RequestMapping(value = "/activity/details/{activity_id}")
	public String details(@PathVariable(value = "activity_id") int activity_id, HttpServletRequest request,
			HttpServletResponse response, Map<String, Object> map) {
		User user = webUtils.currentUser(request, response);
		Activity activity = activityMapper.selectByPrimaryKey(activity_id);
		User pubUser = userMapper.selectByPrimaryKey(activity.getActivityCommunityId());
		map.put("user", user);
		map.put("activity", activity);
		map.put("pubUser", pubUser);
		return "details";
	}
}
