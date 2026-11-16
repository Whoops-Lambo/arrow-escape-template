package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import com.ecffri.arrows.R;
import defpackage.nj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View n;
    public View o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean v;
    public MenuPresenter.Callback w;
    public ViewTreeObserver x;
    public PopupWindow.OnDismissListener y;
    public boolean z;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener i = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ArrayList arrayList = cascadingMenuPopup.h;
            if (!cascadingMenuPopup.a() || arrayList.size() <= 0) {
                return;
            }
            int i = 0;
            if (((CascadingMenuInfo) arrayList.get(0)).a.y) {
                return;
            }
            View view = cascadingMenuPopup.o;
            if (view == null || !view.isShown()) {
                cascadingMenuPopup.dismiss();
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((CascadingMenuInfo) obj).a.show();
            }
        }
    };
    public final View.OnAttachStateChangeListener j = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.x = view.getViewTreeObserver();
                }
                cascadingMenuPopup.x.removeGlobalOnLayoutListener(cascadingMenuPopup.i);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public final MenuItemHoverListener k = new MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void f(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.f.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void i(final MenuBuilder menuBuilder, final MenuItemImpl menuItemImpl) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            Handler handler = cascadingMenuPopup.f;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final CascadingMenuInfo cascadingMenuInfo = i2 < arrayList.size() ? (CascadingMenuInfo) arrayList.get(i2) : null;
            handler.postAtTime(new Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    CascadingMenuPopup cascadingMenuPopup2 = CascadingMenuPopup.this;
                    CascadingMenuInfo cascadingMenuInfo2 = cascadingMenuInfo;
                    if (cascadingMenuInfo2 != null) {
                        cascadingMenuPopup2.z = true;
                        cascadingMenuInfo2.b.c(false);
                        cascadingMenuPopup2.z = false;
                    }
                    MenuItemImpl menuItemImpl2 = menuItemImpl;
                    if (menuItemImpl2.isEnabled() && menuItemImpl2.hasSubMenu()) {
                        menuBuilder.q(menuItemImpl2, null, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }
    };
    public int l = 0;
    public int m = 0;
    public boolean u = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void p(int i) {
        this.q = true;
        this.s = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void s(int i) {
        this.r = true;
        this.t = i;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CascadingMenuInfo {
        public final MenuPopupWindow a;
        public final MenuBuilder b;
        public final int c;

        public CascadingMenuInfo(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.a = menuPopupWindow;
            this.b = menuBuilder;
            this.c = i;
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((CascadingMenuInfo) arrayList.get(0)).a.z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((CascadingMenuInfo) arrayList.get(i2)).b.c(false);
        }
        CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) arrayList.remove(i);
        MenuBuilder menuBuilder2 = cascadingMenuInfo.b;
        MenuPopupWindow menuPopupWindow = cascadingMenuInfo.a;
        menuBuilder2.r(this);
        if (this.z) {
            menuPopupWindow.r();
            menuPopupWindow.z.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.p = ((CascadingMenuInfo) arrayList.get(size2 - 1)).c;
        } else {
            this.p = this.n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((CascadingMenuInfo) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.w;
        if (callback != null) {
            callback.b(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.i);
            }
            this.x = null;
        }
        this.o.removeOnAttachStateChangeListener(this.j);
        this.y.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void d(boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((CascadingMenuInfo) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) arrayList.toArray(new CascadingMenuInfo[size]);
            for (int i = size - 1; i >= 0; i--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i];
                if (cascadingMenuInfo.a.z.isShowing()) {
                    cascadingMenuInfo.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView g() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((CascadingMenuInfo) nj.h(1, arrayList)).a.c;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void h(MenuPresenter.Callback callback) {
        this.w = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean j(SubMenuBuilder subMenuBuilder) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) obj;
            if (subMenuBuilder == cascadingMenuInfo.b) {
                cascadingMenuInfo.a.c.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        k(subMenuBuilder);
        MenuPresenter.Callback callback = this.w;
        if (callback != null) {
            callback.c(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void k(MenuBuilder menuBuilder) {
        menuBuilder.b(this, this.b);
        if (a()) {
            t(menuBuilder);
        } else {
            this.g.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void m(View view) {
        if (this.n != view) {
            this.n = view;
            this.m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void n(boolean z) {
        this.u = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void o(int i) {
        if (this.l != i) {
            this.l = i;
            this.m = Gravity.getAbsoluteGravity(i, this.n.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = (CascadingMenuInfo) arrayList.get(i);
            if (!cascadingMenuInfo.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.b.c(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void r(boolean z) {
        this.v = z;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f A[PHI: r5
  0x019f: PHI (r5v17 int) = (r5v9 int), (r5v18 int) binds: [B:81:0x01a1, B:79:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t(MenuBuilder menuBuilder) {
        boolean z;
        int i;
        int i2;
        CascadingMenuInfo cascadingMenuInfo;
        View childAt;
        Rect rect;
        Rect rect2;
        DropDownListView dropDownListView;
        int[] iArr;
        Rect rect3;
        int i3;
        int i4;
        int[] iArr2;
        int[] iArr3;
        int i5;
        int i6;
        int width;
        MenuItem item;
        MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        MenuAdapter menuAdapter2 = new MenuAdapter(menuBuilder, layoutInflaterFrom, this.e, R.layout.abc_cascading_menu_item_layout);
        int i7 = 1;
        if (!a() && this.u) {
            menuAdapter2.c = true;
        } else if (a()) {
            int size = menuBuilder.f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuBuilder.getItem(i8);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i8++;
            }
            menuAdapter2.c = z;
        }
        int iL = MenuPopup.l(menuAdapter2, context, this.c);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(context, null, this.d, 0);
        menuPopupWindow.C = this.k;
        menuPopupWindow.p = this;
        PopupWindow popupWindow = menuPopupWindow.z;
        popupWindow.setOnDismissListener(this);
        menuPopupWindow.o = this.n;
        menuPopupWindow.l = this.m;
        menuPopupWindow.y = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        menuPopupWindow.m(menuAdapter2);
        menuPopupWindow.p(iL);
        menuPopupWindow.l = this.m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            cascadingMenuInfo = (CascadingMenuInfo) nj.h(1, arrayList);
            MenuBuilder menuBuilder2 = cascadingMenuInfo.b;
            int size2 = menuBuilder2.f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size2) {
                    item = null;
                    break;
                }
                item = menuBuilder2.getItem(i9);
                if (item.hasSubMenu() && menuBuilder == item.getSubMenu()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (item == null) {
                i = 1;
                i2 = 0;
                childAt = null;
            } else {
                DropDownListView dropDownListView2 = cascadingMenuInfo.a.c;
                ListAdapter adapter = dropDownListView2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    headersCount = 0;
                }
                int count = menuAdapter.getCount();
                int i10 = 0;
                i2 = 0;
                while (true) {
                    i = i7;
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else {
                        if (item == menuAdapter.getItem(i10)) {
                            break;
                        }
                        i10++;
                        i7 = i;
                    }
                }
                if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - dropDownListView2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dropDownListView2.getChildCount()) {
                    childAt = dropDownListView2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                menuPopupWindow.s();
                menuPopupWindow.q();
                dropDownListView = ((CascadingMenuInfo) arrayList.get(arrayList.size() - 1)).a.c;
                iArr = new int[2];
                dropDownListView.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.o.getWindowVisibleDisplayFrame(rect3);
                if (this.p == i) {
                    if (dropDownListView.getWidth() + iArr[i2] + iL > rect3.right) {
                        i3 = i2;
                    } else {
                        i3 = 1;
                    }
                } else if (iArr[i2] - iL < 0) {
                    i3 = 1;
                } else {
                    i3 = i2;
                }
                if (i3 == 1) {
                    i4 = 1;
                } else {
                    i4 = i2;
                }
                this.p = i3;
                if (Build.VERSION.SDK_INT >= 26) {
                    menuPopupWindow.o = childAt;
                    i6 = i2;
                    i5 = i6;
                } else {
                    iArr2 = new int[2];
                    this.n.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.m & 7) == 5) {
                        iArr2[i2] = this.n.getWidth() + iArr2[i2];
                        iArr3[i2] = childAt.getWidth() + iArr3[i2];
                    }
                    i5 = iArr3[i2] - iArr2[i2];
                    i6 = iArr3[1] - iArr2[1];
                }
                if ((this.m & 5) == 5) {
                    if (i4 != 0) {
                        width = i5 + iL;
                    } else {
                        iL = childAt.getWidth();
                        width = i5 - iL;
                    }
                } else if (i4 != 0) {
                    width = i5 + childAt.getWidth();
                } else {
                    width = i5 - iL;
                }
                menuPopupWindow.f = width;
                menuPopupWindow.k = true;
                menuPopupWindow.j = true;
                menuPopupWindow.b(i6);
            } else {
                if (this.q) {
                    menuPopupWindow.f = this.s;
                }
                if (this.r) {
                    menuPopupWindow.b(this.t);
                }
                rect = this.a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                menuPopupWindow.x = rect2;
            }
            arrayList.add(new CascadingMenuInfo(menuPopupWindow, menuBuilder, this.p));
            menuPopupWindow.show();
            DropDownListView dropDownListView3 = menuPopupWindow.c;
            dropDownListView3.setOnKeyListener(this);
            if (cascadingMenuInfo == null || !this.v || menuBuilder.m == null) {
                return;
            }
            boolean z2 = i2;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, dropDownListView3, z2);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z2);
            textView.setText(menuBuilder.m);
            dropDownListView3.addHeaderView(frameLayout, null, z2);
            menuPopupWindow.show();
            return;
        }
        i = 1;
        i2 = 0;
        cascadingMenuInfo = null;
        childAt = null;
        if (childAt != null) {
            menuPopupWindow.s();
            menuPopupWindow.q();
            dropDownListView = ((CascadingMenuInfo) arrayList.get(arrayList.size() - 1)).a.c;
            iArr = new int[2];
            dropDownListView.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.o.getWindowVisibleDisplayFrame(rect3);
            if (this.p == i) {
                if (dropDownListView.getWidth() + iArr[i2] + iL > rect3.right) {
                    i3 = i2;
                } else {
                    i3 = 1;
                }
            } else if (iArr[i2] - iL < 0) {
                i3 = 1;
            } else {
                i3 = i2;
            }
            if (i3 == 1) {
                i4 = 1;
            } else {
                i4 = i2;
            }
            this.p = i3;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindow.o = childAt;
                i6 = i2;
                i5 = i6;
            } else {
                iArr2 = new int[2];
                this.n.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.m & 7) == 5) {
                    iArr2[i2] = this.n.getWidth() + iArr2[i2];
                    iArr3[i2] = childAt.getWidth() + iArr3[i2];
                }
                i5 = iArr3[i2] - iArr2[i2];
                i6 = iArr3[1] - iArr2[1];
            }
            if ((this.m & 5) == 5) {
                if (i4 != 0) {
                    width = i5 + iL;
                } else {
                    iL = childAt.getWidth();
                    width = i5 - iL;
                }
            } else if (i4 != 0) {
                width = i5 + childAt.getWidth();
            } else {
                width = i5 - iL;
            }
            menuPopupWindow.f = width;
            menuPopupWindow.k = true;
            menuPopupWindow.j = true;
            menuPopupWindow.b(i6);
        } else {
            if (this.q) {
                menuPopupWindow.f = this.s;
            }
            if (this.r) {
                menuPopupWindow.b(this.t);
            }
            rect = this.a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            menuPopupWindow.x = rect2;
        }
        arrayList.add(new CascadingMenuInfo(menuPopupWindow, menuBuilder, this.p));
        menuPopupWindow.show();
        DropDownListView dropDownListView4 = menuPopupWindow.c;
        dropDownListView4.setOnKeyListener(this);
        if (cascadingMenuInfo == null) {
        }
    }

    public CascadingMenuPopup(Context context, View view, int i, boolean z) {
        this.b = context;
        this.n = view;
        this.d = i;
        this.e = z;
        this.p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
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
        if (!a()) {
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t((MenuBuilder) obj);
            }
            arrayList.clear();
            View view = this.n;
            this.o = view;
            if (view != null) {
                if (this.x == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.x = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.i);
                }
                this.o.addOnAttachStateChangeListener(this.j);
            }
        }
    }
}
