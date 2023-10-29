package com.jetbrains.geektext.GeekText.controller;

import com.jetbrains.geektext.GeekText.entity.CreditCardEntity;
import com.jetbrains.geektext.GeekText.service.CreditCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/credit_card")
public class CreditCardController {

    private final CreditCardService creditCardService;

    public CreditCardController(CreditCardService creditCardService){
        this.creditCardService = creditCardService;
    }

    @GetMapping
    public List<CreditCardEntity> findAllCreditCards(){
        return creditCardService.findAllCreditCards();
    }

    @GetMapping("/{credit_card_number}")
    public Optional<CreditCardEntity> findByCreditCardNumber(@PathVariable("credit_card_number") Long credit_card_number){
        return creditCardService.findByCreditCardNumber(credit_card_number);
    }

    @PostMapping
    public CreditCardEntity addCreditCard(@RequestBody CreditCardEntity creditCardEntity){
        return creditCardService.addCreditCard(creditCardEntity);
    }
}
