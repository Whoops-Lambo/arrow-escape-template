package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.player.ui.u;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.m;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wo implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new s3(carouselLayoutManager, 10));
                }
                break;
            case 1:
                ((StyledPlayerControlView) obj).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                m mVar = (m) obj;
                StyledPlayerControlView styledPlayerControlView = mVar.a;
                int width = (styledPlayerControlView.getWidth() - styledPlayerControlView.getPaddingLeft()) - styledPlayerControlView.getPaddingRight();
                int height3 = (styledPlayerControlView.getHeight() - styledPlayerControlView.getPaddingBottom()) - styledPlayerControlView.getPaddingTop();
                ViewGroup viewGroup = mVar.c;
                int iC = m.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, m.c(mVar.k) + m.c(mVar.i));
                ViewGroup viewGroup2 = mVar.d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i10 = 2;
                int i11 = (height2 * 2) + paddingBottom;
                int i12 = 1;
                boolean z = width <= iMax || height3 <= i11;
                if (mVar.A != z) {
                    mVar.A = z;
                    view.post(new sk2(mVar, i12));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!mVar.A && z2) {
                    view.post(new sk2(mVar, i10));
                    break;
                }
                break;
            default:
                ((u) obj).a(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
