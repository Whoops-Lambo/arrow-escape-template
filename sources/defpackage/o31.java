package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class o31 extends t21 {
    public q31 i() {
        int i = this.b;
        if (i == 0) {
            int i2 = q31.c;
            return e42.j;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            q31 q31VarX = q31.x(i, objArr);
            this.b = q31VarX.size();
            this.c = true;
            return q31VarX;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = q31.c;
        return new mg2(obj);
    }

    @Override // defpackage.t21
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o31 c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public o31 h(Iterable iterable) {
        iterable.getClass();
        d(iterable);
        return this;
    }
}
