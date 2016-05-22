/*
 * @(#)GetSwitchingContractInfoResult.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.common.dao.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * �_����ꗗ���f���̓��o�͏�񃂃f���N���X�ł��B<BR/>
 * �_����ꗗ���f��
 * ���������Ώۂł��̂ŁA�����҂͊g�����Ă͂����܂���B
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class GetSwitchingContractInfoResult implements Serializable {

//--- �v���p�e�B�t�B�[���h

    /** �ǃR�[�h */
    private java.lang.String stationCd;
    /** �ڋq�R�[�h */
    private java.lang.String customerCd;
    /** �A�� */
    private java.math.BigDecimal seqNo;
    /** �n�_����ԍ� */
    private java.lang.String pointIdentificationNumber;
    /** �ڑ��J�n�\��� */
    private java.lang.String transportaionScheduledStartDate;
    /** �ڑ��p�~�\��� */
    private java.lang.String transportaionScheduledEndDate;
    /** ���������Ǝ҃R�[�h */
    private java.lang.String oldCompanyCd;
    /** ���������Ǝ҂��q�l�ԍ� */
    private java.lang.String oldCompanyCustomerCd;
    /** �����񊼋K��Ɋ�Â����珳�� */
    private java.math.BigDecimal agreement;
    /** �ݔ����ύX�L���敪 */
    private java.math.BigDecimal facilityInfoChangedClass;
    /** �ݔ��P���� */
    private java.lang.String facilityRemovalDate;
    /** �{�H��]���� */
    private java.lang.String constructionScheduledTime;
    /** ����� */
    private java.math.BigDecimal onSiteWitnessing;
    /** �����]�� */
    private java.lang.String onSiteWitnessingPreferredDate;
    /** �����]���� */
    private java.lang.String onSiteWitnessingPreferredTime;
    /** ����Ҏ��� */
    private java.lang.String witness;
    /** �\���ҁi�敪�j */
    private java.lang.String applicantClass;
    /** �\���Ҏ��� */
    private java.lang.String applicantName;
    /** �\���҂��A����d�b�ԍ��i�敪�j */
    private java.lang.String applicantContactTelClass;
    /** �\���҂��A����d�b�ԍ��i�s�O�ǔԁj */
    private java.lang.String applicantContactTelAreaCode;
    /** �\���҂��A����d�b�ԍ��i�s���ǔԁj */
    private java.lang.String applicantContactTelcityNumber;
    /** �\���҂��A����d�b�ԍ��i�����Ҕԍ��j */
    private java.lang.String applicantContactTelSubscriberNumber;
    /** �G���A�敪 */
    private java.lang.String areaDivision;
    /** ��_��_�����̌n */
    private java.lang.String mainContractCargingSystem;
    /** ��_��_��{�����P�� */
    private java.math.BigDecimal mainContractBasicRate;
    /** ��_��_�_�񒴉ߋ����� */
    private java.math.BigDecimal mainContractExcessChargeNeglect;
    /** ���ƕ�_�����̌n */
    private java.lang.String ppgsChargingSystem;
    /** ���ƕ�_��{�����P��_�g�p�� */
    private java.math.BigDecimal ppgsBasicRateInCaseOfUse;
    /** ���ƕ�_��{�����P��_�s�g�p�� */
    private java.math.BigDecimal ppgsBasicRateNotInCaseOfUse;
    /** ���ƕ�_��d�͎Z�o���@ */
    private java.lang.String ppgsBasicPowerCalcMethod;
    /** ���ƕ�_��d�� */
    private java.math.BigDecimal ppgsBasicPower;
    /** ���ƕ�_�]�ʂȂ� */
    private java.math.BigDecimal ppgsNoMeasuredRateSystem;
    /** ���ƕ�_�g�p�ʎZ�o */
    private java.math.BigDecimal ppgsUsedAmountCalc;
    /** �������� */
    private java.lang.String partSupply;
    /** ��������_���Ќ_��d�� */
    private java.math.BigDecimal partSupplyContractPower;
    /** ��������_���Ќ_��d�� */
    private java.math.BigDecimal partSupplyOtherContractPower;
    /** �Z����� */
    private java.math.BigDecimal calcPeriod;
    /** �w����� */
    private java.math.BigDecimal specifiedDate;
    /** ���ƕ�_�_�񒴉ߋ����� */
    private java.math.BigDecimal ppgsContractExcessChargeNeglect;
    /** �ڑ����d�T�[�r�X���j���[ */
    private java.math.BigDecimal powerTransmissionServiceMenu;
    /** �_�񌈒���@ */
    private java.lang.String contractDeterminationMethod;
    /** �p�~���R */
    private java.math.BigDecimal abolitionReason;
    /** ������̗L�� */
    private java.math.BigDecimal buildingDemolition;
    /** ��̗\��� */
    private java.lang.String demolitionScheduledDate;
    /** ��̗\�莞�� */
    private java.lang.String demolitionScheduledTime;
    /** �����\�莞�� */
    private java.lang.String movingInScheduledTime;
    /** �_��ύX�\��N���� */
    private java.lang.String contractChangeScheduledDate;
    /** �_��d����] */
    private java.lang.String desiredContractCurrent;
    /** �o���O�A���v�� */
    private java.math.BigDecimal contactNecessity;
    /** ���j���̑I�� */
    private java.math.BigDecimal meterReadingDay;
    /** �����]���� */
    private java.lang.String witnessDesiredTime;
    /** �_��҃R�[�h */
    private java.lang.String contractCd;
    /** �A�� */
    private java.lang.String contractSeqNo;

