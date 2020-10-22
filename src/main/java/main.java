import com.google.gson.Gson;
import entity.Network;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import updater.OthersInfoUpdater;
import updater.StationUpdater;
import updater.TrainUpdater;
import utils.HttpClient;

public class main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        if (args.length != 1) {
            logger.warn("Number of wrong parameters");
            return;
        }
        StationUpdater stationUpdater;
        TrainUpdater trainUpdater;
        OthersInfoUpdater othersInfoUpdater;

        switch (args[0]) {
            case "updateNetworkInfo":
                logger.info("Update Taiwan Railway Network Information Data Start ...");
                break;
            case "updateStationInfo":
                logger.info("Update Taiwan Railway Station Information Data Start ...");
                stationUpdater = new StationUpdater();
                stationUpdater.updateStationInfo();
                break;
            case "updateStationExit":
                logger.info("Update Taiwan Railway Station Exit Data Start ...");
                stationUpdater = new StationUpdater();
                stationUpdater.updateStationExit();
                break;
            case "updateTodayTrainsInfo":
                logger.info("Update Taiwan Railway Today Trains info Data Start ...");
                trainUpdater = new TrainUpdater();
                trainUpdater.updateTrainsInfo(1, "https://ptx.transportdata.tw/MOTC/v3/Rail/TRA/GeneralTrainTimetable?$top=30&$format=JSON");
                break;
            case "updateGeneralTrainsInfo":
                logger.info("Update Taiwan Railway General Trains info Data Start ...");
                trainUpdater = new TrainUpdater();
                trainUpdater.updateTrainsInfo(2, "https://ptx.transportdata.tw/MOTC/v3/Rail/TRA/GeneralTrainTimetable?$top=30&$format=JSON");
                break;
            case "updateSpecificTrainsInfo":
                logger.info("Update Taiwan Railway Specific Trains info Data Start ...");
                trainUpdater = new TrainUpdater();
                trainUpdater.updateTrainsInfo(3, "https://ptx.transportdata.tw/MOTC/v3/Rail/TRA/SpecificTrainTimetable?$top=30&$format=JSON");
                break;
            case "emptyTrainTimetable":
                trainUpdater = new TrainUpdater();
                trainUpdater.emptyTrainTimetable();
                break;
            case "updateNews":
                logger.info("Update Taiwan Railway News info Data Start ...");
                othersInfoUpdater = new OthersInfoUpdater();
                othersInfoUpdater.updateNews();
        }
    }
}
