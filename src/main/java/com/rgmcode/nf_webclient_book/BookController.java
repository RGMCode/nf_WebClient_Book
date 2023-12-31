package com.rgmcode.nf_webclient_book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/all")
    Book[] getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("978-3-8362-8745-6")
    Book[] getBookById(){
        return bookService.getBookById();
    }


}
