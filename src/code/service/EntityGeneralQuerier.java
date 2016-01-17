package com.palette.busi.project.tms.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palette.busi.project.tms.core.page.PageInfo;
import com.palette.busi.project.tms.core.dao.CdAttachmentDao;
import com.palette.busi.project.tms.core.entity.CdAttachment;
import com.palette.busi.project.tms.core.dao.CdAttachmentRefDao;
import com.palette.busi.project.tms.core.entity.CdAttachmentRef;
import com.palette.busi.project.tms.core.dao.CdCityDao;
import com.palette.busi.project.tms.core.entity.CdCity;
import com.palette.busi.project.tms.core.dao.CdCountryDao;
import com.palette.busi.project.tms.core.entity.CdCountry;
import com.palette.busi.project.tms.core.dao.CdCountryRefDao;
import com.palette.busi.project.tms.core.entity.CdCountryRef;
import com.palette.busi.project.tms.core.dao.CdDeliveryDao;
import com.palette.busi.project.tms.core.entity.CdDelivery;
import com.palette.busi.project.tms.core.dao.CdDistrictDao;
import com.palette.busi.project.tms.core.entity.CdDistrict;
import com.palette.busi.project.tms.core.dao.CdLogisticsVendorDao;
import com.palette.busi.project.tms.core.entity.CdLogisticsVendor;
import com.palette.busi.project.tms.core.dao.CdPortDao;
import com.palette.busi.project.tms.core.entity.CdPort;
import com.palette.busi.project.tms.core.dao.CdResRoleDao;
import com.palette.busi.project.tms.core.entity.CdResRole;
import com.palette.busi.project.tms.core.dao.CdResourceDao;
import com.palette.busi.project.tms.core.entity.CdResource;
import com.palette.busi.project.tms.core.dao.CdRoleDao;
import com.palette.busi.project.tms.core.entity.CdRole;
import com.palette.busi.project.tms.core.dao.CdSequenceDao;
import com.palette.busi.project.tms.core.entity.CdSequence;
import com.palette.busi.project.tms.core.dao.CdServiceProductDao;
import com.palette.busi.project.tms.core.entity.CdServiceProduct;
import com.palette.busi.project.tms.core.dao.CdStateDao;
import com.palette.busi.project.tms.core.entity.CdState;
import com.palette.busi.project.tms.core.dao.CdUserDao;
import com.palette.busi.project.tms.core.entity.CdUser;
import com.palette.busi.project.tms.core.dao.CdUserPwdDao;
import com.palette.busi.project.tms.core.entity.CdUserPwd;
import com.palette.busi.project.tms.core.dao.CdUserRoleDao;
import com.palette.busi.project.tms.core.entity.CdUserRole;
import com.palette.busi.project.tms.core.dao.CdUserWarehouseDao;
import com.palette.busi.project.tms.core.entity.CdUserWarehouse;
import com.palette.busi.project.tms.core.dao.CdWarehouseDao;
import com.palette.busi.project.tms.core.entity.CdWarehouse;
import com.palette.busi.project.tms.core.dao.CrMemberDao;
import com.palette.busi.project.tms.core.entity.CrMember;
import com.palette.busi.project.tms.core.dao.SysLogDao;
import com.palette.busi.project.tms.core.entity.SysLog;
import com.palette.busi.project.tms.core.dao.TmPiecesDao;
import com.palette.busi.project.tms.core.entity.TmPieces;
import com.palette.busi.project.tms.core.dao.TmPiecesActionDao;
import com.palette.busi.project.tms.core.entity.TmPiecesAction;
import com.palette.busi.project.tms.core.dao.TmPiecesCurrentDao;
import com.palette.busi.project.tms.core.entity.TmPiecesCurrent;
import com.palette.busi.project.tms.core.dao.TmPiecesHistoryDao;
import com.palette.busi.project.tms.core.entity.TmPiecesHistory;
import com.palette.busi.project.tms.core.dao.TmPiecesRefDao;
import com.palette.busi.project.tms.core.entity.TmPiecesRef;
import com.palette.busi.project.tms.core.dao.TmSectorDao;
import com.palette.busi.project.tms.core.entity.TmSector;
import com.palette.busi.project.tms.core.dao.TmSectorActionDao;
import com.palette.busi.project.tms.core.entity.TmSectorAction;
import com.palette.busi.project.tms.core.dao.TmSectorCurrentDao;
import com.palette.busi.project.tms.core.entity.TmSectorCurrent;
import com.palette.busi.project.tms.core.dao.TmSectorHistoryDao;
import com.palette.busi.project.tms.core.entity.TmSectorHistory;
import com.palette.busi.project.tms.core.dao.TmUnitDao;
import com.palette.busi.project.tms.core.entity.TmUnit;
import com.palette.busi.project.tms.core.dao.TrDataSyncBusiDao;
import com.palette.busi.project.tms.core.entity.TrDataSyncBusi;
import com.palette.busi.project.tms.core.dao.TrDataSyncHistDao;
import com.palette.busi.project.tms.core.entity.TrDataSyncHist;
import com.palette.busi.project.tms.core.dao.WmCheckPickHistoryDao;
import com.palette.busi.project.tms.core.entity.WmCheckPickHistory;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderDao;
import com.palette.busi.project.tms.core.entity.WmDeliveryOrder;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderItemDao;
import com.palette.busi.project.tms.core.entity.WmDeliveryOrderItem;
import com.palette.busi.project.tms.core.dao.WmDeliveryOrderRefDao;
import com.palette.busi.project.tms.core.entity.WmDeliveryOrderRef;
import com.palette.busi.project.tms.core.dao.WmLocationDao;
import com.palette.busi.project.tms.core.entity.WmLocation;
import com.palette.busi.project.tms.core.dao.WmLocationCurrentDao;
import com.palette.busi.project.tms.core.entity.WmLocationCurrent;
import com.palette.busi.project.tms.core.dao.WmLocationHistoryDao;
import com.palette.busi.project.tms.core.entity.WmLocationHistory;
import com.palette.busi.project.tms.core.dao.WmTransitPiecesRecordDao;
import com.palette.busi.project.tms.core.entity.WmTransitPiecesRecord;

