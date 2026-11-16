package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yt4 extends u12 {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(au4.class, Set.class, CmcdData.STREAMING_FORMAT_HLS);
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(au4.class, "i");

    @Override // defpackage.u12
    public final void y(xt4 xt4Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(xt4Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(xt4Var) == null);
    }

    @Override // defpackage.u12
    public final int z(xt4 xt4Var) {
        return t.decrementAndGet(xt4Var);
    }
}
