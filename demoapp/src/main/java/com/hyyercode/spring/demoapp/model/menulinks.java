package com.hyyercode.spring.demoapp.model;

import javax.persistence.*;

@Entity
@Table(name="menulinks")
public class menulinks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "menu_name", columnDefinition = "varchar(50)")
    private String menuName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
