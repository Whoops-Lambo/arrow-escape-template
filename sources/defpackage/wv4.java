package defpackage;

import com.google.android.gms.internal.ads.zzhny;
import com.google.android.gms.internal.ads.zzhof;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wv4 {
    public final xv4 a;
    public final long[] b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wv4(int i) {
        this(new xv4(), new long[10]);
        switch (i) {
            case 1:
                break;
            default:
                wv4 wv4Var = zzhny.b;
                this.a = new xv4(wv4Var.a);
                this.b = Arrays.copyOf(wv4Var.b, 10);
                break;
        }
    }

    public static void a(wv4 wv4Var, wv4 wv4Var2) {
        xv4 xv4Var = wv4Var2.a;
        xv4 xv4Var2 = wv4Var.a;
        long[] jArr = (long[]) xv4Var2.b;
        long[] jArr2 = (long[]) xv4Var.b;
        long[] jArr3 = wv4Var2.b;
        zzhof.e(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) xv4Var2.c;
        long[] jArr5 = (long[]) xv4Var.c;
        long[] jArr6 = (long[]) xv4Var.d;
        zzhof.e(jArr4, jArr5, jArr6);
        zzhof.e((long[]) xv4Var2.d, jArr6, jArr3);
        zzhof.e(wv4Var.b, jArr2, jArr5);
    }

    public /* synthetic */ wv4(xv4 xv4Var, long[] jArr) {
        this.a = xv4Var;
        this.b = jArr;
    }

    public wv4(wv4 wv4Var) {
        this(1);
        a(this, wv4Var);
    }
}
