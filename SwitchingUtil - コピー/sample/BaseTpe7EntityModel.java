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
 * TPE7画面設定マスタのエンティティモデルクラスです。<BR/>
 * TPE7画面設定マスタ
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTpe7EntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード */
    private String tpe7001;
    /** 画面ＩＤ */
    private String tpe7002;
    /** 任意設定ＫＥＹ１ */
    private String tpe7003;
    /** 任意設定ＫＥＹ２ */
    private String tpe7004;
    /** 連番 */
    private java.math.BigDecimal tpe7005;
    /** 任意設定値１ */
    private String tpe7101;
    /** 任意設定値２ */
    private String tpe7102;
    /** 任意設定値３ */
    private String tpe7103;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseTpe7EntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseTpe7EntityModel コピー元TPE7画面設定マスタエンティティモデル
     */
    public BaseTpe7EntityModel(BaseTpe7EntityModel baseTpe7EntityModel) {
        super();
        //局コードを設定します
        setTpe7001(baseTpe7EntityModel.getTpe7001());
        //画面ＩＤを設定します
        setTpe7002(baseTpe7EntityModel.getTpe7002());
        //任意設定ＫＥＹ１を設定します
        setTpe7003(baseTpe7EntityModel.getTpe7003());
        //任意設定ＫＥＹ２を設定します
        setTpe7004(baseTpe7EntityModel.getTpe7004());
        //連番を設定します
        setTpe7005(baseTpe7EntityModel.getTpe7005());
        //任意設定値１を設定します
        setTpe7101(baseTpe7EntityModel.getTpe7101());
        //任意設定値２を設定します
        setTpe7102(baseTpe7EntityModel.getTpe7102());
        //任意設定値３を設定します
        setTpe7103(baseTpe7EntityModel.getTpe7103());
        //登録者を設定します
        setCreator(baseTpe7EntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseTpe7EntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseTpe7EntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseTpe7EntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseTpe7EntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseTpe7EntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseTpe7EntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コードを返します。
     * @return 局コード を戻します。
     */
    @LogInfo(columnIndex=1,columnJpName="局コード")
    public String getTpe7001() {
        return tpe7001;
    }
    
    /**
     * 局コードをセットします。
     * @param tpe7001 局コード を設定。
     */
    public void setTpe7001(String tpe7001) {
        this.tpe7001 = tpe7001;
    }
    /**
     * 画面ＩＤを返します。
     * @return 画面ＩＤ を戻します。
     */
    @LogInfo(columnIndex=2,columnJpName="画面ＩＤ")
    public String getTpe7002() {
        return tpe7002;
    }
    
    /**
     * 画面ＩＤをセットします。
     * @param tpe7002 画面ＩＤ を設定。
     */
    public void setTpe7002(String tpe7002) {
        this.tpe7002 = tpe7002;
    }
    /**
     * 任意設定ＫＥＹ１を返します。
     * @return 任意設定ＫＥＹ１ を戻します。
     */
    @LogInfo(columnIndex=3,columnJpName="任意設定ＫＥＹ１")
    public String getTpe7003() {
        return tpe7003;
    }
    
    /**
     * 任意設定ＫＥＹ１をセットします。
     * @param tpe7003 任意設定ＫＥＹ１ を設定。
     */
    public void setTpe7003(String tpe7003) {
        this.tpe7003 = tpe7003;
    }
    /**
     * 任意設定ＫＥＹ２を返します。
     * @return 任意設定ＫＥＹ２ を戻します。
     */
    @LogInfo(columnIndex=4,columnJpName="任意設定ＫＥＹ２")
    public String getTpe7004() {
        return tpe7004;
    }
    
    /**
     * 任意設定ＫＥＹ２をセットします。
     * @param tpe7004 任意設定ＫＥＹ２ を設定。
     */
    public void setTpe7004(String tpe7004) {
        this.tpe7004 = tpe7004;
    }
    /**
     * 連番を返します。
     * @return 連番 を戻します。
     */
    @LogInfo(columnIndex=5,columnJpName="連番")
    public java.math.BigDecimal getTpe7005() {
        return tpe7005;
    }
    
    /**
     * 連番をセットします。
     * @param tpe7005 連番 を設定。
     */
    public void setTpe7005(java.math.BigDecimal tpe7005) {
        this.tpe7005 = tpe7005;
    }
    /**
     * 任意設定値１を返します。
     * @return 任意設定値１ を戻します。
     */
    @LogInfo(columnIndex=6,columnJpName="任意設定値１")
    public String getTpe7101() {
        return tpe7101;
    }
    
    /**
     * 任意設定値１をセットします。
     * @param tpe7101 任意設定値１ を設定。
     */
    public void setTpe7101(String tpe7101) {
        this.tpe7101 = tpe7101;
    }
    /**
     * 任意設定値２を返します。
     * @return 任意設定値２ を戻します。
     */
    @LogInfo(columnIndex=7,columnJpName="任意設定値２")
    public String getTpe7102() {
        return tpe7102;
    }
    
    /**
     * 任意設定値２をセットします。
     * @param tpe7102 任意設定値２ を設定。
     */
    public void setTpe7102(String tpe7102) {
        this.tpe7102 = tpe7102;
    }
    /**
     * 任意設定値３を返します。
     * @return 任意設定値３ を戻します。
     */
    @LogInfo(columnIndex=8,columnJpName="任意設定値３")
    public String getTpe7103() {
        return tpe7103;
    }
    
    /**
     * 任意設定値３をセットします。
     * @param tpe7103 任意設定値３ を設定。
     */
    public void setTpe7103(String tpe7103) {
        this.tpe7103 = tpe7103;
    }
    /**
     * 登録者を返します。
     * @return 登録者 を戻します。
     */
    @Override
    @LogInfo(columnIndex=9,columnJpName="登録者")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * 登録日を返します。
     * @return 登録日 を戻します。
     */
    @Override
    @LogInfo(columnIndex=10,columnJpName="登録日")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * 更新者を返します。
     * @return 更新者 を戻します。
     */
    @Override
    @LogInfo(columnIndex=11,columnJpName="更新者")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * 更新日を返します。
     * @return 更新日 を戻します。
     */
    @Override
    @LogInfo(columnIndex=12,columnJpName="更新日")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * 更新APPを返します。
     * @return 更新APP を戻します。
     */
    @LogInfo(columnIndex=13,columnJpName="更新APP")
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
    @LogInfo(columnIndex=14,columnJpName="バージョン番号")
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
    	return "TPE7";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
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
     * TPE7画面設定マスタエンティティモデルの文字列スナップショットを返します。
     * @return TPE7画面設定マスタエンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "TPE7画面設定マスタ(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード(tpe7001)", getTpe7001())
    		.append("画面ＩＤ(tpe7002)", getTpe7002())
    		.append("任意設定ＫＥＹ１(tpe7003)", getTpe7003())
    		.append("任意設定ＫＥＹ２(tpe7004)", getTpe7004())
    		.append("連番(tpe7005)", getTpe7005())
    		.append("任意設定値１(tpe7101)", getTpe7101())
    		.append("任意設定値２(tpe7102)", getTpe7102())
    		.append("任意設定値３(tpe7103)", getTpe7103())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
