package defpackage;

import java.io.InvalidObjectException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d93 extends y12 implements Serializable {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    @Override // defpackage.y12
    public final int d() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.g;
        this.f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.g = i4;
        int i5 = this.h + 362437;
        this.h = i5;
        return i4 + i5;
    }

    public final void j() {
        if ((this.g | this.c | this.d | this.e | this.f) != 0) {
            return;
        }
        d.r("Initial state must have at least one non-zero element.");
    }

    private final Object readResolve() throws Throwable {
        try {
            j();
            return this;
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            thInitCause.getClass();
            throw thInitCause;
        }
    }

    @Override // defpackage.y12
    public final int a(int i) {
        return (d() >>> (32 - i)) & ((-i) >> 31);
    }
}
