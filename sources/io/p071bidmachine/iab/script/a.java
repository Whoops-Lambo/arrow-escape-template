package io.p071bidmachine.iab.script;

import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends rc1 implements sr0 {
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new a(i, 0);
        k = new a(i, 1);
        l = new a(i, 2);
        m = new a(i, 3);
        n = new a(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.sr0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.i) {
            case 0:
                return "WEB_MESSAGE_LISTENER not supported, skipping";
            case 1:
                return "can't evaluate js: WebView is destroyed";
            case 2:
                return "can't evaluate js: js is empty";
            case 3:
                return "evaluate js complete";
            default:
                return "loading url via javascript:";
        }
    }
}
