package net.newbiz.ebil.webapp.billing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.newbiz.ebil.billing.model.BillingSearchCustomerModel;
import net.newbiz.ebil.billing.service.BillingCustomerSearchExecService;

@Controller
public class BillingSearchCustomerController {
	
	@Autowired
	private BillingCustomerSearchExecService billingCustomerSearchExecService;
	
	public void setBillingCustomerSearchExecService(BillingCustomerSearchExecService billingCustomerSearchExecService)
	{
		this.billingCustomerSearchExecService = billingCustomerSearchExecService;
	}
	
	@RequestMapping("/billing")
	public ModelAndView index(
				@RequestParam(value="aaa", required=false)boolean aaa,
				ModelAndView mav)
	{
		mav.addObject("msg", "書きたいことかく");
		if (aaa) {
			mav.addObject("bbb", new Boolean(true));
		}
		else {
			mav.addObject("bbb", new Boolean(false));
		}
		
		List<BillingSearchCustomerModel> modelList = billingCustomerSearchExecService.execute();
		
//		List<BillingSearchCustomerModel> modelList = new ArrayList<BillingSearchCustomerModel>();
//		for (int i=0; i < 3; i++)
//		{
//			BillingSearchCustomerModel m = new BillingSearchCustomerModel();
//			m.setCustName("あいうえお");
//			modelList.add(m);
//		}
		
		mav.addObject("billInfoList", modelList);
		
		mav.setViewName("billing/BillingSearchCustomer");
		return mav;
	}
}
