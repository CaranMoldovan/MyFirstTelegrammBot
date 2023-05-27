package controlOfWork;

import org.jsoup.select.Evaluator;

import java.time.LocalDate;

public abstract class AbstractUserFabric {
    public AbstactUser createNewUser(String username, long ID){
        AbstactUser  user= new SimpleUser(username,ID);
        return user;
    }

    }

