/*
 * configapi
 * Config API lets you easily manage configuration at scale.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.model.CreateSettingRequest;
import com.cloudmersive.client.model.CreateSettingResponse;
import com.cloudmersive.client.model.ListSettingsRequest;
import com.cloudmersive.client.model.ListSettingsResponse;
import com.cloudmersive.client.model.UpdateSettingRequest;
import com.cloudmersive.client.model.UpdateSettingResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
@Ignore
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    
    /**
     * Create a setting in the specified bucket
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void settingsCreateSettingTest() throws Exception {
        CreateSettingRequest request = null;
        CreateSettingResponse response = api.settingsCreateSetting(request);

        // TODO: test validations
    }
    
    /**
     * Enumerate the settings in a bucket
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void settingsListSettingsTest() throws Exception {
        ListSettingsRequest request = null;
        ListSettingsResponse response = api.settingsListSettings(request);

        // TODO: test validations
    }
    
    /**
     * Update a setting
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void settingsUpdateSettingTest() throws Exception {
        UpdateSettingRequest request = null;
        UpdateSettingResponse response = api.settingsUpdateSetting(request);

        // TODO: test validations
    }
    
}
