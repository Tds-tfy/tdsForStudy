package com.cosyit.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosyit.service.ModelService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		ModelService service=(ModelService) applicationContext.getBean("modelService");
/*		List<TeaCommodityInfo> al=service.getInfoByProperties(ModelService.COMMODITY, 1, 3) ;
		for (TeaCommodityInfo commodityInfo : al) {
			System.out.println(commodityInfo.getCommodityName());
		}
		*/
		DataSource datasource=(DataSource) applicationContext.getBean("dataSource");
		System.out.println(datasource);
		Connection con;
		try {
			con = datasource.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		/*	
		  	Dao<CommodityInfo>	dao=(Dao<CommodityInfo>) applicationContext.getBean("commodityInfoDao");
			List<CommodityInfo>	al=dao.getAll();
		
		for(CommodityInfo commodityInfo:al){
			System.out.println(commodityInfo.getCommodityName()+","+commodityInfo.getCommodityTypeId()+",图片："+commodityInfo.getCommodityImageId());
		}
		
		List<CommodityInfo> al=dao.getInfoesByProperties(3, 7);
		
		for (CommodityInfo commodityInfo : al) {
			System.out.println(commodityInfo.getCommodityBirthSeason());
		}
		 */
	}

}
