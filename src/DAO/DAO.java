package DAO;

import java.util.List;

public interface DAO<W> {
    W create(W obj);
    W update(W obj);
    boolean delete(int id);
    List<W> getAll();
}
