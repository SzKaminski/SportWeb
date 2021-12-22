package com.szkaminski.sportweb.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private String login;
    private List<Match> favoriteMatches;
    private List<Match> ratedMatches;

}
