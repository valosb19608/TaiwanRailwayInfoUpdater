package dao;

import entity.Station.Stations;
import entity.StationExit.StationExits;
import entity.components.Exit;
import entity.components.ExitMapURL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLWarning;
import java.util.List;

public class StationDao {
    private final Logger logger = LogManager.getLogger();
    private int batchSize = 1000;

    public void mergeStationInfo(List<Stations> stationsList) {
        String sql = "INSERT INTO `taiwan_railway_api_info`.`station`" +
                "(`station_uid`, `station_id`, `station_name_tw`, `station_name_en`, `position_lat`, `position_lon`, `station_phone`, `station_address`, `station_class`, `station_url`)" +
                "VALUES  (?,?,?,?,?,?,?,?,?,?)" +
                "ON DUPLICATE KEY UPDATE `station_id` = ?, `station_name_tw` = ?, `station_name_en` = ?, `station_address` = ?, `station_class` = ?, `station_url` = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnenection();
            preparedStatement = connection.prepareStatement(sql);

            int count = 0;
            for (Stations stationData : stationsList) {
                int slot = 0;
                count++;
                preparedStatement.setString(++slot, stationData.getStationUID());
                preparedStatement.setString(++slot, stationData.getStationID());
                preparedStatement.setString(++slot, stationData.getStationName().getZhTw());
                preparedStatement.setString(++slot, stationData.getStationName().getEn());
                preparedStatement.setDouble(++slot, stationData.getStationPosition().getPositionLat());
                preparedStatement.setDouble(++slot, stationData.getStationPosition().getPositionLon());
                preparedStatement.setString(++slot, stationData.getStationPhone());
                preparedStatement.setString(++slot, stationData.getStationAddress());
                preparedStatement.setInt(++slot, Integer.parseInt(stationData.getStationClass()));
                preparedStatement.setString(++slot, stationData.getStationURL());

                preparedStatement.setString(++slot, stationData.getStationID());
                preparedStatement.setString(++slot, stationData.getStationName().getZhTw());
                preparedStatement.setString(++slot, stationData.getStationName().getEn());
                preparedStatement.setString(++slot, stationData.getStationAddress());
                preparedStatement.setInt(++slot, Integer.parseInt(stationData.getStationClass()));
                preparedStatement.setString(++slot, stationData.getStationURL());

                preparedStatement.addBatch();
                if (count % 1000 == 0)
                    preparedStatement.executeBatch();
            }

            if (count % 1000 != 0)
                preparedStatement.executeBatch();

        } catch (SQLWarning sqlWarning) {
            // nothing to do
        } catch (Exception ex) {
            logger.error("Merge StationInfo ERROR: " + ex, ex);
        } finally {
            ConnectionFactory.close(connection, preparedStatement, null);
        }
    }

    public void mergeStationExit(List<Exit> exitInfoList, String stationId) {
        String sql = "INSERT INTO `taiwan_railway_api_info`.`station_exit`" +
                "(`exit_id`, `station_id`, `exit_name_tw`, `exit_name_en`, `position_lat`, `position_lon`, `location_description`, `stair`, `escalator`, `elevator`)" +
                "VALUES  (?,?,?,?,?,?,?,?,?,?)" +
                "ON DUPLICATE KEY UPDATE `station_id` = ?, `exit_name_tw` = ?, `exit_name_en` = ?, `location_description` = ?, `stair` = ?, `escalator` = ?, `elevator` = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnenection();
            preparedStatement = connection.prepareStatement(sql);

            int count = 0;

            for (Exit exitInfo : exitInfoList) {
                int slot = 0;
                count++;
                preparedStatement.setString(++slot, exitInfo.getExitID());
                preparedStatement.setString(++slot, stationId);
                preparedStatement.setString(++slot, exitInfo.getExitName().getZhTw());
                preparedStatement.setString(++slot, exitInfo.getExitName().getEn());
                preparedStatement.setDouble(++slot, exitInfo.getExitPosition().getPositionLat());
                preparedStatement.setDouble(++slot, exitInfo.getExitPosition().getPositionLon());
                preparedStatement.setString(++slot, exitInfo.getLocationDescription());
                preparedStatement.setBoolean(++slot, exitInfo.getStair());
                preparedStatement.setInt(++slot, exitInfo.getEscalator());
                preparedStatement.setBoolean(++slot, exitInfo.getElevator());

                preparedStatement.setString(++slot, stationId);
                preparedStatement.setString(++slot, exitInfo.getExitName().getZhTw());
                preparedStatement.setString(++slot, exitInfo.getExitName().getEn());
                preparedStatement.setString(++slot, exitInfo.getLocationDescription());
                preparedStatement.setBoolean(++slot, exitInfo.getStair());
                preparedStatement.setInt(++slot, exitInfo.getEscalator());
                preparedStatement.setBoolean(++slot, exitInfo.getElevator());

                preparedStatement.addBatch();
                if (count % 1000 == 0)
                    preparedStatement.executeBatch();
            }

            if (count % 1000 != 0)
                preparedStatement.executeBatch();

        } catch (Exception ex) {
            logger.error("Merge ExitInfo ERROR: " + ex, ex);
        } finally {
            ConnectionFactory.close(connection, preparedStatement, null);
        }
    }

    public void replaceStationExitMap(List<ExitMapURL> mapURLs, String stationId) {
        String deleteSql = "DELETE FROM `taiwan_railway_api_info`.`station_exit_map` WHERE `station_id` = ?";
        String insertSql = "INSERT `taiwan_railway_api_info`.`station_exit_map` (`station_id`, `map_url`) " +
                "VALUES (?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnenection();
            preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setString(1, stationId);
            preparedStatement.execute();

            preparedStatement = connection.prepareStatement(insertSql);

            int count = 0;
            for (ExitMapURL mapURL : mapURLs) {
                preparedStatement.setString(1, stationId);
                preparedStatement.setString(2, mapURL.getMapURL());

                preparedStatement.addBatch();
                if (count % 1000 == 0)
                    preparedStatement.executeBatch();
            }

            if (count % 1000 != 0)
                preparedStatement.executeBatch();

        } catch (Exception ex) {
            logger.error("Replace ExitMapInfo ERROR: " + ex, ex);
        } finally {
            ConnectionFactory.close(connection, preparedStatement, null);
        }
    }
}
