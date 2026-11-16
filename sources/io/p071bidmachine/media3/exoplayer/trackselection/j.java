package io.p071bidmachine.media3.exoplayer.trackselection;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import defpackage.ss1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ o a;

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        ss1 ss1Var = o.i;
        this.a.d();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        ss1 ss1Var = o.i;
        this.a.d();
    }

    public j(o oVar) {
        this.a = oVar;
    }
}
