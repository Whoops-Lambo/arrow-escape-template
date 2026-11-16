package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzfvw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xi4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfvw b;

    public xi4(zzfvw zzfvwVar) {
        this.a = 0;
        Objects.requireNonNull(zzfvwVar);
        this.b = zzfvwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzfvw zzfvwVar = this.b;
        switch (i) {
            case 0:
                zzfvwVar.v();
                break;
            case 1:
                zzcb zzcbVar = zzfvwVar.h;
                if (zzcbVar != null) {
                    try {
                        zzcbVar.zzf((zzfp) zzfvwVar.e.get());
                    } catch (RemoteException unused) {
                        int i2 = zze.zza;
                        zzo.zzi("Failed to call onAdsExhausted");
                    }
                }
                zzce zzceVar = zzfvwVar.i;
                if (zzceVar != null) {
                    try {
                        zzceVar.zzf(zzfvwVar.l);
                    } catch (RemoteException unused2) {
                        int i3 = zze.zza;
                        zzo.zzi("Failed to call onAdsExhausted");
                        return;
                    }
                }
                break;
            case 2:
                if (zzfvwVar.q != null) {
                    long jCurrentTimeMillis = zzfvwVar.r.currentTimeMillis();
                    int iS = zzfvwVar.s();
                    String strG = zzfvwVar.g();
                    zzfvwVar.q.g("pae", "paeo_ts", jCurrentTimeMillis, iS, 0, null, zzfvwVar.s, strG);
                }
                break;
            case 3:
                zzfvwVar.e();
                break;
            case 4:
                zzfvwVar.e();
                break;
            default:
                zzfvwVar.w();
                break;
        }
    }

    public /* synthetic */ xi4(zzfvw zzfvwVar, int i) {
        this.a = i;
        this.b = zzfvwVar;
    }
}
