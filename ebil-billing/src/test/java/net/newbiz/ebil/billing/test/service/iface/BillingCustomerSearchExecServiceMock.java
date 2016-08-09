package net.newbiz.ebil.billing.test.service.iface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.newbiz.ebil.billing.model.BillingSearchCustomerModel;
import net.newbiz.ebil.billing.service.iface.BillingCustomerSearchExecService;

@Service("BillingCustomerSearchExecService")
public class BillingCustomerSearchExecServiceMock implements BillingCustomerSearchExecService {

	/** Logger */
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BillingCustomerSearchExecServiceMock.class);

	public List<BillingSearchCustomerModel> execute(Map<String, Object> params)
	{
		log.info("{}が呼ばれました", Thread.currentThread().getStackTrace()[0].getMethodName());
		
		List<BillingSearchCustomerModel> result = new ArrayList<BillingSearchCustomerModel>();
		for (int i=0; i < 3; i++)
		{
			BillingSearchCustomerModel m = new BillingSearchCustomerModel();
			m.setCustName("ああああああ");
			m.setBillNo("999999999999");
			m.setCustId("9999999999");
			m.setAddr("大阪府大阪市○○区○○市１－１");
			m.setPostCd("000-0000");
			m.setDepositSrc("振込");
			m.setTelNo("06-0000-00000");
			m.setBillDate("20160415");
			
			result.add(m);
		}
		
		return result;
	}
}
