/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.model.ParseAddressRequest;
import com.cloudmersive.client.model.ParseAddressResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressApi
 */
@Ignore
public class AddressApiTest {

    private final AddressApi api = new AddressApi();

    
    /**
     * Parse an unstructured input text string into an international, formatted address
     *
     * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressParseStringTest() throws ApiException {
        ParseAddressRequest input = null;
        ParseAddressResponse response = api.addressParseString(input);

        // TODO: test validations
    }
    
}
