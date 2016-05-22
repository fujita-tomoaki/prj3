/*
 * @(#)T105.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * T105�ڋq�Z���̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * T105�ڋq�Z��
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT105EntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h */
    private String t105001;
    /** �ڋq�R�[�h */
    private String t105002;
    /** �敪 */
    private java.math.BigDecimal t105003;
    /** �敪�A�� */
    private java.math.BigDecimal t105004;
    /** �ڋq��� */
    private java.math.BigDecimal t105101;
    /** �_��҃R�[�h */
    private String t105102;
    /** �����敪 */
    private java.math.BigDecimal t105103;
    /** �J�i���� */
    private String t105201;
    /** ���������P */
    private String t105202;
    /** ���������Q */
    private String t105203;
    /** �h�� */
    private String t105204;
    /** ���������R */
    private String t105205;
    /** �X�֔ԍ� */
    private String t105301;
    /** �Z���P */
    private String t105302;
    /** �Z���Q */
    private String t105303;
    /** ���� */
    private String t105304;
    /** �Ԓn */
    private String t105305;
    /** �� */
    private String t105306;
    /** �� */
    private String t105307;
    /** �����ԍ� */
    private String t105308;
    /** �W���Z��R�[�h */
    private String t105309;
    /** �W���Z� */
    private String t105310;
    /** �s�d�k�P */
    private String t105311;
    /** �s�d�k�Q */
    private String t105312;
    /** �e�`�w */
    private String t105313;
    /** ���[�� */
    private String t105314;
    /** �s�d�k�R */
    private String t105315;
    /** ���[���Q */
    private String t105316;
    /** ���l */
    private String t105401;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseT105EntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseT105EntityModel �R�s�[��T105�ڋq�Z���G���e�B�e�B���f��
     */
    public BaseT105EntityModel(BaseT105EntityModel baseT105EntityModel) {
        super();
        //�ǃR�[�h��ݒ肵�܂�
        setT105001(baseT105EntityModel.getT105001());
        //�ڋq�R�[�h��ݒ肵�܂�
        setT105002(baseT105EntityModel.getT105002());
        //�敪��ݒ肵�܂�
        setT105003(baseT105EntityModel.getT105003());
        //�敪�A�Ԃ�ݒ肵�܂�
        setT105004(baseT105EntityModel.getT105004());
        //�ڋq��Ԃ�ݒ肵�܂�
        setT105101(baseT105EntityModel.getT105101());
        //�_��҃R�[�h��ݒ肵�܂�
        setT105102(baseT105EntityModel.getT105102());
        //�����敪��ݒ肵�܂�
        setT105103(baseT105EntityModel.getT105103());
        //�J�i������ݒ肵�܂�
        setT105201(baseT105EntityModel.getT105201());
        //���������P��ݒ肵�܂�
        setT105202(baseT105EntityModel.getT105202());
        //���������Q��ݒ肵�܂�
        setT105203(baseT105EntityModel.getT105203());
        //�h�̂�ݒ肵�܂�
        setT105204(baseT105EntityModel.getT105204());
        //���������R��ݒ肵�܂�
        setT105205(baseT105EntityModel.getT105205());
        //�X�֔ԍ���ݒ肵�܂�
        setT105301(baseT105EntityModel.getT105301());
        //�Z���P��ݒ肵�܂�
        setT105302(baseT105EntityModel.getT105302());
        //�Z���Q��ݒ肵�܂�
        setT105303(baseT105EntityModel.getT105303());
        //���ڂ�ݒ肵�܂�
        setT105304(baseT105EntityModel.getT105304());
        //�Ԓn��ݒ肵�܂�
        setT105305(baseT105EntityModel.getT105305());
        //����ݒ肵�܂�
        setT105306(baseT105EntityModel.getT105306());
        //����ݒ肵�܂�
        setT105307(baseT105EntityModel.getT105307());
        //�����ԍ���ݒ肵�܂�
        setT105308(baseT105EntityModel.getT105308());
        //�W���Z��R�[�h��ݒ肵�܂�
        setT105309(baseT105EntityModel.getT105309());
        //�W���Z���ݒ肵�܂�
        setT105310(baseT105EntityModel.getT105310());
        //�s�d�k�P��ݒ肵�܂�
        setT105311(baseT105EntityModel.getT105311());
        //�s�d�k�Q��ݒ肵�܂�
        setT105312(baseT105EntityModel.getT105312());
        //�e�`�w��ݒ肵�܂�
        setT105313(baseT105EntityModel.getT105313());
        //���[����ݒ肵�܂�
        setT105314(baseT105EntityModel.getT105314());
        //�s�d�k�R��ݒ肵�܂�
        setT105315(baseT105EntityModel.getT105315());
        //���[���Q��ݒ肵�܂�
        setT105316(baseT105EntityModel.getT105316());
        //���l��ݒ肵�܂�
        setT105401(baseT105EntityModel.getT105401());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseT105EntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseT105EntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseT105EntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseT105EntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseT105EntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseT105EntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseT105EntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h��Ԃ��܂��B
     * @return �ǃR�[�h ��߂��܂��B
     */
    public String getT105001() {
        return t105001;
    }
    
    /**
     * �ǃR�[�h���Z�b�g���܂��B
     * @param t105001 �ǃR�[�h ��ݒ�B
     */
    public void setT105001(String t105001) {
        this.t105001 = t105001;
    }
    /**
     * �ڋq�R�[�h��Ԃ��܂��B
     * @return �ڋq�R�[�h ��߂��܂��B
     */
    public String getT105002() {
        return t105002;
    }
    
    /**
     * �ڋq�R�[�h���Z�b�g���܂��B
     * @param t105002 �ڋq�R�[�h ��ݒ�B
     */
    public void setT105002(String t105002) {
        this.t105002 = t105002;
    }
    /**
     * �敪��Ԃ��܂��B
     * @return �敪 ��߂��܂��B
     */
    public java.math.BigDecimal getT105003() {
        return t105003;
    }
    
    /**
     * �敪���Z�b�g���܂��B
     * @param t105003 �敪 ��ݒ�B
     */
    public void setT105003(java.math.BigDecimal t105003) {
        this.t105003 = t105003;
    }
    /**
     * �敪�A�Ԃ�Ԃ��܂��B
     * @return �敪�A�� ��߂��܂��B
     */
    public java.math.BigDecimal getT105004() {
        return t105004;
    }
    
    /**
     * �敪�A�Ԃ��Z�b�g���܂��B
     * @param t105004 �敪�A�� ��ݒ�B
     */
    public void setT105004(java.math.BigDecimal t105004) {
        this.t105004 = t105004;
    }
    /**
     * �ڋq��Ԃ�Ԃ��܂��B
     * @return �ڋq��� ��߂��܂��B
     */
    public java.math.BigDecimal getT105101() {
        return t105101;
    }
    
    /**
     * �ڋq��Ԃ��Z�b�g���܂��B
     * @param t105101 �ڋq��� ��ݒ�B
     */
    public void setT105101(java.math.BigDecimal t105101) {
        this.t105101 = t105101;
    }
    /**
     * �_��҃R�[�h��Ԃ��܂��B
     * @return �_��҃R�[�h ��߂��܂��B
     */
    public String getT105102() {
        return t105102;
    }
    
    /**
     * �_��҃R�[�h���Z�b�g���܂��B
     * @param t105102 �_��҃R�[�h ��ݒ�B
     */
    public void setT105102(String t105102) {
        this.t105102 = t105102;
    }
    /**
     * �����敪��Ԃ��܂��B
     * @return �����敪 ��߂��܂��B
     */
    public java.math.BigDecimal getT105103() {
        return t105103;
    }
    
    /**
     * �����敪���Z�b�g���܂��B
     * @param t105103 �����敪 ��ݒ�B
     */
    public void setT105103(java.math.BigDecimal t105103) {
        this.t105103 = t105103;
    }
    /**
     * �J�i������Ԃ��܂��B
     * @return �J�i���� ��߂��܂��B
     */
    public String getT105201() {
        return t105201;
    }
    
    /**
     * �J�i�������Z�b�g���܂��B
     * @param t105201 �J�i���� ��ݒ�B
     */
    public void setT105201(String t105201) {
        this.t105201 = t105201;
    }
    /**
     * ���������P��Ԃ��܂��B
     * @return ���������P ��߂��܂��B
     */
    public String getT105202() {
        return t105202;
    }
    
    /**
     * ���������P���Z�b�g���܂��B
     * @param t105202 ���������P ��ݒ�B
     */
    public void setT105202(String t105202) {
        this.t105202 = t105202;
    }
    /**
     * ���������Q��Ԃ��܂��B
     * @return ���������Q ��߂��܂��B
     */
    public String getT105203() {
        return t105203;
    }
    
    /**
     * ���������Q���Z�b�g���܂��B
     * @param t105203 ���������Q ��ݒ�B
     */
    public void setT105203(String t105203) {
        this.t105203 = t105203;
    }
    /**
     * �h�̂�Ԃ��܂��B
     * @return �h�� ��߂��܂��B
     */
    public String getT105204() {
        return t105204;
    }
    
    /**
     * �h�̂��Z�b�g���܂��B
     * @param t105204 �h�� ��ݒ�B
     */
    public void setT105204(String t105204) {
        this.t105204 = t105204;
    }
    /**
     * ���������R��Ԃ��܂��B
     * @return ���������R ��߂��܂��B
     */
    public String getT105205() {
        return t105205;
    }
    
    /**
     * ���������R���Z�b�g���܂��B
     * @param t105205 ���������R ��ݒ�B
     */
    public void setT105205(String t105205) {
        this.t105205 = t105205;
    }
    /**
     * �X�֔ԍ���Ԃ��܂��B
     * @return �X�֔ԍ� ��߂��܂��B
     */
    public String getT105301() {
        return t105301;
    }
    
    /**
     * �X�֔ԍ����Z�b�g���܂��B
     * @param t105301 �X�֔ԍ� ��ݒ�B
     */
    public void setT105301(String t105301) {
        this.t105301 = t105301;
    }
    /**
     * �Z���P��Ԃ��܂��B
     * @return �Z���P ��߂��܂��B
     */
    public String getT105302() {
        return t105302;
    }
    
    /**
     * �Z���P���Z�b�g���܂��B
     * @param t105302 �Z���P ��ݒ�B
     */
    public void setT105302(String t105302) {
        this.t105302 = t105302;
    }
    /**
     * �Z���Q��Ԃ��܂��B
     * @return �Z���Q ��߂��܂��B
     */
    public String getT105303() {
        return t105303;
    }
    
    /**
     * �Z���Q���Z�b�g���܂��B
     * @param t105303 �Z���Q ��ݒ�B
     */
    public void setT105303(String t105303) {
        this.t105303 = t105303;
    }
    /**
     * ���ڂ�Ԃ��܂��B
     * @return ���� ��߂��܂��B
     */
    public String getT105304() {
        return t105304;
    }
    
    /**
     * ���ڂ��Z�b�g���܂��B
     * @param t105304 ���� ��ݒ�B
     */
    public void setT105304(String t105304) {
        this.t105304 = t105304;
    }
    /**
     * �Ԓn��Ԃ��܂��B
     * @return �Ԓn ��߂��܂��B
     */
    public String getT105305() {
        return t105305;
    }
    
    /**
     * �Ԓn���Z�b�g���܂��B
     * @param t105305 �Ԓn ��ݒ�B
     */
    public void setT105305(String t105305) {
        this.t105305 = t105305;
    }
    /**
     * ����Ԃ��܂��B
     * @return �� ��߂��܂��B
     */
    
    public String getT105306() {
        return t105306;
    }
    
    /**
     * �����Z�b�g���܂��B
     * @param t105306 �� ��ݒ�B
     */
    public void setT105306(String t105306) {
        this.t105306 = t105306;
    }
    /**
     * ����Ԃ��܂��B
     * @return �� ��߂��܂��B
     */
    
    public String getT105307() {
        return t105307;
    }
    
    /**
     * �����Z�b�g���܂��B
     * @param t105307 �� ��ݒ�B
     */
    public void setT105307(String t105307) {
        this.t105307 = t105307;
    }
    /**
     * �����ԍ���Ԃ��܂��B
     * @return �����ԍ� ��߂��܂��B
     */
    
    public String getT105308() {
        return t105308;
    }
    
    /**
     * �����ԍ����Z�b�g���܂��B
     * @param t105308 �����ԍ� ��ݒ�B
     */
    public void setT105308(String t105308) {
        this.t105308 = t105308;
    }
    /**
     * �W���Z��R�[�h��Ԃ��܂��B
     * @return �W���Z��R�[�h ��߂��܂��B
     */
    
    public String getT105309() {
        return t105309;
    }
    
    /**
     * �W���Z��R�[�h���Z�b�g���܂��B
     * @param t105309 �W���Z��R�[�h ��ݒ�B
     */
    public void setT105309(String t105309) {
        this.t105309 = t105309;
    }
    /**
     * �W���Z���Ԃ��܂��B
     * @return �W���Z� ��߂��܂��B
     */
    
    public String getT105310() {
        return t105310;
    }
    
    /**
     * �W���Z����Z�b�g���܂��B
     * @param t105310 �W���Z� ��ݒ�B
     */
    public void setT105310(String t105310) {
        this.t105310 = t105310;
    }
    /**
     * �s�d�k�P��Ԃ��܂��B
     * @return �s�d�k�P ��߂��܂��B
     */
    
    public String getT105311() {
        return t105311;
    }
    
    /**
     * �s�d�k�P���Z�b�g���܂��B
     * @param t105311 �s�d�k�P ��ݒ�B
     */
    public void setT105311(String t105311) {
        this.t105311 = t105311;
    }
    /**
     * �s�d�k�Q��Ԃ��܂��B
     * @return �s�d�k�Q ��߂��܂��B
     */
    
    public String getT105312() {
        return t105312;
    }
    
    /**
     * �s�d�k�Q���Z�b�g���܂��B
     * @param t105312 �s�d�k�Q ��ݒ�B
     */
    public void setT105312(String t105312) {
        this.t105312 = t105312;
    }
    /**
     * �e�`�w��Ԃ��܂��B
     * @return �e�`�w ��߂��܂��B
     */
    
    public String getT105313() {
        return t105313;
    }
    
    /**
     * �e�`�w���Z�b�g���܂��B
     * @param t105313 �e�`�w ��ݒ�B
     */
    public void setT105313(String t105313) {
        this.t105313 = t105313;
    }
    /**
     * ���[����Ԃ��܂��B
     * @return ���[�� ��߂��܂��B
     */
    
    public String getT105314() {
        return t105314;
    }
    
    /**
     * ���[�����Z�b�g���܂��B
     * @param t105314 ���[�� ��ݒ�B
     */
    public void setT105314(String t105314) {
        this.t105314 = t105314;
    }
    /**
     * �s�d�k�R��Ԃ��܂��B
     * @return �s�d�k�R ��߂��܂��B
     */
    
    public String getT105315() {
        return t105315;
    }
    
    /**
     * �s�d�k�R���Z�b�g���܂��B
     * @param t105315 �s�d�k�R ��ݒ�B
     */
    public void setT105315(String t105315) {
        this.t105315 = t105315;
    }
    /**
     * ���[���Q��Ԃ��܂��B
     * @return ���[���Q ��߂��܂��B
     */
    
    public String getT105316() {
        return t105316;
    }
    
    /**
     * ���[���Q���Z�b�g���܂��B
     * @param t105316 ���[���Q ��ݒ�B
     */
    public void setT105316(String t105316) {
        this.t105316 = t105316;
    }
    /**
     * ���l��Ԃ��܂��B
     * @return ���l ��߂��܂��B
     */
    
    public String getT105401() {
        return t105401;
    }
    
    /**
     * ���l���Z�b�g���܂��B
     * @param t105401 ���l ��ݒ�B
     */
    public void setT105401(String t105401) {
        this.t105401 = t105401;
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
    	return "T105";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT105001()
                    ,getT105002()
                    ,getT105003()
                    ,getT105004()
    	};
    }


    /**
     * T105�ڋq�Z���G���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return T105�ڋq�Z���G���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "T105�ڋq�Z��(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h(t105001)", getT105001())
    		.append("�ڋq�R�[�h(t105002)", getT105002())
    		.append("�敪(t105003)", getT105003())
    		.append("�敪�A��(t105004)", getT105004())
    		.append("�ڋq���(t105101)", getT105101())
    		.append("�_��҃R�[�h(t105102)", getT105102())
    		.append("�����敪(t105103)", getT105103())
    		.append("�J�i����(t105201)", getT105201())
    		.append("���������P(t105202)", getT105202())
    		.append("���������Q(t105203)", getT105203())
    		.append("�h��(t105204)", getT105204())
    		.append("���������R(t105205)", getT105205())
    		.append("�X�֔ԍ�(t105301)", getT105301())
    		.append("�Z���P(t105302)", getT105302())
    		.append("�Z���Q(t105303)", getT105303())
    		.append("����(t105304)", getT105304())
    		.append("�Ԓn(t105305)", getT105305())
    		.append("��(t105306)", getT105306())
    		.append("��(t105307)", getT105307())
    		.append("�����ԍ�(t105308)", getT105308())
    		.append("�W���Z��R�[�h(t105309)", getT105309())
    		.append("�W���Z�(t105310)", getT105310())
    		.append("�s�d�k�P(t105311)", getT105311())
    		.append("�s�d�k�Q(t105312)", getT105312())
    		.append("�e�`�w(t105313)", getT105313())
    		.append("���[��(t105314)", getT105314())
    		.append("�s�d�k�R(t105315)", getT105315())
    		.append("���[���Q(t105316)", getT105316())
    		.append("���l(t105401)", getT105401())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
