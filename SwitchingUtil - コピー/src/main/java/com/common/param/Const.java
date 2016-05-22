package com.common.param;


import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

/**
 * �萔���`�����C���^�t�F�[�X�ł��B
 * @author EC-One, Inc.
 */
public interface Const {

	// �Ƃ肠����
	public static final String REGISTER_ERROR = "�o�^�G���[";
	public static final String GET_ERROR = "�擾�G���[";
	public static final String CONTROL_ERROR = "����G���[";
	public static final String ERROR_MIKEIYAKU = "���_��҂ł�";
	public static final String ENTRY_OK = "����";
	public static final String ENTRY_NG = "�ُ�";

	public static final String REGIST = "1";
	public static final String DELETE = "2";
	
	
	// �@�퐧��
	/** ���䌋��:���� */
	public static final String EQP_CTRL_RESULT_OK = "1";
	/** ���䌋��:�ُ� */
	public static final String EQP_CTRL_RESULT_NG = "2";
	/** ���䌋��:�ΏۊO */
	public static final String EQP_CTRL_RESULT_NONE = "3";

	// �D��t���O
	/** �D��t���O:���A�� */
	public static final String EQP_CTRL_TYPE_REAL = "0";
	/** �D��t���O:�o�b�` */
	public static final String EQP_CTRL_TYPE_BATCH = "1";
	
	// ����Ώ�
	/** ����Ώ�:�������� */
	public static final String EQP_CTRL_TARGET_AUDIENCE = "101";
	/** ����Ώ�:BACC���f�����x���� */
	public static final String EQP_CTRL_TARGET_BACC_MODEM = "201";
//Add Start 2014/05/08 Mabuchi ��_�Ή�
	/** ����Ώ�:�@�퐧��*/
	public static final String EQP_CTRL_TARGET_EQUIPMENT = "301";
//Add End 2014/05/08 Mabuchi ��_�Ή�
	
	// HE�R�[�h
	/** HE�R�[�h:�����f�W�^�� */
	public static final String EQP_CTRL_HE_CD_PANASONIC = "0110";
	/** HE�R�[�h:�p�C�I�j�A�f�W�^�� */
	public static final String EQP_CTRL_HE_CD_PIONEER = "0610";
	/** HE�R�[�h:JC-HITS */
	public static final String EQP_CTRL_HE_CD_JCHITS = "0701";
	/** HE�R�[�h:���f�� */
	public static final String EQP_CTRL_HE_CD_MODEM = "0801";
//Add Start 2014/05/09 Mabuchi ��_�Ή�
	/** HE�R�[�h:TimsNet */
	public static final String EQP_CTRL_HE_CD_TIMSNET = "0810";
	/** HE�R�[�h:AG-Manager */
	public static final String EQP_CTRL_HE_CD_AGMANAGER = "0820";
	/** HE�R�[�h:�~�n�� */
	public static final String EQP_CTRL_HE_CD_MIHARU = "0901";
//Add End 2014/05/09 Mabuchi ��_�Ή�
//Add Start 2014/06/12 Mabuchi ��_�Ή�
	/** HE�R�[�h:�V���N���C�A */
	public static final String EQP_CTRL_HE_CD_SYNCLAYER = "0821";
	/** HE�R�[�h:���{�A���e�i */
	public static final String EQP_CTRL_HE_CD_NIPPON_ANTENNA = "0902";
//Add End 2014/06/12 Mabuchi ��_�Ή�

	/** ����G���A:JC-HITS */
	public static final String EQP_CTRL_CONTROL_AREA_JCHITS = "000000";
	
	// �������[�h
	/** �������[�h:�@��o�^ */
	public static final String EQP_CTRL_MODE_EQP_REGIST = "101";
	/** �������[�h:�@��폜 */
	public static final String EQP_CTRL_MODE_EQP_DELETE = "102";
	/** �������[�h:�ύX���� */
	public static final String EQP_CTRL_MODE_CHANGE_CTRL = "103";
	/** �������[�h:�@��ύX */
	public static final String EQP_CTRL_MODE_EQP_CHANGE = "104";
	/** �������[�h:�@��ύX(�P�����䖳��) */
	public static final String EQP_CTRL_MODE_EQP_CHANGE_NON_REMOVE = "105";
	/** �������[�h:JC-HITS:�J�[�h�o�^ */
	public static final String EQP_CTRL_MODE_JCHITS_REGISTER = "209";
	/** �������[�h:JC-HITS:�J�[�h�폜 */
	public static final String EQP_CTRL_MODE_JCHITS_DELETE = "210";
	/** �������[�h:JC-HITS:���^�p */
	public static final String EQP_CTRL_MODE_JCHITS_KARI = "201";
	/** �������[�h:JC-HITS:�ė��p�� */
	public static final String EQP_CTRL_MODE_JCHITS_RECYCLE = "202";
	/** �������[�h:JC-HITS:�x�~/�ĊJ */
	public static final String EQP_CTRL_MODE_JCHITS_STOP = "203";
	/** �������[�h:JC-HITS:��� */
	public static final String EQP_CTRL_MODE_JCHITS_KAIYAKU = "204";
	/** �������[�h:JC-HITS:���^�p��� */
	public static final String EQP_CTRL_MODE_JCHITS_KARITORI = "205";
	/** �������[�h:JC-HITS:���đ� */
	public static final String EQP_CTRL_MODE_JCHITS_ALL_CONTROL = "206";
	/** �������[�h:JC-HITS:�w�萧�� */
	public static final String EQP_CTRL_MODE_JCHITS_CAS_CTRL = "207";
	/** �������[�h:JC-HITS:�p�X���[�h�N���A */
	public static final String EQP_CTRL_MODE_JCHITS_PWD_CLEAR = "208";
	/** �������[�h:���f��:���f���w�萧�� */
	public static final String EQP_CTRL_MODE_MODEM_CTRL = "301";
	/** �������[�h:STB���o�^�i�V�K�j */
	public static final String EQP_CTRL_MODE_STB_REGIST = "401";
	/** �������[�h:STB���o�^�i�ēo�^�j */
	public static final String EQP_CTRL_MODE_STB_REREGIST = "402";
	/** �������[�h:STB���o�^�i�o�^�����j */
	public static final String EQP_CTRL_MODE_STB_UNREGIST = "403";
	/** �������[�h:�P���㏈��STB */
	public static final String EQP_CTRL_MODE_STB_AFTER_REMOVE_STB = "404";
	/** �������[�h:�P���㏈��CAS */
	public static final String EQP_CTRL_MODE_STB_AFTER_REMOVE_CAS = "405";
	/** �������[�h:���ڐ��� */
	public static final String EQP_CTRL_MODE_STB_DIRECT = "406";
	/** �������[�h:STB�O���[�v�o�^ */
	public static final String EQP_CTRL_MODE_STB_REGIST_GROUP = "407";
	/** �������[�h:���b�Z�[�W�o�^�E�ύX */
	public static final String EQP_CTRL_MODE_STB_MESSAGE = "408";
	/** �������[�h:���b�Z�[�W���M��~ */
	public static final String EQP_CTRL_MODE_STB_STOP_MESSAGE = "409";
	/** �������[�h:�S�����M���� */
	public static final String EQP_CTRL_MODE_STB_SEND_ALL = "410";
	/** �������[�h:�Z���N�g���M */
	public static final String EQP_CTRL_MODE_STB_SEND_SELECT = "411";
//Add Start 2014/05/09 Mabuchi ��_�Ή�
	/** �������[�h:���ڐ���(CM,D-ONU,V-ONU) */
	public static final String EQP_CTRL_MODE_DIRECT_CTRL = "501";
//Add End 2014/05/09 Mabuchi ��_�Ή�
	
	// �����敪
	/** �����敪:�_����e�ɂ���Ď������� */
	public static final BigDecimal EQP_CTRL_PROC_CONTROL_CONTRACT = new BigDecimal("2");
	/** �����敪:�ݒu */
	public static final BigDecimal EQP_CTRL_PROC_SETTING = new BigDecimal("5");
	/** �����敪:�_����e�ɂ���Ď�������i�������M�j */
	public static final BigDecimal EQP_CTRL_PROC_CONTROL_CONTRACT_COMPEL = new BigDecimal("7");
	/** �����敪:STB�P�� */
	public static final BigDecimal EQP_CTRL_PROC_STB_REMOVE = new BigDecimal("9");
	/** �����敪:STB���o�^�i�V�K�j */
	public static final BigDecimal EQP_CTRL_PROC_STB_REGISTER_NEW = new BigDecimal("10");
	/** �����敪:STB���o�^�i�o�^�����j */
	public static final BigDecimal EQP_CTRL_PROC_STB_REGISTER_CANCEL = new BigDecimal("11");
	/** �����敪:�������̐ݒu */
	public static final BigDecimal EQP_CTRL_PROC_SETTING_EXCHANGE = new BigDecimal("12");
	/** �����敪:STB�������̓P�� */
	public static final BigDecimal EQP_CTRL_PROC_STB_REMOVE_EXCHANGE = new BigDecimal("14");
	/** �����敪:CAS�J�[�h���� */
	public static final BigDecimal EQP_CTRL_PROC_CAS_EXCHANGE = new BigDecimal("15");
	/** �����敪:�P���R�[�h�Q��莋������i�������M�j */
	public static final BigDecimal EQP_CTRL_PROC_CONTROL_COST = new BigDecimal("16");
	/** �����敪:�J�[�h�o�^ */
	public static final BigDecimal EQP_CTRL_PROC_CARD_REGISTER = new BigDecimal("31");
	/** �����敪:STB�P���� C-CAS�N���A */
	public static final BigDecimal EQP_CTRL_PROC_CAS_CLEAR = new BigDecimal("35");
	/** �����敪:�J�[�h�폜 */
	public static final BigDecimal EQP_CTRL_PROC_CARD_DELETE = new BigDecimal("39");
	/** �����敪:STB���� */
	public static final BigDecimal EQP_CTRL_PROC_STB_SP = new BigDecimal("54");
	/** �����敪:JC-HITS��p */
	public static final BigDecimal EQP_CTRL_PROC_JCHITS = new BigDecimal("55");
	/** �����敪:���f����p */
	public static final BigDecimal EQP_CTRL_PROC_MODEM = new BigDecimal("60");
	
	// ���ꏈ���敪
	/** ���ꏈ���敪:�Ȃ� */
	public static final BigDecimal EQP_CTRL_SP_PROC_NONE = BigDecimal.ZERO;
	/** ���ꏈ���敪:JC-HITS:���^�p */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_KARI = new BigDecimal("1");
	/** ���ꏈ���敪:JC-HITS:�ė��p�� */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_RECYCLE = new BigDecimal("2");
	/** ���ꏈ���敪:JC-HITS:�x�~/�ĊJ */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_STOP = new BigDecimal("4");
	/** ���ꏈ���敪:JC-HITS:��� */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_KAIYAKU = new BigDecimal("5");
	/** ���ꏈ���敪:JC-HITS:���� */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_EXCHANGE = new BigDecimal("6");
	/** ���ꏈ���敪:JC-HITS:���^�p��� */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_KARITORI = new BigDecimal("7");
	/** ���ꏈ���敪:JC-HITS:�ύX���� */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_CONTROL = new BigDecimal("11");
	/** ���ꏈ���敪:JC-HITS:���đ� */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_ALL_CONTROL = new BigDecimal("13");
	/** ���ꏈ���敪:JC-HITS:�w�萧�� */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_TARGET_CONTROL = new BigDecimal("20");
	/** ���ꏈ���敪:JC-HITS:�p�X���[�h�N���A */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_PWD_CLEAR = new BigDecimal("90");
	/** ���ꏈ���敪:JC-HITS:�o�^ */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_REGISTER = new BigDecimal("91");
	/** ���ꏈ���敪:JC-HITS:�폜 */
	public static final BigDecimal EQP_CTRL_SP_PROC_JCHITS_DELETE = new BigDecimal("92");
	/** ���ꏈ���敪:���f��:���f���w�萧�� */
	public static final BigDecimal EQP_CTRL_SP_PROC_MODEM = new BigDecimal("1");
	// ���ꏈ���敪PANASONIC
	/** ���ꏈ���敪:PANASONIC:�N���A */
	public static final BigDecimal EQP_CTRL_SP_PROC_CLEAR = new BigDecimal("9");
	/** ���ꏈ���敪:PANASONIC:���b�Z�[�W��~ */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_STOP_MSG = new BigDecimal("19");
	/** ���ꏈ���敪:PANASONIC:�w�萧�� */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_TARGET_CONTROL = new BigDecimal("20");
	/** ���ꏈ���敪:PANASONIC:�ēo�^ */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_REREGIST = new BigDecimal("21");
	/** ���ꏈ���敪:PANASONIC:���b�Z�[�W�o�^ */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_REGIST_MSG = new BigDecimal("22");
	/** ���ꏈ���敪:PANASONIC:�đ��M */
	public static final BigDecimal EQP_CTRL_SP_PROC_PANA_RESEND = new BigDecimal("23");
	
	// �J�E���^�[(T054)
	public static final BigDecimal COUNTER_STB = new BigDecimal("04");
	public static final BigDecimal COUNTER_MODEM = new BigDecimal("05");
	public static final BigDecimal COUNTER_TA = new BigDecimal("19");
//Add Start 2014/05/08 Mabuchi ��_�Ή�
	public static final BigDecimal COUNTER_VONU = new BigDecimal("37");
//Add End 2014/05/08 Mabuchi ��_�Ή�
	
	// �Ǘ��X�e�[�^�X
	/** �V�i�݌� */
	public static final String EQUIPMENT_STATUS_NEW = "090001";
	/** ���Í݌� */
	public static final String EQUIPMENT_STATUS_OLD = "090002";
	/** �ڋq�g�p�� */
	public static final String EQUIPMENT_STATUS_USE = "090003";
	/** ���|�� */
	public static final String EQUIPMENT_STATUS_CLN = "090004";
	/** �̏ᒆ */
	public static final String EQUIPMENT_STATUS_RPR = "090005";
	/** ���[�X���E�j�� */
	public static final String EQUIPMENT_STATUS_DEL = "090006";
	/** �s���E���̑� */
	public static final String EQUIPMENT_STATUS_ETC = "090007";
	// TA�p
	/** TA�F�ݒu�O */
	public static final String EQUIPMENT_STATUS_TA_STC = "160001";
	/** TA�F�ڋq�g�p�� */
	public static final String EQUIPMENT_STATUS_TA_USE = "160002";
	/** TA�F�j�� */
	public static final String EQUIPMENT_STATUS_TA_DEL = "160003";
	/** TA�F���̑� */
	public static final String EQUIPMENT_STATUS_TA_ETC = "160004";
	/** TA�F�̏ᒆ */
	public static final String EQUIPMENT_STATUS_TA_RPR = "160005";
	// CAS�p
	/** CAS�F�V�i�݌� */
	public static final String EQUIPMENT_STATUS_CAS_NEW = "140001";
	/** CAS�F���Í݌� */
	public static final String EQUIPMENT_STATUS_CAS_OLD = "140002";
	/** CAS�F�r�s�a�����N�� */
	public static final String EQUIPMENT_STATUS_CAS_LNK = "140003";
	/** CAS�F���[�X���E�j�� */
	public static final String EQUIPMENT_STATUS_CAS_DEL = "140004";
	/** CAS�F�s���E���̑� */
	public static final String EQUIPMENT_STATUS_CAS_ETC = "140005";

	// JC-HITS�X�e�[�^�X
	/** ���� */
	public static final BigDecimal JCHITS_STATUS_SYOKI = new BigDecimal("0");
	/** ���^�p */
	public static final BigDecimal JCHITS_STATUS_KARI = new BigDecimal("1");
	/** �{�^�p */
	public static final BigDecimal JCHITS_STATUS_HON = new BigDecimal("2");
	/** ��� */
	public static final BigDecimal JCHITS_STATUS_KAIYAKU = new BigDecimal("3");
	/** �x�~ */
	public static final BigDecimal JCHITS_STATUS_KYUUSI = new BigDecimal("4");
	/** ���o�^ */
	public static final BigDecimal JCHITS_STATUS_NONE = new BigDecimal("9");

	// JC-HITS�X�e�[�^�X�ύX�����敪
	/** ���^�p */
	public static final String JCHITS_PROC_DIV_KARI = "1";
	/** �ė��p */
	public static final String JCHITS_PROC_DIV_SAI = "2";
	/** ��� */
	public static final String JCHITS_PROC_DIV_KAI = "3";
	/** �p�X���[�h�N���A */
	public static final String JCHITS_PROC_DIV_PWDCLR = "4";
	/** �ύX */
	public static final String JCHITS_PROC_DIV_UPDATE = "5";
	/** �o�^ */
	public static final String JCHITS_PROC_DIV_REGISTER = "6";
	/** �폜 */
	public static final String JCHITS_PROC_DIV_DELETE = "7";
	
	// JC-HITS
	/** �e���R���^�[�� */
	public static final BigDecimal JCHITS_VIEWLOG_TELECO = new BigDecimal("0");
	/** RF���^�[�� */
	public static final BigDecimal JCHITS_VIEWLOG_RF = new BigDecimal("1");
	
	/** ���ڐ��䏈���敪�F�Ïؔԍ��N���A*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_PASSWORD_CLEAR = new BigDecimal(1);
	/** ���ڐ��䏈���敪�F�ݒu�H���҂����*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_CANCEL_SETTING_CONSTRUCT = new BigDecimal(2);
	/** ���ڐ��䏈���敪�FSTB�o�^*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_STB_REGIST = new BigDecimal(3);
	/** ���ڐ��䏈���敪�F�ݒu*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_SETTING = new BigDecimal(4);
	/** ���ڐ��䏈���敪�F�P��*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_REMOVE = new BigDecimal(5);
	/** ���ڐ��䏈���敪�FSTB����*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_STB_DELETE = new BigDecimal(6);
	/** ���ڐ��䏈���敪�F�[��������*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_INITALIZE = new BigDecimal(7);
	/** ���ڐ��䏈���敪�FSTB����*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_STB_CONTROL = new BigDecimal(8);
	/** ���ڐ��䏈���敪�F�ēo�^*/
	public static final BigDecimal EQP_CTRL_DIRECT_MODE_RE_REGIST = new BigDecimal(9);
	
	/** �p�C�I�j�A�f�W�^�����ꏈ���F�{�^�p�����[�h�o�^*/
	public static final BigDecimal EQP_CTRL_PIONEER_SPECIAL_REGIST_NORMAL_MODE = new BigDecimal(1);
	/** �p�C�I�j�A�f�W�^�����ꏈ���F�ݒu�H���҂����[�h�o�^*/
	public static final BigDecimal EQP_CTRL_PIONEER_SPECIAL_REGIST_CONSTRUCT_MODE = new BigDecimal(2);
	
	/** �p�i�\�j�b�N�f�W�^�����ꏈ���F�_�񑗐M*/
	public static final BigDecimal EQP_CTRL_PANASONIC_SPECIAL_SEND_PROMISE = new BigDecimal(1);
	/** �p�i�\�j�b�N�f�W�^�����ꏈ���F���ԉ���*/
	public static final BigDecimal EQP_CTRL_PANASONIC_SPECIAL_EXTEND_TERM = new BigDecimal(2);

