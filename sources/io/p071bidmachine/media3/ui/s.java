package io.p071bidmachine.media3.ui;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ s(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[LOOP:3: B:37:0x00af->B:39:0x00b5, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w wVar = this.b;
        switch (i) {
            case 0:
                wVar.k();
                break;
            case 1:
                View view = wVar.j;
                ViewGroup viewGroup = wVar.e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(wVar.A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = wVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (wVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof e) {
                        e eVar = (e) view;
                        Rect rect = eVar.a;
                        ValueAnimator valueAnimator = eVar.E;
                        if (wVar.A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            eVar.G = true;
                            eVar.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            eVar.invalidate(rect);
                        } else {
                            int i2 = wVar.z;
                            if (i2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                eVar.G = false;
                                eVar.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                eVar.invalidate(rect);
                            } else if (i2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                eVar.G = false;
                                eVar.F = 1.0f;
                                eVar.invalidate(rect);
                            }
                        }
                    }
                }
                ArrayList arrayList = wVar.y;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    View view2 = (View) obj;
                    view2.setVisibility((wVar.A && w.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = wVar.r;
                View view3 = wVar.k;
                r rVar = wVar.a;
                ViewGroup viewGroup2 = wVar.g;
                ViewGroup viewGroup3 = wVar.f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (rVar.getWidth() - rVar.getPaddingLeft()) - rVar.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int iC = w.c(wVar.i);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        iC += w.c(viewGroup3.getChildAt(i4));
                    }
                    if (iC > width) {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            iC += w.c(view3);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i5 = 0; i5 < childCount2; i5++) {
                            View childAt2 = viewGroup3.getChildAt(i5);
                            iC -= w.c(childAt2);
                            arrayList2.add(childAt2);
                            if (iC <= width) {
                                if (!arrayList2.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList2.size());
                                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                        viewGroup2.addView((View) arrayList2.get(i6), viewGroup2.getChildCount() - 1);
                                    }
                                }
                            }
                            break;
                        }
                        if (!arrayList2.isEmpty()) {
                            viewGroup3.removeViews(0, arrayList2.size());
                            while (i6 < arrayList2.size()) {
                                viewGroup2.addView((View) arrayList2.get(i6), viewGroup2.getChildCount() - 1);
                            }
                        }
                        break;
                    } else {
                        ViewGroup viewGroup4 = wVar.h;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            wVar.q.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    }
                }
                break;
            case 3:
                wVar.n.start();
                break;
            case 4:
                wVar.m.start();
                break;
            case 5:
                wVar.l.start();
                wVar.e(2000L, wVar.u);
                break;
            default:
                wVar.i(2);
                break;
        }
    }
}
