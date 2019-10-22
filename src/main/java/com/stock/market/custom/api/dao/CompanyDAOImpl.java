package com.stock.market.custom.api.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stock.market.custom.api.model.Company;

@Repository
public class CompanyDAOImpl implements CompanyDAO {

	private EntityManager entityManager;

	@Autowired
	public CompanyDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Company> getCompanies() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Company> theQuery = currentSession.createQuery("from Company", Company.class);
		List<Company> theCompanies = theQuery.getResultList();
		return theCompanies;
	}

	@Override
	public Company findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Company theCompany = currentSession.get(Company.class, theId);
		return theCompany;
	}

	@Override
	public void saveCompany(Company theCompany) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theCompany);
	
	}

	@Override
	public void deleteCompany(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from Company where id=:companyId");
		theQuery.setParameter("companyId", theId);
		theQuery.executeUpdate();

	}

}
