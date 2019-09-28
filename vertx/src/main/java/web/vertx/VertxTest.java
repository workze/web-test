package web.vertx;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;

/**
 * @author wangguize
 * date 2019-09-28
 */
public class VertxTest {
    public static void main(String[] args) {
        VertxOptions vertxOptions = new VertxOptions();
        Vertx vertx = Vertx.vertx(vertxOptions);

        DeploymentOptions deploymentOptions = new DeploymentOptions().setInstances(4);
        vertx.deployVerticle(MyVerticle.class.getName(), deploymentOptions);
    }
}
