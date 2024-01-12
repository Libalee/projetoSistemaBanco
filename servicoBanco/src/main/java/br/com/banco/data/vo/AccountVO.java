package br.com.banco.data.vo;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "fullName", "emailAdress", "gender", "homeAdress", "accountNumber", "accountBalance"})
public class AccountVO extends RepresentationModel<AccountVO> implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@JsonProperty("id")
	private Long key;
	private String fullName;
	private String emailAdress;
	private String homeAdress;
	private String gender;
	private Double accountBalance;
	private Long accountNumber;
	
	public String returnFirstName() {
		return fullName.split(" ", 2)[0];
	}
	
	public String returnLastName() {
		return fullName.split(" ", 2)[1];
	}
	
	public Long getKey() {
		return key;
	}
	public void setKey(Long key) {
		this.key = key;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getHomeAdress() {
		return homeAdress;
	}
	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountBalance, accountNumber, emailAdress, fullName, gender, homeAdress, key);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountVO other = (AccountVO) obj;
		return Objects.equals(accountBalance, other.accountBalance)
				&& Objects.equals(accountNumber, other.accountNumber) && Objects.equals(emailAdress, other.emailAdress)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(gender, other.gender)
				&& Objects.equals(homeAdress, other.homeAdress) && Objects.equals(key, other.key);
	}
	
	
}
