package indonative.museumid.connection;

import indonative.museumid.utilities.Messages;

/**
 * Created by andika on 12/13/16.
 */

public class InternetConnectionAction {
    String message;

    @InternetConnectionSeeker(isInternetConnected = false)
    void displayFalseResultMessage() {
        //referensi : http://stackoverflow.com/questions/8898590/short-form-for-java-if-statement
        message = ((false) ? Messages.FAILED_CONNECT_INTERNET.getMessage() : "");
    }

    @InternetConnectionSeeker(isInternetConnected = true)
    void displayTrueResultMessage() {

    }
}
