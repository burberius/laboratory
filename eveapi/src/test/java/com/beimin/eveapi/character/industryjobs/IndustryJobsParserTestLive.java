package com.beimin.eveapi.character.industryjobs;

import org.junit.Before;
import org.junit.Test;

import com.beimin.eveapi.exception.ApiException;
import com.beimin.eveapi.parser.ApiAuthorization;
import com.beimin.eveapi.parser.corporation.IndustryJobsParser;

public class IndustryJobsParserTestLive {
    private final static Integer ID = 1394994;
    private final static String VERIFICATION_CODE = "DaUltimateLOBACHAPI";

    private ApiAuthorization auth;

    @Before
    public void init() {
	auth = new ApiAuthorization(ID, VERIFICATION_CODE);
    }

    @Test
    public void testCurrentState() {
	final IndustryJobsParser jobsParser = new IndustryJobsParser();
	try {
	    jobsParser.getResponse(auth);
	} catch (final ApiException e) {
	    e.printStackTrace();
	}
    }
}
