package androidx.p003activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p003activity.FullyDrawnReporter;
import androidx.p003activity.FullyDrawnReporterOwner;
import androidx.p003activity.ViewTreeFullyDrawnReporterOwner;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReportDrawnKt {
    public static final void a(Composer composer, int i) {
        FullyDrawnReporter fullyDrawnReporter;
        ComposerImpl composerImplT = composer.t(-2047119994);
        if ((i & 3) == 2 && composerImplT.b()) {
            composerImplT.h();
        } else {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalFullyDrawnReporterOwner.a;
            composerImplT.B(540186968);
            FullyDrawnReporterOwner fullyDrawnReporterOwnerA = (FullyDrawnReporterOwner) composerImplT.v(LocalFullyDrawnReporterOwner.a);
            composerImplT.B(1606493384);
            if (fullyDrawnReporterOwnerA == null) {
                fullyDrawnReporterOwnerA = ViewTreeFullyDrawnReporterOwner.a((View) composerImplT.v(AndroidCompositionLocals_androidKt.f));
            }
            composerImplT.J();
            if (fullyDrawnReporterOwnerA == null) {
                Object baseContext = (Context) composerImplT.v(AndroidCompositionLocals_androidKt.b);
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (baseContext instanceof FullyDrawnReporterOwner) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    } else {
                        baseContext = null;
                        break;
                    }
                }
                fullyDrawnReporterOwnerA = (FullyDrawnReporterOwner) baseContext;
            }
            composerImplT.J();
            if (fullyDrawnReporterOwnerA != null && (fullyDrawnReporter = fullyDrawnReporterOwnerA.getFullyDrawnReporter()) != null) {
                composerImplT.B(-537074000);
                boolean zL = composerImplT.l(fullyDrawnReporter);
                ReportDrawnKt$ReportDrawn$1 reportDrawnKt$ReportDrawn$1 = ReportDrawnKt$ReportDrawn$1.i;
                boolean zL2 = zL | composerImplT.l(reportDrawnKt$ReportDrawn$1);
                Object objB0 = composerImplT.b0();
                if (zL2 || objB0 == Composer.Companion.a) {
                    objB0 = new ReportDrawnKt$ReportDrawnWhen$1$1(fullyDrawnReporter);
                    composerImplT.C0(objB0);
                }
                composerImplT.R(false);
                EffectsKt.b(fullyDrawnReporter, reportDrawnKt$ReportDrawn$1, (wr0) objB0, composerImplT);
            } else {
                RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
                if (recomposeScopeImplT != null) {
                    recomposeScopeImplT.d = new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(i);
                    return;
                }
                return;
            }
        }
        RecomposeScopeImpl recomposeScopeImplT2 = composerImplT.T();
        if (recomposeScopeImplT2 != null) {
            recomposeScopeImplT2.d = new ReportDrawnKt$ReportDrawnWhen$2(i);
        }
    }
}
