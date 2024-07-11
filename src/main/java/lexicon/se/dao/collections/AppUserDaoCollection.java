package lexicon.se.dao.collections;

import lexicon.se.dao.interfaces.AppUserDao;
import lexicon.se.model.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDaoCollection implements AppUserDao {

    private ArrayList<AppUser> users = new ArrayList<>();

    @Override
    public AppUser persist(AppUser user) {
        users.add(user);
        return user;
    }

    @Override
    public AppUser findByUsername(String username){
        for (AppUser user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }


    @Override
    public Collection<AppUser> findAll() {

        return new ArrayList<>(users);
    }

    @Override
    public void removeUser(AppUser username) {

        users.remove(username);
    }
}
