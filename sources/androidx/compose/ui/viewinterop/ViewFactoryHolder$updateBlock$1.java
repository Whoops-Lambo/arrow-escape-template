package androidx.compose.ui.viewinterop;

import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ViewFactoryHolder$updateBlock$1 extends rc1 implements sr0 {
    public final /* synthetic */ ViewFactoryHolder i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$updateBlock$1(ViewFactoryHolder viewFactoryHolder) {
        super(0);
        this.i = viewFactoryHolder;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        ViewFactoryHolder viewFactoryHolder = this.i;
        View typedView$ui_release = viewFactoryHolder.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            viewFactoryHolder.getUpdateBlock().invoke(typedView$ui_release);
        }
        return az2.a;
    }
}
