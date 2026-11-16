package defpackage;

import com.google.android.gms.internal.ads.zzea;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class qn3 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzea b;

    public /* synthetic */ qn3(zzea zzeaVar, int i) {
        this.a = i;
        this.b = zzeaVar;
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        int i = this.a;
        zzea zzeaVar = this.b;
        switch (i) {
            case 0:
                zzeaVar.k(runnable);
                break;
            default:
                zzeaVar.k(runnable);
                break;
        }
    }
}
