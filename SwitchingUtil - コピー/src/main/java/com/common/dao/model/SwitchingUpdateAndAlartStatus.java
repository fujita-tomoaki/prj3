package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * スイッチング切替呼び出しパラメータクラス。
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@SuppressWarnings("serial")
public class SwitchingUpdateAndAlartStatus implements Serializable {


	/** 処理状況 */
	private BigDecimal processingStatus;
	
	/** 申請元処理状況 */
	private BigDecimal applyProcessingStatsu;
	
	/** ステータス分類コード */
	private BigDecimal statusKindCode;
	
	/** ステータスコード */
	private BigDecimal statusCode;
	
	/** バッチ結果格納フラグ */
	private boolean batchResultFlag;
	
	/** ご連絡事項（表示用）表示フラグ */
	private boolean renrakuDispFlag;
	
	/** ご連絡事項表示フラグ */
	private boolean renrakuFlag;
	
	/** 受付メッセージ表示フラグ */
	private boolean uketsukeMsgFlag;
	
	/** メールフラグ */
	private boolean mailFlag;
	
	/** 監視アラートフラグ */
	private boolean alartFlag;
	
	/** 通知種別 */
	private String mailKind;

	/**
	 * コンストラクタ
	 */
	public SwitchingUpdateAndAlartStatus () {
		super();
		this.processingStatus = null;
		this.applyProcessingStatsu = null;
		this.statusKindCode = null;
		this.statusCode = null;
		this.batchResultFlag = false;
		this.renrakuDispFlag = false;
		this.renrakuFlag = false;
		this.uketsukeMsgFlag = false;
		this.mailFlag = false;
		this.alartFlag = false;
		this.mailKind = null;
	}

	/**
	 *　を返します。
	 * @return processingStatus　を戻します。
	 */
	public BigDecimal getProcessingStatus() {
		return processingStatus;
	}

	/**
	 *　をセットします。
	 * @param processingStatus を設定。
	 */
	public void setProcessingStatus(BigDecimal processingStatus) {
		this.processingStatus = processingStatus;
	}

	/**
	 *　を返します。
	 * @return applyProcessingStatsu　を戻します。
	 */
	public BigDecimal getApplyProcessingStatsu() {
		return applyProcessingStatsu;
	}

	/**
	 *　をセットします。
	 * @param applyProcessingStatsu を設定。
	 */
	public void setApplyProcessingStatsu(BigDecimal applyProcessingStatsu) {
		this.applyProcessingStatsu = applyProcessingStatsu;
	}

	/**
	 *　を返します。
	 * @return statusKindCode　を戻します。
	 */
	public BigDecimal getStatusKindCode() {
		return statusKindCode;
	}

	/**
	 *　をセットします。
	 * @param statusKindCode を設定。
	 */
	public void setStatusKindCode(BigDecimal statusKindCode) {
		this.statusKindCode = statusKindCode;
	}

	/**
	 *　を返します。
	 * @return statusCode　を戻します。
	 */
	public BigDecimal getStatusCode() {
		return statusCode;
	}

	/**
	 *　をセットします。
	 * @param statusCode を設定。
	 */
	public void setStatusCode(BigDecimal statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 *　を返します。
	 * @return batchResultFlag　を戻します。
	 */
	public boolean isBatchResultFlag() {
		return batchResultFlag;
	}

	/**
	 *　をセットします。
	 * @param batchResultFlag を設定。
	 */
	public void setBatchResultFlag(boolean batchResultFlag) {
		this.batchResultFlag = batchResultFlag;
	}

	/**
	 *　を返します。
	 * @return renrakuDispFlag　を戻します。
	 */
	public boolean isRenrakuDispFlag() {
		return renrakuDispFlag;
	}

	/**
	 *　をセットします。
	 * @param renrakuDispFlag を設定。
	 */
	public void setRenrakuDispFlag(boolean renrakuDispFlag) {
		this.renrakuDispFlag = renrakuDispFlag;
	}

	/**
	 *　を返します。
	 * @return renrakuFlag　を戻します。
	 */
	public boolean isRenrakuFlag() {
		return renrakuFlag;
	}

	/**
	 *　をセットします。
	 * @param renrakuFlag を設定。
	 */
	public void setRenrakuFlag(boolean renrakuFlag) {
		this.renrakuFlag = renrakuFlag;
	}

	/**
	 *　を返します。
	 * @return uketsukeMsgFlag　を戻します。
	 */
	public boolean isUketsukeMsgFlag() {
		return uketsukeMsgFlag;
	}

	/**
	 *　をセットします。
	 * @param uketsukeMsgFlag を設定。
	 */
	public void setUketsukeMsgFlag(boolean uketsukeMsgFlag) {
		this.uketsukeMsgFlag = uketsukeMsgFlag;
	}

	/**
	 *　を返します。
	 * @return mailFlag　を戻します。
	 */
	public boolean isMailFlag() {
		return mailFlag;
	}

	/**
	 *　をセットします。
	 * @param mailFlag を設定。
	 */
	public void setMailFlag(boolean mailFlag) {
		this.mailFlag = mailFlag;
	}

	/**
	 *　を返します。
	 * @return alartFlag　を戻します。
	 */
	public boolean isAlartFlag() {
		return alartFlag;
	}

	/**
	 *　をセットします。
	 * @param alartFlag を設定。
	 */
	public void setAlartFlag(boolean alartFlag) {
		this.alartFlag = alartFlag;
	}

	/**
	 *　を返します。
	 * @return mailKind　を戻します。
	 */
	public String getMailKind() {
		return mailKind;
	}

	/**
	 *　をセットします。
	 * @param mailKind を設定。
	 */
	public void setMailKind(String mailKind) {
		this.mailKind = mailKind;
	}


}
