package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo
public interface MenuPresenter {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        void b(MenuBuilder menuBuilder, boolean z);

        boolean c(MenuBuilder menuBuilder);
    }

    void b(MenuBuilder menuBuilder, boolean z);

    boolean c(MenuItemImpl menuItemImpl);

    void d(boolean z);

    boolean e();

    void f(Context context, MenuBuilder menuBuilder);

    void h(Callback callback);

    boolean i(MenuItemImpl menuItemImpl);

    boolean j(SubMenuBuilder subMenuBuilder);
}
