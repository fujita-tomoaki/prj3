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
 * T09E顧客アイコン定義のエンティティモデルクラスです。<BR/>
 * 
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseT09eEntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード */
    private String t09e001;
    /** 表示位置番号 */
    private java.math.BigDecimal t09e002;
    /** 対象項目番号 */
    private java.math.BigDecimal t09e101;
    /** 点灯色 */
    private String t09e102;
    /** 消灯色 */
    private String t09e103;
    /** アイコン名 */
    private String t09e104;
    /** アイコン状態区分 */
    private java.math.BigDecimal t09e105;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseT09eEntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseT09eEntityModel コピー元T09E顧客アイコン定義エンティティモデル
     */
    public BaseT09eEntityModel(BaseT09eEntityModel baseT09eEntityModel) {
        super();
        //局コードを設定します
        setT09e001(baseT09eEntityModel.getT09e001());
        //表示位置番号を設定します
        setT09e002(baseT09eEntityModel.getT09e002());
        //対象項目番号を設定します
        setT09e101(baseT09eEntityModel.getT09e101());
        //点灯色を設定します
        setT09e102(baseT09eEntityModel.getT09e102());
        //消灯色を設定します
        setT09e103(baseT09eEntityModel.getT09e103());
        //アイコン名を設定します
        setT09e104(baseT09eEntityModel.getT09e104());
        //アイコン状態区分を設定します
        setT09e105(baseT09eEntityModel.getT09e105());
        //登録者を設定します
        setCreator(baseT09eEntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseT09eEntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseT09eEntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseT09eEntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseT09eEntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseT09eEntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseT09eEntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コードを返します。
     * @return 局コード を戻します。
     */
    @LogInfo(columnIndex=1,columnJpName="局コード")
    public String getT09e001() {
        return t09e001;
    }
    
    /**
     * 局コードをセットします。
     * @param t09e001 局コード を設定。
     */
    public void setT09e001(String t09e001) {
        this.t09e001 = t09e001;
    }
    /**
     * 表示位置番号を返します。
     * @return 表示位置番号 を戻します。
     */
    @LogInfo(columnIndex=2,columnJpName="表示位置番号")
    public java.math.BigDecimal getT09e002() {
        return t09e002;
    }
    
    /**
     * 表示位置番号をセットします。
     * @param t09e002 表示位置番号 を設定。
     */
    public void setT09e002(java.math.BigDecimal t09e002) {
        this.t09e002 = t09e002;
    }
    /**
     * 対象項目番号を返します。
     * @return 対象項目番号 を戻します。
     */
    @LogInfo(columnIndex=3,columnJpName="対象項目番号")
    public java.math.BigDecimal getT09e101() {
        return t09e101;
    }
    
    /**
     * 対象項目番号をセットします。
     * @param t09e101 対象項目番号 を設定。
     */
    public void setT09e101(java.math.BigDecimal t09e101) {
        this.t09e101 = t09e101;
    }
    /**
     * 点灯色を返します。
     * @return 点灯色 を戻します。
     */
    @LogInfo(columnIndex=4,columnJpName="点灯色")
    public String getT09e102() {
        return t09e102;
    }
    
    /**
     * 点灯色をセットします。
     * @param t09e102 点灯色 を設定。
     */
    public void setT09e102(String t09e102) {
        this.t09e102 = t09e102;
    }
    /**
     * 消灯色を返します。
     * @return 消灯色 を戻します。
     */
    @LogInfo(columnIndex=5,columnJpName="消灯色")
    public String getT09e103() {
        return t09e103;
    }
    
    /**
     * 消灯色をセットします。
     * @param t09e103 消灯色 を設定。
     */
    public void setT09e103(String t09e103) {
        this.t09e103 = t09e103;
    }
    /**
     * アイコン名を返します。
     * @return アイコン名 を戻します。
     */
    @LogInfo(columnIndex=6,columnJpName="アイコン名")
    public String getT09e104() {
        return t09e104;
    }
    
    /**
     * アイコン名をセットします。
     * @param t09e104 アイコン名 を設定。
     */
    public void setT09e104(String t09e104) {
        this.t09e104 = t09e104;
    }
    /**
     * アイコン状態区分を返します。
     * @return アイコン状態区分 を戻します。
     */
    @LogInfo(columnIndex=7,columnJpName="アイコン状態区分")
    public java.math.BigDecimal getT09e105() {
        return t09e105;
    }
    
    /**
     * アイコン状態区分をセットします。
     * @param t09e105 アイコン状態区分 を設定。
     */
    public void setT09e105(java.math.BigDecimal t09e105) {
        this.t09e105 = t09e105;
    }
    /**
     * 登録者を返します。
     * @return 登録者 を戻します。
     */
    @Override
    @LogInfo(columnIndex=8,columnJpName="登録者")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * 登録日を返します。
     * @return 登録日 を戻します。
     */
    @Override
    @LogInfo(columnIndex=9,columnJpName="登録日")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * 更新者を返します。
     * @return 更新者 を戻します。
     */
    @Override
    @LogInfo(columnIndex=10,columnJpName="更新者")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * 更新日を返します。
     * @return 更新日 を戻します。
     */
    @Override
    @LogInfo(columnIndex=11,columnJpName="更新日")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * 更新APPを返します。
     * @return 更新APP を戻します。
     */
    @LogInfo(columnIndex=12,columnJpName="更新APP")
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
    @LogInfo(columnIndex=13,columnJpName="バージョン番号")
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
    	return "T09E";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getT09e001()
                    ,getT09e002()
    	};
    }


    /**
     * T09E顧客アイコン定義エンティティモデルの文字列スナップショットを返します。
     * @return T09E顧客アイコン定義エンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "T09E顧客アイコン定義(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード(t09e001)", getT09e001())
    		.append("表示位置番号(t09e002)", getT09e002())
    		.append("対象項目番号(t09e101)", getT09e101())
    		.append("点灯色(t09e102)", getT09e102())
    		.append("消灯色(t09e103)", getT09e103())
    		.append("アイコン名(t09e104)", getT09e104())
    		.append("アイコン状態区分(t09e105)", getT09e105())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
