package com.github.kurkov.wiseplan.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Aleksey Kurkov. Created on 12.02.2017
 * @version 1.0
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
