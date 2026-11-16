package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.R;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.m;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sk2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ sk2(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[LOOP:3: B:37:0x00af->B:39:0x00b5, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.k();
                break;
            case 1:
                View view = mVar.j;
                ViewGroup viewGroup = mVar.e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(mVar.A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = mVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (mVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        if (mVar.A) {
                            defaultTimeBar.hideScrubber(true);
                        } else {
                            int i2 = mVar.z;
                            if (i2 == 1) {
                                defaultTimeBar.hideScrubber(false);
                            } else if (i2 != 3) {
                                defaultTimeBar.showScrubber();
                            }
                        }
                    }
                }
                ArrayList arrayList = mVar.y;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    View view2 = (View) obj;
                    view2.setVisibility((mVar.A && m.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator = mVar.r;
                View view3 = mVar.k;
                StyledPlayerControlView styledPlayerControlView = mVar.a;
                ViewGroup viewGroup2 = mVar.g;
                ViewGroup viewGroup3 = mVar.f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (styledPlayerControlView.getWidth() - styledPlayerControlView.getPaddingLeft()) - styledPlayerControlView.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int iC = m.c(mVar.i);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        iC += m.c(viewGroup3.getChildAt(i4));
                    }
                    if (iC > width) {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            iC += m.c(view3);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i5 = 0; i5 < childCount2; i5++) {
                            View childAt2 = viewGroup3.getChildAt(i5);
                            iC -= m.c(childAt2);
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
                        ViewGroup viewGroup4 = mVar.h;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator.isStarted()) {
                            mVar.q.cancel();
                            valueAnimator.start();
                            break;
                        }
                    }
                }
                break;
            case 3:
                mVar.n.start();
                break;
            case 4:
                mVar.m.start();
                break;
            case 5:
                mVar.l.start();
                mVar.e(2000L, mVar.u);
                break;
            default:
                mVar.i(2);
                break;
        }
    }
}
