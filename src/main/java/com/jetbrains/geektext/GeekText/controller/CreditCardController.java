package com.jetbrains.geektext.GeekText.controller;

import com.jetbrains.geektext.GeekText.entity.CreditCardEntity;
import com.jetbrains.geektext.GeekText.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jetbrains.geektext.GeekText.entity.UserEntity;
import com.jetbrains.geektext.GeekText.repository.UserRepository;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/credit_card")
public class CreditCardController {

    private final CreditCardService creditCardService;

    @Autowired
    private UserRepository userRepository;


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
    public ResponseEntity<Void> addCreditCard(@RequestBody CreditCardEntity creditCardEntity, @RequestParam("user_id") Long userId) {
        UserEntity user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        creditCardEntity.setUser(user);
        creditCardService.addCreditCard(creditCardEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



    @DeleteMapping("/{creditCardNumber}")
    public ResponseEntity<Void> deleteCreditCard(@PathVariable Long creditCardNumber) {
        creditCardService.deleteCreditCard(creditCardNumber);
        return ResponseEntity.noContent().build();
    }

}
