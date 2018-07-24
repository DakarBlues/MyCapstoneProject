package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Currency;
import com.claim.entity.Transaction;

@Repository
public interface CurrencyRepository extends JpaRepository<Transaction, Integer> {

	void save(Currency currency);

}
