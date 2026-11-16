package defpackage;

import com.google.android.gms.internal.common.zzz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ok3 implements zzz {
    public volatile zzz a;

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "<supplier that returned null>";
        }
        String string = obj.toString();
        return jc1.o("Suppliers.memoize(", string, new StringBuilder(string.length() + 19), ")");
    }
}
