package androidx.core.view;

import android.view.ViewParent;
import defpackage.ks0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class ViewKt$ancestors$1 extends ks0 implements wr0 {
    public static final ViewKt$ancestors$1 b = new ViewKt$ancestors$1(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
