package io.p071bidmachine.internal;

import android.content.Context;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends rc1 implements wr0 {
    public static final g j;
    public static final g k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new g(i, 0);
        k = new g(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) throws InterruptedException {
        switch (this.i) {
            case 0:
                Thread.sleep(((Number) obj).longValue());
                return az2.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                return new e(context);
        }
    }
}
