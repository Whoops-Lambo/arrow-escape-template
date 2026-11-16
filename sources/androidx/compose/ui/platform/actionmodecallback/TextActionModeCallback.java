package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.view.Menu;
import androidx.compose.ui.geometry.Rect;
import defpackage.sr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextActionModeCallback {
    public final sr0 a;
    public Rect b = Rect.e;
    public sr0 c = null;
    public sr0 d = null;
    public sr0 e = null;
    public sr0 f = null;

    public static void b(Menu menu, MenuItemOption menuItemOption, sr0 sr0Var) {
        int i = menuItemOption.a;
        if (sr0Var != null && menu.findItem(i) == null) {
            a(menu, menuItemOption);
        } else {
            if (sr0Var != null || menu.findItem(i) == null) {
                return;
            }
            menu.removeItem(i);
        }
    }

    public TextActionModeCallback(sr0 sr0Var) {
        this.a = sr0Var;
    }

    public static void a(Menu menu, MenuItemOption menuItemOption) {
        int i;
        menu.getClass();
        int i2 = menuItemOption.a;
        int i3 = menuItemOption.b;
        int i4 = MenuItemOption.WhenMappings.$EnumSwitchMapping$0[menuItemOption.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        i = R.string.selectAll;
                    } else {
                        e.b();
                        return;
                    }
                } else {
                    i = R.string.cut;
                }
            } else {
                i = R.string.paste;
            }
        } else {
            i = R.string.copy;
        }
        menu.add(0, i2, i3, i).setShowAsAction(1);
    }
}
