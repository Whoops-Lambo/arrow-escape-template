package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class g implements l {
    private final c a;
    private final s b;
    private final AtomicLong c = new AtomicLong(0);
    private final long[] d = new long[2];

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.c.incrementAndGet();
            this.d[0] = System.currentTimeMillis();
            this.d[1] = jIncrementAndGet;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.j());
            this.a.a(iVar);
            this.b.l();
            this.b.e();
            this.b.a(eVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e);
            }
        }
    }

    public g(c cVar, s sVar) {
        this.a = cVar;
        this.b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
