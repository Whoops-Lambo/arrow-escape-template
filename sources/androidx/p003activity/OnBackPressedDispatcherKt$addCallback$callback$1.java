package androidx.p003activity;

import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/activity/OnBackPressedDispatcherKt$addCallback$callback$1", "Landroidx/activity/OnBackPressedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcherKt$addCallback$callback$1 extends OnBackPressedCallback {
    public final /* synthetic */ wr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackPressedDispatcherKt$addCallback$callback$1(wr0 wr0Var) {
        super(true);
        this.d = wr0Var;
    }

    @Override // androidx.p003activity.OnBackPressedCallback
    public final void b() {
        this.d.invoke(this);
    }
}
