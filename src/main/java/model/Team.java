package model;

public class Team {
    String name;
    String baseLocation;
    String coachName;
    Player captain;
    Player[] players;
    int playerCount = 0;

    public Team(String name, String baseLocation, String coachName) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("Limite de jogadores atingido. Não foi possível adicionar o jogador " + player.name + ".");
        }
    }

    public void removePlayer(Player player) {
        boolean found = false;
        for (int i = 0; i < playerCount && !found; i++) {
            if (players[i] == player) {
                players[i] = null;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Jogador não encontrado.");
        }
    }

    public void substitute(Player substitute, Player starter) {
        boolean foundStarter = false, foundSubstitute = false;
        int index = 0;
        if (starter == substitute) {
            System.out.println("O jogador substituto e o titular não podem ser o mesmo jogador.");
        } else {
            while (!foundStarter && !foundSubstitute || index > playerCount) {
                if (players[index] == starter && players[index].isFielded) {
                    players[index].isFielded = false;
                    foundStarter = true;
                }
                if (players[index] == substitute) {
                    players[index].isFielded = true;
                    foundSubstitute = true;
                }
                index++;
            }

            if (foundStarter) {}
        }
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }


}
