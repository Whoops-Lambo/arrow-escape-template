package io.p071bidmachine.iab.mraid;

import com.ironsource.C4664b4;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends rc1 implements sr0 {
    public static final l j;
    public static final l k;
    public static final l l;
    public static final l m;
    public static final l n;
    public static final l o;
    public static final l p;
    public static final l q;
    public static final l r;
    public static final l s;
    public static final l t;
    public static final l u;
    public static final l v;
    public static final l w;
    public static final l x;
    public static final l y;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new l(i, 0);
        k = new l(i, 1);
        l = new l(i, 2);
        m = new l(i, 3);
        n = new l(i, 4);
        o = new l(i, 5);
        p = new l(i, 6);
        q = new l(i, 7);
        r = new l(i, 8);
        s = new l(i, 9);
        t = new l(i, 10);
        u = new l(i, 11);
        v = new l(i, 12);
        w = new l(i, 13);
        x = new l(i, 14);
        y = new l(i, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.sr0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.i) {
            case 0:
                return "Callback - onClose";
            case 1:
                return "Callback - onLoaded";
            case 2:
                return "Callback - can't parse privacy sheet";
            case 3:
                return C4664b4.i.t0;
            case 4:
                return C4664b4.i.u0;
            case 5:
                return "setAudioMuted: not supported";
            case 6:
                return "onPageCommitVisible";
            case 7:
                return "onPageFinished";
            case 8:
                return "onPageStarted";
            case 9:
                return "onRenderProcessGone";
            case 10:
                return "handleJsCommand not found";
            case 11:
                return "Can't open url because webView wasn't clicked";
            case 12:
                return "url is null or empty";
            case 13:
                return "mraid.resize is not supported";
            case 14:
                return "data is null or empty";
            default:
                return "data must be base64 encoded json";
        }
    }
}
