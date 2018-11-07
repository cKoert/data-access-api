/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.2).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package de.wacodis.dataaccess.controller;

import de.wacodis.dataaccess.model.AbstractDataEnvelope;
import de.wacodis.dataaccess.model.Error;
import io.swagger.annotations.*;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2018-11-07T15:19:59.896+01:00[Europe/Berlin]")
@Validated
@Api(value = "dataenvelopes", description = "the dataenvelopes API")
public interface DataenvelopesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(
            value = "",
            nickname = "createResource",
            notes = "create DataEnvelope ",
            response = String.class,
            tags = {})
    @ApiResponses(
            value = {
                @ApiResponse(
                        code = 201,
                        message = "DataEnvelope created ",
                        response = String.class),
                @ApiResponse(code = 500, message = "unexpected error ", response = Error.class)
            })
    @RequestMapping(
            value = "/dataenvelopes",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<String> createResource(
            @ApiParam(value = "DataEnvelope to be created ", required = true) @Valid @RequestBody
                    AbstractDataEnvelope abstractDataEnvelope) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(
            value = "",
            nickname = "deleteDataEnvelope",
            notes = "delete DataEnvelope ",
            tags = {})
    @ApiResponses(
            value = {
                @ApiResponse(code = 204, message = "DataEnvelope deleted"),
                @ApiResponse(
                        code = 404,
                        message = "no DataEnvelope available for the given id ",
                        response = String.class),
                @ApiResponse(code = 500, message = "unexpected error ", response = Error.class)
            })
    @RequestMapping(
            value = "/dataenvelopes/{id}",
            produces = {"application/json"},
            method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteDataEnvelope(
            @ApiParam(value = "ID of DataEnvelope to be deleted ", required = true)
                    @PathVariable("id")
                    String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(
            value = "",
            nickname = "modifyDataEnvelope",
            notes = "update DataEnvelope ",
            response = AbstractDataEnvelope.class,
            tags = {})
    @ApiResponses(
            value = {
                @ApiResponse(
                        code = 200,
                        message = "DataEnvelope updated",
                        response = AbstractDataEnvelope.class),
                @ApiResponse(
                        code = 404,
                        message = "no DataEnvelope available for the given ID ",
                        response = String.class),
                @ApiResponse(code = 500, message = "unexpected error ", response = Error.class)
            })
    @RequestMapping(
            value = "/dataenvelopes/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    default ResponseEntity<AbstractDataEnvelope> modifyDataEnvelope(
            @ApiParam(value = "ID of DataEnvelope to be updated ", required = true)
                    @PathVariable("id")
                    String id,
            @ApiParam(value = "resource ", required = true) @Valid @RequestBody
                    AbstractDataEnvelope abstractDataEnvelope) {
        getRequest()
                .ifPresent(
                        request -> {
                            for (MediaType mediaType :
                                    MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                                if (mediaType.isCompatibleWith(
                                        MediaType.valueOf("application/json"))) {
                                    ApiUtil.setExampleResponse(
                                            request,
                                            "application/json",
                                            "{  \"sourceType\" : \"SensorWebDataEnvelope\",  \"areaOfInterest\" : {    \"extent\" : [ -151.17018, -151.17018, -151.17018, -151.17018 ]  },  \"created\" : \"2000-01-23T04:56:07.000+00:00\",  \"modified\" : \"2000-01-23T04:56:07.000+00:00\",  \"timeFrame\" : {    \"startTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endTime\" : \"2000-01-23T04:56:07.000+00:00\"  }}");
                                    break;
                                }
                            }
                        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(
            value = "",
            nickname = "retrieveDataEnvelope",
            notes = "retrieve DataEnvelope by Id ",
            response = AbstractDataEnvelope.class,
            tags = {})
    @ApiResponses(
            value = {
                @ApiResponse(
                        code = 200,
                        message = "resource available",
                        response = AbstractDataEnvelope.class),
                @ApiResponse(
                        code = 404,
                        message = "no DataEnvelope available for the given id ",
                        response = String.class),
                @ApiResponse(code = 500, message = "unexpected error ", response = Error.class)
            })
    @RequestMapping(
            value = "/dataenvelopes/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<AbstractDataEnvelope> retrieveDataEnvelope(
            @ApiParam(value = "ID of DataEnvelope to retrieve ", required = true)
                    @PathVariable("id")
                    String id) {
        getRequest()
                .ifPresent(
                        request -> {
                            for (MediaType mediaType :
                                    MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                                if (mediaType.isCompatibleWith(
                                        MediaType.valueOf("application/json"))) {
                                    ApiUtil.setExampleResponse(
                                            request,
                                            "application/json",
                                            "{  \"sourceType\" : \"SensorWebDataEnvelope\",  \"areaOfInterest\" : {    \"extent\" : [ -151.17018, -151.17018, -151.17018, -151.17018 ]  },  \"created\" : \"2000-01-23T04:56:07.000+00:00\",  \"modified\" : \"2000-01-23T04:56:07.000+00:00\",  \"timeFrame\" : {    \"startTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endTime\" : \"2000-01-23T04:56:07.000+00:00\"  }}");
                                    break;
                                }
                            }
                        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(
            value = "",
            nickname = "retrieveDataEnvelopeID",
            notes = "retrieve Id for DataEnvelope ",
            response = String.class,
            tags = {})
    @ApiResponses(
            value = {
                @ApiResponse(code = 200, message = "ok", response = String.class),
                @ApiResponse(code = 500, message = "unexpected error ", response = Error.class)
            })
    @RequestMapping(
            value = "/dataenvelopes/search",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<String> retrieveDataEnvelopeID(
            @ApiParam(value = "data envelope for the resource to be created ", required = true)
                    @Valid
                    @RequestBody
                    AbstractDataEnvelope abstractDataEnvelope) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
