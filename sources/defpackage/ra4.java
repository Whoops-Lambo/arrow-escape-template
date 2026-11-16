package defpackage;

import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzdwi;
import com.google.android.gms.internal.ads.zzhed;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ra4 implements zzhed {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzbqs c;

    private final void a(Throwable th) {
    }

    private final void b(Throwable th) {
    }

    public ra4(zzdwi zzdwiVar, String str, zzbqs zzbqsVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = zzbqsVar;
                Objects.requireNonNull(zzdwiVar);
                break;
            default:
                this.b = str;
                this.c = zzbqsVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final void zza(Throwable th) {
        int i = this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.a;
        zzbqs zzbqsVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                ((zzcly) obj).M(str, zzbqsVar);
                break;
            default:
                ((zzcly) obj).J(str, zzbqsVar);
                break;
        }
    }
}
