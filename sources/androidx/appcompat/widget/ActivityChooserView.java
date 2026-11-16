package androidx.appcompat.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ActionProvider;
import com.ecffri.arrows.R;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    public ActionProvider a;
    public final DataSetObserver b;
    public final ViewTreeObserver.OnGlobalLayoutListener c;
    public ListPopupWindow d;
    public PopupWindow.OnDismissListener e;
    public boolean f;
    public int g;
    public boolean h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass4 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean d() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ActivityChooserViewAdapter extends BaseAdapter {
        public ActivityChooserModel a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int size;
            ActivityChooserModel activityChooserModel = this.a;
            synchronized (activityChooserModel.a) {
                activityChooserModel.a();
                size = activityChooserModel.b.size();
            }
            if (!this.c) {
                this.a.c();
            }
            int iMin = Math.min(size, this.b);
            return this.e ? iMin + 1 : iMin;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return (this.e && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                e32.a();
                return null;
            }
            if (!this.c) {
                this.a.c();
            }
            ActivityChooserModel activityChooserModel = this.a;
            synchronized (activityChooserModel.a) {
                activityChooserModel.a();
                throw null;
            }
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    throw null;
                }
                e32.a();
                return null;
            }
            if (view == null || view.getId() == R.id.list_item) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            throw null;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view == null) {
                throw null;
            }
            if (view != null) {
                throw new IllegalArgumentException();
            }
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            if (view == null) {
                throw null;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    throw null;
                }
                throw new IllegalArgumentException();
            }
            throw null;
        }
    }

    public ActivityChooserView() {
        super(null, null, 0);
        this.b = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                throw null;
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                super.onInvalidated();
                throw null;
            }
        };
        this.c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        return;
                    }
                    activityChooserView.getListPopupWindow().show();
                    ActionProvider actionProvider = activityChooserView.a;
                    if (actionProvider == null || (subUiVisibilityListener = actionProvider.a) == null) {
                        return;
                    }
                    ((ActionMenuPresenter) subUiVisibilityListener).o(true);
                }
            }
        };
        this.g = 4;
        throw null;
    }

    public final void c(int i) {
        throw null;
    }

    @RestrictTo
    public ActivityChooserModel getDataModel() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        throw null;
    }

    @RestrictTo
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        throw null;
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        throw null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass3 extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass5 extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class InnerLayout extends LinearLayout {
        public static final int[] a = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArray = new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, a));
            setBackgroundDrawable(tintTypedArray.b(0));
            tintTypedArray.f();
        }
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.d == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.d = listPopupWindow;
            listPopupWindow.m(null);
            ListPopupWindow listPopupWindow2 = this.d;
            listPopupWindow2.o = this;
            listPopupWindow2.y = true;
            listPopupWindow2.z.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.d;
            listPopupWindow3.p = null;
            listPopupWindow3.z.setOnDismissListener(null);
        }
        return this.d;
    }

    public void setInitialActivityCount(int i) {
        this.g = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.e = onDismissListener;
    }

    @RestrictTo
    public void setProvider(ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.c);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().z.isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        getContext().getString(i);
        throw null;
    }
}
