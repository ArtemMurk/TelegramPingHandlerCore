package com.murk.telegram.ping.handler.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "module_handler", schema = "public")
public class Module {

    @Id
    private String key;


    public Module() {
    }

    public Module(String key) {
        this.key = key;
    }
}