@Service
public class EntityGeneralQuerier {

	@Autowired private CdAttachmentDao CdAttachmentDao;
	@Autowired private CdAttachmentRefDao CdAttachmentRefDao;
	@Autowired private CdCityDao CdCityDao;
	@Autowired private CdCountryDao CdCountryDao;
	@Autowired private CdCountryRefDao CdCountryRefDao;
	@Autowired private CdDeliveryDao CdDeliveryDao;
	@Autowired private CdDistrictDao CdDistrictDao;
	@Autowired private CdLogisticsVendorDao CdLogisticsVendorDao;
	@Autowired private CdPortDao CdPortDao;
	@Autowired private CdResRoleDao CdResRoleDao;
	@Autowired private CdResourceDao CdResourceDao;
	@Autowired private CdRoleDao CdRoleDao;
	@Autowired private CdSequenceDao CdSequenceDao;
	@Autowired private CdServiceProductDao CdServiceProductDao;
	@Autowired private CdStateDao CdStateDao;
	@Autowired private CdUserDao CdUserDao;
	@Autowired private CdUserPwdDao CdUserPwdDao;
	@Autowired private CdUserRoleDao CdUserRoleDao;
	@Autowired private CdUserWarehouseDao CdUserWarehouseDao;
	@Autowired private CdWarehouseDao CdWarehouseDao;
	@Autowired private CrMemberDao CrMemberDao;
	@Autowired private SysLogDao SysLogDao;
	@Autowired private TmPiecesDao TmPiecesDao;
	@Autowired private TmPiecesActionDao TmPiecesActionDao;
	@Autowired private TmPiecesCurrentDao TmPiecesCurrentDao;
	@Autowired private TmPiecesHistoryDao TmPiecesHistoryDao;
	@Autowired private TmPiecesRefDao TmPiecesRefDao;
	@Autowired private TmSectorDao TmSectorDao;
	@Autowired private TmSectorActionDao TmSectorActionDao;
	@Autowired private TmSectorCurrentDao TmSectorCurrentDao;
	@Autowired private TmSectorHistoryDao TmSectorHistoryDao;
	@Autowired private TmUnitDao TmUnitDao;
	@Autowired private TrDataSyncBusiDao TrDataSyncBusiDao;
	@Autowired private TrDataSyncHistDao TrDataSyncHistDao;
	@Autowired private WmCheckPickHistoryDao WmCheckPickHistoryDao;
	@Autowired private WmDeliveryOrderDao WmDeliveryOrderDao;
	@Autowired private WmDeliveryOrderItemDao WmDeliveryOrderItemDao;
	@Autowired private WmDeliveryOrderRefDao WmDeliveryOrderRefDao;
	@Autowired private WmLocationDao WmLocationDao;
	@Autowired private WmLocationCurrentDao WmLocationCurrentDao;
	@Autowired private WmLocationHistoryDao WmLocationHistoryDao;
	@Autowired private WmTransitPiecesRecordDao WmTransitPiecesRecordDao;
	
	public CdAttachment selectCdAttachmentById(Integer id) {return CdAttachmentDao.selectCdAttachmentById(id);}
	public List<CdAttachment> selectCdAttachmentAll() {return CdAttachmentDao.selectAllCdAttachment();};
	public List<CdAttachment> selectCdAttachmentAllByRecord(CdAttachment param) {return CdAttachmentDao.selectAllByRecord(param);};
	public CdAttachment selectCdAttachmentOneByRecord(CdAttachment param) {return CdAttachmentDao.selectOneByRecord(param);};
	public PageInfo selectCdAttachmentPageByRecord(CdAttachment param) {return CdAttachmentDao.selectPageByRecord(param);};
	
