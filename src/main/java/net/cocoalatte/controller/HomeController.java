package net.cocoalatte.controller;

import net.cocoalatte.repository.AuthorRepository;
import net.cocoalatte.repository.BookRepository;
import net.cocoalatte.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @Autowired BookRepository bookRepository;
    @Autowired AuthorRepository authorRepository;
    @Autowired PublisherRepository publisherRepository;

    @RequestMapping("/")
    @ResponseBody
    private String home() {

        System.out.println(authorRepository.findAll());

        return "Hello world!";
    }
}
