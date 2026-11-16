package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode$measureScope$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dt1;
import defpackage.e32;
import defpackage.qh1;
import defpackage.rd1;
import defpackage.s71;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "Landroidx/compose/runtime/RememberObserver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextController implements RememberObserver {
    public final TextState a;
    public SelectionRegistrar b;
    public TextController$update$1 c;
    public final TextController$measurePolicy$1 d = new MeasurePolicy() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final MeasureResult a(MeasureScope measureScope, List list, long j) {
            dt1 dt1Var;
            SelectionRegistrar selectionRegistrar;
            measureScope.getClass();
            list.getClass();
            TextController textController = this.a;
            TextState textState = textController.a;
            TextLayoutResult textLayoutResult = textState.f;
            TextLayoutResult textLayoutResultA = textState.a.a(j, measureScope.getA(), textLayoutResult);
            ArrayList arrayList = textLayoutResultA.f;
            if (!s71.b(textLayoutResult, textLayoutResultA)) {
                textState.c.invoke(textLayoutResultA);
                if (textLayoutResult != null && !s71.b(textLayoutResult.a.a, textLayoutResultA.a.a) && (selectionRegistrar = textController.b) != null) {
                    selectionRegistrar.h(textState.b);
                }
            }
            textState.i.setValue(az2.a);
            textState.f = textLayoutResultA;
            if (list.size() >= arrayList.size()) {
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect = (Rect) arrayList.get(i);
                    if (rect != null) {
                        dt1Var = new dt1(((Measurable) list.get(i)).Y(ConstraintsKt.b((int) Math.floor(rect.d()), (int) Math.floor(rect.c()), 5)), new IntOffset(IntOffsetKt.a(rd1.p(rect.a), rd1.p(rect.b))));
                    } else {
                        dt1Var = null;
                    }
                    if (dt1Var != null) {
                        arrayList2.add(dt1Var);
                    }
                }
                long j2 = textLayoutResultA.c;
                return measureScope.C((int) (j2 >> 32), (int) (j2 & 4294967295L), qh1.Y(new dt1(AlignmentLineKt.a, Integer.valueOf(rd1.p(textLayoutResultA.d))), new dt1(AlignmentLineKt.b, Integer.valueOf(rd1.p(textLayoutResultA.e)))), new TextController$measurePolicy$1$measure$2(arrayList2));
            }
            e32.i("Check failed.");
            return null;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int b(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            TextState textState = this.a.a;
            textState.a.b(layoutNode$measureScope$1.a.r);
            MultiParagraphIntrinsics multiParagraphIntrinsics = textState.a.i;
            if (multiParagraphIntrinsics != null) {
                return (int) Math.ceil(multiParagraphIntrinsics.b());
            }
            e32.i("layoutIntrinsics must be called first");
            return 0;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int c(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            TextState textState = this.a.a;
            textState.a.b(layoutNode$measureScope$1.a.r);
            MultiParagraphIntrinsics multiParagraphIntrinsics = textState.a.i;
            if (multiParagraphIntrinsics != null) {
                return (int) Math.ceil(((Number) multiParagraphIntrinsics.c.getValue()).floatValue());
            }
            e32.i("layoutIntrinsics must be called first");
            return 0;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int d(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            return (int) (this.a.a.a.a(ConstraintsKt.a(0, i, 0, Integer.MAX_VALUE), layoutNode$measureScope$1.a.r, null).c & 4294967295L);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int e(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            return (int) (this.a.a.a.a(ConstraintsKt.a(0, i, 0, Integer.MAX_VALUE), layoutNode$measureScope$1.a.r, null).c & 4294967295L);
        }
    };
    public final Modifier e;
    public Modifier f;
    public Modifier g;

    public static final boolean b(TextController textController, long j, long j2) {
        TextLayoutResult textLayoutResult = textController.a.f;
        if (textLayoutResult == null) {
            return false;
        }
        int length = textLayoutResult.a.a.a.length();
        int iJ = textLayoutResult.j(j);
        int iJ2 = textLayoutResult.j(j2);
        int i = length - 1;
        return (iJ >= i && iJ2 >= i) || (iJ < 0 && iJ2 < 0);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void a() {
        SelectionRegistrar selectionRegistrar = this.b;
        if (selectionRegistrar != null) {
            TextState textState = this.a;
            textState.d = selectionRegistrar.j(new MultiWidgetSelectionDelegate(textState.b, new TextController$onRemembered$1$1(this), new TextController$onRemembered$1$2(this)));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void d() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.a.d;
        if (selectable == null || (selectionRegistrar = this.b) == null) {
            return;
        }
        selectionRegistrar.c(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void e() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.a.d;
        if (selectable == null || (selectionRegistrar = this.b) == null) {
            return;
        }
        selectionRegistrar.c(selectable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.TextController$measurePolicy$1] */
    public TextController(TextState textState) {
        this.a = textState;
        Modifier.Companion companion = Modifier.Companion.a;
        this.e = OnGloballyPositionedModifierKt.a(DrawModifierKt.a(GraphicsLayerModifierKt.b(companion, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 65535), new TextController$drawTextAndSelectionBehind$1(this)), new TextController$coreModifiers$1(this));
        this.f = SemanticsModifierKt.a(companion, false, new TextController$createSemanticsModifierFor$1(textState.a.a, this));
        this.g = companion;
    }
}
