package defpackage;

import com.google.android.gms.internal.ads.zzcch;
import com.google.android.gms.internal.ads.zzeid;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.android.gms.internal.ads.zzheh;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vc4 implements zzhdo {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcch b;

    public /* synthetic */ vc4(zzcch zzcchVar, int i) {
        this.a = i;
        this.b = zzcchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        int i = this.a;
        zzcch zzcchVar = this.b;
        InputStream inputStream = (InputStream) obj;
        switch (i) {
            case 0:
                return zzheh.a(new zzeid(inputStream, zzcchVar));
            case 1:
                return zzheh.a(new zzeid(inputStream, zzcchVar));
            default:
                zzcchVar.j = new String(zzhca.a(inputStream), StandardCharsets.UTF_8);
                return zzheh.a(zzcchVar);
        }
    }
}
