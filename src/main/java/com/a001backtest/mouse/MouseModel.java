package com.a001backtest.mouse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MouseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOfMouse;

    private String nameOfMouse;

    public MouseModel(String name){
        this.nameOfMouse = name;
    }
}
