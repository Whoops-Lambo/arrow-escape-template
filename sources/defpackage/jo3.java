package defpackage;

import com.google.android.gms.internal.ads.zzafe;
import com.google.android.gms.internal.ads.zzfq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jo3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzafe b;

    public /* synthetic */ jo3(int i, long j, zzafe zzafeVar) {
        this.a = 1;
        this.b = zzafeVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzafe zzafeVar = this.b;
        zzafeVar.getClass();
        switch (i) {
            case 0:
                String str = zzfq.a;
                zzafeVar.b.zzc();
                break;
            case 1:
                String str2 = zzfq.a;
                zzafeVar.b.zzj();
                break;
            case 2:
                String str3 = zzfq.a;
                zzafeVar.b.zzh();
                break;
            case 3:
                String str4 = zzfq.a;
                zzafeVar.b.zzk();
                break;
            default:
                String str5 = zzfq.a;
                zzafeVar.b.zzb();
                break;
        }
    }

    public /* synthetic */ jo3(zzafe zzafeVar, Object obj, int i) {
        this.a = i;
        this.b = zzafeVar;
    }

    public /* synthetic */ jo3(zzafe zzafeVar, String str, long j, long j2) {
        this.a = 0;
        this.b = zzafeVar;
    }
}
