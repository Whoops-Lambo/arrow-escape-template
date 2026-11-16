package defpackage;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ut0 {
    public static final ut0 g = new ut0(4201, 4096, 1);
    public static final ut0 h = new ut0(1033, 1024, 1);
    public static final ut0 i = new ut0(67, 64, 1);
    public static final ut0 j = new ut0(19, 16, 1);
    public static final ut0 k = new ut0(285, 256, 0);
    public static final ut0 l = new ut0(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 256, 1);
    public final int[] a;
    public final int[] b;
    public final vt0 c;
    public final int d;
    public final int e;
    public final int f;

    public final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return h50.l(sb, this.d, ')');
    }

    public ut0(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new vt0(this, new int[]{0});
    }
}