	public CdAttachmentRef selectCdAttachmentRefById(Integer id) {return CdAttachmentRefDao.selectCdAttachmentRefById(id);}
	public List<CdAttachmentRef> selectCdAttachmentRefAll() {return CdAttachmentRefDao.selectAllCdAttachmentRef();};
	public List<CdAttachmentRef> selectCdAttachmentRefAllByRecord(CdAttachmentRef param) {return CdAttachmentRefDao.selectAllByRecord(param);};
	public CdAttachmentRef selectCdAttachmentRefOneByRecord(CdAttachmentRef param) {return CdAttachmentRefDao.selectOneByRecord(param);};
	public PageInfo selectCdAttachmentRefPageByRecord(CdAttachmentRef param) {return CdAttachmentRefDao.selectPageByRecord(param);};
	
	public CdCity selectCdCityById(Integer id) {return CdCityDao.selectCdCityById(id);}
	public List<CdCity> selectCdCityAll() {return CdCityDao.selectAllCdCity();};
	public List<CdCity> selectCdCityAllByRecord(CdCity param) {return CdCityDao.selectAllByRecord(param);};
	public CdCity selectCdCityOneByRecord(CdCity param) {return CdCityDao.selectOneByRecord(param);};
	public PageInfo selectCdCityPageByRecord(CdCity param) {return CdCityDao.selectPageByRecord(param);};
	
	public CdCountry selectCdCountryById(Integer id) {return CdCountryDao.selectCdCountryById(id);}
	public List<CdCountry> selectCdCountryAll() {return CdCountryDao.selectAllCdCountry();};
	public List<CdCountry> selectCdCountryAllByRecord(CdCountry param) {return CdCountryDao.selectAllByRecord(param);};
	public CdCountry selectCdCountryOneByRecord(CdCountry param) {return CdCountryDao.selectOneByRecord(param);};
	public PageInfo selectCdCountryPageByRecord(CdCountry param) {return CdCountryDao.selectPageByRecord(param);};
	
	public CdCountryRef selectCdCountryRefById(Integer id) {return CdCountryRefDao.selectCdCountryRefById(id);}
	public List<CdCountryRef> selectCdCountryRefAll() {return CdCountryRefDao.selectAllCdCountryRef();};
	public List<CdCountryRef> selectCdCountryRefAllByRecord(CdCountryRef param) {return CdCountryRefDao.selectAllByRecord(param);};
	public CdCountryRef selectCdCountryRefOneByRecord(CdCountryRef param) {return CdCountryRefDao.selectOneByRecord(param);};
	public PageInfo selectCdCountryRefPageByRecord(CdCountryRef param) {return CdCountryRefDao.selectPageByRecord(param);};
	
	public CdDelivery selectCdDeliveryById(Integer id) {return CdDeliveryDao.selectCdDeliveryById(id);}
	public List<CdDelivery> selectCdDeliveryAll() {return CdDeliveryDao.selectAllCdDelivery();};
	public List<CdDelivery> selectCdDeliveryAllByRecord(CdDelivery param) {return CdDeliveryDao.selectAllByRecord(param);};
	public CdDelivery selectCdDeliveryOneByRecord(CdDelivery param) {return CdDeliveryDao.selectOneByRecord(param);};
	public PageInfo selectCdDeliveryPageByRecord(CdDelivery param) {return CdDeliveryDao.selectPageByRecord(param);};
	
	public CdDistrict selectCdDistrictById(Integer id) {return CdDistrictDao.selectCdDistrictById(id);}
	public List<CdDistrict> selectCdDistrictAll() {return CdDistrictDao.selectAllCdDistrict();};
	public List<CdDistrict> selectCdDistrictAllByRecord(CdDistrict param) {return CdDistrictDao.selectAllByRecord(param);};
	public CdDistrict selectCdDistrictOneByRecord(CdDistrict param) {return CdDistrictDao.selectOneByRecord(param);};
	public PageInfo selectCdDistrictPageByRecord(CdDistrict param) {return CdDistrictDao.selectPageByRecord(param);};
	
	public CdLogisticsVendor selectCdLogisticsVendorById(Integer id) {return CdLogisticsVendorDao.selectCdLogisticsVendorById(id);}
	public List<CdLogisticsVendor> selectCdLogisticsVendorAll() {return CdLogisticsVendorDao.selectAllCdLogisticsVendor();};
	public List<CdLogisticsVendor> selectCdLogisticsVendorAllByRecord(CdLogisticsVendor param) {return CdLogisticsVendorDao.selectAllByRecord(param);};
	public CdLogisticsVendor selectCdLogisticsVendorOneByRecord(CdLogisticsVendor param) {return CdLogisticsVendorDao.selectOneByRecord(param);};
	public PageInfo selectCdLogisticsVendorPageByRecord(CdLogisticsVendor param) {return CdLogisticsVendorDao.selectPageByRecord(param);};
	
