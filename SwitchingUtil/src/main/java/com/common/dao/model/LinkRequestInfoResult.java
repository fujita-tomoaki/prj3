package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.service.model.T0a9EntityModel;
import com.service.model.Te79EntityModel;

/**
 * �A�g�v�����쐬�̍쐬��񃂃f���N���X�ł��B<BR/>
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */

public class LinkRequestInfoResult implements Serializable {

	private static final long serialVersionUID = 1L;

	/** �ǃR�[�h */
	private String stationCd;
	
	/** �A�g�ԍ� */
	private BigDecimal renKeiNum;

	/** �A�g�ԍ��A�� */
	private BigDecimal renKeiSerialNum;
	
	/** �A�g�v������ */
	private Timestamp renKeiEntryDatetime;

	/** �T�[�r�XID */
	private String serviceId;

	/** �ڋq�R�[�h */
	private String customerCd;

	/** �A�� */
	private BigDecimal serialNumber;

	/** �X�V�t���O */
	private BigDecimal flagUpdate;

	/** �\����� */
	private String appType;

	/** �������Ǝ҃R�[�h */
	private String retailCd;

	/** �d�͉�ЃG���A */
	private String powerCompanyArea;

	/** �������Ǝҏ�� */
	private List<Tpe7> Tpe7List;

	/** �_���� */
	private GetSwitchingContractInfoResult contractInfoResult;

	/** �ڋq�Z����� */
	private List<T105> t105EntityModelList;

	/** �\����� */
	private Te79 te79EntityMode;

	/** �X�C�b�`���O�A�g�v���g�����ڏ�� */
	private List<Te7a> te7aEntityModelList;

	/** ��t���b�Z�[�W��� */
	private List<Te7b> te7bEntityModelList;
	
	// Change Start CAPPS-944�Ή� T.Funao
	/** ��t�H�� */
	private String receivingStep;
	// Change End CAPPS-944�Ή� T.Funao
	
	/** �ʐM���� */
	private Integer communicationResult;

	/** �T�[�r�X���� */
	private Integer serviceResult;

	/** �A�g���� */
	private String cooperationResult;

	/** ������ */
	private BigDecimal processingStatus;

	/** �\���ԍ� */
	private String appNo;

	/** ���I�ؖ������ */
	private List<T0a9> t0a9EntityModelList;

	/** �A�g���� */
	private java.sql.Timestamp cooperationDate;

	/** �G���[���b�Z�[�WID */
	private String errorMsgId;
	// Change Start SW���փ`�F�b�N A.Miyakawa
	/** �G���[���b�Z�[�W */
	private String[] errorMsg;
	// Change End SW���փ`�F�b�N A.Miyakawa

	/** �T�[�r�X�G���[���R */
	private String serviceErrorReason;

	/** �A�g�G���[���R */
	private String cooperationErrorReason;

	/** �ʐM�X�e�[�^�X */
	private String communicationStatus;

	/** �p�~�掟�ԍ� */
	private String abolitionAgencyNo;

	/** �ٓ��\��� */
	private String changesDatePlan;

	/** �ٓ��� */
	private String changesDate;

	/** ���A������ */
	private String contactMatter;

	/** �ŏI�������A�g�ԍ� */
	private BigDecimal lastIncompleteRenKeiNum;
	
	/** �Ɩ������󋵊m�F�A�� */
	private BigDecimal processingStatusSerialNumber;

	/** �p�~�掟��� */
	private Te76 te76;
	
	/** �X�C�b�`���O�J�n���@*/
	private List<SwithingParameter> swStartInfo;
	
	/** �p�~�掟���f���@*/
	private List<SwithingParameter> swAbolitionJudgementInfo;
	
	/** �X�C�b�`���O�p�~�\����� */
	private List<SwithingParameter> swAbolitionApplyInfo;
	
	/** �g�p�ʏ��Ɖ��� */
	private List<SwithingParameter> usedAmountInfoInquiryInfo;
	
	/** �_��X�e�[�^�X�ύX��� */
	private SwContractStatusChangeInfoModel contractStatusChangeInfo;
	
	/** �X�C�b�`���O�p�~�掟�����ݒ��� */
	private List<Tpe7> Tpe7SearchSettingList;
	
