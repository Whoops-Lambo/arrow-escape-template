package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Ref;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidView_androidKt$AndroidView$1 extends rc1 implements sr0 {
    public final /* synthetic */ Context i;
    public final /* synthetic */ CompositionContext j;
    public final /* synthetic */ NestedScrollDispatcher k;
    public final /* synthetic */ wr0 l;
    public final /* synthetic */ SaveableStateRegistry m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Ref o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$1(Context context, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher, wr0 wr0Var, SaveableStateRegistry saveableStateRegistry, String str, Ref ref) {
        super(0);
        this.i = context;
        this.j = compositionContext;
        this.k = nestedScrollDispatcher;
        this.l = wr0Var;
        this.m = saveableStateRegistry;
        this.n = str;
        this.o = ref;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        View typedView$ui_release;
        Context context = this.i;
        context.getClass();
        NestedScrollDispatcher nestedScrollDispatcher = this.k;
        nestedScrollDispatcher.getClass();
        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context, this.j, nestedScrollDispatcher);
        wr0 wr0Var = AndroidView_androidKt.a;
        viewFactoryHolder.updateBlock = AndroidView_androidKt$NoOpUpdate$1.i;
        viewFactoryHolder.setFactory(this.l);
        SaveableStateRegistry saveableStateRegistry = this.m;
        Object objD = saveableStateRegistry != null ? saveableStateRegistry.d(this.n) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.o.a = viewFactoryHolder;
        return viewFactoryHolder.getLayoutNode();
    }
}
