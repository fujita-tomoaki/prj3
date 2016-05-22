package com.service.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * EntityModel�̃X�[�p�[�N���X
 * 
 * �f�[�^�x�[�X����擾����EntityModel��isPersist��true������܂�
 * new �ɂ���Đ������ꂽEntityModel�ꍇ��isPersist��false�ł�
 * 
 * EnttiyDao��saveOrUpdate���\�b�h��isPersist�v���p�e�B��true��
 * �ꍇ�͍X�V�����Afalse�̏ꍇ�͑}���������s���܂�
 * 
 * @author yamada
 */
public abstract class EntityModel implements java.io.Serializable{
	/** DB�ɕۑ�����Ă���f�[�^���ǂ����̃t���O�@�ۑ�����Ă���:true */
	private boolean isPersist;
    /** �o�^�� */
    private String creator;
    /** �o�^�� */
    private Timestamp createTimestamp;
    /** �X�V�� */
    private String updater;
    /** �X�V�� */
    private Timestamp updateTimestamp;
//    /** �o�[�W�����ԍ� */
//    private java.math.BigDecimal versionNo = BigDecimal.ZERO;
    /** �폜�t���O */
    private java.math.BigDecimal deleteFlg = BigDecimal.ZERO;
    /** ��������(0: �������A1�ȏ�F��������) */
    private java.math.BigDecimal limit = BigDecimal.ZERO;

	/**
	 * ��������(0: �������A1�ȏ�F��������)�擾
	 * @return deleteFlg
	 */
	public java.math.BigDecimal getLimit() {
		return limit;
	}

	/**
	 * ��������(0: �������A1�ȏ�F��������)�ݒ�
	 * @param limit
	 */
	public void setLimit(java.math.BigDecimal limit) {
		this.limit = limit;
	}

	/**
	 * �폜�t���O�擾
	 * @return deleteFlg
	 */
	public java.math.BigDecimal getDeleteFlg() {
		return deleteFlg;
	}

	/**
	 * �폜�t���O�ݒ�
	 * @param deleteFlg
	 */
	public void setDeleteFlg(java.math.BigDecimal deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
    
	/**
	 * DB�ɕۑ�����Ă���f�[�^���ǂ����̃t���O���擾���܂�
	 * @return DB�ɕۑ�����Ă���f�[�^:true
	 */
	public boolean isPersist() {
		return isPersist;
	}

	/**
	 * DB�ɕۑ�����Ă���f�[�^���ǂ����̃t���O��ݒ肵�܂�
	 * @param isPersist DB�ɕۑ�����Ă���f�[�^:true
	 */
	public void setPersist(boolean isPersist) {
		this.isPersist = isPersist;
	}

    /**
     * �o�^�҂�Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    public String getCreator() {
        return creator;
    }
    
    /**
     * �o�^�҂��Z�b�g���܂��B
     * @param creator �o�^�� ��ݒ�B
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    /**
     * �o�^����Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    public Timestamp getCreateTimestamp() {
        return createTimestamp;
    }
    
    /**
     * �o�^�����Z�b�g���܂��B
     * �f�[�^��V�K�ɑ}������ꍇ�́A�����I�ɐ�������܂��̂Ŗ����I�ɃZ�b�g����K�v�͂���܂���B
     * �f�[�^���X�V����ꍇ�͂��̃t�B�[���h�͍X�V�ɉe�����܂���B
     * @param createTimestamp �o�^�� ��ݒ�B
     */
    public void setCreateTimestamp(Timestamp createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
    
    /**
     * �X�V�҂�Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    public String getUpdater() {
        return updater;
    }
    
    /**
     * �X�V�҂��Z�b�g���܂��B
     * @param updater �X�V�� ��ݒ�B
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }
    
    /**
     * �X�V����Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    public Timestamp getUpdateTimestamp() {
        return updateTimestamp;
    }
    
    /**
     * �X�V�����Z�b�g���܂��B
     * �f�[�^��V�K�ɑ}���A�X�V����ꍇ�́A�����I�ɐ�������܂��̂Ŗ����I�ɃZ�b�g����K�v�͂���܂���B
     * @param updateTimestamp �X�V�� ��ݒ�B
     */
    public void setUpdateTimestamp(Timestamp updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
    
//    /**
//     * �o�[�W�����ԍ���Ԃ��܂��B
//     * @return �o�[�W�����ԍ� ��߂��܂��B
//     */
//    public java.math.BigDecimal getVersionNo() {
//        return versionNo;
//    }
//    
//    /**
//     * �o�[�W�����ԍ����Z�b�g���܂��B
//     * �f�[�^��V�K�ɑ}���A�X�V����ꍇ�́A�����I�ɐ�������܂��̂Ŗ����I�ɃZ�b�g����K�v�͂���܂���B
//     * @param versionNo �o�[�W�����ԍ� ��ݒ�B
//     */
//    public void setVersionNo(java.math.BigDecimal versionNo) {
//        this.versionNo = versionNo;
//    }
//
//  --- ���[�e�B���e�B���\�b�h

      /**
       * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�̃e�[�u������Ԃ��܂��B
       * @return �e�[�u����
       */
      abstract public String getTableName();

      /**
       * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
       * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
       */
      abstract public Object[] getPrimaryKeyValues();

}
