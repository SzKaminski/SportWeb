package com.szkaminski.sportweb.controller;

import com.szkaminski.sportweb.model.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MatchApi {

    private List<Match> matchList;

    public MatchApi() {
        Team manchester_city = new Team(1L, "Manchester City");
        Team leeds_united = new Team(2L, "Leeds United");
        Team crystal_palace = new Team(2L, "Crystal Palace");
        Team southampton = new Team(2L, "Southampton");

        this.matchList = new ArrayList<>();
        matchList.add(new Match(1L,
                manchester_city,
                leeds_united,
                new Result(7, 0),
                new Statistics(7,
                        0,
                        64,
                        36,
                        6,
                        1,
                        9,
                        2,
                        5,
                        9,
                        6,
                        2,
                        1,
                        0,
                        3,
                        8,
                        1,
                        1,
                        0,
                        0,
                        0,
                        0
                )));
        matchList.add(new Match(2L,
                crystal_palace,
                southampton,
                new Result(2, 2),
                new Statistics(2,
                        2,
                        60,
                        40,
                        6,
                        4,
                        2,
                        7,
                        16,
                        20,
                        4,
                        6,
                        1,
                        3,
                        2,
                        4,
                        2,
                        4,
                        0,
                        0,
                        0,
                        0
                )));
    }

    @GetMapping("/matches")
    public List<Match> getMatchList() {
        return matchList;
    }

    @GetMapping("/match")
    public Match getMatchById(@RequestParam int index){
        Optional<Match> getById = matchList.stream().filter(e -> e.getId()==index).findFirst();
        return getById.get();

    }

    @GetMapping("/recentMatch")
    public MatchSimplified getMostRecentMatch(){
        Match getRecent = matchList.get(matchList.size()-1);
        MatchSimplified simplified = new MatchSimplified();
        simplified.setId(getRecent.getId());
        simplified.setHomeTeamName(getRecent.getHomeTeam().getName());
        simplified.setAwayTeamName(getRecent.getAwayTeam().getName());
        simplified.setHomeScore(getRecent.getResults().getHomeTeamScore());
        simplified.setAwayScore(getRecent.getResults().getAwayTeamScore());
        return simplified;

    }

    @GetMapping("/recentMatchStatistics")
    public Statistics getRecentMatchStatistics(){
        Match getRecent = matchList.get(matchList.size()-1);
        return getRecent.getMatchStatistics();
    }


}
