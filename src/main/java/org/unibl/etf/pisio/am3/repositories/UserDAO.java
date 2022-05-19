package org.unibl.etf.pisio.am3.repositories;

import org.springframework.stereotype.Repository;
import org.unibl.etf.pisio.am3.models.User;

import java.util.List;
import java.util.Arrays;

//servis anotacija
//koristi se samo da oynaci nklasu da pripada servisnom sloju
//repoyitorijumi sluze za dobavljanje podataka i smjestanje u bazu
//ili neki drugi skladiste
@Repository
public class UserDAO {

    public List<User> getAll(){
       // return Arrays.asList(new User("b","d"),new User("c","d") ,new User("b","d"));
       return Arrays.asList(new User("Bojan","Janjic"), new User("Dejan","Milojica"), new User());
    }
}
