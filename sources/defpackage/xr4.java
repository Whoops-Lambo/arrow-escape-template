package defpackage;

import com.google.android.gms.internal.ads.zzhap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xr4 extends zzhap {
    public final /* synthetic */ Comparator a;

    public xr4(Comparator comparator) {
        this.a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final Map a() {
        return new TreeMap(this.a);
    }
}
