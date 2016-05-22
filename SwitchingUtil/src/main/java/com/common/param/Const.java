package com.common.param;


import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

/**
 * 定数を定義したインタフェースです。
 * @author EC-One, Inc.
 */
public interface Const {

	// とりあえず
	public static final String REGISTER_ERROR = "登録エラー";
	public static final String GET_ERROR = "取得エラー";
	public static final String CONTROL_ERROR = "制御エラー";
	public static final String ERROR_MIKEIYAKU = "未契約者です";
	public static final String ENTRY_OK = "正常";
	public static final String ENTRY_NG = "異常";

	public static final String REGIST = "1";
	public static final String DELETE = "2";
	
	
	// 機器制御
	/** 制御結果:正常 */
	public static final String EQP_CTRL_RESULT_OK = "1";
	/** 制御結果:異常 */
	public static final String EQP_CTRL_RESULT_NG = "2";
	/** 制御結果:対象外 */
	public static final String EQP_CTRL_RESULT_NONE = "3";

	// 優先フラグ
	/** 優先フラグ:リアル */
	public static final String EQP_CTRL_TYPE_REAL = "0";
	/** 優先フラグ:バッチ */
	public static final String EQP_CTRL_TYPE_BATCH = "1";
	
	// 制御対象
	/** 制御対象:視聴制御 */
	public static final String EQP_CTRL_TARGET_AUDIENCE = "101";
	/** 制御対象:BACCモデム速度制御 */
	public static final String EQP_CTRL_TARGET_BACC_MODEM = "201";
//Add Start 2014/05/08 Mabuchi 大垣対応
	/** 制御対象:機器制御*/
	public static final String EQP_CTRL_TARGET_EQUIPMENT = "301";
//Add End 2014/05/08 Mabuchi 大垣対応
	
	// HEコード
	/** HEコード:松下デジタル */
	public static final String EQP_CTRL_HE_CD_PANASONIC = "0110";
	/** HEコード:パイオニアデジタル */
	public static final String EQP_CTRL_HE_CD_PIONEER = "0610";
	/** HEコード:JC-HITS */
	public static final String EQP_CTRL_HE_CD_JCHITS = "0701";
	/** HEコード:モデム */
	public static final String EQP_CTRL_HE_CD_MODEM = "0801";
//Add Start 2014/05/09 Mabuchi 大垣対応
	/** HEコード:TimsNet */
	public static final String EQP_CTRL_HE_CD_TIMSNET = "0810";
	/** HEコード:AG-Manager */
	public static final String EQP_CTRL_HE_CD_AGMANAGER = "0820";
	/** HEコード:ミハル */
	public static final String EQP_CTRL_HE_CD_MIHARU = "0901";
//Add End 2014/05/09 Mabuchi 大垣対応
//Add Start 2014/06/12 Mabuchi 大垣対応
	/** HEコード:シンクレイア */
	public static final String EQP_CTRL_HE_CD_SYNCLAYER = "0821";
	/** HEコード:日本アンテナ */
	public static final String EQP_CTRL_HE_CD_NIPPON_ANTENNA = "0902";
//Add End 2014/06/12 Mabuchi 大垣対応

	/** 制御エリア:JC-HITS */
	public static final String EQP_CTRL_CONTROL_AREA_JCHITS = "000000";
	
	// 処理モード
	/** 処理モード:機器登録 */
	public static final String EQP_CTRL_MODE_EQP_REGIST = "101";
	/** 処理モード:機器削除 */
	public static final String EQP_CTRL_MODE_EQP_DELETE = "102";
	/** 処理モード:変更制御 */
	public static final String EQP_CTRL_MODE_CHANGE_CTRL = "103";
	/** 処理モード:機器変更 */
	public static final String EQP_CTRL_MODE_EQP_CHANGE = "104";
	/** 処理モード:機器変更(撤去制御無し) */
	public static final String EQP_CTRL_MODE_EQP_CHANGE_NON_REMOVE = "105";
	/** 処理モード:JC-HITS:カード登録 */
	public static final String EQP_CTRL_MODE_JCHITS_REGISTER = "209";
	/** 処理モード:JC-HITS:カード削除 */
	public static final String EQP_CTRL_MODE_JCHITS_DELETE = "210";
	/** 処理モード:JC-HITS:仮運用 */
	public static final String EQP_CTRL_MODE_JCHITS_KARI = "201";
	/** 処理モード:JC-HITS:再利用化 */
	public static final String EQP_CTRL_MODE_JCHITS_RECYCLE = "202";
	/** 処理モード:JC-HITS:休止/再開 */
	public static final String EQP_CTRL_MODE_JCHITS_STOP = "203";
	/** 処理モード:JC-HITS:解約 */
	public static final String EQP_CTRL_MODE_JCHITS_KAIYAKU = "204";
	/** 処理モード:JC-HITS:仮運用取消 */
	public static final String EQP_CTRL_MODE_JCHITS_KARITORI = "205";
	/** 処理モード:JC-HITS:鍵再送 */
	public static final String EQP_CTRL_MODE_JCHITS_ALL_CONTROL = "206";
	/** 処理モード:JC-HITS:指定制御 */
	public static final String EQP_CTRL_MODE_JCHITS_CAS_CTRL = "207";
	/** 処理モード:JC-HITS:パスワードクリア */
	public static final String EQP_CTRL_MODE_JCHITS_PWD_CLEAR = "208";
	/** 処理モード:モデム:モデム指定制御 */
	public static final String EQP_CTRL_MODE_MODEM_CTRL = "301";
	/** 処理モード:STB仮登録（新規） */
	public static final String EQP_CTRL_MODE_STB_REGIST = "401";
	/** 処理モード:STB仮登録（再登録） */
	public static final String EQP_CTRL_MODE_STB_REREGIST = "402";
	/** 処理モード:STB仮登録（登録解除） */
	public static final String EQP_CTRL_MODE_STB_UNREGIST = "403";
	/** 処理モード:撤去後処理STB */
	public static final String EQP_CTRL_MODE_STB_AFTER_REMOVE_STB = "404";
	/** 処理モード:撤去後処理CAS */
	public static final String EQP_CTRL_MODE_STB_AFTER_REMOVE_CAS = "405";
	/** 処理モード:直接制御 */
	public static final String EQP_CTRL_MODE_STB_DIRECT = "406";
	/** 処理モード:STBグループ登録 */
	public static final String EQP_CTRL_MODE_STB_REGIST_GROUP = "407";
	/** 処理モード:メッセージ登録・変更 */
	public static final String EQP_CTRL_MODE_STB_MESSAGE = "408";
	/** 処理モード:メッセージ送信停止 */
	public static final String EQP_CTRL_MODE_STB_STOP_MESSAGE = "409";
	/** 処理モード:全件送信処理 */
	public static final String EQP_CTRL_MODE_STB_SEND_ALL = "410";
	/** 処理モード:セレクト送信 */
	public static final String EQP_CTRL_MODE_STB_SEND_SELECT = "411";
//Add Start 2014/05/09 Mabuchi 大垣対応
	/** 処理モード:直接制御(CM,D-ONU,V-ONU) */
	public static final String EQP_CTRL_MODE_DIRECT_CTRL = "501";
//Add End 2014/05/09 Mabuchi 大垣対応
	
	// 処理区分
	/** 処理区分:契約内容によって視聴制御 */
	public static final BigDecimal EQP_CTRL_PROC_CONTROL_CONTRACT = new BigDecimal("2");
	/** 処理区分:設置 */
	public static final BigDecimal EQP_CTRL_PROC_SETTING = new BigDecimal("5");
	/** 処理区分:契約内容によって視聴制御（強制送信） */
	public static final BigDecimal EQP_CTRL_PROC_CONTROL_CONTRACT_COMPEL = new BigDecimal("7");
	/** 処理区分:STB撤去 */
	public static final BigDecimal EQP_CTRL_PROC_STB_REMOVE = new BigDecimal("9");
	/** 処理区分:STB仮登録（新規） */
	public static final BigDecimal EQP_CTRL_PROC_STB_REGISTER_NEW = new BigDecimal("10");
	/** 処理区分:STB仮登録（登録解除） */
	public static final BigDecimal EQP_CTRL_PROC_STB_REGISTER_CANCEL = new BigDecimal("11");
	/** 処理区分:交換時の設置 */
	public static final BigDecimal EQP_CTRL_PROC_SETTING_EXCHANGE = new BigDecimal("12");
	/** 処理区分:STB交換時の撤去 */
	public static final BigDecimal EQP_CTRL_PROC_STB_REMOVE_EXCHANGE = new BigDecimal("14");
	/** 処理区分:CASカード交換 */
	public static final BigDecimal EQP_CTRL_PROC_CAS_EXCHANGE = new BigDecimal("15");
	/** 処理区分:単価コード群より視聴制御（強制送信） */
	public static final BigDecimal EQP_CTRL_PROC_CONTROL_COST = new BigDecimal("16");
	/** 処理区分:カード登録 */
	public static final BigDecimal EQP_CTRL_PROC_CARD_REGISTER = new BigDecimal("31");
	/** 処理区分:STB撤去後 C-CASクリア */
	public static final BigDecimal EQP_CTRL_PROC_CAS_CLEAR = new BigDecimal("35");
	/** 処理区分:カード削除 */
	public static final BigDecimal EQP_CTRL_PROC_CARD_DELETE = new BigDecimal("39");
	/** 処理区分:STB特化 */
	public static final BigDecimal EQP_CTRL_PROC_STB_SP = new BigDecimal("54");
	/** 処理区分:JC-HITS専用 */
	public static final BigDecimal EQP_CTRL_PROC_JCHITS = new BigDecimal("55");
	/** 処理区分:モデム専用 */
	public static final BigDecimal EQP_CTRL_PROC_MODEM = new BigDecimal("60");
	
	// 特殊処理区分
	/** 特殊処理区分:なし */
	public static final BigDecimal EQP_CTRL_SP_PROC_NONE = BigDecimal.ZERO;
	/** 特殊処理区分:JC-HITS:仮運用 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_KARI = new BigDecimal("1");
	/** 特殊処理区分:JC-HITS:再利用化 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_RECYCLE = new BigDecimal("2");
	/** 特殊処理区分:JC-HITS:休止/再開 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_STOP = new BigDecimal("4");
	/** 特殊処理区分:JC-HITS:解約 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_KAIYAKU = new BigDecimal("5");
	/** 特殊処理区分:JC-HITS:交換 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_EXCHANGE = new BigDecimal("6");
	/** 特殊処理区分:JC-HITS:仮運用取消 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_KARITORI = new BigDecimal("7");
	/** 特殊処理区分:JC-HITS:変更制御 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_CONTROL = new BigDecimal("11");
	/** 特殊処理区分:JC-HITS:鍵再送 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_ALL_CONTROL = new BigDecimal("13");
	/** 特殊処理区分:JC-HITS:指定制御 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_TARGET_CONTROL = new BigDecimal("20");
	/** 特殊処理区分:JC-HITS:パスワードクリア */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_PWD_CLEAR = new BigDecimal("90");
	/** 特殊処理区分:JC-HITS:登録 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_REGISTER = new BigDecimal("91");
	/** 特殊処理区分:JC-HITS:削除 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_DELETE = new BigDecimal("92");
	/** 特殊処理区分:モデム:モデム指定制御 */
	public static final BigDecimal EQP_CTRL_SP_PROC_MODEM = new BigDecimal("1");
	// 特殊処理区分PANASONIC
	/** 特殊処理区分:PANASONIC:クリア */
	public static final BigDecimal EQP_CTRL_SP_PROC_CLEAR = new BigDecimal("9");
	/** 特殊処理区分:PANASONIC:メッセージ停止 */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_STOP_MSG = new BigDecimal("19");
	/** 特殊処理区分:PANASONIC:指定制御 */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_TARGET_CONTROL = new BigDecimal("20");
	/** 特殊処理区分:PANASONIC:再登録 */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_REREGIST = new BigDecimal("21");
	/** 特殊処理区分:PANASONIC:メッセージ登録 */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_REGIST_MSG = new BigDecimal("22");
	/** 特殊処理区分:PANASONIC:再送信 */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_RESEND = new BigDecimal("23");
	
	// カウンター(T054)
	public static final BigDecimal COUNTER_STB = new BigDecimal("04");
	public static final BigDecimal COUNTER_MODEM = new BigDecimal("05");
	public static final BigDecimal COUNTER_TA = new BigDecimal("19");
//Add Start 2014/05/08 Mabuchi 大垣対応
	public static final BigDecimal COUNTER_VONU = new BigDecimal("37");
//Add End 2014/05/08 Mabuchi 大垣対応
	
	// 管理ステータス
	/** 新品在庫 */
	public static final String EQUIPMENT_STATUS_NEW = "090001";
	/** 中古在庫 */
	public static final String EQUIPMENT_STATUS_OLD = "090002";
	/** 顧客使用中 */
	public static final String EQUIPMENT_STATUS_USE = "090003";
	/** 清掃待 */
	public static final String EQUIPMENT_STATUS_CLN = "090004";
	/** 故障中 */
	public static final String EQUIPMENT_STATUS_RPR = "090005";
	/** リース解約・破棄 */
	public static final String EQUIPMENT_STATUS_DEL = "090006";
	/** 不明・その他 */
	public static final String EQUIPMENT_STATUS_ETC = "090007";
	// TA用
	/** TA：設置前 */
	public static final String EQUIPMENT_STATUS_TA_STC = "160001";
	/** TA：顧客使用中 */
	public static final String EQUIPMENT_STATUS_TA_USE = "160002";
	/** TA：破棄 */
	public static final String EQUIPMENT_STATUS_TA_DEL = "160003";
	/** TA：その他 */
	public static final String EQUIPMENT_STATUS_TA_ETC = "160004";
	/** TA：故障中 */
	public static final String EQUIPMENT_STATUS_TA_RPR = "160005";
	// CAS用
	/** CAS：新品在庫 */
	public static final String EQUIPMENT_STATUS_CAS_NEW = "140001";
	/** CAS：中古在庫 */
	public static final String EQUIPMENT_STATUS_CAS_OLD = "140002";
	/** CAS：ＳＴＢリンク中 */
	public static final String EQUIPMENT_STATUS_CAS_LNK = "140003";
	/** CAS：リース解約・破棄 */
	public static final String EQUIPMENT_STATUS_CAS_DEL = "140004";
	/** CAS：不明・その他 */
	public static final String EQUIPMENT_STATUS_CAS_ETC = "140005";

	// JC-HITSステータス
	/** 初期 */
	public static final BigDecimal JCHITS_STATUS_SYOKI = new BigDecimal("0");
	/** 仮運用 */
	public static final BigDecimal JCHITS_STATUS_KARI = new BigDecimal("1");
	/** 本運用 */
	public static final BigDecimal JCHITS_STATUS_HON = new BigDecimal("2");
	/** 解約 */
	public static final BigDecimal JCHITS_STATUS_KAIYAKU = new BigDecimal("3");
	/** 休止 */
	public static final BigDecimal JCHITS_STATUS_KYUUSI = new BigDecimal("4");
	/** 未登録 */
	public static final BigDecimal JCHITS_STATUS_NONE = new BigDecimal("9");

	// JC-HITSステータス変更処理区分
	/** 仮運用 */
	public static final String JCHITS_PROC_DIV_KARI = "1";
	/** 再利用 */
	public static final String JCHITS_PROC_DIV_SAI = "2";
	/** 解約 */
	public static final String JCHITS_PROC_DIV_KAI = "3";
	/** パスワードクリア */
	public static final String JCHITS_PROC_DIV_PWDCLR = "4";
	/** 変更 */
	public static final String JCHITS_PROC_DIV_UPDATE = "5";
	/** 登録 */
	public static final String JCHITS_PROC_DIV_REGISTER = "6";
	/** 削除 */
	public static final String JCHITS_PROC_DIV_DELETE = "7";
	
	// JC-HITS
	/** テレコリターン */
	public static final BigDecimal JCHITS_VIEWLOG_TELECO = new BigDecimal("0");
	/** RFリターン */
	public static final BigDecimal JCHITS_VIEWLOG_RF = new BigDecimal("1");
	
	/** 直接制御処理区分：暗証番号クリア*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_PASSWORD_CLEAR = new BigDecimal(1);
	/** 直接制御処理区分：設置工事待ち取消*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_CANCEL_SETTING_CONSTRUCT = new BigDecimal(2);
	/** 直接制御処理区分：STB登録*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_STB_REGIST = new BigDecimal(3);
	/** 直接制御処理区分：設置*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_SETTING = new BigDecimal(4);
	/** 直接制御処理区分：撤去*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_REMOVE = new BigDecimal(5);
	/** 直接制御処理区分：STB抹消*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_STB_DELETE = new BigDecimal(6);
	/** 直接制御処理区分：端末初期化*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_INITALIZE = new BigDecimal(7);
	/** 直接制御処理区分：STB制御*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_STB_CONTROL = new BigDecimal(8);
	/** 直接制御処理区分：再登録*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_RE_REGIST = new BigDecimal(9);
	
	/** パイオニアデジタル特殊処理：本運用中モード登録*/
	public static final BigDecimal EQP_CTRL_PIONEER_SPECIAL_REGIST_NORMAL_MODE = new BigDecimal(1);
	/** パイオニアデジタル特殊処理：設置工事待ちモード登録*/
	public static final BigDecimal EQP_CTRL_PIONEER_SPECIAL_REGIST_CONSTRUCT_MODE = new BigDecimal(2);
	
	/** パナソニックデジタル特殊処理：契約送信*/
	public static final BigDecimal EQP_CTRL_PANASONIC_SPECIAL_SEND_PROMISE = new BigDecimal(1);
	/** パナソニックデジタル特殊処理：期間延長*/
	public static final BigDecimal EQP_CTRL_PANASONIC_SPECIAL_EXTEND_TERM = new BigDecimal(2);

