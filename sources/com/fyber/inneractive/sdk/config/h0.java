package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements Runnable {
    public final /* synthetic */ IAConfigManager a;

    public h0(IAConfigManager iAConfigManager) {
        this.a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar;
        IAConfigManager iAConfigManager = this.a;
        if (iAConfigManager.q == null) {
            iAConfigManager.q = k.a(iAConfigManager.g);
        }
        IAConfigManager iAConfigManager2 = this.a;
        m mVar = iAConfigManager2.C;
        if (mVar == null) {
            IAlog.a("%sDtLocationHeadersStore is null when loadLocationHeadersSnapshot called", IAlog.a(iAConfigManager2));
        } else {
            try {
                Map mapUnmodifiableMap = Collections.unmodifiableMap(mVar.a.a.a.getAll());
                Object obj = mapUnmodifiableMap.get("IADtCountry");
                Integer numValueOf = null;
                String str = obj instanceof String ? (String) obj : null;
                Object obj2 = mapUnmodifiableMap.get("IADtIsGdpr");
                if (obj2 instanceof Integer) {
                    Integer num = (Integer) obj2;
                    int iIntValue = num.intValue();
                    if (iIntValue == 0 || iIntValue == 1) {
                        numValueOf = num;
                    }
                } else if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            int i = Integer.parseInt(str2.trim());
                            if (i == 1 || i == 0) {
                                numValueOf = Integer.valueOf(i);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                IAlog.a("DtLocationHeadersStore: loaded location headers: country=%s, isGdpr=%s", str, numValueOf);
                lVar = new l(str, numValueOf);
            } catch (Throwable th) {
                IAlog.a("DtLocationHeadersStore: failed to load persisted location headers", th, new Object[0]);
                lVar = l.b;
            }
            iAConfigManager2.f = lVar.a;
        }
        com.fyber.inneractive.sdk.util.r.b.post(new g0(this));
    }
}
