package com.szkaminski.sportweb.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Result {

    private int homeTeamScore;
    private int awayTeamScore;
}
