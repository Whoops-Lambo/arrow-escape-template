package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {70}, m = "invoke$emitExit")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class HoverableKt$hoverable$2$invoke$emitExit$1 extends fy {
    public MutableState r;
    public /* synthetic */ Object s;
    public int t;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.b(this, null, null);
    }
}
