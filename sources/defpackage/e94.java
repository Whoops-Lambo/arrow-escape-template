package defpackage;

import com.google.android.gms.internal.ads.zzczb;
import com.google.android.gms.internal.ads.zzdro;
import com.google.android.gms.internal.ads.zzend;
import com.google.android.gms.internal.ads.zzene;
import com.google.android.gms.internal.ads.zzepj;
import com.google.android.gms.internal.ads.zzipe;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e94 implements zzczb {
    public final Map a;
    public final Map b;
    public final Map c;
    public final zzipe d;
    public final zzdro e;

    @Override // com.google.android.gms.internal.ads.zzczb
    public final zzend a(int i, String str) {
        zzend zzendVarA;
        zzend zzendVar = (zzend) this.a.get(str);
        if (zzendVar != null) {
            return zzendVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzepj zzepjVar = (zzepj) this.c.get(str);
            if (zzepjVar != null) {
                return new zzene(zzepjVar, xm4.j);
            }
            zzendVarA = (zzend) this.b.get(str);
            if (zzendVarA == null) {
                return null;
            }
        } else if (this.e.d == null || (zzendVarA = ((zzczb) this.d.zzb()).a(i, str)) == null) {
            return null;
        }
        return new zzene(zzendVarA, xm4.i);
    }

    public e94(Map map, Map map2, Map map3, zzipe zzipeVar, zzdro zzdroVar) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = zzipeVar;
        this.e = zzdroVar;
    }
}