	// 機器種別	
	// TP41
	/** TP41：機器種別 */
	public static final BigDecimal TP41_EQUIPMENT_TYPE_DEFAULT= new BigDecimal("0");
	/** TP41：機器種別：HT */
	public static final BigDecimal EQUIPMENT_TYPE_HT		= new BigDecimal("1");
//Change Start 2014/04/18 kando JIRA:CATFNL-1375
	/** 機器種別：STB */
	public static final BigDecimal EQUIPMENT_TYPE_STB		= new BigDecimal("1");
	/** 機器種別：BCAS */
	public static final BigDecimal EQUIPMENT_TYPE_BCAS	= new BigDecimal("2");
	/** 機器種別：CCAS */
	public static final BigDecimal EQUIPMENT_TYPE_CCAS	= new BigDecimal("5");
	/** 機器種別：モデム */
	public static final BigDecimal EQUIPMENT_TYPE_MODEM	= new BigDecimal("3");
	/** 機器種別：TA */
	public static final BigDecimal EQUIPMENT_TYPE_TA		= new BigDecimal("4");
//	/** TP41：機器種別：STB */
//	public static final BigDecimal EQUIPMENT_TYPE_STB		= new BigDecimal("2");
//	/** TP41：機器種別：BCAS */
//	public static final BigDecimal EQUIPMENT_TYPE_BCAS	= new BigDecimal("3");
//	/** TP41：機器種別：CCAS */
//	public static final BigDecimal EQUIPMENT_TYPE_CCAS	= new BigDecimal("4");
//	/** TP41：機器種別：モデム */
//	public static final BigDecimal EQUIPMENT_TYPE_MODEM	= new BigDecimal("5");
//	/** TP41：機器種別：TA */
//	public static final BigDecimal EQUIPMENT_TYPE_TA		= new BigDecimal("6");
//Change End 2014/04/18 kando JIRA:CATFNL-1375
//Add Start 2014/05/08 Mabuchi 大垣対応
	/** 機器種別：V-ONU */
	public static final BigDecimal EQUIPMENT_TYPE_VONU		= new BigDecimal("6");
	/** 機器種別：D-ONU */
	public static final BigDecimal EQUIPMENT_TYPE_DONU		= new BigDecimal("7");
	/** 機器種別：HGW */
	public static final BigDecimal EQUIPMENT_TYPE_HGW		= new BigDecimal("8");
//Add End 2014/05/08 Mabuchi 大垣対応
	// T311
	/** T311：機器種別：HT */
	public static final String T311_EQUIPMENT_TYPE_HT = "1";
	/** T311：機器種別：STB */
	public static final String T311_EQUIPMENT_TYPE_STB = "2";
	// T321
	/** T321：機器種別：BCAS */
	public static final String T321_EQUIPMENT_TYPE_BCAS	= "1";
	/** T321：機器種別：CCAS */
	public static final String T321_EQUIPMENT_TYPE_CCAS	= "2";
	// 強制停止用
	/** 機器種別：STB */
	//public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_STB = "2";
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_STB = "1";
	// 大垣向けカスタマイズ 2014/05/23 kedd END
	/** 機器種別：モデム */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_MODEM = "3";
	/** 機器種別：TA */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_TA = "4";
	/** 機器種別：WiMAX */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_WiMAX = "5";
	// 大垣向けカスタマイズ 2014/05/23 kedd START
	/** 機器種別：V-ONU */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_VONU = "6";
	/** 機器種別：D-ONU */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_DONU = "7";
	/** 機器種別：HGW */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_HGW = "8";
	// 大垣向けカスタマイズ 2014/05/23 kedd END
	// T116
	/** T116:機器種別：STB */
	public static final BigDecimal T116_EQUIPMENT_TYPE_STB = new BigDecimal("1");
	/** T116:機器種別：モデム、WiMAX */
	public static final BigDecimal T116_EQUIPMENT_TYPE_MODEM = new BigDecimal("2");
	/** T116:機器種別：TA */
	public static final BigDecimal T116_EQUIPMENT_TYPE_TA = new BigDecimal("3");
	// TP86
	/** TP86:処理種別：STB */
	public static final BigDecimal TP86_PROC_TYPE_STB = new BigDecimal("1");
	/** TP86:処理種別：モデム、WiMAX */
	public static final BigDecimal TP86_PROC_TYPE_MODEM = new BigDecimal("2");
	/** TP86:処理種別：EMTA */
	public static final BigDecimal TP86_PROC_TYPE_EMTA = new BigDecimal("3");
	// T201
	/** T201:機器種別：STB */
	public static final BigDecimal T201_EQUIPMENT_TYPE_STB = new BigDecimal("1");
	/** T201:機器種別：モデム */
	public static final BigDecimal T201_EQUIPMENT_TYPE_MODEM = new BigDecimal("2");
	/** T201:機器種別：TA */
	public static final BigDecimal T201_EQUIPMENT_TYPE_TA = new BigDecimal("3");
	
//Add Start 2014/06/05 Mabuchi 大垣対応
	/** 機種区分：HGW */
	public static final String EQUIPMENT_MODEL_DIV_HGW		= "1";
	/** 機種区分：WMTA */
	public static final String EQUIPMENT_MODEL_DIV_WMTA		= "2";
//Add End 2014/06/05 Mabuchi 大垣対応
	
	// 内蔵区分
	/** 内蔵区分：1：内蔵 */
	public static final String CCAS_IN = "1";
	/** 内蔵区分：2：非内蔵 */
	public static final String CCAS_OUT = "2";
	
	// 一体型フラグ
	/** 一体型フラグ：一体型 */
	public static final String UNION_ON = "1";
	/** 一体型フラグ：一体型でない */
	public static final String UNION_OFF = "0";
	
	// 端末区分
	/** 端末区分：レンタル */
	public static final String TERMINAL_DIV_RENTAL = "0";
	/** 端末区分：買取 */
	public static final String TERMINAL_DIV_PURCHASE = "1";
	
	// 機器修理処理区分
	/** 機器修理処理区分:修理依頼 */
	public static final String REPAIR_PROC_DIV_REQUEST = "1";
	/** 機器修理処理区分:修理完了 */
	public static final String REPAIR_PROC_DIV_COMPLETE = "2";
	// 機器抹消処理区分
	/** 機器抹消処理区分:抹消 */
	public static final String DESTRUCTION_PROC_DIV_DESTRUCTION = "1";
	/** 機器抹消処理区分:不明 */
	public static final String DESTRUCTION_PROC_DIV_UNKNOWN = "2";
	/** 機器抹消処理区分:取消 */
	public static final String DESTRUCTION_PROC_DIV_CANCEL = "3";
	
	// 停止区分
	/** 強制停止 */
	public static final BigDecimal SUSPEND_DIV_FORCED_SUSPEND = new BigDecimal("1");
	/** 停止 */
	public static final BigDecimal SUSPEND_DIV_STOP = new BigDecimal("2");
	/** 休止 */
	public static final BigDecimal SUSPEND_DIV_SUSPEND = new BigDecimal("3");
	
	// 停止区分
	/** 強制停止:コメントコード */
	public static final String TA31_SUSPEND_DIV_FORCED_SUSPEND = "1150011";
	/** 停止:コメントコード */
	public static final String TA31_SUSPEND_DIV_STOP = "1150013";
	
// Add start 2013/02/21 y.goto STITEC-5110
	/** TP36撤去時モデム制御可否フラグ 否 */
	public static final BigDecimal TP36_SETTING_OFF = BigDecimal.ZERO;
	/** TP36撤去時モデム制御可否フラグ 可 */
	public static final BigDecimal TP36_SETTING_ON  = BigDecimal.ONE;
	/** TP36撤去時モデム制御可否フラグ 否 */
	public static final BigDecimal TP36_REMOVE_OFF = BigDecimal.ZERO;
	/** TP36撤去時モデム制御可否フラグ 可 */
	public static final BigDecimal TP36_REMOVE_ON  = BigDecimal.ONE;
	/** T019STB区分 0:片方向 */
	public static final BigDecimal T019_KATAHOUKOU = BigDecimal.ZERO;
	/** T019STB区分 1:双方向 */
	public static final BigDecimal T019_SOUHOUKOU  = BigDecimal.ONE;
// Add start 2012/11/08 y.goto STITEC-2033
	// Prov連携:RenkeiProcBizLogicImpl
	/** Prov連携：機器変更:1 */
	public static final BigDecimal PROV_EQUIPMENT_CHANGE = new BigDecimal("1");
	/** Prov連携：機器交換:2 */
	public static final BigDecimal PROV_EQUIPMENT_EXCHANGE = new BigDecimal("2");
	/** Prov連携：契約変更:3 */
	public static final BigDecimal PROV_CONTRACT_CHANGE = new BigDecimal("3");
// Add end   2012/11/08 y.goto STITEC-2033
	
	// デフォルト値
	/** 顧客状態：0：未契約 */
	public static final String MIKEIYAKU  = "0";
	/** 郵便番号 7桁 */
	public static final String DEFAULT_ZIP_NO = StringUtils.leftPad("", 7, "0");
	/** バージョン番号：1 */
	public static final String DEFAULT_VERSION_NO = "1";
	/** システムコメントコード 6桁 */
	public static final String DEFAULT_SYSTEM_COMMENT = StringUtils.leftPad("", 6, "0");
	/** ユーザコメントコード 7桁 */
	public static final String DEFAULT_USER_COMMENT = StringUtils.leftPad("", 7, "0");
	/** コメントコード 4桁 */
	public static final String DEFAULT_COMMENT = StringUtils.leftPad("", 4, "0");
	/** 機器コード：8桁 */
	public static final String DEFAULT_EQUIPMENT_ID = StringUtils.leftPad("", 8, "0");
	/** カードID：20桁 */
	public static final String DEFAULT_CARD_ID = StringUtils.leftPad("", 20, "0");
	/** 機種コード：2桁 */
	public static final String DEFAULT_EQUIPMENT_MODEL = StringUtils.leftPad("", 2, "0");
	/** STBMAC・CMMAC・ラボ端末：半角空白12桁 */
	public static final String DEFAULT_EQUIPMENT12 = StringUtils.leftPad("", 12, " ");
	/** アドレス・製造番号：半角空白15桁 */
	public static final String DEFAULT_EQUIPMENT15 = StringUtils.leftPad("", 15, " ");
	/** 業者コード：6桁 */
	public static final String DEFAULT_TRADER_CD = StringUtils.leftPad("", 6, "0");
	/** 社員コード：8桁 */
	public static final String DEFAULT_EMPLOYEE_CD = StringUtils.leftPad("", 8, "0");
	/** 単価コード：8桁 */
	public static final String DEFAULT_PRICE_CD = StringUtils.leftPad("", 6, "0");
	/** 顧客・契約者コード：10桁 */
	public static final String DEFAULT_CUSTOMER_CD = StringUtils.leftPad("", 10, "0");
	/** 顧客・契約者コード：半角空白10桁 */
	public static final String DEFAULT_CUSTOMER_CD_SPACE = StringUtils.leftPad("", 10, " ");
	// CATFNL-2655 2014/10/02 Y.Fujino [Chg] Start
	/** リース番号：20桁 */
	public static final String DEFAULT_LEASE_NO = StringUtils.leftPad("", 20, " ");
//	public static final String DEFAULT_LEASE_NO = StringUtils.leftPad("", 20, "0");
	// CATFNL-2655 2014/10/02 Y.Fujino [Chg] End
	/** 設置場所：全角空白15文字 */
	public static final String DEFAULT_SETTING_PLACE = StringUtils.leftPad("", 15, "　");
	/** 備考：全角空白20文字 */
	public static final String DEFAULT_REMARK_FULL20 = StringUtils.leftPad("", 20, "　");
	/** 備考：全角空白30文字 */
	public static final String DEFAULT_REMARK_FULL30 = StringUtils.leftPad("", 30, "　");
	/** 備考：半角空白40文字 */
	public static final String DEFAULT_REMARK_HALF40 = StringUtils.leftPad("", 40, " ");
	/** 備考：半角空白60文字 */
	public static final String DEFAULT_REMARK_HALF60 = StringUtils.leftPad("", 60, " ");
	/** 更新APP：半角空白8文字 */
	public static final String DEFAULT_UPDATE_APP = StringUtils.leftPad("", 8, " ");
	/** フラグ：0 */
	public static final String DEFAULT_FLG = "0";
	/** 価格：0 */
	public static final String DEFAULT_PRICE = "0";
	/** 回数：0 */
	public static final String DEFAULT_NUMBER = "0";
	/** 物件コード：10桁 */
	public static final String DEFAULT_HOUSE_CD = StringUtils.leftPad("", 10, "0");
	// T311
	/** 入力レベル：0 */
	public static final String DEFAULT_INPUT_LEVEL = "0";
	// T316
	/** グループID：8桁 */
	public static final String DEFAULT_GROUP_ID = StringUtils.leftPad("", 8, "0");
	/** ネットワーク状態：0 */
	public static final String DEFAULT_NETWORK_STATE = "0";
	/** 予備：半角空白8文字 */
	public static final String DEFAULT_RESERVE = StringUtils.leftPad("", 8, " ");
	/** STB区分：0 */
	public static final String DEFAULT_STB_DIV = "0";
	/** 周期更新：0 */
	public static final String DEFAULT_CYCLE = "0";
	// T331
	/** センターモデム：半角空白20文字 */
	public static final String DEFAULT_CENTER_MODEM = StringUtils.leftPad("", 20, " ");
	//TP41
	/** 状態：1：入庫 */
	public static final String STATUS_STOCK = "1";
// Add start 2013/03/15 y.goto STITEC-4418
	/** 状態：2：出庫 */
	public static final String STATUS_OUTPUT = "2";
// Add end   2013/03/15 y.goto STITEC-4418
	/** 撤去区分：0 */
	public static final String DEFAULT_REMOVE_DIV = "0";
	/** 判定結果：000 */
	public static final String DEFAULT_RESULT = "000";
	
// Add start 2012/12/14 y.goto STITEC-3379
	// T005サービス分類
// Add Start 2014/04/21 H.Matsuyama JIRA:CATFNL-1323
	/** 000：標準 */
	public static final String T005_SERVICE_TYPE_STANDARD = "000";
// Add End 2014/04/21 H.Matsuyama JIRA:CATFNL-1323
	/** 001：TV */
	public static final String T005_SERVICE_TYPE_TV = "001";
	/** 002：NET */
	public static final String T005_SERVICE_TYPE_NET = "002";
	/** 003：KDDI */
	public static final String T005_SERVICE_TYPE_KDDI = "003";
	/** 004：NHK */
	public static final String T005_SERVICE_TYPE_NHK = "004";
	/** 005：一時金 */
	public static final String T005_SERVICE_TYPE_LUMPSUM = "005";
	/** 009：その他 */
	public static final String T005_SERVICE_TYPE_OTHER = "009";
// Add end   2012/12/14 y.goto STITEC-3379
// CATFNL-3635 2015.05.13 [Add] ガイド追加 START
	/** 006：ガイド */
	public static final String T005_SERVICE_TYPE_GUIDE = "006";
// CATFNL-3635 2015.05.13 [Add] ガイド追加 END

// Add Start 2015/11/12 M.Kimino JIRA:CATPPS-169
	/** 015：低圧 */
	public static final String T005_SERVICE_TYPE_LOW_PRESSURE = "015";
	/** 016：高圧 */
	public static final String T005_SERVICE_TYPE_HIGH_PRESSURE = "016";
	/** 017：発電 */
	public static final String T005_SERVICE_TYPE_POWER_GENERATION = "017";
	/** 016：卸 */
	public static final String T005_SERVICE_TYPE_WHOLESALE = "018";
// Add End 2015/11/12 M.Kimino JIRA:CATPPS-169
	
	// T116 契約区分
	/** 001：TV */
	public static final String T116_CONTRACT_DIV_TV = "001";
	/** 002：NET */
	public static final String T116_CONTRACT_DIV_NET = "002";
	/** 003：KDDI */
	public static final String T116_CONTRACT_DIV_KDDI = "003";
	/** 004：NHK */
	public static final String T116_CONTRACT_DIV_NHK = "004";
	/** 005：一時金 */
	public static final String T116_CONTRACT_DIV_LUMPSUM = "005";
	
	// 請求区分
	/** 振替 */
	public static final BigDecimal BILL_DIV_TRANSFER = new BigDecimal("1");
	/** 振込 */
	public static final BigDecimal BILL_DIV_PAID = new BigDecimal("2");
	/** 現金 */
	public static final BigDecimal BILL_DIV_CASH = new BigDecimal("3");
	/** その他 */
	public static final BigDecimal BILL_DIV_ETC = new BigDecimal("5");
	/** カード */
	public static final BigDecimal BILL_DIV_CARD = new BigDecimal("6");
	/** CCS */
	public static final BigDecimal BILL_DIV_CCS = new BigDecimal("9");
	
	// 集約先区分
	/** 集約先区分：全銀 */
	public static final BigDecimal INTENSIVE_DIV_BANK = new BigDecimal("0");
	/** 集約先区分：カード */
	public static final BigDecimal INTENSIVE_DIV_CARD = new BigDecimal("1");
	/** 集約先区分：引落代行無し */
	public static final BigDecimal INTENSIVE_DIV_NONE = new BigDecimal("2");
	/** 集約先区分：CCS */
	public static final BigDecimal INTENSIVE_DIV_CCS = new BigDecimal("3");
	
	// 預金種目
	/** 普通 */
	public static final String DEPOSIT_TYPE_ORDINARY = "1";
	/** 当座 */
	public static final String DEPOSIT_TYPE_CURRENT = "2";
	
	// 顧客区分
	/** 顧客区分:1:主契約者 */
	public static final BigDecimal CUSTOMER_DIV_MAIN = new BigDecimal("1");
	/** 顧客区分:2:従契約者 */
	public static final BigDecimal CUSTOMER_DIV_SUB = new BigDecimal("2");
	/** 顧客区分:3:物件 */
	public static final BigDecimal CUSTOMER_DIV_HOUSE = new BigDecimal("3");
	/** 顧客区分:4:法人 */
	public static final BigDecimal CUSTOMER_DIV_CORPORATION = new BigDecimal("4");
	/** 顧客区分:5:その他 */
	public static final BigDecimal CUSTOMER_DIV_ETC = new BigDecimal("5");

	// 請求書
	/** 発行区分：0：発行 */
	public static final String ISSUE_DIV_ISSUE = "0";
	/** 発行区分：1：再発行 */
	public static final String ISSUE_DIV_REISSUE = "1";
	/** 発行区分：2：読込 */
	public static final String ISSUE_DIV_READ = "2";
	
	/** 編集区分：0：検印欄無 */
	public static final String EDIT_DIV_OFF = "0";
	/** 編集区分：1：検印欄有 */
	public static final String EDIT_DIV_ON = "1";
	
	/** 請求書:機器種別：STB */
	public static final String PRINT_BILL_EQUIPMENT_TYPE_STB = "2";
	/** 請求書:機器種別：モデム */
	public static final String PRINT_BILL_EQUIPMENT_TYPE_MODEM = "3";
	/** 請求書:機器種別：TA */
	public static final String PRINT_BILL_EQUIPMENT_TYPE_TA = "4";
	
