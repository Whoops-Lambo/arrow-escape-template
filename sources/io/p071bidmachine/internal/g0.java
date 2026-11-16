package io.p071bidmachine.internal;

import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ g0(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                return "Not enough parameters - " + str2 + " (" + str + ')';
            case 1:
                str2.getClass();
                return "Unsupported animation direction - " + str2 + " (" + str + ')';
            case 2:
                str2.getClass();
                return "Unsupported animation base - " + str2 + " (" + str + ')';
            default:
                return "Unsupported animation easing - " + str2 + " (" + str + ')';
        }
    }
}
