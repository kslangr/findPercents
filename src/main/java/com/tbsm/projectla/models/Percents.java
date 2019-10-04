package com.tbsm.projectla.models;

import java.text.NumberFormat;


public class Percents {
	private Double generalPremiseLocationRentableLeases; // Rentable (lease)	
	private Double generalPremiseLocationUsableLease; // Usable (lease)
	private Double generalLocationSummaryTotalAreaForProportionateShare; // Total Area for Proportionate Share
	private Double generalLocationSummaryProportionateShareContractual; // Proportionate Share (contractual)
	private Double rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent; // Base Index (Percent)	
	private Double rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear; // Index Percent at Base Year	
	private Double rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease; // Minimum % Increase
	private Double rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease; // Lifetime Min % Increase
	private Double rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease; // Maximum % Increase
	private Double rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease; // Lifetime Max % Increase
	private Double rentFairMarketRateValuePercentageOfRate; // Percentage of Rate	
	private Double rentFairMarketRateValueCurrentRate; // Current Rate
	private Double rentFairMarketRateValueOriginalRate; // Original Rate
	private Double rentFairMarketRateValueMinimumPercentIncrease; // Minimum % Increase	
	private Double rentFairMarketRateValueLifetimeMinimumPercentIncrease; // Lifetime Min % Increase
	private Double rentFairMarketRateValueMaximumPercentIncrease; // Maximum % Increase
	private Double rentFairMarketRateValueLifetimeMaximumPercentIncrease; // Lifetime Max % Increase
	private Double rentSalesReportingDetailsPercentRent; // % Rent
	private Double rentTaxExclusionsTaxRatePercent; // Tax Rate %
	private Double rentPercentRentSchedulesPaymentType; // Payment Type
	private Double rentPercentRentSchedulesDescription; // Description
	private Double rentPercentRentSchedulesrequencyType; // Frequency Type
	private Double rentPercentRentSchedulesContractRentable; // Contract Rentable
	private Double rentPercentRentSchedulesChargeAmountBasis; // Charge Amount Basis
	private Double rentCommissionDetailsPercent; // Percent
	private Double rentCommissionSchedulesContractRentable; // Contract Rentable
	private Double securityDepositDepositDetailsCurrentInterestRatePercent; // 320
	private Double rightsHoldoverRentPenaltyPercentage; // 379 Rent Penalty - Percentage
	private Double opexCamCamAuditSetupCapGrowthPercent; // 479 Cap Growth % 
	private Double opexCamCamAuditSetupMinimumPercentIncrease; // 481 Min Percent Increase
	private Double opexCamCamAuditSetupMaximumPercentIncrease; // 483 Max Percent Increase
	private Double opexCamCamAuditSetupAdministrationFeePercent; // 491 Administration Fee %
	private Double opexCamCamAuditSetupProRataNegotiatedPercent; // 493 Pro Rata Negotiated (Percent)
	private Double opexCamCamSchedulesContractRentable; // 507 Contract Rentable
	private Double insuranceInsuranceSchedulesContractRentable; // 546 Contract Rentable
	private Double taxTaxDetailsTaxRatePercent; // 562 Tax Rate %	taxRatePercent		
	private Double taxTaxSchedulesContractRentable; // 579 Contract Rentable
	private Double coTenancyCoTenancyDetailsRentReducedByPercent; // 607 Rent Reduced By (Percent)
	private Double coTenancyCoTenancyItemSalesPercentage; // 615 Sales Percentage
	private Double coTenancyCoTenancyItemRentReducedByPercent; // 618 Rent Reduced By (Percent)
	private Double responsibilitiesResponsibilityServiceLandlordPercent; // 659 Landlord %
	private Double responsibilitiesResponsibilityServiceTenantPercent; // 660 Tenant %
	private Double responsibilitiesResponsibilityServiceCapPercent; // 666 Cap Percent
	private Double accountingOperatingPortionOfCapitalLeasePercent; // 689 Operating Portion of Capital Lease %
	private Double accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate; // 692 Incremental Borrowing Rate
	private Double accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance; // 693 % Is Maintenance
	private Double accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent; // 694 Index Growth %
	private Double accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax; // 695 % Is Tax
	private Double accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent; // 696 FMRV Growth %
	private Double accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther; // 697 % Is Other
	private Double accountingFasb13TreatmentLeaseRateUsedCalculated; // 704 Lease Rate Used (Calculated)
	private Double accountingFasb13TreatmentLandPercentage; // 710 Land Percentage
			

	public Percents() {
		// Default
	}

	/**
	 * @return the generalPremiseLocationRentableLeases
	 */
	public Double getGeneralPremiseLocationRentableLeases() {
		return generalPremiseLocationRentableLeases;
	}


	/**
	 * @param generalPremiseLocationRentableLeases the generalPremiseLocationRentableLeases to set
	 */
	public void setGeneralPremiseLocationRentableLeases(Double generalPremiseLocationRentableLeases) {
		this.generalPremiseLocationRentableLeases = generalPremiseLocationRentableLeases;
	}


