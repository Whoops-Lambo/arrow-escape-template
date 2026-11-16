package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuPopupWindow;
import com.ecffri.arrows.R;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {
    public final Context b;
    public final MenuBuilder c;
    public final MenuAdapter d;
    public final boolean e;
    public final int f;
    public final int g;
    public final MenuPopupWindow h;
    public PopupWindow.OnDismissListener k;
    public View l;
    public View m;
    public MenuPresenter.Callback n;
    public ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean t;
    public final ViewTreeObserver.OnGlobalLayoutListener i = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            MenuPopupWindow menuPopupWindow = standardMenuPopup.h;
            if (!standardMenuPopup.a() || menuPopupWindow.y) {
                return;
            }
            View view = standardMenuPopup.m;
            if (view == null || !view.isShown()) {
                standardMenuPopup.dismiss();
            } else {
                menuPopupWindow.show();
            }
        }
    };
    public final View.OnAttachStateChangeListener j = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            ViewTreeObserver viewTreeObserver = standardMenuPopup.o;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    standardMenuPopup.o = view.getViewTreeObserver();
                }
                standardMenuPopup.o.removeGlobalOnLayoutListener(standardMenuPopup.i);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public int s = 0;

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void d(boolean z) {
        this.q = false;
        MenuAdapter menuAdapter = this.d;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void k(MenuBuilder menuBuilder) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.o = this.m.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.i);
            this.o = null;
        }
        this.m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        return !this.p && this.h.z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.c) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.n;
        if (callback != null) {
            callback.b(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView g() {
        return this.h.c;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void h(MenuPresenter.Callback callback) {
        this.n = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void m(View view) {
        this.l = view;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void n(boolean z) {
        this.d.c = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void o(int i) {
        this.s = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void p(int i) {
        this.h.f = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void r(boolean z) {
        this.t = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void s(int i) {
        this.h.b(i);
    }

    public StandardMenuPopup(Context context, MenuBuilder menuBuilder, View view, int i, boolean z) {
        this.b = context;
        this.c = menuBuilder;
        this.e = z;
        this.d = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.h = new MenuPopupWindow(context, null, i, 0);
        menuBuilder.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean j(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.b, subMenuBuilder, this.m, this.e, this.g, 0);
            MenuPresenter.Callback callback = this.n;
            menuPopupHelper.h = callback;
            MenuPopup menuPopup = menuPopupHelper.i;
            if (menuPopup != null) {
                menuPopup.h(callback);
            }
            int size = subMenuBuilder.f.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = subMenuBuilder.getItem(i);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            menuPopupHelper.d(z);
            menuPopupHelper.j = this.k;
            this.k = null;
            this.c.c(false);
            MenuPopupWindow menuPopupWindow = this.h;
            int width = menuPopupWindow.f;
            int iE = menuPopupWindow.e();
            if ((Gravity.getAbsoluteGravity(this.s, this.l.getLayoutDirection()) & 7) == 5) {
                width += this.l.getWidth();
            }
            if (!menuPopupHelper.b()) {
                if (menuPopupHelper.e != null) {
                    menuPopupHelper.e(width, iE, true, true);
                }
            }
            MenuPresenter.Callback callback2 = this.n;
            if (callback2 != null) {
                callback2.c(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        View view;
        boolean z;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.p && (view = this.l) != null) {
            this.m = view;
            MenuPopupWindow menuPopupWindow = this.h;
            PopupWindow popupWindow = menuPopupWindow.z;
            PopupWindow popupWindow2 = menuPopupWindow.z;
            popupWindow.setOnDismissListener(this);
            menuPopupWindow.p = this;
            menuPopupWindow.y = true;
            popupWindow2.setFocusable(true);
            View view2 = this.m;
            if (this.o == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.o = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            view2.addOnAttachStateChangeListener(this.j);
            menuPopupWindow.o = view2;
            menuPopupWindow.l = this.s;
            boolean z2 = this.q;
            Context context = this.b;
            MenuAdapter menuAdapter = this.d;
            if (!z2) {
                this.r = MenuPopup.l(menuAdapter, context, this.f);
                this.q = true;
            }
            menuPopupWindow.p(this.r);
            popupWindow2.setInputMethodMode(2);
            Rect rect2 = this.a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            menuPopupWindow.x = rect;
            menuPopupWindow.show();
            DropDownListView dropDownListView = menuPopupWindow.c;
            dropDownListView.setOnKeyListener(this);
            if (this.t) {
                MenuBuilder menuBuilder = this.c;
                if (menuBuilder.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(menuBuilder.m);
                    }
                    frameLayout.setEnabled(false);
                    dropDownListView.addHeaderView(frameLayout, null, false);
                }
            }
            menuPopupWindow.m(menuAdapter);
            menuPopupWindow.show();
            return;
        }
        e32.i("StandardMenuPopup cannot be used without an anchor");
    }
}
