package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.internal.ads.zzhed;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kd4 implements zzhed {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfpv b;

    public /* synthetic */ kd4(Object obj, zzfpv zzfpvVar, int i) {
        this.a = i;
        this.b = zzfpvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final void zza(Throwable th) {
        switch (this.a) {
            case 0:
                String strValueOf = String.valueOf(th.getMessage());
                int i = zze.zza;
                zzo.zzf("Failed to get offline signal database: ".concat(strValueOf));
                break;
            default:
                String strValueOf2 = String.valueOf(th.getMessage());
                int i2 = zze.zza;
                zzo.zzf("Failed to get offline buffered ping database: ".concat(strValueOf2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.a;
        zzfpv zzfpvVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzfpvVar.zza((SQLiteDatabase) obj);
                } catch (Exception e) {
                    String strValueOf = String.valueOf(e.getMessage());
                    int i2 = zze.zza;
                    zzo.zzf("Error executing function on offline signal database: ".concat(strValueOf));
                    return;
                }
                break;
            default:
                try {
                    zzfpvVar.zza((SQLiteDatabase) obj);
                } catch (Exception e2) {
                    String strValueOf2 = String.valueOf(e2.getMessage());
                    int i3 = zze.zza;
                    zzo.zzf("Error executing function on offline buffered ping database: ".concat(strValueOf2));
                }
                break;
        }
    }
}
