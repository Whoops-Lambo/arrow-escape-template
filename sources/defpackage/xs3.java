package defpackage;

import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzaib;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzanh;
import com.google.android.gms.internal.ads.zzv;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xs3 {
    public final zzane a;
    public final zzanh b;
    public final zzaia c;
    public final zzaib d;
    public final boolean e;
    public final boolean f;
    public int g;
    public zzv h;

    public xs3(zzane zzaneVar, zzanh zzanhVar, zzaia zzaiaVar) {
        boolean z;
        zzaib zzaibVar;
        this.a = zzaneVar;
        this.b = zzanhVar;
        this.c = zzaiaVar;
        int i = zzaneVar.b;
        zzv zzvVar = zzaneVar.g;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = Objects.equals(zzvVar.o, "application/x-itut-t35");
        if ("audio/true-hd".equals(zzvVar.o)) {
            zzaibVar = new zzaib();
        } else {
            zzaibVar = null;
        }
        this.d = zzaibVar;
    }
}
