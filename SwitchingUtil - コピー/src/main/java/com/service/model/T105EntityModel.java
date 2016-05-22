/*
 * @(#)T105EntityModel.java
 * Product: Baycom�l�����V�X�e��
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * T105�ڋq�Z�����p�������G���e�B�e�B���f���N���X�ł��B<BR/>
 * 
 * �����҂ɂ��g�����s���Ă��������B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class T105EntityModel extends BaseT105EntityModel implements Serializable{
	/** �ڋq�A�C�R����`���X�g */
	private List<T09eEntityModel> customerIconDefList;
	/** �ڋq�A�C�R����� */
	private T104EntityModel customerIconInfo;
	/** �]�_��ҍ��v */
	private BigDecimal subcontractorSum;
	/** �S���p�� */
	private static final String fullHalfSpace = "�@ ";


	/**
	 * @return fullhalfspace
	 */
	public static String getFullhalfspace() {
		return fullHalfSpace;
	}

	/**
     * �ڋq�A�C�R����`���X�g�擾
     * @return �ڋq�A�C�R����`���X�g
     */
	public List<T09eEntityModel> getCustomerIconDefList() {
		return customerIconDefList;
	}

    /**
     * �ڋq�A�C�R����`���X�g�ݒ�
     * @param t09List �ڋq�A�C�R����`���X�g
     */
	public void setCustomerIconDefList(List<T09eEntityModel> customerIconDefList) {
		this.customerIconDefList = customerIconDefList;
	}

    /**
     * �ڋq�A�C�R�����擾
     * @return �ڋq�A�C�R�����
     */
	public T104EntityModel getCustomerIconInfo() {
		return customerIconInfo;
	}

    /**
     * �ڋq�A�C�R�����ݒ�
     * @param customerIconInfo �ڋq�A�C�R�����
     */
	public void setCustomerIconInfo(T104EntityModel customerIconInfo) {
		this.customerIconInfo = customerIconInfo;
	}

    /**
     * �]�_��ҍ��v�擾
     * @return �]�_��ҍ��v
     */
	public BigDecimal getSubcontractorSum() {
		return subcontractorSum;
	}

    /**
     * �]�_��ҍ��v�ݒ�
     * @param subcontractorSum �]�_��ҍ��v
     */
	public void setSubcontractorSum(BigDecimal subcontractorSum) {
		this.subcontractorSum = subcontractorSum;
	}

}
