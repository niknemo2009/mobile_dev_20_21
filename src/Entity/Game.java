package Entity;

import java.util.*;

public class Game {
    String idGame;
    List<Player> players=new ArrayList<>();
    List<Card>   deck=new ArrayList<>();
    int nextPlayer;
    int idOwnerGame;
    final int countCardsForOnePlayer;
    List<Card> cardOnTable=new ArrayList<>();
    StateGame stateGame;
    static Map<Game,Integer> invites=new HashMap<>();

    public Game(int countCardsForPlayer) {
        this.countCardsForOnePlayer = countCardsForPlayer;
    }

    private void initialize(){

    }

    boolean addPlayer(Player gamer){
        return  true;
    }

 Player whoIs(){
        return null;
}
void viewCardOnTable(){

}
}

enum  StateGame{
    BEGIN,STARTED,ITERATE
}