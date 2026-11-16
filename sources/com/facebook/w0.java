package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.lz;
import defpackage.s71;
import defpackage.uq0;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class w0 {
    public static final w0 a = new w0();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final v0 d = new v0(true, "com.facebook.sdk.AutoInitEnabled");
    public static final v0 e = new v0(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final v0 f = new v0(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final v0 g = new v0(false, "auto_event_setup_enabled");
    public static final v0 h = new v0(true, "com.facebook.sdk.MonitorEnabled");
    public static SharedPreferences i;

    public static final boolean b() {
        if (lz.a.contains(w0.class)) {
            return false;
        }
        try {
            a.e();
            return f.a();
        } catch (Throwable th) {
            lz.a(w0.class, th);
            return false;
        }
    }

    public static final boolean c() {
        if (lz.a.contains(w0.class)) {
            return false;
        }
        try {
            w0 w0Var = a;
            w0Var.e();
            return w0Var.a();
        } catch (Throwable th) {
            lz.a(w0.class, th);
            return false;
        }
    }

    public static final Boolean j() {
        String str = "";
        if (!lz.a.contains(w0.class)) {
            try {
                a.l();
                try {
                    SharedPreferences sharedPreferences = i;
                    if (sharedPreferences == null) {
                        s71.D("userSettingPref");
                        throw null;
                    }
                    String string = sharedPreferences.getString(e.b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                    }
                } catch (JSONException unused) {
                    a0 a0Var = a0.a;
                }
            } catch (Throwable th) {
                lz.a(w0.class, th);
                return null;
            }
        }
        return null;
    }

    public final boolean a() {
        Set set = lz.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            Map<String, Boolean> cachedMigratedAutoLogValuesInAppSettings = FetchedAppSettingsManager.getCachedMigratedAutoLogValuesInAppSettings();
            if (cachedMigratedAutoLogValuesInAppSettings != null && !cachedMigratedAutoLogValuesInAppSettings.isEmpty()) {
                Boolean bool = cachedMigratedAutoLogValuesInAppSettings.get(FetchedAppSettingsManager.AUTO_LOG_APP_EVENT_ENABLED_FIELD);
                Boolean bool2 = cachedMigratedAutoLogValuesInAppSettings.get(FetchedAppSettingsManager.AUTO_LOG_APP_EVENTS_DEFAULT_FIELD);
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!set.contains(this)) {
                    try {
                        Boolean boolJ = j();
                        if (boolJ != null || (boolJ = f()) != null) {
                            bool3 = boolJ;
                        }
                    } catch (Throwable th) {
                        lz.a(this, th);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return e.a();
        } catch (Throwable th2) {
            lz.a(this, th2);
            return false;
        }
    }

    public final void d() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            v0 v0Var = g;
            k(v0Var);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (v0Var.c == null || jCurrentTimeMillis - v0Var.d >= 604800000) {
                v0Var.c = null;
                v0Var.d = 0L;
                int i2 = 1;
                if (c.compareAndSet(false, true)) {
                    a0.c().execute(new uq0(jCurrentTimeMillis, i2));
                }
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void e() {
        Set set = lz.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (a0.r.get()) {
                if (b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    sharedPreferences.getClass();
                    i = sharedPreferences;
                    v0[] v0VarArr = {e, f, d};
                    if (!set.contains(this)) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                v0 v0Var = v0VarArr[i2];
                                if (v0Var == g) {
                                    d();
                                } else if (v0Var.c == null) {
                                    k(v0Var);
                                    if (v0Var.c == null) {
                                        g(v0Var);
                                    }
                                } else {
                                    m(v0Var);
                                }
                            } catch (Throwable th) {
                                lz.a(this, th);
                                d();
                                i();
                                h();
                            }
                        }
                    }
                    d();
                    i();
                    h();
                }
            }
        } catch (Throwable th2) {
            lz.a(this, th2);
        }
    }

    public final Boolean f() {
        if (!lz.a.contains(this)) {
            try {
                l();
                try {
                    Context contextA = a0.a();
                    ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                    applicationInfo.getClass();
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        v0 v0Var = e;
                        if (bundle.containsKey(v0Var.b)) {
                            return Boolean.valueOf(applicationInfo.metaData.getBoolean(v0Var.b));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    a0 a0Var = a0.a;
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void g(v0 v0Var) {
        String str = v0Var.b;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                Context contextA = a0.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                v0Var.c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, v0Var.a));
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                a0 a0Var = a0.a;
                return;
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
        lz.a(this, th);
    }

    public final void h() {
        int i2;
        int i3;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            if (b.get() && a0.r.get()) {
                Context contextA = a0.a();
                int i4 = (d.a() ? 1 : 0) | ((e.a() ? 1 : 0) << 1) | ((f.a() ? 1 : 0) << 2) | ((h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    s71.D("userSettingPref");
                    throw null;
                }
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i4) {
                    SharedPreferences sharedPreferences2 = i;
                    if (sharedPreferences2 == null) {
                        s71.D("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                        applicationInfo.getClass();
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i2 = 0;
                            i3 = 0;
                            for (int i6 = 0; i6 < 4; i6++) {
                                try {
                                    i3 |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                    i2 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                        } else {
                            i2 = 0;
                            i3 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    com.facebook.appevents.o oVar = new com.facebook.appevents.o(contextA, (String) null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i3);
                    bundle.putInt("initial", i2);
                    bundle.putInt("previous", i5);
                    bundle.putInt("current", i4);
                    if (((bundle.getInt("previous") & 2) != 0) || c()) {
                        oVar.h(bundle, "fb_sdk_settings_changed");
                    }
                }
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void i() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            Context contextA = a0.a();
            ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("com.facebook.w0", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w("com.facebook.w0", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void k(v0 v0Var) {
        String str = "";
        if (lz.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    s71.D("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(v0Var.b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    v0Var.c = Boolean.valueOf(jSONObject.getBoolean("value"));
                    v0Var.d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                a0 a0Var = a0.a;
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void l() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            if (b.get()) {
            } else {
                throw new c0("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void m(v0 v0Var) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", v0Var.c);
                jSONObject.put("last_timestamp", v0Var.d);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    s71.D("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(v0Var.b, jSONObject.toString()).apply();
                h();
            } catch (Exception unused) {
                a0 a0Var = a0.a;
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }
}
