package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import defpackage.i71;
import defpackage.tb5;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.iq, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4115iq {
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    public static final boolean a(View view, Rect rect, int i, List list) {
        boolean z;
        boolean z2;
        view.getClass();
        rect.getClass();
        list.getClass();
        float height = (i / 100.0f) * view.getHeight() * view.getWidth();
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewParent parent = view2.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            Iterable iterableD = tb5.D(viewGroup.indexOfChild(view2) + 1, viewGroup.getChildCount());
            if (!(iterableD instanceof Collection) || !((Collection) iterableD).isEmpty()) {
                i71 it = iterableD.iterator();
                while (it.d) {
                    View childAt = viewGroup.getChildAt(it.nextInt());
                    if (childAt.getVisibility() == 0 && !list.contains(childAt)) {
                        Rect rect2 = new Rect();
                        childAt.getGlobalVisibleRect(rect2);
                        Rect rect3 = new Rect();
                        boolean intersect = rect3.setIntersect(rect, rect2);
                        int i2 = ((rect.bottom - rect.top) * (rect.right - rect.left)) - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                        if (intersect && i2 < height && childAt.getAlpha() > 0.3f) {
                            if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                if (childAt.getBackground() instanceof ColorDrawable) {
                                    Drawable background = childAt.getBackground();
                                    background.getClass();
                                    if (((ColorDrawable) background).getColor() == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if (childAt.getBackground() == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (childAt.getForeground() instanceof ColorDrawable) {
                                    Drawable foreground = childAt.getForeground();
                                    foreground.getClass();
                                    if (((ColorDrawable) foreground).getColor() == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else if (childAt.getForeground() == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z || !z2) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
            view2 = viewGroup;
        }
        return true;
    }

    public static final boolean a(View view, Rect rect, int i, C3873a6 c3873a6) {
        view.getClass();
        rect.getClass();
        c3873a6.getClass();
        if (a(view, c3873a6)) {
            return 100 * (((long) rect.height()) * ((long) rect.width())) >= ((long) (i * (view.getHeight() * view.getWidth())));
        }
        return false;
    }

    public static final boolean a(View view, C3873a6 c3873a6) {
        view.getClass();
        c3873a6.getClass();
        if (view.getVisibility() == 0 && view.getParent() != null && view.isShown() && view.getWidth() >= c3873a6.a && view.getHeight() >= c3873a6.b) {
            if (view.getHeight() * view.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }
}
