package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a72 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public a72(tu4 tu4Var, Runnable runnable) {
        this.a = 4;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    ak.g("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    Log.e("ServiceConnMgrImpl", "error caused by ", e2);
                    return;
                }
                break;
            default:
                runnable.run();
                break;
        }
    }

    public String toString() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 1:
                return runnable.toString();
            case 2:
                return runnable.toString();
            case 3:
            default:
                return super.toString();
            case 4:
                return runnable.toString();
        }
    }

    public /* synthetic */ a72(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }
}
