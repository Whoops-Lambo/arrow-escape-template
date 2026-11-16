package androidx.compose.ui.input.pointer;

import defpackage.fy;
import defpackage.ph;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {597}, m = "withTimeoutOrNull")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1<T> extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(SuspendingPointerInputFilter.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, ph phVar) {
        super(phVar);
        this.s = pointerEventHandlerCoroutine;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.A(0L, null, this);
    }
}
