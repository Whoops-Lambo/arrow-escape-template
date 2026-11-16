package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class no extends yo2 {
    public final Typeface a;
    public final wt b;
    public boolean c;

    @Override // defpackage.yo2
    public final void a(int i) {
        if (this.c) {
            return;
        }
        this.b.a(this.a);
    }

    @Override // defpackage.yo2
    public final void b(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    public no(wt wtVar, Typeface typeface) {
        this.a = typeface;
        this.b = wtVar;
    }
}
