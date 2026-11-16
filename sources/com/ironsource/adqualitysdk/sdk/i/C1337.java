package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｿ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1337 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1325 f4004;

    public C1337(C1325 c1325) {
        this.f4004 = c1325;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C1325 c1325 = this.f4004;
        if (!c1325.f3942) {
            c1325.f3939 = null;
            return;
        }
        HashMap map = new HashMap(c1325.f3941);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            this.f4004.f3940.post((Runnable) map.get((InterfaceC0555) it.next()));
        }
        C1325 c1326 = this.f4004;
        if (c1326.f3939 == null) {
            c1326.f3939 = new ChoreographerFrameCallbackC1340(this);
        }
        Choreographer.getInstance().postFrameCallback(this.f4004.f3939);
    }
}
