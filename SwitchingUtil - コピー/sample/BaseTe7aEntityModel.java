/*
 * @(#)Te7a.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */

package jp.co.hanshin.itec.caty.contract.model;

import java.io.Serializable;

import jp.co.hanshin.itec.caty.util.model.EntityModel;
import jp.co.hanshin.itec.caty.util.model.LogInfo;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TE7A�X�C�b�`���O�A�g�g�����ڂ̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * TE7A�X�C�b�`���O�A�g�g������
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTe7aEntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h (FK) */
    private String te7a001;
    /** �A�g�ԍ� (FK) */
    private java.math.BigDecimal te7a002;
    /** �A�g�ԍ��A�� (FK) */
    private java.math.BigDecimal te7a003;
    /** �敪 */
    private java.math.BigDecimal te7a004;
    /** �f�[�^���ږ� */
    private String te7a005;
    /** �l */
    private String te7a101;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseTe7aEntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseTe7aEntityModel �R�s�[��TE7A�X�C�b�`���O�A�g�g�����ڃG���e�B�e�B���f��
     */
    public BaseTe7aEntityModel(BaseTe7aEntityModel baseTe7aEntityModel) {
        super();
        //�ǃR�[�h (FK)��ݒ肵�܂�
        setTe7a001(baseTe7aEntityModel.getTe7a001());
        //�A�g�ԍ� (FK)��ݒ肵�܂�
        setTe7a002(baseTe7aEntityModel.getTe7a002());
        //�A�g�ԍ��A�� (FK)��ݒ肵�܂�
        setTe7a003(baseTe7aEntityModel.getTe7a003());
        //�敪��ݒ肵�܂�
        setTe7a004(baseTe7aEntityModel.getTe7a004());
        //�f�[�^���ږ���ݒ肵�܂�
        setTe7a005(baseTe7aEntityModel.getTe7a005());
        //�l��ݒ肵�܂�
        setTe7a101(baseTe7aEntityModel.getTe7a101());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseTe7aEntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseTe7aEntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseTe7aEntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseTe7aEntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseTe7aEntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseTe7aEntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseTe7aEntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h (FK)��Ԃ��܂��B
     * @return �ǃR�[�h (FK) ��߂��܂��B
     */
    @LogInfo(columnIndex=1,columnJpName="�ǃR�[�h (FK)")
    public String getTe7a001() {
        return te7a001;
    }
    
    /**
     * �ǃR�[�h (FK)���Z�b�g���܂��B
     * @param te7a001 �ǃR�[�h (FK) ��ݒ�B
     */
    public void setTe7a001(String te7a001) {
        this.te7a001 = te7a001;
    }
    /**
     * �A�g�ԍ� (FK)��Ԃ��܂��B
     * @return �A�g�ԍ� (FK) ��߂��܂��B
     */
    @LogInfo(columnIndex=2,columnJpName="�A�g�ԍ� (FK)")
    public java.math.BigDecimal getTe7a002() {
        return te7a002;
    }
    
    /**
     * �A�g�ԍ� (FK)���Z�b�g���܂��B
     * @param te7a002 �A�g�ԍ� (FK) ��ݒ�B
     */
    public void setTe7a002(java.math.BigDecimal te7a002) {
        this.te7a002 = te7a002;
    }
    /**
     * �A�g�ԍ��A�� (FK)��Ԃ��܂��B
     * @return �A�g�ԍ��A�� (FK) ��߂��܂��B
     */
    @LogInfo(columnIndex=3,columnJpName="�A�g�ԍ��A�� (FK)")
    public java.math.BigDecimal getTe7a003() {
        return te7a003;
    }
    
    /**
     * �A�g�ԍ��A�� (FK)���Z�b�g���܂��B
     * @param te7a003 �A�g�ԍ��A�� (FK) ��ݒ�B
     */
    public void setTe7a003(java.math.BigDecimal te7a003) {
        this.te7a003 = te7a003;
    }
    /**
     * �敪��Ԃ��܂��B
     * @return �敪 ��߂��܂��B
     */
    @LogInfo(columnIndex=4,columnJpName="�敪")
    public java.math.BigDecimal getTe7a004() {
        return te7a004;
    }
    
    /**
     * �敪���Z�b�g���܂��B
     * @param te7a004 �敪 ��ݒ�B
     */
    public void setTe7a004(java.math.BigDecimal te7a004) {
        this.te7a004 = te7a004;
    }
    /**
     * �f�[�^���ږ���Ԃ��܂��B
     * @return �f�[�^���ږ� ��߂��܂��B
     */
    @LogInfo(columnIndex=5,columnJpName="�f�[�^���ږ�")
    public String getTe7a005() {
        return te7a005;
    }
    
    /**
     * �f�[�^���ږ����Z�b�g���܂��B
     * @param te7a005 �f�[�^���ږ� ��ݒ�B
     */
    public void setTe7a005(String te7a005) {
        this.te7a005 = te7a005;
    }
    /**
     * �l��Ԃ��܂��B
     * @return �l ��߂��܂��B
     */
    @LogInfo(columnIndex=6,columnJpName="�l")
    public String getTe7a101() {
        return te7a101;
    }
    
    /**
     * �l���Z�b�g���܂��B
     * @param te7a101 �l ��ݒ�B
     */
    public void setTe7a101(String te7a101) {
        this.te7a101 = te7a101;
    }
    /**
     * �o�^�҂�Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=7,columnJpName="�o�^��")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * �o�^����Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=8,columnJpName="�o�^��")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * �X�V�҂�Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=9,columnJpName="�X�V��")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * �X�V����Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=10,columnJpName="�X�V��")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * �X�VAPP��Ԃ��܂��B
     * @return �X�VAPP ��߂��܂��B
     */
    @LogInfo(columnIndex=11,columnJpName="�X�VAPP")
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
    @LogInfo(columnIndex=12,columnJpName="�o�[�W�����ԍ�")
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
    	return "TE7A";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getTe7a001()
                    ,getTe7a002()
                    ,getTe7a003()
                    ,getTe7a004()
                    ,getTe7a005()
    	};
    }


    /**
     * TE7A�X�C�b�`���O�A�g�g�����ڃG���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return TE7A�X�C�b�`���O�A�g�g�����ڃG���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "TE7A�X�C�b�`���O�A�g�g������(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h (FK)(te7a001)", getTe7a001())
    		.append("�A�g�ԍ� (FK)(te7a002)", getTe7a002())
    		.append("�A�g�ԍ��A�� (FK)(te7a003)", getTe7a003())
    		.append("�敪(te7a004)", getTe7a004())
    		.append("�f�[�^���ږ�(te7a005)", getTe7a005())
    		.append("�l(te7a101)", getTe7a101())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
