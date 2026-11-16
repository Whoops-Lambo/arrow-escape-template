package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidCursorHandle_androidKt {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(long j, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        long j2;
        modifier.getClass();
        ComposerImpl composerImplT = composer.t(-5185995);
        if (composerImplT.q(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (composerImplT.l(modifier)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 731) == 146 && composerImplT.b()) {
            composerImplT.h();
            j2 = j;
        } else {
            j2 = j;
            AndroidSelectionHandles_androidKt.b(j2, HandleReferencePoint.c, ComposableLambdaKt.b(composerImplT, -1458480226, new AndroidCursorHandle_androidKt$CursorHandle$1(modifier, i5)), composerImplT, (i5 & 14) | 432);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new AndroidCursorHandle_androidKt$CursorHandle$2(j2, modifier, i);
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        modifier.getClass();
        ComposerImpl composerImplT = composer.t(694251107);
        if ((i & 14) == 0) {
            if (composerImplT.l(modifier)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerImplT.b()) {
            composerImplT.h();
        } else {
            SpacerKt.a(composerImplT, ComposedModifierKt.a(SizeKt.k(modifier, a, 25.0f), InspectableValueKt.a(), AndroidCursorHandle_androidKt$drawCursorHandle$1.i));
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(modifier, i);
    }
}
