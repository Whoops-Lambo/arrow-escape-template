package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgzw;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class as4 extends nq4 implements zzgzw, Serializable {
    public final transient Map d;
    public transient int e;
    public final transient yr4 f;

    @Override // defpackage.nq4
    public final Map d() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new hq4(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new kq4(this, (SortedMap) map) : new u1(this, map);
    }

    public final void g() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }

    public as4(Map map, yr4 yr4Var) {
        zzgvz.a(map.isEmpty());
        this.d = map;
        this.f = yr4Var;
    }
}
