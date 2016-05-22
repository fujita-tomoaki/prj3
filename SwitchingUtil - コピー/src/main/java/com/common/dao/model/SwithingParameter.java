package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * スイッチング切替呼び出しパラメータクラス。
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@SuppressWarnings("serial")
public class SwithingParameter implements Serializable {

	/** 顧客コード */
	private String customerCd = null;
	/** 連番 */
	private BigDecimal customerConsNum = null;
	/** 更新フラグ */
	private BigDecimal updateFlg = null;
	/** 使用量閲覧パスワード */
	private String usedInfoReadPw = null;
	/** 申込番号 */
	private String applicationNum = null;
	/** 廃止取次番号 */
	private String stopAgencyNum = null;
	/** スイッチング廃止取次判断NG理由1 */
	private boolean stopAgencyJudgeReason01Flg = false;
	/** スイッチング廃止取次判断NG理由2 */
	private boolean stopAgencyJudgeReason02Flg = false;
	/** スイッチング廃止取次判断NG理由3 */
	private boolean stopAgencyJudgeReason03Flg = false;
	/** スイッチング廃止取次判断NG理由4 */
	private boolean stopAgencyJudgeReason04Flg = false;
	/** スイッチング廃止取次判断NG理由5 */
	private boolean stopAgencyJudgeReason05Flg = false;
	/** スイッチング廃止取次判断NG理由6 */
	private boolean stopAgencyJudgeReason06Flg = false;
	/** スイッチング廃止取次判断NG理由7 */
	private boolean stopAgencyJudgeReason07Flg = false;
	/** スイッチング廃止取次判断NG理由8 */
	private boolean stopAgencyJudgeReason08Flg = false;
	/** スイッチング廃止取次判断NG理由9 */
	private boolean stopAgencyJudgeReason09Flg = false;
	/** スイッチング廃止取次判断 */
	private String stopAgencyJudgeFlg;
	/** 契約種別 */
	private String contractType  = null;

