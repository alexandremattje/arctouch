package mattje.alexandre.arctouch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class AppConfig {

    @Autowired
    CacheService cacheService;

    @Scheduled(cron = "* * 1 * * *")
    public void resetCaches() {
        cacheService.evictAllCaches();
    }

}
