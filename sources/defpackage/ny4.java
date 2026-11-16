package defpackage;

import com.google.android.gms.internal.ads.zzgyr;
import com.google.android.gms.internal.ads.zzhai;
import com.google.android.gms.internal.ads.zzhbl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ny4 extends zzgyr {
    public final Map a;

    @Override // com.google.android.gms.internal.ads.zzgyr, com.google.android.gms.internal.ads.zzgys
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public final Map d() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final Set entrySet() {
        return zzhbl.b(this.a.entrySet(), dq3.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && zzhai.a(obj, this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.a.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final boolean isEmpty() {
        if (this.a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final Set keySet() {
        return zzhbl.b(this.a.keySet(), dq3.d);
    }

    public ny4(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = entrySet().iterator();
        vr4 vr4Var = new vr4(it, 1);
        if (obj == null) {
            while (it.hasNext()) {
                if (vr4Var.next() == null) {
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(vr4Var.next())) {
            }
        }
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final int hashCode() {
        return zzhbl.c(entrySet());
    }

    @Override // com.google.android.gms.internal.ads.zzgyr, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
