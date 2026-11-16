package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ff extends ik0 {
    public final byte[] a;
    public final byte[] b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ik0) {
            ik0 ik0Var = (ik0) obj;
            boolean z = ik0Var instanceof ff;
            ff ffVar = (ff) ik0Var;
            if (Arrays.equals(this.a, z ? ffVar.a : ffVar.a)) {
                ff ffVar2 = (ff) ik0Var;
                if (Arrays.equals(this.b, z ? ffVar2.b : ffVar2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }

    public ff(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }
}
