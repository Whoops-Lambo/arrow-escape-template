package io.p071bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public final Object a;
    public final Bitmap b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s71.b(this.a, hVar.a) && s71.b(this.b, hVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Bitmap bitmap = this.b;
        return iHashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public /* synthetic */ h(Bitmap bitmap, int i) {
        this((Object) null, (i & 2) != 0 ? null : bitmap);
    }

    public final String toString() {
        return "CollectResult(result=" + this.a + ", bitmapToRecycle=" + this.b + ')';
    }

    public h(Object obj, Bitmap bitmap) {
        this.a = obj;
        this.b = bitmap;
    }
}
