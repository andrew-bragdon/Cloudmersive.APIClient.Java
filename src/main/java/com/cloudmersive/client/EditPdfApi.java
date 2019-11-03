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

import com.cloudmersive.client.invoker.ApiCallback;
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.ApiResponse;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.Pair;
import com.cloudmersive.client.invoker.ProgressRequestBody;
import com.cloudmersive.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EditPdfApi {
    private ApiClient apiClient;

    public EditPdfApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EditPdfApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for editPdfEncrypt
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editPdfEncryptCall(File inputFile, String userPassword, String ownerPassword, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/convert/edit/pdf/encrypt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (userPassword != null)
        localVarHeaderParams.put("userPassword", apiClient.parameterToString(userPassword));
        if (ownerPassword != null)
        localVarHeaderParams.put("ownerPassword", apiClient.parameterToString(ownerPassword));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (inputFile != null)
        localVarFormParams.put("inputFile", inputFile);

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call editPdfEncryptValidateBeforeCall(File inputFile, String userPassword, String ownerPassword, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new ApiException("Missing the required parameter 'inputFile' when calling editPdfEncrypt(Async)");
        }
        

        com.squareup.okhttp.Call call = editPdfEncryptCall(inputFile, userPassword, ownerPassword, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Encrypt and password-protect a PDF
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] editPdfEncrypt(File inputFile, String userPassword, String ownerPassword) throws ApiException {
        ApiResponse<byte[]> resp = editPdfEncryptWithHttpInfo(inputFile, userPassword, ownerPassword);
        return resp.getData();
    }

    /**
     * Encrypt and password-protect a PDF
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> editPdfEncryptWithHttpInfo(File inputFile, String userPassword, String ownerPassword) throws ApiException {
        com.squareup.okhttp.Call call = editPdfEncryptValidateBeforeCall(inputFile, userPassword, ownerPassword, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Encrypt and password-protect a PDF (asynchronously)
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editPdfEncryptAsync(File inputFile, String userPassword, String ownerPassword, final ApiCallback<byte[]> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editPdfEncryptValidateBeforeCall(inputFile, userPassword, ownerPassword, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editPdfSetPermissions
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional) (optional)
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true. (optional)
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true. (optional)
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. (optional)
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true. (optional)
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. (optional)
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. (optional)
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editPdfSetPermissionsCall(String ownerPassword, File inputFile, String userPassword, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/convert/edit/pdf/encrypt/set-permissions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ownerPassword != null)
        localVarHeaderParams.put("ownerPassword", apiClient.parameterToString(ownerPassword));
        if (userPassword != null)
        localVarHeaderParams.put("userPassword", apiClient.parameterToString(userPassword));
        if (allowPrinting != null)
        localVarHeaderParams.put("allowPrinting", apiClient.parameterToString(allowPrinting));
        if (allowDocumentAssembly != null)
        localVarHeaderParams.put("allowDocumentAssembly", apiClient.parameterToString(allowDocumentAssembly));
        if (allowContentExtraction != null)
        localVarHeaderParams.put("allowContentExtraction", apiClient.parameterToString(allowContentExtraction));
        if (allowFormFilling != null)
        localVarHeaderParams.put("allowFormFilling", apiClient.parameterToString(allowFormFilling));
        if (allowEditing != null)
        localVarHeaderParams.put("allowEditing", apiClient.parameterToString(allowEditing));
        if (allowAnnotations != null)
        localVarHeaderParams.put("allowAnnotations", apiClient.parameterToString(allowAnnotations));
        if (allowDegradedPrinting != null)
        localVarHeaderParams.put("allowDegradedPrinting", apiClient.parameterToString(allowDegradedPrinting));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (inputFile != null)
        localVarFormParams.put("inputFile", inputFile);

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call editPdfSetPermissionsValidateBeforeCall(String ownerPassword, File inputFile, String userPassword, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ownerPassword' is set
        if (ownerPassword == null) {
            throw new ApiException("Missing the required parameter 'ownerPassword' when calling editPdfSetPermissions(Async)");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new ApiException("Missing the required parameter 'inputFile' when calling editPdfSetPermissions(Async)");
        }
        

        com.squareup.okhttp.Call call = editPdfSetPermissionsCall(ownerPassword, inputFile, userPassword, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Encrypt, password-protect and set restricted permissions on a PDF
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional) (optional)
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true. (optional)
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true. (optional)
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. (optional)
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true. (optional)
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. (optional)
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. (optional)
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true. (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] editPdfSetPermissions(String ownerPassword, File inputFile, String userPassword, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws ApiException {
        ApiResponse<byte[]> resp = editPdfSetPermissionsWithHttpInfo(ownerPassword, inputFile, userPassword, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting);
        return resp.getData();
    }

    /**
     * Encrypt, password-protect and set restricted permissions on a PDF
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional) (optional)
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true. (optional)
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true. (optional)
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. (optional)
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true. (optional)
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. (optional)
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. (optional)
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true. (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> editPdfSetPermissionsWithHttpInfo(String ownerPassword, File inputFile, String userPassword, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws ApiException {
        com.squareup.okhttp.Call call = editPdfSetPermissionsValidateBeforeCall(ownerPassword, inputFile, userPassword, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Encrypt, password-protect and set restricted permissions on a PDF (asynchronously)
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional) (optional)
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true. (optional)
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true. (optional)
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. (optional)
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true. (optional)
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. (optional)
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. (optional)
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editPdfSetPermissionsAsync(String ownerPassword, File inputFile, String userPassword, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting, final ApiCallback<byte[]> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editPdfSetPermissionsValidateBeforeCall(ownerPassword, inputFile, userPassword, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editPdfWatermarkText
     * @param watermarkText Watermark text to add to the PDF (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param fontName Font Family Name for the watermark text; default is Times New Roman (optional)
     * @param fontSize Font Size in points of the text; default is 150 (optional)
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red (optional)
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editPdfWatermarkTextCall(String watermarkText, File inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/convert/edit/pdf/watermark/text";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (watermarkText != null)
        localVarHeaderParams.put("watermarkText", apiClient.parameterToString(watermarkText));
        if (fontName != null)
        localVarHeaderParams.put("fontName", apiClient.parameterToString(fontName));
        if (fontSize != null)
        localVarHeaderParams.put("fontSize", apiClient.parameterToString(fontSize));
        if (fontColor != null)
        localVarHeaderParams.put("fontColor", apiClient.parameterToString(fontColor));
        if (fontTransparency != null)
        localVarHeaderParams.put("fontTransparency", apiClient.parameterToString(fontTransparency));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (inputFile != null)
        localVarFormParams.put("inputFile", inputFile);

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call editPdfWatermarkTextValidateBeforeCall(String watermarkText, File inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'watermarkText' is set
        if (watermarkText == null) {
            throw new ApiException("Missing the required parameter 'watermarkText' when calling editPdfWatermarkText(Async)");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new ApiException("Missing the required parameter 'inputFile' when calling editPdfWatermarkText(Async)");
        }
        

        com.squareup.okhttp.Call call = editPdfWatermarkTextCall(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add a text watermark to a PDF
     * Adds a text watermark to a PDF
     * @param watermarkText Watermark text to add to the PDF (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param fontName Font Family Name for the watermark text; default is Times New Roman (optional)
     * @param fontSize Font Size in points of the text; default is 150 (optional)
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red (optional)
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] editPdfWatermarkText(String watermarkText, File inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws ApiException {
        ApiResponse<byte[]> resp = editPdfWatermarkTextWithHttpInfo(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency);
        return resp.getData();
    }

    /**
     * Add a text watermark to a PDF
     * Adds a text watermark to a PDF
     * @param watermarkText Watermark text to add to the PDF (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param fontName Font Family Name for the watermark text; default is Times New Roman (optional)
     * @param fontSize Font Size in points of the text; default is 150 (optional)
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red (optional)
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> editPdfWatermarkTextWithHttpInfo(String watermarkText, File inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws ApiException {
        com.squareup.okhttp.Call call = editPdfWatermarkTextValidateBeforeCall(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a text watermark to a PDF (asynchronously)
     * Adds a text watermark to a PDF
     * @param watermarkText Watermark text to add to the PDF (required) (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param fontName Font Family Name for the watermark text; default is Times New Roman (optional)
     * @param fontSize Font Size in points of the text; default is 150 (optional)
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red (optional)
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editPdfWatermarkTextAsync(String watermarkText, File inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency, final ApiCallback<byte[]> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editPdfWatermarkTextValidateBeforeCall(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
