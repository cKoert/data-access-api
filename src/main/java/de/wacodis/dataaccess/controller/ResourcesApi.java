/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.0).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package de.wacodis.dataaccess.controller;

import de.wacodis.dataaccess.model.AbstractResource;
import de.wacodis.dataaccess.model.AbstractSubsetDefinition;
import de.wacodis.dataaccess.model.Error;
import io.swagger.annotations.*;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2018-10-12T15:49:20.560+02:00[Europe/Berlin]")
@Validated
@Api(value = "resources", description = "the resources API")
public interface ResourcesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(
            value = "",
            nickname = "searchResources",
            notes = "searches for specific spatial data ",
            response = AbstractResource.class,
            responseContainer = "List",
            tags = {})
    @ApiResponses(
            value = {
                @ApiResponse(
                        code = 200,
                        message = "OK",
                        response = AbstractResource.class,
                        responseContainer = "List"),
                @ApiResponse(code = 500, message = "unexpected error ", response = Error.class)
            })
    @RequestMapping(
            value = "/resources/search",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<List<AbstractResource>> searchResources(
            @ApiParam(value = "search criteria ", required = true) @Valid @RequestBody
                    AbstractSubsetDefinition abstractSubsetDefinition) {
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
                                            "{  \"method\" : \"GetResource\",  \"url\" : \"url\"}");
                                    break;
                                }
                            }
                        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
