package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzcjp;
import com.google.android.gms.internal.ads.zzcjq;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzdun;
import com.google.android.gms.internal.ads.zzeqs;
import com.google.android.gms.internal.ads.zzhed;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p04 implements zzchc, zzche, zzcjp, zzhed {
    public final /* synthetic */ zzcha a;

    @Override // com.google.android.gms.internal.ads.zzchc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo1051zza() {
        this.a.zzd(new zzbvb("Cannot get Javascript Engine"));
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcly zzclyVar = (zzcly) obj;
        zzcha zzchaVar = this.a;
        if (zzclyVar == null) {
            zzchaVar.zzd(new zzeqs(1, "Missing webview from video view future."));
        } else {
            zzclyVar.M("/video", new zzcjq(new p04(zzchaVar)));
            zzclyVar.w();
        }
    }

    public p04(zzdun zzdunVar, zzcha zzchaVar) {
        this.a = zzchaVar;
        Objects.requireNonNull(zzdunVar);
    }

    public /* synthetic */ p04(zzcha zzchaVar) {
        this.a = zzchaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzche, com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        this.a.zzc((zzbuz) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zza(Throwable th) {
        int i = zze.zza;
        zzo.zzf("Failed to load media data due to video view load failure.");
        this.a.zzd(th);
    }
}
