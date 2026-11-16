package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import com.singular.sdk.internal.Constants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class g {
    public static volatile String a = null;
    public static String b = null;
    public static boolean c = false;
    public static int d = 0;
    private static String e = "";
    private static boolean f = false;
    private static String g = "";
    private static boolean h;
    private static boolean i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
                    g.a(advertisingIdInfo.getId());
                    g.d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.a, advertisingIdInfo.getId(), g.d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.a);
                        g.a(bVarA.a());
                        g.d = bVarA.b() ? 1 : 0;
                        g.b(this.a, bVarA.a(), g.d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th) {
                    q0.b("DomainSameDiTool", th.getMessage());
                }
            }
        }
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f) {
            return e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i2 = Settings.Secure.getInt(contentResolver, Constants.AMAZON_LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, Constants.AMAZON_ADVERTISING_ID);
                jSONObject.put("status", i2);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    g = string2;
                    e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e2) {
                q0.b("DomainSameDiTool", e2.getMessage());
            }
        } catch (Throwable th) {
            q0.b("DomainSameDiTool", th.getMessage());
        }
        f = true;
        return e;
    }

    public static String e() {
        if (TextUtils.isEmpty(g) && !f) {
            b();
        }
        return g;
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            if (TextUtils.isEmpty(b)) {
                return "";
            }
            return b;
        }
        if (TextUtils.isEmpty(b)) {
            if (!c) {
                a(com.mbridge.msdk.foundation.controller.c.n().d());
                c = true;
            }
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
            if (d != 0) {
                return "";
            }
            return b;
        }
        return b;
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            if (TextUtils.isEmpty(a)) {
                return "";
            }
            return a;
        }
        if (TextUtils.isEmpty(a)) {
            m0.l();
            if (!c) {
                a(com.mbridge.msdk.foundation.controller.c.n().d());
                c = true;
            }
            if (TextUtils.isEmpty(a)) {
                return "";
            }
            return a;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
            if (d != 0) {
                return "";
            }
            return a;
        }
        return a;
    }

    public static int a() {
        return d;
    }

    public static void a(int i2) {
        d = i2;
    }

    public static void a(String str) {
        b = k0.b(str);
        a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i2) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i2));
        } catch (Exception e2) {
            q0.b("DomainSameDiTool", e2.getMessage());
        }
    }

    public static boolean b(Context context) {
        try {
            if (i) {
                return h;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            } else {
                h = true;
            }
            i = true;
            return h;
        } catch (Exception unused) {
            h = false;
        }
    }
}
