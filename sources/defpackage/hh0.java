package defpackage;

import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hh0 implements Map.Entry, ec1 {
    public final Object a;
    public Object b;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (s71.b(entry.getKey(), this.a) && s71.b(entry.getValue(), this.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.a;
        obj.getClass();
        int iHashCode = obj.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        Object obj2 = this.b;
        obj2.getClass();
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.b = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(G5.U);
        sb.append(this.b);
        return sb.toString();
    }

    public hh0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
