package com.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.claim.entity.Currency;
import com.claim.repository.CurrencyRepository;

@Service
public class CurrencyService {
	@Autowired
	private CurrencyRepository currencyRepository;
	
	public void saveCurrency(Currency currency)
	{
		// currencyRepository.save(currency);
	}

	public List<Currency> getAllCurrencies() {
		// TODO Auto-generated method stub
		return null;
	}
}
