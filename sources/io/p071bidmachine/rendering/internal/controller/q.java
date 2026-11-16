package io.p071bidmachine.rendering.internal.controller;

import defpackage.cz;
import io.p071bidmachine.rendering.internal.a0;
import io.p071bidmachine.rendering.internal.d0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class q implements a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Integer d;

    public /* synthetic */ q(Object obj, cz czVar, Integer num, int i) {
        this.a = i;
        this.c = obj;
        this.d = num;
        this.b = czVar;
    }

    @Override // io.p071bidmachine.util.k
    public final void t() {
        int i = this.a;
        Integer num = this.d;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((d0) obj).c(num);
                break;
            default:
                ((d0) obj).b(num);
                break;
        }
    }
}
