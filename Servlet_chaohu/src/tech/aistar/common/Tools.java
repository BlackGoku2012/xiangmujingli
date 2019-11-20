package tech.aistar.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {

	   /**
	    * 
	    * @param sqlDate  ����java.sql.date
	    * @return  ��yyyy-MM-dd��ʽ��� ���ַ���
	    */
	  public static String  fmtDateToString(java.sql.Date sqlDate)
	  {
		 Date uDate= fmtDateToUtilDate(sqlDate);
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(uDate)   ;
	  }
	  /**
	   * ��ɽ�sql.Dateתjava.util.Date
	   * @param sqlDate
	   * @return
	   */
//	  sql的日期对象转成util的日期
	  public static Date  fmtDateToUtilDate(java.sql.Date sqlDate)
	  {
		   return new Date(sqlDate.getTime());
	  }
//	util的日期对象转成sql的日期
	  public static java.sql.Date  fmtDateTosqlDate(Date lDate)
	  {
		   return new java.sql.Date(lDate.getTime());
	  }


//	  自渡船的日期格式化成date的日期对象
	  public static Date  fmtDateTojavaUtilDate(String date)
	  {
		  Date d=null;
		  try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                 d=sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return d;
	  }
}
