package ua.laposhko.part2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@ImportResource("classpath:/spring-config.xml")
public class CDPlayerConfig {

    @Bean
    public CompactDisk anotherDisk() {
        return new SimpleCompactDisk();
    }

    @Bean
    public CDPlayer anotherCDPlayer(@Qualifier("anotherDisk") CompactDisk compactDisk) {
        return new CDPlayer(compactDisk);
    }

}
