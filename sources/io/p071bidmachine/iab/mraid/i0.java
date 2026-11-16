package io.p071bidmachine.iab.mraid;

import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.media3.common.util.b;
import io.p071bidmachine.rendering.model.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ String j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, String str, int i, int i2) {
        super(0);
        this.i = i2;
        this.j = str;
        this.l = obj;
        this.k = i;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        int i2 = this.k;
        Object obj = this.l;
        String str = this.j;
        switch (i) {
            case 0:
                return "onError: " + str + " / " + ((String) obj) + " / " + i2;
            default:
                return "Could not find required params (" + str + ") for execute task (" + ((y) obj) + ", " + b.h(i2) + ')';
        }
    }
}
