package defpackage;

import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzjd;
import com.google.android.gms.internal.ads.zzzp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w35 extends zzjd {
    public static final /* synthetic */ int k = 0;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final zzbf[] h;
    public final Object[] i;
    public final HashMap j;

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final int p(int i) {
        return zzfq.r(this.f, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final int q(int i) {
        return zzfq.r(this.g, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final int r(Object obj) {
        Integer num = (Integer) this.j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final zzbf s(int i) {
        return this.h[i];
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final int t(int i) {
        return this.f[i];
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final int u(int i) {
        return this.g[i];
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final Object v(int i) {
        return this.i[i];
    }

    public w35(zzbf[] zzbfVarArr, Object[] objArr, zzzp zzzpVar) {
        super(zzzpVar);
        this.h = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int i = 0;
        int iA = 0;
        int iC = 0;
        int i2 = 0;
        while (i < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i];
            this.h[i2] = zzbfVar;
            this.g[i2] = iA;
            this.f[i2] = iC;
            iA += zzbfVar.a();
            iC += this.h[i2].c();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iA;
        this.e = iC;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w35(List list, zzzp zzzpVar) {
        zzbf[] zzbfVarArr = new zzbf[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i2] = ((y25) it.next()).zzb();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((y25) it2.next()).zza();
            i++;
        }
        this(zzbfVarArr, objArr, zzzpVar);
    }
}
