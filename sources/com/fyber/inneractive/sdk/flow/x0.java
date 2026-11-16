package com.fyber.inneractive.sdk.flow;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class x0 {
    public static final x0 c = new x0(null);
    public final int a;
    public final int b;

    public final boolean a() {
        return this.a >= 0;
    }

    public x0(com.fyber.inneractive.sdk.response.e eVar) {
        this.a = -1;
        this.b = -1;
        if (eVar != null) {
            this.a = eVar.L;
            this.b = eVar.K;
        }
    }

    public static x0 a(com.fyber.inneractive.sdk.player.f fVar) {
        if (fVar != null) {
            return fVar.n;
        }
        return c;
    }
}
