package io.p071bidmachine.rendering.utils;

import defpackage.sr0;
import io.p071bidmachine.t1;
import io.p071bidmachine.util.log.b;
import io.p071bidmachine.util.r;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements b {
    public static void e(Object obj, sr0 sr0Var) {
        if (t1.b) {
            if (obj != null) {
                t1.l(obj, (String) sr0Var.invoke(), false, new Object[0]);
            } else {
                t1.l(null, (String) sr0Var.invoke(), false, new Object[0]);
            }
        }
    }

    @Override // io.p071bidmachine.util.log.b
    public final void d(Object obj, sr0 sr0Var) {
        if (t1.b) {
            if (obj != null) {
                t1.l(obj, (String) sr0Var.invoke(), true, new Object[0]);
            } else {
                t1.l(null, (String) sr0Var.invoke(), true, new Object[0]);
            }
        }
    }

    @Override // io.p071bidmachine.util.log.b
    public final void b(Object obj, r rVar) {
        e(obj, rVar);
    }

    @Override // io.p071bidmachine.util.log.b
    public final void c(Object obj, sr0 sr0Var) {
        e(obj, sr0Var);
    }
}
