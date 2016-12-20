package indonative.museumid.utilities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andika on 12/12/16.
 */

public class UserUtils {
    
    private static HashMap<String, String> SEARCHED_KEYWORD = new HashMap<String, String>();
    private static HashMap USER_ACCOUNT = new HashMap();
    //Messages.SUCCESS.getMessage()
    public static void SET_USER_ACCOUNT(int ID, String username) {
        USER_ACCOUNT.put("ID", ID);
        USER_ACCOUNT.put("username", username);
        Messages.FAILED_CONNECT_INTERNET.getMessage();
    }

    public static HashMap GET_USER_ACCOUNT() {
        return USER_ACCOUNT;
    }

    public static void SET_SEARCHED_KEYWORD(String keyword) {
        SEARCHED_KEYWORD.put("keyword", keyword);
    }

    public static HashMap<String, String> GET_SEARCHED_KEYWORD() {
        return SEARCHED_KEYWORD;
    }



}
