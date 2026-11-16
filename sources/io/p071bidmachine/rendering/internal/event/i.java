package io.p071bidmachine.rendering.internal.event;

import defpackage.m32;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ m32 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m32 m32Var, int i) {
        super(0);
        this.i = i;
        this.j = m32Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        m32 m32Var = this.j;
        switch (i) {
            case 0:
                return (String) m32Var.a;
            default:
                return "Check failed: view is completely clipped - " + m32Var.a;
        }
    }
}