	public CdPort selectCdPortById(Integer id) {return CdPortDao.selectCdPortById(id);}
	public List<CdPort> selectCdPortAll() {return CdPortDao.selectAllCdPort();};
	public List<CdPort> selectCdPortAllByRecord(CdPort param) {return CdPortDao.selectAllByRecord(param);};
	public CdPort selectCdPortOneByRecord(CdPort param) {return CdPortDao.selectOneByRecord(param);};
	public PageInfo selectCdPortPageByRecord(CdPort param) {return CdPortDao.selectPageByRecord(param);};
	
	public CdResRole selectCdResRoleById(Integer id) {return CdResRoleDao.selectCdResRoleById(id);}
	public List<CdResRole> selectCdResRoleAll() {return CdResRoleDao.selectAllCdResRole();};
	public List<CdResRole> selectCdResRoleAllByRecord(CdResRole param) {return CdResRoleDao.selectAllByRecord(param);};
	public CdResRole selectCdResRoleOneByRecord(CdResRole param) {return CdResRoleDao.selectOneByRecord(param);};
	public PageInfo selectCdResRolePageByRecord(CdResRole param) {return CdResRoleDao.selectPageByRecord(param);};
	
	public CdResource selectCdResourceById(Integer id) {return CdResourceDao.selectCdResourceById(id);}
	public List<CdResource> selectCdResourceAll() {return CdResourceDao.selectAllCdResource();};
	public List<CdResource> selectCdResourceAllByRecord(CdResource param) {return CdResourceDao.selectAllByRecord(param);};
	public CdResource selectCdResourceOneByRecord(CdResource param) {return CdResourceDao.selectOneByRecord(param);};
	public PageInfo selectCdResourcePageByRecord(CdResource param) {return CdResourceDao.selectPageByRecord(param);};
	
	public CdRole selectCdRoleById(Integer id) {return CdRoleDao.selectCdRoleById(id);}
	public List<CdRole> selectCdRoleAll() {return CdRoleDao.selectAllCdRole();};
	public List<CdRole> selectCdRoleAllByRecord(CdRole param) {return CdRoleDao.selectAllByRecord(param);};
	public CdRole selectCdRoleOneByRecord(CdRole param) {return CdRoleDao.selectOneByRecord(param);};
	public PageInfo selectCdRolePageByRecord(CdRole param) {return CdRoleDao.selectPageByRecord(param);};
	
	public CdSequence selectCdSequenceById(Integer id) {return CdSequenceDao.selectCdSequenceById(id);}
	public List<CdSequence> selectCdSequenceAll() {return CdSequenceDao.selectAllCdSequence();};
	public List<CdSequence> selectCdSequenceAllByRecord(CdSequence param) {return CdSequenceDao.selectAllByRecord(param);};
	public CdSequence selectCdSequenceOneByRecord(CdSequence param) {return CdSequenceDao.selectOneByRecord(param);};
	public PageInfo selectCdSequencePageByRecord(CdSequence param) {return CdSequenceDao.selectPageByRecord(param);};
	
	public CdServiceProduct selectCdServiceProductById(Integer id) {return CdServiceProductDao.selectCdServiceProductById(id);}
	public List<CdServiceProduct> selectCdServiceProductAll() {return CdServiceProductDao.selectAllCdServiceProduct();};
	public List<CdServiceProduct> selectCdServiceProductAllByRecord(CdServiceProduct param) {return CdServiceProductDao.selectAllByRecord(param);};
	public CdServiceProduct selectCdServiceProductOneByRecord(CdServiceProduct param) {return CdServiceProductDao.selectOneByRecord(param);};
	public PageInfo selectCdServiceProductPageByRecord(CdServiceProduct param) {return CdServiceProductDao.selectPageByRecord(param);};
	
	public CdState selectCdStateById(Integer id) {return CdStateDao.selectCdStateById(id);}
	public List<CdState> selectCdStateAll() {return CdStateDao.selectAllCdState();};
	public List<CdState> selectCdStateAllByRecord(CdState param) {return CdStateDao.selectAllByRecord(param);};
	public CdState selectCdStateOneByRecord(CdState param) {return CdStateDao.selectOneByRecord(param);};
	public PageInfo selectCdStatePageByRecord(CdState param) {return CdStateDao.selectPageByRecord(param);};
	
	public CdUser selectCdUserById(Integer id) {return CdUserDao.selectCdUserById(id);}
	public List<CdUser> selectCdUserAll() {return CdUserDao.selectAllCdUser();};
	public List<CdUser> selectCdUserAllByRecord(CdUser param) {return CdUserDao.selectAllByRecord(param);};
	public CdUser selectCdUserOneByRecord(CdUser param) {return CdUserDao.selectOneByRecord(param);};
	public PageInfo selectCdUserPageByRecord(CdUser param) {return CdUserDao.selectPageByRecord(param);};
	