	// 受付状態
	/** 受付状態：0：未制御 */
	public static final BigDecimal RECEIPT_STS_NON_PROC = new BigDecimal("0");
	/** 受付状態：1：契約反映前 */
	public static final BigDecimal RECEIPT_STS_BF_COMPLETE = new BigDecimal("1");
	/** 受付状態：2：契約反映完了 */
	public static final BigDecimal RECEIPT_STS_COMPLETE = new BigDecimal("2");
	/** 受付状態：3：修正反映完了 */
	public static final BigDecimal RECEIPT_STS_CHG_COMPLETE = new BigDecimal("3");
	/** 受付状態：4：エラー発生中 */
	public static final BigDecimal RECEIPT_STS_ERROR = new BigDecimal("4");
	
	// Ｃａｔ反映状態
	/** Ｃａｔ反映状態：0：正常 */
	public static final BigDecimal REFLECT_STS_NORMAL = new BigDecimal("0");
	/** Ｃａｔ反映状態：1：重複エラー */
	public static final BigDecimal REFLECT_STS_DUPL = new BigDecimal("1");
	/** Ｃａｔ反映状態：2：未登録 */
	public static final BigDecimal REFLECT_STS_UNREG = new BigDecimal("2");
	/** Ｃａｔ反映状態：3：終了日入力済み */
	public static final BigDecimal REFLECT_STS_NON_END = new BigDecimal("3");
	/** Ｃａｔ反映状態：4：期間大小エラー */
	public static final BigDecimal REFLECT_STS_NG_PERIOD = new BigDecimal("4");
	/** Ｃａｔ反映状態：5：他方反映エラー */
	public static final BigDecimal REFLECT_STS_OTHER_REF = new BigDecimal("5");
	/** Ｃａｔ反映状態：5：セットチャンネル期間重複 */
	public static final BigDecimal REFLECT_STS_SETCANNEL_DUPL = new BigDecimal("5");

	/** 明細種別:1:前受金 */
	public static final BigDecimal DETAIL_TYPE_MAEUKE = new BigDecimal("1");
	/** 明細種別:2:繰越金 */
	public static final BigDecimal DETAIL_TYPE_KURIKOSHI = new BigDecimal("2");
	/** 明細種別:3:売掛金 */
	public static final BigDecimal DETAIL_TYPE_URIKAKE = new BigDecimal("3");

	// 申込区分
	/** 申込区分：1:開始申込 */
	public static final BigDecimal APPLICATION_STS_START = new BigDecimal("1");
	/** 申込区分：2:解約申込 */
	public static final BigDecimal APPLICATION_STS_CLOSE = new BigDecimal("2");
	/** 申込区分：3:期間変更(延長) */
	public static final BigDecimal APPLICATION_STS_EXTENSION = new BigDecimal("3");
	/** 申込区分：4:期間変更(即開始) */
	public static final BigDecimal APPLICATION_STS_START_NOW = new BigDecimal("4");
	
	// 申込内容
	/** 申込内容：1:新規申込 */
	public static final BigDecimal APPINFO_STS_START = new BigDecimal("1");
	/** 申込内容：2:解約申込 */
	public static final BigDecimal APPINFO_STS_CLOSE = new BigDecimal("2");
	/** 申込内容：3:申込取消 */
	public static final BigDecimal APPINFO_STS_CANCEL_START = new BigDecimal("3");
	/** 申込内容：4:解約取消 */
	public static final BigDecimal APPINFO_STS_CANCEL_CLOSE = new BigDecimal("4");
	
	// 金額入力区分
	/** 金額入力区分：1:金額入力不可 */
	public static final BigDecimal AMT_INPUT_DIV_OFF = new BigDecimal("1");
	/** 金額入力区分：2:金額入力可 */
	public static final BigDecimal AMT_INPUT_DIV_OK = new BigDecimal("2");
	
// Add start 20121012 H.Matsuyama STITEC-302
	// サービス分類
	/** 005:一時金 */
	public static final String SRV_CATEGORY_LUMPSUM = "005";
// Add end   20121012 H.Matsuyama STITEC-302
	
	/*
	 * 何に仕様するものか特定の上不要なら削除
	 * K.Suzuki
	 */
	/** 局コード（最終的に－２となる）*/
    public static final BigDecimal STATION_CODE = new BigDecimal("-2");
    
    /*
     * 共通コード定義
     */
    /**  NULLを表す定数値（日付以外） */
    public static final BigDecimal NULL_NUMBER = new BigDecimal("-1");
    /**  共通(日付) */
    public static final int FUTURE_YEAR_MONTH = 999999;
    public static final int FUTURE_DATE = 99999999;
    public static final int NULL_DATE = 0;
    public static final String DEFAULT_DATE = "00000000";
    public static final String DEFAULT_YYYYMM = "000000";
    public static final String DEFAULT_FUTURE_DATE = "99999999";
    /**  共通(時刻) */
    public static final int NULL_TIME = -1;
    public static final String DEFAULT_HHMMSS = "000000";
    public static final String DEFAULT_HHMM = "0000";
    public static final String DEFAULT_FUTURE_HHMM = "9999";
    /**  共通(金額無効値) */
    public static final BigDecimal NULL_PRICE = BigDecimal.ZERO;
    /**  共通(数量無効値) */
    public static final BigDecimal NULL_AMOUNT = BigDecimal.ZERO;
    /**  共通(月無効値) */
    public static final BigDecimal NULL_MONTH = BigDecimal.ZERO;
    /**  共通(時間効値) */
    public static final BigDecimal NULL_HOUR = BigDecimal.ZERO;
    /**　共通(コード無効値) */
    public static final BigDecimal NULL_CODE_VALUE = new BigDecimal("-1");
    /** 汎用文字列2桁ALL0 */
    public static final String STR_ZERO_LENGTH_TWO = "00";
    /** 汎用文字列3桁ALL0 */
    public static final String STR_ZERO_LENGTH_THREE = "000";
    /** 汎用文字列6桁ALL0 */
    public static final String STR_ZERO_LENGTH_SIX = "000000";
    /** 汎用文字列7桁ALL0 */
    public static final String STR_ZERO_LENGTH_SEVEN = "0000000";
    /** 汎用文字列8桁ALL0 */
    public static final String STR_ZERO_LENGTH_EIGHT = "00000000";
    /** 汎用文字列10桁ALL0 */
    public static final String STR_ZERO_LENGTH_TEN = "0000000000";

    /*
     * バリデーション関連? 
     */
    /** 判別フラグ FALSE */
    public static final BigDecimal DISTINCTION_FALSE = new BigDecimal(0);
    /** 判別フラグ TRUE */
    public static final BigDecimal DISTINCTION_TRUE = new BigDecimal(1);    
    
    /*
     * ログ関連 
     */
    /**  ログ出力未設定項目初期値 */
    public static final String LOG_DB_SETTING_NONE = "-";

    /** 種別（1：ログイン、2：ログアウト）*/
    public static final BigDecimal LOG_LOGIN = new BigDecimal(1);
    public static final BigDecimal LOG_LOGOUT = new BigDecimal(2);

    /** ＤＢ操作種別（1：追加、2：更新、3：削除）*/
    public static final BigDecimal LOG_INSERT = new BigDecimal(1);
    public static final BigDecimal LOG_UPDATE = new BigDecimal(2);
    public static final BigDecimal LOG_DELETE = new BigDecimal(3);

    /**  ＤＢ操作種別（画面表示用文言）*/
    public static final String LOG_INSERT_TXT = "追加";
    public static final String LOG_UPDATE_TXT = "更新";
    public static final String LOG_DELETE_TXT = "削除";
    
    /** 無効値を画面表示する際にに使用する文字列 */
    public static final String MASK_STRING_NULL_VALUE = "-";
    /** 空文字を画面表示する際にに使用する文字列 */
    public static final String MASK_STRING_EMPTY_VALUE = "";
    
    /**  変更ログ_種別（1:変更前、2:変更後）*/
    public static final BigDecimal LOG_BEFORE_DATA = new BigDecimal(1);
    public static final BigDecimal LOG_AFTER_DATA = new BigDecimal(2);
    
    /**  バッチ処理ログ_ステータス（1:開始、2:正常終了、３：警告終了、４：中断終了、５：異常終了、６：実行待ち）*/
    public static final BigDecimal LOG_BATCH_START = new BigDecimal(1);
    public static final BigDecimal LOG_BATCH_FINISH = new BigDecimal(2);
    public static final BigDecimal LOG_BATCH_FINISH_WARNING = new BigDecimal(3);
    public static final BigDecimal LOG_BATCH_FINISH_INTERRUPT = new BigDecimal(4);
    public static final BigDecimal LOG_BATCH_FINISH_ABORT = new BigDecimal(5);
    public static final BigDecimal LOG_BATCH_WAITING = new BigDecimal(6);

    /**  バッチ処理ログ_ステータス（画面表示用文言）*/
    public static final String LOG_BATCH_START_TXT = "開始";
    public static final String LOG_BATCH_FINISH_TXT = "正常終了";
    public static final String LOG_BATCH_FINISH_WARNING_TXT = "警告終了";
    public static final String LOG_BATCH_FINISH_INTERRUPT_TXT = "中断終了";
    public static final String LOG_BATCH_FINISH_ABORT_TXT = "異常終了";
    public static final String LOG_BATCH_WAITING_TXT = "実行待ち";

    /** 帳票ログ 処理タイプ */
    public static final String LOG_REP_OPERATIONTYPE_IN = "in";
    public static final String LOG_REP_OPERATIONTYPE_INOUT = "inout";
    public static final String LOG_REP_OPERATIONTYPE_OUT = "out";    
    
    /*
     * エンコード
     */
    /** アップロードファイルのエンコード */
    public static final String UPLOAD_FILE_ENCODING = "MS932";
    /** ダウンロードファイルのエンコード */
    public static final String DOWNLOAD_FILE_ENCODING = "Windows-31J";
	/**
	 * 当システムでのDB側文字エンコーディング(実際はJA16SJISTILEDだが、対応するJava側エンコーディング名称)
	 */
	public static final String DATABASE_CHARACTER_ENCODING = "Windows-31J";
	/** AJAXのエンコーディング */
	public static final String AJAX_CHARACTER_ENCODING = "UTF-8";
    
    /** 外部連携暗号化設定 */    
    public static final String SECRETKEYUTILS_ENCODING = "utf-8";    
    
    /*
     * 何に仕様するものか特定の上不要なら削除
     * K.Suzuki
     */
    /** 検索画面状態管理用定数 */
    public static final String VIEW_STATE_MANAGE_FLG = "cmd";

    /** 検索画面状態管理用定数(初期表示) */
    public static final String VIEW_STATE_MANAGE_FLG_ON = "init";


    /* 
     * ストアドプロシージャ用ログ出力下限レベル 
     */
    /** ログ出力下限レベル（ログレベル：TRACE） */
    public static final BigDecimal LOG_LEVEL_TRACE = BigDecimal.ONE;
    /** ログ出力下限レベル（ログレベル：DEBUG） */
    public static final BigDecimal LOG_LEVEL_DEBUG = new BigDecimal(2);
    /** ログ出力下限レベル（ログレベル：INFO） */
    public static final BigDecimal LOG_LEVEL_INFO  = new BigDecimal(3);
    /** ログ出力下限レベル（ログレベル：WARN） */
    public static final BigDecimal LOG_LEVEL_WARN  = new BigDecimal(4);
    /** ログ出力下限レベル（ログレベル：ERROR） */
    public static final BigDecimal LOG_LEVEL_ERROR = new BigDecimal(5);
    /** ログ出力下限レベル（ログレベル：FATAL） */
    public static final BigDecimal LOG_LEVEL_FATAL = new BigDecimal(6);


    /*
     * 消費税内税外税区分
     */
    /** 内税外税区分（内税） */
    public static final BigDecimal CSMPN_TX_INCL_EXCL_DIV_INCL = BigDecimal.ONE;
    /**　内税外税区分（外税）　*/
    public static final BigDecimal CSMPN_TX_INCL_EXCL_DIV_EXCL = new BigDecimal(2);

    /*
     * 存在区分
     */
    /** 存在しない */
    public static final BigDecimal NOT_EXIST = BigDecimal.ZERO;
    /** 存在する */
    public static final BigDecimal EXIST = BigDecimal.ONE;


    /** 共通システムサービスID(特定のシステムサービスに属さない画面を定義する) */
    public static final String COMMON_SYSTEM_SERVICE_ID = "COMMON";


     // ----------------------- WEB受付---------------------------------------------
     // WEB受付で追加するものはこれ以降に追加してください
    
    /*
     * 同意フラグ
     */
    /** 同意フラグ YES */
    public static final String AGREE_FLG_YES = "0";
    /** 同意フラグ NO */
    public static final String AGREE_FLG_NO = "1";

    /*
     * 取得異常
     */
    /** 取得異常 */
    public static final String BASIC_CHANNEL_NAME_ERROR = "取得異常";

    /*
     * 契約されていません
     */
    /** 契約されていません */
    public static final String WERSERVICE_CONTRACT_IS_EMPTY_ERROR = "契約されていません";
    
    /*
     * 変更受付基本フラグ
     */
    /** 変更受付基本フラグ 0：通常 */
    public static final int CORECE_FLG_ZERO = 0;
    /** 変更受付基本フラグ 1：受付中 */
    public static final int CORECE_FLG_ONE = 1;
    /** 変更受付基本フラグ 2：処理中 */
    public static final int CORECE_FLG_TWO = 2;
    /** 変更受付基本フラグ 3：停止中 */
    public static final int CORECE_FLG_THREE = 3;
    /** 変更受付基本フラグ 4：変更不可 */
    public static final int CORECE_FLG_FOUR = 4;
    /*
     * 変更受付オプションフラグ
     */
    /** 変更受付オプションフラグ 0：通常 */
    public static final int OP_FLG_ZERO = 0;
    /** 変更受付オプションフラグ 1：受付中 */
    public static final int OP_FLG_ONE = 1;
    
    /*
     * QAフラグ
     */
    /** QAフラグ はい */
    public static final String AGE_QA_FLG_YES = "0";
    /** QAフラグ いええ */
    public static final String AGE_QA_FLG_NO = "1";

	/*
	 * JC-HITSフラグ
	 */
    /** JC-HITSフラグ JC-HITSフラグ ON */
    public static final String JC_HITS_FLG_ON = "1";
    /** JC-HITSフラグ JC-HITSフラグ OFF */
    public static final String JC_HITS_FLG_OFF = "0";
    
	/*
	 * ppv利用フラグ(0：利用していない,1：利用中)
	 */
    /** ppv利用フラグ 利用していない */
    public static final int PPV_FLG_UNUSEABLED = 0;
    /** ppv利用フラグ 利用中 */ 
    public static final int PPV_FLG_USEABLED = 1;

	/*
	 * アダルト利用フラグ(0：利用していない,1：利用中)
	 */
    /** アダルトフラグ 利用していない */
    public static final int ADULT_FLG_UNUSEABLED = 0;
    /** アダルトフラグ 利用中 */
    public static final int ADULT_FLG_USEABLED = 1;
   
    /*
	* 視聴可能フラグ(0：視聴可能,1：視聴不可)
	*/
    /** 視聴可能*/
    public static final int WATCHING_ON = 0;
    /** 視聴不可 */
    public static final int WATCHING_OFF = 1;

    /*
     * 視聴文言
     */
	/** 現状：視聴可能 */
	public static final String WATCHING_ON_WORD = "現状：視聴可能";
	/** 現状：視聴不可 */
	public static final String WATCHING_OFF_WORD = "現状：視聴不可";
	
	/*
     * アダルトフラグ
     */
    /** アダルトフラグ 0：OFF 1：ON */
    public static final BigDecimal ADULT_FLG_OFF = BigDecimal.ZERO;
    /** アダルトフラグ 0：OFF 1：ON */
    public static final BigDecimal ADULT_FLG_ON = BigDecimal.ONE;
    
    /*
     * 生年月日フラグ
     */
    /** 生年月日フラグ ON */
    public static final BigDecimal BIRTH_DATE_FLG_ON = BigDecimal.ONE;
    /** 生年月日フラグ OFF */
    public static final BigDecimal BIRTH_DATE_FLG_OFF = BigDecimal.ZERO;

    /*
     * 料金連動フラグ
     */
    /** 料金連動フラグ 0：OFF */
    public static final BigDecimal LINKED_FEE_FLG_OFF = BigDecimal.ZERO;
    /** 料金連動フラグ 1：ON */
    public static final BigDecimal LINKED_FEE_FLG_ON = BigDecimal.ONE;
    
    /*
     * 契約連動フラグ
     */
    /** 契約連動フラグ 0：OFF */
    public static final String CONTRACT_SELECTED_OFF = "0";
    /** 契約連動フラグ 1：ON */
    public static final String CONTRACT_SELECTED_ON = "1";
    
    /*
     * 表示フラグ 0:表示する 1:表示しない
     */
    /** 表示フラグ 0：ON */
    public static final BigDecimal DSP_FLG_ON = BigDecimal.ZERO;
    /** 表示フラグ 1：OFF */
    public static final BigDecimal DSP_FLG_OFF = BigDecimal.ONE;
    
    /*
     * ボタン名表示フラグ
     */
    /** 0:契約する */
    public static final int BUTTON_DISP_FLG_CONTRACT = 0;
    /** 1:解約する */
    public static final int BUTTON_DISP_FLG_TERMINATION = 1;
    /** 2:契約取り消し */
    public static final int BUTTON_DISP_FLG_CANNCEL_CONTRACT = 2;
    /** 3:解約取り消し */
    public static final int BUTTON_DISP_FLG_CANNCEL_TERMINATION = 3;
    /** 4:変更する */
    public static final int BUTTON_DISP_FLG_CANNCEL_CHANGE = 4;
    
    /*
     * ボタン活性/非活性フラグ 0:活性 1:非活性
     */
    /** 0:活性 */
    public static final int DISABLED_BUTTON_FALSE = 0;
    /** 1:非活性 */
    public static final int DISABLED_BUTTON_TRUE = 1;

    /*
     * ボタン選択フラグ 0:選択 1:選択しない
     */
    /** 0:未選択 */
    public static final int BUTTON_SELECTED_OFF = 0;
    /** 1:選択 */
    public static final int BUTTON_SELECTED_ON = 1;
    
