package com.epam;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.po.JdiSite;
import com.epam.utils.MyConfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Dmitry_Lebedev1 on 6/8/2018.
 */
public class BaseTest extends TestNGBase {
    MyConfig config;

    @BeforeSuite
    @SuppressWarnings("unchecked")
    public void beforeSuite() {
//        WebSettings.useDriver(() -> {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--headless");
//            capabilities.setBrowserName("chrome");
//            capabilities.setVersion("62.0");
//            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//
//            RemoteWebDriver driver = null;
//            try {
//                driver = new RemoteWebDriver(
//                        URI.create("http://localhost:4444/wd/hub").toURL(),
//                        capabilities
//                );
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//
//            return driver;
//        });
        config = ConfigFactory.create(MyConfig.class);

        WebSite.init(JdiSite.class);
    }
}
