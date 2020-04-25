package DAO;

import java.util.List;

import Entity.Card;
import Entity.DAO;

public class CardDAO implements DAO<Card>{
    @Override
    public Card create(Card obj) {
        return null;
    }

    @Override
    public Card update(Card obj) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Card> getAll() {
        return null;
    }
}
