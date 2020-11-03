package com.yogo.demo.controller;

import com.yogo.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query")
public class DemoController {

    @Autowired
    QueryService queryService;

    @RequestMapping(value = "/country/list", method = RequestMethod.GET)
    public ResponseEntity<Object> getListOfCountry() {
        List resultList = queryService.getListOfCountry();
        return new ResponseEntity<Object>(resultList, HttpStatus.OK);
    }

    @RequestMapping(value = "/menubar/list", method = RequestMethod.GET)
    public ResponseEntity<Object> getListOfMenuBar() {
        List resultList = queryService.getListOfMenuBar();
        return new ResponseEntity<Object>(resultList, HttpStatus.OK);
    }
}
