package co.com.devco.googlesuite.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.googlesuite.userinterfaces.YoutubeResultsPage.LIST_OF_VIDEOS;

public class TheListedVideos implements Question<Boolean> {

    private int theNumberOfVideos;

    public TheListedVideos (int theNumberOfVideos){
        this.theNumberOfVideos = theNumberOfVideos;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return LIST_OF_VIDEOS.resolveAllFor(actor).size()>=theNumberOfVideos;
    }

    public static Question<Boolean> are(int theNumberOfVideos) {
        return new TheListedVideos(theNumberOfVideos);
    }

}
