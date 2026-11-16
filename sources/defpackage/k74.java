package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k74 implements zzlk {
    public final /* synthetic */ zzez a;

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void a(String str, Bundle bundle, String str2) {
        zzez zzezVar = this.a;
        zzezVar.a(new db4(zzezVar, str, str2, bundle, true));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void b(String str) {
        zzez zzezVar = this.a;
        zzezVar.a(new m84(zzezVar, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void c(String str, Bundle bundle, String str2) {
        zzez zzezVar = this.a;
        zzezVar.a(new h84(zzezVar, str, str2, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void d(Bundle bundle) {
        zzez zzezVar = this.a;
        zzezVar.a(new e84(zzezVar, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map e(String str, String str2, boolean z) {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new db4(zzezVar, str, str2, z, zzcmVar));
        Bundle bundleA1 = zzcmVar.A1(5000L);
        if (bundleA1 == null || bundleA1.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleA1.size());
        for (String str3 : bundleA1.keySet()) {
            Object obj = bundleA1.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int f(String str) {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new b94(zzezVar, str, zzcmVar, 1));
        Integer num = (Integer) zzcm.w3(Integer.class, zzcmVar.A1(10000L));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List g(String str, String str2) {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new h84(zzezVar, str, str2, zzcmVar, 1));
        List list = (List) zzcm.w3(List.class, zzcmVar.A1(5000L));
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new ha4(zzezVar, zzcmVar, 3, false));
        return zzcmVar.z1(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new ha4(zzezVar, zzcmVar, 4, false));
        return zzcmVar.z1(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new ha4(zzezVar, zzcmVar, 1));
        return zzcmVar.z1(50L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new ha4(zzezVar, zzcmVar, 0));
        return zzcmVar.z1(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.a.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        zzez zzezVar = this.a;
        zzezVar.a(new m84(zzezVar, str, 2));
    }

    public k74(zzez zzezVar) {
        this.a = zzezVar;
    }
}
