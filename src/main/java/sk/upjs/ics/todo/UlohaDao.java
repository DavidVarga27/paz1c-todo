package sk.upjs.ics.todo;

import java.util.List;

public interface UlohaDao {
    public void pridat(Uloha uloha);
    public void odstranit(Uloha uloha);
    public List<Uloha> dajVsetky();
}