	/** �X�C�b�`���O�A�g�Ǘ��X�V��� */
	private List<Te79EntityModel> te79EntityModelListUpdateInfo;
	
	/** �X�C�b�`���O�X�e�[�^�X�X�V���X�g */
	private List<SwithingParameter> swStatusUpdList;

	/** IS_�~�~�~�~�p�A�g�v����񃊃X�g */
	private List<LinkRequestForIs> linkReqForIs;
	
	/** �X�C�b�`���O�A�g���ʃ��X�g */
	List<Te7j> te7jList;
	
	/** �ڑ������p�~�N�����X�V�f�[�^ */
	List<Te11> te11List;

	// Add Start CATPPS-1101 �Ή��@Y.Kimura
	/** ���A������(�\���p) */
	private String dispContactMatter;
	// Add End CATPPS-1101 �Ή��@Y.Kimura
	
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/** ���o�^���i�[���f�� */
	private Te17 te17;
	// Add End CATPPSSB-246 20160227 A.Miyakawa
	
	// Add Start CATPPS-1364 �Ή� A.Miyakawa
	/** ��O��� */
	private Exception exception;
	/** ���f */
	private String judgeMent;
	/**  */
	private SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus;
	// Add End CATPPS-1364 �Ή� A.Miyakawa

	/**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
	public LinkRequestInfoResult() {
		// �V�X�e�����t�ŏ�����
		this.cooperationDate = new Timestamp(System.currentTimeMillis());
		this.renKeiEntryDatetime = new Timestamp(System.currentTimeMillis());

		/** ��t���b�Z�[�W���  */
		this.te7bEntityModelList = new ArrayList<Te7b>();
		
		// �e���ʂɂ��ẮA�ُ��\������l�ŏ�����
		/** �ʐM���� */
		this.communicationResult = 1;

		/** �T�[�r�X���� */
		this.serviceResult = 1;

		/** �A�g���� */
		this.cooperationResult = "1";

		/** ������ */
		this.processingStatus = new BigDecimal(3);
		
