package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetBroorw;
import com.sam.entity.AssetInfo;

/**
 * 设备借出申请,借出记录
 * @author zhw
 *
 */
public interface BroorwDao {

	/**
	 * 普通用户提出借出申请添加申请
	 * @author zhw
	 * @return
	 * @throws Exception
	 */
	public int addBroow(AssetBroorw broorw) throws Exception;
	
	int updBroorwWhenRefuse(AssetBroorw broorw) throws Exception;
	
	AssetBroorw findBroorwByAbid(Integer abid) throws Exception;
	
	int updBroorwWhenOk(Integer abid) throws Exception;
	
	List<AssetBroorw> findBroorwsByCondition(AssetBroorw broorw) throws Exception;
	
	/**
	 * 查询全部借出申请
	 * @author zhw
	 * @return
	 * @throws Exception
	 */
	public List<AssetBroorw> findBroorws() throws Exception;
	
	/**
	 * 归还时修改借出记录为已归还
	 * @author zhw
	 * @param abroowId
	 * @return
	 * @throws Exception
	 */
	public int updateBroowWhenBack(Integer abroowId) throws Exception;
	
	
		
}
