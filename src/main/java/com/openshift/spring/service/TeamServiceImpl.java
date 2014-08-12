package com.openshift.spring.service;

/**
 * Created by nadim on 8/12/14.
 */

import java.util.List;

import com.openshift.spring.dao.TeamDAO;
import com.openshift.spring.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDAO teamDAO;

    public void addTeam(Team team) {
        teamDAO.addTeam(team);
    }

    public void updateTeam(Team team) {
        teamDAO.updateTeam(team);
    }

    public Team getTeam(int id) {
        return teamDAO.getTeam(id);
    }

    public void deleteTeam(int id) {
        teamDAO.deleteTeam(id);
    }

    public List<Team> getTeams() {
        return teamDAO.getTeams();
    }

}