package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public static final CardViewApi21Impl g = new CardViewApi21Impl();
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final AnonymousClass1 e;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements CardViewDelegate {
        public Drawable a;

        public final void a(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.d.set(i, i2, i3, i4);
            Rect rect = cardView.c;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        public AnonymousClass1() {
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((RoundRectDrawable) this.e.a).h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    @Px
    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.c.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.c.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((RoundRectDrawable) this.e.a).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((RoundRectDrawable) this.e.a).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    public void setCardElevation(float f2) {
        CardView.this.setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        g.a(this.e, f2);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            AnonymousClass1 anonymousClass1 = this.e;
            g.a(anonymousClass1, ((RoundRectDrawable) anonymousClass1.a).e);
        }
    }

    public void setRadius(float f2) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.e.a;
        if (f2 == roundRectDrawable.a) {
            return;
        }
        roundRectDrawable.a = f2;
        roundRectDrawable.b(null);
        roundRectDrawable.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            AnonymousClass1 anonymousClass1 = this.e;
            g.a(anonymousClass1, ((RoundRectDrawable) anonymousClass1.a).e);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.ecffri.arrows.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.e = anonymousClass1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.a, com.ecffri.arrows.R.attr.cardViewStyle, com.ecffri.arrows.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.ecffri.arrows.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.ecffri.arrows.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        RoundRectDrawable roundRectDrawable = new RoundRectDrawable(colorStateListValueOf, dimension);
        anonymousClass1.a = roundRectDrawable;
        setBackgroundDrawable(roundRectDrawable);
        setClipToOutline(true);
        setElevation(dimension2);
        g.a(anonymousClass1, dimension3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.e.a;
        if (colorStateListValueOf == null) {
            roundRectDrawable.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        roundRectDrawable.h = colorStateListValueOf;
        roundRectDrawable.b.setColor(colorStateListValueOf.getColorForState(roundRectDrawable.getState(), roundRectDrawable.h.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.e.a;
        if (colorStateList == null) {
            roundRectDrawable.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        roundRectDrawable.h = colorStateList;
        roundRectDrawable.b.setColor(colorStateList.getColorForState(roundRectDrawable.getState(), roundRectDrawable.h.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }
}
