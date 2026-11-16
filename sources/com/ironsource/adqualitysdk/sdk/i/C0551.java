package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.з, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0551 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0517 f1316;

    public C0551(C0517 c0517) {
        this.f1316 = c0517;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C1189 c1189 = this.f1316.f1163;
        if (c1189 != null) {
            Handler handler = c1189.f3582;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            c1189.f3582 = null;
            this.f1316.f1163 = null;
        }
        this.f1316.getClass();
        HashMap map = this.f1316.f1164;
        if (map != null) {
            map.clear();
        }
    }
}
