package io.p071bidmachine.util.log;

import defpackage.sr0;
import io.p071bidmachine.util.r;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {
    public final String a;
    public final b b;

    public d(String str) {
        a aVar = c.a;
        aVar.getClass();
        this.a = str;
        this.b = aVar;
    }

    @Override // io.p071bidmachine.util.log.b
    public final void b(Object obj, r rVar) {
        if (obj == null) {
            obj = this.a;
        }
        this.b.b(obj, rVar);
    }

    @Override // io.p071bidmachine.util.log.b
    public final void c(Object obj, sr0 sr0Var) {
        if (obj == null) {
            obj = this.a;
        }
        this.b.c(obj, sr0Var);
    }

    @Override // io.p071bidmachine.util.log.b
    public final void d(Object obj, sr0 sr0Var) {
        if (obj == null) {
            obj = this.a;
        }
        this.b.d(obj, sr0Var);
    }
}