	public CdUserPwd selectCdUserPwdById(Integer id) {return CdUserPwdDao.selectCdUserPwdById(id);}
	public List<CdUserPwd> selectCdUserPwdAll() {return CdUserPwdDao.selectAllCdUserPwd();};
	public List<CdUserPwd> selectCdUserPwdAllByRecord(CdUserPwd param) {return CdUserPwdDao.selectAllByRecord(param);};
	public CdUserPwd selectCdUserPwdOneByRecord(CdUserPwd param) {return CdUserPwdDao.selectOneByRecord(param);};
	public PageInfo selectCdUserPwdPageByRecord(CdUserPwd param) {return CdUserPwdDao.selectPageByRecord(param);};
	
	public CdUserRole selectCdUserRoleById(Integer id) {return CdUserRoleDao.selectCdUserRoleById(id);}
	public List<CdUserRole> selectCdUserRoleAll() {return CdUserRoleDao.selectAllCdUserRole();};
	public List<CdUserRole> selectCdUserRoleAllByRecord(CdUserRole param) {return CdUserRoleDao.selectAllByRecord(param);};
	public CdUserRole selectCdUserRoleOneByRecord(CdUserRole param) {return CdUserRoleDao.selectOneByRecord(param);};
	public PageInfo selectCdUserRolePageByRecord(CdUserRole param) {return CdUserRoleDao.selectPageByRecord(param);};
	
	public CdUserWarehouse selectCdUserWarehouseById(Integer id) {return CdUserWarehouseDao.selectCdUserWarehouseById(id);}
	public List<CdUserWarehouse> selectCdUserWarehouseAll() {return CdUserWarehouseDao.selectAllCdUserWarehouse();};
	public List<CdUserWarehouse> selectCdUserWarehouseAllByRecord(CdUserWarehouse param) {return CdUserWarehouseDao.selectAllByRecord(param);};
	public CdUserWarehouse selectCdUserWarehouseOneByRecord(CdUserWarehouse param) {return CdUserWarehouseDao.selectOneByRecord(param);};
	public PageInfo selectCdUserWarehousePageByRecord(CdUserWarehouse param) {return CdUserWarehouseDao.selectPageByRecord(param);};
	
	public CdWarehouse selectCdWarehouseById(Integer id) {return CdWarehouseDao.selectCdWarehouseById(id);}
	public List<CdWarehouse> selectCdWarehouseAll() {return CdWarehouseDao.selectAllCdWarehouse();};
	public List<CdWarehouse> selectCdWarehouseAllByRecord(CdWarehouse param) {return CdWarehouseDao.selectAllByRecord(param);};
	public CdWarehouse selectCdWarehouseOneByRecord(CdWarehouse param) {return CdWarehouseDao.selectOneByRecord(param);};
	public PageInfo selectCdWarehousePageByRecord(CdWarehouse param) {return CdWarehouseDao.selectPageByRecord(param);};
	
	public CrMember selectCrMemberById(Integer id) {return CrMemberDao.selectCrMemberById(id);}
	public List<CrMember> selectCrMemberAll() {return CrMemberDao.selectAllCrMember();};
	public List<CrMember> selectCrMemberAllByRecord(CrMember param) {return CrMemberDao.selectAllByRecord(param);};
	public CrMember selectCrMemberOneByRecord(CrMember param) {return CrMemberDao.selectOneByRecord(param);};
	public PageInfo selectCrMemberPageByRecord(CrMember param) {return CrMemberDao.selectPageByRecord(param);};
	
	public SysLog selectSysLogById(Integer id) {return SysLogDao.selectSysLogById(id);}
	public List<SysLog> selectSysLogAll() {return SysLogDao.selectAllSysLog();};
	public List<SysLog> selectSysLogAllByRecord(SysLog param) {return SysLogDao.selectAllByRecord(param);};
	public SysLog selectSysLogOneByRecord(SysLog param) {return SysLogDao.selectOneByRecord(param);};
	public PageInfo selectSysLogPageByRecord(SysLog param) {return SysLogDao.selectPageByRecord(param);};
	
	public TmPieces selectTmPiecesById(Integer id) {return TmPiecesDao.selectTmPiecesById(id);}
	public List<TmPieces> selectTmPiecesAll() {return TmPiecesDao.selectAllTmPieces();};
	public List<TmPieces> selectTmPiecesAllByRecord(TmPieces param) {return TmPiecesDao.selectAllByRecord(param);};
	public TmPieces selectTmPiecesOneByRecord(TmPieces param) {return TmPiecesDao.selectOneByRecord(param);};
	public PageInfo selectTmPiecesPageByRecord(TmPieces param) {return TmPiecesDao.selectPageByRecord(param);};
	
