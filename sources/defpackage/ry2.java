package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ry2 extends qy1 {
    public short[] a;
    public int b;

    @Override // defpackage.qy1
    public final Object a() {
        return new qy2(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.qy1
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.qy1
    public final int d() {
        return this.b;
    }
}