	// �@����	
	// TP41
	/** TP41�F�@���� */
	public static final BigDecimal TP41_EQUIPMENT_TYPE_DEFAULT= new BigDecimal("0");
	/** TP41�F�@���ʁFHT */
	public static final BigDecimal EQUIPMENT_TYPE_HT		= new BigDecimal("1");
//Change Start 2014/04/18 kando JIRA:CATFNL-1375
	/** �@���ʁFSTB */
	public static final BigDecimal EQUIPMENT_TYPE_STB		= new BigDecimal("1");
	/** �@���ʁFBCAS */
	public static final BigDecimal EQUIPMENT_TYPE_BCAS	= new BigDecimal("2");
	/** �@���ʁFCCAS */
	public static final BigDecimal EQUIPMENT_TYPE_CCAS	= new BigDecimal("5");
	/** �@���ʁF���f�� */
	public static final BigDecimal EQUIPMENT_TYPE_MODEM	= new BigDecimal("3");
	/** �@���ʁFTA */
	public static final BigDecimal EQUIPMENT_TYPE_TA		= new BigDecimal("4");
//	/** TP41�F�@���ʁFSTB */
//	public static final BigDecimal EQUIPMENT_TYPE_STB		= new BigDecimal("2");
//	/** TP41�F�@���ʁFBCAS */
//	public static final BigDecimal EQUIPMENT_TYPE_BCAS	= new BigDecimal("3");
//	/** TP41�F�@���ʁFCCAS */
//	public static final BigDecimal EQUIPMENT_TYPE_CCAS	= new BigDecimal("4");
//	/** TP41�F�@���ʁF���f�� */
//	public static final BigDecimal EQUIPMENT_TYPE_MODEM	= new BigDecimal("5");
//	/** TP41�F�@���ʁFTA */
//	public static final BigDecimal EQUIPMENT_TYPE_TA		= new BigDecimal("6");
//Change End 2014/04/18 kando JIRA:CATFNL-1375
//Add Start 2014/05/08 Mabuchi ��_�Ή�
	/** �@���ʁFV-ONU */
	public static final BigDecimal EQUIPMENT_TYPE_VONU		= new BigDecimal("6");
	/** �@���ʁFD-ONU */
	public static final BigDecimal EQUIPMENT_TYPE_DONU		= new BigDecimal("7");
	/** �@���ʁFHGW */
	public static final BigDecimal EQUIPMENT_TYPE_HGW		= new BigDecimal("8");
//Add End 2014/05/08 Mabuchi ��_�Ή�
	// T311
	/** T311�F�@���ʁFHT */
	public static final String T311_EQUIPMENT_TYPE_HT = "1";
	/** T311�F�@���ʁFSTB */
	public static final String T311_EQUIPMENT_TYPE_STB = "2";
	// T321
	/** T321�F�@���ʁFBCAS */
	public static final String T321_EQUIPMENT_TYPE_BCAS	= "1";
	/** T321�F�@���ʁFCCAS */
	public static final String T321_EQUIPMENT_TYPE_CCAS	= "2";
	// ������~�p
	/** �@���ʁFSTB */
	//public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_STB = "2";
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_STB = "1";
	// ��_�����J�X�^�}�C�Y 2014/05/23 kedd END
	/** �@���ʁF���f�� */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_MODEM = "3";
	/** �@���ʁFTA */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_TA = "4";
	/** �@���ʁFWiMAX */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_WiMAX = "5";
	// ��_�����J�X�^�}�C�Y 2014/05/23 kedd START
	/** �@���ʁFV-ONU */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_VONU = "6";
	/** �@���ʁFD-ONU */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_DONU = "7";
	/** �@���ʁFHGW */
	public static final String FORCED_SUSPEND_EQUIPMENT_TYPE_HGW = "8";
	// ��_�����J�X�^�}�C�Y 2014/05/23 kedd END
	// T116
	/** T116:�@���ʁFSTB */
	public static final BigDecimal T116_EQUIPMENT_TYPE_STB = new BigDecimal("1");
	/** T116:�@���ʁF���f���AWiMAX */
	public static final BigDecimal T116_EQUIPMENT_TYPE_MODEM = new BigDecimal("2");
	/** T116:�@���ʁFTA */
	public static final BigDecimal T116_EQUIPMENT_TYPE_TA = new BigDecimal("3");
	// TP86
	/** TP86:������ʁFSTB */
	public static final BigDecimal TP86_PROC_TYPE_STB = new BigDecimal("1");
	/** TP86:������ʁF���f���AWiMAX */
	public static final BigDecimal TP86_PROC_TYPE_MODEM = new BigDecimal("2");
	/** TP86:������ʁFEMTA */
	public static final BigDecimal TP86_PROC_TYPE_EMTA = new BigDecimal("3");
	// T201
	/** T201:�@���ʁFSTB */
	public static final BigDecimal T201_EQUIPMENT_TYPE_STB = new BigDecimal("1");
	/** T201:�@���ʁF���f�� */
	public static final BigDecimal T201_EQUIPMENT_TYPE_MODEM = new BigDecimal("2");
	/** T201:�@���ʁFTA */
	public static final BigDecimal T201_EQUIPMENT_TYPE_TA = new BigDecimal("3");
	
//Add Start 2014/06/05 Mabuchi ��_�Ή�
	/** �@��敪�FHGW */
	public static final String EQUIPMENT_MODEL_DIV_HGW		= "1";
	/** �@��敪�FWMTA */
	public static final String EQUIPMENT_MODEL_DIV_WMTA		= "2";
//Add End 2014/06/05 Mabuchi ��_�Ή�
	
	// �����敪
	/** �����敪�F1�F���� */
	public static final String CCAS_IN = "1";
	/** �����敪�F2�F����� */
	public static final String CCAS_OUT = "2";
	
	// ��̌^�t���O
	/** ��̌^�t���O�F��̌^ */
	public static final String UNION_ON = "1";
	/** ��̌^�t���O�F��̌^�łȂ� */
	public static final String UNION_OFF = "0";
	
	// �[���敪
	/** �[���敪�F�����^�� */
	public static final String TERMINAL_DIV_RENTAL = "0";
	/** �[���敪�F���� */
	public static final String TERMINAL_DIV_PURCHASE = "1";
	
	// �@��C�������敪
	/** �@��C�������敪:�C���˗� */
	public static final String REPAIR_PROC_DIV_REQUEST = "1";
	/** �@��C�������敪:�C������ */
	public static final String REPAIR_PROC_DIV_COMPLETE = "2";
	// �@�햕�������敪
	/** �@�햕�������敪:���� */
	public static final String DESTRUCTION_PROC_DIV_DESTRUCTION = "1";
	/** �@�햕�������敪:�s�� */
	public static final String DESTRUCTION_PROC_DIV_UNKNOWN = "2";
	/** �@�햕�������敪:��� */
	public static final String DESTRUCTION_PROC_DIV_CANCEL = "3";
	
	// ��~�敪
	/** ������~ */
	public static final BigDecimal SUSPEND_DIV_FORCED_SUSPEND = new BigDecimal("1");
	/** ��~ */
	public static final BigDecimal SUSPEND_DIV_STOP = new BigDecimal("2");
	/** �x�~ */
	public static final BigDecimal SUSPEND_DIV_SUSPEND = new BigDecimal("3");
	
	// ��~�敪
	/** ������~:�R�����g�R�[�h */
	public static final String TA31_SUSPEND_DIV_FORCED_SUSPEND = "1150011";
	/** ��~:�R�����g�R�[�h */
	public static final String TA31_SUSPEND_DIV_STOP = "1150013";
	
// Add start 2013/02/21 y.goto STITEC-5110
	/** TP36�P�������f������ۃt���O �� */
	public static final BigDecimal TP36_SETTING_OFF = BigDecimal.ZERO;
	/** TP36�P�������f������ۃt���O �� */
	public static final BigDecimal TP36_SETTING_ON  = BigDecimal.ONE;
	/** TP36�P�������f������ۃt���O �� */
	public static final BigDecimal TP36_REMOVE_OFF = BigDecimal.ZERO;
	/** TP36�P�������f������ۃt���O �� */
	public static final BigDecimal TP36_REMOVE_ON  = BigDecimal.ONE;
	/** T019STB�敪 0:�Е��� */
	public static final BigDecimal T019_KATAHOUKOU = BigDecimal.ZERO;
	/** T019STB�敪 1:�o���� */
	public static final BigDecimal T019_SOUHOUKOU  = BigDecimal.ONE;
// Add start 2012/11/08 y.goto STITEC-2033
	// Prov�A�g:RenkeiProcBizLogicImpl
	/** Prov�A�g�F�@��ύX:1 */
	public static final BigDecimal PROV_EQUIPMENT_CHANGE = new BigDecimal("1");
	/** Prov�A�g�F�@�����:2 */
	public static final BigDecimal PROV_EQUIPMENT_EXCHANGE = new BigDecimal("2");
	/** Prov�A�g�F�_��ύX:3 */
	public static final BigDecimal PROV_CONTRACT_CHANGE = new BigDecimal("3");
// Add end   2012/11/08 y.goto STITEC-2033
	
	// �f�t�H���g�l
	/** �ڋq��ԁF0�F���_�� */
	public static final String MIKEIYAKU  = "0";
	/** �X�֔ԍ� 7�� */
	public static final String DEFAULT_ZIP_NO = StringUtils.leftPad("", 7, "0");
	/** �o�[�W�����ԍ��F1 */
	public static final String DEFAULT_VERSION_NO = "1";
	/** �V�X�e���R�����g�R�[�h 6�� */
	public static final String DEFAULT_SYSTEM_COMMENT = StringUtils.leftPad("", 6, "0");
	/** ���[�U�R�����g�R�[�h 7�� */
	public static final String DEFAULT_USER_COMMENT = StringUtils.leftPad("", 7, "0");
	/** �R�����g�R�[�h 4�� */
	public static final String DEFAULT_COMMENT = StringUtils.leftPad("", 4, "0");
	/** �@��R�[�h�F8�� */
	public static final String DEFAULT_EQUIPMENT_ID = StringUtils.leftPad("", 8, "0");
	/** �J�[�hID�F20�� */
	public static final String DEFAULT_CARD_ID = StringUtils.leftPad("", 20, "0");
	/** �@��R�[�h�F2�� */
	public static final String DEFAULT_EQUIPMENT_MODEL = StringUtils.leftPad("", 2, "0");
	/** STBMAC�ECMMAC�E���{�[���F���p��12�� */
	public static final String DEFAULT_EQUIPMENT12 = StringUtils.leftPad("", 12, " ");
	/** �A�h���X�E�����ԍ��F���p��15�� */
	public static final String DEFAULT_EQUIPMENT15 = StringUtils.leftPad("", 15, " ");
	/** �Ǝ҃R�[�h�F6�� */
	public static final String DEFAULT_TRADER_CD = StringUtils.leftPad("", 6, "0");
	/** �Ј��R�[�h�F8�� */
	public static final String DEFAULT_EMPLOYEE_CD = StringUtils.leftPad("", 8, "0");
	/** �P���R�[�h�F8�� */
	public static final String DEFAULT_PRICE_CD = StringUtils.leftPad("", 6, "0");
	/** �ڋq�E�_��҃R�[�h�F10�� */
	public static final String DEFAULT_CUSTOMER_CD = StringUtils.leftPad("", 10, "0");
	/** �ڋq�E�_��҃R�[�h�F���p��10�� */
	public static final String DEFAULT_CUSTOMER_CD_SPACE = StringUtils.leftPad("", 10, " ");
	// CATFNL-2655 2014/10/02 Y.Fujino [Chg] Start
	/** ���[�X�ԍ��F20�� */
	public static final String DEFAULT_LEASE_NO = StringUtils.leftPad("", 20, " ");
//	public static final String DEFAULT_LEASE_NO = StringUtils.leftPad("", 20, "0");
	// CATFNL-2655 2014/10/02 Y.Fujino [Chg] End
	/** �ݒu�ꏊ�F�S�p��15���� */
	public static final String DEFAULT_SETTING_PLACE = StringUtils.leftPad("", 15, "�@");
	/** ���l�F�S�p��20���� */
	public static final String DEFAULT_REMARK_FULL20 = StringUtils.leftPad("", 20, "�@");
	/** ���l�F�S�p��30���� */
	public static final String DEFAULT_REMARK_FULL30 = StringUtils.leftPad("", 30, "�@");
	/** ���l�F���p��40���� */
	public static final String DEFAULT_REMARK_HALF40 = StringUtils.leftPad("", 40, " ");
	/** ���l�F���p��60���� */
	public static final String DEFAULT_REMARK_HALF60 = StringUtils.leftPad("", 60, " ");
	/** �X�VAPP�F���p��8���� */
	public static final String DEFAULT_UPDATE_APP = StringUtils.leftPad("", 8, " ");
	/** �t���O�F0 */
	public static final String DEFAULT_FLG = "0";
	/** ���i�F0 */
	public static final String DEFAULT_PRICE = "0";
	/** �񐔁F0 */
	public static final String DEFAULT_NUMBER = "0";
	/** �����R�[�h�F10�� */
	public static final String DEFAULT_HOUSE_CD = StringUtils.leftPad("", 10, "0");
	// T311
	/** ���̓��x���F0 */
	public static final String DEFAULT_INPUT_LEVEL = "0";
	// T316
	/** �O���[�vID�F8�� */
	public static final String DEFAULT_GROUP_ID = StringUtils.leftPad("", 8, "0");
	/** �l�b�g���[�N��ԁF0 */
	public static final String DEFAULT_NETWORK_STATE = "0";
	/** �\���F���p��8���� */
	public static final String DEFAULT_RESERVE = StringUtils.leftPad("", 8, " ");
	/** STB�敪�F0 */
	public static final String DEFAULT_STB_DIV = "0";
	/** �����X�V�F0 */
	public static final String DEFAULT_CYCLE = "0";
	// T331
	/** �Z���^�[���f���F���p��20���� */
	public static final String DEFAULT_CENTER_MODEM = StringUtils.leftPad("", 20, " ");
	//TP41
	/** ��ԁF1�F���� */
	public static final String STATUS_STOCK = "1";
// Add start 2013/03/15 y.goto STITEC-4418
	/** ��ԁF2�F�o�� */
	public static final String STATUS_OUTPUT = "2";
// Add end   2013/03/15 y.goto STITEC-4418
	/** �P���敪�F0 */
	public static final String DEFAULT_REMOVE_DIV = "0";
	/** ���茋�ʁF000 */
	public static final String DEFAULT_RESULT = "000";
	
// Add start 2012/12/14 y.goto STITEC-3379
	// T005�T�[�r�X����
// Add Start 2014/04/21 H.Matsuyama JIRA:CATFNL-1323
	/** 000�F�W�� */
	public static final String T005_SERVICE_TYPE_STANDARD = "000";
// Add End 2014/04/21 H.Matsuyama JIRA:CATFNL-1323
	/** 001�FTV */
	public static final String T005_SERVICE_TYPE_TV = "001";
	/** 002�FNET */
	public static final String T005_SERVICE_TYPE_NET = "002";
	/** 003�FKDDI */
	public static final String T005_SERVICE_TYPE_KDDI = "003";
	/** 004�FNHK */
	public static final String T005_SERVICE_TYPE_NHK = "004";
	/** 005�F�ꎞ�� */
	public static final String T005_SERVICE_TYPE_LUMPSUM = "005";
	/** 009�F���̑� */
	public static final String T005_SERVICE_TYPE_OTHER = "009";
// Add end   2012/12/14 y.goto STITEC-3379
// CATFNL-3635 2015.05.13 [Add] �K�C�h�ǉ� START
	/** 006�F�K�C�h */
	public static final String T005_SERVICE_TYPE_GUIDE = "006";
// CATFNL-3635 2015.05.13 [Add] �K�C�h�ǉ� END

// Add Start 2015/11/12 M.Kimino JIRA:CATPPS-169
	/** 015�F�ሳ */
	public static final String T005_SERVICE_TYPE_LOW_PRESSURE = "015";
	/** 016�F���� */
	public static final String T005_SERVICE_TYPE_HIGH_PRESSURE = "016";
	/** 017�F���d */
	public static final String T005_SERVICE_TYPE_POWER_GENERATION = "017";
	/** 016�F�� */
	public static final String T005_SERVICE_TYPE_WHOLESALE = "018";
// Add End 2015/11/12 M.Kimino JIRA:CATPPS-169
	
	// T116 �_��敪
	/** 001�FTV */
	public static final String T116_CONTRACT_DIV_TV = "001";
	/** 002�FNET */
	public static final String T116_CONTRACT_DIV_NET = "002";
	/** 003�FKDDI */
	public static final String T116_CONTRACT_DIV_KDDI = "003";
	/** 004�FNHK */
	public static final String T116_CONTRACT_DIV_NHK = "004";
	/** 005�F�ꎞ�� */
	public static final String T116_CONTRACT_DIV_LUMPSUM = "005";
	
	// �����敪
	/** �U�� */
	public static final BigDecimal BILL_DIV_TRANSFER = new BigDecimal("1");
	/** �U�� */
	public static final BigDecimal BILL_DIV_PAID = new BigDecimal("2");
	/** ���� */
	public static final BigDecimal BILL_DIV_CASH = new BigDecimal("3");
	/** ���̑� */
	public static final BigDecimal BILL_DIV_ETC = new BigDecimal("5");
	/** �J�[�h */
	public static final BigDecimal BILL_DIV_CARD = new BigDecimal("6");
	/** CCS */
	public static final BigDecimal BILL_DIV_CCS = new BigDecimal("9");
	
	// �W���敪
	/** �W���敪�F�S�� */
	public static final BigDecimal INTENSIVE_DIV_BANK = new BigDecimal("0");
	/** �W���敪�F�J�[�h */
	public static final BigDecimal INTENSIVE_DIV_CARD = new BigDecimal("1");
	/** �W���敪�F������s���� */
	public static final BigDecimal INTENSIVE_DIV_NONE = new BigDecimal("2");
	/** �W���敪�FCCS */
	public static final BigDecimal INTENSIVE_DIV_CCS = new BigDecimal("3");
	
	// �a�����
	/** ���� */
	public static final String DEPOSIT_TYPE_ORDINARY = "1";
	/** ���� */
	public static final String DEPOSIT_TYPE_CURRENT = "2";
	
	// �ڋq�敪
	/** �ڋq�敪:1:��_��� */
	public static final BigDecimal CUSTOMER_DIV_MAIN = new BigDecimal("1");
	/** �ڋq�敪:2:�]�_��� */
	public static final BigDecimal CUSTOMER_DIV_SUB = new BigDecimal("2");
	/** �ڋq�敪:3:���� */
	public static final BigDecimal CUSTOMER_DIV_HOUSE = new BigDecimal("3");
	/** �ڋq�敪:4:�@�l */
	public static final BigDecimal CUSTOMER_DIV_CORPORATION = new BigDecimal("4");
	/** �ڋq�敪:5:���̑� */
	public static final BigDecimal CUSTOMER_DIV_ETC = new BigDecimal("5");

	// ������
	/** ���s�敪�F0�F���s */
	public static final String ISSUE_DIV_ISSUE = "0";
	/** ���s�敪�F1�F�Ĕ��s */
	public static final String ISSUE_DIV_REISSUE = "1";
	/** ���s�敪�F2�F�Ǎ� */
	public static final String ISSUE_DIV_READ = "2";
	
	/** �ҏW�敪�F0�F���󗓖� */
	public static final String EDIT_DIV_OFF = "0";
	/** �ҏW�敪�F1�F���󗓗L */
	public static final String EDIT_DIV_ON = "1";
	
	/** ������:�@���ʁFSTB */
	public static final String PRINT_BILL_EQUIPMENT_TYPE_STB = "2";
	/** ������:�@���ʁF���f�� */
	public static final String PRINT_BILL_EQUIPMENT_TYPE_MODEM = "3";
	/** ������:�@���ʁFTA */
	public static final String PRINT_BILL_EQUIPMENT_TYPE_TA = "4";
	
	// ��t���
	/** ��t��ԁF0�F������ */
	public static final BigDecimal RECEIPT_STS_NON_PROC = new BigDecimal("0");
	/** ��t��ԁF1�F�_�񔽉f�O */
	public static final BigDecimal RECEIPT_STS_BF_COMPLETE = new BigDecimal("1");
	/** ��t��ԁF2�F�_�񔽉f���� */
	public static final BigDecimal RECEIPT_STS_COMPLETE = new BigDecimal("2");
	/** ��t��ԁF3�F�C�����f���� */
	public static final BigDecimal RECEIPT_STS_CHG_COMPLETE = new BigDecimal("3");
	/** ��t��ԁF4�F�G���[������ */
	public static final BigDecimal RECEIPT_STS_ERROR = new BigDecimal("4");
	
