package net.newbiz.ebil.billing.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.newbiz.ebil.billing.dao.TBillMapper;
import net.newbiz.ebil.billing.dao.TCustMapper;
import net.newbiz.ebil.billing.dao.TCustMapperExt;
import net.newbiz.ebil.billing.dao.model.TBill;
import net.newbiz.ebil.billing.dao.model.TBillExample;
import net.newbiz.ebil.billing.dao.model.TCust;
import net.newbiz.ebil.billing.dao.model.TCustExample;
import net.newbiz.ebil.billing.model.BillingSearchCustomerModel;
import net.newbiz.ebil.billing.service.dao.BillingCustomerSearchExecServiceDaoMapper;
import net.newbiz.ebil.billing.service.iface.BillingCustomerSearchExecService;

@Service("BillingCustomerSearchExecService")
public class BillingCustomerSearchExecServiceImpl implements BillingCustomerSearchExecService {

	/** Logger */
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BillingCustomerSearchExecServiceImpl.class);

//	@Autowired
//	private TCustMapper tCustMapper;
//	
//	public void setTCustMapper(TCustMapper tCustMapper)
//	{
//		this.tCustMapper = tCustMapper;
//	}

	@Autowired
	private TCustMapperExt tCustMapperExt;
	
	public void setTCustMapperExt(TCustMapperExt tCustMapperExt)
	{
		this.tCustMapperExt = tCustMapperExt;
	}

	@Autowired
	private BillingCustomerSearchExecServiceDaoMapper billingCustomerSearchExecServiceDaoMapper;

	public void setBillingCustomerSearchExecServiceDaoMapper(BillingCustomerSearchExecServiceDaoMapper billingCustomerSearchExecServiceDaoMapper)
	{
		this.billingCustomerSearchExecServiceDaoMapper = billingCustomerSearchExecServiceDaoMapper;
	}
	
//	@Autowired
//	private TBillMapper tBillMapper;
//	
//	public void setTBillMapper(TBillMapper tBillMapper)
//	{
//		this.tBillMapper = tBillMapper;
//	}
	
	public List<BillingSearchCustomerModel> execute(Map<String, Object> params)
	{
//		log.info("開始", Thread.currentThread().getStackTrace()[0].getMethodName());
		log.debug("チェックポイント({})", 1);
		
		List<BillingSearchCustomerModel> result = new ArrayList<BillingSearchCustomerModel>();

//		TCustExample custSearchCond = new TCustExample();
//		List<TCust> custList = tCustMapperExt.selectByExample(custSearchCond);
//		
//		for (int i=0; i < custList.size(); i++)
//		{
//			BillingSearchCustomerModel m = new BillingSearchCustomerModel();
//			m.setCustName(custList.get(i).getCustNm());
//			result.add(m);
//		}
		
		
		List<Map<String, Object>> mapList = billingCustomerSearchExecServiceDaoMapper.searchCust(params);
		for (Map<String, Object> map : mapList)
		{
			BillingSearchCustomerModel m = new BillingSearchCustomerModel();
			m.setCustName((String)map.get("cust_nm"));
			m.setBillDate((String)map.get("bill_date"));
			m.setAddr((String)map.get("cust_addr"));
			m.setCustId(Integer.toString((Integer)map.get("cust_cd")));
			m.setBillNo(Long.toString((Long)map.get("bill_no")));
			m.setDepositSrc((String)map.get("pay_type_nm"));
			m.setPostCd((String)map.get("cust_addr_postcd"));
			m.setTelNo((String)map.get("cust_telno"));
			result.add(m);
		}
		
//		TBillExample billSearchCond = new TBillExample();
//		List<TBill> billList = tBillMapper.selectByExample(billSearchCond);
//		for (int i=0; i < billList.size(); i++)
//		{
//			TBill bill = billList.get(i);
//			System.out.println(bill.getBillNo());
//		}

		log.debug("チェックポイント({})", 2);
		
		return result;
	}
}
