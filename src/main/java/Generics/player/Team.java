package Generics.player;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name; // todo - final keyword
    int played = 0;
    int won = 0;
    int loss = 0;
    int tied = 0;

    private ArrayList<T> members;

    public Team(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(( player.getName()+" alreday in the team"));
            return false;
        } else {
            members.add(player);
            System.out.println("Member is added " + (player.getName()));
            return true;
        }
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore>theirScore){
            this.won++;
        } else if(ourScore==theirScore) {
            this.tied++;
        }else {
            loss++;
        }
        played++;

        if(opponent!=null) {
            this.matchResult(null,theirScore,ourScore);
        }
    }
}
