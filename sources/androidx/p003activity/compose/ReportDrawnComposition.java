package androidx.p003activity.compose;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.p003activity.FullyDrawnReporter;
import defpackage.az2;
import defpackage.h32;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "Laz2;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ReportDrawnComposition implements sr0 {
    public final FullyDrawnReporter a;
    public final sr0 b;
    public final SnapshotStateObserver c;
    public final wr0 d;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter) {
        boolean z;
        boolean z2;
        boolean z3;
        ReportDrawnKt$ReportDrawn$1 reportDrawnKt$ReportDrawn$1 = ReportDrawnKt$ReportDrawn$1.i;
        this.a = fullyDrawnReporter;
        this.b = reportDrawnKt$ReportDrawn$1;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.i);
        snapshotStateObserver.e = Snapshot.Companion.c(snapshotStateObserver.b);
        this.c = snapshotStateObserver;
        ReportDrawnComposition$checkReporter$1 reportDrawnComposition$checkReporter$1 = new ReportDrawnComposition$checkReporter$1(1, this, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        this.d = reportDrawnComposition$checkReporter$1;
        synchronized (fullyDrawnReporter.c) {
            if (fullyDrawnReporter.f) {
                z = true;
            } else {
                fullyDrawnReporter.g.add(this);
                z = false;
            }
        }
        if (z) {
            invoke();
        }
        synchronized (fullyDrawnReporter.c) {
            z2 = fullyDrawnReporter.f;
        }
        if (z2) {
            return;
        }
        synchronized (fullyDrawnReporter.c) {
            if (!fullyDrawnReporter.f) {
                fullyDrawnReporter.d++;
            }
        }
        h32 h32Var = new h32();
        snapshotStateObserver.d(reportDrawnKt$ReportDrawn$1, reportDrawnComposition$checkReporter$1, new ReportDrawnComposition$observeReporter$1(h32Var, reportDrawnKt$ReportDrawn$1));
        if (h32Var.a) {
            snapshotStateObserver.b(reportDrawnKt$ReportDrawn$1);
            synchronized (fullyDrawnReporter.c) {
                z3 = fullyDrawnReporter.f;
            }
            if (!z3) {
                fullyDrawnReporter.b();
            }
            snapshotStateObserver.a();
            snapshotStateObserver.e();
        }
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver = this.c;
        snapshotStateObserver.a();
        snapshotStateObserver.e();
        return az2.a;
    }
}
