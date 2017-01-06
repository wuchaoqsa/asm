package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.dao.RequireDao;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.entity.Pager;
import com.sam.service.RequireService;
import com.sam.util.CreateRandom;

/**
 * 维修表的serviceimpl
 * @author yty
 *
 */
@Service
public class RequireServiceImpl implements RequireService{

	@Autowired
	private RequireDao requireDao;
	@Autowired
	private InfoDao infoDao;
	
	/**
	 * 增加一条维修记录
	 */
	@Override
	public int addRequire(String aiidStr,AssetRequire require) throws Exception{
		CreateRandom cr = new CreateRandom();
		int arid = cr.createRandom();
		require.setArid(arid);
		String[] idStr  = aiidStr.split(",");
		if(idStr!=null){
			for(int i=0;i<idStr.length;i++){
				Integer aiid = Integer.parseInt(idStr[i]);
				AssetInfo info = new AssetInfo();
				info.setRepairid(arid);
				info.setAiid(aiid);
				infoDao.updInfoAsname(info);
			}
		}
		return requireDao.addRequire(require);
	}
	
	/**
	 * @author zhw
	 * @param require
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	@Override
	public Pager<AssetRequire> findAssetRequires(AssetRequire require,
			Integer pageNum, Integer pageSize) throws Exception {
		List<AssetRequire> requireList = findAssetRequires(require);
		Pager<AssetRequire> pager = new Pager<AssetRequire>(pageNum, pageSize, requireList);
		return pager;
	}
	
	private List<AssetRequire> findAssetRequires(AssetRequire require) throws Exception {
		return requireDao.findAssetRequires(require);
		
		
	}
		
	
}
