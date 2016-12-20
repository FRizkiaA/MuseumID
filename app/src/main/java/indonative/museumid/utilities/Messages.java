package indonative.museumid.utilities;

/**
 * Created by andika on 12/12/16.
 */

public enum Messages {
    FAILED_GET_RESPONSE,
    FAILED_CONNECT_INTERNET,
    NO_MAP_IN_GOOGLE_MAP,
    NO_VIDEO,
    FAILED_LOGIN;

    public String getMessage(){
        switch(this){
            case FAILED_GET_RESPONSE:
                return "Can't get response. Check your internet connection";
            case FAILED_CONNECT_INTERNET:
                return "Can't connect internet. Check your internet connection";
            case NO_MAP_IN_GOOGLE_MAP:
                return "The map can't be reached by Google Map";
            case NO_VIDEO:
                return "No video content";
            case FAILED_LOGIN:
                return "Failed to login. Check your internet connection";
            default:
                throw new AssertionError("Error.......");
        }
    }

}
