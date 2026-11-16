package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.rendering.utils.c;
import io.p071bidmachine.util.taskmanager.handler.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends rc1 implements sr0 {
    public static final k j;
    public static final k k;
    public static final k l;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new k(i, 0);
        k = new k(i, 1);
        l = new k(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        switch (this.i) {
            case 0:
                return new a();
            case 1:
                return new c();
            default:
                return new z();
        }
    }
}
