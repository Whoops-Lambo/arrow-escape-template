package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Q7 {
    public long a;

    public final boolean b(View view, View view2, int i) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                Ej ej = view2 instanceof Ej ? (Ej) view2 : null;
                if (ej == null) {
                    return false;
                }
                if (ej.getPlacementType() != 1 && (ej.getHeight() <= 0 || ej.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!ej.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.a = ((long) rect.height()) * ((long) rect.width());
                if (ej.getPlacementType() == 1) {
                    ej.setConfiguredArea(ej.getHeight() * ej.getWidth());
                }
                if (ej.getArea() > 0) {
                    if (100 * this.a >= ej.getConfiguredArea() * ((long) i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    public final boolean a(View view, View view2, int i) {
        ViewGroup viewGroup;
        boolean z;
        boolean z2;
        boolean zContainsKey;
        boolean z3;
        boolean z4;
        boolean z5;
        view.getClass();
        view2.getClass();
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && !a(viewGroup, view2, i)) {
            z = false;
        } else {
            z = true;
        }
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                View childAt = viewGroup.getChildAt(iIndexOfChild);
                childAt.getClass();
                if (childAt.getVisibility() == 0) {
                    if (view2 instanceof Ej) {
                        if (!(childAt instanceof C4103id)) {
                            if (!(childAt instanceof Mj)) {
                                Ej ej = (Ej) view2;
                                Map<View, FriendlyObstructionPurpose> friendlyViews = ej.getFriendlyViews();
                                if (friendlyViews != null) {
                                    zContainsKey = friendlyViews.containsKey(childAt);
                                } else {
                                    zContainsKey = false;
                                }
                                if (!zContainsKey) {
                                    Rect rect = new Rect();
                                    view2.getGlobalVisibleRect(rect);
                                    Rect rect2 = new Rect();
                                    childAt.getGlobalVisibleRect(rect2);
                                    Rect rect3 = new Rect();
                                    boolean intersect = rect3.setIntersect(rect, rect2);
                                    int i2 = ((rect.bottom - rect.top) * (rect.right - rect.left)) - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                    float configuredArea = (i / 100.0f) * ej.getConfiguredArea();
                                    if (intersect && i2 < configuredArea) {
                                        if (childAt.getAlpha() > 0.3f) {
                                            if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                                if (childAt.getBackground() instanceof ColorDrawable) {
                                                    Drawable background = childAt.getBackground();
                                                    background.getClass();
                                                    if (((ColorDrawable) background).getColor() == 0) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                } else if (childAt.getBackground() == null) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (childAt.getForeground() instanceof ColorDrawable) {
                                                    Drawable foreground = childAt.getForeground();
                                                    foreground.getClass();
                                                    if (((ColorDrawable) foreground).getColor() == 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                } else if (childAt.getForeground() == null) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z4 && z5) {
                                                    z3 = true;
                                                }
                                            }
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        if (!z3) {
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return false;
                    }
                }
            }
        }
        return z;
    }
}