    /*
     * 文言ID
     */
    /** 文言ID OPMS-0001 */
    public static final String LANGUAGE_ID_OPMS_0001 = "OPMS-0001";
    /** 文言ID OPMS-0002 */
    public static final String LANGUAGE_ID_OPMS_0002 = "OPMS-0002";
    /** 文言ID OPMS-0003 */
    public static final String LANGUAGE_ID_OPMS_0003 = "OPMS-0003";
    /** 文言ID OPMS-0004 */
    public static final String LANGUAGE_ID_OPMS_0004 = "OPMS-0004";
    /** 文言ID OPMS-0005 */
    public static final String LANGUAGE_ID_OPMS_0005 = "OPMS-0005";
    /** 文言ID OPMS-0006 */
    public static final String LANGUAGE_ID_OPMS_0006 = "OPMS-0006";
    /** 文言ID RFIN-0001 */
    public static final String LANGUAGE_ID_RFIN_0001 = "RFIN-0001";
    /** 文言ID RFIN-0002 */
    public static final String LANGUAGE_ID_RFIN_0002 = "RFIN-0002";
    /** 文言ID RFIN-0003 */
    public static final String LANGUAGE_ID_RFIN_0003 = "RFIN-0003";
    /** 文言ID RFIN-0004 */
    public static final String LANGUAGE_ID_RFIN_0004 = "RFIN-0004";
    /** 文言ID RFIN-0005 */
    public static final String LANGUAGE_ID_RFIN_0005 = "RFIN-0005";
    /** 文言ID RFIN-0006 */
    public static final String LANGUAGE_ID_RFIN_0006 = "RFIN-0006";
    /** 文言ID RFIN-0007 */
    public static final String LANGUAGE_ID_RFIN_0007 = "RFIN-0007";
//  add start yangxg 2010/10/18 
    /** 文言ID PVPC-0001 */
    public static final String LANGUAGE_ID_PVPC_0001 = "PVPC-0001";
// add end yangxg 2010/10/18  
    
	//　重要事項説明画面ID
    public static final String SCREEN_ID_CCT021S = "CCT021S";    
	//　オプションチャンネル契約・解約変更画面ID
    public static final String SCREEN_ID_CCT024S = "CCT024S";
	//　契約確認画面ID
    public static final String SCREEN_ID_CCT026S = "CCT026S";
	//　年齢認証画面ID
    public static final String SCREEN_ID_CCT029S = "CCT029S";
	//　生年月日入力画面ID
    public static final String SCREEN_ID_CCT028S = "CCT028S";
	//　ペイ・パー・ビュー申し込み確認事項画面ID
    public static final String SCREEN_ID_CCT025S = "CCT025S";
	// オプションチャンネル契約・解約期間説明画面ID
    public static final String SCREEN_ID_CCT030S = "CCT030S";
	//　視聴年齢制限付き番組説明画面ID
    public static final String SCREEN_ID_CCT032S = "CCT032S";
//Add start 2010.07.16 M.SUZUKI
     public static final String ERROR_CD = "ERROR_CD";
//Add end 2010.07.16 M.SUZUKI
     /** 受付完了画面 */
     public static final String SCREEN_ID_CCM005S = "CCM005S";
     
//   add start yangxg 2010/10/18
     // ユーザ情報入力画面ID
     public static final String SCREEN_ID_CCM010S = "CCM010S";
//  add end yangxg 2010/10/18
     
//Add start 2010.08.16 yangxg
     /** 項目文言区分　0：すべて */
     public static final String ITEM_WORD_ALL = "0";
     /** 項目文言区分　1：大項目文言 */
     public static final String ITEM_WORD_B = "1";
     /** 項目文言区分　2：中項目文言 */
     public static final String ITEM_WORD_M = "2";
     /** 項目文言区分　3：小項目文言 */
     public static final String ITEM_WORD_S = "3";
//Add end 2010.08.16 yangxg
//Add start 2010.08.24 yangxg
     /** WEBユーザ */
     public static final String USER_WEB = "[web]";
//Add end 2010.08.24 yangxg
     /** 対象区分 1：PPV,2：視聴年齢制限付き番組 */
     public static final int TARGET_PPV = 1;
     /** 対象区分 1：PPV,2：視聴年齢制限付き番組 */
     public static final int TARGET_ADULT = 2;
//Add start 2010.09.03 王京剛
     /** 論理削除フラグ 0：論理削除ではない　1：論理削除 */
     public static final BigDecimal DELETE_FLG_ON = BigDecimal.ZERO;
     /** 論理削除フラグ 0：論理削除ではない　1：論理削除 */
     public static final BigDecimal DELETE_FLG_OFF = BigDecimal.ONE;
//Add end 2010.09.03 王京剛
//Add start 2010.09.03 yangxg 
     /**  マスタ編集画面処理区分 1:登録 2:更新 3:削除*/
     public static final int MASTER_INSERT = 1;
     /**  マスタ編集画面処理区分 1:登録 2:更新 3:削除*/
     public static final int MASTER_UPDATE = 2;
     /**  マスタ編集画面処理区分 1:登録 2:更新 3:削除*/
     public static final int MASTER_DELETE = 3;
//Add end 2010.09.03 yangxg

//   Add start 2010.09.20 yangxg 
     /** 請求確定お知らせメール送信フラグ 有効フラグ 0:OFF 1:ON */
     public static final BigDecimal BILL_MAIL_FLG_OFF = BigDecimal.ZERO;
     /** 請求確定お知らせメール送信フラグ 有効フラグ 0:OFF 1:ON */
     public static final BigDecimal BILL_MAIL_FLG_ON = BigDecimal.ONE;
     
     /** コース存在フラグ 1:存在 0:存在しない*/
     public static final String COURSE_EXIST = "1";
     /** コース存在フラグ 1:存在 0:存在しない */
     public static final String COURSE_NO_EXIST = "0";
     
     /** 申込内容 1：変更申込,２：変更申込取消 ３：変更の変更 */
     public static final int SERVICE_CHANGER_REG = 1;
     /** 申込内容 1：変更申込,２：変更申込取消 ３：変更の変更 */
     public static final int SERVICE_CHANGER_CAN = 2;
     /** 申込内容 1：変更申込,２：変更申込取消 ３：変更の変更 */
     public static final int SERVICE_CHANGER_REREG = 3;

     
     /** コース変更取消機能ON/OFFフラグ */
     public static final BigDecimal COURSE_CHANGE_FLG_ON = BigDecimal.ONE;
     public static final BigDecimal COURSE_CHANGE_FLG_OFF = BigDecimal.ZERO;
//   Add end 2010.09.20 yangxg 
//   Add start 2010.10.15 wangjg 
     /** 端数処理 1:切り上げ 2:切り捨て 3:四捨五入 */
     public static final String FRACTION_FLG_ONE = "1";
     /** 端数処理 1:切り上げ 2:切り捨て 3:四捨五入 */
     public static final String FRACTION_FLG_TWO = "2";
     /** 端数処理 1:切り上げ 2:切り捨て 3:四捨五入 */
     public static final String FRACTION_FLG_THREE = "3";
//   Add end 2010.10.15 wangjg     
// Add start 20110106 M.Suzuki
	// 分散処理管理 処理NO　1:BATCH、2:PRINT
	public static final BigDecimal DISTRIBUTED_MANAGEMENT_BATCH = BigDecimal.ONE;
	public static final BigDecimal DISTRIBUTED_MANAGEMENT_PRINT = new BigDecimal(2);
    // 1時間当たりの分数
    public static final int MIN_PAR_HOUR = 60;
	// 1分当たりの秒数
	public static final int SEC_PAR_MIN = 60;
	// 1秒当たりのミリ秒数
	public static final int MSEC_PAR_SEC = 1000;

	// 
//	/**  帳票ログ_処理種別（1:検索、2:PDF出力、3:CSV出力、4:内容印刷）*/
    /**  帳票ログ_処理種別（0:PDF出力、1:CSV出力）*/
	public static final BigDecimal LOG_REP_SEARCH = new BigDecimal(1);	// TODO PrintDBLogInterceptorが利用しているため削除するまで残す。
//    public static final BigDecimal LOG_REP_PDF = new BigDecimal(2);
    public static final BigDecimal LOG_REP_PDF = new BigDecimal(0);
//    public static final BigDecimal LOG_REP_CSV = new BigDecimal(3);
    public static final BigDecimal LOG_REP_CSV = new BigDecimal(1);
//    public static final BigDecimal LOG_REP_PRINT = new BigDecimal(4);

    /**  帳票ログ_処理種別（画面表示用文言）*/
    public static final String LOG_REP_SEARCH_TXT = "検索";
    public static final String LOG_REP_PDF_TXT = "帳票出力";
    public static final String LOG_REP_CSV_TXT = "CSV出力";
    public static final String LOG_REP_PRINT_TXT = "内容印刷";

    /** 帳票ログ 設定値区切り文字 */
    public static final String LOG_REP_VALUE_DELIMITER = "／";
    /** ログ参照最大件数*/
    public static final BigDecimal LOG_MAX_ROW = new BigDecimal(1000); 
    /** ログ種別（1：ログイン/ログアウト、2：参照、3：変更、4：帳票、5：バッチ処理） */
    public static final BigDecimal LOG_TYPE_L_L = new BigDecimal(1);
    public static final BigDecimal LOG_TYPE_REF = new BigDecimal(2);
    public static final BigDecimal LOG_TYPE_CHG = new BigDecimal(3);    
    public static final BigDecimal LOG_TYPE_REP = new BigDecimal(4);
    public static final BigDecimal LOG_TYPE_BAT = new BigDecimal(5);    
// Add end 20110106 M.Suzuki
// Add start 20110112 yangxg
    /** 抽出種別 （1:CSV）*/
    public static final BigDecimal EXTRACTION_TYPE_CSV = new BigDecimal(1);
    /** 帳票ID:MELO0001 */
    public static final String PRINT_ID_MELO0001 = "MELO0001";
    /** リスト出力条件属性 0:任意型 1:数値型 2:日付型（6) 3:日付型（8） 4:コード型 5:工事班検索 6:業者検索 7:班区分検索 8:支店検索*/
    public static final BigDecimal CONDITION_INPUT_TYPE_FREE = new BigDecimal(0);
    public static final BigDecimal CONDITION_INPUT_TYPE_NUMBER = new BigDecimal(1);
    public static final BigDecimal CONDITION_INPUT_TYPE_DATEYM = new BigDecimal(2);
    public static final BigDecimal CONDITION_INPUT_TYPE_DATEYMD = new BigDecimal(3);
    public static final BigDecimal CONDITION_INPUT_TYPE_CODE = new BigDecimal(4);
    public static final BigDecimal CONDITION_INPUT_TYPE_CONSTRUCTION_TEAM = new BigDecimal(5);
    public static final BigDecimal CONDITION_INPUT_TYPE_TRADER_GROUP = new BigDecimal(6);
    public static final BigDecimal CONDITION_INPUT_TYPE_TEAM_DIV = new BigDecimal(7);
    public static final BigDecimal CONDITION_INPUT_TYPE_BRANCH = new BigDecimal(8);
    
    /** 選択フラグ 0:未選択 1:選択*/
    public static final String SELECTED = "1";
    public static final String UNSELECTED = "0";
    
    /** #PRINT_ID# */
    public static final String PRINT_ID = "#PRINT_ID#";
    
    /** 端末セキュリティチェック 0:未チェック 1:チェック準備 2:チェック完了 */
    public static final String SECURITY_CHECK_NONE = "0";
    public static final String SECURITY_CHECK_READY = "1";
    public static final String SECURITY_CHECK_DONE = "2";
    
    /** リスト出力結果用処理区分 1:削除 2:CSV出力 */
    public static final String LIST_OUTPUT_PROCESS_DEL = "1";
    public static final String LIST_OUTPUT_PROCESS_CSV = "2";
// Add end   20110112 yangxg    
//add start 20110120 lixy 新工事管理
    /** 顧客状態 ０：未契約者／１：契約者／２：解約者／９：仮番号*/
    public static final String CUSTOMER_STATUS_CODE0 = "0";
    public static final String CUSTOMER_STATUS_CODE1  = "1";
    
    // Add start 20121210 A.Takeuchi JIRA:STITEC-3373
    public static final String CUSTOMER_STATUS_CODE2  = "2";
    // Add end 20121210 A.Takeuchi JIRA:STITEC-3373
    
    public static final String CUSTOMER_STATUS_CODE9  = "9";
    public static final String CUSTOMER_STATUS0 = "未契約者";
    public static final String CUSTOMER_STATUS1  = "契約者";
    public static final String CUSTOMER_STATUS9  = "仮番号";
//add end 20110120 lixy 新工事管理
// Add start 20130122  i.shibuya [JIRA:STITEC-4035] 
    public static final String CUSTOMER_STATUS2  = "解約者";
// Add end   20130122  i.shibuya [JIRA:STITEC-4035]
    
//add start 20110120 WANGJG 新工事管理
    /** 工事機器種別*/
    public static final String EQUIPMENT_DIV1 = "1";
    public static final String EQUIPMENT_DIV3 = "3";
    public static final String EQUIPMENT_DIV4 = "4";
    public static final String EQUIPMENT_DIV5 = "5";
    public static final String EQUIPMENT_DIV6 = "6";
    public static final String EQUIPMENT_DIV8 = "8";
    /** 工事指示種別*/
    public static final String DIRECTION_DIV2 = "2";
    public static final String DIRECTION_DIV3 = "3";
    public static final String DIRECTION_DIV4 = "4";
    public static final String DIRECTION_DIV7 = "7";
    public static final String DIRECTION_DIV8 = "8";
    /** add start 20120314 liuzh */
    public static final String DIRECTION_DIV1 = "1";
    public static final String DIRECTION_DIV5 = "5";
    public static final String DIRECTION_DIV6 = "6";
    /** 工事指示種別名称*/
    public static final String DIRECTION_DIV_NAME1 = "その他工事";//その他工事
    public static final String DIRECTION_DIV_NAME2 = "CATVアナログ工事";//CATVアナログ工事
    public static final String DIRECTION_DIV_NAME3 = "CATVデジタル工事";//CATVデジタル工事
    public static final String DIRECTION_DIV_NAME4 = "NET工事";//NET工事
    public static final String DIRECTION_DIV_NAME5 = "MD工事";//MD工事
    public static final String DIRECTION_DIV_NAME6 = "ケーブルプラス電話工事";//ケーブルプラス電話工事
    public static final String DIRECTION_DIV_NAME7 = "WiMAX";//WiMAX
    public static final String DIRECTION_DIV_NAME8 = "VoIP";//VoIP
    
    /** add end 20120314 liuzh */
    /** 工事機器種別名称*/
    public static final String EQUIPMENT_DIV1_NAME = "HT";
    public static final String EQUIPMENT_DIV2_NAME = "STB";
    public static final String EQUIPMENT_DIV3_NAME = "B-CAS";
    public static final String EQUIPMENT_DIV4_NAME = "C-CAS";
    public static final String EQUIPMENT_DIV5_NAME = "NET";
    public static final String EQUIPMENT_DIV6_NAME = "ONU";
    public static final String EQUIPMENT_DIV7_NAME = "TA";
    
    /** 工事履歴出力フラグ*/
    public static final String CONSTRUCTIONHISTORYOUTFLG1 = "1";
    public static final String CONSTRUCTIONHISTORYOUTFLG5 = "2";
    public static final String CONSTRUCTIONHISTORYOUTFLG5_ADD = "3";

    /** 工事履歴時間枠*/
    public static final String CONSTRUCTIONHISTORFRAME = "複数";
//add end 20110120 WANGJG 新工事管理
    

    
    /**テーブル行選択プラグイン**/
    /**onColor: 選択を意味する色**/
    public static final String ON_COLOR = "#ff0000";
    /**offColor: 非選択を意味する色**/
    public static final String OFF_COLOR = "#000000";
    /**onBackGroundColor: 選択を意味する背景色**/
    public static final String ON_BACKGROUND_COLOR = "#ffffff";
    /**offBackGroundColor: 非選択を意味する背景色**/
    public static final String OFF_BACKGROUND_COLOR = "#ffffff";

    /**onBackGroundColor: 選択を意味する背景色**/
    public static final String ON_BACKGROUND_COLOR_SELECT_SINGLE = "#E0FFE0";
    
    /** 権限 ０：非表示／１：リードオンリー／２：無条件利用可能／３以上：条件付き利用可能*/
    public static final String RIGHT0 = "0" ;
    public static final String RIGHT1 = "1" ;
    public static final String RIGHT2 = "2" ;
    public static final String RIGHT3 = "3" ;
    //１ 参照権限
    public static final String USER_RIGHT1 = "1" ;
    //２ 営業権限
    public static final String USER_RIGHT2 = "2" ;
    //３ カスタマー権限
    public static final String USER_RIGHT3 = "3" ;
    //４ 工事班権限
    public static final String USER_RIGHT4 = "4" ;
    //５ 工事会社権限
    public static final String USER_RIGHT5 = "5" ;
    //６ 担当権限
    public static final String USER_RIGHT6 = "6" ;
    //７ 課長権限
    public static final String USER_RIGHT7 = "7" ;
    //８ 管理者権限
    public static final String USER_RIGHT8 = "8" ;
    public static final String NEED_PASSWORD_CONFIRM = "1";
    public static final String PASSWORD_CONFIRM_PREFIX = "pw_";
    /** 画面ID**/
    
    /** リスト出力結果 */
    public static final String SCREEN_ID_MELO0001 = "MELO0001";
    /** リスト出力結果取得 */
    public static final String SCREEN_ID_MELO0002 = "MELO0002";
    /**工事予定検索 */
    public static final String SCREEN_ID_MSKJ0004 = "MSKJ0004";
    /**工事予定入力 */
    public static final String SCREEN_ID_MEKJ0001 = "MEKJ0001";
    /**工事指示機器入力*/
    public static final String SCREEN_ID_MEKJ0002 = "MEKJ0002";
    /**工事予定一覧（週）*/
    public static final String SCREEN_ID_MSKJ0001 = "MSKJ0001";
    /**工事予定一覧（日）*/
    public static final String SCREEN_ID_MSKJ0002 = "MSKJ0002";
    /**工事予定一覧（日）*/
    public static final String SCREEN_ID_MSKJ0003 = "MSKJ0003";
    /**工事予定移動*/
    public static final String SCREEN_ID_SEKJ0001 = "SEKJ0001";
    /**工事原価検索 */
    public static final String SCREEN_ID_MSGK0001 = "MSGK0001";
    /**工事原価入力*/
    public static final String SCREEN_ID_MEGK0001 = "MEGK0001";
    /** 工事履歴 */
    public static final String SCREEN_ID_MSKJ0005 = "MSKJ0005";
    
    /**デフォールトファンクションＩＤ**/
    public static final String DEFAULT_FUNCTION_ID = "99999999";
    
