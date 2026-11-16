package defpackage;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class hr2 {
    public final eg a(xy1 xy1Var) {
        eg egVar = (eg) this;
        String str = egVar.a;
        if (str == null) {
            d.w("Null backendName");
            return null;
        }
        if (xy1Var != null) {
            return new eg(str, egVar.b, xy1Var);
        }
        d.w("Null priority");
        return null;
    }

    public final String toString() {
        eg egVar = (eg) this;
        byte[] bArr = egVar.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(egVar.a);
        sb.append(", ");
        sb.append(egVar.c);
        sb.append(", ");
        return nj.q(sb, strEncodeToString, ")");
    }
}
