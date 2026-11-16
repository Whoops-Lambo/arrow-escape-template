package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zabb {
    private final zaba zaa;

    public abstract void zaa();

    public zabb(zaba zabaVar) {
        this.zaa = zabaVar;
    }

    public final void zab(zabd zabdVar) {
        zabdVar.zat().lock();
        try {
            if (zabdVar.zau() == this.zaa) {
                zaa();
            }
        } finally {
            zabdVar.zat().unlock();
        }
    }
}
