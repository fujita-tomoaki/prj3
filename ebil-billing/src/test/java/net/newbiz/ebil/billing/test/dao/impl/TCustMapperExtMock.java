package net.newbiz.ebil.billing.test.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import net.newbiz.ebil.billing.dao.TCustMapperExt;
import net.newbiz.ebil.billing.dao.model.TCust;
import net.newbiz.ebil.billing.dao.model.TCustExample;

@Component("TCustMapperExt")
public class TCustMapperExtMock extends TCustMapperMockBase implements TCustMapperExt
{
	/** Logger */
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TCustMapperExtMock.class);

	@Override
	public List<TCust> selectDistinctNameByExample(TCustExample example) {
		
		log.info("{}が呼ばれました", Thread.currentThread().getStackTrace()[0].getMethodName());
		
		// TODO Auto-generated method stub
		return new ArrayList();
	}
}
