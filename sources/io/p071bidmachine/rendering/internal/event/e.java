package io.p071bidmachine.rendering.internal.event;

import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(d dVar, int i) {
        super(0);
        this.i = i;
        this.j = dVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        az2 az2Var = az2.a;
        d dVar = this.j;
        switch (i) {
            case 0:
                dVar.a();
                break;
            case 1:
                dVar.a();
                break;
            case 2:
                dVar.a();
                break;
            case 3:
                dVar.a();
                break;
            default:
                dVar.a();
                break;
        }
        return az2Var;
    }
}
