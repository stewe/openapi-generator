/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (unset).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.TestResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "test-query-params", description = "the test-query-params API")
public interface TestQueryParamsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /test-query-params : test query params
     * desc
     *
     * @param queryNumber  (optional, default to 11.2)
     * @param queryString  (optional, default to qwerty)
     * @param queryStringWrapped  (optional, default to qwerty)
     * @param queryStringQuotes  (optional, default to qwerty\&quot;with quotes\&quot; test)
     * @param queryStringQuotesWrapped  (optional, default to qwerty\&quot;with quotes\&quot; test)
     * @param queryBoolean  (optional, default to true)
     * @return default response (status code 200)
     */
    @ApiOperation(value = "test query params", nickname = "queryParamsTest", notes = "desc", response = TestResponse.class, tags={ "verify-default-value", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "default response", response = TestResponse.class) })
    @GetMapping(
        value = "/test-query-params",
        produces = { "application/json" }
    )
    default ResponseEntity<TestResponse> queryParamsTest(@ApiParam(value = "", defaultValue = "11.2") @Valid @RequestParam(value = "queryNumber", required = false, defaultValue="11.2") BigDecimal queryNumber,@ApiParam(value = "", defaultValue = "qwerty") @Valid @RequestParam(value = "queryString", required = false, defaultValue="qwerty") String queryString,@ApiParam(value = "", defaultValue = "qwerty") @Valid @RequestParam(value = "queryStringWrapped", required = false, defaultValue="qwerty") String queryStringWrapped,@ApiParam(value = "", defaultValue = "qwerty\"with quotes\" test") @Valid @RequestParam(value = "queryStringQuotes", required = false, defaultValue="qwerty\"with quotes\" test") String queryStringQuotes,@ApiParam(value = "", defaultValue = "qwerty\"with quotes\" test") @Valid @RequestParam(value = "queryStringQuotesWrapped", required = false, defaultValue="qwerty\"with quotes\" test") String queryStringQuotesWrapped,@ApiParam(value = "", defaultValue = "true") @Valid @RequestParam(value = "queryBoolean", required = false, defaultValue="true") Boolean queryBoolean) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"numberField\" : 6.027456183070403, \"booleanField\" : true, \"id\" : 0, \"stringField\" : \"asd\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
