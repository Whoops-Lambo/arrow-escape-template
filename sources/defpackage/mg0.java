package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 {
    public final rg0 a;
    public final byte[] b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg0)) {
            return false;
        }
        mg0 mg0Var = (mg0) obj;
        if (this.a.equals(mg0Var.a)) {
            return Arrays.equals(this.b, mg0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }

    public mg0(rg0 rg0Var, byte[] bArr) {
        if (rg0Var != null) {
            if (bArr != null) {
                this.a = rg0Var;
                this.b = bArr;
                return;
            } else {
                d.w("bytes is null");
                throw null;
            }
        }
        d.w("encoding is null");
        throw null;
    }
}
