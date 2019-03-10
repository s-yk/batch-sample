package batch.batchlet;

import javax.batch.api.Batchlet;

public class SampleBatchlet implements Batchlet {
    @Override
    public String process() throws Exception {
        System.out.println("start:" + SampleBatchlet.class.getName());
        return null;
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop:" + SampleBatchlet.class.getName());
    }
}
