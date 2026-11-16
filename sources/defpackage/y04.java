package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbxz;
import com.google.android.gms.internal.ads.zzbys;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class y04 implements MediationAdLoadCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbxz b;
    public final /* synthetic */ zzbwm c;

    public /* synthetic */ y04(zzbys zzbysVar, zzbxz zzbxzVar, zzbwm zzbwmVar, int i) {
        this.a = i;
        this.b = zzbxzVar;
        this.c = zzbwmVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i = this.a;
        zzbxz zzbxzVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzbxzVar.a(adError.zza());
                } catch (RemoteException e) {
                    zzo.zzg("", e);
                    return;
                }
                break;
            default:
                try {
                    zzbxzVar.a(adError.zza());
                } catch (RemoteException e2) {
                    zzo.zzg("", e2);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        int i = this.a;
        zzbwm zzbwmVar = this.c;
        zzbxz zzbxzVar = this.b;
        switch (i) {
            case 0:
                NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
                if (nativeAdMapper != null) {
                    try {
                        zzbxzVar.n1(new zzbxl(nativeAdMapper));
                        break;
                    } catch (RemoteException e) {
                        zzo.zzg("", e);
                    }
                    return new z04(zzbwmVar);
                }
                zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    zzbxzVar.zzf("Adapter returned null.");
                    return null;
                } catch (RemoteException e2) {
                    zzo.zzg("", e2);
                    return null;
                }
            default:
                UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
                if (unifiedNativeAdMapper != null) {
                    try {
                        zzbxzVar.n1(new zzbxn(unifiedNativeAdMapper));
                        break;
                    } catch (RemoteException e3) {
                        zzo.zzg("", e3);
                    }
                    return new z04(zzbwmVar);
                }
                zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    zzbxzVar.zzf("Adapter returned null.");
                    return null;
                } catch (RemoteException e4) {
                    zzo.zzg("", e4);
                    return null;
                }
        }
    }
}
