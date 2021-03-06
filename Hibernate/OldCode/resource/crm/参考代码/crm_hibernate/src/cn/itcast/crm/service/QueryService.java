package cn.itcast.crm.service;

import java.util.List;

import cn.itcast.crm.domain.CstCustomer;
import cn.itcast.crm.domain.CstCustomerDetail;
import cn.itcast.crm.domain.CstLinkman;
import cn.itcast.crm.domain.QueryVo;
import cn.itcast.crm.domain.SaleVisit;

public interface QueryService {


	//查询联系人列表总记录数
	public long findLinkmanCount(CstLinkman cstLinkman);
	//查询联系人列表
	public List<CstLinkman> findLinkmanList(CstLinkman cstLinkman,int firstResult,int maxResults);
	

	//客户拜访总记录数
	public long findSaleVisitCount(QueryVo queryVo);
	//客户拜访列表
	public List<SaleVisit> findSaleVisitList(QueryVo queryVo, int firstResult, int maxResults);
}
