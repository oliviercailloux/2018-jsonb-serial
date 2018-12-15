package io.github.oliviercailloux.y2018.jsonb_serial;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class WrapperTest {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(WrapperTest.class);

	@Test
	public void shouldDeserialize() throws Exception {
		final String json = "{\"data\": [\"hah\",\"huh\"]}";
		@SuppressWarnings("resource")
		Jsonb jsonb = JsonbBuilder.create();
		jsonb.fromJson(json, Wrapper.class);
	}

}