		/** �X�C�b�`���O�A�g�Ǘ��X�V��� */
		this.te79EntityModelListUpdateInfo = new ArrayList<Te79EntityModel>();

	}
	// 2015/11/07 K.Suzuki Add End

	/**
	�@*�@��Ԃ��܂��B
	 * @return stationCd�@��߂��܂��B
	 */
	public String getStationCd() {
		return stationCd;
	}

	/**
	�@*�@���Z�b�g���܂��B
	 * @param stationCd ��ݒ�B
	 */
	public void setStationCd(String stationCd) {
		this.stationCd = stationCd;
	}

	/**
	 * �A�g�ԍ���Ԃ��܂��B
	 * 
	 * @return �A�g�ԍ� ��߂��܂��B
	 */
	public BigDecimal getRenKeiNum() {
		return renKeiNum;
	}

	/**
	 * �A�g�ԍ����Z�b�g���܂��B
	 * 
	 * @param renKeiNum
	 *            �A�g�ԍ� ��ݒ�B
	 */
	public void setRenKeiNum(BigDecimal renKeiNum) {
		this.renKeiNum = renKeiNum;
	}

	/**
	�@*�@��Ԃ��܂��B
	 * @return renKeiSerialNum�@��߂��܂��B
	 */
	public BigDecimal getRenKeiSerialNum() {
		return renKeiSerialNum;
	}

	/**
	�@*�@���Z�b�g���܂��B
	 * @param renKeiSerialNum ��ݒ�B
	 */
	public void setRenKeiSerialNum(BigDecimal renKeiSerialNum) {
		this.renKeiSerialNum = renKeiSerialNum;
	}

	/**
	 * �A�g�v��������Ԃ��܂��B
	 * 
	 * @return �A�g�v������ ��߂��܂��B
	 */
	public Timestamp getRenKeiEntryDatetime() {
		return renKeiEntryDatetime;
	}

	/**
	 * �A�g�v���������Z�b�g���܂��B
	 * 
	 * @param renKeiEntryDatetime
	 *            �A�g�v������ ��ݒ�B
	 */
	public void setRenKeiEntryDatetime(Timestamp renKeiEntryDatetime) {
		this.renKeiEntryDatetime = renKeiEntryDatetime;
	}

	/**
	 * �T�[�r�XID��Ԃ��܂��B
	 * 
	 * @return �T�[�r�XID ��߂��܂��B
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * �T�[�r�XID���Z�b�g���܂��B
	 * 
	 * @param serviceId
	 *            �T�[�r�XID ��ݒ�B
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * �ڋq�R�[�h��Ԃ��܂��B
	 * 
	 * @return �ڋq�R�[�h ��߂��܂��B
	 */
	public String getCustomerCd() {
		return customerCd;
	}

	/**
	 * �ڋq�R�[�h���Z�b�g���܂��B
	 * 
	 * @param customerCd
	 *            �ڋq�R�[�h ��ݒ�B
	 */
	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	/**
	 * �A�Ԃ�Ԃ��܂��B
	 * 
	 * @return �A�� ��߂��܂��B
	 */
	public BigDecimal getSerialNumber() {
		return serialNumber;
	}

	/**
	 * �A�Ԃ��Z�b�g���܂��B
	 * 
	 * @param serialNumber
	 *            �A�� ��ݒ�B
	 */
	public void setSerialNumber(BigDecimal serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * �X�V�t���O��Ԃ��܂��B
	 * 
	 * @return �X�V�t���O ��߂��܂��B
	 */
	public java.math.BigDecimal getFlagUpdate() {
		return flagUpdate;
	}

	/**
	 * �X�V�t���O���Z�b�g���܂��B
	 * 
	 * @param flagUpdate
	 *            �X�V�t���O ��ݒ�B
	 */
	public void setFlagUpdate(java.math.BigDecimal flagUpdate) {
		this.flagUpdate = flagUpdate;
	}

	/**
	 * �\����ʂ�Ԃ��܂��B
	 * 
	 * @return �\����� ��߂��܂��B
	 */
	public String getAppType() {
		return appType;
	}

	/**
	 * �\����ʂ��Z�b�g���܂��B
	 * 
	 * @param appType
	 *            �\����� ��ݒ�B
	 */
	public void setAppType(String appType) {
		this.appType = appType;
	}

	/**
	 * �������Ǝ҃R�[�h��Ԃ��܂��B
	 * 
	 * @return �������Ǝ҃R�[�h ��߂��܂��B
	 */
	public String getRetailCd() {
		return retailCd;
	}

	/**
	 * �������Ǝ҃R�[�h���Z�b�g���܂��B
	 * 
	 * @param retailCd
	 *            �������Ǝ҃R�[�h ��ݒ�B
	 */
	public void setRetailCd(String retailCd) {
		this.retailCd = retailCd;
	}

	/**
	 * �d�͉�ЃG���A��Ԃ��܂��B
	 * 
	 * @return �d�͉�ЃG���A ��߂��܂��B
	 */
	public String getPowerCompanyArea() {
		return powerCompanyArea;
	}

	/**
	 * �d�͉�ЃG���A���Z�b�g���܂��B
	 * 
	 * @param powerCompanyArea
	 *            �d�͉�ЃG���A ��ݒ�B
	 */
	public void setPowerCompanyArea(String powerCompanyArea) {
		this.powerCompanyArea = powerCompanyArea;
	}

	/**
	 * �������Ǝҏ���Ԃ��܂��B
	 * 
	 * @return �������Ǝҏ�� ��߂��܂��B
	 */
	public List<Tpe7> getTpe7List() {
		return Tpe7List;
	}

	/**
	 * �������Ǝҏ����Z�b�g���܂��B
	 * 
	 * @param Tpe7List
	 *            �������Ǝҏ�� ��ݒ�B
	 */
	public void setTpe7List(List<Tpe7> Tpe7List) {
		this.Tpe7List = Tpe7List;
	}

	/**
	 * �_�����Ԃ��܂��B
	 * 
	 * @return �_���� ��߂��܂��B
	 */
	public GetSwitchingContractInfoResult getContractInfoResult() {
		return contractInfoResult;
	}

	/**
	 * �_������Z�b�g���܂��B
	 * 
	 * @param contractInfoResult
	 *            �_���� ��ݒ�B
	 */
	public void setContractInfoResult(
			GetSwitchingContractInfoResult contractInfoResult) {
		this.contractInfoResult = contractInfoResult;
	}

	/**
	 * �ڋq�Z������Ԃ��܂��B
	 * 
	 * @return �ڋq�Z����� ��߂��܂��B
	 */
	public List<T105> getT105EntityModelList() {
		return t105EntityModelList;
	}

	/**
	 * �ڋq�Z�������Z�b�g���܂��B
	 * 
	 * @param t105EntityModelList
	 *            �ڋq�Z����� ��ݒ�B
	 */
	public void setT105EntityModelList(List<T105> t105EntityModelList) {
		this.t105EntityModelList = t105EntityModelList;
	}

	/**
	 * �@�\������Ԃ��܂��B
	 * 
	 * @return te79EntityMode�@�\������߂��܂��B
	 */
	public Te79 getTe79EntityMode() {
		return te79EntityMode;
	}

	/**
	 * �@�\�������Z�b�g���܂��B
	 * 
	 * @param te79EntityMode
	 *            �\������ݒ�B
	 */
	public void setTe79EntityMode(Te79 te79EntityMode) {
		this.te79EntityMode = te79EntityMode;
	}

	/**
	 * �X�C�b�`���O�A�g�v���g�����ڏ���Ԃ��܂��B
	 * 
	 * @return �X�C�b�`���O�A�g�v���g�����ڏ�� ��߂��܂��B
	 */
	public List<Te7a> getTe7aEntityModelList() {
		return te7aEntityModelList;
	}

	/**
	 * �X�C�b�`���O�A�g�v���g�����ڏ����Z�b�g���܂��B
	 * 
	 * @param te7aEntityModel
	 *            �X�C�b�`���O�A�g�v���g�����ڏ�� ��ݒ�B
	 */
	public void setTe7aEntityModelList(List<Te7a> te7aEntityModel) {
		this.te7aEntityModelList = te7aEntityModel;
	}

	/**
	 * ��t���b�Z�[�W����Ԃ��܂��B
	 * 
	 * @return ��t���b�Z�[�W���
	 */
	public List<Te7b> getTe7bEntityModelList() {
		return this.te7bEntityModelList;
	}

	/**
	 * ��t���b�Z�[�W�����Z�b�g���܂��B
	 * 
	 * @param te7BEntityModel
	 *            TE7B�X�C�b�`���O�A�g��t���b�Z�[�W
	 */
	public void setTe7bEntityModelList(List<Te7b> te7bEntityModel) {
		this.te7bEntityModelList = te7bEntityModel;
	}

	/**
	 * ��t�s����Ԃ��܂��B
	 * 
	 * @return ��t�H��
	 */
	public String getReceivingStep() {
		return this.receivingStep;
	}

	/**
	 * ��t�s�����Z�b�g���܂��B
	 * 
	 * @param uketsukeKotei
	 *            ��t�H��
	 */
	public void setReceivingStep(String receivingStep) {
		this.receivingStep = receivingStep;
	}
	
	/**
	 * �@�ʐM���ʂ�Ԃ��܂��B
	 * 
	 * @return communicationResult�@�ʐM���ʂ�߂��܂��B
	 */
	public Integer getCommunicationResult() {
		return communicationResult;
	}

	/**
	 * �@�ʐM���ʂ��Z�b�g���܂��B
	 * 
	 * @param communicationResult
	 *            �ʐM���ʂ�ݒ�B
	 */
	public void setCommunicationResult(Integer communicationResult) {
		this.communicationResult = communicationResult;
	}

	/**
	 * �@�T�[�r�X���ʂ�Ԃ��܂��B
	 * 
	 * @return serviceResult�@�T�[�r�X���ʂ�߂��܂��B
	 */
	public Integer getServiceResult() {
		return serviceResult;
	}

	/**
	 * �@�T�[�r�X���ʂ��Z�b�g���܂��B
	 * 
	 * @param serviceResult
	 *            �T�[�r�X���ʂ�ݒ�B
	 */
	public void setServiceResult(Integer serviceResult) {
		this.serviceResult = serviceResult;
	}

	/**
	 * �@�A�g���ʂ�Ԃ��܂��B
	 * 
	 * @return cooperationResult�@�A�g���ʂ�߂��܂��B
	 */
	public String getCooperationResult() {
		return cooperationResult;
	}

	/**
	 * �@�A�g���ʂ��Z�b�g���܂��B
	 * 
	 * @param cooperationResult
	 *            �A�g���ʂ�ݒ�B
	 */
	public void setCooperationResult(String cooperationResult) {
		this.cooperationResult = cooperationResult;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return errorMsgId�@��߂��܂��B
	 */
	public String getErrorMsgId() {
		return errorMsgId;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param errorMsgId ��ݒ�B
	 */
	public void setErrorMsgId(String errorMsgId) {
		this.errorMsgId = errorMsgId;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return errorMsg�@��߂��܂��B
	 */
	public String[] getErrorMsg() {
		return errorMsg;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param errorMsg ��ݒ�B
	 */
	public void setErrorMsg(String[] errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * �@�����󋵂�Ԃ��܂��B
	 * 
	 * @return processingStatus�@�����󋵂�߂��܂��B
	 */
	public BigDecimal getProcessingStatus() {
		return processingStatus;
	}

	/**
	 * �@�����󋵂��Z�b�g���܂��B
	 * 
	 * @param processingStatus
	 *            �����󋵂�ݒ�B
	 */
	public void setProcessingStatus(BigDecimal processingStatus) {
		this.processingStatus = processingStatus;
	}

	/**
	 * �@�\���ԍ���Ԃ��܂��B
	 * 
	 * @return appNo�@�\���ԍ���߂��܂��B
	 */
	public String getAppNo() {
		return appNo;
	}

	/**
	 * �@�\���ԍ����Z�b�g���܂��B
	 * 
	 * @param appNo
	 *            �\���ԍ���ݒ�B
	 */
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	/**
	 * �@���I�ؖ�������Ԃ��܂��B
	 * 
	 * @return t0a9EntityModelList�@���I�ؖ�������߂��܂��B
	 */
	public List<T0a9> getT0a9EntityModelList() {
		return t0a9EntityModelList;
	}

	/**
	 * �@���I�ؖ��������Z�b�g���܂��B
	 * 
	 * @param t0a9EntityModelList
	 *            ���I�ؖ�������ݒ�B
	 */
	public void setT0a9EntityModelList(List<T0a9> t0a9EntityModelList) {
		this.t0a9EntityModelList = t0a9EntityModelList;
	}

	/**
	 * �@�A�g������Ԃ��܂��B
	 * 
	 * @return ��ooperationDate�@�A�g������߂��܂��B
	 */
	public java.sql.Timestamp getCooperationDate() {
		return cooperationDate;
	}

	/**
	 * �@�A�g�������Z�b�g���܂��B
	 * 
	 * @param ��ooperationDate
	 *            �A�g������ݒ�B
	 */
	public void setCooperationDate(java.sql.Timestamp cooperationDate) {
		this.cooperationDate = cooperationDate;
	}

	/**
	 * �@�T�[�r�X�G���[���R��Ԃ��܂��B
	 * 
	 * @return serviceErrorReason�@�T�[�r�X�G���[���R��߂��܂��B
	 */
	public String getServiceErrorReason() {
		return serviceErrorReason;
	}

	/**
	 * �@�T�[�r�X�G���[���R���Z�b�g���܂��B
	 * 
	 * @param serviceErrorReason
	 *            �T�[�r�X�G���[���R��ݒ�B
	 */
	public void setServiceErrorReason(String serviceErrorReason) {
		this.serviceErrorReason = serviceErrorReason;
	}

	/**
	 * �@�A�g�G���[���R��Ԃ��܂��B
	 * 
	 * @return cooperationErrorReason�@�A�g�G���[���R��߂��܂��B
	 */
	public String getCooperationErrorReason() {
		return cooperationErrorReason;
	}

	/**
	 * �@�A�g�G���[���R���Z�b�g���܂��B
	 * 
	 * @param cooperationErrorReason
	 *            �A�g�G���[���R��ݒ�B
	 */
	public void setCooperationErrorReason(String cooperationErrorReason) {
		this.cooperationErrorReason = cooperationErrorReason;
	}

	/**
	 * �@�ʐM�X�e�[�^�X��Ԃ��܂��B
	 * 
	 * @return communicationStatus�@�ʐM�X�e�[�^�X��߂��܂��B
	 */
	public String getCommunicationStatus() {
		return communicationStatus;
	}

	/**
	 * �@�ʐM�X�e�[�^�X���Z�b�g���܂��B
	 * 
	 * @param communicationStatus
	 *            �ʐM�X�e�[�^�X��ݒ�B
	 */
	public void setCommunicationStatus(String communicationStatus) {
		this.communicationStatus = communicationStatus;
	}

	/**
	 * �@�p�~�掟�ԍ���Ԃ��܂��B
	 * 
	 * @return abolitionAgencyNo�@�p�~�掟�ԍ���߂��܂��B
	 */
	public String getAbolitionAgencyNo() {
		return abolitionAgencyNo;
	}

	/**
	 * �@�p�~�掟�ԍ����Z�b�g���܂��B
	 * 
	 * @param abolitionAgencyNo
	 *            �p�~�掟�ԍ���ݒ�B
	 */
	public void setAbolitionAgencyNo(String abolitionAgencyNo) {
		this.abolitionAgencyNo = abolitionAgencyNo;
	}

	/**
	 * �@�ٓ��\�����Ԃ��܂��B
	 * 
	 * @return changesDatePlan�@�ٓ��\�����߂��܂��B
	 */
	public String getChangesDatePlan() {
		return changesDatePlan;
	}

	/**
	 * �@�ٓ��\������Z�b�g���܂��B
	 * 
	 * @param changesDatePlan
	 *            �ٓ��\�����ݒ�B
	 */
	public void setChangesDatePlan(String changesDatePlan) {
		this.changesDatePlan = changesDatePlan;
	}

	/**
	 * �@�ٓ�����Ԃ��܂��B
	 * 
	 * @return changesDate�@�ٓ�����߂��܂��B
	 */
	public String getChangesDate() {
		return changesDate;
	}

	/**
	 * �@�ٓ������Z�b�g���܂��B
	 * 
	 * @param changesDate
	 *            �ٓ�����ݒ�B
	 */
	public void setChangesDate(String changesDate) {
		this.changesDate = changesDate;
	}

	/**
	 * �@���A��������Ԃ��܂��B
	 * 
	 * @return contactMatter�@���A��������߂��܂��B
	 */
	public String getContactMatter() {
		return contactMatter;
	}

	/**
	 * �@���A���������Z�b�g���܂��B
	 * 
	 * @param contactMatter
	 *            ���A��������ݒ�B
	 */
	public void setContactMatter(String contactMatter) {
		this.contactMatter = contactMatter;
	}

	/**
	�@*�@��Ԃ��܂��B
	 * @return lastIncompleteRenKeiNum�@��߂��܂��B
	 */
	public BigDecimal getLastIncompleteRenKeiNum() {
		return lastIncompleteRenKeiNum;
	}

	/**
	�@*�@���Z�b�g���܂��B
	 * @param lastIncompleteRenKeiNum ��ݒ�B
	 */
	public void setLastIncompleteRenKeiNum(BigDecimal lastIncompleteRenKeiNum) {
		this.lastIncompleteRenKeiNum = lastIncompleteRenKeiNum;
	}

	/**
	�@*�@�Ɩ������󋵊m�F�A�Ԃ�Ԃ��܂��B
	 * @return processingStatusSerialNumber�@��߂��܂��B
	 */
	public BigDecimal getProcessingStatusSerialNumber() {
		return processingStatusSerialNumber;
	}

	/**
	�@*�@�Ɩ������󋵊m�F�A�Ԃ��Z�b�g���܂��B
	 * @param processingStatusSerialNumber ��ݒ�B
	 */
	public void setProcessingStatusSerialNumber(
			BigDecimal processingStatusSerialNumber) {
		this.processingStatusSerialNumber = processingStatusSerialNumber;
	}

	/**
	 *�@�p�~�掟����Ԃ��܂��B
	 * @return Te76�@��߂��܂��B
	 */
	public Te76 getTe76() {
		return te76;
	}

	/**
	 *�@�p�~�掟�����Z�b�g���܂��B
	 * @param Te76 ��ݒ�B
	 */
	public void setTe76(Te76 te76) {
		this.te76 = te76;
	}

	/**
	 *�@�X�C�b�`���O�J�n����Ԃ��܂��B
	 * @return swStartInfo�@��߂��܂��B
	 */
	public List<SwithingParameter> getSwStartInfo() {
		return swStartInfo;
	}

	/**
	 *�@�X�C�b�`���O�J�n�����Z�b�g���܂��B
	 * @param swStartInfo ��ݒ�B
	 */
	public void setSwStartInfo(List<SwithingParameter> swStartInfo) {
		this.swStartInfo = swStartInfo;
	}

	/**
	 *�@�p�~�掟���f����Ԃ��܂��B
	 * @return swAbolitionJudgementInfo�@��߂��܂��B
	 */
	public List<SwithingParameter> getSwAbolitionJudgementInfo() {
		return swAbolitionJudgementInfo;
	}

	/**
	 *�@�p�~�掟���f�����Z�b�g���܂��B
	 * @param swAbolitionJudgementInfo ��ݒ�B
	 */
	public void setSwAbolitionJudgementInfo(
			List<SwithingParameter> swAbolitionJudgementInfo) {
		this.swAbolitionJudgementInfo = swAbolitionJudgementInfo;
	}

	/**
	 *�@�X�C�b�`���O�p�~�\������Ԃ��܂��B
	 * @return swAbolitionApplyInfo�@��߂��܂��B
	 */
	public List<SwithingParameter> getSwAbolitionApplyInfo() {
		return swAbolitionApplyInfo;
	}

	/**
	 *�@�X�C�b�`���O�p�~�\�������Z�b�g���܂��B
	 * @param swAbolitionApplyInfo ��ݒ�B
	 */
	public void setSwAbolitionApplyInfo(List<SwithingParameter> swAbolitionApplyInfo) {
		this.swAbolitionApplyInfo = swAbolitionApplyInfo;
	}

	/**
	 *�@�g�p�ʏ��Ɖ����Ԃ��܂��B
	 * @return usedAmountInfoInquiryInfo�@��߂��܂��B
	 */
	public List<SwithingParameter> getUsedAmountInfoInquiryInfo() {
		return usedAmountInfoInquiryInfo;
	}

	/**
	 *�@�g�p�ʏ��Ɖ�����Z�b�g���܂��B
	 * @param usedAmountInfoInquiryInfo ��ݒ�B
	 */
	public void setUsedAmountInfoInquiryInfo(
			List<SwithingParameter> usedAmountInfoInquiryInfo) {
		this.usedAmountInfoInquiryInfo = usedAmountInfoInquiryInfo;
	}

	/**
	 *�@�_��X�e�[�^�X�ύX����Ԃ��܂��B
	 * @return contractStatusChangeInfo�@��߂��܂��B
	 */
	public SwContractStatusChangeInfoModel getContractStatusChangeInfo() {
		return contractStatusChangeInfo;
	}

	/**
	 *�@�_��X�e�[�^�X�ύX�����Z�b�g���܂��B
	 * @param contractStatusChangeInfo ��ݒ�B
	 */
	public void setContractStatusChangeInfo(
			SwContractStatusChangeInfoModel contractStatusChangeInfo) {
		this.contractStatusChangeInfo = contractStatusChangeInfo;
	}

	/**
	 *�@�X�C�b�`���O�p�~�掟�����ݒ����Ԃ��܂��B
	 * @return Tpe7SearchSettingList�@��߂��܂��B
	 */
	public List<Tpe7> getTpe7SearchSettingList() {
		return Tpe7SearchSettingList;
	}

	/**
	 *�@�X�C�b�`���O�p�~�掟�����ݒ�����Z�b�g���܂��B
	 * @param Tpe7SearchSettingList ��ݒ�B
	 */
	public void setTpe7SearchSettingList(
			List<Tpe7> Tpe7SearchSettingList) {
		this.Tpe7SearchSettingList = Tpe7SearchSettingList;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return Tpe7ListUpdateInfo�@��߂��܂��B
	 */
	public List<Te79EntityModel> getTe79EntityModelListUpdateInfo() {
		return te79EntityModelListUpdateInfo;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param Tpe7ListUpdateInfo ��ݒ�B
	 */
	public void setTe79EntityModelListUpdateInfo(
			List<Te79EntityModel> te79EntityModelListUpdateInfo) {
		this.te79EntityModelListUpdateInfo = te79EntityModelListUpdateInfo;
	}

	/**
	 *�@�X�C�b�`���O�X�e�[�^�X�X�V���X�g��Ԃ��܂��B
	 * @return swStatusUpdList�@��߂��܂��B
	 */
	public List<SwithingParameter> getSwStatusUpdList() {
		return swStatusUpdList;
	}

	/**
	 *�@�X�C�b�`���O�X�e�[�^�X�X�V���X�g���Z�b�g���܂��B
	 * @param swStatusUpdList ��ݒ�B
	 */
	public void setSwStatusUpdList(List<SwithingParameter> swStatusUpdList) {
		this.swStatusUpdList = swStatusUpdList;
	}

	/**
	 * IS_�~�~�~�~�p�A�g�v����񃊃X�g��Ԃ��܂��B
	 * @return linkReqForIs�@��߂��܂��B
	 */
	public List<LinkRequestForIs> getLinkReqForIs() {
		return linkReqForIs;
	}

	/**
	 * IS_�~�~�~�~�p�A�g�v����񃊃X�g���Z�b�g���܂��B
	 * @param linkReqForIs ��ݒ�B
	 */
	public void setLinkReqForIs(List<LinkRequestForIs> linkReqForIs) {
		this.linkReqForIs = linkReqForIs;
	}

	/**
	 *�@�X�C�b�`���O�A�g���ʃ��X�g��Ԃ��܂��B
	 * @return Te7jList�@��߂��܂��B
	 */
	public List<Te7j> getTe7jList() {
		return te7jList;
	}

	/**
	 *�@�X�C�b�`���O�A�g���ʃ��X�g���Z�b�g���܂��B
	 * @param Te7jList ��ݒ�B
	 */
	public void setTe7jList(List<Te7j> Te7jList) {
		this.te7jList = te7jList;
	}

	/**
	 *�@�ڑ������p�~�N�����X�V�f�[�^��Ԃ��܂��B
	 * @return Te11List�@��߂��܂��B
	 */
	public List<Te11> getTe11List() {
		return te11List;
	}

	/**
	 *�@�ڑ������p�~�N�����X�V�f�[�^���Z�b�g���܂��B
	 * @param Te11List ��ݒ�B
	 */
	public void setTe11List(List<Te11> Te11List) {
		this.te11List = te11List;
	}

	// Add Start CATPPS-1101 �Ή��@Y.Kimura
	/**
	 * ���A������(�\���p)��Ԃ��܂��B
	 * 
	 * @return ���A������(�\���p) ��߂��܂��B
	 */
	public String getDispContactMatter() {
		return this.dispContactMatter;
	}
	
	/**
	 * ���A������(�\���p)���Z�b�g���܂��B
	 * 
	 * @param dispContactMatter
	 *            ���A������(�\���p) ��ݒ�B
	 */
	public void setDispContactMatter(String dispContactMatter) {
		this.dispContactMatter = dispContactMatter;
	}
	// Add End CATPPS-1101 �Ή��@Y.Kimura
	// Add Start CATPPSSB-246 20160227 A.Miyakawa 
	/**
	 *�@��Ԃ��܂��B
	 * @return Te17�@��߂��܂��B
	 */
	public Te17 getTe17() {
		return te17;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param Te17 ��ݒ�B
	 */
	public void setTe17(Te17 Te17) {
		this.te17 = te17;
	}
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	
	
	// Add Start CATPPS-1364 �Ή� A.Miyakawa
    /**
	 *�@��Ԃ��܂��B
	 * @return exception�@��߂��܂��B
	 */
	public Exception getException() {
		return exception;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param exception ��ݒ�B
	 */
	public void setException(Exception exception) {
		this.exception = exception;
	}
	// Add End CATPPS-1364 �Ή� A.Miyakawa

	/**
	 *�@��Ԃ��܂��B
	 * @return judgeMent�@��߂��܂��B
	 */
	public String getJudgeMent() {
		return judgeMent;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param judgeMent ��ݒ�B
	 */
	public void setJudgeMent(String judgeMent) {
		this.judgeMent = judgeMent;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return switchingUpdateAndAlartStatus�@��߂��܂��B
	 */
	public SwitchingUpdateAndAlartStatus getSwitchingUpdateAndAlartStatus() {
		return switchingUpdateAndAlartStatus;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param switchingUpdateAndAlartStatus ��ݒ�B
	 */
	public void setSwitchingUpdateAndAlartStatus(
			SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus) {
		this.switchingUpdateAndAlartStatus = switchingUpdateAndAlartStatus;
	}


}
