package com.szkaminski.sportweb.controller;

import com.szkaminski.sportweb.model.Match;
import com.szkaminski.sportweb.model.Result;
import com.szkaminski.sportweb.model.Statistics;
import com.szkaminski.sportweb.model.Team;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchApi {

    @Getter
    private List<Match> matchList;


    public MatchApi() {
        this.matchList = new ArrayList<>();
        matchList.add(new Match(1L,
                new Team(1L, "Manchester City"),
                new Team(2L,"Leeds United"),
                new Result(2,3),
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
    }

    @GetMapping
    public List<Match> getMatchList() {
        return matchList;
    }
}
