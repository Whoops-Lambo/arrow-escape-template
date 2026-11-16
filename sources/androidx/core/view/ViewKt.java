package androidx.core.view;

import android.view.View;
import defpackage.l92;
import defpackage.p8;
import defpackage.p92;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewKt {
    public static final p8 a(View view) {
        return new p8(new ViewKt$allViews$1(view, null), 3);
    }

    public static final l92 b(View view) {
        return p92.J(view.getParent(), ViewKt$ancestors$1.b);
    }
}
