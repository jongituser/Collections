package lexicon.se.dao.interfaces;

import lexicon.se.model.AppUser;
import lexicon.se.model.Person;

import java.util.Collection;

public interface PersonDao
{
    Person persist(Person person);
    Person findById(int id);
    Person findByEmail(Person email);
    Collection<Person> findAll();
    void remove (Person id);

}
