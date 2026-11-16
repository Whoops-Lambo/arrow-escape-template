package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᘦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0949 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public final C0630 f2553;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public final String f2554;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public C0841 f2555;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final C4635p f2557;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public C0977 f2558;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final Context f2559;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public boolean f2562;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public boolean f2563;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Handler f2564;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final C0933 f2565;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final C1258 f2566;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C1051 f2567;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public boolean f2568;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C4603b f2569;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f2552 = StringFog.decrypt("nNUROpNZryqu\n", "3btwVuotxkk=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2551 = StringFog.decrypt("9RytNOD4/0rqQKchq/78B+AArTv87vdK8g==\n", "gW7MV4Wanik=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f2550 = StringFog.decrypt("UdJdPxep4XxH3kA3D+X4bkzcXisPoa98\n", "Ir0yUnvIzA8=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f2549 = StringFog.decrypt("z26P/dKuQvTvZA==\n", "pgD706HLMYc=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f2548 = StringFog.decrypt("xuyHxL5TddLa95jBsWEyxQ==\n", "tZj1rdA0W6E=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final ArrayList f2561 = new ArrayList();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final ArrayList f2560 = new ArrayList();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final Thread.UncaughtExceptionHandler f2556 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m717() {
        try {
            this.f2568 = false;
            Handler handler = this.f2564;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C1051 c1051 = this.f2567;
            C0994 c0994 = c1051.f3040;
            c0994.f2835.unregisterReceiver(c0994);
            c1051.f3039 = true;
            m716();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized void m718() {
        this.f2562 = true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m720() {
        synchronized (this) {
            try {
                Handler handler = this.f2564;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m731(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m721() {
        try {
            this.f2563 = true;
            AbstractC4631n.m402(new C1066(this));
            m720();
        } catch (Exception e) {
            AbstractC1290.m905(f2552, StringFog.decrypt("W1Ip2AZd6xs+TzX2BA3WGlxBONwTD+0AcEQ=\n", "HiBbt3R9gnU=\n"), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m722() {
        return this.f2568;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m716() {
        C0977 c0977 = this.f2558;
        if (c0977 != null) {
            C0994 c0994 = this.f2567.f3040;
            synchronized (c0994) {
                c0994.f2833.remove(c0977);
            }
        }
        this.f2555.m627();
        this.f2555 = null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final void m719() {
        C0977 c0977 = new C0977(this);
        this.f2558 = c0977;
        C0994 c0994 = this.f2567.f3040;
        synchronized (c0994) {
            c0994.f2833.add(c0977);
        }
        this.f2555 = new C0841(new C0968(this));
        AbstractC1227.m885().m890(new C0966(this));
        AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
        C0958 c0958 = new C0958(this);
        C1082 c1082 = (C1082) abstractC1081M765;
        Handler handler = c1082.f3131;
        if (handler != null) {
            handler.post(new C1135(c1082, c0958));
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m729(String str, JSONObject jSONObject, JSONObject jSONObject2, C1166 c1166) {
        boolean z;
        String str2 = f2552;
        AbstractC0509.m496(str2, str2, AbstractC1156.m868("zoPKMnQQ856ahsJmdV7widQ=\n", "7vSjRhwwluY=\n", AbstractC0688.m577("dz87d5LlivVMbTF7kuaK5FUoLGrGog==\n", "I01CHvyCqoE=\n", new StringBuilder(), str)), jSONObject, true);
        try {
            if (m725().m700().contains(str)) {
                AbstractC0509.m495(str2, StringFog.decrypt("RyG0/YYywCBgIKf9kCHLKn1ut7SBP44qaCOl59U=\n", "CU7A3fVXrkQ=\n") + str + StringFog.decrypt("r9Di1DOd0Z7qnKfOKdHXn/2O4t55\n", "j/iHrFDxpPo=\n"));
                return;
            }
            AbstractC0509.m495(str2, StringFog.decrypt("JhqVDSQ5eNYdSJ8BJDp4xwQNghBqKTHWGkiCBSc7YoI=\n", "cmjsZEpeWKI=\n") + str);
            C0933 c0933 = this.f2565;
            C0994 c0994 = this.f2567.f3040;
            synchronized (c0994) {
                z = c0994.f2834;
            }
            c0933.m702(str, jSONObject, jSONObject2, z, new C1057(this, c1166));
        } catch (Exception e) {
            AbstractC1290.m906(f2552, StringFog.decrypt("FxHFpgQ1685yENKnElD0xTwX\n", "UmO3yXYVgqA=\n"), e, false, false, true);
        }
    }

    public C0949(Context context, C4610d0 c4610d0, C4603b c4603b, boolean z, String str, C0630 c0630) {
        int i;
        long j;
        this.f2553 = c0630;
        Thread.setDefaultUncaughtExceptionHandler(new C1073(this));
        this.f2569 = c4603b;
        this.f2559 = context;
        C0969 c0969 = new C0969(context, StringFog.decrypt("8AffTOF7B9bvW9VZqn0Em+Ub30P9bQ/W9w==\n", "hHW+L4QZZrU=\n"), StringFog.decrypt("LiZL550LS0E4KlbvhUdSUzMoSPOFAwVB\n", "XUkkivFqZjI=\n"));
        this.f2566 = new C1258(c0969, StringFog.decrypt("MdIx5DdvheY=\n", "eYV0klIB8ZU=\n"), StringFog.decrypt("8+dr230V\n", "lpEOtQk7WcY=\n"));
        String str2 = f2549;
        String strM741 = c0969.m741(str2);
        if (!TextUtils.isEmpty(strM741)) {
            i = Integer.parseInt(strM741) + 1;
        } else {
            i = 1;
        }
        c0969.m742(str2, "" + i);
        String str3 = f2548;
        String strM742 = c0969.m741(str3);
        if (TextUtils.isEmpty(strM742)) {
            strM742 = UUID.randomUUID().toString();
            c0969.m742(str3, strM742);
        }
        String str4 = strM742;
        String strM743 = ((C1082) AbstractC1081.m765()).f3133.m741(C1082.f3110);
        if (!TextUtils.isEmpty(strM743)) {
            j = Long.parseLong(strM743);
        } else {
            j = 0;
        }
        this.f2565 = new C0933(context, c4610d0, i, str4, j);
        this.f2567 = new C1051(context);
        this.f2568 = false;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("GxIA0vVrl487FhDJ/0k=\n", "WHNjupA75eA=\n"));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f2564 = handler;
        this.f2557 = new C4635p(i);
        this.f2563 = !z;
        this.f2554 = str;
        synchronized (this) {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new C1148(this), 0L);
        }
        m719();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m723(JSONObject jSONObject) {
        ArrayList arrayList;
        if (C1328.m948().m958()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f2561);
            }
            AbstractC4631n.m401(new C1076(arrayList, jSONObject));
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m724() {
        return this.f2562;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m713(C0949 c0949) {
        synchronized (c0949) {
            c0949.f2562 = false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m715(C0949 c0949, ArrayList arrayList, C1144 c1144) {
        JSONObject jSONObject;
        c0949.getClass();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0946 c0946 = (C0946) obj;
            synchronized (c0946) {
                jSONObject = c0946.f2545.f3945;
            }
            if (!jSONObject.has(StringFog.decrypt("tvfK\n", "0oO5V6Vp5dQ=\n"))) {
                try {
                    jSONObject.put(StringFog.decrypt("QkZN\n", "JjI+dAd3ITM=\n"), jSONObject.optLong(AbstractC1219.f3710));
                } catch (JSONException unused) {
                }
            }
            if (c0949.f2557.m428(jSONObject)) {
                c0949.f2566.m899(c0946.f2545, null);
            }
            jSONArray.put(jSONObject);
        }
        C0933 c0933 = c0949.f2565;
        c0933.f2513.post(new C0934(c0933, c0949.f2567.f3040.m753(), jSONArray, new C1091(c0949, jSONArray, arrayList, c1144)));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m727(C0607 c0607) {
        this.f2561.add(c0607);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m726(C0564 c0564) {
        this.f2560.add(c0564);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m728(String str, JSONObject jSONObject) {
        m729(str, jSONObject, null, null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m714(C0949 c0949) {
        synchronized (c0949) {
            if (c0949.m722() && !TextUtils.isEmpty(c0949.f2565.f1140.m362()) && !c0949.m724()) {
                c0949.m718();
                AbstractC0509.m495(f2552, StringFog.decrypt("jeqi1QeWYNy7+anfGosnmqzgoZENmWSUuw==\n", "3o/MsW74B/w=\n"));
                C1258 c1258 = c0949.f2566;
                int iM698 = c0949.m725().m698();
                C1138 c1138 = new C1138(c0949);
                c1258.getClass();
                C0969.m739().post(new C1315(c1258, iM698, c1138));
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized C0928 m725() {
        return ((C1082) AbstractC1081.m765()).f3129;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m731(boolean z) {
        try {
            if (z) {
                this.f2564.removeCallbacksAndMessages(null);
                this.f2564.postDelayed(new C1148(this), 0L);
            } else {
                C1258 c1258 = this.f2566;
                C0950 c0950 = new C0950(this);
                c1258.getClass();
                C0969.m739().post(new C1287(c1258, c0950));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m730(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C0928 c0928M725 = m725();
        C1127 c1127 = c0928M725.f2543;
        JSONObject jSONObject3 = c1127.f3271;
        String str = c1127.f3273;
        List arrayList = new ArrayList();
        String str2 = AbstractC1125.f3265;
        JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            arrayList = AbstractC1125.m831(jSONArrayOptJSONArray);
        }
        synchronized (c0928M725) {
            jSONObject2 = c0928M725.f2544;
        }
        String strDecrypt = StringFog.decrypt("qzma\n", "zU3i9Plfxf8=\n");
        List arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(strDecrypt);
        if (jSONArrayOptJSONArray2 != null) {
            arrayList2 = AbstractC1125.m831(jSONArrayOptJSONArray2);
        }
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
    }
}
