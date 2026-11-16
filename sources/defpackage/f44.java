package defpackage;

import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzcnv;
import com.google.android.gms.internal.ads.zzeqs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f44 implements zzcnv {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcgz b;

    public /* synthetic */ f44(zzcgz zzcgzVar, int i) {
        this.a = i;
        this.b = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnv
    public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        int i2 = this.a;
        zzcgz zzcgzVar = this.b;
        switch (i2) {
            case 0:
                zzcgzVar.b();
                break;
            case 1:
                zzcgzVar.b();
                break;
            default:
                if (!z) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    rl3.m(i, "Image Web View failed to load. Error code: ", ", Description: ", str, sb);
                    zzcgzVar.zzd(new zzeqs(1, nj.q(sb, ", Failing URL: ", str2)));
                } else {
                    zzcgzVar.b();
                }
                break;
        }
    }
}
