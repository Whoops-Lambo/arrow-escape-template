package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zaay extends zabq {
    private final WeakReference zaa;

    @Override // com.google.android.gms.common.api.internal.zabq
    public final void zaa() {
        zaaz zaazVar = (zaaz) this.zaa.get();
        if (zaazVar == null) {
            return;
        }
        zaazVar.zai();
    }

    public zaay(zaaz zaazVar) {
        this.zaa = new WeakReference(zaazVar);
    }
}
