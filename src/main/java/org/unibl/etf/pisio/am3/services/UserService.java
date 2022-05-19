package org.unibl.etf.pisio.am3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unibl.etf.pisio.am3.repositories.UserDAO;

import java.util.List;
import org.unibl.etf.pisio.am3.models.User;

@Service
public class UserService {
    //slabije se koristi zbog java refleskije
   //@Autowired//sada spring na ostnovu ove anotacije zna da treba injectovati userdao u nasu servisnu klasu

    private final UserDAO userDao;
    //najcesce se koristi constructor injection , dok se izbjagava koristenje drugih
    //injectiona
    public UserService(UserDAO userDao){
        this.userDao = userDao;
    }

    public List<User> getAll(){
        return userDao.getAll();
    }
}
