package com.common.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * �X�C�b�`���O�ؑ֌Ăяo���p�����[�^�N���X�B
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@SuppressWarnings("serial")
public class SwContractStatusChangeInfoModel implements Serializable {

	/** �ڋq�R�[�h */
	private String customerCd = null;
	/** �A�� */
	private BigDecimal customerConsNum = null;
	/** �_��X�e�[�^�X */
	private BigDecimal contractStatus = null;

	/**
	 * �R���X�g���N�^
	 */
	public SwContractStatusChangeInfoModel () {
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
	 *�@�_��X�e�[�^�X��Ԃ��܂��B
	 * @return contractStatus�@��߂��܂��B
	 */
	public BigDecimal getContractStatus() {
		return contractStatus;
	}

	/**
	 *�@�_��X�e�[�^�X���Z�b�g���܂��B
	 * @param contractStatus ��ݒ�B
	 */
	public void setContractStatus(BigDecimal contractStatus) {
		this.contractStatus = contractStatus;
	}


}
