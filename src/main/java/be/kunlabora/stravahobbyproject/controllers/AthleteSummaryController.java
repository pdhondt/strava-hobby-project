package be.kunlabora.stravahobbyproject.controllers;

import be.kunlabora.stravahobbyproject.clients.strava.AthleteSummaryClient;
import be.kunlabora.stravahobbyproject.dto.AthleteSummary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("athleteSummary")
public class AthleteSummaryController {
    private final AthleteSummaryClient athleteSummaryClient;
    AthleteSummaryController(AthleteSummaryClient athleteSummaryClient) {
        this.athleteSummaryClient = athleteSummaryClient;
    }
    @GetMapping()
    AthleteSummary getLoggedInAthlete() {
        return athleteSummaryClient.getLoggedInAthlete();
    }
}
