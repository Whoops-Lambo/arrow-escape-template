package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.a4;
import com.pgl.ssdk.ces.c;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PglSSManager {
    public static final int AD_EVENT_TYPE_AD_CLICK = 2;
    public static final int AD_EVENT_TYPE_AD_SHOW = 1;
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";
    private static volatile PglSSManager a;
    private final c b;
    private volatile int c = 0;
    private volatile PglSSCallBack d;

    public String getSofChara() {
        return null;
    }

    public static PglSSManager getInstance() {
        return a;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (a == null) {
                        a = new PglSSManager(context, pglSSConfig);
                        if (c.d() == 0) {
                            a.d = pglSSConfig.getCallBack();
                            a.b.a(pglSSConfig.getCustomInfo());
                            a.b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public long getECForBidding() {
        return 0L;
    }

    public PglSSCallBack getPglCallBack() {
        return this.d;
    }

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.b = c.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return c.d();
    }

    public static String getLoadError() {
        if (c.f() != null) {
            return c.f().b;
        }
        return null;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (c.d() == 0) {
            this.b.a(motionEvent);
        }
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (c.d() == 0) {
            return this.b.a(str, bArr);
        }
        return null;
    }

    public String getToken() {
        if (c.d() == 0) {
            return this.b.g();
        }
        return null;
    }

    public void reportAdEvent(int i, Map<String, Object> map) {
        if (c.d() == 0) {
            this.b.a(i, map);
        }
    }

    public void reportNow(String str, Map<String, Object> map) {
        long j;
        if (c.d() == 0) {
            this.b.a(str);
            int i = this.c;
            c cVar = this.b;
            if (i % cVar.l == 0) {
                if (!TextUtils.isEmpty(a4.a())) {
                    j = 0;
                } else {
                    j = 10000;
                }
                cVar.a(str, map, j);
            }
            this.c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (c.d() == 0) {
            this.b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (c.d() == 0) {
            this.b.c(str);
        }
    }

    public void setGaid(String str) {
        if (c.d() == 0) {
            this.b.d(str);
        }
    }
}
