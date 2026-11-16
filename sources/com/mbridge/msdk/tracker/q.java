package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class q implements l {
    private final g a;

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        return y.b(this.a) ? new long[]{0, 0} : this.a.a();
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.a)) {
            return;
        }
        try {
            h hVarI = eVar.i();
            if (y.a(hVarI)) {
                eVar.a(hVarI.a(eVar));
            }
            this.a.b(eVar);
        } catch (Exception e) {
            if (a.a) {
                Log.e("TrackManager", "process event error", e);
            }
        }
    }

    public q(g gVar) {
        this.a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.a)) {
            return;
        }
        this.a.a(eVar);
    }
}
