package org.itstep.blackjack;

import org.itstep.App;

public class Game {
    private final Player player;
    private final Player dealer;
    private final Deck deck;
    private int bet;
    private final Hand hand;


    public Game(Player player, Player dealer, Deck deck, int value, Hand hand) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
        this.hand = hand;
    }

    public void hit() {
        player.takeCard(deck.getOne());
    }

    public Player getPlayer() {
        return player;
    }

    public Player getDealer() {
        return dealer;
    }

    public void stand() { //стоп
        if (hand.getValue() <= 18){ //после стоп начинает брать карты диллер, до тех пор пока
            dealer.takeCard(deck.getOne()); //не набёрет 18 очков
        }
    }

    public void setBet(int amount) throws NoMoneyEnoungh { //ставка
        if (amount > bet){
            throw new NoMoneyEnoungh("Не достаточно средств для ставки!");
        }
        bet -=amount;
    }

    public void play() { //начать игру
        App.launch();
    }
}
