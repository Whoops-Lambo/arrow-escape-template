package io.p071bidmachine.rendering.internal.controller;

import defpackage.cz;
import io.p071bidmachine.rendering.internal.a0;
import io.p071bidmachine.rendering.internal.e;
import io.p071bidmachine.rendering.internal.i;
import io.p071bidmachine.rendering.internal.j;
import io.p071bidmachine.rendering.utils.d;
import io.p071bidmachine.rendering.utils.taskmanager.b;
import io.p071bidmachine.util.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y implements a0 {
    public final /* synthetic */ cz a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p071bidmachine.util.k
    public final void t() {
        i iVar = new i((j) ((e) this.b));
        long j = this.c;
        iVar.a = j;
        iVar.b = System.currentTimeMillis() + j;
        long j2 = iVar.a;
        if (j2 <= 0) {
            d.a(iVar);
            return;
        }
        d.a.getClass();
        try {
            if (iVar instanceof c) {
                ((c) iVar).a(false);
            }
        } catch (Throwable unused) {
        }
        b.a.postDelayed(iVar, j2);
    }

    public y(Object obj, cz czVar, long j) {
        this.b = obj;
        this.c = j;
        this.a = czVar;
    }
}
