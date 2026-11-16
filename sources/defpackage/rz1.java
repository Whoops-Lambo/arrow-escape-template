package defpackage;

import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rz1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ rz1(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                nVar.e();
                break;
            case 1:
                if (!nVar.L) {
                    ((MediaPeriod.Callback) Assertions.checkNotNull(nVar.q)).onContinueLoadingRequested(nVar);
                }
                break;
            default:
                nVar.F = true;
                break;
        }
    }
}
