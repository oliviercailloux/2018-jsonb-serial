package io.github.oliviercailloux.y2018.jsonb_serial;

import java.nio.charset.StandardCharsets;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.io.Resources;

class GradeJsonTest {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(GradeJsonTest.class);

	@Test
	public void gradeReadJson() throws Exception {
		final String json = Resources.toString(this.getClass().getResource("Grade.json"), StandardCharsets.UTF_8);
		final Grade read;
		try (Jsonb jsonb = JsonbBuilder
				.create(new JsonbConfig().withAdapters(new AsEx2Criterion(), new GHAsJson()).withFormatting(true))) {
			read = jsonb.fromJson(json, Grade.class);
			LOGGER.info("Deserialized: {}.", read);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

}
