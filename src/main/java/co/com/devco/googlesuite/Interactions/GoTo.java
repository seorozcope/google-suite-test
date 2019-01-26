package co.com.devco.googlesuite.Interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.GOOGLE_APPS;
import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.YOUTUBE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Interaction {

    private Target  theApp;

    public GoTo (Target theApp){
        this.theApp=theApp;
    }
    @Override
    public <T extends Actor> void performAs(T actor, Target theApp) {
        actor.attemptsTo(
                Open.url("https://www.google.com"),
                Click.on(GOOGLE_APPS),
                Click.on(theApp)
        );
    }

    public static Performable theApp (Target theApp){
        return  instrumented(GoTo.class , theApp);
    }
}
