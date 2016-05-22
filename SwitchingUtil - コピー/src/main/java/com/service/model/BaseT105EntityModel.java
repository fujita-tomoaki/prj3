/*
 * @(#)T105.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * T105顧客住所のエンティティモデルクラスです。<BR/>
 * T105顧客住所
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT105EntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード */
    private String t105001;
    /** 顧客コード */
    private String t105002;
    /** 区分 */
    private java.math.BigDecimal t105003;
    /** 区分連番 */
    private java.math.BigDecimal t105004;
    /** 顧客状態 */
    private java.math.BigDecimal t105101;
    /** 契約者コード */
    private String t105102;
    /** 建物区分 */
    private java.math.BigDecimal t105103;
    /** カナ氏名 */
    private String t105201;
    /** 漢字氏名１ */
    private String t105202;
    /** 漢字氏名２ */
    private String t105203;
    /** 敬称 */
    private String t105204;
    /** 漢字氏名３ */
    private String t105205;
    /** 郵便番号 */
    private String t105301;
    /** 住所１ */
    private String t105302;
    /** 住所２ */
    private String t105303;
    /** 丁目 */
    private String t105304;
    /** 番地 */
    private String t105305;
    /** 号 */
    private String t105306;
    /** 棟 */
    private String t105307;
    /** 部屋番号 */
    private String t105308;
    /** 集合住宅コード */
    private String t105309;
    /** 集合住宅名 */
    private String t105310;
    /** ＴＥＬ１ */
    private String t105311;
    /** ＴＥＬ２ */
    private String t105312;
    /** ＦＡＸ */
    private String t105313;
    /** メール */
    private String t105314;
    /** ＴＥＬ３ */
    private String t105315;
    /** メール２ */
    private String t105316;
    /** 備考 */
    private String t105401;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseT105EntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseT105EntityModel コピー元T105顧客住所エンティティモデル
     */
    public BaseT105EntityModel(BaseT105EntityModel baseT105EntityModel) {
        super();
        //局コードを設定します
        setT105001(baseT105EntityModel.getT105001());
        //顧客コードを設定します
        setT105002(baseT105EntityModel.getT105002());
        //区分を設定します
        setT105003(baseT105EntityModel.getT105003());
        //区分連番を設定します
        setT105004(baseT105EntityModel.getT105004());
        //顧客状態を設定します
        setT105101(baseT105EntityModel.getT105101());
        //契約者コードを設定します
        setT105102(baseT105EntityModel.getT105102());
        //建物区分を設定します
        setT105103(baseT105EntityModel.getT105103());
        //カナ氏名を設定します
        setT105201(baseT105EntityModel.getT105201());
        //漢字氏名１を設定します
        setT105202(baseT105EntityModel.getT105202());
        //漢字氏名２を設定します
        setT105203(baseT105EntityModel.getT105203());
        //敬称を設定します
        setT105204(baseT105EntityModel.getT105204());
        //漢字氏名３を設定します
        setT105205(baseT105EntityModel.getT105205());
        //郵便番号を設定します
        setT105301(baseT105EntityModel.getT105301());
        //住所１を設定します
        setT105302(baseT105EntityModel.getT105302());
        //住所２を設定します
        setT105303(baseT105EntityModel.getT105303());
        //丁目を設定します
        setT105304(baseT105EntityModel.getT105304());
        //番地を設定します
        setT105305(baseT105EntityModel.getT105305());
        //号を設定します
        setT105306(baseT105EntityModel.getT105306());
        //棟を設定します
        setT105307(baseT105EntityModel.getT105307());
        //部屋番号を設定します
        setT105308(baseT105EntityModel.getT105308());
        //集合住宅コードを設定します
        setT105309(baseT105EntityModel.getT105309());
        //集合住宅名を設定します
        setT105310(baseT105EntityModel.getT105310());
        //ＴＥＬ１を設定します
        setT105311(baseT105EntityModel.getT105311());
        //ＴＥＬ２を設定します
        setT105312(baseT105EntityModel.getT105312());
        //ＦＡＸを設定します
        setT105313(baseT105EntityModel.getT105313());
        //メールを設定します
        setT105314(baseT105EntityModel.getT105314());
        //ＴＥＬ３を設定します
        setT105315(baseT105EntityModel.getT105315());
        //メール２を設定します
        setT105316(baseT105EntityModel.getT105316());
        //備考を設定します
        setT105401(baseT105EntityModel.getT105401());
        //登録者を設定します
        setCreator(baseT105EntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseT105EntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseT105EntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseT105EntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseT105EntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseT105EntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseT105EntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コードを返します。
     * @return 局コード を戻します。
     */
    public String getT105001() {
        return t105001;
    }
    
    /**
     * 局コードをセットします。
     * @param t105001 局コード を設定。
     */
    public void setT105001(String t105001) {
        this.t105001 = t105001;
    }
    /**
     * 顧客コードを返します。
     * @return 顧客コード を戻します。
     */
    public String getT105002() {
        return t105002;
    }
    
    /**
     * 顧客コードをセットします。
     * @param t105002 顧客コード を設定。
     */
    public void setT105002(String t105002) {
        this.t105002 = t105002;
    }
    /**
     * 区分を返します。
     * @return 区分 を戻します。
     */
    public java.math.BigDecimal getT105003() {
        return t105003;
    }
    
    /**
     * 区分をセットします。
     * @param t105003 区分 を設定。
     */
    public void setT105003(java.math.BigDecimal t105003) {
        this.t105003 = t105003;
    }
    /**
     * 区分連番を返します。
     * @return 区分連番 を戻します。
     */
    public java.math.BigDecimal getT105004() {
        return t105004;
    }
    
    /**
     * 区分連番をセットします。
     * @param t105004 区分連番 を設定。
     */
    public void setT105004(java.math.BigDecimal t105004) {
        this.t105004 = t105004;
    }
    /**
     * 顧客状態を返します。
     * @return 顧客状態 を戻します。
     */
    public java.math.BigDecimal getT105101() {
        return t105101;
    }
    
    /**
     * 顧客状態をセットします。
     * @param t105101 顧客状態 を設定。
     */
    public void setT105101(java.math.BigDecimal t105101) {
        this.t105101 = t105101;
    }
    /**
     * 契約者コードを返します。
     * @return 契約者コード を戻します。
     */
    public String getT105102() {
        return t105102;
    }
    
    /**
     * 契約者コードをセットします。
     * @param t105102 契約者コード を設定。
     */
    public void setT105102(String t105102) {
        this.t105102 = t105102;
    }
    /**
     * 建物区分を返します。
     * @return 建物区分 を戻します。
     */
    public java.math.BigDecimal getT105103() {
        return t105103;
    }
    
    /**
     * 建物区分をセットします。
     * @param t105103 建物区分 を設定。
     */
    public void setT105103(java.math.BigDecimal t105103) {
        this.t105103 = t105103;
    }
    /**
     * カナ氏名を返します。
     * @return カナ氏名 を戻します。
     */
    public String getT105201() {
        return t105201;
    }
    
    /**
     * カナ氏名をセットします。
     * @param t105201 カナ氏名 を設定。
     */
    public void setT105201(String t105201) {
        this.t105201 = t105201;
    }
    /**
     * 漢字氏名１を返します。
     * @return 漢字氏名１ を戻します。
     */
    public String getT105202() {
        return t105202;
    }
    
    /**
     * 漢字氏名１をセットします。
     * @param t105202 漢字氏名１ を設定。
     */
    public void setT105202(String t105202) {
        this.t105202 = t105202;
    }
    /**
     * 漢字氏名２を返します。
     * @return 漢字氏名２ を戻します。
     */
    public String getT105203() {
        return t105203;
    }
    
    /**
     * 漢字氏名２をセットします。
     * @param t105203 漢字氏名２ を設定。
     */
    public void setT105203(String t105203) {
        this.t105203 = t105203;
    }
    /**
     * 敬称を返します。
     * @return 敬称 を戻します。
     */
    public String getT105204() {
        return t105204;
    }
    
    /**
     * 敬称をセットします。
     * @param t105204 敬称 を設定。
     */
    public void setT105204(String t105204) {
        this.t105204 = t105204;
    }
    /**
     * 漢字氏名３を返します。
     * @return 漢字氏名３ を戻します。
     */
    public String getT105205() {
        return t105205;
    }
    
    /**
     * 漢字氏名３をセットします。
     * @param t105205 漢字氏名３ を設定。
     */
    public void setT105205(String t105205) {
        this.t105205 = t105205;
    }
    /**
     * 郵便番号を返します。
     * @return 郵便番号 を戻します。
     */
    public String getT105301() {
        return t105301;
    }
    
    /**
     * 郵便番号をセットします。
     * @param t105301 郵便番号 を設定。
     */
    public void setT105301(String t105301) {
        this.t105301 = t105301;
    }
    /**
     * 住所１を返します。
     * @return 住所１ を戻します。
     */
    public String getT105302() {
        return t105302;
    }
    
    /**
     * 住所１をセットします。
     * @param t105302 住所１ を設定。
     */
    public void setT105302(String t105302) {
        this.t105302 = t105302;
    }
    /**
     * 住所２を返します。
     * @return 住所２ を戻します。
     */
    public String getT105303() {
        return t105303;
    }
    
    /**
     * 住所２をセットします。
     * @param t105303 住所２ を設定。
     */
    public void setT105303(String t105303) {
        this.t105303 = t105303;
    }
    /**
     * 丁目を返します。
     * @return 丁目 を戻します。
     */
    public String getT105304() {
        return t105304;
    }
    
    /**
     * 丁目をセットします。
     * @param t105304 丁目 を設定。
     */
    public void setT105304(String t105304) {
        this.t105304 = t105304;
    }
    /**
     * 番地を返します。
     * @return 番地 を戻します。
     */
    public String getT105305() {
        return t105305;
    }
    
    /**
     * 番地をセットします。
     * @param t105305 番地 を設定。
     */
    public void setT105305(String t105305) {
        this.t105305 = t105305;
    }
    /**
     * 号を返します。
     * @return 号 を戻します。
     */
    
    public String getT105306() {
        return t105306;
    }
    
    /**
     * 号をセットします。
     * @param t105306 号 を設定。
     */
    public void setT105306(String t105306) {
        this.t105306 = t105306;
    }
    /**
     * 棟を返します。
     * @return 棟 を戻します。
     */
    
    public String getT105307() {
        return t105307;
    }
    
    /**
     * 棟をセットします。
     * @param t105307 棟 を設定。
     */
    public void setT105307(String t105307) {
        this.t105307 = t105307;
    }
    /**
     * 部屋番号を返します。
     * @return 部屋番号 を戻します。
     */
    
    public String getT105308() {
        return t105308;
    }
    
    /**
     * 部屋番号をセットします。
     * @param t105308 部屋番号 を設定。
     */
    public void setT105308(String t105308) {
        this.t105308 = t105308;
    }
    /**
     * 集合住宅コードを返します。
     * @return 集合住宅コード を戻します。
     */
    
    public String getT105309() {
        return t105309;
    }
    
    /**
     * 集合住宅コードをセットします。
     * @param t105309 集合住宅コード を設定。
     */
    public void setT105309(String t105309) {
        this.t105309 = t105309;
    }
    /**
     * 集合住宅名を返します。
     * @return 集合住宅名 を戻します。
     */
    
    public String getT105310() {
        return t105310;
    }
    
    /**
     * 集合住宅名をセットします。
     * @param t105310 集合住宅名 を設定。
     */
    public void setT105310(String t105310) {
        this.t105310 = t105310;
    }
    /**
     * ＴＥＬ１を返します。
     * @return ＴＥＬ１ を戻します。
     */
    
    public String getT105311() {
        return t105311;
    }
    
    /**
     * ＴＥＬ１をセットします。
     * @param t105311 ＴＥＬ１ を設定。
     */
    public void setT105311(String t105311) {
        this.t105311 = t105311;
    }
    /**
     * ＴＥＬ２を返します。
     * @return ＴＥＬ２ を戻します。
     */
    
    public String getT105312() {
        return t105312;
    }
    
    /**
     * ＴＥＬ２をセットします。
     * @param t105312 ＴＥＬ２ を設定。
     */
    public void setT105312(String t105312) {
        this.t105312 = t105312;
    }
    /**
     * ＦＡＸを返します。
     * @return ＦＡＸ を戻します。
     */
    
    public String getT105313() {
        return t105313;
    }
    
    /**
     * ＦＡＸをセットします。
     * @param t105313 ＦＡＸ を設定。
     */
    public void setT105313(String t105313) {
        this.t105313 = t105313;
    }
    /**
     * メールを返します。
     * @return メール を戻します。
     */
    
    public String getT105314() {
        return t105314;
    }
    
    /**
     * メールをセットします。
     * @param t105314 メール を設定。
     */
    public void setT105314(String t105314) {
        this.t105314 = t105314;
    }
    /**
     * ＴＥＬ３を返します。
     * @return ＴＥＬ３ を戻します。
     */
    
    public String getT105315() {
        return t105315;
    }
    
    /**
     * ＴＥＬ３をセットします。
     * @param t105315 ＴＥＬ３ を設定。
     */
    public void setT105315(String t105315) {
        this.t105315 = t105315;
    }
    /**
     * メール２を返します。
     * @return メール２ を戻します。
     */
    
    public String getT105316() {
        return t105316;
    }
    
    /**
     * メール２をセットします。
     * @param t105316 メール２ を設定。
     */
    public void setT105316(String t105316) {
        this.t105316 = t105316;
    }
    /**
     * 備考を返します。
     * @return 備考 を戻します。
     */
    
    public String getT105401() {
        return t105401;
    }
    
    /**
     * 備考をセットします。
     * @param t105401 備考 を設定。
     */
    public void setT105401(String t105401) {
        this.t105401 = t105401;
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
    	return "T105";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
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
     * T105顧客住所エンティティモデルの文字列スナップショットを返します。
     * @return T105顧客住所エンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "T105顧客住所(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード(t105001)", getT105001())
    		.append("顧客コード(t105002)", getT105002())
    		.append("区分(t105003)", getT105003())
    		.append("区分連番(t105004)", getT105004())
    		.append("顧客状態(t105101)", getT105101())
    		.append("契約者コード(t105102)", getT105102())
    		.append("建物区分(t105103)", getT105103())
    		.append("カナ氏名(t105201)", getT105201())
    		.append("漢字氏名１(t105202)", getT105202())
    		.append("漢字氏名２(t105203)", getT105203())
    		.append("敬称(t105204)", getT105204())
    		.append("漢字氏名３(t105205)", getT105205())
    		.append("郵便番号(t105301)", getT105301())
    		.append("住所１(t105302)", getT105302())
    		.append("住所２(t105303)", getT105303())
    		.append("丁目(t105304)", getT105304())
    		.append("番地(t105305)", getT105305())
    		.append("号(t105306)", getT105306())
    		.append("棟(t105307)", getT105307())
    		.append("部屋番号(t105308)", getT105308())
    		.append("集合住宅コード(t105309)", getT105309())
    		.append("集合住宅名(t105310)", getT105310())
    		.append("ＴＥＬ１(t105311)", getT105311())
    		.append("ＴＥＬ２(t105312)", getT105312())
    		.append("ＦＡＸ(t105313)", getT105313())
    		.append("メール(t105314)", getT105314())
    		.append("ＴＥＬ３(t105315)", getT105315())
    		.append("メール２(t105316)", getT105316())
    		.append("備考(t105401)", getT105401())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
