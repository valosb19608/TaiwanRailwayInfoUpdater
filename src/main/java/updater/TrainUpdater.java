package updater;

import com.google.gson.Gson;
import dao.TrainsDao;
import entity.GeneralTrainTimetable;
import entity.GeneralTrainTimetable.TrainTimetables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.HttpClient;

public class TrainUpdater {
    private final Logger logger = LogManager.getLogger();

    public void updateTrainsInfo(int category, String url) {
        try {
            String apiResult = HttpClient.sendGet(url);
            GeneralTrainTimetable trainsInfo = new Gson().fromJson(apiResult, GeneralTrainTimetable.class);
            TrainsDao trainsDao = new TrainsDao();

            for (TrainTimetables timetables : trainsInfo.getTrainTimetables()) {
                trainsDao.mergeTrainsInfo(timetables.getTrainInfo(), category);
                trainsDao.mergeTrainTimetable(timetables.getStopTimes(), timetables.getTrainInfo().getTrainNo());
            }
        } catch (Exception ex) {
            logger.error("Update Today Trains Info ERROR: " + ex, ex);
        }
    }

    public void emptyTrainTimetable() {
        TrainsDao trainsDao = new TrainsDao();
        trainsDao.emptyTrainTimetable();
    }
}
