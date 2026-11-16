package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Ref;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidView_androidKt$AndroidView$3$valueProvider$1 extends rc1 implements sr0 {
    public final /* synthetic */ Ref i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$3$valueProvider$1(Ref ref) {
        super(0);
        this.i = ref;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Object obj = this.i.a;
        obj.getClass();
        View typedView$ui_release = ((ViewFactoryHolder) obj).getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
