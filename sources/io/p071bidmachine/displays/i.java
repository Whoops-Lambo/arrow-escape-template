package io.p071bidmachine.displays;

import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ i(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                return jVar.c + " (" + jVar.d + ") - Header bidding collect fail: timeout";
            default:
                return jVar.c + " (" + jVar.d + ") - Header bidding collect finished";
        }
    }
}
