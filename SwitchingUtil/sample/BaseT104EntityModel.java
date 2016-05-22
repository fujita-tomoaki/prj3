/*
 * @(#)T104.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */

package jp.co.hanshin.itec.caty.contract.model;

import java.io.Serializable;

import jp.co.hanshin.itec.caty.util.model.EntityModel;
import jp.co.hanshin.itec.caty.util.model.LogInfo;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * T104�ڋq�A�C�R���̃G���e�B�e�B���f���N���X�ł��B<BR/>
 * 
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT104EntityModel extends EntityModel implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h */
    private String t104001;
    /** �ڋq�R�[�h */
    private String t104002;
    /** �ڋq��� */
    private java.math.BigDecimal t104101;
    /** �_��҃R�[�h */
    private String t104102;
    /** ���ڂP */
    private java.math.BigDecimal t104211;
    /** ��ԂP */
    private java.math.BigDecimal t104212;
    /** ���l�P */
    private String t104213;
    /** ���ڂQ */
    private java.math.BigDecimal t104221;
    /** ��ԂQ */
    private java.math.BigDecimal t104222;
    /** ���l�Q */
    private String t104223;
    /** ���ڂR */
    private java.math.BigDecimal t104231;
    /** ��ԂR */
    private java.math.BigDecimal t104232;
    /** ���l�R */
    private String t104233;
    /** ���ڂS */
    private java.math.BigDecimal t104241;
    /** ��ԂS */
    private java.math.BigDecimal t104242;
    /** ���l�S */
    private String t104243;
    /** ���ڂT */
    private java.math.BigDecimal t104251;
    /** ��ԂT */
    private java.math.BigDecimal t104252;
    /** ���l�T */
    private String t104253;
    /** ���ڂU */
    private java.math.BigDecimal t104261;
    /** ��ԂU */
    private java.math.BigDecimal t104262;
    /** ���l�U */
    private String t104263;
    /** ���ڂV */
    private java.math.BigDecimal t104271;
    /** ��ԂV */
    private java.math.BigDecimal t104272;
    /** ���l�V */
    private String t104273;
    /** ���ڂW */
    private java.math.BigDecimal t104281;
    /** ��ԂW */
    private java.math.BigDecimal t104282;
    /** ���l�W */
    private String t104283;
    /** ���ڂX */
    private java.math.BigDecimal t104291;
    /** ��ԂX */
    private java.math.BigDecimal t104292;
    /** ���l�X */
    private String t104293;
    /** ���ڂP�O */
    private java.math.BigDecimal t104301;
    /** ��ԂP�O */
    private java.math.BigDecimal t104302;
    /** ���l�P�O */
    private String t104303;
    /** ���ڂP�P */
    private java.math.BigDecimal t104311;
    /** ��ԂP�P */
    private java.math.BigDecimal t104312;
    /** ���l�P�P */
    private String t104313;
    /** ���ڂP�Q */
    private java.math.BigDecimal t104321;
    /** ��ԂP�Q */
    private java.math.BigDecimal t104322;
    /** ���l�P�Q */
    private String t104323;
    /** ���ڂP�R */
    private java.math.BigDecimal t104331;
    /** ��ԂP�R */
    private java.math.BigDecimal t104332;
    /** ���l�P�R */
    private String t104333;
    /** ���ڂP�S */
    private java.math.BigDecimal t104341;
    /** ��ԂP�S */
    private java.math.BigDecimal t104342;
    /** ���l�P�S */
    private String t104343;
    /** ���ڂP�T */
    private java.math.BigDecimal t104351;
    /** ��ԂP�T */
    private java.math.BigDecimal t104352;
    /** ���l�P�T */
    private String t104353;
    /** ���ڂP�U */
    private java.math.BigDecimal t104361;
    /** ��ԂP�U */
    private java.math.BigDecimal t104362;
    /** ���l�P�U */
    private String t104363;
    /** ���ڂP�V */
    private java.math.BigDecimal t104371;
    /** ��ԂP�V */
    private java.math.BigDecimal t104372;
    /** ���l�P�V */
    private String t104373;
    /** ���ڂP�W */
    private java.math.BigDecimal t104381;
    /** ��ԂP�W */
    private java.math.BigDecimal t104382;
    /** ���l�P�W */
    private String t104383;
    /** ���ڂP�X */
    private java.math.BigDecimal t104391;
    /** ��ԂP�X */
    private java.math.BigDecimal t104392;
    /** ���l�P�X */
    private String t104393;
    /** ���ڂQ�O */
    private java.math.BigDecimal t104401;
    /** ��ԂQ�O */
    private java.math.BigDecimal t104402;
    /** ���l�Q�O */
    private String t104403;
    /** ���ڂQ�P */
    private java.math.BigDecimal t104411;
    /** ��ԂQ�P */
    private java.math.BigDecimal t104412;
    /** ���l�Q�P */
    private String t104413;
    /** ���ڂQ�Q */
    private java.math.BigDecimal t104421;
    /** ��ԂQ�Q */
    private java.math.BigDecimal t104422;
    /** ���l�Q�Q */
    private String t104423;
    /** ���ڂQ�R */
    private java.math.BigDecimal t104431;
    /** ��ԂQ�R */
    private java.math.BigDecimal t104432;
    /** ���l�Q�R */
    private String t104433;
    /** ���ڂQ�S */
    private java.math.BigDecimal t104441;
    /** ��ԂQ�S */
    private java.math.BigDecimal t104442;
    /** ���l�Q�S */
    private String t104443;
    /** �X�VAPP */
    private String updateApp;
    /** �o�[�W�����ԍ� */
    private java.math.BigDecimal versionNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public BaseT104EntityModel() {
        super();
    }

    /**
     * �R�s�[�R���X�g���N�^�ł��B
     * @param baseT104EntityModel �R�s�[��T104�ڋq�A�C�R���G���e�B�e�B���f��
     */
    public BaseT104EntityModel(BaseT104EntityModel baseT104EntityModel) {
        super();
        //�ǃR�[�h��ݒ肵�܂�
        setT104001(baseT104EntityModel.getT104001());
        //�ڋq�R�[�h��ݒ肵�܂�
        setT104002(baseT104EntityModel.getT104002());
        //�ڋq��Ԃ�ݒ肵�܂�
        setT104101(baseT104EntityModel.getT104101());
        //�_��҃R�[�h��ݒ肵�܂�
        setT104102(baseT104EntityModel.getT104102());
        //���ڂP��ݒ肵�܂�
        setT104211(baseT104EntityModel.getT104211());
        //��ԂP��ݒ肵�܂�
        setT104212(baseT104EntityModel.getT104212());
        //���l�P��ݒ肵�܂�
        setT104213(baseT104EntityModel.getT104213());
        //���ڂQ��ݒ肵�܂�
        setT104221(baseT104EntityModel.getT104221());
        //��ԂQ��ݒ肵�܂�
        setT104222(baseT104EntityModel.getT104222());
        //���l�Q��ݒ肵�܂�
        setT104223(baseT104EntityModel.getT104223());
        //���ڂR��ݒ肵�܂�
        setT104231(baseT104EntityModel.getT104231());
        //��ԂR��ݒ肵�܂�
        setT104232(baseT104EntityModel.getT104232());
        //���l�R��ݒ肵�܂�
        setT104233(baseT104EntityModel.getT104233());
        //���ڂS��ݒ肵�܂�
        setT104241(baseT104EntityModel.getT104241());
        //��ԂS��ݒ肵�܂�
        setT104242(baseT104EntityModel.getT104242());
        //���l�S��ݒ肵�܂�
        setT104243(baseT104EntityModel.getT104243());
        //���ڂT��ݒ肵�܂�
        setT104251(baseT104EntityModel.getT104251());
        //��ԂT��ݒ肵�܂�
        setT104252(baseT104EntityModel.getT104252());
        //���l�T��ݒ肵�܂�
        setT104253(baseT104EntityModel.getT104253());
        //���ڂU��ݒ肵�܂�
        setT104261(baseT104EntityModel.getT104261());
        //��ԂU��ݒ肵�܂�
        setT104262(baseT104EntityModel.getT104262());
        //���l�U��ݒ肵�܂�
        setT104263(baseT104EntityModel.getT104263());
        //���ڂV��ݒ肵�܂�
        setT104271(baseT104EntityModel.getT104271());
        //��ԂV��ݒ肵�܂�
        setT104272(baseT104EntityModel.getT104272());
        //���l�V��ݒ肵�܂�
        setT104273(baseT104EntityModel.getT104273());
        //���ڂW��ݒ肵�܂�
        setT104281(baseT104EntityModel.getT104281());
        //��ԂW��ݒ肵�܂�
        setT104282(baseT104EntityModel.getT104282());
        //���l�W��ݒ肵�܂�
        setT104283(baseT104EntityModel.getT104283());
        //���ڂX��ݒ肵�܂�
        setT104291(baseT104EntityModel.getT104291());
        //��ԂX��ݒ肵�܂�
        setT104292(baseT104EntityModel.getT104292());
        //���l�X��ݒ肵�܂�
        setT104293(baseT104EntityModel.getT104293());
        //���ڂP�O��ݒ肵�܂�
        setT104301(baseT104EntityModel.getT104301());
        //��ԂP�O��ݒ肵�܂�
        setT104302(baseT104EntityModel.getT104302());
        //���l�P�O��ݒ肵�܂�
        setT104303(baseT104EntityModel.getT104303());
        //���ڂP�P��ݒ肵�܂�
        setT104311(baseT104EntityModel.getT104311());
        //��ԂP�P��ݒ肵�܂�
        setT104312(baseT104EntityModel.getT104312());
        //���l�P�P��ݒ肵�܂�
        setT104313(baseT104EntityModel.getT104313());
        //���ڂP�Q��ݒ肵�܂�
        setT104321(baseT104EntityModel.getT104321());
        //��ԂP�Q��ݒ肵�܂�
        setT104322(baseT104EntityModel.getT104322());
        //���l�P�Q��ݒ肵�܂�
        setT104323(baseT104EntityModel.getT104323());
        //���ڂP�R��ݒ肵�܂�
        setT104331(baseT104EntityModel.getT104331());
        //��ԂP�R��ݒ肵�܂�
        setT104332(baseT104EntityModel.getT104332());
        //���l�P�R��ݒ肵�܂�
        setT104333(baseT104EntityModel.getT104333());
        //���ڂP�S��ݒ肵�܂�
        setT104341(baseT104EntityModel.getT104341());
        //��ԂP�S��ݒ肵�܂�
        setT104342(baseT104EntityModel.getT104342());
        //���l�P�S��ݒ肵�܂�
        setT104343(baseT104EntityModel.getT104343());
        //���ڂP�T��ݒ肵�܂�
        setT104351(baseT104EntityModel.getT104351());
        //��ԂP�T��ݒ肵�܂�
        setT104352(baseT104EntityModel.getT104352());
        //���l�P�T��ݒ肵�܂�
        setT104353(baseT104EntityModel.getT104353());
        //���ڂP�U��ݒ肵�܂�
        setT104361(baseT104EntityModel.getT104361());
        //��ԂP�U��ݒ肵�܂�
        setT104362(baseT104EntityModel.getT104362());
        //���l�P�U��ݒ肵�܂�
        setT104363(baseT104EntityModel.getT104363());
        //���ڂP�V��ݒ肵�܂�
        setT104371(baseT104EntityModel.getT104371());
        //��ԂP�V��ݒ肵�܂�
        setT104372(baseT104EntityModel.getT104372());
        //���l�P�V��ݒ肵�܂�
        setT104373(baseT104EntityModel.getT104373());
        //���ڂP�W��ݒ肵�܂�
        setT104381(baseT104EntityModel.getT104381());
        //��ԂP�W��ݒ肵�܂�
        setT104382(baseT104EntityModel.getT104382());
        //���l�P�W��ݒ肵�܂�
        setT104383(baseT104EntityModel.getT104383());
        //���ڂP�X��ݒ肵�܂�
        setT104391(baseT104EntityModel.getT104391());
        //��ԂP�X��ݒ肵�܂�
        setT104392(baseT104EntityModel.getT104392());
        //���l�P�X��ݒ肵�܂�
        setT104393(baseT104EntityModel.getT104393());
        //���ڂQ�O��ݒ肵�܂�
        setT104401(baseT104EntityModel.getT104401());
        //��ԂQ�O��ݒ肵�܂�
        setT104402(baseT104EntityModel.getT104402());
        //���l�Q�O��ݒ肵�܂�
        setT104403(baseT104EntityModel.getT104403());
        //���ڂQ�P��ݒ肵�܂�
        setT104411(baseT104EntityModel.getT104411());
        //��ԂQ�P��ݒ肵�܂�
        setT104412(baseT104EntityModel.getT104412());
        //���l�Q�P��ݒ肵�܂�
        setT104413(baseT104EntityModel.getT104413());
        //���ڂQ�Q��ݒ肵�܂�
        setT104421(baseT104EntityModel.getT104421());
        //��ԂQ�Q��ݒ肵�܂�
        setT104422(baseT104EntityModel.getT104422());
        //���l�Q�Q��ݒ肵�܂�
        setT104423(baseT104EntityModel.getT104423());
        //���ڂQ�R��ݒ肵�܂�
        setT104431(baseT104EntityModel.getT104431());
        //��ԂQ�R��ݒ肵�܂�
        setT104432(baseT104EntityModel.getT104432());
        //���l�Q�R��ݒ肵�܂�
        setT104433(baseT104EntityModel.getT104433());
        //���ڂQ�S��ݒ肵�܂�
        setT104441(baseT104EntityModel.getT104441());
        //��ԂQ�S��ݒ肵�܂�
        setT104442(baseT104EntityModel.getT104442());
        //���l�Q�S��ݒ肵�܂�
        setT104443(baseT104EntityModel.getT104443());
        //�o�^�҂�ݒ肵�܂�
        setCreator(baseT104EntityModel.getCreator());
        //�o�^����ݒ肵�܂�
        setCreateTimestamp(baseT104EntityModel.getCreateTimestamp());
        //�X�V�҂�ݒ肵�܂�
        setUpdater(baseT104EntityModel.getUpdater());
        //�X�V����ݒ肵�܂�
        setUpdateTimestamp(baseT104EntityModel.getUpdateTimestamp());
        //�X�VAPP��ݒ肵�܂�
        setUpdateApp(baseT104EntityModel.getUpdateApp());
        //�o�[�W�����ԍ���ݒ肵�܂�
        setVersionNo(baseT104EntityModel.getVersionNo());
        //�i�����t���O��ݒ肵�܂�
        setPersist(baseT104EntityModel.isPersist());
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h��Ԃ��܂��B
     * @return �ǃR�[�h ��߂��܂��B
     */
    @LogInfo(columnIndex=1,columnJpName="�ǃR�[�h")
    public String getT104001() {
        return t104001;
    }
    
    /**
     * �ǃR�[�h���Z�b�g���܂��B
     * @param t104001 �ǃR�[�h ��ݒ�B
     */
    public void setT104001(String t104001) {
        this.t104001 = t104001;
    }
    /**
     * �ڋq�R�[�h��Ԃ��܂��B
     * @return �ڋq�R�[�h ��߂��܂��B
     */
    @LogInfo(columnIndex=2,columnJpName="�ڋq�R�[�h")
    public String getT104002() {
        return t104002;
    }
    
    /**
     * �ڋq�R�[�h���Z�b�g���܂��B
     * @param t104002 �ڋq�R�[�h ��ݒ�B
     */
    public void setT104002(String t104002) {
        this.t104002 = t104002;
    }
    /**
     * �ڋq��Ԃ�Ԃ��܂��B
     * @return �ڋq��� ��߂��܂��B
     */
    @LogInfo(columnIndex=3,columnJpName="�ڋq���")
    public java.math.BigDecimal getT104101() {
        return t104101;
    }
    
    /**
     * �ڋq��Ԃ��Z�b�g���܂��B
     * @param t104101 �ڋq��� ��ݒ�B
     */
    public void setT104101(java.math.BigDecimal t104101) {
        this.t104101 = t104101;
    }
    /**
     * �_��҃R�[�h��Ԃ��܂��B
     * @return �_��҃R�[�h ��߂��܂��B
     */
    @LogInfo(columnIndex=4,columnJpName="�_��҃R�[�h")
    public String getT104102() {
        return t104102;
    }
    
    /**
     * �_��҃R�[�h���Z�b�g���܂��B
     * @param t104102 �_��҃R�[�h ��ݒ�B
     */
    public void setT104102(String t104102) {
        this.t104102 = t104102;
    }
    /**
     * ���ڂP��Ԃ��܂��B
     * @return ���ڂP ��߂��܂��B
     */
    @LogInfo(columnIndex=5,columnJpName="���ڂP")
    public java.math.BigDecimal getT104211() {
        return t104211;
    }
    
    /**
     * ���ڂP���Z�b�g���܂��B
     * @param t104211 ���ڂP ��ݒ�B
     */
    public void setT104211(java.math.BigDecimal t104211) {
        this.t104211 = t104211;
    }
    /**
     * ��ԂP��Ԃ��܂��B
     * @return ��ԂP ��߂��܂��B
     */
    @LogInfo(columnIndex=6,columnJpName="��ԂP")
    public java.math.BigDecimal getT104212() {
        return t104212;
    }
    
    /**
     * ��ԂP���Z�b�g���܂��B
     * @param t104212 ��ԂP ��ݒ�B
     */
    public void setT104212(java.math.BigDecimal t104212) {
        this.t104212 = t104212;
    }
    /**
     * ���l�P��Ԃ��܂��B
     * @return ���l�P ��߂��܂��B
     */
    @LogInfo(columnIndex=7,columnJpName="���l�P")
    public String getT104213() {
        return t104213;
    }
    
    /**
     * ���l�P���Z�b�g���܂��B
     * @param t104213 ���l�P ��ݒ�B
     */
    public void setT104213(String t104213) {
        this.t104213 = t104213;
    }
    /**
     * ���ڂQ��Ԃ��܂��B
     * @return ���ڂQ ��߂��܂��B
     */
    @LogInfo(columnIndex=8,columnJpName="���ڂQ")
    public java.math.BigDecimal getT104221() {
        return t104221;
    }
    
    /**
     * ���ڂQ���Z�b�g���܂��B
     * @param t104221 ���ڂQ ��ݒ�B
     */
    public void setT104221(java.math.BigDecimal t104221) {
        this.t104221 = t104221;
    }
    /**
     * ��ԂQ��Ԃ��܂��B
     * @return ��ԂQ ��߂��܂��B
     */
    @LogInfo(columnIndex=9,columnJpName="��ԂQ")
    public java.math.BigDecimal getT104222() {
        return t104222;
    }
    
    /**
     * ��ԂQ���Z�b�g���܂��B
     * @param t104222 ��ԂQ ��ݒ�B
     */
    public void setT104222(java.math.BigDecimal t104222) {
        this.t104222 = t104222;
    }
    /**
     * ���l�Q��Ԃ��܂��B
     * @return ���l�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=10,columnJpName="���l�Q")
    public String getT104223() {
        return t104223;
    }
    
    /**
     * ���l�Q���Z�b�g���܂��B
     * @param t104223 ���l�Q ��ݒ�B
     */
    public void setT104223(String t104223) {
        this.t104223 = t104223;
    }
    /**
     * ���ڂR��Ԃ��܂��B
     * @return ���ڂR ��߂��܂��B
     */
    @LogInfo(columnIndex=11,columnJpName="���ڂR")
    public java.math.BigDecimal getT104231() {
        return t104231;
    }
    
    /**
     * ���ڂR���Z�b�g���܂��B
     * @param t104231 ���ڂR ��ݒ�B
     */
    public void setT104231(java.math.BigDecimal t104231) {
        this.t104231 = t104231;
    }
    /**
     * ��ԂR��Ԃ��܂��B
     * @return ��ԂR ��߂��܂��B
     */
    @LogInfo(columnIndex=12,columnJpName="��ԂR")
    public java.math.BigDecimal getT104232() {
        return t104232;
    }
    
    /**
     * ��ԂR���Z�b�g���܂��B
     * @param t104232 ��ԂR ��ݒ�B
     */
    public void setT104232(java.math.BigDecimal t104232) {
        this.t104232 = t104232;
    }
    /**
     * ���l�R��Ԃ��܂��B
     * @return ���l�R ��߂��܂��B
     */
    @LogInfo(columnIndex=13,columnJpName="���l�R")
    public String getT104233() {
        return t104233;
    }
    
    /**
     * ���l�R���Z�b�g���܂��B
     * @param t104233 ���l�R ��ݒ�B
     */
    public void setT104233(String t104233) {
        this.t104233 = t104233;
    }
    /**
     * ���ڂS��Ԃ��܂��B
     * @return ���ڂS ��߂��܂��B
     */
    @LogInfo(columnIndex=14,columnJpName="���ڂS")
    public java.math.BigDecimal getT104241() {
        return t104241;
    }
    
    /**
     * ���ڂS���Z�b�g���܂��B
     * @param t104241 ���ڂS ��ݒ�B
     */
    public void setT104241(java.math.BigDecimal t104241) {
        this.t104241 = t104241;
    }
    /**
     * ��ԂS��Ԃ��܂��B
     * @return ��ԂS ��߂��܂��B
     */
    @LogInfo(columnIndex=15,columnJpName="��ԂS")
    public java.math.BigDecimal getT104242() {
        return t104242;
    }
    
    /**
     * ��ԂS���Z�b�g���܂��B
     * @param t104242 ��ԂS ��ݒ�B
     */
    public void setT104242(java.math.BigDecimal t104242) {
        this.t104242 = t104242;
    }
    /**
     * ���l�S��Ԃ��܂��B
     * @return ���l�S ��߂��܂��B
     */
    @LogInfo(columnIndex=16,columnJpName="���l�S")
    public String getT104243() {
        return t104243;
    }
    
    /**
     * ���l�S���Z�b�g���܂��B
     * @param t104243 ���l�S ��ݒ�B
     */
    public void setT104243(String t104243) {
        this.t104243 = t104243;
    }
    /**
     * ���ڂT��Ԃ��܂��B
     * @return ���ڂT ��߂��܂��B
     */
    @LogInfo(columnIndex=17,columnJpName="���ڂT")
    public java.math.BigDecimal getT104251() {
        return t104251;
    }
    
    /**
     * ���ڂT���Z�b�g���܂��B
     * @param t104251 ���ڂT ��ݒ�B
     */
    public void setT104251(java.math.BigDecimal t104251) {
        this.t104251 = t104251;
    }
    /**
     * ��ԂT��Ԃ��܂��B
     * @return ��ԂT ��߂��܂��B
     */
    @LogInfo(columnIndex=18,columnJpName="��ԂT")
    public java.math.BigDecimal getT104252() {
        return t104252;
    }
    
    /**
     * ��ԂT���Z�b�g���܂��B
     * @param t104252 ��ԂT ��ݒ�B
     */
    public void setT104252(java.math.BigDecimal t104252) {
        this.t104252 = t104252;
    }
    /**
     * ���l�T��Ԃ��܂��B
     * @return ���l�T ��߂��܂��B
     */
    @LogInfo(columnIndex=19,columnJpName="���l�T")
    public String getT104253() {
        return t104253;
    }
    
    /**
     * ���l�T���Z�b�g���܂��B
     * @param t104253 ���l�T ��ݒ�B
     */
    public void setT104253(String t104253) {
        this.t104253 = t104253;
    }
    /**
     * ���ڂU��Ԃ��܂��B
     * @return ���ڂU ��߂��܂��B
     */
    @LogInfo(columnIndex=20,columnJpName="���ڂU")
    public java.math.BigDecimal getT104261() {
        return t104261;
    }
    
    /**
     * ���ڂU���Z�b�g���܂��B
     * @param t104261 ���ڂU ��ݒ�B
     */
    public void setT104261(java.math.BigDecimal t104261) {
        this.t104261 = t104261;
    }
    /**
     * ��ԂU��Ԃ��܂��B
     * @return ��ԂU ��߂��܂��B
     */
    @LogInfo(columnIndex=21,columnJpName="��ԂU")
    public java.math.BigDecimal getT104262() {
        return t104262;
    }
    
    /**
     * ��ԂU���Z�b�g���܂��B
     * @param t104262 ��ԂU ��ݒ�B
     */
    public void setT104262(java.math.BigDecimal t104262) {
        this.t104262 = t104262;
    }
    /**
     * ���l�U��Ԃ��܂��B
     * @return ���l�U ��߂��܂��B
     */
    @LogInfo(columnIndex=22,columnJpName="���l�U")
    public String getT104263() {
        return t104263;
    }
    
    /**
     * ���l�U���Z�b�g���܂��B
     * @param t104263 ���l�U ��ݒ�B
     */
    public void setT104263(String t104263) {
        this.t104263 = t104263;
    }
    /**
     * ���ڂV��Ԃ��܂��B
     * @return ���ڂV ��߂��܂��B
     */
    @LogInfo(columnIndex=23,columnJpName="���ڂV")
    public java.math.BigDecimal getT104271() {
        return t104271;
    }
    
    /**
     * ���ڂV���Z�b�g���܂��B
     * @param t104271 ���ڂV ��ݒ�B
     */
    public void setT104271(java.math.BigDecimal t104271) {
        this.t104271 = t104271;
    }
    /**
     * ��ԂV��Ԃ��܂��B
     * @return ��ԂV ��߂��܂��B
     */
    @LogInfo(columnIndex=24,columnJpName="��ԂV")
    public java.math.BigDecimal getT104272() {
        return t104272;
    }
    
    /**
     * ��ԂV���Z�b�g���܂��B
     * @param t104272 ��ԂV ��ݒ�B
     */
    public void setT104272(java.math.BigDecimal t104272) {
        this.t104272 = t104272;
    }
    /**
     * ���l�V��Ԃ��܂��B
     * @return ���l�V ��߂��܂��B
     */
    @LogInfo(columnIndex=25,columnJpName="���l�V")
    public String getT104273() {
        return t104273;
    }
    
    /**
     * ���l�V���Z�b�g���܂��B
     * @param t104273 ���l�V ��ݒ�B
     */
    public void setT104273(String t104273) {
        this.t104273 = t104273;
    }
    /**
     * ���ڂW��Ԃ��܂��B
     * @return ���ڂW ��߂��܂��B
     */
    @LogInfo(columnIndex=26,columnJpName="���ڂW")
    public java.math.BigDecimal getT104281() {
        return t104281;
    }
    
    /**
     * ���ڂW���Z�b�g���܂��B
     * @param t104281 ���ڂW ��ݒ�B
     */
    public void setT104281(java.math.BigDecimal t104281) {
        this.t104281 = t104281;
    }
    /**
     * ��ԂW��Ԃ��܂��B
     * @return ��ԂW ��߂��܂��B
     */
    @LogInfo(columnIndex=27,columnJpName="��ԂW")
    public java.math.BigDecimal getT104282() {
        return t104282;
    }
    
    /**
     * ��ԂW���Z�b�g���܂��B
     * @param t104282 ��ԂW ��ݒ�B
     */
    public void setT104282(java.math.BigDecimal t104282) {
        this.t104282 = t104282;
    }
    /**
     * ���l�W��Ԃ��܂��B
     * @return ���l�W ��߂��܂��B
     */
    @LogInfo(columnIndex=28,columnJpName="���l�W")
    public String getT104283() {
        return t104283;
    }
    
    /**
     * ���l�W���Z�b�g���܂��B
     * @param t104283 ���l�W ��ݒ�B
     */
    public void setT104283(String t104283) {
        this.t104283 = t104283;
    }
    /**
     * ���ڂX��Ԃ��܂��B
     * @return ���ڂX ��߂��܂��B
     */
    @LogInfo(columnIndex=29,columnJpName="���ڂX")
    public java.math.BigDecimal getT104291() {
        return t104291;
    }
    
    /**
     * ���ڂX���Z�b�g���܂��B
     * @param t104291 ���ڂX ��ݒ�B
     */
    public void setT104291(java.math.BigDecimal t104291) {
        this.t104291 = t104291;
    }
    /**
     * ��ԂX��Ԃ��܂��B
     * @return ��ԂX ��߂��܂��B
     */
    @LogInfo(columnIndex=30,columnJpName="��ԂX")
    public java.math.BigDecimal getT104292() {
        return t104292;
    }
    
    /**
     * ��ԂX���Z�b�g���܂��B
     * @param t104292 ��ԂX ��ݒ�B
     */
    public void setT104292(java.math.BigDecimal t104292) {
        this.t104292 = t104292;
    }
    /**
     * ���l�X��Ԃ��܂��B
     * @return ���l�X ��߂��܂��B
     */
    @LogInfo(columnIndex=31,columnJpName="���l�X")
    public String getT104293() {
        return t104293;
    }
    
    /**
     * ���l�X���Z�b�g���܂��B
     * @param t104293 ���l�X ��ݒ�B
     */
    public void setT104293(String t104293) {
        this.t104293 = t104293;
    }
    /**
     * ���ڂP�O��Ԃ��܂��B
     * @return ���ڂP�O ��߂��܂��B
     */
    @LogInfo(columnIndex=32,columnJpName="���ڂP�O")
    public java.math.BigDecimal getT104301() {
        return t104301;
    }
    
    /**
     * ���ڂP�O���Z�b�g���܂��B
     * @param t104301 ���ڂP�O ��ݒ�B
     */
    public void setT104301(java.math.BigDecimal t104301) {
        this.t104301 = t104301;
    }
    /**
     * ��ԂP�O��Ԃ��܂��B
     * @return ��ԂP�O ��߂��܂��B
     */
    @LogInfo(columnIndex=33,columnJpName="��ԂP�O")
    public java.math.BigDecimal getT104302() {
        return t104302;
    }
    
    /**
     * ��ԂP�O���Z�b�g���܂��B
     * @param t104302 ��ԂP�O ��ݒ�B
     */
    public void setT104302(java.math.BigDecimal t104302) {
        this.t104302 = t104302;
    }
    /**
     * ���l�P�O��Ԃ��܂��B
     * @return ���l�P�O ��߂��܂��B
     */
    @LogInfo(columnIndex=34,columnJpName="���l�P�O")
    public String getT104303() {
        return t104303;
    }
    
    /**
     * ���l�P�O���Z�b�g���܂��B
     * @param t104303 ���l�P�O ��ݒ�B
     */
    public void setT104303(String t104303) {
        this.t104303 = t104303;
    }
    /**
     * ���ڂP�P��Ԃ��܂��B
     * @return ���ڂP�P ��߂��܂��B
     */
    @LogInfo(columnIndex=35,columnJpName="���ڂP�P")
    public java.math.BigDecimal getT104311() {
        return t104311;
    }
    
    /**
     * ���ڂP�P���Z�b�g���܂��B
     * @param t104311 ���ڂP�P ��ݒ�B
     */
    public void setT104311(java.math.BigDecimal t104311) {
        this.t104311 = t104311;
    }
    /**
     * ��ԂP�P��Ԃ��܂��B
     * @return ��ԂP�P ��߂��܂��B
     */
    @LogInfo(columnIndex=36,columnJpName="��ԂP�P")
    public java.math.BigDecimal getT104312() {
        return t104312;
    }
    
    /**
     * ��ԂP�P���Z�b�g���܂��B
     * @param t104312 ��ԂP�P ��ݒ�B
     */
    public void setT104312(java.math.BigDecimal t104312) {
        this.t104312 = t104312;
    }
    /**
     * ���l�P�P��Ԃ��܂��B
     * @return ���l�P�P ��߂��܂��B
     */
    @LogInfo(columnIndex=37,columnJpName="���l�P�P")
    public String getT104313() {
        return t104313;
    }
    
    /**
     * ���l�P�P���Z�b�g���܂��B
     * @param t104313 ���l�P�P ��ݒ�B
     */
    public void setT104313(String t104313) {
        this.t104313 = t104313;
    }
    /**
     * ���ڂP�Q��Ԃ��܂��B
     * @return ���ڂP�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=38,columnJpName="���ڂP�Q")
    public java.math.BigDecimal getT104321() {
        return t104321;
    }
    
    /**
     * ���ڂP�Q���Z�b�g���܂��B
     * @param t104321 ���ڂP�Q ��ݒ�B
     */
    public void setT104321(java.math.BigDecimal t104321) {
        this.t104321 = t104321;
    }
    /**
     * ��ԂP�Q��Ԃ��܂��B
     * @return ��ԂP�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=39,columnJpName="��ԂP�Q")
    public java.math.BigDecimal getT104322() {
        return t104322;
    }
    
    /**
     * ��ԂP�Q���Z�b�g���܂��B
     * @param t104322 ��ԂP�Q ��ݒ�B
     */
    public void setT104322(java.math.BigDecimal t104322) {
        this.t104322 = t104322;
    }
    /**
     * ���l�P�Q��Ԃ��܂��B
     * @return ���l�P�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=40,columnJpName="���l�P�Q")
    public String getT104323() {
        return t104323;
    }
    
    /**
     * ���l�P�Q���Z�b�g���܂��B
     * @param t104323 ���l�P�Q ��ݒ�B
     */
    public void setT104323(String t104323) {
        this.t104323 = t104323;
    }
    /**
     * ���ڂP�R��Ԃ��܂��B
     * @return ���ڂP�R ��߂��܂��B
     */
    @LogInfo(columnIndex=41,columnJpName="���ڂP�R")
    public java.math.BigDecimal getT104331() {
        return t104331;
    }
    
    /**
     * ���ڂP�R���Z�b�g���܂��B
     * @param t104331 ���ڂP�R ��ݒ�B
     */
    public void setT104331(java.math.BigDecimal t104331) {
        this.t104331 = t104331;
    }
    /**
     * ��ԂP�R��Ԃ��܂��B
     * @return ��ԂP�R ��߂��܂��B
     */
    @LogInfo(columnIndex=42,columnJpName="��ԂP�R")
    public java.math.BigDecimal getT104332() {
        return t104332;
    }
    
    /**
     * ��ԂP�R���Z�b�g���܂��B
     * @param t104332 ��ԂP�R ��ݒ�B
     */
    public void setT104332(java.math.BigDecimal t104332) {
        this.t104332 = t104332;
    }
    /**
     * ���l�P�R��Ԃ��܂��B
     * @return ���l�P�R ��߂��܂��B
     */
    @LogInfo(columnIndex=43,columnJpName="���l�P�R")
    public String getT104333() {
        return t104333;
    }
    
    /**
     * ���l�P�R���Z�b�g���܂��B
     * @param t104333 ���l�P�R ��ݒ�B
     */
    public void setT104333(String t104333) {
        this.t104333 = t104333;
    }
    /**
     * ���ڂP�S��Ԃ��܂��B
     * @return ���ڂP�S ��߂��܂��B
     */
    @LogInfo(columnIndex=44,columnJpName="���ڂP�S")
    public java.math.BigDecimal getT104341() {
        return t104341;
    }
    
    /**
     * ���ڂP�S���Z�b�g���܂��B
     * @param t104341 ���ڂP�S ��ݒ�B
     */
    public void setT104341(java.math.BigDecimal t104341) {
        this.t104341 = t104341;
    }
    /**
     * ��ԂP�S��Ԃ��܂��B
     * @return ��ԂP�S ��߂��܂��B
     */
    @LogInfo(columnIndex=45,columnJpName="��ԂP�S")
    public java.math.BigDecimal getT104342() {
        return t104342;
    }
    
    /**
     * ��ԂP�S���Z�b�g���܂��B
     * @param t104342 ��ԂP�S ��ݒ�B
     */
    public void setT104342(java.math.BigDecimal t104342) {
        this.t104342 = t104342;
    }
    /**
     * ���l�P�S��Ԃ��܂��B
     * @return ���l�P�S ��߂��܂��B
     */
    @LogInfo(columnIndex=46,columnJpName="���l�P�S")
    public String getT104343() {
        return t104343;
    }
    
    /**
     * ���l�P�S���Z�b�g���܂��B
     * @param t104343 ���l�P�S ��ݒ�B
     */
    public void setT104343(String t104343) {
        this.t104343 = t104343;
    }
    /**
     * ���ڂP�T��Ԃ��܂��B
     * @return ���ڂP�T ��߂��܂��B
     */
    @LogInfo(columnIndex=47,columnJpName="���ڂP�T")
    public java.math.BigDecimal getT104351() {
        return t104351;
    }
    
    /**
     * ���ڂP�T���Z�b�g���܂��B
     * @param t104351 ���ڂP�T ��ݒ�B
     */
    public void setT104351(java.math.BigDecimal t104351) {
        this.t104351 = t104351;
    }
    /**
     * ��ԂP�T��Ԃ��܂��B
     * @return ��ԂP�T ��߂��܂��B
     */
    @LogInfo(columnIndex=48,columnJpName="��ԂP�T")
    public java.math.BigDecimal getT104352() {
        return t104352;
    }
    
    /**
     * ��ԂP�T���Z�b�g���܂��B
     * @param t104352 ��ԂP�T ��ݒ�B
     */
    public void setT104352(java.math.BigDecimal t104352) {
        this.t104352 = t104352;
    }
    /**
     * ���l�P�T��Ԃ��܂��B
     * @return ���l�P�T ��߂��܂��B
     */
    @LogInfo(columnIndex=49,columnJpName="���l�P�T")
    public String getT104353() {
        return t104353;
    }
    
    /**
     * ���l�P�T���Z�b�g���܂��B
     * @param t104353 ���l�P�T ��ݒ�B
     */
    public void setT104353(String t104353) {
        this.t104353 = t104353;
    }
    /**
     * ���ڂP�U��Ԃ��܂��B
     * @return ���ڂP�U ��߂��܂��B
     */
    @LogInfo(columnIndex=50,columnJpName="���ڂP�U")
    public java.math.BigDecimal getT104361() {
        return t104361;
    }
    
    /**
     * ���ڂP�U���Z�b�g���܂��B
     * @param t104361 ���ڂP�U ��ݒ�B
     */
    public void setT104361(java.math.BigDecimal t104361) {
        this.t104361 = t104361;
    }
    /**
     * ��ԂP�U��Ԃ��܂��B
     * @return ��ԂP�U ��߂��܂��B
     */
    @LogInfo(columnIndex=51,columnJpName="��ԂP�U")
    public java.math.BigDecimal getT104362() {
        return t104362;
    }
    
    /**
     * ��ԂP�U���Z�b�g���܂��B
     * @param t104362 ��ԂP�U ��ݒ�B
     */
    public void setT104362(java.math.BigDecimal t104362) {
        this.t104362 = t104362;
    }
    /**
     * ���l�P�U��Ԃ��܂��B
     * @return ���l�P�U ��߂��܂��B
     */
    @LogInfo(columnIndex=52,columnJpName="���l�P�U")
    public String getT104363() {
        return t104363;
    }
    
    /**
     * ���l�P�U���Z�b�g���܂��B
     * @param t104363 ���l�P�U ��ݒ�B
     */
    public void setT104363(String t104363) {
        this.t104363 = t104363;
    }
    /**
     * ���ڂP�V��Ԃ��܂��B
     * @return ���ڂP�V ��߂��܂��B
     */
    @LogInfo(columnIndex=53,columnJpName="���ڂP�V")
    public java.math.BigDecimal getT104371() {
        return t104371;
    }
    
    /**
     * ���ڂP�V���Z�b�g���܂��B
     * @param t104371 ���ڂP�V ��ݒ�B
     */
    public void setT104371(java.math.BigDecimal t104371) {
        this.t104371 = t104371;
    }
    /**
     * ��ԂP�V��Ԃ��܂��B
     * @return ��ԂP�V ��߂��܂��B
     */
    @LogInfo(columnIndex=54,columnJpName="��ԂP�V")
    public java.math.BigDecimal getT104372() {
        return t104372;
    }
    
    /**
     * ��ԂP�V���Z�b�g���܂��B
     * @param t104372 ��ԂP�V ��ݒ�B
     */
    public void setT104372(java.math.BigDecimal t104372) {
        this.t104372 = t104372;
    }
    /**
     * ���l�P�V��Ԃ��܂��B
     * @return ���l�P�V ��߂��܂��B
     */
    @LogInfo(columnIndex=55,columnJpName="���l�P�V")
    public String getT104373() {
        return t104373;
    }
    
    /**
     * ���l�P�V���Z�b�g���܂��B
     * @param t104373 ���l�P�V ��ݒ�B
     */
    public void setT104373(String t104373) {
        this.t104373 = t104373;
    }
    /**
     * ���ڂP�W��Ԃ��܂��B
     * @return ���ڂP�W ��߂��܂��B
     */
    @LogInfo(columnIndex=56,columnJpName="���ڂP�W")
    public java.math.BigDecimal getT104381() {
        return t104381;
    }
    
    /**
     * ���ڂP�W���Z�b�g���܂��B
     * @param t104381 ���ڂP�W ��ݒ�B
     */
    public void setT104381(java.math.BigDecimal t104381) {
        this.t104381 = t104381;
    }
    /**
     * ��ԂP�W��Ԃ��܂��B
     * @return ��ԂP�W ��߂��܂��B
     */
    @LogInfo(columnIndex=57,columnJpName="��ԂP�W")
    public java.math.BigDecimal getT104382() {
        return t104382;
    }
    
    /**
     * ��ԂP�W���Z�b�g���܂��B
     * @param t104382 ��ԂP�W ��ݒ�B
     */
    public void setT104382(java.math.BigDecimal t104382) {
        this.t104382 = t104382;
    }
    /**
     * ���l�P�W��Ԃ��܂��B
     * @return ���l�P�W ��߂��܂��B
     */
    @LogInfo(columnIndex=58,columnJpName="���l�P�W")
    public String getT104383() {
        return t104383;
    }
    
    /**
     * ���l�P�W���Z�b�g���܂��B
     * @param t104383 ���l�P�W ��ݒ�B
     */
    public void setT104383(String t104383) {
        this.t104383 = t104383;
    }
    /**
     * ���ڂP�X��Ԃ��܂��B
     * @return ���ڂP�X ��߂��܂��B
     */
    @LogInfo(columnIndex=59,columnJpName="���ڂP�X")
    public java.math.BigDecimal getT104391() {
        return t104391;
    }
    
    /**
     * ���ڂP�X���Z�b�g���܂��B
     * @param t104391 ���ڂP�X ��ݒ�B
     */
    public void setT104391(java.math.BigDecimal t104391) {
        this.t104391 = t104391;
    }
    /**
     * ��ԂP�X��Ԃ��܂��B
     * @return ��ԂP�X ��߂��܂��B
     */
    @LogInfo(columnIndex=60,columnJpName="��ԂP�X")
    public java.math.BigDecimal getT104392() {
        return t104392;
    }
    
    /**
     * ��ԂP�X���Z�b�g���܂��B
     * @param t104392 ��ԂP�X ��ݒ�B
     */
    public void setT104392(java.math.BigDecimal t104392) {
        this.t104392 = t104392;
    }
    /**
     * ���l�P�X��Ԃ��܂��B
     * @return ���l�P�X ��߂��܂��B
     */
    @LogInfo(columnIndex=61,columnJpName="���l�P�X")
    public String getT104393() {
        return t104393;
    }
    
    /**
     * ���l�P�X���Z�b�g���܂��B
     * @param t104393 ���l�P�X ��ݒ�B
     */
    public void setT104393(String t104393) {
        this.t104393 = t104393;
    }
    /**
     * ���ڂQ�O��Ԃ��܂��B
     * @return ���ڂQ�O ��߂��܂��B
     */
    @LogInfo(columnIndex=62,columnJpName="���ڂQ�O")
    public java.math.BigDecimal getT104401() {
        return t104401;
    }
    
    /**
     * ���ڂQ�O���Z�b�g���܂��B
     * @param t104401 ���ڂQ�O ��ݒ�B
     */
    public void setT104401(java.math.BigDecimal t104401) {
        this.t104401 = t104401;
    }
    /**
     * ��ԂQ�O��Ԃ��܂��B
     * @return ��ԂQ�O ��߂��܂��B
     */
    @LogInfo(columnIndex=63,columnJpName="��ԂQ�O")
    public java.math.BigDecimal getT104402() {
        return t104402;
    }
    
    /**
     * ��ԂQ�O���Z�b�g���܂��B
     * @param t104402 ��ԂQ�O ��ݒ�B
     */
    public void setT104402(java.math.BigDecimal t104402) {
        this.t104402 = t104402;
    }
    /**
     * ���l�Q�O��Ԃ��܂��B
     * @return ���l�Q�O ��߂��܂��B
     */
    @LogInfo(columnIndex=64,columnJpName="���l�Q�O")
    public String getT104403() {
        return t104403;
    }
    
    /**
     * ���l�Q�O���Z�b�g���܂��B
     * @param t104403 ���l�Q�O ��ݒ�B
     */
    public void setT104403(String t104403) {
        this.t104403 = t104403;
    }
    /**
     * ���ڂQ�P��Ԃ��܂��B
     * @return ���ڂQ�P ��߂��܂��B
     */
    @LogInfo(columnIndex=65,columnJpName="���ڂQ�P")
    public java.math.BigDecimal getT104411() {
        return t104411;
    }
    
    /**
     * ���ڂQ�P���Z�b�g���܂��B
     * @param t104411 ���ڂQ�P ��ݒ�B
     */
    public void setT104411(java.math.BigDecimal t104411) {
        this.t104411 = t104411;
    }
    /**
     * ��ԂQ�P��Ԃ��܂��B
     * @return ��ԂQ�P ��߂��܂��B
     */
    @LogInfo(columnIndex=66,columnJpName="��ԂQ�P")
    public java.math.BigDecimal getT104412() {
        return t104412;
    }
    
    /**
     * ��ԂQ�P���Z�b�g���܂��B
     * @param t104412 ��ԂQ�P ��ݒ�B
     */
    public void setT104412(java.math.BigDecimal t104412) {
        this.t104412 = t104412;
    }
    /**
     * ���l�Q�P��Ԃ��܂��B
     * @return ���l�Q�P ��߂��܂��B
     */
    @LogInfo(columnIndex=67,columnJpName="���l�Q�P")
    public String getT104413() {
        return t104413;
    }
    
    /**
     * ���l�Q�P���Z�b�g���܂��B
     * @param t104413 ���l�Q�P ��ݒ�B
     */
    public void setT104413(String t104413) {
        this.t104413 = t104413;
    }
    /**
     * ���ڂQ�Q��Ԃ��܂��B
     * @return ���ڂQ�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=68,columnJpName="���ڂQ�Q")
    public java.math.BigDecimal getT104421() {
        return t104421;
    }
    
    /**
     * ���ڂQ�Q���Z�b�g���܂��B
     * @param t104421 ���ڂQ�Q ��ݒ�B
     */
    public void setT104421(java.math.BigDecimal t104421) {
        this.t104421 = t104421;
    }
    /**
     * ��ԂQ�Q��Ԃ��܂��B
     * @return ��ԂQ�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=69,columnJpName="��ԂQ�Q")
    public java.math.BigDecimal getT104422() {
        return t104422;
    }
    
    /**
     * ��ԂQ�Q���Z�b�g���܂��B
     * @param t104422 ��ԂQ�Q ��ݒ�B
     */
    public void setT104422(java.math.BigDecimal t104422) {
        this.t104422 = t104422;
    }
    /**
     * ���l�Q�Q��Ԃ��܂��B
     * @return ���l�Q�Q ��߂��܂��B
     */
    @LogInfo(columnIndex=70,columnJpName="���l�Q�Q")
    public String getT104423() {
        return t104423;
    }
    
    /**
     * ���l�Q�Q���Z�b�g���܂��B
     * @param t104423 ���l�Q�Q ��ݒ�B
     */
    public void setT104423(String t104423) {
        this.t104423 = t104423;
    }
    /**
     * ���ڂQ�R��Ԃ��܂��B
     * @return ���ڂQ�R ��߂��܂��B
     */
    @LogInfo(columnIndex=71,columnJpName="���ڂQ�R")
    public java.math.BigDecimal getT104431() {
        return t104431;
    }
    
    /**
     * ���ڂQ�R���Z�b�g���܂��B
     * @param t104431 ���ڂQ�R ��ݒ�B
     */
    public void setT104431(java.math.BigDecimal t104431) {
        this.t104431 = t104431;
    }
    /**
     * ��ԂQ�R��Ԃ��܂��B
     * @return ��ԂQ�R ��߂��܂��B
     */
    @LogInfo(columnIndex=72,columnJpName="��ԂQ�R")
    public java.math.BigDecimal getT104432() {
        return t104432;
    }
    
    /**
     * ��ԂQ�R���Z�b�g���܂��B
     * @param t104432 ��ԂQ�R ��ݒ�B
     */
    public void setT104432(java.math.BigDecimal t104432) {
        this.t104432 = t104432;
    }
    /**
     * ���l�Q�R��Ԃ��܂��B
     * @return ���l�Q�R ��߂��܂��B
     */
    @LogInfo(columnIndex=73,columnJpName="���l�Q�R")
    public String getT104433() {
        return t104433;
    }
    
    /**
     * ���l�Q�R���Z�b�g���܂��B
     * @param t104433 ���l�Q�R ��ݒ�B
     */
    public void setT104433(String t104433) {
        this.t104433 = t104433;
    }
    /**
     * ���ڂQ�S��Ԃ��܂��B
     * @return ���ڂQ�S ��߂��܂��B
     */
    @LogInfo(columnIndex=74,columnJpName="���ڂQ�S")
    public java.math.BigDecimal getT104441() {
        return t104441;
    }
    
    /**
     * ���ڂQ�S���Z�b�g���܂��B
     * @param t104441 ���ڂQ�S ��ݒ�B
     */
    public void setT104441(java.math.BigDecimal t104441) {
        this.t104441 = t104441;
    }
    /**
     * ��ԂQ�S��Ԃ��܂��B
     * @return ��ԂQ�S ��߂��܂��B
     */
    @LogInfo(columnIndex=75,columnJpName="��ԂQ�S")
    public java.math.BigDecimal getT104442() {
        return t104442;
    }
    
    /**
     * ��ԂQ�S���Z�b�g���܂��B
     * @param t104442 ��ԂQ�S ��ݒ�B
     */
    public void setT104442(java.math.BigDecimal t104442) {
        this.t104442 = t104442;
    }
    /**
     * ���l�Q�S��Ԃ��܂��B
     * @return ���l�Q�S ��߂��܂��B
     */
    @LogInfo(columnIndex=76,columnJpName="���l�Q�S")
    public String getT104443() {
        return t104443;
    }
    
    /**
     * ���l�Q�S���Z�b�g���܂��B
     * @param t104443 ���l�Q�S ��ݒ�B
     */
    public void setT104443(String t104443) {
        this.t104443 = t104443;
    }
    /**
     * �o�^�҂�Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=77,columnJpName="�o�^��")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * �o�^����Ԃ��܂��B
     * @return �o�^�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=78,columnJpName="�o�^��")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * �X�V�҂�Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=79,columnJpName="�X�V��")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * �X�V����Ԃ��܂��B
     * @return �X�V�� ��߂��܂��B
     */
    @Override
    @LogInfo(columnIndex=80,columnJpName="�X�V��")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * �X�VAPP��Ԃ��܂��B
     * @return �X�VAPP ��߂��܂��B
     */
    @LogInfo(columnIndex=81,columnJpName="�X�VAPP")
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
    @LogInfo(columnIndex=82,columnJpName="�o�[�W�����ԍ�")
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
    	return "T104";
    }

    /**
     * �G���e�B�e�B���f���ɑΉ�����f�[�^�x�[�X�e�[�u���̃v���C�}���L�[�I�u�W�F�N�g�̒l���ꗗ�ŕԂ��܂��B
     * @return �v���C�}���L�[�I�u�W�F�N�g�l�̈ꗗ
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT104001()
                    ,getT104002()
    	};
    }


    /**
     * T104�ڋq�A�C�R���G���e�B�e�B���f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return T104�ڋq�A�C�R���G���e�B�e�B���f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "T104�ڋq�A�C�R��(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("�ǃR�[�h(t104001)", getT104001())
    		.append("�ڋq�R�[�h(t104002)", getT104002())
    		.append("�ڋq���(t104101)", getT104101())
    		.append("�_��҃R�[�h(t104102)", getT104102())
    		.append("���ڂP(t104211)", getT104211())
    		.append("��ԂP(t104212)", getT104212())
    		.append("���l�P(t104213)", getT104213())
    		.append("���ڂQ(t104221)", getT104221())
    		.append("��ԂQ(t104222)", getT104222())
    		.append("���l�Q(t104223)", getT104223())
    		.append("���ڂR(t104231)", getT104231())
    		.append("��ԂR(t104232)", getT104232())
    		.append("���l�R(t104233)", getT104233())
    		.append("���ڂS(t104241)", getT104241())
    		.append("��ԂS(t104242)", getT104242())
    		.append("���l�S(t104243)", getT104243())
    		.append("���ڂT(t104251)", getT104251())
    		.append("��ԂT(t104252)", getT104252())
    		.append("���l�T(t104253)", getT104253())
    		.append("���ڂU(t104261)", getT104261())
    		.append("��ԂU(t104262)", getT104262())
    		.append("���l�U(t104263)", getT104263())
    		.append("���ڂV(t104271)", getT104271())
    		.append("��ԂV(t104272)", getT104272())
    		.append("���l�V(t104273)", getT104273())
    		.append("���ڂW(t104281)", getT104281())
    		.append("��ԂW(t104282)", getT104282())
    		.append("���l�W(t104283)", getT104283())
    		.append("���ڂX(t104291)", getT104291())
    		.append("��ԂX(t104292)", getT104292())
    		.append("���l�X(t104293)", getT104293())
    		.append("���ڂP�O(t104301)", getT104301())
    		.append("��ԂP�O(t104302)", getT104302())
    		.append("���l�P�O(t104303)", getT104303())
    		.append("���ڂP�P(t104311)", getT104311())
    		.append("��ԂP�P(t104312)", getT104312())
    		.append("���l�P�P(t104313)", getT104313())
    		.append("���ڂP�Q(t104321)", getT104321())
    		.append("��ԂP�Q(t104322)", getT104322())
    		.append("���l�P�Q(t104323)", getT104323())
    		.append("���ڂP�R(t104331)", getT104331())
    		.append("��ԂP�R(t104332)", getT104332())
    		.append("���l�P�R(t104333)", getT104333())
    		.append("���ڂP�S(t104341)", getT104341())
    		.append("��ԂP�S(t104342)", getT104342())
    		.append("���l�P�S(t104343)", getT104343())
    		.append("���ڂP�T(t104351)", getT104351())
    		.append("��ԂP�T(t104352)", getT104352())
    		.append("���l�P�T(t104353)", getT104353())
    		.append("���ڂP�U(t104361)", getT104361())
    		.append("��ԂP�U(t104362)", getT104362())
    		.append("���l�P�U(t104363)", getT104363())
    		.append("���ڂP�V(t104371)", getT104371())
    		.append("��ԂP�V(t104372)", getT104372())
    		.append("���l�P�V(t104373)", getT104373())
    		.append("���ڂP�W(t104381)", getT104381())
    		.append("��ԂP�W(t104382)", getT104382())
    		.append("���l�P�W(t104383)", getT104383())
    		.append("���ڂP�X(t104391)", getT104391())
    		.append("��ԂP�X(t104392)", getT104392())
    		.append("���l�P�X(t104393)", getT104393())
    		.append("���ڂQ�O(t104401)", getT104401())
    		.append("��ԂQ�O(t104402)", getT104402())
    		.append("���l�Q�O(t104403)", getT104403())
    		.append("���ڂQ�P(t104411)", getT104411())
    		.append("��ԂQ�P(t104412)", getT104412())
    		.append("���l�Q�P(t104413)", getT104413())
    		.append("���ڂQ�Q(t104421)", getT104421())
    		.append("��ԂQ�Q(t104422)", getT104422())
    		.append("���l�Q�Q(t104423)", getT104423())
    		.append("���ڂQ�R(t104431)", getT104431())
    		.append("��ԂQ�R(t104432)", getT104432())
    		.append("���l�Q�R(t104433)", getT104433())
    		.append("���ڂQ�S(t104441)", getT104441())
    		.append("��ԂQ�S(t104442)", getT104442())
    		.append("���l�Q�S(t104443)", getT104443())
    		.append("�o�^��(creator)", getCreator())
    		.append("�o�^��(createTimestamp)", getCreateTimestamp())
    		.append("�X�V��(updater)", getUpdater())
    		.append("�X�V��(updateTimestamp)", getUpdateTimestamp())
    		.append("�X�VAPP(updateApp)", getUpdateApp())
    		.append("�o�[�W�����ԍ�(versionNo)", getVersionNo())
    		.toString();
    }

}
