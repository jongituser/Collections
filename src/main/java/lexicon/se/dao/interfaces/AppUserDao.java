package lexicon.se.dao.interfaces;

import lexicon.se.model.AppUser;

import java.util.Collection;

public interface AppUserDao {

    AppUser persist(AppUser user);

    AppUser findByUsername(String username);

    Collection<AppUser> findAll();

    void removeUser(AppUser username);

}
