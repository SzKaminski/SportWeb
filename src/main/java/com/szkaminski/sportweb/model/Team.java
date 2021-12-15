package com.szkaminski.sportweb.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Team {

    private Long id;
    private String name;
    private List players;

    public Team(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
