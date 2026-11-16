package com.vungle.ads.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends h {
    public e() {
        super("NEW", 0, 0);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "idle";
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h hVar) {
        hVar.getClass();
        if (hVar != h.b && hVar != h.c && hVar != h.g) {
            return false;
        }
        return true;
    }
}
