package org.openapitools.api;

import org.openapitools.model.LawOrder;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-06T21:34:28.028525Z[Etc/UTC]")

@Controller
@RequestMapping("${openapi.OpenAPI Spring.base-path:}")
public class LawOrderApiController implements LawOrderApi {

    /**
     * DELETE /lawOrder/{lawOrderId}
     *
     * @param lawOrderId  (required)
     * @return OK (status code 200)
     *         or Internal Server Error (status code 500)
     * @see LawOrderApi#deleteLawOrderLawOrderId
     */
    public <ResponseEntity<Void>> deleteLawOrderLawOrderId(@ApiParam(value = "",required=true) @PathVariable("lawOrderId") String lawOrderId) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.OK);
        return result.then(Mono.empty());

    }

    /**
     * GET /lawOrder/{lawOrderId} : Your GET endpoint
     *
     * @param lawOrderId  (required)
     * @return OK (status code 200)
     * @see LawOrderApi#getLawOrderLawOrderId
     */
    public <ResponseEntity<LawOrder>> getLawOrderLawOrderId(@ApiParam(value = "",required=true) @PathVariable("lawOrderId") String lawOrderId) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.valueOf(200));
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"date\" : \"2021-01-01T00:00:00.000+0000\", \"number\" : \"3333333\", \"dateOfExecOrder\" : \"2021-01-01T00:00:00.000+0000\", \"orderKind\" : \"взыскание\", \"deals\" : [ { \"date\" : \"2019-01-01T00:00:00.000+0000\", \"lawOrderFund\" : \"810\", \"lawOrderFundRate\" : 70.77, \"fund\" : \"810\", \"dealId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"numebr\" : \"0000-КУ/00\", \"lawOrderFeeRateType\" : \"День\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"lawOrderCreditRate\" : 10.5, \"lawOrderFeeRate\" : 0.2 }, { \"date\" : \"2019-01-01T00:00:00.000+0000\", \"lawOrderFund\" : \"810\", \"lawOrderFundRate\" : 70.77, \"fund\" : \"810\", \"dealId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"numebr\" : \"0000-КУ/00\", \"lawOrderFeeRateType\" : \"День\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"lawOrderCreditRate\" : 10.5, \"lawOrderFeeRate\" : 0.2 } ], \"numberOfCase\" : \"3333333\", \"documentName\" : \"документ\", \"customers\" : [ { \"passportNumber\" : \"666666\", \"firstName\" : \"Василий\", \"lastName\" : \"Васильев\", \"passportSerial\" : \"2222\", \"customerType\" : \"Наследник\", \"passportDivsion\" : \"000-000\", \"customerId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"middleName\" : \"Васильевич\", \"passportType\" : \"Паспорт РФ\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"birthDate\" : \"2000-01-01T00:00:00.000+0000\", \"passportDate\" : \"2020-01-01T00:00:00.000+0000\" }, { \"passportNumber\" : \"666666\", \"firstName\" : \"Василий\", \"lastName\" : \"Васильев\", \"passportSerial\" : \"2222\", \"customerType\" : \"Наследник\", \"passportDivsion\" : \"000-000\", \"customerId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"middleName\" : \"Васильевич\", \"passportType\" : \"Паспорт РФ\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"birthDate\" : \"2000-01-01T00:00:00.000+0000\", \"passportDate\" : \"2020-01-01T00:00:00.000+0000\" } ], \"lawOrderId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"numberOfExecOrder\" : \"33333\", \"status\" : \"введено\" }";
                result = ApiUtil.getExampleResponse(exchange, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /lawOrder : Your GET endpoint
     *
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     * @see LawOrderApi#getSaasda
     */
    public <ResponseEntity<Flux<LawOrder>>> getSaasda() {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.valueOf(200));
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"date\" : \"2021-01-01T00:00:00.000+0000\", \"number\" : \"3333333\", \"dateOfExecOrder\" : \"2021-01-01T00:00:00.000+0000\", \"orderKind\" : \"взыскание\", \"deals\" : [ { \"date\" : \"2019-01-01T00:00:00.000+0000\", \"lawOrderFund\" : \"810\", \"lawOrderFundRate\" : 70.77, \"fund\" : \"810\", \"dealId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"numebr\" : \"0000-КУ/00\", \"lawOrderFeeRateType\" : \"День\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"lawOrderCreditRate\" : 10.5, \"lawOrderFeeRate\" : 0.2 }, { \"date\" : \"2019-01-01T00:00:00.000+0000\", \"lawOrderFund\" : \"810\", \"lawOrderFundRate\" : 70.77, \"fund\" : \"810\", \"dealId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"numebr\" : \"0000-КУ/00\", \"lawOrderFeeRateType\" : \"День\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"lawOrderCreditRate\" : 10.5, \"lawOrderFeeRate\" : 0.2 } ], \"numberOfCase\" : \"3333333\", \"documentName\" : \"документ\", \"customers\" : [ { \"passportNumber\" : \"666666\", \"firstName\" : \"Василий\", \"lastName\" : \"Васильев\", \"passportSerial\" : \"2222\", \"customerType\" : \"Наследник\", \"passportDivsion\" : \"000-000\", \"customerId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"middleName\" : \"Васильевич\", \"passportType\" : \"Паспорт РФ\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"birthDate\" : \"2000-01-01T00:00:00.000+0000\", \"passportDate\" : \"2020-01-01T00:00:00.000+0000\" }, { \"passportNumber\" : \"666666\", \"firstName\" : \"Василий\", \"lastName\" : \"Васильев\", \"passportSerial\" : \"2222\", \"customerType\" : \"Наследник\", \"passportDivsion\" : \"000-000\", \"customerId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"middleName\" : \"Васильевич\", \"passportType\" : \"Паспорт РФ\", \"debtItems\" : [ { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 }, { \"debtQty\" : 10000.22, \"debtBalanceOut\" : 10000.22, \"debtItemType\" : \"BASEQTY\", \"priority\" : 0 } ], \"birthDate\" : \"2000-01-01T00:00:00.000+0000\", \"passportDate\" : \"2020-01-01T00:00:00.000+0000\" } ], \"lawOrderId\" : \"123e4567-e89b-12d3-a456-426655440000\", \"numberOfExecOrder\" : \"33333\", \"status\" : \"введено\" }";
                result = ApiUtil.getExampleResponse(exchange, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * POST /lawOrder
     *
     * @param lawOrder  (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     * @see LawOrderApi#postLawOrder
     */
    public <ResponseEntity<Void>> postLawOrder(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Mono<LawOrder> lawOrder) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.OK);
        return result.then(Mono.empty());

    }

    /**
     * PUT /lawOrder
     *
     * @param lawOrder  (optional)
     * @return OK (status code 200)
     * @see LawOrderApi#putLawOrder
     */
    public <ResponseEntity<Void>> putLawOrder(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Mono<LawOrder> lawOrder) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.OK);
        return result.then(Mono.empty());

    }

}
