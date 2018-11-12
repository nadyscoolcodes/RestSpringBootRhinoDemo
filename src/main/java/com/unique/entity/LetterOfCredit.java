package com.unique.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@Entity
@XmlRootElement	
public class LetterOfCredit {
	
	@Id
	private String lcNo;
	private String lcAmt;
	private String sellerName;
	private String buyerName;
	
	
	public LetterOfCredit() {
		
	}
	public LetterOfCredit(String lcNo, String lcAmt, String sellerName, String buyerName) {
		super();
		this.lcNo = lcNo;
		this.lcAmt = lcAmt;
		this.sellerName = sellerName;
		this.buyerName = buyerName;
	}
	public String getLcNo() {
		return lcNo;
	}
	public void setLcNo(String lcNo) {
		this.lcNo = lcNo;
	}
	public String getLcAmt() {
		return lcAmt;
	}
	public void setLcAmt(String lcAmt) {
		this.lcAmt = lcAmt;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	@Override
	public String toString() {
		return "LetterOfCredit [lcNo=" + lcNo + ", lcAmt=" + lcAmt + ", sellerName=" + sellerName + ", buyerName="
				+ buyerName + "]";
	}
	
	
	
	
	
	

}
