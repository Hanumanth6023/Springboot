package com.onlineshopping.onlineshopping_mobile.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mobiles")
public class Model {


    @Id
    @Column(name="id")
    private Long id;

    @Column(name="mobilename")
    private String mobilename;


    @Column(name ="launchingdate")
    private Long launchingdate;

    @Column(name ="model")
    private String model;

    @Column(name ="price")
    private Long price;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
