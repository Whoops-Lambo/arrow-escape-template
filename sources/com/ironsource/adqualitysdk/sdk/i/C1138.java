package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.PriorityQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ぃ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1138 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0949 f3321;

    public C1138(C0949 c0949) {
        this.f3321 = c0949;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m842(ArrayList arrayList) {
        JSONObject jSONObject;
        C0839 c0839;
        try {
            if (arrayList.isEmpty()) {
                C0949.m713(this.f3321);
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                priorityQueue.add(new C0946((C1327) obj));
            }
            ArrayList arrayList2 = new ArrayList();
            for (C0946 c0946 = (C0946) priorityQueue.poll(); c0946 != null; c0946 = (C0946) priorityQueue.poll()) {
                C0949 c0949 = this.f3321;
                c0949.getClass();
                AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
                synchronized (c0946) {
                    jSONObject = c0946.f2545.f3945;
                }
                String strOptString = jSONObject.optString(StringFog.decrypt("aE4dnw==\n", "GCJ68cCoiic=\n"));
                String str = c0949.f2554;
                C1082 c1082 = (C1082) abstractC1081M765;
                if (strOptString != null) {
                    c0839 = (C0839) c1082.mo781().get(strOptString);
                } else {
                    c1082.getClass();
                    c0839 = null;
                }
                if (c0839 != null && c0839.m626(str)) {
                    C1258 c1258 = this.f3321.f2566;
                    C1327 c1327 = c0946.f2545;
                    c1258.getClass();
                    C0969.m739().post(new C1262(c1258, c1327));
                } else {
                    if (TextUtils.isEmpty(c0946.m707())) {
                        c0946.m712(this.f3321.f2565.f1140.m362());
                    }
                    arrayList2.add(c0946);
                }
            }
            if (!arrayList2.isEmpty()) {
                C0949.m715(this.f3321, arrayList2, new C1144(this));
            }
        } catch (Exception unused) {
            C0949.m713(this.f3321);
        }
    }
}
