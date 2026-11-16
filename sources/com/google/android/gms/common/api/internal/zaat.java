package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zaat implements com.google.android.gms.common.internal.zat {
    final /* synthetic */ zaaz zaa;

    @Override // com.google.android.gms.common.internal.zat
    public final boolean isConnected() {
        return this.zaa.isConnected();
    }

    public zaat(zaaz zaazVar) {
        Objects.requireNonNull(zaazVar);
        this.zaa = zaazVar;
    }
}
