package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import com.ecffri.arrows.R;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo
public class MenuPopupHelper implements MenuHelper {
    public final Context a;
    public final MenuBuilder b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public MenuPresenter.Callback h;
    public MenuPopup i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final PopupWindow.OnDismissListener k = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            MenuPopupHelper.this.c();
        }
    };

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final MenuPopup a() {
        MenuPopup standardMenuPopup;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                standardMenuPopup = new CascadingMenuPopup(context2, this.e, this.d, this.c);
            } else {
                standardMenuPopup = new StandardMenuPopup(context2, this.b, this.e, this.d, this.c);
            }
            standardMenuPopup.k(this.b);
            standardMenuPopup.q(this.k);
            standardMenuPopup.m(this.e);
            standardMenuPopup.h(this.h);
            standardMenuPopup.n(this.g);
            standardMenuPopup.o(this.f);
            this.i = standardMenuPopup;
        }
        return this.i;
    }

    public final boolean b() {
        MenuPopup menuPopup = this.i;
        return menuPopup != null && menuPopup.a();
    }

    public final void d(boolean z) {
        this.g = z;
        MenuPopup menuPopup = this.i;
        if (menuPopup != null) {
            menuPopup.n(z);
        }
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = menuBuilder;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        MenuPopup menuPopupA = a();
        menuPopupA.r(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            menuPopupA.p(i);
            menuPopupA.s(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            menuPopupA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        menuPopupA.show();
    }
}
