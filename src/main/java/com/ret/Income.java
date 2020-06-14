package com.ret;

import java.math.BigDecimal;

public class Income implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private BigDecimal baseIncome;
	private BigDecimal additionalIncome;
	
	public BigDecimal getBaseIncome() {
		return baseIncome;
	}
	public void setBaseIncome(BigDecimal baseIncome) {
		this.baseIncome = baseIncome;
	}
	public BigDecimal getAdditionalIncome() {
		return additionalIncome;
	}
	public void setAdditionalIncome(BigDecimal additionalIncome) {
		this.additionalIncome = additionalIncome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalIncome == null) ? 0 : additionalIncome.hashCode());
		result = prime * result + ((baseIncome == null) ? 0 : baseIncome.hashCode());
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
		Income other = (Income) obj;
		if (additionalIncome == null) {
			if (other.additionalIncome != null)
				return false;
		} else if (!additionalIncome.equals(other.additionalIncome))
			return false;
		if (baseIncome == null) {
			if (other.baseIncome != null)
				return false;
		} else if (!baseIncome.equals(other.baseIncome))
			return false;
		return true;
	}
	
	
}
