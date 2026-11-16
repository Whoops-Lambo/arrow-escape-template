package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import defpackage.fy;
import defpackage.m32;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {160}, m = "awaitTwoDowns")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TransformableKt$awaitTwoDowns$1 extends fy {
    public AwaitPointerEventScope r;
    public m32 s;
    public /* synthetic */ Object t;
    public int u;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return TransformableKt.a(null, this);
    }
}
