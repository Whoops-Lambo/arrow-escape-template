package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ra {
    public static final Set<String> ahm = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ra.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static twf kgy;
    private static boolean nu;
    private String at;
    private String ct;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.rz.yo.kgy> dg;

    @Nullable
    private String fi;
    private int gf;
    private String kus;

    @NonNull
    private String noq;
    private int ra;
    private boolean rz;
    private boolean twf;

    @NonNull
    private String uq;
    private com.bytedance.sdk.openadsdk.core.kus.rz.rz vs;
    private int yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private static final ra kgy = new ra();
    }

    public static int ct() {
        try {
            String strKgy = kgy("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strKgy)) {
                return 0;
            }
            return Integer.valueOf(strKgy).intValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5sQyxaM6OY9lZiQk=", 205);
            th.getMessage();
            return 0;
        }
    }

    public static int noq() {
        try {
            String strKgy = kgy("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strKgy)) {
                return 0;
            }
            return Integer.valueOf(strKgy).intValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5tgyyb86HbNZUgCWpJV79", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
            th.getMessage();
            return 0;
        }
    }

    public boolean dg() {
        return true;
    }

    public boolean ra() {
        try {
            if (this.yo == 0) {
                return false;
            }
            return com.bytedance.sdk.openadsdk.ahm.kgy.kgy();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "Uv0MhROVasiOeNJciAg=", Sdk.SDKError.Reason.MRAID_ERROR_VALUE);
            th.getMessage();
            return false;
        }
    }

    private static JSONObject at(String str) {
        String strAhm = com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(strAhm)) {
            return null;
        }
        try {
            return PangleNetworkBridge.jsonObjectInit(strAhm);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5owKwYMO2S9tIiQ==", 487);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static boolean ay() {
        return nu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gf(String str) {
        if (TextUtils.isEmpty(this.fi)) {
            this.fi = str;
            return;
        }
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray(this.fi);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(strOptString, jSONObjectOptJSONObject);
                    }
                }
            }
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                    String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                        map.put(strOptString2, jSONObjectOptJSONObject2);
                    }
                }
            }
            Collection collectionValues = map.values();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                jSONArray3.put((JSONObject) it.next());
            }
            this.fi = jSONArray3.toString();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "Vus/kgaJesKSbtZJjQ==", 386);
            th.getMessage();
        }
    }

    public static void ioy() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            nu = true;
        }
    }

    public void ahm(String str) {
        this.ct = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        kgy("mediation_info", str);
    }

    @NonNull
    public String fi() {
        if (TextUtils.isEmpty(this.noq)) {
            this.noq = kgy(xh.kgy());
        }
        return this.noq;
    }

    public boolean fpp() {
        return "com.union_test.internationad".equals(ftg.noq());
    }

    public void gm() {
        try {
            if (this.dg == null || this.dg.size() != 0) {
                return;
            }
            this.dg = null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "SesgmhW5SsuJSdx+gB6zLXfnPoEGsmzVr0jd", LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW);
            th.getMessage();
        }
    }

    @Nullable
    public String kus() {
        return this.fi;
    }

    public String lqi() {
        return this.at;
    }

    public String sx() {
        if (!TextUtils.isEmpty(this.kus)) {
            return this.kus;
        }
        String strKgy = com.bytedance.sdk.openadsdk.utils.at.kgy();
        this.kus = strKgy;
        if (!TextUtils.isEmpty(strKgy)) {
            return this.kus;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.at.kgy(strValueOf);
        this.kus = strValueOf;
        return strValueOf;
    }

    public boolean twf() {
        int i = this.ra;
        return i < -1 || i > 1;
    }

    public boolean um() {
        return "5001121".contains(this.uq);
    }

    public com.bytedance.sdk.openadsdk.core.kus.rz.rz vs() {
        if (this.vs == null) {
            this.vs = new com.bytedance.sdk.openadsdk.core.kus.rz.rz(10, 8);
        }
        return this.vs;
    }

    public boolean xh() {
        return ahm.contains(this.uq);
    }

    private ra() {
        this.rz = false;
        this.gf = 0;
        this.ra = -1;
        this.dg = null;
    }

    private static void nu(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            twf twfVar = kgy;
            if (twfVar != null) {
                twfVar.kgy(4000, "Data is very long, the longest is 1000");
            }
            com.bytedance.sdk.component.utils.sx.rz("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
        }
    }

    public static Pair<String, Long> uq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectAt = at(str);
            if (jSONObjectAt == null) {
                return null;
            }
            return new Pair<>(jSONObjectAt.getString("value"), Long.valueOf(jSONObjectAt.getLong("time")));
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5owKwYMO2S9tIiSGhIUk=", 559);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static boolean yo(String str) {
        if (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) {
            return false;
        }
        return true;
    }

    public void kgy(String str, com.bytedance.sdk.openadsdk.core.rz.yo.kgy kgyVar) {
        try {
            if (!TextUtils.isEmpty(str) && kgyVar != null) {
                try {
                    if (this.dg == null) {
                        synchronized (ra.class) {
                            try {
                                if (this.dg == null) {
                                    this.dg = new ConcurrentHashMap<>();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (this.dg != null) {
                        this.dg.put(str, kgyVar);
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "SOs5tg+zesKEZt5OmBSuLUk=", 597);
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "SOs5tg+zesKEZt5OmBSuLUk=", 601);
        }
    }

    public void rz(@Nullable final String str) {
        nu(str);
        if (com.bytedance.sdk.openadsdk.utils.mw.noq()) {
            kus.ahm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ra.2
                @Override // java.lang.Runnable
                public void run() {
                    ra.this.gf(str);
                }
            });
        } else {
            gf(str);
        }
    }

    public void ahm(boolean z) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public static void ahm(int i) {
        if (i >= 0) {
            kgy("config_fail_times", String.valueOf(i));
        }
    }

    @NonNull
    public static ra ahm() {
        return kgy.kgy;
    }

    public void fi(String str) {
        this.at = str;
    }

    public void rz(int i) {
        this.yo = i;
        com.bytedance.sdk.openadsdk.ahm.kgy.kgy(i);
    }

    private static void ra(String str) {
        twf twfVar;
        if (TextUtils.isEmpty(str) && (twfVar = kgy) != null) {
            twfVar.kgy(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.sx.rz("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public boolean rz() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_global_file", "sdk_activate_init", true);
    }

    public void rz(boolean z) {
        this.rz = z;
    }

    public InputStream nu() {
        try {
            if (this.yo == 0) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.ahm.kgy.ahm();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5tBOsQMSPRO9woDiuOE76HoERuWjK", Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE);
            th.getMessage();
            return null;
        }
    }

    public int at() {
        return this.ra;
    }

    public String yo() {
        String str = this.ct;
        if (str != null) {
            return str;
        }
        String strKgy = kgy("mediation_info", Long.MAX_VALUE);
        this.ct = strKgy;
        if (strKgy == null) {
            this.ct = "";
        }
        return this.ct;
    }

    public void ct(int i) {
        this.gf = i;
    }

    public void noq(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.dg == null) {
                return;
            }
            this.dg.remove(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "SesgmhW5SsuPWdJZoBizPF7gKIc=", 617);
        }
    }

    public com.bytedance.sdk.openadsdk.core.rz.yo.kgy ct(String str) {
        try {
            if (this.dg == null || str == null) {
                return null;
            }
            return this.dg.get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5tg+zesKEZt5OmBSuLUk=", 576);
            return null;
        }
    }

    public void uq(int i) {
        this.ra = i;
    }

    @Nullable
    public String uq() {
        if (TextUtils.isEmpty(this.uq)) {
            String strKgy = kgy(MBridgeConstans.APP_ID, Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strKgy)) {
                this.uq = strKgy;
            }
        }
        return this.uq;
    }

    public static void kgy(twf twfVar) {
        kgy = twfVar;
    }

    public boolean kgy() {
        return this.twf;
    }

    public void kgy(boolean z) {
        this.twf = z;
    }

    public static void kgy(int i) {
        if (i >= 0) {
            kgy("domain_index", String.valueOf(i));
        }
    }

    public void kgy(@NonNull String str) {
        ra(str);
        this.uq = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        kgy(MBridgeConstans.APP_ID, str);
    }

    private String kgy(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5tBOsZc6DS8NUgx+OKVbr", 277);
            return "";
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5tBOsZc6DS8NUgx+OKVbr", 278);
            return "";
        }
    }

    public static void kgy(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "SOs5owKwYMO2S9tIiQ==", 503);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String kgy(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectAt = at(str);
            if (jSONObjectAt == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectAt.getLong("time") <= j) {
                return jSONObjectAt.getString("value");
            }
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "fOIilwKwQMmGRQ==", "XOs5owKwYMO2S9tIiQ==", 534);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.GlobalInfo", e.getMessage());
        }
        return null;
    }

    public int gf() {
        return this.yo;
    }
}
