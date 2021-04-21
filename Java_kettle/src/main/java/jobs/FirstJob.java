package jobs;

import manager.KettleManager;
import org.pentaho.di.core.exception.KettleException;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.impl.JobExecutionContextImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class FirstJob implements Job {

    private static Logger _log = LoggerFactory.getLogger(FirstJob.class);

    public FirstJob(){}

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            _log.error("Time to execution: " + new Date());
            String transFile = "/Users/russellhan/Downloads/etl.ktr";
            KettleManager.runTrans(transFile);
        } catch (KettleException e) {
            e.printStackTrace();
        }
    }
}
