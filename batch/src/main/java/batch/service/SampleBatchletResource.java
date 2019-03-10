package batch.service;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/sample")
public class SampleBatchletResource {
    @GET
    public String start() {
        JobOperator job = BatchRuntime.getJobOperator();

        System.out.println("[REST] バッチ呼び出し前");
        System.out.println("job:" + job);
        long id = job.start("batch-sample", null);
        System.out.println("[REST] バッチ呼び出し後");

        return "jBatch Start. id = " + id;
    }
}
