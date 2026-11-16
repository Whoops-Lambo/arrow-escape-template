package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class n implements f {
    private final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        private final boolean a;

        public boolean a() {
            return this.a;
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) throws Exception {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.f())) {
            try {
                String strF = eVar.f();
                if (this.a.containsKey(strF)) {
                    aVar = this.a.get(strF);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(strF));
                    this.a.put(strF, aVar2);
                    aVar = aVar2;
                }
                return aVar != null && aVar.a();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("TrackManager", "apply", e);
                }
            }
        }
        return false;
    }
}
