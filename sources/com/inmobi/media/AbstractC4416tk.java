package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4416tk {
    public static boolean a(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        ConcurrentHashMap concurrentHashMap = Db.b;
        return applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).getBoolean("account_id_reset_enabled", false);
    }

    public static boolean b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        ConcurrentHashMap concurrentHashMap = Db.b;
        RootConfig.PreInit preInit = null;
        String string = applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).getString("pre_init_config", null);
        if (string != null) {
            try {
                preInit = (RootConfig.PreInit) RootConfig.PreInit.class.cast(AbstractC4184lb.a(new JSONObject(string), RootConfig.PreInit.class, null, null));
            } catch (Exception unused) {
            }
        }
        if (preInit == null) {
            return false;
        }
        return preInit.getAppLaunchTimeEnabled();
    }
}
