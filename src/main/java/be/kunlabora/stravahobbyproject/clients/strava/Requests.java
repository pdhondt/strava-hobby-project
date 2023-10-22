package be.kunlabora.stravahobbyproject.clients.strava;

import org.springframework.web.service.annotation.GetExchange;

public interface Requests {
    @GetExchange()
    Athlete getLoggedInAthlete();
}
