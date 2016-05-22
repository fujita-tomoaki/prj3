/*
 * @(#)GetSwitchingContractInfoResult.java
 * Product: CatManagerVer5
 * copyright(C) iTEC Hankyu Hanshin Co., Ltd All rights reserved.
 */
package com.common.dao.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * 契約情報一覧モデルの入出力情報モデルクラスです。<BR/>
 * 契約情報一覧モデル
 * 自動生成対象ですので、実装者は拡張してはいけません。
 *
 * @author iTEC Hankyu Hanshin Co., Ltd.
 * @since CatManager EX
 */
@SuppressWarnings("serial")
public class GetSwitchingContractInfoResult implements Serializable {

//--- プロパティフィールド

    /** 局コード */
    private java.lang.String stationCd;
    /** 顧客コード */
    private java.lang.String customerCd;
    /** 連番 */
    private java.math.BigDecimal seqNo;
    /** 地点特定番号 */
    private java.lang.String pointIdentificationNumber;
    /** 接続開始予定日 */
    private java.lang.String transportaionScheduledStartDate;
    /** 接続廃止予定日 */
    private java.lang.String transportaionScheduledEndDate;
    /** 旧小売事業者コード */
    private java.lang.String oldCompanyCd;
    /** 旧小売事業者お客様番号 */
    private java.lang.String oldCompanyCustomerCd;
    /** 託送約款規定に基づく遵守承諾 */
    private java.math.BigDecimal agreement;
    /** 設備情報変更有無区分 */
    private java.math.BigDecimal facilityInfoChangedClass;
    /** 設備撤去日 */
    private java.lang.String facilityRemovalDate;
    /** 施工希望時刻 */
    private java.lang.String constructionScheduledTime;
    /** 立会可否 */
    private java.math.BigDecimal onSiteWitnessing;
    /** 立会希望日 */
    private java.lang.String onSiteWitnessingPreferredDate;
    /** 立会希望時刻 */
    private java.lang.String onSiteWitnessingPreferredTime;
    /** 立会者氏名 */
    private java.lang.String witness;
    /** 申込者（区分） */
    private java.lang.String applicantClass;
    /** 申込者氏名 */
    private java.lang.String applicantName;
    /** 申込者ご連絡先電話番号（区分） */
    private java.lang.String applicantContactTelClass;
    /** 申込者ご連絡先電話番号（市外局番） */
    private java.lang.String applicantContactTelAreaCode;
    /** 申込者ご連絡先電話番号（市内局番） */
    private java.lang.String applicantContactTelcityNumber;
    /** 申込者ご連絡先電話番号（加入者番号） */
    private java.lang.String applicantContactTelSubscriberNumber;
    /** エリア区分 */
    private java.lang.String areaDivision;
    /** 主契約_料金体系 */
    private java.lang.String mainContractCargingSystem;
    /** 主契約_基本料金単価 */
    private java.math.BigDecimal mainContractBasicRate;
    /** 主契約_契約超過金無視 */
    private java.math.BigDecimal mainContractExcessChargeNeglect;
    /** 自家補_料金体系 */
    private java.lang.String ppgsChargingSystem;
    /** 自家補_基本料金単価_使用時 */
    private java.math.BigDecimal ppgsBasicRateInCaseOfUse;
    /** 自家補_基本料金単価_不使用時 */
    private java.math.BigDecimal ppgsBasicRateNotInCaseOfUse;
    /** 自家補_基準電力算出方法 */
    private java.lang.String ppgsBasicPowerCalcMethod;
    /** 自家補_基準電力 */
    private java.math.BigDecimal ppgsBasicPower;
    /** 自家補_従量なし */
    private java.math.BigDecimal ppgsNoMeasuredRateSystem;
    /** 自家補_使用量算出 */
    private java.math.BigDecimal ppgsUsedAmountCalc;
    /** 部分供給 */
    private java.lang.String partSupply;
    /** 部分供給_自社契約電力 */
    private java.math.BigDecimal partSupplyContractPower;
    /** 部分供給_他社契約電力 */
    private java.math.BigDecimal partSupplyOtherContractPower;
    /** 算定期間 */
    private java.math.BigDecimal calcPeriod;
    /** 指定期日 */
    private java.math.BigDecimal specifiedDate;
    /** 自家補_契約超過金無視 */
    private java.math.BigDecimal ppgsContractExcessChargeNeglect;
    /** 接続送電サービスメニュー */
    private java.math.BigDecimal powerTransmissionServiceMenu;
    /** 契約決定方法 */
    private java.lang.String contractDeterminationMethod;
    /** 廃止理由 */
    private java.math.BigDecimal abolitionReason;
    /** 建物解体有無 */
    private java.math.BigDecimal buildingDemolition;
    /** 解体予定日 */
    private java.lang.String demolitionScheduledDate;
    /** 解体予定時刻 */
    private java.lang.String demolitionScheduledTime;
    /** 入居予定時刻 */
    private java.lang.String movingInScheduledTime;
    /** 契約変更予定年月日 */
    private java.lang.String contractChangeScheduledDate;
    /** 契約電流希望 */
    private java.lang.String desiredContractCurrent;
    /** 出向前連絡要否 */
    private java.math.BigDecimal contactNecessity;
    /** 検針日の選択 */
    private java.math.BigDecimal meterReadingDay;
    /** 立会希望時刻 */
    private java.lang.String witnessDesiredTime;
    /** 契約者コード */
    private java.lang.String contractCd;
    /** 連番 */
    private java.lang.String contractSeqNo;

//--- コンストラクタ

