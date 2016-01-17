package com.palette.busi.project.tms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.ResultType;

import com.palette.busi.project.tms.core.entity.CdServiceProduct;
import com.palette.busi.project.tms.core.dao.CdServiceProductSqlProvider;
import com.palette.busi.project.tms.core.base.BaseMybatisMapper;

public interface CdServiceProductIntf extends BaseMybatisMapper {


	@Select("SELECT  CD_SERVICE_PRODUCT_ID  AS cdServiceProductId, SERVICE_PRODUCT_CODE  AS serviceProductCode, SERVICE_PRODUCT_NAME  AS serviceProductName, SERVICE_PRODUCT_DESC  AS serviceProductDesc, SERVICE_PRODUCT_COUNTRY_CODE  AS serviceProductCountryCode, SERVICE_PRODUCT_WAREHOUSE_CODE  AS serviceProductWarehouseCode, SERVICE_TYPE  AS serviceType, IS_ACTIVE  AS isActive, IS_DEFAULT  AS isDefault, IS_NEED_IDCONTENT  AS isNeedIdcontent, IS_FREE_TAX  AS isFreeTax, IS_USE_COUPON  AS isUseCoupon, FEE_WEIGHT  AS feeWeight, IS_AUTO_DISASSEMBLE  AS isAutoDisassemble, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_service_product WHERE cd_service_product_id=#{cdServiceProductId}")
	public CdServiceProduct selectCdServiceProductById(@Param("cdServiceProductId") int cdServiceProductId);
	
	@Select("SELECT  CD_SERVICE_PRODUCT_ID  AS cdServiceProductId, SERVICE_PRODUCT_CODE  AS serviceProductCode, SERVICE_PRODUCT_NAME  AS serviceProductName, SERVICE_PRODUCT_DESC  AS serviceProductDesc, SERVICE_PRODUCT_COUNTRY_CODE  AS serviceProductCountryCode, SERVICE_PRODUCT_WAREHOUSE_CODE  AS serviceProductWarehouseCode, SERVICE_TYPE  AS serviceType, IS_ACTIVE  AS isActive, IS_DEFAULT  AS isDefault, IS_NEED_IDCONTENT  AS isNeedIdcontent, IS_FREE_TAX  AS isFreeTax, IS_USE_COUPON  AS isUseCoupon, FEE_WEIGHT  AS feeWeight, IS_AUTO_DISASSEMBLE  AS isAutoDisassemble, RECORD_VERSION  AS recordVersion, CREATE_USER_CODE  AS createUserCode, CREATE_DATE_TIME  AS createDateTime, CREATE_TIME_ZONE  AS createTimeZone, UPDATE_USER_CODE  AS updateUserCode, UPDATE_DATE_TIME  AS updateDateTime, UPDATE_TIME_ZONE  AS updateTimeZone FROM cd_service_product")
	public List<CdServiceProduct> selectAllCdServiceProduct();
	
	@Insert("insert into cd_service_product ( CD_SERVICE_PRODUCT_ID, SERVICE_PRODUCT_CODE, SERVICE_PRODUCT_NAME, SERVICE_PRODUCT_DESC, SERVICE_PRODUCT_COUNTRY_CODE, SERVICE_PRODUCT_WAREHOUSE_CODE, SERVICE_TYPE, IS_ACTIVE, IS_DEFAULT, IS_NEED_IDCONTENT, IS_FREE_TAX, IS_USE_COUPON, FEE_WEIGHT, IS_AUTO_DISASSEMBLE, RECORD_VERSION, CREATE_USER_CODE, CREATE_DATE_TIME, CREATE_TIME_ZONE, UPDATE_USER_CODE, UPDATE_DATE_TIME, UPDATE_TIME_ZONE ) values (#{cdServiceProductId},#{serviceProductCode},#{serviceProductName},#{serviceProductDesc},#{serviceProductCountryCode},#{serviceProductWarehouseCode},#{serviceType},#{isActive},#{isDefault},#{isNeedIdcontent},#{isFreeTax},#{isUseCoupon},#{feeWeight},#{isAutoDisassemble},#{recordVersion},#{createUserCode},#{createDateTime},#{createTimeZone},#{updateUserCode},#{updateDateTime},#{updateTimeZone})")
	public int insertCdServiceProduct(CdServiceProduct cdServiceProduct);

	@UpdateProvider(type=CdServiceProductSqlProvider.class, method="update")
	public int updateCdServiceProduct(CdServiceProduct cdServiceProduct);
	
	@Delete("delete from cd_service_product where cd_service_product_id = #{cdServiceProductId}")
	public int deleteCdServiceProduct(@Param("cdServiceProductId") int cdServiceProductId);

    @SelectProvider(type=CdServiceProductSqlProvider.class, method="selectAllByRecord")
    @ResultType(CdServiceProduct.class)
    public List<CdServiceProduct> selectAllByRecord(CdServiceProduct record);
    
}