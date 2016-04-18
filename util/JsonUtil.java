package com.mybatis.util;

import java.util.Date;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

public class JsonUtil {
	
	private JsonUtil(){}
	
	/**
	 * 将带有时间格式的对象转化成json字符串
	 * @param propertyType
	 * @param obj
	 * @return
	 */
	public static String objectToJson(Class propertyType, Object obj){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonValueProcessorImpl());
		JSONArray jsonArray = JSONArray.fromObject(obj, jsonConfig);
		return jsonArray.toString();
		
	}
}
