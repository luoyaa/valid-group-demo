package com.example.valid.controller;

import com.example.valid.entity.User;
import com.example.valid.entity.ValidGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoyaa
 * @date 2024-04-12 16:54:33
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping("/save")
    public String save(@RequestBody @Validated User user) {
        return "ok";
    }


    @PostMapping("/update")
    public String update(@RequestBody @Validated(value = ValidGroup.Crud.Update.class) User user) {
        return "ok";
    }
}
