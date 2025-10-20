package com.example.premier_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/player")
public class PLayerController {
    private PlayerService playerService;

    @Autowired
    public PLayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String nation,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String team
    ) {
        if (name != null && nation != null && position != null && team != null) {
            return playerService.getPlayersByPositionAndTeam(position, team);
        } else if (name != null) {
            return playerService.getPlayersByName(name);
        } else if (nation != null) {
            return playerService.getPlayersByNation(nation);
        } else if (position != null) {
            return playerService.getPlayersByPosition(position);
        } else if (team != null) {
            return playerService.getPlayersFromTeam(team);
        } else return playerService.getPlayers();
    }

    @PostMapping
    public ResponseEntity<Player> savePlayer(@RequestBody Player player) {
        Player createdPlayer = playerService.savePlayer(player);
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        Player updatedPlayer = playerService.updatePlayer(player);

        if (updatedPlayer != null) {
            return new ResponseEntity<>(updatedPlayer, HttpStatus.OK);
        } return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{playerName}")
    public ResponseEntity<String> deletePlayer(@PathVariable String playerName) {
        playerService.deletePlayer(playerName);
        return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
    }
}
