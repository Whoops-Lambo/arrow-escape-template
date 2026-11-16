package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class dta {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        void ahm();

        void kgy();

        void kgy(View view, boolean z);

        void kgy(boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewGroup ahm;
        View kgy = null;
        final /* synthetic */ boolean rz;

        public kgy(ViewGroup viewGroup, boolean z) {
            this.ahm = viewGroup;
            this.rz = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                ahm ahmVar = (ahm) this.ahm.getTag(520093765);
                if (this.kgy != null) {
                    Rect rect = new Rect();
                    this.kgy.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.ahm.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (ahmVar != null) {
                            ahmVar.kgy(this.ahm, false);
                        }
                        this.ahm.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (ahmVar != null) {
                            ahmVar.kgy(this.ahm, true);
                        }
                        this.ahm.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.ahm;
                dta.ahm(viewGroup, ahmVar, (Integer) viewGroup.getTag(520093766), this.rz);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "becogjaoYMuTDoZxjQivPU/CJIYXuWfCkg==", "VOAKmQy+aMusS85SmQU=", 73);
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.ahm.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ahm(View view, ahm ahmVar, Integer num, boolean z) {
        if (ahmVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        ahmVar.kgy(view, kgy(view, num.intValue(), z));
    }

    public static void kgy(final ViewGroup viewGroup, boolean z, int i, final boolean z2, ahm ahmVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, ahmVar);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final kgy kgyVar = new kgy(viewGroup, z2);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.dta.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        kgyVar.kgy = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        kgyVar.kgy = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(kgyVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.dta.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        ahm ahmVar2 = (ahm) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        dta.ahm(viewGroup2, ahmVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "becogjaoYMuTDoU=", "VOAelhGzZcujQtZTixSk", 108);
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.dta.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z3) {
                try {
                    ahm ahmVar2 = (ahm) viewGroup.getTag(520093765);
                    if (ahmVar2 != null) {
                        ahmVar2.kgy(z3);
                        ViewGroup viewGroup2 = viewGroup;
                        dta.ahm(viewGroup2, ahmVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "becogjaoYMuTDoQ=", "VOAanA24ZtCmRdRInzKoKVXpKJE=", 142);
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.dta.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ahm ahmVar2 = (ahm) viewGroup.getTag(520093765);
                if (ahmVar2 != null) {
                    ahmVar2.kgy();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ahm ahmVar2 = (ahm) viewGroup.getTag(520093765);
                if (ahmVar2 != null) {
                    ahmVar2.ahm();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean kgy(View view, int i, boolean z) {
        return com.bytedance.sdk.openadsdk.core.muf.kgy(view, 20, i, z);
    }

    public static ArrayList<View> kgy(View view, int i) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i > 1 && parent != null) {
                arrayList.addAll(kgy((View) parent, i - 1));
            }
        }
        return arrayList;
    }

    public static View kgy(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return kgy((View) parent, cls);
    }
}
