package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class wt {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt b;

    public /* synthetic */ wt(xt xtVar, int i) {
        this.a = i;
        this.b = xtVar;
    }

    public final void a(Typeface typeface) {
        int i = this.a;
        xt xtVar = this.b;
        switch (i) {
            case 0:
                if (xtVar.m(typeface)) {
                    xtVar.i(false);
                }
                break;
            default:
                if (xtVar.o(typeface)) {
                    xtVar.i(false);
                }
                break;
        }
    }
}
