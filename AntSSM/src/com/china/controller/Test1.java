package com.china.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.china.entity.Province;
import com.china.entity.Shop;
import com.china.service.ProvinceService;

@Controller
@RequestMapping("/")
public class Test1 {
	@Autowired
	private ProvinceService service;

	public ProvinceService getService() {
		return service;
	}

	public void setService(ProvinceService service) {
		this.service = service;
	}
	@RequestMapping("/selectauthor_{id}")
	public ModelAndView selectAuthorByID(@PathVariable int id, HttpSession session){
		ModelAndView view = new ModelAndView("index.jsp");
		Province province = service.findById(id);
		session.setAttribute("province", province);
		return view;
	}
	
	@RequestMapping(value="/json", method = RequestMethod.POST)  
    public @ResponseBody Shop getShopInJSON(HttpServletRequest request) {  
  
        //≤‚ ‘ ˝æ›  
        Shop shop = new Shop();  
        String code = request.getParameter("name");
        System.out.println(code);
        System.out.println("Shop");  
        shop.setMsg("≈ÀŒƒÊ∫"); 
       shop.setMsgcode(200);
          
        return shop;  
  
    }  
}