	/**
	 * @return the generalPremiseLocationUsableLease
	 */
	public Double getGeneralPremiseLocationUsableLease() {
		return generalPremiseLocationUsableLease;
	}


	/**
	 * @param generalPremiseLocationUsableLease the generalPremiseLocationUsableLease to set
	 */
	public void setGeneralPremiseLocationUsableLease(Double generalPremiseLocationUsableLease) {
		this.generalPremiseLocationUsableLease = generalPremiseLocationUsableLease;
	}


	/**
	 * @return the generalLocationSummaryTotalAreaForProportionateShare
	 */
	public Double getGeneralLocationSummaryTotalAreaForProportionateShare() {
		return generalLocationSummaryTotalAreaForProportionateShare;
	}


	/**
	 * @param generalLocationSummaryTotalAreaForProportionateShare the generalLocationSummaryTotalAreaForProportionateShare to set
	 */
	public void setGeneralLocationSummaryTotalAreaForProportionateShare(
			Double generalLocationSummaryTotalAreaForProportionateShare) {
		this.generalLocationSummaryTotalAreaForProportionateShare = generalLocationSummaryTotalAreaForProportionateShare;
	}


	/**
	 * @return the generalLocationSummaryProportionateShareContractual
	 */
	public Double getGeneralLocationSummaryProportionateShareContractual() {
		return generalLocationSummaryProportionateShareContractual;
	}


	/**
	 * @param generalLocationSummaryProportionateShareContractual the generalLocationSummaryProportionateShareContractual to set
	 */
	public void setGeneralLocationSummaryProportionateShareContractual(
			Double generalLocationSummaryProportionateShareContractual) {
		this.generalLocationSummaryProportionateShareContractual = generalLocationSummaryProportionateShareContractual;
	}


	/**
	 * @return the rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent
	 */
	public Double getRentIndexAdjustmentsIndexAdjustmentBaseIndexPercent() {
		return rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent;
	}


	/**
	 * @param rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent the rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent to set
	 */
	public void setRentIndexAdjustmentsIndexAdjustmentBaseIndexPercent(
			Double rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent) {
		this.rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent = rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent;
	}


	/**
	 * @return the rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear
	 */
	public Double getRentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear() {
		return rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear;
	}


	/**
	 * @param rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear the rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear to set
	 */
	public void setRentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear(
			Double rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear) {
		this.rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear = rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear;
	}


	/**
	 * @return the rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease
	 */
	public Double getRentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease() {
		return rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease;
	}


	/**
	 * @param rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease the rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease to set
	 */
	public void setRentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease(
			Double rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease) {
		this.rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease = rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease;
	}


	/**
	 * @return the rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease
	 */
	public Double getRentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease() {
		return rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease;
	}


	/**
	 * @param rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease the rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease to set
	 */
	public void setRentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease(
			Double rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease) {
		this.rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease = rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease;
	}


	/**
	 * @return the rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease
	 */
	public Double getRentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease() {
		return rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease;
	}


	/**
	 * @param rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease the rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease to set
	 */
	public void setRentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease(
			Double rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease) {
		this.rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease = rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease;
	}


	/**
	 * @return the rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease
	 */
	public Double getRentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease() {
		return rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease;
	}


	/**
	 * @param rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease the rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease to set
	 */
	public void setRentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease(
			Double rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease) {
		this.rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease = rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease;
	}


	/**
	 * @return the rentFairMarketRateValuePercentageOfRate
	 */
	public Double getRentFairMarketRateValuePercentageOfRate() {
		return rentFairMarketRateValuePercentageOfRate;
	}


	/**
	 * @param rentFairMarketRateValuePercentageOfRate the rentFairMarketRateValuePercentageOfRate to set
	 */
	public void setRentFairMarketRateValuePercentageOfRate(Double rentFairMarketRateValuePercentageOfRate) {
		this.rentFairMarketRateValuePercentageOfRate = rentFairMarketRateValuePercentageOfRate;
	}


	/**
	 * @return the rentFairMarketRateValueCurrentRate
	 */
	public Double getRentFairMarketRateValueCurrentRate() {
		return rentFairMarketRateValueCurrentRate;
	}


	/**
	 * @param rentFairMarketRateValueCurrentRate the rentFairMarketRateValueCurrentRate to set
	 */
	public void setRentFairMarketRateValueCurrentRate(Double rentFairMarketRateValueCurrentRate) {
		this.rentFairMarketRateValueCurrentRate = rentFairMarketRateValueCurrentRate;
	}


	/**
	 * @return the rentFairMarketRateValueOriginalRate
	 */
	public Double getRentFairMarketRateValueOriginalRate() {
		return rentFairMarketRateValueOriginalRate;
	}


	/**
	 * @param rentFairMarketRateValueOriginalRate the rentFairMarketRateValueOriginalRate to set
	 */
	public void setRentFairMarketRateValueOriginalRate(Double rentFairMarketRateValueOriginalRate) {
		this.rentFairMarketRateValueOriginalRate = rentFairMarketRateValueOriginalRate;
	}


