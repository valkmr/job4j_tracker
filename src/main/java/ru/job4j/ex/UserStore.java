package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User s : users) {
            if (s.getUsername().equals(login)) {
                rsl = s;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User not validated");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Komar Valerii", true)};
        try {
            User user = findUser(users, "Komar Valerii");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("User not valid");
        } catch (UserNotFoundException ex) {
            System.out.println("User not found");
        }

    }
}
