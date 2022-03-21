/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.model.CheckSentenceRequest;
import com.cloudmersive.client.model.CheckSentenceResponse;
import com.cloudmersive.client.model.CheckWordRequest;
import com.cloudmersive.client.model.CheckWordResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpellcheckApi
 */
@Ignore
public class SpellcheckApiTest {

    private final SpellcheckApi api = new SpellcheckApi();

    
    /**
     * Check if sentence is spelled correctly
     *
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void spellcheckCheckSentenceTest() throws Exception {
        CheckSentenceRequest value = null;
        CheckSentenceResponse response = api.spellcheckCheckSentence(value);

        // TODO: test validations
    }
    
    /**
     * Find spelling corrections
     *
     * Find spelling correction suggestions and return result as JSON
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void spellcheckCorrectJsonTest() throws Exception {
        CheckWordRequest value = null;
        CheckWordResponse response = api.spellcheckCorrectJson(value);

        // TODO: test validations
    }
    
}
