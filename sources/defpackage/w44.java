package defpackage;

import com.google.android.gms.internal.fido.zzcs;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w44 extends zzcs implements Serializable {
    public static final w44 a = new w44();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs d() {
        return m64.a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
