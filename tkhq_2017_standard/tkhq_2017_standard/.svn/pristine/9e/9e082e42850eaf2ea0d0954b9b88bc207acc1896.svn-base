package com.tkhq.cmc.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

public class ObjectMapper {
	
	public static <T> T mapToEntity(Object source, Class<T> destinationType){
		ModelMapper mapper = new ModelMapper();
		return mapper.map(source, destinationType);
	}
	
	public static <T1,T2> List<T1> mapToListEntity(List<T2> source,Class<T1> destinationType){ 
		ModelMapper mapper = new ModelMapper();
		List<T1> result = new ArrayList<T1>();
		for (Object object : source) {
			result.add(mapper.map(object, destinationType));
		}
		return result;
	}
}
