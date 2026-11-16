package io.p071bidmachine.internal;

import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ o(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        r rVar = this.b;
        switch (i) {
            case 0:
                return "New session, milestone updated:\n" + rVar;
            default:
                return "Pause session, milestone updated:\n" + rVar;
        }
    }
}
