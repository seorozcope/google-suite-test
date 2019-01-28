package co.com.devco.googlesuite.Exceptions;

public class NumberOfVideosNotExpected extends Error {

    public static final String NUMBER_OF_VIDEOS_NOT_EXPECTED="The number of videos listed does not equals or more than expected";

    public NumberOfVideosNotExpected(String message , Throwable cause ){
        super(message, cause);
    }
}
