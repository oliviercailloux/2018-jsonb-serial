package io.github.oliviercailloux.y2018.jsonb_serial;

import javax.json.bind.adapter.JsonbAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsKnown implements JsonbAdapter<StudentOnGitHub, StudentOnGitHubKnown> {

	@Override
	public StudentOnGitHubKnown adaptToJson(StudentOnGitHub student) {
		LOGGER.info("Converting {}.", student);
		return student.asStudentOnGitHubKnown();
	}

	@Override
	public StudentOnGitHub adaptFromJson(StudentOnGitHubKnown studentKnown) {
		return studentKnown.asStudentOnGitHub();
	}

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(AsKnown.class);
}
