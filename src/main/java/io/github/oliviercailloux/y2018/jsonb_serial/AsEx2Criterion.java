package io.github.oliviercailloux.y2018.jsonb_serial;

import javax.json.bind.adapter.JsonbAdapter;

public class AsEx2Criterion implements JsonbAdapter<GradeCriterion, String> {

	@Override
	public String adaptToJson(GradeCriterion criterion) {
		return criterion.toString();
	}

	@Override
	public GradeCriterion adaptFromJson(String stringRepr) {
		return Ex2Criterion.valueOf(stringRepr);
	}

}