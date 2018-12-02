package com.flysnow.demo.controller;

import com.flysnow.common.*;
import com.flysnow.demo.model.Appointment;
import com.flysnow.demo.model.Book;
import com.flysnow.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController extends BaseController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/bookList")
    public String bookList(Model model) {
        List<Book> bookList = bookService.getList();
        model.addAttribute("bookList", bookList);
        return "bookListView";
    }

    @RequestMapping("/bookDetail")
    public String bookDetail(@PathVariable("bookId") String bookId, Model model) {
        Book book = bookService.getById(bookId);
        if (book == null) {
            return "forward:/book/bookList";
        }
        model.addAttribute("book", book);
        return "appointListView";
    }

    @RequestMapping("/appoint")
    public void appoint(String bookId, HttpServletRequest request, HttpServletResponse response) {
        String result = "{\"result\":\"success\"}";
        String studentId = UUIDUtil.genKey();
        StatusEnum status = bookService.appoint(bookId, studentId);
        if (status.getStatus() == StatusEnum.VALID.getStatus()) {
            result = "{\"result\":\"success\"}";
        } else {
            result = "{\"result\":\"error\"}";
        }
        response.setContentType("application/json");
        try {
            PrintWriter out = response.getWriter();
            out.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/appointList")
    public String appointList(String bookId, HttpServletRequest request) {
        List<Appointment> appointList = bookService.appointList(bookId);
        request.setAttribute("appointList", appointList);
        return "appointListView";
    }
}