	/**
	 * @return the rentFairMarketRateValueMinimumPercentIncrease
	 */
	public Double getRentFairMarketRateValueMinimumPercentIncrease() {
		return rentFairMarketRateValueMinimumPercentIncrease;
	}


	/**
	 * @param rentFairMarketRateValueMinimumPercentIncrease the rentFairMarketRateValueMinimumPercentIncrease to set
	 */
	public void setRentFairMarketRateValueMinimumPercentIncrease(Double rentFairMarketRateValueMinimumPercentIncrease) {
		this.rentFairMarketRateValueMinimumPercentIncrease = rentFairMarketRateValueMinimumPercentIncrease;
	}


	/**
	 * @return the rentFairMarketRateValueLifetimeMinimumPercentIncrease
	 */
	public Double getRentFairMarketRateValueLifetimeMinimumPercentIncrease() {
		return rentFairMarketRateValueLifetimeMinimumPercentIncrease;
	}


	/**
	 * @param rentFairMarketRateValueLifetimeMinimumPercentIncrease the rentFairMarketRateValueLifetimeMinimumPercentIncrease to set
	 */
	public void setRentFairMarketRateValueLifetimeMinimumPercentIncrease(
			Double rentFairMarketRateValueLifetimeMinimumPercentIncrease) {
		this.rentFairMarketRateValueLifetimeMinimumPercentIncrease = rentFairMarketRateValueLifetimeMinimumPercentIncrease;
	}


	/**
	 * @return the rentFairMarketRateValueMaximumPercentIncrease
	 */
	public Double getRentFairMarketRateValueMaximumPercentIncrease() {
		return rentFairMarketRateValueMaximumPercentIncrease;
	}


	/**
	 * @param rentFairMarketRateValueMaximumPercentIncrease the rentFairMarketRateValueMaximumPercentIncrease to set
	 */
	public void setRentFairMarketRateValueMaximumPercentIncrease(Double rentFairMarketRateValueMaximumPercentIncrease) {
		this.rentFairMarketRateValueMaximumPercentIncrease = rentFairMarketRateValueMaximumPercentIncrease;
	}


	/**
	 * @return the rentFairMarketRateValueLifetimeMaximumPercentIncrease
	 */
	public Double getRentFairMarketRateValueLifetimeMaximumPercentIncrease() {
		return rentFairMarketRateValueLifetimeMaximumPercentIncrease;
	}


	/**
	 * @param rentFairMarketRateValueLifetimeMaximumPercentIncrease the rentFairMarketRateValueLifetimeMaximumPercentIncrease to set
	 */
	public void setRentFairMarketRateValueLifetimeMaximumPercentIncrease(
			Double rentFairMarketRateValueLifetimeMaximumPercentIncrease) {
		this.rentFairMarketRateValueLifetimeMaximumPercentIncrease = rentFairMarketRateValueLifetimeMaximumPercentIncrease;
	}


	/**
	 * @return the rentSalesReportingDetailsPercentRent
	 */
	public Double getRentSalesReportingDetailsPercentRent() {
		return rentSalesReportingDetailsPercentRent;
	}


	/**
	 * @param rentSalesReportingDetailsPercentRent the rentSalesReportingDetailsPercentRent to set
	 */
	public void setRentSalesReportingDetailsPercentRent(Double rentSalesReportingDetailsPercentRent) {
		this.rentSalesReportingDetailsPercentRent = rentSalesReportingDetailsPercentRent;
	}


	/**
	 * @return the rentTaxExclusionsTaxRatePercent
	 */
	public Double getRentTaxExclusionsTaxRatePercent() {
		return rentTaxExclusionsTaxRatePercent;
	}


	/**
	 * @param rentTaxExclusionsTaxRatePercent the rentTaxExclusionsTaxRatePercent to set
	 */
	public void setRentTaxExclusionsTaxRatePercent(Double rentTaxExclusionsTaxRatePercent) {
		this.rentTaxExclusionsTaxRatePercent = rentTaxExclusionsTaxRatePercent;
	}


	/**
	 * @return the rentPercentRentSchedulesPaymentType
	 */
	public Double getRentPercentRentSchedulesPaymentType() {
		return rentPercentRentSchedulesPaymentType;
	}


	/**
	 * @param rentPercentRentSchedulesPaymentType the rentPercentRentSchedulesPaymentType to set
	 */
	public void setRentPercentRentSchedulesPaymentType(Double rentPercentRentSchedulesPaymentType) {
		this.rentPercentRentSchedulesPaymentType = rentPercentRentSchedulesPaymentType;
	}


	/**
	 * @return the rentPercentRentSchedulesDescription
	 */
	public Double getRentPercentRentSchedulesDescription() {
		return rentPercentRentSchedulesDescription;
	}


	/**
	 * @param rentPercentRentSchedulesDescription the rentPercentRentSchedulesDescription to set
	 */
	public void setRentPercentRentSchedulesDescription(Double rentPercentRentSchedulesDescription) {
		this.rentPercentRentSchedulesDescription = rentPercentRentSchedulesDescription;
	}


	/**
	 * @return the rentPercentRentSchedulesrequencyType
	 */
	public Double getRentPercentRentSchedulesrequencyType() {
		return rentPercentRentSchedulesrequencyType;
	}


