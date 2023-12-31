package com.kbds.remit.dto;

import com.kbds.remit.vo.ResponseRemit;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class RemitDto implements Serializable {
    private String userId;
    private String ewalletId;
    private Date transTime;
    private String remitCode;
    //입금출금구분
    private BigDecimal amt;
    private String memo;
    private String oppoUserId;
    private String cancelYn;
    private BigDecimal finBal;

    private List<ResponseRemit> responseRemitList;

}