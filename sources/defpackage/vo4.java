package defpackage;

import com.google.android.gms.internal.ads.zzguj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vo4 extends zzguj {
    public int a;
    public String b;
    public int c;
    public Boolean d;
    public byte e;

    public final wo4 a() {
        if (this.e == 3) {
            return new wo4(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.e & 2) == 0) {
            sb.append(" uiMode");
        }
        e32.i("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
