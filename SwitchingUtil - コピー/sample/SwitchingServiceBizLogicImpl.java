package jp.co.hanshin.itec.caty.contract.service.impl;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceException;

import jp.co.hanshin.itec.caty.common.dao.T0a9EntityDao;
import jp.co.hanshin.itec.caty.common.model.T0a9EntityModel;
import jp.co.hanshin.itec.caty.contract.dao.Te11EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te17EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te71EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te72EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te73EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te76EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te77EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te78EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te79EntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7bEntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7dEntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7eEntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7fEntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7gEntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7hEntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7iEntityDao;
import jp.co.hanshin.itec.caty.contract.dao.Te7jEntityDao;
import jp.co.hanshin.itec.caty.contract.model.AbolitionAgencyQueryModel;
import jp.co.hanshin.itec.caty.contract.model.AbolitionAgencyResultsQueryModel;
import jp.co.hanshin.itec.caty.contract.model.GetElectricPowerContractInfoResult;
import jp.co.hanshin.itec.caty.contract.model.GetErrorCheckInfoResult;
import jp.co.hanshin.itec.caty.contract.model.GetSwitchingContractInfoResult;
import jp.co.hanshin.itec.caty.contract.model.LinkRequestForIs;
import jp.co.hanshin.itec.caty.contract.model.LinkRequestInfoResult;
import jp.co.hanshin.itec.caty.contract.model.SwContractStatusChangeInfoModel;
import jp.co.hanshin.itec.caty.contract.model.SwitchingUpdateAndAlartStatus;
import jp.co.hanshin.itec.caty.contract.model.SwithingParameter;
import jp.co.hanshin.itec.caty.contract.model.T105EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te11EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te17EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te72EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te73EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te74EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te76EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te77EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te78EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te79EntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7aEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7bEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7dEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7eEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7fEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7gEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7hEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7iEntityModel;
import jp.co.hanshin.itec.caty.contract.model.Te7jEntityModel;
import jp.co.hanshin.itec.caty.contract.service.CheckCharactorCodeException;
import jp.co.hanshin.itec.caty.contract.service.ContractService;
import jp.co.hanshin.itec.caty.contract.service.SwitchingException;
import jp.co.hanshin.itec.caty.master.dao.Tpe7EntityDao;
import jp.co.hanshin.itec.caty.master.model.Tpe7EntityModel;
import jp.co.hanshin.itec.caty.util.CatyPrincipal;
import jp.co.hanshin.itec.caty.util.Const;
import jp.co.hanshin.itec.caty.util.DateUtils;
import jp.co.hanshin.itec.caty.util.DivisionConstants;
import jp.co.hanshin.itec.caty.util.Gadget;
import jp.co.hanshin.itec.caty.util.MessageUtils;
import jp.co.hanshin.itec.caty.util.addon.AddOnCode;
import jp.co.hanshin.itec.caty.util.addon.AddOnControlCode;
import jp.co.hanshin.itec.caty.util.dao.EntityNotFoundException;

import org.apache.cxf.common.util.CollectionUtils;
import org.apache.cxf.common.util.StringUtils;
import org.springframework.stereotype.Component;

