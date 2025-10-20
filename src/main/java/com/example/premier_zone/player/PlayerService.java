package com.example.premier_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getTeam())).collect(Collectors.toList());
    }

    public List<Player> getPlayersFromNumber(Integer number) {
        return playerRepository.findAll().stream()
                .filter(player -> number == player.getNumber()).collect(Collectors.toList());
    }

    public Player savePlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public List<Player> getPlayersByName(String playerName) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getName().toLowerCase()
                        .contains(playerName.toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByPosition(String position) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPosition()
                        .toLowerCase().equals(position.toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByNation(String playerNation) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation().toLowerCase().equals(playerNation.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByPositionAndTeam(String position, String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> position.toLowerCase().equals(player.getPosition().toLowerCase())
                && teamName.toLowerCase().equals(player.getName().toLowerCase())).collect(Collectors.toList());
    }

    public Player updatePlayer(Player player) {
        Optional<Player> existingPlayer = playerRepository.findByName(player.getName());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(player.getName());
            playerToUpdate.setNation(player.getNation());
            playerToUpdate.setTeam(player.getTeam());
            playerToUpdate.setPosition(player.getPosition());
            playerToUpdate.setNation(player.getNation());
            playerRepository.save(playerToUpdate);

            return playerToUpdate;
        } return null;
    }

    public Player deletePlayer(String playerName) {
        Optional<Player> existingPlayer = playerRepository.findByName(playerName);

        if (existingPlayer.isPresent()) {
            Player playerToDelete = existingPlayer.get();
            playerRepository.delete(playerToDelete);

            return playerToDelete;
        } return null;
    }
    // Now you are creating the methods to get lists of all the desired players for the application
}
