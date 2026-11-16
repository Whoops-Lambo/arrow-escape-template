package defpackage;

import com.google.android.gms.internal.ads.zzhns;
import com.google.android.gms.internal.ads.zzhny;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class uv4 {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(uv4 uv4Var, int i) {
        zzhns.a(this.a, uv4Var.a, i);
        zzhns.a(this.b, uv4Var.b, i);
        zzhns.a(this.c, uv4Var.c, i);
    }

    public uv4() {
        uv4 uv4Var = zzhny.a;
        this.a = Arrays.copyOf(uv4Var.a, 10);
        this.b = Arrays.copyOf(uv4Var.b, 10);
        this.c = Arrays.copyOf(uv4Var.c, 10);
    }

    public uv4(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