    /**工事予定検索のファンクションＩＤ**/
    /**全選択**/
    public static final String FUNCTION_ID_00000001 = "00000001";
    /**全選択解除**/
    public static final String FUNCTION_ID_00000002 = "00000002";
    /**工事班詳細**/
    public static final String FUNCTION_ID_00000003 = "00000003";
    /**工事内容詳細**/
    public static final String FUNCTION_ID_00000004 = "00000004";
    /**工事予定シール印刷**/
    public static final String FUNCTION_ID_00000005 = "00000005";
    /**工事指示機器入力**/
    public static final String FUNCTION_ID_00000006 = "00000006";
    /**工事指示書印刷**/
    public static final String FUNCTION_ID_00000007 = "00000007";
    /**チェックリスト印刷**/
    public static final String FUNCTION_ID_00000008 = "00000008";
    /**チェックリスト登録**/
    public static final String FUNCTION_ID_00000009 = "00000009";
    /**CSV出力**/
    public static final String FUNCTION_ID_00000010 = "00000010";
    /**工事予定一覧**/
    public static final String FUNCTION_ID_00000011 = "00000011";
    
    
    /**工事原価入力のファンクションＩＤ**/
    /**工事会社入力完了**/
    public static final String C_FUNCTION_ID_00000001 = "00000001";
    /**支店入力完了**/
    public static final String C_FUNCTION_ID_00000002 = "00000002";
    /**登録**/
    public static final String C_FUNCTION_ID_00000003 = "00000003";
    /**原価単価検索**/
    public static final String C_FUNCTION_ID_10000001 = "10000001";
    

    /** PDF ID**/
    
    /**工事予定シール印刷 */
    public static final String PDF_ID_MPKP0001 = "MPKP0001";
    /**チェックリスト印刷 */
    public static final String PDF_ID_MPKP0002 = "MPKP0002";
    /**工事原価明細書 */
    public static final String PDF_ID_MSGP0001 = "MSGP0001";
    /**業者支払明細書 */
    public static final String PDF_ID_MSGP0002 = "MSGP0002";
    /**支障移転出来高集計表 */
    public static final String PDF_ID_MSGP0003 = "MSGP0003";
    /**デフォールト参照用_支店スコープ */
    public static final String DEFAULT_RBRANCH_SCOPE = "@@@@@@";
    /**デフォールト参照用_班区分スコープ */
    public static final String DEFAULT_GROUP_DIVISION_SCOPE = "@@";
    /**デフォールト参照用_工事班スコープ */
    public static final String DEFAULT_GROUP_SCOPE = "@@@";
    /**デフォールト参照用_工事会社スコープ */
    public static final String DEFAULT_COMPANY_SCOPE = "@@@@@@";
    /**デフォールト所属用_支店 */
    public static final String AFF_DEFAULT_RBRANCH = "000000";
    /**デフォールト所属用_班区分 */
    public static final String AFF_DEFAULT_GROUP_DIVISION = "00";
    /**デフォールト所属用_班区分 */
    public static final String AFF_DEFAULT_GROUP = "000";
    /**デフォールト所属用_班区分 */
    public static final String AFF_DEFAULT_COMPANY = "000000";
    
    /**管理用所属支店コード */
    public static final String ADMIN_BRANCH_CD = "000000";
    /** 工事開始フラグ 1:開始工事枠*/
    public static final String CONSTRUCTION_START_DIV = "1";
    
//  add start 20110129 WANGN 新工事管理
    /** 指示状態 */
    public static final String INDICATION_STATUS_0 = "0";  // 工事前
    public static final String INDICATION_STATUS_4 = "4";  // チェック前
    public static final String INDICATION_STATUS_1 = "1";  // 機器反映前
    public static final String INDICATION_STATUS_3 = "3";  // 工事完了
    public static final String INDICATION_STATUS_9 = "9";  // 未完了
    public static final String INDICATION_STATUS_5 = "5";  // 延期
    /**          add start 20120314 liuzh          */
    public static final String INDICATION_STATUS_2 = "2";  // 契約反映前
    public static final String INDICATION_STATUS_NAME2 = "契約反映前";     // 契約反映前
    /**          end start 20120314 liuzh          */
    public static final String INDICATION_STATUS_NAME0 = "工事前";     // 工事前
    public static final String INDICATION_STATUS_NAME4 = "チェック前";   // チェック前
    public static final String INDICATION_STATUS_NAME1 = "機器反映前";  // 機器反映前
    public static final String INDICATION_STATUS_NAME3 = "工事完了";   // 工事完了
    public static final String INDICATION_STATUS_NAME9 = "未完了";     // 未完了
    public static final String INDICATION_STATUS_NAME5 = "延期";       // 延期
    public static final String EQUIPMENT_INPUT_1 = "1";  // 済
    public static final String EQUIPMENT_INPUT_2 = "2";  // 未
//  add start 20110129 WANGN 新工事管理
    /** カンマ */
    public static final String COMMA = ",";
    /** スラッシュ */
    public static final String SLASH = "/";
    /** ピリオド */
    public static final String PERIOD = ".";
    
    /** 画面の処理区分 1:新規 2:変更*/
    public static final String MODE_SINKI = "1";
    public static final String MODE_HENKOU = "2";
    
    /**顧客住所区分1:契約者場所 2:設置場所*/
    public static final String CUSTOMER_ADDRESS_CONTRACT ="1";
    public static final String CUSTOMER_ADDRESS_SETTING ="2";
   
    
    /**画面項目の入力可否フラグ（選択フラグ）0:入力又は選択可 1:入力又は選択不可*/
    public static final String INPUT_SELECT_ON = "0";
    public static final String INPUT_SELECT_OFF = "1";

    // 20110130 Syukoryo 追加　Start
    /** 一覧色 0:指示状態、1:備考１、2:備考2、3:備考3 */
    public static final String LIST_COLOR_SIJIJYOTAI = "0";
    /** 一覧色 0:指示状態、1:備考１、2:備考2、3:備考3 */
    public static final String LIST_COLOR_BIKO1 = "1";
    /** 一覧色 0:指示状態、1:備考１、2:備考2、3:備考3 */
    public static final String LIST_COLOR_BIKO2 = "2";
    /** 一覧色 0:指示状態、1:備考１、2:備考2、3:備考3 */
    public static final String LIST_COLOR_BIKO3 = "3";
    /** 工事枠種別（１：複数工事枠　２：時間枠工事） */
    public static final String CONSTRUCTION_TYPE_PLURALS = "1";
    /** 工事枠種別（１：複数工事枠　２：時間枠工事） */
    public static final String CONSTRUCTION_TYPE_TIMES = "2";
	/** 初期検索フラグ　０：メニューから検索しない　１：検索する */
    public static final String INIT_DOSEARCH_FLG_DONOT = "0";
	/** 初期検索フラグ　０：メニューから検索しない　１：検索する */
    public static final String INIT_DOSEARCH_FLG_DO = "1";
	/** 月移動 前月 */
	public static final String DO_ACTION_KBN_BM = "BM";
	/** 月移動 翌月 */
	public static final String DO_ACTION_KBN_AM = "AM";
	/** 週移動 ７日前 */
	public static final String DO_ACTION_KBN_BW = "BW";
	/** 週移動 ７日後 */
	public static final String DO_ACTION_KBN_AW = "AW";
	/** 日移動 １日前 */
	public static final String DO_ACTION_KBN_BD = "BD";
	/** 日移動 １日後 */
	public static final String DO_ACTION_KBN_AD = "AD";
	/** 工事予定日から７日まで */
	public static final String DO_ACTION_KBN_CW = "CW";
	/** 工事予定日 */
	public static final String DO_ACTION_KBN_CD = "CD";
	/** 工事予定日の月 */
	public static final String DO_ACTION_KBN_CM = "CM";
	/** 再検索 */
	public static final String DO_ACTION_KBN_RESEARCH = "RS";
	/** 表示モード W:週、D:日、M:月 */
	public static final String CONSTRUCTION_DISP_MODE_W = "W";
	/** 表示モード W:週、D:日、M:月 */
	public static final String CONSTRUCTION_DISP_MODE_D = "D";
	/** 表示モード W:週、D:日、M:月 */
	public static final String CONSTRUCTION_DISP_MODE_M = "M";
	/** 工事枠属性＝H：標準工事枠/T：追加工事枠/I：予約入力中/Y：休み/Z：工事非稼働枠/R：予約済み */
	public static final String CONSTRUCTION_WAKU_PROPERTY_H = "H";
	/** 工事枠属性＝H：標準工事枠/T：追加工事枠/I：予約入力中/Y：休み/Z：工事非稼働枠/R：予約済み */
	public static final String CONSTRUCTION_WAKU_PROPERTY_T = "T";
	/** 工事枠属性＝H：標準工事枠/T：追加工事枠/I：予約入力中/Y：休み/Z：工事非稼働枠/R：予約済み */
	public static final String CONSTRUCTION_WAKU_PROPERTY_I = "I";
	/** 工事枠属性＝H：標準工事枠/T：追加工事枠/I：予約入力中/Y：休み/Z：工事非稼働枠/R：予約済み */
	public static final String CONSTRUCTION_WAKU_PROPERTY_Y = "Y";
	/** 工事枠属性＝H：標準工事枠/T：追加工事枠/I：予約入力中/Y：休み/Z：工事非稼働枠/R：予約済み */
	public static final String CONSTRUCTION_WAKU_PROPERTY_Z = "Z";
	/** 工事枠属性＝H：標準工事枠/T：追加工事枠/I：予約入力中/Y：休み/Z：工事非稼働枠/R：予約済み */
	public static final String CONSTRUCTION_WAKU_PROPERTY_R = "R";
    // 20110130 Syukoryo 追加　End 
    // 20110413 Syukoryo 追加　start 
	/** 備考１：ユーザコメントコードの先頭が'194' */
	public static final String CONSTRUCTION_COLOR_BIKO1 = "194";
	/** 備考２：ユーザコメントコードの先頭が'195' */
	public static final String CONSTRUCTION_COLOR_BIKO2 = "195";
	/** 備考３：ユーザコメントコードの先頭が'196' */
	public static final String CONSTRUCTION_COLOR_BIKO3 = "196";
    // 20110413 Syukoryo 追加　End 
	
	
	/** 休日区分 0:出勤/1:休日*/
	public static final BigDecimal REST_DAY_DIV_WORKING = new BigDecimal("0");
	/** 休日区分 0:出勤/1:休日*/
	public static final BigDecimal REST_DAY_DIV_REST = new BigDecimal("1");
	
	/** 重複不可情報 1:ＦＴＴＨ 2:FSプライマリ電話 3:SBプライマリ電話 */
	public static final String NO_REPEAT_DIV_FTTH = "1";
	public static final String NO_REPEAT_DIV_FS = "2";
	public static final String NO_REPEAT_DIV_SB = "3";
	
	/** コメントコード V020021：SBプライマリ V020015：FSプライマリ*/
	public static final String COMENT_DIV_SB_PRIMARY = "V020021";
	public static final String COMENT_DIV_FS_PRIMARY = "V020015";
	
	/**工事コード区分 01：コメントコード 02:工事種別*/
	public static final String CONSTRUCTION_CODE_DIV_COMMENT = "01";
	public static final String CONSTRUCTION_CODE_DIV_CNSTYPE = "02";
	
	/** 工事区分 0016:交換 0015:プライマリ移転*/
	public static final String CONSTRUCTION_DIV_EXCHANGE = "0016";
	public static final String CONSTRUCTION_DIV_PRIMARY_MOVE = "0015";
	
	/** チェックリスト登録フラグ１ */
	public static final String NEED_CHECK = "1";
	/** チェックリスト登録フラグ２ */
	public static final String CHECK_OK = "2";
	
	/** 連携対象フラグ 0：連携対象 1：連携対象外 */
	public static final BigDecimal UNITE_TARGET_YES = BigDecimal.ZERO;
	public static final BigDecimal UNITE_TARGET_NOT = BigDecimal.ONE;
	
//  add start 20110212 WANGN 新工事管理
    /** 原価状態 */
    public static final String COST_STATUS_0 = "0";  // 入力前						
    public static final String COST_STATUS_1 = "1";  // 仮締め前
    public static final String COST_STATUS_2 = "2";  // 本締め前
    public static final String COST_STATUS_3 = "3";  // 完了
    public static final String COST_STATUS_NAME_0 = "入力前";   // 入力前						
    public static final String COST_STATUS_NAME_1 = "仮締め前";  // 仮締め前
    public static final String COST_STATUS_NAME_2 = "本締め前";  // 本締め前
    public static final String COST_STATUS_NAME_3 = "完了";     // 完了
    /** 工事会社完了 */
    public static final String COMPANY_END_0 = "0";  // 未	
    public static final String COMPANY_END_1 = "1";  // 済
    public static final String COMPANY_END_NAME_0 = "未";  // 未	
    public static final String COMPANY_END_NAME_1 = "済";  // 済	
    /** 支店完了 */
    public static final String BRANCH_END_0 = "0";  // 未	
    public static final String BRANCH_END_1 = "1";  // 済
    public static final String BRANCH_END_NAME_0 = "未";  // 未	
    public static final String BRANCH_END_NAME_1 = "済";  // 済
//  add end 20110212 WANGN 新工事管理
    
    /** 開始フラグ 1:開始工事枠 */
    public static final String CONSTRUCTION_START_FALG_START = "1";
    
    /** 解除フラグ 0:解除可 1:解除可/不可 */
    public static final String RELEASE_FLG_YES = "0";
    public static final String RELEASE_FLG_NO = "1";
    
    /** アクセス日時が未設定(00000000000000) */
    public static final String UNDEFINE_ACCESSTIME = "00000000000000";
    
    /** Sコードが未設定(0000000000) */
    public static final String UNDEFINE_SCODE = "0000000000";
    
    /** AM PM */
    public static final String STRING_AM = "AM";
    public static final String STRING_PM = "PM";
    
    /** 顧客確定フラグ0:null 1:success 2: fail */
    public static final String CUSTOMER_CLICK_NULL = "0";
    public static final String CUSTOMER_CLICK_SUCCESS = "1";
    public static final String CUSTOMER_CLICK_FAIL = "2";
    
    /** 工事予定入力削除フラグ 1:削除 2:登録削除*/
    public static final String CONSTRUCTION_DEL_DIV_DELETE = "1";
    public static final String CONSTRUCTION_DEL_DIV_INSERT = "2";
    
    /** クリアフラグ */
    public static final String CLEAR_FLG = "1";
    public static final String CHANGE_FLG = "0";
    
    /** 追加 */
    public static final String STRING_ADD = "追加";
    

    /** 顧客状態 ０：未契約者／１：契約者／２：解約者*/
    public static final BigDecimal CUSTOMER_STATUS_NOCONTRACT = new BigDecimal(0);
    public static final BigDecimal CUSTOMER_STATUS_CONTRACT = new BigDecimal(1);
    public static final BigDecimal CUSTOMER_STATUS_TERMINATION = new BigDecimal(2);
    
    /** セキュリティダイアログ */
    public static final String PASSWORD_CONFIRM_NO = "0";
    public static final String PASSWORD_CONFIRM_OK = "1";
    
    /** 顧客状態区分 */
    public static final BigDecimal CUSTOMER_STATUS_DIV = new BigDecimal(602);
    /** HE地区区分 */
    public static final String HE_AREA_DIV = "583";
    /** 検索区分１：主キー検索　２：条件検索 */
    public static final String SEARCH_MODEL_PRIMARY_KEY = "1";
    public static final String SEARCH_MODEL_CONDITION = "2";
    
    /** 時間指定有無 */
    public static final String TIME_APPOINT_DIV_ZERO = "0";
    public static final String TIME_APPOINT_DIV_ONE = "1";
    public static final String TIME_APPOINT_DIV_ZERO_NAME = "無";
    public static final String TIME_APPOINT_DIV_ONE_NAME = "有";

    /** 有効フラグ 0:有効 1:無効 */
    public static final String VALID_FLG_YES = "0";
    /** 有効フラグ 0:有効 1:無効 */
    public static final String VALID_FLG_NO = "1";
    
    /** 指示状態フラグ  0：減少可 1：減少不可*/
    public static final String INSTRUCTION_STATUS_FLG_DECREASE_YES = "0";
    public static final String INSTRUCTION_STATUS_FLG_DECREASE_NO = "1";

    /** 業務を中断させない特別なエラーコード文字列配列 */
    public static final String[] SPECIAL_ERROR = new String[]{"ORA-02068","ORA-04068","ORA-04061"};

	/** 通常ログインモード */
	public static final String NORMAL_LOGIN = "normalLogin";
	/** 簡単ログインモード */
	public static final String EASY_LOGIN = "easylogin";

	public static final String PC_JUMP_PAGE_NAME = "pcJumpPage";

	/** 文字列 */
	public static final String BLANK = "";

	/** 処理モード 1：新規登録／2：修正／3：削除／4：取消 */
	public static final String MODE_INSERT = "1";
	/** 処理モード 1：新規登録／2：修正／3：削除／4：取消 */
	public static final String MODE_UPDATE = "2";
	/** 処理モード 1：新規登録／2：修正／3：削除／4：取消 */
	public static final String MODE_DELETE = "3";
	/** 処理モード 1：新規登録／2：修正／3：削除／4：取消 */
	public static final String MODE_CANCEL = "4";
	
    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_OTHER = new BigDecimal("1");
    public static final String INSTRUCTION_TYPE_OTHER_VALUE = "その他工事";

    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_ANALOG = new BigDecimal("2");
    public static final String INSTRUCTION_TYPE_ANALOG_VALUE ="CATVアナログ工事";

    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_DIGITAL = new BigDecimal("3");
    public static final String INSTRUCTION_TYPE_DIGITAL_VALUE ="CATVデジタル工事";

    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_NET = new BigDecimal("4");
    public static final String INSTRUCTION_TYPE_NET_VALUE ="NET工事";

    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_MD = new BigDecimal("5");
    public static final String INSTRUCTION_TYPE_MD_VALUE ="MD工事";
    
    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_CABLE = new BigDecimal("6");
    public static final String INSTRUCTION_TYPE_CABLE_VALUE ="ケーブルプラス電話工事";

    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_WIMAX = new BigDecimal("7");
    public static final String INSTRUCTION_TYPE_WIMAX_VALUE ="WiMAX工事";