	/**
	 * @param rentPercentRentSchedulesrequencyType the rentPercentRentSchedulesrequencyType to set
	 */
	public void setRentPercentRentSchedulesrequencyType(Double rentPercentRentSchedulesrequencyType) {
		this.rentPercentRentSchedulesrequencyType = rentPercentRentSchedulesrequencyType;
	}


	/**
	 * @return the rentPercentRentSchedulesContractRentable
	 */
	public Double getRentPercentRentSchedulesContractRentable() {
		return rentPercentRentSchedulesContractRentable;
	}


	/**
	 * @param rentPercentRentSchedulesContractRentable the rentPercentRentSchedulesContractRentable to set
	 */
	public void setRentPercentRentSchedulesContractRentable(Double rentPercentRentSchedulesContractRentable) {
		this.rentPercentRentSchedulesContractRentable = rentPercentRentSchedulesContractRentable;
	}


	/**
	 * @return the rentPercentRentSchedulesChargeAmountBasis
	 */
	public Double getRentPercentRentSchedulesChargeAmountBasis() {
		return rentPercentRentSchedulesChargeAmountBasis;
	}


	/**
	 * @param rentPercentRentSchedulesChargeAmountBasis the rentPercentRentSchedulesChargeAmountBasis to set
	 */
	public void setRentPercentRentSchedulesChargeAmountBasis(Double rentPercentRentSchedulesChargeAmountBasis) {
		this.rentPercentRentSchedulesChargeAmountBasis = rentPercentRentSchedulesChargeAmountBasis;
	}


	/**
	 * @return the rentCommissionDetailsPercent
	 */
	public Double getRentCommissionDetailsPercent() {
		return rentCommissionDetailsPercent;
	}


	/**
	 * @param rentCommissionDetailsPercent the rentCommissionDetailsPercent to set
	 */
	public void setRentCommissionDetailsPercent(Double rentCommissionDetailsPercent) {
		this.rentCommissionDetailsPercent = rentCommissionDetailsPercent;
	}


	/**
	 * @return the rentCommissionSchedulesContractRentable
	 */
	public Double getRentCommissionSchedulesContractRentable() {
		return rentCommissionSchedulesContractRentable;
	}


	/**
	 * @param rentCommissionSchedulesContractRentable the rentCommissionSchedulesContractRentable to set
	 */
	public void setRentCommissionSchedulesContractRentable(Double rentCommissionSchedulesContractRentable) {
		this.rentCommissionSchedulesContractRentable = rentCommissionSchedulesContractRentable;
	}


	/**
	 * @return the securityDepositDepositDetailsCurrentInterestRatePercent
	 */
	public Double getSecurityDepositDepositDetailsCurrentInterestRatePercent() {
		return securityDepositDepositDetailsCurrentInterestRatePercent;
	}


	/**
	 * @param securityDepositDepositDetailsCurrentInterestRatePercent the securityDepositDepositDetailsCurrentInterestRatePercent to set
	 */
	public void setSecurityDepositDepositDetailsCurrentInterestRatePercent(
			Double securityDepositDepositDetailsCurrentInterestRatePercent) {
		this.securityDepositDepositDetailsCurrentInterestRatePercent = securityDepositDepositDetailsCurrentInterestRatePercent;
	}


	/**
	 * @return the rightsHoldoverRentPenaltyPercentage
	 */
	public Double getRightsHoldoverRentPenaltyPercentage() {
		return rightsHoldoverRentPenaltyPercentage;
	}


	/**
	 * @param rightsHoldoverRentPenaltyPercentage the rightsHoldoverRentPenaltyPercentage to set
	 */
	public void setRightsHoldoverRentPenaltyPercentage(Double rightsHoldoverRentPenaltyPercentage) {
		this.rightsHoldoverRentPenaltyPercentage = rightsHoldoverRentPenaltyPercentage;
	}


	/**
	 * @return the opexCamCamAuditSetupCapGrowthPercent
	 */
	public Double getOpexCamCamAuditSetupCapGrowthPercent() {
		return opexCamCamAuditSetupCapGrowthPercent;
	}


	/**
	 * @param opexCamCamAuditSetupCapGrowthPercent the opexCamCamAuditSetupCapGrowthPercent to set
	 */
	public void setOpexCamCamAuditSetupCapGrowthPercent(Double opexCamCamAuditSetupCapGrowthPercent) {
		this.opexCamCamAuditSetupCapGrowthPercent = opexCamCamAuditSetupCapGrowthPercent;
	}


	/**
	 * @return the opexCamCamAuditSetupMinimumPercentIncrease
	 */
	public Double getOpexCamCamAuditSetupMinimumPercentIncrease() {
		return opexCamCamAuditSetupMinimumPercentIncrease;
	}


	/**
	 * @param opexCamCamAuditSetupMinimumPercentIncrease the opexCamCamAuditSetupMinimumPercentIncrease to set
	 */
	public void setOpexCamCamAuditSetupMinimumPercentIncrease(Double opexCamCamAuditSetupMinimumPercentIncrease) {
		this.opexCamCamAuditSetupMinimumPercentIncrease = opexCamCamAuditSetupMinimumPercentIncrease;
	}


