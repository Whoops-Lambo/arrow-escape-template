package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {262, 277}, m = "waitForUpOrCancellation")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TapGestureDetectorKt$waitForUpOrCancellation$1 extends fy {
    public AwaitPointerEventScope r;
    public /* synthetic */ Object s;
    public int t;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.f(null, this);
    }
}
