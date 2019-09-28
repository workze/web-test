package web.dropwizard;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author wangguize
 * date 2019-09-28
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {

    @GET
    @Timed
    public Integer get() {
        return 1;
    }
}
