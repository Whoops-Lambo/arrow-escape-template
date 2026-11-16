package com.facebook.ads.redexgen.X;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class WQ implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ WR A00;
    public final /* synthetic */ C18368h A01;

    public WQ(WR wr, C18368h c18368h) {
        this.A00 = wr;
        this.A01 = c18368h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
