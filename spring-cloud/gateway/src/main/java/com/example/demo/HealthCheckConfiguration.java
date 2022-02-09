package com.example.demo;

import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.ReactiveHealthIndicator;
import org.springframework.boot.actuate.health.StatusAggregator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Configuration
public class HealthCheckConfiguration {
	private static final Logger LOG = LoggerFactory.getLogger(HealthCheckConfiguration.class);
	final WebClient.Builder builder;
	WebClient client;
	final StatusAggregator aggregator;

	public HealthCheckConfiguration(WebClient.Builder wcbuilder, StatusAggregator statusAggregator) {
		this.builder = wcbuilder;
		this.aggregator = statusAggregator;
	}

	/*
	 * @Bean ReactiveHealthIndicator healthcheckMicroservices() {
	 * 
	 * ReactiveHealthIndicatorRegistry registry = new
	 * DefaultReactiveHealthIndicatorRegistry(new LinkedHashMap<>());
	 * 
	 * registry.register("product", () -> getHealth("http://product"));
	 * registry.register("recommendation", () ->
	 * getHealth("http://recommendation")); registry.register("review", () ->
	 * getHealth("http://review")); registry.register("product-composite", () ->
	 * getHealth("http://product-composite"));
	 * 
	 * return new CompositeReactiveHealthIndicator(healthAggregator, registry); }
	 * 
	 * private Mono<Health> getHealth(String url) { url += "/actuator/health";
	 * LOG.debug("Will call the Health API on URL: {}", url); return
	 * getWebClient().get().uri(url).retrieve().bodyToMono(String.class).map(s ->
	 * new Health.Builder().up().build()) .onErrorResume(ex -> Mono.just(new
	 * Health.Builder().down(ex).build())).log(); }
	 * 
	 * private WebClient getWebClient() { if (client == null) { client =
	 * builder.build(); } return client; }
	 */

}
