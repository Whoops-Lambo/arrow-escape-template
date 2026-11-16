package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcfz;
import com.google.android.gms.internal.ads.zzcha;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g24 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zzcha b;

    @Override // java.lang.Runnable
    public final void run() {
        zzcha zzchaVar = this.b;
        try {
            zzchaVar.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzchaVar.zzd(e);
            zzo.zzg("Exception while getting advertising Id info", e);
        }
    }

    public g24(zzcfz zzcfzVar, Context context, zzcha zzchaVar) {
        this.a = context;
        this.b = zzchaVar;
    }
}