	public TmPiecesAction selectTmPiecesActionById(Integer id) {return TmPiecesActionDao.selectTmPiecesActionById(id);}
	public List<TmPiecesAction> selectTmPiecesActionAll() {return TmPiecesActionDao.selectAllTmPiecesAction();};
	public List<TmPiecesAction> selectTmPiecesActionAllByRecord(TmPiecesAction param) {return TmPiecesActionDao.selectAllByRecord(param);};
	public TmPiecesAction selectTmPiecesActionOneByRecord(TmPiecesAction param) {return TmPiecesActionDao.selectOneByRecord(param);};
	public PageInfo selectTmPiecesActionPageByRecord(TmPiecesAction param) {return TmPiecesActionDao.selectPageByRecord(param);};
	
	public TmPiecesCurrent selectTmPiecesCurrentById(Integer id) {return TmPiecesCurrentDao.selectTmPiecesCurrentById(id);}
	public List<TmPiecesCurrent> selectTmPiecesCurrentAll() {return TmPiecesCurrentDao.selectAllTmPiecesCurrent();};
	public List<TmPiecesCurrent> selectTmPiecesCurrentAllByRecord(TmPiecesCurrent param) {return TmPiecesCurrentDao.selectAllByRecord(param);};
	public TmPiecesCurrent selectTmPiecesCurrentOneByRecord(TmPiecesCurrent param) {return TmPiecesCurrentDao.selectOneByRecord(param);};
	public PageInfo selectTmPiecesCurrentPageByRecord(TmPiecesCurrent param) {return TmPiecesCurrentDao.selectPageByRecord(param);};
	
	public TmPiecesHistory selectTmPiecesHistoryById(Integer id) {return TmPiecesHistoryDao.selectTmPiecesHistoryById(id);}
	public List<TmPiecesHistory> selectTmPiecesHistoryAll() {return TmPiecesHistoryDao.selectAllTmPiecesHistory();};
	public List<TmPiecesHistory> selectTmPiecesHistoryAllByRecord(TmPiecesHistory param) {return TmPiecesHistoryDao.selectAllByRecord(param);};
	public TmPiecesHistory selectTmPiecesHistoryOneByRecord(TmPiecesHistory param) {return TmPiecesHistoryDao.selectOneByRecord(param);};
	public PageInfo selectTmPiecesHistoryPageByRecord(TmPiecesHistory param) {return TmPiecesHistoryDao.selectPageByRecord(param);};
	
	public TmPiecesRef selectTmPiecesRefById(Integer id) {return TmPiecesRefDao.selectTmPiecesRefById(id);}
	public List<TmPiecesRef> selectTmPiecesRefAll() {return TmPiecesRefDao.selectAllTmPiecesRef();};
	public List<TmPiecesRef> selectTmPiecesRefAllByRecord(TmPiecesRef param) {return TmPiecesRefDao.selectAllByRecord(param);};
	public TmPiecesRef selectTmPiecesRefOneByRecord(TmPiecesRef param) {return TmPiecesRefDao.selectOneByRecord(param);};
	public PageInfo selectTmPiecesRefPageByRecord(TmPiecesRef param) {return TmPiecesRefDao.selectPageByRecord(param);};
	
	public TmSector selectTmSectorById(Integer id) {return TmSectorDao.selectTmSectorById(id);}
	public List<TmSector> selectTmSectorAll() {return TmSectorDao.selectAllTmSector();};
	public List<TmSector> selectTmSectorAllByRecord(TmSector param) {return TmSectorDao.selectAllByRecord(param);};
	public TmSector selectTmSectorOneByRecord(TmSector param) {return TmSectorDao.selectOneByRecord(param);};
	public PageInfo selectTmSectorPageByRecord(TmSector param) {return TmSectorDao.selectPageByRecord(param);};
	
	public TmSectorAction selectTmSectorActionById(Integer id) {return TmSectorActionDao.selectTmSectorActionById(id);}
	public List<TmSectorAction> selectTmSectorActionAll() {return TmSectorActionDao.selectAllTmSectorAction();};
	public List<TmSectorAction> selectTmSectorActionAllByRecord(TmSectorAction param) {return TmSectorActionDao.selectAllByRecord(param);};
	public TmSectorAction selectTmSectorActionOneByRecord(TmSectorAction param) {return TmSectorActionDao.selectOneByRecord(param);};
	public PageInfo selectTmSectorActionPageByRecord(TmSectorAction param) {return TmSectorActionDao.selectPageByRecord(param);};
	
	public TmSectorCurrent selectTmSectorCurrentById(Integer id) {return TmSectorCurrentDao.selectTmSectorCurrentById(id);}
	public List<TmSectorCurrent> selectTmSectorCurrentAll() {return TmSectorCurrentDao.selectAllTmSectorCurrent();};
	public List<TmSectorCurrent> selectTmSectorCurrentAllByRecord(TmSectorCurrent param) {return TmSectorCurrentDao.selectAllByRecord(param);};
	public TmSectorCurrent selectTmSectorCurrentOneByRecord(TmSectorCurrent param) {return TmSectorCurrentDao.selectOneByRecord(param);};
	public PageInfo selectTmSectorCurrentPageByRecord(TmSectorCurrent param) {return TmSectorCurrentDao.selectPageByRecord(param);};
	
