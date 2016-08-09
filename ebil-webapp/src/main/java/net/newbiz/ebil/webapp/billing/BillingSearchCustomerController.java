package net.newbiz.ebil.webapp.billing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.newbiz.ebil.billing.model.BillingSearchCustomerModel;
import net.newbiz.ebil.billing.service.iface.BillingCustomerSearchExecService;

@Controller
public class BillingSearchCustomerController {
	
	/** Logger SLF4J */
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BillingSearchCustomerController.class);

	/** Logger log4j */
	private static org.apache.logging.log4j.Logger log4j = org.apache.logging.log4j.LogManager.getLogger(BillingSearchCustomerController.class);

	/** Logger SLF4J(追加ロガー) */
	private static org.slf4j.Logger logB = org.slf4j.LoggerFactory.getLogger("tafujiDevLogger");

	@Autowired
	private BillingCustomerSearchExecService billingCustomerSearchExecService;
	
	public void setBillingCustomerSearchExecService(BillingCustomerSearchExecService billingCustomerSearchExecService)
	{
		this.billingCustomerSearchExecService = billingCustomerSearchExecService;
	}

	@RequestMapping("/billing")
	public ModelAndView execBillingInit(
				@RequestParam(value="aaa", required=false)boolean aaa,
				ModelAndView mav)
	{
//		// SLF4J
//		log.trace("すぐやる");
//		log.debug("いまやる");
//		log.info("できるまでやる");
//		log.warn("できる方法をさがす");
//		log.error("そのための知識を身につけておく");
//		
//		// 追加ロガー
//		logB.debug("このメッセージは切り分けて出したいんです");
//		
//		String obj1 = "計算処理";
//		log.error("{}で{}のエラーが発生しました", obj1, "想定外");
//		log.error("{}で{}のエラーが発生しました", new String[]{obj1, "想定内"});
//		
//		try
//		{
//			throw new RuntimeException("まさかの例外発生ッ！Σ(゜□゜");
//		}
//		catch (Exception e)
//		{
//			log.error("システムエラー", e);
//		}

		Boolean[] payWayChecked = {
				false, 
				false, 
				false, 
				false, 
			};
		
		mav.addObject("billDate", "");
		mav.addObject("payWayChecked", payWayChecked);
		mav.addObject("custId", "");
		mav.addObject("custNm", "");
		
		mav.setViewName("billing/BillingSearchCustomer");
		return mav;
	}
	
	@RequestMapping("/billing/search")
	public ModelAndView execBillingCustomerSearch(
				@RequestParam(value="billDate", required=false)String billDate,
				@RequestParam(value="payWay",   required=false)String[] payWay,
				@RequestParam(value="custId",   required=false)String custId,
				@RequestParam(value="custNm",   required=false)String custNm,
				ModelAndView mav)
	{
		Map<String, Object> params = new HashMap<String, Object>();

		if (custNm != null && !"".equals(custNm))
		{
			params.put("cust_kana", custNm);
		}
		if (custId != null && !"".equals(custId))
		{
			params.put("cust_cd", custId);
		}
		if (billDate != null && !"".equals(billDate))
		{
			params.put("bill_date", billDate);
		}
			
//		payTypeCdList.add(""0101"");
		String pay_type_cd = null;
		if (payWay != null && payWay.length > 0)
		{
			pay_type_cd = "";
			for (int i=0; i < payWay.length; i++)
			{
				if (i > 0) {
					pay_type_cd += ",";
				}
				pay_type_cd += "'" + payWay[i] + "'";
			}
			params.put("pay_type_cd", pay_type_cd);	
		}
		
		List<BillingSearchCustomerModel> modelList = billingCustomerSearchExecService.execute(params);
		
		for (int i=0; i < modelList.size(); i++)
		{
			BillingSearchCustomerModel m = modelList.get(i);
			String billDateTmp = m.getBillDate();
			billDateTmp = billDateTmp.substring(0, 4) + "/" + billDateTmp.substring(4, 6) + "/" + billDateTmp.substring(6, 8);
			m.setBillDate(billDateTmp);
		}
		
		mav.addObject("billInfoList", modelList);
		
		Boolean[] payWayChecked = {
				isCheckedPayway("0101", payWay), 
				isCheckedPayway("0102", payWay), 
				isCheckedPayway("0201", payWay), 
				isCheckedPayway("0301", payWay), 
			};
		
		mav.addObject("billDate", billDate);
		mav.addObject("payWayChecked", payWayChecked);
		mav.addObject("custId", custId);
		mav.addObject("custNm", custNm);
		
		mav.setViewName("billing/BillingSearchCustomer");
		return mav;
	}
	
	private boolean isCheckedPayway(String cd, String[] userCheckedCd)
	{
		for (int i=0; i < userCheckedCd.length; i++)
		{
			if (cd.equals(userCheckedCd[i]))
			{
				return true;
			}
		}
		return false;
	}
}
