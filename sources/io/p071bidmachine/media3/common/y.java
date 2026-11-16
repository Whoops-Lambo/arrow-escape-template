package io.p071bidmachine.media3.common;

import com.explorestack.protobuf.z;
import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.util.x;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y {
    public final String a;
    public final v b;
    public final u c;
    public final b0 d;
    public final s e;
    public final w f;

    static {
        q qVar = new q();
        z21 z21Var = d31.b;
        y32 y32Var = y32.e;
        List list = Collections.EMPTY_LIST;
        y32 y32Var2 = y32.e;
        t tVar = new t();
        w wVar = w.a;
        qVar.a();
        tVar.a();
        b0 b0Var = b0.B;
        z.p(0, 1, 2, 3, 4);
        x.G(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Objects.equals(this.a, yVar.a) && this.e.equals(yVar.e) && Objects.equals(this.b, yVar.b) && this.c.equals(yVar.c) && Objects.equals(this.d, yVar.d) && Objects.equals(this.f, yVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v vVar = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }

    public y(String str, s sVar, v vVar, u uVar, b0 b0Var, w wVar) {
        this.a = str;
        this.b = vVar;
        this.c = uVar;
        this.d = b0Var;
        this.e = sVar;
        this.f = wVar;
    }
}
