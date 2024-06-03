package com.br.joaoptgaino.ytb_url_shortener.repository;

import com.br.joaoptgaino.ytb_url_shortener.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
