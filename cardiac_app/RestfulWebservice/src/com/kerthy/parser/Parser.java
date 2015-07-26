package com.kerthy.parser;

import com.google.gson.Gson;

public class Parser {
	public static Patient parse(String json)
	{
		Gson gson = new Gson();
		Patient pt = gson.fromJson(json, Patient.class);
		System.out.println(pt.getName());
		
		return pt;
	}
	
	public static Patient_2 parseInput(String json)
	{
		Gson gson = new Gson();
		Patient_2 pt = gson.fromJson(json, Patient_2.class);
		
		System.out.println(pt.toString());
		
		return pt;
	}
	
	public static CardiacData[] parseData(String json){
		Gson gson = new Gson();
		CardiacData[] pt = gson.fromJson(json, CardiacData[].class);
		//System.out.println(pt.getTime());
		
		return pt;
	}
	
	public static String toJSONString(Patient pt)
	{
		Gson gson = new Gson();
		String jsonRepresentation = gson.toJson(pt);
		return jsonRepresentation;
	}
}
