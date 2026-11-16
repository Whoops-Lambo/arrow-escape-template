package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopup;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ActionProvider;
import com.ecffri.arrows.R;
import defpackage.e32;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {
    public OverflowMenuButton i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final SparseBooleanArray r;
    public OverflowPopup s;
    public ActionButtonSubmenu t;
    public OpenOverflowRunnable u;
    public ActionMenuPopupCallback v;
    public final PopupPresenterCallback w;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, R.attr.actionOverflowMenuStyle, 0);
            if ((subMenuBuilder.A.x & 32) != 32) {
                View view2 = ActionMenuPresenter.this.i;
                this.e = view2 == null ? (View) ActionMenuPresenter.this.h : view2;
            }
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.w;
            this.h = popupPresenterCallback;
            MenuPopup menuPopup = this.i;
            if (menuPopup != null) {
                menuPopup.h(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter.this.t = null;
            super.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public final ShowableListMenu a() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.t;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.a();
            }
            return null;
        }

        public ActionMenuPopupCallback() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class OpenOverflowRunnable implements Runnable {
        public final OverflowPopup a;

        @Override // java.lang.Runnable
        public final void run() {
            MenuBuilder.Callback callback;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.c;
            if (menuBuilder != null && (callback = menuBuilder.e) != null) {
                callback.b(menuBuilder);
            }
            View view = (View) actionMenuPresenter.h;
            if (view != null && view.getWindowToken() != null) {
                OverflowPopup overflowPopup = this.a;
                if (overflowPopup.b()) {
                    actionMenuPresenter.s = overflowPopup;
                } else if (overflowPopup.e != null) {
                    overflowPopup.e(0, 0, false, false);
                    actionMenuPresenter.s = overflowPopup;
                }
            }
            actionMenuPresenter.u = null;
        }

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.a = overflowPopup;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean b() {
            return false;
        }

        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.a(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public final ShowableListMenu b() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.s;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.a();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean c() {
                    ActionMenuPresenter.this.p();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean d() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.u != null) {
                        return false;
                    }
                    actionMenuPresenter.m();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.p();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view) {
            super(context, menuBuilder, view, true, R.attr.actionOverflowMenuStyle, 0);
            this.f = 8388613;
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.w;
            this.h = popupPresenterCallback;
            MenuPopup menuPopup = this.i;
            if (menuPopup != null) {
                menuPopup.h(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.c;
            if (menuBuilder != null) {
                menuBuilder.c(true);
            }
            actionMenuPresenter.s = null;
            super.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class PopupPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void b(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                ((SubMenuBuilder) menuBuilder).z.k().c(false);
            }
            MenuPresenter.Callback callback = ActionMenuPresenter.this.e;
            if (callback != null) {
                callback.b(menuBuilder, z);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean c(MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == actionMenuPresenter.c) {
                return false;
            }
            ((SubMenuBuilder) menuBuilder).A.getClass();
            MenuPresenter.Callback callback = actionMenuPresenter.e;
            if (callback != null) {
                return callback.c(menuBuilder);
            }
            return false;
        }

        public PopupPresenterCallback() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean e() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.c;
        if (menuBuilder != null) {
            arrayListL = menuBuilder.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = actionMenuPresenter.p;
        int i3 = actionMenuPresenter.o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListL.get(i4);
            int i7 = menuItemImpl.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.q && menuItemImpl.C) {
                i2 = 0;
            }
            i4++;
        }
        if (actionMenuPresenter.l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayListL.get(i9);
            int i11 = menuItemImpl2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = menuItemImpl2.b;
            if (z3) {
                View viewK = actionMenuPresenter.k(menuItemImpl2, null, viewGroup);
                viewK.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewK.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                menuItemImpl2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewK2 = actionMenuPresenter.k(menuItemImpl2, null, viewGroup);
                        viewK2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewK2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            MenuItemImpl menuItemImpl3 = (MenuItemImpl) arrayListL.get(i13);
                            if (menuItemImpl3.b == i12) {
                                if ((menuItemImpl3.x & 32) == 32) {
                                    i8++;
                                }
                                menuItemImpl3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    menuItemImpl2.f(z5);
                } else {
                    menuItemImpl2.f(false);
                }
                i9++;
                i = 2;
                actionMenuPresenter = this;
                z = true;
            }
            i9++;
            i = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean l(MenuItemImpl menuItemImpl) {
        return (menuItemImpl.x & 32) == 32;
    }

    public final boolean m() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.u;
        if (openOverflowRunnable != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.u = null;
            return true;
        }
        OverflowPopup overflowPopup = this.s;
        if (overflowPopup == null) {
            return false;
        }
        if (overflowPopup.b()) {
            overflowPopup.i.dismiss();
        }
        return true;
    }

    public final boolean n() {
        OverflowPopup overflowPopup = this.s;
        return overflowPopup != null && overflowPopup.b();
    }

    public final void o(boolean z) {
        if (z) {
            super.j(null);
            return;
        }
        MenuBuilder menuBuilder = this.c;
        if (menuBuilder != null) {
            menuBuilder.c(false);
        }
    }

    public final boolean p() {
        MenuBuilder menuBuilder;
        if (!this.l || n() || (menuBuilder = this.c) == null || this.h == null || this.u != null) {
            return false;
        }
        menuBuilder.i();
        if (menuBuilder.j.isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.b, this.c, this.i));
        this.u = openOverflowRunnable;
        ((View) this.h).post(openOverflowRunnable);
        return true;
    }

    public ActionMenuPresenter(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.f = R.layout.abc_action_menu_layout;
        this.g = R.layout.abc_action_menu_item_layout;
        this.r = new SparseBooleanArray();
        this.w = new PopupPresenterCallback();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void a(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.c(menuItemImpl);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
        if (this.v == null) {
            this.v = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.v);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z) {
        m();
        ActionButtonSubmenu actionButtonSubmenu = this.t;
        if (actionButtonSubmenu != null && actionButtonSubmenu.b()) {
            actionButtonSubmenu.i.dismiss();
        }
        super.b(menuBuilder, z);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void d(boolean z) {
        ArrayList arrayList;
        super.d(z);
        ((View) this.h).requestLayout();
        MenuBuilder menuBuilder = this.c;
        boolean z2 = false;
        if (menuBuilder != null) {
            menuBuilder.i();
            ArrayList arrayList2 = menuBuilder.i;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ActionProvider actionProvider = ((MenuItemImpl) arrayList2.get(i)).A;
                if (actionProvider != null) {
                    actionProvider.a = this;
                }
            }
        }
        MenuBuilder menuBuilder2 = this.c;
        if (menuBuilder2 != null) {
            menuBuilder2.i();
            arrayList = menuBuilder2.j;
        } else {
            arrayList = null;
        }
        if (this.l && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !((MenuItemImpl) arrayList.get(0)).C;
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        OverflowMenuButton overflowMenuButton = this.i;
        if (z2) {
            if (overflowMenuButton == null) {
                this.i = new OverflowMenuButton(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.i.getParent();
            if (viewGroup != this.h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                OverflowMenuButton overflowMenuButton2 = this.i;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParamsJ = ActionMenuView.j();
                layoutParamsJ.a = true;
                actionMenuView.addView(overflowMenuButton2, layoutParamsJ);
            }
        } else if (overflowMenuButton != null) {
            Object parent = overflowMenuButton.getParent();
            Object obj = this.h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void f(Context context, MenuBuilder menuBuilder) {
        super.f(context, menuBuilder);
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy();
        actionBarPolicy.a = context;
        if (!this.m) {
            this.l = true;
        }
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.p = actionBarPolicy.a();
        int measuredWidth = this.n;
        if (this.l) {
            if (this.i == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.a);
                this.i = overflowMenuButton;
                if (this.k) {
                    overflowMenuButton.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean g(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.i) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean j(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
            while (true) {
                MenuBuilder menuBuilder = subMenuBuilder2.z;
                if (menuBuilder == this.c) {
                    break;
                }
                subMenuBuilder2 = (SubMenuBuilder) menuBuilder;
            }
            MenuItemImpl menuItemImpl = subMenuBuilder2.A;
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItemImpl) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                subMenuBuilder.A.getClass();
                int size = subMenuBuilder.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        MenuItem item = subMenuBuilder.getItem(i2);
                        if (item.isVisible() && item.getIcon() != null) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.b, subMenuBuilder, view);
                this.t = actionButtonSubmenu;
                actionButtonSubmenu.d(z);
                ActionButtonSubmenu actionButtonSubmenu2 = this.t;
                if (!actionButtonSubmenu2.b()) {
                    if (actionButtonSubmenu2.e != null) {
                        actionButtonSubmenu2.e(0, 0, false, false);
                    } else {
                        e32.i("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                super.j(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final View k(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        int i;
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.e()) {
            actionView = super.k(menuItemImpl, view, viewGroup);
        }
        if (menuItemImpl.C) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }
}
