/**
 * Copyright &copy; 2017-2018 <a href="">Bmsmart</a> All rights reserved.
 */
package com.bmsmart.mes.plan.dao;

import com.bmsmart.mes.commons.persistence.MesCrudDao;
import com.bmsmart.mes.plan.dao.mybatis.MyBatisRepository;
import com.bmsmart.mes.plan.domain.po.MesPlanShiftWorker;

/**
 * testDAO接口
 * @author zhouqizhi
 * @version 2017-10-18
 */
@MyBatisRepository
public interface MesPlanShiftWorkerDao extends MesCrudDao<MesPlanShiftWorker> {
	//public void deleteById(String id);
}