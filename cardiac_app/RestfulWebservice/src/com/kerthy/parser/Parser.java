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
	
	public static String toJSONString(Patient pt)
	{
		Gson gson = new Gson();
		String jsonRepresentation = gson.toJson(pt);
		return jsonRepresentation;
	}
}
