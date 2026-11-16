package com.adsurge.adn.x1;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class u {
    public static boolean c(View view, int i) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                return false;
            }
            long jHeight = ((long) rect.height()) * ((long) rect.width());
            long height = ((long) view.getHeight()) * ((long) view.getWidth());
            if (height <= 0) {
                return false;
            }
            if (i <= 0 || jHeight * 100 >= ((long) i) * height) {
                return true;
            }
        }
        return false;
    }

    public static Pair a(View view, int i, int i2) {
        int i3 = 0;
        if (view == null) {
            return new Pair(Boolean.FALSE, 0);
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() == 0 || rect.height() == 0) {
            a(100, 1, i2, view, rect);
            return new Pair(Boolean.TRUE, 100);
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            if (viewGroup.getVisibility() != 0) {
                a(100, 2, i2, viewGroup, "parent not visible");
                return new Pair(Boolean.TRUE, 100);
            }
            for (int iA = a(view2, viewGroup) + 1; iA < viewGroup.getChildCount(); iA++) {
                View childAt = viewGroup.getChildAt(iA);
                if (childAt != null && childAt.isShown() && childAt.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !b(childAt)) {
                    Rect rect2 = new Rect();
                    childAt.getGlobalVisibleRect(rect2);
                    int iA2 = (a(rect2, rect) * 100) / (rect.height() * rect.width());
                    if (iA2 <= i3) {
                        continue;
                    } else {
                        if (iA2 >= i) {
                            a(iA2, 3, i2, view, childAt, rect, rect2, Float.valueOf(childAt.getAlpha()));
                            return new Pair(Boolean.TRUE, Integer.valueOf(iA2));
                        }
                        i3 = iA2;
                    }
                }
            }
            view2 = viewGroup;
        }
        if (i3 > 0) {
            a(i3, 4, i2, view, rect);
        }
        return new Pair(Boolean.FALSE, Integer.valueOf(i3));
    }

    public static boolean b(View view) {
        Object tag = view.getTag(2131755013);
        if (tag == null || !(tag instanceof String) || !TextUtils.equals((String) tag, "gdtdmmt")) {
            return false;
        }
        return true;
    }

    public static Pair b(View view, int i) {
        return a(view, i, -1);
    }

    public static boolean c(View view) {
        return view != null && view.isShown();
    }

    public static boolean a(View view, int i) {
        return a(view, i, false);
    }

    public static boolean a(View view, int i, boolean z) {
        if (view != null && c(view) && c(view, i)) {
            return !z || view.hasWindowFocus();
        }
        return false;
    }

    public static float a(View view) {
        float alpha = 1.0f;
        while (view != null) {
            alpha *= view.getAlpha();
            if (alpha > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            view = null;
        }
        return alpha;
    }

    public static void a(int i, int i2, int i3, Object... objArr) {
        if (i3 < 0) {
            return;
        }
        int i4 = (i3 * 10) + i2;
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(" ");
        }
        com.adsurge.adn.w1.b.a(9300001, (com.adsurge.adn.Y0.c) null, Integer.valueOf(i), Integer.valueOf(i4), new com.adsurge.adn.Y0.d().a(NotificationCompat.CATEGORY_MESSAGE, sb.toString()));
    }

    public static int a(Rect rect, Rect rect2) {
        int iWidth;
        int i;
        int i2;
        int i3 = rect.left;
        int i4 = rect2.left;
        int iHeight = 0;
        if (i3 > i4 || (i2 = rect.right) <= i4) {
            int i5 = rect.right;
            int i6 = rect2.right;
            if (i5 < i6 || i3 >= i6) {
                iWidth = (i3 <= i4 || i5 >= i6) ? 0 : rect.width();
            } else {
                iWidth = i6 - i3;
            }
        } else {
            iWidth = i2 - i4;
        }
        if (iWidth > rect2.width()) {
            iWidth = rect2.width();
        }
        if (iWidth == 0) {
            return 0;
        }
        int i7 = rect.top;
        int i8 = rect2.top;
        if (i7 > i8 || (i = rect.bottom) <= i8) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            if (i9 >= i10 && i7 < i10) {
                iHeight = i10 - i7;
            } else if (i7 > i8 && i9 < i10) {
                iHeight = rect.height();
            }
        } else {
            iHeight = i - i8;
        }
        if (iHeight > rect2.height()) {
            iHeight = rect2.height();
        }
        return iWidth * iHeight;
    }

    public static int a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }
}
