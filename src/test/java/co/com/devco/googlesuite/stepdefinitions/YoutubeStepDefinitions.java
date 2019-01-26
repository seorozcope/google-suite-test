package co.com.devco.googlesuite.stepdefinitions;

import co.com.devco.googlesuite.Exceptions.NumberOfVideosNotExpected;
import co.com.devco.googlesuite.Interactions.GoTo;
import co.com.devco.googlesuite.Questions.TheListedVideos;
import co.com.devco.googlesuite.Task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.YOUTUBE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class YoutubeStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) wants to watch a video$")
    public void thatMikeWantsToWatchAVideo(String name) throws Exception {
        theActorCalled(name).attemptsTo(GoTo.theApp(YOUTUBE));
    }

    @When("^he searches the video (.*)$")
    public void heSearchesTheVideoBeethovenSymphonyHubbleImages(String video) throws Exception {
        theActorInTheSpotlight().attemptsTo(Search.the(video));
    }

    @Then("^he should see at least (\\d+) video listed$")
    public void heShouldSeeAtLeastVideoListed(int theNumberOfVideos) throws Exception {
        theActorInTheSpotlight().should(seeThat(TheListedVideos.are(theNumberOfVideos))
                .orComplainWith(NumberOfVideosNotExpected.class));
    }

}
