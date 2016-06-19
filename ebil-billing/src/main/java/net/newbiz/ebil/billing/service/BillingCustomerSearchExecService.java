package net.newbiz.ebil.billing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.newbiz.ebil.billing.dao.TBillMapper;
import net.newbiz.ebil.billing.dao.TCustMapper;
import net.newbiz.ebil.billing.dao.model.TBill;
import net.newbiz.ebil.billing.dao.model.TBillExample;
import net.newbiz.ebil.billing.dao.model.TCust;
import net.newbiz.ebil.billing.dao.model.TCustExample;
import net.newbiz.ebil.billing.model.BillingSearchCustomerModel;

@Service
public class BillingCustomerSearchExecService {

	@Autowired
	private TCustMapper tCustMapper;
	
	public void setTCustMapper(TCustMapper tCustMapper)
	{
		this.tCustMapper = tCustMapper;
	}

	@Autowired
	private TBillMapper tBillMapper;
	
	public void setTBillMapper(TBillMapper tBillMapper)
	{
		this.tBillMapper = tBillMapper;
	}
	
	public List<BillingSearchCustomerModel> execute()
	{
		List<BillingSearchCustomerModel> result = new ArrayList<BillingSearchCustomerModel>();

		TCustExample custSearchCond = new TCustExample();
		List<TCust> custList = tCustMapper.selectByExample(custSearchCond);
		
		for (int i=0; i < custList.size(); i++)
		{
			BillingSearchCustomerModel m = new BillingSearchCustomerModel();
			m.setCustName(custList.get(i).getCustNm());
			result.add(m);
		}
		
//		TBillExample billSearchCond = new TBillExample();
//		List<TBill> billList = tBillMapper.selectByExample(billSearchCond);
//		for (int i=0; i < billList.size(); i++)
//		{
//			TBill bill = billList.get(i);
//			System.out.println(bill.getBillNo());
//		}
		
		return result;
	}
}
