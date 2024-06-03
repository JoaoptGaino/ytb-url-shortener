package com.br.joaoptgaino.ytb_url_shortener.service;

import com.br.joaoptgaino.ytb_url_shortener.domain.dto.url.UrlRequestDTO;
import com.br.joaoptgaino.ytb_url_shortener.domain.dto.url.UrlResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;

public interface UrlService {

    UrlResponseDTO shortenUrl(UrlRequestDTO data, HttpServletRequest request);

    HttpHeaders redirect(String id);
}
