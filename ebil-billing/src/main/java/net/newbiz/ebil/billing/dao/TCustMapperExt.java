package net.newbiz.ebil.billing.dao;

import java.util.List;
import net.newbiz.ebil.billing.dao.model.TCust;
import net.newbiz.ebil.billing.dao.model.TCustExample;

public interface TCustMapperExt extends TCustMapper {

	/**
	 * 
	 * @param example
	 * @return
	 */
    List<TCust> selectDistinctNameByExample(TCustExample example);

}