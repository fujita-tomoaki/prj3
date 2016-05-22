package com.common.dao;

import java.util.List;
import java.util.Map;

import com.common.dao.model.T0a9;

public interface T0a9CustomMapper extends T0a9Mapper {

	/**
	 * 
	 * @param params
	 * @return
	 */
    List<T0a9> findByPublicCertificate(Map params);
}