package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {244}, m = "awaitFirstDownOnPass")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TapGestureDetectorKt$awaitFirstDownOnPass$1 extends fy {
    public AwaitPointerEventScope r;
    public PointerEventPass s;
    public boolean t;
    public /* synthetic */ Object u;
    public int v;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.c(null, null, false, this);
    }
}
