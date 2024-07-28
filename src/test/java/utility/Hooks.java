package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BrowserDriver{

    @Before
    public void setUp(){
        new BrowserDriver();
    }

    @After
    public void tearDown(){
        BrowserDriver.close();
    }
}
