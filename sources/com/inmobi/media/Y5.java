package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4664b4;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.eu;
import defpackage.f02;
import defpackage.f93;
import defpackage.gd1;
import defpackage.gg0;
import defpackage.kk2;
import defpackage.p32;
import defpackage.pd1;
import defpackage.pv1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.vz2;
import defpackage.ya2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.KProperty;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Y5 {
    public static final Y5 a;
    public static final /* synthetic */ KProperty[] b;
    public static long c;
    public static String d;
    public static final String e;
    public static final C3897b2 f;
    public static final C3897b2 g;
    public static final C3897b2 h;
    public static final String i;
    public static final dt1 j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static volatile boolean n;
    public static volatile long o;
    public static final gd1 p;
    public static final gd1 q;
    public static final gd1 r;
    public static final JSONArray s;

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return true;
    }

    public static boolean z() {
        return true;
    }

    static {
        f02 f02Var = new f02(Y5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0);
        p32.a.getClass();
        b = new KProperty[]{f02Var, new f02(Y5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0), new f02(Y5.class, "asyncNetworkInfo", "getAsyncNetworkInfo()Ljava/lang/String;", 0)};
        a = new Y5();
        c = -1L;
        e = "Y5";
        int i2 = 15;
        f = new C3897b2(i2, new ya2(29), 12);
        g = new C3897b2(i2, new f93(0), 8);
        h = new C3897b2("", new ya2(25), true, true);
        String str = Build.VERSION.RELEASE;
        str.getClass();
        i = str;
        int i3 = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        j = new dt1("d-api-lev", sb.toString());
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        k = str2;
        String str3 = Build.MODEL;
        str3.getClass();
        l = str3;
        String str4 = Build.HARDWARE;
        str4.getClass();
        m = str4;
        ya2 ya2Var = new ya2(26);
        pd1 pd1Var = pd1.b;
        p = eu.v(pd1Var, ya2Var);
        q = eu.v(pd1Var, new ya2(27));
        gd1 gd1VarV = eu.v(pd1Var, new ya2(28));
        r = gd1VarV;
        s = (JSONArray) gd1VarV.getValue();
    }

    public static boolean A() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean B() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static final int C() {
        Context context = AbstractC4221mk.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    public static final W5 D() {
        boolean z;
        String str;
        a.getClass();
        try {
            Context context = AbstractC4221mk.a;
            if (context == null) {
                return new W5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                z = packageManager.getApplicationEnabledSetting("com.android.vending") >= 2;
            } catch (Exception unused) {
            }
            try {
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused2) {
                str = null;
            }
            return new W5(str, z);
        } catch (Exception e2) {
            gd1 gd1Var = Ba.a;
            Ba.a(new C4120j3(e2));
            return new W5(null, false);
        }
    }

    public static void E() {
        AbstractC4221mk.h.submit(new defpackage.u(19));
    }

    public static final void F() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            c = availableBytes / 1048576;
        } catch (Exception e2) {
            U9.a(e2);
        }
    }

    public static void G() {
        AbstractC4221mk.h.submit(new defpackage.u(18));
    }

    public static final void H() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManagerF = vz2.f(systemService);
        Object systemService2 = context.getSystemService(C4664b4.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID uuidFromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                uuidFromString.getClass();
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        freeBytes += storageStatsManagerF.getFreeBytes(uuidFromString);
                    } catch (Exception e2) {
                        C4120j3 c4120j3 = new C4120j3(e2);
                        gd1 gd1Var = Ba.a;
                        Ba.a(c4120j3);
                    }
                }
            } catch (Exception unused) {
            }
        }
        c = freeBytes / 1048576;
    }

    public static void I() {
        AbstractC4221mk.h.submit(new defpackage.u(21));
    }

    public static final void J() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManagerF = vz2.f(systemService);
        Object systemService2 = context.getSystemService(C4664b4.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManagerF.getFreeBytes(storageUuid);
                } catch (Exception e2) {
                    C4120j3 c4120j3 = new C4120j3(e2);
                    gd1 gd1Var = Ba.a;
                    Ba.a(c4120j3);
                }
            }
        }
        c = freeBytes / 1048576;
    }

    public static void K() {
        AbstractC4221mk.h.submit(new defpackage.u(23));
    }

    public static final void L() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(blockCountLong / 1048576.0f);
            d = sb.toString();
        } catch (Exception e2) {
            U9.a(e2);
        }
    }

    public static void M() {
        AbstractC4221mk.h.submit(new defpackage.u(20));
    }

    public static final void N() {
        UUID uuidFromString;
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManagerF = vz2.f(systemService);
        Object systemService2 = context.getSystemService(C4664b4.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                uuidFromString.getClass();
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    uuidFromString.getClass();
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerF.getTotalBytes(uuidFromString);
                } catch (Exception e2) {
                    C4120j3 c4120j3 = new C4120j3(e2);
                    gd1 gd1Var = Ba.a;
                    Ba.a(c4120j3);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(totalBytes / 1048576);
        d = sb.toString();
    }

    public static void O() {
        AbstractC4221mk.h.submit(new defpackage.u(22));
    }

    public static final void P() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManagerF = vz2.f(systemService);
        Object systemService2 = context.getSystemService(C4664b4.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerF.getTotalBytes(storageUuid);
                } catch (Exception e2) {
                    C4120j3 c4120j3 = new C4120j3(e2);
                    gd1 gd1Var = Ba.a;
                    Ba.a(c4120j3);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(totalBytes / 1048576);
        d = sb.toString();
    }

    public static final int c() {
        Context context = AbstractC4221mk.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean d() {
        a.getClass();
        try {
            String str = Build.FINGERPRINT;
            str.getClass();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            String str2 = Build.MODEL;
            str2.getClass();
            String lowerCase2 = str2.toLowerCase(locale);
            lowerCase2.getClass();
            String str3 = Build.MANUFACTURER;
            str3.getClass();
            String lowerCase3 = str3.toLowerCase(locale);
            lowerCase3.getClass();
            String str4 = Build.BRAND;
            str4.getClass();
            String lowerCase4 = str4.toLowerCase(locale);
            lowerCase4.getClass();
            String str5 = Build.DEVICE;
            str5.getClass();
            String lowerCase5 = str5.toLowerCase(locale);
            lowerCase5.getClass();
            String str6 = Build.HARDWARE;
            str6.getClass();
            String lowerCase6 = str6.toLowerCase(locale);
            lowerCase6.getClass();
            String str7 = Build.PRODUCT;
            str7.getClass();
            String lowerCase7 = str7.toLowerCase(locale);
            lowerCase7.getClass();
            if (kk2.L(lowerCase, "generic", false) || kk2.L(lowerCase, "unknown", false) || dk2.O(lowerCase2, "google_sdk", false) || dk2.O(lowerCase2, "emu", false) || dk2.O(lowerCase2, "Android SDK built for x86", false) || dk2.O(lowerCase3, "Genymotion", false) || dk2.O(lowerCase7, "sdk", false) || dk2.O(lowerCase7, "vbox86p", false) || dk2.O(lowerCase7, "emu", false) || lowerCase6.equals("goldfish") || lowerCase6.equals("ranchu") || lowerCase6.equals("vbox86p") || dk2.O(lowerCase6, "nox", false)) {
                return true;
            }
            if (kk2.L(lowerCase4, "generic", false) && kk2.L(lowerCase5, "generic", false)) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String e() {
        Context context = AbstractC4221mk.a;
        if (context == null || !Og.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            e2.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        return Build.VERSION.SDK_INT < 28 ? a(activeNetworkInfo) : a(connectivityManager, activeNetworkInfo);
    }

    public static dt1 f() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new dt1("d-airplane-m", "1") : new dt1("d-airplane-m", "0");
    }

    public static final String g() {
        Y5 y5 = a;
        y5.getClass();
        String str = (String) h.getValue(y5, b[2]);
        if (kk2.L(str, "0", false)) {
            return com.ironsource.R6.R0;
        }
        return kk2.L(str, "1", false) ? "wifi" : "NIL";
    }

    public static dt1 h() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            I();
        } else if (i2 >= 26) {
            G();
        } else {
            E();
        }
        long j2 = c;
        if (j2 != -1) {
            return new dt1("d-av-disk", String.valueOf(j2));
        }
        return null;
    }

    public static dt1 i() {
        Context context = AbstractC4221mk.a;
        Integer numValueOf = null;
        if (context == null) {
            return null;
        }
        Intent intentA = AbstractC4038g4.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentA != null) {
            numValueOf = Integer.valueOf((int) ((intentA.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intentA.getIntExtra("scale", -1)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(numValueOf);
        return new dt1("d-bat-lev", sb.toString());
    }

    public static dt1 j() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        return ((PowerManager) systemService).isPowerSaveMode() ? new dt1("d-bat-sav", "1") : new dt1("d-bat-sav", "0");
    }

    public static dt1 l() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new dt1("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public static dt1 m() {
        try {
            ArrayList arrayList = new ArrayList();
            Context context = AbstractC4221mk.a;
            if (context == null) {
                return null;
            }
            Object systemService = context.getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
            enabledInputMethodList.getClass();
            Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
                enabledInputMethodSubtypeList.getClass();
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if (s71.b(inputMethodSubtype.getMode(), "keyboard")) {
                        String languageTag = inputMethodSubtype.getLanguageTag();
                        languageTag.getClass();
                        String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                        language.getClass();
                        if (language.length() > 0) {
                            arrayList.add(language);
                        }
                    }
                }
            }
            return new dt1("d-key-lang", new JSONArray((Collection) arrayList).toString());
        } catch (Exception unused) {
            return new dt1("d-key-lang", new JSONArray((Collection) gg0.a).toString());
        }
    }

    public static final String o() {
        a.getClass();
        int iN = n();
        if (iN != 0) {
            return iN != 1 ? "NIL" : "wifi";
        }
        return com.ironsource.R6.R0;
    }

    public static HashMap p() {
        boolean enabled = ((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap map = new HashMap();
        try {
            if (enabled) {
                map.put("d-t1", s.toString());
                return map;
            }
            e.getClass();
            return map;
        } catch (Exception unused) {
        }
    }

    public static dt1 q() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            O();
        } else if (i2 >= 26) {
            M();
        } else {
            K();
        }
        String str = d;
        if (str != null) {
            return new dt1("d-tot-disk", str);
        }
        return null;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public final HashMap b(boolean z) {
        int iAvailableProcessors;
        HashMap map = new HashMap();
        map.put("os-v", i);
        map.put("d-brand-name", Build.BRAND);
        map.put("d-manufacturer-name", k);
        map.put("d-model-name", l);
        map.put("d-nettype-raw", e());
        String string = Locale.getDefault().toString();
        string.getClass();
        map.put("d-localization", string);
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        map.put("d-language", language);
        map.put("d-devicemachinehw", m);
        if (System.currentTimeMillis() >= o) {
            SignalsConfig signalsConfig = (SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class);
            o = (((long) signalsConfig.getLowMemoryFreq()) * 1000) + System.currentTimeMillis();
            tb5.t(AbstractC4211ma.d, null, null, new X5(null), 3);
        }
        map.put("d-lowmem", String.valueOf(n));
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        } catch (Exception e2) {
            gd1 gd1Var = Ba.a;
            U9.a(e2);
            iAvailableProcessors = 0;
        }
        map.put("d-pcount", String.valueOf(iAvailableProcessors));
        map.put("d-emu", String.valueOf(((Boolean) q.getValue()).booleanValue()));
        gd1 gd1Var2 = p;
        map.put("d-ps-disabled", String.valueOf(((W5) gd1Var2.getValue()).a));
        String str = ((W5) gd1Var2.getValue()).b;
        if (str == null) {
            str = "N/A";
        }
        map.put("d-ps-v", str);
        map.put("d-media-volume", String.valueOf(a(AbstractC4221mk.a, z)));
        return map;
    }

    public static String a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (networkCapabilities.hasTransport(0)) {
            return pv1.k(networkInfo.getSubtype(), "0|");
        }
        if (networkCapabilities.hasTransport(1)) {
            return "1";
        }
        if (networkCapabilities.hasTransport(2)) {
            return com.ironsource.Nc.e;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "9";
        }
        if (networkCapabilities.hasTransport(4)) {
            return "17";
        }
        if (networkCapabilities.hasTransport(5)) {
            return "10";
        }
        if (networkCapabilities.hasTransport(6)) {
            return "11";
        }
        return "8";
    }

    public static dt1 k() {
        String str;
        int i2 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i2 != 16) {
            if (i2 != 32) {
                return null;
            }
            str = "1";
        } else {
            str = "0";
        }
        return new dt1("d-drk-m", str);
    }

    public static int n() {
        String strE = e();
        if (kk2.L(strE, "0", false)) {
            return 0;
        }
        if (kk2.L(strE, "1", false)) {
            return 1;
        }
        return 2;
    }

    public static final String a() {
        a.getClass();
        return e();
    }

    public static String a(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type != 0) {
            if (type != 1) {
                return String.valueOf(type);
            }
            return "1";
        }
        return type + com.safedk.android.analytics.brandsafety.m.ad + subtype;
    }

    public final int a(Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        C3897b2 c3897b2 = g;
        KProperty[] kPropertyArr = b;
        int iIntValue = ((Number) c3897b2.getValue(this, kPropertyArr[1])).intValue();
        int iIntValue2 = ((Number) f.getValue(this, kPropertyArr[0])).intValue();
        if (iIntValue2 <= 0) {
            return 0;
        }
        return (iIntValue * 100) / iIntValue2;
    }

    public final HashMap a(boolean z) {
        HashMap map = new HashMap();
        try {
            map.putAll(b(z));
            map.putAll(p());
            return map;
        } catch (Exception e2) {
            e2.getMessage();
            return map;
        }
    }

    public static final JSONArray b() {
        a.getClass();
        Context context = AbstractC4221mk.a;
        if (context != null) {
            try {
                SignalsConfig signalsConfig = (SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db dbA = Cb.a(context, "boot_time");
                JSONArray jSONArray = new JSONArray(dbA.a.getString("bt", "[]"));
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long lValueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (lValueOf != null) {
                    if (Math.abs(lValueOf.longValue() - jCurrentTimeMillis) <= ((long) signalsConfig.getBts().getThreshold()) * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(jCurrentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                dbA.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e2) {
                gd1 gd1Var = Ba.a;
                U9.a(e2);
            }
        }
        return new JSONArray();
    }
}
