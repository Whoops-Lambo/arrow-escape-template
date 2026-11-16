package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzez {
    public static final zzez c = new zzez(-1, -1);
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzez) {
            zzez zzezVar = (zzez) obj;
            if (this.a == zzezVar.a && this.b == zzezVar.b) {
                return true;
            }
        }
        return false;
    }

    static {
        new zzez(0, 0);
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i >>> 16) | (i << 16));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    public zzez(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzgvz.a(z);
        this.a = i;
        this.b = i2;
    }
}
