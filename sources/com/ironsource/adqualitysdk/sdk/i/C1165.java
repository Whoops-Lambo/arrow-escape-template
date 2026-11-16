package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import java.util.Set;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.亠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1165 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f3373;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityInitError f3374;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Set f3375;

    public C1165(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        this.f3375 = set;
        this.f3374 = iSAdQualityInitError;
        this.f3373 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        for (ISAdQualityInitListener iSAdQualityInitListener : this.f3375) {
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitFailed(this.f3374, this.f3373);
            }
        }
        this.f3375.clear();
    }
}
