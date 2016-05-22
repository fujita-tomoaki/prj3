/*
 * @(#)T105EntityModel.java
 * Product: Baycom様次期システム
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * T105顧客住所を継承したエンティティモデルクラスです。<BR/>
 * 
 * 実装者による拡張を行ってください。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class T105EntityModel extends BaseT105EntityModel implements Serializable{
	/** 顧客アイコン定義リスト */
	private List<T09eEntityModel> customerIconDefList;
	/** 顧客アイコン情報 */
	private T104EntityModel customerIconInfo;
	/** 従契約者合計 */
	private BigDecimal subcontractorSum;
	/** 全半角空白 */
	private static final String fullHalfSpace = "　 ";


	/**
	 * @return fullhalfspace
	 */
	public static String getFullhalfspace() {
		return fullHalfSpace;
	}

	/**
     * 顧客アイコン定義リスト取得
     * @return 顧客アイコン定義リスト
     */
	public List<T09eEntityModel> getCustomerIconDefList() {
		return customerIconDefList;
	}

    /**
     * 顧客アイコン定義リスト設定
     * @param t09List 顧客アイコン定義リスト
     */
	public void setCustomerIconDefList(List<T09eEntityModel> customerIconDefList) {
		this.customerIconDefList = customerIconDefList;
	}

    /**
     * 顧客アイコン情報取得
     * @return 顧客アイコン情報
     */
	public T104EntityModel getCustomerIconInfo() {
		return customerIconInfo;
	}

    /**
     * 顧客アイコン情報設定
     * @param customerIconInfo 顧客アイコン情報
     */
	public void setCustomerIconInfo(T104EntityModel customerIconInfo) {
		this.customerIconInfo = customerIconInfo;
	}

    /**
     * 従契約者合計取得
     * @return 従契約者合計
     */
	public BigDecimal getSubcontractorSum() {
		return subcontractorSum;
	}

    /**
     * 従契約者合計設定
     * @param subcontractorSum 従契約者合計
     */
	public void setSubcontractorSum(BigDecimal subcontractorSum) {
		this.subcontractorSum = subcontractorSum;
	}

}
