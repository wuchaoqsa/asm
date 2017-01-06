package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetHouse;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;
import com.sam.service.AssetHouseService;
import com.sam.util.ConstantUtil;

/**
 * 查询仓库
 * 
 * @author gaohailong
 *
 */
@RequestMapping(value="/wareHouse")
@Controller
public class WarehouseController extends BaseController {

	@Autowired
	private AssetHouseService assetHouseService;

	/**
	 * 查询所有的一级仓库
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/findAllFirstHouse", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetHouse> findAllFirstHouse() throws Exception {
		return assetHouseService.findHouseByAhlevel(0);
	}
	
	/**
	 * 查询所有的二级仓库
	 * 
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/findAllSecondHouse", method = RequestMethod.GET)
	public List<AssetHouse> findAllSecondHouse(Integer ahlevel) throws Exception {
		return assetHouseService.findHouseByAhlevel(ahlevel);
	}
	
	/**
	 * 分页根据存放地点查询设备
	 * @author zhw
	 * @param ahname
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findAssetInfosByAhname", method = RequestMethod.POST)
	public Pager<AssetInfo> findAssetInfosByAhname(String ahname, Integer page) {
		try {
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			Pager<AssetInfo> assetResult = assetHouseService.findAssetInfos(ahname, pageNum, ConstantUtil.DEFAULT_PAGE_SIZE);
			return assetResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
