package com.stock.market.custom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.market.custom.api.model.Company;
import com.stock.market.custom.api.service.CompanyService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CompanyRestController {

	private CompanyService companyService;

	@Autowired
	public CompanyRestController(CompanyService companyService) {
		this.companyService = companyService;
	}

	@GetMapping("/companies")
	public List<Company> getCompanies() {
		return companyService.getAllCompanies();
	}

	@GetMapping("/companies/{companyId}")
	public Company getCompany(@PathVariable int companyId) {
		Company theCompany = companyService.getCompany(companyId);
		return theCompany;
	}

	@PostMapping("/companies")
	public Company addCompany(@RequestBody Company theCompany) {
		theCompany.setId(0);
		companyService.saveCompany(theCompany);
		return theCompany;
	}

	@PutMapping("/companies")
	public Company updateCompany(@RequestBody Company theCompany) {
		companyService.saveCompany(theCompany);
		return theCompany;
	}

	@DeleteMapping("/companies/{companyId}")
	public String deleteCompany(@PathVariable int companyId) {
		companyService.deleteCompany(companyId);
		return "Delete company id: " + companyId;
	}

}
