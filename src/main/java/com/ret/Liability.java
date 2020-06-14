package com.ret;

import java.math.BigDecimal;

public class Liability implements java.io.Serializable{
	static final long serialVersionUID = 1L;
	
	private BigDecimal balanceAmt;
	private String lender;
	private BigDecimal monthlyPayment;
	
	public BigDecimal getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(BigDecimal balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public String getLender() {
		return lender;
	}
	public void setLender(String lender) {
		this.lender = lender;
	}
	public BigDecimal getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(BigDecimal monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balanceAmt == null) ? 0 : balanceAmt.hashCode());
		result = prime * result + ((lender == null) ? 0 : lender.hashCode());
		result = prime * result + ((monthlyPayment == null) ? 0 : monthlyPayment.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Liability other = (Liability) obj;
		if (balanceAmt == null) {
			if (other.balanceAmt != null)
				return false;
		} else if (!balanceAmt.equals(other.balanceAmt))
			return false;
		if (lender == null) {
			if (other.lender != null)
				return false;
		} else if (!lender.equals(other.lender))
			return false;
		if (monthlyPayment == null) {
			if (other.monthlyPayment != null)
				return false;
		} else if (!monthlyPayment.equals(other.monthlyPayment))
			return false;
		return true;
	}
	
	

}
