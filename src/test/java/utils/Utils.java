package utils;

public class Utils {

    public static String getBaseURL(){
        return "http://automationpractice.com/";
    }
    public static String getLoginURL(){
        return getBaseURL().concat("index.php?controller=authentication&back=my-account");
    }
    public static String getMyAccountURL(){
        return getBaseURL().concat("index.php?controller=my-account");
    }
    public static String getLoginEmail(){ return "testeLeonardo@CWI.br";}
    public static String getLoginPassword(){ return "abc123";}

}