	// �b�������f���
	/** �b�������f��ԁF0�F���� */
	public static final BigDecimal REFLECT_STS_NORMAL = new BigDecimal("0");
	/** �b�������f��ԁF1�F�d���G���[ */
	public static final BigDecimal REFLECT_STS_DUPL = new BigDecimal("1");
	/** �b�������f��ԁF2�F���o�^ */
	public static final BigDecimal REFLECT_STS_UNREG = new BigDecimal("2");
	/** �b�������f��ԁF3�F�I�������͍ς� */
	public static final BigDecimal REFLECT_STS_NON_END = new BigDecimal("3");
	/** �b�������f��ԁF4�F���ԑ召�G���[ */
	public static final BigDecimal REFLECT_STS_NG_PERIOD = new BigDecimal("4");
	/** �b�������f��ԁF5�F�������f�G���[ */
	public static final BigDecimal REFLECT_STS_OTHER_REF = new BigDecimal("5");
	/** �b�������f��ԁF5�F�Z�b�g�`�����l�����ԏd�� */
	public static final BigDecimal REFLECT_STS_SETCANNEL_DUPL = new BigDecimal("5");

	/** ���׎��:1:�O��� */
	public static final BigDecimal DETAIL_TYPE_MAEUKE = new BigDecimal("1");
	/** ���׎��:2:�J�z�� */
	public static final BigDecimal DETAIL_TYPE_KURIKOSHI = new BigDecimal("2");
	/** ���׎��:3:���|�� */
	public static final BigDecimal DETAIL_TYPE_URIKAKE = new BigDecimal("3");

	// �\���敪
	/** �\���敪�F1:�J�n�\�� */
	public static final BigDecimal APPLICATION_STS_START = new BigDecimal("1");
	/** �\���敪�F2:���\�� */
	public static final BigDecimal APPLICATION_STS_CLOSE = new BigDecimal("2");
	/** �\���敪�F3:���ԕύX(����) */
	public static final BigDecimal APPLICATION_STS_EXTENSION = new BigDecimal("3");
	/** �\���敪�F4:���ԕύX(���J�n) */
	public static final BigDecimal APPLICATION_STS_START_NOW = new BigDecimal("4");
	
	// �\�����e
	/** �\�����e�F1:�V�K�\�� */
	public static final BigDecimal APPINFO_STS_START = new BigDecimal("1");
	/** �\�����e�F2:���\�� */
	public static final BigDecimal APPINFO_STS_CLOSE = new BigDecimal("2");
	/** �\�����e�F3:�\����� */
	public static final BigDecimal APPINFO_STS_CANCEL_START = new BigDecimal("3");
	/** �\�����e�F4:����� */
	public static final BigDecimal APPINFO_STS_CANCEL_CLOSE = new BigDecimal("4");
	
	// ���z���͋敪
	/** ���z���͋敪�F1:���z���͕s�� */
	public static final BigDecimal AMT_INPUT_DIV_OFF = new BigDecimal("1");
	/** ���z���͋敪�F2:���z���͉� */
	public static final BigDecimal AMT_INPUT_DIV_OK = new BigDecimal("2");
	
// Add start 20121012 H.Matsuyama STITEC-302
	// �T�[�r�X����
	/** 005:�ꎞ�� */
	public static final String SRV_CATEGORY_LUMPSUM = "005";
// Add end   20121012 H.Matsuyama STITEC-302
	
	/*
	 * ���Ɏd�l������̂�����̏�s�v�Ȃ�폜
	 * K.Suzuki
	 */
	/** �ǃR�[�h�i�ŏI�I�Ɂ|�Q�ƂȂ�j*/
    public static final BigDecimal STATION_CODE = new BigDecimal("-2");
    
    /*
     * ���ʃR�[�h��`
     */
    /**  NULL��\���萔�l�i���t�ȊO�j */
    public static final BigDecimal NULL_NUMBER = new BigDecimal("-1");
    /**  ����(���t) */
    public static final int FUTURE_YEAR_MONTH = 999999;
    public static final int FUTURE_DATE = 99999999;
    public static final int NULL_DATE = 0;
    public static final String DEFAULT_DATE = "00000000";
    public static final String DEFAULT_YYYYMM = "000000";
    public static final String DEFAULT_FUTURE_DATE = "99999999";
    /**  ����(����) */
    public static final int NULL_TIME = -1;
    public static final String DEFAULT_HHMMSS = "000000";
    public static final String DEFAULT_HHMM = "0000";
    public static final String DEFAULT_FUTURE_HHMM = "9999";
    /**  ����(���z�����l) */
    public static final BigDecimal NULL_PRICE = BigDecimal.ZERO;
    /**  ����(���ʖ����l) */
    public static final BigDecimal NULL_AMOUNT = BigDecimal.ZERO;
    /**  ����(�������l) */
    public static final BigDecimal NULL_MONTH = BigDecimal.ZERO;
    /**  ����(���Ԍ��l) */
    public static final BigDecimal NULL_HOUR = BigDecimal.ZERO;
    /**�@����(�R�[�h�����l) */
    public static final BigDecimal NULL_CODE_VALUE = new BigDecimal("-1");
    /** �ėp������2��ALL0 */
    public static final String STR_ZERO_LENGTH_TWO = "00";
    /** �ėp������3��ALL0 */
    public static final String STR_ZERO_LENGTH_THREE = "000";
    /** �ėp������6��ALL0 */
    public static final String STR_ZERO_LENGTH_SIX = "000000";
    /** �ėp������7��ALL0 */
    public static final String STR_ZERO_LENGTH_SEVEN = "0000000";
    /** �ėp������8��ALL0 */
    public static final String STR_ZERO_LENGTH_EIGHT = "00000000";
    /** �ėp������10��ALL0 */
    public static final String STR_ZERO_LENGTH_TEN = "0000000000";

    /*
     * �o���f�[�V�����֘A? 
     */
    /** ���ʃt���O FALSE */
    public static final BigDecimal DISTINCTION_FALSE = new BigDecimal(0);
    /** ���ʃt���O TRUE */
    public static final BigDecimal DISTINCTION_TRUE = new BigDecimal(1);    
    
    /*
     * ���O�֘A 
     */
    /**  ���O�o�͖��ݒ荀�ڏ����l */
    public static final String LOG_DB_SETTING_NONE = "-";

    /** ��ʁi1�F���O�C���A2�F���O�A�E�g�j*/
    public static final BigDecimal LOG_LOGIN = new BigDecimal(1);
    public static final BigDecimal LOG_LOGOUT = new BigDecimal(2);

    /** �c�a�����ʁi1�F�ǉ��A2�F�X�V�A3�F�폜�j*/
    public static final BigDecimal LOG_INSERT = new BigDecimal(1);
    public static final BigDecimal LOG_UPDATE = new BigDecimal(2);
    public static final BigDecimal LOG_DELETE = new BigDecimal(3);

    /**  �c�a�����ʁi��ʕ\���p�����j*/
    public static final String LOG_INSERT_TXT = "�ǉ�";
    public static final String LOG_UPDATE_TXT = "�X�V";
    public static final String LOG_DELETE_TXT = "�폜";
    
    /** �����l����ʕ\������ۂɂɎg�p���镶���� */
    public static final String MASK_STRING_NULL_VALUE = "-";
    /** �󕶎�����ʕ\������ۂɂɎg�p���镶���� */
    public static final String MASK_STRING_EMPTY_VALUE = "";
    
    /**  �ύX���O_��ʁi1:�ύX�O�A2:�ύX��j*/
    public static final BigDecimal LOG_BEFORE_DATA = new BigDecimal(1);
    public static final BigDecimal LOG_AFTER_DATA = new BigDecimal(2);
    
    /**  �o�b�`�������O_�X�e�[�^�X�i1:�J�n�A2:����I���A�R�F�x���I���A�S�F���f�I���A�T�F�ُ�I���A�U�F���s�҂��j*/
    public static final BigDecimal LOG_BATCH_START = new BigDecimal(1);
    public static final BigDecimal LOG_BATCH_FINISH = new BigDecimal(2);
    public static final BigDecimal LOG_BATCH_FINISH_WARNING = new BigDecimal(3);
    public static final BigDecimal LOG_BATCH_FINISH_INTERRUPT = new BigDecimal(4);
    public static final BigDecimal LOG_BATCH_FINISH_ABORT = new BigDecimal(5);
    public static final BigDecimal LOG_BATCH_WAITING = new BigDecimal(6);

    /**  �o�b�`�������O_�X�e�[�^�X�i��ʕ\���p�����j*/
    public static final String LOG_BATCH_START_TXT = "�J�n";
    public static final String LOG_BATCH_FINISH_TXT = "����I��";
    public static final String LOG_BATCH_FINISH_WARNING_TXT = "�x���I��";
    public static final String LOG_BATCH_FINISH_INTERRUPT_TXT = "���f�I��";
    public static final String LOG_BATCH_FINISH_ABORT_TXT = "�ُ�I��";
    public static final String LOG_BATCH_WAITING_TXT = "���s�҂�";

    /** ���[���O �����^�C�v */
    public static final String LOG_REP_OPERATIONTYPE_IN = "in";
    public static final String LOG_REP_OPERATIONTYPE_INOUT = "inout";
    public static final String LOG_REP_OPERATIONTYPE_OUT = "out";    
    
    /*
     * �G���R�[�h
     */
    /** �A�b�v���[�h�t�@�C���̃G���R�[�h */
    public static final String UPLOAD_FILE_ENCODING = "MS932";
    /** �_�E�����[�h�t�@�C���̃G���R�[�h */
    public static final String DOWNLOAD_FILE_ENCODING = "Windows-31J";
	/**
	 * ���V�X�e���ł�DB�������G���R�[�f�B���O(���ۂ�JA16SJISTILED�����A�Ή�����Java���G���R�[�f�B���O����)
	 */
	public static final String DATABASE_CHARACTER_ENCODING = "Windows-31J";
	/** AJAX�̃G���R�[�f�B���O */
	public static final String AJAX_CHARACTER_ENCODING = "UTF-8";
    
    /** �O���A�g�Í����ݒ� */    
    public static final String SECRETKEYUTILS_ENCODING = "utf-8";    
    
    /*
     * ���Ɏd�l������̂�����̏�s�v�Ȃ�폜
     * K.Suzuki
     */
    /** ������ʏ�ԊǗ��p�萔 */
    public static final String VIEW_STATE_MANAGE_FLG = "cmd";

    /** ������ʏ�ԊǗ��p�萔(�����\��) */
    public static final String VIEW_STATE_MANAGE_FLG_ON = "init";


    /* 
     * �X�g�A�h�v���V�[�W���p���O�o�͉������x�� 
     */
    /** ���O�o�͉������x���i���O���x���FTRACE�j */
    public static final BigDecimal LOG_LEVEL_TRACE = BigDecimal.ONE;
    /** ���O�o�͉������x���i���O���x���FDEBUG�j */
    public static final BigDecimal LOG_LEVEL_DEBUG = new BigDecimal(2);
    /** ���O�o�͉������x���i���O���x���FINFO�j */
    public static final BigDecimal LOG_LEVEL_INFO  = new BigDecimal(3);
    /** ���O�o�͉������x���i���O���x���FWARN�j */
    public static final BigDecimal LOG_LEVEL_WARN  = new BigDecimal(4);
    /** ���O�o�͉������x���i���O���x���FERROR�j */
    public static final BigDecimal LOG_LEVEL_ERROR = new BigDecimal(5);
    /** ���O�o�͉������x���i���O���x���FFATAL�j */
    public static final BigDecimal LOG_LEVEL_FATAL = new BigDecimal(6);


    /*
     * ����œ��ŊO�ŋ敪
     */
    /** ���ŊO�ŋ敪�i���Łj */
    public static final BigDecimal CSMPN_TX_INCL_EXCL_DIV_INCL = BigDecimal.ONE;
    /**�@���ŊO�ŋ敪�i�O�Łj�@*/
    public static final BigDecimal CSMPN_TX_INCL_EXCL_DIV_EXCL = new BigDecimal(2);

    /*
     * ���݋敪
     */
    /** ���݂��Ȃ� */
    public static final BigDecimal NOT_EXIST = BigDecimal.ZERO;
    /** ���݂��� */
    public static final BigDecimal EXIST = BigDecimal.ONE;


    /** ���ʃV�X�e���T�[�r�XID(����̃V�X�e���T�[�r�X�ɑ����Ȃ���ʂ��`����) */
    public static final String COMMON_SYSTEM_SERVICE_ID = "COMMON";


     // ----------------------- WEB��t---------------------------------------------
     // WEB��t�Œǉ�������̂͂���ȍ~�ɒǉ����Ă�������
    
    /*
     * ���Ӄt���O
     */
    /** ���Ӄt���O YES */
    public static final String AGREE_FLG_YES = "0";
    /** ���Ӄt���O NO */
    public static final String AGREE_FLG_NO = "1";

    /*
     * �擾�ُ�
     */
    /** �擾�ُ� */
    public static final String BASIC_CHANNEL_NAME_ERROR = "�擾�ُ�";

    /*
     * �_�񂳂�Ă��܂���
     */
    /** �_�񂳂�Ă��܂��� */
    public static final String WERSERVICE_CONTRACT_IS_EMPTY_ERROR = "�_�񂳂�Ă��܂���";
    
    /*
     * �ύX��t��{�t���O
     */
    /** �ύX��t��{�t���O 0�F�ʏ� */
    public static final int CORECE_FLG_ZERO = 0;
    /** �ύX��t��{�t���O 1�F��t�� */
    public static final int CORECE_FLG_ONE = 1;
    /** �ύX��t��{�t���O 2�F������ */
    public static final int CORECE_FLG_TWO = 2;
    /** �ύX��t��{�t���O 3�F��~�� */
    public static final int CORECE_FLG_THREE = 3;
    /** �ύX��t��{�t���O 4�F�ύX�s�� */
    public static final int CORECE_FLG_FOUR = 4;
    /*
     * �ύX��t�I�v�V�����t���O
     */
    /** �ύX��t�I�v�V�����t���O 0�F�ʏ� */
    public static final int OP_FLG_ZERO = 0;
    /** �ύX��t�I�v�V�����t���O 1�F��t�� */
    public static final int OP_FLG_ONE = 1;
    
    /*
     * QA�t���O
     */
    /** QA�t���O �͂� */
    public static final String AGE_QA_FLG_YES = "0";
    /** QA�t���O ������ */
    public static final String AGE_QA_FLG_NO = "1";

	/*
	 * JC-HITS�t���O
	 */
    /** JC-HITS�t���O JC-HITS�t���O ON */
    public static final String JC_HITS_FLG_ON = "1";
    /** JC-HITS�t���O JC-HITS�t���O OFF */
    public static final String JC_HITS_FLG_OFF = "0";
    
	/*
	 * ppv���p�t���O(0�F���p���Ă��Ȃ�,1�F���p��)
	 */
    /** ppv���p�t���O ���p���Ă��Ȃ� */
    public static final int PPV_FLG_UNUSEABLED = 0;
    /** ppv���p�t���O ���p�� */ 
    public static final int PPV_FLG_USEABLED = 1;

	/*
	 * �A�_���g���p�t���O(0�F���p���Ă��Ȃ�,1�F���p��)
	 */
    /** �A�_���g�t���O ���p���Ă��Ȃ� */
    public static final int ADULT_FLG_UNUSEABLED = 0;
    /** �A�_���g�t���O ���p�� */
    public static final int ADULT_FLG_USEABLED = 1;
   
    /*
	* �����\�t���O(0�F�����\,1�F�����s��)
	*/
    /** �����\*/
    public static final int WATCHING_ON = 0;
    /** �����s�� */
    public static final int WATCHING_OFF = 1;

    /*
     * ��������
     */
	/** ����F�����\ */
	public static final String WATCHING_ON_WORD = "����F�����\";
	/** ����F�����s�� */
	public static final String WATCHING_OFF_WORD = "����F�����s��";
	
	/*
     * �A�_���g�t���O
     */
    /** �A�_���g�t���O 0�FOFF 1�FON */
    public static final BigDecimal ADULT_FLG_OFF = BigDecimal.ZERO;
    /** �A�_���g�t���O 0�FOFF 1�FON */
    public static final BigDecimal ADULT_FLG_ON = BigDecimal.ONE;
    
    /*
     * ���N�����t���O
     */
    /** ���N�����t���O ON */
    public static final BigDecimal BIRTH_DATE_FLG_ON = BigDecimal.ONE;
    /** ���N�����t���O OFF */
    public static final BigDecimal BIRTH_DATE_FLG_OFF = BigDecimal.ZERO;

    /*
     * �����A���t���O
     */
    /** �����A���t���O 0�FOFF */
    public static final BigDecimal LINKED_FEE_FLG_OFF = BigDecimal.ZERO;
    /** �����A���t���O 1�FON */
    public static final BigDecimal LINKED_FEE_FLG_ON = BigDecimal.ONE;
    
    /*
     * �_��A���t���O
     */
    /** �_��A���t���O 0�FOFF */
    public static final String CONTRACT_SELECTED_OFF = "0";
    /** �_��A���t���O 1�FON */
    public static final String CONTRACT_SELECTED_ON = "1";
    
    /*
     * �\���t���O 0:�\������ 1:�\�����Ȃ�
     */
    /** �\���t���O 0�FON */
    public static final BigDecimal DSP_FLG_ON = BigDecimal.ZERO;
    /** �\���t���O 1�FOFF */
    public static final BigDecimal DSP_FLG_OFF = BigDecimal.ONE;
    
    /*
     * �{�^�����\���t���O
     */
    /** 0:�_�񂷂� */
    public static final int BUTTON_DISP_FLG_CONTRACT = 0;
    /** 1:��񂷂� */
    public static final int BUTTON_DISP_FLG_TERMINATION = 1;
    /** 2:�_������� */
    public static final int BUTTON_DISP_FLG_CANNCEL_CONTRACT = 2;
    /** 3:�������� */
    public static final int BUTTON_DISP_FLG_CANNCEL_TERMINATION = 3;
    /** 4:�ύX���� */
    public static final int BUTTON_DISP_FLG_CANNCEL_CHANGE = 4;
    
    /*
     * �{�^������/�񊈐��t���O 0:���� 1:�񊈐�
     */
    /** 0:���� */
    public static final int DISABLED_BUTTON_FALSE = 0;
    /** 1:�񊈐� */
    public static final int DISABLED_BUTTON_TRUE = 1;

    /*
     * �{�^���I���t���O 0:�I�� 1:�I�����Ȃ�
     */
    /** 0:���I�� */
    public static final int BUTTON_SELECTED_OFF = 0;
    /** 1:�I�� */
    public static final int BUTTON_SELECTED_ON = 1;
    
    /*
     * ����ID
     */
    /** ����ID OPMS-0001 */
    public static final String LANGUAGE_ID_OPMS_0001 = "OPMS-0001";
    /** ����ID OPMS-0002 */
    public static final String LANGUAGE_ID_OPMS_0002 = "OPMS-0002";
    /** ����ID OPMS-0003 */
    public static final String LANGUAGE_ID_OPMS_0003 = "OPMS-0003";
    /** ����ID OPMS-0004 */
    public static final String LANGUAGE_ID_OPMS_0004 = "OPMS-0004";
    /** ����ID OPMS-0005 */
    public static final String LANGUAGE_ID_OPMS_0005 = "OPMS-0005";
    /** ����ID OPMS-0006 */
    public static final String LANGUAGE_ID_OPMS_0006 = "OPMS-0006";
    /** ����ID RFIN-0001 */
    public static final String LANGUAGE_ID_RFIN_0001 = "RFIN-0001";
    /** ����ID RFIN-0002 */
    public static final String LANGUAGE_ID_RFIN_0002 = "RFIN-0002";
    /** ����ID RFIN-0003 */
    public static final String LANGUAGE_ID_RFIN_0003 = "RFIN-0003";
    /** ����ID RFIN-0004 */
    public static final String LANGUAGE_ID_RFIN_0004 = "RFIN-0004";
    /** ����ID RFIN-0005 */
    public static final String LANGUAGE_ID_RFIN_0005 = "RFIN-0005";
    /** ����ID RFIN-0006 */
    public static final String LANGUAGE_ID_RFIN_0006 = "RFIN-0006";
    /** ����ID RFIN-0007 */
    public static final String LANGUAGE_ID_RFIN_0007 = "RFIN-0007";
//  add start yangxg 2010/10/18 
    /** ����ID PVPC-0001 */
    public static final String LANGUAGE_ID_PVPC_0001 = "PVPC-0001";
// add end yangxg 2010/10/18  
    
