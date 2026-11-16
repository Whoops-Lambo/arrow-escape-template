package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i71 extends f71 {
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i71(int i, int i2, int i3) {
        super(0);
        boolean z = false;
        this.b = i3;
        this.c = i2;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.d = z;
        this.e = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // defpackage.f71
    public final int nextInt() {
        int i = this.e;
        if (i != this.c) {
            this.e = this.b + i;
            return i;
        }
        if (this.d) {
            this.d = false;
            return i;
        }
        d.v();
        return 0;
    }
}
