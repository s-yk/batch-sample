package batch.service;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/jbatch")
public class BatchApplication extends ResourceConfig {
    public BatchApplication() {
        packages("batch.service");
    }
}