	//�@�d�v�����������ID
    public static final String SCREEN_ID_CCT021S = "CCT021S";    
	//�@�I�v�V�����`�����l���_��E���ύX���ID
    public static final String SCREEN_ID_CCT024S = "CCT024S";
	//�@�_��m�F���ID
    public static final String SCREEN_ID_CCT026S = "CCT026S";
	//�@�N��F�؉��ID
    public static final String SCREEN_ID_CCT029S = "CCT029S";
	//�@���N�������͉��ID
    public static final String SCREEN_ID_CCT028S = "CCT028S";
	//�@�y�C�E�p�[�E�r���[�\�����݊m�F�������ID
    public static final String SCREEN_ID_CCT025S = "CCT025S";
	// �I�v�V�����`�����l���_��E�����Ԑ������ID
    public static final String SCREEN_ID_CCT030S = "CCT030S";
	//�@�����N����t���ԑg�������ID
    public static final String SCREEN_ID_CCT032S = "CCT032S";
//Add start 2010.07.16 M.SUZUKI
     public static final String ERROR_CD = "ERROR_CD";
//Add end 2010.07.16 M.SUZUKI
     /** ��t������� */
     public static final String SCREEN_ID_CCM005S = "CCM005S";
     
//   add start yangxg 2010/10/18
     // ���[�U�����͉��ID
     public static final String SCREEN_ID_CCM010S = "CCM010S";
//  add end yangxg 2010/10/18
     
//Add start 2010.08.16 yangxg
     /** ���ڕ����敪�@0�F���ׂ� */
     public static final String ITEM_WORD_ALL = "0";
     /** ���ڕ����敪�@1�F�區�ڕ��� */
     public static final String ITEM_WORD_B = "1";
     /** ���ڕ����敪�@2�F�����ڕ��� */
     public static final String ITEM_WORD_M = "2";
     /** ���ڕ����敪�@3�F�����ڕ��� */
     public static final String ITEM_WORD_S = "3";
//Add end 2010.08.16 yangxg
//Add start 2010.08.24 yangxg
     /** WEB���[�U */
     public static final String USER_WEB = "[web]";
//Add end 2010.08.24 yangxg
     /** �Ώۋ敪 1�FPPV,2�F�����N����t���ԑg */
     public static final int TARGET_PPV = 1;
     /** �Ώۋ敪 1�FPPV,2�F�����N����t���ԑg */
     public static final int TARGET_ADULT = 2;
//Add start 2010.09.03 ������
     /** �_���폜�t���O 0�F�_���폜�ł͂Ȃ��@1�F�_���폜 */
     public static final BigDecimal DELETE_FLG_ON = BigDecimal.ZERO;
     /** �_���폜�t���O 0�F�_���폜�ł͂Ȃ��@1�F�_���폜 */
     public static final BigDecimal DELETE_FLG_OFF = BigDecimal.ONE;
//Add end 2010.09.03 ������
//Add start 2010.09.03 yangxg 
     /**  �}�X�^�ҏW��ʏ����敪 1:�o�^ 2:�X�V 3:�폜*/
     public static final int MASTER_INSERT = 1;
     /**  �}�X�^�ҏW��ʏ����敪 1:�o�^ 2:�X�V 3:�폜*/
     public static final int MASTER_UPDATE = 2;
     /**  �}�X�^�ҏW��ʏ����敪 1:�o�^ 2:�X�V 3:�폜*/
     public static final int MASTER_DELETE = 3;
//Add end 2010.09.03 yangxg

//   Add start 2010.09.20 yangxg 
     /** �����m�肨�m�点���[�����M�t���O �L���t���O 0:OFF 1:ON */
     public static final BigDecimal BILL_MAIL_FLG_OFF = BigDecimal.ZERO;
     /** �����m�肨�m�点���[�����M�t���O �L���t���O 0:OFF 1:ON */
     public static final BigDecimal BILL_MAIL_FLG_ON = BigDecimal.ONE;
     
     /** �R�[�X���݃t���O 1:���� 0:���݂��Ȃ�*/
     public static final String COURSE_EXIST = "1";
     /** �R�[�X���݃t���O 1:���� 0:���݂��Ȃ� */
     public static final String COURSE_NO_EXIST = "0";
     
     /** �\�����e 1�F�ύX�\��,�Q�F�ύX�\����� �R�F�ύX�̕ύX */
     public static final int SERVICE_CHANGER_REG = 1;
     /** �\�����e 1�F�ύX�\��,�Q�F�ύX�\����� �R�F�ύX�̕ύX */
     public static final int SERVICE_CHANGER_CAN = 2;
     /** �\�����e 1�F�ύX�\��,�Q�F�ύX�\����� �R�F�ύX�̕ύX */
     public static final int SERVICE_CHANGER_REREG = 3;

     
     /** �R�[�X�ύX����@�\ON/OFF�t���O */
     public static final BigDecimal COURSE_CHANGE_FLG_ON = BigDecimal.ONE;
     public static final BigDecimal COURSE_CHANGE_FLG_OFF = BigDecimal.ZERO;
//   Add end 2010.09.20 yangxg 
//   Add start 2010.10.15 wangjg 
     /** �[������ 1:�؂�グ 2:�؂�̂� 3:�l�̌ܓ� */
     public static final String FRACTION_FLG_ONE = "1";
     /** �[������ 1:�؂�グ 2:�؂�̂� 3:�l�̌ܓ� */
     public static final String FRACTION_FLG_TWO = "2";
     /** �[������ 1:�؂�グ 2:�؂�̂� 3:�l�̌ܓ� */
     public static final String FRACTION_FLG_THREE = "3";
//   Add end 2010.10.15 wangjg     
// Add start 20110106 M.Suzuki
	// ���U�����Ǘ� ����NO�@1:BATCH�A2:PRINT
	public static final BigDecimal DISTRIBUTED_MANAGEMENT_BATCH = BigDecimal.ONE;
	public static final BigDecimal DISTRIBUTED_MANAGEMENT_PRINT = new BigDecimal(2);
    // 1���ԓ�����̕���
    public static final int MIN_PAR_HOUR = 60;
	// 1��������̕b��
	public static final int SEC_PAR_MIN = 60;
	// 1�b������̃~���b��
	public static final int MSEC_PAR_SEC = 1000;

	// 
//	/**  ���[���O_������ʁi1:�����A2:PDF�o�́A3:CSV�o�́A4:���e����j*/
    /**  ���[���O_������ʁi0:PDF�o�́A1:CSV�o�́j*/
	public static final BigDecimal LOG_REP_SEARCH = new BigDecimal(1);	// TODO PrintDBLogInterceptor�����p���Ă��邽�ߍ폜����܂Ŏc���B
//    public static final BigDecimal LOG_REP_PDF = new BigDecimal(2);
    public static final BigDecimal LOG_REP_PDF = new BigDecimal(0);
//    public static final BigDecimal LOG_REP_CSV = new BigDecimal(3);
    public static final BigDecimal LOG_REP_CSV = new BigDecimal(1);
//    public static final BigDecimal LOG_REP_PRINT = new BigDecimal(4);

    /**  ���[���O_������ʁi��ʕ\���p�����j*/
    public static final String LOG_REP_SEARCH_TXT = "����";
    public static final String LOG_REP_PDF_TXT = "���[�o��";
    public static final String LOG_REP_CSV_TXT = "CSV�o��";
    public static final String LOG_REP_PRINT_TXT = "���e���";

    /** ���[���O �ݒ�l��؂蕶�� */
    public static final String LOG_REP_VALUE_DELIMITER = "�^";
    /** ���O�Q�ƍő匏��*/
    public static final BigDecimal LOG_MAX_ROW = new BigDecimal(1000); 
    /** ���O��ʁi1�F���O�C��/���O�A�E�g�A2�F�Q�ƁA3�F�ύX�A4�F���[�A5�F�o�b�`�����j */
    public static final BigDecimal LOG_TYPE_L_L = new BigDecimal(1);
    public static final BigDecimal LOG_TYPE_REF = new BigDecimal(2);
    public static final BigDecimal LOG_TYPE_CHG = new BigDecimal(3);    
    public static final BigDecimal LOG_TYPE_REP = new BigDecimal(4);
    public static final BigDecimal LOG_TYPE_BAT = new BigDecimal(5);    
// Add end 20110106 M.Suzuki
// Add start 20110112 yangxg
    /** ���o��� �i1:CSV�j*/
    public static final BigDecimal EXTRACTION_TYPE_CSV = new BigDecimal(1);
    /** ���[ID:MELO0001 */
    public static final String PRINT_ID_MELO0001 = "MELO0001";
    /** ���X�g�o�͏������� 0:�C�ӌ^ 1:���l�^ 2:���t�^�i6) 3:���t�^�i8�j 4:�R�[�h�^ 5:�H���ǌ��� 6:�ƎҌ��� 7:�ǋ敪���� 8:�x�X����*/
    public static final BigDecimal CONDITION_INPUT_TYPE_FREE = new BigDecimal(0);
    public static final BigDecimal CONDITION_INPUT_TYPE_NUMBER = new BigDecimal(1);
    public static final BigDecimal CONDITION_INPUT_TYPE_DATEYM = new BigDecimal(2);
    public static final BigDecimal CONDITION_INPUT_TYPE_DATEYMD = new BigDecimal(3);
    public static final BigDecimal CONDITION_INPUT_TYPE_CODE = new BigDecimal(4);
    public static final BigDecimal CONDITION_INPUT_TYPE_CONSTRUCTION_TEAM = new BigDecimal(5);
    public static final BigDecimal CONDITION_INPUT_TYPE_TRADER_GROUP = new BigDecimal(6);
    public static final BigDecimal CONDITION_INPUT_TYPE_TEAM_DIV = new BigDecimal(7);
    public static final BigDecimal CONDITION_INPUT_TYPE_BRANCH = new BigDecimal(8);
    
    /** �I���t���O 0:���I�� 1:�I��*/
    public static final String SELECTED = "1";
    public static final String UNSELECTED = "0";
    
    /** #PRINT_ID# */
    public static final String PRINT_ID = "#PRINT_ID#";
    
    /** �[���Z�L�����e�B�`�F�b�N 0:���`�F�b�N 1:�`�F�b�N���� 2:�`�F�b�N���� */
    public static final String SECURITY_CHECK_NONE = "0";
    public static final String SECURITY_CHECK_READY = "1";
    public static final String SECURITY_CHECK_DONE = "2";
    
    /** ���X�g�o�͌��ʗp�����敪 1:�폜 2:CSV�o�� */
    public static final String LIST_OUTPUT_PROCESS_DEL = "1";
    public static final String LIST_OUTPUT_PROCESS_CSV = "2";
// Add end   20110112 yangxg    
//add start 20110120 lixy �V�H���Ǘ�
    /** �ڋq��� �O�F���_��ҁ^�P�F�_��ҁ^�Q�F���ҁ^�X�F���ԍ�*/
    public static final String CUSTOMER_STATUS_CODE0 = "0";
    public static final String CUSTOMER_STATUS_CODE1  = "1";
    
    // Add start 20121210 A.Takeuchi JIRA:STITEC-3373
    public static final String CUSTOMER_STATUS_CODE2  = "2";
    // Add end 20121210 A.Takeuchi JIRA:STITEC-3373
    
    public static final String CUSTOMER_STATUS_CODE9  = "9";
    public static final String CUSTOMER_STATUS0 = "���_���";
    public static final String CUSTOMER_STATUS1  = "�_���";
    public static final String CUSTOMER_STATUS9  = "���ԍ�";
//add end 20110120 lixy �V�H���Ǘ�
// Add start 20130122  i.shibuya [JIRA:STITEC-4035] 
    public static final String CUSTOMER_STATUS2  = "����";
// Add end   20130122  i.shibuya [JIRA:STITEC-4035]
    
//add start 20110120 WANGJG �V�H���Ǘ�
    /** �H���@����*/
    public static final String EQUIPMENT_DIV1 = "1";
    public static final String EQUIPMENT_DIV3 = "3";
    public static final String EQUIPMENT_DIV4 = "4";
    public static final String EQUIPMENT_DIV5 = "5";
    public static final String EQUIPMENT_DIV6 = "6";
    public static final String EQUIPMENT_DIV8 = "8";
    /** �H���w�����*/
    public static final String DIRECTION_DIV2 = "2";
    public static final String DIRECTION_DIV3 = "3";
    public static final String DIRECTION_DIV4 = "4";
    public static final String DIRECTION_DIV7 = "7";
    public static final String DIRECTION_DIV8 = "8";
    /** add start 20120314 liuzh */
    public static final String DIRECTION_DIV1 = "1";
    public static final String DIRECTION_DIV5 = "5";
    public static final String DIRECTION_DIV6 = "6";
    /** �H���w����ʖ���*/
    public static final String DIRECTION_DIV_NAME1 = "���̑��H��";//���̑��H��
    public static final String DIRECTION_DIV_NAME2 = "CATV�A�i���O�H��";//CATV�A�i���O�H��
    public static final String DIRECTION_DIV_NAME3 = "CATV�f�W�^���H��";//CATV�f�W�^���H��
    public static final String DIRECTION_DIV_NAME4 = "NET�H��";//NET�H��
    public static final String DIRECTION_DIV_NAME5 = "MD�H��";//MD�H��
    public static final String DIRECTION_DIV_NAME6 = "�P�[�u���v���X�d�b�H��";//�P�[�u���v���X�d�b�H��
    public static final String DIRECTION_DIV_NAME7 = "WiMAX";//WiMAX
    public static final String DIRECTION_DIV_NAME8 = "VoIP";//VoIP
    
    /** add end 20120314 liuzh */
    /** �H���@���ʖ���*/
    public static final String EQUIPMENT_DIV1_NAME = "HT";
    public static final String EQUIPMENT_DIV2_NAME = "STB";
    public static final String EQUIPMENT_DIV3_NAME = "B-CAS";
    public static final String EQUIPMENT_DIV4_NAME = "C-CAS";
    public static final String EQUIPMENT_DIV5_NAME = "NET";
    public static final String EQUIPMENT_DIV6_NAME = "ONU";
    public static final String EQUIPMENT_DIV7_NAME = "TA";
    
    /** �H�������o�̓t���O*/
    public static final String CONSTRUCTIONHISTORYOUTFLG1 = "1";
    public static final String CONSTRUCTIONHISTORYOUTFLG5 = "2";
    public static final String CONSTRUCTIONHISTORYOUTFLG5_ADD = "3";

    /** �H���������Ԙg*/
    public static final String CONSTRUCTIONHISTORFRAME = "����";
//add end 20110120 WANGJG �V�H���Ǘ�
    

    
    /**�e�[�u���s�I���v���O�C��**/
    /**onColor: �I�����Ӗ�����F**/
    public static final String ON_COLOR = "#ff0000";
    /**offColor: ��I�����Ӗ�����F**/
    public static final String OFF_COLOR = "#000000";
    /**onBackGroundColor: �I�����Ӗ�����w�i�F**/
    public static final String ON_BACKGROUND_COLOR = "#ffffff";
    /**offBackGroundColor: ��I�����Ӗ�����w�i�F**/
    public static final String OFF_BACKGROUND_COLOR = "#ffffff";

    /**onBackGroundColor: �I�����Ӗ�����w�i�F**/
    public static final String ON_BACKGROUND_COLOR_SELECT_SINGLE = "#E0FFE0";
    
    /** ���� �O�F��\���^�P�F���[�h�I�����[�^�Q�F���������p�\�^�R�ȏ�F�����t�����p�\*/
    public static final String RIGHT0 = "0" ;
    public static final String RIGHT1 = "1" ;
    public static final String RIGHT2 = "2" ;
    public static final String RIGHT3 = "3" ;
    //�P �Q�ƌ���
    public static final String USER_RIGHT1 = "1" ;
    //�Q �c�ƌ���
    public static final String USER_RIGHT2 = "2" ;
    //�R �J�X�^�}�[����
    public static final String USER_RIGHT3 = "3" ;
    //�S �H���ǌ���
    public static final String USER_RIGHT4 = "4" ;
    //�T �H����Ќ���
    public static final String USER_RIGHT5 = "5" ;
    //�U �S������
    public static final String USER_RIGHT6 = "6" ;
    //�V �ے�����
    public static final String USER_RIGHT7 = "7" ;
    //�W �Ǘ��Ҍ���
    public static final String USER_RIGHT8 = "8" ;
    public static final String NEED_PASSWORD_CONFIRM = "1";
    public static final String PASSWORD_CONFIRM_PREFIX = "pw_";
    /** ���ID**/
    
    /** ���X�g�o�͌��� */
    public static final String SCREEN_ID_MELO0001 = "MELO0001";
    /** ���X�g�o�͌��ʎ擾 */
    public static final String SCREEN_ID_MELO0002 = "MELO0002";
    /**�H���\�茟�� */
    public static final String SCREEN_ID_MSKJ0004 = "MSKJ0004";
    /**�H���\����� */
    public static final String SCREEN_ID_MEKJ0001 = "MEKJ0001";
    /**�H���w���@�����*/
    public static final String SCREEN_ID_MEKJ0002 = "MEKJ0002";
    /**�H���\��ꗗ�i�T�j*/
    public static final String SCREEN_ID_MSKJ0001 = "MSKJ0001";
    /**�H���\��ꗗ�i���j*/
    public static final String SCREEN_ID_MSKJ0002 = "MSKJ0002";
    /**�H���\��ꗗ�i���j*/
    public static final String SCREEN_ID_MSKJ0003 = "MSKJ0003";
    /**�H���\��ړ�*/
    public static final String SCREEN_ID_SEKJ0001 = "SEKJ0001";
    /**�H���������� */
    public static final String SCREEN_ID_MSGK0001 = "MSGK0001";
    /**�H����������*/
    public static final String SCREEN_ID_MEGK0001 = "MEGK0001";
    /** �H������ */
    public static final String SCREEN_ID_MSKJ0005 = "MSKJ0005";
    
    /**�f�t�H�[���g�t�@���N�V�����h�c**/
    public static final String DEFAULT_FUNCTION_ID = "99999999";
    
    /**�H���\�茟���̃t�@���N�V�����h�c**/
    /**�S�I��**/
    public static final String FUNCTION_ID_00000001 = "00000001";
    /**�S�I������**/
    public static final String FUNCTION_ID_00000002 = "00000002";
    /**�H���Ǐڍ�**/
    public static final String FUNCTION_ID_00000003 = "00000003";
    /**�H�����e�ڍ�**/
    public static final String FUNCTION_ID_00000004 = "00000004";
    /**�H���\��V�[�����**/
    public static final String FUNCTION_ID_00000005 = "00000005";
    /**�H���w���@�����**/
    public static final String FUNCTION_ID_00000006 = "00000006";
    /**�H���w�������**/
    public static final String FUNCTION_ID_00000007 = "00000007";
    /**�`�F�b�N���X�g���**/
    public static final String FUNCTION_ID_00000008 = "00000008";
    /**�`�F�b�N���X�g�o�^**/
    public static final String FUNCTION_ID_00000009 = "00000009";
    /**CSV�o��**/
    public static final String FUNCTION_ID_00000010 = "00000010";
    /**�H���\��ꗗ**/
    public static final String FUNCTION_ID_00000011 = "00000011";
    
    
    /**�H���������͂̃t�@���N�V�����h�c**/
    /**�H����Г��͊���**/
    public static final String C_FUNCTION_ID_00000001 = "00000001";
    /**�x�X���͊���**/
    public static final String C_FUNCTION_ID_00000002 = "00000002";
    /**�o�^**/
    public static final String C_FUNCTION_ID_00000003 = "00000003";
    /**�����P������**/
    public static final String C_FUNCTION_ID_10000001 = "10000001";
    

