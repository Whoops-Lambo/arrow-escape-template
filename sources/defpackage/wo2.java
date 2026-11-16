package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wo2 extends yo2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ yo2 c;
    public final /* synthetic */ xo2 d;

    @Override // defpackage.yo2
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.yo2
    public final void b(Typeface typeface, boolean z) {
        this.d.g(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }

    public wo2(xo2 xo2Var, Context context, TextPaint textPaint, yo2 yo2Var) {
        this.d = xo2Var;
        this.a = context;
        this.b = textPaint;
        this.c = yo2Var;
    }
}
