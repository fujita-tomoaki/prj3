package net.newbiz.ebil.billing.service.dao.model;

import java.util.Date;

public class BillingCustomerSearchExecServiceCustSearchDaoModel {

	/* 顧客ID */
	private String custId;
	/* 顧客名 */
	private String custName;
	/* 請求番号 */
	private String billNo;
	/* 請求日*/
	private String billDate;
	/* 郵便番号 */
	private String postCd;
	/* 住所 */
	private String addr;
	/* 電話番号 */
	private String telNo;
	/* 入金元 */
	private String depositSrc;
	
	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the billNo
	 */
	public String getBillNo() {
		return billNo;
	}
	/**
	 * @param billNo the billNo to set
	 */
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	/**
	 * @return the billDate
	 */
	public String getBillDate() {
		return billDate;
	}
	/**
	 * @param billDate the billDate to set
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	/**
	 * @return the postCd
	 */
	public String getPostCd() {
		return postCd;
	}
	/**
	 * @param postCd the postCd to set
	 */
	public void setPostCd(String postCd) {
		this.postCd = postCd;
	}
	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/**
	 * @return the telNo
	 */
	public String getTelNo() {
		return telNo;
	}
	/**
	 * @param telNo the telNo to set
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	/**
	 * @return the depositSrc
	 */
	public String getDepositSrc() {
		return depositSrc;
	}
	/**
	 * @param depositSrc the depositSrc to set
	 */
	public void setDepositSrc(String depositSrc) {
		this.depositSrc = depositSrc;
	}
}