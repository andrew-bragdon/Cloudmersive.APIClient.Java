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
import com.cloudmersive.client.model.DrawPolygonRequest;
import com.cloudmersive.client.model.DrawRectangleRequest;
import com.cloudmersive.client.model.DrawTextRequest;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EditApi
 */
@Ignore
public class EditApiTest {

    private final EditApi api = new EditApi();

    
    /**
     * Normalizes image rotation and removes EXIF rotation data
     *
     * Automatically orients the input image based on EXIF information and then removes the EXIF information.  EXIF is an additional set of information stored in some images taken with cell phone cameras based on the orientation of the camera.  By normalizing rotation and removing EXIF data these images become much easier to process.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editAutoOrientTest() throws ApiException {
        File imageFile = null;
        byte[] response = api.editAutoOrient(imageFile);

        // TODO: test validations
    }
    
    /**
     * Composite two images together
     *
     * Composites two input images together; a layered image onto a base image.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editCompositeBasicTest() throws ApiException {
        String location = null;
        File baseImage = null;
        File layeredImage = null;
        byte[] response = api.editCompositeBasic(location, baseImage, layeredImage);

        // TODO: test validations
    }
    
    /**
     * Adaptively adjust the contrast of the image to be more appealing and easy to see
     *
     * Uses Gamma to adjust the contrast adaptively the way the human eye sees the world.  Results significantly improve the viewability and visual appeal of the image.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editContrastAdaptiveTest() throws ApiException {
        Double gamma = null;
        File imageFile = null;
        byte[] response = api.editContrastAdaptive(gamma, imageFile);

        // TODO: test validations
    }
    
    /**
     * Crop an image to a rectangular area
     *
     * Crop an image to a target rectangular area
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editCropRectangleTest() throws ApiException {
        Integer left = null;
        Integer top = null;
        Integer width = null;
        Integer height = null;
        File imageFile = null;
        byte[] response = api.editCropRectangle(left, top, width, height, imageFile);

        // TODO: test validations
    }
    
    /**
     * Draw a polygon onto an image
     *
     * Draw one or more polygons, with customized visuals, onto an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDrawPolygonTest() throws ApiException {
        DrawPolygonRequest request = null;
        byte[] response = api.editDrawPolygon(request);

        // TODO: test validations
    }
    
    /**
     * Draw a rectangle onto an image
     *
     * Draw one or more rectangles, with customized visuals, onto an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDrawRectangleTest() throws ApiException {
        DrawRectangleRequest request = null;
        byte[] response = api.editDrawRectangle(request);

        // TODO: test validations
    }
    
    /**
     * Draw text onto an image
     *
     * Draw one or more pieces of text, with customized visuals, onto an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDrawTextTest() throws ApiException {
        DrawTextRequest request = null;
        byte[] response = api.editDrawText(request);

        // TODO: test validations
    }
    
    /**
     * Add a customizeable drop shadow to an image
     *
     * Add a customizeable drop shadow to the image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDropShadowTest() throws ApiException {
        Integer X = null;
        Integer Y = null;
        Integer sigma = null;
        Integer opacity = null;
        File imageFile = null;
        byte[] response = api.editDropShadow(X, Y, sigma, opacity, imageFile);

        // TODO: test validations
    }
    
    /**
     * Remove transparency from the image
     *
     * Removes any active transparency in the image.  Effectively renders the image at the same resolution, in the same file format, over a white background, thus removing transparency.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editRemoveTransparencyTest() throws ApiException {
        File imageFile = null;
        byte[] response = api.editRemoveTransparency(imageFile);

        // TODO: test validations
    }
    
    /**
     * Rotate an image any number of degrees
     *
     * Rotates an image by an arbitrary number of degrees
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editRotateTest() throws ApiException {
        Double degrees = null;
        File imageFile = null;
        byte[] response = api.editRotate(degrees, imageFile);

        // TODO: test validations
    }
    
}