	public TmSectorHistory selectTmSectorHistoryById(Integer id) {return TmSectorHistoryDao.selectTmSectorHistoryById(id);}
	public List<TmSectorHistory> selectTmSectorHistoryAll() {return TmSectorHistoryDao.selectAllTmSectorHistory();};
	public List<TmSectorHistory> selectTmSectorHistoryAllByRecord(TmSectorHistory param) {return TmSectorHistoryDao.selectAllByRecord(param);};
	public TmSectorHistory selectTmSectorHistoryOneByRecord(TmSectorHistory param) {return TmSectorHistoryDao.selectOneByRecord(param);};
	public PageInfo selectTmSectorHistoryPageByRecord(TmSectorHistory param) {return TmSectorHistoryDao.selectPageByRecord(param);};
	
	public TmUnit selectTmUnitById(Integer id) {return TmUnitDao.selectTmUnitById(id);}
	public List<TmUnit> selectTmUnitAll() {return TmUnitDao.selectAllTmUnit();};
	public List<TmUnit> selectTmUnitAllByRecord(TmUnit param) {return TmUnitDao.selectAllByRecord(param);};
	public TmUnit selectTmUnitOneByRecord(TmUnit param) {return TmUnitDao.selectOneByRecord(param);};
	public PageInfo selectTmUnitPageByRecord(TmUnit param) {return TmUnitDao.selectPageByRecord(param);};
	
	public TrDataSyncBusi selectTrDataSyncBusiById(Integer id) {return TrDataSyncBusiDao.selectTrDataSyncBusiById(id);}
	public List<TrDataSyncBusi> selectTrDataSyncBusiAll() {return TrDataSyncBusiDao.selectAllTrDataSyncBusi();};
	public List<TrDataSyncBusi> selectTrDataSyncBusiAllByRecord(TrDataSyncBusi param) {return TrDataSyncBusiDao.selectAllByRecord(param);};
	public TrDataSyncBusi selectTrDataSyncBusiOneByRecord(TrDataSyncBusi param) {return TrDataSyncBusiDao.selectOneByRecord(param);};
	public PageInfo selectTrDataSyncBusiPageByRecord(TrDataSyncBusi param) {return TrDataSyncBusiDao.selectPageByRecord(param);};
	
	public TrDataSyncHist selectTrDataSyncHistById(Integer id) {return TrDataSyncHistDao.selectTrDataSyncHistById(id);}
	public List<TrDataSyncHist> selectTrDataSyncHistAll() {return TrDataSyncHistDao.selectAllTrDataSyncHist();};
	public List<TrDataSyncHist> selectTrDataSyncHistAllByRecord(TrDataSyncHist param) {return TrDataSyncHistDao.selectAllByRecord(param);};
	public TrDataSyncHist selectTrDataSyncHistOneByRecord(TrDataSyncHist param) {return TrDataSyncHistDao.selectOneByRecord(param);};
	public PageInfo selectTrDataSyncHistPageByRecord(TrDataSyncHist param) {return TrDataSyncHistDao.selectPageByRecord(param);};
	
	public WmCheckPickHistory selectWmCheckPickHistoryById(Integer id) {return WmCheckPickHistoryDao.selectWmCheckPickHistoryById(id);}
	public List<WmCheckPickHistory> selectWmCheckPickHistoryAll() {return WmCheckPickHistoryDao.selectAllWmCheckPickHistory();};
	public List<WmCheckPickHistory> selectWmCheckPickHistoryAllByRecord(WmCheckPickHistory param) {return WmCheckPickHistoryDao.selectAllByRecord(param);};
	public WmCheckPickHistory selectWmCheckPickHistoryOneByRecord(WmCheckPickHistory param) {return WmCheckPickHistoryDao.selectOneByRecord(param);};
	public PageInfo selectWmCheckPickHistoryPageByRecord(WmCheckPickHistory param) {return WmCheckPickHistoryDao.selectPageByRecord(param);};
	
	public WmDeliveryOrder selectWmDeliveryOrderById(Integer id) {return WmDeliveryOrderDao.selectWmDeliveryOrderById(id);}
	public List<WmDeliveryOrder> selectWmDeliveryOrderAll() {return WmDeliveryOrderDao.selectAllWmDeliveryOrder();};
	public List<WmDeliveryOrder> selectWmDeliveryOrderAllByRecord(WmDeliveryOrder param) {return WmDeliveryOrderDao.selectAllByRecord(param);};
	public WmDeliveryOrder selectWmDeliveryOrderOneByRecord(WmDeliveryOrder param) {return WmDeliveryOrderDao.selectOneByRecord(param);};
	public PageInfo selectWmDeliveryOrderPageByRecord(WmDeliveryOrder param) {return WmDeliveryOrderDao.selectPageByRecord(param);};
	
