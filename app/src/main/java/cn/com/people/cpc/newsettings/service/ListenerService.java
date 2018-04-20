package cn.com.people.cpc.newsettings.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dhx on 2018/4/20.
 */
public class ListenerService extends IntentService{

    private Logger logger = LoggerFactory.getLogger(ListenerService.class);

    public ListenerService() {
        super("ListenerService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        logger.debug("start..");
    }


}
