package defpackage;

import com.google.android.gms.internal.ads.zzatj;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzauw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fw3 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public fw3(String str, zzatj zzatjVar) {
        String str2 = zzatjVar.b;
        long j = zzatjVar.c;
        long j2 = zzatjVar.d;
        long j3 = zzatjVar.e;
        long j4 = zzatjVar.f;
        ?? arrayList = zzatjVar.h;
        if (arrayList == 0) {
            Map map = zzatjVar.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzats((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static fw3 a(gw3 gw3Var) throws IOException {
        List arrayList;
        if (zzauw.e(gw3Var) == 538247942) {
            String strI = zzauw.i(gw3Var);
            String strI2 = zzauw.i(gw3Var);
            long jG = zzauw.g(gw3Var);
            long jG2 = zzauw.g(gw3Var);
            long jG3 = zzauw.g(gw3Var);
            long jG4 = zzauw.g(gw3Var);
            int iE = zzauw.e(gw3Var);
            if (iE >= 0) {
                if (iE == 0) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < iE; i++) {
                    list.add(new zzats(zzauw.i(gw3Var).intern(), zzauw.i(gw3Var).intern()));
                }
                return new fw3(strI, strI2, jG, jG2, jG3, jG4, list);
            }
            dr0.h(pv1.l(iE, "readHeaderList size=", new StringBuilder(String.valueOf(iE).length() + 20)));
            return null;
        }
        throw new IOException();
    }

    public fw3(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
