package com.openshift.spring.dao;

/**
 * Created by nadim on 8/12/14.
 */

import com.openshift.spring.model.Team;

import java.util.List;


public interface TeamDAO {

    public void addTeam(Team team);

    public void updateTeam(Team team);

    public Team getTeam(int id);

    public void deleteTeam(int id);

    public List<Team> getTeams();

}