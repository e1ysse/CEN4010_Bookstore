package com.jetbrains.geektext.GeekText.service;

import com.jetbrains.geektext.GeekText.entity.CreditCardEntity;
import java.util.List;
import java.util.Optional;

public interface CreditCardService {
    List<CreditCardEntity> findAllCreditCards();
    Optional<CreditCardEntity> findByCreditCardNumber(Long credit_card_number);
    void addCreditCard(CreditCardEntity creditCardEntity);
    void deleteCreditCard(Long creditCardNumber);

}
