package defpackage;

import com.google.android.exoplayer2.scheduler.RequirementsWatcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u42 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v42 b;

    public /* synthetic */ u42(v42 v42Var, int i) {
        this.a = i;
        this.b = v42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        v42 v42Var = this.b;
        switch (i) {
            case 0:
                RequirementsWatcher requirementsWatcher = v42Var.c;
                if (requirementsWatcher.networkCallback != null) {
                    requirementsWatcher.checkRequirements();
                }
                break;
            default:
                RequirementsWatcher requirementsWatcher2 = v42Var.c;
                if (requirementsWatcher2.networkCallback != null) {
                    requirementsWatcher2.recheckNotMetNetworkRequirements();
                }
                break;
        }
    }
}
