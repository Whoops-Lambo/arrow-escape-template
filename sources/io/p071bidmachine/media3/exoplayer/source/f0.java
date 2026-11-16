package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.common.util.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0 implements e {
    public final /* synthetic */ int a;
    public final /* synthetic */ io.p071bidmachine.media3.exoplayer.drm.e b;
    public final /* synthetic */ u c;
    public final /* synthetic */ z d;

    public /* synthetic */ f0(io.p071bidmachine.media3.exoplayer.drm.e eVar, u uVar, z zVar, int i) {
        this.a = i;
        this.b = eVar;
        this.c = uVar;
        this.d = zVar;
    }

    @Override // io.p071bidmachine.media3.common.util.e
    public final void accept(Object obj) {
        int i = this.a;
        z zVar = this.d;
        u uVar = this.c;
        io.p071bidmachine.media3.exoplayer.drm.e eVar = this.b;
        h0 h0Var = (h0) obj;
        switch (i) {
            case 0:
                h0Var.a(eVar.a, eVar.b, uVar, zVar);
                break;
            default:
                h0Var.g(eVar.a, eVar.b, uVar, zVar);
                break;
        }
    }
}
