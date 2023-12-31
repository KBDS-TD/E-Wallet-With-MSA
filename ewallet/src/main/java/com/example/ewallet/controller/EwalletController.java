package com.example.ewallet.controller;

import com.example.ewallet.dto.EwalletDto;
import com.example.ewallet.service.EwalletService;
import com.example.ewallet.vo.RequestEwallet;
import com.example.ewallet.vo.ResponseEwallet;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/")
@Slf4j
public class EwalletController {
    private Environment env;
    private EwalletService ewalletService;

    @Autowired
    public EwalletController(Environment env, EwalletService ewalletService){
        this.env = env;
        this.ewalletService = ewalletService;
    }

    @PostMapping("/createEwallet")
    public ResponseEntity<ResponseEwallet> createEwallet(@RequestBody RequestEwallet ewallet){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        EwalletDto ewalletDto = mapper.map(ewallet, EwalletDto.class);
        ewalletService.createEwallet(ewalletDto);
        ResponseEwallet responseEwallet = mapper.map(ewalletDto, ResponseEwallet.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseEwallet);
    }

//    @PostMapping(value = {"/{userId}/{ewalletId}"})
//    public String remit(@PathVariable("userId") String userId,
//                           @PathVariable("ewalletId") String ewalletId,
//                            BigDecimal amt
//                           ) {
//        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//
//        EwalletDto ewalletDto =        mapper.map(ewallet, EwalletDto.class);
//        ewalletService.createRemit(ewalletDto);
//
//        return new ResponseEntity(HttpStatus.CREATED);
//    }

    @GetMapping("/searchWallet/{userId}")
    public ResponseEntity<ResponseEwallet> searchWallet(@PathVariable String userId){
        EwalletDto ewalletDto = ewalletService.searchEwallet(userId);
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        ResponseEwallet responseEwallet = mapper.map(ewalletDto, ResponseEwallet.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseEwallet);
    }

    @PostMapping("/updateBalance")
    public ResponseEntity<ResponseEwallet> updateBalance(@RequestBody RequestEwallet requestEwallet){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        EwalletDto ewalletDto = mapper.map(requestEwallet, EwalletDto.class);
        ewalletDto = ewalletService.updateBalance(ewalletDto);

        ResponseEwallet responseEwallet = mapper.map(ewalletDto, ResponseEwallet.class);
        return ResponseEntity.status(HttpStatus.OK).body(responseEwallet);
    }

    @GetMapping("/welcome")
    public String welcome(){

        log.info("welcome to ewallet");

        return "welcome to ewallet";
    }
}
