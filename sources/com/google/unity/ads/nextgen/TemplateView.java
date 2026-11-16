package com.google.unity.ads.nextgen;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.ads.mobile.sdk.common.Image;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.google.unity.ads.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.cq1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TemplateView extends FrameLayout {

    @VisibleForTesting
    static final String MEDIUM_TEMPLATE = "medium_template";
    private static final String SMALL_TEMPLATE = "small_template";
    private static final String TAG = "TemplateView";
    private ConstraintLayout background;
    private Button callToActionView;
    private ImageView iconView;
    private LayoutInflater layoutInflater;
    private MediaView mediaView;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private TextView primaryView;
    private RatingBar ratingBar;
    private TextView secondaryView;
    private cq1 styles;
    private int templateType;
    private TextView tertiaryView;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void applyStyles() {
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
        ColorDrawable colorDrawable = this.styles.q;
        if (colorDrawable != null) {
            ConstraintLayout constraintLayout = this.background;
            if (constraintLayout != null) {
                constraintLayout.setBackground(colorDrawable);
            }
            TextView textView13 = this.primaryView;
            if (textView13 != null) {
                textView13.setBackground(colorDrawable);
            }
            TextView textView14 = this.secondaryView;
            if (textView14 != null) {
                textView14.setBackground(colorDrawable);
            }
            TextView textView15 = this.tertiaryView;
            if (textView15 != null) {
                textView15.setBackground(colorDrawable);
            }
        }
        Typeface typeface = this.styles.e;
        if (typeface != null && (textView12 = this.primaryView) != null) {
            textView12.setTypeface(typeface);
        }
        Typeface typeface2 = this.styles.i;
        if (typeface2 != null && (textView11 = this.secondaryView) != null) {
            textView11.setTypeface(typeface2);
        }
        Typeface typeface3 = this.styles.m;
        if (typeface3 != null && (textView10 = this.tertiaryView) != null) {
            textView10.setTypeface(typeface3);
        }
        Typeface typeface4 = this.styles.a;
        if (typeface4 != null && (button4 = this.callToActionView) != null) {
            button4.setTypeface(typeface4);
        }
        Integer num = this.styles.g;
        if (num != null && (textView9 = this.primaryView) != null) {
            textView9.setTextColor(num.intValue());
        }
        Integer num2 = this.styles.k;
        if (num2 != null && (textView8 = this.secondaryView) != null) {
            textView8.setTextColor(num2.intValue());
        }
        Integer num3 = this.styles.o;
        if (num3 != null && (textView7 = this.tertiaryView) != null) {
            textView7.setTextColor(num3.intValue());
        }
        Integer num4 = this.styles.c;
        if (num4 != null && (button3 = this.callToActionView) != null) {
            button3.setTextColor(num4.intValue());
        }
        float f = this.styles.b;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (button2 = this.callToActionView) != null) {
            button2.setTextSize(f);
        }
        float f2 = this.styles.f;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView6 = this.primaryView) != null) {
            textView6.setTextSize(f2);
        }
        float f3 = this.styles.j;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView5 = this.secondaryView) != null) {
            textView5.setTextSize(f3);
        }
        float f4 = this.styles.n;
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView4 = this.tertiaryView) != null) {
            textView4.setTextSize(f4);
        }
        ColorDrawable colorDrawable2 = this.styles.d;
        if (colorDrawable2 != null && (button = this.callToActionView) != null) {
            button.setBackground(colorDrawable2);
        }
        ColorDrawable colorDrawable3 = this.styles.h;
        if (colorDrawable3 != null && (textView3 = this.primaryView) != null) {
            textView3.setBackground(colorDrawable3);
        }
        ColorDrawable colorDrawable4 = this.styles.l;
        if (colorDrawable4 != null && (textView2 = this.secondaryView) != null) {
            textView2.setBackground(colorDrawable4);
        }
        ColorDrawable colorDrawable5 = this.styles.p;
        if (colorDrawable5 != null && (textView = this.tertiaryView) != null) {
            textView.setBackground(colorDrawable5);
        }
        invalidate();
        requestLayout();
    }

    private boolean areAllViewsInitialized() {
        return (this.nativeAdView == null || this.callToActionView == null || this.primaryView == null || this.secondaryView == null || this.iconView == null) ? false : true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initView(android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L3
            goto L10
        L3:
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int[] r1 = com.google.unity.ads.R.styleable.TemplateView
            r2 = 0
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1, r2, r2)
            if (r5 != 0) goto L11
        L10:
            return
        L11:
            int r0 = com.google.unity.ads.R.styleable.TemplateView_gnt_template_type
            int r1 = com.google.unity.ads.R.layout.nextgen_medium_template_view
            int r2 = r5.getResourceId(r0, r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L2f
            r3.templateType = r2     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L2f
            r5.recycle()
            android.view.LayoutInflater r5 = r3.layoutInflater
            if (r5 != 0) goto L25
            r3.setLayoutInflater(r4)
        L25:
            android.view.LayoutInflater r4 = r3.layoutInflater
            int r5 = r3.templateType
            r4.inflate(r5, r3)
            return
        L2d:
            r3 = move-exception
            goto L48
        L2f:
            r3 = move-exception
            java.lang.String r4 = com.google.unity.ads.nextgen.TemplateView.TAG     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Failed to get template type from attribute resources (templateTypeResource: %d, templateViewResource: %d)."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch: java.lang.Throwable -> L2d
            android.util.Log.e(r4, r0, r3)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L48:
            r5.recycle()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.unity.ads.nextgen.TemplateView.initView(android.content.Context, android.util.AttributeSet):void");
    }

    private void setLayoutInflater(Context context) {
        this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void destroyNativeAd() {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }

    public NativeAdView getNativeAdView() {
        return this.nativeAdView;
    }

    public cq1 getStyles() {
        return this.styles;
    }

    public String getTemplateTypeName() {
        int i = this.templateType;
        if (i == R.layout.nextgen_medium_template_view) {
            return MEDIUM_TEMPLATE;
        }
        return i == R.layout.nextgen_small_template_view ? SMALL_TEMPLATE : "";
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.nativeAd = nativeAd;
        if (areAllViewsInitialized()) {
            String store = nativeAd.getStore();
            String advertiser = nativeAd.getAdvertiser();
            String headline = nativeAd.getHeadline();
            String body = nativeAd.getBody();
            String callToAction = nativeAd.getCallToAction();
            Double starRating = nativeAd.getStarRating();
            Image icon = nativeAd.getIcon();
            this.nativeAdView.setCallToActionView(this.callToActionView);
            this.nativeAdView.setHeadlineView(this.primaryView);
            this.secondaryView.setVisibility(0);
            if (adHasOnlyStore(nativeAd)) {
                this.nativeAdView.setStoreView(this.secondaryView);
            } else if (TextUtils.isEmpty(advertiser)) {
                store = "";
            } else {
                this.nativeAdView.setAdvertiserView(this.secondaryView);
                store = advertiser;
            }
            this.primaryView.setText(headline);
            this.callToActionView.setText(callToAction);
            if (starRating == null || starRating.doubleValue() <= 0.0d) {
                this.secondaryView.setText(store);
                this.secondaryView.setVisibility(0);
                RatingBar ratingBar = this.ratingBar;
                if (ratingBar != null) {
                    ratingBar.setVisibility(8);
                }
            } else {
                this.secondaryView.setVisibility(8);
                RatingBar ratingBar2 = this.ratingBar;
                if (ratingBar2 != null) {
                    ratingBar2.setVisibility(0);
                    this.ratingBar.setRating(starRating.floatValue());
                    this.nativeAdView.setStarRatingView(this.ratingBar);
                }
            }
            ImageView imageView = this.iconView;
            if (icon != null) {
                imageView.setVisibility(0);
                this.iconView.setImageDrawable(icon.getDrawable());
                this.nativeAdView.setIconView(this.iconView);
            } else {
                imageView.setVisibility(8);
            }
            TextView textView = this.tertiaryView;
            if (textView != null) {
                textView.setText(body);
                this.nativeAdView.setBodyView(this.tertiaryView);
            }
            this.nativeAdView.registerNativeAd(nativeAd, this.mediaView);
        }
    }

    public void setStyles(cq1 cq1Var) {
        this.styles = cq1Var;
        applyStyles();
    }

    @VisibleForTesting
    public TemplateView(Context context, @Nullable AttributeSet attributeSet, int i, int i2, LayoutInflater layoutInflater) {
        super(context, attributeSet, i, i2);
        this.layoutInflater = layoutInflater;
        initView(context, attributeSet);
    }

    private boolean adHasOnlyStore(NativeAd nativeAd) {
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store) && TextUtils.isEmpty(advertiser)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.nativeAdView = findViewById(R.id.native_ad_view);
        this.primaryView = (TextView) findViewById(R.id.primary);
        this.secondaryView = (TextView) findViewById(R.id.secondary);
        this.tertiaryView = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.ratingBar = ratingBar;
        if (ratingBar != null) {
            ratingBar.setEnabled(false);
        }
        this.callToActionView = (Button) findViewById(R.id.cta);
        this.iconView = (ImageView) findViewById(R.id.ad_icon);
        this.mediaView = findViewById(R.id.media_view);
        this.background = (ConstraintLayout) findViewById(R.id.ad_background);
    }

    public TemplateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context, attributeSet);
    }

    public TemplateView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context, attributeSet);
    }

    public TemplateView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context, attributeSet);
    }

    public TemplateView(Context context) {
        super(context);
    }
}
