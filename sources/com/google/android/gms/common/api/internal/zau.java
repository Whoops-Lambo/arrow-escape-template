package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class zau implements Runnable {
    final /* synthetic */ zax zaa;

    @Override // java.lang.Runnable
    public final void run() {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    public zau(zax zaxVar) {
        Objects.requireNonNull(zaxVar);
        this.zaa = zaxVar;
    }
}
