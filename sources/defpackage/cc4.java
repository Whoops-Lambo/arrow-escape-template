package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzedh;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzfrw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cc4 extends zzbsw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zzfrj d;
    public final /* synthetic */ zzcha e;
    public final /* synthetic */ zzedh f;

    public cc4(long j, zzcha zzchaVar, zzedh zzedhVar, zzfrj zzfrjVar, Object obj, String str) {
        this.a = obj;
        this.b = str;
        this.c = j;
        this.d = zzfrjVar;
        this.e = zzchaVar;
        Objects.requireNonNull(zzedhVar);
        this.f = zzedhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zze() {
        synchronized (this.a) {
            zzedh zzedhVar = this.f;
            String str = this.b;
            zzedhVar.d((int) (zzt.zzk().elapsedRealtime() - this.c), str, true, "");
            zzedhVar.l.b(str);
            zzedhVar.o.zzb(str);
            zzfrw zzfrwVar = zzedhVar.p;
            zzfrj zzfrjVar = this.d;
            zzfrjVar.zzd(true);
            zzfrwVar.c(zzfrjVar.zzm());
            this.e.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(String str) {
        synchronized (this.a) {
            zzedh zzedhVar = this.f;
            String str2 = this.b;
            zzedhVar.d((int) (zzt.zzk().elapsedRealtime() - this.c), str2, false, str);
            zzedhVar.l.c(str2, "error");
            zzedhVar.o.zzc(str2, "error");
            zzfrw zzfrwVar = zzedhVar.p;
            zzfrj zzfrjVar = this.d;
            zzfrjVar.zzk(str);
            zzfrjVar.zzd(false);
            zzfrwVar.c(zzfrjVar.zzm());
            this.e.zzc(Boolean.FALSE);
        }
    }
}
