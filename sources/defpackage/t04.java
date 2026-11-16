package defpackage;

import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class t04 extends zzcc {
    public String a;
    public byte b;
    public int c;
    public int d;

    public final v04 a() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            return new v04(this.a, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        e32.i("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
