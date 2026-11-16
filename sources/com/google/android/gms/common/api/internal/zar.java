package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class zar {
    final /* synthetic */ BasePendingResult zaa;

    public final void finalize() throws Throwable {
        BasePendingResult.zal(this.zaa.zam());
        super.finalize();
    }

    public /* synthetic */ zar(BasePendingResult basePendingResult, byte[] bArr) {
        Objects.requireNonNull(basePendingResult);
        this.zaa = basePendingResult;
    }
}
