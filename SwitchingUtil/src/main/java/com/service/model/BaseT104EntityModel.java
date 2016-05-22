/*
 * @(#)T104.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */

package com.service.model;


import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * T104顧客アイコンのエンティティモデルクラスです。<BR/>
 * 
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT104EntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード */
    private String t104001;
    /** 顧客コード */
    private String t104002;
    /** 顧客状態 */
    private java.math.BigDecimal t104101;
    /** 契約者コード */
    private String t104102;
    /** 項目１ */
    private java.math.BigDecimal t104211;
    /** 状態１ */
    private java.math.BigDecimal t104212;
    /** 備考１ */
    private String t104213;
    /** 項目２ */
    private java.math.BigDecimal t104221;
    /** 状態２ */
    private java.math.BigDecimal t104222;
    /** 備考２ */
    private String t104223;
    /** 項目３ */
    private java.math.BigDecimal t104231;
    /** 状態３ */
    private java.math.BigDecimal t104232;
    /** 備考３ */
    private String t104233;
    /** 項目４ */
    private java.math.BigDecimal t104241;
    /** 状態４ */
    private java.math.BigDecimal t104242;
    /** 備考４ */
    private String t104243;
    /** 項目５ */
    private java.math.BigDecimal t104251;
    /** 状態５ */
    private java.math.BigDecimal t104252;
    /** 備考５ */
    private String t104253;
    /** 項目６ */
    private java.math.BigDecimal t104261;
    /** 状態６ */
    private java.math.BigDecimal t104262;
    /** 備考６ */
    private String t104263;
    /** 項目７ */
    private java.math.BigDecimal t104271;
    /** 状態７ */
    private java.math.BigDecimal t104272;
    /** 備考７ */
    private String t104273;
    /** 項目８ */
    private java.math.BigDecimal t104281;
    /** 状態８ */
    private java.math.BigDecimal t104282;
    /** 備考８ */
    private String t104283;
    /** 項目９ */
    private java.math.BigDecimal t104291;
    /** 状態９ */
    private java.math.BigDecimal t104292;
    /** 備考９ */
    private String t104293;
    /** 項目１０ */
    private java.math.BigDecimal t104301;
    /** 状態１０ */
    private java.math.BigDecimal t104302;
    /** 備考１０ */
    private String t104303;
    /** 項目１１ */
    private java.math.BigDecimal t104311;
    /** 状態１１ */
    private java.math.BigDecimal t104312;
    /** 備考１１ */
    private String t104313;
    /** 項目１２ */
    private java.math.BigDecimal t104321;
    /** 状態１２ */
    private java.math.BigDecimal t104322;
    /** 備考１２ */
    private String t104323;
    /** 項目１３ */
    private java.math.BigDecimal t104331;
    /** 状態１３ */
    private java.math.BigDecimal t104332;
    /** 備考１３ */
    private String t104333;
    /** 項目１４ */
    private java.math.BigDecimal t104341;
    /** 状態１４ */
    private java.math.BigDecimal t104342;
    /** 備考１４ */
    private String t104343;
    /** 項目１５ */
    private java.math.BigDecimal t104351;
    /** 状態１５ */
    private java.math.BigDecimal t104352;
    /** 備考１５ */
    private String t104353;
    /** 項目１６ */
    private java.math.BigDecimal t104361;
    /** 状態１６ */
    private java.math.BigDecimal t104362;
    /** 備考１６ */
    private String t104363;
    /** 項目１７ */
    private java.math.BigDecimal t104371;
    /** 状態１７ */
    private java.math.BigDecimal t104372;
    /** 備考１７ */
    private String t104373;
    /** 項目１８ */
    private java.math.BigDecimal t104381;
    /** 状態１８ */
    private java.math.BigDecimal t104382;
    /** 備考１８ */
    private String t104383;
    /** 項目１９ */
    private java.math.BigDecimal t104391;
    /** 状態１９ */
    private java.math.BigDecimal t104392;
    /** 備考１９ */
    private String t104393;
    /** 項目２０ */
    private java.math.BigDecimal t104401;
    /** 状態２０ */
    private java.math.BigDecimal t104402;
    /** 備考２０ */
    private String t104403;
    /** 項目２１ */
    private java.math.BigDecimal t104411;
    /** 状態２１ */
    private java.math.BigDecimal t104412;
    /** 備考２１ */
    private String t104413;
    /** 項目２２ */
    private java.math.BigDecimal t104421;
    /** 状態２２ */
    private java.math.BigDecimal t104422;
    /** 備考２２ */
    private String t104423;
    /** 項目２３ */
    private java.math.BigDecimal t104431;
    /** 状態２３ */
    private java.math.BigDecimal t104432;
    /** 備考２３ */
    private String t104433;
    /** 項目２４ */
    private java.math.BigDecimal t104441;
    /** 状態２４ */
    private java.math.BigDecimal t104442;
    /** 備考２４ */
    private String t104443;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseT104EntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseT104EntityModel コピー元T104顧客アイコンエンティティモデル
     */
    public BaseT104EntityModel(BaseT104EntityModel baseT104EntityModel) {
        super();
        //局コードを設定します
        setT104001(baseT104EntityModel.getT104001());
        //顧客コードを設定します
        setT104002(baseT104EntityModel.getT104002());
        //顧客状態を設定します
        setT104101(baseT104EntityModel.getT104101());
        //契約者コードを設定します
        setT104102(baseT104EntityModel.getT104102());
        //項目１を設定します
        setT104211(baseT104EntityModel.getT104211());
        //状態１を設定します
        setT104212(baseT104EntityModel.getT104212());
        //備考１を設定します
        setT104213(baseT104EntityModel.getT104213());
        //項目２を設定します
        setT104221(baseT104EntityModel.getT104221());
        //状態２を設定します
        setT104222(baseT104EntityModel.getT104222());
        //備考２を設定します
        setT104223(baseT104EntityModel.getT104223());
        //項目３を設定します
        setT104231(baseT104EntityModel.getT104231());
        //状態３を設定します
        setT104232(baseT104EntityModel.getT104232());
        //備考３を設定します
        setT104233(baseT104EntityModel.getT104233());
        //項目４を設定します
        setT104241(baseT104EntityModel.getT104241());
        //状態４を設定します
        setT104242(baseT104EntityModel.getT104242());
        //備考４を設定します
        setT104243(baseT104EntityModel.getT104243());
        //項目５を設定します
        setT104251(baseT104EntityModel.getT104251());
        //状態５を設定します
        setT104252(baseT104EntityModel.getT104252());
        //備考５を設定します
        setT104253(baseT104EntityModel.getT104253());
        //項目６を設定します
        setT104261(baseT104EntityModel.getT104261());
        //状態６を設定します
        setT104262(baseT104EntityModel.getT104262());
        //備考６を設定します
        setT104263(baseT104EntityModel.getT104263());
        //項目７を設定します
        setT104271(baseT104EntityModel.getT104271());
        //状態７を設定します
        setT104272(baseT104EntityModel.getT104272());
        //備考７を設定します
        setT104273(baseT104EntityModel.getT104273());
        //項目８を設定します
        setT104281(baseT104EntityModel.getT104281());
        //状態８を設定します
        setT104282(baseT104EntityModel.getT104282());
        //備考８を設定します
        setT104283(baseT104EntityModel.getT104283());
        //項目９を設定します
        setT104291(baseT104EntityModel.getT104291());
        //状態９を設定します
        setT104292(baseT104EntityModel.getT104292());
        //備考９を設定します
        setT104293(baseT104EntityModel.getT104293());
        //項目１０を設定します
        setT104301(baseT104EntityModel.getT104301());
        //状態１０を設定します
        setT104302(baseT104EntityModel.getT104302());
        //備考１０を設定します
        setT104303(baseT104EntityModel.getT104303());
        //項目１１を設定します
        setT104311(baseT104EntityModel.getT104311());
        //状態１１を設定します
        setT104312(baseT104EntityModel.getT104312());
        //備考１１を設定します
        setT104313(baseT104EntityModel.getT104313());
        //項目１２を設定します
        setT104321(baseT104EntityModel.getT104321());
        //状態１２を設定します
        setT104322(baseT104EntityModel.getT104322());
        //備考１２を設定します
        setT104323(baseT104EntityModel.getT104323());
        //項目１３を設定します
        setT104331(baseT104EntityModel.getT104331());
        //状態１３を設定します
        setT104332(baseT104EntityModel.getT104332());
        //備考１３を設定します
        setT104333(baseT104EntityModel.getT104333());
        //項目１４を設定します
        setT104341(baseT104EntityModel.getT104341());
        //状態１４を設定します
        setT104342(baseT104EntityModel.getT104342());
        //備考１４を設定します
        setT104343(baseT104EntityModel.getT104343());
        //項目１５を設定します
        setT104351(baseT104EntityModel.getT104351());
        //状態１５を設定します
        setT104352(baseT104EntityModel.getT104352());
        //備考１５を設定します
        setT104353(baseT104EntityModel.getT104353());
        //項目１６を設定します
        setT104361(baseT104EntityModel.getT104361());
        //状態１６を設定します
        setT104362(baseT104EntityModel.getT104362());
        //備考１６を設定します
        setT104363(baseT104EntityModel.getT104363());
        //項目１７を設定します
        setT104371(baseT104EntityModel.getT104371());
        //状態１７を設定します
        setT104372(baseT104EntityModel.getT104372());
        //備考１７を設定します
        setT104373(baseT104EntityModel.getT104373());
        //項目１８を設定します
        setT104381(baseT104EntityModel.getT104381());
        //状態１８を設定します
        setT104382(baseT104EntityModel.getT104382());
        //備考１８を設定します
        setT104383(baseT104EntityModel.getT104383());
        //項目１９を設定します
        setT104391(baseT104EntityModel.getT104391());
        //状態１９を設定します
        setT104392(baseT104EntityModel.getT104392());
        //備考１９を設定します
        setT104393(baseT104EntityModel.getT104393());
        //項目２０を設定します
        setT104401(baseT104EntityModel.getT104401());
        //状態２０を設定します
        setT104402(baseT104EntityModel.getT104402());
        //備考２０を設定します
        setT104403(baseT104EntityModel.getT104403());
        //項目２１を設定します
        setT104411(baseT104EntityModel.getT104411());
        //状態２１を設定します
        setT104412(baseT104EntityModel.getT104412());
        //備考２１を設定します
        setT104413(baseT104EntityModel.getT104413());
        //項目２２を設定します
        setT104421(baseT104EntityModel.getT104421());
        //状態２２を設定します
        setT104422(baseT104EntityModel.getT104422());
        //備考２２を設定します
        setT104423(baseT104EntityModel.getT104423());
        //項目２３を設定します
        setT104431(baseT104EntityModel.getT104431());
        //状態２３を設定します
        setT104432(baseT104EntityModel.getT104432());
        //備考２３を設定します
        setT104433(baseT104EntityModel.getT104433());
        //項目２４を設定します
        setT104441(baseT104EntityModel.getT104441());
        //状態２４を設定します
        setT104442(baseT104EntityModel.getT104442());
        //備考２４を設定します
        setT104443(baseT104EntityModel.getT104443());
        //登録者を設定します
        setCreator(baseT104EntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseT104EntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseT104EntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseT104EntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseT104EntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseT104EntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseT104EntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コードを返します。
     * @return 局コード を戻します。
     */
    
    public String getT104001() {
        return t104001;
    }
    
    /**
     * 局コードをセットします。
     * @param t104001 局コード を設定。
     */
    public void setT104001(String t104001) {
        this.t104001 = t104001;
    }
    /**
     * 顧客コードを返します。
     * @return 顧客コード を戻します。
     */
    
    public String getT104002() {
        return t104002;
    }
    
    /**
     * 顧客コードをセットします。
     * @param t104002 顧客コード を設定。
     */
    public void setT104002(String t104002) {
        this.t104002 = t104002;
    }
    /**
     * 顧客状態を返します。
     * @return 顧客状態 を戻します。
     */
    
    public java.math.BigDecimal getT104101() {
        return t104101;
    }
    
    /**
     * 顧客状態をセットします。
     * @param t104101 顧客状態 を設定。
     */
    public void setT104101(java.math.BigDecimal t104101) {
        this.t104101 = t104101;
    }
    /**
     * 契約者コードを返します。
     * @return 契約者コード を戻します。
     */
    
    public String getT104102() {
        return t104102;
    }
    
    /**
     * 契約者コードをセットします。
     * @param t104102 契約者コード を設定。
     */
    public void setT104102(String t104102) {
        this.t104102 = t104102;
    }
    /**
     * 項目１を返します。
     * @return 項目１ を戻します。
     */
    
    public java.math.BigDecimal getT104211() {
        return t104211;
    }
    
    /**
     * 項目１をセットします。
     * @param t104211 項目１ を設定。
     */
    public void setT104211(java.math.BigDecimal t104211) {
        this.t104211 = t104211;
    }
    /**
     * 状態１を返します。
     * @return 状態１ を戻します。
     */
    
    public java.math.BigDecimal getT104212() {
        return t104212;
    }
    
    /**
     * 状態１をセットします。
     * @param t104212 状態１ を設定。
     */
    public void setT104212(java.math.BigDecimal t104212) {
        this.t104212 = t104212;
    }
    /**
     * 備考１を返します。
     * @return 備考１ を戻します。
     */
    
    public String getT104213() {
        return t104213;
    }
    
    /**
     * 備考１をセットします。
     * @param t104213 備考１ を設定。
     */
    public void setT104213(String t104213) {
        this.t104213 = t104213;
    }
    /**
     * 項目２を返します。
     * @return 項目２ を戻します。
     */
    
    public java.math.BigDecimal getT104221() {
        return t104221;
    }
    
    /**
     * 項目２をセットします。
     * @param t104221 項目２ を設定。
     */
    public void setT104221(java.math.BigDecimal t104221) {
        this.t104221 = t104221;
    }
    /**
     * 状態２を返します。
     * @return 状態２ を戻します。
     */
    
    public java.math.BigDecimal getT104222() {
        return t104222;
    }
    
    /**
     * 状態２をセットします。
     * @param t104222 状態２ を設定。
     */
    public void setT104222(java.math.BigDecimal t104222) {
        this.t104222 = t104222;
    }
    /**
     * 備考２を返します。
     * @return 備考２ を戻します。
     */
    
    public String getT104223() {
        return t104223;
    }
    
    /**
     * 備考２をセットします。
     * @param t104223 備考２ を設定。
     */
    public void setT104223(String t104223) {
        this.t104223 = t104223;
    }
    /**
     * 項目３を返します。
     * @return 項目３ を戻します。
     */
    
    public java.math.BigDecimal getT104231() {
        return t104231;
    }
    
    /**
     * 項目３をセットします。
     * @param t104231 項目３ を設定。
     */
    public void setT104231(java.math.BigDecimal t104231) {
        this.t104231 = t104231;
    }
    /**
     * 状態３を返します。
     * @return 状態３ を戻します。
     */
    
    public java.math.BigDecimal getT104232() {
        return t104232;
    }
    
    /**
     * 状態３をセットします。
     * @param t104232 状態３ を設定。
     */
    public void setT104232(java.math.BigDecimal t104232) {
        this.t104232 = t104232;
    }
    /**
     * 備考３を返します。
     * @return 備考３ を戻します。
     */
    
    public String getT104233() {
        return t104233;
    }
    
    /**
     * 備考３をセットします。
     * @param t104233 備考３ を設定。
     */
    public void setT104233(String t104233) {
        this.t104233 = t104233;
    }
    /**
     * 項目４を返します。
     * @return 項目４ を戻します。
     */
    
    public java.math.BigDecimal getT104241() {
        return t104241;
    }
    
    /**
     * 項目４をセットします。
     * @param t104241 項目４ を設定。
     */
    public void setT104241(java.math.BigDecimal t104241) {
        this.t104241 = t104241;
    }
    /**
     * 状態４を返します。
     * @return 状態４ を戻します。
     */
    
    public java.math.BigDecimal getT104242() {
        return t104242;
    }
    
    /**
     * 状態４をセットします。
     * @param t104242 状態４ を設定。
     */
    public void setT104242(java.math.BigDecimal t104242) {
        this.t104242 = t104242;
    }
    /**
     * 備考４を返します。
     * @return 備考４ を戻します。
     */
    
    public String getT104243() {
        return t104243;
    }
    
    /**
     * 備考４をセットします。
     * @param t104243 備考４ を設定。
     */
    public void setT104243(String t104243) {
        this.t104243 = t104243;
    }
    /**
     * 項目５を返します。
     * @return 項目５ を戻します。
     */
    
    public java.math.BigDecimal getT104251() {
        return t104251;
    }
    
    /**
     * 項目５をセットします。
     * @param t104251 項目５ を設定。
     */
    public void setT104251(java.math.BigDecimal t104251) {
        this.t104251 = t104251;
    }
    /**
     * 状態５を返します。
     * @return 状態５ を戻します。
     */
    
    public java.math.BigDecimal getT104252() {
        return t104252;
    }
    
    /**
     * 状態５をセットします。
     * @param t104252 状態５ を設定。
     */
    public void setT104252(java.math.BigDecimal t104252) {
        this.t104252 = t104252;
    }
    /**
     * 備考５を返します。
     * @return 備考５ を戻します。
     */
    
    public String getT104253() {
        return t104253;
    }
    
    /**
     * 備考５をセットします。
     * @param t104253 備考５ を設定。
     */
    public void setT104253(String t104253) {
        this.t104253 = t104253;
    }
    /**
     * 項目６を返します。
     * @return 項目６ を戻します。
     */
    
    public java.math.BigDecimal getT104261() {
        return t104261;
    }
    
    /**
     * 項目６をセットします。
     * @param t104261 項目６ を設定。
     */
    public void setT104261(java.math.BigDecimal t104261) {
        this.t104261 = t104261;
    }
    /**
     * 状態６を返します。
     * @return 状態６ を戻します。
     */
    
    public java.math.BigDecimal getT104262() {
        return t104262;
    }
    
    /**
     * 状態６をセットします。
     * @param t104262 状態６ を設定。
     */
    public void setT104262(java.math.BigDecimal t104262) {
        this.t104262 = t104262;
    }
    /**
     * 備考６を返します。
     * @return 備考６ を戻します。
     */
    
    public String getT104263() {
        return t104263;
    }
    
    /**
     * 備考６をセットします。
     * @param t104263 備考６ を設定。
     */
    public void setT104263(String t104263) {
        this.t104263 = t104263;
    }
    /**
     * 項目７を返します。
     * @return 項目７ を戻します。
     */
    
    public java.math.BigDecimal getT104271() {
        return t104271;
    }
    
    /**
     * 項目７をセットします。
     * @param t104271 項目７ を設定。
     */
    public void setT104271(java.math.BigDecimal t104271) {
        this.t104271 = t104271;
    }
    /**
     * 状態７を返します。
     * @return 状態７ を戻します。
     */
    
    public java.math.BigDecimal getT104272() {
        return t104272;
    }
    
    /**
     * 状態７をセットします。
     * @param t104272 状態７ を設定。
     */
    public void setT104272(java.math.BigDecimal t104272) {
        this.t104272 = t104272;
    }
    /**
     * 備考７を返します。
     * @return 備考７ を戻します。
     */
    
    public String getT104273() {
        return t104273;
    }
    
    /**
     * 備考７をセットします。
     * @param t104273 備考７ を設定。
     */
    public void setT104273(String t104273) {
        this.t104273 = t104273;
    }
    /**
     * 項目８を返します。
     * @return 項目８ を戻します。
     */
    
    public java.math.BigDecimal getT104281() {
        return t104281;
    }
    
    /**
     * 項目８をセットします。
     * @param t104281 項目８ を設定。
     */
    public void setT104281(java.math.BigDecimal t104281) {
        this.t104281 = t104281;
    }
    /**
     * 状態８を返します。
     * @return 状態８ を戻します。
     */
    
    public java.math.BigDecimal getT104282() {
        return t104282;
    }
    
    /**
     * 状態８をセットします。
     * @param t104282 状態８ を設定。
     */
    public void setT104282(java.math.BigDecimal t104282) {
        this.t104282 = t104282;
    }
    /**
     * 備考８を返します。
     * @return 備考８ を戻します。
     */
    
    public String getT104283() {
        return t104283;
    }
    
    /**
     * 備考８をセットします。
     * @param t104283 備考８ を設定。
     */
    public void setT104283(String t104283) {
        this.t104283 = t104283;
    }
    /**
     * 項目９を返します。
     * @return 項目９ を戻します。
     */
    
    public java.math.BigDecimal getT104291() {
        return t104291;
    }
    
    /**
     * 項目９をセットします。
     * @param t104291 項目９ を設定。
     */
    public void setT104291(java.math.BigDecimal t104291) {
        this.t104291 = t104291;
    }
    /**
     * 状態９を返します。
     * @return 状態９ を戻します。
     */
    
    public java.math.BigDecimal getT104292() {
        return t104292;
    }
    
    /**
     * 状態９をセットします。
     * @param t104292 状態９ を設定。
     */
    public void setT104292(java.math.BigDecimal t104292) {
        this.t104292 = t104292;
    }
    /**
     * 備考９を返します。
     * @return 備考９ を戻します。
     */
    
    public String getT104293() {
        return t104293;
    }
    
    /**
     * 備考９をセットします。
     * @param t104293 備考９ を設定。
     */
    public void setT104293(String t104293) {
        this.t104293 = t104293;
    }
    /**
     * 項目１０を返します。
     * @return 項目１０ を戻します。
     */
    
    public java.math.BigDecimal getT104301() {
        return t104301;
    }
    
    /**
     * 項目１０をセットします。
     * @param t104301 項目１０ を設定。
     */
    public void setT104301(java.math.BigDecimal t104301) {
        this.t104301 = t104301;
    }
    /**
     * 状態１０を返します。
     * @return 状態１０ を戻します。
     */
    
    public java.math.BigDecimal getT104302() {
        return t104302;
    }
    
    /**
     * 状態１０をセットします。
     * @param t104302 状態１０ を設定。
     */
    public void setT104302(java.math.BigDecimal t104302) {
        this.t104302 = t104302;
    }
    /**
     * 備考１０を返します。
     * @return 備考１０ を戻します。
     */
    
    public String getT104303() {
        return t104303;
    }
    
    /**
     * 備考１０をセットします。
     * @param t104303 備考１０ を設定。
     */
    public void setT104303(String t104303) {
        this.t104303 = t104303;
    }
    /**
     * 項目１１を返します。
     * @return 項目１１ を戻します。
     */
    
    public java.math.BigDecimal getT104311() {
        return t104311;
    }
    
    /**
     * 項目１１をセットします。
     * @param t104311 項目１１ を設定。
     */
    public void setT104311(java.math.BigDecimal t104311) {
        this.t104311 = t104311;
    }
    /**
     * 状態１１を返します。
     * @return 状態１１ を戻します。
     */
    
    public java.math.BigDecimal getT104312() {
        return t104312;
    }
    
    /**
     * 状態１１をセットします。
     * @param t104312 状態１１ を設定。
     */
    public void setT104312(java.math.BigDecimal t104312) {
        this.t104312 = t104312;
    }
    /**
     * 備考１１を返します。
     * @return 備考１１ を戻します。
     */
    
    public String getT104313() {
        return t104313;
    }
    
    /**
     * 備考１１をセットします。
     * @param t104313 備考１１ を設定。
     */
    public void setT104313(String t104313) {
        this.t104313 = t104313;
    }
    /**
     * 項目１２を返します。
     * @return 項目１２ を戻します。
     */
    
    public java.math.BigDecimal getT104321() {
        return t104321;
    }
    
    /**
     * 項目１２をセットします。
     * @param t104321 項目１２ を設定。
     */
    public void setT104321(java.math.BigDecimal t104321) {
        this.t104321 = t104321;
    }
    /**
     * 状態１２を返します。
     * @return 状態１２ を戻します。
     */
    
    public java.math.BigDecimal getT104322() {
        return t104322;
    }
    
    /**
     * 状態１２をセットします。
     * @param t104322 状態１２ を設定。
     */
    public void setT104322(java.math.BigDecimal t104322) {
        this.t104322 = t104322;
    }
    /**
     * 備考１２を返します。
     * @return 備考１２ を戻します。
     */
    
    public String getT104323() {
        return t104323;
    }
    
    /**
     * 備考１２をセットします。
     * @param t104323 備考１２ を設定。
     */
    public void setT104323(String t104323) {
        this.t104323 = t104323;
    }
    /**
     * 項目１３を返します。
     * @return 項目１３ を戻します。
     */
    
    public java.math.BigDecimal getT104331() {
        return t104331;
    }
    
    /**
     * 項目１３をセットします。
     * @param t104331 項目１３ を設定。
     */
    public void setT104331(java.math.BigDecimal t104331) {
        this.t104331 = t104331;
    }
    /**
     * 状態１３を返します。
     * @return 状態１３ を戻します。
     */
    
    public java.math.BigDecimal getT104332() {
        return t104332;
    }
    
    /**
     * 状態１３をセットします。
     * @param t104332 状態１３ を設定。
     */
    public void setT104332(java.math.BigDecimal t104332) {
        this.t104332 = t104332;
    }
    /**
     * 備考１３を返します。
     * @return 備考１３ を戻します。
     */
    
    public String getT104333() {
        return t104333;
    }
    
    /**
     * 備考１３をセットします。
     * @param t104333 備考１３ を設定。
     */
    public void setT104333(String t104333) {
        this.t104333 = t104333;
    }
    /**
     * 項目１４を返します。
     * @return 項目１４ を戻します。
     */
    
    public java.math.BigDecimal getT104341() {
        return t104341;
    }
    
    /**
     * 項目１４をセットします。
     * @param t104341 項目１４ を設定。
     */
    public void setT104341(java.math.BigDecimal t104341) {
        this.t104341 = t104341;
    }
    /**
     * 状態１４を返します。
     * @return 状態１４ を戻します。
     */
    
    public java.math.BigDecimal getT104342() {
        return t104342;
    }
    
    /**
     * 状態１４をセットします。
     * @param t104342 状態１４ を設定。
     */
    public void setT104342(java.math.BigDecimal t104342) {
        this.t104342 = t104342;
    }
    /**
     * 備考１４を返します。
     * @return 備考１４ を戻します。
     */
    
    public String getT104343() {
        return t104343;
    }
    
    /**
     * 備考１４をセットします。
     * @param t104343 備考１４ を設定。
     */
    public void setT104343(String t104343) {
        this.t104343 = t104343;
    }
    /**
     * 項目１５を返します。
     * @return 項目１５ を戻します。
     */
    
    public java.math.BigDecimal getT104351() {
        return t104351;
    }
    
    /**
     * 項目１５をセットします。
     * @param t104351 項目１５ を設定。
     */
    public void setT104351(java.math.BigDecimal t104351) {
        this.t104351 = t104351;
    }
    /**
     * 状態１５を返します。
     * @return 状態１５ を戻します。
     */
    
    public java.math.BigDecimal getT104352() {
        return t104352;
    }
    
    /**
     * 状態１５をセットします。
     * @param t104352 状態１５ を設定。
     */
    public void setT104352(java.math.BigDecimal t104352) {
        this.t104352 = t104352;
    }
    /**
     * 備考１５を返します。
     * @return 備考１５ を戻します。
     */
    
    public String getT104353() {
        return t104353;
    }
    
    /**
     * 備考１５をセットします。
     * @param t104353 備考１５ を設定。
     */
    public void setT104353(String t104353) {
        this.t104353 = t104353;
    }
    /**
     * 項目１６を返します。
     * @return 項目１６ を戻します。
     */
    
    public java.math.BigDecimal getT104361() {
        return t104361;
    }
    
    /**
     * 項目１６をセットします。
     * @param t104361 項目１６ を設定。
     */
    public void setT104361(java.math.BigDecimal t104361) {
        this.t104361 = t104361;
    }
    /**
     * 状態１６を返します。
     * @return 状態１６ を戻します。
     */
    
    public java.math.BigDecimal getT104362() {
        return t104362;
    }
    
    /**
     * 状態１６をセットします。
     * @param t104362 状態１６ を設定。
     */
    public void setT104362(java.math.BigDecimal t104362) {
        this.t104362 = t104362;
    }
    /**
     * 備考１６を返します。
     * @return 備考１６ を戻します。
     */
    
    public String getT104363() {
        return t104363;
    }
    
    /**
     * 備考１６をセットします。
     * @param t104363 備考１６ を設定。
     */
    public void setT104363(String t104363) {
        this.t104363 = t104363;
    }
    /**
     * 項目１７を返します。
     * @return 項目１７ を戻します。
     */
    
    public java.math.BigDecimal getT104371() {
        return t104371;
    }
    
    /**
     * 項目１７をセットします。
     * @param t104371 項目１７ を設定。
     */
    public void setT104371(java.math.BigDecimal t104371) {
        this.t104371 = t104371;
    }
    /**
     * 状態１７を返します。
     * @return 状態１７ を戻します。
     */
    
    public java.math.BigDecimal getT104372() {
        return t104372;
    }
    
    /**
     * 状態１７をセットします。
     * @param t104372 状態１７ を設定。
     */
    public void setT104372(java.math.BigDecimal t104372) {
        this.t104372 = t104372;
    }
    /**
     * 備考１７を返します。
     * @return 備考１７ を戻します。
     */
    
    public String getT104373() {
        return t104373;
    }
    
    /**
     * 備考１７をセットします。
     * @param t104373 備考１７ を設定。
     */
    public void setT104373(String t104373) {
        this.t104373 = t104373;
    }
    /**
     * 項目１８を返します。
     * @return 項目１８ を戻します。
     */
    
    public java.math.BigDecimal getT104381() {
        return t104381;
    }
    
    /**
     * 項目１８をセットします。
     * @param t104381 項目１８ を設定。
     */
    public void setT104381(java.math.BigDecimal t104381) {
        this.t104381 = t104381;
    }
    /**
     * 状態１８を返します。
     * @return 状態１８ を戻します。
     */
    
    public java.math.BigDecimal getT104382() {
        return t104382;
    }
    
    /**
     * 状態１８をセットします。
     * @param t104382 状態１８ を設定。
     */
    public void setT104382(java.math.BigDecimal t104382) {
        this.t104382 = t104382;
    }
    /**
     * 備考１８を返します。
     * @return 備考１８ を戻します。
     */
    
    public String getT104383() {
        return t104383;
    }
    
    /**
     * 備考１８をセットします。
     * @param t104383 備考１８ を設定。
     */
    public void setT104383(String t104383) {
        this.t104383 = t104383;
    }
    /**
     * 項目１９を返します。
     * @return 項目１９ を戻します。
     */
    
    public java.math.BigDecimal getT104391() {
        return t104391;
    }
    
    /**
     * 項目１９をセットします。
     * @param t104391 項目１９ を設定。
     */
    public void setT104391(java.math.BigDecimal t104391) {
        this.t104391 = t104391;
    }
    /**
     * 状態１９を返します。
     * @return 状態１９ を戻します。
     */
    
    public java.math.BigDecimal getT104392() {
        return t104392;
    }
    
    /**
     * 状態１９をセットします。
     * @param t104392 状態１９ を設定。
     */
    public void setT104392(java.math.BigDecimal t104392) {
        this.t104392 = t104392;
    }
    /**
     * 備考１９を返します。
     * @return 備考１９ を戻します。
     */
    
    public String getT104393() {
        return t104393;
    }
    
    /**
     * 備考１９をセットします。
     * @param t104393 備考１９ を設定。
     */
    public void setT104393(String t104393) {
        this.t104393 = t104393;
    }
    /**
     * 項目２０を返します。
     * @return 項目２０ を戻します。
     */
    
    public java.math.BigDecimal getT104401() {
        return t104401;
    }
    
    /**
     * 項目２０をセットします。
     * @param t104401 項目２０ を設定。
     */
    public void setT104401(java.math.BigDecimal t104401) {
        this.t104401 = t104401;
    }
    /**
     * 状態２０を返します。
     * @return 状態２０ を戻します。
     */
    
    public java.math.BigDecimal getT104402() {
        return t104402;
    }
    
    /**
     * 状態２０をセットします。
     * @param t104402 状態２０ を設定。
     */
    public void setT104402(java.math.BigDecimal t104402) {
        this.t104402 = t104402;
    }
    /**
     * 備考２０を返します。
     * @return 備考２０ を戻します。
     */
    
    public String getT104403() {
        return t104403;
    }
    
    /**
     * 備考２０をセットします。
     * @param t104403 備考２０ を設定。
     */
    public void setT104403(String t104403) {
        this.t104403 = t104403;
    }
    /**
     * 項目２１を返します。
     * @return 項目２１ を戻します。
     */
    
    public java.math.BigDecimal getT104411() {
        return t104411;
    }
    
    /**
     * 項目２１をセットします。
     * @param t104411 項目２１ を設定。
     */
    public void setT104411(java.math.BigDecimal t104411) {
        this.t104411 = t104411;
    }
    /**
     * 状態２１を返します。
     * @return 状態２１ を戻します。
     */
    
    public java.math.BigDecimal getT104412() {
        return t104412;
    }
    
    /**
     * 状態２１をセットします。
     * @param t104412 状態２１ を設定。
     */
    public void setT104412(java.math.BigDecimal t104412) {
        this.t104412 = t104412;
    }
    /**
     * 備考２１を返します。
     * @return 備考２１ を戻します。
     */
    
    public String getT104413() {
        return t104413;
    }
    
    /**
     * 備考２１をセットします。
     * @param t104413 備考２１ を設定。
     */
    public void setT104413(String t104413) {
        this.t104413 = t104413;
    }
    /**
     * 項目２２を返します。
     * @return 項目２２ を戻します。
     */
    
    public java.math.BigDecimal getT104421() {
        return t104421;
    }
    
    /**
     * 項目２２をセットします。
     * @param t104421 項目２２ を設定。
     */
    public void setT104421(java.math.BigDecimal t104421) {
        this.t104421 = t104421;
    }
    /**
     * 状態２２を返します。
     * @return 状態２２ を戻します。
     */
    
    public java.math.BigDecimal getT104422() {
        return t104422;
    }
    
    /**
     * 状態２２をセットします。
     * @param t104422 状態２２ を設定。
     */
    public void setT104422(java.math.BigDecimal t104422) {
        this.t104422 = t104422;
    }
    /**
     * 備考２２を返します。
     * @return 備考２２ を戻します。
     */
    
    public String getT104423() {
        return t104423;
    }
    
    /**
     * 備考２２をセットします。
     * @param t104423 備考２２ を設定。
     */
    public void setT104423(String t104423) {
        this.t104423 = t104423;
    }
    /**
     * 項目２３を返します。
     * @return 項目２３ を戻します。
     */
    
    public java.math.BigDecimal getT104431() {
        return t104431;
    }
    
    /**
     * 項目２３をセットします。
     * @param t104431 項目２３ を設定。
     */
    public void setT104431(java.math.BigDecimal t104431) {
        this.t104431 = t104431;
    }
    /**
     * 状態２３を返します。
     * @return 状態２３ を戻します。
     */
    
    public java.math.BigDecimal getT104432() {
        return t104432;
    }
    
    /**
     * 状態２３をセットします。
     * @param t104432 状態２３ を設定。
     */
    public void setT104432(java.math.BigDecimal t104432) {
        this.t104432 = t104432;
    }
    /**
     * 備考２３を返します。
     * @return 備考２３ を戻します。
     */
    
    public String getT104433() {
        return t104433;
    }
    
    /**
     * 備考２３をセットします。
     * @param t104433 備考２３ を設定。
     */
    public void setT104433(String t104433) {
        this.t104433 = t104433;
    }
    /**
     * 項目２４を返します。
     * @return 項目２４ を戻します。
     */
    
    public java.math.BigDecimal getT104441() {
        return t104441;
    }
    
    /**
     * 項目２４をセットします。
     * @param t104441 項目２４ を設定。
     */
    public void setT104441(java.math.BigDecimal t104441) {
        this.t104441 = t104441;
    }
    /**
     * 状態２４を返します。
     * @return 状態２４ を戻します。
     */
    
    public java.math.BigDecimal getT104442() {
        return t104442;
    }
    
    /**
     * 状態２４をセットします。
     * @param t104442 状態２４ を設定。
     */
    public void setT104442(java.math.BigDecimal t104442) {
        this.t104442 = t104442;
    }
    /**
     * 備考２４を返します。
     * @return 備考２４ を戻します。
     */
    
    public String getT104443() {
        return t104443;
    }
    
    /**
     * 備考２４をセットします。
     * @param t104443 備考２４ を設定。
     */
    public void setT104443(String t104443) {
        this.t104443 = t104443;
    }
    /**
     * 登録者を返します。
     * @return 登録者 を戻します。
     */
    @Override
    
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * 登録日を返します。
     * @return 登録日 を戻します。
     */
    @Override
    
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * 更新者を返します。
     * @return 更新者 を戻します。
     */
    @Override
    
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * 更新日を返します。
     * @return 更新日 を戻します。
     */
    @Override
    
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * 更新APPを返します。
     * @return 更新APP を戻します。
     */
    
    public String getUpdateApp() {
        return updateApp;
    }
    
    /**
     * 更新APPをセットします。
     * @param updateApp 更新APP を設定。
     */
    public void setUpdateApp(String updateApp) {
        this.updateApp = updateApp;
    }
    /**
     * バージョン番号を返します。
     * @return バージョン番号 を戻します。
     */
    
    public java.math.BigDecimal getVersionNo() {
        return versionNo;
    }
    
    /**
     * バージョン番号をセットします。
     * @param versionNo バージョン番号 を設定。
     */
    public void setVersionNo(java.math.BigDecimal versionNo) {
        this.versionNo = versionNo;
    }

//--- ユーティリティメソッド

    /**
     * エンティティモデルに対応するデータベースのテーブル名を返します。
     * @return テーブル名
     */
    public String getTableName(){
    	return "T104";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT104001()
                    ,getT104002()
    	};
    }


    /**
     * T104顧客アイコンエンティティモデルの文字列スナップショットを返します。
     * @return T104顧客アイコンエンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "T104顧客アイコン(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード(t104001)", getT104001())
    		.append("顧客コード(t104002)", getT104002())
    		.append("顧客状態(t104101)", getT104101())
    		.append("契約者コード(t104102)", getT104102())
    		.append("項目１(t104211)", getT104211())
    		.append("状態１(t104212)", getT104212())
    		.append("備考１(t104213)", getT104213())
    		.append("項目２(t104221)", getT104221())
    		.append("状態２(t104222)", getT104222())
    		.append("備考２(t104223)", getT104223())
    		.append("項目３(t104231)", getT104231())
    		.append("状態３(t104232)", getT104232())
    		.append("備考３(t104233)", getT104233())
    		.append("項目４(t104241)", getT104241())
    		.append("状態４(t104242)", getT104242())
    		.append("備考４(t104243)", getT104243())
    		.append("項目５(t104251)", getT104251())
    		.append("状態５(t104252)", getT104252())
    		.append("備考５(t104253)", getT104253())
    		.append("項目６(t104261)", getT104261())
    		.append("状態６(t104262)", getT104262())
    		.append("備考６(t104263)", getT104263())
    		.append("項目７(t104271)", getT104271())
    		.append("状態７(t104272)", getT104272())
    		.append("備考７(t104273)", getT104273())
    		.append("項目８(t104281)", getT104281())
    		.append("状態８(t104282)", getT104282())
    		.append("備考８(t104283)", getT104283())
    		.append("項目９(t104291)", getT104291())
    		.append("状態９(t104292)", getT104292())
    		.append("備考９(t104293)", getT104293())
    		.append("項目１０(t104301)", getT104301())
    		.append("状態１０(t104302)", getT104302())
    		.append("備考１０(t104303)", getT104303())
    		.append("項目１１(t104311)", getT104311())
    		.append("状態１１(t104312)", getT104312())
    		.append("備考１１(t104313)", getT104313())
    		.append("項目１２(t104321)", getT104321())
    		.append("状態１２(t104322)", getT104322())
    		.append("備考１２(t104323)", getT104323())
    		.append("項目１３(t104331)", getT104331())
    		.append("状態１３(t104332)", getT104332())
    		.append("備考１３(t104333)", getT104333())
    		.append("項目１４(t104341)", getT104341())
    		.append("状態１４(t104342)", getT104342())
    		.append("備考１４(t104343)", getT104343())
    		.append("項目１５(t104351)", getT104351())
    		.append("状態１５(t104352)", getT104352())
    		.append("備考１５(t104353)", getT104353())
    		.append("項目１６(t104361)", getT104361())
    		.append("状態１６(t104362)", getT104362())
    		.append("備考１６(t104363)", getT104363())
    		.append("項目１７(t104371)", getT104371())
    		.append("状態１７(t104372)", getT104372())
    		.append("備考１７(t104373)", getT104373())
    		.append("項目１８(t104381)", getT104381())
    		.append("状態１８(t104382)", getT104382())
    		.append("備考１８(t104383)", getT104383())
    		.append("項目１９(t104391)", getT104391())
    		.append("状態１９(t104392)", getT104392())
    		.append("備考１９(t104393)", getT104393())
    		.append("項目２０(t104401)", getT104401())
    		.append("状態２０(t104402)", getT104402())
    		.append("備考２０(t104403)", getT104403())
    		.append("項目２１(t104411)", getT104411())
    		.append("状態２１(t104412)", getT104412())
    		.append("備考２１(t104413)", getT104413())
    		.append("項目２２(t104421)", getT104421())
    		.append("状態２２(t104422)", getT104422())
    		.append("備考２２(t104423)", getT104423())
    		.append("項目２３(t104431)", getT104431())
    		.append("状態２３(t104432)", getT104432())
    		.append("備考２３(t104433)", getT104433())
    		.append("項目２４(t104441)", getT104441())
    		.append("状態２４(t104442)", getT104442())
    		.append("備考２４(t104443)", getT104443())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
