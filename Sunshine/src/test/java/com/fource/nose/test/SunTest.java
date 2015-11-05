package com.fource.nose.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fouroo.nose.entity.Contact;
import com.fouroo.nose.service.inter.IContactService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class SunTest {

	@Autowired
	private IContactService iContactService;
	
	@Test
	public void test(){
		Contact c = new Contact();
		c.setId(1);
		c.setOfficeConcept("asdfasdf");
		iContactService.insertSelective(c);
	}
}
