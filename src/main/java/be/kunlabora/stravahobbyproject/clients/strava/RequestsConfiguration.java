package be.kunlabora.stravahobbyproject.clients.strava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class RequestsConfiguration {

    @Value("${api.access.token}")
    private String apiAccessToken;
    @Bean
    Requests requests(WebClient.Builder builder) throws Exception {
        var client =
                builder
                        .baseUrl("https://www.strava.com/api/v3/athlete")
                        .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + apiAccessToken)
                        .build();
        var adapter = WebClientAdapter.forClient(client);
        var factory = HttpServiceProxyFactory.builder(adapter).build();
        return factory.createClient(Requests.class);
    }
}
