package lexicon.se.dao.collections;

import lexicon.se.dao.interfaces.PersonDao;
import lexicon.se.model.AppUser;
import lexicon.se.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class PersonDaoCollection implements PersonDao
{

    private List<Person> persons = new ArrayList<>();

    public PersonDaoCollection (){
        this.persons = new ArrayList<>();
    }

    @Override
    public Person persist(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id)
    {
        for (Person person : persons)
        {
            if (person.getId() == id)
            {
                return person;
            }
        }
        return null;
    }
    @Override
    public Person findByEmail(Person email)
    {
        for (Person person : persons)
        {
            if (person.getEmail().equalsIgnoreCase(String.valueOf(email)))
            {
               return person;
            }
        }
           return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(persons);
    }

    @Override
    public void remove(Person id) {
        persons.remove(id);

      }

}
