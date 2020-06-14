package com.ret;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreditScore implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer fico;
	private java.lang.String agency;
	
	public java.lang.Integer getFico() {
		return fico;
	}
	public void setFico(java.lang.Integer fico) {
		this.fico = fico;
	}
	public java.lang.String getAgency() {
		return agency;
	}
	public void setAgency(java.lang.String agency) {
		this.agency = agency;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agency == null) ? 0 : agency.hashCode());
		result = prime * result + ((fico == null) ? 0 : fico.hashCode());
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
		CreditScore other = (CreditScore) obj;
		if (agency == null) {
			if (other.agency != null)
				return false;
		} else if (!agency.equals(other.agency))
			return false;
		if (fico == null) {
			if (other.fico != null)
				return false;
		} else if (!fico.equals(other.fico))
			return false;
		return true;
	}

}