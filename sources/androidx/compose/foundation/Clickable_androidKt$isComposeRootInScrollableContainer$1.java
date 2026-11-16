package androidx.compose.foundation;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends rc1 implements sr0 {
    public final /* synthetic */ View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.i = view;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        boolean z;
        int i = Clickable_androidKt.b;
        ViewParent parent = this.i.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                z = true;
                return Boolean.valueOf(z);
            }
            parent = viewGroup.getParent();
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
