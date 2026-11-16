package io.p071bidmachine;

import defpackage.jc1;
import io.p071bidmachine.utils.a;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l1 implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    public /* synthetic */ l1(int i, a aVar, int i2) {
        this.a = i2;
        this.b = i;
        this.c = aVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        a aVar = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                int i3 = aVar.a;
                String str = aVar.b;
                StringBuilder sbT = jc1.t("Dispatching error event to server - (", i2, "-", i3, ") - ");
                sbT.append(str);
                return sbT.toString();
            default:
                return "Sending error event to server - " + i2 + ", error - " + aVar;
        }
    }
}
