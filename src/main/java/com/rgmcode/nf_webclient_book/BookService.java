package com.rgmcode.nf_webclient_book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BookService {

    public List<Book> getAllBooks() {
        WebClient webClient = WebClient.create("https://my-json-server.typicode.com/Flooooooooooorian/");
        BookResponse response = Objects.requireNonNull(webClient
                .get()
                .uri("/BookApi/books")
                .retrieve()
                .toEntity(BookResponse.class)
                .block()
        ).getBody();

        assert response != null;
        return response.getResults();
    }


}
