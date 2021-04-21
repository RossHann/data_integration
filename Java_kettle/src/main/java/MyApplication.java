import jobs.FirstJob;
import org.quartz.*;
import org.quartz.core.QuartzScheduler;
import org.quartz.core.QuartzSchedulerResources;
import org.quartz.core.SchedulerSignalerImpl;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.JobExecutionContextImpl;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.quartz.spi.TriggerFiredBundle;

import java.util.Date;

public class MyApplication {
    public static void main(String[] args){
        FirstJob firstJob = new FirstJob();
        try {
            firstJob.execute(new JobExecutionContext() {
                @Override
                public Scheduler getScheduler() {
                    return null;
                }

                @Override
                public Trigger getTrigger() {
                    return null;
                }

                @Override
                public Calendar getCalendar() {
                    return null;
                }

                @Override
                public boolean isRecovering() {
                    return false;
                }

                @Override
                public TriggerKey getRecoveringTriggerKey() throws IllegalStateException {
                    return null;
                }

                @Override
                public int getRefireCount() {
                    return 0;
                }

                @Override
                public JobDataMap getMergedJobDataMap() {
                    return null;
                }

                @Override
                public JobDetail getJobDetail() {
                    return null;
                }

                @Override
                public Job getJobInstance() {
                    return null;
                }

                @Override
                public Date getFireTime() {
                    return null;
                }

                @Override
                public Date getScheduledFireTime() {
                    return null;
                }

                @Override
                public Date getPreviousFireTime() {
                    return null;
                }

                @Override
                public Date getNextFireTime() {
                    return null;
                }

                @Override
                public String getFireInstanceId() {
                    return null;
                }

                @Override
                public Object getResult() {
                    return null;
                }

                @Override
                public void setResult(Object result) {

                }

                @Override
                public long getJobRunTime() {
                    return 0;
                }

                @Override
                public void put(Object key, Object value) {

                }

                @Override
                public Object get(Object key) {
                    return null;
                }
            });
        } catch (JobExecutionException e) {
            e.printStackTrace();
        }
    }
}