    /** 工事指示種別 1:その他工事/2:アナログ工事/3:デジタル工事/4:NET工事/5:MD工事/6:ケーブルプラス電話工事/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_VOIP = new BigDecimal("8");
    public static final String INSTRUCTION_TYPE_VOIP_VALUE ="VoIP工事";
    
    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_NONE = new BigDecimal("0");
    public static final String EQU_TYPE_NONE_VALUE = "その他";

    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_HT = new BigDecimal("1");
    public static final String EQU_TYPE_HT_VALUE = "HT";

    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_BS_STB = new BigDecimal("2");
    public static final String EQU_TYPE_BS_STB_VALUE = "BS-STB";

    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_STB = new BigDecimal("3");
    public static final String EQU_TYPE_STB_VALUE = "STB";

    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_CCAS = new BigDecimal("4");
    public static final String EQU_TYPE_CCAS_VALUE = "C-CAS";

    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_BCAS = new BigDecimal("5");
    public static final String EQU_TYPE_BCAS_VALUE = "B-CAS";

    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_MODEM = new BigDecimal("6");
    public static final String EQU_TYPE_MODEM_VALUE_EMTA = "EMTA";
    public static final String EQU_TYPE_MODEM_VALUE_MODEM = "モデム";

    /** 工事機器種別 0：その他機器/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:モデム/7:MD */
    public static final BigDecimal EQU_TYPE_MD = new BigDecimal("7");
    public static final String EQU_TYPE_MD_VALUE = "MD";


    /** 工事指示内容 1：設置／2：撤去／3：交換／4：確認／5：移転*/
    public static final BigDecimal INSTRUCTION_CONTENT_SETTING = new BigDecimal("1");
    public static final String INSTRUCTION_CONTENT_SETTING_VALUE = "設置";

    /** 工事指示内容 1：設置／2：撤去／3：交換／4：確認／5：移転*/
    public static final BigDecimal INSTRUCTION_CONTENT_REMOVE = new BigDecimal("2");
    public static final String INSTRUCTION_CONTENT_REMOVE_VALUE = "撤去";

    /** 工事指示内容 1：設置／2：撤去／3：交換／4：確認／5：移転*/
    public static final BigDecimal INSTRUCTION_CONTENT_CAHNGE = new BigDecimal("3");
    public static final String INSTRUCTION_CONTENT_CAHNGE_VALUE = "交換";
    
    /** 工事指示内容 1：設置／2：撤去／3：交換／4：確認／5：移転*/
    public static final BigDecimal INSTRUCTION_CONTENT_CONFIRM = new BigDecimal("4");
    public static final String INSTRUCTION_CONTENT_CONFIRM_VALUE = "確認";

    /** 工事指示内容 1：設置／2：撤去／3：交換／4：確認／5：移転*/
    public static final BigDecimal INSTRUCTION_CONTENT_MOVE = new BigDecimal("5");
    public static final String INSTRUCTION_CONTENT_MOVE_VALUE = "移転";
    
   /** 0:通常／1:当日依頼 */
    public static final BigDecimal REQUEST_NORMAL = new BigDecimal("0");
    public static final BigDecimal REQUEST_TODAY = new BigDecimal("1");
    
    
    /** 0:加入者工事 1:メンテナンス工事 */
    public static final BigDecimal CONSTRUCTION_ADD= new BigDecimal("0");
    public static final String CONSTRUCTION_ADD_VALUE= "加入者工事";
    public static final BigDecimal CONSTRUCTION_MAINTAIN = new BigDecimal("1");
    public static final String CONSTRUCTION_MAINTAIN_VALUE = "メンテナンス工事 ";
    
    /** 契約種別 0：通常契約  1：簡易契約  2：一時金 */
    public static final BigDecimal CONTRACT_TYPE_NORMAL = new BigDecimal("0");
    public static final BigDecimal CONTRACT_TYPE_SIMPLE = new BigDecimal("1");
    public static final BigDecimal CONTRACT_TYPE_ONCE = new BigDecimal("2");
    /** 契約種別 区分 3：削除 */
    public static final BigDecimal CONTRACT_TYPE_DELETE = new BigDecimal("2");
    
    /** 翌月開始フラグ　1：翌月開始　0：なし */
    public static final BigDecimal NEXT_MONTH_START_NG = new BigDecimal("0");
    public static final BigDecimal NEXT_MONTH_START_OK = new BigDecimal("1");
    
    /** ＶＯＤ申込フラグ 0:なし　1:あり */
    public static final String VOD_NO = "0";
    public static final String VOD_YES = "1";
    

    /** B-CAS 0:なし　1:あり */
    public static final String B_CAS_NO = "0";
    public static final String B_CAS_YES = "1";
    
    /** C-CAS 0:なし　1:あり */
    public static final String C_CAS_NO = "0";
    public static final String C_CAS_YES = "1";
    
    /** 乗換区分 0：乗換可／1：乗換不可: */
    public static final BigDecimal TRANSFER_YES = new BigDecimal("0");
    /** 乗換区分 0：乗換可／1：乗換不可: */
    public static final BigDecimal TRANSFER_NO = new BigDecimal("1");
    
    
    /** 端末チェック 0:未チェック 1:チェック準備 2:チェック完了 */
    public static final String CHECK_NONE = "0";
    public static final String CHECK_READY = "1";
    public static final String CHECK_DONE = "2";


	/** 編集区分 1：新規登録／2：変更／3：削除／4：取消  ／5：処理なし */
	public static final String MODE_EDIT_DIV_INSERT = "1";
	/** 編集区分 1：新規登録／2：変更／3：削除／4：取消  ／5：処理なし */
	public static final String MODE_EDIT_DIV_UPDATE = "2";
	/** 編集区分 1：新規登録／2：変更／3：削除／4：取消  ／5：処理なし */
	public static final String MODE_EDIT_DIV_DELETE = "3";
	/** 編集区分 1：新規登録／2：変更／3：削除／4：取消  ／5：処理なし */
	public static final String MODE_EDIT_DIV_CANCEL = "4";
	/** 編集区分 1：新規登録／2：変更／3：削除／4：取消  ／5：処理なし */
	public static final String MODE_EDIT_DIV_NULL = "5";
    
	
      
  
//  add start 20120314 YUH 契約内容確認
    /** 定数(String) */
    public static final String TEISUU_STRING_ZERO = new String("0");
    public static final String TEISUU_STRING_ONE = new String("1");
    public static final String TEISUU_STRING_TWO = new String("2");
    public static final String TEISUU_STRING_THREE = new String("3");
    public static final String TEISUU_STRING_FOUR = new String("4");
    public static final String TEISUU_STRING_FIVE = new String("5");
    /** 定数(int) */
    public static final int TEISUU_INT_ZERO = 0;
    /** 定数(BigDecimal) */
    public static final BigDecimal TEISUU_BIGDECIMAL_ZERO = new BigDecimal("0");
    public static final BigDecimal TEISUU_BIGDECIMAL_ONE = new BigDecimal("1");
    public static final BigDecimal TEISUU_BIGDECIMAL_TWO = new BigDecimal("2");
    public static final BigDecimal TEISUU_BIGDECIMAL_THREE = new BigDecimal("3");
    public static final BigDecimal TEISUU_BIGDECIMAL_FOUR = new BigDecimal("4");
    public static final BigDecimal TEISUU_BIGDECIMAL_FIVE = new BigDecimal("5");
    public static final BigDecimal TEISUU_BIGDECIMAL_SIX = new BigDecimal("6");
//  add end 20120314 YUH 契約内容確認
    
    
    
	
	//liuzh ==========================add
	/** 受付可能工事 0:加入者工事 1:メンテナンス工事*/
	public static final String RECEIPTABLE_CONSTRUCION_0 = "0";
	public static final String RECEIPTABLE_CONSTRUCION_1 = "1";
	public static final String RECEIPTABLE_CONSTRUCION_9 = "9";
	public static final String RECEIPTABLE_CONSTRUCION_NAME_0 = "加入者工事";
	public static final String RECEIPTABLE_CONSTRUCION_NAME_1 = "メンテナンス工事";
	
	/** 処理モード 1:新規 2:修正 3:削除 4:取消*/
	public static final String MODEL_INSERT = "1";
	public static final String MODEL_UPDATE = "2";
	public static final String MODEL_DELETE = "3";
	public static final String MODEL_CANCEL = "4";
	
	/** 工事機器種別*/
	
    public static final String EQUIPMENT_CON1 = "1";
    public static final String EQUIPMENT_CON2 = "2";
    public static final String EQUIPMENT_CON3 = "3";
    public static final String EQUIPMENT_CON4 = "4";
    public static final String EQUIPMENT_CON5 = "5";
    public static final String EQUIPMENT_CON6 = "6";
    public static final String EQUIPMENT_CON7 = "7";
    /** 工事機器種別名称*/
    public static final String EQUIPMENT_CON_NAME1 = "HT";
    public static final String EQUIPMENT_CON_NAME2 = "BS-STB";
    public static final String EQUIPMENT_CON_NAME3 = "STB";
    public static final String EQUIPMENT_CON_NAME4 = "C-CAS";
    public static final String EQUIPMENT_CON_NAME5 = "B-CAS";
    public static final String EQUIPMENT_CON_NAME6 = "モデム";
    public static final String EQUIPMENT_CON_NAME7 = "MD";
    /**工事指示内容*/
    public static final String CONSTRUCION_CONTENT1 = "1";
    public static final String CONSTRUCION_CONTENT2 = "2";
    public static final String CONSTRUCION_CONTENT3 = "3";
    public static final String CONSTRUCION_CONTENT4 = "4";
    public static final String CONSTRUCION_CONTENT5 = "5";
    
    /**工事指示内容名称 1：設置／2：撤去／3：交換／4：確認／5：移転*/
    public static final String CONSTRUCION_CONTENT_NAME1 = "設置";
    public static final String CONSTRUCION_CONTENT_NAME2 = "撤去";
    public static final String CONSTRUCION_CONTENT_NAME3 = "交換";
    public static final String CONSTRUCION_CONTENT_NAME4 = "確認";
    public static final String CONSTRUCION_CONTENT_NAME5 = "移転";
  //liuzh ==========================add
    
    
	
 // yangxg   
    public static final String PRINTID_PXK0003 = "PXK0003";
    public static final String PRINTID_PXK0005 = "PXK0005";
    public static final String ONE = "1";
//  yangxg

    /*
     * 工事指示書情報検索
     */
    /** 0:加入者工事 */
    public static final String RECEIPT_ABLE_CONSTRUCION_0 = "0";
    /** 1:メンテナンス工事 */
    public static final String RECEIPT_ABLE_CONSTRUCION_1 = "1";
    /** 0（なし）:ＶＯＤ申込有無 */
    public static final String VOD_REGIST_FLG_0 = "0";
    /** 1（あり）:ＶＯＤ申込有無 */
    public static final String VOD_REGIST_FLG_1 = "1";
    /** 工事指示種別  1：その他工事 */
    public static final String CONSTRUCTION_INSTRCT_TYPE_1 = "1";
    /** 工事指示種別  2：CATVアナログ工事 */
    public static final String CONSTRUCTION_INSTRCT_TYPE_2 = "2";
    /** 工事指示種別  3：CATVデジタル工事 */
    public static final String CONSTRUCTION_INSTRCT_TYPE_3 = "3";
    /** 工事指示種別  4：NET工事 */
    public static final String CONSTRUCTION_INSTRCT_TYPE_4 = "4";
    /** 工事指示種別  5：MD工事 */
    public static final String CONSTRUCTION_INSTRCT_TYPE_5 = "5";
    /** 工事指示種別  6：ケーブルプラス電話工事 */
    public static final String CONSTRUCTION_INSTRCT_TYPE_6 = "6";
    /** 工事指示種別  7（WiMAX） */
    public static final String CONSTRUCTION_INSTRCT_TYPE_7 = "7";
    /** 工事指示種別  8（VoIP） */
    public static final String CONSTRUCTION_INSTRCT_TYPE_8 = "8";
    /** 指示状態  0：工事前 */
    public static final String DIRECTED_STATE_0 = "0";
    /** 指示状態  1：機器反映前 */
    public static final String DIRECTED_STATE_1 = "1";
    /** 指示状態  2：契約反映前 */
    public static final String DIRECTED_STATE_2 = "2";
    /** 指示状態  3：完了 */
    public static final String DIRECTED_STATE_3 = "3";
    /** 指示状態  9：未完了 */
    public static final String DIRECTED_STATE_9 = "9";
    /** モデム設定変更有無  0：なし*/
    public static final String MODEM_CONFIG_CHANGE_0 = "0";
    /** モデム設定変更有無  1：あり */
    public static final String MODEM_CONFIG_CHANGE_1 = "1";
    /** 指示内容  1：設置 */
    public static final String DIRECTIONS_1 = "1";
    /** 指示内容  2：撤去 */
    public static final String DIRECTIONS_2 = "2";
    /** 指示内容  3：交換 */
    public static final String DIRECTIONS_3 = "3";
    /** 指示内容  4：確認 */
    public static final String DIRECTIONS_4 = "4";
    /** 指示内容  5：移転 */
    public static final String DIRECTIONS_5 = "5";
    /** 撤去機器在庫不一致  0：ＯＫ */
    public static final String DISCREPANCY_REMOVAL_EQUIPMENT_0 = "0";
    /** 撤去機器在庫不一致  1：不一致 */
    public static final String DISCREPANCY_REMOVAL_EQUIPMENT_1 = "1";
    /** 設置機器契約不一致  0：ＯＫ */
    public static final String INSTALLED_EQUIPMENT_CONTRACT_0 = "0";
    /** 設置機器契約不一致  1：不一致 */
    public static final String INSTALLED_EQUIPMENT_CONTRACT_1 = "1";
    /** ＶＯＤ申込有無 0：なし*/
    public static final String VOD_REGISTRATION_0 = "0";
    /** ＶＯＤ申込有無  1：あり */
    public static final String VOD_REGISTRATION_1 = "1";
    /** ＢＳ契約  1：通常番組 */
    public static final String BS_CONTRACT_1 = "1";
    /** ＢＳ契約  2：ＢＳ契約 */
    public static final String BS_CONTRACT_2 = "2";
    /** 現地変更契約  0：変更なし */
    public static final String LOCAL_CONTRACT_CHANGE_0 = "0";
    /** 現地変更契約  1：現地追加 */
    public static final String LOCAL_CONTRACT_CHANGE_1 = "1";
    /** 現地変更契約  2：現地削除 */
    public static final String LOCAL_CONTRACT_CHANGE_2 = "2";
    /** 現地変更契約  3：現地追加＆現地削除 */
    public static final String LOCAL_CONTRACT_CHANGE_3 = "3";
    /** 0AB～J番号取得方法  1：KDDI採番 */
    public static final String OAB_JCD_GETMETHOD_1 = "1";
    /** 0AB～J番号取得方法  2：番号ポータビリティ */
    public static final String OAB_JCD_GETMETHOD_2 = "2";
    /** 0AB～J番号取得方法  3：同番移行 */
    public static final String OAB_JCD_GETMETHOD_3 = "3";

    /** 画面エラーフラグ 0:エラーなし 1:エラーあり */
    public static final BigDecimal ERROR_HAVE_NO = BigDecimal.ZERO;
    /** 画面エラーフラグ 0:エラーなし 1:エラーあり */
    public static final BigDecimal ERROR_HAVE_YES = BigDecimal.ONE;
    
    //yinjj
    /** 変更区分有無 */
    public static final String CNST_CHANGE_DIV_ONE_NAME = "無";
    public static final String CNST_CHANGE_DIV_TWO_NAME = "有";
    /** 指示状態 */
    public static final String CONSTRUCION_DIRECT_STATE_ZERO = "0";
    public static final String CONSTRUCION_DIRECT_STATE_ONE = "1";
    
    /** 班区分選択フラグ0:全件 1:指定*/
    public static final String TEAM_DIV_SEL_ALL = "0";
    /** 班区分選択フラグ0:全件 1:指定*/
    public static final String TEAM_DIV_SEL_SPECIFIED = "1";
    

    /** 工事班選択フラグ0:全件 1:指定*/
    public static final String CONSTRUCTION_TEAM_DIV_SEL_ALL = "0";
    /** 工事班選択フラグ0:全件 1:指定*/
    public static final String CONSTRUCTION_TEAM_DIV_SEL_SPECIFIED = "1";
    //yinjj

    /** ＰＰＶ */
    public static final String PPV_NO = "0";
    public static final String PPV_YES = "1";
    

    /** アダルト */
    public static final String ADULT_NO = "0";
    public static final String ADULT_YES = "1";
    
    public static final String NULL_STRING = "";
// Add start 20150128 H.Shigenaga [CATFNL-3304]
    /**
	 *  ログDB登録お客様名をリクエストパラメータ「customerCd」から取得する画面IDを指定すること（顧客参照など)
	 */
	public static final String[] CUSTOMER_DETAIL_SCREENID_LIST = new String[]{
		"CYAR101", // サマリ
		"CYAR102", // 基本
		"CYAR104", // 決済
		"CYER105", // 備考
		"CYAR107", // 問合せ
		"CYAR119", // 請求入金履歴
		"CYAR110", // 契約
		"CYAR109", // 一時金
		"CYAR122", // 機器
		"CYAR121", // 工事
		"CYAR112", // 放送
		"CYAR113", // ＮＨＫ
		"CYAR114", // ガイド
		"CYAR115", // 通信
		"CYAR117", // ケーブルプラス
		"CYAR111", // 契約履歴
		"CYAR130", // スマートバリュー
		"CYAR128", // ケーブルライン
		"CYAR131", // 請求履歴照会
	};
// Add end 20150128 H.Shigenaga [CATFNL-3304]

    /** 最大取得件数 */
    public static final String MAX_LIST_VALUE = "MAX_LIST_VALUE";

    public static final String PAGE_MAX_COUNT = "PAGE_MAX_COUNT";
    
    /**工事結果機器反映用工事結果指示状態更新区分　1:初期処理 2:次へボタン押下*/
    public static final String CONSTRUCTION_STATUS_UPDATE_DIV_INIT = "1";
    public static final String CONSTRUCTION_STATUS_UPDATE_DIV_NEXT = "2";
    
    /** 機器反映結果 0：未／1:／2：Ｅ／3：Ｗ*/
    public static final BigDecimal EQUIPMENT_APP_RESULT_NO = new BigDecimal("0");
    public static final String EQUIPMENT_APP_RESULT_NO_VALUE = "未";
    public static final BigDecimal EQUIPMENT_APP_RESULT_FINISH = new BigDecimal("1");
    public static final String EQUIPMENT_APP_RESULT_FINISH_VALUE = "完了";
    public static final BigDecimal EQUIPMENT_APP_RESULT_ERROR = new BigDecimal("2");
    public static final String EQUIPMENT_APP_RESULT_ERROR_VALUE = "Ｅ";
    public static final BigDecimal EQUIPMENT_APP_RESULT_WARNING = new BigDecimal("3");
    public static final String EQUIPMENT_APP_RESULT_WARNING_VALUE = "Ｗ";
    
