package com.adsurge.adn.p036k1;

import android.text.TextUtils;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class x {
    public static final b a = new E();
    public static final b b = new B();
    public static final Map c = new HashMap(4);
    public static final Map d = new HashMap(4);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        String a();

        String b();

        String c();

        String d();

        String e();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.adsurge.adn.p006a1.a.values().length];
            a = iArr;
            try {
                iArr[com.adsurge.adn.p006a1.a.REWARDVIDEOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.adsurge.adn.p006a1.a.UNIFIED_INTERSTITIAL_FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.adsurge.adn.p006a1.a.UNIFIED_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.adsurge.adn.p006a1.a.NATIVEUNIFIEDAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.adsurge.adn.p006a1.a.APPOPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String a(com.adsurge.adn.p006a1.a aVar, String str, int i) {
        boolean z;
        int i2 = 0;
        if (str.length() == 6) {
            z = true;
        } else {
            z = false;
        }
        Map mapA = a(z);
        JSONObject jSONObject = (JSONObject) mapA.get(aVar);
        int i3 = 20;
        if (jSONObject == null) {
            try {
                String strA = a(aVar, z);
                if (TextUtils.isEmpty(strA)) {
                    i2 = 10;
                } else if ('{' != strA.charAt(0)) {
                    i2 = 5;
                } else {
                    jSONObject = new JSONObject(strA);
                }
            } catch (JSONException unused) {
                i2 = 20;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            mapA.put(aVar, jSONObject);
        }
        String strOptString = jSONObject.optString(str);
        if (TextUtils.isEmpty(strOptString)) {
            if (i2 == 0) {
                if (jSONObject.length() != 0) {
                    i3 = 13;
                }
            } else {
                i3 = i2;
            }
            e eVar = new e(1190024);
            eVar.d(i);
            eVar.e(i3);
            eVar.a(new c().a(aVar).f(str));
            com.adsurge.adn.w1.b.a(eVar);
        }
        return strOptString;
    }

    public static String a(com.adsurge.adn.p006a1.a aVar, boolean z) {
        b bVar = z ? b : a;
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return bVar.c();
        }
        if (i == 2) {
            return bVar.b();
        }
        if (i == 3) {
            return bVar.a();
        }
        if (i == 4) {
            return bVar.d();
        }
        if (i != 5) {
            return JsonUtils.EMPTY_JSON;
        }
        return bVar.e();
    }

    public static Map a(boolean z) {
        if (z) {
            return d;
        }
        return c;
    }
}
