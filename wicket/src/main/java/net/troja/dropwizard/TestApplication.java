package net.troja.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.apache.wicket.protocol.http.WicketFilter;

public class TestApplication extends Application<WicketConfiguration> {

    public static void main(String[] args) throws Exception {
        new TestApplication().run(args);
    }
    
    @Override
    public void initialize(Bootstrap<WicketConfiguration> bootstrap) {
    }

    @Override
    public void run(WicketConfiguration configuration, Environment environment) throws Exception {
	WicketFilter filter = new WicketFilter(new WicketApplication());
	filter.setFilterPath("/");
	environment.servlets().addFilter("wicket", filter);
	environment.jersey().disable();
    }

}
