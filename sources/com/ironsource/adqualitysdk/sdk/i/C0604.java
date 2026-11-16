package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.nj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ւ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0604 {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final C1121 f1474;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final C0905 f1475;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final C0531 f1476;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final String f1477;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public volatile C0517 f1478;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1473 = StringFog.decrypt("j0XOXksxPMa+Z8FeTzUt2w==\n", "zCqgMC5SSKk=\n");

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static final String f1472 = StringFog.decrypt("0syu1wq4hg==\n", "l4LvlUb9wpE=\n");

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final AtomicBoolean f1487 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public boolean f1486 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public volatile ArrayList f1485 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f1484 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap f1483 = new HashMap();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final HashMap f1482 = new HashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final C0615 f1481 = new C0615();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public C0890 f1480 = C0890.m642();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public HashMap f1479 = new HashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static ArrayList m534(C0604 c0604) {
        ArrayList arrayList;
        synchronized (c0604) {
            arrayList = c0604.f1484;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m536(C0604 c0604) {
        synchronized (c0604) {
            try {
                C4640s.m433();
                C0517 c0517 = c0604.f1478;
                if (c0517 == null) {
                    return;
                }
                if (c0517.m511(c0604.m541())) {
                    ((C0531) c0604.m546()).adQualitySdkInitSuccess();
                } else {
                    ((C0531) c0604.m546()).adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, StringFog.decrypt("2oc2RRL5i173nHlUDreSXuaNNkoS9oFe8MhlUx70gEjnjmNKEe4=\n", "lOgWJn2X5Ts=\n"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized void m540() {
        try {
            if (this.f1487.getAndSet(true)) {
                return;
            }
            C0517 c0517 = this.f1478;
            AbstractC4631n.m405(new C0678(this));
            if (c0517 != null) {
                AbstractC4631n.m401(new C0551(c0517));
            }
            this.f1478 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized boolean m541() {
        return AbstractC1081.m765().mo768();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m542() {
        return this.f1486;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m544() {
        HashMap map;
        try {
            synchronized (this) {
                map = this.f1483;
            }
            return m539(map);
        } catch (JSONException e) {
            String str = f1473;
            AbstractC0509.m497(str, str, StringFog.decrypt("q+gh6yHZ1LiK8z3jc5rasoD/MPA8i5Wqi+gg7TyXxg==\n", "7ppThFP5tdw=\n"), e, null, false);
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    static {
        StringFog.decrypt("vmkb+EjjACA=\n", "+iBIuQqvRWQ=\n");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m548(Context context, String str, String str2, AbstractC0451 abstractC0451, AbstractRunnableC1096 abstractRunnableC1096) {
        HashMap map;
        int iMo784;
        long j;
        AbstractC0806 c0846 = null;
        C0799 c0799 = abstractRunnableC1096 == null ? null : new C0799(new AtomicBoolean(false), abstractRunnableC1096);
        abstractC0451.getClass();
        String strMo785 = AbstractC1081.m765().mo785();
        if (((C1082) AbstractC1081.m765()).f3128.m529()) {
            String strM530 = ((C1082) AbstractC1081.m765()).f3128.m530(abstractC0451.mo476());
            if (!TextUtils.isEmpty(strM530)) {
                c0846 = new C0807(StringFog.decrypt("l9kikzwCGzKGxWM=\n", "9LZM/Vlhb10=\n") + abstractC0451.mo476(), strMo785, strM530);
            }
        } else {
            c0846 = new C0846(StringFog.decrypt("7fSwii5iEYP86PE=\n", "jpve5EsBZew=\n") + abstractC0451.mo476(), strMo785);
        }
        AbstractC0806 abstractC0806 = c0846;
        if (abstractC0806 == null) {
            AbstractC4631n.m405(c0799);
            return;
        }
        AbstractC0535 abstractC0535Mo340 = abstractC0451.mo340();
        String strM517 = abstractC0535Mo340.m517();
        synchronized (this) {
            map = this.f1483;
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(AbstractC1219.f3668, strM517);
        } catch (JSONException e) {
            String str3 = f1473;
            AbstractC0509.m497(str3, str3, StringFog.decrypt("Abm483ZoUGshqr71ai8TeiulpPlnPFxrZL2v7nchXHdkobnzag==\n", "RMvKnARIMxk=\n"), e, null, false);
        }
        map.put(str2, jSONObjectJsonObjectInit);
        C0517 c0517 = this.f1478;
        if (c0517 != null) {
            AbstractC4631n.m401(new C0562(c0517, str2, EnumC0584.f1444));
        }
        C0905 c0905 = this.f1475;
        c0905.getClass();
        C0767 c0767 = new C0767(this, context, this.f1475.m678(abstractC0806, new C0796(this, c0905.f2410.m741(C0905.m675(abstractC0806).mo616().replace(StringFog.decrypt("Vw==\n", "eAvz17XdJPs=\n"), StringFog.decrypt("9Q==\n", "2xR8/nPm9uo=\n"))) != null, str2, context, abstractC0535Mo340, str, abstractC0451, c0799)), abstractC0535Mo340, str, str2, abstractC0451, c0799);
        if (!AbstractC1081.m765().mo770()) {
            C0905 c0906 = this.f1475;
            c0906.getClass();
            if (c0906.f2410.m741(C0905.m675(abstractC0806).mo616().replace(StringFog.decrypt("Vw==\n", "eAvz17XdJPs=\n"), StringFog.decrypt("9Q==\n", "2xR8/nPm9uo=\n"))) != null) {
                j = 0;
            } else {
                iMo784 = AbstractC1081.m765().mo784();
            }
            AbstractC4631n.m406(c0767, j);
        }
        iMo784 = AbstractC1081.m765().mo784();
        j = iMo784;
        AbstractC4631n.m406(c0767, j);
    }

    public C0604(C0905 c0905, C0949 c0949, String str, C0517 c0517, C0531 c0531) {
        this.f1475 = c0905;
        C1121 c1121 = new C1121(AbstractC4631n.f409, c0949);
        this.f1474 = c1121;
        AbstractC1290.f3885 = new WeakReference(c1121);
        c1121.f3258.add(new C0711(this));
        this.f1477 = str;
        this.f1478 = c0517;
        this.f1476 = c0531;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized List m543() {
        return this.f1485;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static HashMap m535(C0604 c0604) {
        HashMap map;
        synchronized (c0604) {
            map = c0604.f1483;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m545() {
        return this.f1482;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m538(C0604 c0604, C1115 c1115) {
        c0604.getClass();
        String strM517 = c1115.f3233.m517();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(AbstractC1219.f3668, strM517);
        } catch (JSONException e) {
            String str = f1473;
            AbstractC0509.m497(str, str, StringFog.decrypt("Abm483ZoUGshqr71ai8TeiulpPlnPFxrZL2v7nchXHdkobnzag==\n", "RMvKnARIMxk=\n"), e, null, false);
        }
        try {
            jSONObjectJsonObjectInit.put(AbstractC1219.f3669, c1115.f3236.f2259);
        } catch (JSONException e2) {
            String str2 = f1473;
            AbstractC0509.m497(str2, str2, StringFog.decrypt("sUVaw9YTK0qRVlzFylRoW5tZRsnHRydK1EFN3tdaJ1bUXVvDyg==\n", "9DcorKQzSDg=\n"), e2, null, false);
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m547(Context context, C0445 c0445, LinkedHashMap linkedHashMap) {
        if (this.f1487.get()) {
            return;
        }
        if (m542()) {
            AbstractC4631n.m401(new C0699(c0445));
            return;
        }
        String strDecrypt = StringFog.decrypt("KlblxGN2dPYSYfD6\n", "azK0sQIaHYI=\n");
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("/MB6QGN0+/j8wHpAY3T2vKOCOT4hLKS2tM0WCR8st7m4mS5N\n", "0e1XbU5Z1tU=\n"));
        sb.append(IronSourceAdQuality.getSDKVersion());
        AbstractC0509.m498(strDecrypt, strDecrypt, AbstractC1156.m868("OtDYvioksqk30Ni+KiSy\n", "Gv31kwcJn4Q=\n", sb), true);
        boolean zM541 = m541();
        AbstractC4631n.m401(new C0697(this, linkedHashMap, zM541, context, AbstractC1081.m765().mo769()));
        C0682 c0682 = new C0682(this, c0445, context, linkedHashMap);
        if (zM541) {
            String str = AbstractC0888.f2379;
            ArrayList arrayList = new ArrayList(Arrays.asList(new C0390(), new C0403(), new C0428()));
            ArrayList arrayList2 = new ArrayList(AbstractC0888.f2378);
            if (!arrayList.isEmpty()) {
                AbstractC4631n.m401(new C0659(this, (String) arrayList2.remove(0), context, (AbstractC0451) arrayList.remove(0), arrayList.isEmpty() ? c0682 : new C0669(this, context, arrayList, arrayList2, c0682)));
            }
        } else {
            AbstractC4631n.m401(new C0659(this, AbstractC0888.f2379, context, new C0395(), c0682));
        }
        this.f1486 = true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m549(Context context, LinkedHashMap linkedHashMap, C0634 c0634) {
        boolean zMo766;
        if (linkedHashMap.size() > 0) {
            String str = (String) linkedHashMap.keySet().iterator().next();
            List list = (List) linkedHashMap.remove(str);
            String strMo341 = (list == null || list.isEmpty() || list.get(0) == null) ? null : ((AbstractC0451) list.get(0)).mo341();
            if (strMo341 != null) {
                AbstractC4631n.m403(new C0828(this, strMo341, context, str, list, linkedHashMap, c0634));
                synchronized (this) {
                    zMo766 = AbstractC1081.m765().mo766();
                }
                if (zMo766) {
                    return;
                }
                m549(context, linkedHashMap, c0634);
                return;
            }
            m549(context, linkedHashMap, c0634);
            return;
        }
        AbstractC4631n.m405(new C0814(c0634));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m551(String str, JSONObject jSONObject) {
        C0517 c0517 = this.f1478;
        if (c0517 != null) {
            AbstractC4631n.m401(new C0562(c0517, str, EnumC0584.f1441));
        }
        if (jSONObject != null) {
            try {
                jSONObject.put(StringFog.decrypt("bELT\n", "CCGguhHy2EE=\n"), true);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static HashMap m537(C0604 c0604) {
        HashMap map;
        synchronized (c0604) {
            map = c0604.f1482;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m552(String str) {
        return this.f1479.containsKey(str) && ((C0839) this.f1479.get(str)).m626(this.f1477);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m539(HashMap map) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        for (String str : new HashSet(map.keySet())) {
            jSONObjectJsonObjectInit2.put(str.toLowerCase(), (JSONObject) map.get(str));
        }
        jSONObjectJsonObjectInit.put(StringFog.decrypt("Pq56fg==\n", "SN0UDSijGbc=\n"), jSONObjectJsonObjectInit2);
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m550(String str, List list) {
        ArrayList arrayList;
        if (this.f1487.get()) {
            return;
        }
        if (this.f1485 != null) {
            arrayList = new ArrayList(this.f1485);
        } else {
            arrayList = new ArrayList();
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayListM824 = ((C1115) obj).m824();
            int size2 = arrayListM824.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayListM824.get(i2);
                i2++;
                C1199 c1199 = (C1199) obj2;
                c1199.getClass();
                String strQ = nj.q(new StringBuilder(), C1199.f3615, str);
                AbstractC4631n.m402(new C0693(c1199, strQ, list));
                AbstractC4631n.m401(new C0677(c1199, strQ, list));
                try {
                    AbstractC4631n.m403(new C0628(new C0638(c1199, strQ, list)));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m546() {
        return this.f1476;
    }
}
