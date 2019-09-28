package web.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * @author wangguize
 * date 2019-09-28
 */
public class DropwizardTest extends Application<Config> {
    @Override
    public void run(Config config, Environment environment) throws Exception {
        Resource resource = new Resource();
        environment.jersey().register(resource);
    }

    public static void main(String[] args) throws Exception{
        new DropwizardTest().run(args);
    }
}
