package com.stock.market.custom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.market.custom.api.dao.CompanyDAO;
import com.stock.market.custom.api.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	private CompanyDAO companyDAO;

	@Autowired
	public CompanyServiceImpl(CompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
	}

	@Override
	@Transactional
	public List<Company> getAllCompanies() {
		return companyDAO.getCompanies();
	}

	@Override
	@Transactional
	public Company getCompany(int theId) {
		return companyDAO.findById(theId);
	}

	@Override
	@Transactional
	public void saveCompany(Company theCompany) {
		companyDAO.saveCompany(theCompany);

	}

	@Override
	@Transactional
	public void deleteCompany(int theId) {
		companyDAO.deleteCompany(theId);
	}

}
