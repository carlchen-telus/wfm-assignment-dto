package com.telus.workforcemgmt.dto;

import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ZonedDateTimeGsonSerializer implements JsonDeserializer<ZonedDateTime>, JsonSerializer<ZonedDateTime>{

	private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
	
	@Override
	public JsonElement serialize(ZonedDateTime src, Type typeOfSrc, JsonSerializationContext context) {
		return new JsonPrimitive(formatter.format(src));
	}

	@Override
	public ZonedDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		 return ZonedDateTime.parse(json.getAsString(), formatter);
	}


}
