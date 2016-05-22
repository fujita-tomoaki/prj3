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
 * T104ŒÚ‹qƒAƒCƒRƒ“‚ÌƒGƒ“ƒeƒBƒeƒBƒ‚ƒfƒ‹ƒNƒ‰ƒX‚Å‚·B<BR/>
 * 
 * ©“®¶¬‘ÎÛ‚Å‚·‚Ì‚ÅAÀ‘•Ò‚ÍŠg’£‚µ‚Ä‚Í‚¢‚¯‚Ü‚¹‚ñB
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT104EntityModel extends EntityModel implements Serializable {

//--- ƒvƒƒpƒeƒBƒtƒB[ƒ‹ƒh

    /** ‹ÇƒR[ƒh */
    private String t104001;
    /** ŒÚ‹qƒR[ƒh */
    private String t104002;
    /** ŒÚ‹qó‘Ô */
    private java.math.BigDecimal t104101;
    /** Œ_–ñÒƒR[ƒh */
    private String t104102;
    /** €–Ú‚P */
    private java.math.BigDecimal t104211;
    /** ó‘Ô‚P */
    private java.math.BigDecimal t104212;
    /** ”õl‚P */
    private String t104213;
    /** €–Ú‚Q */
    private java.math.BigDecimal t104221;
    /** ó‘Ô‚Q */
    private java.math.BigDecimal t104222;
    /** ”õl‚Q */
    private String t104223;
    /** €–Ú‚R */
    private java.math.BigDecimal t104231;
    /** ó‘Ô‚R */
    private java.math.BigDecimal t104232;
    /** ”õl‚R */
    private String t104233;
    /** €–Ú‚S */
    private java.math.BigDecimal t104241;
    /** ó‘Ô‚S */
    private java.math.BigDecimal t104242;
    /** ”õl‚S */
    private String t104243;
    /** €–Ú‚T */
    private java.math.BigDecimal t104251;
    /** ó‘Ô‚T */
    private java.math.BigDecimal t104252;
    /** ”õl‚T */
    private String t104253;
    /** €–Ú‚U */
    private java.math.BigDecimal t104261;
    /** ó‘Ô‚U */
    private java.math.BigDecimal t104262;
    /** ”õl‚U */
    private String t104263;
    /** €–Ú‚V */
    private java.math.BigDecimal t104271;
    /** ó‘Ô‚V */
    private java.math.BigDecimal t104272;
    /** ”õl‚V */
    private String t104273;
    /** €–Ú‚W */
    private java.math.BigDecimal t104281;
    /** ó‘Ô‚W */
    private java.math.BigDecimal t104282;
    /** ”õl‚W */
    private String t104283;
    /** €–Ú‚X */
    private java.math.BigDecimal t104291;
    /** ó‘Ô‚X */
    private java.math.BigDecimal t104292;
    /** ”õl‚X */
    private String t104293;
    /** €–Ú‚P‚O */
    private java.math.BigDecimal t104301;
    /** ó‘Ô‚P‚O */
    private java.math.BigDecimal t104302;
    /** ”õl‚P‚O */
    private String t104303;
    /** €–Ú‚P‚P */
    private java.math.BigDecimal t104311;
    /** ó‘Ô‚P‚P */
    private java.math.BigDecimal t104312;
    /** ”õl‚P‚P */
    private String t104313;
    /** €–Ú‚P‚Q */
    private java.math.BigDecimal t104321;
    /** ó‘Ô‚P‚Q */
    private java.math.BigDecimal t104322;
    /** ”õl‚P‚Q */
    private String t104323;
    /** €–Ú‚P‚R */
    private java.math.BigDecimal t104331;
    /** ó‘Ô‚P‚R */
    private java.math.BigDecimal t104332;
    /** ”õl‚P‚R */
    private String t104333;
    /** €–Ú‚P‚S */
    private java.math.BigDecimal t104341;
    /** ó‘Ô‚P‚S */
    private java.math.BigDecimal t104342;
    /** ”õl‚P‚S */
    private String t104343;
    /** €–Ú‚P‚T */
    private java.math.BigDecimal t104351;
    /** ó‘Ô‚P‚T */
    private java.math.BigDecimal t104352;
    /** ”õl‚P‚T */
    private String t104353;
    /** €–Ú‚P‚U */
    private java.math.BigDecimal t104361;
    /** ó‘Ô‚P‚U */
    private java.math.BigDecimal t104362;
    /** ”õl‚P‚U */
    private String t104363;
    /** €–Ú‚P‚V */
    private java.math.BigDecimal t104371;
    /** ó‘Ô‚P‚V */
    private java.math.BigDecimal t104372;
    /** ”õl‚P‚V */
    private String t104373;
    /** €–Ú‚P‚W */
    private java.math.BigDecimal t104381;
    /** ó‘Ô‚P‚W */
    private java.math.BigDecimal t104382;
    /** ”õl‚P‚W */
    private String t104383;
    /** €–Ú‚P‚X */
    private java.math.BigDecimal t104391;
    /** ó‘Ô‚P‚X */
    private java.math.BigDecimal t104392;
    /** ”õl‚P‚X */
    private String t104393;
    /** €–Ú‚Q‚O */
    private java.math.BigDecimal t104401;
    /** ó‘Ô‚Q‚O */
    private java.math.BigDecimal t104402;
    /** ”õl‚Q‚O */
    private String t104403;
    /** €–Ú‚Q‚P */
    private java.math.BigDecimal t104411;
    /** ó‘Ô‚Q‚P */
    private java.math.BigDecimal t104412;
    /** ”õl‚Q‚P */
    private String t104413;
    /** €–Ú‚Q‚Q */
    private java.math.BigDecimal t104421;
    /** ó‘Ô‚Q‚Q */
    private java.math.BigDecimal t104422;
    /** ”õl‚Q‚Q */
    private String t104423;
    /** €–Ú‚Q‚R */
    private java.math.BigDecimal t104431;
    /** ó‘Ô‚Q‚R */
    private java.math.BigDecimal t104432;
    /** ”õl‚Q‚R */
    private String t104433;
    /** €–Ú‚Q‚S */
    private java.math.BigDecimal t104441;
    /** ó‘Ô‚Q‚S */
    private java.math.BigDecimal t104442;
    /** ”õl‚Q‚S */
    private String t104443;
    /** XVAPP */
    private String updateApp;
    /** ƒo[ƒWƒ‡ƒ“”Ô† */
    private java.math.BigDecimal versionNo;

//--- ƒRƒ“ƒXƒgƒ‰ƒNƒ^

    /**
     * ‚±‚ÌƒIƒuƒWƒFƒNƒg‚ª¶¬‚³‚ê‚é‚Æ‚«‚ÉŒÄ‚Ño‚³‚ê‚Ü‚·B
     */
    public BaseT104EntityModel() {
        super();
    }

    /**
     * ƒRƒs[ƒRƒ“ƒXƒgƒ‰ƒNƒ^‚Å‚·B
     * @param baseT104EntityModel ƒRƒs[Œ³T104ŒÚ‹qƒAƒCƒRƒ“ƒGƒ“ƒeƒBƒeƒBƒ‚ƒfƒ‹
     */
    public BaseT104EntityModel(BaseT104EntityModel baseT104EntityModel) {
        super();
        //‹ÇƒR[ƒh‚ğİ’è‚µ‚Ü‚·
        setT104001(baseT104EntityModel.getT104001());
        //ŒÚ‹qƒR[ƒh‚ğİ’è‚µ‚Ü‚·
        setT104002(baseT104EntityModel.getT104002());
        //ŒÚ‹qó‘Ô‚ğİ’è‚µ‚Ü‚·
        setT104101(baseT104EntityModel.getT104101());
        //Œ_–ñÒƒR[ƒh‚ğİ’è‚µ‚Ü‚·
        setT104102(baseT104EntityModel.getT104102());
        //€–Ú‚P‚ğİ’è‚µ‚Ü‚·
        setT104211(baseT104EntityModel.getT104211());
        //ó‘Ô‚P‚ğİ’è‚µ‚Ü‚·
        setT104212(baseT104EntityModel.getT104212());
        //”õl‚P‚ğİ’è‚µ‚Ü‚·
        setT104213(baseT104EntityModel.getT104213());
        //€–Ú‚Q‚ğİ’è‚µ‚Ü‚·
        setT104221(baseT104EntityModel.getT104221());
        //ó‘Ô‚Q‚ğİ’è‚µ‚Ü‚·
        setT104222(baseT104EntityModel.getT104222());
        //”õl‚Q‚ğİ’è‚µ‚Ü‚·
        setT104223(baseT104EntityModel.getT104223());
        //€–Ú‚R‚ğİ’è‚µ‚Ü‚·
        setT104231(baseT104EntityModel.getT104231());
        //ó‘Ô‚R‚ğİ’è‚µ‚Ü‚·
        setT104232(baseT104EntityModel.getT104232());
        //”õl‚R‚ğİ’è‚µ‚Ü‚·
        setT104233(baseT104EntityModel.getT104233());
        //€–Ú‚S‚ğİ’è‚µ‚Ü‚·
        setT104241(baseT104EntityModel.getT104241());
        //ó‘Ô‚S‚ğİ’è‚µ‚Ü‚·
        setT104242(baseT104EntityModel.getT104242());
        //”õl‚S‚ğİ’è‚µ‚Ü‚·
        setT104243(baseT104EntityModel.getT104243());
        //€–Ú‚T‚ğİ’è‚µ‚Ü‚·
        setT104251(baseT104EntityModel.getT104251());
        //ó‘Ô‚T‚ğİ’è‚µ‚Ü‚·
        setT104252(baseT104EntityModel.getT104252());
        //”õl‚T‚ğİ’è‚µ‚Ü‚·
        setT104253(baseT104EntityModel.getT104253());
        //€–Ú‚U‚ğİ’è‚µ‚Ü‚·
        setT104261(baseT104EntityModel.getT104261());
        //ó‘Ô‚U‚ğİ’è‚µ‚Ü‚·
        setT104262(baseT104EntityModel.getT104262());
        //”õl‚U‚ğİ’è‚µ‚Ü‚·
        setT104263(baseT104EntityModel.getT104263());
        //€–Ú‚V‚ğİ’è‚µ‚Ü‚·
        setT104271(baseT104EntityModel.getT104271());
        //ó‘Ô‚V‚ğİ’è‚µ‚Ü‚·
        setT104272(baseT104EntityModel.getT104272());
        //”õl‚V‚ğİ’è‚µ‚Ü‚·
        setT104273(baseT104EntityModel.getT104273());
        //€–Ú‚W‚ğİ’è‚µ‚Ü‚·
        setT104281(baseT104EntityModel.getT104281());
        //ó‘Ô‚W‚ğİ’è‚µ‚Ü‚·
        setT104282(baseT104EntityModel.getT104282());
        //”õl‚W‚ğİ’è‚µ‚Ü‚·
        setT104283(baseT104EntityModel.getT104283());
        //€–Ú‚X‚ğİ’è‚µ‚Ü‚·
        setT104291(baseT104EntityModel.getT104291());
        //ó‘Ô‚X‚ğİ’è‚µ‚Ü‚·
        setT104292(baseT104EntityModel.getT104292());
        //”õl‚X‚ğİ’è‚µ‚Ü‚·
        setT104293(baseT104EntityModel.getT104293());
        //€–Ú‚P‚O‚ğİ’è‚µ‚Ü‚·
        setT104301(baseT104EntityModel.getT104301());
        //ó‘Ô‚P‚O‚ğİ’è‚µ‚Ü‚·
        setT104302(baseT104EntityModel.getT104302());
        //”õl‚P‚O‚ğİ’è‚µ‚Ü‚·
        setT104303(baseT104EntityModel.getT104303());
        //€–Ú‚P‚P‚ğİ’è‚µ‚Ü‚·
        setT104311(baseT104EntityModel.getT104311());
        //ó‘Ô‚P‚P‚ğİ’è‚µ‚Ü‚·
        setT104312(baseT104EntityModel.getT104312());
        //”õl‚P‚P‚ğİ’è‚µ‚Ü‚·
        setT104313(baseT104EntityModel.getT104313());
        //€–Ú‚P‚Q‚ğİ’è‚µ‚Ü‚·
        setT104321(baseT104EntityModel.getT104321());
        //ó‘Ô‚P‚Q‚ğİ’è‚µ‚Ü‚·
        setT104322(baseT104EntityModel.getT104322());
        //”õl‚P‚Q‚ğİ’è‚µ‚Ü‚·
        setT104323(baseT104EntityModel.getT104323());
        //€–Ú‚P‚R‚ğİ’è‚µ‚Ü‚·
        setT104331(baseT104EntityModel.getT104331());
        //ó‘Ô‚P‚R‚ğİ’è‚µ‚Ü‚·
        setT104332(baseT104EntityModel.getT104332());
        //”õl‚P‚R‚ğİ’è‚µ‚Ü‚·
        setT104333(baseT104EntityModel.getT104333());
        //€–Ú‚P‚S‚ğİ’è‚µ‚Ü‚·
        setT104341(baseT104EntityModel.getT104341());
        //ó‘Ô‚P‚S‚ğİ’è‚µ‚Ü‚·
        setT104342(baseT104EntityModel.getT104342());
        //”õl‚P‚S‚ğİ’è‚µ‚Ü‚·
        setT104343(baseT104EntityModel.getT104343());
        //€–Ú‚P‚T‚ğİ’è‚µ‚Ü‚·
        setT104351(baseT104EntityModel.getT104351());
        //ó‘Ô‚P‚T‚ğİ’è‚µ‚Ü‚·
        setT104352(baseT104EntityModel.getT104352());
        //”õl‚P‚T‚ğİ’è‚µ‚Ü‚·
        setT104353(baseT104EntityModel.getT104353());
        //€–Ú‚P‚U‚ğİ’è‚µ‚Ü‚·
        setT104361(baseT104EntityModel.getT104361());
        //ó‘Ô‚P‚U‚ğİ’è‚µ‚Ü‚·
        setT104362(baseT104EntityModel.getT104362());
        //”õl‚P‚U‚ğİ’è‚µ‚Ü‚·
        setT104363(baseT104EntityModel.getT104363());
        //€–Ú‚P‚V‚ğİ’è‚µ‚Ü‚·
        setT104371(baseT104EntityModel.getT104371());
        //ó‘Ô‚P‚V‚ğİ’è‚µ‚Ü‚·
        setT104372(baseT104EntityModel.getT104372());
        //”õl‚P‚V‚ğİ’è‚µ‚Ü‚·
        setT104373(baseT104EntityModel.getT104373());
        //€–Ú‚P‚W‚ğİ’è‚µ‚Ü‚·
        setT104381(baseT104EntityModel.getT104381());
        //ó‘Ô‚P‚W‚ğİ’è‚µ‚Ü‚·
        setT104382(baseT104EntityModel.getT104382());
        //”õl‚P‚W‚ğİ’è‚µ‚Ü‚·
        setT104383(baseT104EntityModel.getT104383());
        //€–Ú‚P‚X‚ğİ’è‚µ‚Ü‚·
        setT104391(baseT104EntityModel.getT104391());
        //ó‘Ô‚P‚X‚ğİ’è‚µ‚Ü‚·
        setT104392(baseT104EntityModel.getT104392());
        //”õl‚P‚X‚ğİ’è‚µ‚Ü‚·
        setT104393(baseT104EntityModel.getT104393());
        //€–Ú‚Q‚O‚ğİ’è‚µ‚Ü‚·
        setT104401(baseT104EntityModel.getT104401());
        //ó‘Ô‚Q‚O‚ğİ’è‚µ‚Ü‚·
        setT104402(baseT104EntityModel.getT104402());
        //”õl‚Q‚O‚ğİ’è‚µ‚Ü‚·
        setT104403(baseT104EntityModel.getT104403());
        //€–Ú‚Q‚P‚ğİ’è‚µ‚Ü‚·
        setT104411(baseT104EntityModel.getT104411());
        //ó‘Ô‚Q‚P‚ğİ’è‚µ‚Ü‚·
        setT104412(baseT104EntityModel.getT104412());
        //”õl‚Q‚P‚ğİ’è‚µ‚Ü‚·
        setT104413(baseT104EntityModel.getT104413());
        //€–Ú‚Q‚Q‚ğİ’è‚µ‚Ü‚·
        setT104421(baseT104EntityModel.getT104421());
        //ó‘Ô‚Q‚Q‚ğİ’è‚µ‚Ü‚·
        setT104422(baseT104EntityModel.getT104422());
        //”õl‚Q‚Q‚ğİ’è‚µ‚Ü‚·
        setT104423(baseT104EntityModel.getT104423());
        //€–Ú‚Q‚R‚ğİ’è‚µ‚Ü‚·
        setT104431(baseT104EntityModel.getT104431());
        //ó‘Ô‚Q‚R‚ğİ’è‚µ‚Ü‚·
        setT104432(baseT104EntityModel.getT104432());
        //”õl‚Q‚R‚ğİ’è‚µ‚Ü‚·
        setT104433(baseT104EntityModel.getT104433());
        //€–Ú‚Q‚S‚ğİ’è‚µ‚Ü‚·
        setT104441(baseT104EntityModel.getT104441());
        //ó‘Ô‚Q‚S‚ğİ’è‚µ‚Ü‚·
        setT104442(baseT104EntityModel.getT104442());
        //”õl‚Q‚S‚ğİ’è‚µ‚Ü‚·
        setT104443(baseT104EntityModel.getT104443());
        //“o˜^Ò‚ğİ’è‚µ‚Ü‚·
        setCreator(baseT104EntityModel.getCreator());
        //“o˜^“ú‚ğİ’è‚µ‚Ü‚·
        setCreateTimestamp(baseT104EntityModel.getCreateTimestamp());
        //XVÒ‚ğİ’è‚µ‚Ü‚·
        setUpdater(baseT104EntityModel.getUpdater());
        //XV“ú‚ğİ’è‚µ‚Ü‚·
        setUpdateTimestamp(baseT104EntityModel.getUpdateTimestamp());
        //XVAPP‚ğİ’è‚µ‚Ü‚·
        setUpdateApp(baseT104EntityModel.getUpdateApp());
        //ƒo[ƒWƒ‡ƒ“”Ô†‚ğİ’è‚µ‚Ü‚·
        setVersionNo(baseT104EntityModel.getVersionNo());
        //‰i‘±‰»ƒtƒ‰ƒO‚ğİ’è‚µ‚Ü‚·
        setPersist(baseT104EntityModel.isPersist());
    }

//--- ƒvƒƒpƒeƒBƒƒ\ƒbƒh

    /**
     * ‹ÇƒR[ƒh‚ğ•Ô‚µ‚Ü‚·B
     * @return ‹ÇƒR[ƒh ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=1,columnJpName="‹ÇƒR[ƒh")
    public String getT104001() {
        return t104001;
    }
    
    /**
     * ‹ÇƒR[ƒh‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104001 ‹ÇƒR[ƒh ‚ğİ’èB
     */
    public void setT104001(String t104001) {
        this.t104001 = t104001;
    }
    /**
     * ŒÚ‹qƒR[ƒh‚ğ•Ô‚µ‚Ü‚·B
     * @return ŒÚ‹qƒR[ƒh ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=2,columnJpName="ŒÚ‹qƒR[ƒh")
    public String getT104002() {
        return t104002;
    }
    
    /**
     * ŒÚ‹qƒR[ƒh‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104002 ŒÚ‹qƒR[ƒh ‚ğİ’èB
     */
    public void setT104002(String t104002) {
        this.t104002 = t104002;
    }
    /**
     * ŒÚ‹qó‘Ô‚ğ•Ô‚µ‚Ü‚·B
     * @return ŒÚ‹qó‘Ô ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=3,columnJpName="ŒÚ‹qó‘Ô")
    public java.math.BigDecimal getT104101() {
        return t104101;
    }
    
    /**
     * ŒÚ‹qó‘Ô‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104101 ŒÚ‹qó‘Ô ‚ğİ’èB
     */
    public void setT104101(java.math.BigDecimal t104101) {
        this.t104101 = t104101;
    }
    /**
     * Œ_–ñÒƒR[ƒh‚ğ•Ô‚µ‚Ü‚·B
     * @return Œ_–ñÒƒR[ƒh ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=4,columnJpName="Œ_–ñÒƒR[ƒh")
    public String getT104102() {
        return t104102;
    }
    
    /**
     * Œ_–ñÒƒR[ƒh‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104102 Œ_–ñÒƒR[ƒh ‚ğİ’èB
     */
    public void setT104102(String t104102) {
        this.t104102 = t104102;
    }
    /**
     * €–Ú‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=5,columnJpName="€–Ú‚P")
    public java.math.BigDecimal getT104211() {
        return t104211;
    }
    
    /**
     * €–Ú‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104211 €–Ú‚P ‚ğİ’èB
     */
    public void setT104211(java.math.BigDecimal t104211) {
        this.t104211 = t104211;
    }
    /**
     * ó‘Ô‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=6,columnJpName="ó‘Ô‚P")
    public java.math.BigDecimal getT104212() {
        return t104212;
    }
    
    /**
     * ó‘Ô‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104212 ó‘Ô‚P ‚ğİ’èB
     */
    public void setT104212(java.math.BigDecimal t104212) {
        this.t104212 = t104212;
    }
    /**
     * ”õl‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=7,columnJpName="”õl‚P")
    public String getT104213() {
        return t104213;
    }
    
    /**
     * ”õl‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104213 ”õl‚P ‚ğİ’èB
     */
    public void setT104213(String t104213) {
        this.t104213 = t104213;
    }
    /**
     * €–Ú‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=8,columnJpName="€–Ú‚Q")
    public java.math.BigDecimal getT104221() {
        return t104221;
    }
    
    /**
     * €–Ú‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104221 €–Ú‚Q ‚ğİ’èB
     */
    public void setT104221(java.math.BigDecimal t104221) {
        this.t104221 = t104221;
    }
    /**
     * ó‘Ô‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=9,columnJpName="ó‘Ô‚Q")
    public java.math.BigDecimal getT104222() {
        return t104222;
    }
    
    /**
     * ó‘Ô‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104222 ó‘Ô‚Q ‚ğİ’èB
     */
    public void setT104222(java.math.BigDecimal t104222) {
        this.t104222 = t104222;
    }
    /**
     * ”õl‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=10,columnJpName="”õl‚Q")
    public String getT104223() {
        return t104223;
    }
    
    /**
     * ”õl‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104223 ”õl‚Q ‚ğİ’èB
     */
    public void setT104223(String t104223) {
        this.t104223 = t104223;
    }
    /**
     * €–Ú‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=11,columnJpName="€–Ú‚R")
    public java.math.BigDecimal getT104231() {
        return t104231;
    }
    
    /**
     * €–Ú‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104231 €–Ú‚R ‚ğİ’èB
     */
    public void setT104231(java.math.BigDecimal t104231) {
        this.t104231 = t104231;
    }
    /**
     * ó‘Ô‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=12,columnJpName="ó‘Ô‚R")
    public java.math.BigDecimal getT104232() {
        return t104232;
    }
    
    /**
     * ó‘Ô‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104232 ó‘Ô‚R ‚ğİ’èB
     */
    public void setT104232(java.math.BigDecimal t104232) {
        this.t104232 = t104232;
    }
    /**
     * ”õl‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=13,columnJpName="”õl‚R")
    public String getT104233() {
        return t104233;
    }
    
    /**
     * ”õl‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104233 ”õl‚R ‚ğİ’èB
     */
    public void setT104233(String t104233) {
        this.t104233 = t104233;
    }
    /**
     * €–Ú‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=14,columnJpName="€–Ú‚S")
    public java.math.BigDecimal getT104241() {
        return t104241;
    }
    
    /**
     * €–Ú‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104241 €–Ú‚S ‚ğİ’èB
     */
    public void setT104241(java.math.BigDecimal t104241) {
        this.t104241 = t104241;
    }
    /**
     * ó‘Ô‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=15,columnJpName="ó‘Ô‚S")
    public java.math.BigDecimal getT104242() {
        return t104242;
    }
    
    /**
     * ó‘Ô‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104242 ó‘Ô‚S ‚ğİ’èB
     */
    public void setT104242(java.math.BigDecimal t104242) {
        this.t104242 = t104242;
    }
    /**
     * ”õl‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=16,columnJpName="”õl‚S")
    public String getT104243() {
        return t104243;
    }
    
    /**
     * ”õl‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104243 ”õl‚S ‚ğİ’èB
     */
    public void setT104243(String t104243) {
        this.t104243 = t104243;
    }
    /**
     * €–Ú‚T‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚T ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=17,columnJpName="€–Ú‚T")
    public java.math.BigDecimal getT104251() {
        return t104251;
    }
    
    /**
     * €–Ú‚T‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104251 €–Ú‚T ‚ğİ’èB
     */
    public void setT104251(java.math.BigDecimal t104251) {
        this.t104251 = t104251;
    }
    /**
     * ó‘Ô‚T‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚T ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=18,columnJpName="ó‘Ô‚T")
    public java.math.BigDecimal getT104252() {
        return t104252;
    }
    
    /**
     * ó‘Ô‚T‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104252 ó‘Ô‚T ‚ğİ’èB
     */
    public void setT104252(java.math.BigDecimal t104252) {
        this.t104252 = t104252;
    }
    /**
     * ”õl‚T‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚T ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=19,columnJpName="”õl‚T")
    public String getT104253() {
        return t104253;
    }
    
    /**
     * ”õl‚T‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104253 ”õl‚T ‚ğİ’èB
     */
    public void setT104253(String t104253) {
        this.t104253 = t104253;
    }
    /**
     * €–Ú‚U‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚U ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=20,columnJpName="€–Ú‚U")
    public java.math.BigDecimal getT104261() {
        return t104261;
    }
    
    /**
     * €–Ú‚U‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104261 €–Ú‚U ‚ğİ’èB
     */
    public void setT104261(java.math.BigDecimal t104261) {
        this.t104261 = t104261;
    }
    /**
     * ó‘Ô‚U‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚U ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=21,columnJpName="ó‘Ô‚U")
    public java.math.BigDecimal getT104262() {
        return t104262;
    }
    
    /**
     * ó‘Ô‚U‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104262 ó‘Ô‚U ‚ğİ’èB
     */
    public void setT104262(java.math.BigDecimal t104262) {
        this.t104262 = t104262;
    }
    /**
     * ”õl‚U‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚U ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=22,columnJpName="”õl‚U")
    public String getT104263() {
        return t104263;
    }
    
    /**
     * ”õl‚U‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104263 ”õl‚U ‚ğİ’èB
     */
    public void setT104263(String t104263) {
        this.t104263 = t104263;
    }
    /**
     * €–Ú‚V‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚V ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=23,columnJpName="€–Ú‚V")
    public java.math.BigDecimal getT104271() {
        return t104271;
    }
    
    /**
     * €–Ú‚V‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104271 €–Ú‚V ‚ğİ’èB
     */
    public void setT104271(java.math.BigDecimal t104271) {
        this.t104271 = t104271;
    }
    /**
     * ó‘Ô‚V‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚V ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=24,columnJpName="ó‘Ô‚V")
    public java.math.BigDecimal getT104272() {
        return t104272;
    }
    
    /**
     * ó‘Ô‚V‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104272 ó‘Ô‚V ‚ğİ’èB
     */
    public void setT104272(java.math.BigDecimal t104272) {
        this.t104272 = t104272;
    }
    /**
     * ”õl‚V‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚V ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=25,columnJpName="”õl‚V")
    public String getT104273() {
        return t104273;
    }
    
    /**
     * ”õl‚V‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104273 ”õl‚V ‚ğİ’èB
     */
    public void setT104273(String t104273) {
        this.t104273 = t104273;
    }
    /**
     * €–Ú‚W‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚W ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=26,columnJpName="€–Ú‚W")
    public java.math.BigDecimal getT104281() {
        return t104281;
    }
    
    /**
     * €–Ú‚W‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104281 €–Ú‚W ‚ğİ’èB
     */
    public void setT104281(java.math.BigDecimal t104281) {
        this.t104281 = t104281;
    }
    /**
     * ó‘Ô‚W‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚W ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=27,columnJpName="ó‘Ô‚W")
    public java.math.BigDecimal getT104282() {
        return t104282;
    }
    
    /**
     * ó‘Ô‚W‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104282 ó‘Ô‚W ‚ğİ’èB
     */
    public void setT104282(java.math.BigDecimal t104282) {
        this.t104282 = t104282;
    }
    /**
     * ”õl‚W‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚W ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=28,columnJpName="”õl‚W")
    public String getT104283() {
        return t104283;
    }
    
    /**
     * ”õl‚W‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104283 ”õl‚W ‚ğİ’èB
     */
    public void setT104283(String t104283) {
        this.t104283 = t104283;
    }
    /**
     * €–Ú‚X‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚X ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=29,columnJpName="€–Ú‚X")
    public java.math.BigDecimal getT104291() {
        return t104291;
    }
    
    /**
     * €–Ú‚X‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104291 €–Ú‚X ‚ğİ’èB
     */
    public void setT104291(java.math.BigDecimal t104291) {
        this.t104291 = t104291;
    }
    /**
     * ó‘Ô‚X‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚X ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=30,columnJpName="ó‘Ô‚X")
    public java.math.BigDecimal getT104292() {
        return t104292;
    }
    
    /**
     * ó‘Ô‚X‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104292 ó‘Ô‚X ‚ğİ’èB
     */
    public void setT104292(java.math.BigDecimal t104292) {
        this.t104292 = t104292;
    }
    /**
     * ”õl‚X‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚X ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=31,columnJpName="”õl‚X")
    public String getT104293() {
        return t104293;
    }
    
    /**
     * ”õl‚X‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104293 ”õl‚X ‚ğİ’èB
     */
    public void setT104293(String t104293) {
        this.t104293 = t104293;
    }
    /**
     * €–Ú‚P‚O‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚O ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=32,columnJpName="€–Ú‚P‚O")
    public java.math.BigDecimal getT104301() {
        return t104301;
    }
    
    /**
     * €–Ú‚P‚O‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104301 €–Ú‚P‚O ‚ğİ’èB
     */
    public void setT104301(java.math.BigDecimal t104301) {
        this.t104301 = t104301;
    }
    /**
     * ó‘Ô‚P‚O‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚O ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=33,columnJpName="ó‘Ô‚P‚O")
    public java.math.BigDecimal getT104302() {
        return t104302;
    }
    
    /**
     * ó‘Ô‚P‚O‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104302 ó‘Ô‚P‚O ‚ğİ’èB
     */
    public void setT104302(java.math.BigDecimal t104302) {
        this.t104302 = t104302;
    }
    /**
     * ”õl‚P‚O‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚O ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=34,columnJpName="”õl‚P‚O")
    public String getT104303() {
        return t104303;
    }
    
    /**
     * ”õl‚P‚O‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104303 ”õl‚P‚O ‚ğİ’èB
     */
    public void setT104303(String t104303) {
        this.t104303 = t104303;
    }
    /**
     * €–Ú‚P‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=35,columnJpName="€–Ú‚P‚P")
    public java.math.BigDecimal getT104311() {
        return t104311;
    }
    
    /**
     * €–Ú‚P‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104311 €–Ú‚P‚P ‚ğİ’èB
     */
    public void setT104311(java.math.BigDecimal t104311) {
        this.t104311 = t104311;
    }
    /**
     * ó‘Ô‚P‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=36,columnJpName="ó‘Ô‚P‚P")
    public java.math.BigDecimal getT104312() {
        return t104312;
    }
    
    /**
     * ó‘Ô‚P‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104312 ó‘Ô‚P‚P ‚ğİ’èB
     */
    public void setT104312(java.math.BigDecimal t104312) {
        this.t104312 = t104312;
    }
    /**
     * ”õl‚P‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=37,columnJpName="”õl‚P‚P")
    public String getT104313() {
        return t104313;
    }
    
    /**
     * ”õl‚P‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104313 ”õl‚P‚P ‚ğİ’èB
     */
    public void setT104313(String t104313) {
        this.t104313 = t104313;
    }
    /**
     * €–Ú‚P‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=38,columnJpName="€–Ú‚P‚Q")
    public java.math.BigDecimal getT104321() {
        return t104321;
    }
    
    /**
     * €–Ú‚P‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104321 €–Ú‚P‚Q ‚ğİ’èB
     */
    public void setT104321(java.math.BigDecimal t104321) {
        this.t104321 = t104321;
    }
    /**
     * ó‘Ô‚P‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=39,columnJpName="ó‘Ô‚P‚Q")
    public java.math.BigDecimal getT104322() {
        return t104322;
    }
    
    /**
     * ó‘Ô‚P‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104322 ó‘Ô‚P‚Q ‚ğİ’èB
     */
    public void setT104322(java.math.BigDecimal t104322) {
        this.t104322 = t104322;
    }
    /**
     * ”õl‚P‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=40,columnJpName="”õl‚P‚Q")
    public String getT104323() {
        return t104323;
    }
    
    /**
     * ”õl‚P‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104323 ”õl‚P‚Q ‚ğİ’èB
     */
    public void setT104323(String t104323) {
        this.t104323 = t104323;
    }
    /**
     * €–Ú‚P‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=41,columnJpName="€–Ú‚P‚R")
    public java.math.BigDecimal getT104331() {
        return t104331;
    }
    
    /**
     * €–Ú‚P‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104331 €–Ú‚P‚R ‚ğİ’èB
     */
    public void setT104331(java.math.BigDecimal t104331) {
        this.t104331 = t104331;
    }
    /**
     * ó‘Ô‚P‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=42,columnJpName="ó‘Ô‚P‚R")
    public java.math.BigDecimal getT104332() {
        return t104332;
    }
    
    /**
     * ó‘Ô‚P‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104332 ó‘Ô‚P‚R ‚ğİ’èB
     */
    public void setT104332(java.math.BigDecimal t104332) {
        this.t104332 = t104332;
    }
    /**
     * ”õl‚P‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=43,columnJpName="”õl‚P‚R")
    public String getT104333() {
        return t104333;
    }
    
    /**
     * ”õl‚P‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104333 ”õl‚P‚R ‚ğİ’èB
     */
    public void setT104333(String t104333) {
        this.t104333 = t104333;
    }
    /**
     * €–Ú‚P‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=44,columnJpName="€–Ú‚P‚S")
    public java.math.BigDecimal getT104341() {
        return t104341;
    }
    
    /**
     * €–Ú‚P‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104341 €–Ú‚P‚S ‚ğİ’èB
     */
    public void setT104341(java.math.BigDecimal t104341) {
        this.t104341 = t104341;
    }
    /**
     * ó‘Ô‚P‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=45,columnJpName="ó‘Ô‚P‚S")
    public java.math.BigDecimal getT104342() {
        return t104342;
    }
    
    /**
     * ó‘Ô‚P‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104342 ó‘Ô‚P‚S ‚ğİ’èB
     */
    public void setT104342(java.math.BigDecimal t104342) {
        this.t104342 = t104342;
    }
    /**
     * ”õl‚P‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=46,columnJpName="”õl‚P‚S")
    public String getT104343() {
        return t104343;
    }
    
    /**
     * ”õl‚P‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104343 ”õl‚P‚S ‚ğİ’èB
     */
    public void setT104343(String t104343) {
        this.t104343 = t104343;
    }
    /**
     * €–Ú‚P‚T‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚T ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=47,columnJpName="€–Ú‚P‚T")
    public java.math.BigDecimal getT104351() {
        return t104351;
    }
    
    /**
     * €–Ú‚P‚T‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104351 €–Ú‚P‚T ‚ğİ’èB
     */
    public void setT104351(java.math.BigDecimal t104351) {
        this.t104351 = t104351;
    }
    /**
     * ó‘Ô‚P‚T‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚T ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=48,columnJpName="ó‘Ô‚P‚T")
    public java.math.BigDecimal getT104352() {
        return t104352;
    }
    
    /**
     * ó‘Ô‚P‚T‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104352 ó‘Ô‚P‚T ‚ğİ’èB
     */
    public void setT104352(java.math.BigDecimal t104352) {
        this.t104352 = t104352;
    }
    /**
     * ”õl‚P‚T‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚T ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=49,columnJpName="”õl‚P‚T")
    public String getT104353() {
        return t104353;
    }
    
    /**
     * ”õl‚P‚T‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104353 ”õl‚P‚T ‚ğİ’èB
     */
    public void setT104353(String t104353) {
        this.t104353 = t104353;
    }
    /**
     * €–Ú‚P‚U‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚U ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=50,columnJpName="€–Ú‚P‚U")
    public java.math.BigDecimal getT104361() {
        return t104361;
    }
    
    /**
     * €–Ú‚P‚U‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104361 €–Ú‚P‚U ‚ğİ’èB
     */
    public void setT104361(java.math.BigDecimal t104361) {
        this.t104361 = t104361;
    }
    /**
     * ó‘Ô‚P‚U‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚U ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=51,columnJpName="ó‘Ô‚P‚U")
    public java.math.BigDecimal getT104362() {
        return t104362;
    }
    
    /**
     * ó‘Ô‚P‚U‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104362 ó‘Ô‚P‚U ‚ğİ’èB
     */
    public void setT104362(java.math.BigDecimal t104362) {
        this.t104362 = t104362;
    }
    /**
     * ”õl‚P‚U‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚U ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=52,columnJpName="”õl‚P‚U")
    public String getT104363() {
        return t104363;
    }
    
    /**
     * ”õl‚P‚U‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104363 ”õl‚P‚U ‚ğİ’èB
     */
    public void setT104363(String t104363) {
        this.t104363 = t104363;
    }
    /**
     * €–Ú‚P‚V‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚V ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=53,columnJpName="€–Ú‚P‚V")
    public java.math.BigDecimal getT104371() {
        return t104371;
    }
    
    /**
     * €–Ú‚P‚V‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104371 €–Ú‚P‚V ‚ğİ’èB
     */
    public void setT104371(java.math.BigDecimal t104371) {
        this.t104371 = t104371;
    }
    /**
     * ó‘Ô‚P‚V‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚V ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=54,columnJpName="ó‘Ô‚P‚V")
    public java.math.BigDecimal getT104372() {
        return t104372;
    }
    
    /**
     * ó‘Ô‚P‚V‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104372 ó‘Ô‚P‚V ‚ğİ’èB
     */
    public void setT104372(java.math.BigDecimal t104372) {
        this.t104372 = t104372;
    }
    /**
     * ”õl‚P‚V‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚V ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=55,columnJpName="”õl‚P‚V")
    public String getT104373() {
        return t104373;
    }
    
    /**
     * ”õl‚P‚V‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104373 ”õl‚P‚V ‚ğİ’èB
     */
    public void setT104373(String t104373) {
        this.t104373 = t104373;
    }
    /**
     * €–Ú‚P‚W‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚W ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=56,columnJpName="€–Ú‚P‚W")
    public java.math.BigDecimal getT104381() {
        return t104381;
    }
    
    /**
     * €–Ú‚P‚W‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104381 €–Ú‚P‚W ‚ğİ’èB
     */
    public void setT104381(java.math.BigDecimal t104381) {
        this.t104381 = t104381;
    }
    /**
     * ó‘Ô‚P‚W‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚W ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=57,columnJpName="ó‘Ô‚P‚W")
    public java.math.BigDecimal getT104382() {
        return t104382;
    }
    
    /**
     * ó‘Ô‚P‚W‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104382 ó‘Ô‚P‚W ‚ğİ’èB
     */
    public void setT104382(java.math.BigDecimal t104382) {
        this.t104382 = t104382;
    }
    /**
     * ”õl‚P‚W‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚W ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=58,columnJpName="”õl‚P‚W")
    public String getT104383() {
        return t104383;
    }
    
    /**
     * ”õl‚P‚W‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104383 ”õl‚P‚W ‚ğİ’èB
     */
    public void setT104383(String t104383) {
        this.t104383 = t104383;
    }
    /**
     * €–Ú‚P‚X‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚P‚X ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=59,columnJpName="€–Ú‚P‚X")
    public java.math.BigDecimal getT104391() {
        return t104391;
    }
    
    /**
     * €–Ú‚P‚X‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104391 €–Ú‚P‚X ‚ğİ’èB
     */
    public void setT104391(java.math.BigDecimal t104391) {
        this.t104391 = t104391;
    }
    /**
     * ó‘Ô‚P‚X‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚P‚X ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=60,columnJpName="ó‘Ô‚P‚X")
    public java.math.BigDecimal getT104392() {
        return t104392;
    }
    
    /**
     * ó‘Ô‚P‚X‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104392 ó‘Ô‚P‚X ‚ğİ’èB
     */
    public void setT104392(java.math.BigDecimal t104392) {
        this.t104392 = t104392;
    }
    /**
     * ”õl‚P‚X‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚P‚X ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=61,columnJpName="”õl‚P‚X")
    public String getT104393() {
        return t104393;
    }
    
    /**
     * ”õl‚P‚X‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104393 ”õl‚P‚X ‚ğİ’èB
     */
    public void setT104393(String t104393) {
        this.t104393 = t104393;
    }
    /**
     * €–Ú‚Q‚O‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚Q‚O ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=62,columnJpName="€–Ú‚Q‚O")
    public java.math.BigDecimal getT104401() {
        return t104401;
    }
    
    /**
     * €–Ú‚Q‚O‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104401 €–Ú‚Q‚O ‚ğİ’èB
     */
    public void setT104401(java.math.BigDecimal t104401) {
        this.t104401 = t104401;
    }
    /**
     * ó‘Ô‚Q‚O‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚Q‚O ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=63,columnJpName="ó‘Ô‚Q‚O")
    public java.math.BigDecimal getT104402() {
        return t104402;
    }
    
    /**
     * ó‘Ô‚Q‚O‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104402 ó‘Ô‚Q‚O ‚ğİ’èB
     */
    public void setT104402(java.math.BigDecimal t104402) {
        this.t104402 = t104402;
    }
    /**
     * ”õl‚Q‚O‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚Q‚O ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=64,columnJpName="”õl‚Q‚O")
    public String getT104403() {
        return t104403;
    }
    
    /**
     * ”õl‚Q‚O‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104403 ”õl‚Q‚O ‚ğİ’èB
     */
    public void setT104403(String t104403) {
        this.t104403 = t104403;
    }
    /**
     * €–Ú‚Q‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚Q‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=65,columnJpName="€–Ú‚Q‚P")
    public java.math.BigDecimal getT104411() {
        return t104411;
    }
    
    /**
     * €–Ú‚Q‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104411 €–Ú‚Q‚P ‚ğİ’èB
     */
    public void setT104411(java.math.BigDecimal t104411) {
        this.t104411 = t104411;
    }
    /**
     * ó‘Ô‚Q‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚Q‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=66,columnJpName="ó‘Ô‚Q‚P")
    public java.math.BigDecimal getT104412() {
        return t104412;
    }
    
    /**
     * ó‘Ô‚Q‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104412 ó‘Ô‚Q‚P ‚ğİ’èB
     */
    public void setT104412(java.math.BigDecimal t104412) {
        this.t104412 = t104412;
    }
    /**
     * ”õl‚Q‚P‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚Q‚P ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=67,columnJpName="”õl‚Q‚P")
    public String getT104413() {
        return t104413;
    }
    
    /**
     * ”õl‚Q‚P‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104413 ”õl‚Q‚P ‚ğİ’èB
     */
    public void setT104413(String t104413) {
        this.t104413 = t104413;
    }
    /**
     * €–Ú‚Q‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚Q‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=68,columnJpName="€–Ú‚Q‚Q")
    public java.math.BigDecimal getT104421() {
        return t104421;
    }
    
    /**
     * €–Ú‚Q‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104421 €–Ú‚Q‚Q ‚ğİ’èB
     */
    public void setT104421(java.math.BigDecimal t104421) {
        this.t104421 = t104421;
    }
    /**
     * ó‘Ô‚Q‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚Q‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=69,columnJpName="ó‘Ô‚Q‚Q")
    public java.math.BigDecimal getT104422() {
        return t104422;
    }
    
    /**
     * ó‘Ô‚Q‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104422 ó‘Ô‚Q‚Q ‚ğİ’èB
     */
    public void setT104422(java.math.BigDecimal t104422) {
        this.t104422 = t104422;
    }
    /**
     * ”õl‚Q‚Q‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚Q‚Q ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=70,columnJpName="”õl‚Q‚Q")
    public String getT104423() {
        return t104423;
    }
    
    /**
     * ”õl‚Q‚Q‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104423 ”õl‚Q‚Q ‚ğİ’èB
     */
    public void setT104423(String t104423) {
        this.t104423 = t104423;
    }
    /**
     * €–Ú‚Q‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚Q‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=71,columnJpName="€–Ú‚Q‚R")
    public java.math.BigDecimal getT104431() {
        return t104431;
    }
    
    /**
     * €–Ú‚Q‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104431 €–Ú‚Q‚R ‚ğİ’èB
     */
    public void setT104431(java.math.BigDecimal t104431) {
        this.t104431 = t104431;
    }
    /**
     * ó‘Ô‚Q‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚Q‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=72,columnJpName="ó‘Ô‚Q‚R")
    public java.math.BigDecimal getT104432() {
        return t104432;
    }
    
    /**
     * ó‘Ô‚Q‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104432 ó‘Ô‚Q‚R ‚ğİ’èB
     */
    public void setT104432(java.math.BigDecimal t104432) {
        this.t104432 = t104432;
    }
    /**
     * ”õl‚Q‚R‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚Q‚R ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=73,columnJpName="”õl‚Q‚R")
    public String getT104433() {
        return t104433;
    }
    
    /**
     * ”õl‚Q‚R‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104433 ”õl‚Q‚R ‚ğİ’èB
     */
    public void setT104433(String t104433) {
        this.t104433 = t104433;
    }
    /**
     * €–Ú‚Q‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return €–Ú‚Q‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=74,columnJpName="€–Ú‚Q‚S")
    public java.math.BigDecimal getT104441() {
        return t104441;
    }
    
    /**
     * €–Ú‚Q‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104441 €–Ú‚Q‚S ‚ğİ’èB
     */
    public void setT104441(java.math.BigDecimal t104441) {
        this.t104441 = t104441;
    }
    /**
     * ó‘Ô‚Q‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return ó‘Ô‚Q‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=75,columnJpName="ó‘Ô‚Q‚S")
    public java.math.BigDecimal getT104442() {
        return t104442;
    }
    
    /**
     * ó‘Ô‚Q‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104442 ó‘Ô‚Q‚S ‚ğİ’èB
     */
    public void setT104442(java.math.BigDecimal t104442) {
        this.t104442 = t104442;
    }
    /**
     * ”õl‚Q‚S‚ğ•Ô‚µ‚Ü‚·B
     * @return ”õl‚Q‚S ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=76,columnJpName="”õl‚Q‚S")
    public String getT104443() {
        return t104443;
    }
    
    /**
     * ”õl‚Q‚S‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param t104443 ”õl‚Q‚S ‚ğİ’èB
     */
    public void setT104443(String t104443) {
        this.t104443 = t104443;
    }
    /**
     * “o˜^Ò‚ğ•Ô‚µ‚Ü‚·B
     * @return “o˜^Ò ‚ğ–ß‚µ‚Ü‚·B
     */
    @Override
    @LogInfo(columnIndex=77,columnJpName="“o˜^Ò")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * “o˜^“ú‚ğ•Ô‚µ‚Ü‚·B
     * @return “o˜^“ú ‚ğ–ß‚µ‚Ü‚·B
     */
    @Override
    @LogInfo(columnIndex=78,columnJpName="“o˜^“ú")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * XVÒ‚ğ•Ô‚µ‚Ü‚·B
     * @return XVÒ ‚ğ–ß‚µ‚Ü‚·B
     */
    @Override
    @LogInfo(columnIndex=79,columnJpName="XVÒ")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * XV“ú‚ğ•Ô‚µ‚Ü‚·B
     * @return XV“ú ‚ğ–ß‚µ‚Ü‚·B
     */
    @Override
    @LogInfo(columnIndex=80,columnJpName="XV“ú")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * XVAPP‚ğ•Ô‚µ‚Ü‚·B
     * @return XVAPP ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=81,columnJpName="XVAPP")
    public String getUpdateApp() {
        return updateApp;
    }
    
    /**
     * XVAPP‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param updateApp XVAPP ‚ğİ’èB
     */
    public void setUpdateApp(String updateApp) {
        this.updateApp = updateApp;
    }
    /**
     * ƒo[ƒWƒ‡ƒ“”Ô†‚ğ•Ô‚µ‚Ü‚·B
     * @return ƒo[ƒWƒ‡ƒ“”Ô† ‚ğ–ß‚µ‚Ü‚·B
     */
    @LogInfo(columnIndex=82,columnJpName="ƒo[ƒWƒ‡ƒ“”Ô†")
    public java.math.BigDecimal getVersionNo() {
        return versionNo;
    }
    
    /**
     * ƒo[ƒWƒ‡ƒ“”Ô†‚ğƒZƒbƒg‚µ‚Ü‚·B
     * @param versionNo ƒo[ƒWƒ‡ƒ“”Ô† ‚ğİ’èB
     */
    public void setVersionNo(java.math.BigDecimal versionNo) {
        this.versionNo = versionNo;
    }

