package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crmapp.entities.Billing;
import com.crmapp.services.BillingService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String generateBill(Billing bill,ModelMap model) {
		billingService.saveBill(bill);
		
		model.addAttribute("bill", bill);
		return "final_billing_info";
		
	}
	
	@RequestMapping("/allbills")
	public String allBills(ModelMap model) {
		List<Billing> bills = billingService.allBills();
		model.addAttribute("bills", bills);
		return "all_bills_result";
		
	}

}
