package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * �X�C�b�`���O�ؑ֌Ăяo���p�����[�^�N���X�B
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@SuppressWarnings("serial")
public class SwitchingUpdateAndAlartStatus implements Serializable {


	/** ������ */
	private BigDecimal processingStatus;
	
	/** �\���������� */
	private BigDecimal applyProcessingStatsu;
	
	/** �X�e�[�^�X���ރR�[�h */
	private BigDecimal statusKindCode;
	
	/** �X�e�[�^�X�R�[�h */
	private BigDecimal statusCode;
	
	/** �o�b�`���ʊi�[�t���O */
	private boolean batchResultFlag;
	
	/** ���A�������i�\���p�j�\���t���O */
	private boolean renrakuDispFlag;
	
	/** ���A�������\���t���O */
	private boolean renrakuFlag;
	
	/** ��t���b�Z�[�W�\���t���O */
	private boolean uketsukeMsgFlag;
	
	/** ���[���t���O */
	private boolean mailFlag;
	
	/** �Ď��A���[�g�t���O */
	private boolean alartFlag;
	
	/** �ʒm��� */
	private String mailKind;

	/**
	 * �R���X�g���N�^
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
	 *�@��Ԃ��܂��B
	 * @return processingStatus�@��߂��܂��B
	 */
	public BigDecimal getProcessingStatus() {
		return processingStatus;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param processingStatus ��ݒ�B
	 */
	public void setProcessingStatus(BigDecimal processingStatus) {
		this.processingStatus = processingStatus;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return applyProcessingStatsu�@��߂��܂��B
	 */
	public BigDecimal getApplyProcessingStatsu() {
		return applyProcessingStatsu;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param applyProcessingStatsu ��ݒ�B
	 */
	public void setApplyProcessingStatsu(BigDecimal applyProcessingStatsu) {
		this.applyProcessingStatsu = applyProcessingStatsu;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return statusKindCode�@��߂��܂��B
	 */
	public BigDecimal getStatusKindCode() {
		return statusKindCode;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param statusKindCode ��ݒ�B
	 */
	public void setStatusKindCode(BigDecimal statusKindCode) {
		this.statusKindCode = statusKindCode;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return statusCode�@��߂��܂��B
	 */
	public BigDecimal getStatusCode() {
		return statusCode;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param statusCode ��ݒ�B
	 */
	public void setStatusCode(BigDecimal statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return batchResultFlag�@��߂��܂��B
	 */
	public boolean isBatchResultFlag() {
		return batchResultFlag;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param batchResultFlag ��ݒ�B
	 */
	public void setBatchResultFlag(boolean batchResultFlag) {
		this.batchResultFlag = batchResultFlag;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return renrakuDispFlag�@��߂��܂��B
	 */
	public boolean isRenrakuDispFlag() {
		return renrakuDispFlag;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param renrakuDispFlag ��ݒ�B
	 */
	public void setRenrakuDispFlag(boolean renrakuDispFlag) {
		this.renrakuDispFlag = renrakuDispFlag;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return renrakuFlag�@��߂��܂��B
	 */
	public boolean isRenrakuFlag() {
		return renrakuFlag;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param renrakuFlag ��ݒ�B
	 */
	public void setRenrakuFlag(boolean renrakuFlag) {
		this.renrakuFlag = renrakuFlag;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return uketsukeMsgFlag�@��߂��܂��B
	 */
	public boolean isUketsukeMsgFlag() {
		return uketsukeMsgFlag;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param uketsukeMsgFlag ��ݒ�B
	 */
	public void setUketsukeMsgFlag(boolean uketsukeMsgFlag) {
		this.uketsukeMsgFlag = uketsukeMsgFlag;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return mailFlag�@��߂��܂��B
	 */
	public boolean isMailFlag() {
		return mailFlag;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param mailFlag ��ݒ�B
	 */
	public void setMailFlag(boolean mailFlag) {
		this.mailFlag = mailFlag;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return alartFlag�@��߂��܂��B
	 */
	public boolean isAlartFlag() {
		return alartFlag;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param alartFlag ��ݒ�B
	 */
	public void setAlartFlag(boolean alartFlag) {
		this.alartFlag = alartFlag;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return mailKind�@��߂��܂��B
	 */
	public String getMailKind() {
		return mailKind;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param mailKind ��ݒ�B
	 */
	public void setMailKind(String mailKind) {
		this.mailKind = mailKind;
	}


}
