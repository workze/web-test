package web.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpServerOptions;

/**
 * @author wangguize
 * date 2019-09-28
 */
public class MyVerticle extends AbstractVerticle {

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        HttpServerOptions httpServerOptions = new HttpServerOptions();
        vertx.createHttpServer(httpServerOptions).requestHandler(httpServerRequest -> {
            httpServerRequest.response().end("1");
        }).listen(8080);
    }

}