    /** PDF ID**/
    
    /**�H���\��V�[����� */
    public static final String PDF_ID_MPKP0001 = "MPKP0001";
    /**�`�F�b�N���X�g��� */
    public static final String PDF_ID_MPKP0002 = "MPKP0002";
    /**�H���������׏� */
    public static final String PDF_ID_MSGP0001 = "MSGP0001";
    /**�ƎҎx�����׏� */
    public static final String PDF_ID_MSGP0002 = "MSGP0002";
    /**�x��ړ]�o�����W�v�\ */
    public static final String PDF_ID_MSGP0003 = "MSGP0003";
    /**�f�t�H�[���g�Q�Ɨp_�x�X�X�R�[�v */
    public static final String DEFAULT_RBRANCH_SCOPE = "@@@@@@";
    /**�f�t�H�[���g�Q�Ɨp_�ǋ敪�X�R�[�v */
    public static final String DEFAULT_GROUP_DIVISION_SCOPE = "@@";
    /**�f�t�H�[���g�Q�Ɨp_�H���ǃX�R�[�v */
    public static final String DEFAULT_GROUP_SCOPE = "@@@";
    /**�f�t�H�[���g�Q�Ɨp_�H����ЃX�R�[�v */
    public static final String DEFAULT_COMPANY_SCOPE = "@@@@@@";
    /**�f�t�H�[���g�����p_�x�X */
    public static final String AFF_DEFAULT_RBRANCH = "000000";
    /**�f�t�H�[���g�����p_�ǋ敪 */
    public static final String AFF_DEFAULT_GROUP_DIVISION = "00";
    /**�f�t�H�[���g�����p_�ǋ敪 */
    public static final String AFF_DEFAULT_GROUP = "000";
    /**�f�t�H�[���g�����p_�ǋ敪 */
    public static final String AFF_DEFAULT_COMPANY = "000000";
    
    /**�Ǘ��p�����x�X�R�[�h */
    public static final String ADMIN_BRANCH_CD = "000000";
    /** �H���J�n�t���O 1:�J�n�H���g*/
    public static final String CONSTRUCTION_START_DIV = "1";
    
//  add start 20110129 WANGN �V�H���Ǘ�
    /** �w����� */
    public static final String INDICATION_STATUS_0 = "0";  // �H���O
    public static final String INDICATION_STATUS_4 = "4";  // �`�F�b�N�O
    public static final String INDICATION_STATUS_1 = "1";  // �@�픽�f�O
    public static final String INDICATION_STATUS_3 = "3";  // �H������
    public static final String INDICATION_STATUS_9 = "9";  // ������
    public static final String INDICATION_STATUS_5 = "5";  // ����
    /**          add start 20120314 liuzh          */
    public static final String INDICATION_STATUS_2 = "2";  // �_�񔽉f�O
    public static final String INDICATION_STATUS_NAME2 = "�_�񔽉f�O";     // �_�񔽉f�O
    /**          end start 20120314 liuzh          */
    public static final String INDICATION_STATUS_NAME0 = "�H���O";     // �H���O
    public static final String INDICATION_STATUS_NAME4 = "�`�F�b�N�O";   // �`�F�b�N�O
    public static final String INDICATION_STATUS_NAME1 = "�@�픽�f�O";  // �@�픽�f�O
    public static final String INDICATION_STATUS_NAME3 = "�H������";   // �H������
    public static final String INDICATION_STATUS_NAME9 = "������";     // ������
    public static final String INDICATION_STATUS_NAME5 = "����";       // ����
    public static final String EQUIPMENT_INPUT_1 = "1";  // ��
    public static final String EQUIPMENT_INPUT_2 = "2";  // ��
//  add start 20110129 WANGN �V�H���Ǘ�
    /** �J���} */
    public static final String COMMA = ",";
    /** �X���b�V�� */
    public static final String SLASH = "/";
    /** �s���I�h */
    public static final String PERIOD = ".";
    
    /** ��ʂ̏����敪 1:�V�K 2:�ύX*/
    public static final String MODE_SINKI = "1";
    public static final String MODE_HENKOU = "2";
    
    /**�ڋq�Z���敪1:�_��ҏꏊ 2:�ݒu�ꏊ*/
    public static final String CUSTOMER_ADDRESS_CONTRACT ="1";
    public static final String CUSTOMER_ADDRESS_SETTING ="2";
   
    
    /**��ʍ��ڂ̓��͉ۃt���O�i�I���t���O�j0:���͖��͑I���� 1:���͖��͑I��s��*/
    public static final String INPUT_SELECT_ON = "0";
    public static final String INPUT_SELECT_OFF = "1";

    // 20110130 Syukoryo �ǉ��@Start
    /** �ꗗ�F 0:�w����ԁA1:���l�P�A2:���l2�A3:���l3 */
    public static final String LIST_COLOR_SIJIJYOTAI = "0";
    /** �ꗗ�F 0:�w����ԁA1:���l�P�A2:���l2�A3:���l3 */
    public static final String LIST_COLOR_BIKO1 = "1";
    /** �ꗗ�F 0:�w����ԁA1:���l�P�A2:���l2�A3:���l3 */
    public static final String LIST_COLOR_BIKO2 = "2";
    /** �ꗗ�F 0:�w����ԁA1:���l�P�A2:���l2�A3:���l3 */
    public static final String LIST_COLOR_BIKO3 = "3";
    /** �H���g��ʁi�P�F�����H���g�@�Q�F���Ԙg�H���j */
    public static final String CONSTRUCTION_TYPE_PLURALS = "1";
    /** �H���g��ʁi�P�F�����H���g�@�Q�F���Ԙg�H���j */
    public static final String CONSTRUCTION_TYPE_TIMES = "2";
	/** ���������t���O�@�O�F���j���[���猟�����Ȃ��@�P�F�������� */
    public static final String INIT_DOSEARCH_FLG_DONOT = "0";
	/** ���������t���O�@�O�F���j���[���猟�����Ȃ��@�P�F�������� */
    public static final String INIT_DOSEARCH_FLG_DO = "1";
	/** ���ړ� �O�� */
	public static final String DO_ACTION_KBN_BM = "BM";
	/** ���ړ� ���� */
	public static final String DO_ACTION_KBN_AM = "AM";
	/** �T�ړ� �V���O */
	public static final String DO_ACTION_KBN_BW = "BW";
	/** �T�ړ� �V���� */
	public static final String DO_ACTION_KBN_AW = "AW";
	/** ���ړ� �P���O */
	public static final String DO_ACTION_KBN_BD = "BD";
	/** ���ړ� �P���� */
	public static final String DO_ACTION_KBN_AD = "AD";
	/** �H���\�������V���܂� */
	public static final String DO_ACTION_KBN_CW = "CW";
	/** �H���\��� */
	public static final String DO_ACTION_KBN_CD = "CD";
	/** �H���\����̌� */
	public static final String DO_ACTION_KBN_CM = "CM";
	/** �Č��� */
	public static final String DO_ACTION_KBN_RESEARCH = "RS";
	/** �\�����[�h W:�T�AD:���AM:�� */
	public static final String CONSTRUCTION_DISP_MODE_W = "W";
	/** �\�����[�h W:�T�AD:���AM:�� */
	public static final String CONSTRUCTION_DISP_MODE_D = "D";
	/** �\�����[�h W:�T�AD:���AM:�� */
	public static final String CONSTRUCTION_DISP_MODE_M = "M";
	/** �H���g������H�F�W���H���g/T�F�ǉ��H���g/I�F�\����͒�/Y�F�x��/Z�F�H����ғ��g/R�F�\��ς� */
	public static final String CONSTRUCTION_WAKU_PROPERTY_H = "H";
	/** �H���g������H�F�W���H���g/T�F�ǉ��H���g/I�F�\����͒�/Y�F�x��/Z�F�H����ғ��g/R�F�\��ς� */
	public static final String CONSTRUCTION_WAKU_PROPERTY_T = "T";
	/** �H���g������H�F�W���H���g/T�F�ǉ��H���g/I�F�\����͒�/Y�F�x��/Z�F�H����ғ��g/R�F�\��ς� */
	public static final String CONSTRUCTION_WAKU_PROPERTY_I = "I";
	/** �H���g������H�F�W���H���g/T�F�ǉ��H���g/I�F�\����͒�/Y�F�x��/Z�F�H����ғ��g/R�F�\��ς� */
	public static final String CONSTRUCTION_WAKU_PROPERTY_Y = "Y";
	/** �H���g������H�F�W���H���g/T�F�ǉ��H���g/I�F�\����͒�/Y�F�x��/Z�F�H����ғ��g/R�F�\��ς� */
	public static final String CONSTRUCTION_WAKU_PROPERTY_Z = "Z";
	/** �H���g������H�F�W���H���g/T�F�ǉ��H���g/I�F�\����͒�/Y�F�x��/Z�F�H����ғ��g/R�F�\��ς� */
	public static final String CONSTRUCTION_WAKU_PROPERTY_R = "R";
    // 20110130 Syukoryo �ǉ��@End 
    // 20110413 Syukoryo �ǉ��@start 
	/** ���l�P�F���[�U�R�����g�R�[�h�̐擪��'194' */
	public static final String CONSTRUCTION_COLOR_BIKO1 = "194";
	/** ���l�Q�F���[�U�R�����g�R�[�h�̐擪��'195' */
	public static final String CONSTRUCTION_COLOR_BIKO2 = "195";
	/** ���l�R�F���[�U�R�����g�R�[�h�̐擪��'196' */
	public static final String CONSTRUCTION_COLOR_BIKO3 = "196";
    // 20110413 Syukoryo �ǉ��@End 
	
	
	/** �x���敪 0:�o��/1:�x��*/
	public static final BigDecimal REST_DAY_DIV_WORKING = new BigDecimal("0");
	/** �x���敪 0:�o��/1:�x��*/
	public static final BigDecimal REST_DAY_DIV_REST = new BigDecimal("1");
	
	/** �d���s��� 1:�e�s�s�g 2:FS�v���C�}���d�b 3:SB�v���C�}���d�b */
	public static final String NO_REPEAT_DIV_FTTH = "1";
	public static final String NO_REPEAT_DIV_FS = "2";
	public static final String NO_REPEAT_DIV_SB = "3";
	
	/** �R�����g�R�[�h V020021�FSB�v���C�}�� V020015�FFS�v���C�}��*/
	public static final String COMENT_DIV_SB_PRIMARY = "V020021";
	public static final String COMENT_DIV_FS_PRIMARY = "V020015";
	
	/**�H���R�[�h�敪 01�F�R�����g�R�[�h 02:�H�����*/
	public static final String CONSTRUCTION_CODE_DIV_COMMENT = "01";
	public static final String CONSTRUCTION_CODE_DIV_CNSTYPE = "02";
	
	/** �H���敪 0016:���� 0015:�v���C�}���ړ]*/
	public static final String CONSTRUCTION_DIV_EXCHANGE = "0016";
	public static final String CONSTRUCTION_DIV_PRIMARY_MOVE = "0015";
	
	/** �`�F�b�N���X�g�o�^�t���O�P */
	public static final String NEED_CHECK = "1";
	/** �`�F�b�N���X�g�o�^�t���O�Q */
	public static final String CHECK_OK = "2";
	
	/** �A�g�Ώۃt���O 0�F�A�g�Ώ� 1�F�A�g�ΏۊO */
	public static final BigDecimal UNITE_TARGET_YES = BigDecimal.ZERO;
	public static final BigDecimal UNITE_TARGET_NOT = BigDecimal.ONE;
	
//  add start 20110212 WANGN �V�H���Ǘ�
    /** ������� */
    public static final String COST_STATUS_0 = "0";  // ���͑O						
    public static final String COST_STATUS_1 = "1";  // �����ߑO
    public static final String COST_STATUS_2 = "2";  // �{���ߑO
    public static final String COST_STATUS_3 = "3";  // ����
    public static final String COST_STATUS_NAME_0 = "���͑O";   // ���͑O						
    public static final String COST_STATUS_NAME_1 = "�����ߑO";  // �����ߑO
    public static final String COST_STATUS_NAME_2 = "�{���ߑO";  // �{���ߑO
    public static final String COST_STATUS_NAME_3 = "����";     // ����
    /** �H����Њ��� */
    public static final String COMPANY_END_0 = "0";  // ��	
    public static final String COMPANY_END_1 = "1";  // ��
    public static final String COMPANY_END_NAME_0 = "��";  // ��	
    public static final String COMPANY_END_NAME_1 = "��";  // ��	
    /** �x�X���� */
    public static final String BRANCH_END_0 = "0";  // ��	
    public static final String BRANCH_END_1 = "1";  // ��
    public static final String BRANCH_END_NAME_0 = "��";  // ��	
    public static final String BRANCH_END_NAME_1 = "��";  // ��
//  add end 20110212 WANGN �V�H���Ǘ�
    
    /** �J�n�t���O 1:�J�n�H���g */
    public static final String CONSTRUCTION_START_FALG_START = "1";
    
    /** �����t���O 0:������ 1:������/�s�� */
    public static final String RELEASE_FLG_YES = "0";
    public static final String RELEASE_FLG_NO = "1";
    
    /** �A�N�Z�X���������ݒ�(00000000000000) */
    public static final String UNDEFINE_ACCESSTIME = "00000000000000";
    
    /** S�R�[�h�����ݒ�(0000000000) */
    public static final String UNDEFINE_SCODE = "0000000000";
    
    /** AM PM */
    public static final String STRING_AM = "AM";
    public static final String STRING_PM = "PM";
    
    /** �ڋq�m��t���O0:null 1:success 2: fail */
    public static final String CUSTOMER_CLICK_NULL = "0";
    public static final String CUSTOMER_CLICK_SUCCESS = "1";
    public static final String CUSTOMER_CLICK_FAIL = "2";
    
    /** �H���\����͍폜�t���O 1:�폜 2:�o�^�폜*/
    public static final String CONSTRUCTION_DEL_DIV_DELETE = "1";
    public static final String CONSTRUCTION_DEL_DIV_INSERT = "2";
    
    /** �N���A�t���O */
    public static final String CLEAR_FLG = "1";
    public static final String CHANGE_FLG = "0";
    
    /** �ǉ� */
    public static final String STRING_ADD = "�ǉ�";
    

    /** �ڋq��� �O�F���_��ҁ^�P�F�_��ҁ^�Q�F����*/
    public static final BigDecimal CUSTOMER_STATUS_NOCONTRACT = new BigDecimal(0);
    public static final BigDecimal CUSTOMER_STATUS_CONTRACT = new BigDecimal(1);
    public static final BigDecimal CUSTOMER_STATUS_TERMINATION = new BigDecimal(2);
    
    /** �Z�L�����e�B�_�C�A���O */
    public static final String PASSWORD_CONFIRM_NO = "0";
    public static final String PASSWORD_CONFIRM_OK = "1";
    
    /** �ڋq��ԋ敪 */
    public static final BigDecimal CUSTOMER_STATUS_DIV = new BigDecimal(602);
    /** HE�n��敪 */
    public static final String HE_AREA_DIV = "583";
    /** �����敪�P�F��L�[�����@�Q�F�������� */
    public static final String SEARCH_MODEL_PRIMARY_KEY = "1";
    public static final String SEARCH_MODEL_CONDITION = "2";
    
    /** ���Ԏw��L�� */
    public static final String TIME_APPOINT_DIV_ZERO = "0";
    public static final String TIME_APPOINT_DIV_ONE = "1";
    public static final String TIME_APPOINT_DIV_ZERO_NAME = "��";
    public static final String TIME_APPOINT_DIV_ONE_NAME = "�L";

    /** �L���t���O 0:�L�� 1:���� */
    public static final String VALID_FLG_YES = "0";
    /** �L���t���O 0:�L�� 1:���� */
    public static final String VALID_FLG_NO = "1";
    
    /** �w����ԃt���O  0�F������ 1�F�����s��*/
    public static final String INSTRUCTION_STATUS_FLG_DECREASE_YES = "0";
    public static final String INSTRUCTION_STATUS_FLG_DECREASE_NO = "1";

    /** �Ɩ��𒆒f�����Ȃ����ʂȃG���[�R�[�h������z�� */
    public static final String[] SPECIAL_ERROR = new String[]{"ORA-02068","ORA-04068","ORA-04061"};

	/** �ʏ탍�O�C�����[�h */
	public static final String NORMAL_LOGIN = "normalLogin";
	/** �ȒP���O�C�����[�h */
	public static final String EASY_LOGIN = "easylogin";

	public static final String PC_JUMP_PAGE_NAME = "pcJumpPage";

	/** ������ */
	public static final String BLANK = "";

	/** �������[�h 1�F�V�K�o�^�^2�F�C���^3�F�폜�^4�F��� */
	public static final String MODE_INSERT = "1";
	/** �������[�h 1�F�V�K�o�^�^2�F�C���^3�F�폜�^4�F��� */
	public static final String MODE_UPDATE = "2";
	/** �������[�h 1�F�V�K�o�^�^2�F�C���^3�F�폜�^4�F��� */
	public static final String MODE_DELETE = "3";
	/** �������[�h 1�F�V�K�o�^�^2�F�C���^3�F�폜�^4�F��� */
	public static final String MODE_CANCEL = "4";
	
    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_OTHER = new BigDecimal("1");
    public static final String INSTRUCTION_TYPE_OTHER_VALUE = "���̑��H��";

    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_ANALOG = new BigDecimal("2");
    public static final String INSTRUCTION_TYPE_ANALOG_VALUE ="CATV�A�i���O�H��";

    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_DIGITAL = new BigDecimal("3");
    public static final String INSTRUCTION_TYPE_DIGITAL_VALUE ="CATV�f�W�^���H��";

    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_NET = new BigDecimal("4");
    public static final String INSTRUCTION_TYPE_NET_VALUE ="NET�H��";

    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_MD = new BigDecimal("5");
    public static final String INSTRUCTION_TYPE_MD_VALUE ="MD�H��";
    
    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_CABLE = new BigDecimal("6");
    public static final String INSTRUCTION_TYPE_CABLE_VALUE ="�P�[�u���v���X�d�b�H��";

    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_WIMAX = new BigDecimal("7");
    public static final String INSTRUCTION_TYPE_WIMAX_VALUE ="WiMAX�H��";

    /** �H���w����� 1:���̑��H��/2:�A�i���O�H��/3:�f�W�^���H��/4:NET�H��/5:MD�H��/6:�P�[�u���v���X�d�b�H��/7:WIMAX/8:VOIP */
    public static final BigDecimal INSTRUCTION_TYPE_VOIP = new BigDecimal("8");
    public static final String INSTRUCTION_TYPE_VOIP_VALUE ="VoIP�H��";
    
    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_NONE = new BigDecimal("0");
    public static final String EQU_TYPE_NONE_VALUE = "���̑�";

    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_HT = new BigDecimal("1");
    public static final String EQU_TYPE_HT_VALUE = "HT";

    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_BS_STB = new BigDecimal("2");
    public static final String EQU_TYPE_BS_STB_VALUE = "BS-STB";

    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_STB = new BigDecimal("3");
    public static final String EQU_TYPE_STB_VALUE = "STB";

    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_CCAS = new BigDecimal("4");
    public static final String EQU_TYPE_CCAS_VALUE = "C-CAS";

    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_BCAS = new BigDecimal("5");
    public static final String EQU_TYPE_BCAS_VALUE = "B-CAS";

    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_MODEM = new BigDecimal("6");
    public static final String EQU_TYPE_MODEM_VALUE_EMTA = "EMTA";
    public static final String EQU_TYPE_MODEM_VALUE_MODEM = "���f��";

