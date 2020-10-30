package com.zhoushugang.springbootamqp.service;

import com.zhoushugang.springbootamqp.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = "zhou.news")
    public void receive(Book book){
        System.out.println("收到消息");
        System.out.println(book.toString());
    }
}
