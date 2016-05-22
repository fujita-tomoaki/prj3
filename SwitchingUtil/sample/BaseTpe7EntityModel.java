/*
 * @(#)Tpe7.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */

package jp.co.hanshin.itec.caty.master.model;

import java.io.Serializable;

import jp.co.hanshin.itec.caty.util.model.EntityModel;
import jp.co.hanshin.itec.caty.util.model.LogInfo;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TPE7��ʐݒ�}�X�^�̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * TPE7��ʐݒ�}�X�^
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTpe7EntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h */
    private String tpe7001;
    /** ��ʂh�c */
    private String tpe7002;
    /** �C�Ӑݒ�j�d�x�P */
    private String tpe7003;
    /** �C�Ӑݒ�j�d�x�Q */
    private String tpe7004;
    /** �A�� */
    private java.math.BigDecimal tpe7005;
    /** �C�Ӑݒ�l�P */
    private String tpe7101;
    /** �C�Ӑݒ�l�Q */
    private String tpe7102;
    /** �C�Ӑݒ�l�R */
    private String tpe7103;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseTpe7EntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseTpe7EntityModel �R�s�[��TPE7��ʐݒ�}�X�^�G���e�B�e�B���f��
     */
    public BaseTpe7EntityModel(BaseTpe7EntityModel baseTpe7EntityModel) {
        super();
        //�ǃR�[�h��ݒ肵�܂�
        setTpe7001(baseTpe7EntityModel.getTpe7001());
        //��ʂh�c��ݒ肵�܂�
        setTpe7002(baseTpe7EntityModel.getTpe7002());
        //�C�Ӑݒ�j�d�x�P��ݒ肵�܂�
        setTpe7003(baseTpe7EntityModel.getTpe7003());
        //�C�Ӑݒ�j�d�x�Q��ݒ肵�܂�
        setTpe7004(baseTpe7EntityModel.getTpe7004());
        //�A�Ԃ�ݒ肵�܂�
        setTpe7005(baseTpe7EntityModel.getTpe7005());
        //�C�Ӑݒ�l�P��ݒ肵�܂�
        setTpe7101(baseTpe7EntityModel.getTpe7101());
        //�C�Ӑݒ�l�Q��ݒ肵�܂�
        setTpe7102(baseTpe7EntityModel.getTpe7102());
        //�C�Ӑݒ�l�R��ݒ肵�܂�
        setTpe7103(baseTpe7EntityModel.getTpe7103());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseTpe7EntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseTpe7EntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseTpe7EntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseTpe7EntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseTpe7EntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseTpe7EntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseTpe7EntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h��Ԃ��܂��B
     * @return �ǃR�[�h ��߂��܂��B
     */
    @LogInfo(columnIndex=1,columnJpName="�ǃR�[�h")
    public String getTpe7001() {
        return tpe7001;
    }
    
    /**
     * �ǃR�[�h���Z�b�g���܂��B
     * @param tpe7001 �ǃR�[�h ��ݒ�B
     */
    public void setTpe7001(String tpe7001) {
        this.tpe7001 = tpe7001;
    }
    /**
     * ��ʂh�c��Ԃ��܂��B
     * @return ��ʂh�c ��߂��܂��B
     */
    @LogInfo(columnIndex=2,columnJpName="��ʂh�c")
    public String getTpe7002() {
        return tpe7002;
    }
    
    /**
     * ��ʂh�c���Z�b�g���܂��B
     * @param tpe7002 ��ʂh�c ��ݒ�B
     */
    public void setTpe7002(String tpe7002) {
        this.tpe7002 = tpe7002;
    }
    /**
     * �C�Ӑݒ�j�d�x�P��Ԃ��܂��B
     * @return �C�Ӑݒ�j�d�x�P ��߂��܂��B
     */
    @LogInfo(columnIndex=3,columnJpName="�C�Ӑݒ�j�d�x�P")
    public String getTpe7003() {
        return tpe7003;
    }
    
    /**
     * �C�Ӑݒ�j�d�x�P���Z�b�g���܂��B
     * @param tpe7003 �C�Ӑݒ�j�d�x�P ��ݒ�B
     */
    public void setTpe7003(String tpe7003) {
        this.tpe7003 = tpe7003;
    }
    /**
     * �C�Ӑݒ�j�d�x�Q��Ԃ��܂��B
     * @return �C�Ӑݒ�j�d�x�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=4,columnJpName="�C�Ӑݒ�j�d�x�Q")
    public String getTpe7004() {
        return tpe7004;
    }
    
    /**
     * �C�Ӑݒ�j�d�x�Q���Z�b�g���܂��B
     * @param tpe7004 �C�Ӑݒ�j�d�x�Q ��ݒ�B
     */
    public void setTpe7004(String tpe7004) {
        this.tpe7004 = tpe7004;
    }
    /**
     * �A�Ԃ�Ԃ��܂��B
     * @return �A�� ��߂��܂��B
     */
    @LogInfo(columnIndex=5,columnJpName="�A��")
    public java.math.BigDecimal getTpe7005() {
        return tpe7005;
    }
    
    /**
     * �A�Ԃ��Z�b�g���܂��B
     * @param tpe7005 �A�� ��ݒ�B
     */
    public void setTpe7005(java.math.BigDecimal tpe7005) {
        this.tpe7005 = tpe7005;
    }
    /**
     * �C�Ӑݒ�l�P��Ԃ��܂��B
     * @return �C�Ӑݒ�l�P ��߂��܂��B
     */
    @LogInfo(columnIndex=6,columnJpName="�C�Ӑݒ�l�P")
    public String getTpe7101() {
        return tpe7101;
    }
    
    /**
     * �C�Ӑݒ�l�P���Z�b�g���܂��B
     * @param tpe7101 �C�Ӑݒ�l�P ��ݒ�B
     */
    public void setTpe7101(String tpe7101) {
        this.tpe7101 = tpe7101;
    }
    /**
     * �C�Ӑݒ�l�Q��Ԃ��܂��B
     * @return �C�Ӑݒ�l�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=7,columnJpName="�C�Ӑݒ�l�Q")
    public String getTpe7102() {
        return tpe7102;
    }
    
    /**
     * �C�Ӑݒ�l�Q���Z�b�g���܂��B
     * @param tpe7102 �C�Ӑݒ�l�Q ��ݒ�B
     */
    public void setTpe7102(String tpe7102) {
        this.tpe7102 = tpe7102;
    }
    /**
     * �C�Ӑݒ�l�R��Ԃ��܂��B
     * @return �C�Ӑݒ�l�R ��߂��܂��B
     */
    @LogInfo(columnIndex=8,columnJpName="�C�Ӑݒ�l�R")
    public String getTpe7103() {
        return tpe7103;
    }
    
    /**
     * �C�Ӑݒ�l�R���Z�b�g���܂��B
     * @param tpe7103 �C�Ӑݒ�l�R ��ݒ�B
     */
    public void setTpe7103(String tpe7103) {
        this.tpe7103 = tpe7103;
    }
    /**
     * �o�^�҂�Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=9,columnJpName="�o�^��")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * �o�^����Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=10,columnJpName="�o�^��")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * �X�V�҂�Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=11,columnJpName="�X�V��")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * �X�V����Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=12,columnJpName="�X�V��")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * �X�VAPP��Ԃ��܂��B
     * @return �X�VAPP ��߂��܂��B
     */
    @LogInfo(columnIndex=13,columnJpName="�X�VAPP")
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
    @LogInfo(columnIndex=14,columnJpName="�o�[�W�����ԍ�")
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
    	return "TPE7";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getTpe7001()
                    ,getTpe7002()
                    ,getTpe7003()
                    ,getTpe7004()
                    ,getTpe7005()
    	};
    }


    /**
     * TPE7��ʐݒ�}�X�^�G���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return TPE7��ʐݒ�}�X�^�G���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "TPE7��ʐݒ�}�X�^(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h(tpe7001)", getTpe7001())
    		.append("��ʂh�c(tpe7002)", getTpe7002())
    		.append("�C�Ӑݒ�j�d�x�P(tpe7003)", getTpe7003())
    		.append("�C�Ӑݒ�j�d�x�Q(tpe7004)", getTpe7004())
    		.append("�A��(tpe7005)", getTpe7005())
    		.append("�C�Ӑݒ�l�P(tpe7101)", getTpe7101())
    		.append("�C�Ӑݒ�l�Q(tpe7102)", getTpe7102())
    		.append("�C�Ӑݒ�l�R(tpe7103)", getTpe7103())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