    /** �H���@���� 0�F���̑��@��/1:HT/2:BS-STB/3:STB/4:C-CAS/5:B-CAS/6:���f��/7:MD */
    public static final BigDecimal EQU_TYPE_MD = new BigDecimal("7");
    public static final String EQU_TYPE_MD_VALUE = "MD";


    /** �H���w�����e 1�F�ݒu�^2�F�P���^3�F�����^4�F�m�F�^5�F�ړ]*/
    public static final BigDecimal INSTRUCTION_CONTENT_SETTING = new BigDecimal("1");
    public static final String INSTRUCTION_CONTENT_SETTING_VALUE = "�ݒu";

    /** �H���w�����e 1�F�ݒu�^2�F�P���^3�F�����^4�F�m�F�^5�F�ړ]*/
    public static final BigDecimal INSTRUCTION_CONTENT_REMOVE = new BigDecimal("2");
    public static final String INSTRUCTION_CONTENT_REMOVE_VALUE = "�P��";

    /** �H���w�����e 1�F�ݒu�^2�F�P���^3�F�����^4�F�m�F�^5�F�ړ]*/
    public static final BigDecimal INSTRUCTION_CONTENT_CAHNGE = new BigDecimal("3");
    public static final String INSTRUCTION_CONTENT_CAHNGE_VALUE = "����";
    
    /** �H���w�����e 1�F�ݒu�^2�F�P���^3�F�����^4�F�m�F�^5�F�ړ]*/
    public static final BigDecimal INSTRUCTION_CONTENT_CONFIRM = new BigDecimal("4");
    public static final String INSTRUCTION_CONTENT_CONFIRM_VALUE = "�m�F";

    /** �H���w�����e 1�F�ݒu�^2�F�P���^3�F�����^4�F�m�F�^5�F�ړ]*/
    public static final BigDecimal INSTRUCTION_CONTENT_MOVE = new BigDecimal("5");
    public static final String INSTRUCTION_CONTENT_MOVE_VALUE = "�ړ]";
    
   /** 0:�ʏ�^1:�����˗� */
    public static final BigDecimal REQUEST_NORMAL = new BigDecimal("0");
    public static final BigDecimal REQUEST_TODAY = new BigDecimal("1");
    
    
    /** 0:�����ҍH�� 1:�����e�i���X�H�� */
    public static final BigDecimal CONSTRUCTION_ADD= new BigDecimal("0");
    public static final String CONSTRUCTION_ADD_VALUE= "�����ҍH��";
    public static final BigDecimal CONSTRUCTION_MAINTAIN = new BigDecimal("1");
    public static final String CONSTRUCTION_MAINTAIN_VALUE = "�����e�i���X�H�� ";
    
    /** �_���� 0�F�ʏ�_��  1�F�ȈՌ_��  2�F�ꎞ�� */
    public static final BigDecimal CONTRACT_TYPE_NORMAL = new BigDecimal("0");
    public static final BigDecimal CONTRACT_TYPE_SIMPLE = new BigDecimal("1");
    public static final BigDecimal CONTRACT_TYPE_ONCE = new BigDecimal("2");
    /** �_���� �敪 3�F�폜 */
    public static final BigDecimal CONTRACT_TYPE_DELETE = new BigDecimal("2");
    
    /** �����J�n�t���O�@1�F�����J�n�@0�F�Ȃ� */
    public static final BigDecimal NEXT_MONTH_START_NG = new BigDecimal("0");
    public static final BigDecimal NEXT_MONTH_START_OK = new BigDecimal("1");
    
    /** �u�n�c�\���t���O 0:�Ȃ��@1:���� */
    public static final String VOD_NO = "0";
    public static final String VOD_YES = "1";
    

    /** B-CAS 0:�Ȃ��@1:���� */
    public static final String B_CAS_NO = "0";
    public static final String B_CAS_YES = "1";
    
    /** C-CAS 0:�Ȃ��@1:���� */
    public static final String C_CAS_NO = "0";
    public static final String C_CAS_YES = "1";
    
    /** �抷�敪 0�F�抷�^1�F�抷�s��: */
    public static final BigDecimal TRANSFER_YES = new BigDecimal("0");
    /** �抷�敪 0�F�抷�^1�F�抷�s��: */
    public static final BigDecimal TRANSFER_NO = new BigDecimal("1");
    
    
    /** �[���`�F�b�N 0:���`�F�b�N 1:�`�F�b�N���� 2:�`�F�b�N���� */
    public static final String CHECK_NONE = "0";
    public static final String CHECK_READY = "1";
    public static final String CHECK_DONE = "2";


	/** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜�^4�F���  �^5�F�����Ȃ� */
	public static final String MODE_EDIT_DIV_INSERT = "1";
	/** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜�^4�F���  �^5�F�����Ȃ� */
	public static final String MODE_EDIT_DIV_UPDATE = "2";
	/** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜�^4�F���  �^5�F�����Ȃ� */
	public static final String MODE_EDIT_DIV_DELETE = "3";
	/** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜�^4�F���  �^5�F�����Ȃ� */
	public static final String MODE_EDIT_DIV_CANCEL = "4";
	/** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜�^4�F���  �^5�F�����Ȃ� */
	public static final String MODE_EDIT_DIV_NULL = "5";
    
	
      
  
//  add start 20120314 YUH �_����e�m�F
    /** �萔(String) */
    public static final String TEISUU_STRING_ZERO = new String("0");
    public static final String TEISUU_STRING_ONE = new String("1");
    public static final String TEISUU_STRING_TWO = new String("2");
    public static final String TEISUU_STRING_THREE = new String("3");
    public static final String TEISUU_STRING_FOUR = new String("4");
    public static final String TEISUU_STRING_FIVE = new String("5");
    /** �萔(int) */
    public static final int TEISUU_INT_ZERO = 0;
    /** �萔(BigDecimal) */
    public static final BigDecimal TEISUU_BIGDECIMAL_ZERO = new BigDecimal("0");
    public static final BigDecimal TEISUU_BIGDECIMAL_ONE = new BigDecimal("1");
    public static final BigDecimal TEISUU_BIGDECIMAL_TWO = new BigDecimal("2");
    public static final BigDecimal TEISUU_BIGDECIMAL_THREE = new BigDecimal("3");
    public static final BigDecimal TEISUU_BIGDECIMAL_FOUR = new BigDecimal("4");
    public static final BigDecimal TEISUU_BIGDECIMAL_FIVE = new BigDecimal("5");
    public static final BigDecimal TEISUU_BIGDECIMAL_SIX = new BigDecimal("6");
//  add end 20120314 YUH �_����e�m�F
    
    
    
	
	//liuzh ==========================add
	/** ��t�\�H�� 0:�����ҍH�� 1:�����e�i���X�H��*/
	public static final String RECEIPTABLE_CONSTRUCION_0 = "0";
	public static final String RECEIPTABLE_CONSTRUCION_1 = "1";
	public static final String RECEIPTABLE_CONSTRUCION_9 = "9";
	public static final String RECEIPTABLE_CONSTRUCION_NAME_0 = "�����ҍH��";
	public static final String RECEIPTABLE_CONSTRUCION_NAME_1 = "�����e�i���X�H��";
	
	/** �������[�h 1:�V�K 2:�C�� 3:�폜 4:���*/
	public static final String MODEL_INSERT = "1";
	public static final String MODEL_UPDATE = "2";
	public static final String MODEL_DELETE = "3";
	public static final String MODEL_CANCEL = "4";
	
	/** �H���@����*/
	
    public static final String EQUIPMENT_CON1 = "1";
    public static final String EQUIPMENT_CON2 = "2";
    public static final String EQUIPMENT_CON3 = "3";
    public static final String EQUIPMENT_CON4 = "4";
    public static final String EQUIPMENT_CON5 = "5";
    public static final String EQUIPMENT_CON6 = "6";
    public static final String EQUIPMENT_CON7 = "7";
    /** �H���@���ʖ���*/
    public static final String EQUIPMENT_CON_NAME1 = "HT";
    public static final String EQUIPMENT_CON_NAME2 = "BS-STB";
    public static final String EQUIPMENT_CON_NAME3 = "STB";
    public static final String EQUIPMENT_CON_NAME4 = "C-CAS";
    public static final String EQUIPMENT_CON_NAME5 = "B-CAS";
    public static final String EQUIPMENT_CON_NAME6 = "���f��";
    public static final String EQUIPMENT_CON_NAME7 = "MD";
    /**�H���w�����e*/
    public static final String CONSTRUCION_CONTENT1 = "1";
    public static final String CONSTRUCION_CONTENT2 = "2";
    public static final String CONSTRUCION_CONTENT3 = "3";
    public static final String CONSTRUCION_CONTENT4 = "4";
    public static final String CONSTRUCION_CONTENT5 = "5";
    
    /**�H���w�����e���� 1�F�ݒu�^2�F�P���^3�F�����^4�F�m�F�^5�F�ړ]*/
    public static final String CONSTRUCION_CONTENT_NAME1 = "�ݒu";
    public static final String CONSTRUCION_CONTENT_NAME2 = "�P��";
    public static final String CONSTRUCION_CONTENT_NAME3 = "����";
    public static final String CONSTRUCION_CONTENT_NAME4 = "�m�F";
    public static final String CONSTRUCION_CONTENT_NAME5 = "�ړ]";
  //liuzh ==========================add
    
    
	
 // yangxg   
    public static final String PRINTID_PXK0003 = "PXK0003";
    public static final String PRINTID_PXK0005 = "PXK0005";
    public static final String ONE = "1";
//  yangxg

    /*
     * �H���w������񌟍�
     */
    /** 0:�����ҍH�� */
    public static final String RECEIPT_ABLE_CONSTRUCION_0 = "0";
    /** 1:�����e�i���X�H�� */
    public static final String RECEIPT_ABLE_CONSTRUCION_1 = "1";
    /** 0�i�Ȃ��j:�u�n�c�\���L�� */
    public static final String VOD_REGIST_FLG_0 = "0";
    /** 1�i����j:�u�n�c�\���L�� */
    public static final String VOD_REGIST_FLG_1 = "1";
    /** �H���w�����  1�F���̑��H�� */
    public static final String CONSTRUCTION_INSTRCT_TYPE_1 = "1";
    /** �H���w�����  2�FCATV�A�i���O�H�� */
    public static final String CONSTRUCTION_INSTRCT_TYPE_2 = "2";
    /** �H���w�����  3�FCATV�f�W�^���H�� */
    public static final String CONSTRUCTION_INSTRCT_TYPE_3 = "3";
    /** �H���w�����  4�FNET�H�� */
    public static final String CONSTRUCTION_INSTRCT_TYPE_4 = "4";
    /** �H���w�����  5�FMD�H�� */
    public static final String CONSTRUCTION_INSTRCT_TYPE_5 = "5";
    /** �H���w�����  6�F�P�[�u���v���X�d�b�H�� */
    public static final String CONSTRUCTION_INSTRCT_TYPE_6 = "6";
    /** �H���w�����  7�iWiMAX�j */
    public static final String CONSTRUCTION_INSTRCT_TYPE_7 = "7";
    /** �H���w�����  8�iVoIP�j */
    public static final String CONSTRUCTION_INSTRCT_TYPE_8 = "8";
    /** �w�����  0�F�H���O */
    public static final String DIRECTED_STATE_0 = "0";
    /** �w�����  1�F�@�픽�f�O */
    public static final String DIRECTED_STATE_1 = "1";
    /** �w�����  2�F�_�񔽉f�O */
    public static final String DIRECTED_STATE_2 = "2";
    /** �w�����  3�F���� */
    public static final String DIRECTED_STATE_3 = "3";
    /** �w�����  9�F������ */
    public static final String DIRECTED_STATE_9 = "9";
    /** ���f���ݒ�ύX�L��  0�F�Ȃ�*/
    public static final String MODEM_CONFIG_CHANGE_0 = "0";
    /** ���f���ݒ�ύX�L��  1�F���� */
    public static final String MODEM_CONFIG_CHANGE_1 = "1";
    /** �w�����e  1�F�ݒu */
    public static final String DIRECTIONS_1 = "1";
    /** �w�����e  2�F�P�� */
    public static final String DIRECTIONS_2 = "2";
    /** �w�����e  3�F���� */
    public static final String DIRECTIONS_3 = "3";
    /** �w�����e  4�F�m�F */
    public static final String DIRECTIONS_4 = "4";
    /** �w�����e  5�F�ړ] */
    public static final String DIRECTIONS_5 = "5";
    /** �P���@��݌ɕs��v  0�F�n�j */
    public static final String DISCREPANCY_REMOVAL_EQUIPMENT_0 = "0";
    /** �P���@��݌ɕs��v  1�F�s��v */
    public static final String DISCREPANCY_REMOVAL_EQUIPMENT_1 = "1";
    /** �ݒu�@��_��s��v  0�F�n�j */
    public static final String INSTALLED_EQUIPMENT_CONTRACT_0 = "0";
    /** �ݒu�@��_��s��v  1�F�s��v */
    public static final String INSTALLED_EQUIPMENT_CONTRACT_1 = "1";
    /** �u�n�c�\���L�� 0�F�Ȃ�*/
    public static final String VOD_REGISTRATION_0 = "0";
    /** �u�n�c�\���L��  1�F���� */
    public static final String VOD_REGISTRATION_1 = "1";
    /** �a�r�_��  1�F�ʏ�ԑg */
    public static final String BS_CONTRACT_1 = "1";
    /** �a�r�_��  2�F�a�r�_�� */
    public static final String BS_CONTRACT_2 = "2";
    /** ���n�ύX�_��  0�F�ύX�Ȃ� */
    public static final String LOCAL_CONTRACT_CHANGE_0 = "0";
    /** ���n�ύX�_��  1�F���n�ǉ� */
    public static final String LOCAL_CONTRACT_CHANGE_1 = "1";
    /** ���n�ύX�_��  2�F���n�폜 */
    public static final String LOCAL_CONTRACT_CHANGE_2 = "2";
    /** ���n�ύX�_��  3�F���n�ǉ������n�폜 */
    public static final String LOCAL_CONTRACT_CHANGE_3 = "3";
    /** 0AB�`J�ԍ��擾���@  1�FKDDI�̔� */
    public static final String OAB_JCD_GETMETHOD_1 = "1";
    /** 0AB�`J�ԍ��擾���@  2�F�ԍ��|�[�^�r���e�B */
    public static final String OAB_JCD_GETMETHOD_2 = "2";
    /** 0AB�`J�ԍ��擾���@  3�F���Ԉڍs */
    public static final String OAB_JCD_GETMETHOD_3 = "3";

    /** ��ʃG���[�t���O 0:�G���[�Ȃ� 1:�G���[���� */
    public static final BigDecimal ERROR_HAVE_NO = BigDecimal.ZERO;
    /** ��ʃG���[�t���O 0:�G���[�Ȃ� 1:�G���[���� */
    public static final BigDecimal ERROR_HAVE_YES = BigDecimal.ONE;
    
    //yinjj
    /** �ύX�敪�L�� */
    public static final String CNST_CHANGE_DIV_ONE_NAME = "��";
    public static final String CNST_CHANGE_DIV_TWO_NAME = "�L";
    /** �w����� */
    public static final String CONSTRUCION_DIRECT_STATE_ZERO = "0";
    public static final String CONSTRUCION_DIRECT_STATE_ONE = "1";
    
    /** �ǋ敪�I���t���O0:�S�� 1:�w��*/
    public static final String TEAM_DIV_SEL_ALL = "0";
    /** �ǋ敪�I���t���O0:�S�� 1:�w��*/
    public static final String TEAM_DIV_SEL_SPECIFIED = "1";
    

    /** �H���ǑI���t���O0:�S�� 1:�w��*/
    public static final String CONSTRUCTION_TEAM_DIV_SEL_ALL = "0";
    /** �H���ǑI���t���O0:�S�� 1:�w��*/
    public static final String CONSTRUCTION_TEAM_DIV_SEL_SPECIFIED = "1";
    //yinjj

    /** �o�o�u */
    public static final String PPV_NO = "0";
    public static final String PPV_YES = "1";
    

    /** �A�_���g */
    public static final String ADULT_NO = "0";
    public static final String ADULT_YES = "1";
    
    public static final String NULL_STRING = "";
// Add start 20150128 H.Shigenaga [CATFNL-3304]
    /**
	 *  ���ODB�o�^���q�l�������N�G�X�g�p�����[�^�ucustomerCd�v����擾������ID���w�肷�邱�Ɓi�ڋq�Q�ƂȂ�)
	 */
	public static final String[] CUSTOMER_DETAIL_SCREENID_LIST = new String[]{
		"CYAR101", // �T�}��
		"CYAR102", // ��{
		"CYAR104", // ����
		"CYER105", // ���l
		"CYAR107", // �⍇��
		"CYAR119", // ������������
		"CYAR110", // �_��
		"CYAR109", // �ꎞ��
		"CYAR122", // �@��
		"CYAR121", // �H��
		"CYAR112", // ����
		"CYAR113", // �m�g�j
		"CYAR114", // �K�C�h
		"CYAR115", // �ʐM
		"CYAR117", // �P�[�u���v���X
		"CYAR111", // �_�񗚗�
		"CYAR130", // �X�}�[�g�o�����[
		"CYAR128", // �P�[�u�����C��
		"CYAR131", // ���������Ɖ�
	};
// Add end 20150128 H.Shigenaga [CATFNL-3304]

    /** �ő�擾���� */
    public static final String MAX_LIST_VALUE = "MAX_LIST_VALUE";

    public static final String PAGE_MAX_COUNT = "PAGE_MAX_COUNT";
    
    /**�H�����ʋ@�픽�f�p�H�����ʎw����ԍX�V�敪�@1:�������� 2:���փ{�^������*/
    public static final String CONSTRUCTION_STATUS_UPDATE_DIV_INIT = "1";
    public static final String CONSTRUCTION_STATUS_UPDATE_DIV_NEXT = "2";
    
    /** �@�픽�f���� 0�F���^1:�^2�F�d�^3�F�v*/
    public static final BigDecimal EQUIPMENT_APP_RESULT_NO = new BigDecimal("0");
    public static final String EQUIPMENT_APP_RESULT_NO_VALUE = "��";
    public static final BigDecimal EQUIPMENT_APP_RESULT_FINISH = new BigDecimal("1");
    public static final String EQUIPMENT_APP_RESULT_FINISH_VALUE = "����";
    public static final BigDecimal EQUIPMENT_APP_RESULT_ERROR = new BigDecimal("2");
    public static final String EQUIPMENT_APP_RESULT_ERROR_VALUE = "�d";
    public static final BigDecimal EQUIPMENT_APP_RESULT_WARNING = new BigDecimal("3");
    public static final String EQUIPMENT_APP_RESULT_WARNING_VALUE = "�v";
    
    /** �H�������Q��checkbox�I���@true�F�I���^false:�^���I��*/
    public static final String CHECKBOX_ON = "true";
    public static final String CHECKBOX_OFF = "false";
    
    /** �W���Z���WMS�������@�@�P�F�Z�������@�Q�F�X�֔ԍ������@�R�F�W���Z���*/
    public static final String SEARCH_TYPE_ADDRESS = "1";
    public static final String SEARCH_TYPE_ZIPCODE = "2";
    public static final String SEARCH_TYPE_COLLECTHOUSE = "3";
    
