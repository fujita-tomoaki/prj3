/*
 * @(#)Te7b.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TE7Bスイッチング連携受付メッセージのエンティティモデルクラスです。<BR/>
 * TE7Bスイッチング連携受付メッセージ
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTe7bEntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード (FK) */
    private String te7b001;
    /** 連携番号 (FK) */
    private java.math.BigDecimal te7b002;
    /** 連携番号連番 (FK) */
    private java.math.BigDecimal te7b003;
    /** 連携受付メッセージ連番 */
    private java.math.BigDecimal te7b004;
    /** 受付メッセージ区分 */
    private String te7b101;
    /** 受付メッセージ */
    private String te7b102;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseTe7bEntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseTe7bEntityModel コピー元TE7Bスイッチング連携受付メッセージエンティティモデル
     */
    public BaseTe7bEntityModel(BaseTe7bEntityModel baseTe7bEntityModel) {
        super();
        //局コード (FK)を設定します
        setTe7b001(baseTe7bEntityModel.getTe7b001());
        //連携番号 (FK)を設定します
        setTe7b002(baseTe7bEntityModel.getTe7b002());
        //連携番号連番 (FK)を設定します
        setTe7b003(baseTe7bEntityModel.getTe7b003());
        //連携受付メッセージ連番を設定します
        setTe7b004(baseTe7bEntityModel.getTe7b004());
        //受付メッセージ区分を設定します
        setTe7b101(baseTe7bEntityModel.getTe7b101());
        //受付メッセージを設定します
        setTe7b102(baseTe7bEntityModel.getTe7b102());
        //登録者を設定します
        setCreator(baseTe7bEntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseTe7bEntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseTe7bEntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseTe7bEntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseTe7bEntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseTe7bEntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseTe7bEntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コード (FK)を返します。
     * @return 局コード (FK) を戻します。
     */
    
    public String getTe7b001() {
        return te7b001;
    }
    
    /**
     * 局コード (FK)をセットします。
     * @param te7b001 局コード (FK) を設定。
     */
    public void setTe7b001(String te7b001) {
        this.te7b001 = te7b001;
    }
    /**
     * 連携番号 (FK)を返します。
     * @return 連携番号 (FK) を戻します。
     */
    
    public java.math.BigDecimal getTe7b002() {
        return te7b002;
    }
    
    /**
     * 連携番号 (FK)をセットします。
     * @param te7b002 連携番号 (FK) を設定。
     */
    public void setTe7b002(java.math.BigDecimal te7b002) {
        this.te7b002 = te7b002;
    }
    /**
     * 連携番号連番 (FK)を返します。
     * @return 連携番号連番 (FK) を戻します。
     */
    
    public java.math.BigDecimal getTe7b003() {
        return te7b003;
    }
    
    /**
     * 連携番号連番 (FK)をセットします。
     * @param te7b003 連携番号連番 (FK) を設定。
     */
    public void setTe7b003(java.math.BigDecimal te7b003) {
        this.te7b003 = te7b003;
    }
    /**
     * 連携受付メッセージ連番を返します。
     * @return 連携受付メッセージ連番 を戻します。
     */
    
    public java.math.BigDecimal getTe7b004() {
        return te7b004;
    }
    
    /**
     * 連携受付メッセージ連番をセットします。
     * @param te7b004 連携受付メッセージ連番 を設定。
     */
    public void setTe7b004(java.math.BigDecimal te7b004) {
        this.te7b004 = te7b004;
    }
    /**
     * 受付メッセージ区分を返します。
     * @return 受付メッセージ区分 を戻します。
     */
    
    public String getTe7b101() {
        return te7b101;
    }
    
    /**
     * 受付メッセージ区分をセットします。
     * @param te7b101 受付メッセージ区分 を設定。
     */
    public void setTe7b101(String te7b101) {
        this.te7b101 = te7b101;
    }
    /**
     * 受付メッセージを返します。
     * @return 受付メッセージ を戻します。
     */
    
    public String getTe7b102() {
        return te7b102;
    }
    
    /**
     * 受付メッセージをセットします。
     * @param te7b102 受付メッセージ を設定。
     */
    public void setTe7b102(String te7b102) {
        this.te7b102 = te7b102;
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
    	return "TE7B";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
     */
    public Object[] getPrimaryKeyValues(){
    	return new Object[]{
                    getTe7b001()
                    ,getTe7b002()
                    ,getTe7b003()
                    ,getTe7b004()
    	};
    }


    /**
     * TE7Bスイッチング連携受付メッセージエンティティモデルの文字列スナップショットを返します。
     * @return TE7Bスイッチング連携受付メッセージエンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "TE7Bスイッチング連携受付メッセージ(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード (FK)(te7b001)", getTe7b001())
    		.append("連携番号 (FK)(te7b002)", getTe7b002())
    		.append("連携番号連番 (FK)(te7b003)", getTe7b003())
    		.append("連携受付メッセージ連番(te7b004)", getTe7b004())
    		.append("受付メッセージ区分(te7b101)", getTe7b101())
    		.append("受付メッセージ(te7b102)", getTe7b102())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
