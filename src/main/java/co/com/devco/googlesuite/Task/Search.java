package co.com.devco.googlesuite.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;


import static co.com.devco.googlesuite.userinterfaces.YoutubePage.SEARCH;
import static co.com.devco.googlesuite.userinterfaces.YoutubePage.SEARCH_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Search implements Task {

    private String video;

    public Search(String video){
        this.video=video;
    }

    @Step("the actor searchs the video called #video")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(video).into(SEARCH_INPUT),
                Click.on(SEARCH)
        );
    }

    public static Performable the(String video){
        return  instrumented(Search.class, video);
    }
}
