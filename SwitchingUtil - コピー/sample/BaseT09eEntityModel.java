/*
 * @(#)T09e.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */

package jp.co.hanshin.itec.caty.master.model;

import java.io.Serializable;

import jp.co.hanshin.itec.caty.util.model.EntityModel;
import jp.co.hanshin.itec.caty.util.model.LogInfo;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * T09E�ڋq�A�C�R����`�̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * 
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT09eEntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h */
    private String t09e001;
    /** �\���ʒu�ԍ� */
    private java.math.BigDecimal t09e002;
    /** �Ώۍ��ڔԍ� */
    private java.math.BigDecimal t09e101;
    /** �_���F */
    private String t09e102;
    /** �����F */
    private String t09e103;
    /** �A�C�R���� */
    private String t09e104;
    /** �A�C�R����ԋ敪 */
    private java.math.BigDecimal t09e105;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseT09eEntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseT09eEntityModel �R�s�[��T09E�ڋq�A�C�R����`�G���e�B�e�B���f��
     */
    public BaseT09eEntityModel(BaseT09eEntityModel baseT09eEntityModel) {
        super();
        //�ǃR�[�h��ݒ肵�܂�
        setT09e001(baseT09eEntityModel.getT09e001());
        //�\���ʒu�ԍ���ݒ肵�܂�
        setT09e002(baseT09eEntityModel.getT09e002());
        //�Ώۍ��ڔԍ���ݒ肵�܂�
        setT09e101(baseT09eEntityModel.getT09e101());
        //�_���F��ݒ肵�܂�
        setT09e102(baseT09eEntityModel.getT09e102());
        //�����F��ݒ肵�܂�
        setT09e103(baseT09eEntityModel.getT09e103());
        //�A�C�R������ݒ肵�܂�
        setT09e104(baseT09eEntityModel.getT09e104());
        //�A�C�R����ԋ敪��ݒ肵�܂�
        setT09e105(baseT09eEntityModel.getT09e105());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseT09eEntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseT09eEntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseT09eEntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseT09eEntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseT09eEntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseT09eEntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseT09eEntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h��Ԃ��܂��B
     * @return �ǃR�[�h ��߂��܂��B
     */
    @LogInfo(columnIndex=1,columnJpName="�ǃR�[�h")
    public String getT09e001() {
        return t09e001;
    }
    
    /**
     * �ǃR�[�h���Z�b�g���܂��B
     * @param t09e001 �ǃR�[�h ��ݒ�B
     */
    public void setT09e001(String t09e001) {
        this.t09e001 = t09e001;
    }
    /**
     * �\���ʒu�ԍ���Ԃ��܂��B
     * @return �\���ʒu�ԍ� ��߂��܂��B
     */
    @LogInfo(columnIndex=2,columnJpName="�\���ʒu�ԍ�")
    public java.math.BigDecimal getT09e002() {
        return t09e002;
    }
    
    /**
     * �\���ʒu�ԍ����Z�b�g���܂��B
     * @param t09e002 �\���ʒu�ԍ� ��ݒ�B
     */
    public void setT09e002(java.math.BigDecimal t09e002) {
        this.t09e002 = t09e002;
    }
    /**
     * �Ώۍ��ڔԍ���Ԃ��܂��B
     * @return �Ώۍ��ڔԍ� ��߂��܂��B
     */
    @LogInfo(columnIndex=3,columnJpName="�Ώۍ��ڔԍ�")
    public java.math.BigDecimal getT09e101() {
        return t09e101;
    }
    
    /**
     * �Ώۍ��ڔԍ����Z�b�g���܂��B
     * @param t09e101 �Ώۍ��ڔԍ� ��ݒ�B
     */
    public void setT09e101(java.math.BigDecimal t09e101) {
        this.t09e101 = t09e101;
    }
    /**
     * �_���F��Ԃ��܂��B
     * @return �_���F ��߂��܂��B
     */
    @LogInfo(columnIndex=4,columnJpName="�_���F")
    public String getT09e102() {
        return t09e102;
    }
    
    /**
     * �_���F���Z�b�g���܂��B
     * @param t09e102 �_���F ��ݒ�B
     */
    public void setT09e102(String t09e102) {
        this.t09e102 = t09e102;
    }
    /**
     * �����F��Ԃ��܂��B
     * @return �����F ��߂��܂��B
     */
    @LogInfo(columnIndex=5,columnJpName="�����F")
    public String getT09e103() {
        return t09e103;
    }
    
    /**
     * �����F���Z�b�g���܂��B
     * @param t09e103 �����F ��ݒ�B
     */
    public void setT09e103(String t09e103) {
        this.t09e103 = t09e103;
    }
    /**
     * �A�C�R������Ԃ��܂��B
     * @return �A�C�R���� ��߂��܂��B
     */
    @LogInfo(columnIndex=6,columnJpName="�A�C�R����")
    public String getT09e104() {
        return t09e104;
    }
    
    /**
     * �A�C�R�������Z�b�g���܂��B
     * @param t09e104 �A�C�R���� ��ݒ�B
     */
    public void setT09e104(String t09e104) {
        this.t09e104 = t09e104;
    }
    /**
     * �A�C�R����ԋ敪��Ԃ��܂��B
     * @return �A�C�R����ԋ敪 ��߂��܂��B
     */
    @LogInfo(columnIndex=7,columnJpName="�A�C�R����ԋ敪")
    public java.math.BigDecimal getT09e105() {
        return t09e105;
    }
    
    /**
     * �A�C�R����ԋ敪���Z�b�g���܂��B
     * @param t09e105 �A�C�R����ԋ敪 ��ݒ�B
     */
    public void setT09e105(java.math.BigDecimal t09e105) {
        this.t09e105 = t09e105;
    }
    /**
     * �o�^�҂�Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=8,columnJpName="�o�^��")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * �o�^����Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=9,columnJpName="�o�^��")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * �X�V�҂�Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=10,columnJpName="�X�V��")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * �X�V����Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=11,columnJpName="�X�V��")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * �X�VAPP��Ԃ��܂��B
     * @return �X�VAPP ��߂��܂��B
     */
    @LogInfo(columnIndex=12,columnJpName="�X�VAPP")
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
    @LogInfo(columnIndex=13,columnJpName="�o�[�W�����ԍ�")
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
    	return "T09E";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT09e001()
                    ,getT09e002()
    	};
    }


    /**
     * T09E�ڋq�A�C�R����`�G���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return T09E�ڋq�A�C�R����`�G���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "T09E�ڋq�A�C�R����`(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h(t09e001)", getT09e001())
    		.append("�\���ʒu�ԍ�(t09e002)", getT09e002())
    		.append("�Ώۍ��ڔԍ�(t09e101)", getT09e101())
    		.append("�_���F(t09e102)", getT09e102())
    		.append("�����F(t09e103)", getT09e103())
    		.append("�A�C�R����(t09e104)", getT09e104())
    		.append("�A�C�R����ԋ敪(t09e105)", getT09e105())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
