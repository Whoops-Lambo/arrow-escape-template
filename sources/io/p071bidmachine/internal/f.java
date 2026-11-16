package io.p071bidmachine.internal;

import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.util.file.b;
import io.p071bidmachine.util.version.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends rc1 implements sr0 {
    public static final f j;
    public static final f k;
    public static final f l;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new f(i, 0);
        k = new f(i, 1);
        l = new f(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        switch (this.i) {
            case 0:
                return Long.valueOf(System.currentTimeMillis());
            case 1:
                a aVarQ = c.q("3.8.0");
                if (aVarQ != null) {
                    return aVarQ;
                }
                io.p071bidmachine.core.a.d.m("Unexpected version parsing error: 3.8.0");
                return new a(0, 0, 0);
            default:
                return new b();
        }
    }
}
