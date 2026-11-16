package defpackage;

import com.google.android.gms.internal.ads.zziii;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xy4 implements Map.Entry {
    public final Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        yy4 yy4Var = (yy4) this.a.getValue();
        if (yy4Var == null) {
            return null;
        }
        return yy4Var.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zziii)) {
            d.r("Lazy field only supports MessageLite values.");
            return null;
        }
        Map.Entry entry = this.a;
        zziii zziiiVar = ((yy4) entry.getValue()).d;
        entry.setValue(new yy4((zziii) obj));
        return zziiiVar;
    }

    public /* synthetic */ xy4(Map.Entry entry) {
        this.a = entry;
    }
}
