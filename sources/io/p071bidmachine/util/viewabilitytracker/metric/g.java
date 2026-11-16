package io.p071bidmachine.util.viewabilitytracker.metric;

import android.view.View;
import defpackage.m32;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends rc1 implements sr0 {
    public final /* synthetic */ float i;
    public final /* synthetic */ i j;
    public final /* synthetic */ m32 k;
    public final /* synthetic */ View l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f, i iVar, m32 m32Var, View view) {
        super(0);
        this.i = f;
        this.j = iVar;
        this.k = m32Var;
        this.l = view;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return "Check failed: view is covered by another view (" + this.i + "% / " + this.j.b + "%) - " + this.k.a + ", overlapping view - " + this.l + ')';
    }
}
