package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * �X�C�b�`���O�ؑ֌Ăяo���p�����[�^�N���X�B
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@SuppressWarnings("serial")
public class SwithingParameter implements Serializable {

	/** �ڋq�R�[�h */
	private String customerCd = null;
	/** �A�� */
	private BigDecimal customerConsNum = null;
	/** �X�V�t���O */
	private BigDecimal updateFlg = null;
	/** �g�p�ʉ{���p�X���[�h */
	private String usedInfoReadPw = null;
	/** �\���ԍ� */
	private String applicationNum = null;
	/** �p�~�掟�ԍ� */
	private String stopAgencyNum = null;
	/** �X�C�b�`���O�p�~�掟���fNG���R1 */
	private boolean stopAgencyJudgeReason01Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R2 */
	private boolean stopAgencyJudgeReason02Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R3 */
	private boolean stopAgencyJudgeReason03Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R4 */
	private boolean stopAgencyJudgeReason04Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R5 */
	private boolean stopAgencyJudgeReason05Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R6 */
	private boolean stopAgencyJudgeReason06Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R7 */
	private boolean stopAgencyJudgeReason07Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R8 */
	private boolean stopAgencyJudgeReason08Flg = false;
	/** �X�C�b�`���O�p�~�掟���fNG���R9 */
	private boolean stopAgencyJudgeReason09Flg = false;
	/** �X�C�b�`���O�p�~�掟���f */
	private String stopAgencyJudgeFlg;
	/** �_���� */
	private String contractType  = null;

	/**
	 * �R���X�g���N�^
	 */
	public SwithingParameter () {
		super();
	}

	/**
	 * �ڋq�R�[�h���擾���܂��B
	 * @return �ڋq�R�[�h
	 */
	public String getCustomerCd() {
		return customerCd;
	}

	/**
	 * �ڋq�R�[�h��ݒ肵�܂��B
	 * @param customerCd �ڋq�R�[�h
	 */
	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	/**
	 * �A�Ԃ��擾���܂��B
	 * @return �A��
	 */
	public BigDecimal getCustomerConsNum() {
		return customerConsNum;
	}

	/**
	 * �A�Ԃ�ݒ肵�܂��B
	 * @param customerConsNum �A��
	 */
	public void setCustomerConsNum(BigDecimal customerConsNum) {
		this.customerConsNum = customerConsNum;
	}

	/**
	 * �X�V�t���O���擾���܂��B
	 * @return �X�V�t���O
	 */
	public BigDecimal getUpdateFlg() {
		return updateFlg;
	}

	/**
	 * �X�V�t���O��ݒ肵�܂��B
	 * @param updateFlg �X�V�t���O
	 */
	public void setUpdateFlg(BigDecimal updateFlg) {
		this.updateFlg = updateFlg;
	}

	/**
	 * �g�p�ʉ{���p�X���[�h���擾���܂��B
	 * @return �g�p�ʉ{���p�X���[�h
	 */
	public String getUsedInfoReadPw() {
		return usedInfoReadPw;
	}

	/**
	 * �g�p�ʉ{���p�X���[�h��ݒ肵�܂��B
	 * @param usedInfoReadPw �g�p�ʉ{���p�X���[�h
	 */
	public void setUsedInfoReadPw(String usedInfoReadPw) {
		this.usedInfoReadPw = usedInfoReadPw;
	}

	/**
	 * �\���ԍ����擾���܂��B
	 * @return �\���ԍ�
	 */
	public String getApplicationNum() {
		return applicationNum;
	}

	/**
	 * �\���ԍ���ݒ肵�܂��B
	 * @param applicationNum �\���ԍ�
	 */
	public void setApplicationNum(String applicationNum) {
		this.applicationNum = applicationNum;
	}

	/**
	 * �p�~�掟�ԍ����擾���܂��B
	 * @return �p�~�掟�ԍ�
	 */
	public String getStopAgencyNum() {
		return stopAgencyNum;
	}

	/**
	 * �p�~�掟�ԍ���ݒ肵�܂��B
	 * @param stopAgencyNum �p�~�掟�ԍ�
	 */
	public void setStopAgencyNum(String stopAgencyNum) {
		this.stopAgencyNum = stopAgencyNum;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R1���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R1
	 */
	public boolean isStopAgencyJudgeReason01Flg() {
		return stopAgencyJudgeReason01Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R1��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason01Flg �X�C�b�`���O�p�~�掟���fNG���R1
	 */
	public void setStopAgencyJudgeReason01Flg(boolean stopAgencyJudgeReason01Flg) {
		this.stopAgencyJudgeReason01Flg = stopAgencyJudgeReason01Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R2���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R2
	 */
	public boolean isStopAgencyJudgeReason02Flg() {
		return stopAgencyJudgeReason02Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R2��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason02Flg �X�C�b�`���O�p�~�掟���fNG���R2
	 */
	public void setStopAgencyJudgeReason02Flg(boolean stopAgencyJudgeReason02Flg) {
		this.stopAgencyJudgeReason02Flg = stopAgencyJudgeReason02Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R3��ݒ肵�܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R3
	 */
	public boolean isStopAgencyJudgeReason03Flg() {
		return stopAgencyJudgeReason03Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R3��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason03Flg �X�C�b�`���O�p�~�掟���fNG���R3
	 */
	public void setStopAgencyJudgeReason03Flg(boolean stopAgencyJudgeReason03Flg) {
		this.stopAgencyJudgeReason03Flg = stopAgencyJudgeReason03Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R4���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R4
	 */
	public boolean isStopAgencyJudgeReason04Flg() {
		return stopAgencyJudgeReason04Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R4��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason04Flg �X�C�b�`���O�p�~�掟���fNG���R4
	 */
	public void setStopAgencyJudgeReason04Flg(boolean stopAgencyJudgeReason04Flg) {
		this.stopAgencyJudgeReason04Flg = stopAgencyJudgeReason04Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R5���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R5
	 */
	public boolean isStopAgencyJudgeReason05Flg() {
		return stopAgencyJudgeReason05Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R5��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason05Flg �X�C�b�`���O�p�~�掟���fNG���R5
	 */
	public void setStopAgencyJudgeReason05Flg(boolean stopAgencyJudgeReason05Flg) {
		this.stopAgencyJudgeReason05Flg = stopAgencyJudgeReason05Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R6���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R6
	 */
	public boolean isStopAgencyJudgeReason06Flg() {
		return stopAgencyJudgeReason06Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R6��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason06Flg �X�C�b�`���O�p�~�掟���fNG���R6
	 */
	public void setStopAgencyJudgeReason06Flg(boolean stopAgencyJudgeReason06Flg) {
		this.stopAgencyJudgeReason06Flg = stopAgencyJudgeReason06Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R7���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R7
	 */
	public boolean isStopAgencyJudgeReason07Flg() {
		return stopAgencyJudgeReason07Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R7��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason07Flg �X�C�b�`���O�p�~�掟���fNG���R7
	 */
	public void setStopAgencyJudgeReason07Flg(boolean stopAgencyJudgeReason07Flg) {
		this.stopAgencyJudgeReason07Flg = stopAgencyJudgeReason07Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R1���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R8
	 */
	public boolean isStopAgencyJudgeReason08Flg() {
		return stopAgencyJudgeReason08Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R8��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason08Flg �X�C�b�`���O�p�~�掟���fNG���R1
	 */
	public void setStopAgencyJudgeReason08Flg(boolean stopAgencyJudgeReason08Flg) {
		this.stopAgencyJudgeReason08Flg = stopAgencyJudgeReason08Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R9���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���fNG���R9
	 */
	public boolean isStopAgencyJudgeReason09Flg() {
		return stopAgencyJudgeReason09Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���fNG���R9��ݒ肵�܂��B
	 * @param stopAgencyJudgeReason09Flg �X�C�b�`���O�p�~�掟���fNG���R9
	 */
	public void setStopAgencyJudgeReason09Flg(boolean stopAgencyJudgeReason09Flg) {
		this.stopAgencyJudgeReason09Flg = stopAgencyJudgeReason09Flg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���f���擾���܂��B
	 * @return �X�C�b�`���O�p�~�掟���f
	 */
	public String getStopAgencyJudgeFlg() {
		return stopAgencyJudgeFlg;
	}

	/**
	 * �X�C�b�`���O�p�~�掟���f��ݒ肵�܂��B
	 * @param stopAgencyJudgeFlg �X�C�b�`���O�p�~�掟���f
	 */
	public void setStopAgencyJudgeFlg(String stopAgencyJudgeFlg) {
		this.stopAgencyJudgeFlg = stopAgencyJudgeFlg;
	}

	/**
	 *�@�_���ʂ�Ԃ��܂��B
	 * @return contractType�@��߂��܂��B
	 */
	public String getContractType() {
		return contractType;
	}

	/**
	 *�@�_���ʂ��Z�b�g���܂��B
	 * @param contractType ��ݒ�B
	 */
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
}
