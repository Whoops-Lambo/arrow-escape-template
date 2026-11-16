package io.p071bidmachine.rendering.internal.event;

import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, int i) {
        super(0);
        this.i = i;
        this.j = str;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        String str = this.j;
        switch (i) {
            case 0:
            case 1:
                return str;
            case 2:
                return "target - ".concat(str);
            case 3:
                return "Starting download " + str;
            case 4:
                return "Download success: " + str;
            default:
                return "Active download detected: " + str;
        }
    }
}
