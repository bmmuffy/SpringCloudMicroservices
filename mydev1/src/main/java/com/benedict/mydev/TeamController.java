package com.benedict.mydev;

import com.benedict.mydev.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class TeamController {
    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/teams")
    private Iterable<Team> getTeams(){


        return teamRepository.findAll();

    }
}

