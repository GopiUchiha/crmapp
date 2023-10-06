package com.crmapp.services;

import java.util.List;

import com.crmapp.entities.Billing;

public interface BillingService {
	public void saveBill(Billing bill);
	public List<Billing> allBills();

}
