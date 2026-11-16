package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import defpackage.d;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    public final TextActionModeCallback a;

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        TextActionModeCallback textActionModeCallback = this.a;
        textActionModeCallback.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            sr0 sr0Var = textActionModeCallback.c;
            if (sr0Var != null) {
                sr0Var.invoke();
            }
        } else if (itemId == 1) {
            sr0 sr0Var2 = textActionModeCallback.d;
            if (sr0Var2 != null) {
                sr0Var2.invoke();
            }
        } else if (itemId == 2) {
            sr0 sr0Var3 = textActionModeCallback.e;
            if (sr0Var3 != null) {
                sr0Var3.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            sr0 sr0Var4 = textActionModeCallback.f;
            if (sr0Var4 != null) {
                sr0Var4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        TextActionModeCallback textActionModeCallback = this.a;
        textActionModeCallback.getClass();
        if (menu == null) {
            d.r("Required value was null.");
            return false;
        }
        if (actionMode == null) {
            d.r("Required value was null.");
            return false;
        }
        if (textActionModeCallback.c != null) {
            TextActionModeCallback.a(menu, MenuItemOption.Copy);
        }
        if (textActionModeCallback.d != null) {
            TextActionModeCallback.a(menu, MenuItemOption.Paste);
        }
        if (textActionModeCallback.e != null) {
            TextActionModeCallback.a(menu, MenuItemOption.Cut);
        }
        if (textActionModeCallback.f == null) {
            return true;
        }
        TextActionModeCallback.a(menu, MenuItemOption.SelectAll);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.ui.geometry.Rect rect2 = this.a.b;
        if (rect != null) {
            rect.set((int) rect2.a, (int) rect2.b, (int) rect2.c, (int) rect2.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        TextActionModeCallback textActionModeCallback = this.a;
        textActionModeCallback.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        TextActionModeCallback.b(menu, MenuItemOption.Copy, textActionModeCallback.c);
        TextActionModeCallback.b(menu, MenuItemOption.Paste, textActionModeCallback.d);
        TextActionModeCallback.b(menu, MenuItemOption.Cut, textActionModeCallback.e);
        TextActionModeCallback.b(menu, MenuItemOption.SelectAll, textActionModeCallback.f);
        return true;
    }

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        textActionModeCallback.getClass();
        this.a = textActionModeCallback;
    }
}
