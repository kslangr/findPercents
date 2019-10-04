package com.tbsm.projectla;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import com.tbsm.projectla.models.Percents;

public class FindPercents {
	private Map<String, String> foundStuff;

	private String generalPremiseLocationRentableLeases; // Rentable (lease)	
	private String generalPremiseLocationUsableLease; // Usable (lease)
	private String generalLocationSummaryTotalAreaForProportionateShare; // Total Area for Proportionate Share
	private String generalLocationSummaryProportionateShareContractual; // Proportionate Share (contractual)
	private String rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent; // Base Index (Percent)	
	private String rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear; // Index Percent at Base Year	
	private String rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease; // Minimum % Increase
	private String rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease; // Lifetime Min % Increase
	private String rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease; // Maximum % Increase
	private String rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease; // Lifetime Max % Increase
	private String rentFairMarketRateValuePercentageOfRate; // Percentage of Rate	
	private String rentFairMarketRateValueCurrentRate; // Current Rate
	private String rentFairMarketRateValueOriginalRate; // Original Rate
	private String rentFairMarketRateValueMinimumPercentIncrease; // Minimum % Increase	
	private String rentFairMarketRateValueLifetimeMinimumPercentIncrease; // Lifetime Min % Increase
	private String rentFairMarketRateValueMaximumPercentIncrease; // Maximum % Increase
	private String rentFairMarketRateValueLifetimeMaximumPercentIncrease; // Lifetime Max % Increase
	private String rentSalesReportingDetailsPercentRent; // % Rent
	private String rentTaxExclusionsTaxRatePercent; // Tax Rate %
	private String rentPercentRentSchedulesPaymentType; // Payment Type
	private String rentPercentRentSchedulesDescription; // Description
	private String rentPercentRentSchedulesrequencyType; // Frequency Type
	private String rentPercentRentSchedulesContractRentable; // Contract Rentable
	private String rentPercentRentSchedulesChargeAmountBasis; // Charge Amount Basis
	private String rentCommissionDetailsPercent; // Percent
	private String rentCommissionSchedulesContractRentable; // Contract Rentable
	private String securityDepositDepositDetailsCurrentInterestRatePercent; // 320
	private String rightsHoldoverRentPenaltyPercentage; // 379 Rent Penalty - Percentage
	private String opexCamCamAuditSetupCapGrowthPercent; // 479 Cap Growth % 
	private String opexCamCamAuditSetupMinimumPercentIncrease; // 481 Min Percent Increase
	private String opexCamCamAuditSetupMaximumPercentIncrease; // 483 Max Percent Increase
	private String opexCamCamAuditSetupAdministrationFeePercent; // 491 Administration Fee %
	private String opexCamCamAuditSetupProRataNegotiatedPercent; // 493 Pro Rata Negotiated (Percent)
	private String opexCamCamSchedulesContractRentable; // 507 Contract Rentable
	private String insuranceInsuranceSchedulesContractRentable; // 546 Contract Rentable
	private String taxTaxDetailsTaxRatePercent; // 562 Tax Rate %	taxRatePercent		
	private String taxTaxSchedulesContractRentable; // 579 Contract Rentable
	private String coTenancyCoTenancyDetailsRentReducedByPercent; // 607 Rent Reduced By (Percent)
	private String coTenancyCoTenancyItemSalesPercentage; // 615 Sales Percentage
	private String coTenancyCoTenancyItemRentReducedByPercent; // 618 Rent Reduced By (Percent)
	private String responsibilitiesResponsibilityServiceLandlordPercent; // 659 Landlord %
	private String responsibilitiesResponsibilityServiceTenantPercent; // 660 Tenant %
	private String responsibilitiesResponsibilityServiceCapPercent; // 666 Cap Percent
	private String accountingOperatingPortionOfCapitalLeasePercent; // 689 Operating Portion of Capital Lease %
	private String accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate; // 692 Incremental Borrowing Rate
	private String accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance; // 693 % Is Maintenance
	private String accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent; // 694 Index Growth %
	private String accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax; // 695 % Is Tax
	private String accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent; // 696 FMRV Growth %
	private String accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther; // 697 % Is Other
	private String accountingFasb13TreatmentLeaseRateUsedCalculated; // 704 Lease Rate Used (Calculated)
	private String accountingFasb13TreatmentLandPercentage; // 710 Land Percentage

	
	public FindPercents(Map<String, String> foundStuff) {
		this.foundStuff = foundStuff;
	}
	
	
	public Percents processCurrencies() {		
		Percents percents = new Percents();

		//percents.setGeneralDetailsBaseLeaseRate( search( generalDetailsBaseLeaseRate ) ); // Base Lease Rate
		percents.setGeneralPremiseLocationRentableLeases( search( generalPremiseLocationRentableLeases ) ); // Rentable (lease)	
		percents.setGeneralPremiseLocationUsableLease( search( generalPremiseLocationUsableLease ) ); // Usable (lease)
		percents.setGeneralLocationSummaryTotalAreaForProportionateShare( search( generalLocationSummaryTotalAreaForProportionateShare ) ); // Total Area for Proportionate Share
		percents.setGeneralLocationSummaryProportionateShareContractual( search( generalLocationSummaryProportionateShareContractual ) ); // Proportionate Share (contractual)
		percents.setRentIndexAdjustmentsIndexAdjustmentBaseIndexPercent( search( rentIndexAdjustmentsIndexAdjustmentBaseIndexPercent ) ); // Base Index (Percent)	
		percents.setRentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear( search( rentIndexAdjustmentsIndexAdjustmentIndexPercentAtBaseYear ) ); // Index Percent at Base Year	
		percents.setRentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease( search( rentIndexAdjustmentsIndexAdjustmentMinimumPercentIncrease ) ); // Minimum % Increase
		percents.setRentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease( search( rentIndexAdjustmentsIndexAdjustmentLifetimeMinimumPercentIncrease ) ); // Lifetime Min % Increase
		percents.setRentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease( search( rentIndexAdjustmentsIndexAdjustmentMaximumPercentIncrease ) ); // Maximum % Increase
		percents.setRentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease( search( rentIndexAdjustmentsIndexAdjustmentLifetimeMaximumPercentIncrease ) ); // Lifetime Max % Increase
		percents.setRentFairMarketRateValuePercentageOfRate( search( rentFairMarketRateValuePercentageOfRate ) ); // Percentage of Rate	
		percents.setRentFairMarketRateValueCurrentRate( search( rentFairMarketRateValueCurrentRate ) ); // Current Rate
		percents.setRentFairMarketRateValueOriginalRate( search( rentFairMarketRateValueOriginalRate ) ); // Original Rate
		percents.setRentFairMarketRateValueMinimumPercentIncrease( search( rentFairMarketRateValueMinimumPercentIncrease ) ); // Minimum % Increase	
		percents.setRentFairMarketRateValueLifetimeMinimumPercentIncrease( search( rentFairMarketRateValueLifetimeMinimumPercentIncrease ) ); // Lifetime Min % Increase
		percents.setRentFairMarketRateValueMaximumPercentIncrease( search( rentFairMarketRateValueMaximumPercentIncrease ) ); // Maximum % Increase
		percents.setRentFairMarketRateValueLifetimeMaximumPercentIncrease( search( rentFairMarketRateValueLifetimeMaximumPercentIncrease ) ); // Lifetime Max % Increase
		percents.setRentSalesReportingDetailsPercentRent( search( rentSalesReportingDetailsPercentRent ) ); // % Rent
		percents.setRentTaxExclusionsTaxRatePercent( search( rentTaxExclusionsTaxRatePercent ) ); // Tax Rate %
		percents.setRentPercentRentSchedulesPaymentType( search( rentPercentRentSchedulesPaymentType ) ); // Payment Type
		percents.setRentPercentRentSchedulesDescription( search( rentPercentRentSchedulesDescription ) ); // Description
		percents.setRentPercentRentSchedulesrequencyType( search( rentPercentRentSchedulesrequencyType ) ); // Frequency Type
		percents.setRentPercentRentSchedulesContractRentable( search( rentPercentRentSchedulesContractRentable ) ); // Contract Rentable
		percents.setRentPercentRentSchedulesChargeAmountBasis( search( rentPercentRentSchedulesChargeAmountBasis ) ); // Charge Amount Basis
		percents.setRentCommissionDetailsPercent( search( rentCommissionDetailsPercent ) ); // Percent
		percents.setRentCommissionSchedulesContractRentable( search( rentCommissionSchedulesContractRentable ) ); // Contract Rentable
		percents.setSecurityDepositDepositDetailsCurrentInterestRatePercent( search( securityDepositDepositDetailsCurrentInterestRatePercent ) ); // 320
		percents.setRightsHoldoverRentPenaltyPercentage( search( rightsHoldoverRentPenaltyPercentage ) ); // 379 Rent Penalty - Percentage
		percents.setOpexCamCamAuditSetupCapGrowthPercent( search( opexCamCamAuditSetupCapGrowthPercent ) ); // 479 Cap Growth % 
		percents.setOpexCamCamAuditSetupMinimumPercentIncrease( search( opexCamCamAuditSetupMinimumPercentIncrease ) ); // 481 Min Percent Increase
		percents.setOpexCamCamAuditSetupMaximumPercentIncrease( search( opexCamCamAuditSetupMaximumPercentIncrease ) ); // 483 Max Percent Increase
		percents.setOpexCamCamAuditSetupAdministrationFeePercent( search( opexCamCamAuditSetupAdministrationFeePercent ) ); // 491 Administration Fee %
		percents.setOpexCamCamAuditSetupProRataNegotiatedPercent( search( opexCamCamAuditSetupProRataNegotiatedPercent ) ); // 493 Pro Rata Negotiated (Percent)
		percents.setOpexCamCamSchedulesContractRentable( search( opexCamCamSchedulesContractRentable ) ); // 507 Contract Rentable
		percents.setInsuranceInsuranceSchedulesContractRentable( search( insuranceInsuranceSchedulesContractRentable ) ); // 546 Contract Rentable
		percents.setTaxTaxDetailsTaxRatePercent( search( taxTaxDetailsTaxRatePercent ) ); // 562 Tax Rate %	taxRatePercent		
		percents.setTaxTaxSchedulesContractRentable( search( taxTaxSchedulesContractRentable ) ); // 579 Contract Rentable
		percents.setCoTenancyCoTenancyDetailsRentReducedByPercent( search( coTenancyCoTenancyDetailsRentReducedByPercent ) ); // 607 Rent Reduced By (Percent)
		percents.setCoTenancyCoTenancyItemSalesPercentage( search( coTenancyCoTenancyItemSalesPercentage ) ); // 615 Sales Percentage
		percents.setCoTenancyCoTenancyItemRentReducedByPercent( search( coTenancyCoTenancyItemRentReducedByPercent ) ); // 618 Rent Reduced By (Percent)
		percents.setResponsibilitiesResponsibilityServiceLandlordPercent( search( responsibilitiesResponsibilityServiceLandlordPercent ) ); // 659 Landlord %
		percents.setResponsibilitiesResponsibilityServiceTenantPercent( search( responsibilitiesResponsibilityServiceTenantPercent ) ); // 660 Tenant %
		percents.setResponsibilitiesResponsibilityServiceCapPercent( search( responsibilitiesResponsibilityServiceCapPercent ) ); // 666 Cap Percent
		percents.setAccountingOperatingPortionOfCapitalLeasePercent( search( accountingOperatingPortionOfCapitalLeasePercent ) ); // 689 Operating Portion of Capital Lease %
		percents.setAccountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate( search( accountingBorrowRateAndPercentGrowthAssumptionsIncrementalBorrowingRate ) ); // 692 Incremental Borrowing Rate
		percents.setAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance( search( accountingBorrowRateAndPercentGrowthAssumptionsPercentIsMaintenance ) ); // 693 % Is Maintenance
		percents.setAccountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent( search( accountingBorrowRateAndPercentGrowthAssumptionsIndexGrowthPercent ) ); // 694 Index Growth %
		percents.setAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax( search( accountingBorrowRateAndPercentGrowthAssumptionsPercentIsTax ) ); // 695 % Is Tax
		percents.setAccountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent( search( accountingBorrowRateAndPercentGrowthAssumptionsFmrvGrowthPercent ) ); // 696 FMRV Growth %
		percents.setAccountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther( search( accountingBorrowRateAndPercentGrowthAssumptionsPercentIsOther ) ); // 697 % Is Other
		percents.setAccountingFasb13TreatmentLeaseRateUsedCalculated( search( accountingFasb13TreatmentLeaseRateUsedCalculated ) ); // 704 Lease Rate Used (Calculated)
		percents.setAccountingFasb13TreatmentLandPercentage( search( accountingFasb13TreatmentLandPercentage ) ); // 710 Land Percentage
		
		return percents;		
	}
	
	private Double search(String s) {
		if( s != null && s != "" ) {
			List<String> criteriaList = Arrays.asList(s.split(","));				
			for (String criteria : criteriaList) {
				Optional<Entry<String, String>> map = foundStuff.entrySet().stream()
			      .filter (e -> e.getValue().toLowerCase().contains( criteria.toLowerCase() )).findFirst();
				
				if(map.isPresent()) {
					return Double.valueOf( map.get().getKey() );
				}
			}
		}
		return null;		
	}
}