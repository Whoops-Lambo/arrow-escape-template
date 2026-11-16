package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzah zzb;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
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

    private final void zzc() {
        String str = (String) zzba.zzc().a(zzbjr.V1);
        if (TextUtils.isEmpty(str) || BuildConfig.FLAVOR.equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesC = com.google.android.gms.ads.internal.zzt.zzh().c();
        if (resourcesC == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesC.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesC.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Close button resource not found, falling back to default.");
        }
        ImageButton imageButton = this.zza;
        if (drawable == null) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            imageButton.setImageDrawable(drawable);
            imageButton.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            zzahVar.zzc();
        }
    }

    public final void zza(boolean z) {
        ImageButton imageButton = this.zza;
        if (!z) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) zzba.zzc().a(zzbjr.W1)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    public final /* synthetic */ ImageButton zzb() {
        return this.zza;
    }

    public zzu(Context context, zzt zztVar, @Nullable zzah zzahVar) {
        zzs zzsVar;
        super(context);
        this.zzb = zzahVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zza();
        int iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zza);
        zzay.zza();
        int iZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, 0);
        zzay.zza();
        int iZzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzb);
        zzay.zza();
        imageButton.setPadding(iZzE, iZzE2, iZzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zza();
        int iZzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzay.zza();
        addView(imageButton, new FrameLayout.LayoutParams(iZzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zzc), 17));
        long jLongValue = ((Long) zzba.zzc().a(zzbjr.W1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjr.X1)).booleanValue()) {
            zzsVar = new zzs(this);
        } else {
            zzsVar = null;
        }
        imageButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzsVar);
    }
}
