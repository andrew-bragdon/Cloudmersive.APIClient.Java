/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilterApi
 */
@Ignore
public class FilterApiTest {

    private final FilterApi api = new FilterApi();

    
    /**
     * Convert image to black-and-white grayscale
     *
     * Remove color from the image by converting to a grayscale, black-and-white image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterBlackAndWhiteTest() throws ApiException {
        File imageFile = null;
        byte[] response = api.filterBlackAndWhite(imageFile);

        // TODO: test validations
    }
    
    /**
     * Despeckle to remove point noise from the image
     *
     * Remove point noise / despeckle the input image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterDespeckleTest() throws ApiException {
        File imageFile = null;
        byte[] response = api.filterDespeckle(imageFile);

        // TODO: test validations
    }
    
    /**
     * Detect and highlight edges in an image
     *
     * Perform an edge detection operation on the input image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterEdgeDetectTest() throws ApiException {
        Integer radius = null;
        File imageFile = null;
        byte[] response = api.filterEdgeDetect(radius, imageFile);

        // TODO: test validations
    }
    
    /**
     * Emboss an image
     *
     * Perform an emboss operation on the input image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterEmbossTest() throws ApiException {
        Integer radius = null;
        Integer sigma = null;
        File imageFile = null;
        byte[] response = api.filterEmboss(radius, sigma, imageFile);

        // TODO: test validations
    }
    
    /**
     * Perform a guassian blur on the input image
     *
     * Perform a gaussian blur on the input image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterGaussianBlurTest() throws ApiException {
        Integer radius = null;
        Integer sigma = null;
        File imageFile = null;
        byte[] response = api.filterGaussianBlur(radius, sigma, imageFile);

        // TODO: test validations
    }
    
    /**
     * Perform a motion blur on the input image
     *
     * Perform a motion blur on the input image at a specific angle
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterMotionBlurTest() throws ApiException {
        Integer radius = null;
        Integer sigma = null;
        Integer angle = null;
        File imageFile = null;
        byte[] response = api.filterMotionBlur(radius, sigma, angle, imageFile);

        // TODO: test validations
    }
    
    /**
     * Posterize the image by reducing distinct colors
     *
     * Reduce the unique number of colors in the image to the specified level
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterPosterizeTest() throws ApiException {
        Integer levels = null;
        File imageFile = null;
        byte[] response = api.filterPosterize(levels, imageFile);

        // TODO: test validations
    }
    
    /**
     * Swirl distort the image
     *
     * Swirl distort the image by the specified number of degrees
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterSwirlTest() throws ApiException {
        Integer degrees = null;
        File imageFile = null;
        byte[] response = api.filterSwirl(degrees, imageFile);

        // TODO: test validations
    }
    
}
