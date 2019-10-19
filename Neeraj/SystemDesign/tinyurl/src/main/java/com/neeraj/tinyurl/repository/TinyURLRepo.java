package com.neeraj.tinyurl.repository;

import com.neeraj.tinyurl.model.TinyURLEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TinyURLRepo extends JpaRepository<TinyURLEntity, Long> {

    List<TinyURLEntity> findByShortURL(String randomString);

    Long countByShortURL(String randomString);
}
