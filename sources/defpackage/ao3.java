package defpackage;

import com.google.android.gms.internal.measurement.zzael;
import com.google.android.gms.internal.measurement.zzafc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ao3 implements Map.Entry {
    public final Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzael zzaelVar = (zzael) this.a.getValue();
        if (zzaelVar == null) {
            return null;
        }
        zzaelVar.c(null);
        return zzaelVar.a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzafc)) {
            d.r("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        zzael zzaelVar = (zzael) this.a.getValue();
        zzafc zzafcVar = zzaelVar.a;
        zzaelVar.b = null;
        zzaelVar.a = (zzafc) obj;
        return zzafcVar;
    }

    public /* synthetic */ ao3(Map.Entry entry) {
        this.a = entry;
    }
}
