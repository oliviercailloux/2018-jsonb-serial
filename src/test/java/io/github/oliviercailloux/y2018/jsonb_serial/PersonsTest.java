package io.github.oliviercailloux.y2018.jsonb_serial;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class PersonsTest {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonsTest.class);

	@Test
	public void shouldDeserializePersons() throws Exception {
		final Method method = Persons.class.getMethod("wrap", Set.class);
		final Type[] params = method.getGenericParameterTypes();
		LOGGER.info("Param: {}.", params[0]);
		final String json = "{\"persons\": [{\"name\": \"name1\"}]}";
		LOGGER.info("Deserializing {} as Persons.", json);
		@SuppressWarnings("resource")
		Jsonb jsonb = JsonbBuilder.create();
		jsonb.fromJson(json, Persons.class);
	}

	@Test
	public void shouldDeserializePerson() throws Exception {
		final String json = "{\"name\": \"name1\"}";
		LOGGER.info("Deserializing {} as Person.", json);
		@SuppressWarnings("resource")
		Jsonb jsonb = JsonbBuilder.create();
		jsonb.fromJson(json, Person.class);
	}

}
