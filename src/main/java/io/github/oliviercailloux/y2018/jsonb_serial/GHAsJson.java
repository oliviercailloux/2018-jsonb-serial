package io.github.oliviercailloux.y2018.jsonb_serial;

import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GHAsJson implements JsonbAdapter<StudentOnGitHub, JsonObject> {

	@Override
	public JsonObject adaptToJson(StudentOnGitHub student) {
		return new KnownAsJson().adaptToJson(new AsKnown().adaptToJson(student));
	}

	@Override
	public StudentOnGitHub adaptFromJson(JsonObject studentKnown) {
		return new AsKnown().adaptFromJson(new KnownAsJson().adaptFromJson(studentKnown));
	}

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(GHAsJson.class);

}
