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
 * T0A9ファイル管理のエンティティモデルクラスです。<BR/>
 * T0A8エクセルテンプレート検索SQL
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT0a9EntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード */
    private String t0a9001;
    /** 連番 */
    private java.math.BigDecimal t0a9002;
    /** 管理区分 */
    private java.math.BigDecimal t0a9101;
    /** 任意設定KEY1 */
    private String t0a9102;
    /** 任意設定KEY2 */
    private String t0a9103;
    /** ファイル名 */
    private String t0a9201;
    /** データ */
    private java.io.File t0a9202;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseT0a9EntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseT0a9EntityModel コピー元T0A9ファイル管理エンティティモデル
     */
    public BaseT0a9EntityModel(BaseT0a9EntityModel baseT0a9EntityModel) {
        super();
        //局コードを設定します
        setT0a9001(baseT0a9EntityModel.getT0a9001());
        //連番を設定します
        setT0a9002(baseT0a9EntityModel.getT0a9002());
        //管理区分を設定します
        setT0a9101(baseT0a9EntityModel.getT0a9101());
        //任意設定KEY1を設定します
        setT0a9102(baseT0a9EntityModel.getT0a9102());
        //任意設定KEY2を設定します
        setT0a9103(baseT0a9EntityModel.getT0a9103());
        //ファイル名を設定します
        setT0a9201(baseT0a9EntityModel.getT0a9201());
        //データを設定します
        setT0a9202(baseT0a9EntityModel.getT0a9202());
        //登録者を設定します
        setCreator(baseT0a9EntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseT0a9EntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseT0a9EntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseT0a9EntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseT0a9EntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseT0a9EntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseT0a9EntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コードを返します。
     * @return 局コード を戻します。
     */
    public String getT0a9001() {
        return t0a9001;
    }
    
    /**
     * 局コードをセットします。
     * @param t0a9001 局コード を設定。
     */
    public void setT0a9001(String t0a9001) {
        this.t0a9001 = t0a9001;
    }
    /**
     * 連番を返します。
     * @return 連番 を戻します。
     */
    public java.math.BigDecimal getT0a9002() {
        return t0a9002;
    }
    
    /**
     * 連番をセットします。
     * データを新規に挿入する場合は、シーケンスNoによって自動的に値が生成されますので明示的にセットする必要はありません。
     * データを更新する場合はこのフィールドは更新に影響しません。
     * @param t0a9002 連番 を設定。
     */
    public void setT0a9002(java.math.BigDecimal t0a9002) {
        this.t0a9002 = t0a9002;
    }
    /**
     * 管理区分を返します。
     * @return 管理区分 を戻します。
     */
    public java.math.BigDecimal getT0a9101() {
        return t0a9101;
    }
    
    /**
     * 管理区分をセットします。
     * @param t0a9101 管理区分 を設定。
     */
    public void setT0a9101(java.math.BigDecimal t0a9101) {
        this.t0a9101 = t0a9101;
    }
    /**
     * 任意設定KEY1を返します。
     * @return 任意設定KEY1 を戻します。
     */
    public String getT0a9102() {
        return t0a9102;
    }
    
    /**
     * 任意設定KEY1をセットします。
     * @param t0a9102 任意設定KEY1 を設定。
     */
    public void setT0a9102(String t0a9102) {
        this.t0a9102 = t0a9102;
    }
    /**
     * 任意設定KEY2を返します。
     * @return 任意設定KEY2 を戻します。
     */
    public String getT0a9103() {
        return t0a9103;
    }
    
    /**
     * 任意設定KEY2をセットします。
     * @param t0a9103 任意設定KEY2 を設定。
     */
    public void setT0a9103(String t0a9103) {
        this.t0a9103 = t0a9103;
    }
    /**
     * ファイル名を返します。
     * @return ファイル名 を戻します。
     */
    public String getT0a9201() {
        return t0a9201;
    }
    
    /**
     * ファイル名をセットします。
     * @param t0a9201 ファイル名 を設定。
     */
    public void setT0a9201(String t0a9201) {
        this.t0a9201 = t0a9201;
    }
    /**
     * データを返します。
     * @return データ を戻します。
     */
    public java.io.File getT0a9202() {
        return t0a9202;
    }
    
    /**
     * データをセットします。
     * @param t0a9202 データ を設定。
     */
    public void setT0a9202(java.io.File t0a9202) {
        this.t0a9202 = t0a9202;
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
    	return "T0A9";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT0a9001()
                    ,getT0a9002()
    	};
    }


    /**
     * T0A9ファイル管理エンティティモデルの文字列スナップショットを返します。
     * @return T0A9ファイル管理エンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "T0A9ファイル管理(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード(t0a9001)", getT0a9001())
    		.append("連番(t0a9002)", getT0a9002())
    		.append("管理区分(t0a9101)", getT0a9101())
    		.append("任意設定KEY1(t0a9102)", getT0a9102())
    		.append("任意設定KEY2(t0a9103)", getT0a9103())
    		.append("ファイル名(t0a9201)", getT0a9201())
    		.append("データ(t0a9202)", getT0a9202())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
