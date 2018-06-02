package cn.chinaSoft.pandaMall.sellerCenter.service.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.chinaSoft.pandaMall.common.base.Query;
import cn.chinaSoft.pandaMall.common.constant.PmConstant;
import cn.chinaSoft.pandaMall.common.dao.BaseDao;
import cn.chinaSoft.pandaMall.common.entity.Good;
import cn.chinaSoft.pandaMall.sellerCenter.entity.SellerGoodInfo;
import cn.chinaSoft.pandaMall.sellerCenter.service.SellerService;

@Service("SellerService")
public class SellerServiceImpl implements SellerService {

	@Autowired
	private BaseDao basedao;
	
	@Override
	public List<?> getGoodsList(SellerGoodInfo sellerGoodInfo) {
		Query query=new Query();
		query.setSqlName("getGoodsListBySellerId");
		Map<String, Object> sqlParameters=new HashMap<>();
		sqlParameters.put("userId", sellerGoodInfo.getGood().getId());
		query.setSqlParameters(sqlParameters);
		List<Good> goods=basedao.selectList(query);
		//拼接图片路径
		for(Good good : goods) {
			if(!StringUtils.isEmpty(good.getImgNames())) {
				String[] imageArr=good.getImgNames().split(",");
				String imageUrls="";
				for (String imageName:imageArr) {
					String imgPath=PmConstant.RESPONSE_PREFIX_PIC+"good"+File.separator+good.getId()+File.separator+imageName+",";
					imageUrls+=(imgPath);
				}
				good.setImgNames(imageUrls.substring(0, imageUrls.length()-1));
			}
		}
		return goods;
	}

}
