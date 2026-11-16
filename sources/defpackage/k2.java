package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k2 extends y12 {
    public abstract Random j();

    @Override // defpackage.y12
    public final int a(int i) {
        return (j().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.y12
    public final int d() {
        return j().nextInt();
    }

    @Override // defpackage.y12
    public final long g() {
        return j().nextLong();
    }
}
