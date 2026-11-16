package defpackage;

import com.google.android.gms.internal.consent_sdk.zzqz;
import com.google.android.gms.internal.consent_sdk.zzrq;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t65 implements Map.Entry {
    public final Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzqz) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzrq)) {
            d.r("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        zzqz zzqzVar = (zzqz) this.a.getValue();
        zzrq zzrqVar = zzqzVar.a;
        zzqzVar.b = null;
        zzqzVar.a = (zzrq) obj;
        return zzrqVar;
    }

    public /* synthetic */ t65(Map.Entry entry) {
        this.a = entry;
    }
}