//--- �R���X�g���N�^

    /**
     * ���̃I�u�W�F�N�g�����������Ƃ��ɌĂяo����܂��B
     */
    public GetSwitchingContractInfoResult() {
        super();
    }

//--- �v���p�e�B���\�b�h

    /**
     * �ǃR�[�h��Ԃ��܂��B
     * @return �ǃR�[�h ��߂��܂��B
     */
    public java.lang.String getStationCd() {
        return stationCd;
    }

    /**
     * �ǃR�[�h���Z�b�g���܂��B
     * @param stationCd �ǃR�[�h ��ݒ�B
     */
    public void setStationCd(java.lang.String stationCd) {
        this.stationCd = stationCd;
    }

    /**
     * �ڋq�R�[�h��Ԃ��܂��B
     * @return �ڋq�R�[�h ��߂��܂��B
     */
    public java.lang.String getCustomerCd() {
        return customerCd;
    }

    /**
     * �ڋq�R�[�h���Z�b�g���܂��B
     * @param customerCd �ڋq�R�[�h ��ݒ�B
     */
    public void setCustomerCd(java.lang.String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * �A�Ԃ�Ԃ��܂��B
     * @return �A�� ��߂��܂��B
     */
    public java.math.BigDecimal getSeqNo() {
        return seqNo;
    }

    /**
     * �A�Ԃ��Z�b�g���܂��B
     * @param seqNo �A�� ��ݒ�B
     */
    public void setSeqNo(java.math.BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * �n�_����ԍ���Ԃ��܂��B
     * @return �n�_����ԍ� ��߂��܂��B
     */
    public java.lang.String getPointIdentificationNumber() {
        return pointIdentificationNumber;
    }

    /**
     * �n�_����ԍ����Z�b�g���܂��B
     * @param pointIdentificationNumber �n�_����ԍ� ��ݒ�B
     */
    public void setPointIdentificationNumber(java.lang.String pointIdentificationNumber) {
        this.pointIdentificationNumber = pointIdentificationNumber;
    }

    /**
     * �ڑ��J�n�\�����Ԃ��܂��B
     * @return �ڑ��J�n�\��� ��߂��܂��B
     */
    public java.lang.String getTransportaionScheduledStartDate() {
        return transportaionScheduledStartDate;
    }

    /**
     * �ڑ��J�n�\������Z�b�g���܂��B
     * @param transportaionScheduledStartDate �ڑ��J�n�\��� ��ݒ�B
     */
    public void setTransportaionScheduledStartDate(java.lang.String transportaionScheduledStartDate) {
        this.transportaionScheduledStartDate = transportaionScheduledStartDate;
    }

    /**
     * �ڑ��p�~�\�����Ԃ��܂��B
     * @return �ڑ��p�~�\��� ��߂��܂��B
     */
    public java.lang.String getTransportaionScheduledEndDate() {
        return transportaionScheduledEndDate;
    }

    /**
     * �ڑ��p�~�\������Z�b�g���܂��B
     * @param transportaionScheduledEndDate �ڑ��p�~�\��� ��ݒ�B
     */
    public void setTransportaionScheduledEndDate(java.lang.String transportaionScheduledEndDate) {
        this.transportaionScheduledEndDate = transportaionScheduledEndDate;
    }

    /**
     * ���������Ǝ҃R�[�h��Ԃ��܂��B
     * @return ���������Ǝ҃R�[�h ��߂��܂��B
     */
    public java.lang.String getOldCompanyCd() {
        return oldCompanyCd;
    }

    /**
     * ���������Ǝ҃R�[�h���Z�b�g���܂��B
     * @param oldCompanyCd ���������Ǝ҃R�[�h ��ݒ�B
     */
    public void setOldCompanyCd(java.lang.String oldCompanyCd) {
        this.oldCompanyCd = oldCompanyCd;
    }

    /**
     * ���������Ǝ҂��q�l�ԍ���Ԃ��܂��B
     * @return ���������Ǝ҂��q�l�ԍ� ��߂��܂��B
     */
    public java.lang.String getOldCompanyCustomerCd() {
        return oldCompanyCustomerCd;
    }

    /**
     * ���������Ǝ҂��q�l�ԍ����Z�b�g���܂��B
     * @param oldCompanyCustomerCd ���������Ǝ҂��q�l�ԍ� ��ݒ�B
     */
    public void setOldCompanyCustomerCd(java.lang.String oldCompanyCustomerCd) {
        this.oldCompanyCustomerCd = oldCompanyCustomerCd;
    }

    /**
     * �����񊼋K��Ɋ�Â����珳����Ԃ��܂��B
     * @return �����񊼋K��Ɋ�Â����珳�� ��߂��܂��B
     */
    public java.math.BigDecimal getAgreement() {
        return agreement;
    }

    /**
     * �����񊼋K��Ɋ�Â����珳�����Z�b�g���܂��B
     * @param agreement �����񊼋K��Ɋ�Â����珳�� ��ݒ�B
     */
    public void setAgreement(java.math.BigDecimal agreement) {
        this.agreement = agreement;
    }

    /**
     * �ݔ����ύX�L���敪��Ԃ��܂��B
     * @return �ݔ����ύX�L���敪 ��߂��܂��B
     */
    public java.math.BigDecimal getFacilityInfoChangedClass() {
        return facilityInfoChangedClass;
    }

    /**
     * �ݔ����ύX�L���敪���Z�b�g���܂��B
     * @param facilityInfoChangedClass �ݔ����ύX�L���敪 ��ݒ�B
     */
    public void setFacilityInfoChangedClass(java.math.BigDecimal facilityInfoChangedClass) {
        this.facilityInfoChangedClass = facilityInfoChangedClass;
    }

    /**
     * �ݔ��P������Ԃ��܂��B
     * @return �ݔ��P���� ��߂��܂��B
     */
    public java.lang.String getFacilityRemovalDate() {
        return facilityRemovalDate;
    }

    /**
     * �ݔ��P�������Z�b�g���܂��B
     * @param facilityRemovalDate �ݔ��P���� ��ݒ�B
     */
    public void setFacilityRemovalDate(java.lang.String facilityRemovalDate) {
        this.facilityRemovalDate = facilityRemovalDate;
    }

    /**
     * �{�H��]������Ԃ��܂��B
     * @return �{�H��]���� ��߂��܂��B
     */
    public java.lang.String getConstructionScheduledTime() {
        return constructionScheduledTime;
    }

    /**
     * �{�H��]�������Z�b�g���܂��B
     * @param constructionScheduledTime �{�H��]���� ��ݒ�B
     */
    public void setConstructionScheduledTime(java.lang.String constructionScheduledTime) {
        this.constructionScheduledTime = constructionScheduledTime;
    }

    /**
     * ����ۂ�Ԃ��܂��B
     * @return ����� ��߂��܂��B
     */
    public java.math.BigDecimal getOnSiteWitnessing() {
        return onSiteWitnessing;
    }

    /**
     * ����ۂ��Z�b�g���܂��B
     * @param onSiteWitnessing ����� ��ݒ�B
     */
    public void setOnSiteWitnessing(java.math.BigDecimal onSiteWitnessing) {
        this.onSiteWitnessing = onSiteWitnessing;
    }

    /**
     * �����]����Ԃ��܂��B
     * @return �����]�� ��߂��܂��B
     */
    public java.lang.String getOnSiteWitnessingPreferredDate() {
        return onSiteWitnessingPreferredDate;
    }

    /**
     * �����]�����Z�b�g���܂��B
     * @param onSiteWitnessingPreferredDate �����]�� ��ݒ�B
     */
    public void setOnSiteWitnessingPreferredDate(java.lang.String onSiteWitnessingPreferredDate) {
        this.onSiteWitnessingPreferredDate = onSiteWitnessingPreferredDate;
    }

    /**
     * �����]������Ԃ��܂��B
     * @return �����]���� ��߂��܂��B
     */
    public java.lang.String getOnSiteWitnessingPreferredTime() {
        return onSiteWitnessingPreferredTime;
    }

    /**
     * �����]�������Z�b�g���܂��B
     * @param onSiteWitnessingPreferredTime �����]���� ��ݒ�B
     */
    public void setOnSiteWitnessingPreferredTime(java.lang.String onSiteWitnessingPreferredTime) {
        this.onSiteWitnessingPreferredTime = onSiteWitnessingPreferredTime;
    }

    /**
     * ����Ҏ�����Ԃ��܂��B
     * @return ����Ҏ��� ��߂��܂��B
     */
    public java.lang.String getWitness() {
        return witness;
    }

    /**
     * ����Ҏ������Z�b�g���܂��B
     * @param witness ����Ҏ��� ��ݒ�B
     */
    public void setWitness(java.lang.String witness) {
        this.witness = witness;
    }

    /**
     * �\���ҁi�敪�j��Ԃ��܂��B
     * @return �\���ҁi�敪�j ��߂��܂��B
     */
    public java.lang.String getApplicantClass() {
        return applicantClass;
    }

    /**
     * �\���ҁi�敪�j���Z�b�g���܂��B
     * @param applicantClass �\���ҁi�敪�j ��ݒ�B
     */
    public void setApplicantClass(java.lang.String applicantClass) {
        this.applicantClass = applicantClass;
    }

    /**
     * �\���Ҏ�����Ԃ��܂��B
     * @return �\���Ҏ��� ��߂��܂��B
     */
    public java.lang.String getApplicantName() {
        return applicantName;
    }

    /**
     * �\���Ҏ������Z�b�g���܂��B
     * @param applicantName �\���Ҏ��� ��ݒ�B
     */
    public void setApplicantName(java.lang.String applicantName) {
        this.applicantName = applicantName;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�敪�j��Ԃ��܂��B
     * @return �\���҂��A����d�b�ԍ��i�敪�j ��߂��܂��B
     */
    public java.lang.String getApplicantContactTelClass() {
        return applicantContactTelClass;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�敪�j���Z�b�g���܂��B
     * @param applicantContactTelClass �\���҂��A����d�b�ԍ��i�敪�j ��ݒ�B
     */
    public void setApplicantContactTelClass(java.lang.String applicantContactTelClass) {
        this.applicantContactTelClass = applicantContactTelClass;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�s�O�ǔԁj��Ԃ��܂��B
     * @return �\���҂��A����d�b�ԍ��i�s�O�ǔԁj ��߂��܂��B
     */
    public java.lang.String getApplicantContactTelAreaCode() {
        return applicantContactTelAreaCode;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�s�O�ǔԁj���Z�b�g���܂��B
     * @param applicantContactTelAreaCode �\���҂��A����d�b�ԍ��i�s�O�ǔԁj ��ݒ�B
     */
    public void setApplicantContactTelAreaCode(java.lang.String applicantContactTelAreaCode) {
        this.applicantContactTelAreaCode = applicantContactTelAreaCode;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�s���ǔԁj��Ԃ��܂��B
     * @return �\���҂��A����d�b�ԍ��i�s���ǔԁj ��߂��܂��B
     */
    public java.lang.String getApplicantContactTelcityNumber() {
        return applicantContactTelcityNumber;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�s���ǔԁj���Z�b�g���܂��B
     * @param applicantContactTelcityNumber �\���҂��A����d�b�ԍ��i�s���ǔԁj ��ݒ�B
     */
    public void setApplicantContactTelcityNumber(java.lang.String applicantContactTelcityNumber) {
        this.applicantContactTelcityNumber = applicantContactTelcityNumber;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�����Ҕԍ��j��Ԃ��܂��B
     * @return �\���҂��A����d�b�ԍ��i�����Ҕԍ��j ��߂��܂��B
     */
    public java.lang.String getApplicantContactTelSubscriberNumber() {
        return applicantContactTelSubscriberNumber;
    }

    /**
     * �\���҂��A����d�b�ԍ��i�����Ҕԍ��j���Z�b�g���܂��B
     * @param applicantContactTelSubscriberNumber �\���҂��A����d�b�ԍ��i�����Ҕԍ��j ��ݒ�B
     */
    public void setApplicantContactTelSubscriberNumber(java.lang.String applicantContactTelSubscriberNumber) {
        this.applicantContactTelSubscriberNumber = applicantContactTelSubscriberNumber;
    }

    /**
     * �G���A�敪��Ԃ��܂��B
     * @return �G���A�敪 ��߂��܂��B
     */
    public java.lang.String getAreaDivision() {
        return areaDivision;
    }

    /**
     * �G���A�敪���Z�b�g���܂��B
     * @param areaDivision �G���A�敪 ��ݒ�B
     */
    public void setAreaDivision(java.lang.String areaDivision) {
        this.areaDivision = areaDivision;
    }

    /**
     * ��_��_�����̌n��Ԃ��܂��B
     * @return ��_��_�����̌n ��߂��܂��B
     */
    public java.lang.String getMainContractCargingSystem() {
        return mainContractCargingSystem;
    }

    /**
     * ��_��_�����̌n���Z�b�g���܂��B
     * @param mainContractCargingSystem ��_��_�����̌n ��ݒ�B
     */
    public void setMainContractCargingSystem(java.lang.String mainContractCargingSystem) {
        this.mainContractCargingSystem = mainContractCargingSystem;
    }

    /**
     * ��_��_��{�����P����Ԃ��܂��B
     * @return ��_��_��{�����P�� ��߂��܂��B
     */
    public java.math.BigDecimal getMainContractBasicRate() {
        return mainContractBasicRate;
    }

    /**
     * ��_��_��{�����P�����Z�b�g���܂��B
     * @param mainContractBasicRate ��_��_��{�����P�� ��ݒ�B
     */
    public void setMainContractBasicRate(java.math.BigDecimal mainContractBasicRate) {
        this.mainContractBasicRate = mainContractBasicRate;
    }

    /**
     * ��_��_�_�񒴉ߋ�������Ԃ��܂��B
     * @return ��_��_�_�񒴉ߋ����� ��߂��܂��B
     */
    public java.math.BigDecimal getMainContractExcessChargeNeglect() {
        return mainContractExcessChargeNeglect;
    }

    /**
     * ��_��_�_�񒴉ߋ��������Z�b�g���܂��B
     * @param mainContractExcessChargeNeglect ��_��_�_�񒴉ߋ����� ��ݒ�B
     */
    public void setMainContractExcessChargeNeglect(java.math.BigDecimal mainContractExcessChargeNeglect) {
        this.mainContractExcessChargeNeglect = mainContractExcessChargeNeglect;
    }

    /**
     * ���ƕ�_�����̌n��Ԃ��܂��B
     * @return ���ƕ�_�����̌n ��߂��܂��B
     */
    public java.lang.String getPpgsChargingSystem() {
        return ppgsChargingSystem;
    }

    /**
     * ���ƕ�_�����̌n���Z�b�g���܂��B
     * @param ppgsChargingSystem ���ƕ�_�����̌n ��ݒ�B
     */
    public void setPpgsChargingSystem(java.lang.String ppgsChargingSystem) {
        this.ppgsChargingSystem = ppgsChargingSystem;
    }

    /**
     * ���ƕ�_��{�����P��_�g�p����Ԃ��܂��B
     * @return ���ƕ�_��{�����P��_�g�p�� ��߂��܂��B
     */
    public java.math.BigDecimal getPpgsBasicRateInCaseOfUse() {
        return ppgsBasicRateInCaseOfUse;
    }

    /**
     * ���ƕ�_��{�����P��_�g�p�����Z�b�g���܂��B
     * @param ppgsBasicRateInCaseOfUse ���ƕ�_��{�����P��_�g�p�� ��ݒ�B
     */
    public void setPpgsBasicRateInCaseOfUse(java.math.BigDecimal ppgsBasicRateInCaseOfUse) {
        this.ppgsBasicRateInCaseOfUse = ppgsBasicRateInCaseOfUse;
    }

    /**
     * ���ƕ�_��{�����P��_�s�g�p����Ԃ��܂��B
     * @return ���ƕ�_��{�����P��_�s�g�p�� ��߂��܂��B
     */
    public java.math.BigDecimal getPpgsBasicRateNotInCaseOfUse() {
        return ppgsBasicRateNotInCaseOfUse;
    }

    /**
     * ���ƕ�_��{�����P��_�s�g�p�����Z�b�g���܂��B
     * @param ppgsBasicRateNotInCaseOfUse ���ƕ�_��{�����P��_�s�g�p�� ��ݒ�B
     */
    public void setPpgsBasicRateNotInCaseOfUse(java.math.BigDecimal ppgsBasicRateNotInCaseOfUse) {
        this.ppgsBasicRateNotInCaseOfUse = ppgsBasicRateNotInCaseOfUse;
    }

    /**
     * ���ƕ�_��d�͎Z�o���@��Ԃ��܂��B
     * @return ���ƕ�_��d�͎Z�o���@ ��߂��܂��B
     */
    public java.lang.String getPpgsBasicPowerCalcMethod() {
        return ppgsBasicPowerCalcMethod;
    }

    /**
     * ���ƕ�_��d�͎Z�o���@���Z�b�g���܂��B
     * @param ppgsBasicPowerCalcMethod ���ƕ�_��d�͎Z�o���@ ��ݒ�B
     */
    public void setPpgsBasicPowerCalcMethod(java.lang.String ppgsBasicPowerCalcMethod) {
        this.ppgsBasicPowerCalcMethod = ppgsBasicPowerCalcMethod;
    }

    /**
     * ���ƕ�_��d�͂�Ԃ��܂��B
     * @return ���ƕ�_��d�� ��߂��܂��B
     */
    public java.math.BigDecimal getPpgsBasicPower() {
        return ppgsBasicPower;
    }

    /**
     * ���ƕ�_��d�͂��Z�b�g���܂��B
     * @param ppgsBasicPower ���ƕ�_��d�� ��ݒ�B
     */
    public void setPpgsBasicPower(java.math.BigDecimal ppgsBasicPower) {
        this.ppgsBasicPower = ppgsBasicPower;
    }

    /**
     * ���ƕ�_�]�ʂȂ���Ԃ��܂��B
     * @return ���ƕ�_�]�ʂȂ� ��߂��܂��B
     */
    public java.math.BigDecimal getPpgsNoMeasuredRateSystem() {
        return ppgsNoMeasuredRateSystem;
    }

    /**
     * ���ƕ�_�]�ʂȂ����Z�b�g���܂��B
     * @param ppgsNoMeasuredRateSystem ���ƕ�_�]�ʂȂ� ��ݒ�B
     */
    public void setPpgsNoMeasuredRateSystem(java.math.BigDecimal ppgsNoMeasuredRateSystem) {
        this.ppgsNoMeasuredRateSystem = ppgsNoMeasuredRateSystem;
    }

    /**
     * ���ƕ�_�g�p�ʎZ�o��Ԃ��܂��B
     * @return ���ƕ�_�g�p�ʎZ�o ��߂��܂��B
     */
    public java.math.BigDecimal getPpgsUsedAmountCalc() {
        return ppgsUsedAmountCalc;
    }

    /**
     * ���ƕ�_�g�p�ʎZ�o���Z�b�g���܂��B
     * @param ppgsUsedAmountCalc ���ƕ�_�g�p�ʎZ�o ��ݒ�B
     */
    public void setPpgsUsedAmountCalc(java.math.BigDecimal ppgsUsedAmountCalc) {
        this.ppgsUsedAmountCalc = ppgsUsedAmountCalc;
    }

    /**
     * ����������Ԃ��܂��B
     * @return �������� ��߂��܂��B
     */
    public java.lang.String getPartSupply() {
        return partSupply;
    }

    /**
     * �����������Z�b�g���܂��B
     * @param partSupply �������� ��ݒ�B
     */
    public void setPartSupply(java.lang.String partSupply) {
        this.partSupply = partSupply;
    }

    /**
     * ��������_���Ќ_��d�͂�Ԃ��܂��B
     * @return ��������_���Ќ_��d�� ��߂��܂��B
     */
    public java.math.BigDecimal getPartSupplyContractPower() {
        return partSupplyContractPower;
    }

    /**
     * ��������_���Ќ_��d�͂��Z�b�g���܂��B
     * @param partSupplyContractPower ��������_���Ќ_��d�� ��ݒ�B
     */
    public void setPartSupplyContractPower(java.math.BigDecimal partSupplyContractPower) {
        this.partSupplyContractPower = partSupplyContractPower;
    }

    /**
     * ��������_���Ќ_��d�͂�Ԃ��܂��B
     * @return ��������_���Ќ_��d�� ��߂��܂��B
     */
    public java.math.BigDecimal getPartSupplyOtherContractPower() {
        return partSupplyOtherContractPower;
    }

    /**
     * ��������_���Ќ_��d�͂��Z�b�g���܂��B
     * @param partSupplyOtherContractPower ��������_���Ќ_��d�� ��ݒ�B
     */
    public void setPartSupplyOtherContractPower(java.math.BigDecimal partSupplyOtherContractPower) {
        this.partSupplyOtherContractPower = partSupplyOtherContractPower;
    }

    /**
     * �Z����Ԃ�Ԃ��܂��B
     * @return �Z����� ��߂��܂��B
     */
    public java.math.BigDecimal getCalcPeriod() {
        return calcPeriod;
    }

    /**
     * �Z����Ԃ��Z�b�g���܂��B
     * @param calcPeriod �Z����� ��ݒ�B
     */
    public void setCalcPeriod(java.math.BigDecimal calcPeriod) {
        this.calcPeriod = calcPeriod;
    }

    /**
     * �w�������Ԃ��܂��B
     * @return �w����� ��߂��܂��B
     */
    public java.math.BigDecimal getSpecifiedDate() {
        return specifiedDate;
    }

    /**
     * �w��������Z�b�g���܂��B
     * @param specifiedDate �w����� ��ݒ�B
     */
    public void setSpecifiedDate(java.math.BigDecimal specifiedDate) {
        this.specifiedDate = specifiedDate;
    }

    /**
     * ���ƕ�_�_�񒴉ߋ�������Ԃ��܂��B
     * @return ���ƕ�_�_�񒴉ߋ����� ��߂��܂��B
     */
    public java.math.BigDecimal getPpgsContractExcessChargeNeglect() {
        return ppgsContractExcessChargeNeglect;
    }

    /**
     * ���ƕ�_�_�񒴉ߋ��������Z�b�g���܂��B
     * @param ppgsContractExcessChargeNeglect ���ƕ�_�_�񒴉ߋ����� ��ݒ�B
     */
    public void setPpgsContractExcessChargeNeglect(java.math.BigDecimal ppgsContractExcessChargeNeglect) {
        this.ppgsContractExcessChargeNeglect = ppgsContractExcessChargeNeglect;
    }

    /**
     * �ڑ����d�T�[�r�X���j���[��Ԃ��܂��B
     * @return �ڑ����d�T�[�r�X���j���[ ��߂��܂��B
     */
    public java.math.BigDecimal getPowerTransmissionServiceMenu() {
        return powerTransmissionServiceMenu;
    }

    /**
     * �ڑ����d�T�[�r�X���j���[���Z�b�g���܂��B
     * @param powerTransmissionServiceMenu �ڑ����d�T�[�r�X���j���[ ��ݒ�B
     */
    public void setPowerTransmissionServiceMenu(java.math.BigDecimal powerTransmissionServiceMenu) {
        this.powerTransmissionServiceMenu = powerTransmissionServiceMenu;
    }

    /**
     * �_�񌈒���@��Ԃ��܂��B
     * @return �_�񌈒���@ ��߂��܂��B
     */
    public java.lang.String getContractDeterminationMethod() {
        return contractDeterminationMethod;
    }

    /**
     * �_�񌈒���@���Z�b�g���܂��B
     * @param contractDeterminationMethod �_�񌈒���@ ��ݒ�B
     */
    public void setContractDeterminationMethod(java.lang.String contractDeterminationMethod) {
        this.contractDeterminationMethod = contractDeterminationMethod;
    }

    /**
     * �p�~���R��Ԃ��܂��B
     * @return �p�~���R ��߂��܂��B
     */
    public java.math.BigDecimal getAbolitionReason() {
        return abolitionReason;
    }

    /**
     * �p�~���R���Z�b�g���܂��B
     * @param abolitionReason �p�~���R ��ݒ�B
     */
    public void setAbolitionReason(java.math.BigDecimal abolitionReason) {
        this.abolitionReason = abolitionReason;
    }

    /**
     * ������̗L����Ԃ��܂��B
     * @return ������̗L�� ��߂��܂��B
     */
    public java.math.BigDecimal getBuildingDemolition() {
        return buildingDemolition;
    }

    /**
     * ������̗L�����Z�b�g���܂��B
     * @param buildingDemolition ������̗L�� ��ݒ�B
     */
    public void setBuildingDemolition(java.math.BigDecimal buildingDemolition) {
        this.buildingDemolition = buildingDemolition;
    }

    /**
     * ��̗\�����Ԃ��܂��B
     * @return ��̗\��� ��߂��܂��B
     */
    public java.lang.String getDemolitionScheduledDate() {
        return demolitionScheduledDate;
    }

    /**
     * ��̗\������Z�b�g���܂��B
     * @param demolitionScheduledDate ��̗\��� ��ݒ�B
     */
    public void setDemolitionScheduledDate(java.lang.String demolitionScheduledDate) {
        this.demolitionScheduledDate = demolitionScheduledDate;
    }

    /**
     * ��̗\�莞����Ԃ��܂��B
     * @return ��̗\�莞�� ��߂��܂��B
     */
    public java.lang.String getDemolitionScheduledTime() {
        return demolitionScheduledTime;
    }

    /**
     * ��̗\�莞�����Z�b�g���܂��B
     * @param demolitionScheduledTime ��̗\�莞�� ��ݒ�B
     */
    public void setDemolitionScheduledTime(java.lang.String demolitionScheduledTime) {
        this.demolitionScheduledTime = demolitionScheduledTime;
    }

    /**
     * �����\�莞����Ԃ��܂��B
     * @return �����\�莞�� ��߂��܂��B
     */
    public java.lang.String getMovingInScheduledTime() {
        return movingInScheduledTime;
    }

    /**
     * �����\�莞�����Z�b�g���܂��B
     * @param movingInScheduledTime �����\�莞�� ��ݒ�B
     */
    public void setMovingInScheduledTime(java.lang.String movingInScheduledTime) {
        this.movingInScheduledTime = movingInScheduledTime;
    }

    /**
     * �_��ύX�\��N������Ԃ��܂��B
     * @return �_��ύX�\��N���� ��߂��܂��B
     */
    public java.lang.String getContractChangeScheduledDate() {
        return contractChangeScheduledDate;
    }

    /**
     * �_��ύX�\��N�������Z�b�g���܂��B
     * @param contractChangeScheduledDate �_��ύX�\��N���� ��ݒ�B
     */
    public void setContractChangeScheduledDate(java.lang.String contractChangeScheduledDate) {
        this.contractChangeScheduledDate = contractChangeScheduledDate;
    }

    /**
     * �_��d����]��Ԃ��܂��B
     * @return �_��d����] ��߂��܂��B
     */
    public java.lang.String getDesiredContractCurrent() {
        return desiredContractCurrent;
    }

    /**
     * �_��d����]���Z�b�g���܂��B
     * @param desiredContractCurrent �_��d����] ��ݒ�B
     */
    public void setDesiredContractCurrent(java.lang.String desiredContractCurrent) {
        this.desiredContractCurrent = desiredContractCurrent;
    }

    /**
     * �o���O�A���v�ۂ�Ԃ��܂��B
     * @return �o���O�A���v�� ��߂��܂��B
     */
    public java.math.BigDecimal getContactNecessity() {
        return contactNecessity;
    }

    /**
     * �o���O�A���v�ۂ��Z�b�g���܂��B
     * @param contactNecessity �o���O�A���v�� ��ݒ�B
     */
    public void setContactNecessity(java.math.BigDecimal contactNecessity) {
        this.contactNecessity = contactNecessity;
    }

    /**
     * ���j���̑I����Ԃ��܂��B
     * @return ���j���̑I�� ��߂��܂��B
     */
    public java.math.BigDecimal getMeterReadingDay() {
        return meterReadingDay;
    }

    /**
     * ���j���̑I�����Z�b�g���܂��B
     * @param meterReadingDay ���j���̑I�� ��ݒ�B
     */
    public void setMeterReadingDay(java.math.BigDecimal meterReadingDay) {
        this.meterReadingDay = meterReadingDay;
    }

    /**
     * �����]������Ԃ��܂��B
     * @return �����]���� ��߂��܂��B
     */
    public java.lang.String getWitnessDesiredTime() {
        return witnessDesiredTime;
    }

    /**
     * �����]�������Z�b�g���܂��B
     * @param witnessDesiredTime �����]���� ��ݒ�B
     */
    public void setWitnessDesiredTime(java.lang.String witnessDesiredTime) {
        this.witnessDesiredTime = witnessDesiredTime;
    }

    /**
     * �_��҃R�[�h��Ԃ��܂��B
     * @return �_��҃R�[�h ��߂��܂��B
     */
    public java.lang.String getContractCd() {
        return contractCd;
    }

    /**
     * �_��҃R�[�h���Z�b�g���܂��B
     * @param contractCd �_��҃R�[�h ��ݒ�B
     */
    public void setContractCd(java.lang.String contractCd) {
        this.contractCd = contractCd;
    }

    /**
     * �A�Ԃ�Ԃ��܂��B
     * @return �A�� ��߂��܂��B
     */
    public java.lang.String getContractSeqNo() {
        return contractSeqNo;
    }

    /**
     * �A�Ԃ��Z�b�g���܂��B
     * @param contractSeqNo �A�� ��ݒ�B
     */
    public void setContractSeqNo(java.lang.String contractSeqNo) {
        this.contractSeqNo = contractSeqNo;
    }


    /**
     * �_����ꗗ���f���̓��o�͏�񃂃f���̕�����X�i�b�v�V���b�g��Ԃ��܂��B
     * @return �_����ꗗ���f���̓��o�͏�񃂃f���̕�����X�i�b�v�V���b�g
     */
    @Override
    public String toString(){
    	return "�_����ꗗ���f�� " + super.toString() + new ToStringBuilder(this)
    		.append("�ǃR�[�h(stationCd)", getStationCd())
    		.append("�ڋq�R�[�h(customerCd)", getCustomerCd())
    		.append("�A��(seqNo)", getSeqNo())
    		.append("�n�_����ԍ�(pointIdentificationNumber)", getPointIdentificationNumber())
    		.append("�ڑ��J�n�\���(transportaionScheduledStartDate)", getTransportaionScheduledStartDate())
    		.append("�ڑ��p�~�\���(transportaionScheduledEndDate)", getTransportaionScheduledEndDate())
    		.append("���������Ǝ҃R�[�h(oldCompanyCd)", getOldCompanyCd())
    		.append("���������Ǝ҂��q�l�ԍ�(oldCompanyCustomerCd)", getOldCompanyCustomerCd())
    		.append("�����񊼋K��Ɋ�Â����珳��(agreement)", getAgreement())
    		.append("�ݔ����ύX�L���敪(facilityInfoChangedClass)", getFacilityInfoChangedClass())
    		.append("�ݔ��P����(facilityRemovalDate)", getFacilityRemovalDate())
    		.append("�{�H��]����(constructionScheduledTime)", getConstructionScheduledTime())
    		.append("�����(onSiteWitnessing)", getOnSiteWitnessing())
    		.append("�����]��(onSiteWitnessingPreferredDate)", getOnSiteWitnessingPreferredDate())
    		.append("�����]����(onSiteWitnessingPreferredTime)", getOnSiteWitnessingPreferredTime())
    		.append("����Ҏ���(witness)", getWitness())
    		.append("�\���ҁi�敪�j(applicantClass)", getApplicantClass())
    		.append("�\���Ҏ���(applicantName)", getApplicantName())
    		.append("�\���҂��A����d�b�ԍ��i�敪�j(applicantContactTelClass)", getApplicantContactTelClass())
    		.append("�\���҂��A����d�b�ԍ��i�s�O�ǔԁj(applicantContactTelAreaCode)", getApplicantContactTelAreaCode())
    		.append("�\���҂��A����d�b�ԍ��i�s���ǔԁj(applicantContactTelcityNumber)", getApplicantContactTelcityNumber())
    		.append("�\���҂��A����d�b�ԍ��i�����Ҕԍ��j(applicantContactTelSubscriberNumber)", getApplicantContactTelSubscriberNumber())
    		.append("�G���A�敪(areaDivision)", getAreaDivision())
    		.append("��_��_�����̌n(mainContractCargingSystem)", getMainContractCargingSystem())
    		.append("��_��_��{�����P��(mainContractBasicRate)", getMainContractBasicRate())
    		.append("��_��_�_�񒴉ߋ�����(mainContractExcessChargeNeglect)", getMainContractExcessChargeNeglect())
    		.append("���ƕ�_�����̌n(ppgsChargingSystem)", getPpgsChargingSystem())
    		.append("���ƕ�_��{�����P��_�g�p��(ppgsBasicRateInCaseOfUse)", getPpgsBasicRateInCaseOfUse())
    		.append("���ƕ�_��{�����P��_�s�g�p��(ppgsBasicRateNotInCaseOfUse)", getPpgsBasicRateNotInCaseOfUse())
    		.append("���ƕ�_��d�͎Z�o���@(ppgsBasicPowerCalcMethod)", getPpgsBasicPowerCalcMethod())
    		.append("���ƕ�_��d��(ppgsBasicPower)", getPpgsBasicPower())
    		.append("���ƕ�_�]�ʂȂ�(ppgsNoMeasuredRateSystem)", getPpgsNoMeasuredRateSystem())
    		.append("���ƕ�_�g�p�ʎZ�o(ppgsUsedAmountCalc)", getPpgsUsedAmountCalc())
    		.append("��������(partSupply)", getPartSupply())
    		.append("��������_���Ќ_��d��(partSupplyContractPower)", getPartSupplyContractPower())
    		.append("��������_���Ќ_��d��(partSupplyOtherContractPower)", getPartSupplyOtherContractPower())
    		.append("�Z�����(calcPeriod)", getCalcPeriod())
    		.append("�w�����(specifiedDate)", getSpecifiedDate())
    		.append("���ƕ�_�_�񒴉ߋ�����(ppgsContractExcessChargeNeglect)", getPpgsContractExcessChargeNeglect())
    		.append("�ڑ����d�T�[�r�X���j���[(powerTransmissionServiceMenu)", getPowerTransmissionServiceMenu())
    		.append("�_�񌈒���@(contractDeterminationMethod)", getContractDeterminationMethod())
    		.append("�p�~���R(abolitionReason)", getAbolitionReason())
    		.append("������̗L��(buildingDemolition)", getBuildingDemolition())
    		.append("��̗\���(demolitionScheduledDate)", getDemolitionScheduledDate())
    		.append("��̗\�莞��(demolitionScheduledTime)", getDemolitionScheduledTime())
    		.append("�����\�莞��(movingInScheduledTime)", getMovingInScheduledTime())
    		.append("�_��ύX�\��N����(contractChangeScheduledDate)", getContractChangeScheduledDate())
    		.append("�_��d����](desiredContractCurrent)", getDesiredContractCurrent())
    		.append("�o���O�A���v��(contactNecessity)", getContactNecessity())
    		.append("���j���̑I��(meterReadingDay)", getMeterReadingDay())
    		.append("�����]����(witnessDesiredTime)", getWitnessDesiredTime())
    		.append("�_��҃R�[�h(contractCd)", getContractCd())
    		.append("�A��(contractSeqNo)", getContractSeqNo())
    		.toString();
    }
}
