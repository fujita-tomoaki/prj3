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
public class BillingSearchCustomerController2 {
	
	/** Logger */
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BillingSearchCustomerController2.class);

	/** Logger */
	private static org.apache.logging.log4j.Logger log4j = org.apache.logging.log4j.LogManager.getLogger(BillingSearchCustomerController2.class);
	
	@Autowired
	private BillingCustomerSearchExecService billingCustomerSearchExecService;
	
	public void setBillingCustomerSearchExecService(BillingCustomerSearchExecService billingCustomerSearchExecService)
	{
		this.billingCustomerSearchExecService = billingCustomerSearchExecService;
	}
	
	@RequestMapping("/billing2")
	public ModelAndView index(
				@RequestParam(value="aaa", required=false)boolean aaa,
				ModelAndView mav)
	{
		long start = System.currentTimeMillis();
		
		// ログがファイルに出力されない場合：　SLF4Jのアペンダーが他のものと競合している可能性がある
		// 今回の場合、jul-to-slf4j, jcl-to-slf4jをmavenの依存関係から外すことで対応
		for (int i=0; i < 1; i++)
		{
//			log4j.info("--- 請求管理画面起動 ---");
			log.info("ログ{}メッセージ:{}", i, "画面起動");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("所要時間： " + (end - start) + "ミリ秒");;
		
//		try
//		{
//			if (mav.getModel().get("aaa") == null) {
//				throw new RuntimeException();
//			}
//		} catch (RuntimeException e) {
//			log.error("システムエラー発生", e);
//		}
		
		mav.addObject("msg", "書きたいことかく");
		if (aaa) {
			mav.addObject("bbb", new Boolean(true));
		}
		else {
			mav.addObject("bbb", new Boolean(false));
		}

		Map<String, Object> params = new HashMap<String, Object>();
		List<BillingSearchCustomerModel> modelList = billingCustomerSearchExecService.execute(params);
		
		mav.addObject("billInfoList", modelList);
		
		mav.setViewName("billing/BillingSearchCustomer");
		return mav;
	}
}
