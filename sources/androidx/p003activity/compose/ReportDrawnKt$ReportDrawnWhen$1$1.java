package androidx.p003activity.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.p003activity.FullyDrawnReporter;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ReportDrawnKt$ReportDrawnWhen$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ FullyDrawnReporter i;
    public final /* synthetic */ sr0 j = ReportDrawnKt$ReportDrawn$1.i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$1$1(FullyDrawnReporter fullyDrawnReporter) {
        super(1);
        this.i = fullyDrawnReporter;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        boolean z;
        FullyDrawnReporter fullyDrawnReporter = this.i;
        synchronized (fullyDrawnReporter.c) {
            z = fullyDrawnReporter.f;
        }
        if (z) {
            return new ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1();
        }
        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                boolean z2;
                ReportDrawnComposition reportDrawnComposition2 = reportDrawnComposition;
                reportDrawnComposition2.c.b(ReportDrawnKt$ReportDrawn$1.i);
                FullyDrawnReporter fullyDrawnReporter2 = reportDrawnComposition2.a;
                synchronized (fullyDrawnReporter2.c) {
                    z2 = fullyDrawnReporter2.f;
                }
                if (!z2) {
                    fullyDrawnReporter2.b();
                }
                SnapshotStateObserver snapshotStateObserver = reportDrawnComposition2.c;
                snapshotStateObserver.a();
                snapshotStateObserver.e();
            }
        };
    }
}
