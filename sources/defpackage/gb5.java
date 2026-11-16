package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gb5 {
    public int a;
    public final int b;
    public gb5 c;
    public final HashMap d = new HashMap(0);

    public gb5(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
            return;
        }
        e32.a();
        throw null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return pv1.l(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
