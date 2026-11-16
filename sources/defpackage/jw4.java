package defpackage;

import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jw4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzht b;
    public final /* synthetic */ String c;

    public /* synthetic */ jw4(zzht zzhtVar, String str, int i) {
        this.a = i;
        this.b = zzhtVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        zzht zzhtVar = this.b;
        switch (i) {
            case 0:
                return new zzu(new jw4(zzhtVar, str, 1));
            case 1:
                ow3 ow3Var = zzhtVar.b.c;
                zzpg.T(ow3Var);
                sr4 sr4VarX0 = ow3Var.x0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((zzic) zzhtVar.a).d.z();
                map.put("gmp_version", 161000L);
                if (sr4VarX0 != null) {
                    String strO = sr4VarX0.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(sr4VarX0.Q()));
                    map.put("dynamite_version", Long.valueOf(sr4VarX0.b()));
                }
                return map;
            default:
                ca4 ca4Var = new ca4(20, zzhtVar, str);
                zzn zznVar = new zzn("internal.remoteConfig");
                zznVar.b.put("getValue", new m25(zznVar, ca4Var));
                return zznVar;
        }
    }
}
