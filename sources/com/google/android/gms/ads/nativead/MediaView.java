package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzbnx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class MediaView extends FrameLayout {

    @Nullable
    private MediaContent zza;
    private boolean zzb;
    private zzbms zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzbmu zzf;

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

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzbmu zzbmuVar = this.zzf;
        if (zzbmuVar != null) {
            zzbmuVar.zza(scaleType);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent) {
        boolean zG;
        this.zzb = true;
        this.zza = mediaContent;
        zzbms zzbmsVar = this.zzc;
        if (zzbmsVar != null) {
            zzbmsVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbnx zzbnxVarZzb = mediaContent.zzb();
            if (zzbnxVarZzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zG = zzbnxVarZzb.g(new ObjectWrapper(this));
                    }
                    removeAllViews();
                }
                zG = zzbnxVarZzb.S1(new ObjectWrapper(this));
                if (zG) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzg("", e);
        }
    }

    public final synchronized void zza(zzbms zzbmsVar) {
        this.zzc = zzbmsVar;
        if (this.zzb) {
            zzbmsVar.zza(this.zza);
        }
    }

    public final synchronized void zzb(zzbmu zzbmuVar) {
        this.zzf = zzbmuVar;
        if (this.zze) {
            zzbmuVar.zza(this.zzd);
        }
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.zza;
    }

    public MediaView(@NonNull Context context) {
        super(context);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
