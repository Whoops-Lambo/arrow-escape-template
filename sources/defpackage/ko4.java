package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzgae;
import com.google.android.gms.internal.ads.zzgsc;
import com.google.android.gms.internal.ads.zzhfd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ko4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzgsc b;
    public final /* synthetic */ zzhfd c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ko4(zzgsc zzgscVar, zzhfd zzhfdVar, int i, long j, int i2) {
        this.a = i2;
        this.b = zzgscVar;
        this.c = zzhfdVar;
        this.d = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        switch (this.a) {
            case 0:
                zzgsc zzgscVar = this.b;
                zzgscVar.c.execute(new ko4(zzgscVar, this.c, this.d, this.e, 1));
                break;
            default:
                zzgsc zzgscVar2 = this.b;
                zzhfd zzhfdVar = this.c;
                try {
                    Context context = zzgscVar2.a;
                    zzazk zzazkVarA = zzgae.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                    if (!zzazkVarA.e0() || zzazkVarA.E0() != 32768) {
                        zzhfdVar.e(zzazkVarA);
                    }
                    break;
                } catch (Throwable unused) {
                }
                int i = this.d;
                if (i >= 3) {
                    zzhfdVar.e(null);
                } else {
                    if (i == 1) {
                        j = 100;
                    } else {
                        long j2 = this.e;
                        j = j2 + j2;
                    }
                    long j3 = j;
                    ko4 ko4Var = new ko4(zzgscVar2, zzhfdVar, i + 1, j3, 0);
                    if (j3 <= 0) {
                        ko4Var.run();
                    } else {
                        zzgscVar2.f.a(j3, ko4Var);
                    }
                }
                break;
        }
    }
}
