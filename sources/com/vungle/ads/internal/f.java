package com.vungle.ads.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends h {
    public f() {
        super("PLAYING", 3, 0);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "playing";
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h hVar) {
        hVar.getClass();
        if (hVar != h.e && hVar != h.f && hVar != h.g && hVar != h.c) {
            return false;
        }
        return true;
    }
}
