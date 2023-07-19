package com.rgmcode.nf_webclient_book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BookService {

    public Book[] getAllBooks() {
        WebClient webClient = WebClient.create("https://my-json-server.typicode.com/Flooooooooooorian/");
        Book[] response = Objects.requireNonNull(webClient
                .get()
                .uri("/BookApi/books")
                .retrieve()
                .toEntity(Book[].class)
                .block()
        ).getBody();

        assert response != null;
        return response;
    }

    public Book[] getBookById() {
        WebClient webClient = WebClient.create("https://my-json-server.typicode.com/Flooooooooooorian/");
        Book[] response = Objects.requireNonNull(webClient
                .get()
                .uri("/BookApi/books/978-3-8362-8745-6")
                .retrieve()
                .toEntity(Book[].class)
                .block()
        ).getBody();

        assert response != null;
        return response;
    }

}
