package br.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.data.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
//
//	@Query("SELECT a FROM account a WHERE a.accountNumber := accountNumber")
//	Account findByAccountNumber(@Param("accountNumber") String accountNumber);
}