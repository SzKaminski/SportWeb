package com.szkaminski.sportweb.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Match extends MatchSimplified {

    private Long id;
    private Team homeTeam;
    private Team awayTeam;
    private Result results;
    private Statistics matchStatistics;
}
