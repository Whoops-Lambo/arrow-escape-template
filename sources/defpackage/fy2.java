package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fy2 extends qy1 {
    public long[] a;
    public int b;

    @Override // defpackage.qy1
    public final Object a() {
        return new ey2(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.qy1
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.qy1
    public final int d() {
        return this.b;
    }
}
