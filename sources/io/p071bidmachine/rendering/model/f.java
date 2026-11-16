package io.p071bidmachine.rendering.model;

import io.p071bidmachine.rendering.internal.adform.countdown.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public final float a;
    public final g b;
    public final a c;
    public final boolean d;

    public f(float f, g gVar, a aVar) {
        boolean z;
        this.a = f;
        this.b = gVar;
        this.c = aVar;
        if ((gVar instanceof r) && ((r) gVar).a.a) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }
}
