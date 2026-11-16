package androidx.p003activity.compose;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.p003activity.FullyDrawnReporter;
import defpackage.az2;
import defpackage.h32;
import defpackage.ks0;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends ks0 implements wr0 {
    public final void a(sr0 sr0Var) {
        boolean z;
        ReportDrawnComposition reportDrawnComposition = (ReportDrawnComposition) this.receiver;
        h32 h32Var = new h32();
        reportDrawnComposition.c.d(sr0Var, reportDrawnComposition.d, new ReportDrawnComposition$observeReporter$1(h32Var, sr0Var));
        if (h32Var.a) {
            reportDrawnComposition.c.b(ReportDrawnKt$ReportDrawn$1.i);
            FullyDrawnReporter fullyDrawnReporter = reportDrawnComposition.a;
            synchronized (fullyDrawnReporter.c) {
                z = fullyDrawnReporter.f;
            }
            if (!z) {
                fullyDrawnReporter.b();
            }
            SnapshotStateObserver snapshotStateObserver = reportDrawnComposition.c;
            snapshotStateObserver.a();
            snapshotStateObserver.e();
        }
    }

    @Override // defpackage.wr0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((sr0) obj);
        return az2.a;
    }
}
