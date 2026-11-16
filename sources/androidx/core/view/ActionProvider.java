package androidx.core.view;

import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ShareActionProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ActionProvider {
    public SubUiVisibilityListener a;
    public VisibilityListener b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public interface SubUiVisibilityListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface VisibilityListener {
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public boolean e() {
        return false;
    }

    public void f(SubMenuBuilder subMenuBuilder) {
    }

    public boolean g() {
        return false;
    }

    public boolean a() {
        return this instanceof ShareActionProvider;
    }

    public void h(VisibilityListener visibilityListener) {
        if (this.b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.b = visibilityListener;
    }

    public View d(MenuItemImpl menuItemImpl) {
        return c();
    }
}
