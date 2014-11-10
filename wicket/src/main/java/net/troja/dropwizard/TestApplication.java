package net.troja.dropwizard;

import net.troja.dropwizard.wicket.WicketBundle;
import net.troja.dropwizard.wicket.WicketConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TestApplication extends Application<WicketConfiguration> {

    public static void main(String[] args) throws Exception {
	new TestApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<WicketConfiguration> bootstrap) {
	bootstrap.addBundle(new WicketBundle(WicketApplication.class));
    }

    @Override
    public void run(WicketConfiguration configuration, Environment environment) throws Exception {
    }
}
