package com.stock.market.custom.api.dao;

import java.util.List;

import com.stock.market.custom.api.model.Company;

public interface CompanyDAO {

	public List<Company> getCompanies();

	public Company findById(int theId);

	public void saveCompany(Company theCompany);

	public void deleteCompany(int theId);
}
