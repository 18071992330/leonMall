package org.leon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {
    @Value("${paymentServerHost}")
    public String paymentServerHost;

}
