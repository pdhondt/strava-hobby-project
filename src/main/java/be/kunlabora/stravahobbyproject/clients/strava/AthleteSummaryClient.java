package be.kunlabora.stravahobbyproject.clients.strava;

import be.kunlabora.stravahobbyproject.dto.AthleteSummary;
import org.springframework.stereotype.Component;

@Component
public class AthleteSummaryClient {
    private final Requests requests;
    public AthleteSummaryClient(Requests requests) {
        this.requests = requests;
    }
    public AthleteSummary getLoggedInAthlete() {
        var response = requests.getLoggedInAthlete();
        return new AthleteSummary(
                response.getId(),
                response.getUsername(),
                response.getFirstname(),
                response.getLastname());
    }
}