	/**
	 * @return the opexCamCamAuditSetupMaximumPercentIncrease
	 */
	public Double getOpexCamCamAuditSetupMaximumPercentIncrease() {
		return opexCamCamAuditSetupMaximumPercentIncrease;
	}


	/**
	 * @param opexCamCamAuditSetupMaximumPercentIncrease the opexCamCamAuditSetupMaximumPercentIncrease to set
	 */
	public void setOpexCamCamAuditSetupMaximumPercentIncrease(Double opexCamCamAuditSetupMaximumPercentIncrease) {
		this.opexCamCamAuditSetupMaximumPercentIncrease = opexCamCamAuditSetupMaximumPercentIncrease;
	}


	/**
	 * @return the opexCamCamAuditSetupAdministrationFeePercent
	 */
	public Double getOpexCamCamAuditSetupAdministrationFeePercent() {
		return opexCamCamAuditSetupAdministrationFeePercent;
	}


	/**
	 * @param opexCamCamAuditSetupAdministrationFeePercent the opexCamCamAuditSetupAdministrationFeePercent to set
	 */
	public void setOpexCamCamAuditSetupAdministrationFeePercent(Double opexCamCamAuditSetupAdministrationFeePercent) {
		this.opexCamCamAuditSetupAdministrationFeePercent = opexCamCamAuditSetupAdministrationFeePercent;
	}


	/**
	 * @return the opexCamCamAuditSetupProRataNegotiatedPercent
	 */
	public Double getOpexCamCamAuditSetupProRataNegotiatedPercent() {
		return opexCamCamAuditSetupProRataNegotiatedPercent;
	}


	/**
	 * @param opexCamCamAuditSetupProRataNegotiatedPercent the opexCamCamAuditSetupProRataNegotiatedPercent to set
	 */
	public void setOpexCamCamAuditSetupProRataNegotiatedPercent(Double opexCamCamAuditSetupProRataNegotiatedPercent) {
		this.opexCamCamAuditSetupProRataNegotiatedPercent = opexCamCamAuditSetupProRataNegotiatedPercent;
	}


	/**
	 * @return the opexCamCamSchedulesContractRentable
	 */
	public Double getOpexCamCamSchedulesContractRentable() {
		return opexCamCamSchedulesContractRentable;
	}


	/**
	 * @param opexCamCamSchedulesContractRentable the opexCamCamSchedulesContractRentable to set
	 */
	public void setOpexCamCamSchedulesContractRentable(Double opexCamCamSchedulesContractRentable) {
		this.opexCamCamSchedulesContractRentable = opexCamCamSchedulesContractRentable;
	}


	/**
	 * @return the insuranceInsuranceSchedulesContractRentable
	 */
	public Double getInsuranceInsuranceSchedulesContractRentable() {
		return insuranceInsuranceSchedulesContractRentable;
	}


	/**
	 * @param insuranceInsuranceSchedulesContractRentable the insuranceInsuranceSchedulesContractRentable to set
	 */
	public void setInsuranceInsuranceSchedulesContractRentable(Double insuranceInsuranceSchedulesContractRentable) {
		this.insuranceInsuranceSchedulesContractRentable = insuranceInsuranceSchedulesContractRentable;
	}


	/**
	 * @return the taxTaxDetailsTaxRatePercent
	 */
	public Double getTaxTaxDetailsTaxRatePercent() {
		return taxTaxDetailsTaxRatePercent;
	}


	/**
	 * @param taxTaxDetailsTaxRatePercent the taxTaxDetailsTaxRatePercent to set
	 */
	public void setTaxTaxDetailsTaxRatePercent(Double taxTaxDetailsTaxRatePercent) {
		this.taxTaxDetailsTaxRatePercent = taxTaxDetailsTaxRatePercent;
	}


	/**
	 * @return the taxTaxSchedulesContractRentable
	 */
	public Double getTaxTaxSchedulesContractRentable() {
		return taxTaxSchedulesContractRentable;
	}


	/**
	 * @param taxTaxSchedulesContractRentable the taxTaxSchedulesContractRentable to set
	 */
	public void setTaxTaxSchedulesContractRentable(Double taxTaxSchedulesContractRentable) {
		this.taxTaxSchedulesContractRentable = taxTaxSchedulesContractRentable;
	}


	/**
	 * @return the coTenancyCoTenancyDetailsRentReducedByPercent
	 */
	public Double getCoTenancyCoTenancyDetailsRentReducedByPercent() {
		return coTenancyCoTenancyDetailsRentReducedByPercent;
	}


	/**
	 * @param coTenancyCoTenancyDetailsRentReducedByPercent the coTenancyCoTenancyDetailsRentReducedByPercent to set
	 */
	public void setCoTenancyCoTenancyDetailsRentReducedByPercent(Double coTenancyCoTenancyDetailsRentReducedByPercent) {
		this.coTenancyCoTenancyDetailsRentReducedByPercent = coTenancyCoTenancyDetailsRentReducedByPercent;
	}


