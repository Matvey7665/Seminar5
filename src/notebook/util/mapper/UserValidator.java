package notebook.util.mapper;

import notebook.model.User;

public class UserValidator {
    public  boolean valid(User user){
        user = prepair(user);
        return !user.getFirstName().isEmpty() &&!user.getLastName().isEmpty();
    }
    private User prepair(User user){
        user.setFirstName(user.getFirstName().replace(" ",""));
        user.setLastName(user.getLastName().replace(" ",""));
        return  user;
    }
}