	public WmDeliveryOrderItem selectWmDeliveryOrderItemById(Integer id) {return WmDeliveryOrderItemDao.selectWmDeliveryOrderItemById(id);}
	public List<WmDeliveryOrderItem> selectWmDeliveryOrderItemAll() {return WmDeliveryOrderItemDao.selectAllWmDeliveryOrderItem();};
	public List<WmDeliveryOrderItem> selectWmDeliveryOrderItemAllByRecord(WmDeliveryOrderItem param) {return WmDeliveryOrderItemDao.selectAllByRecord(param);};
	public WmDeliveryOrderItem selectWmDeliveryOrderItemOneByRecord(WmDeliveryOrderItem param) {return WmDeliveryOrderItemDao.selectOneByRecord(param);};
	public PageInfo selectWmDeliveryOrderItemPageByRecord(WmDeliveryOrderItem param) {return WmDeliveryOrderItemDao.selectPageByRecord(param);};
	
	public WmDeliveryOrderRef selectWmDeliveryOrderRefById(Integer id) {return WmDeliveryOrderRefDao.selectWmDeliveryOrderRefById(id);}
	public List<WmDeliveryOrderRef> selectWmDeliveryOrderRefAll() {return WmDeliveryOrderRefDao.selectAllWmDeliveryOrderRef();};
	public List<WmDeliveryOrderRef> selectWmDeliveryOrderRefAllByRecord(WmDeliveryOrderRef param) {return WmDeliveryOrderRefDao.selectAllByRecord(param);};
	public WmDeliveryOrderRef selectWmDeliveryOrderRefOneByRecord(WmDeliveryOrderRef param) {return WmDeliveryOrderRefDao.selectOneByRecord(param);};
	public PageInfo selectWmDeliveryOrderRefPageByRecord(WmDeliveryOrderRef param) {return WmDeliveryOrderRefDao.selectPageByRecord(param);};
	
	public WmLocation selectWmLocationById(Integer id) {return WmLocationDao.selectWmLocationById(id);}
	public List<WmLocation> selectWmLocationAll() {return WmLocationDao.selectAllWmLocation();};
	public List<WmLocation> selectWmLocationAllByRecord(WmLocation param) {return WmLocationDao.selectAllByRecord(param);};
	public WmLocation selectWmLocationOneByRecord(WmLocation param) {return WmLocationDao.selectOneByRecord(param);};
	public PageInfo selectWmLocationPageByRecord(WmLocation param) {return WmLocationDao.selectPageByRecord(param);};
	
	public WmLocationCurrent selectWmLocationCurrentById(Integer id) {return WmLocationCurrentDao.selectWmLocationCurrentById(id);}
	public List<WmLocationCurrent> selectWmLocationCurrentAll() {return WmLocationCurrentDao.selectAllWmLocationCurrent();};
	public List<WmLocationCurrent> selectWmLocationCurrentAllByRecord(WmLocationCurrent param) {return WmLocationCurrentDao.selectAllByRecord(param);};
	public WmLocationCurrent selectWmLocationCurrentOneByRecord(WmLocationCurrent param) {return WmLocationCurrentDao.selectOneByRecord(param);};
	public PageInfo selectWmLocationCurrentPageByRecord(WmLocationCurrent param) {return WmLocationCurrentDao.selectPageByRecord(param);};
	
	public WmLocationHistory selectWmLocationHistoryById(Integer id) {return WmLocationHistoryDao.selectWmLocationHistoryById(id);}
	public List<WmLocationHistory> selectWmLocationHistoryAll() {return WmLocationHistoryDao.selectAllWmLocationHistory();};
	public List<WmLocationHistory> selectWmLocationHistoryAllByRecord(WmLocationHistory param) {return WmLocationHistoryDao.selectAllByRecord(param);};
	public WmLocationHistory selectWmLocationHistoryOneByRecord(WmLocationHistory param) {return WmLocationHistoryDao.selectOneByRecord(param);};
	public PageInfo selectWmLocationHistoryPageByRecord(WmLocationHistory param) {return WmLocationHistoryDao.selectPageByRecord(param);};
	
	public WmTransitPiecesRecord selectWmTransitPiecesRecordById(Integer id) {return WmTransitPiecesRecordDao.selectWmTransitPiecesRecordById(id);}
	public List<WmTransitPiecesRecord> selectWmTransitPiecesRecordAll() {return WmTransitPiecesRecordDao.selectAllWmTransitPiecesRecord();};
	public List<WmTransitPiecesRecord> selectWmTransitPiecesRecordAllByRecord(WmTransitPiecesRecord param) {return WmTransitPiecesRecordDao.selectAllByRecord(param);};
	public WmTransitPiecesRecord selectWmTransitPiecesRecordOneByRecord(WmTransitPiecesRecord param) {return WmTransitPiecesRecordDao.selectOneByRecord(param);};
	public PageInfo selectWmTransitPiecesRecordPageByRecord(WmTransitPiecesRecord param) {return WmTransitPiecesRecordDao.selectPageByRecord(param);};
	
	
}