    /** 工事履歴参照checkbox選択　true：選中／false:／未選中*/
    public static final String CHECKBOX_ON = "true";
    public static final String CHECKBOX_OFF = "false";
    
    /** 集合住宅検索WMS検索方法　１：住所検索　２：郵便番号検索　３：集合住宅検索*/
    public static final String SEARCH_TYPE_ADDRESS = "1";
    public static final String SEARCH_TYPE_ZIPCODE = "2";
    public static final String SEARCH_TYPE_COLLECTHOUSE = "3";
    
    /** 金額入力区分：0:金額入力可/１：金額入力不可 */
    public static final BigDecimal PRICE_INPUT_DIV_YES = new BigDecimal("0");
    public static final BigDecimal PRICE_INPUT_DIV_NO = new BigDecimal("1");
    
    
    /**作業内容入力サブウィンドウ画面用*/
    /** 編集区分 1：新規登録／2：変更／3：削除*/
	public static final String MAINTANCE_MODE_EDIT_DIV_INSERT = "1";
	/** 編集区分 1：新規登録／2：変更／3：削除*/
	public static final String MAINTANCE_MODE_EDIT_DIV_UPDATE = "2";
	/** 編集区分 1：新規登録／2：変更／3：削除*/
	public static final String MAINTANCE_MODE_EDIT_DIV_DELETE = "3";
	
	/** 工事日選択サブウィンドウ  選択区分 0:条件指定 1:工事日指定*/
	public static final String TAB_SELECT_SEARCH_CONDITION = "0";
	public static final String TAB_SELECT_CONSTRUCTION_DAY = "1";

	/** 画面入力チェック要否フラグ 0：　チェックなし　１：チェック要*/
	public static final String CHECK_NEED_NO = "0";
	public static final String CHECK_NEED_YES = "1";
	

	/** 画面初期処理フラグ 0：　初期処理　１：初期処理なし*/
	public static final String SCREEN_INIT_DIV_YES = "0";
	public static final String SCREEN_INIT_DIV_NO = "1";
	
	/** 工事班選択一覧背景色　 未実施 */
    public static final String COLOR_NOT_YET_IMPLEMENTED_LIGHT = "LightPink";
    public static final String COLOR_NOT_YET_IMPLEMENTED_DEEP = "HotPink";
    /** 工事班選択一覧背景色　工事中 */
    public static final String COLOR_UNDER_CONSTRUCTION_LIGHT = "LightGreen";
    public static final String COLOR_UNDER_CONSTRUCTION_DEEP = "Green";
    /** 工事班選択一覧背景色　 完了 */
    public static final String COLOR_COMPLETION_LIGHT = "LightSkyBlue";
    public static final String COLOR_COMPLETION_DEEP = "DeepSkyBlue";
    /** 工事班選択一覧背景色　 未完了 */
    public static final String COLOR_INCOMPLETE_LIGHT = "LightGrey";
    public static final String COLOR_INCOMPLETE_DEEP = "Gray";
    /** 工事班選択一覧背景色　 休日 */
    public static final String COLOR_HOLIDAY = "Gold";
    /** 行の背景色 */
    public static final String COLOR_ROW = "#F5F5F5";
    
    
    /** TPF2メンテナンス依頼書テンプレート区分 １：TV／２：NET／３：TEL／４：WiMAX */
    public static final BigDecimal FILE_DIV_TV = new BigDecimal("1");
    public static final BigDecimal FILE_DIV_NET = new BigDecimal("2");
    public static final BigDecimal FILE_DIV_TEL = new BigDecimal("3");
    public static final BigDecimal FILE_DIV_WIMAX = new BigDecimal("4");
    

    /** 呼び出し元 2：工事予定一覧*/
	public static final String SCREEN_FLG_CSLIST = "2";
	
	/** 1:在庫ＩＣカード情報取得 2:使用中ＩＣカード情報取得 3:使用中ＩＣカード情報取得（ＳＴＢリンクチェック用） */
	public static final String T321_SEARCH_DIV_ZAIKO = "1";
	public static final String T321_SEARCH_DIV_USING = "2";
	public static final String T321_SEARCH_DIV_STBLINK = "3";
	
	/** 帳票バッチ処理結果0：正常  9：異常 */
	public static final int BATCH_RESULT_DIV_OK = 0;
	public static final int BATCH_RESULT_DIV_ERROR = 9;
	
	/**枠選択フラグ 0:選択しない　１：選択する*/
	public static final BigDecimal CELL_SELECT_DIV_NO = new BigDecimal("0");
	public static final BigDecimal CELL_SELECT_DIV_YES = new BigDecimal("1");
    
// ADD 20120727 K.Arai JIRA:IACCESSBUG-(顧客契約入力(契約))-027,28,29 START
	/** 顧客契約入力（契約）画面   押下ボタン情報  */
	public static final String CUSTOMERCONTRACTINPUT_REGISTER = "0";
	public static final String CUSTOMERCONTRACTINPUT_ALLSEND  = "1";
// ADD 20120727 K.Arai JIRA:IACCESSBUG-(顧客契約入力(契約))-027,28,29 END
	
	/** 顧客検索アイコンビット */
	public static final int CUSTOMER_DETAIL_ICON_BIT = 2;
	/** 集合検索アイコンビット */
	public static final int MULTIDWELLING_DETAIL_ICON_BIT = 4;
	/** 制御アイコンビット */
	public static final int CONTROL_ABNORMAL_ICON_BIT = 8;
	/** 帳票確認アイコンビット */
	public static final int PRINT_DETAIL_ICON_BIT = 16;
	/** バッチ確認アイコンビット */
	public static final int BATCH_DETAIL_ICON_BIT = 32;
	
    /** 処理種別 機器管理 入荷登録 */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_SUPPLY_REGISTRATION = new BigDecimal(101);
    /** 処理種別 機器管理 修理完了 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_REPAIR_COMPLETION = new BigDecimal(102);
    /** 処理種別 機器管理 機器破棄 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_EQUIPMENT_ANNULMENT = new BigDecimal(103);
    /** 処理種別 機器管理 機器削除 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_EQUIPMENT_DELETION = new BigDecimal(104);
    /** 処理種別 機器管理 カードリンク新規登録 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CARD_LINK_NEW_REGISTRATION = new BigDecimal(105);
    /** 処理種別 機器管理 カードリンク再登録 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CARD_LINK_RE_REGISTRATION = new BigDecimal(106);
    /** 処理種別 機器管理 カードリンク登録解除 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CARD_LINK_REGISTRATION_RELEASE = new BigDecimal(107);
    /** 処理種別 機器管理 直接制御 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_DIRECT_CONTROL = new BigDecimal(108);
    /** 処理種別 機器管理 撤去後処理 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_PROCESSING_AFTER_IT_REMOVES_IT = new BigDecimal(109);
    /** 処理種別 機器管理 STBグループ登録 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_STB_GROUP_REGISTRATION = new BigDecimal(110);
    /** 処理種別 機器管理 メッセージ登録 */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_MESSAGE_REGISTRATION = new BigDecimal(111);
    /** 処理種別 機器管理 メッセージ停止 */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_MESSAGE_STOP = new BigDecimal(112);
    /** 処理種別 機器管理 CCASステータス変更 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CCAS_STATUS_CHANGE = new BigDecimal(113);
    /** 処理種別 機器管理 CCAS指定制御 */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CCAS_SPECIFICATION_CONTROL = new BigDecimal(114);

    /** 処理種別 契約管理 OP変更 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_OP_CHANGE = new BigDecimal(201);
    /** 処理種別 契約管理 サービス変更 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_CHANGE = new BigDecimal(202);
    /** 処理種別 契約管理 サービス移動 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_MOVEMENT = new BigDecimal(203);
    /** 処理種別 契約管理 サービス休止 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_STOP = new BigDecimal(204);
    /** 処理種別 契約管理 サービス休止再開 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_STOP_RESTART = new BigDecimal(205);
    /** 処理種別 契約管理 サービス解約 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_CANCELLATION = new BigDecimal(206);
    /** 処理種別 契約管理 サービス全解約 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_ALL_CANCELLATIONS = new BigDecimal(207);
    /** 処理種別 契約管理 サービス強制停止 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_COMPULSION_STOP = new BigDecimal(208);
    /** 処理種別 契約管理 サービス強制停止再開 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_COMPULSION_STOP_AND_RESTART = new BigDecimal(209);
    /** 処理種別 契約管理 コース変更 */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_COURSE_CHANGE = new BigDecimal(210);

    /** 処理種別 工事管理 機器設置 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_INSTALLATION = new BigDecimal(301);
    /** 処理種別 工事管理 機器交換 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_EXCHANGE = new BigDecimal(302);
    /** 処理種別 工事管理 機器撤去 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_REMOVAL = new BigDecimal(303);
    /** 処理種別 工事管理 全送信 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_ALL_TRANSMISSIONS = new BigDecimal(304);
    /** 処理種別 工事管理 リンク登録 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_LINK_REGISTRATION = new BigDecimal(306);
    /** 処理種別 工事管理 リンク登録解除 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_LINK_REGISTRATION_RELEASE = new BigDecimal(307);
    /** 処理種別 工事管理 交換機器撤去 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_EXCHG_REMOVAL = new BigDecimal(308);
    /** 処理種別 工事管理 交換機器設置 */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_EXCHG_INSTALLATION = new BigDecimal(309);

    /** 処理種別 バッチ視聴制御 日次処理 */
    public static final BigDecimal TRANSACTION_DIV_BATCH_DAILY_PROCESSING = new BigDecimal(401);
    /** 処理種別 バッチ視聴制御 日次バックアップ処理 */
	public static final BigDecimal TRANSACTION_DIV_BATCH_THE_NEXT_BACKUP_PROCESSING_OF_DAY = new BigDecimal(402);
    /** 処理種別 バッチ視聴制御 全件送信 */
	public static final BigDecimal TRANSACTION_DIV_BATCH_ALL_TRANSMISSIONS = new BigDecimal(403);
    /** 処理種別 バッチ視聴制御 契約更新 */
	public static final BigDecimal TRANSACTION_DIV_BATCH_CONTRACT_RENEWAL = new BigDecimal(404);
    /** 処理種別 バッチ視聴制御 セレクト送信 */
	public static final BigDecimal TRANSACTION_DIV_BATCH_SELECTION_TRANSMISSION = new BigDecimal(405);

   /** 機器種別ID:HT */
    public static final BigDecimal EQ_HT = new BigDecimal(1);
    /** 機器種別ID:STB */
    public static final BigDecimal EQ_STB = new BigDecimal(2);
    /** 機器種別ID:BCAS */
    public static final BigDecimal EQ_BCAS = new BigDecimal(3);
    /** 機器種別ID:CCAS */
    public static final BigDecimal EQ_CCAS = new BigDecimal(4);
    /** 機器種別ID:TA */
    public static final BigDecimal EQ_TA = new BigDecimal(9);
    /** 機器種別ID:SmartTVBox */
	public static final BigDecimal EQ_STVB = new BigDecimal(20);

    /** 設置予定機器 */
    /** 設置ステータス（設置予定）*/
    public static final BigDecimal SETTING_STATUS_SETTING_RESERV = new BigDecimal(0);
    /** 設置ステータス（設置済）*/
    public static final BigDecimal SETTING_STATUS_SETTING = new BigDecimal(1);
    
    /**  HEコード（松下デジタル） */
    public static final BigDecimal EQPCNTRL_PANASONIC = new BigDecimal("110");
    /**  HEコード（パイオニアデジタル） */
    public static final BigDecimal EQPCNTRL_PIONEER = new BigDecimal("610");
    /**  松下１ＷＡＹ（シリアル） */
    public static final BigDecimal EQPCNTRL_PANASONIC_1_WAY1 = new BigDecimal("101");
    /**  松下１ＷＡＹ（ソケット） */
    public static final BigDecimal EQPCNTRL_PANASONIC_1_WAY2 = new BigDecimal("102");
    /**  松下２ＷＡＹ */
    public static final BigDecimal EQPCNTRL_PANASONIC_2_WAY = new BigDecimal("103");
    /**  東芝ＨＴ */
    public static final BigDecimal EQPCNTRL_TOSHIBA1 = new BigDecimal("201");
    /**  東芝ＨＴ */
    public static final BigDecimal EQPCNTRL_TOSHIBA2 = new BigDecimal("202");
    /**  東芝ＨＴ */
    public static final BigDecimal EQPCNTRL_TOSHIBA3 = new BigDecimal("203");
    /**  富士通ＨＴＦＣ３５５１ */
    public static final BigDecimal EQPCNTRL_FUJITU1 = new BigDecimal("301");
    /**  富士通ＨＴＦＣ３５５３ */
    public static final BigDecimal EQPCNTRL_FUJITU2 = new BigDecimal("302");
    /**  ＮＥＣ―ＨＴ */
    public static final BigDecimal EQPCNTRL_NEC = new BigDecimal("401");
    /**  ＳＡ―ＨＴ */
    public static final BigDecimal EQPCNTRL_SA = new BigDecimal("501");
    /**  パイオニアＨＴ */
    public static final BigDecimal EQPCNTRL_PIONEER_HT = new BigDecimal("601");
    /**  JC-HITS 2007/12/18 K.Suzuki Add  */
    public static final BigDecimal EQPCNTRL_JCHITS = new BigDecimal("701");
    
    /** スイッチング連携 */
    
	/** スイッチング連携有無の値が'2'(連携する） */
	public static final String SWITCHING_ON = "2";
    
    /** サービス分類 */
    
	/** 低圧 */
	public static final String SV_CLASSIFICATION_LOW_PRESSURE = "015";
	/** 高圧 */
	public static final String SV_CLASSIFICATION_HIGH_PRESSURE = "016";
	/** 発電 */
	public static final String SV_CLASSIFICATION_POWERGENERATION = "017";
	/** 卸 */
	public static final String SV_CLASSIFICATION_WHOLESALE = "018";
    
    /** ファイルステータス */
    
	/** ファイルステータス：追加  */
	public static final String FILE_STATUS_ADD = "1";
	/** ファイルステータス：更新 */
	public static final String FILE_STATUS_UPD = "2";
	/** ファイルステータス：削除 */
	public static final String FILE_STATUS_DEL = "3";
    
    /** アンケートコード */
    
	/** アンケート1に対応する設定備考コード  */
	public static final String Q_00S0000 = "00S0000";
	public static final String PREFIX_00S = "00S";
	/** アンケート2に対応する設定備考コード  */
	public static final String Q_00T0000 = "00T0000";
	public static final String PREFIX_00T = "00T";
	/** アンケート3に対応する設定備考コード  */
	public static final String Q_00U0000 = "00U0000";
	public static final String PREFIX_00U = "00U";
	/** アンケート4に対応する設定備考コード  */
	public static final String Q_00V0000 = "00V0000";
	public static final String PREFIX_00V = "00V";
	/** アンケート5に対応する設定備考コード  */
	public static final String Q_00W0000 = "00W0000";
	public static final String PREFIX_00W = "00W";
	/** アンケート6に対応する設定備考コード  */
	public static final String Q_00Y0000 = "00Y0000";
	public static final String PREFIX_00Y = "00Y";
	/** アンケート7に対応する設定備考コード  */
	public static final String Q_00Z0000 = "00Z0000";
	public static final String PREFIX_00Z = "00Z";
    
	/** チェックボックス：ON  */
	public static final String CHK_BOX_ON = "on";
	/** 定数＿ON  */
	public static final String STR_ON = "ON";
    
    /** 地点特定番号桁数 */
    
	/** 地点特定番号桁数：22桁  */
	public static final int SPECIFICNUM_LENGTH = 22;
    
	/** 0埋フォーマット（3桁）  */
	public static final String PADDING_THREE_FORMAT = "%1$03d";
    
	/** 0埋フォーマット（5桁）  */
	public static final String PADDING_FIVE_FORMAT = "%1$05d";
	
	/** サービスID */
	/** 低圧_使用量情報照会申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_USED_INFO_INQUIRE_REQUEST = "IF_10210";
	/** 高圧_使用量情報照会申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_USED_INFO_INQUIRE_REQUEST = "IF_K10210";
	/** 発電_使用量情報照会申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_USED_INFO_INQUIRE_REQUEST = null;

	/** 低圧_使用量情報照会 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_USED_INFO_INQUIRE = "IF_10310";
	/** 高圧_使用量情報照会 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_USED_INFO_INQUIRE = "IF_K10310";
	/** 発電_使用量情報照会 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_USED_INFO_INQUIRE = null;

	/** 低圧_再点 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_OPEN = "IF_10410";
	/** 高圧_再点 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_OPEN = null;
	/** 発電_再点 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_OPEN = "IF_F10410";

	/** 低圧_廃止・撤去 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_STOP_AND_REMOVE = "IF_10510";
	/** 高圧_廃止・撤去 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_STOP_AND_REMOVE = "IF_K10510";
	/** 発電_廃止・撤去 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_STOP_AND_REMOVE = "IF_F10510";

	/** 低圧_スイッチング廃止取次登録 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_STOP_AGENCY = "IS_20110";
	/** 高圧_スイッチング廃止取次登録 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_STOP_AGENCY = "IS_K20110";
	/** 発電_スイッチング廃止取次登録 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_STOP_AGENCY = "IS_F20110";

	/** 低圧_スイッチング開始申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_START = "IF_10610";
	/** 高圧_スイッチング開始申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_START = "IF_K10610";
	/** 発電_スイッチング開始申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_START = "IF_F10610";

	/** 低圧_スイッチング廃止取次判断 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_STOP_AGENCY_JUDGE = "IS_20410";
	/** 高圧_スイッチング廃止取次判断 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_STOP_AGENCY_JUDGE = "IS_K20410";
	/** 発電_スイッチング廃止取次判断 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_STOP_AGENCY_JUDGE = "IS_F20410";

	/** 低圧_スイッチング廃止申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_STOP = "IF_10710";
	/** 高圧_スイッチング廃止申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_STOP = "IF_K10710";
	/** 発電_スイッチング廃止申請 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_STOP = "IF_F10710";

	/** 低圧_アンペア変更 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_CHANGE_AMPERE = "IF_10910";
	/** 高圧_アンペア変更 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_CHANGE_AMPERE = null;
	/** 発電_アンペア変更 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_CHANGE_AMPERE = null;

	/** 低圧_情報変更 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_CHENGE_USER_INFO = "IF_10810";
	/** 高圧_情報変更 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_CHENGE_USER_INFO = "IF_K10810";
	/** 発電_情報変更 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_CHENGE_USER_INFO = "IF_F10810";

	/** 低圧_設備情報照会 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_GET_EQUIPMENT_INFO = "IF_10110";
	/** 低圧FIT電源__設備情報照会 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_GET_EQUIPMENT_INFO = "IF_F10110";

	// Add start 20160216 A.Takemi [CATPPS-979]
	/** 事業者一覧取得 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_COMPANIES_LIST_REQUEST = "IS_30110";
	// Add end 20160216 A.Takemi [CATPPS-979]

	/** 申込種別 */
	