	/**
	 * @return the coTenancyCoTenancyItemSalesPercentage
	 */
	public Double getCoTenancyCoTenancyItemSalesPercentage() {
		return coTenancyCoTenancyItemSalesPercentage;
	}


	/**
	 * @param coTenancyCoTenancyItemSalesPercentage the coTenancyCoTenancyItemSalesPercentage to set
	 */
	public void setCoTenancyCoTenancyItemSalesPercentage(Double coTenancyCoTenancyItemSalesPercentage) {
		this.coTenancyCoTenancyItemSalesPercentage = coTenancyCoTenancyItemSalesPercentage;
	}


	/**
	 * @return the coTenancyCoTenancyItemRentReducedByPercent
	 */
	public Double getCoTenancyCoTenancyItemRentReducedByPercent() {
		return coTenancyCoTenancyItemRentReducedByPercent;
	}


	/**
	 * @param coTenancyCoTenancyItemRentReducedByPercent the coTenancyCoTenancyItemRentReducedByPercent to set
	 */
	public void setCoTenancyCoTenancyItemRentReducedByPercent(Double coTenancyCoTenancyItemRentReducedByPercent) {
		this.coTenancyCoTenancyItemRentReducedByPercent = coTenancyCoTenancyItemRentReducedByPercent;
	}


	/**
	 * @return the responsibilitiesResponsibilityServiceLandlordPercent
	 */
	public Double getResponsibilitiesResponsibilityServiceLandlordPercent() {
		return responsibilitiesResponsibilityServiceLandlordPercent;
	}


	/**
	 * @param responsibilitiesResponsibilityServiceLandlordPercent the responsibilitiesResponsibilityServiceLandlordPercent to set
	 */
	public void setResponsibilitiesResponsibilityServiceLandlordPercent(
			Double responsibilitiesResponsibilityServiceLandlordPercent) {
		this.responsibilitiesResponsibilityServiceLandlordPercent = responsibilitiesResponsibilityServiceLandlordPercent;
	}


	/**
	 * @return the responsibilitiesResponsibilityServiceTenantPercent
	 */
	public Double getResponsibilitiesResponsibilityServiceTenantPercent() {
		return responsibilitiesResponsibilityServiceTenantPercent;
	}


	/**
	 * @param responsibilitiesResponsibilityServiceTenantPercent the responsibilitiesResponsibilityServiceTenantPercent to set
	 */
	public void setResponsibilitiesResponsibilityServiceTenantPercent(
			Double responsibilitiesResponsibilityServiceTenantPercent) {
		this.responsibilitiesResponsibilityServiceTenantPercent = responsibilitiesResponsibilityServiceTenantPercent;
	}


	/**
	 * @return the responsibilitiesResponsibilityServiceCapPercent
	 */
	public Double getResponsibilitiesResponsibilityServiceCapPercent() {
		return responsibilitiesResponsibilityServiceCapPercent;
	}


	/**
	 * @param responsibilitiesResponsibilityServiceCapPercent the responsibilitiesResponsibilityServiceCapPercent to set
	 */
	public void setResponsibilitiesResponsibilityServiceCapPercent(Double responsibilitiesResponsibilityServiceCapPercent) {
		this.responsibilitiesResponsibilityServiceCapPercent = responsibilitiesResponsibilityServiceCapPercent;
	}


	/**
	 * @return the accountingOperatingPortionOfCapitalLeasePercent
	 */
	public Double getAccountingOperatingPortionOfCapitalLeasePercent() {
		return accountingOperatingPortionOfCapitalLeasePercent;
	}


	/**
	 * @param accountingOperatingPortionOfCapitalLeasePercent the accountingOperatingPortionOfCapitalLeasePercent to set
	 */
	public void setAccountingOperatingPortionOfCapitalLeasePercent(Double accountingOperatingPortionOfCapitalLeasePercent) {
		this.accountingOperatingPortionOfCapitalLeasePercent = accountingOperatingPortionOfCapitalLeasePercent;
	}


	/**
	 * @return the accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate
	 */
	public Double getAccountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate() {
		return accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate;
	}


	/**
	 * @param accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate the accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate to set
	 */
	public void setAccountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate(
			Double accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate) {
		this.accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate = accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate;
	}


	/**
	 * @return the accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance
	 */
	public Double getAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance() {
		return accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance;
	}


	/**
	 * @param accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance the accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance to set
	 */
	public void setAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance(
			Double accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance) {
		this.accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance = accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance;
	}


	/**
	 * @return the accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent
	 */
	public Double getAccountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent() {
		return accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent;
	}


	/**
	 * @param accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent the accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent to set
	 */
	public void setAccountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent(
			Double accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent) {
		this.accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent = accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent;
	}


	/**
	 * @return the accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax
	 */
	public Double getAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax() {
		return accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax;
	}


	/**
	 * @param accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax the accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax to set
	 */
	public void setAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax(
			Double accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax) {
		this.accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax = accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax;
	}


	/**
	 * @return the accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent
	 */
	public Double getAccountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent() {
		return accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent;
	}


