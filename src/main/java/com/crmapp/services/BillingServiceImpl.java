package com.crmapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entities.Billing;
import com.crmapp.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);

	}

	@Override
	public List<Billing> allBills() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

}
