package com.zanzhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zanzhu.dto.SponsorPageBean;
import com.zanzhu.mapper.ZanzhuSponsorMapper;
import com.zanzhu.pojo.ZanzhuSponsor;
import com.zanzhu.pojo.ZanzhuSponsorExample;

@Controller
public class SponsorController {
	private static String[] proArr = {
			"不限", "北京","天津","河北","山西","内蒙古","辽宁","吉林","黑龙江","上海",
			"江苏","浙江","安徽","福建","江西","山东","河南","湖北","湖南","广东","广西",
			"海南","重庆","四川","贵州","云南","西藏","陕西","甘肃","青海","宁夏","新疆",
			"台湾","香港","澳门","海外","全国","其他"
	};
	
	/*
	 * pro:省
	 * city:市
	 * category:类别
	 * money:金额在哪个范围
	 */
	@Autowired
	ZanzhuSponsorMapper sponsorMapper;
	public ZanzhuSponsorMapper getSponsorMapper() {
		return sponsorMapper;
	}
	public void setSponsorMapper(ZanzhuSponsorMapper sponsorMapper) {
		this.sponsorMapper = sponsorMapper;
	}
	@RequestMapping("/sponsor")
	public String tempSponsor(){
		return "sponsor";
	}
	public String defaultSponsor(Model model){
		ZanzhuSponsorExample sponsorExample = new ZanzhuSponsorExample();
		List<ZanzhuSponsor> sponsorList = sponsorMapper.selectByExample(sponsorExample);
		//先用简单的方法，后续会改进
		SponsorPageBean spb = new SponsorPageBean();
		spb.setCount(sponsorList.size());
		spb.setPageCount(0);
		spb.setTotalPage(spb.getCount()/10==0?spb.getCount()/10:spb.getCount()+1);
		spb.setPro(0);
		spb.setCity(0);
		spb.setCategory(0);
		spb.setMoney(0);
		model.addAttribute("sponsorList",sponsorList);
		model.addAttribute("sponsorPageBean",spb);
		return "sponsor";
	}
	@RequestMapping("/sponsor/{pro}-{city}-{category}-{money}")
	public String sponsor(@PathVariable Integer pro,@PathVariable Integer city,
			@PathVariable Integer category,@PathVariable Integer money,Model model){
		//TODO
		
		return "sponsor";
	}
	@RequestMapping("/sponsor/{pro}-{city}-{category}-{money}/page/{pageNum}")
	public String sponsorWithPage(@PathVariable Integer pro,@PathVariable Integer city,
			@PathVariable Integer category,@PathVariable Integer money,
			@PathVariable Integer pageNum,Model model){
		
		
		return "sponsor";
	}
}
