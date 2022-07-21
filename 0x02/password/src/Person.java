import org.junit.platform.commons.util.StringUtils;

public class Person {
    private String password;
    private String username;
    public Person(){

    }

    public static boolean checkUser(String username){
        boolean contains = !username.contains("(?=.*[@#$%^&+=])");
        if (username.length() >= 8 && contains)
            return true;
        return false;
    }

    public static boolean checkPassword(String password){
        boolean containsUppercase = password.contains("[A-Z]");
        boolean containsNumber = password.contains("[0-9]");
        boolean containsCaractere = password.contains("(?=.*[@#$%^&+=])\"");
        if(password.length() >= 8 &&
                containsUppercase &&
                containsNumber &&
                containsCaractere
        )
            return true;
        return  false;
    }
}
