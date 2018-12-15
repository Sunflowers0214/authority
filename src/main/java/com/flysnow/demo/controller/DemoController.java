package com.flysnow.demo.controller;

import com.flysnow.common.base.BaseController;
import com.flysnow.common.base.Result;
import com.flysnow.common.status.DataStatus;
import com.flysnow.common.util.UUIDUtil;
import com.flysnow.demo.model.Appointment;
import com.flysnow.demo.model.Book;
import com.flysnow.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {

    @RequestMapping("/resful/{pid}")
    public void resful(@PathVariable("pid") int pid) {
        logger.info("pid=" + pid);
    }

    @RequestMapping("/getJson")
    @ResponseBody
    public Result getJson(String data) {
        logger.debug("请求参数：" + data);
        Map<String, Object> map = new HashMap<>();
        map.put("intdata", 12);
        map.put("doubledata", 12d);
        map.put("stringdata", "wefds");
        map.put("datedata", new Date());

        Book book = new Book();
        book.setBookId(UUIDUtil.genKey());
        book.setBookName("从囊当初");
        book.setBookNumber(10);
        map.put("objdata", book);
        return new Result(map);
    }

    @RequestMapping("/getPageJson")
    @ResponseBody
    public Result getPageJson(@RequestParam(required = true) String data, @RequestParam(required = true) String pageNo, @RequestParam(required = true) String pageSize, @RequestParam(required = false) String sort) {
        logger.debug("请求参数：" + data);
        logger.debug("请求参数：" + pageNo);
        logger.debug("请求参数：" + pageSize);
        Map<String, Object> map = new HashMap<>();
        map.put("intdata", 12);
        map.put("doubledata", 12d);
        map.put("stringdata", "wefds");
        map.put("datedata", new Date());
        Book book = new Book();
        book.setBookId(UUIDUtil.genKey());
        book.setBookName("从囊当初");
        book.setBookNumber(10);
        map.put("objdata", book);
        return new Result(map);
    }
}
