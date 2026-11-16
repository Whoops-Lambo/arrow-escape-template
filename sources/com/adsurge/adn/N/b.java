package com.adsurge.adn.N;

import com.adsurge.adn.ads.AdSurgeAdFormat;
import defpackage.n30;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static JSONObject a;
    public static JSONObject b;
    public static JSONObject c;
    public static JSONObject d;
    public static JSONObject e;
    public static JSONObject f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdSurgeAdFormat.values().length];
            a = iArr;
            try {
                iArr[AdSurgeAdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdSurgeAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdSurgeAdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AdSurgeAdFormat.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AdSurgeAdFormat.APP_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(String str, int i, AdSurgeAdFormat adSurgeAdFormat) {
        JSONObject jSONObject;
        if (adSurgeAdFormat != null) {
            int i2 = a.a[adSurgeAdFormat.ordinal()];
            if (i2 == 1) {
                JSONObject jSONObject2 = b;
                if (jSONObject2 != null) {
                    return jSONObject2.optInt(str, i);
                }
            } else if (i2 == 2) {
                JSONObject jSONObject3 = c;
                if (jSONObject3 != null) {
                    return jSONObject3.optInt(str, i);
                }
            } else if (i2 == 3) {
                JSONObject jSONObject4 = d;
                if (jSONObject4 != null) {
                    return jSONObject4.optInt(str, i);
                }
            } else if (i2 == 4) {
                JSONObject jSONObject5 = e;
                if (jSONObject5 != null) {
                    return jSONObject5.optInt(str, i);
                }
            } else if (i2 == 5 && (jSONObject = f) != null) {
                return jSONObject.optInt(str, i);
            }
        }
        JSONObject jSONObject6 = a;
        return jSONObject6 == null ? i : jSONObject6.optInt(str, i);
    }

    public static int a(String str, int i, AdSurgeAdFormat adSurgeAdFormat, String str2) {
        return a(str, d.b().a(str, str2, adSurgeAdFormat, i), adSurgeAdFormat);
    }

    public static int a(String str, int i, com.adsurge.adn.u1.c cVar) {
        if (cVar == null) {
            return a(str, i, (AdSurgeAdFormat) null, (String) null);
        }
        int iA = d.b().a(str, cVar, i);
        JSONObject jSONObjectQ0 = cVar.q0();
        String strA = a(str, cVar);
        return (jSONObjectQ0 == null || strA == null) ? iA : jSONObjectQ0.optInt(strA, iA);
    }

    public static String a(String str, String str2) {
        return a(str, str2, (AdSurgeAdFormat) null, (String) null);
    }

    public static String a(String str, String str2, AdSurgeAdFormat adSurgeAdFormat, String str3) {
        return a(str, d.b().a(str, str3, adSurgeAdFormat, str2), adSurgeAdFormat);
    }

    public static String a(String str, String str2, com.adsurge.adn.u1.c cVar) {
        if (cVar == null) {
            return a(str, str2, (AdSurgeAdFormat) null, (String) null);
        }
        String strA = d.b().a(str, cVar, str2);
        JSONObject jSONObjectQ0 = cVar.q0();
        String strA2 = a(str, cVar);
        return (jSONObjectQ0 == null || strA2 == null) ? strA : jSONObjectQ0.optString(strA2, strA);
    }

    public static String a(String str, com.adsurge.adn.u1.c cVar) {
        String strA = d.b().a(a(str), cVar.y(), cVar.x(), (String) null);
        if (strA == null) {
            int iA = d.b().a(a(str), cVar.y(), cVar.x(), Integer.MIN_VALUE);
            Integer numValueOf = Integer.valueOf(iA);
            if (iA != Integer.MIN_VALUE) {
                return numValueOf.toString();
            }
        }
        return strA;
    }

    public static String a(String str) {
        return n30.m(str, "_exp");
    }

    public static int a(String str, int i) {
        return a(str, i, (AdSurgeAdFormat) null, (String) null);
    }

    public static String a(String str, String str2, AdSurgeAdFormat adSurgeAdFormat) {
        JSONObject jSONObject;
        if (adSurgeAdFormat != null) {
            int i = a.a[adSurgeAdFormat.ordinal()];
            if (i == 1) {
                JSONObject jSONObject2 = b;
                if (jSONObject2 != null) {
                    return jSONObject2.optString(str, str2);
                }
            } else if (i == 2) {
                JSONObject jSONObject3 = c;
                if (jSONObject3 != null) {
                    return jSONObject3.optString(str, str2);
                }
            } else if (i == 3) {
                JSONObject jSONObject4 = d;
                if (jSONObject4 != null) {
                    return jSONObject4.optString(str, str2);
                }
            } else if (i == 4) {
                JSONObject jSONObject5 = e;
                if (jSONObject5 != null) {
                    return jSONObject5.optString(str, str2);
                }
            } else if (i == 5 && (jSONObject = f) != null) {
                return jSONObject.optString(str, str2);
            }
        }
        JSONObject jSONObject6 = a;
        return jSONObject6 == null ? str2 : jSONObject6.optString(str, str2);
    }

    public static void a(JSONObject jSONObject, AdSurgeAdFormat adSurgeAdFormat) {
        a = jSONObject;
        int i = a.a[adSurgeAdFormat.ordinal()];
        if (i == 1) {
            b = jSONObject;
            return;
        }
        if (i == 2) {
            c = jSONObject;
            return;
        }
        if (i == 3) {
            d = jSONObject;
        } else if (i == 4) {
            e = jSONObject;
        } else {
            if (i != 5) {
                return;
            }
            f = jSONObject;
        }
    }
}
