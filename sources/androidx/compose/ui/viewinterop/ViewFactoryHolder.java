package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import com.google.android.gms.ads.RequestConfiguration;
import com.singular.sdk.internal.Constants;
import defpackage.wr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRF\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RB\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\b¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "t", "Landroid/view/View;", "getTypedView$ui_release", "()Landroid/view/View;", "setTypedView$ui_release", "(Landroid/view/View;)V", "typedView", "Lkotlin/Function1;", "Landroid/content/Context;", "value", Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, "Lwr0;", "getFactory", "()Lwr0;", "setFactory", "(Lwr0;)V", "factory", "Laz2;", "v", "getUpdateBlock", "setUpdateBlock", "updateBlock", "getViewRoot", "viewRoot", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public View typedView;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public wr0 factory;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public wr0 updateBlock;

    @Nullable
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }

    @Nullable
    public final wr0 getFactory() {
        return this.factory;
    }

    @Nullable
    public final T getTypedView$ui_release() {
        return (T) this.typedView;
    }

    @NotNull
    public final wr0 getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setFactory(@Nullable wr0 wr0Var) {
        this.factory = wr0Var;
        if (wr0Var != null) {
            Context context = getContext();
            context.getClass();
            View view = (View) wr0Var.invoke(context);
            this.typedView = view;
            setView$ui_release(view);
        }
    }

    public final void setTypedView$ui_release(@Nullable T t) {
        this.typedView = t;
    }

    public final void setUpdateBlock(@NotNull wr0 wr0Var) {
        wr0Var.getClass();
        this.updateBlock = wr0Var;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }
}
