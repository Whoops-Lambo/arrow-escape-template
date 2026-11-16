package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.a0;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w31 {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static Boolean b;
    public static Boolean c;
    public static v31 d;
    public static j3 e;
    public static Intent f;
    public static Object g;
    public static int h;

    public static final void b(int i) {
        if (i == 0) {
            throw null;
        }
        if (b == null) {
            Boolean boolValueOf = Boolean.valueOf(l41.g("com.android.vending.billing.IInAppBillingService$Stub") != null);
            b = boolValueOf;
            if (!boolValueOf.equals(Boolean.FALSE)) {
                c = Boolean.valueOf(l41.g("com.android.billingclient.api.ProxyBillingActivity") != null);
                g41 g41Var = g41.a;
                if (!lz.a.contains(g41.class)) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = g41.e;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        } else if (jCurrentTimeMillis - j > TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        lz.a(g41.class, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                intent.getClass();
                f = intent;
                d = new v31();
                e = new j3(2);
            }
        }
        if (!s71.b(b, Boolean.FALSE) && gg.c()) {
            h = i;
            if (a.compareAndSet(false, true)) {
                Context contextA = a0.a();
                if (contextA instanceof Application) {
                    Application application = (Application) contextA;
                    j3 j3Var = e;
                    if (j3Var == null) {
                        s71.D("callbacks");
                        throw null;
                    }
                    application.registerActivityLifecycleCallbacks(j3Var);
                    Intent intent2 = f;
                    if (intent2 == null) {
                        s71.D("intent");
                        throw null;
                    }
                    v31 v31Var = d;
                    if (v31Var != null) {
                        contextA.bindService(intent2, v31Var, 1);
                    } else {
                        s71.D("serviceConnection");
                        throw null;
                    }
                }
            }
        }
    }

    public static final void a(Context context, ArrayList arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap map = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                try {
                    String string = new JSONObject(str).getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    string.getClass();
                    str.getClass();
                    map.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e2) {
                    Log.e("w31", "Error parsing in-app purchase data.", e2);
                }
            }
            Object obj2 = g;
            g41 g41Var = g41.a;
            LinkedHashMap linkedHashMap = null;
            if (!lz.a.contains(g41.class)) {
                try {
                    LinkedHashMap linkedHashMapJ = g41Var.j(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        String str2 = (String) obj3;
                        if (!linkedHashMapJ.containsKey(str2)) {
                            arrayList3.add(str2);
                        }
                    }
                    linkedHashMapJ.putAll(g41Var.g(context, arrayList3, obj2, z));
                    linkedHashMap = linkedHashMapJ;
                } catch (Throwable th) {
                    lz.a(g41.class, th);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                String str5 = (String) map.get(str3);
                if (str5 != null) {
                    gg.d(str5, str4, z, h, false);
                }
            }
        }
    }
}
