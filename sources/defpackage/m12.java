package defpackage;

import com.google.android.gms.internal.ads.zzbgr;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m12 {
    public static final m12 d;
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public m12(int i) {
        this.a = 6;
        this.b = 2;
        this.c = i;
    }

    static {
        int i = 0;
        d = new m12(i, i, 0);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(m12.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return nj.l(this.c, C4664b4.j.e, sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("MutableRange(start=");
                sb2.append(this.b);
                sb2.append(", end=");
                return h50.l(sb2, this.c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m12(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public m12(zzbgr zzbgrVar, int i, int i2) {
        this.a = 5;
        this.b = i;
        this.c = i2;
    }
}
