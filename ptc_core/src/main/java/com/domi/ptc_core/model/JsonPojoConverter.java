package com.domi.ptc_core.model;

import com.domi.ptc_core.infra.exceptions.BzkRuntimeException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.AttributeConverter;

public abstract class JsonPojoConverter<T> implements AttributeConverter<T, String> {

	private static final ObjectMapper mapper = new ObjectMapper()
			.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS).setDateFormat(new StdDateFormat());

	protected ObjectMapper mapper() {
		return mapper;
	}
	
	@Override
	public String convertToDatabaseColumn(T attribute) {
		try {
			return mapper().writeValueAsString(attribute);
		} catch (JsonProcessingException e) {
			throw new BzkRuntimeException(e);
		}
	}

	@Override
	public T convertToEntityAttribute(String dbData) {
		try {
			if (StringUtils.isBlank(dbData))
				return null;
			return mapper().readValue(dbData, getTClass());
		} catch (Exception e) {
			throw new BzkRuntimeException(e);
		}
	}

	public abstract Class<T> getTClass();

}