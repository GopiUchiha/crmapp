package com.crmapp.services;

import java.util.List;

import com.crmapp.entities.Lead;

public interface LeadService {
	public void saveLead(Lead lead);
	public List<Lead> getAllLeads();
	public Lead findLeadById(long id);
	public void deleteLeadById(long id);

}
