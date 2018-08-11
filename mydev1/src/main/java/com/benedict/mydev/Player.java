package com.benedict.mydev;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    Player (String name, String location){
        super();
        this.name= name;
        this.location = location;

    }



}
