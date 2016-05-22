/*
 * @(#)T0a9.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */

package com.service.model;

import java.io.Serializable;

//import jp.co.hanshin.itec.caty.util.model.EntityModel;
//import jp.co.hanshin.itec.caty.util.model.LogInfo;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * T0A9�t�@�C���Ǘ��̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * T0A8�G�N�Z���e���v���[�g����SQL
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT0a9EntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h */
    private String t0a9001;
    /** �A�� */
    private java.math.BigDecimal t0a9002;
    /** �Ǘ��敪 */
    private java.math.BigDecimal t0a9101;
    /** �C�Ӑݒ�KEY1 */
    private String t0a9102;
    /** �C�Ӑݒ�KEY2 */
    private String t0a9103;
    /** �t�@�C���� */
    private String t0a9201;
    /** �f�[�^ */
    private java.io.File t0a9202;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseT0a9EntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseT0a9EntityModel �R�s�[��T0A9�t�@�C���Ǘ��G���e�B�e�B���f��
     */
    public BaseT0a9EntityModel(BaseT0a9EntityModel baseT0a9EntityModel) {
        super();
        //�ǃR�[�h��ݒ肵�܂�
        setT0a9001(baseT0a9EntityModel.getT0a9001());
        //�A�Ԃ�ݒ肵�܂�
        setT0a9002(baseT0a9EntityModel.getT0a9002());
        //�Ǘ��敪��ݒ肵�܂�
        setT0a9101(baseT0a9EntityModel.getT0a9101());
        //�C�Ӑݒ�KEY1��ݒ肵�܂�
        setT0a9102(baseT0a9EntityModel.getT0a9102());
        //�C�Ӑݒ�KEY2��ݒ肵�܂�
        setT0a9103(baseT0a9EntityModel.getT0a9103());
        //�t�@�C������ݒ肵�܂�
        setT0a9201(baseT0a9EntityModel.getT0a9201());
        //�f�[�^��ݒ肵�܂�
        setT0a9202(baseT0a9EntityModel.getT0a9202());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseT0a9EntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseT0a9EntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseT0a9EntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseT0a9EntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseT0a9EntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseT0a9EntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseT0a9EntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h��Ԃ��܂��B
     * @return �ǃR�[�h ��߂��܂��B
     */
    public String getT0a9001() {
        return t0a9001;
    }
    
    /**
     * �ǃR�[�h���Z�b�g���܂��B
     * @param t0a9001 �ǃR�[�h ��ݒ�B
     */
    public void setT0a9001(String t0a9001) {
        this.t0a9001 = t0a9001;
    }
    /**
     * �A�Ԃ�Ԃ��܂��B
     * @return �A�� ��߂��܂��B
     */
    public java.math.BigDecimal getT0a9002() {
        return t0a9002;
    }
    
    /**
     * �A�Ԃ��Z�b�g���܂��B
     * �f�[�^��V�K�ɑ}������ꍇ�́A�V�[�P���XNo�ɂ���Ď����I�ɒl����������܂��̂Ŗ����I�ɃZ�b�g����K�v�͂���܂���B
     * �f�[�^���X�V����ꍇ�͂��̃t�B�[���h�͍X�V�ɉe�����܂���B
     * @param t0a9002 �A�� ��ݒ�B
     */
    public void setT0a9002(java.math.BigDecimal t0a9002) {
        this.t0a9002 = t0a9002;
    }
    /**
     * �Ǘ��敪��Ԃ��܂��B
     * @return �Ǘ��敪 ��߂��܂��B
     */
    public java.math.BigDecimal getT0a9101() {
        return t0a9101;
    }
    
    /**
     * �Ǘ��敪���Z�b�g���܂��B
     * @param t0a9101 �Ǘ��敪 ��ݒ�B
     */
    public void setT0a9101(java.math.BigDecimal t0a9101) {
        this.t0a9101 = t0a9101;
    }
    /**
     * �C�Ӑݒ�KEY1��Ԃ��܂��B
     * @return �C�Ӑݒ�KEY1 ��߂��܂��B
     */
    public String getT0a9102() {
        return t0a9102;
    }
    
    /**
     * �C�Ӑݒ�KEY1���Z�b�g���܂��B
     * @param t0a9102 �C�Ӑݒ�KEY1 ��ݒ�B
     */
    public void setT0a9102(String t0a9102) {
        this.t0a9102 = t0a9102;
    }
    /**
     * �C�Ӑݒ�KEY2��Ԃ��܂��B
     * @return �C�Ӑݒ�KEY2 ��߂��܂��B
     */
    public String getT0a9103() {
        return t0a9103;
    }
    
    /**
     * �C�Ӑݒ�KEY2���Z�b�g���܂��B
     * @param t0a9103 �C�Ӑݒ�KEY2 ��ݒ�B
     */
    public void setT0a9103(String t0a9103) {
        this.t0a9103 = t0a9103;
    }
    /**
     * �t�@�C������Ԃ��܂��B
     * @return �t�@�C���� ��߂��܂��B
     */
    public String getT0a9201() {
        return t0a9201;
    }
    
    /**
     * �t�@�C�������Z�b�g���܂��B
     * @param t0a9201 �t�@�C���� ��ݒ�B
     */
    public void setT0a9201(String t0a9201) {
        this.t0a9201 = t0a9201;
    }
    /**
     * �f�[�^��Ԃ��܂��B
     * @return �f�[�^ ��߂��܂��B
     */
    public java.io.File getT0a9202() {
        return t0a9202;
    }
    
    /**
     * �f�[�^���Z�b�g���܂��B
     * @param t0a9202 �f�[�^ ��ݒ�B
     */
    public void setT0a9202(java.io.File t0a9202) {
        this.t0a9202 = t0a9202;
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
    	return "T0A9";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT0a9001()
                    ,getT0a9002()
    	};
    }


    /**
     * T0A9�t�@�C���Ǘ��G���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return T0A9�t�@�C���Ǘ��G���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "T0A9�t�@�C���Ǘ�(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h(t0a9001)", getT0a9001())
    		.append("�A��(t0a9002)", getT0a9002())
    		.append("�Ǘ��敪(t0a9101)", getT0a9101())
    		.append("�C�Ӑݒ�KEY1(t0a9102)", getT0a9102())
    		.append("�C�Ӑݒ�KEY2(t0a9103)", getT0a9103())
    		.append("�t�@�C����(t0a9201)", getT0a9201())
    		.append("�f�[�^(t0a9202)", getT0a9202())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
