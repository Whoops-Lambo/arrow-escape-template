package defpackage;

import com.google.android.gms.internal.games_v2.zzgx;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class rp4 extends zzgx {
    public Object[] a;
    public int b;
    public boolean c;

    public final void c(int i) {
        int length = this.a.length;
        int iA = zzgx.a(length, this.b + i);
        if (iA > length || this.c) {
            this.a = Arrays.copyOf(this.a, iA);
            this.c = false;
        }
    }

    public rp4(int i) {
        h00.x(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void b(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }
}
