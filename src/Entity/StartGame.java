package Entity;

public class StartGame {
    public static void main(String[] args) {
        Player player=new Player("nemo");
        Player player7=new Player("nemo7");
        Player player2=new Player("nemo2");
        Player player3=new Player("nemo3");

        Game game=player.createGame(6);
        player.createInvite();
        player7.toJoin(game);
        player2.toJoin(game);
        player3.toJoin(game);
        game.stateGame=StateGame.ITERATE;
        while(game.stateGame.equals(StateGame.ITERATE)){
            game.whoIs().nextStep(3,"Небо");
        }

    }
}
