/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import java.io.File;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompareDocumentApi
 */
@Ignore
public class CompareDocumentApiTest {

    private final CompareDocumentApi api = new CompareDocumentApi();

    
    /**
     * Compare Two Word DOC (Legacy 97-2003 Format)
     *
     * Compare two Office Word Documents (doc) legacy 97-2003 format files and highlight the differences
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void compareDocumentDocTest() throws Exception {
        File inputFile1 = null;
        File inputFile2 = null;
        String comparisonMode = null;
        Boolean autorepair = null;
        Boolean changeOutlines = null;
        Boolean headersAndFooters = null;
        byte[] response = api.compareDocumentDoc(inputFile1, inputFile2, comparisonMode, autorepair, changeOutlines, headersAndFooters);

        // TODO: test validations
    }
    
    /**
     * Compare Two Word DOCX
     *
     * Compare two Office Word Documents (docx) files and highlight the differences
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void compareDocumentDocxTest() throws Exception {
        File inputFile1 = null;
        File inputFile2 = null;
        String comparisonMode = null;
        Boolean autorepair = null;
        Boolean changeOutlines = null;
        Boolean headersAndFooters = null;
        byte[] response = api.compareDocumentDocx(inputFile1, inputFile2, comparisonMode, autorepair, changeOutlines, headersAndFooters);

        // TODO: test validations
    }
    
}
