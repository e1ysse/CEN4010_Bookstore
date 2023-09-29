package com.jetbrains.geektext.GeekText.repository;

import com.jetbrains.geektext.GeekText.entity.BookDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookInfoRepository extends JpaRepository<BookDetailsEntity, Long> {

}
