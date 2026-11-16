package io.p071bidmachine.rendering.model;

import defpackage.rc1;
import defpackage.wr0;
import io.p071bidmachine.util.o;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends rc1 implements wr0 {
    public static final k0 j;
    public static final k0 k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new k0(i, 0);
        k = new k0(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return o.c(str);
            default:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(p.B(str2));
        }
    }
}
