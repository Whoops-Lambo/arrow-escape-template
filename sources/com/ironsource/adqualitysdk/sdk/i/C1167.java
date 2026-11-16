package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.冫, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1167 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1150 f3378;

    public C1167(C1150 c1150) {
        this.f3378 = c1150;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        for (ISAdQualityInitListener iSAdQualityInitListener : this.f3378.f3339) {
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitSuccess();
            }
        }
        this.f3378.f3339.clear();
    }
}
