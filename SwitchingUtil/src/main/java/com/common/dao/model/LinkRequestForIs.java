package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * �A�g�v�����쐬�̍쐬��񃂃f���N���X�ł��B<BR/>
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */

public class LinkRequestForIs implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** �ڋq�R�[�h */
	private String customerCd;
	
	/** �A�� */
	private BigDecimal serialNumber;

	/** �p�~�掟�ԍ� */
	private String abolitionAgencyNo;
	
	/** ������ */
	private BigDecimal processingStatus;
	
	// Add Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
	/** �X�C�b�`���O�p�~�掟���f�m�f���R */
	private String ngReason;
	// Add Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
	
	// Add Start CATPPS-1101 �Ή��@Y.Kimura
	/** ���A������(�\���p) */
	private String dispContactMatter;
	// Add End CATPPS-1101 �Ή��@Y.Kimura
	
	// Change End CATPPS-1364 �Ή� A.Miyakawa
	/** �X�e�[�^�X */
	private String status;
	
	/**  */
	private SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus;
	
	/** �X�C�b�`���O�A�g�Ǘ��X�V��� */
	private List<Te79> te79EntityModelListUpdateInfo;
	
	public LinkRequestForIs () {
		
		/** �X�C�b�`���O�A�g�Ǘ��X�V��� */
		this.te79EntityModelListUpdateInfo = new ArrayList<Te79>();
	}

	
	// Change End CATPPS-1364 �Ή� A.Miyakawa
	
	/**
	 * �ڋq�R�[�h��Ԃ��܂��B
	 * @return customerCd�@��߂��܂��B
	 */
	public String getCustomerCd() {
		return customerCd;
	}

	/**
	 * �ڋq�R�[�h���Z�b�g���܂��B
	 * @param customerCd ��ݒ�B
	 */
	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	/**
	 * �A�Ԃ�Ԃ��܂��B
	 * @return serialNumber�@��߂��܂��B
	 */
	public BigDecimal getSerialNumber() {
		return serialNumber;
	}

	/**
	 * �A�Ԃ��Z�b�g���܂��B
	 * @param serialNumber ��ݒ�B
	 */
	public void setSerialNumber(BigDecimal serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * �p�~�掟�ԍ���Ԃ��܂��B
	 * @return abolitionAgencyNo�@��߂��܂��B
	 */
	public String getAbolitionAgencyNo() {
		return abolitionAgencyNo;
	}

	/**
	 * �p�~�掟�ԍ����Z�b�g���܂��B
	 * @param abolitionAgencyNo ��ݒ�B
	 */
	public void setAbolitionAgencyNo(String abolitionAgencyNo) {
		this.abolitionAgencyNo = abolitionAgencyNo;
	}

	/**
	 * �����󋵂�Ԃ��܂��B
	 * @return processingStatus�@��߂��܂��B
	 */
	public BigDecimal getProcessingStatus() {
		return processingStatus;
	}

	/**
	 * �����󋵂��Z�b�g���܂��B
	 * @param processingStatus ��ݒ�B
	 */
	public void setProcessingStatus(BigDecimal processingStatus) {
		this.processingStatus = processingStatus;
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

	/**
	 *�@��Ԃ��܂��B
	 * @return ngReason�@��߂��܂��B
	 */
	public String getNgReason() {
		return ngReason;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param ngReason ��ݒ�B
	 */
	public void setNgReason(String ngReason) {
		this.ngReason = ngReason;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return status�@��߂��܂��B
	 */
	public String getStatus() {
		return status;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param status ��ݒ�B
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return switchingUpdateAndAlartStatu�@��߂��܂��B
	 */
	public SwitchingUpdateAndAlartStatus getSwitchingUpdateAndAlartStatus() {
		return switchingUpdateAndAlartStatus;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param switchingUpdateAndAlartStatu ��ݒ�B
	 */
	public void setSwitchingUpdateAndAlartStatus(
			SwitchingUpdateAndAlartStatus switchingUpdateAndAlartStatus) {
		this.switchingUpdateAndAlartStatus = switchingUpdateAndAlartStatus;
	}

	/**
	 *�@��Ԃ��܂��B
	 * @return te79EntityModelListUpdateInfo�@��߂��܂��B
	 */
	public List<Te79> getTe79EntityModelListUpdateInfo() {
		return te79EntityModelListUpdateInfo;
	}

	/**
	 *�@���Z�b�g���܂��B
	 * @param te79EntityModelListUpdateInfo ��ݒ�B
	 */
	public void setTe79EntityModelListUpdateInfo(
			List<Te79> te79EntityModelListUpdateInfo) {
		this.te79EntityModelListUpdateInfo = te79EntityModelListUpdateInfo;
	}
}
