package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    public final RecyclerView d;
    public final ItemDelegate e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ItemDelegate extends AccessibilityDelegateCompat {
        public final RecyclerViewAccessibilityDelegate d;
        public final WeakHashMap e = new WeakHashMap();

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final AccessibilityNodeProviderCompat b(View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.b(view) : super.b(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.d;
            RecyclerView recyclerView = recyclerViewAccessibilityDelegate.d;
            RecyclerView recyclerView2 = recyclerViewAccessibilityDelegate.d;
            boolean zHasPendingAdapterUpdates = recyclerView.hasPendingAdapterUpdates();
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            if (zHasPendingAdapterUpdates || recyclerView2.getLayoutManager() == null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
            recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.d(view, accessibilityNodeInfoCompat);
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(viewGroup);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean g(View view, int i, Bundle bundle) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.d;
            RecyclerView recyclerView = recyclerViewAccessibilityDelegate.d;
            RecyclerView recyclerView2 = recyclerViewAccessibilityDelegate.d;
            if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
                return super.g(view, i, bundle);
            }
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                if (accessibilityDelegateCompat.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void h(View view, int i) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.d = recyclerViewAccessibilityDelegate;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
    }

    public AccessibilityDelegateCompat j() {
        return this.e;
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.d = recyclerView;
        AccessibilityDelegateCompat accessibilityDelegateCompatJ = j();
        if (accessibilityDelegateCompatJ != null && (accessibilityDelegateCompatJ instanceof ItemDelegate)) {
            this.e = (ItemDelegate) accessibilityDelegateCompatJ;
        } else {
            this.e = new ItemDelegate(this);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
        }
        return false;
    }
}