	/**
	 * コンストラクタ
	 */
	public SwithingParameter () {
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
	 * 更新フラグを取得します。
	 * @return 更新フラグ
	 */
	public BigDecimal getUpdateFlg() {
		return updateFlg;
	}

	/**
	 * 更新フラグを設定します。
	 * @param updateFlg 更新フラグ
	 */
	public void setUpdateFlg(BigDecimal updateFlg) {
		this.updateFlg = updateFlg;
	}

	/**
	 * 使用量閲覧パスワードを取得します。
	 * @return 使用量閲覧パスワード
	 */
	public String getUsedInfoReadPw() {
		return usedInfoReadPw;
	}

	/**
	 * 使用量閲覧パスワードを設定します。
	 * @param usedInfoReadPw 使用量閲覧パスワード
	 */
	public void setUsedInfoReadPw(String usedInfoReadPw) {
		this.usedInfoReadPw = usedInfoReadPw;
	}

	/**
	 * 申込番号を取得します。
	 * @return 申込番号
	 */
	public String getApplicationNum() {
		return applicationNum;
	}

	/**
	 * 申込番号を設定します。
	 * @param applicationNum 申込番号
	 */
	public void setApplicationNum(String applicationNum) {
		this.applicationNum = applicationNum;
	}

	/**
	 * 廃止取次番号を取得します。
	 * @return 廃止取次番号
	 */
	public String getStopAgencyNum() {
		return stopAgencyNum;
	}

	/**
	 * 廃止取次番号を設定します。
	 * @param stopAgencyNum 廃止取次番号
	 */
	public void setStopAgencyNum(String stopAgencyNum) {
		this.stopAgencyNum = stopAgencyNum;
	}

	/**
	 * スイッチング廃止取次判断NG理由1を取得します。
	 * @return スイッチング廃止取次判断NG理由1
	 */
	public boolean isStopAgencyJudgeReason01Flg() {
		return stopAgencyJudgeReason01Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由1を設定します。
	 * @param stopAgencyJudgeReason01Flg スイッチング廃止取次判断NG理由1
	 */
	public void setStopAgencyJudgeReason01Flg(boolean stopAgencyJudgeReason01Flg) {
		this.stopAgencyJudgeReason01Flg = stopAgencyJudgeReason01Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由2を取得します。
	 * @return スイッチング廃止取次判断NG理由2
	 */
	public boolean isStopAgencyJudgeReason02Flg() {
		return stopAgencyJudgeReason02Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由2を設定します。
	 * @param stopAgencyJudgeReason02Flg スイッチング廃止取次判断NG理由2
	 */
	public void setStopAgencyJudgeReason02Flg(boolean stopAgencyJudgeReason02Flg) {
		this.stopAgencyJudgeReason02Flg = stopAgencyJudgeReason02Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由3を設定します。
	 * @return スイッチング廃止取次判断NG理由3
	 */
	public boolean isStopAgencyJudgeReason03Flg() {
		return stopAgencyJudgeReason03Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由3を設定します。
	 * @param stopAgencyJudgeReason03Flg スイッチング廃止取次判断NG理由3
	 */
	public void setStopAgencyJudgeReason03Flg(boolean stopAgencyJudgeReason03Flg) {
		this.stopAgencyJudgeReason03Flg = stopAgencyJudgeReason03Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由4を取得します。
	 * @return スイッチング廃止取次判断NG理由4
	 */
	public boolean isStopAgencyJudgeReason04Flg() {
		return stopAgencyJudgeReason04Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由4を設定します。
	 * @param stopAgencyJudgeReason04Flg スイッチング廃止取次判断NG理由4
	 */
	public void setStopAgencyJudgeReason04Flg(boolean stopAgencyJudgeReason04Flg) {
		this.stopAgencyJudgeReason04Flg = stopAgencyJudgeReason04Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由5を取得します。
	 * @return スイッチング廃止取次判断NG理由5
	 */
	public boolean isStopAgencyJudgeReason05Flg() {
		return stopAgencyJudgeReason05Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由5を設定します。
	 * @param stopAgencyJudgeReason05Flg スイッチング廃止取次判断NG理由5
	 */
	public void setStopAgencyJudgeReason05Flg(boolean stopAgencyJudgeReason05Flg) {
		this.stopAgencyJudgeReason05Flg = stopAgencyJudgeReason05Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由6を取得します。
	 * @return スイッチング廃止取次判断NG理由6
	 */
	public boolean isStopAgencyJudgeReason06Flg() {
		return stopAgencyJudgeReason06Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由6を設定します。
	 * @param stopAgencyJudgeReason06Flg スイッチング廃止取次判断NG理由6
	 */
	public void setStopAgencyJudgeReason06Flg(boolean stopAgencyJudgeReason06Flg) {
		this.stopAgencyJudgeReason06Flg = stopAgencyJudgeReason06Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由7を取得します。
	 * @return スイッチング廃止取次判断NG理由7
	 */
	public boolean isStopAgencyJudgeReason07Flg() {
		return stopAgencyJudgeReason07Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由7を設定します。
	 * @param stopAgencyJudgeReason07Flg スイッチング廃止取次判断NG理由7
	 */
	public void setStopAgencyJudgeReason07Flg(boolean stopAgencyJudgeReason07Flg) {
		this.stopAgencyJudgeReason07Flg = stopAgencyJudgeReason07Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由1を取得します。
	 * @return スイッチング廃止取次判断NG理由8
	 */
	public boolean isStopAgencyJudgeReason08Flg() {
		return stopAgencyJudgeReason08Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由8を設定します。
	 * @param stopAgencyJudgeReason08Flg スイッチング廃止取次判断NG理由1
	 */
	public void setStopAgencyJudgeReason08Flg(boolean stopAgencyJudgeReason08Flg) {
		this.stopAgencyJudgeReason08Flg = stopAgencyJudgeReason08Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由9を取得します。
	 * @return スイッチング廃止取次判断NG理由9
	 */
	public boolean isStopAgencyJudgeReason09Flg() {
		return stopAgencyJudgeReason09Flg;
	}

	/**
	 * スイッチング廃止取次判断NG理由9を設定します。
	 * @param stopAgencyJudgeReason09Flg スイッチング廃止取次判断NG理由9
	 */
	public void setStopAgencyJudgeReason09Flg(boolean stopAgencyJudgeReason09Flg) {
		this.stopAgencyJudgeReason09Flg = stopAgencyJudgeReason09Flg;
	}

	/**
	 * スイッチング廃止取次判断を取得します。
	 * @return スイッチング廃止取次判断
	 */
	public String getStopAgencyJudgeFlg() {
		return stopAgencyJudgeFlg;
	}

	/**
	 * スイッチング廃止取次判断を設定します。
	 * @param stopAgencyJudgeFlg スイッチング廃止取次判断
	 */
	public void setStopAgencyJudgeFlg(String stopAgencyJudgeFlg) {
		this.stopAgencyJudgeFlg = stopAgencyJudgeFlg;
	}

	/**
	 *　契約種別を返します。
	 * @return contractType　を戻します。
	 */
	public String getContractType() {
		return contractType;
	}

	/**
	 *　契約種別をセットします。
	 * @param contractType を設定。
	 */
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
}
