package com.example.valid.entity;

import javax.validation.groups.Default;

/**
 * @author luoyaa
 * @date 2024-04-12 16:57:05
 */
public interface ValidGroup extends Default {

    interface Crud extends ValidGroup {
        interface Create extends Crud{}
        interface Update extends Crud{}
        interface Query extends Crud{}
        interface Delete extends Crud{}
    }
}
