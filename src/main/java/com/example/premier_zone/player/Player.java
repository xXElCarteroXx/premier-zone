package com.example.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_statistics")
public class Player {
    @Id
    @Column(name = "player", unique = true)
    private String name;
    private String nation, team, position, age;
    private Character date;
    private Integer number, minutes, goals, assists, penaltiesScored, penaltiesShot, totalShots,
    shotsOnTarget, yellowCards,redCards, touches, dribbles, tackles, blocks, shotCreatingActions,
    goalCreatingActions, passesCompleted, passesAttempted, progressivePasses, carries, progressiveCarries,
    dribbleAttempts, successfulDribbles;
    private Double expectedGoals, nonPkExpected, expectedAssists,passesCompletionRate;

    public Player() {}

    public Player(String name, String nation, String team, String position, String age, Character date,
                  Integer number, Integer minutes, Integer goals, Integer assists, Integer penaltiesScored,
                  Integer penaltiesShot, Integer totalShots, Integer shotsOnTarget, Integer yellowCards,
                  Integer redCards, Integer touches, Integer dribbles, Integer tackles, Integer blocks,
                  Integer shotCreatingActions, Integer goalCreatingActions, Integer passesCompleted,
                  Integer passesAttempted, Integer progressivePasses, Integer carries,
                  Integer progressiveCarries, Integer dribbleAttempts, Integer successfulDribbles,
                  Double expectedGoals, Double nonPkExpected, Double expectedAssists,
                  Double passesCompletionRate) {
        this.name = name;
        this.nation = nation;
        this.team = team;
        this.position = position;
        this.age = age;
        this.date = date;
        this.number = number;
        this.minutes = minutes;
        this.goals = goals;
        this.assists = assists;
        this.penaltiesScored = penaltiesScored;
        this.penaltiesShot = penaltiesShot;
        this.totalShots = totalShots;
        this.shotsOnTarget = shotsOnTarget;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.touches = touches;
        this.dribbles = dribbles;
        this.tackles = tackles;
        this.blocks = blocks;
        this.shotCreatingActions = shotCreatingActions;
        this.goalCreatingActions = goalCreatingActions;
        this.passesCompleted = passesCompleted;
        this.passesAttempted = passesAttempted;
        this.progressivePasses = progressivePasses;
        this.carries = carries;
        this.progressiveCarries = progressiveCarries;
        this.dribbleAttempts = dribbleAttempts;
        this.successfulDribbles = successfulDribbles;
        this.expectedGoals = expectedGoals;
        this.nonPkExpected = nonPkExpected;
        this.expectedAssists = expectedAssists;
        this.passesCompletionRate = passesCompletionRate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public Character getDate() {
        return date;
    }
    public void setDate(Character date) {
        this.date = date;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer getMinutes() {
        return minutes;
    }
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }
    public Integer getGoals() {
        return goals;
    }
    public void setGoals(Integer goals) {
        this.goals = goals;
    }
    public Integer getAssists() {
        return assists;
    }
    public void setAssists(Integer assists) {
        this.assists = assists;
    }
    public Integer getPenaltiesScored() {
        return penaltiesScored;
    }
    public void setPenaltiesScored(Integer penaltiesScored) {
        this.penaltiesScored = penaltiesScored;
    }
    public Integer getPenaltiesShot() {
        return penaltiesShot;
    }
    public void setPenaltiesShot(Integer penaltiesShot) {
        this.penaltiesShot = penaltiesShot;
    }
    public Integer getTotalShots() {
        return totalShots;
    }
    public void setTotalShots(Integer totalShots) {
        this.totalShots = totalShots;
    }
    public Integer getShotsOnTarget() {
        return shotsOnTarget;
    }
    public void setShotsOnTarget(Integer shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }
    public Integer getYellowCards() {
        return yellowCards;
    }
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }
    public Integer getRedCards() {
        return redCards;
    }
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }
    public Integer getTouches() {
        return touches;
    }
    public void setTouches(Integer touches) {
        this.touches = touches;
    }
    public Integer getDribbles() {
        return dribbles;
    }
    public void setDribbles(Integer dribbles) {
        this.dribbles = dribbles;
    }
    public Integer getTackles() {
        return tackles;
    }
    public void setTackles(Integer tackles) {
        this.tackles = tackles;
    }
    public Integer getBlocks() {
        return blocks;
    }
    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }
    public Integer getShotCreatingActions() {
        return shotCreatingActions;
    }
    public void setShotCreatingActions(Integer shotCreatingActions) {
        this.shotCreatingActions = shotCreatingActions;
    }
    public Integer getGoalCreatingActions() {
        return goalCreatingActions;
    }
    public void setGoalCreatingActions(Integer goalCreatingActions) {
        this.goalCreatingActions = goalCreatingActions;
    }
    public Integer getPassesCompleted() {
        return passesCompleted;
    }
    public void setPassesCompleted(Integer passesCompleted) {
        this.passesCompleted = passesCompleted;
    }
    public Integer getPassesAttempted() {
        return passesAttempted;
    }
    public void setPassesAttempted(Integer passesAttempted) {
        this.passesAttempted = passesAttempted;
    }
    public Integer getProgressivePasses() {
        return progressivePasses;
    }
    public void setProgressivePasses(Integer progressivePasses) {
        this.progressivePasses = progressivePasses;
    }
    public Integer getCarries() {
        return carries;
    }
    public void setCarries(Integer carries) {
        this.carries = carries;
    }
    public Integer getProgressiveCarries() {
        return progressiveCarries;
    }
    public void setProgressiveCarries(Integer progressiveCarries) {
        this.progressiveCarries = progressiveCarries;
    }
    public Integer getDribbleAttempts() {
        return dribbleAttempts;
    }
    public void setDribbleAttempts(Integer dribbleAttempts) {
        this.dribbleAttempts = dribbleAttempts;
    }
    public Integer getSuccessfulDribbles() {
        return successfulDribbles;
    }
    public void setSuccessfulDribbles(Integer successfulDribbles) {
        this.successfulDribbles = successfulDribbles;
    }
    public Double getExpectedGoals() {
        return expectedGoals;
    }
    public void setExpectedGoals(Double expectedGoals) {
        this.expectedGoals = expectedGoals;
    }
    public Double getNonPkExpected() {
        return nonPkExpected;
    }
    public void setNonPkExpected(Double nonPkExpected) {
        this.nonPkExpected = nonPkExpected;
    }
    public Double getExpectedAssists() {
        return expectedAssists;
    }
    public void setExpectedAssists(Double expectedAssists) {
        this.expectedAssists = expectedAssists;
    }
    public Double getPassesCompletionRate() {
        return passesCompletionRate;
    }
    public void setPassesCompletionRate(Double passesCompletionRate) {
        this.passesCompletionRate = passesCompletionRate;
    }
}