/*
 * @(#)Te79.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TE79スイッチング連携管理のエンティティモデルクラスです。<BR/>
 * TE79スイッチング連携管理
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTe79EntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード */
    private String te79001;
    /** 連携番号 */
    private java.math.BigDecimal te79002;
    /** 連携番号連番 */
    private java.math.BigDecimal te79003;
    /** 連携要求日時 */
    private java.sql.Timestamp te79101;
    /** 処理状況 */
    private java.math.BigDecimal te79102;
    /** サービスID */
    private String te79103;
    /** 顧客コード */
    private String te79104;
    /** 連番 */
    private java.math.BigDecimal te79105;
    /** 更新フラグ */
    private java.math.BigDecimal te79106;
    /** 申込種別 */
    private String te79107;
    /** 連携日時 */
    private java.sql.Timestamp te79201;
    /** 通信結果 */
    private java.math.BigDecimal te79202;
    /** 通信ステータス */
    private String te79203;
    /** サービス結果 */
    private java.math.BigDecimal te79301;
    /** サービスエラー理由 */
    private String te79302;
    /** 連携結果 */
    private String te79401;
    /** 連携エラー理由 */
    private String te79402;
    /** 申込番号 */
    private String te79501;
    /** 廃止取次番号 */
    private String te79601;
    /** ご連絡事項 */
    private String te79701;
    /** 優先度 */
    private java.math.BigDecimal te79801;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseTe79EntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseTe79EntityModel コピー元TE79スイッチング連携管理エンティティモデル
     */
    public BaseTe79EntityModel(BaseTe79EntityModel baseTe79EntityModel) {
        super();
        //局コードを設定します
        setTe79001(baseTe79EntityModel.getTe79001());
        //連携番号を設定します
        setTe79002(baseTe79EntityModel.getTe79002());
        //連携番号連番を設定します
        setTe79003(baseTe79EntityModel.getTe79003());
        //連携要求日時を設定します
        setTe79101(baseTe79EntityModel.getTe79101());
        //処理状況を設定します
        setTe79102(baseTe79EntityModel.getTe79102());
        //サービスIDを設定します
        setTe79103(baseTe79EntityModel.getTe79103());
        //顧客コードを設定します
        setTe79104(baseTe79EntityModel.getTe79104());
        //連番を設定します
        setTe79105(baseTe79EntityModel.getTe79105());
        //更新フラグを設定します
        setTe79106(baseTe79EntityModel.getTe79106());
        //申込種別を設定します
        setTe79107(baseTe79EntityModel.getTe79107());
        //連携日時を設定します
        setTe79201(baseTe79EntityModel.getTe79201());
        //通信結果を設定します
        setTe79202(baseTe79EntityModel.getTe79202());
        //通信ステータスを設定します
        setTe79203(baseTe79EntityModel.getTe79203());
        //サービス結果を設定します
        setTe79301(baseTe79EntityModel.getTe79301());
        //サービスエラー理由を設定します
        setTe79302(baseTe79EntityModel.getTe79302());
        //連携結果を設定します
        setTe79401(baseTe79EntityModel.getTe79401());
        //連携エラー理由を設定します
        setTe79402(baseTe79EntityModel.getTe79402());
        //申込番号を設定します
        setTe79501(baseTe79EntityModel.getTe79501());
        //廃止取次番号を設定します
        setTe79601(baseTe79EntityModel.getTe79601());
        //ご連絡事項を設定します
        setTe79701(baseTe79EntityModel.getTe79701());
        //優先度を設定します
        setTe79801(baseTe79EntityModel.getTe79801());
        //登録者を設定します
        setCreator(baseTe79EntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseTe79EntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseTe79EntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseTe79EntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseTe79EntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseTe79EntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseTe79EntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コードを返します。
     * @return 局コード を戻します。
     */
    
    public String getTe79001() {
        return te79001;
    }
    
    /**
     * 局コードをセットします。
     * @param te79001 局コード を設定。
     */
    public void setTe79001(String te79001) {
        this.te79001 = te79001;
    }
    /**
     * 連携番号を返します。
     * @return 連携番号 を戻します。
     */
    
    public java.math.BigDecimal getTe79002() {
        return te79002;
    }
    
    /**
     * 連携番号をセットします。
     * データを新規に挿入する場合は、シーケンスNoによって自動的に値が生成されますので明示的にセットする必要はありません。
     * データを更新する場合はこのフィールドは更新に影響しません。
     * @param te79002 連携番号 を設定。
     */
    public void setTe79002(java.math.BigDecimal te79002) {
        this.te79002 = te79002;
    }
    /**
     * 連携番号連番を返します。
     * @return 連携番号連番 を戻します。
     */
    
    public java.math.BigDecimal getTe79003() {
        return te79003;
    }
    
    /**
     * 連携番号連番をセットします。
     * @param te79003 連携番号連番 を設定。
     */
    public void setTe79003(java.math.BigDecimal te79003) {
        this.te79003 = te79003;
    }
    /**
     * 連携要求日時を返します。
     * @return 連携要求日時 を戻します。
     */
    
    public java.sql.Timestamp getTe79101() {
        return te79101;
    }
    
    /**
     * 連携要求日時をセットします。
     * @param te79101 連携要求日時 を設定。
     */
    public void setTe79101(java.sql.Timestamp te79101) {
        this.te79101 = te79101;
    }
    /**
     * 処理状況を返します。
     * @return 処理状況 を戻します。
     */
    
    public java.math.BigDecimal getTe79102() {
        return te79102;
    }
    
    /**
     * 処理状況をセットします。
     * @param te79102 処理状況 を設定。
     */
    public void setTe79102(java.math.BigDecimal te79102) {
        this.te79102 = te79102;
    }
    /**
     * サービスIDを返します。
     * @return サービスID を戻します。
     */
    
    public String getTe79103() {
        return te79103;
    }
    
    /**
     * サービスIDをセットします。
     * @param te79103 サービスID を設定。
     */
    public void setTe79103(String te79103) {
        this.te79103 = te79103;
    }
    /**
     * 顧客コードを返します。
     * @return 顧客コード を戻します。
     */
    
    public String getTe79104() {
        return te79104;
    }
    
    /**
     * 顧客コードをセットします。
     * @param te79104 顧客コード を設定。
     */
    public void setTe79104(String te79104) {
        this.te79104 = te79104;
    }
    /**
     * 連番を返します。
     * @return 連番 を戻します。
     */
    
    public java.math.BigDecimal getTe79105() {
        return te79105;
    }
    
    /**
     * 連番をセットします。
     * @param te79105 連番 を設定。
     */
    public void setTe79105(java.math.BigDecimal te79105) {
        this.te79105 = te79105;
    }
    /**
     * 更新フラグを返します。
     * @return 更新フラグ を戻します。
     */
    
    public java.math.BigDecimal getTe79106() {
        return te79106;
    }
    
    /**
     * 更新フラグをセットします。
     * @param te79106 更新フラグ を設定。
     */
    public void setTe79106(java.math.BigDecimal te79106) {
        this.te79106 = te79106;
    }
    /**
     * 申込種別を返します。
     * @return 申込種別 を戻します。
     */
    
    public String getTe79107() {
        return te79107;
    }
    
    /**
     * 申込種別をセットします。
     * @param te79107 申込種別 を設定。
     */
    public void setTe79107(String te79107) {
        this.te79107 = te79107;
    }
    /**
     * 連携日時を返します。
     * @return 連携日時 を戻します。
     */
    
    public java.sql.Timestamp getTe79201() {
        return te79201;
    }
    
    /**
     * 連携日時をセットします。
     * @param te79201 連携日時 を設定。
     */
    public void setTe79201(java.sql.Timestamp te79201) {
        this.te79201 = te79201;
    }
    /**
     * 通信結果を返します。
     * @return 通信結果 を戻します。
     */
    
    public java.math.BigDecimal getTe79202() {
        return te79202;
    }
    
    /**
     * 通信結果をセットします。
     * @param te79202 通信結果 を設定。
     */
    public void setTe79202(java.math.BigDecimal te79202) {
        this.te79202 = te79202;
    }
    /**
     * 通信ステータスを返します。
     * @return 通信ステータス を戻します。
     */
    
    public String getTe79203() {
        return te79203;
    }
    
    /**
     * 通信ステータスをセットします。
     * @param te79203 通信ステータス を設定。
     */
    public void setTe79203(String te79203) {
        this.te79203 = te79203;
    }
    /**
     * サービス結果を返します。
     * @return サービス結果 を戻します。
     */
    
    public java.math.BigDecimal getTe79301() {
        return te79301;
    }
    
    /**
     * サービス結果をセットします。
     * @param te79301 サービス結果 を設定。
     */
    public void setTe79301(java.math.BigDecimal te79301) {
        this.te79301 = te79301;
    }
    /**
     * サービスエラー理由を返します。
     * @return サービスエラー理由 を戻します。
     */
    
    public String getTe79302() {
        return te79302;
    }
    
    /**
     * サービスエラー理由をセットします。
     * @param te79302 サービスエラー理由 を設定。
     */
    public void setTe79302(String te79302) {
        this.te79302 = te79302;
    }
    /**
     * 連携結果を返します。
     * @return 連携結果 を戻します。
     */
    
    public String getTe79401() {
        return te79401;
    }
    
    /**
     * 連携結果をセットします。
     * @param te79401 連携結果 を設定。
     */
    public void setTe79401(String te79401) {
        this.te79401 = te79401;
    }
    /**
     * 連携エラー理由を返します。
     * @return 連携エラー理由 を戻します。
     */
    
    public String getTe79402() {
        return te79402;
    }
    
    /**
     * 連携エラー理由をセットします。
     * @param te79402 連携エラー理由 を設定。
     */
    public void setTe79402(String te79402) {
        this.te79402 = te79402;
    }
    /**
     * 申込番号を返します。
     * @return 申込番号 を戻します。
     */
    
    public String getTe79501() {
        return te79501;
    }
    
    /**
     * 申込番号をセットします。
     * @param te79501 申込番号 を設定。
     */
    public void setTe79501(String te79501) {
        this.te79501 = te79501;
    }
    /**
     * 廃止取次番号を返します。
     * @return 廃止取次番号 を戻します。
     */
    
    public String getTe79601() {
        return te79601;
    }
    
    /**
     * 廃止取次番号をセットします。
     * @param te79601 廃止取次番号 を設定。
     */
    public void setTe79601(String te79601) {
        this.te79601 = te79601;
    }
    /**
     * ご連絡事項を返します。
     * @return ご連絡事項 を戻します。
     */
    
    public String getTe79701() {
        return te79701;
    }
    
    /**
     * ご連絡事項をセットします。
     * @param te79701 ご連絡事項 を設定。
     */
    public void setTe79701(String te79701) {
        this.te79701 = te79701;
    }
    /**
     * 優先度を返します。
     * @return 優先度 を戻します。
     */
    
    public java.math.BigDecimal getTe79801() {
        return te79801;
    }
    
    /**
     * 優先度をセットします。
     * @param te79801 優先度 を設定。
     */
    public void setTe79801(java.math.BigDecimal te79801) {
        this.te79801 = te79801;
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
    	return "TE79";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getTe79001()
                    ,getTe79002()
                    ,getTe79003()
    	};
    }


    /**
     * TE79スイッチング連携管理エンティティモデルの文字列スナップショットを返します。
     * @return TE79スイッチング連携管理エンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "TE79スイッチング連携管理(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード(te79001)", getTe79001())
    		.append("連携番号(te79002)", getTe79002())
    		.append("連携番号連番(te79003)", getTe79003())
    		.append("連携要求日時(te79101)", getTe79101())
    		.append("処理状況(te79102)", getTe79102())
    		.append("サービスID(te79103)", getTe79103())
    		.append("顧客コード(te79104)", getTe79104())
    		.append("連番(te79105)", getTe79105())
    		.append("更新フラグ(te79106)", getTe79106())
    		.append("申込種別(te79107)", getTe79107())
    		.append("連携日時(te79201)", getTe79201())
    		.append("通信結果(te79202)", getTe79202())
    		.append("通信ステータス(te79203)", getTe79203())
    		.append("サービス結果(te79301)", getTe79301())
    		.append("サービスエラー理由(te79302)", getTe79302())
    		.append("連携結果(te79401)", getTe79401())
    		.append("連携エラー理由(te79402)", getTe79402())
    		.append("申込番号(te79501)", getTe79501())
    		.append("廃止取次番号(te79601)", getTe79601())
    		.append("ご連絡事項(te79701)", getTe79701())
    		.append("優先度(te79801)", getTe79801())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
