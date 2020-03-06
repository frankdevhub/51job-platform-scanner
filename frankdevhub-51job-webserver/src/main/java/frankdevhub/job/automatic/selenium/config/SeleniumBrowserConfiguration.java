package frankdevhub.job.automatic.selenium.config;

import frankdevhub.job.automatic.core.exception.BusinessException;

import java.io.IOException;

public interface SeleniumBrowserConfiguration {
    String setSeleniumCacheDirectoryName(String threadName);

    String getDefaultBrowserCachePath();

    String searchSystemBrowserCachePath();

    Boolean getCacheDirectoryLockedStatus() throws BusinessException, IOException;

    String setSeleniumBrowserCache(String browserCachePath, String cacheFileName) throws IOException, BusinessException;

    ChromeConfiguration deleteHistorySeleniumBrowserCache() throws IOException;

    void synchronizeSeleniumBrowserCache();
}
