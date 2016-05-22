package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.service.model.T0a9EntityModel;
import com.service.model.Te79EntityModel;

/**
 * 連携要求情報作成の作成情報モデルクラスです。<BR/>
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */

public class LinkRequestInfoResult implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 局コード */
	private String stationCd;
	
	/** 連携番号 */
	private BigDecimal renKeiNum;

	/** 連携番号連番 */
	private BigDecimal renKeiSerialNum;
	
	/** 連携要求日時 */
	private Timestamp renKeiEntryDatetime;

	/** サービスID */
	private String serviceId;

	/** 顧客コード */
	private String customerCd;

	/** 連番 */
	private BigDecimal serialNumber;

	/** 更新フラグ */
	private BigDecimal flagUpdate;

	/** 申込種別 */
	private String appType;

	/** 小売事業者コード */
	private String retailCd;

	/** 電力会社エリア */
	private String powerCompanyArea;

	/** 小売事業者情報 */
	private List<Tpe7> Tpe7List;

	/** 契約情報 */
	private GetSwitchingContractInfoResult contractInfoResult;

	/** 顧客住所情報 */
	private List<T105> t105EntityModelList;

	/** 申込情報 */
	private Te79 te79EntityMode;

	/** スイッチング連携要求拡張項目情報 */
	private List<Te7a> te7aEntityModelList;

	/** 受付メッセージ情報 */
	private List<Te7b> te7bEntityModelList;
	
	// Change Start CAPPS-944対応 T.Funao
	/** 受付工程 */
	private String receivingStep;
	// Change End CAPPS-944対応 T.Funao
	
	/** 通信結果 */
	private Integer communicationResult;

	/** サービス結果 */
	private Integer serviceResult;

	/** 連携結果 */
	private String cooperationResult;

	/** 処理状況 */
	private BigDecimal processingStatus;

	/** 申込番号 */
	private String appNo;

	/** 公的証明書情報 */
	private List<T0a9> t0a9EntityModelList;

	/** 連携日時 */
	private java.sql.Timestamp cooperationDate;

	/** エラーメッセージID */
	private String errorMsgId;
	// Change Start SW相関チェック A.Miyakawa
	/** エラーメッセージ */
	private String[] errorMsg;
	// Change End SW相関チェック A.Miyakawa

	/** サービスエラー理由 */
	private String serviceErrorReason;

	/** 連携エラー理由 */
	private String cooperationErrorReason;

	/** 通信ステータス */
	private String communicationStatus;

	/** 廃止取次番号 */
	private String abolitionAgencyNo;

	/** 異動予定日 */
	private String changesDatePlan;

	/** 異動日 */
	private String changesDate;

	/** ご連絡事項 */
	private String contactMatter;

	/** 最終未完了連携番号 */
	private BigDecimal lastIncompleteRenKeiNum;
	
	/** 業務処理状況確認連番 */
	private BigDecimal processingStatusSerialNumber;

	/** 廃止取次情報 */
	private Te76 te76;
	
	/** スイッチング開始情報　*/
	private List<SwithingParameter> swStartInfo;
	
	/** 廃止取次判断情報　*/
	private List<SwithingParameter> swAbolitionJudgementInfo;
	
	/** スイッチング廃止申請情報 */
	private List<SwithingParameter> swAbolitionApplyInfo;
	
	/** 使用量情報照会情報 */
	private List<SwithingParameter> usedAmountInfoInquiryInfo;
	
	/** 契約ステータス変更情報 */
	private SwContractStatusChangeInfoModel contractStatusChangeInfo;
	
	/** スイッチング廃止取次検索設定情報 */
	private List<Tpe7> Tpe7SearchSettingList;
	
	/** スイッチング連携管理更新情報 */
	private List<Te79EntityModel> te79EntityModelListUpdateInfo;
	
	/** スイッチングステータス更新リスト */
	private List<SwithingParameter> swStatusUpdList;

	/** IS_××××用連携要求情報リスト */
	private List<LinkRequestForIs> linkReqForIs;
	
	/** スイッチング連携結果リスト */
	List<Te7j> te7jList;
	
	/** 接続供給廃止年月日更新データ */
	List<Te11> te11List;

	// Add Start CATPPS-1101 対応　Y.Kimura
	/** ご連絡事項(表示用) */
	private String dispContactMatter;
	// Add End CATPPS-1101 対応　Y.Kimura
	
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/** 解約登録日格納モデル */
	private Te17 te17;
	// Add End CATPPSSB-246 20160227 A.Miyakawa
	
	// Add Start CATPPS-1364 対応 A.Miyakawa
	/** 例外情報 */
	private Exception exception;
	/** 判断 */
	private String judgeMent;
	/**  */
	private SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus;
	// Add End CATPPS-1364 対応 A.Miyakawa

	/**
     * このオブジェクトが生成されるときに呼び出されます。
     */
	public LinkRequestInfoResult() {
		// システム日付で初期化
		this.cooperationDate = new Timestamp(System.currentTimeMillis());
		this.renKeiEntryDatetime = new Timestamp(System.currentTimeMillis());

		/** 受付メッセージ情報  */
		this.te7bEntityModelList = new ArrayList<Te7b>();
		
		// 各結果については、異常を表現する値で初期化
		/** 通信結果 */
		this.communicationResult = 1;

		/** サービス結果 */
		this.serviceResult = 1;

		/** 連携結果 */
		this.cooperationResult = "1";

		/** 処理状況 */
		this.processingStatus = new BigDecimal(3);
		
		/** スイッチング連携管理更新情報 */
		this.te79EntityModelListUpdateInfo = new ArrayList<Te79EntityModel>();

	}
	// 2015/11/07 K.Suzuki Add End

	/**
	　*　を返します。
	 * @return stationCd　を戻します。
	 */
	public String getStationCd() {
		return stationCd;
	}

	/**
	　*　をセットします。
	 * @param stationCd を設定。
	 */
	public void setStationCd(String stationCd) {
		this.stationCd = stationCd;
	}

	/**
	 * 連携番号を返します。
	 * 
	 * @return 連携番号 を戻します。
	 */
	public BigDecimal getRenKeiNum() {
		return renKeiNum;
	}

	/**
	 * 連携番号をセットします。
	 * 
	 * @param renKeiNum
	 *            連携番号 を設定。
	 */
	public void setRenKeiNum(BigDecimal renKeiNum) {
		this.renKeiNum = renKeiNum;
	}

	/**
	　*　を返します。
	 * @return renKeiSerialNum　を戻します。
	 */
	public BigDecimal getRenKeiSerialNum() {
		return renKeiSerialNum;
	}

	/**
	　*　をセットします。
	 * @param renKeiSerialNum を設定。
	 */
	public void setRenKeiSerialNum(BigDecimal renKeiSerialNum) {
		this.renKeiSerialNum = renKeiSerialNum;
	}

	/**
	 * 連携要求日時を返します。
	 * 
	 * @return 連携要求日時 を戻します。
	 */
	public Timestamp getRenKeiEntryDatetime() {
		return renKeiEntryDatetime;
	}

	/**
	 * 連携要求日時をセットします。
	 * 
	 * @param renKeiEntryDatetime
	 *            連携要求日時 を設定。
	 */
	public void setRenKeiEntryDatetime(Timestamp renKeiEntryDatetime) {
		this.renKeiEntryDatetime = renKeiEntryDatetime;
	}

	/**
	 * サービスIDを返します。
	 * 
	 * @return サービスID を戻します。
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * サービスIDをセットします。
	 * 
	 * @param serviceId
	 *            サービスID を設定。
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * 顧客コードを返します。
	 * 
	 * @return 顧客コード を戻します。
	 */
	public String getCustomerCd() {
		return customerCd;
	}

	/**
	 * 顧客コードをセットします。
	 * 
	 * @param customerCd
	 *            顧客コード を設定。
	 */
	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	/**
	 * 連番を返します。
	 * 
	 * @return 連番 を戻します。
	 */
	public BigDecimal getSerialNumber() {
		return serialNumber;
	}

	/**
	 * 連番をセットします。
	 * 
	 * @param serialNumber
	 *            連番 を設定。
	 */
	public void setSerialNumber(BigDecimal serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * 更新フラグを返します。
	 * 
	 * @return 更新フラグ を戻します。
	 */
	public java.math.BigDecimal getFlagUpdate() {
		return flagUpdate;
	}

	/**
	 * 更新フラグをセットします。
	 * 
	 * @param flagUpdate
	 *            更新フラグ を設定。
	 */
	public void setFlagUpdate(java.math.BigDecimal flagUpdate) {
		this.flagUpdate = flagUpdate;
	}

	/**
	 * 申込種別を返します。
	 * 
	 * @return 申込種別 を戻します。
	 */
	public String getAppType() {
		return appType;
	}

	/**
	 * 申込種別をセットします。
	 * 
	 * @param appType
	 *            申込種別 を設定。
	 */
	public void setAppType(String appType) {
		this.appType = appType;
	}

	/**
	 * 小売事業者コードを返します。
	 * 
	 * @return 小売事業者コード を戻します。
	 */
	public String getRetailCd() {
		return retailCd;
	}

	/**
	 * 小売事業者コードをセットします。
	 * 
	 * @param retailCd
	 *            小売事業者コード を設定。
	 */
	public void setRetailCd(String retailCd) {
		this.retailCd = retailCd;
	}

	/**
	 * 電力会社エリアを返します。
	 * 
	 * @return 電力会社エリア を戻します。
	 */
	public String getPowerCompanyArea() {
		return powerCompanyArea;
	}

	/**
	 * 電力会社エリアをセットします。
	 * 
	 * @param powerCompanyArea
	 *            電力会社エリア を設定。
	 */
	public void setPowerCompanyArea(String powerCompanyArea) {
		this.powerCompanyArea = powerCompanyArea;
	}

	/**
	 * 小売事業者情報を返します。
	 * 
	 * @return 小売事業者情報 を戻します。
	 */
	public List<Tpe7> getTpe7List() {
		return Tpe7List;
	}

	/**
	 * 小売事業者情報をセットします。
	 * 
	 * @param Tpe7List
	 *            小売事業者情報 を設定。
	 */
	public void setTpe7List(List<Tpe7> Tpe7List) {
		this.Tpe7List = Tpe7List;
	}

	/**
	 * 契約情報を返します。
	 * 
	 * @return 契約情報 を戻します。
	 */
	public GetSwitchingContractInfoResult getContractInfoResult() {
		return contractInfoResult;
	}

	/**
	 * 契約情報をセットします。
	 * 
	 * @param contractInfoResult
	 *            契約情報 を設定。
	 */
	public void setContractInfoResult(
			GetSwitchingContractInfoResult contractInfoResult) {
		this.contractInfoResult = contractInfoResult;
	}

	/**
	 * 顧客住所情報を返します。
	 * 
	 * @return 顧客住所情報 を戻します。
	 */
	public List<T105> getT105EntityModelList() {
		return t105EntityModelList;
	}

	/**
	 * 顧客住所情報をセットします。
	 * 
	 * @param t105EntityModelList
	 *            顧客住所情報 を設定。
	 */
	public void setT105EntityModelList(List<T105> t105EntityModelList) {
		this.t105EntityModelList = t105EntityModelList;
	}

	/**
	 * 　申込情報を返します。
	 * 
	 * @return te79EntityMode　申込情報を戻します。
	 */
	public Te79 getTe79EntityMode() {
		return te79EntityMode;
	}

	/**
	 * 　申込情報をセットします。
	 * 
	 * @param te79EntityMode
	 *            申込情報を設定。
	 */
	public void setTe79EntityMode(Te79 te79EntityMode) {
		this.te79EntityMode = te79EntityMode;
	}

	/**
	 * スイッチング連携要求拡張項目情報を返します。
	 * 
	 * @return スイッチング連携要求拡張項目情報 を戻します。
	 */
	public List<Te7a> getTe7aEntityModelList() {
		return te7aEntityModelList;
	}

	/**
	 * スイッチング連携要求拡張項目情報をセットします。
	 * 
	 * @param te7aEntityModel
	 *            スイッチング連携要求拡張項目情報 を設定。
	 */
	public void setTe7aEntityModelList(List<Te7a> te7aEntityModel) {
		this.te7aEntityModelList = te7aEntityModel;
	}

	/**
	 * 受付メッセージ情報を返します。
	 * 
	 * @return 受付メッセージ情報
	 */
	public List<Te7b> getTe7bEntityModelList() {
		return this.te7bEntityModelList;
	}

	/**
	 * 受付メッセージ情報をセットします。
	 * 
	 * @param te7BEntityModel
	 *            TE7Bスイッチング連携受付メッセージ
	 */
	public void setTe7bEntityModelList(List<Te7b> te7bEntityModel) {
		this.te7bEntityModelList = te7bEntityModel;
	}

	/**
	 * 受付行程を返します。
	 * 
	 * @return 受付工程
	 */
	public String getReceivingStep() {
		return this.receivingStep;
	}

	/**
	 * 受付行程をセットします。
	 * 
	 * @param uketsukeKotei
	 *            受付工程
	 */
	public void setReceivingStep(String receivingStep) {
		this.receivingStep = receivingStep;
	}
	
	/**
	 * 　通信結果を返します。
	 * 
	 * @return communicationResult　通信結果を戻します。
	 */
	public Integer getCommunicationResult() {
		return communicationResult;
	}

	/**
	 * 　通信結果をセットします。
	 * 
	 * @param communicationResult
	 *            通信結果を設定。
	 */
	public void setCommunicationResult(Integer communicationResult) {
		this.communicationResult = communicationResult;
	}

	/**
	 * 　サービス結果を返します。
	 * 
	 * @return serviceResult　サービス結果を戻します。
	 */
	public Integer getServiceResult() {
		return serviceResult;
	}

	/**
	 * 　サービス結果をセットします。
	 * 
	 * @param serviceResult
	 *            サービス結果を設定。
	 */
	public void setServiceResult(Integer serviceResult) {
		this.serviceResult = serviceResult;
	}

	/**
	 * 　連携結果を返します。
	 * 
	 * @return cooperationResult　連携結果を戻します。
	 */
	public String getCooperationResult() {
		return cooperationResult;
	}

	/**
	 * 　連携結果をセットします。
	 * 
	 * @param cooperationResult
	 *            連携結果を設定。
	 */
	public void setCooperationResult(String cooperationResult) {
		this.cooperationResult = cooperationResult;
	}

	/**
	 *　を返します。
	 * @return errorMsgId　を戻します。
	 */
	public String getErrorMsgId() {
		return errorMsgId;
	}

	/**
	 *　をセットします。
	 * @param errorMsgId を設定。
	 */
	public void setErrorMsgId(String errorMsgId) {
		this.errorMsgId = errorMsgId;
	}

	/**
	 *　を返します。
	 * @return errorMsg　を戻します。
	 */
	public String[] getErrorMsg() {
		return errorMsg;
	}

	/**
	 *　をセットします。
	 * @param errorMsg を設定。
	 */
	public void setErrorMsg(String[] errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * 　処理状況を返します。
	 * 
	 * @return processingStatus　処理状況を戻します。
	 */
	public BigDecimal getProcessingStatus() {
		return processingStatus;
	}

	/**
	 * 　処理状況をセットします。
	 * 
	 * @param processingStatus
	 *            処理状況を設定。
	 */
	public void setProcessingStatus(BigDecimal processingStatus) {
		this.processingStatus = processingStatus;
	}

	/**
	 * 　申込番号を返します。
	 * 
	 * @return appNo　申込番号を戻します。
	 */
	public String getAppNo() {
		return appNo;
	}

	/**
	 * 　申込番号をセットします。
	 * 
	 * @param appNo
	 *            申込番号を設定。
	 */
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	/**
	 * 　公的証明書情報を返します。
	 * 
	 * @return t0a9EntityModelList　公的証明書情報を戻します。
	 */
	public List<T0a9> getT0a9EntityModelList() {
		return t0a9EntityModelList;
	}

	/**
	 * 　公的証明書情報をセットします。
	 * 
	 * @param t0a9EntityModelList
	 *            公的証明書情報を設定。
	 */
	public void setT0a9EntityModelList(List<T0a9> t0a9EntityModelList) {
		this.t0a9EntityModelList = t0a9EntityModelList;
	}

	/**
	 * 　連携日時を返します。
	 * 
	 * @return ｃooperationDate　連携日時を戻します。
	 */
	public java.sql.Timestamp getCooperationDate() {
		return cooperationDate;
	}

	/**
	 * 　連携日時をセットします。
	 * 
	 * @param ｃooperationDate
	 *            連携日時を設定。
	 */
	public void setCooperationDate(java.sql.Timestamp cooperationDate) {
		this.cooperationDate = cooperationDate;
	}

	/**
	 * 　サービスエラー理由を返します。
	 * 
	 * @return serviceErrorReason　サービスエラー理由を戻します。
	 */
	public String getServiceErrorReason() {
		return serviceErrorReason;
	}

	/**
	 * 　サービスエラー理由をセットします。
	 * 
	 * @param serviceErrorReason
	 *            サービスエラー理由を設定。
	 */
	public void setServiceErrorReason(String serviceErrorReason) {
		this.serviceErrorReason = serviceErrorReason;
	}

	/**
	 * 　連携エラー理由を返します。
	 * 
	 * @return cooperationErrorReason　連携エラー理由を戻します。
	 */
	public String getCooperationErrorReason() {
		return cooperationErrorReason;
	}

	/**
	 * 　連携エラー理由をセットします。
	 * 
	 * @param cooperationErrorReason
	 *            連携エラー理由を設定。
	 */
	public void setCooperationErrorReason(String cooperationErrorReason) {
		this.cooperationErrorReason = cooperationErrorReason;
	}

	/**
	 * 　通信ステータスを返します。
	 * 
	 * @return communicationStatus　通信ステータスを戻します。
	 */
	public String getCommunicationStatus() {
		return communicationStatus;
	}

	/**
	 * 　通信ステータスをセットします。
	 * 
	 * @param communicationStatus
	 *            通信ステータスを設定。
	 */
	public void setCommunicationStatus(String communicationStatus) {
		this.communicationStatus = communicationStatus;
	}

	/**
	 * 　廃止取次番号を返します。
	 * 
	 * @return abolitionAgencyNo　廃止取次番号を戻します。
	 */
	public String getAbolitionAgencyNo() {
		return abolitionAgencyNo;
	}

	/**
	 * 　廃止取次番号をセットします。
	 * 
	 * @param abolitionAgencyNo
	 *            廃止取次番号を設定。
	 */
	public void setAbolitionAgencyNo(String abolitionAgencyNo) {
		this.abolitionAgencyNo = abolitionAgencyNo;
	}

	/**
	 * 　異動予定日を返します。
	 * 
	 * @return changesDatePlan　異動予定日を戻します。
	 */
	public String getChangesDatePlan() {
		return changesDatePlan;
	}

	/**
	 * 　異動予定日をセットします。
	 * 
	 * @param changesDatePlan
	 *            異動予定日を設定。
	 */
	public void setChangesDatePlan(String changesDatePlan) {
		this.changesDatePlan = changesDatePlan;
	}

	/**
	 * 　異動日を返します。
	 * 
	 * @return changesDate　異動日を戻します。
	 */
	public String getChangesDate() {
		return changesDate;
	}

	/**
	 * 　異動日をセットします。
	 * 
	 * @param changesDate
	 *            異動日を設定。
	 */
	public void setChangesDate(String changesDate) {
		this.changesDate = changesDate;
	}

	/**
	 * 　ご連絡事項を返します。
	 * 
	 * @return contactMatter　ご連絡事項を戻します。
	 */
	public String getContactMatter() {
		return contactMatter;
	}

	/**
	 * 　ご連絡事項をセットします。
	 * 
	 * @param contactMatter
	 *            ご連絡事項を設定。
	 */
	public void setContactMatter(String contactMatter) {
		this.contactMatter = contactMatter;
	}

	/**
	　*　を返します。
	 * @return lastIncompleteRenKeiNum　を戻します。
	 */
	public BigDecimal getLastIncompleteRenKeiNum() {
		return lastIncompleteRenKeiNum;
	}

	/**
	　*　をセットします。
	 * @param lastIncompleteRenKeiNum を設定。
	 */
	public void setLastIncompleteRenKeiNum(BigDecimal lastIncompleteRenKeiNum) {
		this.lastIncompleteRenKeiNum = lastIncompleteRenKeiNum;
	}

	/**
	　*　業務処理状況確認連番を返します。
	 * @return processingStatusSerialNumber　を戻します。
	 */
	public BigDecimal getProcessingStatusSerialNumber() {
		return processingStatusSerialNumber;
	}

	/**
	　*　業務処理状況確認連番をセットします。
	 * @param processingStatusSerialNumber を設定。
	 */
	public void setProcessingStatusSerialNumber(
			BigDecimal processingStatusSerialNumber) {
		this.processingStatusSerialNumber = processingStatusSerialNumber;
	}

	/**
	 *　廃止取次情報を返します。
	 * @return Te76　を戻します。
	 */
	public Te76 getTe76() {
		return te76;
	}

	/**
	 *　廃止取次情報をセットします。
	 * @param Te76 を設定。
	 */
	public void setTe76(Te76 te76) {
		this.te76 = te76;
	}

	/**
	 *　スイッチング開始情報を返します。
	 * @return swStartInfo　を戻します。
	 */
	public List<SwithingParameter> getSwStartInfo() {
		return swStartInfo;
	}

	/**
	 *　スイッチング開始情報をセットします。
	 * @param swStartInfo を設定。
	 */
	public void setSwStartInfo(List<SwithingParameter> swStartInfo) {
		this.swStartInfo = swStartInfo;
	}

	/**
	 *　廃止取次判断情報を返します。
	 * @return swAbolitionJudgementInfo　を戻します。
	 */
	public List<SwithingParameter> getSwAbolitionJudgementInfo() {
		return swAbolitionJudgementInfo;
	}

	/**
	 *　廃止取次判断情報をセットします。
	 * @param swAbolitionJudgementInfo を設定。
	 */
	public void setSwAbolitionJudgementInfo(
			List<SwithingParameter> swAbolitionJudgementInfo) {
		this.swAbolitionJudgementInfo = swAbolitionJudgementInfo;
	}

	/**
	 *　スイッチング廃止申請情報を返します。
	 * @return swAbolitionApplyInfo　を戻します。
	 */
	public List<SwithingParameter> getSwAbolitionApplyInfo() {
		return swAbolitionApplyInfo;
	}

	/**
	 *　スイッチング廃止申請情報をセットします。
	 * @param swAbolitionApplyInfo を設定。
	 */
	public void setSwAbolitionApplyInfo(List<SwithingParameter> swAbolitionApplyInfo) {
		this.swAbolitionApplyInfo = swAbolitionApplyInfo;
	}

	/**
	 *　使用量情報照会情報を返します。
	 * @return usedAmountInfoInquiryInfo　を戻します。
	 */
	public List<SwithingParameter> getUsedAmountInfoInquiryInfo() {
		return usedAmountInfoInquiryInfo;
	}

	/**
	 *　使用量情報照会情報をセットします。
	 * @param usedAmountInfoInquiryInfo を設定。
	 */
	public void setUsedAmountInfoInquiryInfo(
			List<SwithingParameter> usedAmountInfoInquiryInfo) {
		this.usedAmountInfoInquiryInfo = usedAmountInfoInquiryInfo;
	}

	/**
	 *　契約ステータス変更情報を返します。
	 * @return contractStatusChangeInfo　を戻します。
	 */
	public SwContractStatusChangeInfoModel getContractStatusChangeInfo() {
		return contractStatusChangeInfo;
	}

	/**
	 *　契約ステータス変更情報をセットします。
	 * @param contractStatusChangeInfo を設定。
	 */
	public void setContractStatusChangeInfo(
			SwContractStatusChangeInfoModel contractStatusChangeInfo) {
		this.contractStatusChangeInfo = contractStatusChangeInfo;
	}

	/**
	 *　スイッチング廃止取次検索設定情報を返します。
	 * @return Tpe7SearchSettingList　を戻します。
	 */
	public List<Tpe7> getTpe7SearchSettingList() {
		return Tpe7SearchSettingList;
	}

	/**
	 *　スイッチング廃止取次検索設定情報をセットします。
	 * @param Tpe7SearchSettingList を設定。
	 */
	public void setTpe7SearchSettingList(
			List<Tpe7> Tpe7SearchSettingList) {
		this.Tpe7SearchSettingList = Tpe7SearchSettingList;
	}

	/**
	 *　を返します。
	 * @return Tpe7ListUpdateInfo　を戻します。
	 */
	public List<Te79EntityModel> getTe79EntityModelListUpdateInfo() {
		return te79EntityModelListUpdateInfo;
	}

	/**
	 *　をセットします。
	 * @param Tpe7ListUpdateInfo を設定。
	 */
	public void setTe79EntityModelListUpdateInfo(
			List<Te79EntityModel> te79EntityModelListUpdateInfo) {
		this.te79EntityModelListUpdateInfo = te79EntityModelListUpdateInfo;
	}

	/**
	 *　スイッチングステータス更新リストを返します。
	 * @return swStatusUpdList　を戻します。
	 */
	public List<SwithingParameter> getSwStatusUpdList() {
		return swStatusUpdList;
	}

	/**
	 *　スイッチングステータス更新リストをセットします。
	 * @param swStatusUpdList を設定。
	 */
	public void setSwStatusUpdList(List<SwithingParameter> swStatusUpdList) {
		this.swStatusUpdList = swStatusUpdList;
	}

	/**
	 * IS_××××用連携要求情報リストを返します。
	 * @return linkReqForIs　を戻します。
	 */
	public List<LinkRequestForIs> getLinkReqForIs() {
		return linkReqForIs;
	}

	/**
	 * IS_××××用連携要求情報リストをセットします。
	 * @param linkReqForIs を設定。
	 */
	public void setLinkReqForIs(List<LinkRequestForIs> linkReqForIs) {
		this.linkReqForIs = linkReqForIs;
	}

	/**
	 *　スイッチング連携結果リストを返します。
	 * @return Te7jList　を戻します。
	 */
	public List<Te7j> getTe7jList() {
		return te7jList;
	}

	/**
	 *　スイッチング連携結果リストをセットします。
	 * @param Te7jList を設定。
	 */
	public void setTe7jList(List<Te7j> Te7jList) {
		this.te7jList = te7jList;
	}

	/**
	 *　接続供給廃止年月日更新データを返します。
	 * @return Te11List　を戻します。
	 */
	public List<Te11> getTe11List() {
		return te11List;
	}

	/**
	 *　接続供給廃止年月日更新データをセットします。
	 * @param Te11List を設定。
	 */
	public void setTe11List(List<Te11> Te11List) {
		this.te11List = te11List;
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
	// Add Start CATPPSSB-246 20160227 A.Miyakawa 
	/**
	 *　を返します。
	 * @return Te17　を戻します。
	 */
	public Te17 getTe17() {
		return te17;
	}

	/**
	 *　をセットします。
	 * @param Te17 を設定。
	 */
	public void setTe17(Te17 Te17) {
		this.te17 = te17;
	}
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	
	
	// Add Start CATPPS-1364 対応 A.Miyakawa
    /**
	 *　を返します。
	 * @return exception　を戻します。
	 */
	public Exception getException() {
		return exception;
	}

	/**
	 *　をセットします。
	 * @param exception を設定。
	 */
	public void setException(Exception exception) {
		this.exception = exception;
	}
	// Add End CATPPS-1364 対応 A.Miyakawa

	/**
	 *　を返します。
	 * @return judgeMent　を戻します。
	 */
	public String getJudgeMent() {
		return judgeMent;
	}

	/**
	 *　をセットします。
	 * @param judgeMent を設定。
	 */
	public void setJudgeMent(String judgeMent) {
		this.judgeMent = judgeMent;
	}

	/**
	 *　を返します。
	 * @return switchingUpdateAndAlartStatus　を戻します。
	 */
	public SwitchingUpdateAndAlartStatus getSwitchingUpdateAndAlartStatus() {
		return switchingUpdateAndAlartStatus;
	}

	/**
	 *　をセットします。
	 * @param switchingUpdateAndAlartStatus を設定。
	 */
	public void setSwitchingUpdateAndAlartStatus(
			SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus) {
		this.switchingUpdateAndAlartStatus = switchingUpdateAndAlartStatus;
	}


}
