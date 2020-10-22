package updater;

import com.google.gson.Gson;
import dao.StationDao;
import entity.Station;
import entity.StationExit;
import entity.StationExit.StationExits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.HttpClient;

import java.util.Date;
import java.util.List;

public class StationUpdater {
    private final Logger logger = LogManager.getLogger();

    public void updateStationInfo() {
        String url = "https://ptx.transportdata.tw/MOTC/v3/Rail/TRA/Station?$format=JSON";
        try {
            String apiResult = HttpClient.sendGet(url);
            Station stationInfo = new Gson().fromJson(apiResult, Station.class);
            logger.info("UpdateTime: " + new Date() + " --- API Updated By: " + stationInfo.getSrcUpdateTime());
            StationDao stationDao = new StationDao();
            stationDao.mergeStationInfo(stationInfo.getStations());
        } catch (Exception ex) {
            logger.error("Update Station Info ERROR: " + ex, ex);
        }
    }

    public void updateStationExit() {
        String url = "https://ptx.transportdata.tw/MOTC/v3/Rail/TRA/StationExit?$format=JSON";
        try {
            String apiResult = HttpClient.sendGet(url);
            StationExit stationExit = new Gson().fromJson(apiResult, StationExit.class);
            logger.info("UpdateTime: " + new Date() + " --- API Updated By: " + stationExit.getSrcUpdateTime());
            for(StationExits exit : stationExit.getStationExits()) {
                String stationId = exit.getStationID();
                StationDao stationDao = new StationDao();
                logger.info("Update StationId:" + stationId + ", StationName:" + exit.getStationName().getZhTw());
                stationDao.mergeStationExit(exit.getExits(), stationId);
                stationDao.replaceStationExitMap(exit.getExitMapURLs(), stationId);
            }
        } catch (Exception ex) {
            logger.error("Update Station Exit ERROR: " + ex, ex);
        }
    }
}
