package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzeun;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jf4 implements zzdef {
    public final /* synthetic */ zzeun a;
    public final /* synthetic */ zzbto b;

    @Override // com.google.android.gms.internal.ads.zzdef
    public final /* synthetic */ void m(zze zzeVar) {
        this.a.m(zzeVar);
        zzbto zzbtoVar = this.b;
        if (zzbtoVar != null) {
            try {
                zzbtoVar.a(zzeVar);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        if (zzbtoVar != null) {
            try {
                zzbtoVar.zzf(zzeVar.zza);
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public /* synthetic */ jf4(zzeun zzeunVar, zzbto zzbtoVar) {
        this.a = zzeunVar;
        this.b = zzbtoVar;
    }
}
