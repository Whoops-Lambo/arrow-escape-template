package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public final c a;
    public final g b;
    public final h c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && s71.b(this.b, dVar.b) && s71.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Button(buttonType=" + this.a + ", position=" + this.b + ", size=" + this.c + ')';
    }

    public d(c cVar, g gVar, h hVar) {
        cVar.getClass();
        gVar.getClass();
        hVar.getClass();
        this.a = cVar;
        this.b = gVar;
        this.c = hVar;
    }
}
