package updater;

import com.google.gson.Gson;
import dao.OthersInfoDao;
import entity.News;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.HttpClient;

public class OthersInfoUpdater {
    private final Logger logger = LogManager.getLogger();

    public void updateNews() {
        String url = "https://ptx.transportdata.tw/MOTC/v3/Rail/TRA/News?$top=30&$format=JSON";

        try {
            String apiResult = HttpClient.sendGet(url);
            News news = new Gson().fromJson(apiResult, News.class);
            OthersInfoDao othersInfoDao = new OthersInfoDao();
            othersInfoDao.updateNews(news.getNewses());
        } catch (Exception ex) {
            logger.error("Update News ERROR: " + ex, ex);
        }
    }
}
