package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public interface MenuItemHoverListener {
    void f(MenuBuilder menuBuilder, MenuItem menuItem);

    void i(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);
}
