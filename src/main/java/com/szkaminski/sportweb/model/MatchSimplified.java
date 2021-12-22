package com.szkaminski.sportweb.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MatchSimplified{

    private Long id;
    private String homeTeamName;
    private String awayTeamName;
    private int homeScore;
    private int awayScore;

}
