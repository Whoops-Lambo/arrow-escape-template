package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ListPopupWindow implements ShowableListMenu {
    public static final Method A;
    public static final Method B;
    public final Context a;
    public ListAdapter b;
    public DropDownListView c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public final int m;
    public DataSetObserver n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final ResizePopupRunnable r;
    public final PopupTouchInterceptor s;
    public final PopupScrollListener t;
    public final ListSelectorHider u;
    public final Handler v;
    public final Rect w;
    public Rect x;
    public boolean y;
    public final PopupWindow z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass1 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final /* bridge */ /* synthetic */ ShowableListMenu b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ListSelectorHider implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.c;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }

        public ListSelectorHider() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.z.isShowing()) {
                listPopupWindow.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class PopupScrollListener implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            ResizePopupRunnable resizePopupRunnable = listPopupWindow.r;
            PopupWindow popupWindow = listPopupWindow.z;
            if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
                return;
            }
            listPopupWindow.v.removeCallbacks(resizePopupRunnable);
            resizePopupRunnable.run();
        }

        public PopupScrollListener() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class PopupTouchInterceptor implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            ResizePopupRunnable resizePopupRunnable = listPopupWindow.r;
            Handler handler = listPopupWindow.v;
            PopupWindow popupWindow = listPopupWindow.z;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && popupWindow != null && popupWindow.isShowing() && x >= 0 && x < popupWindow.getWidth() && y >= 0 && y < popupWindow.getHeight()) {
                handler.postDelayed(resizePopupRunnable, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            handler.removeCallbacks(resizePopupRunnable);
            return false;
        }

        public PopupTouchInterceptor() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ResizePopupRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            DropDownListView dropDownListView = listPopupWindow.c;
            if (dropDownListView == null || !dropDownListView.isAttachedToWindow() || listPopupWindow.c.getCount() <= listPopupWindow.c.getChildCount() || listPopupWindow.c.getChildCount() > listPopupWindow.m) {
                return;
            }
            listPopupWindow.z.setInputMethodMode(2);
            listPopupWindow.show();
        }

        public ResizePopupRunnable() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        return this.z.isShowing();
    }

    public final void b(int i) {
        this.g = i;
        this.i = true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        PopupWindow popupWindow = this.z;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final int e() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView g() {
        return this.c;
    }

    public final Drawable getBackground() {
        return this.z.getBackground();
    }

    public final int h() {
        return this.f;
    }

    public final void j(int i) {
        this.f = i;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.n;
        if (dataSetObserver == null) {
            this.n = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        DropDownListView dropDownListView = this.c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.b);
        }
    }

    public final void n(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public DropDownListView o(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    public final void p(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.c;
        Context context = this.a;
        PopupWindow popupWindow = this.z;
        if (dropDownListView2 == null) {
            DropDownListView dropDownListViewO = o(context, !this.y);
            this.c = dropDownListViewO;
            dropDownListViewO.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view, int i2, long j) {
                    DropDownListView dropDownListView3;
                    if (i2 == -1 || (dropDownListView3 = ListPopupWindow.this.c) == null) {
                        return;
                    }
                    dropDownListView3.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = Api24Impl.a(popupWindow, this.o, this.g, popupWindow.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.h);
        if (popupWindow.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        popupWindow.setWidth(i5 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(i5 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                int i6 = width;
                View view = this.o;
                int i7 = this.f;
                int i8 = this.g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                popupWindow.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Api29Impl.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.s);
        if (this.k) {
            popupWindow.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            Api29Impl.a(popupWindow, this.x);
        }
        popupWindow.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (dropDownListView = this.c) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = Integer.MAX_VALUE;
        this.r = new ResizePopupRunnable();
        this.s = new PopupTouchInterceptor();
        this.t = new PopupScrollListener();
        this.u = new ListSelectorHider();
        this.w = new Rect();
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.s, i, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            appCompatPopupWindow.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        appCompatPopupWindow.setBackgroundDrawable(tintTypedArray.b(0));
        tintTypedArray.f();
        this.z = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public ListPopupWindow(Context context) {
        this(context, null, com.ecffri.arrows.R.attr.listPopupWindowStyle, 0);
    }
}
