package co.com.devco.googlesuite.Exceptions;

public class NumberOfVideosNotExpected extends Error {

    public NumberOfVideosNotExpected(){
        super("The number of videos listed does not equals as expected");
    }
}
