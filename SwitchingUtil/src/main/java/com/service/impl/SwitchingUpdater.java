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
	
	/** ���b�Z�[�WID */
	private final String CHECK_MSG_ID_NO_1 = "message.010407";
	private final String CHECK_MSG_ID_NO_2 = "message.010408";
	private final String CHECK_MSG_ID_NO_3 = "message.010409";
	private final String CHECK_MSG_ID_NO_4 = "message.010445";
	private final String CHECK_MSG_ID_NO_5 = "message.010449";
	private final String CHECK_MSG_ID_NO_6 = "message.010465";
	private final String CHECK_MSG_ID_NO_7 = "message.010466";
	private final String CHECK_MSG_ID_NO_8 = "message.010467";
	private final String CHECK_MSG_ID_NO_9 = "message.010468";
	
	/** ������ */
	private final BigDecimal PROCESSING_STATUS_PROCESSING = new BigDecimal(1);
	private final BigDecimal PROCESSING_STATUS_OK = new BigDecimal(2);
	private final BigDecimal PROCESSING_STATUS_NG = new BigDecimal(3);
	private final BigDecimal PROCESSING_STATUS_CHANGE = new BigDecimal(4);
	private final BigDecimal PROCESSING_STATUS_CANCEL = new BigDecimal(5);
	
	/** �G���[��� */
	private final int ERROR_KIND_0 = 0;
	private final int ERROR_KIND_1 = 1;
	private final int ERROR_KIND_2 = 2;
	private final int ERROR_KIND_3 = 3;
	private final int ERROR_KIND_4 = 4;
	private final int ERROR_KIND_5 = 5;
	private final int ERROR_KIND_6 = 6;
	
	/** �X�V�t���O */
	private final BigDecimal UPDATE_FLAG_NEW = new BigDecimal(1);
	private final BigDecimal UPDATE_FLAG_CHANGE = new BigDecimal(2);
	private final BigDecimal UPDATE_FLAG_CANCEL = new BigDecimal(3);
	
	/** ��t�H�� */
	private final String UKETSUKE_KOUTEI_05 = "05";
	private final String UKETSUKE_KOUTEI_06 = "06";
	private final String UKETSUKE_KOUTEI_08 = "08";
	private final String UKETSUKE_KOUTEI_09 = "09";
	
	/** �ʒm�t���O */
	private final BigDecimal NOTIFICATION_FLAG_TRUE = new BigDecimal(1);
	
	// --- �萔�@�T�[�r�XID
	/** IF_10410(�ē_(�ሳ)) */
	private final String IF_10410 = "IF_10410";
	/** IF_F10410(�ē_(�ሳFIT�d��)) */
	private final String IF_F10410 = "IF_F10410";
	/** IF_10420(�Ɩ������󋵊m�F(�ሳ)(�ē_)) */
	private final String IF_10420 = "IF_10420";
	/** IF_F10420(�Ɩ������󋵊m�F(�ሳFIT�d��)(�ē_)) */
	private final String IF_F10420 = "IF_F10420";
	/** IF_10510(�p�~�E�P��(�ሳ)) */
	private final String IF_10510 = "IF_10510";
	/** IF_K10510(�p�~�E�P��(����(500kw����)) */
	private final String IF_K10510 = "IF_K10510";
	/** IF_F10510(�p�~�E�P��(�ሳFIT�d��)) */
	private final String IF_F10510 = "IF_F10510";
	/** IF_10520(�Ɩ������󋵊m�F(�ሳ)(�p�~�E�P��)) */
	private final String IF_10520 = "IF_10520";
	/** IF_K10520(�Ɩ������󋵊m�F(����(500kw����))(�p�~�E�P��)) */
	private final String IF_K10520 = "IF_K10520";
	/** IF_F10520(�Ɩ������󋵊m�F(�ሳFIT�d��)(�p�~�E�P��)) */
	private final String IF_F10520 = "IF_F10520";
	/** IF_10110(�ݔ����Ɖ�(�ሳ)) */
	private final String IF_10110 = "IF_10110";
	/** IF_F10110(�ݔ����Ɖ�(�ሳFIT�d��)) */
	private final String IF_F10110 = "IF_F10110";
	/** IS_20110(�X�C�b�`���O�p�~�掟�o�^(�ሳ)) */
	private final String IS_20110 = "IS_20110";
	/** IS_K20110(�X�C�b�`���O�p�~�掟�o�^(����(500kw����))) */
	private final String IS_K20110 = "IS_K20110";
	/** IS_F20110(�X�C�b�`���O�p�~�掟�o�^(�ሳFIT�d��)) */
	private final String IS_F20110 = "IS_F20110";
	/** IS_20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳ)) */
	private final String IS_20310 = "IS_20310";
	/** IS_K20310(�X�C�b�`���O�p�~�掟�Ɖ�(����(500kw����))) */
	private final String IS_K20310 = "IS_K20310";
	/** IS_20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳ)) */
	private final String IS_20210 = "IS_20210";
	/** IS_K20210(�X�C�b�`���O�p�~�掟���ʏƉ�(����(500kw����))) */
	private final String IS_K20210 = "IS_K20210";
	/** IS_F20210(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��)) */
	private final String IS_F20210 = "IS_F20210";
	/** IF_10610(�X�C�b�`���O�J�n�\��(�ሳ)) */
	private final String IF_10610 = "IF_10610";
	/** IF_K10610(�X�C�b�`���O�J�n�\��(����(500kw����))) */
	private final String IF_K10610 = "IF_K10610";
	/** IF_F10610(�X�C�b�`���O�J�n�\��(�ሳFIT�d��)) */
	private final String IF_F10610 = "IF_F10610";
	/** IF_10620(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�J�n)) */
	private final String IF_10620 = "IF_10620";
	/** IF_K10620(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�J�n)) */
	private final String IF_K10620 = "IF_K10620";
	/** IF_F10620(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�J�n)) */
	private final String IF_F10620 = "IF_F10620";
	/** IS_20410(�X�C�b�`���O�p�~�掟���f(�ሳ)) */
	private final String IS_20410 = "IS_20410";
	/** IS_K20410(�X�C�b�`���O�p�~�掟���f(����(500kw����)) */
	private final String IS_K20410 = "IS_K20410";
	/** IS_F20410(�X�C�b�`���O�p�~�掟���f(�ሳFIT�d��)) */
	private final String IS_F20410 = "IS_F20410";
	/** IF_10710(�X�C�b�`���O�p�~�\��(�ሳ)) */
	private final String IF_10710 = "IF_10710";
	/** IF_K10710(�X�C�b�`���O�p�~�\��(����(500kw����))) */
	private final String IF_K10710 = "IF_K10710";
	/** IF_F10710(�X�C�b�`���O�p�~�\��(�ሳFIT�d��)) */
	private final String IF_F10710 = "IF_F10710";
	/** IF_10720(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�p�~)) */
	private final String IF_10720 = "IF_10720";
	/** IF_K10720(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�p�~)) */
	private final String IF_K10720 = "IF_K10720";
	/** IF_F10720(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�p�~)) */
	private final String IF_F10720 = "IF_F10720";
	/** IF_10910(�A���y�A�ύX(�ሳ)) */
	private final String IF_10910 = "IF_10910";
	/** IF_10920(�Ɩ������󋵊m�F(�ሳ)(�A���y�A�ύX)) */
	/** IF_10810(���v�ҏ��ύX(�ሳ)) */
	private final String IF_10920 = "IF_10920";
	/** IF_10810(���v�ꏊ���ύX�\��(�ሳ)) */
	private final String IF_10810 = "IF_10810";
	/** IF_K10810(���v�ҏ��ύX(�ሳ)) */
	private final String IF_K10810 = "IF_K10810";
	/** IF_F10810(��d�ҏ��ύX) */
	private final String IF_F10810 = "IF_F10810";
	/** IF_10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX)) */
	private final String IF_10820 = "IF_10820";
	/** IF_K10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX)) */
	private final String IF_K10820 = "IF_K10820";
	/** IF_F10820(�Ɩ������󋵊m�F(��d�ҏ��ύX)) */
	private final String IF_F10820 = "IF_F10820";
	/** IF_10210(�g�p�ʏ��Ɖ�\��(�ሳ)) */
	private final String IF_10210 = "IF_10210";
	/** IF_K10210(�g�p�ʏ��Ɖ�\��(����(500kw����)) */
	private final String IF_K10210 = "IF_K10210";
	/** IF_10220(�Ɩ������󋵊m�F(�ሳ)(�g�p�ʏ��Ɖ�)) */
	private final String IF_10220 = "IF_10220";
	/** IF_K10220(�Ɩ������󋵊m�F(�ሳ)(����(500kw����)) */
	private final String IF_K10220 = "IF_K10220";
	/** IF_10310(�g�p�ʏ��Ɖ�(�ሳ)) */
	private final String IF_10310 = "IF_10310";
	/** IF_K10310(�g�p�ʏ��Ɖ�(����(500kw����))) */
	private final String IF_K10310 = "IF_K10310";
	/** IF_11110(�ٓ��\���ꊇ�擾(����)(�ሳ)) */
	private final String IF_11110 = "IF_11110";
	/** IF_K11110(�ٓ��\���ꊇ�擾(����)(����)) */
	private final String IF_K11110 = "IF_K11110";
	/** IF_F11110(��d�ړ��\���ꊇ�擾(����)) */
	private final String IF_F11110 = "IF_F11110";
	/** IS_F20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��)) */
	private final String IS_F20310 = "IS_F20310";

	/**
	 * �A�g�v�����쐬�T�[�r�X �{�T�[�r�X���g�p���āA�A�g�v�������쐬����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h �ǃR�[�h
	 * @return ���s���� �A�g�v�����
	 */
	public LinkRequestInfoResult createLinkRequestInfo(String stationCd, SqlSession session) {

		if (stationCd == null) {
			throw new RuntimeException("stationCd is null");
		}

		System.out.println("	�ǃR�[�h:[" + stationCd + "]");

		// �A�g�v�����
		LinkRequestInfoResult result = new LinkRequestInfoResult();
		// �������Ǝҏ�񃊃X�g
		List<Tpe7> tpe7EntityModelList = null;
		// �_����
		GetSwitchingContractInfoResult contractInfoResult = null;
		// �ڋq�Z�����
		List<T105> t105EntityModelList = null;
		// ���I�ؖ������
		List<T0a9> t0a9EntityModelList = null;
		// �p�~�掟���
		Te76 te76EntityModel = null;
		// �X�C�b�`���O�p�~�掟�����ݒ��񃊃X�g
		List<Tpe7> tpe7EntityModelSearchSettingList = null;		

		Map<String, Object> params = new HashMap();
		
		try {
			// �X�C�b�`���O�A�g�Ǘ������X�C�b�`���O�A�g�Ǘ��e�[�u������擾����
			params.clear();
			params.put("stationCd", stationCd);
			Te79 te79EntityModel = session.selectOne(
					"com.common.dao.customTe79Mapper.findByRenkeiRequestInfo",
					params);

			// �擾�ł����ꍇ
			if (te79EntityModel != null) {

				// �������Ǝҏ����擾����
				Tpe7 paramTpe7 = new Tpe7();
				paramTpe7.setTpe7001(stationCd);
				paramTpe7.setTpe7002("SXA0023");
				paramTpe7.setTpe7003("KORI");
				tpe7EntityModelList = session.selectList(
						"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
						paramTpe7);

				// �X�C�b�`���O�A�g�Ǘ���񂩂�ڋq�R�[�h�ƘA�Ԃ��擾�ł���ꍇ�̂ݎ��{
				if (te79EntityModel.getTe79104() != null
						&& te79EntityModel.getTe79105() != null) {

					// �_������擾����
					params.clear();
					params.put("stationCd", stationCd);
					params.put("customerCd", te79EntityModel.getTe79104());
					params.put("statiseqNoonCd", te79EntityModel.getTe79105());
					contractInfoResult = session.selectOne(
							"contractServiceDao.getSwitchingContractInfo",
							params);

					// �ڋq�Z�������擾����
					params.clear();
					params.put("t105001", stationCd);
					params.put("t105002", te79EntityModel.getTe79104());
					t105EntityModelList = session.selectList(
							"com.common.dao.customT105Mapper.findByCustomerAddressInfo",
							params);

					// ���I�ؖ������擾����
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

				// �X�C�b�`���O�A�g�v���g�����ڏ����擾����
				params.clear();
				params.put("te7a001", stationCd);
				params.put("te7a002", te79EntityModel.getTe79002());
				params.put("te7a003", te79EntityModel.getTe79003());
				List<Te7a> te7aEntityModelList = session.selectList(
						"com.common.dao.customTe7aMapper.findByExtensionItemInfo",
						params);
				
				// �p�~�掟�����擾����
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

				/** �A�g�v�������쐬���� */

				// �ǃR�[�h
				result.setStationCd(te79EntityModel.getTe79001());
				// �A�g�ԍ�
				result.setRenKeiNum(te79EntityModel.getTe79002());
				// �A�g�ԍ��A��
				result.setRenKeiSerialNum(new BigDecimal(te79EntityModel.getTe79003()));
				// �A�g�v������
				result.setRenKeiEntryDatetime(new Timestamp(te79EntityModel.getTe79101().getTime()));
				// ������
				result.setProcessingStatus(new BigDecimal(te79EntityModel.getTe79102()));
				// �T�[�r�XID
				result.setServiceId(te79EntityModel.getTe79103());
				// �ڋq�R�[�h
				result.setCustomerCd(te79EntityModel.getTe79104());
				// �A��
				result.setSerialNumber(te79EntityModel.getTe79105());
				// �X�V�t���O
				result.setFlagUpdate(new BigDecimal(te79EntityModel.getTe79106()));
				// �\�����
				result.setAppType(te79EntityModel.getTe79107());
				// �\���ԍ�
				result.setAppNo(te79EntityModel.getTe79501());
				// �p�~�掟�ԍ�
				result.setAbolitionAgencyNo(te79EntityModel.getTe79601());

				String companyArea = "";
				// �d�͉�ЃG���A
				if (IS_20410.equals(te79EntityModel.getTe79103()) || IS_K20410.equals(te79EntityModel.getTe79103())
						|| IS_F20410.equals(te79EntityModel.getTe79103())) {
					// 2�����ȏ゠��ꍇ�͏�2�����擾
					companyArea = te76EntityModel.getTe76206();
					if (companyArea.length() > 2) {
						companyArea = companyArea.substring(0, 2);
					}
				} else {
					// Change start 20160422 A.Takemi [CATPPS-1573]
					// �X�C�b�`���O�A�g�g������.�l(�f�[�^���ږ� = DENRYOKUGAISHA_AREA����擾 )
					for (Te7a model : te7aEntityModelList) {
						if (Const.LINK_DENRYOKUGAISHA_AREA.equals(model.getTe7a005())) {
							companyArea = model.getTe7a101();
						}
					}
					
					// ��L����擾�ł��Ȃ������ꍇ
					if (StringUtils.isEmpty(companyArea)) {
						if (contractInfoResult != null) {
							companyArea = contractInfoResult.getPointIdentificationNumber();
						}
					}
					// Change end 20160422 A.Takemi [CATPPS-1573]
					
					// 2�����ȏ゠��ꍇ�͏�2�����擾
					if (companyArea.length() > 2) {
						companyArea = companyArea.substring(0, 2);
					}
				}
				result.setPowerCompanyArea(companyArea);
				
				// �������Ǝ҃R�[�h
				result.setRetailCd(this.getRetailCd(tpe7EntityModelList, companyArea));

				// �������Ǝҏ��
				result.setTpe7List(tpe7EntityModelList);
				// �_����
				result.setContractInfoResult(contractInfoResult);
				// �ڋq�Z�����
				result.setT105EntityModelList(t105EntityModelList);
				// ���I�ؖ������
				result.setT0a9EntityModelList(t0a9EntityModelList);
				// �X�C�b�`���O�A�g�v���g�����ڏ��
				result.setTe7aEntityModelList(te7aEntityModelList);
				// �p�~�掟���
				result.setTe76(te76EntityModel);

			} else {
				// �擾�ł��Ȃ������ꍇ

				// �Ɩ������󋵊m�F�}�X�^����A�g�v����I�肷��
				List<Te73> te73EntityModelList = session.selectList(
						"com.common.dao.customTe73Mapper.getBizProcStatusCheckLinkRequestInfo",
						stationCd);
				
				if(CollectionUtils.isEmpty(te73EntityModelList)) {
					return null;
				}

				// �X�C�b�`���O�Ɩ������󋵊m�F�e�[�u������O����s���̏����擾
				Te72 te72EntityModel = session.selectOne(
						"com.common.dao.customTe72Mapper.getAfBizProcStatusCheckLinkRequestInfo", 
						stationCd);

				Te73 targetTe73EntityModel = null;

				if (te72EntityModel != null) {

					// �Ɩ������󋵊m�F�}�X�^�̑I�ʂ��s��
					targetTe73EntityModel = this.getTargetTe73Entity(
							te73EntityModelList, te72EntityModel.getTe72101());

					// �X�C�b�`���O�Ɩ������󋵊m�F�f�[�^�̍X�V
					this.updateSwitchingBizProcStatusConfirm(session, stationCd,
							targetTe73EntityModel);

				} else {

					if (!CollectionUtils.isEmpty(te73EntityModelList)) {

						targetTe73EntityModel = te73EntityModelList.get(0);

						// �X�C�b�`���O�Ɩ������󋵊m�F�f�[�^�̐V�K�o�^
						this.insertSwitchingBizProcStatusConfirm(session, stationCd,
								targetTe73EntityModel);

					}
				}

				/** �A�g�v�����ɕK�v�Ȓǉ������擾���� */

				Te79 targetAppEntity = null;

				if (targetTe73EntityModel != null) {

					// ����p�T�[�r�XID
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

						// ���������̃T�[�r�XID���擾
						String searchId = this
								.getSearchingServiceId(checkServiceId);

						// �\�������擾
						params.clear();
						params.put("te79001", stationCd);
						params.put("te79002", targetTe73EntityModel.getTe73601());
						params.put("te79103", searchId);
						List<Te79> appEntityList = session.selectList(
								"com.common.dao.customTe79Mapper.findByRenkeiRequestInfoForProcessedStatus",
								params);

						// �擾�ł��Ȃ������ꍇ
						if (appEntityList == null || appEntityList.size() == 0) {
							// �������ʐ���Ƃ��ďI������
							return null;
						}

						/** �������̐\�����擾���� */

						// �������A�g�ԍ�����ł͂Ȃ��ꍇ
						if (targetTe73EntityModel.getTe73501() != null) {

							List<Te79> targetList = this
									.getTargetAppEntity(session, appEntityList,
											targetTe73EntityModel.getTe73501());

							// �ΏۂƂȂ�\����񃊃X�g���擾�ł���������
							if (!CollectionUtils.isEmpty(targetList)) {

								// �ΏۂƂȂ�\������1���ڂ������ΏۂƂ���
								targetAppEntity = targetList.get(0);
							} else {
								// ���O�Ɏ擾�����\������1���ڂ������ΏۂƂ���
								targetAppEntity = appEntityList.get(0);
							}
						} else {
							// �������\����������̏ꍇ

							// ���O�Ɏ擾�����\������1���ڂ������ΏۂƂ���
							targetAppEntity = appEntityList.get(0);
						}

						// �����Ώۂ̐\������p���ď������A�g�ԍ����X�V����
						this.updateAppEntity(session, stationCd,
								targetTe73EntityModel.getTe73002(),
								targetAppEntity.getTe79002());

						// �_������擾����
						params.clear();
						params.put("stationCd", stationCd);
						params.put("customerCd", targetAppEntity.getTe79104());
						params.put("seqNo", targetAppEntity.getTe79105());
						contractInfoResult = session.selectOne(
								"contractServiceDao.getSwitchingContractInfo",
								params);
						
						// �������Ǝҏ����擾����
						Tpe7 paramTpe7 = new Tpe7();
						paramTpe7.setTpe7001(stationCd);
						paramTpe7.setTpe7002("SXA0023");
						paramTpe7.setTpe7003("KORI");
						tpe7EntityModelList = session.selectList(
								"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
								paramTpe7);
					} else {

						/** ��L�T�[�r�XID�ȊO */

						// �������Ǝҏ����擾����
						Tpe7 paramTpe7 = new Tpe7();
						paramTpe7.setTpe7001(stationCd);
						paramTpe7.setTpe7002("SXA0023");
						paramTpe7.setTpe7003("KORI");
						tpe7EntityModelList = session.selectList(
								"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
								paramTpe7);

						// �X�C�b�`���O�p�~�掟�����ݒ���擾����
						paramTpe7.setTpe7001(stationCd);
						paramTpe7.setTpe7002("SXA0023");
						paramTpe7.setTpe7003("HAISHITORITSUGI_SET");
						tpe7EntityModelList = session.selectList(
								"com.common.dao.customTpe7Mapper.getDisplayConfigMasterList",
								paramTpe7);
						
					}

					// �A�g�v�������쐬����
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

						// �T�[�r�XID
						result.setServiceId(checkServiceId);
						// �ڋq�R�[�h
						result.setCustomerCd(targetAppEntity.getTe79104());
						// �A��
						result.setSerialNumber(targetAppEntity.getTe79105());
						// �\�����
						result.setAppType(targetAppEntity.getTe79107());
						// �\���ԍ�
						result.setAppNo(targetAppEntity.getTe79501());
						
						// �d�͉�ЃG���A
						String companyArea = "";
						if (contractInfoResult != null && !StringUtils.isEmpty(contractInfoResult
									.getPointIdentificationNumber())) {
							// �_���񂪎擾�o�����ꍇ����2�����ȏ゠��ꍇ�͏�2�����擾
							companyArea = contractInfoResult
									.getPointIdentificationNumber();
							if (companyArea.length() > 2) {
								companyArea = companyArea.substring(0, 2);
							}
						}
						result.setPowerCompanyArea(companyArea);
						// �������Ǝ҃R�[�h
						result.setRetailCd(this.getRetailCd(tpe7EntityModelList, companyArea));
						// �������Ǝҏ��
						result.setTpe7List(tpe7EntityModelList);
						// �_����
						result.setContractInfoResult(contractInfoResult);
						// �\�����
						result.setTe79EntityMode(targetAppEntity);
						// �ŏI�������A�g�ԍ�
						result.setLastIncompleteRenKeiNum(targetTe73EntityModel
								.getTe73601());
						// �Ɩ������󋵊m�F�A��
						result.setProcessingStatusSerialNumber(new BigDecimal(targetTe73EntityModel
								.getTe73002()));

					} else {

						// ��L�T�[�r�XID�ȊO�̏ꍇ

						// �T�[�r�XID
						result.setServiceId(checkServiceId);

						// �d�͉�ЃG���A
						String companyArea  = targetTe73EntityModel.getTe73301();
						
						result.setPowerCompanyArea(companyArea);
						
						// �������Ǝ҃R�[�h
						result.setRetailCd(this.getRetailCd(tpe7EntityModelList, companyArea));
						
						// �������Ǝҏ��
						result.setTpe7List(tpe7EntityModelList);
						
						// �X�C�b�`���O�p�~�掟�����ݒ���
						result.setTpe7SearchSettingList(tpe7EntityModelSearchSettingList);
					}
				}
			}

		} catch (Exception e) {
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			// �ُ�̏ꍇ�@�`�F�b�N�d�lNo.6
			// Exception��ݒ肷��
			result.setException(e);
			// �`�F�b�N�d�lNo.6�̃��b�Z�[�WID��ݒ肷��
			result.setErrorMsgId(CHECK_MSG_ID_NO_6);
			// ��O��
			// throw new RuntimeException(e.getMessage(), e);
			// Change End CATPPS-1364 �Ή� A.Miyakawa
		}

		return result;
	}

	/**
	 * �Ɩ������󋵊m�F�A�Ԓl����ɋƖ������󋵊m�F�}�X�^����I�ʂ���
	 * 
	 * @param te73EntityModelList
	 *            �Ɩ������󋵊m�F�}�X�^���X�g
	 * @param targetNo
	 *            �Ɩ������󋵊m�F�A�Ԃ̔���l
	 * @return �Ɩ������󋵊m�F�}�X�^���
	 */
	private Te73 getTargetTe73Entity(
			List<Te73> te73EntityModelList, int targetNo) {

		Te73 resultEntityModel = null;

		// �Ɩ������󋵊m�F�}�X�^�̑��݊m�F
		if (!CollectionUtils.isEmpty(te73EntityModelList)) {

			// �w�肵���Ɩ������󋵊m�F�A�Ԃ��l���傫��Entity�𒊏o
			for (Te73 model : te73EntityModelList) {
				if (targetNo < model.getTe73002()) {
					resultEntityModel = model;
					break;
				}
			}

			// ���o���ʔ���
			if (resultEntityModel == null) {

				// Entity�Q�����݂��Ȃ��ꍇ�A�Ɩ������󋵊m�F�}�X�^��1���ڂ�ݒ�
				resultEntityModel = te73EntityModelList.get(0);
			}
		}

		return resultEntityModel;
	}

	/**
	 * �X�C�b�`���O�Ɩ������󋵊m�F�f�[�^�̍X�V���s��<br>
	 * �Ώۃe�[�u�� = TE72
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param te73EntityModel
	 *            �X�C�b�`���O�Ɩ������󋵊m�F�}�X�^
	 * @throws EntityNotFoundException
	 */
	private void updateSwitchingBizProcStatusConfirm(SqlSession session, String stationCd,
			Te73 te73EntityModel) throws Exception {

		// �ǃR�[�h����Ƀ��R�[�h�𒊏o���A���b�N����
		Te72 paramTe72 = new Te72();
		Te72 te72EntityModel = session.selectOne("com.common.dao.Te72Mapper.selectByPrimaryKey", stationCd);

		// �������Ɩ��󋵊m�F�A�Ԃ�ݒ�
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// �X�V������ݒ�
		te72EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// �X�VAPP��ݒ�
		te72EntityModel.setUpdateApp("SXA0023");
//		// DB���R�[�h�L���t���O��ݒ�
//		te72EntityModel.setPersist(true);

		// �X�V���������s
		session.update("com.common.dao.Te72Mapper.updateByPrimaryKey", te72EntityModel);
	}

	/**
	 * �X�C�b�`���O�Ɩ������󋵊m�F�f�[�^�̐V�K�o�^���s��<br>
	 * �Ώۃe�[�u�� = TE72
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param te73EntityModel
	 *            �X�C�b�`���O�Ɩ������󋵊m�F�}�X�^
	 */
	private void insertSwitchingBizProcStatusConfirm(SqlSession session, String stationCd,
			Te73 te73EntityModel) {

		Te72 te72EntityModel = new Te72();

		Timestamp nowTimestamp = new Timestamp(System.currentTimeMillis());

		// �ǃR�[�h��ݒ�
		te72EntityModel.setTe72001(stationCd);
		// �������Ɩ��󋵊m�F�A�Ԃ�ݒ�
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// �o�^������ݒ�
		te72EntityModel.setCreateTimestamp(nowTimestamp);
		// �X�V������ݒ�
		te72EntityModel.setUpdateTimestamp(nowTimestamp);
		// �X�VAPP��ݒ�
		te72EntityModel.setUpdateApp("SXA0023");
//		// DB���R�[�h�L���t���O��ݒ�
//		te72EntityModel.setPersist(false);

		// �V�K�o�^���������s
		session.insert("com.common.dao.Te72Mapper.insert", te72EntityModel);
	}

	/**
	 * ���������ɗp����T�[�r�XID���擾���܂��B
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
	 * �ΏۂƂȂ�\�������擾����
	 * 
	 * @param te79EntityModelList
	 *            �\����񃊃X�g
	 * @param targetNo
	 *            �A�g�ԍ�
	 * @return �ΏۂƂȂ�\�����
	 */
	private List<Te79> getTargetAppEntity(SqlSession session, 
			List<Te79> te79EntityModelList, BigDecimal targetNo) {

		List<Te79> resultList = new ArrayList<Te79>();

		// �\�����̑��݊m�F
		if (!CollectionUtils.isEmpty(te79EntityModelList)) {

			// �w�肵���������A�Ԃ��l���傫��Entity�𒊏o
			for (Te79 model : te79EntityModelList) {

				if (targetNo.compareTo(model.getTe79002()) < 0) {
					resultList.add(model);
				}

			}

		}

		return resultList;
	}

	/**
	 * TE73�X�C�b�`���O�Ɩ������󋵊m�F�}�X�^�̍X�V���s��<br>
	 * �Ώۃe�[�u�� = TE73
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param te73EntityModel
	 *            �X�C�b�`���O�Ɩ������󋵊m�F�}�X�^
	 * @throws EntityNotFoundException
	 */
	private void updateAppEntity(SqlSession session, String te73001,
			int te73002, BigDecimal TE73501)
			throws Exception {

		// �ǃR�[�h����Ƀ��R�[�h�𒊏o���A���b�N����
		Te73Key key = new Te73Key();
		key.setTe73001(te73001);
		key.setTe73002(te73002);
		Te73 te73EntityModel = session.selectOne(
				"com.common.dao.Te73Mapper.selectByPrimaryKey",
				key);

		// �������A�g�ԍ���ݒ�
		te73EntityModel.setTe73501(TE73501);
		// �X�V������ݒ�
		te73EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// �X�VAPP��ݒ�
		te73EntityModel.setUpdateApp("SXA0023");
//		// DB���R�[�h�L���t���O��ݒ�
//		te73EntityModel.setPersist(true);

		// �X�V���������s
		session.update("com.common.dao.Te73Mapper.updateByPrimaryKey", te73EntityModel);
	}

	/**
	 * �������Ǝ҃R�[�h���擾���܂��B
	 * 
	 * @param tpeEntityList
	 *            TPE7��ʐݒ�}�X�^���X�g
	 * @param companyArea �d�̓G���A
	 * @return �������Ǝ҃R�[�h
	 */
	private String getRetailCd(List<Tpe7> tpeEntityList, String companyArea) {

		String result = null;

		// TPE7��ʐݒ�}�X�^���X�g�̑��݊m�F
		if (!CollectionUtils.isEmpty(tpeEntityList)) {

			// TPE7��ʐݒ�}�X�^���X�g�̃��R�[�h�Q�ɑ΂��ĔC�Ӑݒ�KEY2 = CODE�̃��R�[�h��T��
			for (Tpe7 entity : tpeEntityList) {

				// �C�Ӑݒ�KEY2��"CODE"������
				if ("CODE".equals(entity.getTpe7004())) {
					// �C�Ӑݒ�l1��ݒ�
					result = entity.getTpe7101();
					
					// �d�̓G���A�̉�1�����擾
					// Change start 20160216 A.Takemi [CATPPS-979]
					if (companyArea != null && !companyArea.isEmpty()) {
						result = result + companyArea.charAt(companyArea.length() - 1);
					}
					// Change end 20160216 A.Takemi [CATPPS-979]
					
					// ��A�������I��
					break;
				}
			}
		}

		return result;
	}

}