	/** アンペア変更_低圧 */
	public static final String ENTRY_TYPE_CHANGE_AMPERE_LOW_PRESSURE = "06";
	/** アンペア変更_高圧 */
	public static final String ENTRY_TYPE_CHANGE_AMPERE_HIGH_PRESSURE = null;
	/** アンペア変更_発電 */
	public static final String ENTRY_TYPE_CHANGE_AMPERE_POWERGENERATION = null;

	/** スイッチング開始申請_低圧 */
	public static final String ENTRY_TYPE_SWITCHING_START_LOW_PRESSURE = "05";
	/** スイッチング開始申請_高圧 */
	public static final String ENTRY_TYPE_SWITCHING_START_HIGH_PRESSURE = "05";
	/** スイッチング開始申請_発電 */
	public static final String ENTRY_TYPE_SWITCHING_START_POWERGENERATION = "16";

	/** スイッチング廃止申請_低圧 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_LOW_PRESSURE = "03";
	/** スイッチング廃止申請_高圧 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_HIGH_PRESSURE = "03";
	/** スイッチング廃止申請_発電 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_POWERGENERATION = "14";

	/** スイッチング廃止取次登録_低圧 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_LOW_PRESSURE = null;
	/** スイッチング廃止取次登録_高圧 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_HIGH_PRESSURE = null;
	/** スイッチング廃止取次登録_発電 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_POWERGENERATION = null;

	/** 再点_低圧 */
	public static final String ENTRY_TYPE_OPEN_LOW_PRESSURE = "04";
	/** 再点_高圧 */
	public static final String ENTRY_TYPE_OPEN_HIGH_PRESSURE = null;
	/** 再点_発電 */
	public static final String ENTRY_TYPE_OPEN_POWERGENERATION = "15";

	/** 使用量情報照会_低圧 */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_LOW_PRESSURE = null;
	/** 使用量情報照会_高圧 */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_HIGH_PRESSURE = null;
	/** 使用量情報照会_発電 */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_POWERGENERATION = null;

	/** 使用量情報照会申請_低圧 */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_REQUEST_LOW_PRESSURE = "08";
	/** 使用量情報照会申請_高圧 */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_REQUEST_HIGH_PRESSURE = "08";
	/** 使用量情報照会申請_発電 */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_REQUEST_POWERGENERATION = null;

	/** 情報変更_低圧 */
	public static final String ENTRY_TYPE_CHENGE_USER_INFO_LOW_PRESSURE = "07";
	/** 情報変更_高圧 */
	public static final String ENTRY_TYPE_CHENGE_USER_INFO_HIGH_PRESSURE = "07";
	/** 情報変更_発電 */
	public static final String ENTRY_TYPE_CHENGE_USER_INFO_POWERGENERATION = "17";

	/** 廃止・撤去_低圧（撤去あり） */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_LOW_PRESSURE_ON = "02";
	/** 廃止・撤去_低圧（撤去なし） */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_LOW_PRESSURE_OFF = "01";
	/** 廃止・撤去_高圧 */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_HIGH_PRESSURE = "02";
	/** 廃止・撤去_発電（撤去あり） */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_POWERGENERATION_ON = "13";
	/** 廃止・撤去_発電（撤去なし） */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_POWERGENERATION_OFF = "12";

	/** スイッチング廃止取次判断_低圧 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_JUDGE_LOW_PRESSURE = null;
	/** スイッチング廃止取次判断_高圧 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_JUDGE_HIGH_PRESSURE = null;
	/** スイッチング廃止取次判断_発電 */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_JUDGE_POWERGENERATION = null;

	
	/** スイッチング連携拡張項目 */
	
	/** 使用量閲覧パスワード */
	public static final String LINK_ITEM_PASSWORD = "PASSWORD";

	/** スイッチング廃止取次判断NG理由1 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_01_FLAG = "JUDGEMENT_REASON_01_FLAG";
	/** スイッチング廃止取次判断NG理由2 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_02_FLAG = "JUDGEMENT_REASON_02_FLAG";
	/** スイッチング廃止取次判断NG理由3 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_03_FLAG = "JUDGEMENT_REASON_03_FLAG";
	/** スイッチング廃止取次判断NG理由4 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_04_FLAG = "JUDGEMENT_REASON_04_FLAG";
	/** スイッチング廃止取次判断NG理由5 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_05_FLAG = "JUDGEMENT_REASON_05_FLAG";
	/** スイッチング廃止取次判断NG理由6 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_06_FLAG = "JUDGEMENT_REASON_06_FLAG";
	/** スイッチング廃止取次判断NG理由7 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_07_FLAG = "JUDGEMENT_REASON_07_FLAG";
	/** スイッチング廃止取次判断NG理由8 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_08_FLAG = "JUDGEMENT_REASON_08_FLAG";
	/** スイッチング廃止取次判断NG理由9 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_09_FLAG = "JUDGEMENT_REASON_09_FLAG";
	/** スイッチング廃止取次判断 */
	public static final String LINK_ITEM_JUDGEMENT_FLAG = "JUDGEMENT_FLAG";
	
	/** 地点特定番号 */
	public static final String LINK_CHITEN_TOKUTEI_NO = "CHITEN_TOKUTEI_NO";
	/** 電力会社エリア */
	public static final String LINK_DENRYOKUGAISHA_AREA = "DENRYOKUGAISHA_AREA";
	
	/** 契約登録接頭コード */
	
	/** 契約容量単位（00E） */
	public static final String CONTRACT_00E = "00E";
	/** 業種（00A） */
	public static final String CONTRACT_00A = "00A";
	/** 案件ステータス（00B） */
	public static final String CONTRACT_00B = "00B";
// Change start 20151211 K.Kushiro CATPPS-501 
//	/** 契約決定方法/電気方式（00Q） */
//	public static final String CONTRACT_00Q = "00Q";
	/** 契約決定方法  */
	public static final String CONTRACT_00Q = "00Q";
	/** 電気方式  */
	public static final String CONTRACT_00X = "00X";
// Change end 20151211 K.Kushiro CATPPS-501 
	/** 時刻（00L） */
	public static final String CONTRACT_00L = "00L";
	/** 電流希望（00M） */
	public static final String CONTRACT_00M = "00M";
	/** 申込者（00N）低圧/低圧FIT */
	public static final String CONTRACT_00N = "00N";
	/** 申込者（01N）高圧 */
	public static final String CONTRACT_01N = "01N";
	/** 電話（00P） */
	public static final String CONTRACT_00P = "00P";
	/** 加入経路（234） */
	public static final String CONTRACT_234 = "234";
	/** 理由（105） */
	public static final String CONTRACT_105 = "105";
	/** 分類（086） */
	public static final String CONTRACT_086 = "086";
	/** エリア（009） */
	public static final String CONTRACT_009 = "009";
	/** 主契約（00G） */
	public static final String CONTRACT_00G = "00G";
	/** 自家補（00O） */
	public static final String CONTRACT_00O = "00O";
	/** 方法（00I） */
	public static final String CONTRACT_00I = "00I";
	
	/** スイッチング登録パラメータ 登録 (1) */ 
	public static final String SW_REGISTER_UPDATE_FLG_REGIST = "1";
	/** スイッチング登録パラメータ 訂正 (2) */ 
	public static final String SW_REGISTER_UPDATE_FLG_UPDATE = "2";
	/** スイッチング登録パラメータ 取消 (3) */ 
	public static final String SW_REGISTER_UPDATE_FLG_CANCEL = "3";

	/** スイッチング照会 設備情報  (1) */ 
	public static final String SW_REFER_CODE_CONTRACT_SERVICE = "1";
	/** スイッチング照会 使用量情報取得サービス  (2) */ 
	public static final String SW_REFER_CODE_USED_INFO = "2";
	/** スイッチング照会 スイッチング廃止取次結果  (3) */ 
	public static final String SW_REFER_CODE_SW_STOP_AGENCY_RESULT = "3";
	/** スイッチング照会 連携履歴  (4) */ 
	public static final String SW_REFER_CODE_LINK_HISTORY = "4";

	/** スイッチング連携 使用量情報照会申請  (1) */ 
	public static final String SW_APPLAY_CODE_USAGE_SUBMIT = "1";
	/** スイッチング連携 再点申請 (2) */ 
	public static final String SW_APPLAY_CODE_CONTRACT = "2";
	/** スイッチング連携 廃止・撤去申請 (3) */ 
	public static final String SW_APPLAY_CODE_CLOSE = "3";
	/** スイッチング連携 スイッチング廃止取次登録 (4) */ 
	public static final String SW_APPLAY_CODE_SW_CONTRACT_AGENT_CLOSE = "4";
	/** スイッチング連携 スイッチング開始申請 (5) */ 
	public static final String SW_APPLAY_CODE_SW_CONTRACT_START = "5";
	/** スイッチング連携 スイッチング廃止申請 (6) */ 
	public static final String SW_APPLAY_CODE_SW_CLOSE = "6";
	/** スイッチング連携 アンペア変更申請 (7) */ 
	public static final String SW_APPLAY_CODE_AMPERE = "7";
	/** スイッチング連携 情報変更申請 (8) */ 
	public static final String SW_APPLAY_CODE_INFORMATION = "8";
	/** スイッチング連携 使用量情報照会 (9) */ 
	public static final String SW_APPLAY_CODE_USAGE = "9";
	/** スイッチング連携 廃止取次判断 (10) */ 
	public static final String SW_APPLAY_CODE_CONTRACT_AGENT_CLOSE = "10";
	/** スイッチング連携 設備情報照会 (11) */ 
	public static final String SW_APPLAY_CODE_SW_EQUIPMENT_INFO = "11";
	
	/** 電力会社エリア */
	public static final String LINK_DENRYOKUGAISHA_NO = "DENRYOKUGAISHA_NO";
	
	/** スイッチングインターフェース名称 */
	
	/** スイッチング開始申請 */
	public static final String SW_START_PPLICATION_NAME = "スイッチング開始申請";
	/** 再点 */
	public static final String SW_SAITEN_NAME = "再点";
	/** 廃止 */
	public static final String SW_HAISHI_NAME = "廃止";
	/** 廃止・撤去 */
	public static final String SW_HAISHI_REMOVAL_NAME = "廃止・撤去";
	/** アンペア変更申請 */
	public static final String SW_AMPERE_CHANGED_APP_NAME = "アンペア変更申請";
	/** 情報変更申請 */
	public static final String SW_INFO_CHANGED_APP_NAME = "情報変更申請";
	
	/** バッチエントリーKEY */
	
	/** 供給電力量出力 */
	public static final String SUPPLY_PURCHASE_YM = "SupplyPurchaseYM";
	
	/** バッチID */
	
	/** バッチID：PXA0060 */
	public static final String BATCH_ID_PXA0060 = "PXA0060";
	/** バッチID：PXA0061 */
	public static final String BATCH_ID_PXA0061 = "PXA0061";
	
	/** 電力単位（KW) */
	public static final String POWER_UNIT_KW = "kW";
	
	/*----------------------------------------------------
	 * 申込者（区分）
	 *----------------------------------------------------*/
	
	/** 申込者（区分）：異なる */
	public static final String APP_CLASSIFICATION_DIFFERENT = "1000";
	
	/** 申込者（区分）：同一 */
	public static final String APP_CLASSIFICATION_IDENTITY = "1001";
	
	/*----------------------------------------------------
	 * ファイル入力チェック関連
	 *----------------------------------------------------*/
	
	/** ファイル許容サイズ */
	public static final int MAX_FILE_SIZE_1M = 1048576;
	
	/** ファイル名長許容サイズ */
	public static final int MAX_FILE_NAME_SIZE = 100;
	
	/**
	 * 公的証明書
	 * OCCTO許容拡張子リスト
	 */
	public enum Extension {

		// PDF
		PDF("pdf"),
		// JPEG
		JPEG("jpeg"),
		// JPG
		JPG ("jpg"),
		// PNG
		PNG ("png"),
		// GIF
		GIF ("gif");
		
		private String extension;
		private Extension(String extension){
			this.extension = extension;
		}
		public String getExtension() {
			return this.extension;
		}
	}

	/*----------------------------------------------------
	 * 西部ガス対応定数
	 *----------------------------------------------------*/

	// Add start 20160114 Takemi TASK_WST
	
	/** （西部ガスGCSI）連携フラグ */
	public enum GcisRenkeiFlg {
		/** GCISから移動した */
		GCIS_LINK_UP(1);
		
		private int value;
		private GcisRenkeiFlg(int value) {this.value = value;}
		public int getValue() {return this.value;}
	}
	
	/** ログインコンテクストから（西部ガスGCSI連携）セッションIDを取得するキー */
	public static final String CUSTOMER_RENKEI_SESSION_KEY_CONTRACT = "CUSTOMER_RENKEI_SESSION_KEY_CONTRACT";
	/** ログインコンテクストから（西部ガスGCSI）連携フラグを取得するキー */
	public static final String GCIS_RENKEI_FLG = "GCIS_RENKEI_FLG";
	// Add end 20160114 Takemi TASK_WST

	// Add start 20160120 chinen TASK_WST
	/** GSCI連携フラグ */
	public static final Integer GSCI_LINK_UP_FLG = 1;
	/** 加入経路'0003'(電話) */
	// chg start chinen CATPPSSB-109対応
	//public static final String SAIBU_JOIN_ROOT_PHONE = "0003";
	public static final String SAIBU_JOIN_ROOT_PHONE = "0001";
	// chg end chinen CATPPSSB-109対応
	/** 廃止日割りの決済方法（パラメータ名称）  */
	public static final String PARAM_CANCEL_PAYMETHOD = "cancelPayMethod";
	/** イベント（パラメータ名称）  */
	public static final String PARAM_EVENT = "event";
	/** ガス同時受付フラグ（パラメータ名称）  */
	public static final String PARAM_GAS_USEFLG = "gasUseFlg";
	/** 太陽光発電設置状況（パラメータ名称）  */
	public static final String PARAM_SOLAR_STATUS = "solarStatus";
	/** 昼間ご利用有無（パラメータ名称）  */
	public static final String PARAM_DAY_USEFLG = "dayUseFlg";
	/** 接続供給開始年月日（パラメータ名称）  */
	public static final String PARAM_SUPPY_OPENDATE = "suppyOpenDate";
	/** 接続供給廃止予定日（パラメータ名称）  */
	public static final String PARAM_SUPPY_CLOSEDATE = "suppyCloseDate";
	/** 供給地点特定番号（パラメータ名称）  */
	public static final String PARAM_SUPPY_POINTNUM = "supplyPointNo";
	/** 旧小売事業者お客様番号（パラメータ名称）  */
	public static final String PARAM_OLDRETAIL_CUSTOMERNO = "oldRetailCustomerNo";
	/** 旧小売事業者名称（連携）（パラメータ名称）  */
	public static final String PARAM_OLDRETAIL_NAME = "oldRetailName";
	/** 入居予定時刻（パラメータ名称）  */
	public static final String PARAM_NYUKYO_YOTEITIME = "nyukyoYoteiTime";

	// Add end 20160120 chinen TASK_WST
	
	/**
	 * 支払情報(CSVファイルレイアウトと同順)
	 *
	 */
	public enum CsvLayout {
		SUPPLY_NUMBER("供給先番号"),
		GENERATION_NUMBER("世代番号"),
		PAYMENT_CONTRACT_NUMBER("支払契約番号"),
		ECIS_CUSTOMER_NUMBER("ECISお客さま番号"),
		PAYMENT_METHOOD("決済方法"),
		FINANCIAL_INSTITUTION("金融機関"),
		AGGREGATE_BANK("集約銀行"),
		DEPOSIT_TYPE("預金種目"),
		ACCOUNT_NUMBER("口座番号"),
		ACCOUNT_NAME_CANA("口座名（カナ）"),
		INITIAL_CLAIMS_FLAG("初回請求フラグ"),
		REQUEST_FORM_SENDING_DATE("依頼書送付日"),
		ACCOUNT_RECEPTION_DATE("口座.受付日"),
		ACCOUNT_USE_START_DATE("口座.使用開始日"),
		CARD_NUMBER_1("カード番号1"),
		CARD_NUMBER_2("カード番号2"),
		CARD_NUMBER_3("カード番号3"),
		CARD_NUMBER_4("カード番号4"),
		CARD_COMPANY("カード会社"),
		CARD_NAME("カード名義"),
		EXPIRATION_DATE("有効期限"),
		SECURITY_CODE("セキュリティーコード"),
		TRAN_MAX_AMOUNT("取引上限額"),
		ALLIANCE_CLASSIFICATION("提携区分"),
		CARD_RECEPTION_DATE("カード.受付日"),
		AUTHORIZATION_NUMBER("承認番号"),
		DATE_OF_APPROVAL("承認日"),
		COMMITMENTS("承認額"),
		CARD_USE_START_DATE("使用開始日");

		/**
		 * 項目名を設定
		 */
		private final String divValue;
		CsvLayout(String divValue) {
			this.divValue = divValue;
		}

		/**
		 * 項目名称を返す
		 * 
		 * @return 項目名称
		 */
		public String getItemName() { return divValue; }
	}
	
	public static final String RECV_PATH = "RECV_PATH"; // 受信ディレクトリ.ＫＥＹ
	public static final String FILE_NAME = "FILE_NAME"; // ファイル名.ＫＥＹ
	public static final String EXTEND_NAME = "EXTEND_NAME"; // 拡張子.ＫＥＹ
	
	// Add start 20160309 Toma CATPPSSB-328
	/** 決済方法(振替) */
	public static final String PAYMENT_TRANSFER = "1";
	/** 決済方法(払込) */
	public static final String PAYMENT_PAYMENT = "2";
	/** 決済方法(カード) */
	public static final String PAYMENT_CARD = "6";
	// Add end 20160309 Toma CATPPSSB-328
}
