package defpackage;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kl2 extends m21 {
    public final Drawable a;
    public final l21 b;
    public final int c;
    public final MemoryCache$Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    @Override // defpackage.m21
    public final l21 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2)) {
            return false;
        }
        kl2 kl2Var = (kl2) obj;
        return s71.b(this.a, kl2Var.a) && s71.b(this.b, kl2Var.b) && this.c == kl2Var.c && s71.b(this.d, kl2Var.d) && s71.b(this.e, kl2Var.e) && this.f == kl2Var.f && this.g == kl2Var.g;
    }

    public final int hashCode() {
        int iC = (h50.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        MemoryCache$Key memoryCache$Key = this.d;
        int iHashCode = (iC + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + jc1.f((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public kl2(Drawable drawable, l21 l21Var, int i, MemoryCache$Key memoryCache$Key, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = l21Var;
        this.c = i;
        this.d = memoryCache$Key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }
}
