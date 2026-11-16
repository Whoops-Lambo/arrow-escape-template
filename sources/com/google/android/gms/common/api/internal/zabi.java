package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zabi implements Runnable {
    final /* synthetic */ zabj zaa;

    @Override // java.lang.Runnable
    public final void run() {
        zabk zabkVar = this.zaa.zaa;
        zabkVar.zaz().disconnect(zabkVar.zaz().getClass().getName().concat(" disconnecting because it was signed out."));
    }

    public zabi(zabj zabjVar) {
        Objects.requireNonNull(zabjVar);
        this.zaa = zabjVar;
    }
}
