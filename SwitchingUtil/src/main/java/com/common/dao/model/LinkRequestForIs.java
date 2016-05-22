package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 連携要求情報作成の作成情報モデルクラスです。<BR/>
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */

public class LinkRequestForIs implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** 顧客コード */
	private String customerCd;
	
	/** 連番 */
	private BigDecimal serialNumber;

	/** 廃止取次番号 */
	private String abolitionAgencyNo;
	
	/** 処理状況 */
	private BigDecimal processingStatus;
	
	// Add Start 20160217 CATPPS-1101 対応　A.Miyakawa
	/** スイッチング廃止取次判断ＮＧ理由 */
	private String ngReason;
	// Add Start 20160217 CATPPS-1101 対応　A.Miyakawa
	
	// Add Start CATPPS-1101 対応　Y.Kimura
	/** ご連絡事項(表示用) */
	private String dispContactMatter;
	// Add End CATPPS-1101 対応　Y.Kimura
	
	// Change End CATPPS-1364 対応 A.Miyakawa
	/** ステータス */
	private String status;
	
	/**  */
	private SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus;
	
	/** スイッチング連携管理更新情報 */
	private List<Te79> te79EntityModelListUpdateInfo;
	
	public LinkRequestForIs () {
		
		/** スイッチング連携管理更新情報 */
		this.te79EntityModelListUpdateInfo = new ArrayList<Te79>();
	}

	
	// Change End CATPPS-1364 対応 A.Miyakawa
	
	/**
	 * 顧客コードを返します。
	 * @return customerCd　を戻します。
	 */
	public String getCustomerCd() {
		return customerCd;
	}

	/**
	 * 顧客コードをセットします。
	 * @param customerCd を設定。
	 */
	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	/**
	 * 連番を返します。
	 * @return serialNumber　を戻します。
	 */
	public BigDecimal getSerialNumber() {
		return serialNumber;
	}

	/**
	 * 連番をセットします。
	 * @param serialNumber を設定。
	 */
	public void setSerialNumber(BigDecimal serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * 廃止取次番号を返します。
	 * @return abolitionAgencyNo　を戻します。
	 */
	public String getAbolitionAgencyNo() {
		return abolitionAgencyNo;
	}

	/**
	 * 廃止取次番号をセットします。
	 * @param abolitionAgencyNo を設定。
	 */
	public void setAbolitionAgencyNo(String abolitionAgencyNo) {
		this.abolitionAgencyNo = abolitionAgencyNo;
	}

	/**
	 * 処理状況を返します。
	 * @return processingStatus　を戻します。
	 */
	public BigDecimal getProcessingStatus() {
		return processingStatus;
	}

	/**
	 * 処理状況をセットします。
	 * @param processingStatus を設定。
	 */
	public void setProcessingStatus(BigDecimal processingStatus) {
		this.processingStatus = processingStatus;
	}

	// Add Start CATPPS-1101 対応　Y.Kimura
	/**
	 * ご連絡事項(表示用)を返します。
	 * 
	 * @return ご連絡事項(表示用) を戻します。
	 */
	public String getDispContactMatter() {
		return this.dispContactMatter;
	}
	
	/**
	 * ご連絡事項(表示用)をセットします。
	 * 
	 * @param dispContactMatter
	 *            ご連絡事項(表示用) を設定。
	 */
	public void setDispContactMatter(String dispContactMatter) {
		this.dispContactMatter = dispContactMatter;
	}
	// Add End CATPPS-1101 対応　Y.Kimura

	/**
	 *　を返します。
	 * @return ngReason　を戻します。
	 */
	public String getNgReason() {
		return ngReason;
	}

	/**
	 *　をセットします。
	 * @param ngReason を設定。
	 */
	public void setNgReason(String ngReason) {
		this.ngReason = ngReason;
	}

	/**
	 *　を返します。
	 * @return status　を戻します。
	 */
	public String getStatus() {
		return status;
	}

	/**
	 *　をセットします。
	 * @param status を設定。
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 *　を返します。
	 * @return switchingUpdateAndAlartStatu　を戻します。
	 */
	public SwitchingUpdateAndAlartStatus getSwitchingUpdateAndAlartStatus() {
		return switchingUpdateAndAlartStatus;
	}

	/**
	 *　をセットします。
	 * @param switchingUpdateAndAlartStatu を設定。
	 */
	public void setSwitchingUpdateAndAlartStatus(
			SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus) {
		this.switchingUpdateAndAlartStatus = switchingUpdateAndAlartStatus;
	}

	/**
	 *　を返します。
	 * @return te79EntityModelListUpdateInfo　を戻します。
	 */
	public List<Te79> getTe79EntityModelListUpdateInfo() {
		return te79EntityModelListUpdateInfo;
	}

	/**
	 *　をセットします。
	 * @param te79EntityModelListUpdateInfo を設定。
	 */
	public void setTe79EntityModelListUpdateInfo(
			List<Te79> te79EntityModelListUpdateInfo) {
		this.te79EntityModelListUpdateInfo = te79EntityModelListUpdateInfo;
	}
}