    /** ���z���͋敪�F0:���z���͉�/�P�F���z���͕s�� */
    public static final BigDecimal PRICE_INPUT_DIV_YES = new BigDecimal("0");
    public static final BigDecimal PRICE_INPUT_DIV_NO = new BigDecimal("1");
    
    
    /**��Ɠ��e���̓T�u�E�B���h�E��ʗp*/
    /** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜*/
	public static final String MAINTANCE_MODE_EDIT_DIV_INSERT = "1";
	/** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜*/
	public static final String MAINTANCE_MODE_EDIT_DIV_UPDATE = "2";
	/** �ҏW�敪 1�F�V�K�o�^�^2�F�ύX�^3�F�폜*/
	public static final String MAINTANCE_MODE_EDIT_DIV_DELETE = "3";
	
	/** �H�����I���T�u�E�B���h�E  �I���敪 0:�����w�� 1:�H�����w��*/
	public static final String TAB_SELECT_SEARCH_CONDITION = "0";
	public static final String TAB_SELECT_CONSTRUCTION_DAY = "1";

	/** ��ʓ��̓`�F�b�N�v�ۃt���O 0�F�@�`�F�b�N�Ȃ��@�P�F�`�F�b�N�v*/
	public static final String CHECK_NEED_NO = "0";
	public static final String CHECK_NEED_YES = "1";
	

	/** ��ʏ��������t���O 0�F�@���������@�P�F���������Ȃ�*/
	public static final String SCREEN_INIT_DIV_YES = "0";
	public static final String SCREEN_INIT_DIV_NO = "1";
	
	/** �H���ǑI���ꗗ�w�i�F�@ �����{ */
    public static final String COLOR_NOT_YET_IMPLEMENTED_LIGHT = "LightPink";
    public static final String COLOR_NOT_YET_IMPLEMENTED_DEEP = "HotPink";
    /** �H���ǑI���ꗗ�w�i�F�@�H���� */
    public static final String COLOR_UNDER_CONSTRUCTION_LIGHT = "LightGreen";
    public static final String COLOR_UNDER_CONSTRUCTION_DEEP = "Green";
    /** �H���ǑI���ꗗ�w�i�F�@ ���� */
    public static final String COLOR_COMPLETION_LIGHT = "LightSkyBlue";
    public static final String COLOR_COMPLETION_DEEP = "DeepSkyBlue";
    /** �H���ǑI���ꗗ�w�i�F�@ ������ */
    public static final String COLOR_INCOMPLETE_LIGHT = "LightGrey";
    public static final String COLOR_INCOMPLETE_DEEP = "Gray";
    /** �H���ǑI���ꗗ�w�i�F�@ �x�� */
    public static final String COLOR_HOLIDAY = "Gold";
    /** �s�̔w�i�F */
    public static final String COLOR_ROW = "#F5F5F5";
    
    
    /** TPF2�����e�i���X�˗����e���v���[�g�敪 �P�FTV�^�Q�FNET�^�R�FTEL�^�S�FWiMAX */
    public static final BigDecimal FILE_DIV_TV = new BigDecimal("1");
    public static final BigDecimal FILE_DIV_NET = new BigDecimal("2");
    public static final BigDecimal FILE_DIV_TEL = new BigDecimal("3");
    public static final BigDecimal FILE_DIV_WIMAX = new BigDecimal("4");
    

    /** �Ăяo���� 2�F�H���\��ꗗ*/
	public static final String SCREEN_FLG_CSLIST = "2";
	
	/** 1:�݌ɂh�b�J�[�h���擾 2:�g�p���h�b�J�[�h���擾 3:�g�p���h�b�J�[�h���擾�i�r�s�a�����N�`�F�b�N�p�j */
	public static final String T321_SEARCH_DIV_ZAIKO = "1";
	public static final String T321_SEARCH_DIV_USING = "2";
	public static final String T321_SEARCH_DIV_STBLINK = "3";
	
	/** ���[�o�b�`��������0�F����  9�F�ُ� */
	public static final int BATCH_RESULT_DIV_OK = 0;
	public static final int BATCH_RESULT_DIV_ERROR = 9;
	
	/**�g�I���t���O 0:�I�����Ȃ��@�P�F�I������*/
	public static final BigDecimal CELL_SELECT_DIV_NO = new BigDecimal("0");
	public static final BigDecimal CELL_SELECT_DIV_YES = new BigDecimal("1");
    
// ADD 20120727 K.Arai JIRA:IACCESSBUG-(�ڋq�_�����(�_��))-027,28,29 START
	/** �ڋq�_����́i�_��j���   �����{�^�����  */
	public static final String CUSTOMERCONTRACTINPUT_REGISTER = "0";
	public static final String CUSTOMERCONTRACTINPUT_ALLSEND  = "1";
// ADD 20120727 K.Arai JIRA:IACCESSBUG-(�ڋq�_�����(�_��))-027,28,29 END
	
	/** �ڋq�����A�C�R���r�b�g */
	public static final int CUSTOMER_DETAIL_ICON_BIT = 2;
	/** �W�������A�C�R���r�b�g */
	public static final int MULTIDWELLING_DETAIL_ICON_BIT = 4;
	/** ����A�C�R���r�b�g */
	public static final int CONTROL_ABNORMAL_ICON_BIT = 8;
	/** ���[�m�F�A�C�R���r�b�g */
	public static final int PRINT_DETAIL_ICON_BIT = 16;
	/** �o�b�`�m�F�A�C�R���r�b�g */
	public static final int BATCH_DETAIL_ICON_BIT = 32;
	
    /** ������� �@��Ǘ� ���דo�^ */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_SUPPLY_REGISTRATION = new BigDecimal(101);
    /** ������� �@��Ǘ� �C������ */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_REPAIR_COMPLETION = new BigDecimal(102);
    /** ������� �@��Ǘ� �@��j�� */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_EQUIPMENT_ANNULMENT = new BigDecimal(103);
    /** ������� �@��Ǘ� �@��폜 */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_EQUIPMENT_DELETION = new BigDecimal(104);
    /** ������� �@��Ǘ� �J�[�h�����N�V�K�o�^ */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CARD_LINK_NEW_REGISTRATION = new BigDecimal(105);
    /** ������� �@��Ǘ� �J�[�h�����N�ēo�^ */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CARD_LINK_RE_REGISTRATION = new BigDecimal(106);
    /** ������� �@��Ǘ� �J�[�h�����N�o�^���� */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CARD_LINK_REGISTRATION_RELEASE = new BigDecimal(107);
    /** ������� �@��Ǘ� ���ڐ��� */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_DIRECT_CONTROL = new BigDecimal(108);
    /** ������� �@��Ǘ� �P���㏈�� */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_PROCESSING_AFTER_IT_REMOVES_IT = new BigDecimal(109);
    /** ������� �@��Ǘ� STB�O���[�v�o�^ */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_STB_GROUP_REGISTRATION = new BigDecimal(110);
    /** ������� �@��Ǘ� ���b�Z�[�W�o�^ */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_MESSAGE_REGISTRATION = new BigDecimal(111);
    /** ������� �@��Ǘ� ���b�Z�[�W��~ */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_MESSAGE_STOP = new BigDecimal(112);
    /** ������� �@��Ǘ� CCAS�X�e�[�^�X�ύX */
	public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CCAS_STATUS_CHANGE = new BigDecimal(113);
    /** ������� �@��Ǘ� CCAS�w�萧�� */
    public static final BigDecimal TRANSACTION_DIV_EQUIPMENT_CCAS_SPECIFICATION_CONTROL = new BigDecimal(114);

    /** ������� �_��Ǘ� OP�ύX */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_OP_CHANGE = new BigDecimal(201);
    /** ������� �_��Ǘ� �T�[�r�X�ύX */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_CHANGE = new BigDecimal(202);
    /** ������� �_��Ǘ� �T�[�r�X�ړ� */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_MOVEMENT = new BigDecimal(203);
    /** ������� �_��Ǘ� �T�[�r�X�x�~ */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_STOP = new BigDecimal(204);
    /** ������� �_��Ǘ� �T�[�r�X�x�~�ĊJ */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_STOP_RESTART = new BigDecimal(205);
    /** ������� �_��Ǘ� �T�[�r�X��� */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_CANCELLATION = new BigDecimal(206);
    /** ������� �_��Ǘ� �T�[�r�X�S��� */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_ALL_CANCELLATIONS = new BigDecimal(207);
    /** ������� �_��Ǘ� �T�[�r�X������~ */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_COMPULSION_STOP = new BigDecimal(208);
    /** ������� �_��Ǘ� �T�[�r�X������~�ĊJ */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_SERVICE_COMPULSION_STOP_AND_RESTART = new BigDecimal(209);
    /** ������� �_��Ǘ� �R�[�X�ύX */
	public static final BigDecimal TRANSACTION_DIV_CONTRACT_COURSE_CHANGE = new BigDecimal(210);

    /** ������� �H���Ǘ� �@��ݒu */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_INSTALLATION = new BigDecimal(301);
    /** ������� �H���Ǘ� �@����� */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_EXCHANGE = new BigDecimal(302);
    /** ������� �H���Ǘ� �@��P�� */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_REMOVAL = new BigDecimal(303);
    /** ������� �H���Ǘ� �S���M */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_ALL_TRANSMISSIONS = new BigDecimal(304);
    /** ������� �H���Ǘ� �����N�o�^ */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_LINK_REGISTRATION = new BigDecimal(306);
    /** ������� �H���Ǘ� �����N�o�^���� */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_LINK_REGISTRATION_RELEASE = new BigDecimal(307);
    /** ������� �H���Ǘ� �����@��P�� */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_EXCHG_REMOVAL = new BigDecimal(308);
    /** ������� �H���Ǘ� �����@��ݒu */
	public static final BigDecimal TRANSACTION_DIV_CONSTRUCTION_EQUIPMENT_EXCHG_INSTALLATION = new BigDecimal(309);

    /** ������� �o�b�`�������� �������� */
    public static final BigDecimal TRANSACTION_DIV_BATCH_DAILY_PROCESSING = new BigDecimal(401);
    /** ������� �o�b�`�������� �����o�b�N�A�b�v���� */
	public static final BigDecimal TRANSACTION_DIV_BATCH_THE_NEXT_BACKUP_PROCESSING_OF_DAY = new BigDecimal(402);
    /** ������� �o�b�`�������� �S�����M */
	public static final BigDecimal TRANSACTION_DIV_BATCH_ALL_TRANSMISSIONS = new BigDecimal(403);
    /** ������� �o�b�`�������� �_��X�V */
	public static final BigDecimal TRANSACTION_DIV_BATCH_CONTRACT_RENEWAL = new BigDecimal(404);
    /** ������� �o�b�`�������� �Z���N�g���M */
	public static final BigDecimal TRANSACTION_DIV_BATCH_SELECTION_TRANSMISSION = new BigDecimal(405);

   /** �@����ID:HT */
    public static final BigDecimal EQ_HT = new BigDecimal(1);
    /** �@����ID:STB */
    public static final BigDecimal EQ_STB = new BigDecimal(2);
    /** �@����ID:BCAS */
    public static final BigDecimal EQ_BCAS = new BigDecimal(3);
    /** �@����ID:CCAS */
    public static final BigDecimal EQ_CCAS = new BigDecimal(4);
    /** �@����ID:TA */
    public static final BigDecimal EQ_TA = new BigDecimal(9);
    /** �@����ID:SmartTVBox */
	public static final BigDecimal EQ_STVB = new BigDecimal(20);

    /** �ݒu�\��@�� */
    /** �ݒu�X�e�[�^�X�i�ݒu�\��j*/
    public static final BigDecimal SETTING_STATUS_SETTING_RESERV = new BigDecimal(0);
    /** �ݒu�X�e�[�^�X�i�ݒu�ρj*/
    public static final BigDecimal SETTING_STATUS_SETTING = new BigDecimal(1);
    
    /**  HE�R�[�h�i�����f�W�^���j */
    public static final BigDecimal EQPCNTRL_PANASONIC = new BigDecimal("110");
    /**  HE�R�[�h�i�p�C�I�j�A�f�W�^���j */
    public static final BigDecimal EQPCNTRL_PIONEER = new BigDecimal("610");
    /**  �����P�v�`�x�i�V���A���j */
    public static final BigDecimal EQPCNTRL_PANASONIC_1_WAY1 = new BigDecimal("101");
    /**  �����P�v�`�x�i�\�P�b�g�j */
    public static final BigDecimal EQPCNTRL_PANASONIC_1_WAY2 = new BigDecimal("102");
    /**  �����Q�v�`�x */
    public static final BigDecimal EQPCNTRL_PANASONIC_2_WAY = new BigDecimal("103");
    /**  ���łg�s */
    public static final BigDecimal EQPCNTRL_TOSHIBA1 = new BigDecimal("201");
    /**  ���łg�s */
    public static final BigDecimal EQPCNTRL_TOSHIBA2 = new BigDecimal("202");
    /**  ���łg�s */
    public static final BigDecimal EQPCNTRL_TOSHIBA3 = new BigDecimal("203");
    /**  �x�m�ʂg�s�e�b�R�T�T�P */
    public static final BigDecimal EQPCNTRL_FUJITU1 = new BigDecimal("301");
    /**  �x�m�ʂg�s�e�b�R�T�T�R */
    public static final BigDecimal EQPCNTRL_FUJITU2 = new BigDecimal("302");
    /**  �m�d�b�\�g�s */
    public static final BigDecimal EQPCNTRL_NEC = new BigDecimal("401");
    /**  �r�`�\�g�s */
    public static final BigDecimal EQPCNTRL_SA = new BigDecimal("501");
    /**  �p�C�I�j�A�g�s */
    public static final BigDecimal EQPCNTRL_PIONEER_HT = new BigDecimal("601");
    /**  JC-HITS 2007/12/18 K.Suzuki Add  */
    public static final BigDecimal EQPCNTRL_JCHITS = new BigDecimal("701");
    
    /** �X�C�b�`���O�A�g */
    
	/** �X�C�b�`���O�A�g�L���̒l��'2'(�A�g����j */
	public static final String SWITCHING_ON = "2";
    
    /** �T�[�r�X���� */
    
	/** �ሳ */
	public static final String SV_CLASSIFICATION_LOW_PRESSURE = "015";
	/** ���� */
	public static final String SV_CLASSIFICATION_HIGH_PRESSURE = "016";
	/** ���d */
	public static final String SV_CLASSIFICATION_POWERGENERATION = "017";
	/** �� */
	public static final String SV_CLASSIFICATION_WHOLESALE = "018";
    
    /** �t�@�C���X�e�[�^�X */
    
	/** �t�@�C���X�e�[�^�X�F�ǉ�  */
	public static final String FILE_STATUS_ADD = "1";
	/** �t�@�C���X�e�[�^�X�F�X�V */
	public static final String FILE_STATUS_UPD = "2";
	/** �t�@�C���X�e�[�^�X�F�폜 */
	public static final String FILE_STATUS_DEL = "3";
    
    /** �A���P�[�g�R�[�h */
    
	/** �A���P�[�g1�ɑΉ�����ݒ���l�R�[�h  */
	public static final String Q_00S0000 = "00S0000";
	public static final String PREFIX_00S = "00S";
	/** �A���P�[�g2�ɑΉ�����ݒ���l�R�[�h  */
	public static final String Q_00T0000 = "00T0000";
	public static final String PREFIX_00T = "00T";
	/** �A���P�[�g3�ɑΉ�����ݒ���l�R�[�h  */
	public static final String Q_00U0000 = "00U0000";
	public static final String PREFIX_00U = "00U";
	/** �A���P�[�g4�ɑΉ�����ݒ���l�R�[�h  */
	public static final String Q_00V0000 = "00V0000";
	public static final String PREFIX_00V = "00V";
	/** �A���P�[�g5�ɑΉ�����ݒ���l�R�[�h  */
	public static final String Q_00W0000 = "00W0000";
	public static final String PREFIX_00W = "00W";
	/** �A���P�[�g6�ɑΉ�����ݒ���l�R�[�h  */
	public static final String Q_00Y0000 = "00Y0000";
	public static final String PREFIX_00Y = "00Y";
	/** �A���P�[�g7�ɑΉ�����ݒ���l�R�[�h  */
	public static final String Q_00Z0000 = "00Z0000";
	public static final String PREFIX_00Z = "00Z";
    
	/** �`�F�b�N�{�b�N�X�FON  */
	public static final String CHK_BOX_ON = "on";
	/** �萔�QON  */
	public static final String STR_ON = "ON";
    
    /** �n�_����ԍ����� */
    
	/** �n�_����ԍ������F22��  */
	public static final int SPECIFICNUM_LENGTH = 22;
    
	/** 0���t�H�[�}�b�g�i3���j  */
	public static final String PADDING_THREE_FORMAT = "%1$03d";
    
	/** 0���t�H�[�}�b�g�i5���j  */
	public static final String PADDING_FIVE_FORMAT = "%1$05d";
	
	/** �T�[�r�XID */
	/** �ሳ_�g�p�ʏ��Ɖ�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_USED_INFO_INQUIRE_REQUEST = "IF_10210";
	/** ����_�g�p�ʏ��Ɖ�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_USED_INFO_INQUIRE_REQUEST = "IF_K10210";
	/** ���d_�g�p�ʏ��Ɖ�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_USED_INFO_INQUIRE_REQUEST = null;

	/** �ሳ_�g�p�ʏ��Ɖ� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_USED_INFO_INQUIRE = "IF_10310";
	/** ����_�g�p�ʏ��Ɖ� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_USED_INFO_INQUIRE = "IF_K10310";
	/** ���d_�g�p�ʏ��Ɖ� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_USED_INFO_INQUIRE = null;

	/** �ሳ_�ē_ */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_OPEN = "IF_10410";
	/** ����_�ē_ */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_OPEN = null;
	/** ���d_�ē_ */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_OPEN = "IF_F10410";

	/** �ሳ_�p�~�E�P�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_STOP_AND_REMOVE = "IF_10510";
	/** ����_�p�~�E�P�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_STOP_AND_REMOVE = "IF_K10510";
	/** ���d_�p�~�E�P�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_STOP_AND_REMOVE = "IF_F10510";

	/** �ሳ_�X�C�b�`���O�p�~�掟�o�^ */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_STOP_AGENCY = "IS_20110";
	/** ����_�X�C�b�`���O�p�~�掟�o�^ */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_STOP_AGENCY = "IS_K20110";
	/** ���d_�X�C�b�`���O�p�~�掟�o�^ */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_STOP_AGENCY = "IS_F20110";

	/** �ሳ_�X�C�b�`���O�J�n�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_START = "IF_10610";
	/** ����_�X�C�b�`���O�J�n�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_START = "IF_K10610";
	/** ���d_�X�C�b�`���O�J�n�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_START = "IF_F10610";

	/** �ሳ_�X�C�b�`���O�p�~�掟���f */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_STOP_AGENCY_JUDGE = "IS_20410";
	/** ����_�X�C�b�`���O�p�~�掟���f */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_STOP_AGENCY_JUDGE = "IS_K20410";
	/** ���d_�X�C�b�`���O�p�~�掟���f */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_STOP_AGENCY_JUDGE = "IS_F20410";

	/** �ሳ_�X�C�b�`���O�p�~�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_SWITCHING_STOP = "IF_10710";
	/** ����_�X�C�b�`���O�p�~�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_SWITCHING_STOP = "IF_K10710";
	/** ���d_�X�C�b�`���O�p�~�\�� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_SWITCHING_STOP = "IF_F10710";

	/** �ሳ_�A���y�A�ύX */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_CHANGE_AMPERE = "IF_10910";
	/** ����_�A���y�A�ύX */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_CHANGE_AMPERE = null;
	/** ���d_�A���y�A�ύX */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_CHANGE_AMPERE = null;

	/** �ሳ_���ύX */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_CHENGE_USER_INFO = "IF_10810";
	/** ����_���ύX */
	public static final String SERVICE_ID_SV_CLASSIFICATION_HIGH_PRESSURE_CHENGE_USER_INFO = "IF_K10810";
	/** ���d_���ύX */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_CHENGE_USER_INFO = "IF_F10810";

