package defpackage;

import com.google.android.gms.internal.ads.zzhaj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class nq4 implements zzhaj {
    public transient Set a;
    public transient Collection b;
    public transient Map c;

    public abstract Map d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhaj) {
            return zzu().equals(((zzhaj) obj).zzu());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public Map zzu() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.c = mapD;
        return mapD;
    }

    public boolean f(Object obj) {
        Iterator it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }
}
