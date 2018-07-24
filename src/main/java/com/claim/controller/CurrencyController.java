package com.claim.controller;
import java.io.*;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Transaction;
import com.claim.entity.User;
import com.claim.service.SendMail;
import com.claim.service.TransactionService;

import java.io.IOException;

@Controller
public class CurrencyController {
	
	@Autowired
	private SendMail sendMail;

	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value="/transaction", method=RequestMethod.POST)
	public ModelAndView GetCurrency(@ModelAttribute("transaction") Transaction trans, HttpSession session) throws IOException{
		 
		HashMap<String, Double> currencyMap = new HashMap<>();
		//currencyMap.put("dollar", 65.3);
		currencyMap.put("yen", 0.0090);
		currencyMap.put("rupees", 0.015);
		currencyMap.put("franc", 1.01);
		currencyMap.put("dinar", 0.00084 );
		currencyMap.put("peso", 0.053);
		currencyMap.put("rand", 0.075);
		currencyMap.put("CFA", 0.0018);
		trans.setBoughtAmount(trans.getFinalAmount()*currencyMap.get(trans.getDenomination()));
		
		
		User loggedInUser = (User) session.getAttribute("loggedInUser");
		sendMail.sendMail(loggedInUser.getEmail(), "Request for Currency", trans.toString());
		
		transactionService.saveTransaction(trans);
		System.out.println("Final Amount value: "+trans.getBoughtAmount());
		return new ModelAndView("transaction","transaction", trans);
	}

}
