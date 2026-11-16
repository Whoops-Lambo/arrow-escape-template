package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class w9 extends y9 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public w9(int i, long j) {
        super(i, 0);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final w9 f(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w9 w9Var = (w9) arrayList.get(i2);
            if (w9Var.b == i) {
                return w9Var;
            }
        }
        return null;
    }

    public final x9 g(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            x9 x9Var = (x9) arrayList.get(i2);
            if (x9Var.b == i) {
                return x9Var;
            }
        }
        return null;
    }

    @Override // defpackage.y9
    public final String toString() {
        return y9.b(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
