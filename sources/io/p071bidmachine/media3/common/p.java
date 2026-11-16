package io.p071bidmachine.media3.common;

import io.p071bidmachine.media3.common.util.x;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class p {
    public final String a;
    public final String b;

    static {
        x.G(0);
        x.G(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (Objects.equals(this.a, pVar.a) && Objects.equals(this.b, pVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public p(String str, String str2) {
        this.a = x.M(str);
        this.b = str2;
    }
}
