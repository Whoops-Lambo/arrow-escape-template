package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.fy;
import defpackage.sy;
import defpackage.t50;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {41, 44, 49}, m = "forEachGesture")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ForEachGestureKt$forEachGesture$1 extends fy {
    public PointerInputScope r;
    public zr0 s;
    public sy t;
    public /* synthetic */ Object u;
    public int v;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return ForEachGestureKt.b(null, null, this);
    }
}
