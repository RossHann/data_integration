package manager;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.slf4j.impl.StaticLoggerBinder;

public class KettleManager {

    /**
     * @param jobFile
     * @throws KettleException
     *
     * */
    public static void runJob(String jobFile) throws KettleException{

        KettleEnvironment.init();
        JobMeta jm = new JobMeta(jobFile, null);
        Job job = new Job(null, jm);

        job.setVariable("dataNow", "2021-04-21");
        job.start();
        job.waitUntilFinished();

    }

    /**
     * @param transFile
     * @throws KettleException
     *
     * */
    public static void runTrans(String transFile) throws KettleException{

        System.out.println("runTrans run ...");

        KettleEnvironment.init();
        TransMeta tm = new TransMeta(transFile);
        Trans trans = new Trans(tm);

        trans.setVariable("dataNow", "2021-04-21");
        trans.execute(null);
        trans.waitUntilFinished();

        System.out.println("runTrans end ...");

    }

}