/**
 * SwitchingServiceBizLogicインタフェースの実装クラスです。 実装者による拡張を行ってください。
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@Component("SwitchingServiceBizLogic")
public class SwitchingServiceBizLogicImpl extends
		BaseSwitchingServiceBizLogicImpl {

	/** CRLF */
	private final String CRLF = "\\r\\n";
	
	/** メッセージID */
	private final String CHECK_MSG_ID_NO_1 = "message.010407";
	private final String CHECK_MSG_ID_NO_2 = "message.010408";
	private final String CHECK_MSG_ID_NO_3 = "message.010409";
	private final String CHECK_MSG_ID_NO_4 = "message.010445";
	private final String CHECK_MSG_ID_NO_5 = "message.010449";
	private final String CHECK_MSG_ID_NO_6 = "message.010465";
	private final String CHECK_MSG_ID_NO_7 = "message.010466";
	private final String CHECK_MSG_ID_NO_8 = "message.010467";
	private final String CHECK_MSG_ID_NO_9 = "message.010468";
	
	/** 処理状況 */
	private final BigDecimal PROCESSING_STATUS_PROCESSING = new BigDecimal(1);
	private final BigDecimal PROCESSING_STATUS_OK = new BigDecimal(2);
	private final BigDecimal PROCESSING_STATUS_NG = new BigDecimal(3);
	private final BigDecimal PROCESSING_STATUS_CHANGE = new BigDecimal(4);
	private final BigDecimal PROCESSING_STATUS_CANCEL = new BigDecimal(5);
	
	/** エラー種別 */
	private final int ERROR_KIND_0 = 0;
	private final int ERROR_KIND_1 = 1;
	private final int ERROR_KIND_2 = 2;
	private final int ERROR_KIND_3 = 3;
	private final int ERROR_KIND_4 = 4;
	private final int ERROR_KIND_5 = 5;
	private final int ERROR_KIND_6 = 6;
	
	/** 更新フラグ */
	private final BigDecimal UPDATE_FLAG_NEW = new BigDecimal(1);
	private final BigDecimal UPDATE_FLAG_CHANGE = new BigDecimal(2);
	private final BigDecimal UPDATE_FLAG_CANCEL = new BigDecimal(3);
	
	/** 受付工程 */
	private final String UKETSUKE_KOUTEI_05 = "05";
	private final String UKETSUKE_KOUTEI_06 = "06";
	private final String UKETSUKE_KOUTEI_08 = "08";
	private final String UKETSUKE_KOUTEI_09 = "09";
	
	/** 通知フラグ */
	private final BigDecimal NOTIFICATION_FLAG_TRUE = new BigDecimal(1);
	
	// --- 定数　サービスID
	/** IF_10410(再点(低圧)) */
	private final String IF_10410 = "IF_10410";
	/** IF_F10410(再点(低圧FIT電源)) */
	private final String IF_F10410 = "IF_F10410";
	/** IF_10420(業務処理状況確認(低圧)(再点)) */
	private final String IF_10420 = "IF_10420";
	/** IF_F10420(業務処理状況確認(低圧FIT電源)(再点)) */
	private final String IF_F10420 = "IF_F10420";
	/** IF_10510(廃止・撤去(低圧)) */
	private final String IF_10510 = "IF_10510";
	/** IF_K10510(廃止・撤去(高圧(500kw未満)) */
	private final String IF_K10510 = "IF_K10510";
	/** IF_F10510(廃止・撤去(低圧FIT電源)) */
	private final String IF_F10510 = "IF_F10510";
	/** IF_10520(業務処理状況確認(低圧)(廃止・撤去)) */
	private final String IF_10520 = "IF_10520";
	/** IF_K10520(業務処理状況確認(高圧(500kw未満))(廃止・撤去)) */
	private final String IF_K10520 = "IF_K10520";
	/** IF_F10520(業務処理状況確認(低圧FIT電源)(廃止・撤去)) */
	private final String IF_F10520 = "IF_F10520";
	/** IF_10110(設備情報照会(低圧)) */
	private final String IF_10110 = "IF_10110";
	/** IF_F10110(設備情報照会(低圧FIT電源)) */
	private final String IF_F10110 = "IF_F10110";
	/** IS_20110(スイッチング廃止取次登録(低圧)) */
	private final String IS_20110 = "IS_20110";
	/** IS_K20110(スイッチング廃止取次登録(高圧(500kw未満))) */
	private final String IS_K20110 = "IS_K20110";
	/** IS_F20110(スイッチング廃止取次登録(低圧FIT電源)) */
	private final String IS_F20110 = "IS_F20110";
	/** IS_20310(スイッチング廃止取次照会(低圧)) */
	private final String IS_20310 = "IS_20310";
	/** IS_K20310(スイッチング廃止取次照会(高圧(500kw未満))) */
	private final String IS_K20310 = "IS_K20310";
	/** IS_20210(スイッチング廃止取次結果照会(低圧)) */
	private final String IS_20210 = "IS_20210";
	/** IS_K20210(スイッチング廃止取次結果照会(高圧(500kw未満))) */
	private final String IS_K20210 = "IS_K20210";
	/** IS_F20210(スイッチング廃止取次照会(低圧FIT電源)) */
	private final String IS_F20210 = "IS_F20210";
	/** IF_10610(スイッチング開始申請(低圧)) */
	private final String IF_10610 = "IF_10610";
	/** IF_K10610(スイッチング開始申請(高圧(500kw未満))) */
	private final String IF_K10610 = "IF_K10610";
	/** IF_F10610(スイッチング開始申請(低圧FIT電源)) */
	private final String IF_F10610 = "IF_F10610";
	/** IF_10620(業務処理状況確認(低圧)(スイッチング開始)) */
	private final String IF_10620 = "IF_10620";
	/** IF_K10620(業務処理状況確認(高圧(500kw未満))(スイッチング開始)) */
	private final String IF_K10620 = "IF_K10620";
	/** IF_F10620(業務処理状況確認(低圧FIT電源)(スイッチング開始)) */
	private final String IF_F10620 = "IF_F10620";
	/** IS_20410(スイッチング廃止取次判断(低圧)) */
	private final String IS_20410 = "IS_20410";
	/** IS_K20410(スイッチング廃止取次判断(高圧(500kw未満)) */
	private final String IS_K20410 = "IS_K20410";
	/** IS_F20410(スイッチング廃止取次判断(低圧FIT電源)) */
	private final String IS_F20410 = "IS_F20410";
	/** IF_10710(スイッチング廃止申請(低圧)) */
	private final String IF_10710 = "IF_10710";
	/** IF_K10710(スイッチング廃止申請(高圧(500kw未満))) */
	private final String IF_K10710 = "IF_K10710";
	/** IF_F10710(スイッチング廃止申請(低圧FIT電源)) */
	private final String IF_F10710 = "IF_F10710";
	/** IF_10720(業務処理状況確認(低圧)(スイッチング廃止)) */
	private final String IF_10720 = "IF_10720";
	/** IF_K10720(業務処理状況確認(高圧(500kw未満))(スイッチング廃止)) */
	private final String IF_K10720 = "IF_K10720";
	/** IF_F10720(業務処理状況確認(低圧FIT電源)(スイッチング廃止)) */
	private final String IF_F10720 = "IF_F10720";
	/** IF_10910(アンペア変更(低圧)) */
	private final String IF_10910 = "IF_10910";
	/** IF_10920(業務処理状況確認(低圧)(アンペア変更)) */
	/** IF_10810(需要者情報変更(低圧)) */
	private final String IF_10920 = "IF_10920";
	/** IF_10810(需要場所情報変更申込(低圧)) */
	private final String IF_10810 = "IF_10810";
	/** IF_K10810(需要者情報変更(低圧)) */
	private final String IF_K10810 = "IF_K10810";
	/** IF_F10810(受電者情報変更) */
	private final String IF_F10810 = "IF_F10810";
	/** IF_10820(業務処理状況確認(低圧)(需要者情報変更)) */
	private final String IF_10820 = "IF_10820";
	/** IF_K10820(業務処理状況確認(低圧)(需要者情報変更)) */
	private final String IF_K10820 = "IF_K10820";
	/** IF_F10820(業務処理状況確認(受電者情報変更)) */
	private final String IF_F10820 = "IF_F10820";
	/** IF_10210(使用量情報照会申請(低圧)) */
	private final String IF_10210 = "IF_10210";
	/** IF_K10210(使用量情報照会申請(高圧(500kw未満)) */
	private final String IF_K10210 = "IF_K10210";
	/** IF_10220(業務処理状況確認(低圧)(使用量情報照会)) */
	private final String IF_10220 = "IF_10220";
	/** IF_K10220(業務処理状況確認(低圧)(高圧(500kw未満)) */
	private final String IF_K10220 = "IF_K10220";
	/** IF_10310(使用量情報照会(低圧)) */
	private final String IF_10310 = "IF_10310";
	/** IF_K10310(使用量情報照会(高圧(500kw未満))) */
	private final String IF_K10310 = "IF_K10310";
	/** IF_11110(異動申込一括取得(小売)(低圧)) */
	private final String IF_11110 = "IF_11110";
	/** IF_K11110(異動申込一括取得(小売)(高圧)) */
	private final String IF_K11110 = "IF_K11110";
	/** IF_F11110(受電移動申込一括取得(小売)) */
	private final String IF_F11110 = "IF_F11110";
	/** IS_F20310(スイッチング廃止取次照会(低圧FIT電源)) */
	private final String IS_F20310 = "IS_F20310";

	// --- コンストラクタ

	/** 画面設定マスタエンティティDAO */
	private Tpe7EntityDao tpe7EntityDao;

	/** ファイル管理エンティティDAO */
	private T0a9EntityDao t0a9EntityDao;

	/** スイッチングIF管理マスタEntityDao */
	private Te71EntityDao te71EntityDao;

	/** スイッチング業務処理状況確認マスタEntityDao */
	private Te73EntityDao te73EntityDao;

	/** スイッチング業務処理状況確認テーブルEntityDao */
	private Te72EntityDao te72EntityDao;

	/** スイッチング連携管理マスタEntityDao */
	private Te79EntityDao te79EntityDao;

	/** スイッチング連携受付メッセージEntityDao */
	private Te7bEntityDao te7bEntityDao;

	/** 供給・受電地点設備情報EntityDao */
	private Te7dEntityDao te7dEntityDao;

	/** 供給・受電地点設備情報_異動申込受付EntityDao */
	private Te7eEntityDao te7eEntityDao;

	/** 供給・受電地点設備情報_計器情報EntityDao */
	private Te7fEntityDao te7fEntityDao;

	/** 供給・受電地点設備情報_定額電灯EntityDao */
	private Te7gEntityDao te7gEntityDao;

	/** 供給地点使用量情報 */
	private Te7hEntityDao te7hEntityDao;
	
	/** スイッチング連携結果 */
	private Te7jEntityDao te7jEntityDao;

	/** スイッチング廃止取次結果 */
	private Te77EntityDao te77EntityDao;

	/** スイッチング廃止取次 */
	private Te76EntityDao te76EntityDao;

	/** スイッチング連携ステータス */
	private Te78EntityDao te78EntityDao;
	
	/** 電力契約共通 */
	private Te11EntityDao te11EntityDao;
	// Change Start CATPPS-769 対応 A.Miyakawa
	/** TE7I通知種別管理 */
	private Te7iEntityDao te7iEntityDao;
	// Change End CATPPS-769 対応 A.Miyakawa
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/** TE17SG電力契約共通 */
	private Te17EntityDao te17EntityDao;
	// Add End CATPPSSB-246 20160227 A.Miyakawa
	/** 契約サービス */
	private ContractService contractService;

	/**
	 * 画面設定マスタエンティティDAOをセットします。
	 * 
	 * @param tpe7EntityDao
	 *            画面設定マスタエンティティDAO
	 */
	@Resource
	public void setTpe7EntityDao(Tpe7EntityDao tpe7EntityDao) {
		this.tpe7EntityDao = tpe7EntityDao;
	}

	/**
	 * 画面設定マスタエンティティDAOを返します。
	 * 
	 * @return 画面設定マスタエンティティDAO
	 */
	public Tpe7EntityDao getTpe7EntityDao() {
		return tpe7EntityDao;
	}

	/**
	 * ファイル管理エンティティDAOをセットします。
	 * 
	 * @param t0a9EntityDao
	 *            ファイル管理エンティティDAO
	 */
	@Resource
	public void setT0a9EntityDao(T0a9EntityDao t0a9EntityDao) {
		this.t0a9EntityDao = t0a9EntityDao;
	}

	/**
	 * ファイル管理エンティティDAOを返します。
	 * 
	 * @return ファイル管理エンティティDAO
	 */
	public T0a9EntityDao getT0a9EntityDao() {
		return t0a9EntityDao;
	}

	/**
	 * 　スイッチングIF管理マスタEntityDaoを返します。
	 * 
	 * @return te71EntityDao　スイッチングIF管理マスタEntityDaoを戻します。
	 */
	public Te71EntityDao getTe71EntityDao() {
		return te71EntityDao;
	}

	/**
	 * 　スイッチングIF管理マスタEntityDaoをセットします。
	 * 
	 * @param te71EntityDao
	 *            スイッチングIF管理マスタEntityDaoを設定。
	 */
	@Resource
	public void setTe71EntityDao(Te71EntityDao te71EntityDao) {
		this.te71EntityDao = te71EntityDao;
	}

	/**
	 * 　スイッチング業務処理状況確認マスタEntityDaoを返します。
	 * 
	 * @return te73EntityDao　スイッチング業務処理状況確認マスタEntityDaoを戻します。
	 */
	public Te73EntityDao getTe73EntityDao() {
		return te73EntityDao;
	}

	/**
	 * 　スイッチング業務処理状況確認マスタEntityDaoをセットします。
	 * 
	 * @param te73EntityDao
	 *            スイッチング業務処理状況確認マスタEntityDaoを設定。
	 */
	@Resource
	public void setTe73EntityDao(Te73EntityDao te73EntityDao) {
		this.te73EntityDao = te73EntityDao;
	}

	/**
	 * 　スイッチング業務処理状況確認テーブルEntityDaoを返します。
	 * 
	 * @return te72EntityDao　スイッチング業務処理状況確認テーブルEntityDaoを戻します。
	 */
	public Te72EntityDao getTe72EntityDao() {
		return te72EntityDao;
	}

	/**
	 * 　スイッチング業務処理状況確認テーブルEntityDaoをセットします。
	 * 
	 * @param te72EntityDao
	 *            スイッチング業務処理状況確認テーブルEntityDaoを設定。
	 */
	@Resource
	public void setTe72EntityDao(Te72EntityDao te72EntityDao) {
		this.te72EntityDao = te72EntityDao;
	}

	/**
	 * 　スイッチング連携管理マスタEntityDaoを返します。
	 * 
	 * @return te79EntityDao　スイッチング連携管理マスタEntityDaoを戻します。
	 */
	public Te79EntityDao getTe79EntityDao() {
		return te79EntityDao;
	}

	/**
	 * 　スイッチング連携管理マスタEntityDaoをセットします。
	 * 
	 * @param te79EntityDao
	 *            スイッチング連携管理マスタEntityDaoを設定。
	 */
	@Resource
	public void setTe79EntityDao(Te79EntityDao te79EntityDao) {
		this.te79EntityDao = te79EntityDao;
	}

	/**
	 * スイッチング連携受付メッセージEntityDaoを返します。
	 * @return スイッチング連携受付メッセージEntityDao
	 */
	public Te7bEntityDao getTe7bEntityDao() {
		return te7bEntityDao;
	}

	/**
	 * スイッチング連携受付メッセージEntityDaoをセットします。
	 * @param te7bEntityDao スイッチング連携受付メッセージEntityDao
	 */
	@Resource
	public void setTe7bEntityDao(Te7bEntityDao te7bEntityDao) {
		this.te7bEntityDao = te7bEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報EntityDaoを返します。
	 * 
	 * @return te7dEntityDao　供給・受電地点設備情報EntityDaoを戻します。
	 */
	public Te7dEntityDao getTe7dEntityDao() {
		return te7dEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報EntityDaoをセットします。
	 * 
	 * @param te7dEntityDao
	 *            供給・受電地点設備情報EntityDaoを設定。
	 */
	@Resource
	public void setTe7dEntityDao(Te7dEntityDao te7dEntityDao) {
		this.te7dEntityDao = te7dEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報_異動申込受付EntityDaoを返します。
	 * 
	 * @return te7eEntityDao　供給・受電地点設備情報_異動申込受付EntityDaoを戻します。
	 */
	public Te7eEntityDao getTe7eEntityDao() {
		return te7eEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報_異動申込受付EntityDaoをセットします。
	 * 
	 * @param te7eEntityDao
	 *            供給・受電地点設備情報_異動申込受付EntityDaoを設定。
	 */
	@Resource
	public void setTe7eEntityDao(Te7eEntityDao te7eEntityDao) {
		this.te7eEntityDao = te7eEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報_計器情報EntityDaoを返します。
	 * 
	 * @return te7fEntityDao　供給・受電地点設備情報_計器情報EntityDaoを戻します。
	 */
	public Te7fEntityDao getTe7fEntityDao() {
		return te7fEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報_計器情報EntityDaoをセットします。
	 * 
	 * @param te7fEntityDao
	 *            供給・受電地点設備情報_計器情報EntityDaoを設定。
	 */
	@Resource
	public void setTe7fEntityDao(Te7fEntityDao te7fEntityDao) {
		this.te7fEntityDao = te7fEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報_定額電灯EntityDaoを返します。
	 * 
	 * @return te7gEntityDao　供給・受電地点設備情報_定額電灯EntityDaoを戻します。
	 */
	public Te7gEntityDao getTe7gEntityDao() {
		return te7gEntityDao;
	}

	/**
	 * 　供給・受電地点設備情報_定額電灯EntityDaoをセットします。
	 * 
	 * @param te7gEntityDao
	 *            供給・受電地点設備情報_定額電灯EntityDaoを設定。
	 */
	@Resource
	public void setTe7gEntityDao(Te7gEntityDao te7gEntityDao) {
		this.te7gEntityDao = te7gEntityDao;
	}

	/**
	 * 　供給地点使用量情報を返します。
	 * 
	 * @return te7hEntityDao　供給地点使用量情報を戻します。
	 */
	public Te7hEntityDao getTe7hEntityDao() {
		return te7hEntityDao;
	}

	/**
	 * 　供給地点使用量情報をセットします。
	 * 
	 * @param te7hEntityDao
	 *            供給地点使用量情報を設定。
	 */
	@Resource
	public void setTe7hEntityDao(Te7hEntityDao te7hEntityDao) {
		this.te7hEntityDao = te7hEntityDao;
	}
	
	/**
	 * 　スイッチング連携結果を返します。
	 * 
	 * @return te7jEntityDao　スイッチング連携結果を戻します。
	 */
	public Te7jEntityDao getTe7jEntityDao() {
		return te7jEntityDao;
	}

	/**
	 * 　スイッチング連携結果をセットします。
	 * 
	 * @param te7jEntityDao
	 *            スイッチング連携結果を設定。
	 */
	@Resource
	public void setTe7jEntityDao(Te7jEntityDao te7jEntityDao) {
		this.te7jEntityDao = te7jEntityDao;
	}
	
	/**
	 * 　スイッチング廃止取次結果を返します。
	 * 
	 * @return te77EntityDao　スイッチング廃止取次結果を戻します。
	 */
	public Te77EntityDao getTe77EntityDao() {
		return te77EntityDao;
	}

	/**
	 * 　スイッチング廃止取次結果をセットします。
	 * 
	 * @param te77EntityDao
	 *            スイッチング廃止取次結果を設定。
	 */
	@Resource
	public void setTe77EntityDao(Te77EntityDao te77EntityDao) {
		this.te77EntityDao = te77EntityDao;
	}

	/**
	 * 　スイッチング廃止取次 を返します。
	 * 
	 * @return te76EntityDao　スイッチング廃止取次 を戻します。
	 */
	public Te76EntityDao getTe76EntityDao() {
		return te76EntityDao;
	}

	/**
	 * 　スイッチング廃止取次 をセットします。
	 * 
	 * @param te76EntityDao
	 *            スイッチング廃止取次 を設定。
	 */
	@Resource
	public void setTe76EntityDao(Te76EntityDao te76EntityDao) {
		this.te76EntityDao = te76EntityDao;
	}

	/**
	 * 　スイッチング連携ステータスを返します。
	 * 
	 * @return te78EntityDao　スイッチング連携ステータスを戻します。
	 */
	public Te78EntityDao getTe78EntityDao() {
		return te78EntityDao;
	}

	/**
	 * 　スイッチング連携ステータスをセットします。
	 * 
	 * @param te78EntityDao
	 *            スイッチング連携ステータスを設定。
	 */
	@Resource
	public void setTe78EntityDao(Te78EntityDao te78EntityDao) {
		this.te78EntityDao = te78EntityDao;
	}
	
	/**
	 * 　電力契約共通を返します。
	 * 
	 * @return te78EntityDao　スイッチング連携ステータスを戻します。
	 */
	public Te11EntityDao getTe11EntityDao() {
		return te11EntityDao;
	}

	/**
	 * 　電力契約共通をセットします。
	 * 
	 * @param te78EntityDao
	 *            スイッチング連携ステータスを設定。
	 */
	@Resource
	public void setTe11EntityDao(Te11EntityDao te11EntityDao) {
		this.te11EntityDao = te11EntityDao;
	}
	// Change Start CATPPS-769 対応 A.Miyakawa
	/**
	 * 　TE7I通知種別管理EntityDaoを返します。
	 * 
	 * @return te7iEntityDao　TE7I通知種別管理EntityDaoを戻します。
	 */
	public Te7iEntityDao getTe7iEntityDao() {
		return te7iEntityDao;
	}

	/**
	 * 　TE7I通知種別管理EntityDaoをセットします。
	 * 
	 * @param te7iEntityDao
	 *            TE7I通知種別管理EntityDaoを設定。
	 */
	@Resource
	public void setTe7iEntityDao(Te7iEntityDao te7iEntityDao) {
		this.te7iEntityDao = te7iEntityDao;
	}
	// Change End CATPPS-769 対応 A.Miyakawa
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/**
	 * 　SG電力契約共通をセットします。
	 * 
	 * @param te78EntityDao
	 *            スイッチング連携ステータスを設定。
	 */
	@Resource
	public void setTe17EntityDao(Te17EntityDao te17EntityDao) {
		this.te17EntityDao = te17EntityDao;
	}
	
	/**
	 * 　SG電力契約共通を返します。
	 * 
	 * @return te78EntityDao　スイッチング連携ステータスを戻します。
	 */
	public Te17EntityDao getTe17EntityDao() {
		return te17EntityDao;
	}
	// Add Start CATPPSSB-246 20160227 A.Miyakawa

	/**
	 * 　契約サービスを返します。
	 * 
	 * @return contractService　契約サービスを戻します。
	 */
	public ContractService getContractService() {
		return contractService;
	}

	/**
	 * 　契約サービスをセットします。
	 * 
	 * @param contractService
	 *            契約サービスを設定。
	 */
	@Resource
	public void setContractService(ContractService contractService) {
		this.contractService = contractService;
	}

	/**
	 * このオブジェクトが生成されるときに呼び出されます。
	 */
	public SwitchingServiceBizLogicImpl() {
		super();
	}

	// --- ビジネスロジック実装メソッド

	/**
	 * 連携要求情報作成サービス 本サービスを使用して、連携要求情報を作成する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード 局コード
	 * @return 実行結果 連携要求情報
	 */
	public LinkRequestInfoResult createLinkRequestInfo(
			CatyPrincipal catyPrincipal, String stationCd) {

		if (stationCd == null) {
			throw new IllegalArgumentException("stationCd is null");
		}

		System.out.println("	局コード:[" + stationCd + "]");

		// 連携要求情報
		LinkRequestInfoResult result = new LinkRequestInfoResult();
		// 小売事業者情報リスト
		List<Tpe7EntityModel> tpe7EntityModelList = null;
		// 契約情報
		GetSwitchingContractInfoResult contractInfoResult = null;
		// 顧客住所情報
		List<T105EntityModel> t105EntityModelList = null;
		// 公的証明書情報
		List<T0a9EntityModel> t0a9EntityModelList = null;
		// 廃止取次情報
		Te76EntityModel te76EntityModel = null;
		// スイッチング廃止取次検索設定情報リスト
		List<Tpe7EntityModel> tpe7EntityModelSearchSettingList = null;		

		try {
			// スイッチング連携管理情報をスイッチング連携管理テーブルから取得する
			Te79EntityModel te79EntityModel = getTe79EntityDao()
					.findByRenkeiRequestInfo(catyPrincipal, stationCd);

			// 取得できた場合
			if (te79EntityModel != null) {

				// 小売事業者情報を取得する
				tpe7EntityModelList = getTpe7EntityDao()
						.getDisplayConfigMasterList(catyPrincipal, stationCd,
								"SXA0023", "KORI", null);

				// スイッチング連携管理情報から顧客コードと連番が取得できる場合のみ実施
				if (te79EntityModel.getTe79104() != null
						&& te79EntityModel.getTe79105() != null) {

					// 契約情報を取得する
					contractInfoResult = getGetSwitchingContractInfoContractServiceDao()
							.getSwitchingContractInfo(catyPrincipal, stationCd,
									te79EntityModel.getTe79104(),
									te79EntityModel.getTe79105());

					// 顧客住所情報を取得する
					t105EntityModelList = getT105EntityDao()
							.findByCustomerAddressInfo(catyPrincipal,
									stationCd, te79EntityModel.getTe79104());

					// 公的証明書情報取得する
					t0a9EntityModelList = new ArrayList<T0a9EntityModel>();

					if (contractInfoResult != null) {

						if (IF_10210.equals(te79EntityModel.getTe79103())
								|| IF_K10210.equals(te79EntityModel
										.getTe79103())) {

							t0a9EntityModelList = getT0a9EntityDao()
									.findByPublicCertificate(
											catyPrincipal,
											stationCd,
											te79EntityModel.getTe79105().toString());
						}
					}

				}

				// スイッチング連携要求拡張項目情報を取得する
				List<Te7aEntityModel> te7aEntityModelList = getTe7aEntityDao()
						.findByExtensionItemInfo(catyPrincipal, stationCd,
								te79EntityModel.getTe79002(),
								te79EntityModel.getTe79003());
				
				// 廃止取次情報を取得する
				if (IS_20410.equals(te79EntityModel.getTe79103())
						|| IS_K20410.equals(te79EntityModel.getTe79103())
						|| IS_F20410.equals(te79EntityModel.getTe79103())) {

					te76EntityModel = getTe76EntityDao()
							.findByAbolitionAgencyNoForAbolitionAgencyInfo(stationCd, te79EntityModel.getTe79601());
				}

				/** 連携要求情報を作成する */

				// 局コード
				result.setStationCd(te79EntityModel.getTe79001());
				// 連携番号
				result.setRenKeiNum(te79EntityModel.getTe79002());
				// 連携番号連番
				result.setRenKeiSerialNum(te79EntityModel.getTe79003());
				// 連携要求日時
				result.setRenKeiEntryDatetime(te79EntityModel.getTe79101());
				// 処理状況
				result.setProcessingStatus(te79EntityModel.getTe79102());
				// サービスID
				result.setServiceId(te79EntityModel.getTe79103());
				// 顧客コード
				result.setCustomerCd(te79EntityModel.getTe79104());
				// 連番
				result.setSerialNumber(te79EntityModel.getTe79105());
				// 更新フラグ
				result.setFlagUpdate(te79EntityModel.getTe79106());
				// 申込種別
				result.setAppType(te79EntityModel.getTe79107());
				// 申込番号
				result.setAppNo(te79EntityModel.getTe79501());
				// 廃止取次番号
				result.setAbolitionAgencyNo(te79EntityModel.getTe79601());

				String companyArea = "";
				// 電力会社エリア
				if (IS_20410.equals(te79EntityModel.getTe79103()) || IS_K20410.equals(te79EntityModel.getTe79103())
						|| IS_F20410.equals(te79EntityModel.getTe79103())) {
					// 2文字以上ある場合は上2桁を取得
					companyArea = te76EntityModel.getTe76206();
					if (companyArea.length() > 2) {
						companyArea = companyArea.substring(0, 2);
					}
				} else {
					// Change start 20160422 A.Takemi [CATPPS-1573]
					// スイッチング連携拡張項目.値(データ項目名 = DENRYOKUGAISHA_AREAから取得 )
					for (Te7aEntityModel model : te7aEntityModelList) {
						if (Const.LINK_DENRYOKUGAISHA_AREA.equals(model.getTe7a005())) {
							companyArea = model.getTe7a101();
						}
					}
					
					// 上記から取得できなかった場合
					if (StringUtils.isEmpty(companyArea)) {
						if (contractInfoResult != null) {
							companyArea = contractInfoResult.getPointIdentificationNumber();
						}
					}
					// Change end 20160422 A.Takemi [CATPPS-1573]
					
					// 2文字以上ある場合は上2桁を取得
					if (companyArea.length() > 2) {
						companyArea = companyArea.substring(0, 2);
					}
				}
				result.setPowerCompanyArea(companyArea);
				
				// 小売事業者コード
				result.setRetailCd(this.getRetailCd(tpe7EntityModelList, companyArea));

				// 小売事業者情報
				result.setTpe7EntityModelList(tpe7EntityModelList);
				// 契約情報
				result.setContractInfoResult(contractInfoResult);
				// 顧客住所情報
				result.setT105EntityModelList(t105EntityModelList);
				// 公的証明書情報
				result.setT0a9EntityModelList(t0a9EntityModelList);
				// スイッチング連携要求拡張項目情報
				result.setTe7aEntityModelList(te7aEntityModelList);
				// 廃止取次情報
				result.setTe76EntityModel(te76EntityModel);

			} else {
				// 取得できなかった場合

				// 業務処理状況確認マスタから連携要求を選定する
				List<Te73EntityModel> te73EntityModelList = this.te73EntityDao
						.getBizProcStatusCheckLinkRequestInfo(stationCd);
				
				if(CollectionUtils.isEmpty(te73EntityModelList)) {
					return null;
				}

				// スイッチング業務処理状況確認テーブルから前回実行時の情報を取得
				Te72EntityModel te72EntityModel = this.te72EntityDao
						.getAfBizProcStatusCheckLinkRequestInfo(stationCd);

				Te73EntityModel targetTe73EntityModel = null;

				if (te72EntityModel != null) {

					// 業務処理状況確認マスタの選別を行う
					targetTe73EntityModel = this.getTargetTe73Entity(
							te73EntityModelList, te72EntityModel.getTe72101());

					// スイッチング業務処理状況確認データの更新
					this.updateSwitchingBizProcStatusConfirm(catyPrincipal,
							targetTe73EntityModel);

				} else {

					if (!CollectionUtils.isEmpty(te73EntityModelList)) {

						targetTe73EntityModel = te73EntityModelList.get(0);

						// スイッチング業務処理状況確認データの新規登録
						this.insertSwitchingBizProcStatusConfirm(catyPrincipal,
								targetTe73EntityModel);

					}
				}

				/** 連携要求情報に必要な追加情報を取得する */

				Te79EntityModel targetAppEntity = null;

				if (targetTe73EntityModel != null) {

					// 判定用サービスID
					String checkServiceId = targetTe73EntityModel.getTe73101();

					if (IF_10220.equals(checkServiceId)
							|| IF_10420.equals(checkServiceId)
							|| IF_10520.equals(checkServiceId)
							|| IF_10620.equals(checkServiceId)
							|| IF_10720.equals(checkServiceId)
							|| IF_10820.equals(checkServiceId)
							|| IF_10920.equals(checkServiceId)
							|| IF_K10220.equals(checkServiceId)
							|| IF_K10520.equals(checkServiceId)
							|| IF_K10620.equals(checkServiceId)
							|| IF_K10720.equals(checkServiceId)
							|| IF_K10820.equals(checkServiceId)
							|| IF_F10420.equals(checkServiceId)
							|| IF_F10520.equals(checkServiceId)
							|| IF_F10620.equals(checkServiceId)
							|| IF_F10720.equals(checkServiceId)
							|| IF_F10820.equals(checkServiceId)) {

						// 検索条件のサービスIDを取得
						String searchId = this
								.getSearchingServiceId(checkServiceId);

						// 申込情報を取得
						List<Te79EntityModel> appEntityList = this.te79EntityDao
								.findByRenkeiRequestInfoForProcessedStatus(
										stationCd,
										targetTe73EntityModel.getTe73601(),
										searchId);

						// 取得できなかった場合
						if (appEntityList == null || appEntityList.size() == 0) {
							// 処理結果正常として終了する
							return null;
						}

						/** 処理中の申込を取得する */

						// 処理中連携番号が空ではない場合
						if (targetTe73EntityModel.getTe73501() != null) {

							List<Te79EntityModel> targetList = this
									.getTargetAppEntity(appEntityList,
											targetTe73EntityModel.getTe73501());

							// 対象となる申込情報リストが取得できたか判定
							if (!CollectionUtils.isEmpty(targetList)) {

								// 対象となる申込情報の1件目を処理対象とする
								targetAppEntity = targetList.get(0);
							} else {
								// 事前に取得した申込情報の1件目を処理対象とする
								targetAppEntity = appEntityList.get(0);
							}
						} else {
							// 処理中申込日時が空の場合

							// 事前に取得した申込情報の1件目を処理対象とする
							targetAppEntity = appEntityList.get(0);
						}

						// 処理対象の申込情報を用いて処理中連携番号を更新する
						this.updateAppEntity(catyPrincipal, stationCd,
								targetTe73EntityModel.getTe73002(),
								targetAppEntity.getTe79002());

						// 契約情報を取得する
						contractInfoResult = getGetSwitchingContractInfoContractServiceDao()
								.getSwitchingContractInfo(catyPrincipal,
										stationCd,
										targetAppEntity.getTe79104(),
										targetAppEntity.getTe79105());

						// 小売事業者情報を取得する
						tpe7EntityModelList = getTpe7EntityDao()
								.getDisplayConfigMasterList(catyPrincipal,
										stationCd, "SXA0023", "KORI", null);
					} else {

						/** 上記サービスID以外 */

						// 小売事業者情報を取得する
						tpe7EntityModelList = getTpe7EntityDao()
								.getDisplayConfigMasterList(catyPrincipal,
										stationCd, "SXA0023", "KORI", null);
						
						// スイッチング廃止取次検索設定を取得する
						tpe7EntityModelSearchSettingList = getTpe7EntityDao()
						.getDisplayConfigMasterList(catyPrincipal,
								stationCd, "SXA0023", "HAISHITORITSUGI_SET", null);
					}

					// 連携要求情報を作成する
					if (IF_10220.equals(checkServiceId)
							|| IF_10420.equals(checkServiceId)
							|| IF_10520.equals(checkServiceId)
							|| IF_10620.equals(checkServiceId)
							|| IF_10720.equals(checkServiceId)
							|| IF_10820.equals(checkServiceId)
							|| IF_10920.equals(checkServiceId)
							|| IF_K10220.equals(checkServiceId)
							|| IF_K10520.equals(checkServiceId)
							|| IF_K10620.equals(checkServiceId)
							|| IF_K10720.equals(checkServiceId)
							|| IF_K10820.equals(checkServiceId)
							|| IF_F10420.equals(checkServiceId)
							|| IF_F10520.equals(checkServiceId)
							|| IF_F10620.equals(checkServiceId)
							|| IF_F10720.equals(checkServiceId)
							|| IF_F10820.equals(checkServiceId)) {

						// サービスID
						result.setServiceId(checkServiceId);
						// 顧客コード
						result.setCustomerCd(targetAppEntity.getTe79104());
						// 連番
						result.setSerialNumber(targetAppEntity.getTe79105());
						// 申込種別
						result.setAppType(targetAppEntity.getTe79107());
						// 申込番号
						result.setAppNo(targetAppEntity.getTe79501());
						
						// 電力会社エリア
						String companyArea = "";
						if (contractInfoResult != null && !StringUtils.isEmpty(contractInfoResult
									.getPointIdentificationNumber())) {
							// 契約情報が取得出来た場合かつ2文字以上ある場合は上2桁を取得
							companyArea = contractInfoResult
									.getPointIdentificationNumber();
							if (companyArea.length() > 2) {
								companyArea = companyArea.substring(0, 2);
							}
						}
						result.setPowerCompanyArea(companyArea);
						// 小売事業者コード
						result.setRetailCd(this.getRetailCd(tpe7EntityModelList, companyArea));
						// 小売事業者情報
						result.setTpe7EntityModelList(tpe7EntityModelList);
						// 契約情報
						result.setContractInfoResult(contractInfoResult);
						// 申込情報
						result.setTe79EntityMode(targetAppEntity);
						// 最終未完了連携番号
						result.setLastIncompleteRenKeiNum(targetTe73EntityModel
								.getTe73601());
						// 業務処理状況確認連番
						result.setProcessingStatusSerialNumber(targetTe73EntityModel
								.getTe73002());

					} else {

						// 上記サービスID以外の場合

						// サービスID
						result.setServiceId(checkServiceId);

						// 電力会社エリア
						String companyArea  = targetTe73EntityModel.getTe73301();
						
						result.setPowerCompanyArea(companyArea);
						
						// 小売事業者コード
						result.setRetailCd(this.getRetailCd(tpe7EntityModelList, companyArea));
						
						// 小売事業者情報
						result.setTpe7EntityModelList(tpe7EntityModelList);
						
						// スイッチング廃止取次検索設定情報
						result.setTpe7EntityModelSearchSettingList(tpe7EntityModelSearchSettingList);
					}
				}
			}

		} catch (Exception e) {
			// Change Start CATPPS-1364 対応 A.Miyakawa
			// 異常の場合　チェック仕様No.6
			// Exceptionを設定する
			result.setException(e);
			// チェック仕様No.6のメッセージIDを設定する
			result.setErrorMsgId(CHECK_MSG_ID_NO_6);
			// 例外時
			// throw new RuntimeException(e.getMessage(), e);
			// Change End CATPPS-1364 対応 A.Miyakawa
		}

		return result;
	}
	
	/**
	 * 小売事業者コードを取得します。
	 * 
	 * @param tpeEntityList
	 *            TPE7画面設定マスタリスト
	 * @param companyArea 電力エリア
	 * @return 小売事業者コード
	 */
	private String getRetailCd(List<Tpe7EntityModel> tpeEntityList, String companyArea) {

		String result = null;

		// TPE7画面設定マスタリストの存在確認
		if (!CollectionUtils.isEmpty(tpeEntityList)) {

			// TPE7画面設定マスタリストのレコード群に対して任意設定KEY2 = CODEのレコードを探索
			for (Tpe7EntityModel entity : tpeEntityList) {

				// 任意設定KEY2が"CODE"か判定
				if ("CODE".equals(entity.getTpe7004())) {
					// 任意設定値1を設定
					result = entity.getTpe7101();
					
					// 電力エリアの下1桁を取得
					// Change start 20160216 A.Takemi [CATPPS-979]
					if (companyArea != null && !companyArea.isEmpty()) {
						result = result + companyArea.charAt(companyArea.length() - 1);
					}
					// Change end 20160216 A.Takemi [CATPPS-979]
					
					// 回帰処理を終了
					break;
				}
			}
		}

		return result;
	}

	/**
	 * TE73スイッチング業務処理状況確認マスタの更新を行う<br>
	 * 対象テーブル = TE73
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param te73EntityModel
	 *            スイッチング業務処理状況確認マスタ
	 * @throws EntityNotFoundException
	 */
	private void updateAppEntity(CatyPrincipal principal, String te73001,
			BigDecimal te73002, BigDecimal TE73501)
			throws EntityNotFoundException {

		// 局コードを基にレコードを抽出且つ、ロックする
		Te73EntityModel te73EntityModel = this.te73EntityDao
				.findByPrimaryKeyForUpdate(principal, te73001, te73002);

		// 処理中連携番号を設定
		te73EntityModel.setTe73501(TE73501);
		// 更新日時を設定
		te73EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// 更新APPを設定
		te73EntityModel.setUpdateApp("SXA0023");
		// DBレコード有無フラグを設定
		te73EntityModel.setPersist(true);

		// 更新処理を実行
		this.te73EntityDao.update(principal, te73EntityModel);
	}
	
	/**
	 * TE73スイッチング業務処理状況確認マスタの更新を行う<br>
	 * 対象テーブル = TE73
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param te73EntityModel
	 *            スイッチング業務処理状況確認マスタ
	 * @throws EntityNotFoundException
	 */
	private void updateLastIncompleteRenKeiNum(CatyPrincipal principal, String te73001,
			BigDecimal te73002, BigDecimal te73601)
			throws EntityNotFoundException {

		// 局コードを基にレコードを抽出且つ、ロックする
		Te73EntityModel te73EntityModel = this.te73EntityDao
				.findByPrimaryKeyForUpdate(principal, te73001, te73002);

		// 最終未完了連携番号を設定
		te73EntityModel.setTe73601(te73601);
		// 更新日時を設定
		te73EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// 更新APPを設定
		te73EntityModel.setUpdateApp("SXA0023");
		// DBレコード有無フラグを設定
		te73EntityModel.setPersist(true);

		// 更新処理を実行
		this.te73EntityDao.update(principal, te73EntityModel);
	}

	/**
	 * 対象となる申込情報を取得する
	 * 
	 * @param te79EntityModelList
	 *            申込情報リスト
	 * @param targetNo
	 *            連携番号
	 * @return 対象となる申込情報
	 */
	private List<Te79EntityModel> getTargetAppEntity(
			List<Te79EntityModel> te79EntityModelList, BigDecimal targetNo) {

		List<Te79EntityModel> resultList = new ArrayList<Te79EntityModel>();

		// 申込情報の存在確認
		if (!CollectionUtils.isEmpty(te79EntityModelList)) {

			// 指定した処理中連番より値が大きいEntityを抽出
			for (Te79EntityModel model : te79EntityModelList) {

				if (targetNo.compareTo(model.getTe79002()) < 0) {
					resultList.add(model);
				}

			}

		}

		return resultList;
	}

	/**
	 * 検索条件に用いるサービスIDを取得します。
	 * 
	 * @param originServiceId
	 * @return
	 */
	private String getSearchingServiceId(String originServiceId) {

		String targetServiceId = null;

		if (IF_10220.equals(originServiceId)) {

			targetServiceId = IF_10210;
		} else if (IF_10420.equals(originServiceId)) {

			targetServiceId = IF_10410;
		} else if (IF_10520.equals(originServiceId)) {

			targetServiceId = IF_10510;
		} else if (IF_10620.equals(originServiceId)) {

			targetServiceId = IF_10610;
		} else if (IF_10720.equals(originServiceId)) {

			targetServiceId = IF_10710;
		} else if (IF_10820.equals(originServiceId)) {

			targetServiceId = IF_10810;
		} else if (IF_10920.equals(originServiceId)) {

			targetServiceId = IF_10910;
		} else if (IF_K10220.equals(originServiceId)) {

			targetServiceId = IF_K10210;
		} else if (IF_K10520.equals(originServiceId)) {

			targetServiceId = IF_K10510;
		} else if (IF_K10620.equals(originServiceId)) {

			targetServiceId = IF_K10610;
		} else if (IF_K10720.equals(originServiceId)) {

			targetServiceId = IF_K10710;
		} else if (IF_K10820.equals(originServiceId)) {

			targetServiceId = IF_K10810;
		} else if (IF_F10420.equals(originServiceId)) {

			targetServiceId = IF_F10410;
		} else if (IF_F10520.equals(originServiceId)) {

			targetServiceId = IF_F10510;
		} else if (IF_F10620.equals(originServiceId)) {

			targetServiceId = IF_F10610;
		} else if (IF_F10720.equals(originServiceId)) {

			targetServiceId = IF_F10710;
		} else if (IF_F10820.equals(originServiceId)) {

			targetServiceId = IF_F10810;
		}

		return targetServiceId;
	}

	/**
	 * スイッチング業務処理状況確認データの新規登録を行う<br>
	 * 対象テーブル = TE72
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param te73EntityModel
	 *            スイッチング業務処理状況確認マスタ
	 */
	private void insertSwitchingBizProcStatusConfirm(CatyPrincipal principal,
			Te73EntityModel te73EntityModel) {

		Te72EntityModel te72EntityModel = new Te72EntityModel();

		Timestamp nowTimestamp = new Timestamp(System.currentTimeMillis());

		// 局コードを設定
		te72EntityModel.setTe72001(principal.getStationCd());
		// 処理中業務状況確認連番を設定
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// 登録日時を設定
		te72EntityModel.setCreateTimestamp(nowTimestamp);
		// 更新日時を設定
		te72EntityModel.setUpdateTimestamp(nowTimestamp);
		// 更新APPを設定
		te72EntityModel.setUpdateApp("SXA0023");
		// DBレコード有無フラグを設定
		te72EntityModel.setPersist(false);

		// 新規登録処理を実行
		this.te72EntityDao.save(principal, te72EntityModel);
	}

	/**
	 * スイッチング業務処理状況確認データの更新を行う<br>
	 * 対象テーブル = TE72
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param te73EntityModel
	 *            スイッチング業務処理状況確認マスタ
	 * @throws EntityNotFoundException
	 */
	private void updateSwitchingBizProcStatusConfirm(CatyPrincipal principal,
			Te73EntityModel te73EntityModel) throws EntityNotFoundException {

		// 局コードを基にレコードを抽出且つ、ロックする
		Te72EntityModel te72EntityModel = this.te72EntityDao
				.findByPrimaryKeyForUpdate(principal, principal.getStationCd());

		// 処理中業務状況確認連番を設定
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// 更新日時を設定
		te72EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// 更新APPを設定
		te72EntityModel.setUpdateApp("SXA0023");
		// DBレコード有無フラグを設定
		te72EntityModel.setPersist(true);

		// 更新処理を実行
		this.te72EntityDao.update(principal, te72EntityModel);
	}

	/**
	 * 業務処理状況確認連番値を基に業務処理状況確認マスタ情報を選別する
	 * 
	 * @param te73EntityModelList
	 *            業務処理状況確認マスタリスト
	 * @param targetNo
	 *            業務処理状況確認連番の判定値
	 * @return 業務処理状況確認マスタ情報
	 */
	private Te73EntityModel getTargetTe73Entity(
			List<Te73EntityModel> te73EntityModelList, BigDecimal targetNo) {

		Te73EntityModel resultEntityModel = null;

		// 業務処理状況確認マスタの存在確認
		if (!CollectionUtils.isEmpty(te73EntityModelList)) {

			// 指定した業務処理状況確認連番より値が大きいEntityを抽出
			for (Te73EntityModel model : te73EntityModelList) {
				if (targetNo.compareTo(model.getTe73002()) < 0) {
					resultEntityModel = model;
					break;
				}
			}

			// 抽出結果判定
			if (resultEntityModel == null) {

				// Entity群が存在しない場合、業務処理状況確認マスタの1件目を設定
				resultEntityModel = te73EntityModelList.get(0);
			}
		}

		return resultEntityModel;
	}

	/**
	 * スイッチング支援システム連携サービス 本サービスを使用して、スイッチング支援システムと連携する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 * @return 実行結果 連携要求情報
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public LinkRequestInfoResult linkSwitchingSupportSystem(
			CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) {

		try {

			/** 連携要求設定情報の取得 */

			// 現在時刻取得
			Timestamp currentTimestamp = new Timestamp(
					System.currentTimeMillis());

			// スイッチング支援システム通信設定情報を取得
			List<Tpe7EntityModel> tpe7EntityModelList = this.getTpe7EntityDao()
					.getSwitchingSystemCommunicationSettingInfo(stationCd);

			// 接続先IPアドレス
			String url = this.getConfigValue(tpe7EntityModelList, "URL");
			// 接続元IPアドレス
			String srcIp = this
					.getConfigValue(tpe7EntityModelList, "SOURCE_IP");

			/** 連携要求情報の設定 */

			// 現在時刻を連携要求情報.連携日時に設定
			linkRequestInfoResult.setRenKeiEntryDatetime(currentTimestamp);

			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl = null;
			// Change Start CATPPS-1364 対応 A.Miyakawa
			// try {
			// Change End CATPPS-1364 対応 A.Miyakawa
			// 対象のサービスクラスを取得
			cmnServiceImpl = this.getServiceClass(linkRequestInfoResult
					.getServiceId());

			// 実行前処理
			cmnServiceImpl.executePreProcessing(catyPrincipal, stationCd,
					url, srcIp);

			// Header情報設定
			cmnServiceImpl
					.settingSoapHeaderInformation(linkRequestInfoResult);
			// Change Start SW相関チェック A.Miyakawa
			String bodyErrorMsg = null;
			try {
				// Body情報設定
				cmnServiceImpl
						.settingSoapBodyInformation(linkRequestInfoResult);
			} catch (CheckCharactorCodeException e) {
				bodyErrorMsg = e.getMessage();
			}
			
			// 電話番号設定をチェックする
			boolean tellErrorMsg = false;
			if (!this.checkPhoneNo(linkRequestInfoResult
					.getT105EntityModelList())) {
				tellErrorMsg = true;
			}
			
			// 電話番号設定をチェックする
			if (tellErrorMsg || !StringUtils.isEmpty(bodyErrorMsg)) {

				// Change Start CATPPS-1364 対応 A.Miyakawa
				// 連携要求情報.処理状況に「3」を設定
//				linkRequestInfoResult
//						.setProcessingStatus(new BigDecimal(3));
				
				// メッセージIDを設定する
				if (tellErrorMsg) {
					linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_4);
				} else if (!StringUtils.isEmpty(bodyErrorMsg)) {
					linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_5);
					linkRequestInfoResult.setErrorMsg(new String[] {bodyErrorMsg});
				}
				
//				/** 連携ステータス更新処理 */
//				this.updateCooperationStatus(catyPrincipal, stationCd,
//						linkRequestInfoResult, true);
//				
//				/** スイッチング連携要求処理 */
//				this.executeSwReq(catyPrincipal, stationCd,
//				linkRequestInfoResult);
//				
//				/** スイッチング連携管理更新情報更新処理　*/
//				this.updateTe79Info(catyPrincipal,stationCd,
//						linkRequestInfoResult);
//				
//				/** 連携実行完了処理 */
//				this.completeCooperationExecute(catyPrincipal, stationCd,
//						linkRequestInfoResult, true);
//
				// Change End CATPPS-1364 対応 A.Miyakawa
				return linkRequestInfoResult;
			}
			// Change End SW相関チェック A.Miyakawa
			
			// Attache情報設定
			cmnServiceImpl
					.settingAttachmentInformation(linkRequestInfoResult);
			
			// Change Start CATPPS-1364 対応 A.Miyakawa
			// リクエスト送信
			try {
				cmnServiceImpl.sendRequestProc();
			} catch (WebServiceException we) {
				// 異常の場合
				// 連携要求情報.通信結果に「2」を設定
				linkRequestInfoResult.setCommunicationResult(2);
				// WebServiceException格納
				linkRequestInfoResult.setException(we);
				// メッセージIDを設定する
				linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_9);

				return linkRequestInfoResult;
			}
			// Change End CATPPS-1364 対応 A.Miyakawa
			
			// Change Start CATPPS-1364 対応 A.Miyakawa
			//} catch (RuntimeException e) {
			//	throw e;
			//}
			// Change End CATPPS-1364 対応 A.Miyakawa
				
			// SOAP FAULTチェック
			if (!cmnServiceImpl.isSoapFault()) {
				/** 正常の場合 */

				// 連携要求情報.サービス結果に「0」を設定
				linkRequestInfoResult.setServiceResult(0);

				// HTTPステータスコードを取得
				String httpStatusCd = cmnServiceImpl.getHttpStatusCd();

				// HTTPステータスチェック
				if (!cmnServiceImpl.isHttpStatusError()) {

					/** 正常の場合 */

					// 連携要求情報.通信結果に「0」を設定
					linkRequestInfoResult.setCommunicationResult(0);
					// 連携要求情報.通信ステータスにHTTPステータスを設定
					linkRequestInfoResult.setCommunicationStatus(httpStatusCd);

					// 連携要求の成否チェック
					if (cmnServiceImpl.isLinkRequestSuccess()) {
						
						/** 正常の場合 */

						// 連携要求情報.連携結果にレスポンス情報.連携成否ステータスを設定
						linkRequestInfoResult
								.setCooperationResult(cmnServiceImpl
										.getLinkRequestStatusCd());

						/** IF別連携結果処理 */
						boolean result = this.linkRequestResultProc(catyPrincipal, stationCd,
								linkRequestInfoResult, cmnServiceImpl);
						if (!result){
							// 正常終了の場合nullを返却する
							return null;
						}
					} else {

						/** 異常の場合 */

						// 連携要求情報.連携結果にレスポンス情報.連携成否ステータスを設定
						linkRequestInfoResult
								.setCooperationResult(cmnServiceImpl
										.getLinkRequestStatusCd());

						// 連携要求情報.連携エラー理由にレスポンス情報.連携成否ステータス名称を設定
						linkRequestInfoResult
								.setCooperationErrorReason(cmnServiceImpl
										.getLinkRequestStatusName());
						
						// Change Start CATPPS-1364 対応 A.Miyakawa
						// 連携要求情報.処理状況に「3」を設定
						//linkRequestInfoResult
						//		.setProcessingStatus(new BigDecimal(3));
						// スイッチング例外エラーコード情報取得
						tpe7EntityModelList = getTpe7EntityDao()
								.getDisplayConfigMasterList(catyPrincipal, stationCd,
										"SXA0023", "SW_EXCEPT_ERROR_CODE", null);
						
						// エラーコードチェック
						Map<String, String> uketsukeMessages = cmnServiceImpl.getUketsukeMessageMap(cmnServiceImpl);
						if (checkExceptionErrorCode(tpe7EntityModelList, uketsukeMessages)) {
							// 異常の場合（例外エラーコードが含まれている場合）
							linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_7);
						} else {
							// 正常の場合（例外エラーコードが含まれていない場合）
							// メッセージIDを設定する
							linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_3);
						}
						
						String serviceId = linkRequestInfoResult.getServiceId();
						
						if (IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
								|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
								|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
								|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
								|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
								|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
								|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
								|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
								|| IF_F10820.equals(serviceId)) {
							// スイッチング連携管理更新情報を連携管理情報に設定する(追加する)
							Te79EntityModel te79EntityModel = new Te79EntityModel();
							te79EntityModel.setTe79001(stationCd);
							te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
							te79EntityModel.setTe79701(cmnServiceImpl.getRenrakuMsg());
							List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
							te79EntityModelListUpdateInfo.add(te79EntityModel);
							linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
						}
						
						// 受付メッセージの設定
						setUketsukeMsg(catyPrincipal, linkRequestInfoResult, cmnServiceImpl);
						
						// ご連絡事項の設定
						linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
						return linkRequestInfoResult;
						// Change End CATPPS-1364 対応 A.Miyakawa
					}
				} else {

					/** 異常の場合 */

					// 連携要求情報.通信結果に「1」を設定
					linkRequestInfoResult.setCommunicationResult(1);
					// 連携要求情報.通信ステータスにHTTPステータスを設定
					linkRequestInfoResult.setCommunicationStatus(httpStatusCd);
					// Change Start CATPPS-1364 対応 A.Miyakawa
					// 連携要求情報.処理状況に「3」を設定
					//linkRequestInfoResult
					//		.setProcessingStatus(new BigDecimal(3));
					// メッセージIDを設定する
					linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_2);
					return linkRequestInfoResult;
					// Change End CATPPS-1364 対応 A.Miyakawa
				}
			} else {

				/** 異常の場合 */
				// 連携要求情報.サービス結果に「1」を設定
				linkRequestInfoResult.setServiceResult(1);
				// Change Start CATPPS-1364 対応 A.Miyakawa
				// 連携要求情報.サービスエラー理由にSOAP FAULTメッセージを設定
				linkRequestInfoResult.setServiceErrorReason(getUpSubstringValue(cmnServiceImpl
						.getSoapFaultMessage(),60));
				// 連携要求情報.処理状況に「3」を設定
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
				// メッセージIDを設定する
				linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_1);
				return linkRequestInfoResult;
				// Change End CATPPS-1364 対応 A.Miyakawa
			}
			
			// Change Start CATPPS-1364 対応 A.Miyakawa
			/** 処理状況の設定  */
			this.setProccesingStatus(catyPrincipal, stationCd,
					linkRequestInfoResult);
			// Change End CATPPS-1364 対応 A.Miyakawa

			/** 連携ステータス更新処理 */
			this.updateCooperationStatus(catyPrincipal, stationCd,
					linkRequestInfoResult, false);
			
			/** スイッチング連携連携結果登録処理 */
			this.registerSwResult(catyPrincipal, stationCd,
					linkRequestInfoResult);
			
			// Add Start CATPPSSB-246 20160227 A.Miyakawa
			// アドオンコード「SAIBUGAS」の制御コードが「ONLY」の場合（西部ガス用）
			if (catyPrincipal.getAddOnControl().getAddOnModel(AddOnCode.SAIBUGAS).getAddOnControlCode() == AddOnControlCode.SAIBUGAS__ONLY) {
				/** 解約登録日更新処理 */
				this.updateRegisterCancelingDate(catyPrincipal, stationCd, linkRequestInfoResult);
			}
			// Add End CATPPSSB-246 20160227 A.Miyakawa
			
			/** 接続廃止予定年月日更新 */
			this.registerAbolitionDate(catyPrincipal, stationCd,
					linkRequestInfoResult);
			
			/** スイッチング連携要求処理 */
			this.executeSwReq(catyPrincipal, stationCd,
					linkRequestInfoResult);
			
			/** スイッチング連携管理更新情報更新処理　*/
			this.updateTe79Info(catyPrincipal,stationCd,
					linkRequestInfoResult);
			
			/** 連携実行完了処理 */
			this.completeCooperationExecute(catyPrincipal, stationCd,
					linkRequestInfoResult, false);

		} catch (Exception e) {
			// Change End CATPPS-1364 対応 A.Miyakawa
			// 連携要求情報.処理状況に「3」を設定
//			linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
//			/** 連携実行完了処理 */
//			this.completeErrorCooperationExecute(catyPrincipal, stationCd,
//					linkRequestInfoResult);
			throw new RuntimeException(e.getMessage(), e);
			// Change End CATPPS-1364 対応 A.Miyakawa
		}

		return linkRequestInfoResult;
	}
	
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/**
	 * 解約登録日更新処理
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @throws EntityNotFoundException 
	 */
	private void updateRegisterCancelingDate(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) throws EntityNotFoundException {
		if (linkRequestInfoResult.getTe17EntityModel()!=null) {

			Te17EntityModel te17EntityModel = getTe17EntityDao().findByPrimaryKeyForUpdate(catyPrincipal,
					linkRequestInfoResult.getTe17EntityModel().getTe17001(),
					linkRequestInfoResult.getTe17EntityModel().getTe17002(),
					linkRequestInfoResult.getTe17EntityModel().getTe17003());
			te17EntityModel.setTe17101(linkRequestInfoResult.getTe17EntityModel().getTe17101());
			getTe17EntityDao().update(catyPrincipal, te17EntityModel);

		}
	}
	// Add End CATPPSSB-246 20160227 A.Miyakawa
	
	/**
	 * 処理状況の設定
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 */
	private void setProccesingStatus(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {
		
		String serviceId = linkRequestInfoResult.getServiceId();
		
		SwitchingUpdateAndAlartStatus status = new SwitchingUpdateAndAlartStatus();
		
		if (IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
				|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
				|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
				|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
				|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
				|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
				|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
				|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
				|| IF_F10820.equals(serviceId)) {
			boolean changeDateFlg = false;
			if (linkRequestInfoResult.getChangesDatePlan() != null
					&& linkRequestInfoResult.getChangesDate() != null) {
				changeDateFlg = true;
			}
			status = getUpdateAndalartStatus(
					serviceId, linkRequestInfoResult.getErrorMsgId(), null
					, null , linkRequestInfoResult.getReceivingStep(), null, changeDateFlg);
			linkRequestInfoResult.setProcessingStatus(status.getProcessingStatus());
			linkRequestInfoResult.setSwitchingUpdateAndAlartStatus(status);
		} else if (IF_10110.equals(serviceId) || IF_F10110.equals(serviceId) ||
				IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)||
				IF_10510.equals(serviceId) || IF_K10510.equals(serviceId) ||
				IF_F10510.equals(serviceId) || IS_20110.equals(serviceId) ||
				IS_K20110.equals(serviceId) || IS_F20110.equals(serviceId) ||
				IF_10610.equals(serviceId) || IF_K10610.equals(serviceId) ||
				IF_F10610.equals(serviceId) || IF_10710.equals(serviceId) ||
				IF_K10710.equals(serviceId) || IF_F10710.equals(serviceId) ||
				IF_10210.equals(serviceId) || IF_K10210.equals(serviceId) ||
				IF_10810.equals(serviceId) || IF_K10810.equals(serviceId) ||
				IF_F10810.equals(serviceId) || IF_10910.equals(serviceId) ||
				IF_10310.equals(serviceId) || IF_K10310.equals(serviceId) ||
				IS_20410.equals(serviceId) || IS_K20410.equals(serviceId) ||
				IS_F20410.equals(serviceId)) {
			status = getUpdateAndalartStatus(
					serviceId, linkRequestInfoResult.getErrorMsgId(), linkRequestInfoResult.getFlagUpdate()
					, linkRequestInfoResult.getJudgeMent() , null, null, false);
			linkRequestInfoResult.setProcessingStatus(status.getProcessingStatus());
			linkRequestInfoResult.setSwitchingUpdateAndAlartStatus(status);
		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId) ||
				IS_F20210.equals(serviceId) || IS_20310.equals(serviceId) ||
				IS_K20310.equals(serviceId) || IS_F20310.equals(serviceId)) {
			
			status = getUpdateAndalartStatus(serviceId, linkRequestInfoResult.getErrorMsgId(), null
					, null, null, null ,false);
			linkRequestInfoResult.setSwitchingUpdateAndAlartStatus(status);
			
			List<LinkRequestForIs> links = linkRequestInfoResult.getLinkReqForIs();
			List<LinkRequestForIs> results = new ArrayList<LinkRequestForIs>();
			if (links!=null)
				for (LinkRequestForIs link:links) {
					status = getUpdateAndalartStatus(serviceId, linkRequestInfoResult.getErrorMsgId(), null
							, null, null, link.getStatus() ,false);
					link.setProcessingStatus(status.getProcessingStatus());
					link.setSwitchingUpdateAndAlartStatus(status);
					results.add(link);
				}
			linkRequestInfoResult.setLinkReqForIs(results);
		}
		
	}

	/**
	 * スイッチング支援システム連携結果判定情報取得
	 * @param serviceId
	 * @param errorMsgId
	 * @param flagUpdate
	 * @param judgeMent
	 * @param koutei
	 * @param status720
	 * @param difDayFlag
	 * @return
	 */
	protected SwitchingUpdateAndAlartStatus getUpdateAndalartStatus(
			String serviceId, String errorMsgId, BigDecimal flagUpdate,
			String judgeMent, String koutei, String status, boolean difDayFlag) {
		
		SwitchingUpdateAndAlartStatus switchingStatus = new SwitchingUpdateAndAlartStatus();
		
		int errorKind = getErrorKind(errorMsgId);
		
		// サービスIDを判断し、処理を分岐する
		if ( IF_10110.equals(serviceId) || IF_F10110.equals(serviceId) ) {
			
			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			// ご連絡事項
			// 受付メッセージ
			switchingStatus.setUketsukeMsgFlag(true);
			// メール
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
				case 1:
					switchingStatus.setMailKind("100");
					break;
				case 2:
					switchingStatus.setMailKind("101");
					break;
				case 3:
					switchingStatus.setMailKind("102");
					break;
				case 4:
					switchingStatus.setMailKind("103");
					break;
				case 5:
					switchingStatus.setMailKind("104");
					break;
				case 6:
					switchingStatus.setMailKind("105");
					break;
				case 0:
					switchingStatus.setMailKind("106");
				default:
					break;
			}
		
		} else if (IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)) {
			
			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160425 I.Kudou [CATPPSSB-563]
				//switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				if (UPDATE_FLAG_CANCEL.equals(flagUpdate))
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
				else
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160425 I.Kudou [CATPPSSB-563]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
			//	if (UPDATE_FLAG_CHANGE.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			//	else if (UPDATE_FLAG_CANCEL.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_CHANGE.equals(flagUpdate) )
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(200));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(220));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_NEW.equals(flagUpdate) )
				switchingStatus.setStatusCode(new BigDecimal(230));
			// Add start 20160425 I.Kudou [CATPPSSB-563]
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setStatusCode(new BigDecimal(230));
			// Add end 20160425 I.Kudou [CATPPSSB-563]
			
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			// バッチ結果
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			if (flagUpdate != null)
				switch (errorKind) {
				case 1:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("107");
						break;
					case 2:
						switchingStatus.setMailKind("108");
						break;
					case 3:
						switchingStatus.setMailKind("109");
						break;
					}
					break;
				case 2:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("110");
						break;
					case 2:
						switchingStatus.setMailKind("111");
						break;
					case 3:
						switchingStatus.setMailKind("112");
						break;
					}
					break;
				case 3:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("113");
						break;
					case 2:
						switchingStatus.setMailKind("114");
						break;
					case 3:
						switchingStatus.setMailKind("115");
						break;
					}
					break;
				case 4:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("116");
						break;
					case 2:
						switchingStatus.setMailKind("117");
						break;
					case 3:
						switchingStatus.setMailKind("118");
						break;
					}
					break;
				case 5:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("119");
						break;
					case 2:
						switchingStatus.setMailKind("120");
						break;
					case 3:
						switchingStatus.setMailKind("121");
						break;
					}
					break;
				case 6:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("122");
						break;
					case 2:
						switchingStatus.setMailKind("123");
						break;
					case 3:
						switchingStatus.setMailKind("124");
						break;
					}
					break;
				case 0:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("125");
						break;
					case 2:
						switchingStatus.setMailKind("126");
						break;
					case 3:
						switchingStatus.setMailKind("127");
						break;
					}
					break;
				default:
					break;
				}
			
		} else if (IF_10420.equals(serviceId) || IF_F10420.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(200));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setStatusCode(new BigDecimal(240));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(230));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(230));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("128");
				break;
			case 2:
				switchingStatus.setMailKind("129");
				break;
			case 3:
				switchingStatus.setMailKind("130");
				break;
			case 4:
				switchingStatus.setMailKind("131");
				break;
			case 5:
				switchingStatus.setMailKind("132");
				break;
			case 6:
				switchingStatus.setMailKind("133");
				break;
			case 0:
				if (UKETSUKE_KOUTEI_05.equals(koutei)) {
					switchingStatus.setMailKind("134");
				} else if (UKETSUKE_KOUTEI_06.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("135");
					else
						switchingStatus.setMailKind("136");
				} else if (UKETSUKE_KOUTEI_08.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("137");
					else
						switchingStatus.setMailKind("138");
				} else if (UKETSUKE_KOUTEI_09.equals(koutei)) {
					switchingStatus.setMailKind("139");
				}
				break;
			default:
				break;
			}

		} else if (IF_10510.equals(serviceId) || IF_K10510.equals(serviceId)
				|| IF_F10510.equals(serviceId)) {
			
			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160425 I.Kudou [CATPPSSB-563]
				//switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				if (UPDATE_FLAG_CANCEL.equals(flagUpdate))
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
				else
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160425 I.Kudou [CATPPSSB-563]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
			//	if (UPDATE_FLAG_CHANGE.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			//	else if (UPDATE_FLAG_CANCEL.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_CHANGE.equals(flagUpdate) )
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(300));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(320));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_NEW.equals(flagUpdate) )
				switchingStatus.setStatusCode(new BigDecimal(330));
			// Add start 20160425 I.Kudou [CATPPSSB-563]
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setStatusCode(new BigDecimal(330));
			// Add end 20160425 I.Kudou [CATPPSSB-563]
			
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			// バッチ結果
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			if (flagUpdate != null)
				switch (errorKind) {
				case 1:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("140");
						break;
					case 2:
						switchingStatus.setMailKind("141");
						break;
					case 3:
						switchingStatus.setMailKind("142");
						break;
					}
					break;
				case 2:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("143");
						break;
					case 2:
						switchingStatus.setMailKind("144");
						break;
					case 3:
						switchingStatus.setMailKind("145");
						break;
					}
					break;
				case 3:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("146");
						break;
					case 2:
						switchingStatus.setMailKind("147");
						break;
					case 3:
						switchingStatus.setMailKind("148");
						break;
					}
					break;
				case 4:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("149");
						break;
					case 2:
						switchingStatus.setMailKind("150");
						break;
					case 3:
						switchingStatus.setMailKind("151");
						break;
					}
					break;
				case 5:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("152");
						break;
					case 2:
						switchingStatus.setMailKind("153");
						break;
					case 3:
						switchingStatus.setMailKind("154");
						break;
					}
					break;
				case 6:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("155");
						break;
					case 2:
						switchingStatus.setMailKind("156");
						break;
					case 3:
						switchingStatus.setMailKind("157");
						break;
					}
					break;
				case 0:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("158");
						break;
					case 2:
						switchingStatus.setMailKind("159");
						break;
					case 3:
						switchingStatus.setMailKind("160");
						break;
					}
					break;
				default:
					break;
				}
			
		} else if (IF_10520.equals(serviceId) || IF_K10520.equals(serviceId)
				|| IF_F10520.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(300));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei))
					switchingStatus.setStatusCode(new BigDecimal(340));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(330));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(330));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("161");
				break;
			case 2:
				switchingStatus.setMailKind("162");
				break;
			case 3:
				switchingStatus.setMailKind("163");
				break;
			case 4:
				switchingStatus.setMailKind("164");
				break;
			case 5:
				switchingStatus.setMailKind("165");
				break;
			case 6:
				switchingStatus.setMailKind("166");
				break;
			case 0:
				if (UKETSUKE_KOUTEI_05.equals(koutei)) {
					switchingStatus.setMailKind("167");
				} else if (UKETSUKE_KOUTEI_06.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("168");
					else
						switchingStatus.setMailKind("169");
				} else if (UKETSUKE_KOUTEI_09.equals(koutei)) {
					switchingStatus.setMailKind("170");
				}
				break;
			default:
				break;
			}

		} else if (IS_20110.equals(serviceId) || IS_K20110.equals(serviceId)
				|| IS_F20110.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160425 I.Kudou [CATPPSSB-563]
				//switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				if (UPDATE_FLAG_CANCEL.equals(flagUpdate))
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
				else
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160425 I.Kudou [CATPPSSB-563]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
			//	if (UPDATE_FLAG_CHANGE.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			//	else if (UPDATE_FLAG_CANCEL.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_CHANGE.equals(flagUpdate) )
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(420));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_NEW.equals(flagUpdate) )
				switchingStatus.setStatusCode(new BigDecimal(430));
			// Add start 20160425 I.Kudou [CATPPSSB-563]
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setStatusCode(new BigDecimal(430));
			// Add end 20160425 I.Kudou [CATPPSSB-563]
			
			// バッチ結果
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			if (flagUpdate != null)
				switch (errorKind) {
				case 1:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("171");
						break;
					case 2:
						switchingStatus.setMailKind("172");
						break;
					case 3:
						switchingStatus.setMailKind("173");
						break;
					}
					break;
				case 2:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("174");
						break;
					case 2:
						switchingStatus.setMailKind("175");
						break;
					case 3:
						switchingStatus.setMailKind("176");
						break;
					}
					break;
				case 3:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("177");
						break;
					case 2:
						switchingStatus.setMailKind("178");
						break;
					case 3:
						switchingStatus.setMailKind("179");
						break;
					}
					break;
				case 4:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("180");
						break;
					case 2:
						switchingStatus.setMailKind("181");
						break;
					case 3:
						switchingStatus.setMailKind("182");
						break;
					}
					break;
				case 5:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("183");
						break;
					case 2:
						switchingStatus.setMailKind("184");
						break;
					case 3:
						switchingStatus.setMailKind("185");
						break;
					}
					break;
				case 6:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("186");
						break;
					case 2:
						switchingStatus.setMailKind("187");
						break;
					case 3:
						switchingStatus.setMailKind("188");
						break;
					}
					break;
				case 0:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("189");
						break;
					case 2:
						switchingStatus.setMailKind("190");
						break;
					case 3:
						switchingStatus.setMailKind("191");
						break;
					}
					break;
				default:
					break;
				}

		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId)
				|| IS_F20210.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if ("02".equals(status) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if ( "03".equals(status) || "06".equals(status) || "07".equals(status))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if ("02".equals(status))
					switchingStatus.setStatusCode(new BigDecimal(450));
				else if ("03".equals(status) || "06".equals(status) || "07".equals(status))
					switchingStatus.setStatusCode(new BigDecimal(430));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("192");
				break;
			case 2:
				switchingStatus.setMailKind("193");
				break;
			case 3:
				switchingStatus.setMailKind("194");
				break;
			case 4:
				switchingStatus.setMailKind("195");
				break;
			case 5:
				switchingStatus.setMailKind("196");
				break;
			case 6:
				switchingStatus.setMailKind("197");
				break;
			case 0:
				if ("02".equals(status)) {
					switchingStatus.setMailKind("198");
				} else if ("03".equals(status)) {
					switchingStatus.setMailKind("199");
				} else if ("06".equals(status)) {
					switchingStatus.setMailKind("371");
				} else if ("07".equals(status)) {
					switchingStatus.setMailKind("372");
				}
				break;
			default:
				break;
			}

		} else if (IS_20310.equals(serviceId) || IS_K20310.equals(serviceId)
				|| IS_F20310.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// 分類コード
			// 遷移先ステータスコード
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("200");
				break;
			case 2:
				switchingStatus.setMailKind("201");
				break;
			case 3:
				switchingStatus.setMailKind("202");
				break;
			case 4:
				switchingStatus.setMailKind("203");
				break;
			case 5:
				switchingStatus.setMailKind("204");
				break;
			case 6:
				switchingStatus.setMailKind("205");
				break;
			case 0:
				if ("01".equals(status)) {
					switchingStatus.setMailKind("206");
				}
				break;
			default:
				break;
			}

		} else if (IF_10610.equals(serviceId) || IF_K10610.equals(serviceId)
				|| IF_F10610.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160424 I.Kudou [CATPPSSB-563]
				//switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				if (UPDATE_FLAG_CANCEL.equals(flagUpdate))
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
				else
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160424 I.Kudou [CATPPSSB-563]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
			//	if (UPDATE_FLAG_CHANGE.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			//	else if (UPDATE_FLAG_CANCEL.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_CHANGE.equals(flagUpdate) )
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(460));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_NEW.equals(flagUpdate) )
				switchingStatus.setStatusCode(new BigDecimal(470));
			// Add start 20160425 I.Kudou [CATPPSSB-563]
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setStatusCode(new BigDecimal(470));
			// Add end 20160425 I.Kudou [CATPPSSB-563]
			
			// バッチ結果
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			if (flagUpdate != null)
				switch (errorKind) {
				case 1:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("207");
						break;
					case 2:
						switchingStatus.setMailKind("208");
						break;
					case 3:
						switchingStatus.setMailKind("209");
						break;
					}
					break;
				case 2:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("210");
						break;
					case 2:
						switchingStatus.setMailKind("211");
						break;
					case 3:
						switchingStatus.setMailKind("212");
						break;
					}
					break;
				case 3:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("213");
						break;
					case 2:
						switchingStatus.setMailKind("214");
						break;
					case 3:
						switchingStatus.setMailKind("215");
						break;
					}
					break;
				case 4:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("216");
						break;
					case 2:
						switchingStatus.setMailKind("217");
						break;
					case 3:
						switchingStatus.setMailKind("218");
						break;
					}
					break;
				case 5:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("219");
						break;
					case 2:
						switchingStatus.setMailKind("220");
						break;
					case 3:
						switchingStatus.setMailKind("221");
						break;
					}
					break;
				case 6:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("222");
						break;
					case 2:
						switchingStatus.setMailKind("223");
						break;
					case 3:
						switchingStatus.setMailKind("224");
						break;
					}
					break;
				case 0:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("225");
						break;
					case 2:
						switchingStatus.setMailKind("226");
						break;
					case 3:
						switchingStatus.setMailKind("227");
						break;
					}
					break;
				default:
					break;
				}

		} else if (IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
				|| IF_F10620.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setStatusCode(new BigDecimal(480));
				else if (UKETSUKE_KOUTEI_05.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(465));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(470));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(470));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("228");
				break;
			case 2:
				switchingStatus.setMailKind("229");
				break;
			case 3:
				switchingStatus.setMailKind("230");
				break;
			case 4:
				switchingStatus.setMailKind("231");
				break;
			case 5:
				switchingStatus.setMailKind("232");
				break;
			case 6:
				switchingStatus.setMailKind("233");
				break;
			case 0:
				if (UKETSUKE_KOUTEI_05.equals(koutei)) {
					switchingStatus.setMailKind("234");
				} else if (UKETSUKE_KOUTEI_06.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("235");
					else
						switchingStatus.setMailKind("236");
				}  else if (UKETSUKE_KOUTEI_08.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("237");
					else
						switchingStatus.setMailKind("238");
				} else if (UKETSUKE_KOUTEI_09.equals(koutei)) {
					switchingStatus.setMailKind("239");
				}
				break;
			default:
				break;
			}

		} else if (IS_20410.equals(serviceId) || IS_K20410.equals(serviceId)
				|| IS_F20410.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(500));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus()) && "01".equals(judgeMent) ) {
				switchingStatus.setStatusCode(new BigDecimal(520));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("240");
				break;
			case 2:
				switchingStatus.setMailKind("241");
				break;
			case 3:
				switchingStatus.setMailKind("242");
				break;
			case 4:
				switchingStatus.setMailKind("243");
				break;
			case 5:
				switchingStatus.setMailKind("244");
				break;
			case 6:
				switchingStatus.setMailKind("245");
				break;
			case 0:
				if ("01".equals(judgeMent) )
					switchingStatus.setMailKind("246");
				else if ("02".equals(judgeMent) )
					switchingStatus.setMailKind("247");
				break;
			default:
				break;
			}

		} else if (IF_10710.equals(serviceId) || IF_K10710.equals(serviceId)
				|| IF_F10710.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160424 I.Kudou [CATPPSSB-563]
				//switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				if (UPDATE_FLAG_CANCEL.equals(flagUpdate))
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
				else
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160424 I.Kudou [CATPPSSB-563]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
			//	if (UPDATE_FLAG_CHANGE.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			//	else if (UPDATE_FLAG_CANCEL.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_CHANGE.equals(flagUpdate) )
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(500));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(530));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_NEW.equals(flagUpdate) )
				switchingStatus.setStatusCode(new BigDecimal(540));
			// Add start 20160425 I.Kudou [CATPPSSB-563]
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setStatusCode(new BigDecimal(540));
			// Add end 20160425 I.Kudou [CATPPSSB-563]
			
			// バッチ結果
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			if (flagUpdate != null)
				switch (errorKind) {
				case 1:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("248");
						break;
					case 2:
						switchingStatus.setMailKind("249");
						break;
					case 3:
						switchingStatus.setMailKind("250");
						break;
					}
					break;
				case 2:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("251");
						break;
					case 2:
						switchingStatus.setMailKind("252");
						break;
					case 3:
						switchingStatus.setMailKind("253");
						break;
					}
					break;
				case 3:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("254");
						break;
					case 2:
						switchingStatus.setMailKind("255");
						break;
					case 3:
						switchingStatus.setMailKind("256");
						break;
					}
					break;
				case 4:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("257");
						break;
					case 2:
						switchingStatus.setMailKind("258");
						break;
					case 3:
						switchingStatus.setMailKind("259");
						break;
					}
					break;
				case 5:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("260");
						break;
					case 2:
						switchingStatus.setMailKind("261");
						break;
					case 3:
						switchingStatus.setMailKind("262");
						break;
					}
					break;
				case 6:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("263");
						break;
					case 2:
						switchingStatus.setMailKind("264");
						break;
					case 3:
						switchingStatus.setMailKind("265");
						break;
					}
					break;
				case 0:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("266");
						break;
					case 2:
						switchingStatus.setMailKind("267");
						break;
					case 3:
						switchingStatus.setMailKind("268");
						break;
					}
					break;
				default:
					break;
				}

		} else if (IF_10720.equals(serviceId) || IF_K10720.equals(serviceId)
				|| IF_F10720.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(500));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setStatusCode(new BigDecimal(550));
				else if (UKETSUKE_KOUTEI_05.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(535));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(540));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(540));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("269");
				break;
			case 2:
				switchingStatus.setMailKind("270");
				break;
			case 3:
				switchingStatus.setMailKind("271");
				break;
			case 4:
				switchingStatus.setMailKind("272");
				break;
			case 5:
				switchingStatus.setMailKind("273");
				break;
			case 6:
				switchingStatus.setMailKind("274");
				break;
			case 0:
				if (UKETSUKE_KOUTEI_05.equals(koutei)) {
					switchingStatus.setMailKind("275");
				} else if (UKETSUKE_KOUTEI_06.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("276");
					else
						switchingStatus.setMailKind("277");
				}  else if (UKETSUKE_KOUTEI_08.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("278");
					else
						switchingStatus.setMailKind("279");
				} else if (UKETSUKE_KOUTEI_09.equals(koutei)) {
					switchingStatus.setMailKind("280");
				}
				break;
			default:
				break;
			}

		} else if (IF_10910.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160424 I.Kudou [CATPPSSB-563]
				//switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				if (UPDATE_FLAG_CANCEL.equals(flagUpdate))
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
				else
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160424 I.Kudou [CATPPSSB-563]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
			//	if (UPDATE_FLAG_CHANGE.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			//	else if (UPDATE_FLAG_CANCEL.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_CHANGE.equals(flagUpdate) )
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(600));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(620));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_NEW.equals(flagUpdate) )
				switchingStatus.setStatusCode(new BigDecimal(630));
			// Add start 20160425 I.Kudou [CATPPSSB-563]
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setStatusCode(new BigDecimal(630));
			// Add end 20160425 I.Kudou [CATPPSSB-563]
			
			// バッチ結果
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			if (flagUpdate != null)
				switch (errorKind) {
				case 1:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("281");
						break;
					case 2:
						switchingStatus.setMailKind("282");
						break;
					case 3:
						switchingStatus.setMailKind("283");
						break;
					}
					break;
				case 2:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("284");
						break;
					case 2:
						switchingStatus.setMailKind("285");
						break;
					case 3:
						switchingStatus.setMailKind("286");
						break;
					}
					break;
				case 3:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("287");
						break;
					case 2:
						switchingStatus.setMailKind("288");
						break;
					case 3:
						switchingStatus.setMailKind("289");
						break;
					}
					break;
				case 4:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("290");
						break;
					case 2:
						switchingStatus.setMailKind("291");
						break;
					case 3:
						switchingStatus.setMailKind("292");
						break;
					}
					break;
				case 5:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("293");
						break;
					case 2:
						switchingStatus.setMailKind("294");
						break;
					case 3:
						switchingStatus.setMailKind("295");
						break;
					}
					break;
				case 6:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("296");
						break;
					case 2:
						switchingStatus.setMailKind("297");
						break;
					case 3:
						switchingStatus.setMailKind("298");
						break;
					}
					break;
				case 0:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("299");
						break;
					case 2:
						switchingStatus.setMailKind("300");
						break;
					case 3:
						switchingStatus.setMailKind("301");
						break;
					}
					break;
				default:
					break;
				}

		} else if (IF_10920.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(600));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(640));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(630));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(630));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("302");
				break;
			case 2:
				switchingStatus.setMailKind("303");
				break;
			case 3:
				switchingStatus.setMailKind("304");
				break;
			case 4:
				switchingStatus.setMailKind("305");
				break;
			case 5:
				switchingStatus.setMailKind("306");
				break;
			case 6:
				switchingStatus.setMailKind("307");
				break;
			case 0:
				if (UKETSUKE_KOUTEI_05.equals(koutei)) {
					switchingStatus.setMailKind("308");
				} else if (UKETSUKE_KOUTEI_06.equals(koutei)) {
					if (difDayFlag)
						switchingStatus.setMailKind("309");
					else
						switchingStatus.setMailKind("310");
				} else if (UKETSUKE_KOUTEI_09.equals(koutei)) {
					switchingStatus.setMailKind("311");
				}
				break;
			default:
				break;
			}

		}  else if (IF_10810.equals(serviceId) || IF_K10810.equals(serviceId) || IF_F10810.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160326 A.Takemi [CATPPS-1518]
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160326 A.Takemi [CATPPS-1518]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況

			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(700));
			
			// 遷移先ステータスコード
			// Change start 20160326 A.Takemi [CATPPS-1518]
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
				switchingStatus.setStatusCode(new BigDecimal(720));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) {
				switchingStatus.setStatusCode(new BigDecimal(730));
			}
			// Change end 20160326 A.Takemi [CATPPS-1518]

			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("312");
				break;
			case 2:
				switchingStatus.setMailKind("313");
				break;
			case 3:
				switchingStatus.setMailKind("314");
				break;
			case 4:
				switchingStatus.setMailKind("315");
				break;
			case 5:
				switchingStatus.setMailKind("316");
				break;
			case 6:
				switchingStatus.setMailKind("317");
				break;
			case 0:
				switchingStatus.setMailKind("318");
				break;
			default:
				break;
			}

		} else if (IF_10820.equals(serviceId) || IF_K10820.equals(serviceId)
				|| IF_F10820.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(700));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(740));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(730));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(730));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("319");
				break;
			case 2:
				switchingStatus.setMailKind("320");
				break;
			case 3:
				switchingStatus.setMailKind("321");
				break;
			case 4:
				switchingStatus.setMailKind("322");
				break;
			case 5:
				switchingStatus.setMailKind("323");
				break;
			case 6:
				switchingStatus.setMailKind("324");
				break;
			case 0:
				if (UKETSUKE_KOUTEI_06.equals(koutei)) {
					switchingStatus.setMailKind("326");
				} else if (UKETSUKE_KOUTEI_09.equals(koutei)) {
					switchingStatus.setMailKind("327");
				}
				break;
			default:
				break;
			}

		} else if (IF_10210.equals(serviceId) || IF_K10210.equals(serviceId)) {
			/**
			 * 使用量情報照会申請(低圧) 使用量情報照会申請(高圧(500kw未満))
			 */

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160424 I.Kudou [CATPPSSB-563]
				//switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				if (UPDATE_FLAG_CANCEL.equals(flagUpdate))
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
				else
					switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160424 I.Kudou [CATPPSSB-563]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
			//	if (UPDATE_FLAG_CHANGE.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			//	else if (UPDATE_FLAG_CANCEL.equals(flagUpdate) )
			//		switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_CHANGE.equals(flagUpdate) )
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CHANGE);
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_CANCEL);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(800));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(830));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())
					&& UPDATE_FLAG_NEW.equals(flagUpdate) )
				switchingStatus.setStatusCode(new BigDecimal(840));
			// Add start 20160425 I.Kudou [CATPPSSB-563]
			else if (StringUtils.isEmpty(errorMsgId)
					&& UPDATE_FLAG_CANCEL.equals(flagUpdate))
				switchingStatus.setStatusCode(new BigDecimal(840));
			// Add end 20160425 I.Kudou [CATPPSSB-563]
			
			// バッチ結果
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			if (flagUpdate != null)
				switch (errorKind) {
				case 1:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("328");
						break;
					case 2:
						switchingStatus.setMailKind("329");
						break;
					case 3:
						switchingStatus.setMailKind("330");
						break;
					}
					break;
				case 2:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("331");
						break;
					case 2:
						switchingStatus.setMailKind("332");
						break;
					case 3:
						switchingStatus.setMailKind("333");
						break;
					}
					break;
				case 3:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("334");
						break;
					case 2:
						switchingStatus.setMailKind("335");
						break;
					case 3:
						switchingStatus.setMailKind("336");
						break;
					}
					break;
				case 4:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("337");
						break;
					case 2:
						switchingStatus.setMailKind("338");
						break;
					case 3:
						switchingStatus.setMailKind("339");
						break;
					}
					break;
				case 5:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("340");
						break;
					case 2:
						switchingStatus.setMailKind("341");
						break;
					case 3:
						switchingStatus.setMailKind("342");
						break;
					}
					break;
				case 6:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("343");
						break;
					case 2:
						switchingStatus.setMailKind("344");
						break;
					case 3:
						switchingStatus.setMailKind("345");
						break;
					}
					break;
				case 0:
					switch (flagUpdate.intValue()) {
					case 1:
						switchingStatus.setMailKind("346");
						break;
					case 2:
						switchingStatus.setMailKind("347");
						break;
					case 3:
						switchingStatus.setMailKind("348");
						break;
					}
					break;
				default:
					break;
				}
		} else if (IF_10220.equals(serviceId) || IF_K10220.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(800));
			
			// 遷移先ステータスコード
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(860));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(840));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(840));
			}
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ご連絡事項
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("349");
				break;
			case 2:
				switchingStatus.setMailKind("350");
				break;
			case 3:
				switchingStatus.setMailKind("351");
				break;
			case 4:
				switchingStatus.setMailKind("352");
				break;
			case 5:
				switchingStatus.setMailKind("353");
				break;
			case 6:
				switchingStatus.setMailKind("354");
				break;
			case 0:
				if (UKETSUKE_KOUTEI_06.equals(koutei)) {
					switchingStatus.setMailKind("355");
				} else if (UKETSUKE_KOUTEI_09.equals(koutei)) {
					switchingStatus.setMailKind("356");
				}
				break;
			default:
				break;
			}

		} else if (IF_10310.equals(serviceId) || IF_K10310.equals(serviceId)) {

			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況

			
			// 分類コード
			switchingStatus.setStatusKindCode(new BigDecimal(800));
			
			// 遷移先ステータスコード
			if ( PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(880));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) )
				switchingStatus.setStatusCode(new BigDecimal(840));
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
			
			
			// ご連絡事項
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// 受付メッセージ
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// メール
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
			case 1:
				switchingStatus.setMailKind("357");
				break;
			case 2:
				switchingStatus.setMailKind("358");
				break;
			case 3:
				switchingStatus.setMailKind("359");
				break;
			case 4:
				switchingStatus.setMailKind("360");
				break;
			case 5:
				switchingStatus.setMailKind("361");
				break;
			case 6:
				switchingStatus.setMailKind("362");
				break;
			case 0:
				switchingStatus.setMailKind("363");
				break;
			default:
				break;
			}

		} else if ( Const.SERVICE_ID_SV_CLASSIFICATION_COMPANIES_LIST_REQUEST.equals(serviceId) ) {
			
			// 処理状況設定
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// 申請元の処理状況
			
			// バッチ結果
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ご連絡事項（表示用）
			// ご連絡事項
			// 受付メッセージ
			switchingStatus.setUketsukeMsgFlag(true);
			// メール
			// 監視アラート
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// 通知種別
			switch (errorKind) {
				case 1:
					switchingStatus.setMailKind("364");
					break;
				case 2:
					switchingStatus.setMailKind("365");
					break;
				case 3:
					switchingStatus.setMailKind("366");
					break;
				case 4:
					switchingStatus.setMailKind("367");
					break;
				case 5:
					switchingStatus.setMailKind("368");
					break;
				case 6:
					switchingStatus.setMailKind("369");
					break;
				case 0:
					switchingStatus.setMailKind("370");
				default:
					break;
			}
		
		}
		
		return switchingStatus;
	}

	/**
	 * エラーの種別を取得する
	 * @param errorMsgId
	 * @return
	 */
	private int getErrorKind(String errorMsgId) {
		
		// エラーなし
		if (StringUtils.isEmpty(errorMsgId))
			return ERROR_KIND_0;
		// 内部エラー（通信前）
		else if (CHECK_MSG_ID_NO_6.equals(errorMsgId))
			return ERROR_KIND_1;
		// 内部エラー（通信後）
		else if (CHECK_MSG_ID_NO_8.equals(errorMsgId))
			return ERROR_KIND_2;
		// 通信前チェックエラー
		else if (CHECK_MSG_ID_NO_4.equals(errorMsgId) || CHECK_MSG_ID_NO_5.equals(errorMsgId))
			return ERROR_KIND_3;
		// 通信エラー
		else if (CHECK_MSG_ID_NO_1.equals(errorMsgId) || CHECK_MSG_ID_NO_2.equals(errorMsgId) || CHECK_MSG_ID_NO_9.equals(errorMsgId))
			return ERROR_KIND_4;
		// 連携成否チェックエラー
		else if (CHECK_MSG_ID_NO_3.equals(errorMsgId))
			return ERROR_KIND_5;
		// 例外エラー
		else if (CHECK_MSG_ID_NO_7.equals(errorMsgId))
			return ERROR_KIND_6;

		return -1;
	}

	/**
	 * 受付メッセージ設定
	 * @param catyPrincipal 
	 * @param linkRequestInfoResult
	 * @param cmnServiceImpl
	 */
	@SuppressWarnings("unchecked")
	private void setUketsukeMsg(CatyPrincipal catyPrincipal, LinkRequestInfoResult linkRequestInfoResult,
			@SuppressWarnings("rawtypes") SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl) {
		// Change Start CATPPS-1101 対応　A.Miyakawa
		String serviceId = linkRequestInfoResult.getServiceId();
		if (IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
				|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
				|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
				|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
				|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
				|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
				|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
				|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
				|| IF_F10820.equals(serviceId)) {
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
					linkRequestInfoResult.getTe79EntityMode().getTe79001(),
					linkRequestInfoResult.getTe79EntityMode().getTe79002(),
					linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
					cmnServiceImpl));
			// Change Start CATPPS-1275対応　A.Miyakawa
		} else if (IF_10110.equals(serviceId) || IF_F10110.equals(serviceId) ||
			IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)||
			IF_10510.equals(serviceId) || IF_K10510.equals(serviceId) ||
			IF_F10510.equals(serviceId) || IS_20110.equals(serviceId) ||
			IS_K20110.equals(serviceId) || IS_F20110.equals(serviceId) ||
			IF_10610.equals(serviceId) || IF_K10610.equals(serviceId) ||
			IF_F10610.equals(serviceId) || IF_10710.equals(serviceId) ||
			IF_K10710.equals(serviceId) || IF_F10710.equals(serviceId) ||
			IF_10210.equals(serviceId) || IF_K10210.equals(serviceId) ||
			IF_10810.equals(serviceId) || IF_K10810.equals(serviceId) ||
			IF_F10810.equals(serviceId) || IF_10910.equals(serviceId) ||
			IF_10310.equals(serviceId) || IF_K10310.equals(serviceId) ||
			IS_20410.equals(serviceId) || IS_K20410.equals(serviceId) ||
			IS_F20410.equals(serviceId)) {
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId) ||
				IS_F20210.equals(serviceId) || IS_20310.equals(serviceId) ||
				IS_K20310.equals(serviceId) || IS_F20310.equals(serviceId)) {
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
			// Change Start CATPPS-1275対応　A.Miyakawa
		}
		// Change End CATPPS-1101 対応　A.Miyakawa
		
	}

	/**
	 * 受付メッセージに例外エラーコードが含まれているのかチェックする
	 * @param tpe7EntityModelList
	 * @param uketsukeMessages
	 * @return
	 */
	private boolean checkExceptionErrorCode(
			List<Tpe7EntityModel> tpe7EntityModelList,
			Map<String, String> uketsukeMessages) {
		for (Tpe7EntityModel model:tpe7EntityModelList) {
			if (uketsukeMessages.containsKey(model.getTpe7101()))
				return true;
		}
		return false;
	}

	/**
	 * 接続廃止予定年月日更新処理
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @throws EntityNotFoundException 
	 */
	private void registerAbolitionDate(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) throws EntityNotFoundException {
		
		List<Te11EntityModel> te11EntityModelList = linkRequestInfoResult.getTe11EntityModelList();
		if (te11EntityModelList != null){
			if ( te11EntityModelList.size() != 0 ) {
				for (Te11EntityModel te11EntityModel:te11EntityModelList) {
					Te11EntityModel te11EntityModelResult = this.getTe11EntityDao().findByPrimaryKeyForUpdate(catyPrincipal, te11EntityModel.getTe11001(), te11EntityModel.getTe11002(), te11EntityModel.getTe11003());
					te11EntityModelResult.setTe11103(te11EntityModel.getTe11103());
					this.getTe11EntityDao().update(catyPrincipal, te11EntityModelResult);
				}
			}
		}
	}

	/**
	 * スイッチング連携管理更新情報更新処理
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @throws EntityNotFoundException 
	 */
	private void registerSwResult(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {
		
		List<Te7jEntityModel> te7jEntityModelList = linkRequestInfoResult.getTe7jEntityModelList();
		if (te7jEntityModelList != null){
			if ( te7jEntityModelList.size() != 0 ) {
				for (Te7jEntityModel te7jEntityModel:te7jEntityModelList) {
					this.getTe7jEntityDao().saveOrUpdate(catyPrincipal, te7jEntityModel);
				}
			}
		}
	}

	/**
	 * スイッチング連携管理更新情報更新処理
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @throws EntityNotFoundException 
	 */
	private void updateTe79Info(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) throws EntityNotFoundException {
		
		// Change Start CATPPS-1364 対応 A.Miyakawa
		String serviceId = linkRequestInfoResult.getServiceId();
		if (IF_10110.equals(serviceId) || IF_F10110.equals(serviceId) ||
				IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)||
				IF_10510.equals(serviceId) || IF_K10510.equals(serviceId) ||
				IF_F10510.equals(serviceId) || IS_20110.equals(serviceId) ||
				IS_K20110.equals(serviceId) || IS_F20110.equals(serviceId) ||
				IF_10610.equals(serviceId) || IF_K10610.equals(serviceId) ||
				IF_F10610.equals(serviceId) || IF_10710.equals(serviceId) ||
				IF_K10710.equals(serviceId) || IF_F10710.equals(serviceId) ||
				IF_10210.equals(serviceId) || IF_K10210.equals(serviceId) ||
				IF_10810.equals(serviceId) || IF_K10810.equals(serviceId) ||
				IF_F10810.equals(serviceId) || IF_10910.equals(serviceId) ||
				IF_10310.equals(serviceId) || IF_K10310.equals(serviceId) ||
				IS_20410.equals(serviceId) || IS_K20410.equals(serviceId) ||
				IS_F20410.equals(serviceId) ) {
			if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu() != null) {
				// スイッチング連携管理更新情報を取得する
				List<Te79EntityModel>Te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
				
				if (Te79EntityModelListUpdateInfo.size() > 0) {
					for (Te79EntityModel updateInfo:Te79EntityModelListUpdateInfo) {
						if (!StringUtils.isEmpty(updateInfo.getTe79501())) {
							// スイッチング連携管理更新情報.申込番号がnull以外の場合
							// スイッチング連携管理情報を更新する
							this.updateTE79(catyPrincipal, stationCd,
									updateInfo.getTe79501(),
									linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(),
									updateInfo.getTe79701());
							
						} else if (!StringUtils.isEmpty(updateInfo.getTe79601())) {
							// スイッチング連携管理更新情報.廃止取次番号がnull以外の場合
							// スイッチング連携管理情報を更新する
							this.updateForProcStateOfSwitchingCoopMngInfo(
									catyPrincipal, 
									linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(), 
									updateInfo.getTe79701() ,
									updateInfo);
						}
					}
				}
			}
		} else if ( IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
				|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
				|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
				|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
				|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
				|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
				|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
				|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
				|| IF_F10820.equals(serviceId)) {
			
			// スイッチング連携管理更新情報を取得する
			List<Te79EntityModel>Te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
			
			if (Te79EntityModelListUpdateInfo.size() > 0) {
				for (Te79EntityModel updateInfo:Te79EntityModelListUpdateInfo) {
					
					if (linkRequestInfoResult.getContactMatter() != null && linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isRenrakuFlag())
						updateInfo.setTe79701(linkRequestInfoResult.getContactMatter());
					
					if (!StringUtils.isEmpty(updateInfo.getTe79501())) {
						// スイッチング連携管理更新情報.申込番号がnull以外の場合
						// スイッチング連携管理情報を更新する
						this.updateTE79(catyPrincipal, stationCd,
								updateInfo.getTe79501(),
								linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(),
								updateInfo.getTe79701());
						
					} else if (!StringUtils.isEmpty(updateInfo.getTe79601())) {
						// スイッチング連携管理更新情報.廃止取次番号がnull以外の場合
						// スイッチング連携管理情報を更新する
						this.updateForProcStateOfSwitchingCoopMngInfo(
								catyPrincipal, 
								linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(), 
								updateInfo.getTe79701() ,
								updateInfo);
					}
				}
			}
		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId) ||
				IS_F20210.equals(serviceId) || IS_20310.equals(serviceId) ||
				IS_K20310.equals(serviceId) || IS_F20310.equals(serviceId)) {
			List<LinkRequestForIs> links = linkRequestInfoResult.getLinkReqForIs();
			for (LinkRequestForIs link : links) {
				// スイッチング連携管理更新情報を取得する
				List<Te79EntityModel>Te79EntityModelListUpdateInfo = link.getTe79EntityModelListUpdateInfo();
				if (Te79EntityModelListUpdateInfo.size() > 0) {
					for (Te79EntityModel updateInfo:Te79EntityModelListUpdateInfo) {
						if (!StringUtils.isEmpty(updateInfo.getTe79501())) {
							// スイッチング連携管理更新情報.申込番号がnull以外の場合
							// スイッチング連携管理情報を更新する
							this.updateTE79(catyPrincipal, stationCd,
									updateInfo.getTe79501(),
									link.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(),
									updateInfo.getTe79701());
							
						} else if (!StringUtils.isEmpty(updateInfo.getTe79601())) {
							// スイッチング連携管理更新情報.廃止取次番号がnull以外の場合
							// スイッチング連携管理情報を更新する
							this.updateForProcStateOfSwitchingCoopMngInfo(
									catyPrincipal, 
									link.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(), 
									updateInfo.getTe79701() ,
									updateInfo);
						}
					}
				}
			}
		}
		// Change End CATPPS-1364 対応 A.Miyakawa
	}

	/**
	 * スイッチング連携要求処理
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @throws SwitchingException 
	 */
	private void executeSwReq(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) throws SwitchingException {
		
		// スイッチング開始処理
		List<SwithingParameter> swStartInfo = linkRequestInfoResult.getSwStartInfo();
		if (swStartInfo != null) {
			if ( swStartInfo.size() > 0 ) {
				// スイッチング支援システム連携要求サービス（スイッチング開始）を呼び出す
				this.getContractService()
				.executeSwitchingStart(
						catyPrincipal, swStartInfo);
			}
		}
		
		// 廃止取次判断処理
		List<SwithingParameter> swAbolitionJudgementInfo = linkRequestInfoResult.getSwAbolitionJudgementInfo();
		if (swAbolitionJudgementInfo != null) {
			if ( swAbolitionJudgementInfo.size() > 0 ) {
				// スイッチング支援システム連携要求サービス（廃止取次判断）を呼び出す
				this.getContractService()
				.executeSwitchingStopAgencyJudge(
						catyPrincipal, swAbolitionJudgementInfo);
			}
		}
		
		// スイッチング廃止申請処理
		List<SwithingParameter> swAbolitionApplyInfo = linkRequestInfoResult.getSwAbolitionApplyInfo();
		if (swAbolitionApplyInfo != null) {
			if ( swAbolitionApplyInfo.size() > 0 ) {
				// スイッチング支援システム連携要求サービス（スイッチング廃止申請）を呼び出す
				this.getContractService()
				.executeSwitchingStop(
						catyPrincipal, swAbolitionApplyInfo);
			}
		}
		
		// 使用量情報照会処理
		List<SwithingParameter> usedAmountInfoInquiryInfo = linkRequestInfoResult.getUsedAmountInfoInquiryInfo();
		if (usedAmountInfoInquiryInfo != null) {
			if ( usedAmountInfoInquiryInfo.size() > 0 ) {
				// スイッチング支援システム連携要求サービス（スイッチング廃止申請）を呼び出す
				this.getContractService()
				.executeUsedInfoInquire(
						catyPrincipal, usedAmountInfoInquiryInfo);
			}
		}
		
		// 契約ステータス変更処理
		SwContractStatusChangeInfoModel swContractStatusChangeInfoModel = linkRequestInfoResult.getContractStatusChangeInfo();
		if (swContractStatusChangeInfoModel != null) {
			// スイッチング連携契約ステータス変更サービス
			this.getContractService().changeSwitchingContractStatus(catyPrincipal, stationCd, 
					swContractStatusChangeInfoModel.getCustomerCd(), swContractStatusChangeInfoModel.getCustomerConsNum()
					, swContractStatusChangeInfoModel.getContractStatus());
		}
		
	}

	/**
	 * 電話番号設定をチェックする
	 * 
	 * @param LinkRequestInfoResult
	 *            連携要求情報
	 * 
	 * @return 電話番号設定に異常があった場合、falseを返却、　正常の場合、trueを返却
	 * 
	 */
	private boolean checkPhoneNo(List<T105EntityModel> t105EntityModelList) {

		T105EntityModel t105EntityModel = null;
		String[] phoneNo = null;

		// 顧客住所情報(区分=4).TEL1の電話番号設定チェック
		t105EntityModel = this.getSpecifiedCustomerAddressInfoRecord(
				t105EntityModelList, new BigDecimal(4));
		if (t105EntityModel != null
				&& !StringUtils.isEmpty(t105EntityModel.getT105311())) {

			phoneNo = t105EntityModel.getT105311().split("\\-");

			if (phoneNo.length != 3) {
				return false;
			}
		}

		// 顧客住所情報(区分=1).TEL1、顧客住所情報(区分=1).TEL2の電話番号設定チェック
		t105EntityModel = this.getSpecifiedCustomerAddressInfoRecord(
				t105EntityModelList, new BigDecimal(1));
		if (t105EntityModel != null) {

			if (!StringUtils.isEmpty(t105EntityModel.getT105311())) {

				phoneNo = t105EntityModel.getT105311().split("\\-");

				if (phoneNo.length != 3) {
					return false;
				}

			}

			if (!StringUtils.isEmpty(t105EntityModel.getT105312())) {

				phoneNo = t105EntityModel.getT105312().split("\\-");

				if (phoneNo.length != 3) {
					return false;
				}

			}
		}

		return true;
	}

	/**
	 * 顧客住所情報より指定した区分値のレコードを返却します。
	 * 
	 * @param entityList
	 *            顧客住所情報リスト
	 * @param classification
	 *            指定区分値
	 * @return 顧客住所情報
	 */
	private T105EntityModel getSpecifiedCustomerAddressInfoRecord(
			List<T105EntityModel> entityList, BigDecimal classification) {

		T105EntityModel result = null;

		if (!CollectionUtils.isEmpty(entityList)) {

			for (T105EntityModel model : entityList) {

				if (classification.equals(model.getT105003())) {
					result = model;
					break;
				}
			}
		}

		return result;

	}

	/**
	 * IPアドレスを取得します。
	 * 
	 * @param modelList
	 *            画面設定マスタ
	 * @param destIp
	 *            接続先IPアドレス
	 * @param sourceIp
	 *            接続元IPアドレス
	 */
	private String getConfigValue(List<Tpe7EntityModel> modelList,
			String targetName) {

		String result = null;

		if (!CollectionUtils.isEmpty(modelList)) {

			for (Tpe7EntityModel model : modelList) {

				if (targetName.equals(model.getTpe7004())) {
					result = model.getTpe7101();

					break;
				}
			}
		}

		return result;
	}

	/**
	 * 処理対象のサービスクラスを取得します。
	 * 
	 * @param serviceId
	 *            サービスID
	 * @return 処理対象のサービスクラス
	 */
	@SuppressWarnings("rawtypes")
	private SwitchingServiceIntegrationAbstractBizSubLogicImpl getServiceClass(
			String serviceId) {

		SwitchingServiceIntegrationAbstractBizSubLogicImpl result = null;

		if (IF_10110.equals(serviceId)) {
			// IF_10110(設備情報照会(低圧))
			result = new SwitchingServiceBizSetsubiYokyuTSubLogicImpl();
		} else if (IF_10210.equals(serviceId)) {
			// IF_10210(使用量情報照会申請(低圧))
			result = new SwitchingServiceBizPwYokyuTSubLogicImpl();
		} else if (IF_10220.equals(serviceId)) {
			// IF_10220(業務確認(低圧)(使用量情報照会))
			result = new SwitchingServiceBizPwIdoYokyuTSubLogicImpl();
		} else if (IF_10310.equals(serviceId)) {
			// IF_10310(使用量情報照会(低圧))
			result = new SwitchingServiceBizShiyoryoYokyuTSubLogicImpl();
		} else if (IF_K10210.equals(serviceId)) {
			// IF_K10210(使用量情報照会申請(高圧(500kw未満))
			result = new SwitchingServiceBizPwYokyuKSubLogicImpl();
		} else if (IF_K10220.equals(serviceId)) {
			// IF_K10220(業務処理状況確認(低圧)(高圧(500kw未満))
			result = new SwitchingServiceBizPwIdoYokyuKSubLogicImpl();
		} else if (IF_K10310.equals(serviceId)) {
			// IF_K10310(使用量情報照会(高圧(500kw未満)))
			result = new SwitchingServiceBizShiyoryoYokyuKSubLogicImpl();
		} else if (IF_F10110.equals(serviceId)) {
			// IF_F10110(設備情報照会(低圧FIT電源))
			result = new SwitchingServiceBizSetsubiYokyuFSubLogicImpl();
		} else if (IF_10410.equals(serviceId)) {
			// IF_10410(再点(低圧))
			result = new SwitchingServiceBizSaitenYokyuTSubLogicImpl();
		} else if (IF_10420.equals(serviceId)) {
			// IF_10420(業務処理状況確認(低圧)(再点))
			result = new SwitchingServiceBizSaitenIdoYokyuTSubLogicImpl();
		} else if (IF_10510.equals(serviceId)) {
			// IF_10510(廃止・撤去(低圧))
			result = new SwitchingServiceBizHaishiYokyuTSubLogicImpl();
		} else if (IF_10520.equals(serviceId)) {
			// IF_10520(業務処理状況確認(低圧)(廃止・撤去))
			result = new SwitchingServiceBizHaishiIdoYokyuTSubLogicImpl();
		} else if (IF_10610.equals(serviceId)) {
			// IF_10610(スイッチング開始申請(低圧))
			result = new SwitchingServiceBizSwKaishiYokyuTSubLogicImpl();
		} else if (IF_10620.equals(serviceId)) {
			// IF_10620(業務処理状況確認(低圧)(スイッチング開始))
			result = new SwitchingServiceBizSwKaishiIdoYokyuTSubLogicImpl();
		} else if (IF_10710.equals(serviceId)) {
			// IF_10710(スイッチング廃止申請(低圧))
			result = new SwitchingServiceBizSwHaishiYokyuTSubLogicImpl();
		} else if (IF_10720.equals(serviceId)) {
			// IF_10720(業務処理状況確認(低圧)(スイッチング廃止))
			result = new SwitchingServiceBizSwHaishiIdoYokyuTSubLogicImpl();
		} else if (IF_10810.equals(serviceId)) {
			// IF_10810(需要場所情報変更申込(低圧))
			result = new SwitchingServiceBizJuyoshaHenkoYokyuTSubLogicImpl();
		} else if (IF_10820.equals(serviceId)) {
			// IF_10820(業務処理状況確認(低圧)(需要者情報変更))
			result = new SwitchingServiceBizJuyoshaHenkoIdoYokyuTSubLogicImpl();
		} else if (IF_10910.equals(serviceId)) {
			// IF_10910(アンペア変更(低圧))
			result = new SwitchingServiceBizAmpereHenkoYokyuTSubLogicImpl();
		} else if (IF_10920.equals(serviceId)) {
			// IF_10810(需要者情報変更(低圧))
			result = new SwitchingServiceBizAmpereHenkoIdoYokyuTSubLogicImpl();
		} else if (IF_11110.equals(serviceId)) {
			// IF_11110(異動申込一括取得(小売)(低圧))
			result = new SwitchingServiceBizIdoIkkatsuYokyuTSubLogicImpl();
		} else if (IF_K10510.equals(serviceId)) {
			// IF_K10510(廃止・撤去(高圧(500kw未満))
			result = new SwitchingServiceBizHaishiYokyuKSubLogicImpl();
		} else if (IF_K10520.equals(serviceId)) {
			// IF_K10520(業務処理状況確認(高圧(500kw未満))(廃止・撤去))
			result = new SwitchingServiceBizHaishiIdoYokyuKSubLogicImpl();
		} else if (IF_K10610.equals(serviceId)) {
			// IF_K10610(スイッチング開始申請(高圧(500kw未満)))
			result = new SwitchingServiceBizSwKaishiYokyuKSubLogicImpl();
		} else if (IF_K10620.equals(serviceId)) {
			// IF_K10620(業務処理状況確認(高圧(500kw未満))(スイッチング開始))
			result = new SwitchingServiceBizSwKaishiIdoYokyuKSubLogicImpl();
		} else if (IF_K10710.equals(serviceId)) {
			// IF_K10710(スイッチング廃止申請(高圧(500kw未満)))
			result = new SwitchingServiceBizSwHaishiYokyuKSubLogicImpl();
		} else if (IF_K10720.equals(serviceId)) {
			// IF_K10720(業務処理状況確認(高圧(500kw未満))(スイッチング廃止))
			result = new SwitchingServiceBizSwHaishiIdoYokyuKSubLogicImpl();
		} else if (IF_K10810.equals(serviceId)) {
			// IF_K10810(需要者情報変更(低圧))
			result = new SwitchingServiceBizJuyoshaHenkoYokyuKSubLogicImpl();
		} else if (IF_K10820.equals(serviceId)) {
			// IF_K10820(業務処理状況確認(低圧)(需要者情報変更))
			result = new SwitchingServiceBizJuyoshaHenkoIdoYokyuKSubLogicImpl();
		} else if (IF_K11110.equals(serviceId)) {
			// IF_K11110(異動申込一括取得(小売)(高圧))
			result = new SwitchingServiceBizIdoIkkatsuYokyuKSubLogicImpl();
		} else if (IF_F10410.equals(serviceId)) {
			// IF_F10410(再点(低圧FIT電源))
			result = new SwitchingServiceBizSaitenYokyuFSubLogicImpl();
		} else if (IF_F10420.equals(serviceId)) {
			// IF_F10420(業務処理状況確認(低圧FIT電源)(再点))
			result = new SwitchingServiceBizSaitenIdoYokyuFSubLogicImpl();
		} else if (IF_F10510.equals(serviceId)) {
			// IF_F10510(廃止・撤去(低圧FIT電源))
			result = new SwitchingServiceBizHaishiYokyuFSubLogicImpl();
		} else if (IF_F10520.equals(serviceId)) {
			// IF_F10520(業務処理状況確認(低圧FIT電源)(廃止・撤去))
			result = new SwitchingServiceBizHaishiIdoYokyuFSubLogicImpl();
		} else if (IF_F10610.equals(serviceId)) {
			// IF_F10610(スイッチング開始申請(低圧FIT電源))
			result = new SwitchingServiceBizSwKaishiYokyuFSubLogicImpl();
		} else if (IF_F10620.equals(serviceId)) {
			// IF_F10620(業務処理状況確認(低圧FIT電源)(スイッチング開始))
			result = new SwitchingServiceBizSwKaishiIdoYokyuFSubLogicImpl();
		} else if (IF_F10710.equals(serviceId)) {
			// IF_F10710(スイッチング廃止申請(低圧FIT電源))
			result = new SwitchingServiceBizSwHaishiYokyuFSubLogicImpl();
		} else if (IF_F10720.equals(serviceId)) {
			// IF_F10720(業務処理状況確認(低圧FIT電源)(スイッチング廃止))
			result = new SwitchingServiceBizSwHaishiIdoYokyuFSubLogicImpl();
		} else if (IF_F10810.equals(serviceId)) {
			// IF_F10810(受電者情報変更)
			result = new SwitchingServiceBizHatsudenshaHenkoYokyuFSubLogicImpl();
		} else if (IF_F10820.equals(serviceId)) {
			// IF_F10820(業務処理状況確認(受電者情報変更))
			result = new SwitchingServiceBizHatsudenshaHenkoIdoYokyuFSubLogicImpl();
		} else if (IF_F11110.equals(serviceId)) {
			// IF_F11110(受電移動申込一括取得(小売))
			result = new SwitchingServiceBizIdoIkkatsuYokyuFSubLogicImpl();
		} else if (IS_20110.equals(serviceId)) {
			// IS_20110(スイッチング廃止取次登録(低圧))
			result = new SwitchingServiceBizSwTorokuYokyuTSubLogicImpl();
		} else if (IS_20210.equals(serviceId)) {
			// IS_20210(スイッチング廃止取次結果照会(低圧))
			result = new SwitchingServiceBizSwKekkaYokyuTSubLogicImpl();
		} else if (IS_20310.equals(serviceId)) {
			// IS_20310(スイッチング廃止取次照会(低圧))
			result = new SwitchingServiceBizSwYokyuTSubLogicImpl();
		} else if (IS_20410.equals(serviceId)) {
			// IS_20410(スイッチング廃止取次判断(低圧))
			result = new SwitchingServiceBizSwHandanYokyuTSubLogicImpl();
		} else if (IS_K20110.equals(serviceId)) {
			// IS_K20110(スイッチング廃止取次登録(高圧(500kw未満)))
			result = new SwitchingServiceBizSwTorokuYokyuKSubLogicImpl();
		} else if (IS_K20210.equals(serviceId)) {
			// IS_K20210(スイッチング廃止取次結果照会(高圧(500kw未満)))
			result = new SwitchingServiceBizSwKekkaYokyuKSubLogicImpl();
		} else if (IS_K20310.equals(serviceId)) {
			// IS_K20310(スイッチング廃止取次照会(高圧(500kw未満)))
			result = new SwitchingServiceBizSwYokyuKSubLogicImpl();
		} else if (IS_K20410.equals(serviceId)) {
			// IS_K20410(スイッチング廃止取次判断(高圧(500kw未満))
			result = new SwitchingServiceBizSwHandanYokyuKSubLogicImpl();
		} else if (IS_F20110.equals(serviceId)) {
			// IS_F20110(スイッチング廃止取次登録(低圧FIT電源))
			result = new SwitchingServiceBizSwTorokuYokyuFSubLogicImpl();
		} else if (IS_F20210.equals(serviceId)) {
			// IS_F20210(スイッチング廃止取次照会(低圧FIT電源))
			result = new SwitchingServiceBizSwKekkaYokyuFSubLogicImpl();
		} else if (IS_F20310.equals(serviceId)) {
			// IS_F20310(スイッチング廃止取次照会(低圧FIT電源))
			result = new SwitchingServiceBizSwYokyuFSubLogicImpl();
		} else if (IS_F20410.equals(serviceId)) {
			// IS_F20410(スイッチング廃止取次判断(低圧FIT電源))
			result = new SwitchingServiceBizSwHandanYokyuFSubLogicImpl();
		} else if (Const.SERVICE_ID_SV_CLASSIFICATION_COMPANIES_LIST_REQUEST.equals(serviceId)) {
			// IS_30110(事業者一覧取得)
			result = new SwitchingServiceBizJugyoshaIchiranYokyuSubLocigImpl();
		}

		return result;
	}

	/**
	 * 切替完了通知登録サービス 本サービスを使用して、切替完了通知を登録する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param linkResult
	 *            連携要求情報
	 */
	public void switchComplete(CatyPrincipal catyPrincipal, LinkRequestInfoResult linkResult) {
		
		String serviceId = linkResult.getServiceId();
		
		if ((IS_20210.equals(serviceId) || IS_20310.equals(serviceId)
				|| IS_K20210.equals(serviceId) || IS_K20310.equals(serviceId)
				|| IS_F20210.equals(serviceId) || IS_F20310.equals(serviceId))
				&& linkResult.getLinkReqForIs() != null) {
			
			for (LinkRequestForIs link : linkResult.getLinkReqForIs()) {
				
				LinkRequestInfoResult editLink = new LinkRequestInfoResult();
				editLink = linkResult;
				
				editLink.setCustomerCd(link.getCustomerCd());
				editLink.setSerialNumber(link.getSerialNumber());
				editLink.setAbolitionAgencyNo(link.getAbolitionAgencyNo());
				editLink.setProcessingStatus(link.getProcessingStatus());
				// Change Start CATPPS-769 対応 A.Miyakawa
				editLink.setDispContactMatter(link.getDispContactMatter());
				// Change End CATPPS-769 対応 A.Miyakawa
				// Change Start CATPPS-1364 対応 A.Miyakawa
				editLink.setSwitchingUpdateAndAlartStatus(link.getSwitchingUpdateAndAlartStatus());
				// Change End CATPPS-1364 対応 A.Miyakawa
				
				// 切替完了通知登録
				this.switchCompleteExec(catyPrincipal, editLink);
			}
			
		} else {
			// 切替完了通知登録
			this.switchCompleteExec(catyPrincipal, linkResult);
		}
		
	}

	/**
	 * 切替完了通知登録サービス 本サービスを使用して、切替完了通知を登録する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param linkResult
	 *            連携要求情報
	 */
	private void switchCompleteExec(CatyPrincipal catyPrincipal, LinkRequestInfoResult linkResult) {
		
		// Change Start CATPPS-1364 対応 A.Miyakawa
		String notification = null;

		if (linkResult.getSwitchingUpdateAndAlartStatus() != null) 
			notification = linkResult.getSwitchingUpdateAndAlartStatus().getMailKind();
			
//		// 連携成否 　異常の場合0、正常の場合1
//		int coSuccess = 1;
//		// 予定外移動日フラグ
//		int changesDateFlg = 0;
//		// 通知種別
//		String notification = null;
//		
//		// Change Start CATPPS-944 対応　T.Funao
//		//サービスID
//		String serviceId = linkResult.getServiceId();
//		// Change End CATPPS-944 対応　T.Funao
//
//		// 連携成否を設定
//		if (linkResult.getCommunicationResult() != null
//				&& linkResult.getCommunicationResult() == 1) {
//			coSuccess = 0;
//		} else if (linkResult.getServiceResult() != null
//				&& linkResult.getServiceResult() == 1) {
//			coSuccess = 0;
//		} else if (linkResult.getCooperationResult() != null
//				&& linkResult.getCooperationResult().equals("1")) {
//			coSuccess = 0;
//		} else if (linkResult.getProcessingStatus() != null
//				&& new BigDecimal(3)
//						.compareTo(linkResult.getProcessingStatus()) == 0) {
//			coSuccess = 0;
//		}
//		// Change Start CATPPS-944 対応　T.Funao
//		//マッチング完了時は連携成否を正常に設定
//		if("05".equals(linkResult.getReceivingStep())){
//			if(IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
//				|| IF_F10620.equals(serviceId) || IF_10720.equals(serviceId)
//				|| IF_K10720.equals(serviceId) || IF_F10720.equals(serviceId)){
//				coSuccess = 1;
//			}
//		}
//		// Change End CATPPS-944 対応　T.Funao
//		// 連携要求情報.異動予定日と連携要求情報.異動日が設定されている場合1
//		if (linkResult.getChangesDatePlan() != null
//				&& linkResult.getChangesDate() != null) {
//			changesDateFlg = 1;
//		}
//
//		// 完了通知の種別を取得する
//		if (linkResult.getServiceId() != null) {
//			// IF_10410(再点(低圧))、IF_F10410(再点(低圧FIT電源))
//			if (linkResult.getServiceId().equals(IF_10410)
//					|| linkResult.getServiceId().equals(IF_F10410)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "231";
//				}// IF_10420(業務処理状況確認(低圧)(再点))、IF_F10420(業務処理状況確認(低圧FIT電源)(再点))
//			} else if (linkResult.getServiceId().equals(IF_10420)
//					|| linkResult.getServiceId().equals(IF_F10420)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "241";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "242";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "231";
//				}// IF_10510(廃止・撤去(低圧))、IF_K10510(廃止・撤去(高圧(500kw未満))、IF_F10510(廃止・撤去(低圧FIT電源))
//			} else if (linkResult.getServiceId().equals(IF_10510)
//					|| linkResult.getServiceId().equals(IF_K10510)
//					|| linkResult.getServiceId().equals(IF_F10510)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "331";
//				}// IF_10520(業務処理状況確認(低圧)(廃止・撤去))、IF_K10520(業務処理状況確認(高圧(500kw未満))(廃止・撤去))、IF_F10520(業務処理状況確認(低圧FIT電源)(廃止・撤去))
//			} else if (linkResult.getServiceId().equals(IF_10520)
//					|| linkResult.getServiceId().equals(IF_K10520)
//					|| linkResult.getServiceId().equals(IF_F10520)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "341";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "342";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "331";
//				}// IS_20110(スイッチング廃止取次登録(低圧))、IS_K20110(スイッチング廃止取次登録(高圧(500kw未満)))、IS_F20110(スイッチング廃止取次登録(低圧FIT電源))
//			} else if (linkResult.getServiceId().equals(IS_20110)
//					|| linkResult.getServiceId().equals(IS_K20110)
//					|| linkResult.getServiceId().equals(IS_F20110)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "431";
//				}// IS_20310(スイッチング廃止取次照会(低圧))、IS_K20310(スイッチング廃止取次照会(高圧(500kw未満)))、IS_F20310(スイッチング廃止取次照会(低圧FIT電源))
//			} else if (linkResult.getServiceId().equals(IS_20310)
//					|| linkResult.getServiceId().equals(IS_K20310)
//					|| linkResult.getServiceId().equals(IS_F20310)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "441";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "431";
//				}// IF_10610(スイッチング開始申請(低圧))、IF_K10610(スイッチング開始申請(高圧(500kw未満)))、IF_F10610(スイッチング開始申請(低圧FIT電源))
//			} else if (linkResult.getServiceId().equals(IF_10610)
//					|| linkResult.getServiceId().equals(IF_K10610)
//					|| linkResult.getServiceId().equals(IF_F10610)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "471";
//				}// IF_10620(業務処理状況確認(低圧)(スイッチング開始))、IF_K10620(業務処理状況確認(高圧(500kw未満))(スイッチング開始))、IF_F10620(業務処理状況確認(低圧FIT電源)(スイッチング開始))
//			} else if (linkResult.getServiceId().equals(IF_10620)
//					|| linkResult.getServiceId().equals(IF_K10620)
//					|| linkResult.getServiceId().equals(IF_F10620)) {
//				// Add Start 20160222 CATPPS-944 対応　T.Funao
//				if (coSuccess == 1 && changesDateFlg == 0 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "461";
//				} else if (coSuccess == 1 && changesDateFlg == 1 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "462";
//				// Add End 20160222 CATPPS-944 対応　T.Funao
//				} else if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "481";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "482";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "471";
//				}// IS_20410(スイッチング廃止取次判断(低圧))、IS_K20410(スイッチング廃止取次判断(高圧(500kw未満))、IS_F20410(スイッチング廃止取次判断(低圧FIT電源))
//			} else if (linkResult.getServiceId().equals(IS_20410)
//					|| linkResult.getServiceId().equals(IS_K20410)
//					|| linkResult.getServiceId().equals(IS_F20410)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "511";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "513";
//				}// IF_10710(スイッチング廃止申請(低圧))、IF_K10710(スイッチング廃止申請(高圧(500kw未満)))、IF_F10710(スイッチング廃止申請(低圧FIT電源))
//			} else if (linkResult.getServiceId().equals(IF_10710)
//					|| linkResult.getServiceId().equals(IF_K10710)
//					|| linkResult.getServiceId().equals(IF_F10710)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "541";
//				}// IF_10720(業務処理状況確認(低圧)(スイッチング廃止))、IF_K10720(業務処理状況確認(高圧(500kw未満))(スイッチング廃止))、IF_F10720(業務処理状況確認(低圧FIT電源)(スイッチング廃止))
//			} else if (linkResult.getServiceId().equals(IF_10720)
//					|| linkResult.getServiceId().equals(IF_K10720)
//					|| linkResult.getServiceId().equals(IF_F10720)) {
//				// Add Start 20160222 CATPPS-944 対応　T.Funao
//				if (coSuccess == 1 && changesDateFlg == 0 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "531";
//				} else if (coSuccess == 1 && changesDateFlg == 1 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "532";
//				// Add End 20160222 CATPPS-944 対応　T.Funao
//				} else if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "551";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "552";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "541";
//				}// IF_10910(アンペア変更(低圧))
//			} else if (linkResult.getServiceId().equals(IF_10910)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "631";
//				}// IF_10920(業務処理状況確認(低圧)(アンペア変更))
//			} else if (linkResult.getServiceId().equals(IF_10920)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "641";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "642";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "631";
//				}// IF_10810(需要者情報変更(低圧))、IF_K10810(需要者情報変更(低圧))、IF_F10810(受電者情報変更)
//			} else if (linkResult.getServiceId().equals(IF_10810)
//					|| linkResult.getServiceId().equals(IF_K10810)
//					|| linkResult.getServiceId().equals(IF_F10810)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "731";
//				}// IF_10820(業務処理状況確認(低圧)(需要者情報変更))、IF_K10820(業務処理状況確認(低圧)(需要者情報変更))、IF_F10820(業務処理状況確認(受電者情報変更))
//			} else if (linkResult.getServiceId().equals(IF_10820)
//					|| linkResult.getServiceId().equals(IF_K10820)
//					|| linkResult.getServiceId().equals(IF_F10820)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "741";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "731";
//				}
//			}
//
//		}
		
		if (!StringUtils.isEmpty(linkResult.getCustomerCd()) && linkResult.getSerialNumber() != null) {
			// 完了通知種別を取得できた場合
			if (notification != null && linkResult.getSwitchingUpdateAndAlartStatus().isMailFlag()) {
				// Change Start CATPPS-769 対応 A.Miyakawa
				// TE7I通知種別管理を取得する
				try {
					Te7iEntityModel te7iEntityModel = getTe7iEntityDao().findByPrimaryKey(catyPrincipal, catyPrincipal.getStationCd(), notification);
					if (Gadget.equals(NOTIFICATION_FLAG_TRUE, te7iEntityModel.getTe7i201()))
						insertTe74(catyPrincipal, catyPrincipal.getStationCd(), linkResult, notification);
				} catch (EntityNotFoundException e) {
					// 処理を続行する
				}
				// Change End CATPPS-769 対応 A.Miyakawa
			}
		}
		// Change End CATPPS-1364 対応 A.Miyakawa
	}
	// Change Start CATPPS-769 対応 A.Miyakawa
	/**
	 * 完了通知情報を登録する
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkResult
	 * @param notification
	 */
	private void insertTe74(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkResult, String notification) {
		// 完了通知情報の設定をする
		Te74EntityModel te74Entity = new Te74EntityModel();
		te74Entity.setTe74001(catyPrincipal.getStationCd());// 局コード
		te74Entity.setTe74002(linkResult.getCustomerCd());// 顧客コード
		te74Entity.setTe74003(linkResult.getSerialNumber());// 連番
		te74Entity.setTe74101(notification);// 通知種別
		te74Entity.setTe74201(linkResult.getChangesDatePlan());// 異動予定日
		te74Entity.setTe74202(linkResult.getChangesDate());// 異動年月日
		te74Entity.setTe74301(linkResult.getContactMatter());// ご連絡事項
		te74Entity.setTe74401(new BigDecimal("0"));// 処理状況
		// Change Start 20160320 CATPPS-769 対応 A.Miyakawa
		te74Entity.setTe74501(linkResult.getDispContactMatter());
		// Change End 20160320 CATPPS-769 対応 A.Miyakawa
		te74Entity.setUpdateApp("SXA0023");// 更新APP

		getTe74EntityDao().save(catyPrincipal, te74Entity);
	}
	// Change End CATPPS-769 対応 A.Miyakawa
	/**
	 * IF別連携結果処理
	 * 
	 * @param catyPrincipal
	 *            アカウント情報
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 * @param cmnServiceImpl
	 *            レスポンス情報
	 * @throws EntityNotFoundException
	 * @throws SwitchingException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private boolean linkRequestResultProc(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult,
			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl)
			throws EntityNotFoundException, SwitchingException {

		String serviceId = linkRequestInfoResult.getServiceId();

		if (IF_10110.equals(serviceId) || IF_F10110.equals(serviceId)) {
			/**
			 * 設備情報照会(低圧), 設備情報照会(低圧FIT電源)
			 */

			List<Te7dEntityModel> te7dEntitys = null;

			if (linkRequestInfoResult.getCustomerCd() != null
					&& linkRequestInfoResult.getSerialNumber() != null) {
				/**
				 * スイッチング連携管理情報から顧客コードと連番が取得できる場合
				 */

				// 設備情報を取得
				te7dEntitys = this.getTe7dEntityDao()
						.findByEquipmentInfoForBizProcStatusCheck(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber());

			}

			// 設備情報が取得できた場合
			if (!CollectionUtils.isEmpty(te7dEntitys)) {

				for (Te7dEntityModel te7dEntity : te7dEntitys) {

					// 設備情報を削除する
					this.deleteEquipmentInfo(catyPrincipal, stationCd,
							te7dEntity.getTe7d002(), cmnServiceImpl);

					// 設備情報を作成登録する
					this.insertEquipmentInfo(catyPrincipal, stationCd,
							linkRequestInfoResult.getCustomerCd(),
							linkRequestInfoResult.getSerialNumber(),
							linkRequestInfoResult.getRenKeiNum(),
							cmnServiceImpl);

				}

			} else {

				// 設備情報を作成登録する
				this.insertEquipmentInfo(catyPrincipal, stationCd,
						linkRequestInfoResult.getCustomerCd(),
						linkRequestInfoResult.getSerialNumber(),
						linkRequestInfoResult.getRenKeiNum(), cmnServiceImpl);
			}

			// IF_10110(設備情報照会(低圧))の場合
			if (IF_10110.equals(serviceId)) {

				/** 設備情報_異動申込受付情報を更新する */

				if (linkRequestInfoResult.getCustomerCd() != null
						&& linkRequestInfoResult.getSerialNumber() != null) {

					/**
					 * スイッチング連携管理情報から顧客コードと連番が取得できる場合
					 */

					// 設備情報_異動申込受付情報を取得する
					List<Te7eEntityModel> selectTe7eEntityList = this
							.getTe7eEntityDao()
							.findByChangesApplicationAcceptanceInfo(stationCd,
									linkRequestInfoResult.getCustomerCd(),
									linkRequestInfoResult.getSerialNumber());

					// 設備情報_異動申込受付情報を削除する
					this.deleteChangesApplicationAcceptanceInfo(catyPrincipal,
							selectTe7eEntityList);

				}

				// 設備情報_異動申込受付情報を設定する
				List<Te7eEntityModel> createTe7eEntityList = cmnServiceImpl
						.settingChangesAppAcceptedInformation(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber(),
								linkRequestInfoResult.getRenKeiNum());

				// 設備情報_異動申込受付情報を登録する
				this.insertChangesApplicationAcceptanceInfo(catyPrincipal,
						createTe7eEntityList);

				/** 設備情報_計器情報を更新する */

				if (linkRequestInfoResult.getCustomerCd() != null
						&& linkRequestInfoResult.getSerialNumber() != null) {

					/**
					 * スイッチング連携管理情報から顧客コードと連番が取得できる場合
					 */

					// 設備情報_計器情報を取得する
					List<Te7fEntityModel> selectTe7fEntityList = this
							.getTe7fEntityDao()
							.getInstrumentInfoForBizProcStatusCheck(stationCd,
									linkRequestInfoResult.getCustomerCd(),
									linkRequestInfoResult.getSerialNumber());

					// 設備情報_計器情報を削除する
					this.deleteInstrumentInformation(catyPrincipal,
							selectTe7fEntityList);

				}

				// 設備情報_計器情報を設定する
				List<Te7fEntityModel> createTe7fEntityList = cmnServiceImpl
						.settingInstrumentInformation(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber(),
								linkRequestInfoResult.getRenKeiNum());

				// 設備情報_計器情報を登録する
				this.insertInstrumentInformation(catyPrincipal,
						createTe7fEntityList);

				/** 設備情報_定額電灯を更新する */

				if (linkRequestInfoResult.getCustomerCd() != null
						&& linkRequestInfoResult.getSerialNumber() != null) {

					/**
					 * スイッチング連携管理情報から顧客コードと連番が取得できる場合
					 */

					// 設備情報_定額電灯を取得する
					List<Te7gEntityModel> selectTe7gEntityList = this
							.getTe7gEntityDao()
							.getStraightLineElectricLightInfoForBizProcStatusCheck(
									stationCd,
									linkRequestInfoResult.getCustomerCd(),
									linkRequestInfoResult.getSerialNumber());

					// 設備情報_定額電灯を削除する
					this.deleteStraightLineElectricLightInformation(
							catyPrincipal, selectTe7gEntityList);

				}

				// 設備情報_定額電灯を設定する
				List<Te7gEntityModel> createTe7gEntityList = cmnServiceImpl
						.settingStraightLineElectricLightInformation(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber(),
								linkRequestInfoResult.getRenKeiNum());

				// 設備情報_定額電灯を登録する
				this.insertStraightLineElectricLightInformation(catyPrincipal,
						createTe7gEntityList);
			}
			// Change Start CATPPS-1364 対応 A.Miyakawa
			// 連携要求情報.処理状況に「2」を設定
			// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
			// Change End CATPPS-1364 対応 A.Miyakawa
			
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
			
		} else if (IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)
				|| IF_10510.equals(serviceId) || IF_K10510.equals(serviceId) || IF_F10510.equals(serviceId)
				|| IS_20110.equals(serviceId) || IS_K20110.equals(serviceId)
				|| IS_F20110.equals(serviceId) || IF_10610.equals(serviceId)
				|| IF_K10610.equals(serviceId) || IF_F10610.equals(serviceId)
				|| IF_10710.equals(serviceId) || IF_K10710.equals(serviceId)
				|| IF_F10710.equals(serviceId) || IF_10210.equals(serviceId)
				|| IF_K10210.equals(serviceId) || IF_10810.equals(serviceId)
				|| IF_K10810.equals(serviceId) || IF_F10810.equals(serviceId)
				|| IF_10910.equals(serviceId)) {

			/**
			 * 「再点(低圧)」, 「再点(低圧FIT電源)」 「廃止・撤去(低圧)」, 「廃止・撤去(低圧FIT電源)」
			 * 「スイッチング廃止取次登録(低圧)」, 「スイッチング廃止取次登録(高圧(500kw未満))」,
			 * 「スイッチング廃止取次登録(低圧FIT電源)」 「スイッチング開始申請(低圧)」,
			 * 「スイッチング開始申請(高圧(500kw未満))」, 「スイッチング開始申請(低圧FIT電源)」
			 * 「スイッチング廃止申請(低圧)」, 「スイッチング廃止申請(高圧(500kw未満))」,
			 * 「スイッチング廃止申請(低圧FIT電源)」 「使用量情報照会申請(低圧)」, 「使用量情報照会申請(高圧(500kw未満))」
			 * 「需要者情報変更(低圧)」, 「需要者情報変更(高圧(500kw未満))」, 「発電者情報変更」 「アンペア変更(低圧)」
			 */

			// スイッチング支援システム連携.レスポンス情報を取得
			// Change Start CATPPS-1364 対応 A.Miyakawa
			// 連携要求情報.処理状況に「1」を設定
			// linkRequestInfoResult.setProcessingStatus(new BigDecimal(1));
			// Change End CATPPS-1364 対応 A.Miyakawa
			// 申込番号、廃止取次番号を設定
			if (IS_20110.equals(serviceId) || IS_K20110.equals(serviceId)
					|| IS_F20110.equals(serviceId)) {

				/**
				 * IS_20110(スイッチング廃止取次登録(低圧))
				 * IS_K20110(スイッチング廃止取次登録(高圧(500kw未満)))
				 * IS_F20110(スイッチング廃止取次登録(低圧FIT電源))
				 * */

				// 連携要求情報.廃止取次番号にレスポンス情報.廃止取次番号を設定
				linkRequestInfoResult.setAbolitionAgencyNo(cmnServiceImpl
						.getAbolitionAgencyNoOfResponse());

				// Add start 20160224 A.Takemi [CATPPS-1197]
				// 連携要求情報.廃止取次番号が設定されている場合に訂正・取消の元になったスイッチング申請の処理状況を変更する
				if (!StringUtils.isEmpty(linkRequestInfoResult.getAbolitionAgencyNo())) {
					// 廃止取次番号から処理状況が1:処理中のスイッチング申請のキー情報を取得する
					Te79EntityModel te79EntityModel =
							getTe79EntityDao().findByRenkeiRequestInfoForAbolitionAgencyNo(stationCd, linkRequestInfoResult.getAbolitionAgencyNo());
					
					// Change Start CATPPS-1364 対応 A.Miyakawa
//					// 処理中のスイッチング申請の更新フラグが2:訂正の場合
//					if ("2".equals(String.valueOf(linkRequestInfoResult.getFlagUpdate()))) {
//						te79EntityModel.setTe79102(new BigDecimal("4"));	// 処理状況4:キャンセル（訂正）
//						
//						// 連携管理情報にスイッチング連携管理更新情報を追加
//						linkRequestInfoResult.getTe79EntityModelListUpdateInfo().add(te79EntityModel);
//						
//					// 処理中のスイッチング申請の更新フラグが3:取消の場合
//					} else if ("3".equals(String.valueOf(linkRequestInfoResult.getFlagUpdate()))) {
//						te79EntityModel.setTe79102(new BigDecimal("5"));	// 処理状況5:キャンセル（取消）
//						
//						// 連携管理情報にスイッチング連携管理更新情報を追加
//						linkRequestInfoResult.getTe79EntityModelListUpdateInfo().add(te79EntityModel);
//					}
					if (te79EntityModel != null)
						linkRequestInfoResult.getTe79EntityModelListUpdateInfo().add(te79EntityModel);
					// Change Start CATPPS-1364 対応 A.Miyakawa
				}
				// Add end 20160224 A.Takemi [CATPPS-1197]

			} else {

				// 連携要求情報.申込番号にレスポンス情報.申込番号を設定
				linkRequestInfoResult.setAppNo(cmnServiceImpl
						.getApplyNoOfResponse());

			}

			// 連携要求情報.申込番号の存在確認
			if (!StringUtils.isEmpty(linkRequestInfoResult.getAppNo())) {

				// 更新フラグ別処理
				if ("2".equals(String.valueOf(linkRequestInfoResult
						.getFlagUpdate()))) {

					/** 更新フラグが「訂正」の場合 */
					// スイッチング連携管理更新情報を連携管理情報に設定する(追加する)
					Te79EntityModel te79EntityModel = new Te79EntityModel();
					te79EntityModel.setTe79001(stationCd);
					te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
					te79EntityModel.setTe79601(linkRequestInfoResult.getAbolitionAgencyNo());
					te79EntityModel.setTe79102(new BigDecimal("4"));
					List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
					te79EntityModelListUpdateInfo.add(te79EntityModel);
					linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);

				} else if ("3".equals(String.valueOf(linkRequestInfoResult
						.getFlagUpdate()))) {

					/** 更新フラグが「削除」の場合 */
					
					// スイッチング連携管理更新情報を連携管理情報に設定する(追加する)
					Te79EntityModel te79EntityModel = new Te79EntityModel();
					te79EntityModel.setTe79001(stationCd);
					te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
					te79EntityModel.setTe79601(linkRequestInfoResult.getAbolitionAgencyNo());
					te79EntityModel.setTe79102(new BigDecimal("5"));
					List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
					te79EntityModelListUpdateInfo.add(te79EntityModel);
					linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);

				}
			}
			
			// ご連絡事項を格納する
			if (IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)
						|| IF_10510.equals(serviceId) || IF_K10510.equals(serviceId) 
						|| IF_F10510.equals(serviceId) || IF_10610.equals(serviceId)
						|| IF_K10610.equals(serviceId) || IF_F10610.equals(serviceId)
						|| IF_10710.equals(serviceId) || IF_K10710.equals(serviceId)
						|| IF_F10710.equals(serviceId) || IF_10910.equals(serviceId)) {
				 linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
			}
			
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
			
		} else if (IF_10310.equals(serviceId) || IF_K10310.equals(serviceId)) {
			/**
			 * IF_10310(使用量情報照会(低圧)) IF_K10310(使用量情報照会(高圧))
			 */

			// 登録または、更新処理を行う
			this.registUsageInformationQuery(catyPrincipal, stationCd,
					linkRequestInfoResult.getCustomerCd(),
					linkRequestInfoResult.getSerialNumber(), cmnServiceImpl);
			
			// Change a.Miyakawa
			// Change Start CATPPS-1364 対応 A.Miyakawa
			// 連携要求情報.処理状況に「2」を設定
			// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
			// Change Start CATPPS-1364 対応 A.Miyakawa
			
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
			
		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId)
				|| IS_F20210.equals(serviceId)) {

			/**
			 * IS_20210(スイッチング廃止取次結果照会(低圧))
			 * IS_K20210(スイッチング廃止取次結果照会(高圧(500kw未満)))
			 * IS_F20210(スイッチング廃止取次結果照会(低圧FIT電源))
			 */

			// 廃止取次結果照会一覧を取得
			List<AbolitionAgencyResultsQueryModel> AbolitionAgencyResultsQueryList = cmnServiceImpl
					.getAbolitionAgencyResultQueryModelList();
			
			// スイッチング開始情報
			List<SwithingParameter> paramList = new ArrayList<SwithingParameter>();
			// 連携要求情報IS_××××用
			List<LinkRequestForIs> linkForIsList = new ArrayList<LinkRequestForIs>();
			// 連携ステータス更新情報
			List<SwithingParameter> swUpdInfoList = new ArrayList<SwithingParameter>();

			if (!CollectionUtils.isEmpty(AbolitionAgencyResultsQueryList)) {

				for (AbolitionAgencyResultsQueryModel model : AbolitionAgencyResultsQueryList) {

					// スイッチング連携情報
					Te79EntityModel te79Entity = null;
					
					if ("01".equals(model.getStatus())
							|| "04".equals(model.getStatus())
							|| "05".equals(model.getStatus())) {

						/**
						 * 01:判断待ち 04:マッチング済み(OK) 05:マッチング済み(NG)
						 */

						continue;

					} else {

						// スイッチング連携情報を取得する
						te79Entity = this.getTe79EntityDao()
								.findByRenkeiRequestInfoForAbolitionAgencyNo(
										stationCd,
										model.getAbolitionAgencyNumber());

						if (te79Entity != null) {

							// 処理状況が「1」(申請または廃止取次中)の場合
							if (new BigDecimal("1").compareTo(te79Entity.getTe79102())==0) {

								// 廃止取次結果.ステータスが「02：判断済み(OK)」の場合
								if ("02".equals(model.getStatus())) {

									// 廃止取次結果を格納する
									this.insertAbolitionAgencyResults(
											catyPrincipal, stationCd,
											te79Entity, model);
									
									// スイッチング連携管理更新情報を連携管理情報に設定する(追加する)
									Te79EntityModel te79EntityModel = new Te79EntityModel();
									te79EntityModel.setTe79001(stationCd);
									te79EntityModel.setTe79002(te79Entity.getTe79002());
									te79EntityModel.setTe79003(te79Entity.getTe79003());
									te79EntityModel.setTe79601(model.getAbolitionAgencyNumber());
									// Change Start CATPPS-1364 対応 A.Miyakawa
									// te79EntityModel.setTe79102(new BigDecimal("2"));
//									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
//									te79EntityModelListUpdateInfo.add(te79EntityModel);
//									linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// Change End CATPPS-1364 対応 A.Miyakawa
									SwithingParameter param = new SwithingParameter();
									// パラメータ.顧客コード
									param.setCustomerCd(te79Entity.getTe79104());
									// パラメータ.連番
									param.setCustomerConsNum(te79Entity.getTe79105());
									// パラメータ.更新フラグ
									param.setUpdateFlg(new BigDecimal(1));
									// パラメータリストへaddする
									paramList.add(param);

									LinkRequestForIs linkForIs = new LinkRequestForIs();
									// 顧客コードを設定
									linkForIs.setCustomerCd(te79Entity.getTe79104());
									// 連番を設定
									linkForIs.setSerialNumber(te79Entity.getTe79105());
									// 廃止取次番号を設定
									linkForIs.setAbolitionAgencyNo(model.getAbolitionAgencyNumber());
									// Change Start CATPPS-1364 対応 A.Miyakawa
									// スイッチング連携管理更新情報を設定
									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkForIs.getTe79EntityModelListUpdateInfo();
									te79EntityModelListUpdateInfo.add(te79EntityModel);
									linkForIs.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// ステータスを設定
									linkForIs.setStatus(model.getStatus());
									// Change End CATPPS-1364 対応 A.Miyakawa
									
									// 処理状況を設定
									// Change Start CATPPS-1364 対応 A.Miyakawa
									// linkForIs.setProcessingStatus(new BigDecimal(2));
									// Change End CATPPS-1364 対応 A.Miyakawa
									
									// Add Start 20160217 CATPPS-1101 対応　A.Miyakawa
									// スイッチング廃止取次判断ＮＧ理由を設定
									linkForIs.setNgReason(model.getSwitchingAbolitionAgencyDecisionNGReasonName());
									// Add End 20160217 CATPPS-1101 対応　A.Miyakawa
									
									linkForIsList.add(linkForIs);
									
								} else {
									// 上記以外

									// 廃止取次結果を格納する
									this.insertAbolitionAgencyResults(
											catyPrincipal, stationCd,
											te79Entity, model);

									// スイッチング連携管理更新情報を連携管理情報に設定する(追加する)
									Te79EntityModel te79EntityModel = new Te79EntityModel();
									te79EntityModel.setTe79001(stationCd);
									te79EntityModel.setTe79002(te79Entity.getTe79002());
									te79EntityModel.setTe79003(te79Entity.getTe79003());
									te79EntityModel.setTe79601(model.getAbolitionAgencyNumber());
									// Change Start CATPPS-1364 対応 A.Miyakawa
									// te79EntityModel.setTe79102(new BigDecimal("3"));
//									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
//									te79EntityModelListUpdateInfo.add(te79EntityModel);
//									linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// Change End CATPPS-1364 対応 A.Miyakawa
									LinkRequestForIs linkForIs = new LinkRequestForIs();
									// 顧客コードを設定
									linkForIs.setCustomerCd(te79Entity.getTe79104());
									// 連番を設定
									linkForIs.setSerialNumber(te79Entity.getTe79105());
									// 廃止取次番号を設定
									linkForIs.setAbolitionAgencyNo(model.getAbolitionAgencyNumber());
									// 処理状況を設定
									// Change Start CATPPS-1364 対応 A.Miyakawa
									// linkForIs.setProcessingStatus(new BigDecimal(3));
									// スイッチング連携管理更新情報を設定
									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkForIs.getTe79EntityModelListUpdateInfo();
									te79EntityModelListUpdateInfo.add(te79EntityModel);
									linkForIs.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// ステータスを設定
									linkForIs.setStatus(model.getStatus());
									// Change End CATPPS-1364 対応 A.Miyakawa
									// Change End CATPPS-1364 対応 A.Miyakawa
									
									// Add Start 20160217 CATPPS-1101 対応　A.Miyakawa
									// スイッチング廃止取次判断ＮＧ理由を設定
									linkForIs.setNgReason(model.getSwitchingAbolitionAgencyDecisionNGReasonName());
									// Add End 20160217 CATPPS-1101 対応　A.Miyakawa
									
									linkForIsList.add(linkForIs);
								}

							}

						}

					}

					// 連携ステータス更新情報
					SwithingParameter swParam = new SwithingParameter();
					if (te79Entity != null) {
						// 顧客コード
						swParam.setCustomerCd(te79Entity.getTe79104());
						// 連番
						swParam.setCustomerConsNum(te79Entity.getTe79105());
					}
					swUpdInfoList.add(swParam);
					
				}

			}
			
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
			
			// 連携要求情報.スイッチング開始情報
			linkRequestInfoResult.setSwStartInfo(paramList);
			// 連携要求情報IS_××××用
			linkRequestInfoResult.setLinkReqForIs(linkForIsList);
			// 連携ステータス更新情報
			linkRequestInfoResult.setSwStatusUpdList(swUpdInfoList);

		// Change start 20160228 A.Takemi [CATPPS-1252]
		/** IS_20310(スイッチング廃止取次照会(低圧)) IS_K20310(スイッチング廃止取次照会(高圧(500kw未満))) IS_F20310(スイッチング廃止取次照会(低圧FIT電源)) */
		} else if (IS_20310.equals(serviceId) || IS_K20310.equals(serviceId) || IS_F20310.equals(serviceId)) {
			linkRequestInfoResult.setSwAbolitionJudgementInfo(new ArrayList<SwithingParameter>());	// 連携要求情報.廃止取次判断情報
			linkRequestInfoResult.setLinkReqForIs(new ArrayList<LinkRequestForIs>());				// 連携要求情報.連携要求情報IS_20410
			linkRequestInfoResult.setTe11EntityModelList(new ArrayList<Te11EntityModel>());			// 連携要求情報.接続廃止予定年月日更新データ

			/* レスポンス情報から廃止取次照会一覧を取得する */
			for (AbolitionAgencyQueryModel abolitionAgency : (List<AbolitionAgencyQueryModel>)cmnServiceImpl.getAbolitionAgencyQueryModelList()) {

				/* 廃止取次.ステータスが01：判断待ちの場合 */
				if ("01".equals(abolitionAgency.getStatus())) {

					/* エラーチェック情報を取得する */
					GetErrorCheckInfoResult errResult = getContractServiceDao().getErrorCheckInfo(
							catyPrincipal, stationCd, abolitionAgency.getSupplyPointSpecificNumber(), abolitionAgency.getContractNumber());	// エラーチェック情報
					
					SwithingParameter abolitionAgencyDecision = new SwithingParameter();	// 廃止取次判断情報
					LinkRequestForIs reqIS_20410 = new LinkRequestForIs();					// 連携要求情報IS_20410

					/* 地点特定番号のエラーチェック */
					if (errResult == null) {
						abolitionAgencyDecision.setStopAgencyJudgeFlg("02");			// 廃止取次判断情報.スイッチング廃止取次判断
						abolitionAgencyDecision.setStopAgencyJudgeReason01Flg(true);	// 廃止取次判断情報.スイッチング廃止取次判断NG理由
						// Change Start CATPPS-1364 対応 A.Miyakawa
						// reqIS_20410.setProcessingStatus(new BigDecimal(3));				// 連携要求情報IS_20410.処理状況
						// Change End CATPPS-1364 対応 A.Miyakawa
					} else {
						/* 契約番号不一致のエラーチェック */
						if (errResult.getContractCd() == null || errResult.getContractCd().isEmpty()) {
							abolitionAgencyDecision.setStopAgencyJudgeFlg("02");			// 廃止取次判断情報.スイッチング廃止取次判断
							abolitionAgencyDecision.setStopAgencyJudgeReason02Flg(true);	// 廃止取次判断情報.スイッチング廃止取次判断NG理由
							
							reqIS_20410.setProcessingStatus(new BigDecimal(3));				// 連携要求情報IS_20410.処理状況

						/* 廃止受付中のエラーチェック */
						} else if (errResult.getSwStatus() != null && !errResult.getSwStatus().isEmpty()) {
							abolitionAgencyDecision.setStopAgencyJudgeFlg("02");			// 廃止取次判断情報.スイッチング廃止取次判断
							abolitionAgencyDecision.setStopAgencyJudgeReason03Flg(true);	// 廃止取次判断情報.スイッチング廃止取次判断NG理由
							// Change Start CATPPS-1364 対応 A.Miyakawa
							// reqIS_20410.setProcessingStatus(new BigDecimal(3));				// 連携要求情報IS_20410.処理状況
							// Change End CATPPS-1364 対応 A.Miyakawa
						/* エラーチェック処理で該当しなかった場合下記の処理をする */
						} else {
							abolitionAgencyDecision.setStopAgencyJudgeFlg("01");			// 廃止取次判断情報.スイッチング廃止取次判断
							// Change Start CATPPS-1364 対応 A.Miyakawa
							// reqIS_20410.setProcessingStatus(new BigDecimal(2));				// 連携要求情報IS_20410.処理状況
							// Change End CATPPS-1364 対応 A.Miyakawa
							/* 接続廃止予定年月日を更新するために、接続廃止予定年月日更新情報(LIST<te11EntityModel>)に追加する */
							Te11EntityModel te11EntityModel = new Te11EntityModel();
							te11EntityModel.setTe11001(stationCd);
							te11EntityModel.setTe11002(errResult.getCustomerCd());
							te11EntityModel.setTe11003(errResult.getSeqNo());
							te11EntityModel.setTe11103(abolitionAgency.getAbolitionDate());
							linkRequestInfoResult.getTe11EntityModelList().add(te11EntityModel);
						}
					}

					/* 廃止取次を格納する */
					insertAbolitionAgencyQuery(catyPrincipal, stationCd, errResult, abolitionAgency);

					/* スイッチング支援システム連携要求サービス(廃止取次判断)を行うための情報を連携要求情報に追加する */
					abolitionAgencyDecision.setCustomerCd(errResult != null ? errResult.getCustomerCd() : null);	// 廃止取次判断情報.顧客コード
					abolitionAgencyDecision.setCustomerConsNum(errResult != null ? errResult.getSeqNo() : null);	// 廃止取次判断情報.連番
					if (IS_20310.equals(serviceId)) {																// 廃止取次判断情報.契約種別
						abolitionAgencyDecision.setContractType("015");
					} else if (IS_K20310.equals(serviceId)) {
						abolitionAgencyDecision.setContractType("016");
					} else if (IS_F20310.equals(serviceId)) {
						abolitionAgencyDecision.setContractType("017");
					}
					abolitionAgencyDecision.setStopAgencyNum(abolitionAgency.getAbolitionAgencyNumber());			// 廃止取次判断情報.廃止取次番号
					linkRequestInfoResult.getSwAbolitionJudgementInfo().add(abolitionAgencyDecision);				// 連携要求情報.廃止取次判断情報

					/* 下記の情報を連携要求情報として保持する */
					reqIS_20410.setCustomerCd(errResult != null ? errResult.getCustomerCd() : null);	// 連携要求情報IS_××××用.顧客コード
					reqIS_20410.setSerialNumber(errResult != null ? errResult.getSeqNo() : null);		// 連携要求情報IS_××××用.連番
					reqIS_20410.setAbolitionAgencyNo(abolitionAgency.getAbolitionAgencyNumber());		// 連携要求情報IS_××××用.廃止取次番号を設定
					// Change Start CATPPS-769 対応 A.Miyakawa
					reqIS_20410.setStatus(abolitionAgency.getStatus());
					// Change Start CATPPS-769 対応 A.Miyakawa
					linkRequestInfoResult.getLinkReqForIs().add(reqIS_20410);							// 連携要求情報.連携要求情報IS_××××用
					// Delete Start CATPPS-1564 20160411 A.Miyakawa
					/* 受付メッセージ情報設定 */
					// linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
					// Delete End CATPPS-1564 20160411 A.Miyakawa
				}
			}
			// Change Start CATPPS-1564 20160411 A.Miyakawa
			/* 受付メッセージ情報設定 */
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
			// Change End CATPPS-1564 20160411 A.Miyakawa
		// Change end 20160228 A.Takemi [CATPPS-1252]

		} else if (IS_20410.equals(serviceId) || IS_K20410.equals(serviceId)
				|| IS_F20410.equals(serviceId)) {

			/**
			 * IS_20410(スイッチング廃止取次判断(低圧)) IS_K20410(スイッチング廃止取次判断(高圧(500kw未満)))
			 * IS_F20410(スイッチング廃止取次判断(低圧FIT電源))
			 */
			
			// スイッチング廃止申請情報
			List<SwithingParameter> paramList = new ArrayList<SwithingParameter>();
			
			Te7aEntityModel model = this.getSpecifiedTe7aModel(linkRequestInfoResult.getTe7aEntityModelList(),"JUDGEMENT_FLAG");
			// 廃止取次判断情報.スイッチング廃止取次判断
			String swHandan = model.getTe7a101();
			
			// 廃止取次判断情報.スイッチング廃止取次判断
			if ("01".equals(swHandan)) {

				// 「01:OK」の場合

				SwithingParameter param = new SwithingParameter();

				// パラメータ.顧客コード
				param.setCustomerCd(linkRequestInfoResult.getCustomerCd());
				// パラメータ.連番
				param.setCustomerConsNum(linkRequestInfoResult
						.getSerialNumber());
				// パラメータ.更新フラグ
				param.setUpdateFlg(new BigDecimal(1));

				paramList.add(param);

				// Change Start CATPPS-1364 対応 A.Miyakawa
				linkRequestInfoResult.setJudgeMent(swHandan);
				// 連携要求情報.処理状況に「2」を設定する
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
				// Change Start CATPPS-1364 対応 A.Miyakawa

			} else if ("02".equals(swHandan)) {

				// 「02:NG」の場合
				// Change Start CATPPS-1364 対応 A.Miyakawa
				linkRequestInfoResult.setJudgeMent(swHandan);
				// 連携要求情報.処理状況に「3」を設定する
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
				// Change Start CATPPS-1364 対応 A.Miyakawa
			}
			
			// 連携要求情報.スイッチング廃止申請情報
			linkRequestInfoResult.setSwAbolitionApplyInfo(paramList);
			
			// 受付メッセージ情報設定
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
			
		} else if (IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
				|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
				|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
				|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
				|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
				|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
				|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
				|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
				|| IF_F10820.equals(serviceId)) {

			/**
			 * IF_10220(業務処理状況確認(低圧)(使用量情報照会))
			 * IF_10420(業務処理状況確認(低圧)(再点))、IF_10520(業務処理状況確認(低圧)(廃止(撤去)))、
			 * IF_10620
			 * (業務処理状況確認(低圧)(スイッチング開始))、IF_10720(業務処理状況確認(低圧)(スイッチング廃止))、
			 * IF_10820(業務処理状況確認(低圧)(需要者情報変更))、IF_10920(業務処理状況確認(低圧)(アンペア変更))、
			 * IF_K10220(業務処理状況確認(高圧(500kw未満))(使用量情報照会))、
			 * IF_K10520(業務処理状況確認(高圧(500kw未満))(廃止(撤去)))、
			 * IF_K10620(業務処理状況確認(高圧(500kw未満))(スイッチング開始))、
			 * IF_K10720(業務処理状況確認(高圧(500kw未満))(スイッチング廃止))、
			 * IF_K10820(業務処理状況確認(高圧(500kw未満))(需要者情報変更)))、
			 * IF_F10420(業務処理状況確認(低圧FIT電源)(再点))、
			 * IF_F10520(業務処理状況確認(低圧FIT電源)(廃止(撤去))、
			 * IF_F10620(業務処理状況確認(低圧FIT電源)(スイッチング開始)、
			 * IF_F10720(業務処理状況確認(低圧FIT電源)(スイッチング廃止)、
			 * IF_F10820(業務処理状況確認(低圧FIT電源)(需要者情報変更))
			 */
			
			// 使用量情報照会情報
			List<SwithingParameter> paramList = new ArrayList<SwithingParameter>();
			/** スイッチング連携結果情報リスト */
			List<Te7jEntityModel> te7jEntityModelList = new ArrayList<Te7jEntityModel>();

			if ("01".equals(cmnServiceImpl.getReceivingStep())
					|| "02".equals(cmnServiceImpl.getReceivingStep())
					|| "03".equals(cmnServiceImpl.getReceivingStep())
					|| "04".equals(cmnServiceImpl.getReceivingStep())
					|| "10".equals(cmnServiceImpl.getReceivingStep())) {

				// 処理結果正常として終了する
				return false;

			} else if ("06".equals(cmnServiceImpl.getReceivingStep())
					|| "08".equals(cmnServiceImpl.getReceivingStep())) {

				// サービスID別に処理を行う
				if (IF_10220.equals(serviceId) || IF_K10220.equals(serviceId)) {

					SwithingParameter param = new SwithingParameter();

					// パラメータ.顧客コード
					param.setCustomerCd(linkRequestInfoResult.getCustomerCd());
					// パラメータ.連番
					param.setCustomerConsNum(linkRequestInfoResult
							.getSerialNumber());
					// パラメータ.更新フラグ
					param.setUpdateFlg(new BigDecimal(1));
					// パラメータ.使用量閲覧パスワード
					param.setUsedInfoReadPw(cmnServiceImpl
							.getUsageBrowsePassword());

					paramList.add(param);

				} else if (IF_10520.equals(serviceId) || IF_10720.equals(serviceId) ||
							IF_K10520.equals(serviceId) || IF_K10720.equals(serviceId) ||
							IF_F10520.equals(serviceId) || IF_F10720.equals(serviceId) ) {
					//　接続廃止年月日の結果を格納
					Te7jEntityModel te7jEntityModel = new Te7jEntityModel();
					te7jEntityModel.setTe7j001(stationCd);
					te7jEntityModel.setTe7j002(linkRequestInfoResult.getTe79EntityMode().getTe79002());
					te7jEntityModel.setTe7j003(linkRequestInfoResult.getTe79EntityMode().getTe79003());
					te7jEntityModel.setTe7j101(serviceId);
					te7jEntityModel.setTe7j201(linkRequestInfoResult.getCustomerCd());
					te7jEntityModel.setTe7j202(linkRequestInfoResult.getSerialNumber());
					te7jEntityModel.setTe7j301(cmnServiceImpl.getConnectSupplyAbolitionDate());
					
					te7jEntityModelList.add(te7jEntityModel);
					
					// Add Start CATPPSSB-246 20160227 A.Miyakawa
					// アドオンコード「SAIBUGAS」の制御コードが「ONLY」の場合（西部ガス用）
					if (catyPrincipal.getAddOnControl().getAddOnModel(AddOnCode.SAIBUGAS).getAddOnControlCode() == AddOnControlCode.SAIBUGAS__ONLY) {
						// 解約登録日を取得する
						if (linkRequestInfoResult.getTe79EntityMode().getTe79104()!=null && linkRequestInfoResult.getTe79EntityMode().getTe79105() != null) {
							Te17EntityModel te17EntityModel = new Te17EntityModel();
							te17EntityModel.setTe17001(stationCd);
							te17EntityModel.setTe17002(linkRequestInfoResult.getTe79EntityMode().getTe79104());
							te17EntityModel.setTe17003(linkRequestInfoResult.getTe79EntityMode().getTe79105());
							te17EntityModel.setTe17101(DateUtils.getCurrentFormattedDateTime("yyyyMMdd"));
							linkRequestInfoResult.setTe17EntityModel(te17EntityModel);
						}
					}
					// Add End CATPPSSB-246 20160227 A.Miyakawa
				// Add start 20160317 I.Kudou [CATPPS-1236]
				} else if (IF_10420.equals(serviceId) || IF_10620.equals(serviceId) ||
					IF_K10620.equals(serviceId) || 
					IF_F10420.equals(serviceId) || IF_F10620.equals(serviceId) ) {
					//　計器取替予定月日及び計器取替月日の結果を格納
					Te7jEntityModel te7jEntityModel = new Te7jEntityModel();
					te7jEntityModel.setTe7j001(stationCd);
					te7jEntityModel.setTe7j002(linkRequestInfoResult.getTe79EntityMode().getTe79002());
					te7jEntityModel.setTe7j003(linkRequestInfoResult.getTe79EntityMode().getTe79003());
					te7jEntityModel.setTe7j101(serviceId);
					te7jEntityModel.setTe7j201(linkRequestInfoResult.getCustomerCd());
					te7jEntityModel.setTe7j202(linkRequestInfoResult.getSerialNumber());
					te7jEntityModel.setTe7j401(cmnServiceImpl.getKeikiTorikaeYoteiYmd());
					te7jEntityModel.setTe7j402(cmnServiceImpl.getKeikiTorikaeYmd());
					te7jEntityModel.setTe7j403(cmnServiceImpl.getSetsuzokuKyokyuKaishiYmd());
					
					te7jEntityModelList.add(te7jEntityModel);
				}
				// Add end 20160317 I.Kudou [CATPPS-1236]
				// Add start 20160428 t.funao [CATPPS-1740]
				else if (IF_10920.equals(serviceId)){
					//　契約変更年月日の結果を格納
					Te7jEntityModel te7jEntityModel = new Te7jEntityModel();
					te7jEntityModel.setTe7j001(stationCd);
					te7jEntityModel.setTe7j002(linkRequestInfoResult.getTe79EntityMode().getTe79002());
					te7jEntityModel.setTe7j003(linkRequestInfoResult.getTe79EntityMode().getTe79003());
					te7jEntityModel.setTe7j101(serviceId);
					te7jEntityModel.setTe7j201(linkRequestInfoResult.getCustomerCd());
					te7jEntityModel.setTe7j202(linkRequestInfoResult.getSerialNumber());
					te7jEntityModel.setTe7j501(cmnServiceImpl.getContractChangeDate());
					
					te7jEntityModelList.add(te7jEntityModel);
				}
				// Add end 20160428 t.funao [CATPPS-1740]

				/** 異動日と異動予定日の差異を確認する */

				// 電力契約情報を取得する Dao
				GetElectricPowerContractInfoResult electricResult = new GetElectricPowerContractInfoResult();
				this.setEleContractInfo(electricResult, linkRequestInfoResult.getContractInfoResult());

				// サービスID別に処理を行う
				if (IF_10420.equals(serviceId) || IF_F10420.equals(serviceId)
						|| IF_10620.equals(serviceId)
						|| IF_K10620.equals(serviceId)
						|| IF_F10620.equals(serviceId)) {

					// Change start 20160318 I.Kudou [CATPPS-1236]
					//// 電力契約共通情報.接続開始予定日とレスポンス情報.接続開始年月日が不一致の場合
					//if (!electricResult.getTransportaionScheduledStartDate()
					//		.equals(cmnServiceImpl.getConnectSupplyStartDate())) {
					//
					//	// 連携要求情報.異動予定日に接続供給開始予定日を設定
					//	linkRequestInfoResult.setChangesDatePlan(electricResult
					//			.getTransportaionScheduledStartDate());
					//
					//	// 連携要求情報.異動日に接続供給開始年月日を設定
					//	linkRequestInfoResult.setChangesDate(cmnServiceImpl
					//			.getConnectSupplyStartDate());
					//
					//					}
					//NVL(計器取替月日,NVL(計器取替予定月日,依頼時の接続供給開始予定日))値生成
					String changesDate = null;
					if(!StringUtils.isEmpty(cmnServiceImpl.getKeikiTorikaeYmd())) {
						changesDate = cmnServiceImpl.getKeikiTorikaeYmd();
					} else if (!StringUtils.isEmpty(cmnServiceImpl.getKeikiTorikaeYoteiYmd())) {
						changesDate = cmnServiceImpl.getKeikiTorikaeYoteiYmd();
					} else {
						changesDate = cmnServiceImpl.getSetsuzokuKyokyuKaishiYmd();
					}
					// 電力契約共通情報.接続開始予定日とNVL(計器取替月日,NVL(計器取替予定月日,依頼時の接続供給開始予定日))が不一致の場合
					if (!StringUtils.isEmpty(electricResult.getTransportaionScheduledStartDate()) &&
						!electricResult.getTransportaionScheduledStartDate().equals(changesDate)	) {

						// 連携要求情報.異動予定日に接続供給開始予定日を設定
						linkRequestInfoResult.setChangesDatePlan(electricResult
								.getTransportaionScheduledStartDate());

						// 連携要求情報.異動日にNVL(計器取替月日,NVL(計器取替予定月日,依頼時の接続供給開始予定日))を設定
						linkRequestInfoResult.setChangesDate(changesDate);

					}
					// Change end 20160318 I.Kudou [CATPPS-1236]

				} else if (IF_10520.equals(serviceId)
						|| IF_K10520.equals(serviceId)
						|| IF_F10520.equals(serviceId)
						|| IF_10720.equals(serviceId)
						|| IF_K10720.equals(serviceId)
						|| IF_F10720.equals(serviceId)) {

					// 電力契約共通情報.接続廃止予定日とレスポンス情報.接続廃止年月日が不一致の場合
					if (!electricResult.getTransportaionScheduledEndDate()
							.equals(cmnServiceImpl
									.getConnectSupplyAbolitionDate())) {

						// 連携要求情報.異動予定日に 接続供給廃止予定日を設定
						linkRequestInfoResult.setChangesDatePlan(electricResult
								.getTransportaionScheduledEndDate());

						// 連携要求情報.異動日に接続供給廃止年月日を設定
						linkRequestInfoResult.setChangesDate(cmnServiceImpl
								.getConnectSupplyAbolitionDate());
					}
				} else if (IF_10920.equals(serviceId)) {

					// 電力契約共通情報.契約変更予定日とレスポンス情報.契約変更年月日が不一致の場合
					if (!electricResult.getContractChangeScheduledDate()
							.equals(cmnServiceImpl.getContractChangeDate())) {

						// 連携要求情報.異動予定日に 契約変更予定日を設定
						linkRequestInfoResult.setChangesDatePlan(electricResult
								.getContractChangeScheduledDate());

						// 連携要求情報.異動日に契約変更年月日を設定
						linkRequestInfoResult.setChangesDate(cmnServiceImpl
								.getContractChangeDate());

					}
				}

				// 連携要求情報を保持する

				// 連携要求情報.申込番号
				linkRequestInfoResult.setAppNo(cmnServiceImpl
						.getApplyNoOfResponse());
				
				// Change Start CATPPS-1364 対応 A.Miyakawa
				// 連携要求情報.処理状況
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
				// Change Start CATPPS-1364 対応 A.Miyakawa
				// 最終未完了連携番号を更新する

				// 検索条件とするサービスIDを取得する
				String searchServiceId = this.getSearchingServiceId(serviceId);

				// 申込情報を取得
				List<Te79EntityModel> appEntityList = this.te79EntityDao
						.findByRenkeiRequestInfoForProcessedStatus(stationCd,
								linkRequestInfoResult
										.getLastIncompleteRenKeiNum(),
								searchServiceId);

				if (!CollectionUtils.isEmpty(appEntityList)) {
					
					Te79EntityModel model = appEntityList.get(0);
					this.updateLastIncompleteRenKeiNum(catyPrincipal, stationCd, 
							linkRequestInfoResult.getProcessingStatusSerialNumber(), model.getTe79002());
					
				}
				
				// スイッチング連携管理更新情報を連携管理情報に設定する(追加する)
				Te79EntityModel te79EntityModel = new Te79EntityModel();
				te79EntityModel.setTe79001(stationCd);
				te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
				// Change Start CATPPS-1364 対応 A.Miyakawa
				// te79EntityModel.setTe79102(new BigDecimal("2"));
				// Change End CATPPS-1364 対応 A.Miyakawa
				te79EntityModel.setTe79701(cmnServiceImpl.getRenrakuMsg());
				List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
				te79EntityModelListUpdateInfo.add(te79EntityModel);
				linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
				
				SwContractStatusChangeInfoModel swContractStatusChangeInfoModel = null;
				
				// 契約状態変更
				if ( IF_10420.equals(serviceId) || IF_F10420.equals(serviceId)
						|| IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
						|| IF_F10620.equals(serviceId)) {
					swContractStatusChangeInfoModel = new SwContractStatusChangeInfoModel();
					swContractStatusChangeInfoModel.setCustomerCd(linkRequestInfoResult.getCustomerCd());
					swContractStatusChangeInfoModel.setCustomerConsNum(linkRequestInfoResult.getSerialNumber());
					swContractStatusChangeInfoModel.setContractStatus(DivisionConstants.SW_STATUS_CONTRACT);
					linkRequestInfoResult.setContractStatusChangeInfo(swContractStatusChangeInfoModel);
				} else if ( IF_10520.equals(serviceId) || IF_K10520.equals(serviceId)
						|| IF_F10520.equals(serviceId) || IF_10720.equals(serviceId)
						|| IF_K10720.equals(serviceId) || IF_F10720.equals(serviceId)) {
					swContractStatusChangeInfoModel = new SwContractStatusChangeInfoModel();
					swContractStatusChangeInfoModel.setCustomerCd(linkRequestInfoResult.getCustomerCd());
					swContractStatusChangeInfoModel.setCustomerConsNum(linkRequestInfoResult.getSerialNumber());
					swContractStatusChangeInfoModel.setContractStatus(DivisionConstants.SW_STATUS_CLOSE);
					linkRequestInfoResult.setContractStatusChangeInfo(swContractStatusChangeInfoModel);
				}
				
				// Change Start CATPPS-1101 対応　A.Miyakawa
				// 受付メッセージ情報設定
				linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
						linkRequestInfoResult.getTe79EntityMode().getTe79001(),
						linkRequestInfoResult.getTe79EntityMode().getTe79002(),
						linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
						cmnServiceImpl));
				// 連絡事項設定
				linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
				// Change End CATPPS-1101 対応　A.Miyakawa
				// Change Start CATPPS-1364 対応 A.Miyakawa
				linkRequestInfoResult.setReceivingStep(cmnServiceImpl.getReceivingStep());
				// Change End CATPPS-1364 対応 A.Miyakawa
			} else if ("09".equals(cmnServiceImpl.getReceivingStep())) {

				// 連携要求情報を保持する

				// 連携要求情報.申込番号
				linkRequestInfoResult.setAppNo(cmnServiceImpl
						.getApplyNoOfResponse());
				// 連携要求情報.処理状況
				// Change Start CATPPS-1364 対応 A.Miyakawa
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
				// Change Start CATPPS-1364 対応 A.Miyakawa
				// 検索条件とするサービスIDを取得する
				String searchServiceId = this.getSearchingServiceId(serviceId);

				// 申込情報を取得
				List<Te79EntityModel> appEntityList = this.te79EntityDao
						.findByRenkeiRequestInfoForProcessedStatus(stationCd,
								linkRequestInfoResult
										.getLastIncompleteRenKeiNum(),
								searchServiceId);

				if (!CollectionUtils.isEmpty(appEntityList)) {
					
					Te79EntityModel model = appEntityList.get(0);
					this.updateLastIncompleteRenKeiNum(catyPrincipal, stationCd, 
							linkRequestInfoResult.getProcessingStatusSerialNumber(), model.getTe79002());
				}
				
				// スイッチング連携管理更新情報を連携管理情報に設定する(追加する)
				Te79EntityModel te79EntityModel = new Te79EntityModel();
				te79EntityModel.setTe79001(stationCd);
				te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
				// Change Start CATPPS-1364 対応 A.Miyakawa
				// te79EntityModel.setTe79102(new BigDecimal("2"));
				// Change End CATPPS-1364 対応 A.Miyakawa
				te79EntityModel.setTe79701(cmnServiceImpl.getRenrakuMsg());
				List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
				te79EntityModelListUpdateInfo.add(te79EntityModel);
				linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
				// Change Start CATPPS-1101 対応　A.Miyakawa
				// 受付メッセージ情報設定
				linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
						linkRequestInfoResult.getTe79EntityMode().getTe79001(),
						linkRequestInfoResult.getTe79EntityMode().getTe79002(),
						linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
						cmnServiceImpl));
				// 連絡事項設定
				linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
				// Change End CATPPS-1101 対応　A.Miyakawa
				// Change Start CATPPS-1364 対応 A.Miyakawa
				linkRequestInfoResult.setReceivingStep(cmnServiceImpl.getReceivingStep());
				// Change End CATPPS-1364 対応 A.Miyakawa
			// Change Start CATPPS-944 対応　T.Funao
			} else if ("05".equals(cmnServiceImpl.getReceivingStep())){
				if(IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
					|| IF_F10620.equals(serviceId) || IF_10720.equals(serviceId)
					|| IF_K10720.equals(serviceId) || IF_F10720.equals(serviceId)){
					linkRequestInfoResult.setReceivingStep(cmnServiceImpl.getReceivingStep());
				}
			// Change End CATPPS-944 対応　T.Funao
				// Add start CATPPS-1236 対応　I.Kudou
				// 受付メッセージ情報設定
				linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
						linkRequestInfoResult.getTe79EntityMode().getTe79001(),
						linkRequestInfoResult.getTe79EntityMode().getTe79002(),
						linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
						cmnServiceImpl));
				// 連絡事項設定
				linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
				// Add end CATPPS-1236 対応　I.Kudou
			}
			
			// 連携要求情報.使用量情報照会情報
			linkRequestInfoResult.setUsedAmountInfoInquiryInfo(paramList);
			
			// 連携要求情報.スイッチング連携結果情報
			linkRequestInfoResult.setTe7jEntityModelList(te7jEntityModelList);

		}

		// Add start 20160216 A.Takemi [CATPPS-979]
		/* 事業者一覧取得サービスの場合、レスポンス情報の事業者一覧（CSVファイル）をサーバに保存する。 */
		// 連携要求情報.サービスIDが事業者一覧取得サービスIDの場合、以下の処理を行う。
		if (Const.SERVICE_ID_SV_CLASSIFICATION_COMPANIES_LIST_REQUEST.equals(linkRequestInfoResult.getServiceId())) {
			SwitchingServiceBizJugyoshaIchiranYokyuSubLocigImpl swService = (SwitchingServiceBizJugyoshaIchiranYokyuSubLocigImpl)cmnServiceImpl;
			swService.setTpe7EntityDao(getTpe7EntityDao());
			linkRequestInfoResult = swService.linkRequestResultProc(catyPrincipal, linkRequestInfoResult);
		}
		// Add end 20160216 A.Takemi [CATPPS-979]

		return true;
	}

	/**
	 * スイッチング連携管理情報を更新します。
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携管理情報
	 * @param seq
	 *            連携番号連番
	 * @return 保存したTe79EntityModel
	 */
	private Te79EntityModel insertSwitchingFederationManagement(CatyPrincipal principal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, BigDecimal seq) {

		Te79EntityModel model = new Te79EntityModel();

		// 局コード
		model.setTe79001(stationCd);
		// 連携番号はBASEで設定されている。

		// 連携番号連番
		model.setTe79003(seq);

		// 連携要求日時
		model.setTe79101(new Timestamp(System.currentTimeMillis()));
		
		// 処理状況
		model.setTe79102(linkRequestInfoResult.getProcessingStatus());
		// サービスID
		model.setTe79103(linkRequestInfoResult.getServiceId());
		// 顧客コード
		model.setTe79104(linkRequestInfoResult.getCustomerCd());
		// 連番
		model.setTe79105(linkRequestInfoResult.getSerialNumber());
		// 連携日時
		model.setTe79201(linkRequestInfoResult.getCooperationDate());
		// 通信結果
		model.setTe79202(this.acquiredDataChk(linkRequestInfoResult
				.getCommunicationResult()));
		// 通信ステータス
		model.setTe79203(linkRequestInfoResult.getCommunicationStatus());
		// サービス結果
		model.setTe79301(this.acquiredDataChk(linkRequestInfoResult
				.getServiceResult()));
		// サービスエラー理由
		model.setTe79302(linkRequestInfoResult.getServiceErrorReason());
		// 連携結果
		model.setTe79401(linkRequestInfoResult.getCooperationResult());
		// 連携エラー理由
		model.setTe79402(linkRequestInfoResult.getCooperationErrorReason());
		// 申込番号
		model.setTe79501(linkRequestInfoResult.getAppNo());
		// 廃止取次番号
		model.setTe79601(linkRequestInfoResult.getAbolitionAgencyNo());
		// 更新App
		model.setUpdateApp("SXA0023");

		// 登録処理を実行
		return this.getTe79EntityDao().save(principal, model);
	}

	/**
	 * スイッチング連携管理処理状況を更新する
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param procStatus
	 *            処理状況
	 * @param te79Entity
	 *            スイッチング連携管理情報
	 * @throws EntityNotFoundException
	 */
	private void updateForProcStateOfSwitchingCoopMngInfo(
			CatyPrincipal principal, BigDecimal procStatus, String renrakuMsg,
			Te79EntityModel te79Entity) throws EntityNotFoundException {

		Te79EntityModel model = null;

		model = this.getTe79EntityDao().findByPrimaryKeyForUpdate(principal,
				te79Entity.getTe79001(), te79Entity.getTe79002(),
				te79Entity.getTe79003());

		// 処理状況を設定
		model.setTe79102(procStatus);
		// ご連絡事項を設定
		if (!StringUtils.isEmpty(renrakuMsg)) {
			model.setTe79701(renrakuMsg);
		}
		// 更新App
		model.setUpdateApp("SXA0023");
		// 保存フラグ
		model.setPersist(true);

		// 更新処理を実行
		this.getTe79EntityDao().update(principal, model);

	}

	/**
	 * 廃止取次結果を登録する
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 * @param seqNo
	 *            連番
	 * @param model
	 *            廃止取次結果照会情報
	 */
	private void insertAbolitionAgencyResults(CatyPrincipal principal,
			String stationCd, Te79EntityModel te79Entity,
			AbolitionAgencyResultsQueryModel model) {

		/** 登録情報の作成 */

		Te77EntityModel te77Entity = new Te77EntityModel();

		// 局コード
		te77Entity.setTe77001(stationCd);
		// 顧客コード
		te77Entity.setTe77002(te79Entity.getTe79104());
		// 連番
		te77Entity.setTe77003(te79Entity.getTe79105());
		// 廃止取次結果連番
		// シーケンスで割り振る
		// 廃止取次番号
		te77Entity.setTe77101(model.getAbolitionAgencyNumber());
		// ステータス
		te77Entity.setTe77102(model.getStatus());
		// ステータス名称
		te77Entity.setTe77103(model.getStatusName());
		// スイッチング廃止取次判断NG理由
		te77Entity.setTe77104(model
				.getSwitchingAbolitionAgencyDecisionNGReason());
		// スイッチング廃止取次判断NG理由名称
		te77Entity.setTe77105(model
				.getSwitchingAbolitionAgencyDecisionNGReasonName());
		// 地点特定番号
		te77Entity.setTe77106(model.getSupplyPointSpecificNumber());
		// 契約番号
		te77Entity.setTe77107(model.getContractNumber());
		// 住所
		te77Entity.setTe77108(model.getAddress());
		// 建物名
		te77Entity.setTe77109(model.getBuildingName());
		// 氏名カナ
		te77Entity.setTe77110(model.getDemandsNameKana());
		// 氏名
		te77Entity.setTe77111(model.getDemandsName());
		// 廃止年月日
		te77Entity.setTe77112(model.getAbolitionDate());
		// 新小売事業者コード
		te77Entity.setTe77113(model.getNewRetailBusinessCd());
		// 新小売事業者名
		te77Entity.setTe77114(model.getNewRetailBusinessName());
		// 新小売事業者担当者名
		te77Entity.setTe77115(model.getNewRetailContactName());
		// 新小売事業者担当者電話番号(市外局番)
		te77Entity.setTe77116(model.getNewRetailAreaCode());
		// 新小売事業者担当者電話番号(市内局番)
		te77Entity.setTe77117(model.getNewRetailCityCode());
		// 新小売事業者担当者電話番号(加入者番号)
		te77Entity.setTe77118(model.getNewRetailSubscriberNumber());
		// 現小売担当者名
		te77Entity.setTe77119(model.getRetailContactName());
		// 現小売担当者電話番号(市外局番)
		te77Entity.setTe77120(model.getRetailAreaCode());
		// 現小売担当者電話番号(市内局番)
		te77Entity.setTe77121(model.getRetailCityCode());
		// 現小売担当者電話番号(加入者番号)
		te77Entity.setTe77122(model.getRetailSubscriberNumber());
		// 廃止取次登録日
		te77Entity.setTe77123(model.getRegistDate());
		// 最終更新日
		te77Entity.setTe77124(model.getLastUpdated());
		// 更新App
		te77Entity.setUpdateApp("SXA0023");

		// 登録処理を実行
		this.getTe77EntityDao().save(principal, te77Entity);
	}

	// Change start 20160228 A.Takemi [CATPPS-1252]
	/**
	 * <b>UI設計（出力編集仕様)_No.16 TE76スイッチング廃止取次</b></br>
	 * 廃止取次を格納する 
	 * @param principal プリンシパル
	 * @param stationCd 局コード
	 * @param errResult エラーチェック情報
	 * @param model 廃止取次情報
	 * @throws EntityNotFoundException 
	 */
	private void insertAbolitionAgencyQuery(CatyPrincipal principal, String stationCd, GetErrorCheckInfoResult errResult, AbolitionAgencyQueryModel model) throws EntityNotFoundException {
		
		// Change Start 20160320 A.Miyakawa CATPPS-1473
		deleteAbolitionAgencyQuery(principal, stationCd, model);
		// Change End 20160320 A.Miyakawa CATPPS-1473
		
		Te76EntityModel te76Entity = new Te76EntityModel();
		te76Entity.setTe76001(stationCd);												// 局コード
		te76Entity.setTe76101(errResult != null ? errResult.getCustomerCd() : null);	// 顧客コード
		te76Entity.setTe76102(errResult != null ? errResult.getSeqNo() : null);			// 連番
		te76Entity.setTe76201(model.getAbolitionAgencyNumber());						// 廃止取次番号
		te76Entity.setTe76202(model.getStatus());										// ステータス
		te76Entity.setTe76203(model.getStatusName());									// ステータス名称
		te76Entity.setTe76204(model.getSwitchingAbolitionAgencyDecisionNGReason());		// スイッチング廃止取次判断NG理由
		te76Entity.setTe76205(model.getSwitchingAbolitionAgencyDecisionNGReasonName());	// スイッチング廃止取次判断NG理由名称
		te76Entity.setTe76206(model.getSupplyPointSpecificNumber());					// 地点特定番号
		te76Entity.setTe76207(model.getContractNumber());								// 契約番号
		te76Entity.setTe76208(model.getAddress());										// 住所
		te76Entity.setTe76209(model.getBuildingName());									// 建物名
		te76Entity.setTe76210(model.getDemandsNameKana());								// 氏名カナ
		te76Entity.setTe76211(model.getDemandsName());									// 氏名
		te76Entity.setTe76212(model.getAbolitionDate());								// 廃止年月日
		te76Entity.setTe76213(model.getNewRetailBusinessCd());							// 新小売事業者コード
		te76Entity.setTe76214(model.getNewRetailBusinessName());						// 新小売事業者名
		te76Entity.setTe76215(model.getNewRetailContactName());							// 新小売事業者担当者名
		te76Entity.setTe76216(model.getNewRetailAreaCode());							// 新小売事業者担当者電話番号(市外局番)
		te76Entity.setTe76217(model.getNewRetailCityCode());							// 新小売事業者担当者電話番号(市内局番)
		te76Entity.setTe76218(model.getNewRetailSubscriberNumber());					// 新小売事業者担当者電話番号(加入者番号)
		te76Entity.setTe76219(model.getRetailContactName());							// 現小売担当者名
		te76Entity.setTe76220(model.getRetailAreaCode());								// 現小売担当者電話番号(市外局番)
		te76Entity.setTe76221(model.getRetailCityCode());								// 現小売担当者電話番号(市内局番)
		te76Entity.setTe76222(model.getRetailSubscriberNumber());						// 現小売担当者電話番号(加入者番号)
		te76Entity.setTe76223(model.getRegistDate());									// 廃止取次登録日
		te76Entity.setTe76224(model.getLastUpdated());									// 最終更新日
		te76Entity.setUpdateApp("SXA0023");												// 更新App
		getTe76EntityDao().save(principal, te76Entity);
	}
	// Change end 20160228 A.Takemi [CATPPS-1252]
	
	// Change Start 20160320 A.Miyakawa CATPPS-1473
	/**
	 * 廃止取次情報を削除する
	 * @param principal
	 * @param stationCd
	 * @param model
	 * @throws EntityNotFoundException 
	 */
	private void deleteAbolitionAgencyQuery(CatyPrincipal principal,
			String stationCd, AbolitionAgencyQueryModel model) throws EntityNotFoundException {
		
		// 同じ廃止取次番号が存在する場合削除する
		if (!StringUtils.isEmpty(model.getAbolitionAgencyNumber())) {
			// 廃止取次番号でTE76を検索
			List<Te76EntityModel> te76EntityModels = getTe76EntityDao().findByAbolitionAgencyNoForAbolitionAgencyMultiInfo(stationCd, model.getAbolitionAgencyNumber());
			if ( te76EntityModels != null)
				if ( !te76EntityModels.isEmpty()) {
					for (Te76EntityModel te76EntityModel:te76EntityModels) {
						// ロック
						Te76EntityModel updateModel = getTe76EntityDao().findByPrimaryKeyForUpdate(principal, te76EntityModel.getTe76001(), te76EntityModel.getTe76002());
						// 削除
						getTe76EntityDao().delete(principal, updateModel);
					}
				}
		}
	}
	// Change Start 20160320 A.Miyakawa CATPPS-1473

	/**
	 * 供給地点使用量情報を登録または更新します。
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param customerCd
	 *            顧客コード
	 * @param serialNumber
	 *            連番
	 * @param cmbService
	 *            対象サービスクラス
	 */
	@SuppressWarnings("rawtypes")
	private void registUsageInformationQuery(CatyPrincipal principal,
			String stationCd, String customerCd, BigDecimal serialNumber,
			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmbService) {

		Te7hEntityModel te7hEntity = null;

		try {
			// 対象レコードをロック
			te7hEntity = this.getTe7hEntityDao().findByPrimaryKeyForUpdate(
					principal, stationCd, customerCd, serialNumber);
		} catch (EntityNotFoundException e) {
			// 処理なし
		}

		if (te7hEntity != null) {

			// レスポンス情報を設定
			cmbService.settingUpdUsageInfoQuery(te7hEntity);

			// 更新処理を実行
			this.getTe7hEntityDao().update(principal, te7hEntity);

		} else {

			// レスポンス情報を設定
			te7hEntity = cmbService.settingInsUsageInfoQuery(stationCd,
					customerCd, serialNumber);

			// 登録処理を実行
			this.getTe7hEntityDao().save(principal, te7hEntity);

		}
	}

	/**
	 * 設備情報_定額電灯情報を登録する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param te7gEntityList
	 *            設備情報_定額電灯情報リスト
	 */
	private void insertStraightLineElectricLightInformation(
			CatyPrincipal catyPrincipal, List<Te7gEntityModel> te7gEntityList) {

		for (Te7gEntityModel model : te7gEntityList) {
			// 登録処理を実行
			this.getTe7gEntityDao().save(catyPrincipal, model);
		}
	}

	/**
	 * 設備情報_定額電灯情報を削除する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param te7gEntityList
	 *            設備情報_定額電灯情報リスト
	 * @throws EntityNotFoundException
	 */
	private void deleteStraightLineElectricLightInformation(
			CatyPrincipal catyPrincipal, List<Te7gEntityModel> te7gEntityList)
			throws EntityNotFoundException {

		Te7gEntityModel lockEntity = null;

		for (Te7gEntityModel model : te7gEntityList) {

			// 対象レコードをロック
			lockEntity = this.getTe7gEntityDao().findByPrimaryKeyForUpdate(
					catyPrincipal, model.getTe7g001(), model.getTe7g002(),
					model.getTe7g003());

			// 削除処理を実行
			this.getTe7gEntityDao().delete(catyPrincipal, lockEntity);
		}
	}

	/**
	 * 設備情報_計器情報を削除する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param te7fEntityList
	 *            設備情報_計器情報リスト
	 * @throws EntityNotFoundException
	 */
	private void deleteInstrumentInformation(CatyPrincipal catyPrincipal,
			List<Te7fEntityModel> te7fEntityList)
			throws EntityNotFoundException {

		Te7fEntityModel lockEntity = null;

		for (Te7fEntityModel model : te7fEntityList) {

			// 対象レコードをロック
			lockEntity = this.getTe7fEntityDao().findByPrimaryKeyForUpdate(
					catyPrincipal, model.getTe7f001(), model.getTe7f002(),
					model.getTe7f003());

			// 削除処理を実行
			this.getTe7fEntityDao().delete(catyPrincipal, lockEntity);
		}
	}

	/**
	 * 設備情報_計器情報を登録します。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param te7fEntityList
	 *            設備情報_計器情報リスト
	 */
	private void insertInstrumentInformation(CatyPrincipal catyPrincipal,
			List<Te7fEntityModel> te7fEntityList) {

		for (Te7fEntityModel model : te7fEntityList) {
			// 登録処理を実行
			this.getTe7fEntityDao().save(catyPrincipal, model);
		}
	}

	/**
	 * 設備情報_異動申込受付情報を登録します。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param te7eEntityList
	 *            設備情報_異動申込受付情報リスト
	 */
	private void insertChangesApplicationAcceptanceInfo(
			CatyPrincipal catyPrincipal, List<Te7eEntityModel> te7eEntityList) {

		for (Te7eEntityModel mdoel : te7eEntityList) {

			// 登録処理を実行
			this.getTe7eEntityDao().save(catyPrincipal, mdoel);

		}
	}

	/**
	 * 設備情報_異動申込受付情報を削除します。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param te7eEntityList
	 *            設備情報_異動申込受付情報リスト
	 * @throws EntityNotFoundException
	 */
	private void deleteChangesApplicationAcceptanceInfo(
			CatyPrincipal catyPrincipal, List<Te7eEntityModel> te7eEntityList)
			throws EntityNotFoundException {

		Te7eEntityModel lockEntity = null;

		for (Te7eEntityModel mdoel : te7eEntityList) {

			// 対象レコードをロック
			lockEntity = this.getTe7eEntityDao().findByPrimaryKeyForUpdate(
					catyPrincipal, mdoel.getTe7e001(), mdoel.getTe7e002(),
					mdoel.getTe7e003());

			// 削除処理を実行
			this.getTe7eEntityDao().delete(catyPrincipal, lockEntity);

		}
	}

	/**
	 * 設備情報を削除します。
	 * 
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @param cmnServiceImpl
	 */
	@SuppressWarnings("rawtypes")
	private void deleteEquipmentInfo(CatyPrincipal catyPrincipal,
			String stationCd, BigDecimal renkeiNum,
			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl) {

		try {

			// 対象レコードをロック
			Te7dEntityModel te7dEntity = this.te7dEntityDao.findByPrimaryKey(
					catyPrincipal, stationCd, renkeiNum);

			// 削除処理を実行
			this.te7dEntityDao.delete(catyPrincipal, te7dEntity);

		} catch (EntityNotFoundException e) {

			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/**
	 * 設備情報を登録します。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param customerCd
	 *            顧客コード
	 * @param serialNumber
	 *            連番
	 * @param renkeiNum
	 *            連携番号
	 * @param cmnServiceImpl
	 *            対象サービス
	 */
	@SuppressWarnings("rawtypes")
	private void insertEquipmentInfo(CatyPrincipal catyPrincipal,
			String stationCd, String customerCd, BigDecimal serialNumber,
			BigDecimal renkeiNum,
			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl) {

		// 設備情報を設定
		Te7dEntityModel te7dEntity = cmnServiceImpl
				.settingInsEquipmentInformation(stationCd, customerCd,
						serialNumber, renkeiNum);

		// 登録処理を実行
		this.te7dEntityDao.save(catyPrincipal, te7dEntity);

	}

	/**
	 * スイッチング連携管理申込処理状態更新処理
	 * 
	 * @param stationCd
	 * @param appNo
	 * @param procStatus
	 */
	private void updateTE79(CatyPrincipal catyPrincipal, String stationCd,
			String appNo, BigDecimal procStatus, String renrakuMsg) {

		// 申込番号を基にスイッチング連携管理情報を取得
		List<Te79EntityModel> te79EntityModelList = this.getTe79EntityDao()
				.findByRenkeiRequestInfoForAppNo(stationCd, appNo);

		try {

			Te79EntityModel updateModel = null;

			for (Te79EntityModel model : te79EntityModelList) {

				// PrimaryKeyによる行ロック
				updateModel = this.getTe79EntityDao()
						.findByPrimaryKeyForUpdate(catyPrincipal,
								model.getTe79001(), model.getTe79002(),
								model.getTe79003());

				// 処理状況を設定
				if (procStatus != null)
					updateModel.setTe79102(procStatus);
				// ご連絡事項を設定
				if (!StringUtils.isEmpty(renrakuMsg)) {
					updateModel.setTe79701(renrakuMsg);
				}
				// バッチIDを設定
				updateModel.setUpdateApp("SAX0023");
				// DB保存フラグを設定
				updateModel.setPersist(true);

				// Update実行
				this.getTe79EntityDao().update(catyPrincipal, updateModel);
			}

		} catch (EntityNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	/**
	 * 連携実行完了処理
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 * @param errorFlg
	 *            エラー判定フラグ
	 */
	private void completeCooperationExecute(CatyPrincipal principal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, Boolean errorFlg) {

		String serviceId = linkRequestInfoResult.getServiceId();

		if (IS_20210.equals(serviceId) || IS_20310.equals(serviceId)
				|| IS_K20210.equals(serviceId) || IS_K20310.equals(serviceId)
				|| IS_F20210.equals(serviceId) || IS_F20310.equals(serviceId)) {

			/**
			 * IS_20210(スイッチング廃止取次結果照会(低圧)) IS_20310(スイッチング廃止取次照会(低圧))
			 * IS_K20210(スイッチング廃止取次結果照会(高圧(500kw未満)))
			 * IS_K20310(スイッチング廃止取次照会(高圧(500kw未満)))
			 * IS_F20210(スイッチング廃止取次結果照会(低圧FIT電源))
			 * IS_F20310(スイッチング廃止取次照会(低圧FIT電源))
			 */
			
			List<Te79EntityModel> insertedTE79EntityModels = new ArrayList<Te79EntityModel>();	// 登録済み連携要求情報
			
			if (!errorFlg && linkRequestInfoResult.getLinkReqForIs() != null) {
				// エラー以外からの呼出の場合
				BigDecimal seq = BigDecimal.ZERO; 
				
				for (LinkRequestForIs link : linkRequestInfoResult.getLinkReqForIs()) {
					
					seq.add(BigDecimal.ONE);
					
					LinkRequestInfoResult editLink = new LinkRequestInfoResult();
					editLink = linkRequestInfoResult;
					editLink.setCustomerCd(link.getCustomerCd());
					editLink.setSerialNumber(link.getSerialNumber());
					editLink.setAbolitionAgencyNo(link.getAbolitionAgencyNo());
					editLink.setProcessingStatus(link.getProcessingStatus());
					
					// 連携要求情報を登録
					insertedTE79EntityModels.add(this.insertSwitchingFederationManagement(principal, stationCd, editLink, seq));
				}
				
			} else {
				// エラーの遷移からの呼出の場合
				insertedTE79EntityModels.add(this.insertSwitchingFederationManagement(principal, stationCd, linkRequestInfoResult, BigDecimal.ONE));
			}
			
			// 連携要求情報.受付メッセージ情報(TE7BEntityModelList)の数だけ受付メッセージ情報を格納する(TE7BEntityModelListが複数ある)
			insertTE7B(principal, insertedTE79EntityModels, linkRequestInfoResult.getTe7bEntityModelList());
			
		} else if (IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
				|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
				|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
				|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
				|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
				|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
				|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
				|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
				|| IF_F10820.equals(serviceId)) {
			/**
			 * IF_10220(業務処理状況確認(低圧)(使用量情報照会))、 IF_10420(業務処理状況確認(低圧)(再点))、
			 * IF_10520(業務処理状況確認(低圧)(廃止(撤去)))、 IF_10620(業務処理状況確認(低圧)(スイッチング開始))、
			 * IF_10720(業務処理状況確認(低圧)(スイッチング廃止))、
			 * IF_10820(業務処理状況確認(低圧)(需要者情報変更))、 IF_10920(業務処理状況確認(低圧)(アンペア変更))、
			 * IF_K10220(業務処理状況確認(高圧(500kw未満))(使用量情報照会))、
			 * IF_K10520(業務処理状況確認(高圧(500kw未満))(廃止(撤去)))、
			 * IF_K10620(業務処理状況確認(高圧(500kw未満))(スイッチング開始))、
			 * IF_K10720(業務処理状況確認(高圧(500kw未満))(スイッチング廃止))、
			 * IF_K10820(業務処理状況確認(高圧(500kw未満))(需要者情報変更)))、
			 * IF_F10420(業務処理状況確認(低圧FIT電源)(再点))、
			 * IF_F10520(業務処理状況確認(低圧FIT電源)(廃止(撤去))、
			 * IF_F10620(業務処理状況確認(低圧FIT電源)(スイッチング開始)、
			 * IF_F10720(業務処理状況確認(低圧FIT電源)(スイッチング廃止)、
			 * IF_F10820(業務処理状況確認(低圧FIT電源)(需要者情報変更))
			 */
			// Change Start CATPPS-1101 対応　A.Miyakawa
			// 連携要求情報.受付メッセージ情報(TE7BEntityModelList)を格納する(saveOrUpdate)
			if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isUketsukeMsgFlag())
				insertTE7B(principal, linkRequestInfoResult.getTe7bEntityModelList());
			// Change End CATPPS-1101 対応　A.Miyakawa
			return;

		} else {
			/** 上記サービス以外 */

			// 連携要求情報の更新
			this.updateSwitchingFederationManagement(principal, stationCd,
					linkRequestInfoResult);
			
			// 連携要求情報.受付メッセージ情報(TE7BEntityModelList)を格納する(saveOrUpdate)
			insertTE7B(principal, linkRequestInfoResult.getTe7bEntityModelList());
		}
	}
	
	// Change Start CATPPS-1364 A.Miyakawa
//	/**
//	 * 連携実行完了処理
//	 * 
//	 * @param principal
//	 *            プリンシパル
//	 * @param stationCd
//	 *            局コード
//	 * @param linkRequestInfoResult
//	 *            連携要求情報
//	 */
//	private void completeErrorCooperationExecute(CatyPrincipal principal,
//			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {
//
//		String serviceId = linkRequestInfoResult.getServiceId();
//
//		if (IS_20210.equals(serviceId) || IS_20310.equals(serviceId)
//				|| IS_K20210.equals(serviceId) || IS_K20310.equals(serviceId)
//				|| IS_F20210.equals(serviceId) || IS_F20310.equals(serviceId)) {
//
//			/**
//			 * IS_20210(スイッチング廃止取次結果照会(低圧)) IS_20310(スイッチング廃止取次照会(低圧))
//			 * IS_K20210(スイッチング廃止取次結果照会(高圧(500kw未満)))
//			 * IS_K20310(スイッチング廃止取次照会(高圧(500kw未満)))
//			 * IS_F20210(スイッチング廃止取次結果照会(低圧FIT電源))
//			 * IS_F20310(スイッチング廃止取次照会(低圧FIT電源))
//			 */
//
//			if (linkRequestInfoResult.getLinkReqForIs() != null) {
//				// 連携要求情報を登録
//				BigDecimal seq = BigDecimal.ZERO; 
//				
//				for (LinkRequestForIs link : linkRequestInfoResult.getLinkReqForIs()) {
//					
//					seq.add(BigDecimal.ONE);
//					
//					LinkRequestInfoResult editLink = new LinkRequestInfoResult();
//					editLink = linkRequestInfoResult;
//					editLink.setCustomerCd(link.getCustomerCd());
//					editLink.setSerialNumber(link.getSerialNumber());
//					editLink.setAbolitionAgencyNo(link.getAbolitionAgencyNo());
//					editLink.setProcessingStatus(link.getProcessingStatus());
//					
//					// 連携要求情報を登録
//					this.insertSwitchingFederationManagement(principal, stationCd, editLink, seq);
//				}
//			} else {
//				// 連携要求情報を登録
//				this.insertSwitchingFederationManagement(principal, stationCd, linkRequestInfoResult, BigDecimal.ONE);
//			}
//
//		} else if (IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
//				|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
//				|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
//				|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
//				|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
//				|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
//				|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
//				|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
//				|| IF_F10820.equals(serviceId)) {
//			/**
//			 * IF_10220(業務処理状況確認(低圧)(使用量情報照会))、 IF_10420(業務処理状況確認(低圧)(再点))、
//			 * IF_10520(業務処理状況確認(低圧)(廃止(撤去)))、 IF_10620(業務処理状況確認(低圧)(スイッチング開始))、
//			 * IF_10720(業務処理状況確認(低圧)(スイッチング廃止))、
//			 * IF_10820(業務処理状況確認(低圧)(需要者情報変更))、 IF_10920(業務処理状況確認(低圧)(アンペア変更))、
//			 * IF_K10220(業務処理状況確認(高圧(500kw未満))(使用量情報照会))、
//			 * IF_K10520(業務処理状況確認(高圧(500kw未満))(廃止(撤去)))、
//			 * IF_K10620(業務処理状況確認(高圧(500kw未満))(スイッチング開始))、
//			 * IF_K10720(業務処理状況確認(高圧(500kw未満))(スイッチング廃止))、
//			 * IF_K10820(業務処理状況確認(高圧(500kw未満))(需要者情報変更)))、
//			 * IF_F10420(業務処理状況確認(低圧FIT電源)(再点))、
//			 * IF_F10520(業務処理状況確認(低圧FIT電源)(廃止(撤去))、
//			 * IF_F10620(業務処理状況確認(低圧FIT電源)(スイッチング開始)、
//			 * IF_F10720(業務処理状況確認(低圧FIT電源)(スイッチング廃止)、
//			 * IF_F10820(業務処理状況確認(低圧FIT電源)(需要者情報変更))
//			 */
//			// 申込情報から連携番号と連携番号連番を取得
//			linkRequestInfoResult.setRenKeiNum(linkRequestInfoResult.getTe79EntityMode().getTe79002());
//			linkRequestInfoResult.setRenKeiSerialNum(linkRequestInfoResult.getTe79EntityMode().getTe79003());
//			
//			// 連携要求情報の更新
//			this.updateSwitchingFederationManagement(principal, stationCd,
//					linkRequestInfoResult);
//
//		} else {
//			/** 上記サービス以外 */
//
//			// 連携要求情報の更新
//			this.updateSwitchingFederationManagement(principal, stationCd,
//					linkRequestInfoResult);
//		}
//	}
	// Change End CATPPS-1364 A.Miyakawa

	/**
	 * スイッチング連携管理情報を更新する
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 */
	private void updateSwitchingFederationManagement(CatyPrincipal principal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {

		try {
			// Change Start CATPPS-1364 A.Miyakawa
			Te79EntityModel updateModel = this.getTe79EntityDao()
					.findByPrimaryKeyForUpdate(principal, stationCd,
							linkRequestInfoResult.getRenKeiNum(),
							linkRequestInfoResult.getRenKeiSerialNum());
			// Change End CATPPS-1364 A.Miyakawa
			
			// 処理状況
			updateModel.setTe79102(linkRequestInfoResult.getProcessingStatus());
			// 連携日時
			updateModel.setTe79201(linkRequestInfoResult.getCooperationDate());

			// 通信結果
			if (linkRequestInfoResult.getCommunicationResult() != null) {

				updateModel.setTe79202(this.acquiredDataChk(linkRequestInfoResult
						.getCommunicationResult()));

			}
			// 通信ステータス
			updateModel.setTe79203(linkRequestInfoResult
					.getCommunicationStatus());
			
			// サービス結果
			if (linkRequestInfoResult.getServiceResult() != null) {
				updateModel.setTe79301(this.acquiredDataChk(linkRequestInfoResult
						.getServiceResult()));
			}

			// サービスエラー理由
			updateModel.setTe79302(linkRequestInfoResult
					.getServiceErrorReason());
			// 連携結果
			updateModel
					.setTe79401(linkRequestInfoResult.getCooperationResult());
			// 連携エラー理由
			updateModel.setTe79402(linkRequestInfoResult
					.getCooperationErrorReason());
			// 申込番号
			updateModel.setTe79501(linkRequestInfoResult.getAppNo());
			// 廃止取次番号
			updateModel
					.setTe79601(linkRequestInfoResult.getAbolitionAgencyNo());
			// ご連絡事項
			if (linkRequestInfoResult.getContactMatter() != null) {
				updateModel
						.setTe79701(linkRequestInfoResult.getContactMatter());
			}
			
			// 更新App
			updateModel.setUpdateApp("SXA0023");

			// Update実行
			// Change Start CATPPS-1364 A.Miyakawa
			this.getTe79EntityDao().update(principal, updateModel);
			// this.getContractService().updateTe79(principal, stationCd, updateModel);
			// Change Start CATPPS-1364 A.Miyakawa
		} catch (EntityNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	/**
	 * 連携ステータス更新処理
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 * @param errorFlg
	 *            エラー判定フラグ
	 */
	private void updateCooperationStatus(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, Boolean errorFlg) {
		// サービスID取得
		String serviceId = linkRequestInfoResult.getServiceId();
		
		if ((IS_20210.equals(serviceId) || IS_20310.equals(serviceId)
				|| IS_K20210.equals(serviceId) || IS_K20310.equals(serviceId)
				|| IS_F20210.equals(serviceId) || IS_F20310.equals(serviceId))
				&& !errorFlg && linkRequestInfoResult.getLinkReqForIs() != null) {
			// IS_××××用
			this.updateStatusMulti(catyPrincipal, stationCd, linkRequestInfoResult);
			
		} else {
			// その他IF用
			this.updateStatusSingle(catyPrincipal, stationCd, linkRequestInfoResult);
		}
		
	}
	

	/**
	 * 連携ステータス更新処理(単一更新用)
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 */
	private void updateStatusSingle(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {
		
		// Change Start CATPPS-1364 A.Miyakawa
//		// 連携成否ステータス
//		boolean cooperationSuccess = false;
//		
//		// Change Start CATPPS-944 対応　T.Funao
//		//サービスID
//		String serviceId = linkRequestInfoResult.getServiceId();
//		// Change End CATPPS-944 対応　T.Funao
//		// 連携成否を取得する
//		if (linkRequestInfoResult.getCommunicationResult() == new Integer(1)) {
//
//			// 連携要求情報.通信結果が「1」の場合、連携成否を「異常」に設定
//			cooperationSuccess = false;
//		} else if (linkRequestInfoResult.getServiceResult() == new Integer(1)) {
//
//			// 連携要求情報.サービス結果が「1」の場合、連携成否を「異常」に設定
//			cooperationSuccess = false;
//		} else if ("1".equals(linkRequestInfoResult.getCooperationResult())) {
//
//			// 連携要求情報.連携結果が「1」の場合、連携成否を「異常」に設定
//			cooperationSuccess = false;
//		} else if (new BigDecimal(3).compareTo(linkRequestInfoResult
//				.getProcessingStatus()) == 0) {
//
//			// 連携要求情報.処理状況が「3」の場合、連携成否を「異常」に設定
//			cooperationSuccess = false;
//		} else {
//
//			// 上記条件以外の場合、連携成否を「正常」に設定
//			cooperationSuccess = true;
//		}
//		
//		// Add Start 20160222 CATPPS-944 対応　T.Funao
//		//マッチング完了時は連携成否を正常に設定
//		if("05".equals(linkRequestInfoResult.getReceivingStep())){
//			if(IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
//				|| IF_F10620.equals(serviceId) || IF_10720.equals(serviceId)
//				|| IF_K10720.equals(serviceId) || IF_F10720.equals(serviceId)){
//				cooperationSuccess = true;
//			}
//		}
		// Add End 20160222 CATPPS-944 対応　T.Funao
		// Change Start 20160217 CATPPS-1101 対応　A.Miyakawa
		// ご連絡事項(表示用)を設定する
		StringBuffer sb = new StringBuffer();
		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isRenrakuDispFlag()) {
			// 連携要求情報.受付メッセージ情報が存在する場合
			if (linkRequestInfoResult.getTe7bEntityModelList() != null) {
				if (!linkRequestInfoResult.getTe7bEntityModelList().isEmpty()) {
					sb.append("<受付メッセージ>");
					sb.append(CRLF);
					for (Te7bEntityModel model:linkRequestInfoResult.getTe7bEntityModelList()) {
						sb.append(model.getTe7b102());
						sb.append(CRLF);
					}
				}
			}
			
			// 連携要求情報.ご連絡事項が存在する場合
			if (!StringUtils.isEmpty(linkRequestInfoResult.getContactMatter())) {
				sb.append("<ご連絡事項>");
				sb.append(CRLF);
				sb.append(linkRequestInfoResult.getContactMatter());
				sb.append(CRLF);
			}
		}
			// Change End CATPPS-1364 A.Miyakawa
			// 連携要求情報.スイッチング廃止取次判断ＮＧ理由が存在する場合はないので処理なし
		
		linkRequestInfoResult.setDispContactMatter(getUpSubstringValue( sb.toString(), 4000));
		// Change End 20160217 CATPPS-1101 対応　A.Miyakawa
		
		// 連携ステータス情報を設定
		// Change Start CATPPS-1364 A.Miyakawa
		if (!StringUtils.isEmpty(linkRequestInfoResult.getCustomerCd()) && linkRequestInfoResult.getSerialNumber() != null) {
			this.setCooperationStatusCd(catyPrincipal, stationCd,
					linkRequestInfoResult, linkRequestInfoResult.getServiceId());
		}
		// Change End CATPPS-1364 A.Miyakawa
	}
	
	// Change Start 20160217 CATPPS-1101 対応　A.Miyakawa
	/**
	 * パラメータの最大文字数分、前方から切り取った文字列を返却する。<br>
	 * 文字列が最大文字数に達していない場合は、何もせずに返却する。
	 * 
	 * @param value 文字列
	 * @param max 最大文字数
	 * @return 文字列
	 */
	protected String getUpSubstringValue(String value, int max){
		
		if (StringUtils.isEmpty(value)) {
			return value;
		}
		
		try {
			value = substringByShiftJISBytesCount(value, max);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
		
		while (value.length() > 0) {
			String lastStr = value.substring(value.length()-1, value.length());
			if ( "\\".equals(lastStr) || "n".equals(lastStr) || "r".equals(lastStr) ) {
				value = value.substring(0, value.length()-1);
			} else {
				break ;
			}
		}
		
		return value;
	}
	
	/**
	 * SHIFT-JIS換算のバイト数で文字を切り出す
	 * 
	 * @param source 対象の文字列
	 * @param bytesCount 切り出すバイト数
	 * @return 指定のバイトで切り出した文字列
	 * @throws UnsupportedEncodingException
	 */
	private String substringByShiftJISBytesCount(String source, int bytesCount)
		    throws UnsupportedEncodingException {
		  if (source == null) return source;
		  byte[] bytes = source.getBytes("MS932");
		  if (bytes.length < bytesCount) return source;
		  String result = new String(bytes, 0, bytesCount, "MS932");
		  String last = result.substring(result.length() -1);
		  String lazt = new String(last.getBytes("MS932"), "MS932");
		  if (!last.equals(lazt)) {
		    result  = result.substring(0, result.length()-1);
		  }
		  return result;
	}
	// Change End 20160217 CATPPS-1101 対応　A.Miyakawa
	
	/**
	 * 連携ステータス更新処理(IS_××××用)
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 */
	private void updateStatusMulti(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {
		// Change Start 20160217 CATPPS-1101 対応　A.Miyakawa
		List<LinkRequestForIs> LinkRequestForIsResultList = new ArrayList<LinkRequestForIs>();
		// Change End 20160217 CATPPS-1101 対応　A.Miyakawa
		
		for (LinkRequestForIs link : linkRequestInfoResult.getLinkReqForIs()) {
			// Change Start CATPPS-1364 A.Miyakawa
//			// 連携成否ステータス
//			boolean cooperationSuccess = false;
//	
//			// 連携成否を取得する
//			if (linkRequestInfoResult.getCommunicationResult() == new Integer(1)) {
//	
//				// 連携要求情報.通信結果が「1」の場合、連携成否を「異常」に設定
//				cooperationSuccess = false;
//			} else if (linkRequestInfoResult.getServiceResult() == new Integer(1)) {
//	
//				// 連携要求情報.サービス結果が「1」の場合、連携成否を「異常」に設定
//				cooperationSuccess = false;
//			} else if ("1".equals(linkRequestInfoResult.getCooperationResult())) {
//	
//				// 連携要求情報.連携結果が「1」の場合、連携成否を「異常」に設定
//				cooperationSuccess = false;
//			} else if (new BigDecimal(3).compareTo(link.getProcessingStatus()) == 0) {
//	
//				// 連携要求情報.処理状況が「3」の場合、連携成否を「異常」に設定
//				cooperationSuccess = false;
//			} else {
//	
//				// 上記条件以外の場合、連携成否を「正常」に設定
//				cooperationSuccess = true;
//			}
			
			// Change Start 20160217 CATPPS-1101 対応　A.Miyakawa
			// ご連絡事項(表示用)を設定する
			StringBuffer sb = new StringBuffer();
			if (link.getSwitchingUpdateAndAlartStatus().isRenrakuDispFlag()) {
				// 連携要求情報.受付メッセージ情報が存在する場合
				if (linkRequestInfoResult.getTe7bEntityModelList() != null) {
					if (!linkRequestInfoResult.getTe7bEntityModelList().isEmpty()) {
						sb.append("<受付メッセージ>");
						sb.append(CRLF);
						for (Te7bEntityModel model:linkRequestInfoResult.getTe7bEntityModelList()) {
							sb.append(model.getTe7b102());
							sb.append(CRLF);
						}
					}
				}
				
				// 連携要求情報.ご連絡事項が存在する場合
				if (!StringUtils.isEmpty(linkRequestInfoResult.getContactMatter())) {
					sb.append("<ご連絡事項>");
					sb.append(linkRequestInfoResult.getContactMatter());
					sb.append(CRLF);
				}
				
				// 連携要求情報.スイッチング廃止取次判断ＮＧ理由が存在する場合
				if (!StringUtils.isEmpty(link.getNgReason())) {
					sb.append("<スイッチング廃止取次判断ＮＧ理由>");
					sb.append(CRLF);
					String [] reasons = link.getNgReason().split(",");
					for (String reson:reasons) {
						sb.append(reson);
						sb.append(CRLF);
					}
				}
			}
			// Change End CATPPS-1364 A.Miyakawa
			
			link.setDispContactMatter(getUpSubstringValue( sb.toString(), 4000));
			// Change End 20160217 CATPPS-1101 対応　A.Miyakawa
	
			// 連携ステータス情報を設定
			if (!StringUtils.isEmpty(link.getCustomerCd()) && link.getSerialNumber() != null) {
				LinkRequestInfoResult editLink = new LinkRequestInfoResult();
				editLink.setCustomerCd(link.getCustomerCd());
				editLink.setSerialNumber(link.getSerialNumber());
				// Change Start 20160217 CATPPS-1101 対応　A.Miyakawa
				editLink.setDispContactMatter(link.getDispContactMatter());
				// Change End 20160217 CATPPS-1101 対応　A.Miyakawa
				// Change Start CATPPS-1364 A.Miyakawa
				editLink.setSwitchingUpdateAndAlartStatus(link.getSwitchingUpdateAndAlartStatus());
				this.setCooperationStatusCd(catyPrincipal, stationCd,
						editLink, linkRequestInfoResult.getServiceId());
				// Change End CATPPS-1364 A.Miyakawa
			}
			// Change Start 20160217 CATPPS-1101 対応　A.Miyakawa
			LinkRequestForIsResultList.add(link);
			// Change End 20160217 CATPPS-1101 対応　A.Miyakawa
		}
		// Change Start 20160217 CATPPS-1101 対応　A.Miyakawa
		linkRequestInfoResult.setLinkReqForIs(LinkRequestForIsResultList);
		// Change End 20160217 CATPPS-1101 対応　A.Miyakawa
	}

	/**
	 * スイッチング連携ステータスを更新する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 * @param classificationCd
	 *            分類コード
	 * @param transitionDestStatusCd
	 *            ステータスコード
	 */
	private void updateSwitchingStatus(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult,
			String classificationCd, String transitionDestStatusCd) {

		try {
			Te78EntityModel model = this.getTe78EntityDao()
					.findByPrimaryKeyForUpdate(catyPrincipal, stationCd,
							linkRequestInfoResult.getCustomerCd(),
							linkRequestInfoResult.getSerialNumber(),
							classificationCd);

			// 連携ステータスコード
			// 分類コードとステータスコードを取得できた場合
			// Change Start CATPPS-1364 A.Miyakawa
			if (classificationCd != null
					&& transitionDestStatusCd != null)
				model.setTe78101(transitionDestStatusCd);
			// Change End CATPPS-1364 A.Miyakawa
			
			// Change Start CATPPS-1101 対応　A.Miyakawa
			// 受付メッセージ
			model.setTe78102(linkRequestInfoResult.getDispContactMatter());
			// Change End CATPPS-1101 対応　A.Miyakawa
			
			// 更新App
			model.setUpdateApp("SXA0023");
			
			// 新規作成を実行
			this.getTe78EntityDao().update(catyPrincipal, model);
			
		} catch (EntityNotFoundException e) {
			// 分類コードとステータスコードを取得できた場合
			// Change Start CATPPS-1364 A.Miyakawa
			if (classificationCd != null
					&& transitionDestStatusCd != null) {
				Te78EntityModel model = new Te78EntityModel();
				model.setTe78001(stationCd);
				model.setTe78002(linkRequestInfoResult.getCustomerCd());
				model.setTe78003(linkRequestInfoResult.getSerialNumber());
				model.setTe78004(classificationCd);
				model.setTe78101(transitionDestStatusCd);
				// Change Start CATPPS-1101 対応　A.Miyakawa
				// 受付メッセージ
				model.setTe78102(linkRequestInfoResult.getDispContactMatter());
				// Change End CATPPS-1101 対応　A.Miyakawa
	
				// 新規作成を実行
				this.getTe78EntityDao().save(catyPrincipal, model);
			}
			// Change End CATPPS-1364 A.Miyakawa
		}

	}

	/**
	 * 連携ステータス情報の設定<br>
	 * 連携成否情報とサービスIDを基に分類コードと遷移先ステータスコードを設定する。
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード
	 * @param linkRequestInfoResult
	 *            連携要求情報
	 * @param cooperationSuccess
	 *            連携成否
	 * @param serviceId
	 *            サービスID
	 */
	// Change Start CATPPS-1364 A.Miyakawa
	private void setCooperationStatusCd(CatyPrincipal principal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, String serviceId) {
	// Change End CATPPS-1364 A.Miyakawa
//		String classificationCd = null;
//		String transitionDestStatusCd = null;
		
		// Change Start CATPPS-1364 A.Miyakawa
		// サービスIDを判断し、処理を分岐する
//		if (IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "200";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "220";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "230";
//			}
//
//		} else if (IF_10420.equals(serviceId) || IF_F10420.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "200";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "240";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "230";
//			}
//
//		} else if (IF_10510.equals(serviceId) || IF_K10510.equals(serviceId)
//				|| IF_F10510.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "300";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "320";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "330";
//			}
//
//		} else if (IF_10520.equals(serviceId) || IF_K10520.equals(serviceId)
//				|| IF_F10520.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "300";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "340";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "330";
//			}
//
//		} else if (IS_20110.equals(serviceId) || IS_K20110.equals(serviceId)
//				|| IS_F20110.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "400";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "420";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "430";
//			}
//
//		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId)
//				|| IS_F20210.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "400";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "450";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "430";
//			}
//
//		} else if (IF_10610.equals(serviceId) || IF_K10610.equals(serviceId)
//				|| IF_F10610.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "400";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "460";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "470";
//			}
//
//		} else if (IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
//				|| IF_F10620.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "400";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			// Add Start 20160222 CATPPS-944 対応　T.Funao
//			if("05".equals(linkRequestInfoResult.getReceivingStep()) && cooperationSuccess){
//				/** 正常の場合 */
//				
//				transitionDestStatusCd = "465";
//			// Add End 20160222 CATPPS-944 対応　T.Funao
//			} else if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "480";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "470";
//			}
//
//		} else if (IS_20410.equals(serviceId) || IS_K20410.equals(serviceId)
//				|| IS_F20410.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "500";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "520";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = null;
//			}
//
//		} else if (IF_10710.equals(serviceId) || IF_K10710.equals(serviceId)
//				|| IF_F10710.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "500";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "530";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "540";
//			}
//
//		} else if (IF_10720.equals(serviceId) || IF_K10720.equals(serviceId)
//				|| IF_F10720.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "500";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			// Add Start 20160222 CATPPS-944 対応　T.Funao
//			if("05".equals(linkRequestInfoResult.getReceivingStep()) && cooperationSuccess){
//				/** 正常の場合 */
//				
//				transitionDestStatusCd = "535";
//			// Add End 20160222 CATPPS-944 対応　T.Funao
//			} else if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "550";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "540";
//			}
//
//		} else if (IF_10910.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "600";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "620";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "630";
//			}
//
//		} else if (IF_10920.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "600";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "640";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "630";
//			}
//
//		} else if (IF_10810.equals(serviceId) || IF_K10810.equals(serviceId)
//				|| IF_F10810.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "700";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "720";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "730";
//			}
//
//		} else if (IF_10820.equals(serviceId) || IF_K10820.equals(serviceId)
//				|| IF_F10820.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "700";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "740";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "730";
//			}
//
//		} else if (IF_10210.equals(serviceId) || IF_K10210.equals(serviceId)) {
//			/**
//			 * 使用量情報照会申請(低圧) 使用量情報照会申請(高圧(500kw未満))
//			 */
//
//			// 分類コードを設定
//			classificationCd = "800";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "830";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "840";
//			}
//		} else if (IF_10220.equals(serviceId) || IF_K10220.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "800";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "860";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "840";
//			}
//
//		} else if (IF_10310.equals(serviceId) || IF_K10310.equals(serviceId)) {
//
//			// 分類コードを設定
//			classificationCd = "800";
//
//			// 連携成否を判断し、遷移先ステータスコードを設定する
//			if (cooperationSuccess) {
//				/** 正常の場合 */
//
//				transitionDestStatusCd = "880";
//			} else {
//				/** 異常の場合 */
//
//				transitionDestStatusCd = "840";
//			}
//
//		}

//		// 分類コードとステータスコードを取得できた場合
//		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusKindCode() != null
//				&& linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusCode() != null) {
		String statusKindCode = null;
		String statusCode = null;
		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusKindCode() != null)
			statusKindCode = linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusKindCode().toString();
		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusCode() != null)
			statusCode = linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusCode().toString();
		// スイッチングステータスの更新
		this.updateSwitchingStatus(principal, stationCd, linkRequestInfoResult,
				statusKindCode,
				statusCode);
//		}
		// Change End CATPPS-1364 A.Miyakawa
	}
	
	/**
	 * スイッチング拡張項目リストより指定したキーワードを格納するレコードを返却します。
	 * 
	 * @param entityList
	 *            スイッチング拡張項目リスト
	 * @param keyword
	 *            指定するデータ項目名
	 * @return スイッチング拡張項目情報
	 */
	private Te7aEntityModel getSpecifiedTe7aModel(
			List<Te7aEntityModel> entityList, final String keyword) {

		Te7aEntityModel result = null;

		if (!CollectionUtils.isEmpty(entityList)) {

			for (Te7aEntityModel model : entityList) {

				if (keyword.equals(model.getTe7a005())) {
					result = model;
					break;
				}
			}
		}

		return result;
	}
	
	/**
	 * 電力契約情報を設定する
	 * @param electricResult 契約電力情報
	 * @param contractInfoResult 契約情報
	 */
	private void setEleContractInfo(GetElectricPowerContractInfoResult electricResult, GetSwitchingContractInfoResult contractInfoResult) {
		
		// 局コード
		electricResult.setStationCd(contractInfoResult.getStationCd());
		// 顧客コード
		electricResult.setCustomerCd(contractInfoResult.getCustomerCd());
		// 連番
		electricResult.setSeqNo(contractInfoResult.getSeqNo());
		// 地点特定番号
		electricResult.setPointIdentificationNumber(contractInfoResult.getPointIdentificationNumber());
		// 接続開始予定日
		electricResult.setTransportaionScheduledStartDate(contractInfoResult.getTransportaionScheduledStartDate());
		// 接続廃止予定日
		electricResult.setTransportaionScheduledEndDate(contractInfoResult.getTransportaionScheduledEndDate());
		// 旧小売事業者コード
		electricResult.setOldCompanyCd(contractInfoResult.getOldCompanyCd());
		// 旧小売事業お客様番号
		electricResult.setOldCompanyCustomerCd(contractInfoResult.getOldCompanyCustomerCd());
		// 託送約款規定に基づく遵守承諾
		electricResult.setAgreement(contractInfoResult.getAgreement());
		// 設備情報変更有無区分
		electricResult.setFacilityInfoChangedClass(contractInfoResult.getFacilityInfoChangedClass());
		//  設備撤去日
		electricResult.setFacilityRemovalDate(contractInfoResult.getFacilityRemovalDate());
		// 施工希望時刻
		electricResult.setConstructionScheduledTime(contractInfoResult.getConstructionScheduledTime());
		// 立会可否
		electricResult.setOnSiteWitnessing(contractInfoResult.getOnSiteWitnessing());
		// 立会希望日
		electricResult.setOnSiteWitnessingPreferredDate(contractInfoResult.getOnSiteWitnessingPreferredDate());
		// 立会希望時刻
		electricResult.setOnSiteWitnessingPreferredTime(contractInfoResult.getOnSiteWitnessingPreferredTime());
		// 立会者氏名
		electricResult.setWitness(contractInfoResult.getWitness());
		// 接続送電サービスメニュー
		electricResult.setPowerTransmissionServiceMenu(contractInfoResult.getPowerTransmissionServiceMenu());
		// 契約決定方法
		electricResult.setContractDeterminationMethod(contractInfoResult.getContractDeterminationMethod());
		// 廃止理由
		electricResult.setAbolitionReason(contractInfoResult.getAbolitionReason());
		// 建物解体有無
		electricResult.setBuildingDemolition(contractInfoResult.getBuildingDemolition());
		// 解体予定日
		electricResult.setDemolitionScheduledDate(contractInfoResult.getDemolitionScheduledDate());
		// 解体予定時刻
		electricResult.setDemolitionScheduledTime(contractInfoResult.getDemolitionScheduledTime());
		// 入居予定時刻
		electricResult.setMovingInScheduledTime(contractInfoResult.getMovingInScheduledTime());
		// 契約変更予定年月日
		electricResult.setContractChangeScheduledDate(contractInfoResult.getContractChangeScheduledDate());
		// 契約電流希望
		electricResult.setDesiredContractCurrent(contractInfoResult.getDesiredContractCurrent());
		// 出向前連絡要否
		electricResult.setContactNecessity(contractInfoResult.getContactNecessity());
		// 検針日の選択
		electricResult.setMeterReadingDay(contractInfoResult.getMeterReadingDay());
		// 立会希望時刻（アンペア変更）
		electricResult.setAmpsWitnessingPreferredTime(contractInfoResult.getWitnessDesiredTime());
		
	} 
	
	/**
	 * 対象がNULLまたは、空白の場合、NULLを返却する。
	 * それ以外の場合、BigDecimalに変換し値を返却する。
	 * @param target 対象
	 * @return 対象値
     */
	private BigDecimal acquiredDataChk(Integer target) {
    	
    	if (target == null) {
    		return null;
    	} else {
    		return new BigDecimal(target);
    	}
    }
	
	/**
	 * スイッチング連携受付メッセージ作成(廃止取次)
	 * @param principal プリンシパル
	 * @param insertedTE79EntityModels UI設計（出力編集仕様) No.19で設定した連携管理情報
	 * @param models 受付メッセージ情報
	 */
	private void insertTE7B(CatyPrincipal principal, List<Te79EntityModel> insertedTE79EntityModels, List<Te7bEntityModel> models) {
		for (Te79EntityModel te79Model : insertedTE79EntityModels) {
			// Change Start CATPPS-1364 対応 A.Miyakawa
			if (models != null) {
				if (!models.isEmpty()) {
					// TE7Bのデータを削除する
					// 一件目を取得
					Te7bEntityModel entity = models.get(0);
					deleteTe7bModels(principal, entity.getTe7b001(), te79Model.getTe79002(), te79Model.getTe79003());
				}
			}
			// Change End CATPPS-1364 対応 A.Miyakawa
			for (Te7bEntityModel model : models) {
				model.setTe7b002(te79Model.getTe79002());	// UI設計（出力編集仕様) No.19で設定した連携番号
				model.setTe7b003(te79Model.getTe79003());	// UI設計（出力編集仕様) No.19で設定した連携番号連番
				// Change Start CATPPS-1101 対応　A.Miyakawa
				try {
					Te7bEntityModel entity = getTe7bEntityDao().findByPrimaryKeyForUpdate(principal, model.getTe7b001(), model.getTe7b002(), model.getTe7b003(), model.getTe7b004());
					entity.setTe7b101(model.getTe7b101());
					entity.setTe7b102(model.getTe7b102());
					getTe7bEntityDao().update(principal, entity);
				} catch (EntityNotFoundException e) {
					getTe7bEntityDao().save(principal, model);
				}
				// Change end CATPPS-1101 対応　A.Miyakawa
			}
		}
	}
	
	/**
	 * スイッチング連携受付メッセージ作成
	 * @param catyPrincipal プリンシパル
	 * @param models 受付メッセージ情報
	 */
	private void insertTE7B(CatyPrincipal principal, List<Te7bEntityModel> models) {
		// Change Start CATPPS-1364 対応 A.Miyakawa
		if (models != null) {
			if (!models.isEmpty()) {
				// TE7Bのデータを削除する
				// 一件目を取得
				Te7bEntityModel entity = models.get(0);
				deleteTe7bModels(principal, entity.getTe7b001(), entity.getTe7b002(), entity.getTe7b003());
			}
		}
		// Change End CATPPS-1364 対応 A.Miyakawa
		for (Te7bEntityModel model : models) {
			// Change Start CATPPS-1101 対応　A.Miyakawa
			try {
				Te7bEntityModel entity = getTe7bEntityDao().findByPrimaryKeyForUpdate(principal, model.getTe7b001(), model.getTe7b002(), model.getTe7b003(), model.getTe7b004());
				entity.setTe7b101(model.getTe7b101());
				entity.setTe7b102(model.getTe7b102());
				getTe7bEntityDao().update(principal, entity);
			} catch (EntityNotFoundException e) {
				getTe7bEntityDao().save(principal, model);
			}
			// Change end CATPPS-1101 対応　A.Miyakawa
		}
	}

	/**
	 * スイッチング連携受付メッセージ削除
	 * @param principal
	 * @param te7b001
	 * @param te7b002
	 * @param te7b003
	 */
	private void deleteTe7bModels(CatyPrincipal principal, String te7b001,
			BigDecimal te7b002, BigDecimal te7b003) {

		List<Te7bEntityModel> te7bEntityModels = getTe7bEntityDao().getMessageInfo(principal, te7b001, te7b002, te7b003);
		
		for (Te7bEntityModel model:te7bEntityModels) {
			try {
				Te7bEntityModel entity = getTe7bEntityDao().findByPrimaryKeyForUpdate(principal, model.getTe7b001(), model.getTe7b002(), model.getTe7b003(), model.getTe7b004());
				getTe7bEntityDao().delete(principal, entity);
			} catch (EntityNotFoundException e) {
				// なにもしない
			}
		}
		
	}

	@Override
	public LinkRequestInfoResult linkSwitchingSupportSystemErrorProcessing(
			CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) {
		
		// 連携結果判定
		setProccesingStatus(catyPrincipal, stationCd, linkRequestInfoResult);
		
		// 受付メッセージにエラーを登録
		linkRequestInfoResult.setTe7bEntityModelList(getTe7bModelsForInternalError(linkRequestInfoResult));
		
		// 連携ステータス更新処理
		this.updateCooperationStatus(catyPrincipal, stationCd,
				linkRequestInfoResult, false);
		
		// スイッチング連携管理更新情報更新処理
		try {
			this.updateTe79Info(catyPrincipal,stationCd,
					linkRequestInfoResult);
		} catch (EntityNotFoundException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
		// 連携実行完了処理
		this.completeCooperationExecute(catyPrincipal, stationCd,
				linkRequestInfoResult, false);
		
		// Change Start CATPPS-1564 20160411 A.Miyakawa
		if (CHECK_MSG_ID_NO_3.equals(linkRequestInfoResult.getErrorMsgId()) || CHECK_MSG_ID_NO_7.equals(linkRequestInfoResult.getErrorMsgId())) {
			this.checkNoAlartMsg(catyPrincipal, stationCd,
					linkRequestInfoResult);
		}
		// Change End CATPPS-1564 20160411 A.Miyakawa
		
		return linkRequestInfoResult;
	}
	
	// Change Start CATPPS-1564 20160411 A.Miyakawa
	/**
	 * アラート不要なメッセージが含まれているかチェックをする
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 */
	private void checkNoAlartMsg(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) {
		
		// アラートを出力しない場合は処理をしない。
		if (!linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isBatchResultFlag()) {
			return;
		}
		
		// サービスIDがない場合処理をしない。
		if (StringUtils.isEmpty(linkRequestInfoResult.getServiceId())) {
			return;
		}
		
		// アラート出力対象外のエラーメッセージIDを取得する
		List<Tpe7EntityModel> tpe7EntityModelList = getTpe7EntityDao()
				.getDisplayConfigMasterList(catyPrincipal, stationCd,
						"SXA0023", "NO_WARN_ERROR_CODE", linkRequestInfoResult.getServiceId());
		
		// 取得できない場合は処理をしない。
		if (tpe7EntityModelList == null) {
			return;
		}
		
		// OCCTOからのエラーメッセージIDを取得
		List<String> errorMsgList = getErrorMsgIdList(linkRequestInfoResult.getTe7bEntityModelList());
		
		// 取得できない場合は処理をしない。
		if (errorMsgList == null) {
			return;
		}
		
		// アラートを出力するべきエラーメッセージが設定されている場合、ResultListに入れる
		List<String> resutlList = new ArrayList<String>();
		for (String errorMsg:errorMsgList) {
			boolean isNoWarnError = false;
			for (Tpe7EntityModel model:tpe7EntityModelList) {
				if (model.getTpe7101().equals(errorMsg) ) {
					isNoWarnError = true;
					break;
				}
			}
			if (!isNoWarnError) {
				resutlList.add(errorMsg);
			}
		}
		
		// アラートを出力するべきエラーメッセージが設定されていない場合、アラートフラグをfalseにする
		if (resutlList.size() < 1) {
			linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().setBatchResultFlag(false);
		}
		
	}

	/**
	 * 受付メッセージからエラー区分だけ取得する
	 * @param te7bEntityModelList
	 * @return
	 */
	private List<String> getErrorMsgIdList(
			List<Te7bEntityModel> te7bEntityModelList) {
		
		List<String> strList = new ArrayList<String>();
		
		if (te7bEntityModelList == null) {
			return null;
		}
		
		for (Te7bEntityModel model:te7bEntityModelList) {
			if ( model.getTe7b101().indexOf("ERR") >=0 ) {
				strList.add(model.getTe7b101());
			}
		}
		
		return strList;
	}
	// Change End CATPPS-1564 20160411 A.Miyakawa
	
	/**
	 * 受付メッセージテーブルに設定する値を取得する。
	 * 内部エラーを格納する場合のみ使用
	 * @param stationCd 局コード
	 * @param renKeiNum 連携番号 (FK)
	 * @param renKeiSerialNum 連携番号連番 (FK)
	 * @param cmnServiceImpl レスポンス情報
	 * @return 受付メッセージモデルリスト
	 */
	private List<Te7bEntityModel> getTe7bModelsForInternalError(
			LinkRequestInfoResult result) {
		
		String serviceId = result.getServiceId();
		String stationCd = null;
		BigDecimal renkeiNum = null;
		BigDecimal renkeiSerialNum = null;
		
		if (IF_10110.equals(serviceId) || IF_F10110.equals(serviceId) ||
				IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)||
				IF_10510.equals(serviceId) || IF_K10510.equals(serviceId) ||
				IF_F10510.equals(serviceId) || IS_20110.equals(serviceId) ||
				IS_K20110.equals(serviceId) || IS_F20110.equals(serviceId) ||
				IF_10610.equals(serviceId) || IF_K10610.equals(serviceId) ||
				IF_F10610.equals(serviceId) || IF_10710.equals(serviceId) ||
				IF_K10710.equals(serviceId) || IF_F10710.equals(serviceId) ||
				IF_10210.equals(serviceId) || IF_K10210.equals(serviceId) ||
				IF_10810.equals(serviceId) || IF_K10810.equals(serviceId) ||
				IF_F10810.equals(serviceId) || IF_10910.equals(serviceId) ||
				IF_10310.equals(serviceId) || IF_K10310.equals(serviceId) ||
				IS_20410.equals(serviceId) || IS_K20410.equals(serviceId) ||
				IS_F20410.equals(serviceId)){
			
			// 申請系IFの場合
			// 局コード
			stationCd = result.getStationCd();
			// 連携番号
			renkeiNum = result.getRenKeiNum();
			// 連携番号連番
			renkeiSerialNum = result.getRenKeiSerialNum();
			
		} else if (IF_10220.equals(serviceId) || IF_10420.equals(serviceId)
				|| IF_10520.equals(serviceId) || IF_10620.equals(serviceId)
				|| IF_10720.equals(serviceId) || IF_10820.equals(serviceId)
				|| IF_10920.equals(serviceId) || IF_K10220.equals(serviceId)
				|| IF_K10520.equals(serviceId) || IF_K10620.equals(serviceId)
				|| IF_K10720.equals(serviceId) || IF_K10820.equals(serviceId)
				|| IF_F10420.equals(serviceId) || IF_F10520.equals(serviceId)
				|| IF_F10620.equals(serviceId) || IF_F10720.equals(serviceId)
				|| IF_F10820.equals(serviceId)) {
			//処理状況確認IFの場合
			
			if ( result.getTe79EntityMode() != null ) {
				// 局コード
				stationCd = result.getTe79EntityMode().getTe79001();
				// 連携番号
				renkeiNum = result.getTe79EntityMode().getTe79002();
				// 連携番号連番
				renkeiSerialNum = result.getTe79EntityMode().getTe79003();
			} else {
				// Change Start CATPPS-1564 20160411 A.Miyakawa
				return result.getTe7bEntityModelList();
				// Change End CATPPS-1564 20160411 A.Miyakawa
			}
		} else {
			// Change Start CATPPS-1564 20160411 A.Miyakawa
			return result.getTe7bEntityModelList();
			// Change End CATPPS-1564 20160411 A.Miyakawa
		}
		
		String messageDiv = result.getErrorMsgId();
		if (!StringUtils.isEmpty(messageDiv))
			messageDiv = messageDiv.replaceAll("message.", "");
		
		List<Te7bEntityModel> te7bEntityModels = result.getTe7bEntityModelList();
		int seq = 0;
		
		if (te7bEntityModels == null)
			te7bEntityModels = new ArrayList<Te7bEntityModel>();
		else
			seq = te7bEntityModels.size();
		
		Te7bEntityModel model = new Te7bEntityModel();
		model.setTe7b001(stationCd);										// 局コード
		model.setTe7b002(renkeiNum);										// 連携番号 (FK)
		model.setTe7b003(renkeiSerialNum);									// 連携番号連番 (FK)
		model.setTe7b004(new BigDecimal(seq));					// 連携受付メッセージ連番
		model.setTe7b101(messageDiv);		// 受付メッセージ区分
		model.setTe7b102(MessageUtils.getMessage(result.getErrorMsgId()));	// 受付メッセージ
		
		te7bEntityModels.add(model);
		
		return te7bEntityModels;
	}
	// Change Start CATPPS-1364 対応 A.Miyakawa
}