package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.zzbo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class nx3 extends zzbo {
    public final /* synthetic */ int b;

    @Override // com.google.android.gms.internal.play_billing.zzbo
    public final long a() {
        switch (this.b) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
