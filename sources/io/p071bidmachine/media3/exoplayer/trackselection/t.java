package io.p071bidmachine.media3.exoplayer.trackselection;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.y0;
import io.p071bidmachine.media3.exoplayer.a1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class t {
    public final int a;
    public final a1[] b;
    public final q[] c;
    public final y0 d;
    public final Object e;

    public final boolean a(t tVar, int i) {
        return tVar != null && Objects.equals(this.b[i], tVar.b[i]) && Objects.equals(this.c[i], tVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }

    public t(a1[] a1VarArr, q[] qVarArr, y0 y0Var, Object obj) {
        boolean z;
        if (a1VarArr.length == qVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        this.b = a1VarArr;
        this.c = (q[]) qVarArr.clone();
        this.d = y0Var;
        this.e = obj;
        this.a = a1VarArr.length;
    }
}
