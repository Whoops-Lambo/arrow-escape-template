package defpackage;

import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.SequenceableLoader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zl1 implements MediaPeriod.Callback {
    public final /* synthetic */ am1 a;

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public final void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        this.a.d.d.c.obtainMessage(2).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        bm1 bm1Var = this.a.d;
        bm1Var.d.d.m(mediaPeriod.getTrackGroups());
        bm1Var.d.c.obtainMessage(3).sendToTarget();
    }

    public zl1(am1 am1Var) {
        this.a = am1Var;
    }
}
