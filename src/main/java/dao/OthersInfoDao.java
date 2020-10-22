package dao;

import entity.News;
import entity.News.Newses;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class OthersInfoDao {
    private final Logger logger = LogManager.getLogger();
    private int batchSize = 1000;

    public void updateNews(List<Newses> newsesList) {
        String sql = "INSERT INTO `taiwan_railway_api_info`.`news` (`news_id`, `language`, `title`, `news_category`, `description`, `news_url`, `attachment_url`, `start_time`, `end_time`, `publish_time`, `update_time`)" +
                     "VALUES (?,?,?,?,?,?,?,?,?,?,?)" +
                     "ON DUPLICATE KEY UPDATE `language` = ?, `title` = ?, `news_category` = ?, `description` = ?, `news_url` = ?, `attachment_url` = ?, `start_time` = ?, `end_time` = ?, `publish_time` = ?, `update_time` = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = ConnectionFactory.getConnenection();
            preparedStatement = connection.prepareStatement(sql);

            int count = 0;
            for(Newses newses : newsesList){
                int slot = 0;
                count++;

                preparedStatement.setString(++slot, newses.getNewsID());
                preparedStatement.setInt(++slot, newses.getLanguage());
                preparedStatement.setString(++slot, newses.getTitle());
                preparedStatement.setInt(++slot, newses.getNewsCategory());
                preparedStatement.setString(++slot, newses.getDescription());
                preparedStatement.setString(++slot, newses.getNewsURL());
                preparedStatement.setString(++slot, newses.getAttachmentURL());
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getStartTime())).getMillis() ));
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getEndTime()).getMillis()) ));
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getPublishTime()).getMillis()) ));
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getUpdateTime()).getMillis()) ));

                preparedStatement.setInt(++slot, newses.getLanguage());
                preparedStatement.setString(++slot, newses.getTitle());
                preparedStatement.setInt(++slot, newses.getNewsCategory());
                preparedStatement.setString(++slot, newses.getDescription());
                preparedStatement.setString(++slot, newses.getNewsURL());
                preparedStatement.setString(++slot, newses.getAttachmentURL());
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getStartTime())).getMillis() ));
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getEndTime()).getMillis()) ));
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getPublishTime()).getMillis()) ));
                preparedStatement.setTimestamp(++slot, new Timestamp( (new DateTime(newses.getUpdateTime()).getMillis()) ));

                preparedStatement.addBatch();

                if (count % 1000 == 0)
                    preparedStatement.executeBatch();
            }

            if (count % 1000 != 0)
                preparedStatement.executeBatch();

        } catch (Exception ex) {
            logger.error("Insert into News ERROR: " + ex, ex);
        } finally {
            ConnectionFactory.close(connection, preparedStatement, null);
        }
    }
}
