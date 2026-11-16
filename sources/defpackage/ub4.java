package defpackage;

import com.google.android.gms.internal.ads.zzecb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ub4 extends zzecb {
    public long a;
    public int b;
    public byte c;

    public final vb4 a() {
        if (this.c == 3) {
            return new vb4(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" id");
        }
        if ((this.c & 2) == 0) {
            sb.append(" eventType");
        }
        e32.i("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