    /**
     * このオブジェクトが生成されるときに呼び出されます。
     */
    public GetSwitchingContractInfoResult() {
        super();
    }

//--- プロパティメソッド

    /**
     * 局コードを返します。
     * @return 局コード を戻します。
     */
    public java.lang.String getStationCd() {
        return stationCd;
    }

    /**
     * 局コードをセットします。
     * @param stationCd 局コード を設定。
     */
    public void setStationCd(java.lang.String stationCd) {
        this.stationCd = stationCd;
    }

    /**
     * 顧客コードを返します。
     * @return 顧客コード を戻します。
     */
    public java.lang.String getCustomerCd() {
        return customerCd;
    }

    /**
     * 顧客コードをセットします。
     * @param customerCd 顧客コード を設定。
     */
    public void setCustomerCd(java.lang.String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * 連番を返します。
     * @return 連番 を戻します。
     */
    public java.math.BigDecimal getSeqNo() {
        return seqNo;
    }

    /**
     * 連番をセットします。
     * @param seqNo 連番 を設定。
     */
    public void setSeqNo(java.math.BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * 地点特定番号を返します。
     * @return 地点特定番号 を戻します。
     */
    public java.lang.String getPointIdentificationNumber() {
        return pointIdentificationNumber;
    }

    /**
     * 地点特定番号をセットします。
     * @param pointIdentificationNumber 地点特定番号 を設定。
     */
    public void setPointIdentificationNumber(java.lang.String pointIdentificationNumber) {
        this.pointIdentificationNumber = pointIdentificationNumber;
    }

    /**
     * 接続開始予定日を返します。
     * @return 接続開始予定日 を戻します。
     */
    public java.lang.String getTransportaionScheduledStartDate() {
        return transportaionScheduledStartDate;
    }

    /**
     * 接続開始予定日をセットします。
     * @param transportaionScheduledStartDate 接続開始予定日 を設定。
     */
    public void setTransportaionScheduledStartDate(java.lang.String transportaionScheduledStartDate) {
        this.transportaionScheduledStartDate = transportaionScheduledStartDate;
    }

    /**
     * 接続廃止予定日を返します。
     * @return 接続廃止予定日 を戻します。
     */
    public java.lang.String getTransportaionScheduledEndDate() {
        return transportaionScheduledEndDate;
    }

    /**
     * 接続廃止予定日をセットします。
     * @param transportaionScheduledEndDate 接続廃止予定日 を設定。
     */
    public void setTransportaionScheduledEndDate(java.lang.String transportaionScheduledEndDate) {
        this.transportaionScheduledEndDate = transportaionScheduledEndDate;
    }

    /**
     * 旧小売事業者コードを返します。
     * @return 旧小売事業者コード を戻します。
     */
    public java.lang.String getOldCompanyCd() {
        return oldCompanyCd;
    }

    /**
     * 旧小売事業者コードをセットします。
     * @param oldCompanyCd 旧小売事業者コード を設定。
     */
    public void setOldCompanyCd(java.lang.String oldCompanyCd) {
        this.oldCompanyCd = oldCompanyCd;
    }

    /**
     * 旧小売事業者お客様番号を返します。
     * @return 旧小売事業者お客様番号 を戻します。
     */
    public java.lang.String getOldCompanyCustomerCd() {
        return oldCompanyCustomerCd;
    }

    /**
     * 旧小売事業者お客様番号をセットします。
     * @param oldCompanyCustomerCd 旧小売事業者お客様番号 を設定。
     */
    public void setOldCompanyCustomerCd(java.lang.String oldCompanyCustomerCd) {
        this.oldCompanyCustomerCd = oldCompanyCustomerCd;
    }

    /**
     * 託送約款規定に基づく遵守承諾を返します。
     * @return 託送約款規定に基づく遵守承諾 を戻します。
     */
    public java.math.BigDecimal getAgreement() {
        return agreement;
    }

    /**
     * 託送約款規定に基づく遵守承諾をセットします。
     * @param agreement 託送約款規定に基づく遵守承諾 を設定。
     */
    public void setAgreement(java.math.BigDecimal agreement) {
        this.agreement = agreement;
    }

    /**
     * 設備情報変更有無区分を返します。
     * @return 設備情報変更有無区分 を戻します。
     */
    public java.math.BigDecimal getFacilityInfoChangedClass() {
        return facilityInfoChangedClass;
    }

    /**
     * 設備情報変更有無区分をセットします。
     * @param facilityInfoChangedClass 設備情報変更有無区分 を設定。
     */
    public void setFacilityInfoChangedClass(java.math.BigDecimal facilityInfoChangedClass) {
        this.facilityInfoChangedClass = facilityInfoChangedClass;
    }

    /**
     * 設備撤去日を返します。
     * @return 設備撤去日 を戻します。
     */
    public java.lang.String getFacilityRemovalDate() {
        return facilityRemovalDate;
    }

    /**
     * 設備撤去日をセットします。
     * @param facilityRemovalDate 設備撤去日 を設定。
     */
    public void setFacilityRemovalDate(java.lang.String facilityRemovalDate) {
        this.facilityRemovalDate = facilityRemovalDate;
    }

    /**
     * 施工希望時刻を返します。
     * @return 施工希望時刻 を戻します。
     */
    public java.lang.String getConstructionScheduledTime() {
        return constructionScheduledTime;
    }

    /**
     * 施工希望時刻をセットします。
     * @param constructionScheduledTime 施工希望時刻 を設定。
     */
    public void setConstructionScheduledTime(java.lang.String constructionScheduledTime) {
        this.constructionScheduledTime = constructionScheduledTime;
    }

    /**
     * 立会可否を返します。
     * @return 立会可否 を戻します。
     */
    public java.math.BigDecimal getOnSiteWitnessing() {
        return onSiteWitnessing;
    }

    /**
     * 立会可否をセットします。
     * @param onSiteWitnessing 立会可否 を設定。
     */
    public void setOnSiteWitnessing(java.math.BigDecimal onSiteWitnessing) {
        this.onSiteWitnessing = onSiteWitnessing;
    }

    /**
     * 立会希望日を返します。
     * @return 立会希望日 を戻します。
     */
    public java.lang.String getOnSiteWitnessingPreferredDate() {
        return onSiteWitnessingPreferredDate;
    }

    /**
     * 立会希望日をセットします。
     * @param onSiteWitnessingPreferredDate 立会希望日 を設定。
     */
    public void setOnSiteWitnessingPreferredDate(java.lang.String onSiteWitnessingPreferredDate) {
        this.onSiteWitnessingPreferredDate = onSiteWitnessingPreferredDate;
    }

    /**
     * 立会希望時刻を返します。
     * @return 立会希望時刻 を戻します。
     */
    public java.lang.String getOnSiteWitnessingPreferredTime() {
        return onSiteWitnessingPreferredTime;
    }

    /**
     * 立会希望時刻をセットします。
     * @param onSiteWitnessingPreferredTime 立会希望時刻 を設定。
     */
    public void setOnSiteWitnessingPreferredTime(java.lang.String onSiteWitnessingPreferredTime) {
        this.onSiteWitnessingPreferredTime = onSiteWitnessingPreferredTime;
    }

    /**
     * 立会者氏名を返します。
     * @return 立会者氏名 を戻します。
     */
    public java.lang.String getWitness() {
        return witness;
    }

    /**
     * 立会者氏名をセットします。
     * @param witness 立会者氏名 を設定。
     */
    public void setWitness(java.lang.String witness) {
        this.witness = witness;
    }

    /**
     * 申込者（区分）を返します。
     * @return 申込者（区分） を戻します。
     */
    public java.lang.String getApplicantClass() {
        return applicantClass;
    }

    /**
     * 申込者（区分）をセットします。
     * @param applicantClass 申込者（区分） を設定。
     */
    public void setApplicantClass(java.lang.String applicantClass) {
        this.applicantClass = applicantClass;
    }

    /**
     * 申込者氏名を返します。
     * @return 申込者氏名 を戻します。
     */
    public java.lang.String getApplicantName() {
        return applicantName;
    }

    /**
     * 申込者氏名をセットします。
     * @param applicantName 申込者氏名 を設定。
     */
    public void setApplicantName(java.lang.String applicantName) {
        this.applicantName = applicantName;
    }

    /**
     * 申込者ご連絡先電話番号（区分）を返します。
     * @return 申込者ご連絡先電話番号（区分） を戻します。
     */
    public java.lang.String getApplicantContactTelClass() {
        return applicantContactTelClass;
    }

    /**
     * 申込者ご連絡先電話番号（区分）をセットします。
     * @param applicantContactTelClass 申込者ご連絡先電話番号（区分） を設定。
     */
    public void setApplicantContactTelClass(java.lang.String applicantContactTelClass) {
        this.applicantContactTelClass = applicantContactTelClass;
    }

    /**
     * 申込者ご連絡先電話番号（市外局番）を返します。
     * @return 申込者ご連絡先電話番号（市外局番） を戻します。
     */
    public java.lang.String getApplicantContactTelAreaCode() {
        return applicantContactTelAreaCode;
    }

    /**
     * 申込者ご連絡先電話番号（市外局番）をセットします。
     * @param applicantContactTelAreaCode 申込者ご連絡先電話番号（市外局番） を設定。
     */
    public void setApplicantContactTelAreaCode(java.lang.String applicantContactTelAreaCode) {
        this.applicantContactTelAreaCode = applicantContactTelAreaCode;
    }

    /**
     * 申込者ご連絡先電話番号（市内局番）を返します。
     * @return 申込者ご連絡先電話番号（市内局番） を戻します。
     */
    public java.lang.String getApplicantContactTelcityNumber() {
        return applicantContactTelcityNumber;
    }

    /**
     * 申込者ご連絡先電話番号（市内局番）をセットします。
     * @param applicantContactTelcityNumber 申込者ご連絡先電話番号（市内局番） を設定。
     */
    public void setApplicantContactTelcityNumber(java.lang.String applicantContactTelcityNumber) {
        this.applicantContactTelcityNumber = applicantContactTelcityNumber;
    }

    /**
     * 申込者ご連絡先電話番号（加入者番号）を返します。
     * @return 申込者ご連絡先電話番号（加入者番号） を戻します。
     */
    public java.lang.String getApplicantContactTelSubscriberNumber() {
        return applicantContactTelSubscriberNumber;
    }

    /**
     * 申込者ご連絡先電話番号（加入者番号）をセットします。
     * @param applicantContactTelSubscriberNumber 申込者ご連絡先電話番号（加入者番号） を設定。
     */
    public void setApplicantContactTelSubscriberNumber(java.lang.String applicantContactTelSubscriberNumber) {
        this.applicantContactTelSubscriberNumber = applicantContactTelSubscriberNumber;
    }

    /**
     * エリア区分を返します。
     * @return エリア区分 を戻します。
     */
    public java.lang.String getAreaDivision() {
        return areaDivision;
    }

    /**
     * エリア区分をセットします。
     * @param areaDivision エリア区分 を設定。
     */
    public void setAreaDivision(java.lang.String areaDivision) {
        this.areaDivision = areaDivision;
    }

    /**
     * 主契約_料金体系を返します。
     * @return 主契約_料金体系 を戻します。
     */
    public java.lang.String getMainContractCargingSystem() {
        return mainContractCargingSystem;
    }

    /**
     * 主契約_料金体系をセットします。
     * @param mainContractCargingSystem 主契約_料金体系 を設定。
     */
    public void setMainContractCargingSystem(java.lang.String mainContractCargingSystem) {
        this.mainContractCargingSystem = mainContractCargingSystem;
    }

    /**
     * 主契約_基本料金単価を返します。
     * @return 主契約_基本料金単価 を戻します。
     */
    public java.math.BigDecimal getMainContractBasicRate() {
        return mainContractBasicRate;
    }

    /**
     * 主契約_基本料金単価をセットします。
     * @param mainContractBasicRate 主契約_基本料金単価 を設定。
     */
    public void setMainContractBasicRate(java.math.BigDecimal mainContractBasicRate) {
        this.mainContractBasicRate = mainContractBasicRate;
    }

    /**
     * 主契約_契約超過金無視を返します。
     * @return 主契約_契約超過金無視 を戻します。
     */
    public java.math.BigDecimal getMainContractExcessChargeNeglect() {
        return mainContractExcessChargeNeglect;
    }

    /**
     * 主契約_契約超過金無視をセットします。
     * @param mainContractExcessChargeNeglect 主契約_契約超過金無視 を設定。
     */
    public void setMainContractExcessChargeNeglect(java.math.BigDecimal mainContractExcessChargeNeglect) {
        this.mainContractExcessChargeNeglect = mainContractExcessChargeNeglect;
    }

    /**
     * 自家補_料金体系を返します。
     * @return 自家補_料金体系 を戻します。
     */
    public java.lang.String getPpgsChargingSystem() {
        return ppgsChargingSystem;
    }

    /**
     * 自家補_料金体系をセットします。
     * @param ppgsChargingSystem 自家補_料金体系 を設定。
     */
    public void setPpgsChargingSystem(java.lang.String ppgsChargingSystem) {
        this.ppgsChargingSystem = ppgsChargingSystem;
    }

    /**
     * 自家補_基本料金単価_使用時を返します。
     * @return 自家補_基本料金単価_使用時 を戻します。
     */
    public java.math.BigDecimal getPpgsBasicRateInCaseOfUse() {
        return ppgsBasicRateInCaseOfUse;
    }

    /**
     * 自家補_基本料金単価_使用時をセットします。
     * @param ppgsBasicRateInCaseOfUse 自家補_基本料金単価_使用時 を設定。
     */
    public void setPpgsBasicRateInCaseOfUse(java.math.BigDecimal ppgsBasicRateInCaseOfUse) {
        this.ppgsBasicRateInCaseOfUse = ppgsBasicRateInCaseOfUse;
    }

    /**
     * 自家補_基本料金単価_不使用時を返します。
     * @return 自家補_基本料金単価_不使用時 を戻します。
     */
    public java.math.BigDecimal getPpgsBasicRateNotInCaseOfUse() {
        return ppgsBasicRateNotInCaseOfUse;
    }

    /**
     * 自家補_基本料金単価_不使用時をセットします。
     * @param ppgsBasicRateNotInCaseOfUse 自家補_基本料金単価_不使用時 を設定。
     */
    public void setPpgsBasicRateNotInCaseOfUse(java.math.BigDecimal ppgsBasicRateNotInCaseOfUse) {
        this.ppgsBasicRateNotInCaseOfUse = ppgsBasicRateNotInCaseOfUse;
    }

    /**
     * 自家補_基準電力算出方法を返します。
     * @return 自家補_基準電力算出方法 を戻します。
     */
    public java.lang.String getPpgsBasicPowerCalcMethod() {
        return ppgsBasicPowerCalcMethod;
    }

    /**
     * 自家補_基準電力算出方法をセットします。
     * @param ppgsBasicPowerCalcMethod 自家補_基準電力算出方法 を設定。
     */
    public void setPpgsBasicPowerCalcMethod(java.lang.String ppgsBasicPowerCalcMethod) {
        this.ppgsBasicPowerCalcMethod = ppgsBasicPowerCalcMethod;
    }

    /**
     * 自家補_基準電力を返します。
     * @return 自家補_基準電力 を戻します。
     */
    public java.math.BigDecimal getPpgsBasicPower() {
        return ppgsBasicPower;
    }

    /**
     * 自家補_基準電力をセットします。
     * @param ppgsBasicPower 自家補_基準電力 を設定。
     */
    public void setPpgsBasicPower(java.math.BigDecimal ppgsBasicPower) {
        this.ppgsBasicPower = ppgsBasicPower;
    }

    /**
     * 自家補_従量なしを返します。
     * @return 自家補_従量なし を戻します。
     */
    public java.math.BigDecimal getPpgsNoMeasuredRateSystem() {
        return ppgsNoMeasuredRateSystem;
    }

    /**
     * 自家補_従量なしをセットします。
     * @param ppgsNoMeasuredRateSystem 自家補_従量なし を設定。
     */
    public void setPpgsNoMeasuredRateSystem(java.math.BigDecimal ppgsNoMeasuredRateSystem) {
        this.ppgsNoMeasuredRateSystem = ppgsNoMeasuredRateSystem;
    }

    /**
     * 自家補_使用量算出を返します。
     * @return 自家補_使用量算出 を戻します。
     */
    public java.math.BigDecimal getPpgsUsedAmountCalc() {
        return ppgsUsedAmountCalc;
    }

    /**
     * 自家補_使用量算出をセットします。
     * @param ppgsUsedAmountCalc 自家補_使用量算出 を設定。
     */
    public void setPpgsUsedAmountCalc(java.math.BigDecimal ppgsUsedAmountCalc) {
        this.ppgsUsedAmountCalc = ppgsUsedAmountCalc;
    }

    /**
     * 部分供給を返します。
     * @return 部分供給 を戻します。
     */
    public java.lang.String getPartSupply() {
        return partSupply;
    }

    /**
     * 部分供給をセットします。
     * @param partSupply 部分供給 を設定。
     */
    public void setPartSupply(java.lang.String partSupply) {
        this.partSupply = partSupply;
    }

    /**
     * 部分供給_自社契約電力を返します。
     * @return 部分供給_自社契約電力 を戻します。
     */
    public java.math.BigDecimal getPartSupplyContractPower() {
        return partSupplyContractPower;
    }

    /**
     * 部分供給_自社契約電力をセットします。
     * @param partSupplyContractPower 部分供給_自社契約電力 を設定。
     */
    public void setPartSupplyContractPower(java.math.BigDecimal partSupplyContractPower) {
        this.partSupplyContractPower = partSupplyContractPower;
    }

    /**
     * 部分供給_他社契約電力を返します。
     * @return 部分供給_他社契約電力 を戻します。
     */
    public java.math.BigDecimal getPartSupplyOtherContractPower() {
        return partSupplyOtherContractPower;
    }

    /**
     * 部分供給_他社契約電力をセットします。
     * @param partSupplyOtherContractPower 部分供給_他社契約電力 を設定。
     */
    public void setPartSupplyOtherContractPower(java.math.BigDecimal partSupplyOtherContractPower) {
        this.partSupplyOtherContractPower = partSupplyOtherContractPower;
    }

    /**
     * 算定期間を返します。
     * @return 算定期間 を戻します。
     */
    public java.math.BigDecimal getCalcPeriod() {
        return calcPeriod;
    }

    /**
     * 算定期間をセットします。
     * @param calcPeriod 算定期間 を設定。
     */
    public void setCalcPeriod(java.math.BigDecimal calcPeriod) {
        this.calcPeriod = calcPeriod;
    }

    /**
     * 指定期日を返します。
     * @return 指定期日 を戻します。
     */
    public java.math.BigDecimal getSpecifiedDate() {
        return specifiedDate;
    }

    /**
     * 指定期日をセットします。
     * @param specifiedDate 指定期日 を設定。
     */
    public void setSpecifiedDate(java.math.BigDecimal specifiedDate) {
        this.specifiedDate = specifiedDate;
    }

    /**
     * 自家補_契約超過金無視を返します。
     * @return 自家補_契約超過金無視 を戻します。
     */
    public java.math.BigDecimal getPpgsContractExcessChargeNeglect() {
        return ppgsContractExcessChargeNeglect;
    }

    /**
     * 自家補_契約超過金無視をセットします。
     * @param ppgsContractExcessChargeNeglect 自家補_契約超過金無視 を設定。
     */
    public void setPpgsContractExcessChargeNeglect(java.math.BigDecimal ppgsContractExcessChargeNeglect) {
        this.ppgsContractExcessChargeNeglect = ppgsContractExcessChargeNeglect;
    }

    /**
     * 接続送電サービスメニューを返します。
     * @return 接続送電サービスメニュー を戻します。
     */
    public java.math.BigDecimal getPowerTransmissionServiceMenu() {
        return powerTransmissionServiceMenu;
    }

    /**
     * 接続送電サービスメニューをセットします。
     * @param powerTransmissionServiceMenu 接続送電サービスメニュー を設定。
     */
    public void setPowerTransmissionServiceMenu(java.math.BigDecimal powerTransmissionServiceMenu) {
        this.powerTransmissionServiceMenu = powerTransmissionServiceMenu;
    }

    /**
     * 契約決定方法を返します。
     * @return 契約決定方法 を戻します。
     */
    public java.lang.String getContractDeterminationMethod() {
        return contractDeterminationMethod;
    }

    /**
     * 契約決定方法をセットします。
     * @param contractDeterminationMethod 契約決定方法 を設定。
     */
    public void setContractDeterminationMethod(java.lang.String contractDeterminationMethod) {
        this.contractDeterminationMethod = contractDeterminationMethod;
    }

    /**
     * 廃止理由を返します。
     * @return 廃止理由 を戻します。
     */
    public java.math.BigDecimal getAbolitionReason() {
        return abolitionReason;
    }

    /**
     * 廃止理由をセットします。
     * @param abolitionReason 廃止理由 を設定。
     */
    public void setAbolitionReason(java.math.BigDecimal abolitionReason) {
        this.abolitionReason = abolitionReason;
    }

    /**
     * 建物解体有無を返します。
     * @return 建物解体有無 を戻します。
     */
    public java.math.BigDecimal getBuildingDemolition() {
        return buildingDemolition;
    }

    /**
     * 建物解体有無をセットします。
     * @param buildingDemolition 建物解体有無 を設定。
     */
    public void setBuildingDemolition(java.math.BigDecimal buildingDemolition) {
        this.buildingDemolition = buildingDemolition;
    }

    /**
     * 解体予定日を返します。
     * @return 解体予定日 を戻します。
     */
    public java.lang.String getDemolitionScheduledDate() {
        return demolitionScheduledDate;
    }

    /**
     * 解体予定日をセットします。
     * @param demolitionScheduledDate 解体予定日 を設定。
     */
    public void setDemolitionScheduledDate(java.lang.String demolitionScheduledDate) {
        this.demolitionScheduledDate = demolitionScheduledDate;
    }

    /**
     * 解体予定時刻を返します。
     * @return 解体予定時刻 を戻します。
     */
    public java.lang.String getDemolitionScheduledTime() {
        return demolitionScheduledTime;
    }

    /**
     * 解体予定時刻をセットします。
     * @param demolitionScheduledTime 解体予定時刻 を設定。
     */
    public void setDemolitionScheduledTime(java.lang.String demolitionScheduledTime) {
        this.demolitionScheduledTime = demolitionScheduledTime;
    }

    /**
     * 入居予定時刻を返します。
     * @return 入居予定時刻 を戻します。
     */
    public java.lang.String getMovingInScheduledTime() {
        return movingInScheduledTime;
    }

    /**
     * 入居予定時刻をセットします。
     * @param movingInScheduledTime 入居予定時刻 を設定。
     */
    public void setMovingInScheduledTime(java.lang.String movingInScheduledTime) {
        this.movingInScheduledTime = movingInScheduledTime;
    }

    /**
     * 契約変更予定年月日を返します。
     * @return 契約変更予定年月日 を戻します。
     */
    public java.lang.String getContractChangeScheduledDate() {
        return contractChangeScheduledDate;
    }

    /**
     * 契約変更予定年月日をセットします。
     * @param contractChangeScheduledDate 契約変更予定年月日 を設定。
     */
    public void setContractChangeScheduledDate(java.lang.String contractChangeScheduledDate) {
        this.contractChangeScheduledDate = contractChangeScheduledDate;
    }

    /**
     * 契約電流希望を返します。
     * @return 契約電流希望 を戻します。
     */
    public java.lang.String getDesiredContractCurrent() {
        return desiredContractCurrent;
    }

    /**
     * 契約電流希望をセットします。
     * @param desiredContractCurrent 契約電流希望 を設定。
     */
    public void setDesiredContractCurrent(java.lang.String desiredContractCurrent) {
        this.desiredContractCurrent = desiredContractCurrent;
    }

    /**
     * 出向前連絡要否を返します。
     * @return 出向前連絡要否 を戻します。
     */
    public java.math.BigDecimal getContactNecessity() {
        return contactNecessity;
    }

    /**
     * 出向前連絡要否をセットします。
     * @param contactNecessity 出向前連絡要否 を設定。
     */
    public void setContactNecessity(java.math.BigDecimal contactNecessity) {
        this.contactNecessity = contactNecessity;
    }

    /**
     * 検針日の選択を返します。
     * @return 検針日の選択 を戻します。
     */
    public java.math.BigDecimal getMeterReadingDay() {
        return meterReadingDay;
    }

    /**
     * 検針日の選択をセットします。
     * @param meterReadingDay 検針日の選択 を設定。
     */
    public void setMeterReadingDay(java.math.BigDecimal meterReadingDay) {
        this.meterReadingDay = meterReadingDay;
    }

    /**
     * 立会希望時刻を返します。
     * @return 立会希望時刻 を戻します。
     */
    public java.lang.String getWitnessDesiredTime() {
        return witnessDesiredTime;
    }

    /**
     * 立会希望時刻をセットします。
     * @param witnessDesiredTime 立会希望時刻 を設定。
     */
    public void setWitnessDesiredTime(java.lang.String witnessDesiredTime) {
        this.witnessDesiredTime = witnessDesiredTime;
    }

    /**
     * 契約者コードを返します。
     * @return 契約者コード を戻します。
     */
    public java.lang.String getContractCd() {
        return contractCd;
    }

    /**
     * 契約者コードをセットします。
     * @param contractCd 契約者コード を設定。
     */
    public void setContractCd(java.lang.String contractCd) {
        this.contractCd = contractCd;
    }

    /**
     * 連番を返します。
     * @return 連番 を戻します。
     */
    public java.lang.String getContractSeqNo() {
        return contractSeqNo;
    }

    /**
     * 連番をセットします。
     * @param contractSeqNo 連番 を設定。
     */
    public void setContractSeqNo(java.lang.String contractSeqNo) {
        this.contractSeqNo = contractSeqNo;
    }


    /**
     * 契約情報一覧モデルの入出力情報モデルの文字列スナップショットを返します。
     * @return 契約情報一覧モデルの入出力情報モデルの文字列スナップショット
     */
    @Override
    public String toString(){
    	return "契約情報一覧モデル " + super.toString() + new ToStringBuilder(this)
    		.append("局コード(stationCd)", getStationCd())
    		.append("顧客コード(customerCd)", getCustomerCd())
    		.append("連番(seqNo)", getSeqNo())
    		.append("地点特定番号(pointIdentificationNumber)", getPointIdentificationNumber())
    		.append("接続開始予定日(transportaionScheduledStartDate)", getTransportaionScheduledStartDate())
    		.append("接続廃止予定日(transportaionScheduledEndDate)", getTransportaionScheduledEndDate())
    		.append("旧小売事業者コード(oldCompanyCd)", getOldCompanyCd())
    		.append("旧小売事業者お客様番号(oldCompanyCustomerCd)", getOldCompanyCustomerCd())
    		.append("託送約款規定に基づく遵守承諾(agreement)", getAgreement())
    		.append("設備情報変更有無区分(facilityInfoChangedClass)", getFacilityInfoChangedClass())
    		.append("設備撤去日(facilityRemovalDate)", getFacilityRemovalDate())
    		.append("施工希望時刻(constructionScheduledTime)", getConstructionScheduledTime())
    		.append("立会可否(onSiteWitnessing)", getOnSiteWitnessing())
    		.append("立会希望日(onSiteWitnessingPreferredDate)", getOnSiteWitnessingPreferredDate())
    		.append("立会希望時刻(onSiteWitnessingPreferredTime)", getOnSiteWitnessingPreferredTime())
    		.append("立会者氏名(witness)", getWitness())
    		.append("申込者（区分）(applicantClass)", getApplicantClass())
    		.append("申込者氏名(applicantName)", getApplicantName())
    		.append("申込者ご連絡先電話番号（区分）(applicantContactTelClass)", getApplicantContactTelClass())
    		.append("申込者ご連絡先電話番号（市外局番）(applicantContactTelAreaCode)", getApplicantContactTelAreaCode())
    		.append("申込者ご連絡先電話番号（市内局番）(applicantContactTelcityNumber)", getApplicantContactTelcityNumber())
    		.append("申込者ご連絡先電話番号（加入者番号）(applicantContactTelSubscriberNumber)", getApplicantContactTelSubscriberNumber())
    		.append("エリア区分(areaDivision)", getAreaDivision())
    		.append("主契約_料金体系(mainContractCargingSystem)", getMainContractCargingSystem())
    		.append("主契約_基本料金単価(mainContractBasicRate)", getMainContractBasicRate())
    		.append("主契約_契約超過金無視(mainContractExcessChargeNeglect)", getMainContractExcessChargeNeglect())
    		.append("自家補_料金体系(ppgsChargingSystem)", getPpgsChargingSystem())
    		.append("自家補_基本料金単価_使用時(ppgsBasicRateInCaseOfUse)", getPpgsBasicRateInCaseOfUse())
    		.append("自家補_基本料金単価_不使用時(ppgsBasicRateNotInCaseOfUse)", getPpgsBasicRateNotInCaseOfUse())
    		.append("自家補_基準電力算出方法(ppgsBasicPowerCalcMethod)", getPpgsBasicPowerCalcMethod())
    		.append("自家補_基準電力(ppgsBasicPower)", getPpgsBasicPower())
    		.append("自家補_従量なし(ppgsNoMeasuredRateSystem)", getPpgsNoMeasuredRateSystem())
    		.append("自家補_使用量算出(ppgsUsedAmountCalc)", getPpgsUsedAmountCalc())
    		.append("部分供給(partSupply)", getPartSupply())
    		.append("部分供給_自社契約電力(partSupplyContractPower)", getPartSupplyContractPower())
    		.append("部分供給_他社契約電力(partSupplyOtherContractPower)", getPartSupplyOtherContractPower())
    		.append("算定期間(calcPeriod)", getCalcPeriod())
    		.append("指定期日(specifiedDate)", getSpecifiedDate())
    		.append("自家補_契約超過金無視(ppgsContractExcessChargeNeglect)", getPpgsContractExcessChargeNeglect())
    		.append("接続送電サービスメニュー(powerTransmissionServiceMenu)", getPowerTransmissionServiceMenu())
    		.append("契約決定方法(contractDeterminationMethod)", getContractDeterminationMethod())
    		.append("廃止理由(abolitionReason)", getAbolitionReason())
    		.append("建物解体有無(buildingDemolition)", getBuildingDemolition())
    		.append("解体予定日(demolitionScheduledDate)", getDemolitionScheduledDate())
    		.append("解体予定時刻(demolitionScheduledTime)", getDemolitionScheduledTime())
    		.append("入居予定時刻(movingInScheduledTime)", getMovingInScheduledTime())
    		.append("契約変更予定年月日(contractChangeScheduledDate)", getContractChangeScheduledDate())
    		.append("契約電流希望(desiredContractCurrent)", getDesiredContractCurrent())
    		.append("出向前連絡要否(contactNecessity)", getContactNecessity())
    		.append("検針日の選択(meterReadingDay)", getMeterReadingDay())
    		.append("立会希望時刻(witnessDesiredTime)", getWitnessDesiredTime())
    		.append("契約者コード(contractCd)", getContractCd())
    		.append("連番(contractSeqNo)", getContractSeqNo())
    		.toString();
    }
}
