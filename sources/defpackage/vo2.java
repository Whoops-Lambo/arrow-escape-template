package defpackage;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vo2 extends ResourcesCompat.FontCallback {
    public final /* synthetic */ yo2 a;
    public final /* synthetic */ xo2 b;

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    public final void b(int i) {
        this.b.m = true;
        this.a.a(i);
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    public final void c(Typeface typeface) {
        xo2 xo2Var = this.b;
        Typeface typefaceCreate = Typeface.create(typeface, xo2Var.c);
        xo2Var.n = typefaceCreate;
        xo2Var.m = true;
        this.a.b(typefaceCreate, false);
    }

    public vo2(xo2 xo2Var, yo2 yo2Var) {
        this.b = xo2Var;
        this.a = yo2Var;
    }
}
