package io.p071bidmachine.media3.ui;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzdqz;
import com.google.android.gms.internal.ads.zzdtb;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzsc;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import defpackage.ia4;
import defpackage.z15;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public b(zzlj zzljVar, boolean z) {
        this.a = 3;
        this.b = z;
        Objects.requireNonNull(zzljVar);
        this.c = zzljVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                this.b = false;
                int i = AspectRatioFrameLayout.d;
                break;
            case 1:
                ((zzbze) this.c).g(this.b);
                break;
            case 2:
                zzdqz zzdqzVar = (zzdqz) this.c;
                boolean z2 = this.b;
                zzdtb zzdtbVar = zzdqzVar.w;
                if (zzdtbVar != null) {
                    zzdqzVar.n.j(null, zzdtbVar.A1(), zzdqzVar.w.zzh(), zzdqzVar.w.zzi(), z2, zzdqzVar.k(), 0);
                } else {
                    int i2 = zze.zza;
                    zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                }
                break;
            case 3:
                zzlj zzljVar = (zzlj) this.c;
                zzic zzicVar = (zzic) zzljVar.a;
                boolean zA = zzicVar.a();
                boolean z3 = zzicVar.y != null && zzicVar.y.booleanValue();
                boolean z4 = this.b;
                zzicVar.y = Boolean.valueOf(z4);
                if (z3 == z4) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.l(zzguVar);
                    zzguVar.n.b(Boolean.valueOf(z4), "Default data collection state already set to");
                }
                if (zzicVar.a() != zA) {
                    boolean zA2 = zzicVar.a();
                    if (zzicVar.y != null && zzicVar.y.booleanValue()) {
                        z = true;
                    }
                    if (zA2 != z) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.l(zzguVar2);
                        zzguVar2.k.c(Boolean.valueOf(z4), Boolean.valueOf(zA), "Default data collection is different than actual status");
                    }
                } else {
                    zzgu zzguVar3 = zzicVar.f;
                    zzic.l(zzguVar3);
                    zzguVar3.k.c(Boolean.valueOf(z4), Boolean.valueOf(zA), "Default data collection is different than actual status");
                }
                zzljVar.L();
                break;
            default:
                zzsc zzscVar = (zzsc) this.c;
                boolean z5 = this.b;
                zzscVar.getClass();
                String str = zzfq.a;
                z15 z15Var = zzscVar.b.a;
                if (z15Var.P != z5) {
                    z15Var.P = z5;
                    zzeg zzegVar = z15Var.m;
                    zzegVar.c(23, new ia4(z5));
                    zzegVar.d();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.a = 0;
        this.c = aspectRatioFrameLayout;
    }
}
