package defpackage;

import com.google.android.gms.internal.play_billing.zzgh;
import com.google.android.gms.internal.play_billing.zzhb;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lk4 implements Map.Entry {
    public final Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzgh) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzhb)) {
            d.r("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        zzgh zzghVar = (zzgh) this.a.getValue();
        zzhb zzhbVar = zzghVar.a;
        zzghVar.b = null;
        zzghVar.a = (zzhb) obj;
        return zzhbVar;
    }

    public /* synthetic */ lk4(Map.Entry entry) {
        this.a = entry;
    }
}
