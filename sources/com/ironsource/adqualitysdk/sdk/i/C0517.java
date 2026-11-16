package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ε, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0517 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public ArrayList f1160;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public C0834 f1161;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C0561 f1162;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public C1189 f1163;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f1164 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m511(boolean z) {
        boolean z2;
        C0582 c0582M512;
        try {
            ArrayList arrayListM509 = m509(z);
            int size = arrayListM509.size();
            z2 = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayListM509.get(i);
                i++;
                C0582 c0582M513 = m512((String) obj);
                if (c0582M513 != null && c0582M513.f1430 == EnumC0584.f1442) {
                }
            }
            HashMap map = this.f1164;
            if (map != null && !map.isEmpty()) {
                for (String str : map.keySet()) {
                    if (!arrayListM509.contains(str) && (c0582M512 = m512(str)) != null && c0582M512.f1430 == EnumC0584.f1442) {
                        z2 = true;
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m510(C0517 c0517, String str, C0582 c0582) {
        EnumC0584 enumC0584;
        EnumC0584 enumC0585;
        EnumC0584 enumC0586;
        C1189 c1189 = c0517.f1163;
        int i = 0;
        if (c1189 != null && (enumC0585 = c0582.f1430) != EnumC0584.f1444 && enumC0585 != EnumC0584.f1443 && enumC0585 != EnumC0584.f1445 && !c1189.f3580) {
            String str2 = AbstractC0388.f814;
            c1189.f3576 = SystemClock.elapsedRealtime();
            c1189.f3575 = AbstractC1334.m969(c1189.f3583.f1166);
            if (c1189.f3574 && !c1189.f3572) {
                Handler handler = c1189.f3582;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = c1189.f3582;
                if (handler2 != null) {
                    handler2.postDelayed(new C1218(c1189), c1189.f3573);
                }
            }
            if (c1189.f3579) {
                HashMap map = c1189.f3585.f1314.f1164;
                ArrayList arrayList = (map == null || map.isEmpty()) ? new ArrayList() : new ArrayList(map.values());
                int size = arrayList.size();
                int i2 = 0;
                do {
                    if (i2 >= size) {
                        c1189.m871(false);
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    enumC0586 = ((C0582) obj).f1430;
                    if (enumC0586 == EnumC0584.f1444 || enumC0586 == EnumC0584.f1443) {
                        break;
                    }
                } while (enumC0586 != EnumC0584.f1445);
            }
        }
        if (c0517.f1161 == null || !c0517.f1160.contains(str)) {
            return;
        }
        ArrayList arrayList2 = c0517.f1160;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            C0582 c0582M512 = c0517.m512((String) obj2);
            if (c0582M512 == null || c0582M512.f1430 != EnumC0584.f1442) {
                ArrayList arrayList3 = c0517.f1160;
                int size3 = arrayList3.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    C0582 c0582M513 = c0517.m512((String) obj3);
                    if (c0582M513 != null && ((enumC0584 = c0582M513.f1430) == EnumC0584.f1440 || enumC0584 == EnumC0584.f1441)) {
                        C0834 c0834 = c0517.f1161;
                        c0834.f2208 = true;
                        ArrayList arrayList4 = new ArrayList(c0834.f2210);
                        int size4 = arrayList4.size();
                        while (i < size4) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            C0835 c0835 = (C0835) obj4;
                            if (!c0835.f2212) {
                                c0835.f2212 = true;
                                C0517 c0518 = c0834.f2211;
                                String str3 = c0835.f2215;
                                EnumC0591 enumC0591 = EnumC0591.f1453;
                                c0518.getClass();
                                AbstractC4631n.m401(new C0580(c0518, str3, enumC0591));
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
        C0834 c0836 = c0517.f1161;
        c0836.f2209 = true;
        c0836.f2208 = false;
        ArrayList arrayList5 = new ArrayList(c0836.f2210);
        c0836.f2210.clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int size5 = arrayList5.size();
        while (i < size5) {
            Object obj5 = arrayList5.get(i);
            i++;
            C0835 c0837 = (C0835) obj5;
            C0517 c0519 = c0836.f2211;
            String str4 = c0837.f2215;
            long j = jCurrentTimeMillis - c0837.f2213;
            C0582 c0582M514 = c0519.m512(str4);
            if (c0582M514 != null) {
                c0582M514.f1424 = j;
            }
            AbstractC4631n.m405(c0837.f2214.f1422);
        }
    }

    public C0517(C0561 c0561) {
        this.f1162 = c0561;
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m509(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            Iterator it = AbstractC0888.f2378.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).toLowerCase());
            }
            return arrayList;
        }
        arrayList.add(AbstractC0888.f2379.toLowerCase());
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m513() throws JSONException {
        ArrayList arrayList;
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        HashMap map = this.f1164;
        if (map != null && !map.isEmpty()) {
            arrayList = new ArrayList(map.values());
        } else {
            arrayList = new ArrayList();
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0582 c0582 = (C0582) obj;
            String str = c0582.f1437;
            JSONObject jSONObjectJsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
            try {
                jSONObjectJsonObjectInit2.put(AbstractC1219.f3669, c0582.f1435);
                if (c0582.f1428) {
                    jSONObjectJsonObjectInit2.put(StringFog.decrypt("ikAqcfG9\n", "6SFJGZTZ080=\n"), true);
                }
                jSONObjectJsonObjectInit2.put(StringFog.decrypt("XLqa6HBM\n", "L877nAU/VEU=\n"), c0582.f1430.name());
                if (c0582.f1429 != EnumC0591.f1460) {
                    jSONObjectJsonObjectInit2.put(StringFog.decrypt("Ah4/soc=\n", "Z2xN3fX37m8=\n"), c0582.f1430 == EnumC0584.f1440 ? c0582.f1429.name() : null);
                    EnumC0591 enumC0591 = c0582.f1429;
                    if (enumC0591 == EnumC0591.f1458 || enumC0591 == EnumC0591.f1459) {
                        jSONObjectJsonObjectInit2.put(AbstractC1219.f3668, c0582.f1434);
                        if (c0582.f1429 == EnumC0591.f1459) {
                            jSONObjectJsonObjectInit2.put(StringFog.decrypt("juQECDRjg0A=\n", "/IF1fEQV5jI=\n"), c0582.f1431);
                        }
                    }
                }
                if (c0582.f1426 > 0 && !c0582.f1428) {
                    jSONObjectJsonObjectInit2.put(StringFog.decrypt("zBw=\n", "qmiq7wdQi40=\n"), c0582.f1426 - c0582.f1427);
                }
                if (c0582.f1425 > 0) {
                    jSONObjectJsonObjectInit2.put(StringFog.decrypt("nfs=\n", "9I+thvOL+yQ=\n"), c0582.f1425 - c0582.f1426);
                }
                if (c0582.f1424 >= 0) {
                    jSONObjectJsonObjectInit2.put(StringFog.decrypt("h7D9\n", "9MeJgs/HPC8=\n"), c0582.f1424);
                }
            } catch (JSONException unused) {
            }
            jSONObjectJsonObjectInit.put(str, jSONObjectJsonObjectInit2);
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0582 m512(String str) {
        HashMap map = this.f1164;
        if (map != null) {
            return (C0582) map.get(str);
        }
        return null;
    }
}
