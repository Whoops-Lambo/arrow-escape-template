package defpackage;

import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzez;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ex3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseAnalytics b;

    public /* synthetic */ ex3(FirebaseAnalytics firebaseAnalytics, int i) {
        this.a = i;
        this.b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        FirebaseAnalytics firebaseAnalytics = this.b;
        switch (i) {
            case 0:
                zzez zzezVarZza = firebaseAnalytics.zza();
                zzezVarZza.getClass();
                zzcm zzcmVar = new zzcm();
                zzezVarZza.a(new ha4(zzezVarZza, zzcmVar, 5, false));
                return zzcmVar.z1(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            default:
                zzez zzezVarZza2 = firebaseAnalytics.zza();
                zzezVarZza2.getClass();
                zzcm zzcmVar2 = new zzcm();
                zzezVarZza2.a(new ha4(zzezVarZza2, zzcmVar2, 6, false));
                return (Long) zzcm.w3(Long.class, zzcmVar2.A1(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS));
        }
    }
}
