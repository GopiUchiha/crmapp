package com.crmapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crmapp.entities.Lead;
import com.crmapp.repositories.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LeadRepositoryTest {
	
	@Autowired
	private LeadRepository leadRepo;
	
	@Test
	public void saveOneLead() {
		Lead l = new Lead("mike", "m", "mikem@gmail.com", "Radio", "9632629033");//create constructor in lead entity class excluding id
		leadRepo.save(l);                                                        //also an empty constructor
		
	}
}
