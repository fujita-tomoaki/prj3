package com.service.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;

import com.common.dao.model.GetSwitchingContractInfoResult;
import com.common.dao.model.LinkRequestInfoResult;
import com.common.dao.model.T0a9;
import com.common.dao.model.T105;
import com.common.dao.model.Te72;
import com.common.dao.model.Te73;
import com.common.dao.model.Te73Key;
import com.common.dao.model.Te76;
import com.common.dao.model.Te79;
import com.common.dao.model.Te7a;
import com.common.dao.model.Tpe7;
import com.common.param.Const;

import util.CollectionUtils;

public class SwitchingUpdater {

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

	/**
	 * 連携要求情報作成サービス 本サービスを使用して、連携要求情報を作成する。
	 * 
	 * @param catyPrincipal
	 *            プリンシパル
	 * @param stationCd
	 *            局コード 局コード
	 * @return 実行結果 連携要求情報
	 */
	public LinkRequestInfoResult createLinkRequestInfo(String stationCd, SqlSession session) {

		if (stationCd == null) {
			throw new RuntimeException("stationCd is null");
		}

		System.out.println("	局コード:[" + stationCd + "]");

		// 連携要求情報
		LinkRequestInfoResult result = new LinkRequestInfoResult();
		// 小売事業者情報リスト
		List<Tpe7> tpe7EntityModelList = null;
		// 契約情報
		GetSwitchingContractInfoResult contractInfoResult = null;
		// 顧客住所情報
		List<T105> t105EntityModelList = null;
		// 公的証明書情報
		List<T0a9> t0a9EntityModelList = null;
		// 廃止取次情報
		Te76 te76EntityModel = null;
		// スイッチング廃止取次検索設定情報リスト
		List<Tpe7> tpe7EntityModelSearchSettingList = null;		

		Map<String, Object> params = new HashMap();
		
		try {
			// スイッチング連携管理情報をスイッチング連携管理テーブルから取得する
			params.clear();
			params.put("stationCd", stationCd);
			Te79 te79EntityModel = session.selectOne(
					"com.common.dao.customTe79Mapper.findByRenkeiRequestInfo",
					params);

			// 取得できた場合
			if (te79EntityModel != null) {

				// 小売事業者情報を取得する
				Tpe7 paramTpe7 = new Tpe7();
				paramTpe7.setTpe7001(stationCd);
				paramTpe7.setTpe7002("SXA0023");
				paramTpe7.setTpe7003("KORI");
				tpe7EntityModelList = session.selectList(
						"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
						paramTpe7);

				// スイッチング連携管理情報から顧客コードと連番が取得できる場合のみ実施
				if (te79EntityModel.getTe79104() != null
						&& te79EntityModel.getTe79105() != null) {

					// 契約情報を取得する
					params.clear();
					params.put("stationCd", stationCd);
					params.put("customerCd", te79EntityModel.getTe79104());
					params.put("statiseqNoonCd", te79EntityModel.getTe79105());
					contractInfoResult = session.selectOne(
							"contractServiceDao.getSwitchingContractInfo",
							params);

					// 顧客住所情報を取得する
					params.clear();
					params.put("t105001", stationCd);
					params.put("t105002", te79EntityModel.getTe79104());
					t105EntityModelList = session.selectList(
							"com.common.dao.customT105Mapper.findByCustomerAddressInfo",
							params);

					// 公的証明書情報取得する
					t0a9EntityModelList = new ArrayList<T0a9>();

					if (contractInfoResult != null) {

						if (IF_10210.equals(te79EntityModel.getTe79103())
								|| IF_K10210.equals(te79EntityModel
										.getTe79103())) {
							params.clear();
							params.put("stationCd", stationCd);
							params.put("contractSeq", te79EntityModel.getTe79105().toString());
							t0a9EntityModelList = session.selectList(
									"com.common.dao.customT0a9Mapper.findByPublicCertificate",
									params);
						}
					}

				}

				// スイッチング連携要求拡張項目情報を取得する
				params.clear();
				params.put("te7a001", stationCd);
				params.put("te7a002", te79EntityModel.getTe79002());
				params.put("te7a003", te79EntityModel.getTe79003());
				List<Te7a> te7aEntityModelList = session.selectList(
						"com.common.dao.customTe7aMapper.findByExtensionItemInfo",
						params);
				
				// 廃止取次情報を取得する
				if (IS_20410.equals(te79EntityModel.getTe79103())
						|| IS_K20410.equals(te79EntityModel.getTe79103())
						|| IS_F20410.equals(te79EntityModel.getTe79103())) {

					params.clear();
					params.put("te76001", stationCd);
					params.put("te76201", te79EntityModel.getTe79601());
					te76EntityModel = session.selectOne(
							"com.common.dao.customTe76Mapper.findByAbolitionAgencyNoForAbolitionAgencyInfo", 
							params);
							
				}

				/** 連携要求情報を作成する */

				// 局コード
				result.setStationCd(te79EntityModel.getTe79001());
				// 連携番号
				result.setRenKeiNum(te79EntityModel.getTe79002());
				// 連携番号連番
				result.setRenKeiSerialNum(new BigDecimal(te79EntityModel.getTe79003()));
				// 連携要求日時
				result.setRenKeiEntryDatetime(new Timestamp(te79EntityModel.getTe79101().getTime()));
				// 処理状況
				result.setProcessingStatus(new BigDecimal(te79EntityModel.getTe79102()));
				// サービスID
				result.setServiceId(te79EntityModel.getTe79103());
				// 顧客コード
				result.setCustomerCd(te79EntityModel.getTe79104());
				// 連番
				result.setSerialNumber(te79EntityModel.getTe79105());
				// 更新フラグ
				result.setFlagUpdate(new BigDecimal(te79EntityModel.getTe79106()));
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
					for (Te7a model : te7aEntityModelList) {
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
				result.setTpe7List(tpe7EntityModelList);
				// 契約情報
				result.setContractInfoResult(contractInfoResult);
				// 顧客住所情報
				result.setT105EntityModelList(t105EntityModelList);
				// 公的証明書情報
				result.setT0a9EntityModelList(t0a9EntityModelList);
				// スイッチング連携要求拡張項目情報
				result.setTe7aEntityModelList(te7aEntityModelList);
				// 廃止取次情報
				result.setTe76(te76EntityModel);

			} else {
				// 取得できなかった場合

				// 業務処理状況確認マスタから連携要求を選定する
				List<Te73> te73EntityModelList = session.selectList(
						"com.common.dao.customTe73Mapper.getBizProcStatusCheckLinkRequestInfo",
						stationCd);
				
				if(CollectionUtils.isEmpty(te73EntityModelList)) {
					return null;
				}

				// スイッチング業務処理状況確認テーブルから前回実行時の情報を取得
				Te72 te72EntityModel = session.selectOne(
						"com.common.dao.customTe72Mapper.getAfBizProcStatusCheckLinkRequestInfo", 
						stationCd);

				Te73 targetTe73EntityModel = null;

				if (te72EntityModel != null) {

					// 業務処理状況確認マスタの選別を行う
					targetTe73EntityModel = this.getTargetTe73Entity(
							te73EntityModelList, te72EntityModel.getTe72101());

					// スイッチング業務処理状況確認データの更新
					this.updateSwitchingBizProcStatusConfirm(session, stationCd,
							targetTe73EntityModel);

				} else {

					if (!CollectionUtils.isEmpty(te73EntityModelList)) {

						targetTe73EntityModel = te73EntityModelList.get(0);

						// スイッチング業務処理状況確認データの新規登録
						this.insertSwitchingBizProcStatusConfirm(session, stationCd,
								targetTe73EntityModel);

					}
				}

				/** 連携要求情報に必要な追加情報を取得する */

				Te79 targetAppEntity = null;

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
						params.clear();
						params.put("te79001", stationCd);
						params.put("te79002", targetTe73EntityModel.getTe73601());
						params.put("te79103", searchId);
						List<Te79> appEntityList = session.selectList(
								"com.common.dao.customTe79Mapper.findByRenkeiRequestInfoForProcessedStatus",
								params);

						// 取得できなかった場合
						if (appEntityList == null || appEntityList.size() == 0) {
							// 処理結果正常として終了する
							return null;
						}

						/** 処理中の申込を取得する */

						// 処理中連携番号が空ではない場合
						if (targetTe73EntityModel.getTe73501() != null) {

							List<Te79> targetList = this
									.getTargetAppEntity(session, appEntityList,
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
						this.updateAppEntity(session, stationCd,
								targetTe73EntityModel.getTe73002(),
								targetAppEntity.getTe79002());

						// 契約情報を取得する
						params.clear();
						params.put("stationCd", stationCd);
						params.put("customerCd", targetAppEntity.getTe79104());
						params.put("seqNo", targetAppEntity.getTe79105());
						contractInfoResult = session.selectOne(
								"contractServiceDao.getSwitchingContractInfo",
								params);
						
						// 小売事業者情報を取得する
						Tpe7 paramTpe7 = new Tpe7();
						paramTpe7.setTpe7001(stationCd);
						paramTpe7.setTpe7002("SXA0023");
						paramTpe7.setTpe7003("KORI");
						tpe7EntityModelList = session.selectList(
								"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
								paramTpe7);
					} else {

						/** 上記サービスID以外 */

						// 小売事業者情報を取得する
						Tpe7 paramTpe7 = new Tpe7();
						paramTpe7.setTpe7001(stationCd);
						paramTpe7.setTpe7002("SXA0023");
						paramTpe7.setTpe7003("KORI");
						tpe7EntityModelList = session.selectList(
								"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
								paramTpe7);

						// スイッチング廃止取次検索設定を取得する
						paramTpe7.setTpe7001(stationCd);
						paramTpe7.setTpe7002("SXA0023");
						paramTpe7.setTpe7003("HAISHITORITSUGI_SET");
						tpe7EntityModelList = session.selectList(
								"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
								paramTpe7);
						
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
						result.setTpe7List(tpe7EntityModelList);
						// 契約情報
						result.setContractInfoResult(contractInfoResult);
						// 申込情報
						result.setTe79EntityMode(targetAppEntity);
						// 最終未完了連携番号
						result.setLastIncompleteRenKeiNum(targetTe73EntityModel
								.getTe73601());
						// 業務処理状況確認連番
						result.setProcessingStatusSerialNumber(new BigDecimal(targetTe73EntityModel
								.getTe73002()));

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
						result.setTpe7List(tpe7EntityModelList);
						
						// スイッチング廃止取次検索設定情報
						result.setTpe7SearchSettingList(tpe7EntityModelSearchSettingList);
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
	 * 業務処理状況確認連番値を基に業務処理状況確認マスタ情報を選別する
	 * 
	 * @param te73EntityModelList
	 *            業務処理状況確認マスタリスト
	 * @param targetNo
	 *            業務処理状況確認連番の判定値
	 * @return 業務処理状況確認マスタ情報
	 */
	private Te73 getTargetTe73Entity(
			List<Te73> te73EntityModelList, int targetNo) {

		Te73 resultEntityModel = null;

		// 業務処理状況確認マスタの存在確認
		if (!CollectionUtils.isEmpty(te73EntityModelList)) {

			// 指定した業務処理状況確認連番より値が大きいEntityを抽出
			for (Te73 model : te73EntityModelList) {
				if (targetNo < model.getTe73002()) {
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
	 * スイッチング業務処理状況確認データの更新を行う<br>
	 * 対象テーブル = TE72
	 * 
	 * @param principal
	 *            プリンシパル
	 * @param te73EntityModel
	 *            スイッチング業務処理状況確認マスタ
	 * @throws EntityNotFoundException
	 */
	private void updateSwitchingBizProcStatusConfirm(SqlSession session, String stationCd,
			Te73 te73EntityModel) throws Exception {

		// 局コードを基にレコードを抽出且つ、ロックする
		Te72 paramTe72 = new Te72();
		Te72 te72EntityModel = session.selectOne("com.common.dao.Te72Mapper.selectByPrimaryKey", stationCd);

		// 処理中業務状況確認連番を設定
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// 更新日時を設定
		te72EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// 更新APPを設定
		te72EntityModel.setUpdateApp("SXA0023");
//		// DBレコード有無フラグを設定
//		te72EntityModel.setPersist(true);

		// 更新処理を実行
		session.update("com.common.dao.Te72Mapper.updateByPrimaryKey", te72EntityModel);
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
	private void insertSwitchingBizProcStatusConfirm(SqlSession session, String stationCd,
			Te73 te73EntityModel) {

		Te72 te72EntityModel = new Te72();

		Timestamp nowTimestamp = new Timestamp(System.currentTimeMillis());

		// 局コードを設定
		te72EntityModel.setTe72001(stationCd);
		// 処理中業務状況確認連番を設定
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// 登録日時を設定
		te72EntityModel.setCreateTimestamp(nowTimestamp);
		// 更新日時を設定
		te72EntityModel.setUpdateTimestamp(nowTimestamp);
		// 更新APPを設定
		te72EntityModel.setUpdateApp("SXA0023");
//		// DBレコード有無フラグを設定
//		te72EntityModel.setPersist(false);

		// 新規登録処理を実行
		session.insert("com.common.dao.Te72Mapper.insert", te72EntityModel);
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
	 * 対象となる申込情報を取得する
	 * 
	 * @param te79EntityModelList
	 *            申込情報リスト
	 * @param targetNo
	 *            連携番号
	 * @return 対象となる申込情報
	 */
	private List<Te79> getTargetAppEntity(SqlSession session, 
			List<Te79> te79EntityModelList, BigDecimal targetNo) {

		List<Te79> resultList = new ArrayList<Te79>();

		// 申込情報の存在確認
		if (!CollectionUtils.isEmpty(te79EntityModelList)) {

			// 指定した処理中連番より値が大きいEntityを抽出
			for (Te79 model : te79EntityModelList) {

				if (targetNo.compareTo(model.getTe79002()) < 0) {
					resultList.add(model);
				}

			}

		}

		return resultList;
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
	private void updateAppEntity(SqlSession session, String te73001,
			int te73002, BigDecimal TE73501)
			throws Exception {

		// 局コードを基にレコードを抽出且つ、ロックする
		Te73Key key = new Te73Key();
		key.setTe73001(te73001);
		key.setTe73002(te73002);
		Te73 te73EntityModel = session.selectOne(
				"com.common.dao.Te73Mapper.selectByPrimaryKey",
				key);

		// 処理中連携番号を設定
		te73EntityModel.setTe73501(TE73501);
		// 更新日時を設定
		te73EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// 更新APPを設定
		te73EntityModel.setUpdateApp("SXA0023");
//		// DBレコード有無フラグを設定
//		te73EntityModel.setPersist(true);

		// 更新処理を実行
		session.update("com.common.dao.Te73Mapper.updateByPrimaryKey", te73EntityModel);
	}

	/**
	 * 小売事業者コードを取得します。
	 * 
	 * @param tpeEntityList
	 *            TPE7画面設定マスタリスト
	 * @param companyArea 電力エリア
	 * @return 小売事業者コード
	 */
	private String getRetailCd(List<Tpe7> tpeEntityList, String companyArea) {

		String result = null;

		// TPE7画面設定マスタリストの存在確認
		if (!CollectionUtils.isEmpty(tpeEntityList)) {

			// TPE7画面設定マスタリストのレコード群に対して任意設定KEY2 = CODEのレコードを探索
			for (Tpe7 entity : tpeEntityList) {

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

}
