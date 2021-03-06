/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package de.wacodis.dataaccess.controller;

import de.wacodis.dataaccess.model.AbstractResource;
import de.wacodis.dataaccess.model.DataAccessResourceSearchBody;
import de.wacodis.dataaccess.model.Error;
import io.swagger.annotations.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2019-04-25T13:24:55.746+02:00[Europe/Berlin]")
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
            response = List.class,
            responseContainer = "Map",
            tags = {})
    @ApiResponses(
            value = {
                @ApiResponse(
                        code = 200,
                        message = "OK",
                        response = List.class,
                        responseContainer = "Map"),
                @ApiResponse(code = 500, message = "unexpected error ", response = Error.class)
            })
    @RequestMapping(
            value = "/resources/search",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<Map<String, List<AbstractResource>>> searchResources(
            @ApiParam(value = "search criteria ", required = true) @Valid @RequestBody
                    DataAccessResourceSearchBody dataAccessResourceSearchBody) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
