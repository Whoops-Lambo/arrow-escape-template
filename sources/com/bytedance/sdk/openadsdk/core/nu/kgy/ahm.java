package com.bytedance.sdk.openadsdk.core.nu.kgy;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.ironsource.C4664b4;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    private static volatile ahm kgy;
    private final ArrayList<String> ahm = new ArrayList<>();
    private final AtomicBoolean rz = new AtomicBoolean(false);
    private long uq = System.currentTimeMillis();
    private long ct = 0;
    private long noq = 0;
    private String yo = "";
    private String fi = "";
    private String gf = "";
    private boolean ra = false;
    private boolean nu = false;

    public String kgy(String str, long j, int i) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.ct;
        long j3 = jCurrentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.rz.get() && this.nu) {
            i2 |= 2;
        }
        if (!this.rz.get() && this.noq >= 5000 && j2 < 1000) {
            i2 = this.fi.equals(this.gf) ? i2 | 4 : i2 | 8;
        }
        try {
            string = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.noq).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.rz).put("alert", this.nu).put(NotificationCompat.CATEGORY_SYSTEM, this.ra).put("actsize", this.ahm.size()).put("mutiproc", true ^ gm.kgy(xh.kgy())).toString();
        } catch (JSONException e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiWTaxoyYdG0lyeHK86", "euoenQyrSs+FSdx7gwOTLVg=", "XOs5twK/YuaEed9SmzKoLVjlH5AQqWXT", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
            string = "";
        }
        this.yo = "";
        this.noq = 0L;
        this.ct = 0L;
        this.uq = System.currentTimeMillis();
        return string;
    }

    public void ahm(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.ahm.contains(localClassName)) {
            this.ahm.remove(localClassName);
        }
        if (this.ahm.size() == 0) {
            this.uq = System.currentTimeMillis();
            this.rz.set(true);
            this.fi = localClassName;
        }
    }

    private static int kgy(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiWTaxoyYdG0lyeHK86", "euoenQyrSs+FSdx7gwOTLVg=", "WOYolgiPbMuGetJPgRizO1LhIw==", 68);
            return -1;
        }
    }

    private static boolean kgy(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void kgy(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.ahm.size() == 0) {
            this.yo = localClassName;
            this.ct = System.currentTimeMillis();
            this.noq = System.currentTimeMillis() - this.uq;
            this.rz.set(false);
        }
        if (!this.ahm.contains(localClassName)) {
            this.ahm.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.gf = localClassName;
    }

    private void kgy() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(C4664b4.i.h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object objValueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.ahm.contains(localClassName)) {
                            this.ahm.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.rz;
                if (this.ahm.size() > 0) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiWTaxoyYdG0lyeHK86", "euoenQyrSs+FSdx7gwOTLVg=", "UuAkgSK/fc6WQ8NEpR+mJw==", 162);
        }
    }

    public static ahm kgy(Application application) {
        if (kgy == null) {
            synchronized (ahm.class) {
                try {
                    if (kgy == null) {
                        ahm ahmVar = new ahm();
                        kgy = ahmVar;
                        ahmVar.ra = kgy((Context) application);
                        kgy.nu = kgy(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        kgy.kgy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }
}
