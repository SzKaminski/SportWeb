package com.szkaminski.sportweb.controller;

import com.szkaminski.sportweb.model.Team;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/teams")
public class TeamApi {

    private List<Team> teamList;

    public TeamApi() {
        this.teamList = new ArrayList<>();
        teamList.add(new Team(1L, "Manchester City"));
    }

    @GetMapping
    public List<Team> getTeamList() {
        return teamList;
    }
}
