package com.stock.market.custom.api.service;

import java.util.List;

import com.stock.market.custom.api.model.Company;

public interface CompanyService {

	public List<Company> getAllCompanies();

	public Company getCompany(int theId);

	public void saveCompany(Company theCompany);

	public void deleteCompany(int theId);
}
