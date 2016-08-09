package net.newbiz.ebil.billing.service.iface;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import net.newbiz.ebil.billing.model.BillingSearchCustomerModel;

public interface BillingCustomerSearchExecService {

	List<BillingSearchCustomerModel> execute(Map<String, Object> params);
}
