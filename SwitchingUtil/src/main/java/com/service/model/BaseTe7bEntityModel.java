/*
 * @(#)Te7b.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TE7B�X�C�b�`���O�A�g��t���b�Z�[�W�̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * TE7B�X�C�b�`���O�A�g��t���b�Z�[�W
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTe7bEntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h (FK) */
    private String te7b001;
    /** �A�g�ԍ� (FK) */
    private java.math.BigDecimal te7b002;
    /** �A�g�ԍ��A�� (FK) */
    private java.math.BigDecimal te7b003;
    /** �A�g��t���b�Z�[�W�A�� */
    private java.math.BigDecimal te7b004;
    /** ��t���b�Z�[�W�敪 */
    private String te7b101;
    /** ��t���b�Z�[�W */
    private String te7b102;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseTe7bEntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseTe7bEntityModel �R�s�[��TE7B�X�C�b�`���O�A�g��t���b�Z�[�W�G���e�B�e�B���f��
     */
    public BaseTe7bEntityModel(BaseTe7bEntityModel baseTe7bEntityModel) {
        super();
        //�ǃR�[�h (FK)��ݒ肵�܂�
        setTe7b001(baseTe7bEntityModel.getTe7b001());
        //�A�g�ԍ� (FK)��ݒ肵�܂�
        setTe7b002(baseTe7bEntityModel.getTe7b002());
        //�A�g�ԍ��A�� (FK)��ݒ肵�܂�
        setTe7b003(baseTe7bEntityModel.getTe7b003());
        //�A�g��t���b�Z�[�W�A�Ԃ�ݒ肵�܂�
        setTe7b004(baseTe7bEntityModel.getTe7b004());
        //��t���b�Z�[�W�敪��ݒ肵�܂�
        setTe7b101(baseTe7bEntityModel.getTe7b101());
        //��t���b�Z�[�W��ݒ肵�܂�
        setTe7b102(baseTe7bEntityModel.getTe7b102());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseTe7bEntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseTe7bEntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseTe7bEntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseTe7bEntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseTe7bEntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseTe7bEntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseTe7bEntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h (FK)��Ԃ��܂��B
     * @return �ǃR�[�h (FK) ��߂��܂��B
     */
    
    public String getTe7b001() {
        return te7b001;
    }
    
    /**
     * �ǃR�[�h (FK)���Z�b�g���܂��B
     * @param te7b001 �ǃR�[�h (FK) ��ݒ�B
     */
    public void setTe7b001(String te7b001) {
        this.te7b001 = te7b001;
    }
    /**
     * �A�g�ԍ� (FK)��Ԃ��܂��B
     * @return �A�g�ԍ� (FK) ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe7b002() {
        return te7b002;
    }
    
    /**
     * �A�g�ԍ� (FK)���Z�b�g���܂��B
     * @param te7b002 �A�g�ԍ� (FK) ��ݒ�B
     */
    public void setTe7b002(java.math.BigDecimal te7b002) {
        this.te7b002 = te7b002;
    }
    /**
     * �A�g�ԍ��A�� (FK)��Ԃ��܂��B
     * @return �A�g�ԍ��A�� (FK) ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe7b003() {
        return te7b003;
    }
    
    /**
     * �A�g�ԍ��A�� (FK)���Z�b�g���܂��B
     * @param te7b003 �A�g�ԍ��A�� (FK) ��ݒ�B
     */
    public void setTe7b003(java.math.BigDecimal te7b003) {
        this.te7b003 = te7b003;
    }
    /**
     * �A�g��t���b�Z�[�W�A�Ԃ�Ԃ��܂��B
     * @return �A�g��t���b�Z�[�W�A�� ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe7b004() {
        return te7b004;
    }
    
    /**
     * �A�g��t���b�Z�[�W�A�Ԃ��Z�b�g���܂��B
     * @param te7b004 �A�g��t���b�Z�[�W�A�� ��ݒ�B
     */
    public void setTe7b004(java.math.BigDecimal te7b004) {
        this.te7b004 = te7b004;
    }
    /**
     * ��t���b�Z�[�W�敪��Ԃ��܂��B
     * @return ��t���b�Z�[�W�敪 ��߂��܂��B
     */
    
    public String getTe7b101() {
        return te7b101;
    }
    
    /**
     * ��t���b�Z�[�W�敪���Z�b�g���܂��B
     * @param te7b101 ��t���b�Z�[�W�敪 ��ݒ�B
     */
    public void setTe7b101(String te7b101) {
        this.te7b101 = te7b101;
    }
    /**
     * ��t���b�Z�[�W��Ԃ��܂��B
     * @return ��t���b�Z�[�W ��߂��܂��B
     */
    
    public String getTe7b102() {
        return te7b102;
    }
    
    /**
     * ��t���b�Z�[�W���Z�b�g���܂��B
     * @param te7b102 ��t���b�Z�[�W ��ݒ�B
     */
    public void setTe7b102(String te7b102) {
        this.te7b102 = te7b102;
    }
    /**
     * �o�^�҂�Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * �o�^����Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * �X�V�҂�Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * �X�V����Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * �X�VAPP��Ԃ��܂��B
     * @return �X�VAPP ��߂��܂��B
     */
    
    public String getUpdateApp() {
        return updateApp;
    }
    
    /**
     * �X�VAPP���Z�b�g���܂��B
     * @param updateApp �X�VAPP ��ݒ�B
     */
    public void setUpdateApp(String updateApp) {
        this.updateApp = updateApp;
    }
    /**
     * �o�[�W�����ԍ���Ԃ��܂��B
     * @return �o�[�W�����ԍ� ��߂��܂��B
     */
    
    public java.math.BigDecimal getVersionNo() {
        return versionNo;
    }
    
    /**
     * �o�[�W�����ԍ����Z�b�g���܂��B
     * @param versionNo �o�[�W�����ԍ� ��ݒ�B
     */
    public void setVersionNo(java.math.BigDecimal versionNo) {
        this.versionNo = versionNo;
    }

//--- ���[�e�B���e�B���\�b�h

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�̃e�[�u������Ԃ��܂��B
     * @return �e�[�u����
     */
    public String getTableName(){
    	return "TE7B";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getTe7b001()
                    ,getTe7b002()
                    ,getTe7b003()
                    ,getTe7b004()
    	};
    }


    /**
     * TE7B�X�C�b�`���O�A�g��t���b�Z�[�W�G���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return TE7B�X�C�b�`���O�A�g��t���b�Z�[�W�G���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "TE7B�X�C�b�`���O�A�g��t���b�Z�[�W(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h (FK)(te7b001)", getTe7b001())
    		.append("�A�g�ԍ� (FK)(te7b002)", getTe7b002())
    		.append("�A�g�ԍ��A�� (FK)(te7b003)", getTe7b003())
    		.append("�A�g��t���b�Z�[�W�A��(te7b004)", getTe7b004())
    		.append("��t���b�Z�[�W�敪(te7b101)", getTe7b101())
    		.append("��t���b�Z�[�W(te7b102)", getTe7b102())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
