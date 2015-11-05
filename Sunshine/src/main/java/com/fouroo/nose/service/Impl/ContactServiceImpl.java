package com.fouroo.nose.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fouroo.nose.entity.Contact;
import com.fouroo.nose.mapper.ContactMapper;
import com.fouroo.nose.service.inter.IContactService;

@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private ContactMapper contactMapper;
	@Override
	public int insertSelective(Contact record) {
		// TODO Auto-generated method stub
		return contactMapper.insertSelective(record);
	}


}
