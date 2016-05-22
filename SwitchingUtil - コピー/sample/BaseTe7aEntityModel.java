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
 * TE7Aスイッチング連携拡張項目のエンティティモデルクラスです。<BR/>
 * TE7Aスイッチング連携拡張項目
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class BaseTe7aEntityModel extends EntityModel implements Serializable {

//--- プロパティフィールド

    /** 局コード (FK) */
    private String te7a001;
    /** 連携番号 (FK) */
    private java.math.BigDecimal te7a002;
    /** 連携番号連番 (FK) */
    private java.math.BigDecimal te7a003;
    /** 区分 */
    private java.math.BigDecimal te7a004;
    /** データ項目名 */
    private String te7a005;
    /** 値 */
    private String te7a101;
    /** 更新APP */
    private String updateApp;
    /** バージョン番号 */
    private java.math.BigDecimal versionNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public BaseTe7aEntityModel() {
        super();
    }

    /**
     * コピーコンストラクタです。
     * @param baseTe7aEntityModel コピー元TE7Aスイッチング連携拡張項目エンティティモデル
     */
    public BaseTe7aEntityModel(BaseTe7aEntityModel baseTe7aEntityModel) {
        super();
        //局コード (FK)を設定します
        setTe7a001(baseTe7aEntityModel.getTe7a001());
        //連携番号 (FK)を設定します
        setTe7a002(baseTe7aEntityModel.getTe7a002());
        //連携番号連番 (FK)を設定します
        setTe7a003(baseTe7aEntityModel.getTe7a003());
        //区分を設定します
        setTe7a004(baseTe7aEntityModel.getTe7a004());
        //データ項目名を設定します
        setTe7a005(baseTe7aEntityModel.getTe7a005());
        //値を設定します
        setTe7a101(baseTe7aEntityModel.getTe7a101());
        //登録者を設定します
        setCreator(baseTe7aEntityModel.getCreator());
        //登録日を設定します
        setCreateTimestamp(baseTe7aEntityModel.getCreateTimestamp());
        //更新者を設定します
        setUpdater(baseTe7aEntityModel.getUpdater());
        //更新日を設定します
        setUpdateTimestamp(baseTe7aEntityModel.getUpdateTimestamp());
        //更新APPを設定します
        setUpdateApp(baseTe7aEntityModel.getUpdateApp());
        //バージョン番号を設定します
        setVersionNo(baseTe7aEntityModel.getVersionNo());
        //永続化フラグを設定します
        setPersist(baseTe7aEntityModel.isPersist());
    }

//--- プロパティメソッド

    /**
     * 局コード (FK)を返します。
     * @return 局コード (FK) を戻します。
     */
    @LogInfo(columnIndex=1,columnJpName="局コード (FK)")
    public String getTe7a001() {
        return te7a001;
    }
    
    /**
     * 局コード (FK)をセットします。
     * @param te7a001 局コード (FK) を設定。
     */
    public void setTe7a001(String te7a001) {
        this.te7a001 = te7a001;
    }
    /**
     * 連携番号 (FK)を返します。
     * @return 連携番号 (FK) を戻します。
     */
    @LogInfo(columnIndex=2,columnJpName="連携番号 (FK)")
    public java.math.BigDecimal getTe7a002() {
        return te7a002;
    }
    
    /**
     * 連携番号 (FK)をセットします。
     * @param te7a002 連携番号 (FK) を設定。
     */
    public void setTe7a002(java.math.BigDecimal te7a002) {
        this.te7a002 = te7a002;
    }
    /**
     * 連携番号連番 (FK)を返します。
     * @return 連携番号連番 (FK) を戻します。
     */
    @LogInfo(columnIndex=3,columnJpName="連携番号連番 (FK)")
    public java.math.BigDecimal getTe7a003() {
        return te7a003;
    }
    
    /**
     * 連携番号連番 (FK)をセットします。
     * @param te7a003 連携番号連番 (FK) を設定。
     */
    public void setTe7a003(java.math.BigDecimal te7a003) {
        this.te7a003 = te7a003;
    }
    /**
     * 区分を返します。
     * @return 区分 を戻します。
     */
    @LogInfo(columnIndex=4,columnJpName="区分")
    public java.math.BigDecimal getTe7a004() {
        return te7a004;
    }
    
    /**
     * 区分をセットします。
     * @param te7a004 区分 を設定。
     */
    public void setTe7a004(java.math.BigDecimal te7a004) {
        this.te7a004 = te7a004;
    }
    /**
     * データ項目名を返します。
     * @return データ項目名 を戻します。
     */
    @LogInfo(columnIndex=5,columnJpName="データ項目名")
    public String getTe7a005() {
        return te7a005;
    }
    
    /**
     * データ項目名をセットします。
     * @param te7a005 データ項目名 を設定。
     */
    public void setTe7a005(String te7a005) {
        this.te7a005 = te7a005;
    }
    /**
     * 値を返します。
     * @return 値 を戻します。
     */
    @LogInfo(columnIndex=6,columnJpName="値")
    public String getTe7a101() {
        return te7a101;
    }
    
    /**
     * 値をセットします。
     * @param te7a101 値 を設定。
     */
    public void setTe7a101(String te7a101) {
        this.te7a101 = te7a101;
    }
    /**
     * 登録者を返します。
     * @return 登録者 を戻します。
     */
    @Override
    @LogInfo(columnIndex=7,columnJpName="登録者")
    public String getCreator() {
        return super.getCreator();
    }
    
    /**
     * 登録日を返します。
     * @return 登録日 を戻します。
     */
    @Override
    @LogInfo(columnIndex=8,columnJpName="登録日")
    public java.sql.Timestamp getCreateTimestamp() {
        return super.getCreateTimestamp();
    }
    
    /**
     * 更新者を返します。
     * @return 更新者 を戻します。
     */
    @Override
    @LogInfo(columnIndex=9,columnJpName="更新者")
    public String getUpdater() {
        return super.getUpdater();
    }
    
    /**
     * 更新日を返します。
     * @return 更新日 を戻します。
     */
    @Override
    @LogInfo(columnIndex=10,columnJpName="更新日")
    public java.sql.Timestamp getUpdateTimestamp() {
        return super.getUpdateTimestamp();
    }
    
    /**
     * 更新APPを返します。
     * @return 更新APP を戻します。
     */
    @LogInfo(columnIndex=11,columnJpName="更新APP")
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
    @LogInfo(columnIndex=12,columnJpName="バージョン番号")
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
    	return "TE7A";
    }

    /**
     * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
     * @return プライマリキーオブジェクト値の一覧
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
     * TE7Aスイッチング連携拡張項目エンティティモデルの文字列スナップショットを返します。
     * @return TE7Aスイッチング連携拡張項目エンティティモデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "TE7Aスイッチング連携拡張項目(" + getTableName() + ") " + new ToStringBuilder(this)
    		.append("局コード (FK)(te7a001)", getTe7a001())
    		.append("連携番号 (FK)(te7a002)", getTe7a002())
    		.append("連携番号連番 (FK)(te7a003)", getTe7a003())
    		.append("区分(te7a004)", getTe7a004())
    		.append("データ項目名(te7a005)", getTe7a005())
    		.append("値(te7a101)", getTe7a101())
    		.append("登録者(creator)", getCreator())
    		.append("登録日(createTimestamp)", getCreateTimestamp())
    		.append("更新者(updater)", getUpdater())
    		.append("更新日(updateTimestamp)", getUpdateTimestamp())
    		.append("更新APP(updateApp)", getUpdateApp())
    		.append("バージョン番号(versionNo)", getVersionNo())
    		.toString();
    }

}
