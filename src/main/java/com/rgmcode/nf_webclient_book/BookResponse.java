package com.rgmcode.nf_webclient_book;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Repository
public class BookResponse {
    private List<Book> results = new ArrayList<>();
}
