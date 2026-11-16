package defpackage;

import com.google.android.gms.internal.measurement.zzaag;
import com.google.android.gms.internal.measurement.zzaal;
import com.google.android.gms.internal.measurement.zzaas;
import com.google.android.gms.internal.measurement.zzxz;
import com.google.android.gms.internal.measurement.zzyw;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cl3 extends zzaag {
    public final Level b;
    public final Set c;
    public final gd5 d;

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl3(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = zzaas.f;
        this.b = level;
        this.c = zzaas.f;
        this.d = zzaas.g;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        String strA = (String) zzxzVar.j().d(zzyw.c);
        if (strA == null) {
            strA = this.a;
        }
        if (strA == null) {
            strA = zzxzVar.g().a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        zzaas.e(zzxzVar, zzaal.a(strA), this.b, this.c, this.d);
    }
}
