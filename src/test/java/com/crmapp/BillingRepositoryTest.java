package com.crmapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crmapp.entities.Lead;
import com.crmapp.repositories.BillingRepository;
import com.crmapp.repositories.ContactRepository;
import com.crmapp.repositories.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BillingRepositoryTest {
	
	@Autowired
	private BillingRepository billingRepo;
	
	@Test
	public void saveOneBill() {
		
		
	}
}