//--- ƒ†[ƒeƒBƒŠƒeƒBƒƒ\ƒbƒh

    /**
     * ƒGƒ“ƒeƒBƒeƒBƒ‚ƒfƒ‹‚É‘Î‰‚·‚éƒf[ƒ^ƒx[ƒX‚Ìƒe[ƒuƒ‹–¼‚ğ•Ô‚µ‚Ü‚·B
     * @return ƒe[ƒuƒ‹–¼
     */
    public String getTableName(){
    	return "T104";
    }

    /**
     * ƒGƒ“ƒeƒBƒeƒBƒ‚ƒfƒ‹‚É‘Î‰‚·‚éƒf[ƒ^ƒx[ƒXƒe[ƒuƒ‹‚Ìƒvƒ‰ƒCƒ}ƒŠƒL[ƒIƒuƒWƒFƒNƒg‚Ì’l‚ğˆê——‚Å•Ô‚µ‚Ü‚·B
     * @return ƒvƒ‰ƒCƒ}ƒŠƒL[ƒIƒuƒWƒFƒNƒg’l‚Ìˆê——
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT104001()
                    ,getT104002()
    	};
    }


    /**
     * T104ŒÚ‹qƒAƒCƒRƒ“ƒGƒ“ƒeƒBƒeƒBƒ‚ƒfƒ‹‚Ì•¶š—ñƒXƒiƒbƒvƒVƒ‡ƒbƒg‚ğ•Ô‚µ‚Ü‚·B
     * @return T104ŒÚ‹qƒAƒCƒRƒ“ƒGƒ“ƒeƒBƒeƒBƒ‚ƒfƒ‹‚Ì•¶š—ñƒXƒiƒbƒvƒVƒ‡ƒbƒg
     */
    @Override
    public String toString(){
    	return "T104ŒÚ‹qƒAƒCƒRƒ“(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("‹ÇƒR[ƒh(t104001)", getT104001())
    		.append("ŒÚ‹qƒR[ƒh(t104002)", getT104002())
    		.append("ŒÚ‹qó‘Ô(t104101)", getT104101())
    		.append("Œ_–ñÒƒR[ƒh(t104102)", getT104102())
    		.append("€–Ú‚P(t104211)", getT104211())
    		.append("ó‘Ô‚P(t104212)", getT104212())
    		.append("”õl‚P(t104213)", getT104213())
    		.append("€–Ú‚Q(t104221)", getT104221())
    		.append("ó‘Ô‚Q(t104222)", getT104222())
    		.append("”õl‚Q(t104223)", getT104223())
    		.append("€–Ú‚R(t104231)", getT104231())
    		.append("ó‘Ô‚R(t104232)", getT104232())
    		.append("”õl‚R(t104233)", getT104233())
    		.append("€–Ú‚S(t104241)", getT104241())
    		.append("ó‘Ô‚S(t104242)", getT104242())
    		.append("”õl‚S(t104243)", getT104243())
    		.append("€–Ú‚T(t104251)", getT104251())
    		.append("ó‘Ô‚T(t104252)", getT104252())
    		.append("”õl‚T(t104253)", getT104253())
    		.append("€–Ú‚U(t104261)", getT104261())
    		.append("ó‘Ô‚U(t104262)", getT104262())
    		.append("”õl‚U(t104263)", getT104263())
    		.append("€–Ú‚V(t104271)", getT104271())
    		.append("ó‘Ô‚V(t104272)", getT104272())
    		.append("”õl‚V(t104273)", getT104273())
    		.append("€–Ú‚W(t104281)", getT104281())
    		.append("ó‘Ô‚W(t104282)", getT104282())
    		.append("”õl‚W(t104283)", getT104283())
    		.append("€–Ú‚X(t104291)", getT104291())
    		.append("ó‘Ô‚X(t104292)", getT104292())
    		.append("”õl‚X(t104293)", getT104293())
    		.append("€–Ú‚P‚O(t104301)", getT104301())
    		.append("ó‘Ô‚P‚O(t104302)", getT104302())
    		.append("”õl‚P‚O(t104303)", getT104303())
    		.append("€–Ú‚P‚P(t104311)", getT104311())
    		.append("ó‘Ô‚P‚P(t104312)", getT104312())
    		.append("”õl‚P‚P(t104313)", getT104313())
    		.append("€–Ú‚P‚Q(t104321)", getT104321())
    		.append("ó‘Ô‚P‚Q(t104322)", getT104322())
    		.append("”õl‚P‚Q(t104323)", getT104323())
    		.append("€–Ú‚P‚R(t104331)", getT104331())
    		.append("ó‘Ô‚P‚R(t104332)", getT104332())
    		.append("”õl‚P‚R(t104333)", getT104333())
    		.append("€–Ú‚P‚S(t104341)", getT104341())
    		.append("ó‘Ô‚P‚S(t104342)", getT104342())
    		.append("”õl‚P‚S(t104343)", getT104343())
    		.append("€–Ú‚P‚T(t104351)", getT104351())
    		.append("ó‘Ô‚P‚T(t104352)", getT104352())
    		.append("”õl‚P‚T(t104353)", getT104353())
    		.append("€–Ú‚P‚U(t104361)", getT104361())
    		.append("ó‘Ô‚P‚U(t104362)", getT104362())
    		.append("”õl‚P‚U(t104363)", getT104363())
    		.append("€–Ú‚P‚V(t104371)", getT104371())
    		.append("ó‘Ô‚P‚V(t104372)", getT104372())
    		.append("”õl‚P‚V(t104373)", getT104373())
    		.append("€–Ú‚P‚W(t104381)", getT104381())
    		.append("ó‘Ô‚P‚W(t104382)", getT104382())
    		.append("”õl‚P‚W(t104383)", getT104383())
    		.append("€–Ú‚P‚X(t104391)", getT104391())
    		.append("ó‘Ô‚P‚X(t104392)", getT104392())
    		.append("”õl‚P‚X(t104393)", getT104393())
    		.append("€–Ú‚Q‚O(t104401)", getT104401())
    		.append("ó‘Ô‚Q‚O(t104402)", getT104402())
    		.append("”õl‚Q‚O(t104403)", getT104403())
    		.append("€–Ú‚Q‚P(t104411)", getT104411())
    		.append("ó‘Ô‚Q‚P(t104412)", getT104412())
    		.append("”õl‚Q‚P(t104413)", getT104413())
    		.append("€–Ú‚Q‚Q(t104421)", getT104421())
    		.append("ó‘Ô‚Q‚Q(t104422)", getT104422())
    		.append("”õl‚Q‚Q(t104423)", getT104423())
    		.append("€–Ú‚Q‚R(t104431)", getT104431())
    		.append("ó‘Ô‚Q‚R(t104432)", getT104432())
    		.append("”õl‚Q‚R(t104433)", getT104433())
    		.append("€–Ú‚Q‚S(t104441)", getT104441())
    		.append("ó‘Ô‚Q‚S(t104442)", getT104442())
    		.append("”õl‚Q‚S(t104443)", getT104443())
    		.append("“o˜^Ò(creator)", getCreator())
    		.append("“o˜^“ú(createTimestamp)", getCreateTimestamp())
    		.append("XVÒ(updater)", getUpdater())
    		.append("XV“ú(updateTimestamp)", getUpdateTimestamp())
    		.append("XVAPP(updateApp)", getUpdateApp())
    		.append("ƒo[ƒWƒ‡ƒ“”Ô†(versionNo)", getVersionNo())
    		.toString();
    }

}
