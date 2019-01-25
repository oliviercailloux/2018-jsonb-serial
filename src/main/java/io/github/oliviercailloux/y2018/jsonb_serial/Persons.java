package io.github.oliviercailloux.y2018.jsonb_serial;

import java.util.Set;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Persons {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(Persons.class);

	@SuppressWarnings("unused")
	@JsonbCreator
	public static Persons wrap(@JsonbProperty("persons") Set<Person> persons) {
		final Object person = persons.iterator().next();
		LOGGER.info("Received type {}, content {}.", person.getClass(), person);
		final Person crashingPerson = persons.iterator().next();
		return null;
	}

	public Set<Person> getPersons() {
		return null;
	}
}
