package androidx.compose.runtime;

import defpackage.e32;
import defpackage.sy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock a(sy syVar) {
        syVar.getClass();
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) syVar.get(MonotonicFrameClock.Key.a);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        e32.i("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }
}
