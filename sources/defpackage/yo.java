package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.ecffri.arrows.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class yo extends RecyclerView.ItemDecoration {
    public final Paint f;
    public final List g;

    public yo() {
        Paint paint = new Paint();
        this.f = paint;
        this.g = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, state);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f;
        paint.setStrokeWidth(dimension);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((kc1) it.next()).getClass();
            ThreadLocal threadLocal = ColorUtils.a;
            float f = 1.0f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).n()) {
                canvas2 = canvas;
                canvas2.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.e(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).b.b(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.c(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            }
            canvas = canvas2;
        }
    }
}
