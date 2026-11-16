package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzccd;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzheh;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class og4 implements zzfdv {
    public final JSONObject a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return ((Boolean) zzba.zzc().a(zzbjr.Pd)).booleanValue() ? zzheh.a(ng4.a) : zzheh.a(new nf4(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 46;
    }

    public og4(Context context) {
        this.a = zzccd.b(context, VersionInfoParcel.forPackage());
    }
}
