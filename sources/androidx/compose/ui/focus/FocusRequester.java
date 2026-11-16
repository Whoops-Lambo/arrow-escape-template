package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import defpackage.e32;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FocusRequester {
    public static final FocusRequester b = new FocusRequester();
    public final MutableVector a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        @ExperimentalComposeUiApi
        public static final class FocusRequesterFactory {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    public final void a() {
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNodeS;
        LayoutNode layoutNodeS2;
        MutableVector mutableVector = this.a;
        if (!mutableVector.n()) {
            e32.i("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        int i = mutableVector.c;
        if (i > 0) {
            Object[] objArr = mutableVector.a;
            int i2 = 0;
            do {
                MutableVector mutableVector2 = ((FocusRequesterModifierLocal) objArr[i2]).b;
                int i3 = mutableVector2.c;
                FocusModifier focusModifier = null;
                if (i3 > 0) {
                    Object[] objArr2 = mutableVector2.a;
                    int i4 = 0;
                    do {
                        FocusModifier focusModifier2 = (FocusModifier) objArr2[i4];
                        if (focusModifier == null || (layoutNodeWrapper = focusModifier.m) == null || (layoutNodeS = layoutNodeWrapper.e) == null) {
                            focusModifier = focusModifier2;
                        } else {
                            LayoutNodeWrapper layoutNodeWrapper2 = focusModifier2.m;
                            if (layoutNodeWrapper2 != null && (layoutNodeS2 = layoutNodeWrapper2.e) != null) {
                                while (layoutNodeS.h > layoutNodeS2.h) {
                                    layoutNodeS = layoutNodeS.s();
                                    layoutNodeS.getClass();
                                }
                                while (layoutNodeS2.h > layoutNodeS.h) {
                                    layoutNodeS2 = layoutNodeS2.s();
                                    layoutNodeS2.getClass();
                                }
                                while (!s71.b(layoutNodeS.s(), layoutNodeS2.s())) {
                                    layoutNodeS = layoutNodeS.s();
                                    layoutNodeS.getClass();
                                    layoutNodeS2 = layoutNodeS2.s();
                                    layoutNodeS2.getClass();
                                }
                                LayoutNode layoutNodeS3 = layoutNodeS.s();
                                layoutNodeS3.getClass();
                                MutableVector mutableVectorU = layoutNodeS3.u();
                                if (mutableVectorU.l(layoutNodeS) >= mutableVectorU.l(layoutNodeS2)) {
                                    focusModifier = focusModifier2;
                                }
                            }
                        }
                        i4++;
                    } while (i4 < i3);
                }
                if (focusModifier != null) {
                    FocusTransactionsKt.f(focusModifier);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public FocusRequester() {
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new FocusRequesterModifierLocal[16];
        mutableVector.c = 0;
        this.a = mutableVector;
    }
}
