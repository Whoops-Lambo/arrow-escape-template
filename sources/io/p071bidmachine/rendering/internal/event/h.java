package io.p071bidmachine.rendering.internal.event;

import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, String str2, int i) {
        super(0);
        this.i = i;
        this.j = str;
        this.k = str2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        String str = this.k;
        String str2 = this.j;
        switch (i) {
            case 0:
                return "target - " + str2 + ", " + str;
            default:
                return "target - " + str2 + ", value - " + str;
        }
    }
}
