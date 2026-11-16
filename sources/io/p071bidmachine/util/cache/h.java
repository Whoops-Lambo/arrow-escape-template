package io.p071bidmachine.util.cache;

import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends rc1 implements sr0 {
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new h(i, 0);
        k = new h(i, 1);
        l = new h(i, 2);
        m = new h(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.sr0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.i) {
            case 0:
                return "Cleanup is skipped due to empty eviction policy list";
            case 1:
                return "Cleanup is triggered by cache started event";
            case 2:
                return "Cleanup is triggered by low disk space event";
            default:
                return "Cleanup is triggered by new session event";
        }
    }
}
