package dao;

import entity.GeneralTrainTimetable.TrainTimetables;
import entity.components.StopTime;
import entity.components.TrainInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class TrainsDao {
    private final Logger logger = LogManager.getLogger();
    private int batchSize = 1000;

    public void mergeTrainsInfo(TrainInfo trainInfo, int category) {
        String sql = "INSERT INTO `taiwan_railway_api_info`.`train_info` (`train_no`, `route_id`, `direction`, `train_type_id`, `train_type_name`, `trip_head_sign`, `starting_station_id`, `ending_station_id`, `trip_line`, `wheel_chair_flag`, `package_service_flag`, `dining_flag`, `breast_feed_flag`, `bike_flag`, `car_flag`, `daily_flag`, `extra_train_flag`, `note`, `category`) " +
                     "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" +
                     "ON DUPLICATE KEY UPDATE `route_id` = ?, `direction` = ?, `train_type_id` = ?, `train_type_name` = ?, `trip_head_sign` = ?, `starting_station_id` = ?, `ending_station_id` = ?, `trip_line` = ?, `wheel_chair_flag` = ?, `package_service_flag` = ?, `dining_flag` = ?, `breast_feed_flag` = ?, `bike_flag` = ?, `car_flag` = ?, `daily_flag` = ?, `extra_train_flag` = ?, `note` = ?, `category` = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.getConnenection();
            preparedStatement = connection.prepareStatement(sql);

            int slot = 0;
            preparedStatement.setString(++slot, trainInfo.getTrainNo());
            preparedStatement.setString(++slot, trainInfo.getRouteID());
            preparedStatement.setInt(++slot, trainInfo.getDirection());
            preparedStatement.setString(++slot, trainInfo.getTrainTypeID());
            preparedStatement.setString(++slot, trainInfo.getTrainTypeName().getZhTw());
            preparedStatement.setString(++slot, trainInfo.getTripHeadSign());
            preparedStatement.setString(++slot, trainInfo.getStartingStationID());
            preparedStatement.setString(++slot, trainInfo.getEndingStationID());
            preparedStatement.setInt(++slot, trainInfo.getTripLine());
            preparedStatement.setInt(++slot, trainInfo.getWheelChairFlag());
            preparedStatement.setInt(++slot, trainInfo.getPackageServiceFlag());
            preparedStatement.setInt(++slot, trainInfo.getDiningFlag());
            preparedStatement.setInt(++slot, trainInfo.getBreastFeedFlag());
            preparedStatement.setInt(++slot, trainInfo.getBikeFlag());
            preparedStatement.setInt(++slot, trainInfo.getCarFlag());
            preparedStatement.setInt(++slot, trainInfo.getDailyFlag());
            preparedStatement.setInt(++slot, trainInfo.getExtraTrainFlag());
            preparedStatement.setString(++slot, trainInfo.getNote());
            preparedStatement.setInt(++slot, category);

            preparedStatement.setString(++slot, trainInfo.getRouteID());
            preparedStatement.setInt(++slot, trainInfo.getDirection());
            preparedStatement.setString(++slot, trainInfo.getTrainTypeID());
            preparedStatement.setString(++slot, trainInfo.getTrainTypeName().getZhTw());
            preparedStatement.setString(++slot, trainInfo.getTripHeadSign());
            preparedStatement.setString(++slot, trainInfo.getStartingStationID());
            preparedStatement.setString(++slot, trainInfo.getEndingStationID());
            preparedStatement.setInt(++slot, trainInfo.getTripLine());
            preparedStatement.setInt(++slot, trainInfo.getWheelChairFlag());
            preparedStatement.setInt(++slot, trainInfo.getPackageServiceFlag());
            preparedStatement.setInt(++slot, trainInfo.getDiningFlag());
            preparedStatement.setInt(++slot, trainInfo.getBreastFeedFlag());
            preparedStatement.setInt(++slot, trainInfo.getBikeFlag());
            preparedStatement.setInt(++slot, trainInfo.getCarFlag());
            preparedStatement.setInt(++slot, trainInfo.getDailyFlag());
            preparedStatement.setInt(++slot, trainInfo.getExtraTrainFlag());
            preparedStatement.setString(++slot, trainInfo.getNote());
            preparedStatement.setInt(++slot, category);

            preparedStatement.execute();

        } catch (Exception ex) {
            logger.error("Merge Trains Info ERROR " + ex, ex);
        } finally {
            ConnectionFactory.close(connection, preparedStatement, null);
        }
    }

    public void mergeTrainTimetable(List<StopTime> stopTimeList, String trainNo) {
        String sql = "INSERT INTO `taiwan_railway_api_info`.`train_timetable` (`train_id`, `stop_sequence`, `station_id`, `arrival_time`, `departure_time`)" +
                     "VALUES (?,?,?,?,?)" +
                     "ON DUPLICATE KEY UPDATE `station_id` = ?, `arrival_time` = ?, `departure_time` = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionFactory.getConnenection();
            preparedStatement = connection.prepareStatement(sql);

            for(StopTime stopTime : stopTimeList) {
                int slot = 0;
                preparedStatement.setString(++slot, trainNo);
                preparedStatement.setInt(++slot, stopTime.getStopSequence());
                preparedStatement.setString(++slot, stopTime.getStationID());
                preparedStatement.setString(++slot, stopTime.getArrivalTime());
                preparedStatement.setString(++slot, stopTime.getDepartureTime());

                preparedStatement.setString(++slot, stopTime.getStationID());
                preparedStatement.setString(++slot, stopTime.getArrivalTime());
                preparedStatement.setString(++slot, stopTime.getDepartureTime());
                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();

        } catch (Exception ex) {
            logger.error("Merge Timetable info ERROR " + ex, ex);
        } finally {
            ConnectionFactory.close(connection, preparedStatement, null);
        }
    }

    public void emptyTrainTimetable() {
        String sql = "TRUNCATE TABLE `taiwan_railway_api_info`.`train_timetable`";
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionFactory.getConnenection();
            statement = connection.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            logger.error("Empty Timetable ERROR: " + ex, ex);
        } finally {
            ConnectionFactory.close(connection, statement, null);
        }
    }
}
