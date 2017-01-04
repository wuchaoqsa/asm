package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;

public interface DepartmentDao {
	
	public List<AssetDepartment> findAssetDepartmentsByAdlevel(Integer adlevel);
	
	
	/**
	 * 根据部门查询资产
	 * @param dname
	 * @return
	 */
	public List<AssetInfo> findAssetInfosByDname(String dname);

	/**
	 * 查询全部的资产
	 * @return
	 */
	public List<AssetInfo> findAssetInfos();

}
