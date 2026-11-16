package com.google.android.gms.internal.ads;

import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzx {
    public final String a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (Objects.equals(this.a, zzxVar.a) && Objects.equals(this.b, zzxVar.b)) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        q63.y(sb, "{ lang=", str, ", '", str2);
        sb.append("' }");
        return sb.toString();
    }

    public zzx(String str, String str2) {
        this.a = zzfq.q(str);
        this.b = str2;
    }
}
