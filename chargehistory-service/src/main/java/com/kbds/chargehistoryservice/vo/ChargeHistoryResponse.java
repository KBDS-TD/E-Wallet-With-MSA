package com.kbds.chargehistoryservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChargeHistoryResponse {
    private String userId;
    private String ewalletId;
    private LocalDateTime transactionTime;
    private BigDecimal amt;
    private String memo;
    private BigDecimal finalAmt;
}
