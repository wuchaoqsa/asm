package com.sam.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.entity.Pager;
import com.sam.service.InfoService;
import com.sam.util.ConstantUtil;

@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoDao infoDao;

	@Override
	public int addInfo(AssetInfo info) throws Exception {

		return infoDao.addInfo(info);
	}

	@Override
	public List<AssetInfo> findInfoByAsname(String asname) throws Exception {
		return infoDao.findInfoByAsname(asname);
	}

	@Override
	public List<AssetInfo> findInfoByAcid(Integer acid) throws Exception {
		return infoDao.findInfoByAcid(acid);
	}

	@Override
	public List<AssetRequire> findInfoArid(Integer arid) throws Exception {
		return infoDao.findInfoByArid(arid);
	}

	@Override
	public Pager<AssetInfo> findAssetByCondition(AssetInfo assetInfo,Integer pageNum,Integer pageSize)
			throws Exception {
		List<AssetInfo> assetInfos= infoDao.findInfoByCondition(assetInfo);
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfos);
		return pager;
	}
}
