package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.unity.ads.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.cq1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class TemplateView extends FrameLayout {
    public final int a;
    public cq1 b;
    public NativeAd c;
    public NativeAdView d;
    public TextView e;
    public TextView f;
    public RatingBar g;
    public TextView h;
    public ImageView i;
    public MediaView j;
    public Button k;
    public ConstraintLayout l;
    public LayoutInflater m;

    private void setLayoutInflater(Context context) {
        this.m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public NativeAdView getNativeAdView() {
        return this.d;
    }

    public cq1 getStyles() {
        return this.b;
    }

    public String getTemplateTypeName() {
        int i = R.layout.gnt_medium_template_view;
        int i2 = this.a;
        if (i2 == i) {
            return "medium_template";
        }
        return i2 == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.c = nativeAd;
        if (this.d == null || this.k == null || this.e == null || this.f == null || this.i == null) {
            return;
        }
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.d.setCallToActionView(this.k);
        this.d.setHeadlineView(this.e);
        this.d.setMediaView(this.j);
        this.f.setVisibility(0);
        String store2 = nativeAd.getStore();
        String advertiser2 = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store2) && TextUtils.isEmpty(advertiser2)) {
            this.d.setStoreView(this.f);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.d.setAdvertiserView(this.f);
            store = advertiser;
        }
        this.e.setText(headline);
        this.k.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= 0.0d) {
            this.f.setText(store);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
        } else {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            this.g.setRating(starRating.floatValue());
            this.d.setStarRatingView(this.g);
        }
        ImageView imageView = this.i;
        if (icon != null) {
            imageView.setVisibility(0);
            this.i.setImageDrawable(icon.getDrawable());
            this.d.setIconView(this.i);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(body);
            this.d.setBodyView(this.h);
        }
        this.d.setNativeAd(nativeAd);
    }

    public void setStyles(cq1 cq1Var) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        this.b = cq1Var;
        ColorDrawable colorDrawable = cq1Var.q;
        if (colorDrawable != null) {
            ConstraintLayout constraintLayout = this.l;
            if (constraintLayout != null) {
                constraintLayout.setBackground(colorDrawable);
            }
            TextView textView13 = this.e;
            if (textView13 != null) {
                textView13.setBackground(colorDrawable);
            }
            TextView textView14 = this.f;
            if (textView14 != null) {
                textView14.setBackground(colorDrawable);
            }
            TextView textView15 = this.h;
            if (textView15 != null) {
                textView15.setBackground(colorDrawable);
            }
        }
        Typeface typeface = this.b.e;
        if (typeface != null && (textView12 = this.e) != null) {
            textView12.setTypeface(typeface);
        }
        Typeface typeface2 = this.b.i;
        if (typeface2 != null && (textView11 = this.f) != null) {
            textView11.setTypeface(typeface2);
        }
        Typeface typeface3 = this.b.m;
        if (typeface3 != null && (textView10 = this.h) != null) {
            textView10.setTypeface(typeface3);
        }
        Typeface typeface4 = this.b.a;
        if (typeface4 != null && (button4 = this.k) != null) {
            button4.setTypeface(typeface4);
        }
        Integer num = this.b.g;
        if (num != null && (textView9 = this.e) != null) {
            textView9.setTextColor(num.intValue());
        }
        Integer num2 = this.b.k;
        if (num2 != null && (textView8 = this.f) != null) {
            textView8.setTextColor(num2.intValue());
        }
        Integer num3 = this.b.o;
        if (num3 != null && (textView7 = this.h) != null) {
            textView7.setTextColor(num3.intValue());
        }
        Integer num4 = this.b.c;
        if (num4 != null && (button3 = this.k) != null) {
            button3.setTextColor(num4.intValue());
        }
        float f = this.b.b;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (button2 = this.k) != null) {
            button2.setTextSize(f);
        }
        float f2 = this.b.f;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView6 = this.e) != null) {
            textView6.setTextSize(f2);
        }
        float f3 = this.b.j;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView5 = this.f) != null) {
            textView5.setTextSize(f3);
        }
        float f4 = this.b.n;
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView4 = this.h) != null) {
            textView4.setTextSize(f4);
        }
        ColorDrawable colorDrawable2 = this.b.d;
        if (colorDrawable2 != null && (button = this.k) != null) {
            button.setBackground(colorDrawable2);
        }
        ColorDrawable colorDrawable3 = this.b.h;
        if (colorDrawable3 != null && (textView3 = this.e) != null) {
            textView3.setBackground(colorDrawable3);
        }
        ColorDrawable colorDrawable4 = this.b.l;
        if (colorDrawable4 != null && (textView2 = this.f) != null) {
            textView2.setBackground(colorDrawable4);
        }
        ColorDrawable colorDrawable5 = this.b.p;
        if (colorDrawable5 != null && (textView = this.h) != null) {
            textView.setBackground(colorDrawable5);
        }
        invalidate();
        requestLayout();
    }

    public TemplateView(Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet);
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TemplateView, 0, 0)) == null) {
            return;
        }
        int i = R.styleable.TemplateView_gnt_template_type;
        int i2 = R.layout.gnt_medium_template_view;
        try {
            try {
                this.a = typedArrayObtainStyledAttributes.getResourceId(i, i2);
                typedArrayObtainStyledAttributes.recycle();
                if (this.m == null) {
                    setLayoutInflater(context);
                }
                this.m.inflate(this.a, this);
            } catch (RuntimeException e) {
                Log.e("TemplateView", String.format("Failed to get template type from attribute resources (templateTypeResource: %d, templateViewResource: %d).", Integer.valueOf(i), Integer.valueOf(i2)), e);
                throw e;
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (NativeAdView) findViewById(R.id.native_ad_view);
        this.e = (TextView) findViewById(R.id.primary);
        this.f = (TextView) findViewById(R.id.secondary);
        this.h = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.g = ratingBar;
        ratingBar.setEnabled(false);
        this.k = (Button) findViewById(R.id.cta);
        this.i = (ImageView) findViewById(R.id.ad_icon);
        this.j = (MediaView) findViewById(R.id.media_view);
        this.l = (ConstraintLayout) findViewById(R.id.ad_background);
    }
}
