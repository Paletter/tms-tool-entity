package com.palette.busi.project.tms.tool.entity.util;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	
	public static String getJavaTypeByDbType(String dbType){
		if(dbType.startsWith("char")) return "String";
		if(dbType.startsWith("varchar")) return "String";
		if(dbType.startsWith("text")) return "String";
		if(dbType.startsWith("int")) return "Integer";
		if(dbType.startsWith("tinyint")) return "Integer";
		if(dbType.startsWith("bigint")) return "Integer";
		if(dbType.startsWith("smallint")) return "Integer";
		if(dbType.startsWith("decimal")) return "BigDecimal";
		if(dbType.startsWith("double")) return "BigDecimal";
		if(dbType.startsWith("date")) return "Date";
		return dbType;
	}
	
	public static String upcaseFirstLetter(String str){
		return str.substring(0,1).toUpperCase() + str.substring(1);
	}
	
	public static String arrayToString(String[] str){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length; i++){
		 sb. append(str[i]);
		}
		return sb.toString();
	}
	
	public static String underScore2CamelCase(String strs) {  
	    String[] elems = strs.split("_");  
	    for ( int i = 0 ; i < elems.length ; i++ ) {  
	        elems[i] = elems[i].toLowerCase();  
	        if (i != 0) {  
	            String elem = elems[i];  
	            char first = elem.toCharArray()[0];  
	            elems[i] = "" + (char) (first - 32) + elem.substring(1);  
	        }  
	    }  
	    return arrayToString(elems);  
	}  
	  
	public static String camelCase2Underscore(String param) {  
	    Pattern p = Pattern.compile("[A-Z]");  
	    if (param == null || param.equals("")) {  
	        return "";  
	    }  
	    StringBuilder builder = new StringBuilder(param);  
	    Matcher mc = p.matcher(param);  
	    int i = 0;  
	    while (mc.find()) {  
	        builder.replace(mc.start() + i,mc.end() + i,"_" + mc.group().toLowerCase());  
	        i++;  
	    }  
	    if ('_' == builder.charAt(0)) {  
	        builder.deleteCharAt(0);  
	    }  
	    return builder.toString();  
	}  
	
	public static String getUrlParamValueByKey(String urlparam,String key){
		String arr[]=urlparam.split("&");
		String kv[];
		HashMap<String , String> map = new HashMap<String , String>();   
		for (String x : arr) {
			kv=x.split("=");
			map.put(kv[0], kv[1]);
		}
		return map.get(key);
	}
	
}
