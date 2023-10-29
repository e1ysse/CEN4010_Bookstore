package com.jetbrains.geektext.GeekText.service.impl;

import com.jetbrains.geektext.GeekText.entity.CreditCardEntity;
import com.jetbrains.geektext.GeekText.repository.CreditCardRepository;
import com.jetbrains.geektext.GeekText.service.CreditCardService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditCardServiceImpl implements CreditCardService {
    private final CreditCardRepository creditCardRepository;
    public CreditCardServiceImpl(CreditCardRepository creditCardRepository){
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public List<CreditCardEntity> findAllCreditCards(){
        return creditCardRepository.findAll();
    }

    @Override
    public Optional<CreditCardEntity> findByCreditCardNumber(Long credit_card_number){
        return creditCardRepository.findById(credit_card_number);
    }

    @Override
    public CreditCardEntity addCreditCard(CreditCardEntity creditCardEntity){
        return creditCardRepository.save(creditCardEntity);
    }
}
