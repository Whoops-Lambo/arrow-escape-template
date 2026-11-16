package androidx.compose.ui.layout;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import defpackage.rc1;
import defpackage.wr0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SubcomposeLayoutKt$SubcomposeLayout$5$1 extends rc1 implements wr0 {
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$5$1(MutableState mutableState) {
        super(1);
        this.i = mutableState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final MutableState mutableState = this.i;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsStateA = ((SubcomposeLayoutState) mutableState.getA()).a();
                LayoutNode layoutNode = layoutNodeSubcompositionsStateA.a;
                layoutNode.k = true;
                LinkedHashMap linkedHashMap = layoutNodeSubcompositionsStateA.e;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    Composition composition = ((LayoutNodeSubcompositionsState.NodeState) it.next()).c;
                    if (composition != null) {
                        composition.dispose();
                    }
                }
                MutableVector mutableVector = layoutNode.c;
                for (int i = mutableVector.c - 1; -1 < i; i--) {
                    layoutNode.H((LayoutNode) mutableVector.a[i]);
                }
                mutableVector.h();
                layoutNode.k = false;
                linkedHashMap.clear();
                layoutNodeSubcompositionsStateA.f.clear();
                layoutNodeSubcompositionsStateA.k = 0;
                layoutNodeSubcompositionsStateA.j = 0;
                layoutNodeSubcompositionsStateA.h.clear();
                layoutNodeSubcompositionsStateA.b();
            }
        };
    }
}
