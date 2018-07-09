package tn.enig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.IDao;

@Service
public class Service1 {

	@Autowired
	IDao dao;
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	public IDao getDao() {
		return dao;
	}
	
	public String getMessage() {
		return dao.getMessage();
	}
}
