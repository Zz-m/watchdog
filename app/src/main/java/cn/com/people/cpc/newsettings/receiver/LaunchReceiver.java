package cn.com.people.cpc.newsettings.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.people.cpc.newsettings.service.ListenerService;

/**
 * Created by dhx on 2018/4/20.
 */
public class LaunchReceiver extends BroadcastReceiver {
    private Logger logger = LoggerFactory.getLogger(LaunchReceiver.class);

    @Override
    public void onReceive(Context context, Intent intent) {
        logger.debug(intent.getAction());
        Log.d("ss", "123123213");
        Intent intent1 = new Intent(context , ListenerService.class);
        // 启动指定Server
        context.startService(intent1);
    }
}

