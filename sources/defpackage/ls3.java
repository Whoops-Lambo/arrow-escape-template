package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzamv;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ls3 implements Map.Entry {
    public final Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        ps3 ps3Var = (ps3) this.a.getValue();
        if (ps3Var == null) {
            return null;
        }
        return ps3Var.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzamv)) {
            d.r("Lazy field only supports MessageLite values.");
            return null;
        }
        zzamv zzamvVar = ((ps3) this.a.getValue()).d;
        this.a.setValue(new ps3((zzamv) obj));
        return zzamvVar;
    }

    public ls3(Map.Entry entry) {
        this.a = entry;
    }
}
