package defpackage;

import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class id1 implements Map.Entry {
    public Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.a.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.a.getValue()).setValue((MessageLite) obj);
        }
        d.r("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }
}
