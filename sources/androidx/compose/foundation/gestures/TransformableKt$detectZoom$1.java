package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.fy;
import defpackage.h32;
import defpackage.j32;
import defpackage.l32;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {96, 100}, m = "detectZoom")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TransformableKt$detectZoom$1 extends fy {
    public /* synthetic */ Object A;
    public int B;
    public PointerInputScope r;
    public MutableState s;
    public MutableState t;
    public j32 u;
    public j32 v;
    public l32 w;
    public h32 x;
    public h32 y;
    public float z;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return TransformableKt.b(null, null, null, this);
    }
}
