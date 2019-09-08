package mattje.alexandre.arctouch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
public class CacheService {

    @Autowired
    private CacheManager simpleCacheManager;

    public void evictAllCaches() {
        simpleCacheManager.getCacheNames().stream()
                .forEach(cacheName -> simpleCacheManager.getCache(cacheName).clear());
    }

}
