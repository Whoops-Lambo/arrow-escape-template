package com.bytedance.adsdk.ahm;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class noq extends ImageView {
    private static final nu<Throwable> ahm = new nu<Throwable>() { // from class: com.bytedance.adsdk.ahm.noq.1
        @Override // com.bytedance.adsdk.ahm.nu
        public void kgy(Throwable th) {
            com.bytedance.adsdk.ahm.noq.noq.kgy(th);
        }
    };
    private static final String kgy = "noq";
    private boolean at;
    private int ay;
    private nu<Throwable> ct;
    private yo dg;
    private String fi;
    private Handler fpp;
    private int fpz;
    private JSONArray ft;
    private int gf;
    private com.bytedance.adsdk.ahm.rz.rz.rz gm;
    private int ioy;
    private String jpc;
    private final Set<Object> kus;
    private int lqi;
    private int noq;
    private boolean nu;
    private boolean ra;
    private final nu<yo> rz;
    private long sx;
    private final Set<uq> twf;
    private ahm uf;
    private int um;
    private final nu<Throwable> uq;
    private kgy vg;
    private twf<yo> vs;
    private final Runnable wy;
    private final Handler xh;
    private final gf yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ct implements nu<Throwable> {
        private final WeakReference<noq> kgy;

        @Override // com.bytedance.adsdk.ahm.nu
        public void kgy(Throwable th) {
            noq noqVar = this.kgy.get();
            if (noqVar == null) {
                return;
            }
            if (noqVar.noq != 0) {
                noqVar.setImageResource(noqVar.noq);
            }
            (noqVar.ct == null ? noq.ahm : noqVar.ct).kgy(th);
        }

        public ct(noq noqVar) {
            this.kgy = new WeakReference<>(noqVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ahm.noq$noq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0187noq implements nu<yo> {
        private final WeakReference<noq> kgy;

        @Override // com.bytedance.adsdk.ahm.nu
        public void kgy(yo yoVar) {
            noq noqVar = this.kgy.get();
            if (noqVar == null) {
                return;
            }
            noqVar.setComposition(yoVar);
        }

        public C0187noq(noq noqVar) {
            this.kgy = new WeakReference<>(noqVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum uq {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private void fi() {
        setSaveEnabled(false);
        this.at = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        kgy(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        kgy(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.yo.kgy(Boolean.valueOf(com.bytedance.adsdk.ahm.noq.noq.kgy(getContext()) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        gf();
        ra();
        at();
    }

    private void xh() {
        this.dg = null;
        this.yo.ra();
    }

    public void noq() {
        this.nu = false;
        this.yo.wy();
    }

    public void setAnimationFromJson(String str) {
        kgy(str, (String) null);
    }

    public void setProgress(float f) {
        kgy(f, true);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ahm.noq$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            kgy = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kgy[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class rz extends View.BaseSavedState {
        public static final Parcelable.Creator<rz> CREATOR = new Parcelable.Creator<rz>() { // from class: com.bytedance.adsdk.ahm.noq.rz.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public rz createFromParcel(Parcel parcel) {
                return new rz(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public rz[] newArray(int i) {
                return new rz[i];
            }
        };
        int ahm;
        String ct;
        String kgy;
        int noq;
        float rz;
        boolean uq;
        int yo;

        private rz(Parcel parcel) {
            super(parcel);
            this.kgy = parcel.readString();
            this.rz = parcel.readFloat();
            this.uq = parcel.readInt() == 1;
            this.ct = parcel.readString();
            this.noq = parcel.readInt();
            this.yo = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.kgy);
            parcel.writeFloat(this.rz);
            parcel.writeInt(this.uq ? 1 : 0);
            parcel.writeString(this.ct);
            parcel.writeInt(this.noq);
            parcel.writeInt(this.yo);
        }

        public rz(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void at() {
        kgy(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ahm.noq.7
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                sx sxVarLqi;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - noq.this.sx;
                noq.this.ahm(this);
                String playDelayedELExpressTimeS = noq.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (sxVarLqi = noq.this.yo.lqi()) != null) {
                    try {
                        int i = Integer.parseInt(sxVarLqi.kgy(playDelayedELExpressTimeS)) * 1000;
                        if (noq.this.sx > 0) {
                            long jElapsedRealtime2 = (noq.this.sx + ((long) i)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                noq.this.noq();
                                noq.this.setVisibility(8);
                                if (noq.this.fpp == null) {
                                    noq.this.fpp = new Handler(Looper.getMainLooper());
                                }
                                noq.this.fpp.removeCallbacksAndMessages(null);
                                noq.this.fpp.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ahm.noq.7.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        noq.this.setVisibility(0);
                                        noq.this.kgy();
                                        noq.this.kgy(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                noq.this.kgy(jElapsedRealtime);
            }
        });
    }

    private void dg() {
        this.xh.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yo.kgy getGlobalConfig() {
        yo yoVarJpc;
        gf gfVar = this.yo;
        if (gfVar == null || (yoVarJpc = gfVar.jpc()) == null) {
            return null;
        }
        return yoVarJpc.nu();
    }

    private yo.ahm getGlobalEvent() {
        yo yoVarJpc;
        gf gfVar = this.yo;
        if (gfVar == null || (yoVarJpc = gfVar.jpc()) == null) {
            return null;
        }
        return yoVarJpc.ra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        yo yoVarJpc;
        gf gfVar = this.yo;
        if (gfVar == null || (yoVarJpc = gfVar.jpc()) == null) {
            return null;
        }
        return yoVarJpc.gf();
    }

    private void gf() {
        kgy(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ahm.noq.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                noq.this.ahm(this);
                noq.this.kus();
                noq.this.nu();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kus() {
        gf gfVar;
        int i;
        int i2;
        final int i3;
        if (this.dg == null || (gfVar = this.yo) == null) {
            return;
        }
        sx sxVarLqi = gfVar.lqi();
        yo.rz rzVarFi = this.dg.fi();
        if (rzVarFi == null || sxVarLqi == null) {
            return;
        }
        final int i4 = rzVarFi.kgy;
        if (i4 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4)));
            return;
        }
        int[] iArr = rzVarFi.ct;
        final int i5 = -1;
        if (iArr == null || iArr.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i2 = iArr[0];
            i = iArr[1];
        }
        String strKgy = sxVarLqi.kgy(rzVarFi.rz);
        String strKgy2 = sxVarLqi.kgy(rzVarFi.uq);
        try {
            i3 = Integer.parseInt(strKgy);
            try {
                i5 = Integer.parseInt(strKgy2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i3 + ", lenS: " + i5);
        boolean zIsEmpty = TextUtils.isEmpty(rzVarFi.ahm);
        String str = rzVarFi.ahm;
        if (zIsEmpty) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + str);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + str);
        com.bytedance.adsdk.ahm.rz.rz.rz rzVarRz = rz(rzVarFi.ahm);
        if (rzVarRz != null) {
            Log.i("TMe", "--==--- timer success");
            this.jpc = rzVarFi.noq;
            this.ft = rzVarFi.yo;
            this.gm = rzVarRz;
            this.ay = i3;
            this.ioy = i3 - i5;
            this.lqi = i2;
            this.fpz = i;
            StringBuilder sb = new StringBuilder();
            sb.append(this.ay);
            rzVarRz.kgy(sb.toString());
            kgy(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ahm.noq.11
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (noq.this.getFrame() < i4 - 1 || noq.this.getFrame() >= i4 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + noq.this.getFrame());
                    noq.this.ahm(this);
                    if (i3 < 0 || i5 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        noq.this.vs();
                    }
                    noq.this.noq();
                }
            });
        }
    }

    private void ra() {
        kgy(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ahm.noq.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && ((Float) animatedValue).floatValue() >= 0.98f) {
                    noq.ct(noq.this);
                    yo.kgy globalConfig = noq.this.getGlobalConfig();
                    if (globalConfig != null && (i = globalConfig.uq) > 0 && i > noq.this.um) {
                        noq.this.kus();
                        noq.this.kgy();
                        noq.this.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        noq.this.ahm(this);
                        if (noq.this.vg != null) {
                            kgy unused = noq.this.vg;
                        }
                    }
                }
            }
        });
    }

    private com.bytedance.adsdk.ahm.rz.rz.rz rz(String str) {
        com.bytedance.adsdk.ahm.rz.rz.ahm ahmVarAhm;
        gf gfVar = this.yo;
        if (gfVar == null || (ahmVarAhm = gfVar.ahm()) == null) {
            return null;
        }
        return kgy(ahmVarAhm, str);
    }

    private void setCompositionTask(twf<yo> twfVar) {
        this.twf.add(uq.SET_ANIMATION);
        xh();
        twf();
        this.vs = twfVar.kgy(this.rz).rz(this.uq);
    }

    private void twf() {
        twf<yo> twfVar = this.vs;
        if (twfVar != null) {
            twfVar.ahm(this.rz);
            this.vs.uq(this.uq);
        }
    }

    private void uq(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vs() {
        this.xh.postDelayed(this.wy, 1000L);
    }

    public void ct() {
        this.twf.add(uq.PLAY_OPTION);
        this.yo.ft();
    }

    public boolean getClipToCompositionBounds() {
        return this.yo.rz();
    }

    public yo getComposition() {
        return this.dg;
    }

    public long getDuration() {
        yo yoVar = this.dg;
        if (yoVar != null) {
            return (long) yoVar.ct();
        }
        return 0L;
    }

    public int getFrame() {
        return this.yo.fpp();
    }

    public String getImageAssetsFolder() {
        return this.yo.uq();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.yo.ct();
    }

    public float getMaxFrame() {
        return this.yo.vs();
    }

    public float getMinFrame() {
        return this.yo.kus();
    }

    public um getPerformanceTracker() {
        return this.yo.fi();
    }

    public float getProgress() {
        return this.yo.uf();
    }

    public fpp getRenderMode() {
        return this.yo.noq();
    }

    public int getRepeatCount() {
        return this.yo.gm();
    }

    public int getRepeatMode() {
        return this.yo.sx();
    }

    public float getSpeed() {
        return this.yo.dg();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof rz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rz rzVar = (rz) parcelable;
        super.onRestoreInstanceState(rzVar.getSuperState());
        this.fi = rzVar.kgy;
        Set<uq> set = this.twf;
        uq uqVar = uq.SET_ANIMATION;
        if (!set.contains(uqVar) && !TextUtils.isEmpty(this.fi)) {
            setAnimation(this.fi);
        }
        this.gf = rzVar.ahm;
        if (!this.twf.contains(uqVar) && (i = this.gf) != 0) {
            setAnimation(i);
        }
        if (!this.twf.contains(uq.SET_PROGRESS)) {
            kgy(rzVar.rz, false);
        }
        if (!this.twf.contains(uq.PLAY_OPTION) && rzVar.uq) {
            kgy();
        }
        if (!this.twf.contains(uq.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(rzVar.ct);
        }
        if (!this.twf.contains(uq.SET_REPEAT_MODE)) {
            setRepeatMode(rzVar.noq);
        }
        if (this.twf.contains(uq.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(rzVar.yo);
    }

    public void setAnimation(int i) {
        this.gf = i;
        this.fi = null;
        setCompositionTask(kgy(i));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.at ? fi.kgy(getContext(), str) : fi.kgy(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.yo.ct(z);
    }

    public void setCacheComposition(boolean z) {
        this.at = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.yo.kgy(z);
    }

    public void setComposition(yo yoVar) {
        if (com.bytedance.adsdk.ahm.ct.kgy) {
            Log.v(kgy, "Set Composition \n".concat(String.valueOf(yoVar)));
        }
        this.yo.setCallback(this);
        this.dg = yoVar;
        this.ra = true;
        boolean zKgy = this.yo.kgy(yoVar, getContext().getApplicationContext());
        this.ra = false;
        if (getDrawable() != this.yo || zKgy) {
            if (!zKgy) {
                um();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.kus.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.yo.yo(str);
    }

    public void setFailureListener(nu<Throwable> nuVar) {
        this.ct = nuVar;
    }

    public void setFallbackResource(int i) {
        this.noq = i;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.ahm.rz rzVar) {
        this.yo.kgy(rzVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.yo.kgy(map);
    }

    public void setFrame(int i) {
        this.yo.rz(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.yo.yo(z);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.ahm.uq uqVar) {
        this.yo.kgy(uqVar);
    }

    public void setImageAssetsFolder(String str) {
        this.yo.kgy(str);
    }

    public void setLottieAnimListener(kgy kgyVar) {
        this.vg = kgyVar;
    }

    public void setLottieClicklistener(ahm ahmVar) {
        this.uf = ahmVar;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.yo.ahm(z);
    }

    public void setMaxFrame(int i) {
        this.yo.ahm(i);
    }

    public void setMaxProgress(float f) {
        this.yo.ahm(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.yo.uq(str);
    }

    public void setMinFrame(int i) {
        this.yo.kgy(i);
    }

    public void setMinProgress(float f) {
        this.yo.kgy(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.yo.uq(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.yo.rz(z);
    }

    public void setRenderMode(fpp fppVar) {
        this.yo.kgy(fppVar);
    }

    public void setRepeatCount(int i) {
        this.twf.add(uq.SET_REPEAT_COUNT);
        this.yo.ct(i);
    }

    public void setRepeatMode(int i) {
        this.twf.add(uq.SET_REPEAT_MODE);
        this.yo.uq(i);
    }

    public void setSafeMode(boolean z) {
        this.yo.noq(z);
    }

    public void setSpeed(float f) {
        this.yo.rz(f);
    }

    public void setTextDelegate(sx sxVar) {
        this.yo.kgy(sxVar);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.yo.fi(z);
    }

    public void setView(View view) {
        this.yo.kgy(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        gf gfVar;
        if (!this.ra && drawable == (gfVar = this.yo) && gfVar.ay()) {
            noq();
        } else if (!this.ra && (drawable instanceof gf)) {
            gf gfVar2 = (gf) drawable;
            if (gfVar2.ay()) {
                gfVar2.wy();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public noq(Context context) {
        super(context);
        this.rz = new C0187noq(this);
        this.uq = new ct(this);
        this.noq = 0;
        this.yo = new gf();
        this.ra = false;
        this.nu = false;
        this.at = true;
        this.twf = new HashSet();
        this.kus = new HashSet();
        this.xh = new Handler(Looper.getMainLooper());
        this.um = 0;
        this.sx = 0L;
        this.wy = new Runnable() { // from class: com.bytedance.adsdk.ahm.noq.2
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + noq.this.ay + ", " + noq.this.ioy);
                int i = noq.this.ay;
                int i2 = noq.this.ioy;
                noq noqVar = noq.this;
                if (i > i2) {
                    noq.um(noqVar);
                    com.bytedance.adsdk.ahm.rz.rz.rz rzVar = noq.this.gm;
                    StringBuilder sb = new StringBuilder();
                    sb.append(noq.this.ay);
                    rzVar.kgy(sb.toString());
                    noq.this.invalidate();
                    noq.this.vs();
                    return;
                }
                if (noqVar.lqi < 0 || noq.this.fpz < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + noq.this.lqi + "," + noq.this.fpz);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + noq.this.lqi);
                    noq.this.kgy();
                    noq noqVar2 = noq.this;
                    noqVar2.setFrame(noqVar2.lqi);
                    noq.this.kgy(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ahm.noq.2.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (noq.this.getFrame() < noq.this.fpz - 1 || noq.this.getFrame() >= noq.this.fpz + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + noq.this.fpz);
                            noq.this.ahm(this);
                            noq.this.noq();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(noq.this.jpc) || (noq.this.ft != null && noq.this.ft.length() > 0)) && noq.this.uf != null) {
                    ahm unused = noq.this.uf;
                    String unused2 = noq.this.jpc;
                    JSONArray unused3 = noq.this.ft;
                }
            }
        };
        fi();
    }

    private void ahm(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.yo.getBounds().width();
        float fHeight = this.yo.getBounds().height();
        if (width != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fWidth != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fHeight != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Matrix matrix = new Matrix();
            int i = AnonymousClass3.kgy[getScaleType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            uq(matrix, width, height, fWidth, fHeight);
                        }
                    } else {
                        rz(matrix, width, height, fWidth, fHeight);
                    }
                } else {
                    ahm(matrix, width, height, fWidth, fHeight);
                }
            } else {
                kgy(matrix, width, height, fWidth, fHeight);
            }
            matrix.mapRect(rectF, rectF2);
        }
    }

    private com.bytedance.adsdk.ahm.rz.rz.kgy kgy(com.bytedance.adsdk.ahm.rz.rz.ahm ahmVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ahm.rz.rz.kgy kgyVarKgy;
        for (com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar : ahmVar.at()) {
            if (kgyVar instanceof com.bytedance.adsdk.ahm.rz.rz.ahm) {
                if (kgyVar.fi() && kgyVar.noq() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    RectF rectF = new RectF();
                    kgyVar.kgy(rectF, kgyVar.uq(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (kgyVarKgy = kgy((com.bytedance.adsdk.ahm.rz.rz.ahm) kgyVar, motionEvent)) != null) {
                        return kgyVarKgy;
                    }
                }
            } else if (kgyVar.fi() && kgyVar.noq() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                RectF rectF2 = new RectF();
                gf gfVar = this.yo;
                if (gfVar != null && gfVar.yo()) {
                    kgyVar.kgy(rectF2, kgyVar.uq(), true);
                    RectF rectFVg = this.yo.vg();
                    if (rectFVg != null) {
                        kgy(rectF2, rectFVg);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    kgyVar.kgy(rectF3, kgyVar.uq(), true);
                    ahm(rectF2, rectF3);
                }
                if (kgy(motionEvent, rectF2)) {
                    return kgyVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nu() {
        final yo.kgy globalConfig = getGlobalConfig();
        if (globalConfig != null && globalConfig.ct > 0) {
            if (!TextUtils.isEmpty(globalConfig.noq) || globalConfig.yo != null) {
                int maxFrame = globalConfig.ct;
                if (maxFrame > getMaxFrame()) {
                    maxFrame = (int) getMaxFrame();
                }
                final float maxFrame2 = maxFrame / getMaxFrame();
                kgy(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ahm.noq.6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if ((animatedValue instanceof Float) && ((Float) animatedValue).floatValue() >= maxFrame2) {
                            noq.this.ahm(this);
                            if (noq.this.uf != null) {
                                ahm unused = noq.this.uf;
                            }
                        }
                    }
                });
            }
        }
    }

    private void um() {
        boolean zUq = uq();
        setImageDrawable(null);
        setImageDrawable(this.yo);
        if (zUq) {
            this.yo.twf();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof gf) && ((gf) drawable).noq() == fpp.SOFTWARE) {
            this.yo.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        gf gfVar = this.yo;
        if (drawable2 == gfVar) {
            super.invalidateDrawable(gfVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.nu) {
            this.yo.nu();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg();
        Handler handler = this.fpp;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        rz();
        ahm();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        rz rzVar = new rz(super.onSaveInstanceState());
        rzVar.kgy = this.fi;
        rzVar.ahm = this.gf;
        rzVar.rz = this.yo.uf();
        rzVar.uq = this.yo.ioy();
        rzVar.ct = this.yo.uq();
        rzVar.noq = this.yo.sx();
        rzVar.yo = this.yo.gm();
        return rzVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.ahm.rz.rz.kgy kgyVarKgy = kgy(motionEvent);
        if (kgyVarKgy != null) {
            String strGf = kgyVarKgy.gf();
            if (kgyVarKgy instanceof com.bytedance.adsdk.ahm.rz.rz.ahm) {
                if (getGlobalConfig() != null && getGlobalConfig().kgy == 1) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (strGf != null && strGf.startsWith("CSJCLOSE")) {
                dg();
            }
            ra raVarKgy = kgy(kgyVarKgy.ct());
            if (raVarKgy != null && motionEvent.getAction() == 1) {
                kgy(strGf, raVarKgy.ct(), raVarKgy.yo());
                int[][] iArrNoq = raVarKgy.noq();
                if (iArrNoq != null) {
                    kgy(iArrNoq);
                } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().ahm) != null) {
                    kgy(iArr);
                }
            }
            if (strGf != null && strGf.startsWith("CSJNTP")) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (getGlobalConfig() != null && getGlobalConfig().kgy == 1) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        twf();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        twf();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        twf();
        super.setImageResource(i);
    }

    public void setMaxFrame(String str) {
        this.yo.rz(str);
    }

    public void setMinFrame(String str) {
        this.yo.ahm(str);
    }

    public static /* synthetic */ int ct(noq noqVar) {
        int i = noqVar.um;
        noqVar.um = i + 1;
        return i;
    }

    public void setAnimation(String str) {
        this.fi = str;
        this.gf = 0;
        setCompositionTask(ahm(str));
    }

    private void rz(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    public void rz() {
        this.yo.um();
    }

    public static /* synthetic */ int um(noq noqVar) {
        int i = noqVar.ay;
        noqVar.ay = i - 1;
        return i;
    }

    public boolean uq() {
        return this.yo.ay();
    }

    private void ahm(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private twf<yo> ahm(final String str) {
        if (isInEditMode()) {
            return new twf<>(new Callable<at<yo>>() { // from class: com.bytedance.adsdk.ahm.noq.10
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
                public at<yo> call() throws Exception {
                    boolean z = noq.this.at;
                    noq noqVar = noq.this;
                    return z ? fi.rz(noqVar.getContext(), str) : fi.rz(noqVar.getContext(), str, null);
                }
            }, true);
        }
        return this.at ? fi.ahm(getContext(), str) : fi.ahm(getContext(), str, (String) null);
    }

    public void ahm(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.yo.ahm(animatorUpdateListener);
    }

    public void ahm() {
        this.yo.xh();
    }

    public void ahm(Animator.AnimatorListener animatorListener) {
        this.yo.ahm(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(long j) {
        Map<String, Object> map;
        yo.kgy globalConfig = getGlobalConfig();
        if (this.vg != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.ahm) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.ahm);
        }
    }

    private ra kgy(String str) {
        gf gfVar;
        yo yoVarJpc;
        Map<String, ra> mapDg;
        if (TextUtils.isEmpty(str) || (gfVar = this.yo) == null || (yoVarJpc = gfVar.jpc()) == null || (mapDg = yoVarJpc.dg()) == null) {
            return null;
        }
        return mapDg.get(str);
    }

    private void kgy(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i)));
            dg();
            kgy();
            setFrame(i);
            kgy(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ahm.noq.8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (noq.this.getFrame() < i2 - 1 || noq.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i2 + ", realFrame: " + noq.this.getFrame());
                    noq.this.ahm(this);
                    noq.this.noq();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void kgy(String str, String str2, JSONArray jSONArray) {
        yo.ahm globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.kgy;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.rz;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    private com.bytedance.adsdk.ahm.rz.rz.kgy kgy(MotionEvent motionEvent) {
        com.bytedance.adsdk.ahm.rz.rz.ahm ahmVarAhm;
        gf gfVar = this.yo;
        if (gfVar == null || (ahmVarAhm = gfVar.ahm()) == null) {
            return null;
        }
        return kgy(ahmVarAhm, motionEvent);
    }

    private boolean kgy(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent == null || rectF == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom;
    }

    private void kgy(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass3.kgy[getScaleType().ordinal()];
        if (i == 1) {
            kgy(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            ahm(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            rz(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            uq(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void kgy(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    public void kgy(boolean z, Context context) {
        this.yo.kgy(z, context);
    }

    private twf<yo> kgy(final int i) {
        if (isInEditMode()) {
            return new twf<>(new Callable<at<yo>>() { // from class: com.bytedance.adsdk.ahm.noq.9
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
                public at<yo> call() throws Exception {
                    boolean z = noq.this.at;
                    noq noqVar = noq.this;
                    return z ? fi.ahm(noqVar.getContext(), i) : fi.ahm(noqVar.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.at ? fi.kgy(getContext(), i) : fi.kgy(getContext(), i, (String) null);
    }

    public void kgy(String str, String str2) {
        kgy(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void kgy(InputStream inputStream, String str) {
        setCompositionTask(fi.kgy(inputStream, str));
    }

    private com.bytedance.adsdk.ahm.rz.rz.rz kgy(com.bytedance.adsdk.ahm.rz.rz.ahm ahmVar, String str) {
        for (com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar : ahmVar.at()) {
            if (kgyVar instanceof com.bytedance.adsdk.ahm.rz.rz.ahm) {
                com.bytedance.adsdk.ahm.rz.rz.rz rzVarKgy = kgy((com.bytedance.adsdk.ahm.rz.rz.ahm) kgyVar, str);
                if (rzVarKgy != null) {
                    return rzVarKgy;
                }
            } else if (TextUtils.equals(str, kgyVar.gf()) && (kgyVar instanceof com.bytedance.adsdk.ahm.rz.rz.rz)) {
                return (com.bytedance.adsdk.ahm.rz.rz.rz) kgyVar;
            }
        }
        return null;
    }

    public void kgy() {
        if (this.sx == 0) {
            this.sx = SystemClock.elapsedRealtime();
        }
        this.twf.add(uq.PLAY_OPTION);
        this.yo.nu();
    }

    public void kgy(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.yo.kgy(animatorUpdateListener);
    }

    public void kgy(Animator.AnimatorListener animatorListener) {
        this.yo.kgy(animatorListener);
    }

    public void kgy(boolean z) {
        this.yo.ct(z ? -1 : 0);
    }

    public Bitmap kgy(String str, Bitmap bitmap) {
        return this.yo.kgy(str, bitmap);
    }

    private void kgy(float f, boolean z) {
        if (z) {
            this.twf.add(uq.SET_PROGRESS);
        }
        this.yo.uq(f);
    }
}
