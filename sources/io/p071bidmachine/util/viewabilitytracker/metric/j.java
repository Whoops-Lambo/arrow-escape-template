package io.p071bidmachine.util.viewabilitytracker.metric;

import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.media3.common.util.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i) {
        super(0);
        this.i = i;
        this.j = kVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        k kVar = this.j;
        switch (i) {
            case 0:
                return "Check not supported (scope - " + b.g(kVar.a) + ')';
            default:
                return "Check not supported (scope - " + b.g(kVar.a) + ')';
        }
    }
}
