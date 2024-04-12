package com.example.valid.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author luoyaa
 * @date 2024-04-12 16:52:29
 */
@Data
public class User {

    @NotNull(message = "ID不能为空", groups = ValidGroup.Crud.Update.class)
    private Long id;

    @NotBlank(message = "名称不能为空")
    private String name;

    @NotNull(message = "年龄不能为空")
    private Integer age;
}
