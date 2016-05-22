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
 * SwitchingServiceBizLogic�C���^�t�F�[�X�̎����N���X�ł��B �����҂ɂ��g�����s���Ă��������B
 * 
 * @author iTEC Hankyu Hanshin Co., Ltd.
 */
@Component("SwitchingServiceBizLogic")
public class SwitchingServiceBizLogicImpl extends
		BaseSwitchingServiceBizLogicImpl {

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

	// --- �R���X�g���N�^

	/** ��ʐݒ�}�X�^�G���e�B�e�BDAO */
	private Tpe7EntityDao tpe7EntityDao;

	/** �t�@�C���Ǘ��G���e�B�e�BDAO */
	private T0a9EntityDao t0a9EntityDao;

	/** �X�C�b�`���OIF�Ǘ��}�X�^EntityDao */
	private Te71EntityDao te71EntityDao;

	/** �X�C�b�`���O�Ɩ������󋵊m�F�}�X�^EntityDao */
	private Te73EntityDao te73EntityDao;

	/** �X�C�b�`���O�Ɩ������󋵊m�F�e�[�u��EntityDao */
	private Te72EntityDao te72EntityDao;

	/** �X�C�b�`���O�A�g�Ǘ��}�X�^EntityDao */
	private Te79EntityDao te79EntityDao;

	/** �X�C�b�`���O�A�g��t���b�Z�[�WEntityDao */
	private Te7bEntityDao te7bEntityDao;

	/** �����E��d�n�_�ݔ����EntityDao */
	private Te7dEntityDao te7dEntityDao;

	/** �����E��d�n�_�ݔ����_�ٓ��\����tEntityDao */
	private Te7eEntityDao te7eEntityDao;

	/** �����E��d�n�_�ݔ����_�v����EntityDao */
	private Te7fEntityDao te7fEntityDao;

	/** �����E��d�n�_�ݔ����_��z�d��EntityDao */
	private Te7gEntityDao te7gEntityDao;

	/** �����n�_�g�p�ʏ�� */
	private Te7hEntityDao te7hEntityDao;
	
	/** �X�C�b�`���O�A�g���� */
	private Te7jEntityDao te7jEntityDao;

	/** �X�C�b�`���O�p�~�掟���� */
	private Te77EntityDao te77EntityDao;

	/** �X�C�b�`���O�p�~�掟 */
	private Te76EntityDao te76EntityDao;

	/** �X�C�b�`���O�A�g�X�e�[�^�X */
	private Te78EntityDao te78EntityDao;
	
	/** �d�͌_�񋤒� */
	private Te11EntityDao te11EntityDao;
	// Change Start CATPPS-769 �Ή� A.Miyakawa
	/** TE7I�ʒm��ʊǗ� */
	private Te7iEntityDao te7iEntityDao;
	// Change End CATPPS-769 �Ή� A.Miyakawa
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/** TE17SG�d�͌_�񋤒� */
	private Te17EntityDao te17EntityDao;
	// Add End CATPPSSB-246 20160227 A.Miyakawa
	/** �_��T�[�r�X */
	private ContractService contractService;

	/**
	 * ��ʐݒ�}�X�^�G���e�B�e�BDAO���Z�b�g���܂��B
	 * 
	 * @param tpe7EntityDao
	 *            ��ʐݒ�}�X�^�G���e�B�e�BDAO
	 */
	@Resource
	public void setTpe7EntityDao(Tpe7EntityDao tpe7EntityDao) {
		this.tpe7EntityDao = tpe7EntityDao;
	}

	/**
	 * ��ʐݒ�}�X�^�G���e�B�e�BDAO��Ԃ��܂��B
	 * 
	 * @return ��ʐݒ�}�X�^�G���e�B�e�BDAO
	 */
	public Tpe7EntityDao getTpe7EntityDao() {
		return tpe7EntityDao;
	}

	/**
	 * �t�@�C���Ǘ��G���e�B�e�BDAO���Z�b�g���܂��B
	 * 
	 * @param t0a9EntityDao
	 *            �t�@�C���Ǘ��G���e�B�e�BDAO
	 */
	@Resource
	public void setT0a9EntityDao(T0a9EntityDao t0a9EntityDao) {
		this.t0a9EntityDao = t0a9EntityDao;
	}

	/**
	 * �t�@�C���Ǘ��G���e�B�e�BDAO��Ԃ��܂��B
	 * 
	 * @return �t�@�C���Ǘ��G���e�B�e�BDAO
	 */
	public T0a9EntityDao getT0a9EntityDao() {
		return t0a9EntityDao;
	}

	/**
	 * �@�X�C�b�`���OIF�Ǘ��}�X�^EntityDao��Ԃ��܂��B
	 * 
	 * @return te71EntityDao�@�X�C�b�`���OIF�Ǘ��}�X�^EntityDao��߂��܂��B
	 */
	public Te71EntityDao getTe71EntityDao() {
		return te71EntityDao;
	}

	/**
	 * �@�X�C�b�`���OIF�Ǘ��}�X�^EntityDao���Z�b�g���܂��B
	 * 
	 * @param te71EntityDao
	 *            �X�C�b�`���OIF�Ǘ��}�X�^EntityDao��ݒ�B
	 */
	@Resource
	public void setTe71EntityDao(Te71EntityDao te71EntityDao) {
		this.te71EntityDao = te71EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�Ɩ������󋵊m�F�}�X�^EntityDao��Ԃ��܂��B
	 * 
	 * @return te73EntityDao�@�X�C�b�`���O�Ɩ������󋵊m�F�}�X�^EntityDao��߂��܂��B
	 */
	public Te73EntityDao getTe73EntityDao() {
		return te73EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�Ɩ������󋵊m�F�}�X�^EntityDao���Z�b�g���܂��B
	 * 
	 * @param te73EntityDao
	 *            �X�C�b�`���O�Ɩ������󋵊m�F�}�X�^EntityDao��ݒ�B
	 */
	@Resource
	public void setTe73EntityDao(Te73EntityDao te73EntityDao) {
		this.te73EntityDao = te73EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�Ɩ������󋵊m�F�e�[�u��EntityDao��Ԃ��܂��B
	 * 
	 * @return te72EntityDao�@�X�C�b�`���O�Ɩ������󋵊m�F�e�[�u��EntityDao��߂��܂��B
	 */
	public Te72EntityDao getTe72EntityDao() {
		return te72EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�Ɩ������󋵊m�F�e�[�u��EntityDao���Z�b�g���܂��B
	 * 
	 * @param te72EntityDao
	 *            �X�C�b�`���O�Ɩ������󋵊m�F�e�[�u��EntityDao��ݒ�B
	 */
	@Resource
	public void setTe72EntityDao(Te72EntityDao te72EntityDao) {
		this.te72EntityDao = te72EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�A�g�Ǘ��}�X�^EntityDao��Ԃ��܂��B
	 * 
	 * @return te79EntityDao�@�X�C�b�`���O�A�g�Ǘ��}�X�^EntityDao��߂��܂��B
	 */
	public Te79EntityDao getTe79EntityDao() {
		return te79EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�A�g�Ǘ��}�X�^EntityDao���Z�b�g���܂��B
	 * 
	 * @param te79EntityDao
	 *            �X�C�b�`���O�A�g�Ǘ��}�X�^EntityDao��ݒ�B
	 */
	@Resource
	public void setTe79EntityDao(Te79EntityDao te79EntityDao) {
		this.te79EntityDao = te79EntityDao;
	}

	/**
	 * �X�C�b�`���O�A�g��t���b�Z�[�WEntityDao��Ԃ��܂��B
	 * @return �X�C�b�`���O�A�g��t���b�Z�[�WEntityDao
	 */
	public Te7bEntityDao getTe7bEntityDao() {
		return te7bEntityDao;
	}

	/**
	 * �X�C�b�`���O�A�g��t���b�Z�[�WEntityDao���Z�b�g���܂��B
	 * @param te7bEntityDao �X�C�b�`���O�A�g��t���b�Z�[�WEntityDao
	 */
	@Resource
	public void setTe7bEntityDao(Te7bEntityDao te7bEntityDao) {
		this.te7bEntityDao = te7bEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����EntityDao��Ԃ��܂��B
	 * 
	 * @return te7dEntityDao�@�����E��d�n�_�ݔ����EntityDao��߂��܂��B
	 */
	public Te7dEntityDao getTe7dEntityDao() {
		return te7dEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����EntityDao���Z�b�g���܂��B
	 * 
	 * @param te7dEntityDao
	 *            �����E��d�n�_�ݔ����EntityDao��ݒ�B
	 */
	@Resource
	public void setTe7dEntityDao(Te7dEntityDao te7dEntityDao) {
		this.te7dEntityDao = te7dEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����_�ٓ��\����tEntityDao��Ԃ��܂��B
	 * 
	 * @return te7eEntityDao�@�����E��d�n�_�ݔ����_�ٓ��\����tEntityDao��߂��܂��B
	 */
	public Te7eEntityDao getTe7eEntityDao() {
		return te7eEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����_�ٓ��\����tEntityDao���Z�b�g���܂��B
	 * 
	 * @param te7eEntityDao
	 *            �����E��d�n�_�ݔ����_�ٓ��\����tEntityDao��ݒ�B
	 */
	@Resource
	public void setTe7eEntityDao(Te7eEntityDao te7eEntityDao) {
		this.te7eEntityDao = te7eEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����_�v����EntityDao��Ԃ��܂��B
	 * 
	 * @return te7fEntityDao�@�����E��d�n�_�ݔ����_�v����EntityDao��߂��܂��B
	 */
	public Te7fEntityDao getTe7fEntityDao() {
		return te7fEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����_�v����EntityDao���Z�b�g���܂��B
	 * 
	 * @param te7fEntityDao
	 *            �����E��d�n�_�ݔ����_�v����EntityDao��ݒ�B
	 */
	@Resource
	public void setTe7fEntityDao(Te7fEntityDao te7fEntityDao) {
		this.te7fEntityDao = te7fEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����_��z�d��EntityDao��Ԃ��܂��B
	 * 
	 * @return te7gEntityDao�@�����E��d�n�_�ݔ����_��z�d��EntityDao��߂��܂��B
	 */
	public Te7gEntityDao getTe7gEntityDao() {
		return te7gEntityDao;
	}

	/**
	 * �@�����E��d�n�_�ݔ����_��z�d��EntityDao���Z�b�g���܂��B
	 * 
	 * @param te7gEntityDao
	 *            �����E��d�n�_�ݔ����_��z�d��EntityDao��ݒ�B
	 */
	@Resource
	public void setTe7gEntityDao(Te7gEntityDao te7gEntityDao) {
		this.te7gEntityDao = te7gEntityDao;
	}

	/**
	 * �@�����n�_�g�p�ʏ���Ԃ��܂��B
	 * 
	 * @return te7hEntityDao�@�����n�_�g�p�ʏ���߂��܂��B
	 */
	public Te7hEntityDao getTe7hEntityDao() {
		return te7hEntityDao;
	}

	/**
	 * �@�����n�_�g�p�ʏ����Z�b�g���܂��B
	 * 
	 * @param te7hEntityDao
	 *            �����n�_�g�p�ʏ���ݒ�B
	 */
	@Resource
	public void setTe7hEntityDao(Te7hEntityDao te7hEntityDao) {
		this.te7hEntityDao = te7hEntityDao;
	}
	
	/**
	 * �@�X�C�b�`���O�A�g���ʂ�Ԃ��܂��B
	 * 
	 * @return te7jEntityDao�@�X�C�b�`���O�A�g���ʂ�߂��܂��B
	 */
	public Te7jEntityDao getTe7jEntityDao() {
		return te7jEntityDao;
	}

	/**
	 * �@�X�C�b�`���O�A�g���ʂ��Z�b�g���܂��B
	 * 
	 * @param te7jEntityDao
	 *            �X�C�b�`���O�A�g���ʂ�ݒ�B
	 */
	@Resource
	public void setTe7jEntityDao(Te7jEntityDao te7jEntityDao) {
		this.te7jEntityDao = te7jEntityDao;
	}
	
	/**
	 * �@�X�C�b�`���O�p�~�掟���ʂ�Ԃ��܂��B
	 * 
	 * @return te77EntityDao�@�X�C�b�`���O�p�~�掟���ʂ�߂��܂��B
	 */
	public Te77EntityDao getTe77EntityDao() {
		return te77EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�p�~�掟���ʂ��Z�b�g���܂��B
	 * 
	 * @param te77EntityDao
	 *            �X�C�b�`���O�p�~�掟���ʂ�ݒ�B
	 */
	@Resource
	public void setTe77EntityDao(Te77EntityDao te77EntityDao) {
		this.te77EntityDao = te77EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�p�~�掟 ��Ԃ��܂��B
	 * 
	 * @return te76EntityDao�@�X�C�b�`���O�p�~�掟 ��߂��܂��B
	 */
	public Te76EntityDao getTe76EntityDao() {
		return te76EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�p�~�掟 ���Z�b�g���܂��B
	 * 
	 * @param te76EntityDao
	 *            �X�C�b�`���O�p�~�掟 ��ݒ�B
	 */
	@Resource
	public void setTe76EntityDao(Te76EntityDao te76EntityDao) {
		this.te76EntityDao = te76EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�A�g�X�e�[�^�X��Ԃ��܂��B
	 * 
	 * @return te78EntityDao�@�X�C�b�`���O�A�g�X�e�[�^�X��߂��܂��B
	 */
	public Te78EntityDao getTe78EntityDao() {
		return te78EntityDao;
	}

	/**
	 * �@�X�C�b�`���O�A�g�X�e�[�^�X���Z�b�g���܂��B
	 * 
	 * @param te78EntityDao
	 *            �X�C�b�`���O�A�g�X�e�[�^�X��ݒ�B
	 */
	@Resource
	public void setTe78EntityDao(Te78EntityDao te78EntityDao) {
		this.te78EntityDao = te78EntityDao;
	}
	
	/**
	 * �@�d�͌_�񋤒ʂ�Ԃ��܂��B
	 * 
	 * @return te78EntityDao�@�X�C�b�`���O�A�g�X�e�[�^�X��߂��܂��B
	 */
	public Te11EntityDao getTe11EntityDao() {
		return te11EntityDao;
	}

	/**
	 * �@�d�͌_�񋤒ʂ��Z�b�g���܂��B
	 * 
	 * @param te78EntityDao
	 *            �X�C�b�`���O�A�g�X�e�[�^�X��ݒ�B
	 */
	@Resource
	public void setTe11EntityDao(Te11EntityDao te11EntityDao) {
		this.te11EntityDao = te11EntityDao;
	}
	// Change Start CATPPS-769 �Ή� A.Miyakawa
	/**
	 * �@TE7I�ʒm��ʊǗ�EntityDao��Ԃ��܂��B
	 * 
	 * @return te7iEntityDao�@TE7I�ʒm��ʊǗ�EntityDao��߂��܂��B
	 */
	public Te7iEntityDao getTe7iEntityDao() {
		return te7iEntityDao;
	}

	/**
	 * �@TE7I�ʒm��ʊǗ�EntityDao���Z�b�g���܂��B
	 * 
	 * @param te7iEntityDao
	 *            TE7I�ʒm��ʊǗ�EntityDao��ݒ�B
	 */
	@Resource
	public void setTe7iEntityDao(Te7iEntityDao te7iEntityDao) {
		this.te7iEntityDao = te7iEntityDao;
	}
	// Change End CATPPS-769 �Ή� A.Miyakawa
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/**
	 * �@SG�d�͌_�񋤒ʂ��Z�b�g���܂��B
	 * 
	 * @param te78EntityDao
	 *            �X�C�b�`���O�A�g�X�e�[�^�X��ݒ�B
	 */
	@Resource
	public void setTe17EntityDao(Te17EntityDao te17EntityDao) {
		this.te17EntityDao = te17EntityDao;
	}
	
	/**
	 * �@SG�d�͌_�񋤒ʂ�Ԃ��܂��B
	 * 
	 * @return te78EntityDao�@�X�C�b�`���O�A�g�X�e�[�^�X��߂��܂��B
	 */
	public Te17EntityDao getTe17EntityDao() {
		return te17EntityDao;
	}
	// Add Start CATPPSSB-246 20160227 A.Miyakawa

	/**
	 * �@�_��T�[�r�X��Ԃ��܂��B
	 * 
	 * @return contractService�@�_��T�[�r�X��߂��܂��B
	 */
	public ContractService getContractService() {
		return contractService;
	}

	/**
	 * �@�_��T�[�r�X���Z�b�g���܂��B
	 * 
	 * @param contractService
	 *            �_��T�[�r�X��ݒ�B
	 */
	@Resource
	public void setContractService(ContractService contractService) {
		this.contractService = contractService;
	}

	/**
	 * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
	 */
	public SwitchingServiceBizLogicImpl() {
		super();
	}

	// --- �r�W�l�X���W�b�N�������\�b�h

	/**
	 * �A�g�v�����쐬�T�[�r�X �{�T�[�r�X���g�p���āA�A�g�v�������쐬����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h �ǃR�[�h
	 * @return ���s���� �A�g�v�����
	 */
	public LinkRequestInfoResult createLinkRequestInfo(
			CatyPrincipal catyPrincipal, String stationCd) {

		if (stationCd == null) {
			throw new IllegalArgumentException("stationCd is null");
		}

		System.out.println("	�ǃR�[�h:[" + stationCd + "]");

		// �A�g�v�����
		LinkRequestInfoResult result = new LinkRequestInfoResult();
		// �������Ǝҏ�񃊃X�g
		List<Tpe7EntityModel> tpe7EntityModelList = null;
		// �_����
		GetSwitchingContractInfoResult contractInfoResult = null;
		// �ڋq�Z�����
		List<T105EntityModel> t105EntityModelList = null;
		// ���I�ؖ������
		List<T0a9EntityModel> t0a9EntityModelList = null;
		// �p�~�掟���
		Te76EntityModel te76EntityModel = null;
		// �X�C�b�`���O�p�~�掟�����ݒ��񃊃X�g
		List<Tpe7EntityModel> tpe7EntityModelSearchSettingList = null;		

		try {
			// �X�C�b�`���O�A�g�Ǘ������X�C�b�`���O�A�g�Ǘ��e�[�u������擾����
			Te79EntityModel te79EntityModel = getTe79EntityDao()
					.findByRenkeiRequestInfo(catyPrincipal, stationCd);

			// �擾�ł����ꍇ
			if (te79EntityModel != null) {

				// �������Ǝҏ����擾����
				tpe7EntityModelList = getTpe7EntityDao()
						.getDisplayConfigMasterList(catyPrincipal, stationCd,
								"SXA0023", "KORI", null);

				// �X�C�b�`���O�A�g�Ǘ���񂩂�ڋq�R�[�h�ƘA�Ԃ��擾�ł���ꍇ�̂ݎ��{
				if (te79EntityModel.getTe79104() != null
						&& te79EntityModel.getTe79105() != null) {

					// �_������擾����
					contractInfoResult = getGetSwitchingContractInfoContractServiceDao()
							.getSwitchingContractInfo(catyPrincipal, stationCd,
									te79EntityModel.getTe79104(),
									te79EntityModel.getTe79105());

					// �ڋq�Z�������擾����
					t105EntityModelList = getT105EntityDao()
							.findByCustomerAddressInfo(catyPrincipal,
									stationCd, te79EntityModel.getTe79104());

					// ���I�ؖ������擾����
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

				// �X�C�b�`���O�A�g�v���g�����ڏ����擾����
				List<Te7aEntityModel> te7aEntityModelList = getTe7aEntityDao()
						.findByExtensionItemInfo(catyPrincipal, stationCd,
								te79EntityModel.getTe79002(),
								te79EntityModel.getTe79003());
				
				// �p�~�掟�����擾����
				if (IS_20410.equals(te79EntityModel.getTe79103())
						|| IS_K20410.equals(te79EntityModel.getTe79103())
						|| IS_F20410.equals(te79EntityModel.getTe79103())) {

					te76EntityModel = getTe76EntityDao()
							.findByAbolitionAgencyNoForAbolitionAgencyInfo(stationCd, te79EntityModel.getTe79601());
				}

				/** �A�g�v�������쐬���� */

				// �ǃR�[�h
				result.setStationCd(te79EntityModel.getTe79001());
				// �A�g�ԍ�
				result.setRenKeiNum(te79EntityModel.getTe79002());
				// �A�g�ԍ��A��
				result.setRenKeiSerialNum(te79EntityModel.getTe79003());
				// �A�g�v������
				result.setRenKeiEntryDatetime(te79EntityModel.getTe79101());
				// ������
				result.setProcessingStatus(te79EntityModel.getTe79102());
				// �T�[�r�XID
				result.setServiceId(te79EntityModel.getTe79103());
				// �ڋq�R�[�h
				result.setCustomerCd(te79EntityModel.getTe79104());
				// �A��
				result.setSerialNumber(te79EntityModel.getTe79105());
				// �X�V�t���O
				result.setFlagUpdate(te79EntityModel.getTe79106());
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
					for (Te7aEntityModel model : te7aEntityModelList) {
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
				result.setTpe7EntityModelList(tpe7EntityModelList);
				// �_����
				result.setContractInfoResult(contractInfoResult);
				// �ڋq�Z�����
				result.setT105EntityModelList(t105EntityModelList);
				// ���I�ؖ������
				result.setT0a9EntityModelList(t0a9EntityModelList);
				// �X�C�b�`���O�A�g�v���g�����ڏ��
				result.setTe7aEntityModelList(te7aEntityModelList);
				// �p�~�掟���
				result.setTe76EntityModel(te76EntityModel);

			} else {
				// �擾�ł��Ȃ������ꍇ

				// �Ɩ������󋵊m�F�}�X�^����A�g�v����I�肷��
				List<Te73EntityModel> te73EntityModelList = this.te73EntityDao
						.getBizProcStatusCheckLinkRequestInfo(stationCd);
				
				if(CollectionUtils.isEmpty(te73EntityModelList)) {
					return null;
				}

				// �X�C�b�`���O�Ɩ������󋵊m�F�e�[�u������O����s���̏����擾
				Te72EntityModel te72EntityModel = this.te72EntityDao
						.getAfBizProcStatusCheckLinkRequestInfo(stationCd);

				Te73EntityModel targetTe73EntityModel = null;

				if (te72EntityModel != null) {

					// �Ɩ������󋵊m�F�}�X�^�̑I�ʂ��s��
					targetTe73EntityModel = this.getTargetTe73Entity(
							te73EntityModelList, te72EntityModel.getTe72101());

					// �X�C�b�`���O�Ɩ������󋵊m�F�f�[�^�̍X�V
					this.updateSwitchingBizProcStatusConfirm(catyPrincipal,
							targetTe73EntityModel);

				} else {

					if (!CollectionUtils.isEmpty(te73EntityModelList)) {

						targetTe73EntityModel = te73EntityModelList.get(0);

						// �X�C�b�`���O�Ɩ������󋵊m�F�f�[�^�̐V�K�o�^
						this.insertSwitchingBizProcStatusConfirm(catyPrincipal,
								targetTe73EntityModel);

					}
				}

				/** �A�g�v�����ɕK�v�Ȓǉ������擾���� */

				Te79EntityModel targetAppEntity = null;

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
						List<Te79EntityModel> appEntityList = this.te79EntityDao
								.findByRenkeiRequestInfoForProcessedStatus(
										stationCd,
										targetTe73EntityModel.getTe73601(),
										searchId);

						// �擾�ł��Ȃ������ꍇ
						if (appEntityList == null || appEntityList.size() == 0) {
							// �������ʐ���Ƃ��ďI������
							return null;
						}

						/** �������̐\�����擾���� */

						// �������A�g�ԍ�����ł͂Ȃ��ꍇ
						if (targetTe73EntityModel.getTe73501() != null) {

							List<Te79EntityModel> targetList = this
									.getTargetAppEntity(appEntityList,
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
						this.updateAppEntity(catyPrincipal, stationCd,
								targetTe73EntityModel.getTe73002(),
								targetAppEntity.getTe79002());

						// �_������擾����
						contractInfoResult = getGetSwitchingContractInfoContractServiceDao()
								.getSwitchingContractInfo(catyPrincipal,
										stationCd,
										targetAppEntity.getTe79104(),
										targetAppEntity.getTe79105());

						// �������Ǝҏ����擾����
						tpe7EntityModelList = getTpe7EntityDao()
								.getDisplayConfigMasterList(catyPrincipal,
										stationCd, "SXA0023", "KORI", null);
					} else {

						/** ��L�T�[�r�XID�ȊO */

						// �������Ǝҏ����擾����
						tpe7EntityModelList = getTpe7EntityDao()
								.getDisplayConfigMasterList(catyPrincipal,
										stationCd, "SXA0023", "KORI", null);
						
						// �X�C�b�`���O�p�~�掟�����ݒ���擾����
						tpe7EntityModelSearchSettingList = getTpe7EntityDao()
						.getDisplayConfigMasterList(catyPrincipal,
								stationCd, "SXA0023", "HAISHITORITSUGI_SET", null);
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
						result.setTpe7EntityModelList(tpe7EntityModelList);
						// �_����
						result.setContractInfoResult(contractInfoResult);
						// �\�����
						result.setTe79EntityMode(targetAppEntity);
						// �ŏI�������A�g�ԍ�
						result.setLastIncompleteRenKeiNum(targetTe73EntityModel
								.getTe73601());
						// �Ɩ������󋵊m�F�A��
						result.setProcessingStatusSerialNumber(targetTe73EntityModel
								.getTe73002());

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
						result.setTpe7EntityModelList(tpe7EntityModelList);
						
						// �X�C�b�`���O�p�~�掟�����ݒ���
						result.setTpe7EntityModelSearchSettingList(tpe7EntityModelSearchSettingList);
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
	 * �������Ǝ҃R�[�h���擾���܂��B
	 * 
	 * @param tpeEntityList
	 *            TPE7��ʐݒ�}�X�^���X�g
	 * @param companyArea �d�̓G���A
	 * @return �������Ǝ҃R�[�h
	 */
	private String getRetailCd(List<Tpe7EntityModel> tpeEntityList, String companyArea) {

		String result = null;

		// TPE7��ʐݒ�}�X�^���X�g�̑��݊m�F
		if (!CollectionUtils.isEmpty(tpeEntityList)) {

			// TPE7��ʐݒ�}�X�^���X�g�̃��R�[�h�Q�ɑ΂��ĔC�Ӑݒ�KEY2 = CODE�̃��R�[�h��T��
			for (Tpe7EntityModel entity : tpeEntityList) {

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
	private void updateAppEntity(CatyPrincipal principal, String te73001,
			BigDecimal te73002, BigDecimal TE73501)
			throws EntityNotFoundException {

		// �ǃR�[�h����Ƀ��R�[�h�𒊏o���A���b�N����
		Te73EntityModel te73EntityModel = this.te73EntityDao
				.findByPrimaryKeyForUpdate(principal, te73001, te73002);

		// �������A�g�ԍ���ݒ�
		te73EntityModel.setTe73501(TE73501);
		// �X�V������ݒ�
		te73EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// �X�VAPP��ݒ�
		te73EntityModel.setUpdateApp("SXA0023");
		// DB���R�[�h�L���t���O��ݒ�
		te73EntityModel.setPersist(true);

		// �X�V���������s
		this.te73EntityDao.update(principal, te73EntityModel);
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
	private void updateLastIncompleteRenKeiNum(CatyPrincipal principal, String te73001,
			BigDecimal te73002, BigDecimal te73601)
			throws EntityNotFoundException {

		// �ǃR�[�h����Ƀ��R�[�h�𒊏o���A���b�N����
		Te73EntityModel te73EntityModel = this.te73EntityDao
				.findByPrimaryKeyForUpdate(principal, te73001, te73002);

		// �ŏI�������A�g�ԍ���ݒ�
		te73EntityModel.setTe73601(te73601);
		// �X�V������ݒ�
		te73EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// �X�VAPP��ݒ�
		te73EntityModel.setUpdateApp("SXA0023");
		// DB���R�[�h�L���t���O��ݒ�
		te73EntityModel.setPersist(true);

		// �X�V���������s
		this.te73EntityDao.update(principal, te73EntityModel);
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
	private List<Te79EntityModel> getTargetAppEntity(
			List<Te79EntityModel> te79EntityModelList, BigDecimal targetNo) {

		List<Te79EntityModel> resultList = new ArrayList<Te79EntityModel>();

		// �\�����̑��݊m�F
		if (!CollectionUtils.isEmpty(te79EntityModelList)) {

			// �w�肵���������A�Ԃ��l���傫��Entity�𒊏o
			for (Te79EntityModel model : te79EntityModelList) {

				if (targetNo.compareTo(model.getTe79002()) < 0) {
					resultList.add(model);
				}

			}

		}

		return resultList;
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
	 * �X�C�b�`���O�Ɩ������󋵊m�F�f�[�^�̐V�K�o�^���s��<br>
	 * �Ώۃe�[�u�� = TE72
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param te73EntityModel
	 *            �X�C�b�`���O�Ɩ������󋵊m�F�}�X�^
	 */
	private void insertSwitchingBizProcStatusConfirm(CatyPrincipal principal,
			Te73EntityModel te73EntityModel) {

		Te72EntityModel te72EntityModel = new Te72EntityModel();

		Timestamp nowTimestamp = new Timestamp(System.currentTimeMillis());

		// �ǃR�[�h��ݒ�
		te72EntityModel.setTe72001(principal.getStationCd());
		// �������Ɩ��󋵊m�F�A�Ԃ�ݒ�
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// �o�^������ݒ�
		te72EntityModel.setCreateTimestamp(nowTimestamp);
		// �X�V������ݒ�
		te72EntityModel.setUpdateTimestamp(nowTimestamp);
		// �X�VAPP��ݒ�
		te72EntityModel.setUpdateApp("SXA0023");
		// DB���R�[�h�L���t���O��ݒ�
		te72EntityModel.setPersist(false);

		// �V�K�o�^���������s
		this.te72EntityDao.save(principal, te72EntityModel);
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
	private void updateSwitchingBizProcStatusConfirm(CatyPrincipal principal,
			Te73EntityModel te73EntityModel) throws EntityNotFoundException {

		// �ǃR�[�h����Ƀ��R�[�h�𒊏o���A���b�N����
		Te72EntityModel te72EntityModel = this.te72EntityDao
				.findByPrimaryKeyForUpdate(principal, principal.getStationCd());

		// �������Ɩ��󋵊m�F�A�Ԃ�ݒ�
		te72EntityModel.setTe72101(te73EntityModel.getTe73002());
		// �X�V������ݒ�
		te72EntityModel.setUpdateTimestamp(new Timestamp(System
				.currentTimeMillis()));
		// �X�VAPP��ݒ�
		te72EntityModel.setUpdateApp("SXA0023");
		// DB���R�[�h�L���t���O��ݒ�
		te72EntityModel.setPersist(true);

		// �X�V���������s
		this.te72EntityDao.update(principal, te72EntityModel);
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
	private Te73EntityModel getTargetTe73Entity(
			List<Te73EntityModel> te73EntityModelList, BigDecimal targetNo) {

		Te73EntityModel resultEntityModel = null;

		// �Ɩ������󋵊m�F�}�X�^�̑��݊m�F
		if (!CollectionUtils.isEmpty(te73EntityModelList)) {

			// �w�肵���Ɩ������󋵊m�F�A�Ԃ��l���傫��Entity�𒊏o
			for (Te73EntityModel model : te73EntityModelList) {
				if (targetNo.compareTo(model.getTe73002()) < 0) {
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
	 * �X�C�b�`���O�x���V�X�e���A�g�T�[�r�X �{�T�[�r�X���g�p���āA�X�C�b�`���O�x���V�X�e���ƘA�g����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 * @return ���s���� �A�g�v�����
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public LinkRequestInfoResult linkSwitchingSupportSystem(
			CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) {

		try {

			/** �A�g�v���ݒ���̎擾 */

			// ���ݎ����擾
			Timestamp currentTimestamp = new Timestamp(
					System.currentTimeMillis());

			// �X�C�b�`���O�x���V�X�e���ʐM�ݒ�����擾
			List<Tpe7EntityModel> tpe7EntityModelList = this.getTpe7EntityDao()
					.getSwitchingSystemCommunicationSettingInfo(stationCd);

			// �ڑ���IP�A�h���X
			String url = this.getConfigValue(tpe7EntityModelList, "URL");
			// �ڑ���IP�A�h���X
			String srcIp = this
					.getConfigValue(tpe7EntityModelList, "SOURCE_IP");

			/** �A�g�v�����̐ݒ� */

			// ���ݎ�����A�g�v�����.�A�g�����ɐݒ�
			linkRequestInfoResult.setRenKeiEntryDatetime(currentTimestamp);

			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl = null;
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			// try {
			// Change End CATPPS-1364 �Ή� A.Miyakawa
			// �Ώۂ̃T�[�r�X�N���X���擾
			cmnServiceImpl = this.getServiceClass(linkRequestInfoResult
					.getServiceId());

			// ���s�O����
			cmnServiceImpl.executePreProcessing(catyPrincipal, stationCd,
					url, srcIp);

			// Header���ݒ�
			cmnServiceImpl
					.settingSoapHeaderInformation(linkRequestInfoResult);
			// Change Start SW���փ`�F�b�N A.Miyakawa
			String bodyErrorMsg = null;
			try {
				// Body���ݒ�
				cmnServiceImpl
						.settingSoapBodyInformation(linkRequestInfoResult);
			} catch (CheckCharactorCodeException e) {
				bodyErrorMsg = e.getMessage();
			}
			
			// �d�b�ԍ��ݒ���`�F�b�N����
			boolean tellErrorMsg = false;
			if (!this.checkPhoneNo(linkRequestInfoResult
					.getT105EntityModelList())) {
				tellErrorMsg = true;
			}
			
			// �d�b�ԍ��ݒ���`�F�b�N����
			if (tellErrorMsg || !StringUtils.isEmpty(bodyErrorMsg)) {

				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// �A�g�v�����.�����󋵂Ɂu3�v��ݒ�
//				linkRequestInfoResult
//						.setProcessingStatus(new BigDecimal(3));
				
				// ���b�Z�[�WID��ݒ肷��
				if (tellErrorMsg) {
					linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_4);
				} else if (!StringUtils.isEmpty(bodyErrorMsg)) {
					linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_5);
					linkRequestInfoResult.setErrorMsg(new String[] {bodyErrorMsg});
				}
				
//				/** �A�g�X�e�[�^�X�X�V���� */
//				this.updateCooperationStatus(catyPrincipal, stationCd,
//						linkRequestInfoResult, true);
//				
//				/** �X�C�b�`���O�A�g�v������ */
//				this.executeSwReq(catyPrincipal, stationCd,
//				linkRequestInfoResult);
//				
//				/** �X�C�b�`���O�A�g�Ǘ��X�V���X�V�����@*/
//				this.updateTe79Info(catyPrincipal,stationCd,
//						linkRequestInfoResult);
//				
//				/** �A�g���s�������� */
//				this.completeCooperationExecute(catyPrincipal, stationCd,
//						linkRequestInfoResult, true);
//
				// Change End CATPPS-1364 �Ή� A.Miyakawa
				return linkRequestInfoResult;
			}
			// Change End SW���փ`�F�b�N A.Miyakawa
			
			// Attache���ݒ�
			cmnServiceImpl
					.settingAttachmentInformation(linkRequestInfoResult);
			
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			// ���N�G�X�g���M
			try {
				cmnServiceImpl.sendRequestProc();
			} catch (WebServiceException we) {
				// �ُ�̏ꍇ
				// �A�g�v�����.�ʐM���ʂɁu2�v��ݒ�
				linkRequestInfoResult.setCommunicationResult(2);
				// WebServiceException�i�[
				linkRequestInfoResult.setException(we);
				// ���b�Z�[�WID��ݒ肷��
				linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_9);

				return linkRequestInfoResult;
			}
			// Change End CATPPS-1364 �Ή� A.Miyakawa
			
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			//} catch (RuntimeException e) {
			//	throw e;
			//}
			// Change End CATPPS-1364 �Ή� A.Miyakawa
				
			// SOAP FAULT�`�F�b�N
			if (!cmnServiceImpl.isSoapFault()) {
				/** ����̏ꍇ */

				// �A�g�v�����.�T�[�r�X���ʂɁu0�v��ݒ�
				linkRequestInfoResult.setServiceResult(0);

				// HTTP�X�e�[�^�X�R�[�h���擾
				String httpStatusCd = cmnServiceImpl.getHttpStatusCd();

				// HTTP�X�e�[�^�X�`�F�b�N
				if (!cmnServiceImpl.isHttpStatusError()) {

					/** ����̏ꍇ */

					// �A�g�v�����.�ʐM���ʂɁu0�v��ݒ�
					linkRequestInfoResult.setCommunicationResult(0);
					// �A�g�v�����.�ʐM�X�e�[�^�X��HTTP�X�e�[�^�X��ݒ�
					linkRequestInfoResult.setCommunicationStatus(httpStatusCd);

					// �A�g�v���̐��ۃ`�F�b�N
					if (cmnServiceImpl.isLinkRequestSuccess()) {
						
						/** ����̏ꍇ */

						// �A�g�v�����.�A�g���ʂɃ��X�|���X���.�A�g���ۃX�e�[�^�X��ݒ�
						linkRequestInfoResult
								.setCooperationResult(cmnServiceImpl
										.getLinkRequestStatusCd());

						/** IF�ʘA�g���ʏ��� */
						boolean result = this.linkRequestResultProc(catyPrincipal, stationCd,
								linkRequestInfoResult, cmnServiceImpl);
						if (!result){
							// ����I���̏ꍇnull��ԋp����
							return null;
						}
					} else {

						/** �ُ�̏ꍇ */

						// �A�g�v�����.�A�g���ʂɃ��X�|���X���.�A�g���ۃX�e�[�^�X��ݒ�
						linkRequestInfoResult
								.setCooperationResult(cmnServiceImpl
										.getLinkRequestStatusCd());

						// �A�g�v�����.�A�g�G���[���R�Ƀ��X�|���X���.�A�g���ۃX�e�[�^�X���̂�ݒ�
						linkRequestInfoResult
								.setCooperationErrorReason(cmnServiceImpl
										.getLinkRequestStatusName());
						
						// Change Start CATPPS-1364 �Ή� A.Miyakawa
						// �A�g�v�����.�����󋵂Ɂu3�v��ݒ�
						//linkRequestInfoResult
						//		.setProcessingStatus(new BigDecimal(3));
						// �X�C�b�`���O��O�G���[�R�[�h���擾
						tpe7EntityModelList = getTpe7EntityDao()
								.getDisplayConfigMasterList(catyPrincipal, stationCd,
										"SXA0023", "SW_EXCEPT_ERROR_CODE", null);
						
						// �G���[�R�[�h�`�F�b�N
						Map<String, String> uketsukeMessages = cmnServiceImpl.getUketsukeMessageMap(cmnServiceImpl);
						if (checkExceptionErrorCode(tpe7EntityModelList, uketsukeMessages)) {
							// �ُ�̏ꍇ�i��O�G���[�R�[�h���܂܂�Ă���ꍇ�j
							linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_7);
						} else {
							// ����̏ꍇ�i��O�G���[�R�[�h���܂܂�Ă��Ȃ��ꍇ�j
							// ���b�Z�[�WID��ݒ肷��
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
							// �X�C�b�`���O�A�g�Ǘ��X�V����A�g�Ǘ����ɐݒ肷��(�ǉ�����)
							Te79EntityModel te79EntityModel = new Te79EntityModel();
							te79EntityModel.setTe79001(stationCd);
							te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
							te79EntityModel.setTe79701(cmnServiceImpl.getRenrakuMsg());
							List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
							te79EntityModelListUpdateInfo.add(te79EntityModel);
							linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
						}
						
						// ��t���b�Z�[�W�̐ݒ�
						setUketsukeMsg(catyPrincipal, linkRequestInfoResult, cmnServiceImpl);
						
						// ���A�������̐ݒ�
						linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
						return linkRequestInfoResult;
						// Change End CATPPS-1364 �Ή� A.Miyakawa
					}
				} else {

					/** �ُ�̏ꍇ */

					// �A�g�v�����.�ʐM���ʂɁu1�v��ݒ�
					linkRequestInfoResult.setCommunicationResult(1);
					// �A�g�v�����.�ʐM�X�e�[�^�X��HTTP�X�e�[�^�X��ݒ�
					linkRequestInfoResult.setCommunicationStatus(httpStatusCd);
					// Change Start CATPPS-1364 �Ή� A.Miyakawa
					// �A�g�v�����.�����󋵂Ɂu3�v��ݒ�
					//linkRequestInfoResult
					//		.setProcessingStatus(new BigDecimal(3));
					// ���b�Z�[�WID��ݒ肷��
					linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_2);
					return linkRequestInfoResult;
					// Change End CATPPS-1364 �Ή� A.Miyakawa
				}
			} else {

				/** �ُ�̏ꍇ */
				// �A�g�v�����.�T�[�r�X���ʂɁu1�v��ݒ�
				linkRequestInfoResult.setServiceResult(1);
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// �A�g�v�����.�T�[�r�X�G���[���R��SOAP FAULT���b�Z�[�W��ݒ�
				linkRequestInfoResult.setServiceErrorReason(getUpSubstringValue(cmnServiceImpl
						.getSoapFaultMessage(),60));
				// �A�g�v�����.�����󋵂Ɂu3�v��ݒ�
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
				// ���b�Z�[�WID��ݒ肷��
				linkRequestInfoResult.setErrorMsgId(CHECK_MSG_ID_NO_1);
				return linkRequestInfoResult;
				// Change End CATPPS-1364 �Ή� A.Miyakawa
			}
			
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			/** �����󋵂̐ݒ�  */
			this.setProccesingStatus(catyPrincipal, stationCd,
					linkRequestInfoResult);
			// Change End CATPPS-1364 �Ή� A.Miyakawa

			/** �A�g�X�e�[�^�X�X�V���� */
			this.updateCooperationStatus(catyPrincipal, stationCd,
					linkRequestInfoResult, false);
			
			/** �X�C�b�`���O�A�g�A�g���ʓo�^���� */
			this.registerSwResult(catyPrincipal, stationCd,
					linkRequestInfoResult);
			
			// Add Start CATPPSSB-246 20160227 A.Miyakawa
			// �A�h�I���R�[�h�uSAIBUGAS�v�̐���R�[�h���uONLY�v�̏ꍇ�i�����K�X�p�j
			if (catyPrincipal.getAddOnControl().getAddOnModel(AddOnCode.SAIBUGAS).getAddOnControlCode() == AddOnControlCode.SAIBUGAS__ONLY) {
				/** ���o�^���X�V���� */
				this.updateRegisterCancelingDate(catyPrincipal, stationCd, linkRequestInfoResult);
			}
			// Add End CATPPSSB-246 20160227 A.Miyakawa
			
			/** �ڑ��p�~�\��N�����X�V */
			this.registerAbolitionDate(catyPrincipal, stationCd,
					linkRequestInfoResult);
			
			/** �X�C�b�`���O�A�g�v������ */
			this.executeSwReq(catyPrincipal, stationCd,
					linkRequestInfoResult);
			
			/** �X�C�b�`���O�A�g�Ǘ��X�V���X�V�����@*/
			this.updateTe79Info(catyPrincipal,stationCd,
					linkRequestInfoResult);
			
			/** �A�g���s�������� */
			this.completeCooperationExecute(catyPrincipal, stationCd,
					linkRequestInfoResult, false);

		} catch (Exception e) {
			// Change End CATPPS-1364 �Ή� A.Miyakawa
			// �A�g�v�����.�����󋵂Ɂu3�v��ݒ�
//			linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
//			/** �A�g���s�������� */
//			this.completeErrorCooperationExecute(catyPrincipal, stationCd,
//					linkRequestInfoResult);
			throw new RuntimeException(e.getMessage(), e);
			// Change End CATPPS-1364 �Ή� A.Miyakawa
		}

		return linkRequestInfoResult;
	}
	
	// Add Start CATPPSSB-246 20160227 A.Miyakawa
	/**
	 * ���o�^���X�V����
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
	 * �����󋵂̐ݒ�
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
	 * �X�C�b�`���O�x���V�X�e���A�g���ʔ�����擾
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
		
		// �T�[�r�XID�𔻒f���A�����𕪊򂷂�
		if ( IF_10110.equals(serviceId) || IF_F10110.equals(serviceId) ) {
			
			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			// ���A������
			// ��t���b�Z�[�W
			switchingStatus.setUketsukeMsgFlag(true);
			// ���[��
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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
			
			// �����󋵐ݒ�
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
			
			// �\�����̏�����
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
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(200));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			// �o�b�`����
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(200));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setStatusCode(new BigDecimal(240));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(230));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(230));
			}
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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
			
			// �����󋵐ݒ�
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
			
			// �\�����̏�����
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
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(300));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			// �o�b�`����
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(300));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei))
					switchingStatus.setStatusCode(new BigDecimal(340));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(330));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(330));
			}
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
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
			
			// �\�����̏�����
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
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			
			// �o�b�`����
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if ("02".equals(status) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if ( "03".equals(status) || "06".equals(status) || "07".equals(status))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if ("02".equals(status))
					switchingStatus.setStatusCode(new BigDecimal(450));
				else if ("03".equals(status) || "06".equals(status) || "07".equals(status))
					switchingStatus.setStatusCode(new BigDecimal(430));
			}
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			// ���ރR�[�h
			// �J�ڐ�X�e�[�^�X�R�[�h
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
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
			
			// �\�����̏�����
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
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			
			// �o�b�`����
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(400));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(500));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus()) && "01".equals(judgeMent) ) {
				switchingStatus.setStatusCode(new BigDecimal(520));
			}
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
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
			
			// �\�����̏�����
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
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(500));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			
			// �o�b�`����
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) || UKETSUKE_KOUTEI_08.equals(koutei))
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(500));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
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
			
			// �\�����̏�����
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
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(600));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			
			// �o�b�`����
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(600));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(640));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(630));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(630));
			}
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				// Change start 20160326 A.Takemi [CATPPS-1518]
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_PROCESSING);
				// Change end 20160326 A.Takemi [CATPPS-1518]
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����

			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(700));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			// Change start 20160326 A.Takemi [CATPPS-1518]
			if (PROCESSING_STATUS_PROCESSING.equals(switchingStatus.getProcessingStatus())) {
				switchingStatus.setStatusCode(new BigDecimal(720));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) {
				switchingStatus.setStatusCode(new BigDecimal(730));
			}
			// Change end 20160326 A.Takemi [CATPPS-1518]

			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(700));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(740));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(730));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(730));
			}
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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
			 * �g�p�ʏ��Ɖ�\��(�ሳ) �g�p�ʏ��Ɖ�\��(����(500kw����))
			 */

			// �����󋵐ݒ�
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
			
			// �\�����̏�����
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
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(800));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
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
			
			// �o�b�`����
			// Change start 20160425 I.Kudou [CATPPSSB-563]
			//if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
			//	switchingStatus.setBatchResultFlag(true);
			if (!StringUtils.isEmpty(errorMsgId) && PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			// Change end 20160425 I.Kudou [CATPPSSB-563]
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_OK);
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setApplyProcessingStatsu(PROCESSING_STATUS_NG);
			}
			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(800));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if (PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus())) {
				if (UKETSUKE_KOUTEI_06.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(860));
				else if (UKETSUKE_KOUTEI_09.equals(koutei) )
					switchingStatus.setStatusCode(new BigDecimal(840));
			} else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) &&  5 == errorKind ) {
				switchingStatus.setStatusCode(new BigDecimal(840));
			}
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
				
			// ���A������
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if (  5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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

			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����

			
			// ���ރR�[�h
			switchingStatus.setStatusKindCode(new BigDecimal(800));
			
			// �J�ڐ�X�e�[�^�X�R�[�h
			if ( PROCESSING_STATUS_OK.equals(switchingStatus.getProcessingStatus() ))
				switchingStatus.setStatusCode(new BigDecimal(880));
			else if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus()) )
				switchingStatus.setStatusCode(new BigDecimal(840));
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			if ( 2 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuDispFlag(true);
			
			
			// ���A������
			if ( 2 == errorKind  || 5 == errorKind || 6 == errorKind || 0 == errorKind)
				switchingStatus.setRenrakuFlag(true);
				
			// ��t���b�Z�[�W
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setUketsukeMsgFlag(true);
			
			// ���[��
			if ( 1 == errorKind || 2 == errorKind || 3 == errorKind || 4 == errorKind || 5 == errorKind || 6 == errorKind || 0 == errorKind) 
				switchingStatus.setMailFlag(true);
			
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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
			
			// �����󋵐ݒ�
			if (StringUtils.isEmpty(errorMsgId))
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_OK);
			else
				switchingStatus.setProcessingStatus(PROCESSING_STATUS_NG);
			
			// �\�����̏�����
			
			// �o�b�`����
			if (PROCESSING_STATUS_NG.equals(switchingStatus.getProcessingStatus())) 
				switchingStatus.setBatchResultFlag(true);
			
			// ���A�������i�\���p�j
			// ���A������
			// ��t���b�Z�[�W
			switchingStatus.setUketsukeMsgFlag(true);
			// ���[��
			// �Ď��A���[�g
			if ( 1 == errorKind || 2 == errorKind || 4 == errorKind )
				switchingStatus.setAlartFlag(true);
			
			// �ʒm���
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
	 * �G���[�̎�ʂ��擾����
	 * @param errorMsgId
	 * @return
	 */
	private int getErrorKind(String errorMsgId) {
		
		// �G���[�Ȃ�
		if (StringUtils.isEmpty(errorMsgId))
			return ERROR_KIND_0;
		// �����G���[�i�ʐM�O�j
		else if (CHECK_MSG_ID_NO_6.equals(errorMsgId))
			return ERROR_KIND_1;
		// �����G���[�i�ʐM��j
		else if (CHECK_MSG_ID_NO_8.equals(errorMsgId))
			return ERROR_KIND_2;
		// �ʐM�O�`�F�b�N�G���[
		else if (CHECK_MSG_ID_NO_4.equals(errorMsgId) || CHECK_MSG_ID_NO_5.equals(errorMsgId))
			return ERROR_KIND_3;
		// �ʐM�G���[
		else if (CHECK_MSG_ID_NO_1.equals(errorMsgId) || CHECK_MSG_ID_NO_2.equals(errorMsgId) || CHECK_MSG_ID_NO_9.equals(errorMsgId))
			return ERROR_KIND_4;
		// �A�g���ۃ`�F�b�N�G���[
		else if (CHECK_MSG_ID_NO_3.equals(errorMsgId))
			return ERROR_KIND_5;
		// ��O�G���[
		else if (CHECK_MSG_ID_NO_7.equals(errorMsgId))
			return ERROR_KIND_6;

		return -1;
	}

	/**
	 * ��t���b�Z�[�W�ݒ�
	 * @param catyPrincipal 
	 * @param linkRequestInfoResult
	 * @param cmnServiceImpl
	 */
	@SuppressWarnings("unchecked")
	private void setUketsukeMsg(CatyPrincipal catyPrincipal, LinkRequestInfoResult linkRequestInfoResult,
			@SuppressWarnings("rawtypes") SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl) {
		// Change Start CATPPS-1101 �Ή��@A.Miyakawa
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
			// ��t���b�Z�[�W���ݒ�
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
					linkRequestInfoResult.getTe79EntityMode().getTe79001(),
					linkRequestInfoResult.getTe79EntityMode().getTe79002(),
					linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
					cmnServiceImpl));
			// Change Start CATPPS-1275�Ή��@A.Miyakawa
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
			// ��t���b�Z�[�W���ݒ�
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId) ||
				IS_F20210.equals(serviceId) || IS_20310.equals(serviceId) ||
				IS_K20310.equals(serviceId) || IS_F20310.equals(serviceId)) {
			// ��t���b�Z�[�W���ݒ�
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
			// Change Start CATPPS-1275�Ή��@A.Miyakawa
		}
		// Change End CATPPS-1101 �Ή��@A.Miyakawa
		
	}

	/**
	 * ��t���b�Z�[�W�ɗ�O�G���[�R�[�h���܂܂�Ă���̂��`�F�b�N����
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
	 * �ڑ��p�~�\��N�����X�V����
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
	 * �X�C�b�`���O�A�g�Ǘ��X�V���X�V����
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
	 * �X�C�b�`���O�A�g�Ǘ��X�V���X�V����
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @throws EntityNotFoundException 
	 */
	private void updateTe79Info(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) throws EntityNotFoundException {
		
		// Change Start CATPPS-1364 �Ή� A.Miyakawa
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
				// �X�C�b�`���O�A�g�Ǘ��X�V�����擾����
				List<Te79EntityModel>Te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
				
				if (Te79EntityModelListUpdateInfo.size() > 0) {
					for (Te79EntityModel updateInfo:Te79EntityModelListUpdateInfo) {
						if (!StringUtils.isEmpty(updateInfo.getTe79501())) {
							// �X�C�b�`���O�A�g�Ǘ��X�V���.�\���ԍ���null�ȊO�̏ꍇ
							// �X�C�b�`���O�A�g�Ǘ������X�V����
							this.updateTE79(catyPrincipal, stationCd,
									updateInfo.getTe79501(),
									linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(),
									updateInfo.getTe79701());
							
						} else if (!StringUtils.isEmpty(updateInfo.getTe79601())) {
							// �X�C�b�`���O�A�g�Ǘ��X�V���.�p�~�掟�ԍ���null�ȊO�̏ꍇ
							// �X�C�b�`���O�A�g�Ǘ������X�V����
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
			
			// �X�C�b�`���O�A�g�Ǘ��X�V�����擾����
			List<Te79EntityModel>Te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
			
			if (Te79EntityModelListUpdateInfo.size() > 0) {
				for (Te79EntityModel updateInfo:Te79EntityModelListUpdateInfo) {
					
					if (linkRequestInfoResult.getContactMatter() != null && linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isRenrakuFlag())
						updateInfo.setTe79701(linkRequestInfoResult.getContactMatter());
					
					if (!StringUtils.isEmpty(updateInfo.getTe79501())) {
						// �X�C�b�`���O�A�g�Ǘ��X�V���.�\���ԍ���null�ȊO�̏ꍇ
						// �X�C�b�`���O�A�g�Ǘ������X�V����
						this.updateTE79(catyPrincipal, stationCd,
								updateInfo.getTe79501(),
								linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(),
								updateInfo.getTe79701());
						
					} else if (!StringUtils.isEmpty(updateInfo.getTe79601())) {
						// �X�C�b�`���O�A�g�Ǘ��X�V���.�p�~�掟�ԍ���null�ȊO�̏ꍇ
						// �X�C�b�`���O�A�g�Ǘ������X�V����
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
				// �X�C�b�`���O�A�g�Ǘ��X�V�����擾����
				List<Te79EntityModel>Te79EntityModelListUpdateInfo = link.getTe79EntityModelListUpdateInfo();
				if (Te79EntityModelListUpdateInfo.size() > 0) {
					for (Te79EntityModel updateInfo:Te79EntityModelListUpdateInfo) {
						if (!StringUtils.isEmpty(updateInfo.getTe79501())) {
							// �X�C�b�`���O�A�g�Ǘ��X�V���.�\���ԍ���null�ȊO�̏ꍇ
							// �X�C�b�`���O�A�g�Ǘ������X�V����
							this.updateTE79(catyPrincipal, stationCd,
									updateInfo.getTe79501(),
									link.getSwitchingUpdateAndAlartStatus().getApplyProcessingStatsu(),
									updateInfo.getTe79701());
							
						} else if (!StringUtils.isEmpty(updateInfo.getTe79601())) {
							// �X�C�b�`���O�A�g�Ǘ��X�V���.�p�~�掟�ԍ���null�ȊO�̏ꍇ
							// �X�C�b�`���O�A�g�Ǘ������X�V����
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
		// Change End CATPPS-1364 �Ή� A.Miyakawa
	}

	/**
	 * �X�C�b�`���O�A�g�v������
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 * @throws SwitchingException 
	 */
	private void executeSwReq(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) throws SwitchingException {
		
		// �X�C�b�`���O�J�n����
		List<SwithingParameter> swStartInfo = linkRequestInfoResult.getSwStartInfo();
		if (swStartInfo != null) {
			if ( swStartInfo.size() > 0 ) {
				// �X�C�b�`���O�x���V�X�e���A�g�v���T�[�r�X�i�X�C�b�`���O�J�n�j���Ăяo��
				this.getContractService()
				.executeSwitchingStart(
						catyPrincipal, swStartInfo);
			}
		}
		
		// �p�~�掟���f����
		List<SwithingParameter> swAbolitionJudgementInfo = linkRequestInfoResult.getSwAbolitionJudgementInfo();
		if (swAbolitionJudgementInfo != null) {
			if ( swAbolitionJudgementInfo.size() > 0 ) {
				// �X�C�b�`���O�x���V�X�e���A�g�v���T�[�r�X�i�p�~�掟���f�j���Ăяo��
				this.getContractService()
				.executeSwitchingStopAgencyJudge(
						catyPrincipal, swAbolitionJudgementInfo);
			}
		}
		
		// �X�C�b�`���O�p�~�\������
		List<SwithingParameter> swAbolitionApplyInfo = linkRequestInfoResult.getSwAbolitionApplyInfo();
		if (swAbolitionApplyInfo != null) {
			if ( swAbolitionApplyInfo.size() > 0 ) {
				// �X�C�b�`���O�x���V�X�e���A�g�v���T�[�r�X�i�X�C�b�`���O�p�~�\���j���Ăяo��
				this.getContractService()
				.executeSwitchingStop(
						catyPrincipal, swAbolitionApplyInfo);
			}
		}
		
		// �g�p�ʏ��Ɖ��
		List<SwithingParameter> usedAmountInfoInquiryInfo = linkRequestInfoResult.getUsedAmountInfoInquiryInfo();
		if (usedAmountInfoInquiryInfo != null) {
			if ( usedAmountInfoInquiryInfo.size() > 0 ) {
				// �X�C�b�`���O�x���V�X�e���A�g�v���T�[�r�X�i�X�C�b�`���O�p�~�\���j���Ăяo��
				this.getContractService()
				.executeUsedInfoInquire(
						catyPrincipal, usedAmountInfoInquiryInfo);
			}
		}
		
		// �_��X�e�[�^�X�ύX����
		SwContractStatusChangeInfoModel swContractStatusChangeInfoModel = linkRequestInfoResult.getContractStatusChangeInfo();
		if (swContractStatusChangeInfoModel != null) {
			// �X�C�b�`���O�A�g�_��X�e�[�^�X�ύX�T�[�r�X
			this.getContractService().changeSwitchingContractStatus(catyPrincipal, stationCd, 
					swContractStatusChangeInfoModel.getCustomerCd(), swContractStatusChangeInfoModel.getCustomerConsNum()
					, swContractStatusChangeInfoModel.getContractStatus());
		}
		
	}

	/**
	 * �d�b�ԍ��ݒ���`�F�b�N����
	 * 
	 * @param LinkRequestInfoResult
	 *            �A�g�v�����
	 * 
	 * @return �d�b�ԍ��ݒ�Ɉُ킪�������ꍇ�Afalse��ԋp�A�@����̏ꍇ�Atrue��ԋp
	 * 
	 */
	private boolean checkPhoneNo(List<T105EntityModel> t105EntityModelList) {

		T105EntityModel t105EntityModel = null;
		String[] phoneNo = null;

		// �ڋq�Z�����(�敪=4).TEL1�̓d�b�ԍ��ݒ�`�F�b�N
		t105EntityModel = this.getSpecifiedCustomerAddressInfoRecord(
				t105EntityModelList, new BigDecimal(4));
		if (t105EntityModel != null
				&& !StringUtils.isEmpty(t105EntityModel.getT105311())) {

			phoneNo = t105EntityModel.getT105311().split("\\-");

			if (phoneNo.length != 3) {
				return false;
			}
		}

		// �ڋq�Z�����(�敪=1).TEL1�A�ڋq�Z�����(�敪=1).TEL2�̓d�b�ԍ��ݒ�`�F�b�N
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
	 * �ڋq�Z�������w�肵���敪�l�̃��R�[�h��ԋp���܂��B
	 * 
	 * @param entityList
	 *            �ڋq�Z����񃊃X�g
	 * @param classification
	 *            �w��敪�l
	 * @return �ڋq�Z�����
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
	 * IP�A�h���X���擾���܂��B
	 * 
	 * @param modelList
	 *            ��ʐݒ�}�X�^
	 * @param destIp
	 *            �ڑ���IP�A�h���X
	 * @param sourceIp
	 *            �ڑ���IP�A�h���X
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
	 * �����Ώۂ̃T�[�r�X�N���X���擾���܂��B
	 * 
	 * @param serviceId
	 *            �T�[�r�XID
	 * @return �����Ώۂ̃T�[�r�X�N���X
	 */
	@SuppressWarnings("rawtypes")
	private SwitchingServiceIntegrationAbstractBizSubLogicImpl getServiceClass(
			String serviceId) {

		SwitchingServiceIntegrationAbstractBizSubLogicImpl result = null;

		if (IF_10110.equals(serviceId)) {
			// IF_10110(�ݔ����Ɖ�(�ሳ))
			result = new SwitchingServiceBizSetsubiYokyuTSubLogicImpl();
		} else if (IF_10210.equals(serviceId)) {
			// IF_10210(�g�p�ʏ��Ɖ�\��(�ሳ))
			result = new SwitchingServiceBizPwYokyuTSubLogicImpl();
		} else if (IF_10220.equals(serviceId)) {
			// IF_10220(�Ɩ��m�F(�ሳ)(�g�p�ʏ��Ɖ�))
			result = new SwitchingServiceBizPwIdoYokyuTSubLogicImpl();
		} else if (IF_10310.equals(serviceId)) {
			// IF_10310(�g�p�ʏ��Ɖ�(�ሳ))
			result = new SwitchingServiceBizShiyoryoYokyuTSubLogicImpl();
		} else if (IF_K10210.equals(serviceId)) {
			// IF_K10210(�g�p�ʏ��Ɖ�\��(����(500kw����))
			result = new SwitchingServiceBizPwYokyuKSubLogicImpl();
		} else if (IF_K10220.equals(serviceId)) {
			// IF_K10220(�Ɩ������󋵊m�F(�ሳ)(����(500kw����))
			result = new SwitchingServiceBizPwIdoYokyuKSubLogicImpl();
		} else if (IF_K10310.equals(serviceId)) {
			// IF_K10310(�g�p�ʏ��Ɖ�(����(500kw����)))
			result = new SwitchingServiceBizShiyoryoYokyuKSubLogicImpl();
		} else if (IF_F10110.equals(serviceId)) {
			// IF_F10110(�ݔ����Ɖ�(�ሳFIT�d��))
			result = new SwitchingServiceBizSetsubiYokyuFSubLogicImpl();
		} else if (IF_10410.equals(serviceId)) {
			// IF_10410(�ē_(�ሳ))
			result = new SwitchingServiceBizSaitenYokyuTSubLogicImpl();
		} else if (IF_10420.equals(serviceId)) {
			// IF_10420(�Ɩ������󋵊m�F(�ሳ)(�ē_))
			result = new SwitchingServiceBizSaitenIdoYokyuTSubLogicImpl();
		} else if (IF_10510.equals(serviceId)) {
			// IF_10510(�p�~�E�P��(�ሳ))
			result = new SwitchingServiceBizHaishiYokyuTSubLogicImpl();
		} else if (IF_10520.equals(serviceId)) {
			// IF_10520(�Ɩ������󋵊m�F(�ሳ)(�p�~�E�P��))
			result = new SwitchingServiceBizHaishiIdoYokyuTSubLogicImpl();
		} else if (IF_10610.equals(serviceId)) {
			// IF_10610(�X�C�b�`���O�J�n�\��(�ሳ))
			result = new SwitchingServiceBizSwKaishiYokyuTSubLogicImpl();
		} else if (IF_10620.equals(serviceId)) {
			// IF_10620(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�J�n))
			result = new SwitchingServiceBizSwKaishiIdoYokyuTSubLogicImpl();
		} else if (IF_10710.equals(serviceId)) {
			// IF_10710(�X�C�b�`���O�p�~�\��(�ሳ))
			result = new SwitchingServiceBizSwHaishiYokyuTSubLogicImpl();
		} else if (IF_10720.equals(serviceId)) {
			// IF_10720(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�p�~))
			result = new SwitchingServiceBizSwHaishiIdoYokyuTSubLogicImpl();
		} else if (IF_10810.equals(serviceId)) {
			// IF_10810(���v�ꏊ���ύX�\��(�ሳ))
			result = new SwitchingServiceBizJuyoshaHenkoYokyuTSubLogicImpl();
		} else if (IF_10820.equals(serviceId)) {
			// IF_10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX))
			result = new SwitchingServiceBizJuyoshaHenkoIdoYokyuTSubLogicImpl();
		} else if (IF_10910.equals(serviceId)) {
			// IF_10910(�A���y�A�ύX(�ሳ))
			result = new SwitchingServiceBizAmpereHenkoYokyuTSubLogicImpl();
		} else if (IF_10920.equals(serviceId)) {
			// IF_10810(���v�ҏ��ύX(�ሳ))
			result = new SwitchingServiceBizAmpereHenkoIdoYokyuTSubLogicImpl();
		} else if (IF_11110.equals(serviceId)) {
			// IF_11110(�ٓ��\���ꊇ�擾(����)(�ሳ))
			result = new SwitchingServiceBizIdoIkkatsuYokyuTSubLogicImpl();
		} else if (IF_K10510.equals(serviceId)) {
			// IF_K10510(�p�~�E�P��(����(500kw����))
			result = new SwitchingServiceBizHaishiYokyuKSubLogicImpl();
		} else if (IF_K10520.equals(serviceId)) {
			// IF_K10520(�Ɩ������󋵊m�F(����(500kw����))(�p�~�E�P��))
			result = new SwitchingServiceBizHaishiIdoYokyuKSubLogicImpl();
		} else if (IF_K10610.equals(serviceId)) {
			// IF_K10610(�X�C�b�`���O�J�n�\��(����(500kw����)))
			result = new SwitchingServiceBizSwKaishiYokyuKSubLogicImpl();
		} else if (IF_K10620.equals(serviceId)) {
			// IF_K10620(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�J�n))
			result = new SwitchingServiceBizSwKaishiIdoYokyuKSubLogicImpl();
		} else if (IF_K10710.equals(serviceId)) {
			// IF_K10710(�X�C�b�`���O�p�~�\��(����(500kw����)))
			result = new SwitchingServiceBizSwHaishiYokyuKSubLogicImpl();
		} else if (IF_K10720.equals(serviceId)) {
			// IF_K10720(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�p�~))
			result = new SwitchingServiceBizSwHaishiIdoYokyuKSubLogicImpl();
		} else if (IF_K10810.equals(serviceId)) {
			// IF_K10810(���v�ҏ��ύX(�ሳ))
			result = new SwitchingServiceBizJuyoshaHenkoYokyuKSubLogicImpl();
		} else if (IF_K10820.equals(serviceId)) {
			// IF_K10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX))
			result = new SwitchingServiceBizJuyoshaHenkoIdoYokyuKSubLogicImpl();
		} else if (IF_K11110.equals(serviceId)) {
			// IF_K11110(�ٓ��\���ꊇ�擾(����)(����))
			result = new SwitchingServiceBizIdoIkkatsuYokyuKSubLogicImpl();
		} else if (IF_F10410.equals(serviceId)) {
			// IF_F10410(�ē_(�ሳFIT�d��))
			result = new SwitchingServiceBizSaitenYokyuFSubLogicImpl();
		} else if (IF_F10420.equals(serviceId)) {
			// IF_F10420(�Ɩ������󋵊m�F(�ሳFIT�d��)(�ē_))
			result = new SwitchingServiceBizSaitenIdoYokyuFSubLogicImpl();
		} else if (IF_F10510.equals(serviceId)) {
			// IF_F10510(�p�~�E�P��(�ሳFIT�d��))
			result = new SwitchingServiceBizHaishiYokyuFSubLogicImpl();
		} else if (IF_F10520.equals(serviceId)) {
			// IF_F10520(�Ɩ������󋵊m�F(�ሳFIT�d��)(�p�~�E�P��))
			result = new SwitchingServiceBizHaishiIdoYokyuFSubLogicImpl();
		} else if (IF_F10610.equals(serviceId)) {
			// IF_F10610(�X�C�b�`���O�J�n�\��(�ሳFIT�d��))
			result = new SwitchingServiceBizSwKaishiYokyuFSubLogicImpl();
		} else if (IF_F10620.equals(serviceId)) {
			// IF_F10620(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�J�n))
			result = new SwitchingServiceBizSwKaishiIdoYokyuFSubLogicImpl();
		} else if (IF_F10710.equals(serviceId)) {
			// IF_F10710(�X�C�b�`���O�p�~�\��(�ሳFIT�d��))
			result = new SwitchingServiceBizSwHaishiYokyuFSubLogicImpl();
		} else if (IF_F10720.equals(serviceId)) {
			// IF_F10720(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�p�~))
			result = new SwitchingServiceBizSwHaishiIdoYokyuFSubLogicImpl();
		} else if (IF_F10810.equals(serviceId)) {
			// IF_F10810(��d�ҏ��ύX)
			result = new SwitchingServiceBizHatsudenshaHenkoYokyuFSubLogicImpl();
		} else if (IF_F10820.equals(serviceId)) {
			// IF_F10820(�Ɩ������󋵊m�F(��d�ҏ��ύX))
			result = new SwitchingServiceBizHatsudenshaHenkoIdoYokyuFSubLogicImpl();
		} else if (IF_F11110.equals(serviceId)) {
			// IF_F11110(��d�ړ��\���ꊇ�擾(����))
			result = new SwitchingServiceBizIdoIkkatsuYokyuFSubLogicImpl();
		} else if (IS_20110.equals(serviceId)) {
			// IS_20110(�X�C�b�`���O�p�~�掟�o�^(�ሳ))
			result = new SwitchingServiceBizSwTorokuYokyuTSubLogicImpl();
		} else if (IS_20210.equals(serviceId)) {
			// IS_20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳ))
			result = new SwitchingServiceBizSwKekkaYokyuTSubLogicImpl();
		} else if (IS_20310.equals(serviceId)) {
			// IS_20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳ))
			result = new SwitchingServiceBizSwYokyuTSubLogicImpl();
		} else if (IS_20410.equals(serviceId)) {
			// IS_20410(�X�C�b�`���O�p�~�掟���f(�ሳ))
			result = new SwitchingServiceBizSwHandanYokyuTSubLogicImpl();
		} else if (IS_K20110.equals(serviceId)) {
			// IS_K20110(�X�C�b�`���O�p�~�掟�o�^(����(500kw����)))
			result = new SwitchingServiceBizSwTorokuYokyuKSubLogicImpl();
		} else if (IS_K20210.equals(serviceId)) {
			// IS_K20210(�X�C�b�`���O�p�~�掟���ʏƉ�(����(500kw����)))
			result = new SwitchingServiceBizSwKekkaYokyuKSubLogicImpl();
		} else if (IS_K20310.equals(serviceId)) {
			// IS_K20310(�X�C�b�`���O�p�~�掟�Ɖ�(����(500kw����)))
			result = new SwitchingServiceBizSwYokyuKSubLogicImpl();
		} else if (IS_K20410.equals(serviceId)) {
			// IS_K20410(�X�C�b�`���O�p�~�掟���f(����(500kw����))
			result = new SwitchingServiceBizSwHandanYokyuKSubLogicImpl();
		} else if (IS_F20110.equals(serviceId)) {
			// IS_F20110(�X�C�b�`���O�p�~�掟�o�^(�ሳFIT�d��))
			result = new SwitchingServiceBizSwTorokuYokyuFSubLogicImpl();
		} else if (IS_F20210.equals(serviceId)) {
			// IS_F20210(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��))
			result = new SwitchingServiceBizSwKekkaYokyuFSubLogicImpl();
		} else if (IS_F20310.equals(serviceId)) {
			// IS_F20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��))
			result = new SwitchingServiceBizSwYokyuFSubLogicImpl();
		} else if (IS_F20410.equals(serviceId)) {
			// IS_F20410(�X�C�b�`���O�p�~�掟���f(�ሳFIT�d��))
			result = new SwitchingServiceBizSwHandanYokyuFSubLogicImpl();
		} else if (Const.SERVICE_ID_SV_CLASSIFICATION_COMPANIES_LIST_REQUEST.equals(serviceId)) {
			// IS_30110(���Ǝ҈ꗗ�擾)
			result = new SwitchingServiceBizJugyoshaIchiranYokyuSubLocigImpl();
		}

		return result;
	}

	/**
	 * �ؑ֊����ʒm�o�^�T�[�r�X �{�T�[�r�X���g�p���āA�ؑ֊����ʒm��o�^����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param linkResult
	 *            �A�g�v�����
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
				// Change Start CATPPS-769 �Ή� A.Miyakawa
				editLink.setDispContactMatter(link.getDispContactMatter());
				// Change End CATPPS-769 �Ή� A.Miyakawa
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				editLink.setSwitchingUpdateAndAlartStatus(link.getSwitchingUpdateAndAlartStatus());
				// Change End CATPPS-1364 �Ή� A.Miyakawa
				
				// �ؑ֊����ʒm�o�^
				this.switchCompleteExec(catyPrincipal, editLink);
			}
			
		} else {
			// �ؑ֊����ʒm�o�^
			this.switchCompleteExec(catyPrincipal, linkResult);
		}
		
	}

	/**
	 * �ؑ֊����ʒm�o�^�T�[�r�X �{�T�[�r�X���g�p���āA�ؑ֊����ʒm��o�^����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param linkResult
	 *            �A�g�v�����
	 */
	private void switchCompleteExec(CatyPrincipal catyPrincipal, LinkRequestInfoResult linkResult) {
		
		// Change Start CATPPS-1364 �Ή� A.Miyakawa
		String notification = null;

		if (linkResult.getSwitchingUpdateAndAlartStatus() != null) 
			notification = linkResult.getSwitchingUpdateAndAlartStatus().getMailKind();
			
//		// �A�g���� �@�ُ�̏ꍇ0�A����̏ꍇ1
//		int coSuccess = 1;
//		// �\��O�ړ����t���O
//		int changesDateFlg = 0;
//		// �ʒm���
//		String notification = null;
//		
//		// Change Start CATPPS-944 �Ή��@T.Funao
//		//�T�[�r�XID
//		String serviceId = linkResult.getServiceId();
//		// Change End CATPPS-944 �Ή��@T.Funao
//
//		// �A�g���ۂ�ݒ�
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
//		// Change Start CATPPS-944 �Ή��@T.Funao
//		//�}�b�`���O�������͘A�g���ۂ𐳏�ɐݒ�
//		if("05".equals(linkResult.getReceivingStep())){
//			if(IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
//				|| IF_F10620.equals(serviceId) || IF_10720.equals(serviceId)
//				|| IF_K10720.equals(serviceId) || IF_F10720.equals(serviceId)){
//				coSuccess = 1;
//			}
//		}
//		// Change End CATPPS-944 �Ή��@T.Funao
//		// �A�g�v�����.�ٓ��\����ƘA�g�v�����.�ٓ������ݒ肳��Ă���ꍇ1
//		if (linkResult.getChangesDatePlan() != null
//				&& linkResult.getChangesDate() != null) {
//			changesDateFlg = 1;
//		}
//
//		// �����ʒm�̎�ʂ��擾����
//		if (linkResult.getServiceId() != null) {
//			// IF_10410(�ē_(�ሳ))�AIF_F10410(�ē_(�ሳFIT�d��))
//			if (linkResult.getServiceId().equals(IF_10410)
//					|| linkResult.getServiceId().equals(IF_F10410)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "231";
//				}// IF_10420(�Ɩ������󋵊m�F(�ሳ)(�ē_))�AIF_F10420(�Ɩ������󋵊m�F(�ሳFIT�d��)(�ē_))
//			} else if (linkResult.getServiceId().equals(IF_10420)
//					|| linkResult.getServiceId().equals(IF_F10420)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "241";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "242";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "231";
//				}// IF_10510(�p�~�E�P��(�ሳ))�AIF_K10510(�p�~�E�P��(����(500kw����))�AIF_F10510(�p�~�E�P��(�ሳFIT�d��))
//			} else if (linkResult.getServiceId().equals(IF_10510)
//					|| linkResult.getServiceId().equals(IF_K10510)
//					|| linkResult.getServiceId().equals(IF_F10510)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "331";
//				}// IF_10520(�Ɩ������󋵊m�F(�ሳ)(�p�~�E�P��))�AIF_K10520(�Ɩ������󋵊m�F(����(500kw����))(�p�~�E�P��))�AIF_F10520(�Ɩ������󋵊m�F(�ሳFIT�d��)(�p�~�E�P��))
//			} else if (linkResult.getServiceId().equals(IF_10520)
//					|| linkResult.getServiceId().equals(IF_K10520)
//					|| linkResult.getServiceId().equals(IF_F10520)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "341";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "342";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "331";
//				}// IS_20110(�X�C�b�`���O�p�~�掟�o�^(�ሳ))�AIS_K20110(�X�C�b�`���O�p�~�掟�o�^(����(500kw����)))�AIS_F20110(�X�C�b�`���O�p�~�掟�o�^(�ሳFIT�d��))
//			} else if (linkResult.getServiceId().equals(IS_20110)
//					|| linkResult.getServiceId().equals(IS_K20110)
//					|| linkResult.getServiceId().equals(IS_F20110)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "431";
//				}// IS_20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳ))�AIS_K20310(�X�C�b�`���O�p�~�掟�Ɖ�(����(500kw����)))�AIS_F20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��))
//			} else if (linkResult.getServiceId().equals(IS_20310)
//					|| linkResult.getServiceId().equals(IS_K20310)
//					|| linkResult.getServiceId().equals(IS_F20310)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "441";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "431";
//				}// IF_10610(�X�C�b�`���O�J�n�\��(�ሳ))�AIF_K10610(�X�C�b�`���O�J�n�\��(����(500kw����)))�AIF_F10610(�X�C�b�`���O�J�n�\��(�ሳFIT�d��))
//			} else if (linkResult.getServiceId().equals(IF_10610)
//					|| linkResult.getServiceId().equals(IF_K10610)
//					|| linkResult.getServiceId().equals(IF_F10610)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "471";
//				}// IF_10620(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�J�n))�AIF_K10620(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�J�n))�AIF_F10620(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�J�n))
//			} else if (linkResult.getServiceId().equals(IF_10620)
//					|| linkResult.getServiceId().equals(IF_K10620)
//					|| linkResult.getServiceId().equals(IF_F10620)) {
//				// Add Start 20160222 CATPPS-944 �Ή��@T.Funao
//				if (coSuccess == 1 && changesDateFlg == 0 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "461";
//				} else if (coSuccess == 1 && changesDateFlg == 1 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "462";
//				// Add End 20160222 CATPPS-944 �Ή��@T.Funao
//				} else if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "481";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "482";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "471";
//				}// IS_20410(�X�C�b�`���O�p�~�掟���f(�ሳ))�AIS_K20410(�X�C�b�`���O�p�~�掟���f(����(500kw����))�AIS_F20410(�X�C�b�`���O�p�~�掟���f(�ሳFIT�d��))
//			} else if (linkResult.getServiceId().equals(IS_20410)
//					|| linkResult.getServiceId().equals(IS_K20410)
//					|| linkResult.getServiceId().equals(IS_F20410)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "511";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "513";
//				}// IF_10710(�X�C�b�`���O�p�~�\��(�ሳ))�AIF_K10710(�X�C�b�`���O�p�~�\��(����(500kw����)))�AIF_F10710(�X�C�b�`���O�p�~�\��(�ሳFIT�d��))
//			} else if (linkResult.getServiceId().equals(IF_10710)
//					|| linkResult.getServiceId().equals(IF_K10710)
//					|| linkResult.getServiceId().equals(IF_F10710)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "541";
//				}// IF_10720(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�p�~))�AIF_K10720(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�p�~))�AIF_F10720(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�p�~))
//			} else if (linkResult.getServiceId().equals(IF_10720)
//					|| linkResult.getServiceId().equals(IF_K10720)
//					|| linkResult.getServiceId().equals(IF_F10720)) {
//				// Add Start 20160222 CATPPS-944 �Ή��@T.Funao
//				if (coSuccess == 1 && changesDateFlg == 0 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "531";
//				} else if (coSuccess == 1 && changesDateFlg == 1 && "05".equals(linkResult.getReceivingStep())) {
//					notification = "532";
//				// Add End 20160222 CATPPS-944 �Ή��@T.Funao
//				} else if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "551";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "552";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "541";
//				}// IF_10910(�A���y�A�ύX(�ሳ))
//			} else if (linkResult.getServiceId().equals(IF_10910)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "631";
//				}// IF_10920(�Ɩ������󋵊m�F(�ሳ)(�A���y�A�ύX))
//			} else if (linkResult.getServiceId().equals(IF_10920)) {
//				if (coSuccess == 1 && changesDateFlg == 0) {
//					notification = "641";
//				} else if (coSuccess == 1 && changesDateFlg == 1) {
//					notification = "642";
//				} else if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "631";
//				}// IF_10810(���v�ҏ��ύX(�ሳ))�AIF_K10810(���v�ҏ��ύX(�ሳ))�AIF_F10810(��d�ҏ��ύX)
//			} else if (linkResult.getServiceId().equals(IF_10810)
//					|| linkResult.getServiceId().equals(IF_K10810)
//					|| linkResult.getServiceId().equals(IF_F10810)) {
//				if (coSuccess == 0 && changesDateFlg == 0) {
//					notification = "731";
//				}// IF_10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX))�AIF_K10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX))�AIF_F10820(�Ɩ������󋵊m�F(��d�ҏ��ύX))
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
			// �����ʒm��ʂ��擾�ł����ꍇ
			if (notification != null && linkResult.getSwitchingUpdateAndAlartStatus().isMailFlag()) {
				// Change Start CATPPS-769 �Ή� A.Miyakawa
				// TE7I�ʒm��ʊǗ����擾����
				try {
					Te7iEntityModel te7iEntityModel = getTe7iEntityDao().findByPrimaryKey(catyPrincipal, catyPrincipal.getStationCd(), notification);
					if (Gadget.equals(NOTIFICATION_FLAG_TRUE, te7iEntityModel.getTe7i201()))
						insertTe74(catyPrincipal, catyPrincipal.getStationCd(), linkResult, notification);
				} catch (EntityNotFoundException e) {
					// �����𑱍s����
				}
				// Change End CATPPS-769 �Ή� A.Miyakawa
			}
		}
		// Change End CATPPS-1364 �Ή� A.Miyakawa
	}
	// Change Start CATPPS-769 �Ή� A.Miyakawa
	/**
	 * �����ʒm����o�^����
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkResult
	 * @param notification
	 */
	private void insertTe74(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkResult, String notification) {
		// �����ʒm���̐ݒ������
		Te74EntityModel te74Entity = new Te74EntityModel();
		te74Entity.setTe74001(catyPrincipal.getStationCd());// �ǃR�[�h
		te74Entity.setTe74002(linkResult.getCustomerCd());// �ڋq�R�[�h
		te74Entity.setTe74003(linkResult.getSerialNumber());// �A��
		te74Entity.setTe74101(notification);// �ʒm���
		te74Entity.setTe74201(linkResult.getChangesDatePlan());// �ٓ��\���
		te74Entity.setTe74202(linkResult.getChangesDate());// �ٓ��N����
		te74Entity.setTe74301(linkResult.getContactMatter());// ���A������
		te74Entity.setTe74401(new BigDecimal("0"));// ������
		// Change Start 20160320 CATPPS-769 �Ή� A.Miyakawa
		te74Entity.setTe74501(linkResult.getDispContactMatter());
		// Change End 20160320 CATPPS-769 �Ή� A.Miyakawa
		te74Entity.setUpdateApp("SXA0023");// �X�VAPP

		getTe74EntityDao().save(catyPrincipal, te74Entity);
	}
	// Change End CATPPS-769 �Ή� A.Miyakawa
	/**
	 * IF�ʘA�g���ʏ���
	 * 
	 * @param catyPrincipal
	 *            �A�J�E���g���
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 * @param cmnServiceImpl
	 *            ���X�|���X���
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
			 * �ݔ����Ɖ�(�ሳ), �ݔ����Ɖ�(�ሳFIT�d��)
			 */

			List<Te7dEntityModel> te7dEntitys = null;

			if (linkRequestInfoResult.getCustomerCd() != null
					&& linkRequestInfoResult.getSerialNumber() != null) {
				/**
				 * �X�C�b�`���O�A�g�Ǘ���񂩂�ڋq�R�[�h�ƘA�Ԃ��擾�ł���ꍇ
				 */

				// �ݔ������擾
				te7dEntitys = this.getTe7dEntityDao()
						.findByEquipmentInfoForBizProcStatusCheck(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber());

			}

			// �ݔ���񂪎擾�ł����ꍇ
			if (!CollectionUtils.isEmpty(te7dEntitys)) {

				for (Te7dEntityModel te7dEntity : te7dEntitys) {

					// �ݔ������폜����
					this.deleteEquipmentInfo(catyPrincipal, stationCd,
							te7dEntity.getTe7d002(), cmnServiceImpl);

					// �ݔ������쐬�o�^����
					this.insertEquipmentInfo(catyPrincipal, stationCd,
							linkRequestInfoResult.getCustomerCd(),
							linkRequestInfoResult.getSerialNumber(),
							linkRequestInfoResult.getRenKeiNum(),
							cmnServiceImpl);

				}

			} else {

				// �ݔ������쐬�o�^����
				this.insertEquipmentInfo(catyPrincipal, stationCd,
						linkRequestInfoResult.getCustomerCd(),
						linkRequestInfoResult.getSerialNumber(),
						linkRequestInfoResult.getRenKeiNum(), cmnServiceImpl);
			}

			// IF_10110(�ݔ����Ɖ�(�ሳ))�̏ꍇ
			if (IF_10110.equals(serviceId)) {

				/** �ݔ����_�ٓ��\����t�����X�V���� */

				if (linkRequestInfoResult.getCustomerCd() != null
						&& linkRequestInfoResult.getSerialNumber() != null) {

					/**
					 * �X�C�b�`���O�A�g�Ǘ���񂩂�ڋq�R�[�h�ƘA�Ԃ��擾�ł���ꍇ
					 */

					// �ݔ����_�ٓ��\����t�����擾����
					List<Te7eEntityModel> selectTe7eEntityList = this
							.getTe7eEntityDao()
							.findByChangesApplicationAcceptanceInfo(stationCd,
									linkRequestInfoResult.getCustomerCd(),
									linkRequestInfoResult.getSerialNumber());

					// �ݔ����_�ٓ��\����t�����폜����
					this.deleteChangesApplicationAcceptanceInfo(catyPrincipal,
							selectTe7eEntityList);

				}

				// �ݔ����_�ٓ��\����t����ݒ肷��
				List<Te7eEntityModel> createTe7eEntityList = cmnServiceImpl
						.settingChangesAppAcceptedInformation(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber(),
								linkRequestInfoResult.getRenKeiNum());

				// �ݔ����_�ٓ��\����t����o�^����
				this.insertChangesApplicationAcceptanceInfo(catyPrincipal,
						createTe7eEntityList);

				/** �ݔ����_�v������X�V���� */

				if (linkRequestInfoResult.getCustomerCd() != null
						&& linkRequestInfoResult.getSerialNumber() != null) {

					/**
					 * �X�C�b�`���O�A�g�Ǘ���񂩂�ڋq�R�[�h�ƘA�Ԃ��擾�ł���ꍇ
					 */

					// �ݔ����_�v������擾����
					List<Te7fEntityModel> selectTe7fEntityList = this
							.getTe7fEntityDao()
							.getInstrumentInfoForBizProcStatusCheck(stationCd,
									linkRequestInfoResult.getCustomerCd(),
									linkRequestInfoResult.getSerialNumber());

					// �ݔ����_�v������폜����
					this.deleteInstrumentInformation(catyPrincipal,
							selectTe7fEntityList);

				}

				// �ݔ����_�v�����ݒ肷��
				List<Te7fEntityModel> createTe7fEntityList = cmnServiceImpl
						.settingInstrumentInformation(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber(),
								linkRequestInfoResult.getRenKeiNum());

				// �ݔ����_�v�����o�^����
				this.insertInstrumentInformation(catyPrincipal,
						createTe7fEntityList);

				/** �ݔ����_��z�d�����X�V���� */

				if (linkRequestInfoResult.getCustomerCd() != null
						&& linkRequestInfoResult.getSerialNumber() != null) {

					/**
					 * �X�C�b�`���O�A�g�Ǘ���񂩂�ڋq�R�[�h�ƘA�Ԃ��擾�ł���ꍇ
					 */

					// �ݔ����_��z�d�����擾����
					List<Te7gEntityModel> selectTe7gEntityList = this
							.getTe7gEntityDao()
							.getStraightLineElectricLightInfoForBizProcStatusCheck(
									stationCd,
									linkRequestInfoResult.getCustomerCd(),
									linkRequestInfoResult.getSerialNumber());

					// �ݔ����_��z�d�����폜����
					this.deleteStraightLineElectricLightInformation(
							catyPrincipal, selectTe7gEntityList);

				}

				// �ݔ����_��z�d����ݒ肷��
				List<Te7gEntityModel> createTe7gEntityList = cmnServiceImpl
						.settingStraightLineElectricLightInformation(stationCd,
								linkRequestInfoResult.getCustomerCd(),
								linkRequestInfoResult.getSerialNumber(),
								linkRequestInfoResult.getRenKeiNum());

				// �ݔ����_��z�d����o�^����
				this.insertStraightLineElectricLightInformation(catyPrincipal,
						createTe7gEntityList);
			}
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			// �A�g�v�����.�����󋵂Ɂu2�v��ݒ�
			// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
			// Change End CATPPS-1364 �Ή� A.Miyakawa
			
			// ��t���b�Z�[�W���ݒ�
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
			 * �u�ē_(�ሳ)�v, �u�ē_(�ሳFIT�d��)�v �u�p�~�E�P��(�ሳ)�v, �u�p�~�E�P��(�ሳFIT�d��)�v
			 * �u�X�C�b�`���O�p�~�掟�o�^(�ሳ)�v, �u�X�C�b�`���O�p�~�掟�o�^(����(500kw����))�v,
			 * �u�X�C�b�`���O�p�~�掟�o�^(�ሳFIT�d��)�v �u�X�C�b�`���O�J�n�\��(�ሳ)�v,
			 * �u�X�C�b�`���O�J�n�\��(����(500kw����))�v, �u�X�C�b�`���O�J�n�\��(�ሳFIT�d��)�v
			 * �u�X�C�b�`���O�p�~�\��(�ሳ)�v, �u�X�C�b�`���O�p�~�\��(����(500kw����))�v,
			 * �u�X�C�b�`���O�p�~�\��(�ሳFIT�d��)�v �u�g�p�ʏ��Ɖ�\��(�ሳ)�v, �u�g�p�ʏ��Ɖ�\��(����(500kw����))�v
			 * �u���v�ҏ��ύX(�ሳ)�v, �u���v�ҏ��ύX(����(500kw����))�v, �u���d�ҏ��ύX�v �u�A���y�A�ύX(�ሳ)�v
			 */

			// �X�C�b�`���O�x���V�X�e���A�g.���X�|���X�����擾
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			// �A�g�v�����.�����󋵂Ɂu1�v��ݒ�
			// linkRequestInfoResult.setProcessingStatus(new BigDecimal(1));
			// Change End CATPPS-1364 �Ή� A.Miyakawa
			// �\���ԍ��A�p�~�掟�ԍ���ݒ�
			if (IS_20110.equals(serviceId) || IS_K20110.equals(serviceId)
					|| IS_F20110.equals(serviceId)) {

				/**
				 * IS_20110(�X�C�b�`���O�p�~�掟�o�^(�ሳ))
				 * IS_K20110(�X�C�b�`���O�p�~�掟�o�^(����(500kw����)))
				 * IS_F20110(�X�C�b�`���O�p�~�掟�o�^(�ሳFIT�d��))
				 * */

				// �A�g�v�����.�p�~�掟�ԍ��Ƀ��X�|���X���.�p�~�掟�ԍ���ݒ�
				linkRequestInfoResult.setAbolitionAgencyNo(cmnServiceImpl
						.getAbolitionAgencyNoOfResponse());

				// Add start 20160224 A.Takemi [CATPPS-1197]
				// �A�g�v�����.�p�~�掟�ԍ����ݒ肳��Ă���ꍇ�ɒ����E����̌��ɂȂ����X�C�b�`���O�\���̏����󋵂�ύX����
				if (!StringUtils.isEmpty(linkRequestInfoResult.getAbolitionAgencyNo())) {
					// �p�~�掟�ԍ����珈���󋵂�1:�������̃X�C�b�`���O�\���̃L�[�����擾����
					Te79EntityModel te79EntityModel =
							getTe79EntityDao().findByRenkeiRequestInfoForAbolitionAgencyNo(stationCd, linkRequestInfoResult.getAbolitionAgencyNo());
					
					// Change Start CATPPS-1364 �Ή� A.Miyakawa
//					// �������̃X�C�b�`���O�\���̍X�V�t���O��2:�����̏ꍇ
//					if ("2".equals(String.valueOf(linkRequestInfoResult.getFlagUpdate()))) {
//						te79EntityModel.setTe79102(new BigDecimal("4"));	// ������4:�L�����Z���i�����j
//						
//						// �A�g�Ǘ����ɃX�C�b�`���O�A�g�Ǘ��X�V����ǉ�
//						linkRequestInfoResult.getTe79EntityModelListUpdateInfo().add(te79EntityModel);
//						
//					// �������̃X�C�b�`���O�\���̍X�V�t���O��3:����̏ꍇ
//					} else if ("3".equals(String.valueOf(linkRequestInfoResult.getFlagUpdate()))) {
//						te79EntityModel.setTe79102(new BigDecimal("5"));	// ������5:�L�����Z���i����j
//						
//						// �A�g�Ǘ����ɃX�C�b�`���O�A�g�Ǘ��X�V����ǉ�
//						linkRequestInfoResult.getTe79EntityModelListUpdateInfo().add(te79EntityModel);
//					}
					if (te79EntityModel != null)
						linkRequestInfoResult.getTe79EntityModelListUpdateInfo().add(te79EntityModel);
					// Change Start CATPPS-1364 �Ή� A.Miyakawa
				}
				// Add end 20160224 A.Takemi [CATPPS-1197]

			} else {

				// �A�g�v�����.�\���ԍ��Ƀ��X�|���X���.�\���ԍ���ݒ�
				linkRequestInfoResult.setAppNo(cmnServiceImpl
						.getApplyNoOfResponse());

			}

			// �A�g�v�����.�\���ԍ��̑��݊m�F
			if (!StringUtils.isEmpty(linkRequestInfoResult.getAppNo())) {

				// �X�V�t���O�ʏ���
				if ("2".equals(String.valueOf(linkRequestInfoResult
						.getFlagUpdate()))) {

					/** �X�V�t���O���u�����v�̏ꍇ */
					// �X�C�b�`���O�A�g�Ǘ��X�V����A�g�Ǘ����ɐݒ肷��(�ǉ�����)
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

					/** �X�V�t���O���u�폜�v�̏ꍇ */
					
					// �X�C�b�`���O�A�g�Ǘ��X�V����A�g�Ǘ����ɐݒ肷��(�ǉ�����)
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
			
			// ���A���������i�[����
			if (IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)
						|| IF_10510.equals(serviceId) || IF_K10510.equals(serviceId) 
						|| IF_F10510.equals(serviceId) || IF_10610.equals(serviceId)
						|| IF_K10610.equals(serviceId) || IF_F10610.equals(serviceId)
						|| IF_10710.equals(serviceId) || IF_K10710.equals(serviceId)
						|| IF_F10710.equals(serviceId) || IF_10910.equals(serviceId)) {
				 linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
			}
			
			// ��t���b�Z�[�W���ݒ�
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
			
		} else if (IF_10310.equals(serviceId) || IF_K10310.equals(serviceId)) {
			/**
			 * IF_10310(�g�p�ʏ��Ɖ�(�ሳ)) IF_K10310(�g�p�ʏ��Ɖ�(����))
			 */

			// �o�^�܂��́A�X�V�������s��
			this.registUsageInformationQuery(catyPrincipal, stationCd,
					linkRequestInfoResult.getCustomerCd(),
					linkRequestInfoResult.getSerialNumber(), cmnServiceImpl);
			
			// Change a.Miyakawa
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			// �A�g�v�����.�����󋵂Ɂu2�v��ݒ�
			// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			
			// ��t���b�Z�[�W���ݒ�
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(linkRequestInfoResult, cmnServiceImpl));
			
		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId)
				|| IS_F20210.equals(serviceId)) {

			/**
			 * IS_20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳ))
			 * IS_K20210(�X�C�b�`���O�p�~�掟���ʏƉ�(����(500kw����)))
			 * IS_F20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳFIT�d��))
			 */

			// �p�~�掟���ʏƉ�ꗗ���擾
			List<AbolitionAgencyResultsQueryModel> AbolitionAgencyResultsQueryList = cmnServiceImpl
					.getAbolitionAgencyResultQueryModelList();
			
			// �X�C�b�`���O�J�n���
			List<SwithingParameter> paramList = new ArrayList<SwithingParameter>();
			// �A�g�v�����IS_�~�~�~�~�p
			List<LinkRequestForIs> linkForIsList = new ArrayList<LinkRequestForIs>();
			// �A�g�X�e�[�^�X�X�V���
			List<SwithingParameter> swUpdInfoList = new ArrayList<SwithingParameter>();

			if (!CollectionUtils.isEmpty(AbolitionAgencyResultsQueryList)) {

				for (AbolitionAgencyResultsQueryModel model : AbolitionAgencyResultsQueryList) {

					// �X�C�b�`���O�A�g���
					Te79EntityModel te79Entity = null;
					
					if ("01".equals(model.getStatus())
							|| "04".equals(model.getStatus())
							|| "05".equals(model.getStatus())) {

						/**
						 * 01:���f�҂� 04:�}�b�`���O�ς�(OK) 05:�}�b�`���O�ς�(NG)
						 */

						continue;

					} else {

						// �X�C�b�`���O�A�g�����擾����
						te79Entity = this.getTe79EntityDao()
								.findByRenkeiRequestInfoForAbolitionAgencyNo(
										stationCd,
										model.getAbolitionAgencyNumber());

						if (te79Entity != null) {

							// �����󋵂��u1�v(�\���܂��͔p�~�掟��)�̏ꍇ
							if (new BigDecimal("1").compareTo(te79Entity.getTe79102())==0) {

								// �p�~�掟����.�X�e�[�^�X���u02�F���f�ς�(OK)�v�̏ꍇ
								if ("02".equals(model.getStatus())) {

									// �p�~�掟���ʂ��i�[����
									this.insertAbolitionAgencyResults(
											catyPrincipal, stationCd,
											te79Entity, model);
									
									// �X�C�b�`���O�A�g�Ǘ��X�V����A�g�Ǘ����ɐݒ肷��(�ǉ�����)
									Te79EntityModel te79EntityModel = new Te79EntityModel();
									te79EntityModel.setTe79001(stationCd);
									te79EntityModel.setTe79002(te79Entity.getTe79002());
									te79EntityModel.setTe79003(te79Entity.getTe79003());
									te79EntityModel.setTe79601(model.getAbolitionAgencyNumber());
									// Change Start CATPPS-1364 �Ή� A.Miyakawa
									// te79EntityModel.setTe79102(new BigDecimal("2"));
//									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
//									te79EntityModelListUpdateInfo.add(te79EntityModel);
//									linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// Change End CATPPS-1364 �Ή� A.Miyakawa
									SwithingParameter param = new SwithingParameter();
									// �p�����[�^.�ڋq�R�[�h
									param.setCustomerCd(te79Entity.getTe79104());
									// �p�����[�^.�A��
									param.setCustomerConsNum(te79Entity.getTe79105());
									// �p�����[�^.�X�V�t���O
									param.setUpdateFlg(new BigDecimal(1));
									// �p�����[�^���X�g��add����
									paramList.add(param);

									LinkRequestForIs linkForIs = new LinkRequestForIs();
									// �ڋq�R�[�h��ݒ�
									linkForIs.setCustomerCd(te79Entity.getTe79104());
									// �A�Ԃ�ݒ�
									linkForIs.setSerialNumber(te79Entity.getTe79105());
									// �p�~�掟�ԍ���ݒ�
									linkForIs.setAbolitionAgencyNo(model.getAbolitionAgencyNumber());
									// Change Start CATPPS-1364 �Ή� A.Miyakawa
									// �X�C�b�`���O�A�g�Ǘ��X�V����ݒ�
									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkForIs.getTe79EntityModelListUpdateInfo();
									te79EntityModelListUpdateInfo.add(te79EntityModel);
									linkForIs.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// �X�e�[�^�X��ݒ�
									linkForIs.setStatus(model.getStatus());
									// Change End CATPPS-1364 �Ή� A.Miyakawa
									
									// �����󋵂�ݒ�
									// Change Start CATPPS-1364 �Ή� A.Miyakawa
									// linkForIs.setProcessingStatus(new BigDecimal(2));
									// Change End CATPPS-1364 �Ή� A.Miyakawa
									
									// Add Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
									// �X�C�b�`���O�p�~�掟���f�m�f���R��ݒ�
									linkForIs.setNgReason(model.getSwitchingAbolitionAgencyDecisionNGReasonName());
									// Add End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
									
									linkForIsList.add(linkForIs);
									
								} else {
									// ��L�ȊO

									// �p�~�掟���ʂ��i�[����
									this.insertAbolitionAgencyResults(
											catyPrincipal, stationCd,
											te79Entity, model);

									// �X�C�b�`���O�A�g�Ǘ��X�V����A�g�Ǘ����ɐݒ肷��(�ǉ�����)
									Te79EntityModel te79EntityModel = new Te79EntityModel();
									te79EntityModel.setTe79001(stationCd);
									te79EntityModel.setTe79002(te79Entity.getTe79002());
									te79EntityModel.setTe79003(te79Entity.getTe79003());
									te79EntityModel.setTe79601(model.getAbolitionAgencyNumber());
									// Change Start CATPPS-1364 �Ή� A.Miyakawa
									// te79EntityModel.setTe79102(new BigDecimal("3"));
//									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
//									te79EntityModelListUpdateInfo.add(te79EntityModel);
//									linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// Change End CATPPS-1364 �Ή� A.Miyakawa
									LinkRequestForIs linkForIs = new LinkRequestForIs();
									// �ڋq�R�[�h��ݒ�
									linkForIs.setCustomerCd(te79Entity.getTe79104());
									// �A�Ԃ�ݒ�
									linkForIs.setSerialNumber(te79Entity.getTe79105());
									// �p�~�掟�ԍ���ݒ�
									linkForIs.setAbolitionAgencyNo(model.getAbolitionAgencyNumber());
									// �����󋵂�ݒ�
									// Change Start CATPPS-1364 �Ή� A.Miyakawa
									// linkForIs.setProcessingStatus(new BigDecimal(3));
									// �X�C�b�`���O�A�g�Ǘ��X�V����ݒ�
									List<Te79EntityModel>te79EntityModelListUpdateInfo = linkForIs.getTe79EntityModelListUpdateInfo();
									te79EntityModelListUpdateInfo.add(te79EntityModel);
									linkForIs.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
									// �X�e�[�^�X��ݒ�
									linkForIs.setStatus(model.getStatus());
									// Change End CATPPS-1364 �Ή� A.Miyakawa
									// Change End CATPPS-1364 �Ή� A.Miyakawa
									
									// Add Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
									// �X�C�b�`���O�p�~�掟���f�m�f���R��ݒ�
									linkForIs.setNgReason(model.getSwitchingAbolitionAgencyDecisionNGReasonName());
									// Add End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
									
									linkForIsList.add(linkForIs);
								}

							}

						}

					}

					// �A�g�X�e�[�^�X�X�V���
					SwithingParameter swParam = new SwithingParameter();
					if (te79Entity != null) {
						// �ڋq�R�[�h
						swParam.setCustomerCd(te79Entity.getTe79104());
						// �A��
						swParam.setCustomerConsNum(te79Entity.getTe79105());
					}
					swUpdInfoList.add(swParam);
					
				}

			}
			
			// ��t���b�Z�[�W���ݒ�
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
			
			// �A�g�v�����.�X�C�b�`���O�J�n���
			linkRequestInfoResult.setSwStartInfo(paramList);
			// �A�g�v�����IS_�~�~�~�~�p
			linkRequestInfoResult.setLinkReqForIs(linkForIsList);
			// �A�g�X�e�[�^�X�X�V���
			linkRequestInfoResult.setSwStatusUpdList(swUpdInfoList);

		// Change start 20160228 A.Takemi [CATPPS-1252]
		/** IS_20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳ)) IS_K20310(�X�C�b�`���O�p�~�掟�Ɖ�(����(500kw����))) IS_F20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��)) */
		} else if (IS_20310.equals(serviceId) || IS_K20310.equals(serviceId) || IS_F20310.equals(serviceId)) {
			linkRequestInfoResult.setSwAbolitionJudgementInfo(new ArrayList<SwithingParameter>());	// �A�g�v�����.�p�~�掟���f���
			linkRequestInfoResult.setLinkReqForIs(new ArrayList<LinkRequestForIs>());				// �A�g�v�����.�A�g�v�����IS_20410
			linkRequestInfoResult.setTe11EntityModelList(new ArrayList<Te11EntityModel>());			// �A�g�v�����.�ڑ��p�~�\��N�����X�V�f�[�^

			/* ���X�|���X��񂩂�p�~�掟�Ɖ�ꗗ���擾���� */
			for (AbolitionAgencyQueryModel abolitionAgency : (List<AbolitionAgencyQueryModel>)cmnServiceImpl.getAbolitionAgencyQueryModelList()) {

				/* �p�~�掟.�X�e�[�^�X��01�F���f�҂��̏ꍇ */
				if ("01".equals(abolitionAgency.getStatus())) {

					/* �G���[�`�F�b�N�����擾���� */
					GetErrorCheckInfoResult errResult = getContractServiceDao().getErrorCheckInfo(
							catyPrincipal, stationCd, abolitionAgency.getSupplyPointSpecificNumber(), abolitionAgency.getContractNumber());	// �G���[�`�F�b�N���
					
					SwithingParameter abolitionAgencyDecision = new SwithingParameter();	// �p�~�掟���f���
					LinkRequestForIs reqIS_20410 = new LinkRequestForIs();					// �A�g�v�����IS_20410

					/* �n�_����ԍ��̃G���[�`�F�b�N */
					if (errResult == null) {
						abolitionAgencyDecision.setStopAgencyJudgeFlg("02");			// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���f
						abolitionAgencyDecision.setStopAgencyJudgeReason01Flg(true);	// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���fNG���R
						// Change Start CATPPS-1364 �Ή� A.Miyakawa
						// reqIS_20410.setProcessingStatus(new BigDecimal(3));				// �A�g�v�����IS_20410.������
						// Change End CATPPS-1364 �Ή� A.Miyakawa
					} else {
						/* �_��ԍ��s��v�̃G���[�`�F�b�N */
						if (errResult.getContractCd() == null || errResult.getContractCd().isEmpty()) {
							abolitionAgencyDecision.setStopAgencyJudgeFlg("02");			// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���f
							abolitionAgencyDecision.setStopAgencyJudgeReason02Flg(true);	// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���fNG���R
							
							reqIS_20410.setProcessingStatus(new BigDecimal(3));				// �A�g�v�����IS_20410.������

						/* �p�~��t���̃G���[�`�F�b�N */
						} else if (errResult.getSwStatus() != null && !errResult.getSwStatus().isEmpty()) {
							abolitionAgencyDecision.setStopAgencyJudgeFlg("02");			// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���f
							abolitionAgencyDecision.setStopAgencyJudgeReason03Flg(true);	// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���fNG���R
							// Change Start CATPPS-1364 �Ή� A.Miyakawa
							// reqIS_20410.setProcessingStatus(new BigDecimal(3));				// �A�g�v�����IS_20410.������
							// Change End CATPPS-1364 �Ή� A.Miyakawa
						/* �G���[�`�F�b�N�����ŊY�����Ȃ������ꍇ���L�̏��������� */
						} else {
							abolitionAgencyDecision.setStopAgencyJudgeFlg("01");			// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���f
							// Change Start CATPPS-1364 �Ή� A.Miyakawa
							// reqIS_20410.setProcessingStatus(new BigDecimal(2));				// �A�g�v�����IS_20410.������
							// Change End CATPPS-1364 �Ή� A.Miyakawa
							/* �ڑ��p�~�\��N�������X�V���邽�߂ɁA�ڑ��p�~�\��N�����X�V���(LIST<te11EntityModel>)�ɒǉ����� */
							Te11EntityModel te11EntityModel = new Te11EntityModel();
							te11EntityModel.setTe11001(stationCd);
							te11EntityModel.setTe11002(errResult.getCustomerCd());
							te11EntityModel.setTe11003(errResult.getSeqNo());
							te11EntityModel.setTe11103(abolitionAgency.getAbolitionDate());
							linkRequestInfoResult.getTe11EntityModelList().add(te11EntityModel);
						}
					}

					/* �p�~�掟���i�[���� */
					insertAbolitionAgencyQuery(catyPrincipal, stationCd, errResult, abolitionAgency);

					/* �X�C�b�`���O�x���V�X�e���A�g�v���T�[�r�X(�p�~�掟���f)���s�����߂̏���A�g�v�����ɒǉ����� */
					abolitionAgencyDecision.setCustomerCd(errResult != null ? errResult.getCustomerCd() : null);	// �p�~�掟���f���.�ڋq�R�[�h
					abolitionAgencyDecision.setCustomerConsNum(errResult != null ? errResult.getSeqNo() : null);	// �p�~�掟���f���.�A��
					if (IS_20310.equals(serviceId)) {																// �p�~�掟���f���.�_����
						abolitionAgencyDecision.setContractType("015");
					} else if (IS_K20310.equals(serviceId)) {
						abolitionAgencyDecision.setContractType("016");
					} else if (IS_F20310.equals(serviceId)) {
						abolitionAgencyDecision.setContractType("017");
					}
					abolitionAgencyDecision.setStopAgencyNum(abolitionAgency.getAbolitionAgencyNumber());			// �p�~�掟���f���.�p�~�掟�ԍ�
					linkRequestInfoResult.getSwAbolitionJudgementInfo().add(abolitionAgencyDecision);				// �A�g�v�����.�p�~�掟���f���

					/* ���L�̏���A�g�v�����Ƃ��ĕێ����� */
					reqIS_20410.setCustomerCd(errResult != null ? errResult.getCustomerCd() : null);	// �A�g�v�����IS_�~�~�~�~�p.�ڋq�R�[�h
					reqIS_20410.setSerialNumber(errResult != null ? errResult.getSeqNo() : null);		// �A�g�v�����IS_�~�~�~�~�p.�A��
					reqIS_20410.setAbolitionAgencyNo(abolitionAgency.getAbolitionAgencyNumber());		// �A�g�v�����IS_�~�~�~�~�p.�p�~�掟�ԍ���ݒ�
					// Change Start CATPPS-769 �Ή� A.Miyakawa
					reqIS_20410.setStatus(abolitionAgency.getStatus());
					// Change Start CATPPS-769 �Ή� A.Miyakawa
					linkRequestInfoResult.getLinkReqForIs().add(reqIS_20410);							// �A�g�v�����.�A�g�v�����IS_�~�~�~�~�p
					// Delete Start CATPPS-1564 20160411 A.Miyakawa
					/* ��t���b�Z�[�W���ݒ� */
					// linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
					// Delete End CATPPS-1564 20160411 A.Miyakawa
				}
			}
			// Change Start CATPPS-1564 20160411 A.Miyakawa
			/* ��t���b�Z�[�W���ݒ� */
			linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(catyPrincipal, cmnServiceImpl));
			// Change End CATPPS-1564 20160411 A.Miyakawa
		// Change end 20160228 A.Takemi [CATPPS-1252]

		} else if (IS_20410.equals(serviceId) || IS_K20410.equals(serviceId)
				|| IS_F20410.equals(serviceId)) {

			/**
			 * IS_20410(�X�C�b�`���O�p�~�掟���f(�ሳ)) IS_K20410(�X�C�b�`���O�p�~�掟���f(����(500kw����)))
			 * IS_F20410(�X�C�b�`���O�p�~�掟���f(�ሳFIT�d��))
			 */
			
			// �X�C�b�`���O�p�~�\�����
			List<SwithingParameter> paramList = new ArrayList<SwithingParameter>();
			
			Te7aEntityModel model = this.getSpecifiedTe7aModel(linkRequestInfoResult.getTe7aEntityModelList(),"JUDGEMENT_FLAG");
			// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���f
			String swHandan = model.getTe7a101();
			
			// �p�~�掟���f���.�X�C�b�`���O�p�~�掟���f
			if ("01".equals(swHandan)) {

				// �u01:OK�v�̏ꍇ

				SwithingParameter param = new SwithingParameter();

				// �p�����[�^.�ڋq�R�[�h
				param.setCustomerCd(linkRequestInfoResult.getCustomerCd());
				// �p�����[�^.�A��
				param.setCustomerConsNum(linkRequestInfoResult
						.getSerialNumber());
				// �p�����[�^.�X�V�t���O
				param.setUpdateFlg(new BigDecimal(1));

				paramList.add(param);

				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				linkRequestInfoResult.setJudgeMent(swHandan);
				// �A�g�v�����.�����󋵂Ɂu2�v��ݒ肷��
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
				// Change Start CATPPS-1364 �Ή� A.Miyakawa

			} else if ("02".equals(swHandan)) {

				// �u02:NG�v�̏ꍇ
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				linkRequestInfoResult.setJudgeMent(swHandan);
				// �A�g�v�����.�����󋵂Ɂu3�v��ݒ肷��
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
			}
			
			// �A�g�v�����.�X�C�b�`���O�p�~�\�����
			linkRequestInfoResult.setSwAbolitionApplyInfo(paramList);
			
			// ��t���b�Z�[�W���ݒ�
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
			 * IF_10220(�Ɩ������󋵊m�F(�ሳ)(�g�p�ʏ��Ɖ�))
			 * IF_10420(�Ɩ������󋵊m�F(�ሳ)(�ē_))�AIF_10520(�Ɩ������󋵊m�F(�ሳ)(�p�~(�P��)))�A
			 * IF_10620
			 * (�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�J�n))�AIF_10720(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�p�~))�A
			 * IF_10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX))�AIF_10920(�Ɩ������󋵊m�F(�ሳ)(�A���y�A�ύX))�A
			 * IF_K10220(�Ɩ������󋵊m�F(����(500kw����))(�g�p�ʏ��Ɖ�))�A
			 * IF_K10520(�Ɩ������󋵊m�F(����(500kw����))(�p�~(�P��)))�A
			 * IF_K10620(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�J�n))�A
			 * IF_K10720(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�p�~))�A
			 * IF_K10820(�Ɩ������󋵊m�F(����(500kw����))(���v�ҏ��ύX)))�A
			 * IF_F10420(�Ɩ������󋵊m�F(�ሳFIT�d��)(�ē_))�A
			 * IF_F10520(�Ɩ������󋵊m�F(�ሳFIT�d��)(�p�~(�P��))�A
			 * IF_F10620(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�J�n)�A
			 * IF_F10720(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�p�~)�A
			 * IF_F10820(�Ɩ������󋵊m�F(�ሳFIT�d��)(���v�ҏ��ύX))
			 */
			
			// �g�p�ʏ��Ɖ���
			List<SwithingParameter> paramList = new ArrayList<SwithingParameter>();
			/** �X�C�b�`���O�A�g���ʏ�񃊃X�g */
			List<Te7jEntityModel> te7jEntityModelList = new ArrayList<Te7jEntityModel>();

			if ("01".equals(cmnServiceImpl.getReceivingStep())
					|| "02".equals(cmnServiceImpl.getReceivingStep())
					|| "03".equals(cmnServiceImpl.getReceivingStep())
					|| "04".equals(cmnServiceImpl.getReceivingStep())
					|| "10".equals(cmnServiceImpl.getReceivingStep())) {

				// �������ʐ���Ƃ��ďI������
				return false;

			} else if ("06".equals(cmnServiceImpl.getReceivingStep())
					|| "08".equals(cmnServiceImpl.getReceivingStep())) {

				// �T�[�r�XID�ʂɏ������s��
				if (IF_10220.equals(serviceId) || IF_K10220.equals(serviceId)) {

					SwithingParameter param = new SwithingParameter();

					// �p�����[�^.�ڋq�R�[�h
					param.setCustomerCd(linkRequestInfoResult.getCustomerCd());
					// �p�����[�^.�A��
					param.setCustomerConsNum(linkRequestInfoResult
							.getSerialNumber());
					// �p�����[�^.�X�V�t���O
					param.setUpdateFlg(new BigDecimal(1));
					// �p�����[�^.�g�p�ʉ{���p�X���[�h
					param.setUsedInfoReadPw(cmnServiceImpl
							.getUsageBrowsePassword());

					paramList.add(param);

				} else if (IF_10520.equals(serviceId) || IF_10720.equals(serviceId) ||
							IF_K10520.equals(serviceId) || IF_K10720.equals(serviceId) ||
							IF_F10520.equals(serviceId) || IF_F10720.equals(serviceId) ) {
					//�@�ڑ��p�~�N�����̌��ʂ��i�[
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
					// �A�h�I���R�[�h�uSAIBUGAS�v�̐���R�[�h���uONLY�v�̏ꍇ�i�����K�X�p�j
					if (catyPrincipal.getAddOnControl().getAddOnModel(AddOnCode.SAIBUGAS).getAddOnControlCode() == AddOnControlCode.SAIBUGAS__ONLY) {
						// ���o�^�����擾����
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
					//�@�v���֗\�茎���y�ьv���֌����̌��ʂ��i�[
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
					//�@�_��ύX�N�����̌��ʂ��i�[
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

				/** �ٓ����ƈٓ��\����̍��ق��m�F���� */

				// �d�͌_������擾���� Dao
				GetElectricPowerContractInfoResult electricResult = new GetElectricPowerContractInfoResult();
				this.setEleContractInfo(electricResult, linkRequestInfoResult.getContractInfoResult());

				// �T�[�r�XID�ʂɏ������s��
				if (IF_10420.equals(serviceId) || IF_F10420.equals(serviceId)
						|| IF_10620.equals(serviceId)
						|| IF_K10620.equals(serviceId)
						|| IF_F10620.equals(serviceId)) {

					// Change start 20160318 I.Kudou [CATPPS-1236]
					//// �d�͌_�񋤒ʏ��.�ڑ��J�n�\����ƃ��X�|���X���.�ڑ��J�n�N�������s��v�̏ꍇ
					//if (!electricResult.getTransportaionScheduledStartDate()
					//		.equals(cmnServiceImpl.getConnectSupplyStartDate())) {
					//
					//	// �A�g�v�����.�ٓ��\����ɐڑ������J�n�\�����ݒ�
					//	linkRequestInfoResult.setChangesDatePlan(electricResult
					//			.getTransportaionScheduledStartDate());
					//
					//	// �A�g�v�����.�ٓ����ɐڑ������J�n�N������ݒ�
					//	linkRequestInfoResult.setChangesDate(cmnServiceImpl
					//			.getConnectSupplyStartDate());
					//
					//					}
					//NVL(�v���֌���,NVL(�v���֗\�茎��,�˗����̐ڑ������J�n�\���))�l����
					String changesDate = null;
					if(!StringUtils.isEmpty(cmnServiceImpl.getKeikiTorikaeYmd())) {
						changesDate = cmnServiceImpl.getKeikiTorikaeYmd();
					} else if (!StringUtils.isEmpty(cmnServiceImpl.getKeikiTorikaeYoteiYmd())) {
						changesDate = cmnServiceImpl.getKeikiTorikaeYoteiYmd();
					} else {
						changesDate = cmnServiceImpl.getSetsuzokuKyokyuKaishiYmd();
					}
					// �d�͌_�񋤒ʏ��.�ڑ��J�n�\�����NVL(�v���֌���,NVL(�v���֗\�茎��,�˗����̐ڑ������J�n�\���))���s��v�̏ꍇ
					if (!StringUtils.isEmpty(electricResult.getTransportaionScheduledStartDate()) &&
						!electricResult.getTransportaionScheduledStartDate().equals(changesDate)	) {

						// �A�g�v�����.�ٓ��\����ɐڑ������J�n�\�����ݒ�
						linkRequestInfoResult.setChangesDatePlan(electricResult
								.getTransportaionScheduledStartDate());

						// �A�g�v�����.�ٓ�����NVL(�v���֌���,NVL(�v���֗\�茎��,�˗����̐ڑ������J�n�\���))��ݒ�
						linkRequestInfoResult.setChangesDate(changesDate);

					}
					// Change end 20160318 I.Kudou [CATPPS-1236]

				} else if (IF_10520.equals(serviceId)
						|| IF_K10520.equals(serviceId)
						|| IF_F10520.equals(serviceId)
						|| IF_10720.equals(serviceId)
						|| IF_K10720.equals(serviceId)
						|| IF_F10720.equals(serviceId)) {

					// �d�͌_�񋤒ʏ��.�ڑ��p�~�\����ƃ��X�|���X���.�ڑ��p�~�N�������s��v�̏ꍇ
					if (!electricResult.getTransportaionScheduledEndDate()
							.equals(cmnServiceImpl
									.getConnectSupplyAbolitionDate())) {

						// �A�g�v�����.�ٓ��\����� �ڑ������p�~�\�����ݒ�
						linkRequestInfoResult.setChangesDatePlan(electricResult
								.getTransportaionScheduledEndDate());

						// �A�g�v�����.�ٓ����ɐڑ������p�~�N������ݒ�
						linkRequestInfoResult.setChangesDate(cmnServiceImpl
								.getConnectSupplyAbolitionDate());
					}
				} else if (IF_10920.equals(serviceId)) {

					// �d�͌_�񋤒ʏ��.�_��ύX�\����ƃ��X�|���X���.�_��ύX�N�������s��v�̏ꍇ
					if (!electricResult.getContractChangeScheduledDate()
							.equals(cmnServiceImpl.getContractChangeDate())) {

						// �A�g�v�����.�ٓ��\����� �_��ύX�\�����ݒ�
						linkRequestInfoResult.setChangesDatePlan(electricResult
								.getContractChangeScheduledDate());

						// �A�g�v�����.�ٓ����Ɍ_��ύX�N������ݒ�
						linkRequestInfoResult.setChangesDate(cmnServiceImpl
								.getContractChangeDate());

					}
				}

				// �A�g�v������ێ�����

				// �A�g�v�����.�\���ԍ�
				linkRequestInfoResult.setAppNo(cmnServiceImpl
						.getApplyNoOfResponse());
				
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// �A�g�v�����.������
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(2));
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// �ŏI�������A�g�ԍ����X�V����

				// ���������Ƃ���T�[�r�XID���擾����
				String searchServiceId = this.getSearchingServiceId(serviceId);

				// �\�������擾
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
				
				// �X�C�b�`���O�A�g�Ǘ��X�V����A�g�Ǘ����ɐݒ肷��(�ǉ�����)
				Te79EntityModel te79EntityModel = new Te79EntityModel();
				te79EntityModel.setTe79001(stationCd);
				te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// te79EntityModel.setTe79102(new BigDecimal("2"));
				// Change End CATPPS-1364 �Ή� A.Miyakawa
				te79EntityModel.setTe79701(cmnServiceImpl.getRenrakuMsg());
				List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
				te79EntityModelListUpdateInfo.add(te79EntityModel);
				linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
				
				SwContractStatusChangeInfoModel swContractStatusChangeInfoModel = null;
				
				// �_���ԕύX
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
				
				// Change Start CATPPS-1101 �Ή��@A.Miyakawa
				// ��t���b�Z�[�W���ݒ�
				linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
						linkRequestInfoResult.getTe79EntityMode().getTe79001(),
						linkRequestInfoResult.getTe79EntityMode().getTe79002(),
						linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
						cmnServiceImpl));
				// �A�������ݒ�
				linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
				// Change End CATPPS-1101 �Ή��@A.Miyakawa
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				linkRequestInfoResult.setReceivingStep(cmnServiceImpl.getReceivingStep());
				// Change End CATPPS-1364 �Ή� A.Miyakawa
			} else if ("09".equals(cmnServiceImpl.getReceivingStep())) {

				// �A�g�v������ێ�����

				// �A�g�v�����.�\���ԍ�
				linkRequestInfoResult.setAppNo(cmnServiceImpl
						.getApplyNoOfResponse());
				// �A�g�v�����.������
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// linkRequestInfoResult.setProcessingStatus(new BigDecimal(3));
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// ���������Ƃ���T�[�r�XID���擾����
				String searchServiceId = this.getSearchingServiceId(serviceId);

				// �\�������擾
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
				
				// �X�C�b�`���O�A�g�Ǘ��X�V����A�g�Ǘ����ɐݒ肷��(�ǉ�����)
				Te79EntityModel te79EntityModel = new Te79EntityModel();
				te79EntityModel.setTe79001(stationCd);
				te79EntityModel.setTe79501(linkRequestInfoResult.getAppNo());
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				// te79EntityModel.setTe79102(new BigDecimal("2"));
				// Change End CATPPS-1364 �Ή� A.Miyakawa
				te79EntityModel.setTe79701(cmnServiceImpl.getRenrakuMsg());
				List<Te79EntityModel>te79EntityModelListUpdateInfo = linkRequestInfoResult.getTe79EntityModelListUpdateInfo();
				te79EntityModelListUpdateInfo.add(te79EntityModel);
				linkRequestInfoResult.setTe79EntityModelListUpdateInfo(te79EntityModelListUpdateInfo);
				// Change Start CATPPS-1101 �Ή��@A.Miyakawa
				// ��t���b�Z�[�W���ݒ�
				linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
						linkRequestInfoResult.getTe79EntityMode().getTe79001(),
						linkRequestInfoResult.getTe79EntityMode().getTe79002(),
						linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
						cmnServiceImpl));
				// �A�������ݒ�
				linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
				// Change End CATPPS-1101 �Ή��@A.Miyakawa
				// Change Start CATPPS-1364 �Ή� A.Miyakawa
				linkRequestInfoResult.setReceivingStep(cmnServiceImpl.getReceivingStep());
				// Change End CATPPS-1364 �Ή� A.Miyakawa
			// Change Start CATPPS-944 �Ή��@T.Funao
			} else if ("05".equals(cmnServiceImpl.getReceivingStep())){
				if(IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
					|| IF_F10620.equals(serviceId) || IF_10720.equals(serviceId)
					|| IF_K10720.equals(serviceId) || IF_F10720.equals(serviceId)){
					linkRequestInfoResult.setReceivingStep(cmnServiceImpl.getReceivingStep());
				}
			// Change End CATPPS-944 �Ή��@T.Funao
				// Add start CATPPS-1236 �Ή��@I.Kudou
				// ��t���b�Z�[�W���ݒ�
				linkRequestInfoResult.getTe7bEntityModelList().addAll(cmnServiceImpl.getTe7bEntityModels(
						linkRequestInfoResult.getTe79EntityMode().getTe79001(),
						linkRequestInfoResult.getTe79EntityMode().getTe79002(),
						linkRequestInfoResult.getTe79EntityMode().getTe79003(), 
						cmnServiceImpl));
				// �A�������ݒ�
				linkRequestInfoResult.setContactMatter(cmnServiceImpl.getRenrakuMsg());
				// Add end CATPPS-1236 �Ή��@I.Kudou
			}
			
			// �A�g�v�����.�g�p�ʏ��Ɖ���
			linkRequestInfoResult.setUsedAmountInfoInquiryInfo(paramList);
			
			// �A�g�v�����.�X�C�b�`���O�A�g���ʏ��
			linkRequestInfoResult.setTe7jEntityModelList(te7jEntityModelList);

		}

		// Add start 20160216 A.Takemi [CATPPS-979]
		/* ���Ǝ҈ꗗ�擾�T�[�r�X�̏ꍇ�A���X�|���X���̎��Ǝ҈ꗗ�iCSV�t�@�C���j���T�[�o�ɕۑ�����B */
		// �A�g�v�����.�T�[�r�XID�����Ǝ҈ꗗ�擾�T�[�r�XID�̏ꍇ�A�ȉ��̏������s���B
		if (Const.SERVICE_ID_SV_CLASSIFICATION_COMPANIES_LIST_REQUEST.equals(linkRequestInfoResult.getServiceId())) {
			SwitchingServiceBizJugyoshaIchiranYokyuSubLocigImpl swService = (SwitchingServiceBizJugyoshaIchiranYokyuSubLocigImpl)cmnServiceImpl;
			swService.setTpe7EntityDao(getTpe7EntityDao());
			linkRequestInfoResult = swService.linkRequestResultProc(catyPrincipal, linkRequestInfoResult);
		}
		// Add end 20160216 A.Takemi [CATPPS-979]

		return true;
	}

	/**
	 * �X�C�b�`���O�A�g�Ǘ������X�V���܂��B
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�Ǘ����
	 * @param seq
	 *            �A�g�ԍ��A��
	 * @return �ۑ�����Te79EntityModel
	 */
	private Te79EntityModel insertSwitchingFederationManagement(CatyPrincipal principal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, BigDecimal seq) {

		Te79EntityModel model = new Te79EntityModel();

		// �ǃR�[�h
		model.setTe79001(stationCd);
		// �A�g�ԍ���BASE�Őݒ肳��Ă���B

		// �A�g�ԍ��A��
		model.setTe79003(seq);

		// �A�g�v������
		model.setTe79101(new Timestamp(System.currentTimeMillis()));
		
		// ������
		model.setTe79102(linkRequestInfoResult.getProcessingStatus());
		// �T�[�r�XID
		model.setTe79103(linkRequestInfoResult.getServiceId());
		// �ڋq�R�[�h
		model.setTe79104(linkRequestInfoResult.getCustomerCd());
		// �A��
		model.setTe79105(linkRequestInfoResult.getSerialNumber());
		// �A�g����
		model.setTe79201(linkRequestInfoResult.getCooperationDate());
		// �ʐM����
		model.setTe79202(this.acquiredDataChk(linkRequestInfoResult
				.getCommunicationResult()));
		// �ʐM�X�e�[�^�X
		model.setTe79203(linkRequestInfoResult.getCommunicationStatus());
		// �T�[�r�X����
		model.setTe79301(this.acquiredDataChk(linkRequestInfoResult
				.getServiceResult()));
		// �T�[�r�X�G���[���R
		model.setTe79302(linkRequestInfoResult.getServiceErrorReason());
		// �A�g����
		model.setTe79401(linkRequestInfoResult.getCooperationResult());
		// �A�g�G���[���R
		model.setTe79402(linkRequestInfoResult.getCooperationErrorReason());
		// �\���ԍ�
		model.setTe79501(linkRequestInfoResult.getAppNo());
		// �p�~�掟�ԍ�
		model.setTe79601(linkRequestInfoResult.getAbolitionAgencyNo());
		// �X�VApp
		model.setUpdateApp("SXA0023");

		// �o�^���������s
		return this.getTe79EntityDao().save(principal, model);
	}

	/**
	 * �X�C�b�`���O�A�g�Ǘ������󋵂��X�V����
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param procStatus
	 *            ������
	 * @param te79Entity
	 *            �X�C�b�`���O�A�g�Ǘ����
	 * @throws EntityNotFoundException
	 */
	private void updateForProcStateOfSwitchingCoopMngInfo(
			CatyPrincipal principal, BigDecimal procStatus, String renrakuMsg,
			Te79EntityModel te79Entity) throws EntityNotFoundException {

		Te79EntityModel model = null;

		model = this.getTe79EntityDao().findByPrimaryKeyForUpdate(principal,
				te79Entity.getTe79001(), te79Entity.getTe79002(),
				te79Entity.getTe79003());

		// �����󋵂�ݒ�
		model.setTe79102(procStatus);
		// ���A��������ݒ�
		if (!StringUtils.isEmpty(renrakuMsg)) {
			model.setTe79701(renrakuMsg);
		}
		// �X�VApp
		model.setUpdateApp("SXA0023");
		// �ۑ��t���O
		model.setPersist(true);

		// �X�V���������s
		this.getTe79EntityDao().update(principal, model);

	}

	/**
	 * �p�~�掟���ʂ�o�^����
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 * @param seqNo
	 *            �A��
	 * @param model
	 *            �p�~�掟���ʏƉ���
	 */
	private void insertAbolitionAgencyResults(CatyPrincipal principal,
			String stationCd, Te79EntityModel te79Entity,
			AbolitionAgencyResultsQueryModel model) {

		/** �o�^���̍쐬 */

		Te77EntityModel te77Entity = new Te77EntityModel();

		// �ǃR�[�h
		te77Entity.setTe77001(stationCd);
		// �ڋq�R�[�h
		te77Entity.setTe77002(te79Entity.getTe79104());
		// �A��
		te77Entity.setTe77003(te79Entity.getTe79105());
		// �p�~�掟���ʘA��
		// �V�[�P���X�Ŋ���U��
		// �p�~�掟�ԍ�
		te77Entity.setTe77101(model.getAbolitionAgencyNumber());
		// �X�e�[�^�X
		te77Entity.setTe77102(model.getStatus());
		// �X�e�[�^�X����
		te77Entity.setTe77103(model.getStatusName());
		// �X�C�b�`���O�p�~�掟���fNG���R
		te77Entity.setTe77104(model
				.getSwitchingAbolitionAgencyDecisionNGReason());
		// �X�C�b�`���O�p�~�掟���fNG���R����
		te77Entity.setTe77105(model
				.getSwitchingAbolitionAgencyDecisionNGReasonName());
		// �n�_����ԍ�
		te77Entity.setTe77106(model.getSupplyPointSpecificNumber());
		// �_��ԍ�
		te77Entity.setTe77107(model.getContractNumber());
		// �Z��
		te77Entity.setTe77108(model.getAddress());
		// ������
		te77Entity.setTe77109(model.getBuildingName());
		// �����J�i
		te77Entity.setTe77110(model.getDemandsNameKana());
		// ����
		te77Entity.setTe77111(model.getDemandsName());
		// �p�~�N����
		te77Entity.setTe77112(model.getAbolitionDate());
		// �V�������Ǝ҃R�[�h
		te77Entity.setTe77113(model.getNewRetailBusinessCd());
		// �V�������ƎҖ�
		te77Entity.setTe77114(model.getNewRetailBusinessName());
		// �V�������ƎҒS���Җ�
		te77Entity.setTe77115(model.getNewRetailContactName());
		// �V�������ƎҒS���ғd�b�ԍ�(�s�O�ǔ�)
		te77Entity.setTe77116(model.getNewRetailAreaCode());
		// �V�������ƎҒS���ғd�b�ԍ�(�s���ǔ�)
		te77Entity.setTe77117(model.getNewRetailCityCode());
		// �V�������ƎҒS���ғd�b�ԍ�(�����Ҕԍ�)
		te77Entity.setTe77118(model.getNewRetailSubscriberNumber());
		// �������S���Җ�
		te77Entity.setTe77119(model.getRetailContactName());
		// �������S���ғd�b�ԍ�(�s�O�ǔ�)
		te77Entity.setTe77120(model.getRetailAreaCode());
		// �������S���ғd�b�ԍ�(�s���ǔ�)
		te77Entity.setTe77121(model.getRetailCityCode());
		// �������S���ғd�b�ԍ�(�����Ҕԍ�)
		te77Entity.setTe77122(model.getRetailSubscriberNumber());
		// �p�~�掟�o�^��
		te77Entity.setTe77123(model.getRegistDate());
		// �ŏI�X�V��
		te77Entity.setTe77124(model.getLastUpdated());
		// �X�VApp
		te77Entity.setUpdateApp("SXA0023");

		// �o�^���������s
		this.getTe77EntityDao().save(principal, te77Entity);
	}

	// Change start 20160228 A.Takemi [CATPPS-1252]
	/**
	 * <b>UI�݌v�i�o�͕ҏW�d�l)_No.16 TE76�X�C�b�`���O�p�~�掟</b></br>
	 * �p�~�掟���i�[���� 
	 * @param principal �v�����V�p��
	 * @param stationCd �ǃR�[�h
	 * @param errResult �G���[�`�F�b�N���
	 * @param model �p�~�掟���
	 * @throws EntityNotFoundException 
	 */
	private void insertAbolitionAgencyQuery(CatyPrincipal principal, String stationCd, GetErrorCheckInfoResult errResult, AbolitionAgencyQueryModel model) throws EntityNotFoundException {
		
		// Change Start 20160320 A.Miyakawa CATPPS-1473
		deleteAbolitionAgencyQuery(principal, stationCd, model);
		// Change End 20160320 A.Miyakawa CATPPS-1473
		
		Te76EntityModel te76Entity = new Te76EntityModel();
		te76Entity.setTe76001(stationCd);												// �ǃR�[�h
		te76Entity.setTe76101(errResult != null ? errResult.getCustomerCd() : null);	// �ڋq�R�[�h
		te76Entity.setTe76102(errResult != null ? errResult.getSeqNo() : null);			// �A��
		te76Entity.setTe76201(model.getAbolitionAgencyNumber());						// �p�~�掟�ԍ�
		te76Entity.setTe76202(model.getStatus());										// �X�e�[�^�X
		te76Entity.setTe76203(model.getStatusName());									// �X�e�[�^�X����
		te76Entity.setTe76204(model.getSwitchingAbolitionAgencyDecisionNGReason());		// �X�C�b�`���O�p�~�掟���fNG���R
		te76Entity.setTe76205(model.getSwitchingAbolitionAgencyDecisionNGReasonName());	// �X�C�b�`���O�p�~�掟���fNG���R����
		te76Entity.setTe76206(model.getSupplyPointSpecificNumber());					// �n�_����ԍ�
		te76Entity.setTe76207(model.getContractNumber());								// �_��ԍ�
		te76Entity.setTe76208(model.getAddress());										// �Z��
		te76Entity.setTe76209(model.getBuildingName());									// ������
		te76Entity.setTe76210(model.getDemandsNameKana());								// �����J�i
		te76Entity.setTe76211(model.getDemandsName());									// ����
		te76Entity.setTe76212(model.getAbolitionDate());								// �p�~�N����
		te76Entity.setTe76213(model.getNewRetailBusinessCd());							// �V�������Ǝ҃R�[�h
		te76Entity.setTe76214(model.getNewRetailBusinessName());						// �V�������ƎҖ�
		te76Entity.setTe76215(model.getNewRetailContactName());							// �V�������ƎҒS���Җ�
		te76Entity.setTe76216(model.getNewRetailAreaCode());							// �V�������ƎҒS���ғd�b�ԍ�(�s�O�ǔ�)
		te76Entity.setTe76217(model.getNewRetailCityCode());							// �V�������ƎҒS���ғd�b�ԍ�(�s���ǔ�)
		te76Entity.setTe76218(model.getNewRetailSubscriberNumber());					// �V�������ƎҒS���ғd�b�ԍ�(�����Ҕԍ�)
		te76Entity.setTe76219(model.getRetailContactName());							// �������S���Җ�
		te76Entity.setTe76220(model.getRetailAreaCode());								// �������S���ғd�b�ԍ�(�s�O�ǔ�)
		te76Entity.setTe76221(model.getRetailCityCode());								// �������S���ғd�b�ԍ�(�s���ǔ�)
		te76Entity.setTe76222(model.getRetailSubscriberNumber());						// �������S���ғd�b�ԍ�(�����Ҕԍ�)
		te76Entity.setTe76223(model.getRegistDate());									// �p�~�掟�o�^��
		te76Entity.setTe76224(model.getLastUpdated());									// �ŏI�X�V��
		te76Entity.setUpdateApp("SXA0023");												// �X�VApp
		getTe76EntityDao().save(principal, te76Entity);
	}
	// Change end 20160228 A.Takemi [CATPPS-1252]
	
	// Change Start 20160320 A.Miyakawa CATPPS-1473
	/**
	 * �p�~�掟�����폜����
	 * @param principal
	 * @param stationCd
	 * @param model
	 * @throws EntityNotFoundException 
	 */
	private void deleteAbolitionAgencyQuery(CatyPrincipal principal,
			String stationCd, AbolitionAgencyQueryModel model) throws EntityNotFoundException {
		
		// �����p�~�掟�ԍ������݂���ꍇ�폜����
		if (!StringUtils.isEmpty(model.getAbolitionAgencyNumber())) {
			// �p�~�掟�ԍ���TE76������
			List<Te76EntityModel> te76EntityModels = getTe76EntityDao().findByAbolitionAgencyNoForAbolitionAgencyMultiInfo(stationCd, model.getAbolitionAgencyNumber());
			if ( te76EntityModels != null)
				if ( !te76EntityModels.isEmpty()) {
					for (Te76EntityModel te76EntityModel:te76EntityModels) {
						// ���b�N
						Te76EntityModel updateModel = getTe76EntityDao().findByPrimaryKeyForUpdate(principal, te76EntityModel.getTe76001(), te76EntityModel.getTe76002());
						// �폜
						getTe76EntityDao().delete(principal, updateModel);
					}
				}
		}
	}
	// Change Start 20160320 A.Miyakawa CATPPS-1473

	/**
	 * �����n�_�g�p�ʏ���o�^�܂��͍X�V���܂��B
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param customerCd
	 *            �ڋq�R�[�h
	 * @param serialNumber
	 *            �A��
	 * @param cmbService
	 *            �ΏۃT�[�r�X�N���X
	 */
	@SuppressWarnings("rawtypes")
	private void registUsageInformationQuery(CatyPrincipal principal,
			String stationCd, String customerCd, BigDecimal serialNumber,
			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmbService) {

		Te7hEntityModel te7hEntity = null;

		try {
			// �Ώۃ��R�[�h�����b�N
			te7hEntity = this.getTe7hEntityDao().findByPrimaryKeyForUpdate(
					principal, stationCd, customerCd, serialNumber);
		} catch (EntityNotFoundException e) {
			// �����Ȃ�
		}

		if (te7hEntity != null) {

			// ���X�|���X����ݒ�
			cmbService.settingUpdUsageInfoQuery(te7hEntity);

			// �X�V���������s
			this.getTe7hEntityDao().update(principal, te7hEntity);

		} else {

			// ���X�|���X����ݒ�
			te7hEntity = cmbService.settingInsUsageInfoQuery(stationCd,
					customerCd, serialNumber);

			// �o�^���������s
			this.getTe7hEntityDao().save(principal, te7hEntity);

		}
	}

	/**
	 * �ݔ����_��z�d������o�^����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param te7gEntityList
	 *            �ݔ����_��z�d����񃊃X�g
	 */
	private void insertStraightLineElectricLightInformation(
			CatyPrincipal catyPrincipal, List<Te7gEntityModel> te7gEntityList) {

		for (Te7gEntityModel model : te7gEntityList) {
			// �o�^���������s
			this.getTe7gEntityDao().save(catyPrincipal, model);
		}
	}

	/**
	 * �ݔ����_��z�d�������폜����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param te7gEntityList
	 *            �ݔ����_��z�d����񃊃X�g
	 * @throws EntityNotFoundException
	 */
	private void deleteStraightLineElectricLightInformation(
			CatyPrincipal catyPrincipal, List<Te7gEntityModel> te7gEntityList)
			throws EntityNotFoundException {

		Te7gEntityModel lockEntity = null;

		for (Te7gEntityModel model : te7gEntityList) {

			// �Ώۃ��R�[�h�����b�N
			lockEntity = this.getTe7gEntityDao().findByPrimaryKeyForUpdate(
					catyPrincipal, model.getTe7g001(), model.getTe7g002(),
					model.getTe7g003());

			// �폜���������s
			this.getTe7gEntityDao().delete(catyPrincipal, lockEntity);
		}
	}

	/**
	 * �ݔ����_�v������폜����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param te7fEntityList
	 *            �ݔ����_�v���񃊃X�g
	 * @throws EntityNotFoundException
	 */
	private void deleteInstrumentInformation(CatyPrincipal catyPrincipal,
			List<Te7fEntityModel> te7fEntityList)
			throws EntityNotFoundException {

		Te7fEntityModel lockEntity = null;

		for (Te7fEntityModel model : te7fEntityList) {

			// �Ώۃ��R�[�h�����b�N
			lockEntity = this.getTe7fEntityDao().findByPrimaryKeyForUpdate(
					catyPrincipal, model.getTe7f001(), model.getTe7f002(),
					model.getTe7f003());

			// �폜���������s
			this.getTe7fEntityDao().delete(catyPrincipal, lockEntity);
		}
	}

	/**
	 * �ݔ����_�v�����o�^���܂��B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param te7fEntityList
	 *            �ݔ����_�v���񃊃X�g
	 */
	private void insertInstrumentInformation(CatyPrincipal catyPrincipal,
			List<Te7fEntityModel> te7fEntityList) {

		for (Te7fEntityModel model : te7fEntityList) {
			// �o�^���������s
			this.getTe7fEntityDao().save(catyPrincipal, model);
		}
	}

	/**
	 * �ݔ����_�ٓ��\����t����o�^���܂��B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param te7eEntityList
	 *            �ݔ����_�ٓ��\����t��񃊃X�g
	 */
	private void insertChangesApplicationAcceptanceInfo(
			CatyPrincipal catyPrincipal, List<Te7eEntityModel> te7eEntityList) {

		for (Te7eEntityModel mdoel : te7eEntityList) {

			// �o�^���������s
			this.getTe7eEntityDao().save(catyPrincipal, mdoel);

		}
	}

	/**
	 * �ݔ����_�ٓ��\����t�����폜���܂��B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param te7eEntityList
	 *            �ݔ����_�ٓ��\����t��񃊃X�g
	 * @throws EntityNotFoundException
	 */
	private void deleteChangesApplicationAcceptanceInfo(
			CatyPrincipal catyPrincipal, List<Te7eEntityModel> te7eEntityList)
			throws EntityNotFoundException {

		Te7eEntityModel lockEntity = null;

		for (Te7eEntityModel mdoel : te7eEntityList) {

			// �Ώۃ��R�[�h�����b�N
			lockEntity = this.getTe7eEntityDao().findByPrimaryKeyForUpdate(
					catyPrincipal, mdoel.getTe7e001(), mdoel.getTe7e002(),
					mdoel.getTe7e003());

			// �폜���������s
			this.getTe7eEntityDao().delete(catyPrincipal, lockEntity);

		}
	}

	/**
	 * �ݔ������폜���܂��B
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

			// �Ώۃ��R�[�h�����b�N
			Te7dEntityModel te7dEntity = this.te7dEntityDao.findByPrimaryKey(
					catyPrincipal, stationCd, renkeiNum);

			// �폜���������s
			this.te7dEntityDao.delete(catyPrincipal, te7dEntity);

		} catch (EntityNotFoundException e) {

			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/**
	 * �ݔ�����o�^���܂��B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param customerCd
	 *            �ڋq�R�[�h
	 * @param serialNumber
	 *            �A��
	 * @param renkeiNum
	 *            �A�g�ԍ�
	 * @param cmnServiceImpl
	 *            �ΏۃT�[�r�X
	 */
	@SuppressWarnings("rawtypes")
	private void insertEquipmentInfo(CatyPrincipal catyPrincipal,
			String stationCd, String customerCd, BigDecimal serialNumber,
			BigDecimal renkeiNum,
			SwitchingServiceIntegrationAbstractBizSubLogicImpl cmnServiceImpl) {

		// �ݔ�����ݒ�
		Te7dEntityModel te7dEntity = cmnServiceImpl
				.settingInsEquipmentInformation(stationCd, customerCd,
						serialNumber, renkeiNum);

		// �o�^���������s
		this.te7dEntityDao.save(catyPrincipal, te7dEntity);

	}

	/**
	 * �X�C�b�`���O�A�g�Ǘ��\��������ԍX�V����
	 * 
	 * @param stationCd
	 * @param appNo
	 * @param procStatus
	 */
	private void updateTE79(CatyPrincipal catyPrincipal, String stationCd,
			String appNo, BigDecimal procStatus, String renrakuMsg) {

		// �\���ԍ�����ɃX�C�b�`���O�A�g�Ǘ������擾
		List<Te79EntityModel> te79EntityModelList = this.getTe79EntityDao()
				.findByRenkeiRequestInfoForAppNo(stationCd, appNo);

		try {

			Te79EntityModel updateModel = null;

			for (Te79EntityModel model : te79EntityModelList) {

				// PrimaryKey�ɂ��s���b�N
				updateModel = this.getTe79EntityDao()
						.findByPrimaryKeyForUpdate(catyPrincipal,
								model.getTe79001(), model.getTe79002(),
								model.getTe79003());

				// �����󋵂�ݒ�
				if (procStatus != null)
					updateModel.setTe79102(procStatus);
				// ���A��������ݒ�
				if (!StringUtils.isEmpty(renrakuMsg)) {
					updateModel.setTe79701(renrakuMsg);
				}
				// �o�b�`ID��ݒ�
				updateModel.setUpdateApp("SAX0023");
				// DB�ۑ��t���O��ݒ�
				updateModel.setPersist(true);

				// Update���s
				this.getTe79EntityDao().update(catyPrincipal, updateModel);
			}

		} catch (EntityNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	/**
	 * �A�g���s��������
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 * @param errorFlg
	 *            �G���[����t���O
	 */
	private void completeCooperationExecute(CatyPrincipal principal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, Boolean errorFlg) {

		String serviceId = linkRequestInfoResult.getServiceId();

		if (IS_20210.equals(serviceId) || IS_20310.equals(serviceId)
				|| IS_K20210.equals(serviceId) || IS_K20310.equals(serviceId)
				|| IS_F20210.equals(serviceId) || IS_F20310.equals(serviceId)) {

			/**
			 * IS_20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳ)) IS_20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳ))
			 * IS_K20210(�X�C�b�`���O�p�~�掟���ʏƉ�(����(500kw����)))
			 * IS_K20310(�X�C�b�`���O�p�~�掟�Ɖ�(����(500kw����)))
			 * IS_F20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳFIT�d��))
			 * IS_F20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��))
			 */
			
			List<Te79EntityModel> insertedTE79EntityModels = new ArrayList<Te79EntityModel>();	// �o�^�ςݘA�g�v�����
			
			if (!errorFlg && linkRequestInfoResult.getLinkReqForIs() != null) {
				// �G���[�ȊO����̌ďo�̏ꍇ
				BigDecimal seq = BigDecimal.ZERO; 
				
				for (LinkRequestForIs link : linkRequestInfoResult.getLinkReqForIs()) {
					
					seq.add(BigDecimal.ONE);
					
					LinkRequestInfoResult editLink = new LinkRequestInfoResult();
					editLink = linkRequestInfoResult;
					editLink.setCustomerCd(link.getCustomerCd());
					editLink.setSerialNumber(link.getSerialNumber());
					editLink.setAbolitionAgencyNo(link.getAbolitionAgencyNo());
					editLink.setProcessingStatus(link.getProcessingStatus());
					
					// �A�g�v������o�^
					insertedTE79EntityModels.add(this.insertSwitchingFederationManagement(principal, stationCd, editLink, seq));
				}
				
			} else {
				// �G���[�̑J�ڂ���̌ďo�̏ꍇ
				insertedTE79EntityModels.add(this.insertSwitchingFederationManagement(principal, stationCd, linkRequestInfoResult, BigDecimal.ONE));
			}
			
			// �A�g�v�����.��t���b�Z�[�W���(TE7BEntityModelList)�̐�������t���b�Z�[�W�����i�[����(TE7BEntityModelList����������)
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
			 * IF_10220(�Ɩ������󋵊m�F(�ሳ)(�g�p�ʏ��Ɖ�))�A IF_10420(�Ɩ������󋵊m�F(�ሳ)(�ē_))�A
			 * IF_10520(�Ɩ������󋵊m�F(�ሳ)(�p�~(�P��)))�A IF_10620(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�J�n))�A
			 * IF_10720(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�p�~))�A
			 * IF_10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX))�A IF_10920(�Ɩ������󋵊m�F(�ሳ)(�A���y�A�ύX))�A
			 * IF_K10220(�Ɩ������󋵊m�F(����(500kw����))(�g�p�ʏ��Ɖ�))�A
			 * IF_K10520(�Ɩ������󋵊m�F(����(500kw����))(�p�~(�P��)))�A
			 * IF_K10620(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�J�n))�A
			 * IF_K10720(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�p�~))�A
			 * IF_K10820(�Ɩ������󋵊m�F(����(500kw����))(���v�ҏ��ύX)))�A
			 * IF_F10420(�Ɩ������󋵊m�F(�ሳFIT�d��)(�ē_))�A
			 * IF_F10520(�Ɩ������󋵊m�F(�ሳFIT�d��)(�p�~(�P��))�A
			 * IF_F10620(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�J�n)�A
			 * IF_F10720(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�p�~)�A
			 * IF_F10820(�Ɩ������󋵊m�F(�ሳFIT�d��)(���v�ҏ��ύX))
			 */
			// Change Start CATPPS-1101 �Ή��@A.Miyakawa
			// �A�g�v�����.��t���b�Z�[�W���(TE7BEntityModelList)���i�[����(saveOrUpdate)
			if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isUketsukeMsgFlag())
				insertTE7B(principal, linkRequestInfoResult.getTe7bEntityModelList());
			// Change End CATPPS-1101 �Ή��@A.Miyakawa
			return;

		} else {
			/** ��L�T�[�r�X�ȊO */

			// �A�g�v�����̍X�V
			this.updateSwitchingFederationManagement(principal, stationCd,
					linkRequestInfoResult);
			
			// �A�g�v�����.��t���b�Z�[�W���(TE7BEntityModelList)���i�[����(saveOrUpdate)
			insertTE7B(principal, linkRequestInfoResult.getTe7bEntityModelList());
		}
	}
	
	// Change Start CATPPS-1364 A.Miyakawa
//	/**
//	 * �A�g���s��������
//	 * 
//	 * @param principal
//	 *            �v�����V�p��
//	 * @param stationCd
//	 *            �ǃR�[�h
//	 * @param linkRequestInfoResult
//	 *            �A�g�v�����
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
//			 * IS_20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳ)) IS_20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳ))
//			 * IS_K20210(�X�C�b�`���O�p�~�掟���ʏƉ�(����(500kw����)))
//			 * IS_K20310(�X�C�b�`���O�p�~�掟�Ɖ�(����(500kw����)))
//			 * IS_F20210(�X�C�b�`���O�p�~�掟���ʏƉ�(�ሳFIT�d��))
//			 * IS_F20310(�X�C�b�`���O�p�~�掟�Ɖ�(�ሳFIT�d��))
//			 */
//
//			if (linkRequestInfoResult.getLinkReqForIs() != null) {
//				// �A�g�v������o�^
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
//					// �A�g�v������o�^
//					this.insertSwitchingFederationManagement(principal, stationCd, editLink, seq);
//				}
//			} else {
//				// �A�g�v������o�^
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
//			 * IF_10220(�Ɩ������󋵊m�F(�ሳ)(�g�p�ʏ��Ɖ�))�A IF_10420(�Ɩ������󋵊m�F(�ሳ)(�ē_))�A
//			 * IF_10520(�Ɩ������󋵊m�F(�ሳ)(�p�~(�P��)))�A IF_10620(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�J�n))�A
//			 * IF_10720(�Ɩ������󋵊m�F(�ሳ)(�X�C�b�`���O�p�~))�A
//			 * IF_10820(�Ɩ������󋵊m�F(�ሳ)(���v�ҏ��ύX))�A IF_10920(�Ɩ������󋵊m�F(�ሳ)(�A���y�A�ύX))�A
//			 * IF_K10220(�Ɩ������󋵊m�F(����(500kw����))(�g�p�ʏ��Ɖ�))�A
//			 * IF_K10520(�Ɩ������󋵊m�F(����(500kw����))(�p�~(�P��)))�A
//			 * IF_K10620(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�J�n))�A
//			 * IF_K10720(�Ɩ������󋵊m�F(����(500kw����))(�X�C�b�`���O�p�~))�A
//			 * IF_K10820(�Ɩ������󋵊m�F(����(500kw����))(���v�ҏ��ύX)))�A
//			 * IF_F10420(�Ɩ������󋵊m�F(�ሳFIT�d��)(�ē_))�A
//			 * IF_F10520(�Ɩ������󋵊m�F(�ሳFIT�d��)(�p�~(�P��))�A
//			 * IF_F10620(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�J�n)�A
//			 * IF_F10720(�Ɩ������󋵊m�F(�ሳFIT�d��)(�X�C�b�`���O�p�~)�A
//			 * IF_F10820(�Ɩ������󋵊m�F(�ሳFIT�d��)(���v�ҏ��ύX))
//			 */
//			// �\����񂩂�A�g�ԍ��ƘA�g�ԍ��A�Ԃ��擾
//			linkRequestInfoResult.setRenKeiNum(linkRequestInfoResult.getTe79EntityMode().getTe79002());
//			linkRequestInfoResult.setRenKeiSerialNum(linkRequestInfoResult.getTe79EntityMode().getTe79003());
//			
//			// �A�g�v�����̍X�V
//			this.updateSwitchingFederationManagement(principal, stationCd,
//					linkRequestInfoResult);
//
//		} else {
//			/** ��L�T�[�r�X�ȊO */
//
//			// �A�g�v�����̍X�V
//			this.updateSwitchingFederationManagement(principal, stationCd,
//					linkRequestInfoResult);
//		}
//	}
	// Change End CATPPS-1364 A.Miyakawa

	/**
	 * �X�C�b�`���O�A�g�Ǘ������X�V����
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
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
			
			// ������
			updateModel.setTe79102(linkRequestInfoResult.getProcessingStatus());
			// �A�g����
			updateModel.setTe79201(linkRequestInfoResult.getCooperationDate());

			// �ʐM����
			if (linkRequestInfoResult.getCommunicationResult() != null) {

				updateModel.setTe79202(this.acquiredDataChk(linkRequestInfoResult
						.getCommunicationResult()));

			}
			// �ʐM�X�e�[�^�X
			updateModel.setTe79203(linkRequestInfoResult
					.getCommunicationStatus());
			
			// �T�[�r�X����
			if (linkRequestInfoResult.getServiceResult() != null) {
				updateModel.setTe79301(this.acquiredDataChk(linkRequestInfoResult
						.getServiceResult()));
			}

			// �T�[�r�X�G���[���R
			updateModel.setTe79302(linkRequestInfoResult
					.getServiceErrorReason());
			// �A�g����
			updateModel
					.setTe79401(linkRequestInfoResult.getCooperationResult());
			// �A�g�G���[���R
			updateModel.setTe79402(linkRequestInfoResult
					.getCooperationErrorReason());
			// �\���ԍ�
			updateModel.setTe79501(linkRequestInfoResult.getAppNo());
			// �p�~�掟�ԍ�
			updateModel
					.setTe79601(linkRequestInfoResult.getAbolitionAgencyNo());
			// ���A������
			if (linkRequestInfoResult.getContactMatter() != null) {
				updateModel
						.setTe79701(linkRequestInfoResult.getContactMatter());
			}
			
			// �X�VApp
			updateModel.setUpdateApp("SXA0023");

			// Update���s
			// Change Start CATPPS-1364 A.Miyakawa
			this.getTe79EntityDao().update(principal, updateModel);
			// this.getContractService().updateTe79(principal, stationCd, updateModel);
			// Change Start CATPPS-1364 A.Miyakawa
		} catch (EntityNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	/**
	 * �A�g�X�e�[�^�X�X�V����
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 * @param errorFlg
	 *            �G���[����t���O
	 */
	private void updateCooperationStatus(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, Boolean errorFlg) {
		// �T�[�r�XID�擾
		String serviceId = linkRequestInfoResult.getServiceId();
		
		if ((IS_20210.equals(serviceId) || IS_20310.equals(serviceId)
				|| IS_K20210.equals(serviceId) || IS_K20310.equals(serviceId)
				|| IS_F20210.equals(serviceId) || IS_F20310.equals(serviceId))
				&& !errorFlg && linkRequestInfoResult.getLinkReqForIs() != null) {
			// IS_�~�~�~�~�p
			this.updateStatusMulti(catyPrincipal, stationCd, linkRequestInfoResult);
			
		} else {
			// ���̑�IF�p
			this.updateStatusSingle(catyPrincipal, stationCd, linkRequestInfoResult);
		}
		
	}
	

	/**
	 * �A�g�X�e�[�^�X�X�V����(�P��X�V�p)
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 */
	private void updateStatusSingle(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {
		
		// Change Start CATPPS-1364 A.Miyakawa
//		// �A�g���ۃX�e�[�^�X
//		boolean cooperationSuccess = false;
//		
//		// Change Start CATPPS-944 �Ή��@T.Funao
//		//�T�[�r�XID
//		String serviceId = linkRequestInfoResult.getServiceId();
//		// Change End CATPPS-944 �Ή��@T.Funao
//		// �A�g���ۂ��擾����
//		if (linkRequestInfoResult.getCommunicationResult() == new Integer(1)) {
//
//			// �A�g�v�����.�ʐM���ʂ��u1�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//			cooperationSuccess = false;
//		} else if (linkRequestInfoResult.getServiceResult() == new Integer(1)) {
//
//			// �A�g�v�����.�T�[�r�X���ʂ��u1�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//			cooperationSuccess = false;
//		} else if ("1".equals(linkRequestInfoResult.getCooperationResult())) {
//
//			// �A�g�v�����.�A�g���ʂ��u1�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//			cooperationSuccess = false;
//		} else if (new BigDecimal(3).compareTo(linkRequestInfoResult
//				.getProcessingStatus()) == 0) {
//
//			// �A�g�v�����.�����󋵂��u3�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//			cooperationSuccess = false;
//		} else {
//
//			// ��L�����ȊO�̏ꍇ�A�A�g���ۂ��u����v�ɐݒ�
//			cooperationSuccess = true;
//		}
//		
//		// Add Start 20160222 CATPPS-944 �Ή��@T.Funao
//		//�}�b�`���O�������͘A�g���ۂ𐳏�ɐݒ�
//		if("05".equals(linkRequestInfoResult.getReceivingStep())){
//			if(IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
//				|| IF_F10620.equals(serviceId) || IF_10720.equals(serviceId)
//				|| IF_K10720.equals(serviceId) || IF_F10720.equals(serviceId)){
//				cooperationSuccess = true;
//			}
//		}
		// Add End 20160222 CATPPS-944 �Ή��@T.Funao
		// Change Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
		// ���A������(�\���p)��ݒ肷��
		StringBuffer sb = new StringBuffer();
		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isRenrakuDispFlag()) {
			// �A�g�v�����.��t���b�Z�[�W��񂪑��݂���ꍇ
			if (linkRequestInfoResult.getTe7bEntityModelList() != null) {
				if (!linkRequestInfoResult.getTe7bEntityModelList().isEmpty()) {
					sb.append("<��t���b�Z�[�W>");
					sb.append(CRLF);
					for (Te7bEntityModel model:linkRequestInfoResult.getTe7bEntityModelList()) {
						sb.append(model.getTe7b102());
						sb.append(CRLF);
					}
				}
			}
			
			// �A�g�v�����.���A�����������݂���ꍇ
			if (!StringUtils.isEmpty(linkRequestInfoResult.getContactMatter())) {
				sb.append("<���A������>");
				sb.append(CRLF);
				sb.append(linkRequestInfoResult.getContactMatter());
				sb.append(CRLF);
			}
		}
			// Change End CATPPS-1364 A.Miyakawa
			// �A�g�v�����.�X�C�b�`���O�p�~�掟���f�m�f���R�����݂���ꍇ�͂Ȃ��̂ŏ����Ȃ�
		
		linkRequestInfoResult.setDispContactMatter(getUpSubstringValue( sb.toString(), 4000));
		// Change End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
		
		// �A�g�X�e�[�^�X����ݒ�
		// Change Start CATPPS-1364 A.Miyakawa
		if (!StringUtils.isEmpty(linkRequestInfoResult.getCustomerCd()) && linkRequestInfoResult.getSerialNumber() != null) {
			this.setCooperationStatusCd(catyPrincipal, stationCd,
					linkRequestInfoResult, linkRequestInfoResult.getServiceId());
		}
		// Change End CATPPS-1364 A.Miyakawa
	}
	
	// Change Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
	/**
	 * �p�����[�^�̍ő啶�������A�O������؂������������ԋp����B<br>
	 * �����񂪍ő啶�����ɒB���Ă��Ȃ��ꍇ�́A���������ɕԋp����B
	 * 
	 * @param value ������
	 * @param max �ő啶����
	 * @return ������
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
	 * SHIFT-JIS���Z�̃o�C�g���ŕ�����؂�o��
	 * 
	 * @param source �Ώۂ̕�����
	 * @param bytesCount �؂�o���o�C�g��
	 * @return �w��̃o�C�g�Ő؂�o����������
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
	// Change End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
	
	/**
	 * �A�g�X�e�[�^�X�X�V����(IS_�~�~�~�~�p)
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 */
	private void updateStatusMulti(CatyPrincipal catyPrincipal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult) {
		// Change Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
		List<LinkRequestForIs> LinkRequestForIsResultList = new ArrayList<LinkRequestForIs>();
		// Change End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
		
		for (LinkRequestForIs link : linkRequestInfoResult.getLinkReqForIs()) {
			// Change Start CATPPS-1364 A.Miyakawa
//			// �A�g���ۃX�e�[�^�X
//			boolean cooperationSuccess = false;
//	
//			// �A�g���ۂ��擾����
//			if (linkRequestInfoResult.getCommunicationResult() == new Integer(1)) {
//	
//				// �A�g�v�����.�ʐM���ʂ��u1�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//				cooperationSuccess = false;
//			} else if (linkRequestInfoResult.getServiceResult() == new Integer(1)) {
//	
//				// �A�g�v�����.�T�[�r�X���ʂ��u1�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//				cooperationSuccess = false;
//			} else if ("1".equals(linkRequestInfoResult.getCooperationResult())) {
//	
//				// �A�g�v�����.�A�g���ʂ��u1�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//				cooperationSuccess = false;
//			} else if (new BigDecimal(3).compareTo(link.getProcessingStatus()) == 0) {
//	
//				// �A�g�v�����.�����󋵂��u3�v�̏ꍇ�A�A�g���ۂ��u�ُ�v�ɐݒ�
//				cooperationSuccess = false;
//			} else {
//	
//				// ��L�����ȊO�̏ꍇ�A�A�g���ۂ��u����v�ɐݒ�
//				cooperationSuccess = true;
//			}
			
			// Change Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
			// ���A������(�\���p)��ݒ肷��
			StringBuffer sb = new StringBuffer();
			if (link.getSwitchingUpdateAndAlartStatus().isRenrakuDispFlag()) {
				// �A�g�v�����.��t���b�Z�[�W��񂪑��݂���ꍇ
				if (linkRequestInfoResult.getTe7bEntityModelList() != null) {
					if (!linkRequestInfoResult.getTe7bEntityModelList().isEmpty()) {
						sb.append("<��t���b�Z�[�W>");
						sb.append(CRLF);
						for (Te7bEntityModel model:linkRequestInfoResult.getTe7bEntityModelList()) {
							sb.append(model.getTe7b102());
							sb.append(CRLF);
						}
					}
				}
				
				// �A�g�v�����.���A�����������݂���ꍇ
				if (!StringUtils.isEmpty(linkRequestInfoResult.getContactMatter())) {
					sb.append("<���A������>");
					sb.append(linkRequestInfoResult.getContactMatter());
					sb.append(CRLF);
				}
				
				// �A�g�v�����.�X�C�b�`���O�p�~�掟���f�m�f���R�����݂���ꍇ
				if (!StringUtils.isEmpty(link.getNgReason())) {
					sb.append("<�X�C�b�`���O�p�~�掟���f�m�f���R>");
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
			// Change End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
	
			// �A�g�X�e�[�^�X����ݒ�
			if (!StringUtils.isEmpty(link.getCustomerCd()) && link.getSerialNumber() != null) {
				LinkRequestInfoResult editLink = new LinkRequestInfoResult();
				editLink.setCustomerCd(link.getCustomerCd());
				editLink.setSerialNumber(link.getSerialNumber());
				// Change Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
				editLink.setDispContactMatter(link.getDispContactMatter());
				// Change End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
				// Change Start CATPPS-1364 A.Miyakawa
				editLink.setSwitchingUpdateAndAlartStatus(link.getSwitchingUpdateAndAlartStatus());
				this.setCooperationStatusCd(catyPrincipal, stationCd,
						editLink, linkRequestInfoResult.getServiceId());
				// Change End CATPPS-1364 A.Miyakawa
			}
			// Change Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
			LinkRequestForIsResultList.add(link);
			// Change End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
		}
		// Change Start 20160217 CATPPS-1101 �Ή��@A.Miyakawa
		linkRequestInfoResult.setLinkReqForIs(LinkRequestForIsResultList);
		// Change End 20160217 CATPPS-1101 �Ή��@A.Miyakawa
	}

	/**
	 * �X�C�b�`���O�A�g�X�e�[�^�X���X�V����B
	 * 
	 * @param catyPrincipal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 * @param classificationCd
	 *            ���ރR�[�h
	 * @param transitionDestStatusCd
	 *            �X�e�[�^�X�R�[�h
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

			// �A�g�X�e�[�^�X�R�[�h
			// ���ރR�[�h�ƃX�e�[�^�X�R�[�h���擾�ł����ꍇ
			// Change Start CATPPS-1364 A.Miyakawa
			if (classificationCd != null
					&& transitionDestStatusCd != null)
				model.setTe78101(transitionDestStatusCd);
			// Change End CATPPS-1364 A.Miyakawa
			
			// Change Start CATPPS-1101 �Ή��@A.Miyakawa
			// ��t���b�Z�[�W
			model.setTe78102(linkRequestInfoResult.getDispContactMatter());
			// Change End CATPPS-1101 �Ή��@A.Miyakawa
			
			// �X�VApp
			model.setUpdateApp("SXA0023");
			
			// �V�K�쐬�����s
			this.getTe78EntityDao().update(catyPrincipal, model);
			
		} catch (EntityNotFoundException e) {
			// ���ރR�[�h�ƃX�e�[�^�X�R�[�h���擾�ł����ꍇ
			// Change Start CATPPS-1364 A.Miyakawa
			if (classificationCd != null
					&& transitionDestStatusCd != null) {
				Te78EntityModel model = new Te78EntityModel();
				model.setTe78001(stationCd);
				model.setTe78002(linkRequestInfoResult.getCustomerCd());
				model.setTe78003(linkRequestInfoResult.getSerialNumber());
				model.setTe78004(classificationCd);
				model.setTe78101(transitionDestStatusCd);
				// Change Start CATPPS-1101 �Ή��@A.Miyakawa
				// ��t���b�Z�[�W
				model.setTe78102(linkRequestInfoResult.getDispContactMatter());
				// Change End CATPPS-1101 �Ή��@A.Miyakawa
	
				// �V�K�쐬�����s
				this.getTe78EntityDao().save(catyPrincipal, model);
			}
			// Change End CATPPS-1364 A.Miyakawa
		}

	}

	/**
	 * �A�g�X�e�[�^�X���̐ݒ�<br>
	 * �A�g���ۏ��ƃT�[�r�XID����ɕ��ރR�[�h�ƑJ�ڐ�X�e�[�^�X�R�[�h��ݒ肷��B
	 * 
	 * @param principal
	 *            �v�����V�p��
	 * @param stationCd
	 *            �ǃR�[�h
	 * @param linkRequestInfoResult
	 *            �A�g�v�����
	 * @param cooperationSuccess
	 *            �A�g����
	 * @param serviceId
	 *            �T�[�r�XID
	 */
	// Change Start CATPPS-1364 A.Miyakawa
	private void setCooperationStatusCd(CatyPrincipal principal,
			String stationCd, LinkRequestInfoResult linkRequestInfoResult, String serviceId) {
	// Change End CATPPS-1364 A.Miyakawa
//		String classificationCd = null;
//		String transitionDestStatusCd = null;
		
		// Change Start CATPPS-1364 A.Miyakawa
		// �T�[�r�XID�𔻒f���A�����𕪊򂷂�
//		if (IF_10410.equals(serviceId) || IF_F10410.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "200";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "220";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "230";
//			}
//
//		} else if (IF_10420.equals(serviceId) || IF_F10420.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "200";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "240";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "230";
//			}
//
//		} else if (IF_10510.equals(serviceId) || IF_K10510.equals(serviceId)
//				|| IF_F10510.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "300";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "320";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "330";
//			}
//
//		} else if (IF_10520.equals(serviceId) || IF_K10520.equals(serviceId)
//				|| IF_F10520.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "300";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "340";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "330";
//			}
//
//		} else if (IS_20110.equals(serviceId) || IS_K20110.equals(serviceId)
//				|| IS_F20110.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "400";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "420";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "430";
//			}
//
//		} else if (IS_20210.equals(serviceId) || IS_K20210.equals(serviceId)
//				|| IS_F20210.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "400";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "450";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "430";
//			}
//
//		} else if (IF_10610.equals(serviceId) || IF_K10610.equals(serviceId)
//				|| IF_F10610.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "400";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "460";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "470";
//			}
//
//		} else if (IF_10620.equals(serviceId) || IF_K10620.equals(serviceId)
//				|| IF_F10620.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "400";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			// Add Start 20160222 CATPPS-944 �Ή��@T.Funao
//			if("05".equals(linkRequestInfoResult.getReceivingStep()) && cooperationSuccess){
//				/** ����̏ꍇ */
//				
//				transitionDestStatusCd = "465";
//			// Add End 20160222 CATPPS-944 �Ή��@T.Funao
//			} else if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "480";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "470";
//			}
//
//		} else if (IS_20410.equals(serviceId) || IS_K20410.equals(serviceId)
//				|| IS_F20410.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "500";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "520";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = null;
//			}
//
//		} else if (IF_10710.equals(serviceId) || IF_K10710.equals(serviceId)
//				|| IF_F10710.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "500";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "530";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "540";
//			}
//
//		} else if (IF_10720.equals(serviceId) || IF_K10720.equals(serviceId)
//				|| IF_F10720.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "500";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			// Add Start 20160222 CATPPS-944 �Ή��@T.Funao
//			if("05".equals(linkRequestInfoResult.getReceivingStep()) && cooperationSuccess){
//				/** ����̏ꍇ */
//				
//				transitionDestStatusCd = "535";
//			// Add End 20160222 CATPPS-944 �Ή��@T.Funao
//			} else if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "550";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "540";
//			}
//
//		} else if (IF_10910.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "600";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "620";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "630";
//			}
//
//		} else if (IF_10920.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "600";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "640";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "630";
//			}
//
//		} else if (IF_10810.equals(serviceId) || IF_K10810.equals(serviceId)
//				|| IF_F10810.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "700";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "720";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "730";
//			}
//
//		} else if (IF_10820.equals(serviceId) || IF_K10820.equals(serviceId)
//				|| IF_F10820.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "700";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "740";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "730";
//			}
//
//		} else if (IF_10210.equals(serviceId) || IF_K10210.equals(serviceId)) {
//			/**
//			 * �g�p�ʏ��Ɖ�\��(�ሳ) �g�p�ʏ��Ɖ�\��(����(500kw����))
//			 */
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "800";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "830";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "840";
//			}
//		} else if (IF_10220.equals(serviceId) || IF_K10220.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "800";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "860";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "840";
//			}
//
//		} else if (IF_10310.equals(serviceId) || IF_K10310.equals(serviceId)) {
//
//			// ���ރR�[�h��ݒ�
//			classificationCd = "800";
//
//			// �A�g���ۂ𔻒f���A�J�ڐ�X�e�[�^�X�R�[�h��ݒ肷��
//			if (cooperationSuccess) {
//				/** ����̏ꍇ */
//
//				transitionDestStatusCd = "880";
//			} else {
//				/** �ُ�̏ꍇ */
//
//				transitionDestStatusCd = "840";
//			}
//
//		}

//		// ���ރR�[�h�ƃX�e�[�^�X�R�[�h���擾�ł����ꍇ
//		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusKindCode() != null
//				&& linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusCode() != null) {
		String statusKindCode = null;
		String statusCode = null;
		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusKindCode() != null)
			statusKindCode = linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusKindCode().toString();
		if (linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusCode() != null)
			statusCode = linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().getStatusCode().toString();
		// �X�C�b�`���O�X�e�[�^�X�̍X�V
		this.updateSwitchingStatus(principal, stationCd, linkRequestInfoResult,
				statusKindCode,
				statusCode);
//		}
		// Change End CATPPS-1364 A.Miyakawa
	}
	
	/**
	 * �X�C�b�`���O�g�����ڃ��X�g���w�肵���L�[���[�h���i�[���郌�R�[�h��ԋp���܂��B
	 * 
	 * @param entityList
	 *            �X�C�b�`���O�g�����ڃ��X�g
	 * @param keyword
	 *            �w�肷��f�[�^���ږ�
	 * @return �X�C�b�`���O�g�����ڏ��
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
	 * �d�͌_�����ݒ肷��
	 * @param electricResult �_��d�͏��
	 * @param contractInfoResult �_����
	 */
	private void setEleContractInfo(GetElectricPowerContractInfoResult electricResult, GetSwitchingContractInfoResult contractInfoResult) {
		
		// �ǃR�[�h
		electricResult.setStationCd(contractInfoResult.getStationCd());
		// �ڋq�R�[�h
		electricResult.setCustomerCd(contractInfoResult.getCustomerCd());
		// �A��
		electricResult.setSeqNo(contractInfoResult.getSeqNo());
		// �n�_����ԍ�
		electricResult.setPointIdentificationNumber(contractInfoResult.getPointIdentificationNumber());
		// �ڑ��J�n�\���
		electricResult.setTransportaionScheduledStartDate(contractInfoResult.getTransportaionScheduledStartDate());
		// �ڑ��p�~�\���
		electricResult.setTransportaionScheduledEndDate(contractInfoResult.getTransportaionScheduledEndDate());
		// ���������Ǝ҃R�[�h
		electricResult.setOldCompanyCd(contractInfoResult.getOldCompanyCd());
		// ���������Ƃ��q�l�ԍ�
		electricResult.setOldCompanyCustomerCd(contractInfoResult.getOldCompanyCustomerCd());
		// �����񊼋K��Ɋ�Â����珳��
		electricResult.setAgreement(contractInfoResult.getAgreement());
		// �ݔ����ύX�L���敪
		electricResult.setFacilityInfoChangedClass(contractInfoResult.getFacilityInfoChangedClass());
		//  �ݔ��P����
		electricResult.setFacilityRemovalDate(contractInfoResult.getFacilityRemovalDate());
		// �{�H��]����
		electricResult.setConstructionScheduledTime(contractInfoResult.getConstructionScheduledTime());
		// �����
		electricResult.setOnSiteWitnessing(contractInfoResult.getOnSiteWitnessing());
		// �����]��
		electricResult.setOnSiteWitnessingPreferredDate(contractInfoResult.getOnSiteWitnessingPreferredDate());
		// �����]����
		electricResult.setOnSiteWitnessingPreferredTime(contractInfoResult.getOnSiteWitnessingPreferredTime());
		// ����Ҏ���
		electricResult.setWitness(contractInfoResult.getWitness());
		// �ڑ����d�T�[�r�X���j���[
		electricResult.setPowerTransmissionServiceMenu(contractInfoResult.getPowerTransmissionServiceMenu());
		// �_�񌈒���@
		electricResult.setContractDeterminationMethod(contractInfoResult.getContractDeterminationMethod());
		// �p�~���R
		electricResult.setAbolitionReason(contractInfoResult.getAbolitionReason());
		// ������̗L��
		electricResult.setBuildingDemolition(contractInfoResult.getBuildingDemolition());
		// ��̗\���
		electricResult.setDemolitionScheduledDate(contractInfoResult.getDemolitionScheduledDate());
		// ��̗\�莞��
		electricResult.setDemolitionScheduledTime(contractInfoResult.getDemolitionScheduledTime());
		// �����\�莞��
		electricResult.setMovingInScheduledTime(contractInfoResult.getMovingInScheduledTime());
		// �_��ύX�\��N����
		electricResult.setContractChangeScheduledDate(contractInfoResult.getContractChangeScheduledDate());
		// �_��d����]
		electricResult.setDesiredContractCurrent(contractInfoResult.getDesiredContractCurrent());
		// �o���O�A���v��
		electricResult.setContactNecessity(contractInfoResult.getContactNecessity());
		// ���j���̑I��
		electricResult.setMeterReadingDay(contractInfoResult.getMeterReadingDay());
		// �����]�����i�A���y�A�ύX�j
		electricResult.setAmpsWitnessingPreferredTime(contractInfoResult.getWitnessDesiredTime());
		
	} 
	
	/**
	 * �Ώۂ�NULL�܂��́A�󔒂̏ꍇ�ANULL��ԋp����B
	 * ����ȊO�̏ꍇ�ABigDecimal�ɕϊ����l��ԋp����B
	 * @param target �Ώ�
	 * @return �Ώےl
     */
	private BigDecimal acquiredDataChk(Integer target) {
    	
    	if (target == null) {
    		return null;
    	} else {
    		return new BigDecimal(target);
    	}
    }
	
	/**
	 * �X�C�b�`���O�A�g��t���b�Z�[�W�쐬(�p�~�掟)
	 * @param principal �v�����V�p��
	 * @param insertedTE79EntityModels UI�݌v�i�o�͕ҏW�d�l) No.19�Őݒ肵���A�g�Ǘ����
	 * @param models ��t���b�Z�[�W���
	 */
	private void insertTE7B(CatyPrincipal principal, List<Te79EntityModel> insertedTE79EntityModels, List<Te7bEntityModel> models) {
		for (Te79EntityModel te79Model : insertedTE79EntityModels) {
			// Change Start CATPPS-1364 �Ή� A.Miyakawa
			if (models != null) {
				if (!models.isEmpty()) {
					// TE7B�̃f�[�^���폜����
					// �ꌏ�ڂ��擾
					Te7bEntityModel entity = models.get(0);
					deleteTe7bModels(principal, entity.getTe7b001(), te79Model.getTe79002(), te79Model.getTe79003());
				}
			}
			// Change End CATPPS-1364 �Ή� A.Miyakawa
			for (Te7bEntityModel model : models) {
				model.setTe7b002(te79Model.getTe79002());	// UI�݌v�i�o�͕ҏW�d�l) No.19�Őݒ肵���A�g�ԍ�
				model.setTe7b003(te79Model.getTe79003());	// UI�݌v�i�o�͕ҏW�d�l) No.19�Őݒ肵���A�g�ԍ��A��
				// Change Start CATPPS-1101 �Ή��@A.Miyakawa
				try {
					Te7bEntityModel entity = getTe7bEntityDao().findByPrimaryKeyForUpdate(principal, model.getTe7b001(), model.getTe7b002(), model.getTe7b003(), model.getTe7b004());
					entity.setTe7b101(model.getTe7b101());
					entity.setTe7b102(model.getTe7b102());
					getTe7bEntityDao().update(principal, entity);
				} catch (EntityNotFoundException e) {
					getTe7bEntityDao().save(principal, model);
				}
				// Change end CATPPS-1101 �Ή��@A.Miyakawa
			}
		}
	}
	
	/**
	 * �X�C�b�`���O�A�g��t���b�Z�[�W�쐬
	 * @param catyPrincipal �v�����V�p��
	 * @param models ��t���b�Z�[�W���
	 */
	private void insertTE7B(CatyPrincipal principal, List<Te7bEntityModel> models) {
		// Change Start CATPPS-1364 �Ή� A.Miyakawa
		if (models != null) {
			if (!models.isEmpty()) {
				// TE7B�̃f�[�^���폜����
				// �ꌏ�ڂ��擾
				Te7bEntityModel entity = models.get(0);
				deleteTe7bModels(principal, entity.getTe7b001(), entity.getTe7b002(), entity.getTe7b003());
			}
		}
		// Change End CATPPS-1364 �Ή� A.Miyakawa
		for (Te7bEntityModel model : models) {
			// Change Start CATPPS-1101 �Ή��@A.Miyakawa
			try {
				Te7bEntityModel entity = getTe7bEntityDao().findByPrimaryKeyForUpdate(principal, model.getTe7b001(), model.getTe7b002(), model.getTe7b003(), model.getTe7b004());
				entity.setTe7b101(model.getTe7b101());
				entity.setTe7b102(model.getTe7b102());
				getTe7bEntityDao().update(principal, entity);
			} catch (EntityNotFoundException e) {
				getTe7bEntityDao().save(principal, model);
			}
			// Change end CATPPS-1101 �Ή��@A.Miyakawa
		}
	}

	/**
	 * �X�C�b�`���O�A�g��t���b�Z�[�W�폜
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
				// �Ȃɂ����Ȃ�
			}
		}
		
	}

	@Override
	public LinkRequestInfoResult linkSwitchingSupportSystemErrorProcessing(
			CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) {
		
		// �A�g���ʔ���
		setProccesingStatus(catyPrincipal, stationCd, linkRequestInfoResult);
		
		// ��t���b�Z�[�W�ɃG���[��o�^
		linkRequestInfoResult.setTe7bEntityModelList(getTe7bModelsForInternalError(linkRequestInfoResult));
		
		// �A�g�X�e�[�^�X�X�V����
		this.updateCooperationStatus(catyPrincipal, stationCd,
				linkRequestInfoResult, false);
		
		// �X�C�b�`���O�A�g�Ǘ��X�V���X�V����
		try {
			this.updateTe79Info(catyPrincipal,stationCd,
					linkRequestInfoResult);
		} catch (EntityNotFoundException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
		// �A�g���s��������
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
	 * �A���[�g�s�v�ȃ��b�Z�[�W���܂܂�Ă��邩�`�F�b�N������
	 * @param catyPrincipal
	 * @param stationCd
	 * @param linkRequestInfoResult
	 */
	private void checkNoAlartMsg(CatyPrincipal catyPrincipal, String stationCd,
			LinkRequestInfoResult linkRequestInfoResult) {
		
		// �A���[�g���o�͂��Ȃ��ꍇ�͏��������Ȃ��B
		if (!linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().isBatchResultFlag()) {
			return;
		}
		
		// �T�[�r�XID���Ȃ��ꍇ���������Ȃ��B
		if (StringUtils.isEmpty(linkRequestInfoResult.getServiceId())) {
			return;
		}
		
		// �A���[�g�o�͑ΏۊO�̃G���[���b�Z�[�WID���擾����
		List<Tpe7EntityModel> tpe7EntityModelList = getTpe7EntityDao()
				.getDisplayConfigMasterList(catyPrincipal, stationCd,
						"SXA0023", "NO_WARN_ERROR_CODE", linkRequestInfoResult.getServiceId());
		
		// �擾�ł��Ȃ��ꍇ�͏��������Ȃ��B
		if (tpe7EntityModelList == null) {
			return;
		}
		
		// OCCTO����̃G���[���b�Z�[�WID���擾
		List<String> errorMsgList = getErrorMsgIdList(linkRequestInfoResult.getTe7bEntityModelList());
		
		// �擾�ł��Ȃ��ꍇ�͏��������Ȃ��B
		if (errorMsgList == null) {
			return;
		}
		
		// �A���[�g���o�͂���ׂ��G���[���b�Z�[�W���ݒ肳��Ă���ꍇ�AResultList�ɓ����
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
		
		// �A���[�g���o�͂���ׂ��G���[���b�Z�[�W���ݒ肳��Ă��Ȃ��ꍇ�A�A���[�g�t���O��false�ɂ���
		if (resutlList.size() < 1) {
			linkRequestInfoResult.getSwitchingUpdateAndAlartStatus().setBatchResultFlag(false);
		}
		
	}

	/**
	 * ��t���b�Z�[�W����G���[�敪�����擾����
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
	 * ��t���b�Z�[�W�e�[�u���ɐݒ肷��l���擾����B
	 * �����G���[���i�[����ꍇ�̂ݎg�p
	 * @param stationCd �ǃR�[�h
	 * @param renKeiNum �A�g�ԍ� (FK)
	 * @param renKeiSerialNum �A�g�ԍ��A�� (FK)
	 * @param cmnServiceImpl ���X�|���X���
	 * @return ��t���b�Z�[�W���f�����X�g
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
			
			// �\���nIF�̏ꍇ
			// �ǃR�[�h
			stationCd = result.getStationCd();
			// �A�g�ԍ�
			renkeiNum = result.getRenKeiNum();
			// �A�g�ԍ��A��
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
			//�����󋵊m�FIF�̏ꍇ
			
			if ( result.getTe79EntityMode() != null ) {
				// �ǃR�[�h
				stationCd = result.getTe79EntityMode().getTe79001();
				// �A�g�ԍ�
				renkeiNum = result.getTe79EntityMode().getTe79002();
				// �A�g�ԍ��A��
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
		model.setTe7b001(stationCd);										// �ǃR�[�h
		model.setTe7b002(renkeiNum);										// �A�g�ԍ� (FK)
		model.setTe7b003(renkeiSerialNum);									// �A�g�ԍ��A�� (FK)
		model.setTe7b004(new BigDecimal(seq));					// �A�g��t���b�Z�[�W�A��
		model.setTe7b101(messageDiv);		// ��t���b�Z�[�W�敪
		model.setTe7b102(MessageUtils.getMessage(result.getErrorMsgId()));	// ��t���b�Z�[�W
		
		te7bEntityModels.add(model);
		
		return te7bEntityModels;
	}
	// Change Start CATPPS-1364 �Ή� A.Miyakawa
}