package com.cah.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cah.bean.Cook;
import com.cah.bean.Order;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public List <Cook> cooksList= new ArrayList<Cook>();
	//@Autowired
	//private UserServiceImpl userServiceImpl;
	/**
	 * Simply selects view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		return "home";
	}	
	

	@RequestMapping(value = "/getAllCooks", method = RequestMethod.GET)
	public @ResponseBody List<Cook> getCooks() {
		System.out.println("get");
		return cooksList;
	}
	@RequestMapping(value = "/addACook", method = RequestMethod.POST)
	@ResponseBody
	public Cook addaBook(@RequestBody String str) {
		Cook cook = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			cook = mapper.readValue(str, Cook.class);
			cooksList.add(cook);
			System.out.println(cook);
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cook;
	}
	@RequestMapping(value = "/placeAnOder", method = RequestMethod.POST)
	@ResponseBody
	public Order receiveOrder(@RequestBody String str) {
		Order order = null;
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(str);
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		try {
			order = mapper.readValue(str, Order.class);
			System.out.println(order);
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return order;
	}
	


}
