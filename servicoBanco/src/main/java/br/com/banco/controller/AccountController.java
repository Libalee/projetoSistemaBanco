package br.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.converter.MathConverter;
import br.com.banco.data.vo.AccountVO;
import br.com.banco.services.AccountService;



@RestController
@RequestMapping("/api/account/v1")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/{id}")
	public AccountVO getMethodName(@PathVariable("id") String id) {
		return accountService.findByIdVO(MathConverter.convertLong(id));
	}
	
	@PostMapping(produces = {"application/json", "application/xml", "application/x-yaml"},
			consumes = {"application/json", "application/xml", "application/x-yaml"})
	public AccountVO create(@RequestBody AccountVO accountVO) {
		var entity = accountVO;
		accountService.create(entity);
		return entity;
	}
	
	@PutMapping(produces = {"application/json", "application/xml", "application/x-yaml"},
			consumes = {"application/json", "application/xml", "application/x-yaml"})
	public AccountVO update(@RequestBody AccountVO accountVO) {
		accountService.update(accountVO);
		return accountVO;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") String id) {
		accountService.delete(MathConverter.convertLong(id));
		return ResponseEntity.noContent().build();
	}

}