package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * スイッチング切替呼び出しパラメータクラス。
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@SuppressWarnings("serial")
public class SwContractStatusChangeInfoModel implements Serializable {

	/** 顧客コード */
	private String customerCd = null;
	/** 連番 */
	private BigDecimal customerConsNum = null;
	/** 契約ステータス */
	private BigDecimal contractStatus = null;

	/**
	 * コンストラクタ
	 */
	public SwContractStatusChangeInfoModel () {
		super();
	}

	/**
	 * 顧客コードを取得します。
	 * @return 顧客コード
	 */
	public String getCustomerCd() {
		return customerCd;
	}

	/**
	 * 顧客コードを設定します。
	 * @param customerCd 顧客コード
	 */
	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	/**
	 * 連番を取得します。
	 * @return 連番
	 */
	public BigDecimal getCustomerConsNum() {
		return customerConsNum;
	}

	/**
	 * 連番を設定します。
	 * @param customerConsNum 連番
	 */
	public void setCustomerConsNum(BigDecimal customerConsNum) {
		this.customerConsNum = customerConsNum;
	}

	/**
	 *　契約ステータスを返します。
	 * @return contractStatus　を戻します。
	 */
	public BigDecimal getContractStatus() {
		return contractStatus;
	}

	/**
	 *　契約ステータスをセットします。
	 * @param contractStatus を設定。
	 */
	public void setContractStatus(BigDecimal contractStatus) {
		this.contractStatus = contractStatus;
	}


}
