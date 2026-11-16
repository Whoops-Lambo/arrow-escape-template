package androidx.compose.ui.viewinterop;

import android.os.Looper;
import com.ironsource.sdk.controller.f;
import defpackage.az2;
import defpackage.p;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Laz2;", f.b.g, "invoke", "(Lsr0;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class AndroidViewHolder$snapshotObserver$1 extends rc1 implements wr0 {
    public final /* synthetic */ AndroidViewHolder i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.i = androidViewHolder;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        sr0 sr0Var = (sr0) obj;
        sr0Var.getClass();
        AndroidViewHolder androidViewHolder = this.i;
        if (androidViewHolder.getHandler().getLooper() == Looper.myLooper()) {
            sr0Var.invoke();
        } else {
            androidViewHolder.getHandler().post(new p(sr0Var, 3));
        }
        return az2.a;
    }
}
