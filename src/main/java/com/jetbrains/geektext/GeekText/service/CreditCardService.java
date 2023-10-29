package com.jetbrains.geektext.GeekText.service;


import com.jetbrains.geektext.GeekText.entity.CreditCardEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CreditCardService {
    List<CreditCardEntity> findAllCreditCards();

    Optional <CreditCardEntity> findByCreditCardNumber(Long credit_card_number);

    CreditCardEntity addCreditCard(CreditCardEntity creditCardEntity);
}