	/**
	 * @param accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent the accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent to set
	 */
	public void setAccountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent(
			Double accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent) {
		this.accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent = accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent;
	}


	/**
	 * @return the accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther
	 */
	public Double getAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther() {
		return accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther;
	}


	/**
	 * @param accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther the accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther to set
	 */
	public void setAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther(
			Double accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther) {
		this.accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther = accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther;
	}


	/**
	 * @return the accountingFasb13TreatmentLeaseRateUsedCalculated
	 */
	public Double getAccountingFasb13TreatmentLeaseRateUsedCalculated() {
		return accountingFasb13TreatmentLeaseRateUsedCalculated;
	}


	/**
	 * @param accountingFasb13TreatmentLeaseRateUsedCalculated the accountingFasb13TreatmentLeaseRateUsedCalculated to set
	 */
	public void setAccountingFasb13TreatmentLeaseRateUsedCalculated(
			Double accountingFasb13TreatmentLeaseRateUsedCalculated) {
		this.accountingFasb13TreatmentLeaseRateUsedCalculated = accountingFasb13TreatmentLeaseRateUsedCalculated;
	}


	/**
	 * @return the accountingFasb13TreatmentLandPercentage
	 */
	public Double getAccountingFasb13TreatmentLandPercentage() {
		return accountingFasb13TreatmentLandPercentage;
	}


