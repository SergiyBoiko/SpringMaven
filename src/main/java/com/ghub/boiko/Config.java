package com.ghub.boiko;

import com.ghub.boiko.carparts.Engine;
import com.ghub.boiko.carparts.Tyres;
import com.ghub.boiko.carparts.Wheel;
import com.ghub.boiko.carparts.typetyres.SummerTyres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.ghub.boiko")
@PropertySource(value = {"classpath:application.properties"})
public class Config {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Car car() {
        return new Car(wheels(), engine());
    }

    @Bean
    public Wheel wheels() {
        return new Wheel(tyres());
    }

    @Bean
    public Tyres tyres() {
        return new SummerTyres();
    }

    @Bean(initMethod = "initialEngineСapacity")
    public Engine engine(){
        return new Engine();
    }
}
