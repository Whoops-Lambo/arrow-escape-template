package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.ironsource.R6;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSupport;
import com.unity3d.player.UnityPlayer;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.h50;
import io.p071bidmachine.Framework;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class DeviceUtils {
    private static int dg = 0;
    private static int fi = 0;
    private static int gf = 0;
    public static String kgy = "";
    private static int kus;
    private static int twf;
    private static int vs;
    private static volatile long ahm = System.currentTimeMillis();
    private static volatile boolean rz = false;
    private static volatile boolean uq = false;
    private static volatile boolean ct = false;
    private static volatile boolean noq = true;
    private static long yo = 0;
    private static String ra = "";
    private static int nu = 0;
    private static final AtomicBoolean at = new AtomicBoolean(false);
    private static AtomicBoolean xh = new AtomicBoolean(false);
    private static final Object um = new Object();
    private static volatile String fpp = null;
    private static volatile String sx = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.twf.gf> kgy = new CopyOnWriteArrayList<>();

        public static void kgy(com.bytedance.sdk.openadsdk.twf.gf gfVar) {
            if (gfVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.twf.gf> copyOnWriteArrayList = kgy;
                if (copyOnWriteArrayList.contains(gfVar)) {
                    return;
                }
                copyOnWriteArrayList.add(gfVar);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.vs = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.twf = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!kgy.isEmpty()) {
                        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.twf.gf> it = AudioInfoReceiver.kgy.iterator();
                                while (it.hasNext()) {
                                    it.next().rz(DeviceUtils.twf);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.gf != 0) {
                        int unused3 = DeviceUtils.kus = (int) ((((double) DeviceUtils.twf) / ((double) DeviceUtils.gf)) * 100.0d);
                    }
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQZrQSkIVTHI5MMjmzEhUPBWJ4=", "VOAfkAC5YNGF", 948);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ahm(Context context) {
            if (!DeviceUtils.uq && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.gf.kgy());
                    boolean unused = DeviceUtils.uq = true;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQZrQSkIVTHI5MMjmzEhUPBWJ4=", "SesqnBCobNWyT9RYhQelOg==", 896);
                }
            }
        }

        public static void ahm(com.bytedance.sdk.openadsdk.twf.gf gfVar) {
            if (gfVar == null) {
                return;
            }
            kgy.remove(gfVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.noq = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.noq = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.ahm = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends BroadcastReceiver {
        /* JADX INFO: Access modifiers changed from: private */
        public static void ahm(Context context) {
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(new kgy(), intentFilter, 2);
                } else {
                    context.registerReceiver(new kgy(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.gm(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.dg = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }

        private kgy() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ay(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return ioy(context);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "XOs5uQyrWciXT8VwgxWlG0/vOYAQ", 700);
            return 0;
        }
    }

    public static float ct() {
        int i = -1;
        try {
            Context contextKgy = com.bytedance.sdk.openadsdk.core.xh.kgy();
            if (contextKgy != null) {
                i = Settings.System.getInt(contextKgy.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "XOs5pgCubMKOaMVUixm0", 410);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    private static int dg(Context context) {
        try {
            int i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                return 1;
            }
            return i == 16 ? 0 : -1;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "Uv0ChQayTcaSQfpSiBQ=", 491);
            return -1;
        }
    }

    public static int fi(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "SPc+tAe+WtOBXsJO", 453);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static boolean rz(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "Uv0Zgw==", 169);
            return false;
        }
    }

    public static JSONObject yo(Context context) {
        return kgy(context, false);
    }

    public static void at(Context context) {
        Context applicationContext;
        if (ct || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                lqi(applicationContext);
            } else {
                kgy.ahm(applicationContext);
            }
            ct = true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "SesqnBCobNWwRcBYnjyvLF7MP5oCuErGk17lWI8UqT5e/A==", 751);
        }
    }

    private static String fpp() {
        try {
            if (fpp == null) {
                synchronized (um) {
                    try {
                        if (fpp == null) {
                            fpp = kgy(String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("bt_time", ""), "bt_time");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "SOIkkSGzZtO0Q9pY", 853);
            fpp = "";
        }
        return fpp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        mw.rz((Runnable) new com.bytedance.sdk.component.gf.ahm.rz("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.dg = DeviceUtils.ay(applicationContext);
            }
        });
    }

    private static int ioy(Context context) {
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("XIAOMI")) {
                return Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0;
            }
            return (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "XOs5uQyrWciXT8VwgxWlG0/vOYAQn2bKkEvD", 721);
            return -1;
        }
    }

    public static JSONObject kgy(Context context, boolean z) {
        String strRa;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", fi(context));
            ahm(jSONObject);
            jSONObject.put("type", uq(context));
            jSONObject.put(R6.F, 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", ftg.yo(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.uq.rz());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.uq.ahm());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.uq.uq());
            jSONObject.put("screen_scale", gbb.yo(context));
            jSONObject.put("density", gbb.gf(context));
            jSONObject.put("screen_width", gbb.uq(context));
            jSONObject.put("screen_height", gbb.noq(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.nu.rz.noq());
            com.bytedance.sdk.openadsdk.core.settings.nu nuVarUq = com.bytedance.sdk.openadsdk.core.xh.uq();
            if (nuVarUq.wy("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.at.rz(context));
            jSONObject.put("rom_version", wy.kgy());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.at.ahm(context));
            jSONObject.put("timezone", ftg.ft());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.at.ahm());
            jSONObject.put("carrier_name", vg.kgy());
            if (z) {
                strRa = ftg.kgy(context);
                jSONObject.put("board", Build.BOARD);
                jSONObject.put("device_city", ftg.lqi());
                kgy(jSONObject);
            } else {
                strRa = ftg.ra();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strRa) * 1024));
            jSONObject.put("locale_language", uq());
            jSONObject.put("screen_bright", Math.ceil(ct() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !ahm() ? 1 : 0);
            jSONObject.put("cpu_num", ra.ahm());
            jSONObject.put("cpu_max_freq", ra.rz());
            jSONObject.put("cpu_min_freq", ra.uq());
            yo.kgy kgyVarKgy = yo.kgy();
            jSONObject.put("battery_remaining_pct", (int) kgyVarKgy.ahm);
            jSONObject.put("is_charging", kgyVarKgy.kgy);
            jSONObject.put("total_space", String.valueOf(ftg.ahm(context)));
            jSONObject.put("free_space_in", String.valueOf(ftg.twf()));
            jSONObject.put("sdcard_size", String.valueOf(ftg.kus()));
            jSONObject.put("rooted", ftg.dg());
            jSONObject.put("enable_assisted_clicking", noq());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.ay.kgy(context, "tt_choose_language"));
            jSONObject.put("airplane", gf(context));
            jSONObject.put("darkmode", dg(context));
            jSONObject.put("headset", xh(context));
            jSONObject.put("ringmute", ra(context));
            jSONObject.put("screenscale", um(context));
            jSONObject.put("volume", fi());
            jSONObject.put("low_power_mode", fpp(context));
            jSONObject.put("enable_draw_feed", ftg.bmz());
            if (z) {
                fi.kgy(jSONObject, context);
                jSONObject.put("gp_v_name", ct(context));
                jSONObject.put("gp_v_code", noq(context));
            }
            if (nuVarUq.wy("mnc")) {
                jSONObject.put("mnc", vg.rz());
            }
            if (nuVarUq.wy("mcc")) {
                jSONObject.put("mcc", vg.ahm());
            }
            String strRz = com.bytedance.sdk.openadsdk.core.nu.rz.rz();
            com.bytedance.sdk.openadsdk.core.nu.rz.uq();
            if (!TextUtils.isEmpty(strRz)) {
                jSONObject.put("sof_chara", strRz);
            }
            String strAhm = com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strAhm.isEmpty()) {
                jSONObject.put("ipv6", strAhm);
            }
            jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.gm.kgy(com.bytedance.sdk.openadsdk.core.xh.kgy()));
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "XOs5sQaqYMSFY9lbgzevOnXrObQTtQ==", 325);
            return jSONObject;
        }
    }

    public static void nu() {
        com.bytedance.sdk.openadsdk.core.settings.nu.kgy(new com.bytedance.sdk.openadsdk.core.settings.ra.kgy() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ra.kgy
            public void ahm() {
                com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().kgy(true);
                DeviceUtils.xh();
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ra.kgy
            public void kgy() {
                com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().kgy(true);
            }
        });
        Context contextKgy = com.bytedance.sdk.openadsdk.core.xh.kgy();
        if (contextKgy != null) {
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("cpu_count", ra.kgy());
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("cpu_max_frequency", ra.kgy(ra.kgy()));
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("cpu_min_frequency", ra.ahm(ra.kgy()));
            String strNu = ftg.nu();
            if (strNu != null) {
                com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("total_memory", strNu);
            }
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("total_internal_storage", ftg.at());
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("free_internal_storage", com.bytedance.sdk.component.utils.xh.kgy());
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("total_sdcard_storage", ftg.vs());
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("is_root", ftg.xh() ? 1 : 0);
            if (TextUtils.isEmpty(ra())) {
                try {
                    Activity activity = UnityPlayer.currentActivity;
                    kgy = Framework.UNITY;
                } catch (ClassNotFoundException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "Tv4plBe5TcaUSw==", 609);
                    kgy = "native";
                }
                com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("framework_name", kgy);
            }
            at();
            sx(contextKgy);
            dg = ay(contextKgy);
            fi.kgy(contextKgy);
            xh();
        }
    }

    public static String ra() {
        if (TextUtils.isEmpty(kgy)) {
            kgy = com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("framework_name", "");
        }
        return kgy;
    }

    private static void sx(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            gf = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            twf = streamVolume;
            kus = (int) ((((double) streamVolume) / ((double) gf)) * 100.0d);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "UuAkgTWzZdKNTw==", 658);
        }
    }

    private static String um() {
        try {
            return sx == null ? com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("bt_id", "") : sx;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "SOIkkQaeZsiUY9M=", 838);
            return "";
        }
    }

    private static void vs(Context context) {
        if (context == null || !at.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.lqi.ct.kgy("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ra = packageInfo.versionName;
                nu = packageInfo.versionCode;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "UuAkgQq9Zc6aT+dRjQiTPFT8KKMGrnrOj0Q=", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
        }
    }

    public static boolean ahm() {
        if (SystemClock.elapsedRealtime() - yo >= 20000) {
            yo = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.xh.kgy().getSystemService("power");
                if (powerManager != null) {
                    noq = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "Uv0elhG5bMmvRA==", 144);
                com.bytedance.sdk.component.utils.sx.rz("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return noq;
    }

    public static int gf(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
                return 0;
            }
            return 1;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "Uv0ChQaySM6SWttcghQ=", 471);
            return -1;
        }
    }

    private static void lqi(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.gm(applicationContext);
            }
        });
    }

    public static int noq() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.xh.kgy().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        if (accessibilityManager.isEnabled()) {
            return 1;
        }
        return 0;
    }

    public static int uq(Context context) {
        if (rz(context)) {
            return 3;
        }
        if (ahm(context)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xh() {
        if (com.bytedance.sdk.openadsdk.core.xh.uq().wy("bt_id")) {
            try {
                if (sx == null) {
                    synchronized (um) {
                        try {
                            if (sx == null) {
                                sx = kgy(PglSupport.getBootid(), com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("bt_id", ""), "bt_id");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "Tv4plBe5S8iPXv5Z", 825);
                sx = "";
            }
        }
    }

    public static int yo() {
        return twf;
    }

    public static String uq() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static int ra(Context context) {
        return fi;
    }

    public static int noq(Context context) {
        if (!at.get()) {
            vs(context);
        }
        return nu;
    }

    public static int gf() {
        return gf;
    }

    private static void rz(JSONObject jSONObject) throws JSONException {
        jSONObject.put(R6.B, Build.MODEL);
        com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().kgy(jSONObject);
    }

    private static float um(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int rz() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("limit_ad_track", -1);
    }

    public static int fi() {
        return kus;
    }

    public static void at() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.xh.kgy().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                fi = 1;
            } else if (ringerMode == 1) {
                fi = 2;
            } else {
                fi = 0;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "SesrhwavYfWJRNBwgxWl", 640);
        }
    }

    public static String ct(Context context) {
        if (!at.get()) {
            vs(context);
        }
        return ra;
    }

    public static boolean ahm(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "Uv0ZlAGwbNM=", 155);
            return false;
        }
    }

    private static void ahm(JSONObject jSONObject) throws JSONException {
        rz(jSONObject);
    }

    private static int fpp(Context context) {
        return dg;
    }

    private static int xh(Context context) {
        return vs;
    }

    public static void nu(Context context) {
        AudioInfoReceiver.ahm(context);
    }

    public static void kgy(Context context) {
        if (rz) {
            return;
        }
        try {
            ahm ahmVar = new ahm();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(ahmVar, intentFilter);
            rz = true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "SesqnBCobNWzScVYiR+TPFr6KLcRs2jDg0vESb4Uoy1S+CiH", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
    }

    public static long kgy() {
        return ahm;
    }

    public static void kgy(JSONObject jSONObject) {
        try {
            com.bytedance.sdk.openadsdk.core.settings.nu nuVarUq = com.bytedance.sdk.openadsdk.core.xh.uq();
            if (nuVarUq.wy("boot")) {
                jSONObject.put("bt_time", fpp());
            } else {
                jSONObject.put("bt_time", "not_allowed");
                com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("bt_time");
            }
            if (nuVarUq.wy("bt_id")) {
                jSONObject.put("bt_id", um());
            } else {
                jSONObject.put("bt_id", "not_allowed");
                com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("bt_id");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "f+s7nAC5XNOJRsQ=", "WuoppRG1f8aDU/55vBCyKVb9", 350);
        }
    }

    private static String kgy(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str2.split(",");
            int iJpc = com.bytedance.sdk.openadsdk.core.settings.nu.ahm().jpc();
            if (iJpc != 1) {
                if (str.equals(strArrSplit[0]) || ("bt_time".equals(str3) && Math.abs(Long.parseLong(str) - Long.parseLong(strArrSplit[0])) < 1000)) {
                    return str2;
                }
                if (strArrSplit.length < iJpc) {
                    str = h50.i(str, ",", str2);
                } else {
                    int iLastIndexOf = str2.lastIndexOf(",");
                    if (iLastIndexOf != -1) {
                        str = h50.i(str, ",", str2.substring(0, iLastIndexOf));
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.rz.kgy().kgy(str3, str);
        return str;
    }
}
