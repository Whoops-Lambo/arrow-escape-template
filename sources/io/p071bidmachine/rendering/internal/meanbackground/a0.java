package io.p071bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import defpackage.jc1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    public final Bitmap.Config a;
    public final int b;
    public final int c;
    public final p d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && this.b == a0Var.b && this.c == a0Var.c && s71.b(this.d, a0Var.d);
    }

    public a0(int i, int i2, p pVar) {
        Bitmap.Config config = Bitmap.Config.RGB_565;
        config.getClass();
        this.a = config;
        this.b = i;
        this.c = i2;
        this.d = pVar;
    }

    public final int hashCode() {
        return this.d.hashCode() + jc1.d(this.c, jc1.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Config(bitmapConfig=" + this.a + ", minDimensionPx=" + this.b + ", maxDimensionPx=" + this.c + ", scalingStrategy=" + this.d + ')';
    }
}
