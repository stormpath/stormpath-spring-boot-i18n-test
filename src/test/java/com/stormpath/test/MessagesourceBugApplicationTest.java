package com.stormpath.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Locale;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class MessagesourceBugApplicationTest {

    @Autowired
    private MessageSource messageSource;

	@Test
	public void loadsMessage() {
	    Assert.assertEquals("Login", messageSource.getMessage("stormpath.web.login.form.title", null, Locale.getDefault()));
	}

}
