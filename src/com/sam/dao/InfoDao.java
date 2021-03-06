package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetChartUtils;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;

public interface InfoDao {

	int addInfo(AssetInfo info) throws Exception;
	
	int updInfoAddBroorw(AssetInfo info) throws Exception;
	
	int updInfoWhenBroorwOk(AssetInfo info) throws Exception;
	
	int updInfoWhenBroorwRefuse(Integer broorwid) throws Exception;

	List<AssetInfo> findInfoByAiname(String ainame) throws Exception;

	/**
	 * 根据设备类型名称查询
	 * @param atname
	 * @return
	 * @throws Exception
	 */
	List<AssetInfo> findInfoByAtname(String atname) throws Exception;
	
	/**
	 * 根据设备类型名称查询剩余件数
	 * @param atname
	 * @return
	 * @throws Exception
	 */
	int findInfoNumByAtname(String atname) throws Exception;
	
	
	AssetInfo findInfoByAiid(Integer aiid) throws Exception;

	int updInfoAsname(AssetInfo info) throws Exception;

	int updInfoAcid(AssetInfo info) throws Exception;

	/**
	 * 根据使用状态查询设备
	 * 
	 * @author Administrator
	 * @param asname
	 * @return
	 * @throws Exception
	 */
	public List<AssetInfo> findInfoByAsname(String asname) throws Exception;

	/**
	 * 查询借出设备
	 */
	public List<AssetInfo> findInfoByAcid(Integer acid) throws Exception;

	/**
	 * 查询维修中的设备
	 * 
	 * @param arid
	 * @return
	 * @throws Exception
	 */
	public List<AssetRequire> findInfoByArid(Integer arid) throws Exception;

	/**
	 * 设备多条件查询
	 */
	public List<AssetInfo> findInfoByCondition(AssetInfo AssetInfo)
			throws Exception;

	/**
	 * 查询全部的资产
	 * @return
	 */
	public List<AssetInfo> findAssetInfos();
	
	/**
	 * 折线图查询
	 * @author gaohailong
	 */
	List<AssetChartUtils> findLineChart();
	
	/**
	 * 仓库查询
	 * @author gaohailong
	 */
	List<AssetChartUtils> findHouseLineChart();
	
	/**
	 * 查询分类和对应仓库的方法
	 * @author gaohailong
	 */
	List<AssetChartUtils> findHouseCateAndWareChart();
	
	/**
	 * 资产借出后的归还,
	 * 修改资产的状态为 未使用
	 * @author zhw
	 * @param asname
	 * @return
	 * @throws Exception
	 */
	public int updateAssetInfoBybroorwid(Integer broorwid) throws Exception;
	
}
