package com.br.joaoptgaino.ytb_url_shortener.exceptions.handler;

import com.br.joaoptgaino.ytb_url_shortener.exceptions.UrlNotFoundException;
import com.br.joaoptgaino.ytb_url_shortener.exceptions.model.UrlShortenerError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;

@RestControllerAdvice
public class UrlShortenerExceptionHandler {

    @ExceptionHandler(UrlNotFoundException.class)
    public ResponseEntity<UrlShortenerError> handleUrlNotFound(UrlNotFoundException ex) {
        UrlShortenerError errorResponse = UrlShortenerError.builder()
                .timestamp(LocalDateTime.now())
                .code(HttpStatus.NOT_FOUND.value())
                .status(HttpStatus.NOT_FOUND.name())
                .errors(List.of(ex.getMessage()))
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
