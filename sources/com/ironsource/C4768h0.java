package com.ironsource;

import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import defpackage.e80;
import defpackage.mc3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4768h0 implements ImpressionDataListener {

    @NotNull
    private final AdQualityBridge a;

    @NotNull
    private final C5083yb b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4768h0 c4768h0, C4687c9 c4687c9) {
        c4768h0.a.sendCustomMediationRevenue$mediationsdk_release(c4687c9);
    }

    public C4768h0(@NotNull AdQualityBridge adQualityBridge, @NotNull C5083yb c5083yb) {
        adQualityBridge.getClass();
        c5083yb.getClass();
        this.a = adQualityBridge;
        this.b = c5083yb;
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(@NotNull C4687c9 c4687c9) {
        c4687c9.getClass();
        this.b.a(new mc3(9, this, c4687c9));
    }

    public /* synthetic */ C4768h0(AdQualityBridge adQualityBridge, C5083yb c5083yb, int i, e80 e80Var) {
        this(adQualityBridge, (i & 2) != 0 ? new C5083yb() : c5083yb);
    }
}
