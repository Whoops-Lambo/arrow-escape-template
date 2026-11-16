package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzdjz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z95 implements gx3, zzdjz {
    public static final /* synthetic */ z95 a = new z95();

    @Override // defpackage.gx3
    public Object a(IBinder iBinder) {
        int i = nj4.a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        return iInterfaceQueryLocalInterface instanceof tr4 ? (tr4) iInterfaceQueryLocalInterface : new yf4(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService");
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        ((zzbrm) obj).zza();
    }
}
