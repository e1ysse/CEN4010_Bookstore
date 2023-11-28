package com.jetbrains.geektext.GeekText.repository;

import com.jetbrains.geektext.GeekText.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardEntity, Long> {
    // You can add custom methods here if needed, such as finding credit cards by user

}
