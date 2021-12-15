package com.szkaminski.sportweb.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Statistics {


    private int homeTeamGoals;
    private int awayTeamGoals;
    private int homeTeamBallPossession;
    private int awayTeamBallPossession;
    private int homeTeamShotsOnTarget;
    private int awayTeamShotsOnTarget;
    private int homeTeamShotsOffTarget;
    private int awayTeamShotsOffTarget;
    private int homeTeamFouls;
    private int awayTeamFouls;
    private int homeTeamCorners;
    private int awayTeamCorners;
    private int homeTeamOffsides;
    private int awayTeamOffsides;
    private int homeTeamSaves;
    private int awayTeamSaves;
    private int homeTeamYellowCards;
    private int awayTeamYellowCards;
    private int homeTeamSecondYellowCards;
    private int awayTeamSecondYellowCards;
    private int homeTeamRedCards;
    private int awayTeamRedCards;
}
