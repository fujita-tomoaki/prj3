/*
 * @(#)Te79.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TE79�X�C�b�`���O�A�g�Ǘ��̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * TE79�X�C�b�`���O�A�g�Ǘ�
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTe79EntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h */
    private String te79001;
    /** �A�g�ԍ� */
    private java.math.BigDecimal te79002;
    /** �A�g�ԍ��A�� */
    private java.math.BigDecimal te79003;
    /** �A�g�v������ */
    private java.sql.Timestamp te79101;
    /** ������ */
    private java.math.BigDecimal te79102;
    /** �T�[�r�XID */
    private String te79103;
    /** �ڋq�R�[�h */
    private String te79104;
    /** �A�� */
    private java.math.BigDecimal te79105;
    /** �X�V�t���O */
    private java.math.BigDecimal te79106;
    /** �\����� */
    private String te79107;
    /** �A�g���� */
    private java.sql.Timestamp te79201;
    /** �ʐM���� */
    private java.math.BigDecimal te79202;
    /** �ʐM�X�e�[�^�X */
    private String te79203;
    /** �T�[�r�X���� */
    private java.math.BigDecimal te79301;
    /** �T�[�r�X�G���[���R */
    private String te79302;
    /** �A�g���� */
    private String te79401;
    /** �A�g�G���[���R */
    private String te79402;
    /** �\���ԍ� */
    private String te79501;
    /** �p�~�掟�ԍ� */
    private String te79601;
    /** ���A������ */
    private String te79701;
    /** �D��x */
    private java.math.BigDecimal te79801;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseTe79EntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseTe79EntityModel �R�s�[��TE79�X�C�b�`���O�A�g�Ǘ��G���e�B�e�B���f��
     */
    public BaseTe79EntityModel(BaseTe79EntityModel baseTe79EntityModel) {
        super();
        //�ǃR�[�h��ݒ肵�܂�
        setTe79001(baseTe79EntityModel.getTe79001());
        //�A�g�ԍ���ݒ肵�܂�
        setTe79002(baseTe79EntityModel.getTe79002());
        //�A�g�ԍ��A�Ԃ�ݒ肵�܂�
        setTe79003(baseTe79EntityModel.getTe79003());
        //�A�g�v��������ݒ肵�܂�
        setTe79101(baseTe79EntityModel.getTe79101());
        //�����󋵂�ݒ肵�܂�
        setTe79102(baseTe79EntityModel.getTe79102());
        //�T�[�r�XID��ݒ肵�܂�
        setTe79103(baseTe79EntityModel.getTe79103());
        //�ڋq�R�[�h��ݒ肵�܂�
        setTe79104(baseTe79EntityModel.getTe79104());
        //�A�Ԃ�ݒ肵�܂�
        setTe79105(baseTe79EntityModel.getTe79105());
        //�X�V�t���O��ݒ肵�܂�
        setTe79106(baseTe79EntityModel.getTe79106());
        //�\����ʂ�ݒ肵�܂�
        setTe79107(baseTe79EntityModel.getTe79107());
        //�A�g������ݒ肵�܂�
        setTe79201(baseTe79EntityModel.getTe79201());
        //�ʐM���ʂ�ݒ肵�܂�
        setTe79202(baseTe79EntityModel.getTe79202());
        //�ʐM�X�e�[�^�X��ݒ肵�܂�
        setTe79203(baseTe79EntityModel.getTe79203());
        //�T�[�r�X���ʂ�ݒ肵�܂�
        setTe79301(baseTe79EntityModel.getTe79301());
        //�T�[�r�X�G���[���R��ݒ肵�܂�
        setTe79302(baseTe79EntityModel.getTe79302());
        //�A�g���ʂ�ݒ肵�܂�
        setTe79401(baseTe79EntityModel.getTe79401());
        //�A�g�G���[���R��ݒ肵�܂�
        setTe79402(baseTe79EntityModel.getTe79402());
        //�\���ԍ���ݒ肵�܂�
        setTe79501(baseTe79EntityModel.getTe79501());
        //�p�~�掟�ԍ���ݒ肵�܂�
        setTe79601(baseTe79EntityModel.getTe79601());
        //���A��������ݒ肵�܂�
        setTe79701(baseTe79EntityModel.getTe79701());
        //�D��x��ݒ肵�܂�
        setTe79801(baseTe79EntityModel.getTe79801());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseTe79EntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseTe79EntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseTe79EntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseTe79EntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseTe79EntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseTe79EntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseTe79EntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h��Ԃ��܂��B
     * @return �ǃR�[�h ��߂��܂��B
     */
    
    public String getTe79001() {
        return te79001;
    }
    
    /**
     * �ǃR�[�h���Z�b�g���܂��B
     * @param te79001 �ǃR�[�h ��ݒ�B
     */
    public void setTe79001(String te79001) {
        this.te79001 = te79001;
    }
    /**
     * �A�g�ԍ���Ԃ��܂��B
     * @return �A�g�ԍ� ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79002() {
        return te79002;
    }
    
    /**
     * �A�g�ԍ����Z�b�g���܂��B
     * �f�[�^��V�K�ɑ}������ꍇ�́A�V�[�P���XNo�ɂ���Ď����I�ɒl����������܂��̂Ŗ����I�ɃZ�b�g����K�v�͂���܂���B
     * �f�[�^���X�V����ꍇ�͂��̃t�B�[���h�͍X�V�ɉe�����܂���B
     * @param te79002 �A�g�ԍ� ��ݒ�B
     */
    public void setTe79002(java.math.BigDecimal te79002) {
        this.te79002 = te79002;
    }
    /**
     * �A�g�ԍ��A�Ԃ�Ԃ��܂��B
     * @return �A�g�ԍ��A�� ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79003() {
        return te79003;
    }
    
    /**
     * �A�g�ԍ��A�Ԃ��Z�b�g���܂��B
     * @param te79003 �A�g�ԍ��A�� ��ݒ�B
     */
    public void setTe79003(java.math.BigDecimal te79003) {
        this.te79003 = te79003;
    }
    /**
     * �A�g�v��������Ԃ��܂��B
     * @return �A�g�v������ ��߂��܂��B
     */
    
    public java.sql.Timestamp getTe79101() {
        return te79101;
    }
    
    /**
     * �A�g�v���������Z�b�g���܂��B
     * @param te79101 �A�g�v������ ��ݒ�B
     */
    public void setTe79101(java.sql.Timestamp te79101) {
        this.te79101 = te79101;
    }
    /**
     * �����󋵂�Ԃ��܂��B
     * @return ������ ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79102() {
        return te79102;
    }
    
    /**
     * �����󋵂��Z�b�g���܂��B
     * @param te79102 ������ ��ݒ�B
     */
    public void setTe79102(java.math.BigDecimal te79102) {
        this.te79102 = te79102;
    }
    /**
     * �T�[�r�XID��Ԃ��܂��B
     * @return �T�[�r�XID ��߂��܂��B
     */
    
    public String getTe79103() {
        return te79103;
    }
    
    /**
     * �T�[�r�XID���Z�b�g���܂��B
     * @param te79103 �T�[�r�XID ��ݒ�B
     */
    public void setTe79103(String te79103) {
        this.te79103 = te79103;
    }
    /**
     * �ڋq�R�[�h��Ԃ��܂��B
     * @return �ڋq�R�[�h ��߂��܂��B
     */
    
    public String getTe79104() {
        return te79104;
    }
    
    /**
     * �ڋq�R�[�h���Z�b�g���܂��B
     * @param te79104 �ڋq�R�[�h ��ݒ�B
     */
    public void setTe79104(String te79104) {
        this.te79104 = te79104;
    }
    /**
     * �A�Ԃ�Ԃ��܂��B
     * @return �A�� ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79105() {
        return te79105;
    }
    
    /**
     * �A�Ԃ��Z�b�g���܂��B
     * @param te79105 �A�� ��ݒ�B
     */
    public void setTe79105(java.math.BigDecimal te79105) {
        this.te79105 = te79105;
    }
    /**
     * �X�V�t���O��Ԃ��܂��B
     * @return �X�V�t���O ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79106() {
        return te79106;
    }
    
    /**
     * �X�V�t���O���Z�b�g���܂��B
     * @param te79106 �X�V�t���O ��ݒ�B
     */
    public void setTe79106(java.math.BigDecimal te79106) {
        this.te79106 = te79106;
    }
    /**
     * �\����ʂ�Ԃ��܂��B
     * @return �\����� ��߂��܂��B
     */
    
    public String getTe79107() {
        return te79107;
    }
    
    /**
     * �\����ʂ��Z�b�g���܂��B
     * @param te79107 �\����� ��ݒ�B
     */
    public void setTe79107(String te79107) {
        this.te79107 = te79107;
    }
    /**
     * �A�g������Ԃ��܂��B
     * @return �A�g���� ��߂��܂��B
     */
    
    public java.sql.Timestamp getTe79201() {
        return te79201;
    }
    
    /**
     * �A�g�������Z�b�g���܂��B
     * @param te79201 �A�g���� ��ݒ�B
     */
    public void setTe79201(java.sql.Timestamp te79201) {
        this.te79201 = te79201;
    }
    /**
     * �ʐM���ʂ�Ԃ��܂��B
     * @return �ʐM���� ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79202() {
        return te79202;
    }
    
    /**
     * �ʐM���ʂ��Z�b�g���܂��B
     * @param te79202 �ʐM���� ��ݒ�B
     */
    public void setTe79202(java.math.BigDecimal te79202) {
        this.te79202 = te79202;
    }
    /**
     * �ʐM�X�e�[�^�X��Ԃ��܂��B
     * @return �ʐM�X�e�[�^�X ��߂��܂��B
     */
    
    public String getTe79203() {
        return te79203;
    }
    
    /**
     * �ʐM�X�e�[�^�X���Z�b�g���܂��B
     * @param te79203 �ʐM�X�e�[�^�X ��ݒ�B
     */
    public void setTe79203(String te79203) {
        this.te79203 = te79203;
    }
    /**
     * �T�[�r�X���ʂ�Ԃ��܂��B
     * @return �T�[�r�X���� ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79301() {
        return te79301;
    }
    
    /**
     * �T�[�r�X���ʂ��Z�b�g���܂��B
     * @param te79301 �T�[�r�X���� ��ݒ�B
     */
    public void setTe79301(java.math.BigDecimal te79301) {
        this.te79301 = te79301;
    }
    /**
     * �T�[�r�X�G���[���R��Ԃ��܂��B
     * @return �T�[�r�X�G���[���R ��߂��܂��B
     */
    
    public String getTe79302() {
        return te79302;
    }
    
    /**
     * �T�[�r�X�G���[���R���Z�b�g���܂��B
     * @param te79302 �T�[�r�X�G���[���R ��ݒ�B
     */
    public void setTe79302(String te79302) {
        this.te79302 = te79302;
    }
    /**
     * �A�g���ʂ�Ԃ��܂��B
     * @return �A�g���� ��߂��܂��B
     */
    
    public String getTe79401() {
        return te79401;
    }
    
    /**
     * �A�g���ʂ��Z�b�g���܂��B
     * @param te79401 �A�g���� ��ݒ�B
     */
    public void setTe79401(String te79401) {
        this.te79401 = te79401;
    }
    /**
     * �A�g�G���[���R��Ԃ��܂��B
     * @return �A�g�G���[���R ��߂��܂��B
     */
    
    public String getTe79402() {
        return te79402;
    }
    
    /**
     * �A�g�G���[���R���Z�b�g���܂��B
     * @param te79402 �A�g�G���[���R ��ݒ�B
     */
    public void setTe79402(String te79402) {
        this.te79402 = te79402;
    }
    /**
     * �\���ԍ���Ԃ��܂��B
     * @return �\���ԍ� ��߂��܂��B
     */
    
    public String getTe79501() {
        return te79501;
    }
    
    /**
     * �\���ԍ����Z�b�g���܂��B
     * @param te79501 �\���ԍ� ��ݒ�B
     */
    public void setTe79501(String te79501) {
        this.te79501 = te79501;
    }
    /**
     * �p�~�掟�ԍ���Ԃ��܂��B
     * @return �p�~�掟�ԍ� ��߂��܂��B
     */
    
    public String getTe79601() {
        return te79601;
    }
    
    /**
     * �p�~�掟�ԍ����Z�b�g���܂��B
     * @param te79601 �p�~�掟�ԍ� ��ݒ�B
     */
    public void setTe79601(String te79601) {
        this.te79601 = te79601;
    }
    /**
     * ���A��������Ԃ��܂��B
     * @return ���A������ ��߂��܂��B
     */
    
    public String getTe79701() {
        return te79701;
    }
    
    /**
     * ���A���������Z�b�g���܂��B
     * @param te79701 ���A������ ��ݒ�B
     */
    public void setTe79701(String te79701) {
        this.te79701 = te79701;
    }
    /**
     * �D��x��Ԃ��܂��B
     * @return �D��x ��߂��܂��B
     */
    
    public java.math.BigDecimal getTe79801() {
        return te79801;
    }
    
    /**
     * �D��x���Z�b�g���܂��B
     * @param te79801 �D��x ��ݒ�B
     */
    public void setTe79801(java.math.BigDecimal te79801) {
        this.te79801 = te79801;
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
    	return "TE79";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getTe79001()
                    ,getTe79002()
                    ,getTe79003()
    	};
    }


    /**
     * TE79�X�C�b�`���O�A�g�Ǘ��G���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return TE79�X�C�b�`���O�A�g�Ǘ��G���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "TE79�X�C�b�`���O�A�g�Ǘ�(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h(te79001)", getTe79001())
    		.append("�A�g�ԍ�(te79002)", getTe79002())
    		.append("�A�g�ԍ��A��(te79003)", getTe79003())
    		.append("�A�g�v������(te79101)", getTe79101())
    		.append("������(te79102)", getTe79102())
    		.append("�T�[�r�XID(te79103)", getTe79103())
    		.append("�ڋq�R�[�h(te79104)", getTe79104())
    		.append("�A��(te79105)", getTe79105())
    		.append("�X�V�t���O(te79106)", getTe79106())
    		.append("�\�����(te79107)", getTe79107())
    		.append("�A�g����(te79201)", getTe79201())
    		.append("�ʐM����(te79202)", getTe79202())
    		.append("�ʐM�X�e�[�^�X(te79203)", getTe79203())
    		.append("�T�[�r�X����(te79301)", getTe79301())
    		.append("�T�[�r�X�G���[���R(te79302)", getTe79302())
    		.append("�A�g����(te79401)", getTe79401())
    		.append("�A�g�G���[���R(te79402)", getTe79402())
    		.append("�\���ԍ�(te79501)", getTe79501())
    		.append("�p�~�掟�ԍ�(te79601)", getTe79601())
    		.append("���A������(te79701)", getTe79701())
    		.append("�D��x(te79801)", getTe79801())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
