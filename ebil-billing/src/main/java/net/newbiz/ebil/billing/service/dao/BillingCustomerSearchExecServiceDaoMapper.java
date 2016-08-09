package net.newbiz.ebil.billing.service.dao;

import java.util.List;
import java.util.Map;

public interface BillingCustomerSearchExecServiceDaoMapper {
    
	List<Map<String, Object>> searchCust(Map<String, Object> params);
}