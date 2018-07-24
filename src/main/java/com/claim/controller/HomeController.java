package com.claim.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Transaction;
import com.claim.entity.Trip;
import com.claim.service.TransactionService;
import com.claim.service.TripService;
import com.claim.service.CurrencyService;
import com.claim.entity.Currency;


@Controller
public class HomeController {
	
	@Autowired
	private TripService tripService;
	

	@Autowired
	private CurrencyService currencyService;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/about")
	public ModelAndView main_prog()
	{
		return new ModelAndView("about");
	}
	
		
	
	@RequestMapping(value="/trip", method=RequestMethod.POST)
	public ModelAndView saveTrip(@ModelAttribute("trip") Trip trip)
	{
		//System.out.println("trip controller");
		// Save trip to database
		tripService.saveTrip(trip);
		return new ModelAndView("trip","trip", new Trip());
	}
	
	@RequestMapping(value="/trip", method=RequestMethod.GET)
	public ModelAndView viewTrip()
	{
		return new ModelAndView("trip","trip", new Trip());
	}

	
	

	
	@RequestMapping(value="/transaction", method=RequestMethod.GET)
	public ModelAndView viewTransaction()
	{
		return new ModelAndView("transaction","transaction", new Transaction());
	}
	
	/* dropdown stuff
	
	   @ModelAttribute("currencyList")
	   public Map<String, Double> getCurrencyList() {
	      Map<String, Double> currencyList = new HashMap<String, Double>();
	      currencyList.put("Euro",1.17259);
	      currencyList.put("Rand",0.0744781);
	      currencyList.put("Krona",0.113009);
	      currencyList.put("Yen",0.00897933);
	      currencyList.put("Peso",0.0525389);
	      currencyList.put("US Dollar",1.0);
	      currencyList.put("Franc CFA",0.00178756);
	      currencyList.put("Swiss Franc",1.00741);
	      
	      return currencyList;
	   }
	
	*/
	// end of dropdown stuff
	
	
	@RequestMapping("/location")
	public ModelAndView location()
	{
		return new ModelAndView("location");
	}

	@RequestMapping("/settings")
	public ModelAndView settings()
	{
		return new ModelAndView("settings");
	}
	
	
	
}