	/** �ሳ_�ݔ����Ɖ� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_LOW_PRESSURE_GET_EQUIPMENT_INFO = "IF_10110";
	/** �ሳFIT�d��__�ݔ����Ɖ� */
	public static final String SERVICE_ID_SV_CLASSIFICATION_POWERGENERATION_GET_EQUIPMENT_INFO = "IF_F10110";

	// Add start 20160216 A.Takemi [CATPPS-979]
	/** ���Ǝ҈ꗗ�擾 */
	public static final String SERVICE_ID_SV_CLASSIFICATION_COMPANIES_LIST_REQUEST = "IS_30110";
	// Add end 20160216 A.Takemi [CATPPS-979]

	/** �\����� */
	
	/** �A���y�A�ύX_�ሳ */
	public static final String ENTRY_TYPE_CHANGE_AMPERE_LOW_PRESSURE = "06";
	/** �A���y�A�ύX_���� */
	public static final String ENTRY_TYPE_CHANGE_AMPERE_HIGH_PRESSURE = null;
	/** �A���y�A�ύX_���d */
	public static final String ENTRY_TYPE_CHANGE_AMPERE_POWERGENERATION = null;

	/** �X�C�b�`���O�J�n�\��_�ሳ */
	public static final String ENTRY_TYPE_SWITCHING_START_LOW_PRESSURE = "05";
	/** �X�C�b�`���O�J�n�\��_���� */
	public static final String ENTRY_TYPE_SWITCHING_START_HIGH_PRESSURE = "05";
	/** �X�C�b�`���O�J�n�\��_���d */
	public static final String ENTRY_TYPE_SWITCHING_START_POWERGENERATION = "16";

	/** �X�C�b�`���O�p�~�\��_�ሳ */
	public static final String ENTRY_TYPE_SWITCHING_STOP_LOW_PRESSURE = "03";
	/** �X�C�b�`���O�p�~�\��_���� */
	public static final String ENTRY_TYPE_SWITCHING_STOP_HIGH_PRESSURE = "03";
	/** �X�C�b�`���O�p�~�\��_���d */
	public static final String ENTRY_TYPE_SWITCHING_STOP_POWERGENERATION = "14";

	/** �X�C�b�`���O�p�~�掟�o�^_�ሳ */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_LOW_PRESSURE = null;
	/** �X�C�b�`���O�p�~�掟�o�^_���� */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_HIGH_PRESSURE = null;
	/** �X�C�b�`���O�p�~�掟�o�^_���d */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_POWERGENERATION = null;

	/** �ē__�ሳ */
	public static final String ENTRY_TYPE_OPEN_LOW_PRESSURE = "04";
	/** �ē__���� */
	public static final String ENTRY_TYPE_OPEN_HIGH_PRESSURE = null;
	/** �ē__���d */
	public static final String ENTRY_TYPE_OPEN_POWERGENERATION = "15";

	/** �g�p�ʏ��Ɖ�_�ሳ */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_LOW_PRESSURE = null;
	/** �g�p�ʏ��Ɖ�_���� */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_HIGH_PRESSURE = null;
	/** �g�p�ʏ��Ɖ�_���d */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_POWERGENERATION = null;

	/** �g�p�ʏ��Ɖ�\��_�ሳ */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_REQUEST_LOW_PRESSURE = "08";
	/** �g�p�ʏ��Ɖ�\��_���� */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_REQUEST_HIGH_PRESSURE = "08";
	/** �g�p�ʏ��Ɖ�\��_���d */
	public static final String ENTRY_TYPE_USED_INFO_INQUIRE_REQUEST_POWERGENERATION = null;

	/** ���ύX_�ሳ */
	public static final String ENTRY_TYPE_CHENGE_USER_INFO_LOW_PRESSURE = "07";
	/** ���ύX_���� */
	public static final String ENTRY_TYPE_CHENGE_USER_INFO_HIGH_PRESSURE = "07";
	/** ���ύX_���d */
	public static final String ENTRY_TYPE_CHENGE_USER_INFO_POWERGENERATION = "17";

	/** �p�~�E�P��_�ሳ�i�P������j */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_LOW_PRESSURE_ON = "02";
	/** �p�~�E�P��_�ሳ�i�P���Ȃ��j */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_LOW_PRESSURE_OFF = "01";
	/** �p�~�E�P��_���� */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_HIGH_PRESSURE = "02";
	/** �p�~�E�P��_���d�i�P������j */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_POWERGENERATION_ON = "13";
	/** �p�~�E�P��_���d�i�P���Ȃ��j */
	public static final String ENTRY_TYPE_STOP_AND_REMOVE_POWERGENERATION_OFF = "12";

	/** �X�C�b�`���O�p�~�掟���f_�ሳ */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_JUDGE_LOW_PRESSURE = null;
	/** �X�C�b�`���O�p�~�掟���f_���� */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_JUDGE_HIGH_PRESSURE = null;
	/** �X�C�b�`���O�p�~�掟���f_���d */
	public static final String ENTRY_TYPE_SWITCHING_STOP_AGENCY_JUDGE_POWERGENERATION = null;

	
	/** �X�C�b�`���O�A�g�g������ */
	
	/** �g�p�ʉ{���p�X���[�h */
	public static final String LINK_ITEM_PASSWORD = "PASSWORD";

	/** �X�C�b�`���O�p�~�掟���fNG���R1 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_01_FLAG = "JUDGEMENT_REASON_01_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R2 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_02_FLAG = "JUDGEMENT_REASON_02_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R3 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_03_FLAG = "JUDGEMENT_REASON_03_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R4 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_04_FLAG = "JUDGEMENT_REASON_04_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R5 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_05_FLAG = "JUDGEMENT_REASON_05_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R6 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_06_FLAG = "JUDGEMENT_REASON_06_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R7 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_07_FLAG = "JUDGEMENT_REASON_07_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R8 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_08_FLAG = "JUDGEMENT_REASON_08_FLAG";
	/** �X�C�b�`���O�p�~�掟���fNG���R9 */
	public static final String LINK_ITEM_JUDGEMENT_REASON_09_FLAG = "JUDGEMENT_REASON_09_FLAG";
	/** �X�C�b�`���O�p�~�掟���f */
	public static final String LINK_ITEM_JUDGEMENT_FLAG = "JUDGEMENT_FLAG";
	
	/** �n�_����ԍ� */
	public static final String LINK_CHITEN_TOKUTEI_NO = "CHITEN_TOKUTEI_NO";
	/** �d�͉�ЃG���A */
	public static final String LINK_DENRYOKUGAISHA_AREA = "DENRYOKUGAISHA_AREA";
	
	/** �_��o�^�ړ��R�[�h */
	
	/** �_��e�ʒP�ʁi00E�j */
	public static final String CONTRACT_00E = "00E";
	/** �Ǝ�i00A�j */
	public static final String CONTRACT_00A = "00A";
	/** �Č��X�e�[�^�X�i00B�j */
	public static final String CONTRACT_00B = "00B";
// Change start 20151211 K.Kushiro CATPPS-501 
//	/** �_�񌈒���@/�d�C�����i00Q�j */
//	public static final String CONTRACT_00Q = "00Q";
	/** �_�񌈒���@  */
	public static final String CONTRACT_00Q = "00Q";
	/** �d�C����  */
	public static final String CONTRACT_00X = "00X";
// Change end 20151211 K.Kushiro CATPPS-501 
	/** �����i00L�j */
	public static final String CONTRACT_00L = "00L";
	/** �d����]�i00M�j */
	public static final String CONTRACT_00M = "00M";
	/** �\���ҁi00N�j�ሳ/�ሳFIT */
	public static final String CONTRACT_00N = "00N";
	/** �\���ҁi01N�j���� */
	public static final String CONTRACT_01N = "01N";
	/** �d�b�i00P�j */
	public static final String CONTRACT_00P = "00P";
	/** �����o�H�i234�j */
	public static final String CONTRACT_234 = "234";
	/** ���R�i105�j */
	public static final String CONTRACT_105 = "105";
	/** ���ށi086�j */
	public static final String CONTRACT_086 = "086";
	/** �G���A�i009�j */
	public static final String CONTRACT_009 = "009";
	/** ��_��i00G�j */
	public static final String CONTRACT_00G = "00G";
	/** ���ƕ�i00O�j */
	public static final String CONTRACT_00O = "00O";
	/** ���@�i00I�j */
	public static final String CONTRACT_00I = "00I";
	
	/** �X�C�b�`���O�o�^�p�����[�^ �o�^ (1) */ 
	public static final String SW_REGISTER_UPDATE_FLG_REGIST = "1";
	/** �X�C�b�`���O�o�^�p�����[�^ ���� (2) */ 
	public static final String SW_REGISTER_UPDATE_FLG_UPDATE = "2";
	/** �X�C�b�`���O�o�^�p�����[�^ ��� (3) */ 
	public static final String SW_REGISTER_UPDATE_FLG_CANCEL = "3";

	/** �X�C�b�`���O�Ɖ� �ݔ����  (1) */ 
	public static final String SW_REFER_CODE_CONTRACT_SERVICE = "1";
	/** �X�C�b�`���O�Ɖ� �g�p�ʏ��擾�T�[�r�X  (2) */ 
	public static final String SW_REFER_CODE_USED_INFO = "2";
	/** �X�C�b�`���O�Ɖ� �X�C�b�`���O�p�~�掟����  (3) */ 
	public static final String SW_REFER_CODE_SW_STOP_AGENCY_RESULT = "3";
	/** �X�C�b�`���O�Ɖ� �A�g����  (4) */ 
	public static final String SW_REFER_CODE_LINK_HISTORY = "4";

	/** �X�C�b�`���O�A�g �g�p�ʏ��Ɖ�\��  (1) */ 
	public static final String SW_APPLAY_CODE_USAGE_SUBMIT = "1";
	/** �X�C�b�`���O�A�g �ē_�\�� (2) */ 
	public static final String SW_APPLAY_CODE_CONTRACT = "2";
	/** �X�C�b�`���O�A�g �p�~�E�P���\�� (3) */ 
	public static final String SW_APPLAY_CODE_CLOSE = "3";
	/** �X�C�b�`���O�A�g �X�C�b�`���O�p�~�掟�o�^ (4) */ 
	public static final String SW_APPLAY_CODE_SW_CONTRACT_AGENT_CLOSE = "4";
	/** �X�C�b�`���O�A�g �X�C�b�`���O�J�n�\�� (5) */ 
	public static final String SW_APPLAY_CODE_SW_CONTRACT_START = "5";
	/** �X�C�b�`���O�A�g �X�C�b�`���O�p�~�\�� (6) */ 
	public static final String SW_APPLAY_CODE_SW_CLOSE = "6";
	/** �X�C�b�`���O�A�g �A���y�A�ύX�\�� (7) */ 
	public static final String SW_APPLAY_CODE_AMPERE = "7";
	/** �X�C�b�`���O�A�g ���ύX�\�� (8) */ 
	public static final String SW_APPLAY_CODE_INFORMATION = "8";
	/** �X�C�b�`���O�A�g �g�p�ʏ��Ɖ� (9) */ 
	public static final String SW_APPLAY_CODE_USAGE = "9";
	/** �X�C�b�`���O�A�g �p�~�掟���f (10) */ 
	public static final String SW_APPLAY_CODE_CONTRACT_AGENT_CLOSE = "10";
	/** �X�C�b�`���O�A�g �ݔ����Ɖ� (11) */ 
	public static final String SW_APPLAY_CODE_SW_EQUIPMENT_INFO = "11";
	
	/** �d�͉�ЃG���A */
	public static final String LINK_DENRYOKUGAISHA_NO = "DENRYOKUGAISHA_NO";
	
	/** �X�C�b�`���O�C���^�[�t�F�[�X���� */
	
	/** �X�C�b�`���O�J�n�\�� */
	public static final String SW_START_PPLICATION_NAME = "�X�C�b�`���O�J�n�\��";
	/** �ē_ */
	public static final String SW_SAITEN_NAME = "�ē_";
	/** �p�~ */
	public static final String SW_HAISHI_NAME = "�p�~";
	/** �p�~�E�P�� */
	public static final String SW_HAISHI_REMOVAL_NAME = "�p�~�E�P��";
	/** �A���y�A�ύX�\�� */
	public static final String SW_AMPERE_CHANGED_APP_NAME = "�A���y�A�ύX�\��";
	/** ���ύX�\�� */
	public static final String SW_INFO_CHANGED_APP_NAME = "���ύX�\��";
	
	/** �o�b�`�G���g���[KEY */
	
	/** �����d�͗ʏo�� */
	public static final String SUPPLY_PURCHASE_YM = "SupplyPurchaseYM";
	
	/** �o�b�`ID */
	
	/** �o�b�`ID�FPXA0060 */
	public static final String BATCH_ID_PXA0060 = "PXA0060";
	/** �o�b�`ID�FPXA0061 */
	public static final String BATCH_ID_PXA0061 = "PXA0061";
	
	/** �d�͒P�ʁiKW) */
	public static final String POWER_UNIT_KW = "kW";
	
	/*----------------------------------------------------
	 * �\���ҁi�敪�j
	 *----------------------------------------------------*/
	
	/** �\���ҁi�敪�j�F�قȂ� */
	public static final String APP_CLASSIFICATION_DIFFERENT = "1000";
	
	/** �\���ҁi�敪�j�F���� */
	public static final String APP_CLASSIFICATION_IDENTITY = "1001";
	
	/*----------------------------------------------------
	 * �t�@�C�����̓`�F�b�N�֘A
	 *----------------------------------------------------*/
	
	/** �t�@�C�����e�T�C�Y */
	public static final int MAX_FILE_SIZE_1M = 1048576;
	
	/** �t�@�C���������e�T�C�Y */
	public static final int MAX_FILE_NAME_SIZE = 100;
	
	/**
	 * ���I�ؖ���
	 * OCCTO���e�g���q���X�g
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
	 * �����K�X�Ή��萔
	 *----------------------------------------------------*/

	// Add start 20160114 Takemi TASK_WST
	
	/** �i�����K�XGCSI�j�A�g�t���O */
	public enum GcisRenkeiFlg {
		/** GCIS����ړ����� */
		GCIS_LINK_UP(1);
		
		private int value;
		private GcisRenkeiFlg(int value) {this.value = value;}
		public int getValue() {return this.value;}
	}
	
	/** ���O�C���R���e�N�X�g����i�����K�XGCSI�A�g�j�Z�b�V����ID���擾����L�[ */
	public static final String CUSTOMER_RENKEI_SESSION_KEY_CONTRACT = "CUSTOMER_RENKEI_SESSION_KEY_CONTRACT";
	/** ���O�C���R���e�N�X�g����i�����K�XGCSI�j�A�g�t���O���擾����L�[ */
	public static final String GCIS_RENKEI_FLG = "GCIS_RENKEI_FLG";
	// Add end 20160114 Takemi TASK_WST

	// Add start 20160120 chinen TASK_WST
	/** GSCI�A�g�t���O */
	public static final Integer GSCI_LINK_UP_FLG = 1;
	/** �����o�H'0003'(�d�b) */
	// chg start chinen CATPPSSB-109�Ή�
	//public static final String SAIBU_JOIN_ROOT_PHONE = "0003";
	public static final String SAIBU_JOIN_ROOT_PHONE = "0001";
	// chg end chinen CATPPSSB-109�Ή�
	/** �p�~������̌��ϕ��@�i�p�����[�^���́j  */
	public static final String PARAM_CANCEL_PAYMETHOD = "cancelPayMethod";
	/** �C�x���g�i�p�����[�^���́j  */
	public static final String PARAM_EVENT = "event";
	/** �K�X������t�t���O�i�p�����[�^���́j  */
	public static final String PARAM_GAS_USEFLG = "gasUseFlg";
	/** ���z�����d�ݒu�󋵁i�p�����[�^���́j  */
	public static final String PARAM_SOLAR_STATUS = "solarStatus";
	/** ���Ԃ����p�L���i�p�����[�^���́j  */
	public static final String PARAM_DAY_USEFLG = "dayUseFlg";
	/** �ڑ������J�n�N�����i�p�����[�^���́j  */
	public static final String PARAM_SUPPY_OPENDATE = "suppyOpenDate";
	/** �ڑ������p�~�\����i�p�����[�^���́j  */
	public static final String PARAM_SUPPY_CLOSEDATE = "suppyCloseDate";
	/** �����n�_����ԍ��i�p�����[�^���́j  */
	public static final String PARAM_SUPPY_POINTNUM = "supplyPointNo";
	/** ���������Ǝ҂��q�l�ԍ��i�p�����[�^���́j  */
	public static final String PARAM_OLDRETAIL_CUSTOMERNO = "oldRetailCustomerNo";
	/** ���������ƎҖ��́i�A�g�j�i�p�����[�^���́j  */
	public static final String PARAM_OLDRETAIL_NAME = "oldRetailName";
	/** �����\�莞���i�p�����[�^���́j  */
	public static final String PARAM_NYUKYO_YOTEITIME = "nyukyoYoteiTime";

	// Add end 20160120 chinen TASK_WST
	
	/**
	 * �x�����(CSV�t�@�C�����C�A�E�g�Ɠ���)
	 *
	 */
	public enum CsvLayout {
		SUPPLY_NUMBER("������ԍ�"),
		GENERATION_NUMBER("����ԍ�"),
		PAYMENT_CONTRACT_NUMBER("�x���_��ԍ�"),
		ECIS_CUSTOMER_NUMBER("ECIS���q���ܔԍ�"),
		PAYMENT_METHOOD("���ϕ��@"),
		FINANCIAL_INSTITUTION("���Z�@��"),
		AGGREGATE_BANK("�W���s"),
		DEPOSIT_TYPE("�a�����"),
		ACCOUNT_NUMBER("�����ԍ�"),
		ACCOUNT_NAME_CANA("�������i�J�i�j"),
		INITIAL_CLAIMS_FLAG("���񐿋��t���O"),
		REQUEST_FORM_SENDING_DATE("�˗������t��"),
		ACCOUNT_RECEPTION_DATE("����.��t��"),
		ACCOUNT_USE_START_DATE("����.�g�p�J�n��"),
		CARD_NUMBER_1("�J�[�h�ԍ�1"),
		CARD_NUMBER_2("�J�[�h�ԍ�2"),
		CARD_NUMBER_3("�J�[�h�ԍ�3"),
		CARD_NUMBER_4("�J�[�h�ԍ�4"),
		CARD_COMPANY("�J�[�h���"),
		CARD_NAME("�J�[�h���`"),
		EXPIRATION_DATE("�L������"),
		SECURITY_CODE("�Z�L�����e�B�[�R�[�h"),
		TRAN_MAX_AMOUNT("�������z"),
		ALLIANCE_CLASSIFICATION("��g�敪"),
		CARD_RECEPTION_DATE("�J�[�h.��t��"),
		AUTHORIZATION_NUMBER("���F�ԍ�"),
		DATE_OF_APPROVAL("���F��"),
		COMMITMENTS("���F�z"),
		CARD_USE_START_DATE("�g�p�J�n��");

		/**
		 * ���ږ���ݒ�
		 */
		private final String divValue;
		CsvLayout(String divValue) {
			this.divValue = divValue;
		}

		/**
		 * ���ږ��̂�Ԃ�
		 * 
		 * @return ���ږ���
		 */
		public String getItemName() { return divValue; }
	}
	
	public static final String RECV_PATH = "RECV_PATH"; // ��M�f�B���N�g��.�j�d�x
	public static final String FILE_NAME = "FILE_NAME"; // �t�@�C����.�j�d�x
	public static final String EXTEND_NAME = "EXTEND_NAME"; // �g���q.�j�d�x
	
	// Add start 20160309 Toma CATPPSSB-328
	/** ���ϕ��@(�U��) */
	public static final String PAYMENT_TRANSFER = "1";
	/** ���ϕ��@(����) */
	public static final String PAYMENT_PAYMENT = "2";
	/** ���ϕ��@(�J�[�h) */
	public static final String PAYMENT_CARD = "6";
	// Add end 20160309 Toma CATPPSSB-328
}
