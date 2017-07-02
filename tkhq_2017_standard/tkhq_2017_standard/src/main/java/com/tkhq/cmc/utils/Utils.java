package com.tkhq.cmc.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.security.core.context.SecurityContextHolder;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.tkhq.cmc.dto.ThayDoiDoNVHQTongThe;
import com.tkhq.cmc.security.CustomUserDetails;

public class Utils {
	public static final String convertDatetoString(Date _date, String format) {
		if (_date == null)
			return "";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(_date);
	}

	public static final Date convertStringtoDate(String str, String format) throws ParseException {
		if (format == null) {
			format = "dd/MM/yyyy";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(str);
	}

	/**
	 * Chuyen doi Date tu java.util.Date sang java.sql.Date
	 **/

	public static final java.sql.Date getSqlDate(java.util.Date date) {
		try {
			return new java.sql.Date(date.getTime());
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * Chuyen doi Date tu java.sql.Date java.util.Date
	 **/
	public static final java.util.Date getUtilDate(Timestamp date) {
		try {
			return new java.util.Date(date.getTime());
		} catch (Exception ex) {
			return null;
		}
	}

	public static String readProperties(String store) {
		Properties prop = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		try {

			InputStream input = loader.getResourceAsStream("store.properties");
			prop.load(input);
			prop.getProperty(store);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return prop.getProperty(store);
	}
	
	/**
	 * Get current Date
	 **/
	public static final String getCurrentDate() {
		Date date = new Date();
		return String.valueOf(date.getTime());
	}
	
	/**
	 * return true if String is null or empty, otherwise return false
	 **/
	public static final boolean isEmpty(String str) {
		if (str == null)
			return true;
		else if (str.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * Escape if Object is null
	 **/
	public static final String escapeNull(Object obj) {
		if (obj == null)
			return StringUtils.EMPTY;

		return obj.toString();
	}

	/**
	 * Copy property from obj2 to obj1
	 **/
	public static final boolean copyProperties(Object _obj1, Object _obj2, boolean _ignoreCase) {
		try {
			List<Field> fields1 = Utils.getAllFields(_obj1.getClass());
			List<Field> fields2 = Utils.getAllFields(_obj2.getClass());

			for (Field field1 : fields1) {
				for (Field field2 : fields2) {
					field1.setAccessible(true);
					field2.setAccessible(true);
					if ((field1.getName() == field2.getName() && !_ignoreCase)
							|| (_ignoreCase && field1.getName().equalsIgnoreCase(field2.getName()))) {
						field1.set(_obj1, field2.get(_obj2));
						break;
					}
				}
			}
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static final List<Field> getAllFields(Class _class) {
		Field[] fields_child = _class.getDeclaredFields();
		List<Field> fields = new ArrayList();
		Class _supperClass = _class.getSuperclass();
		fields.addAll(Arrays.asList(fields_child));

		while (_supperClass != null) {
			Field[] superFields = _supperClass.getDeclaredFields();
			fields.addAll(Arrays.asList(superFields));
			_supperClass = _supperClass.getSuperclass();
		}
		return fields;
	}
	
	public static final <T> List<T> getDataStringFromStringReturnList(String jsonstr, Class<T> valueType)
			throws IOException {
		

		ObjectMapper mapper = new ObjectMapper();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		mapper.setDateFormat(dateFormat);
		List<T> listdata = mapper.readValue(jsonstr,
				TypeFactory.defaultInstance().constructCollectionType(List.class, valueType));
		return listdata;
	}

	public static final <T> List<T> getDataStringFromApiReturnList(String urlstr, Class<T> valueType)
			throws IOException {
		String responeJson;
		BufferedReader reader = null;
		try {
			URL url = new URL(urlstr);
			reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			responeJson = buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}

		ObjectMapper mapper = new ObjectMapper();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		mapper.setDateFormat(dateFormat);
		List<T> listdata = mapper.readValue(responeJson,
				TypeFactory.defaultInstance().constructCollectionType(List.class, valueType));
		return listdata;
	}
	
	public static final <T> List<List<T>> getDataStringFromApiReturnListOfList(String urlstr, Class<T> valueType)
			throws IOException {
		String responeJson;
		BufferedReader reader = null;
		try {
			URL url = new URL(urlstr);
			reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			responeJson = buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
		ObjectMapper mapper = new ObjectMapper();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		mapper.setDateFormat(dateFormat);
		List<List<T>> listdata = mapper.readValue(responeJson,
				TypeFactory.defaultInstance().constructCollectionType(List.class, TypeFactory.defaultInstance().constructCollectionType(List.class, valueType)));
		return listdata;
	}

	public static final <T> T getDataStringFromApi(String urlstr, Class<T> valueType) throws IOException {
		String responeJson;
		BufferedReader reader = null;
		try {
			URL url = new URL(urlstr);
			reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			responeJson = buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}

		ObjectMapper mapper = new ObjectMapper();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		mapper.setDateFormat(dateFormat);
		T listdata = mapper.readValue(responeJson, valueType);
		return listdata;
	}

	/**
	 * Convert json to collection map
	 **/
	public static List<Map<String, Object>> jsonToListMap(JSONArray jsonArray) throws JSONException {
		List<Map<String, Object>> retLstMap = new ArrayList<Map<String, Object>>();
		Map<String, Object> mapData = new HashMap<String, Object>();

		for (int i = 0; i < jsonArray.length(); i++) {
			mapData = jsonToMap(jsonArray.getJSONObject(i));
			retLstMap.add(mapData);
		}

		return retLstMap;
	}

	public static Map<String, Object> jsonToMap(JSONObject json) throws JSONException {
		Map<String, Object> retMap = new HashMap<String, Object>();

		if (json != JSONObject.NULL) {
			retMap = toMap(json);
		}
		return retMap;
	}

	public static Map<String, Object> toMap(JSONObject object) throws JSONException {
		Map<String, Object> map = new HashMap<String, Object>();

		Iterator<String> keysItr = object.keys();
		while (keysItr.hasNext()) {
			String key = keysItr.next();
			Object value = object.get(key);

			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			}

			else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			map.put(key, value);
		}
		return map;
	}

	public static List<Object> toList(JSONArray array) throws JSONException {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < array.length(); i++) {
			Object value = array.get(i);
			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			}

			else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			list.add(value);
		}
		return list;
	}

	public static final String getDataToStringFromApi(String strUrl) throws IOException {
		String responeJson;
		BufferedReader reader = null;
		try {
			URL url = new URL(strUrl);
			reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			responeJson = buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}

		return responeJson;
	}

	public static final <T> T convertStringToClass(String data, Class<T> objectClass) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		T object = mapper.readValue(data, objectClass);
		
		return object;
	}
	
	public static final String escapeNullString(Object obj){
    	if(obj == null || "null".equals(obj.toString()))
    		return StringUtils.EMPTY;
    	
    	return obj.toString();
    }
	
	public static final String getMessageProperties(String keyInput){
		String textOutPut;		
		Properties prop = new Properties();
		InputStream input = null;
		String filename = "Message.properties";
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		input = loader.getResourceAsStream(filename);
		if (input == null) {
			System.out.println("khong tim thay File:" + filename);
			return "";
		}
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		textOutPut = prop.getProperty(keyInput);
		if (textOutPut == null) {
			System.out.println("khong tim thay keyInput:" + keyInput);
			return "";
		}		
		return textOutPut;
	}
	
	public static final boolean equals(String str1, String str2){
		if (str1 == null){
			return false;
		}
		if (str2 == null){
			return false;
		}
		return str1.equals(str2);
	}
	
	public static final String getRequestingUsername(){
		
		return SecurityContextHolder.getContext().getAuthentication().getName();
		//return "usercuc1";
		//return "usertc1";
		//return "usercc1";
	}
	
	public static CustomUserDetails getPrincipalLogin() {
		return (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	public static String getBaseUrl(HttpServletRequest request) {
	    String scheme = request.getScheme() + "://";
	    String serverName = request.getServerName();
	    String serverPort = (request.getServerPort() == 80) ? "" : ":" + request.getServerPort();
	    String contextPath = request.getContextPath();
	    return scheme + serverName + serverPort + contextPath;
	  }
	
}
