package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class F4 implements cp0 {
    public final /* synthetic */ J4 a;

    public F4(J4 j4) {
        this.a = j4;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        Config config = (Config) obj;
        this.a.a.b.put(config.getType(), config);
        J4 j4 = this.a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) j4.a.c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                T4 t4 = (T4) ((WeakReference) it.next()).get();
                if (t4 != null) {
                    t4.a(config);
                }
            }
        }
        j4.a.c.remove(config.getType());
        return az2.a;
    }
}
