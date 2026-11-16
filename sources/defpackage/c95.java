package defpackage;

import android.os.Build;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgwr;
import com.google.android.gms.internal.ads.zztn;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c95 implements zzgwr, zzdjz {
    public static final /* synthetic */ c95 a = new c95();
    public static final /* synthetic */ c95 b = new c95();

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo1232zza() {
        int i = zztn.j;
        boolean z = false;
        if (Build.VERSION.SDK_INT > 37 && Objects.equals(zzfq.m("persist.audio.compressed_offload_implicit_aac"), "false")) {
            z = true;
        }
        return new Boolean(z);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public void mo82zza(Object obj) {
        zzdmn zzdmnVar = (zzdmn) obj;
        if (zzdmnVar.d) {
            return;
        }
        zzdmnVar.b.a(zzdmnVar.a, zzdmnVar.c);
        zzdmnVar.d = true;
    }
}
