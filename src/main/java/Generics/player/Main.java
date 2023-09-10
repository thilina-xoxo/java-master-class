package Generics.player;

public class Main {
    public static void main(String[] args) {

        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer tim = new BaseBallPlayer("Tim");
        SoccerPlayer sam = new SoccerPlayer("Sam");

        Team<FootBallPlayer> adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        int no = adelaideCrows.numPlayers();
        System.out.println(no);

    }

}
