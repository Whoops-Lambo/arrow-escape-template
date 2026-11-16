package com.bytedance.adsdk.ahm.rz;

import android.util.Pair;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class yo<T> {
    T ahm;
    T kgy;

    private static boolean ahm(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ahm(pair.first, this.kgy) && ahm(pair.second, this.ahm);
    }

    public int hashCode() {
        T t = this.kgy;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.ahm;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public void kgy(T t, T t2) {
        this.kgy = t;
        this.ahm = t2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.kgy);
        sb.append(" ");
        return jc1.p(sb, this.ahm, "}");
    }
}