	/**
	 * @param accountingFasb13TreatmentLandPercentage the accountingFasb13TreatmentLandPercentage to set
	 */
	public void setAccountingFasb13TreatmentLandPercentage(Double accountingFasb13TreatmentLandPercentage) {
		this.accountingFasb13TreatmentLandPercentage = accountingFasb13TreatmentLandPercentage;
	}


public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("**********  Here are my Finds  **********").append("\n");
        sb.append("General - Premise Location - Rentable Leases: ").append( doubleToString( generalPremiseLocationRentableLeases )).append("\n");
        sb.append("General - Premise Location - Usable Lease: ").append( doubleToString( generalPremiseLocationUsableLease )).append("\n");
        sb.append("General - Location Summary - Total Area For Proportionate Share: ").append( doubleToString( generalLocationSummaryTotalAreaForProportionateShare )).append("\n");
        sb.append("General - Location Summary - Proportionate Share Contractual: ").append( doubleToString( generalLocationSummaryProportionateShareContractual )).append("\n");
        sb.append("Rent - Index Adjustments - Index Adjustment Base Index Percent: ").append( doubleToString( rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent )).append("\n");
        sb.append("Rent - Index Adjustments - Index Adjustment Index Percent At Base Year: ").append( doubleToString( rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear )).append("\n");
        sb.append("Rent - Index Adjustments - Index Adjustment Minimum Percent Increase: ").append( doubleToString( rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease )).append("\n");
        sb.append("Rent - Index Adjustments - Index Adjustment Lifetime Minimum Percent Increase: ").append( doubleToString( rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease )).append("\n");
        sb.append("Rent - Index Adjustments - Index Adjustment Maximum Percent Increase: ").append( doubleToString( rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease )).append("\n");
        sb.append("Rent - Index Adjustments - Index Adjustment Lifetime Maximum Percent Increase: ").append( doubleToString( rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease )).append("\n");
        sb.append("Rent - Fair Market Rate Value - Percentage Of Rate: ").append( doubleToString( rentFairMarketRateValuePercentageOfRate )).append("\n");
        sb.append("Rent - Fair Market Rate Value - Current Rate: ").append( doubleToString( rentFairMarketRateValueCurrentRate )).append("\n");
        sb.append("Rent - Fair Market Rate Value - Original Rate: ").append( doubleToString( rentFairMarketRateValueOriginalRate )).append("\n");
        sb.append("Rent - Fair Market Rate Value - Minimum Percent Increase: ").append( doubleToString( rentFairMarketRateValueMinimumPercentIncrease )).append("\n");
        sb.append("Rent - Fair Market Rate Value - Lifetime Minimum Percent Increase: ").append( doubleToString( rentFairMarketRateValueLifetimeMinimumPercentIncrease )).append("\n");
        sb.append("Rent - Fair Market Rate Value - Maximum Percent Increase: ").append( doubleToString( rentFairMarketRateValueMaximumPercentIncrease )).append("\n");
        sb.append("Rent - Fair Market Rate Value - Lifetime Maximum Percent Increase: ").append( doubleToString( rentFairMarketRateValueLifetimeMaximumPercentIncrease )).append("\n");
        sb.append("Rent - Sales Reporting Details - Percent Rent: ").append( doubleToString( rentSalesReportingDetailsPercentRent )).append("\n");
        sb.append("Rent - Tax Exclusions - Tax Rate Percent: ").append( doubleToString( rentTaxExclusionsTaxRatePercent )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Payment Type: ").append( doubleToString( rentPercentRentSchedulesPaymentType )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Description: ").append( doubleToString( rentPercentRentSchedulesDescription )).append("\n");
        sb.append("Rent - Percent Rent Schedules - requency Type: ").append( doubleToString( rentPercentRentSchedulesrequencyType )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Contract Rentable: ").append( doubleToString( rentPercentRentSchedulesContractRentable )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Charge Amount Basis: ").append( doubleToString( rentPercentRentSchedulesChargeAmountBasis )).append("\n");
        sb.append("Rent - Commission Details - Percent: ").append( doubleToString( rentCommissionDetailsPercent )).append("\n");
        sb.append("Rent - Commission Schedules - Contract Rentable: ").append( doubleToString( rentCommissionSchedulesContractRentable )).append("\n");
        sb.append("Security Deposit - Deposit Details - Current Interest Rate Percent: ").append( doubleToString( securityDepositDepositDetailsCurrentInterestRatePercent )).append("\n");
        sb.append("Rights - Holdover Rent Penalty Percentage: ").append( doubleToString( rightsHoldoverRentPenaltyPercentage )).append("\n");
        sb.append("OPEX/CAM - CAM Audit Setup - Cap Growth Percent: ").append( doubleToString( opexCamCamAuditSetupCapGrowthPercent )).append("\n");
        sb.append("OPEX/CAM - CAM Audit Setup - Minimum Percent Increase: ").append( doubleToString( opexCamCamAuditSetupMinimumPercentIncrease )).append("\n");
        sb.append("OPEX/CAM - CAM Audit Setup - Maximum Percent Increase: ").append( doubleToString( opexCamCamAuditSetupMaximumPercentIncrease )).append("\n");
        sb.append("OPEX/CAM - CAM Audit Setup - Administration Fee Percent: ").append( doubleToString( opexCamCamAuditSetupAdministrationFeePercent )).append("\n");
        sb.append("OPEX/CAM - CAM Audit Setup - Pro Rata Negotiated Percent: ").append( doubleToString( opexCamCamAuditSetupProRataNegotiatedPercent )).append("\n");
        sb.append("OPEX/CAM - CAM Schedules - Contract Rentable: ").append( doubleToString( opexCamCamSchedulesContractRentable )).append("\n");
        sb.append("Insurance - Insurance Schedules - Contract Rentable: ").append( doubleToString( insuranceInsuranceSchedulesContractRentable )).append("\n");
        sb.append("Tax - Tax Details - Tax Rate Percent: ").append( doubleToString( taxTaxDetailsTaxRatePercent )).append("\n");
        sb.append("Tax - Tax Schedules - Contract Rentable: ").append( doubleToString( taxTaxSchedulesContractRentable )).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Details - Rent Reduced By Percent: ").append( doubleToString( coTenancyCoTenancyDetailsRentReducedByPercent )).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Item - Sales Percentage: ").append( doubleToString( coTenancyCoTenancyItemSalesPercentage )).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Item - Rent Reduced By Percent: ").append( doubleToString( coTenancyCoTenancyItemRentReducedByPercent )).append("\n");
        sb.append("Responsibilities - Responsibility Service - Landlord Percent: ").append( doubleToString( responsibilitiesResponsibilityServiceLandlordPercent )).append("\n");
        sb.append("Responsibilities - Responsibility Service - Tenant Percent: ").append( doubleToString( responsibilitiesResponsibilityServiceTenantPercent )).append("\n");
        sb.append("Responsibilities - Responsibility Service - Cap Percent: ").append( doubleToString( responsibilitiesResponsibilityServiceCapPercent )).append("\n");
        sb.append("Accounting - Accounting - Operating Portion Of Capital Lease Percent: ").append( doubleToString( accountingOperatingPortionOfCapitalLeasePercent )).append("\n");
        sb.append("Accounting - Borrow Rate And Percent Growth Assumptions - Incremental Borrowing Rate: ").append( doubleToString( accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate )).append("\n");
        sb.append("Accounting - Borrow Rate And Percent Growth Assumptions - Percent Is Maintenance: ").append( doubleToString( accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance )).append("\n");
        sb.append("Accounting - Borrow Rate And Percent Growth Assumptions - Index Growth Percent: ").append( doubleToString( accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent )).append("\n");
        sb.append("Accounting - Borrow Rate And Percent Growth Assumptions - Percent Is Tax: ").append( doubleToString( accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax )).append("\n");
        sb.append("Accounting - Borrow Rate And Percent Growth Assumptions - FMRV Growth Percent: ").append( doubleToString( accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent )).append("\n");
        sb.append("Accounting - Borrow Rate And Percent Growth Assumptions - Percent Is Other: ").append( doubleToString( accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther )).append("\n");
        sb.append("Accounting - FASB 13 Treatment - Lease Rate Used Calculated: ").append( doubleToString( accountingFasb13TreatmentLeaseRateUsedCalculated )).append("\n");
        sb.append("Accounting - FASB 13 Treatment - Land Percentage: ").append( doubleToString( accountingFasb13TreatmentLandPercentage )).append("\n");
                
        return sb.toString();
    }
   
   private String doubleToString(Double value) {
	   NumberFormat percentFormatter = NumberFormat.getPercentInstance();
	   if(value!=null) {
		   return percentFormatter.format( value );
	   }
	   return "<?>";	
   }
}
