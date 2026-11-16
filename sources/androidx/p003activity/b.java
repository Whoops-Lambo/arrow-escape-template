package androidx.p003activity;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl = (ComponentActivity.ReportFullyDrawnExecutorImpl) obj;
                Runnable runnable = reportFullyDrawnExecutorImpl.b;
                if (runnable != null) {
                    runnable.run();
                    reportFullyDrawnExecutorImpl.b = null;
                    return;
                }
                return;
            default:
                FullyDrawnReporter fullyDrawnReporter = (FullyDrawnReporter) obj;
                synchronized (fullyDrawnReporter.c) {
                    fullyDrawnReporter.e = false;
                    if (fullyDrawnReporter.d == 0 && !fullyDrawnReporter.f) {
                        ((ComponentActivity$fullyDrawnReporter$2.AnonymousClass1) fullyDrawnReporter.b).invoke();
                        fullyDrawnReporter.a();
                    }
                    break;
                }
                return;
        }
    }
}
