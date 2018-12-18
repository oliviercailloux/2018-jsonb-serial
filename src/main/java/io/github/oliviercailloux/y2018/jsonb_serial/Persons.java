package io.github.oliviercailloux.y2018.jsonb_serial;

import java.util.Set;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Persons {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(Persons.class);

	@JsonbCreator
	public static Persons wrap(@JsonbProperty("persons") Set<Person> persons) {
		final Set<?> persons2 = persons;
		final Class<?> class1 = persons2.iterator().next().getClass();
		LOGGER.info("Received inner type: {}.", class1);
		final Class<?> classCrashes = persons.iterator().next().getClass();
		return null;
	}

	public Set<Person> getPersons() {
		return null;
	}
}
