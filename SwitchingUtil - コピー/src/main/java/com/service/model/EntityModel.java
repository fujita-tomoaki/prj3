package com.service.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * EntityModelのスーパークラス
 * 
 * データベースから取得したEntityModelはisPersistにtrueが入ります
 * new によって生成されたEntityModel場合はisPersistはfalseです
 * 
 * EnttiyDaoのsaveOrUpdateメソッドはisPersistプロパティがtrueの
 * 場合は更新処理、falseの場合は挿入処理を行います
 * 
 * @author yamada
 */
public abstract class EntityModel implements java.io.Serializable{
	/** DBに保存されているデータかどうかのフラグ　保存されている:true */
	private boolean isPersist;
    /** 登録者 */
    private String creator;
    /** 登録日 */
    private Timestamp createTimestamp;
    /** 更新者 */
    private String updater;
    /** 更新日 */
    private Timestamp updateTimestamp;
//    /** バージョン番号 */
//    private java.math.BigDecimal versionNo = BigDecimal.ZERO;
    /** 削除フラグ */
    private java.math.BigDecimal deleteFlg = BigDecimal.ZERO;
    /** 制限件数(0: 無制限、1以上：制限件数) */
    private java.math.BigDecimal limit = BigDecimal.ZERO;

	/**
	 * 制限件数(0: 無制限、1以上：制限件数)取得
	 * @return deleteFlg
	 */
	public java.math.BigDecimal getLimit() {
		return limit;
	}

	/**
	 * 制限件数(0: 無制限、1以上：制限件数)設定
	 * @param limit
	 */
	public void setLimit(java.math.BigDecimal limit) {
		this.limit = limit;
	}

	/**
	 * 削除フラグ取得
	 * @return deleteFlg
	 */
	public java.math.BigDecimal getDeleteFlg() {
		return deleteFlg;
	}

	/**
	 * 削除フラグ設定
	 * @param deleteFlg
	 */
	public void setDeleteFlg(java.math.BigDecimal deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
    
	/**
	 * DBに保存されているデータかどうかのフラグを取得します
	 * @return DBに保存されているデータ:true
	 */
	public boolean isPersist() {
		return isPersist;
	}

	/**
	 * DBに保存されているデータかどうかのフラグを設定します
	 * @param isPersist DBに保存されているデータ:true
	 */
	public void setPersist(boolean isPersist) {
		this.isPersist = isPersist;
	}

    /**
     * 登録者を返します。
     * @return 登録者 を戻します。
     */
    public String getCreator() {
        return creator;
    }
    
    /**
     * 登録者をセットします。
     * @param creator 登録者 を設定。
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    /**
     * 登録日を返します。
     * @return 登録日 を戻します。
     */
    public Timestamp getCreateTimestamp() {
        return createTimestamp;
    }
    
    /**
     * 登録日をセットします。
     * データを新規に挿入する場合は、自動的に生成されますので明示的にセットする必要はありません。
     * データを更新する場合はこのフィールドは更新に影響しません。
     * @param createTimestamp 登録日 を設定。
     */
    public void setCreateTimestamp(Timestamp createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
    
    /**
     * 更新者を返します。
     * @return 更新者 を戻します。
     */
    public String getUpdater() {
        return updater;
    }
    
    /**
     * 更新者をセットします。
     * @param updater 更新者 を設定。
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }
    
    /**
     * 更新日を返します。
     * @return 更新日 を戻します。
     */
    public Timestamp getUpdateTimestamp() {
        return updateTimestamp;
    }
    
    /**
     * 更新日をセットします。
     * データを新規に挿入、更新する場合は、自動的に生成されますので明示的にセットする必要はありません。
     * @param updateTimestamp 更新日 を設定。
     */
    public void setUpdateTimestamp(Timestamp updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
    
//    /**
//     * バージョン番号を返します。
//     * @return バージョン番号 を戻します。
//     */
//    public java.math.BigDecimal getVersionNo() {
//        return versionNo;
//    }
//    
//    /**
//     * バージョン番号をセットします。
//     * データを新規に挿入、更新する場合は、自動的に生成されますので明示的にセットする必要はありません。
//     * @param versionNo バージョン番号 を設定。
//     */
//    public void setVersionNo(java.math.BigDecimal versionNo) {
//        this.versionNo = versionNo;
//    }
//
//  --- ユーティリティメソッド

      /**
       * エンティティモデルに対応するデータベースのテーブル名を返します。
       * @return テーブル名
       */
      abstract public String getTableName();

      /**
       * エンティティモデルに対応するデータベーステーブルのプライマリキーオブジェクトの値を一覧で返します。
       * @return プライマリキーオブジェクト値の一覧
       */
      abstract public Object[] getPrimaryKeyValues();

}
