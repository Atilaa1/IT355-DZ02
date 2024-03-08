package org.example;

import org.example.services.JednakostranicniTrougaoServis;
import org.example.services.KrugServis;
import org.example.services.KvadratServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.example.services"})
public class AppConfig {
    @Autowired
    private KrugServis krugServis;
    @Autowired
    private KvadratServis kvadratServis;
    @Autowired
    private JednakostranicniTrougaoServis jednakostranicniTrougaoServis;

    @Bean
    public KrugServis getKrugServis() {
        return krugServis;
    }
    @Bean
    public KvadratServis getKvadratServis(){

        return kvadratServis;
    }
    @Bean
    public JednakostranicniTrougaoServis getJednakostranicniTrougaoServis(){

        return jednakostranicniTrougaoServis;
    }
}
