package androidx.cardview.widget;

import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
class CardViewApi21Impl implements CardViewImpl {
    public final void a(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) ((CardView.AnonymousClass1) cardViewDelegate).a;
        CardView.AnonymousClass1 anonymousClass1 = (CardView.AnonymousClass1) cardViewDelegate;
        CardView cardView = CardView.this;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != roundRectDrawable.e || roundRectDrawable.f != useCompatPadding || roundRectDrawable.g != preventCornerOverlap) {
            roundRectDrawable.e = f;
            roundRectDrawable.f = useCompatPadding;
            roundRectDrawable.g = preventCornerOverlap;
            roundRectDrawable.b(null);
            roundRectDrawable.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            anonymousClass1.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = anonymousClass1.a;
        float f2 = ((RoundRectDrawable) drawable).e;
        float f3 = ((RoundRectDrawable) drawable).a;
        int iCeil = (int) Math.ceil(RoundRectDrawableWithShadow.a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(RoundRectDrawableWithShadow.b(f2, f3, cardView.getPreventCornerOverlap()));
        anonymousClass1.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
