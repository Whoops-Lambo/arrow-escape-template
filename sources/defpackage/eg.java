package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eg extends hr2 {
    public final String a;
    public final byte[] b;
    public final xy1 c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hr2) {
            hr2 hr2Var = (hr2) obj;
            eg egVar = (eg) hr2Var;
            if (this.a.equals(egVar.a)) {
                if (Arrays.equals(this.b, hr2Var instanceof eg ? ((eg) hr2Var).b : egVar.b) && this.c.equals(egVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public eg(String str, byte[] bArr, xy1 xy1Var) {
        this.a = str;
        this.b = bArr;
        this.c = xy1Var;
    }
}
