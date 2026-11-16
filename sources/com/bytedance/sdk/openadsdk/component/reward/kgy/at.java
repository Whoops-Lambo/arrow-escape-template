package com.bytedance.sdk.openadsdk.component.reward.kgy;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.ft;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class at {
    private Activity ahm;
    private boolean ct;
    protected int kgy;
    private ioy rz;
    private int uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        private kgy kgy;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r2
  0x0047: PHI (r2v6 int) = (r2v2 int), (r2v1 int) binds: [B:25:0x0057, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
        public static int[] ahm(Activity activity, View view, int i, boolean z, boolean z2) {
            int paddingLeft;
            int paddingTop;
            int paddingRight;
            int paddingBottom;
            int i2;
            int[] iArr = new int[5];
            if (view != null) {
                paddingLeft = view.getPaddingLeft();
                paddingTop = view.getPaddingTop();
                paddingRight = view.getPaddingRight();
                paddingBottom = view.getPaddingBottom();
            } else {
                paddingLeft = 0;
                paddingTop = 0;
                paddingRight = 0;
                paddingBottom = 0;
            }
            if (activity == null || view == null || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                iArr[0] = paddingLeft;
                iArr[1] = paddingTop;
                iArr[2] = paddingRight;
                iArr[3] = paddingBottom;
                iArr[4] = 0;
                return iArr;
            }
            int i3 = activity.getResources().getConfiguration().orientation;
            int iKgy = (int) gbb.kgy();
            if (i == 1) {
                if (i3 == 1) {
                    paddingTop += iKgy;
                    i2 = 1;
                } else {
                    paddingLeft += iKgy;
                    i2 = 0;
                }
            } else if (i != 2) {
                i2 = 0;
            } else if (i3 == 2) {
                if (z) {
                    paddingLeft += iKgy;
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (z2) {
                    paddingTop += iKgy;
                    i2 = 1;
                }
            } else {
                paddingTop += iKgy;
                i2 = 0;
            }
            iArr[0] = paddingLeft;
            iArr[1] = paddingTop;
            iArr[2] = paddingRight;
            iArr[3] = paddingBottom;
            iArr[4] = i2;
            return iArr;
        }

        public void kgy(final Activity activity, final int i, final float f) {
            if (this.kgy != null || activity == null || activity.getWindow() == null) {
                return;
            }
            try {
                if (com.bytedance.sdk.openadsdk.core.gf.ahm.kgy.ahm(activity)) {
                    return;
                }
                final boolean z = com.bytedance.sdk.openadsdk.core.xh.uq().dta() == 1;
                final boolean zUq = gbb.uq(activity);
                if (zUq || z) {
                    final View decorView = activity.getWindow().getDecorView();
                    kgy kgyVar = new kgy() { // from class: com.bytedance.sdk.openadsdk.component.reward.kgy.at.ahm.1
                        private boolean fi;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        private void kgy(Activity activity2, View view, int i2, float f2, boolean z2, boolean z3) {
                            View view2;
                            try {
                                if (at.ahm(activity2, i2) != 0) {
                                    view2 = view;
                                    if (this.fi) {
                                        ahm.ahm(view2);
                                        this.fi = false;
                                    }
                                } else {
                                    int[] iArrAhm = ahm.ahm(activity2, view, i2, z2, z3);
                                    if (iArrAhm[4] == 1) {
                                        view2 = view;
                                        this.fi = ahm.ahm(view2, iArrAhm[0], iArrAhm[1], iArrAhm[2], iArrAhm[3], f2);
                                    } else {
                                        view2 = view;
                                    }
                                }
                                view2.getPaddingLeft();
                                view2.getPaddingTop();
                                view2.getPaddingRight();
                                view2.getPaddingBottom();
                            } catch (Throwable th) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aes6lBG4T9KMRuRenhSlJnbvI5QEuXuDs0nFWIkfkClf6iSbBJ1tzZVZw1ieVfE=", "U+8jkQ+5WcaETt5TiyKlPHfhKpwAkmzQ", 376);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.component.reward.kgy.at.kgy
                        public void kgy(int i2, int i3) {
                            kgy(activity, decorView, i, f, zUq, z);
                        }
                    };
                    this.kgy = kgyVar;
                    if (decorView != null) {
                        decorView.addOnLayoutChangeListener(kgyVar);
                    }
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aes6lBG4T9KMRuRenhSlJnbvI5QEuXuDs0nFWIkfkClf6iSbBJ1tzZVZw1ie", "WuongBCoTcKDRcVrhRS3GFrqKZwNuw==", TTAdConstant.AD_ID_IS_NULL_CODE);
            }
        }

        public void kgy(Activity activity) {
            Window window;
            if (this.kgy == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.kgy);
            this.kgy = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ahm(View view, int i, int i2, int i3, int i4, float f) {
            if (view == null) {
                return false;
            }
            if (view.isAttachedToWindow()) {
                if (view.getPaddingLeft() != i || view.getPaddingTop() != i2 || view.getPaddingRight() != i3 || view.getPaddingBottom() != i4) {
                    view.setPadding(i, i2, i3, i4);
                }
                if (f != 100.0f) {
                    return true;
                }
                view.setBackgroundColor(-16777216);
                return true;
            }
            view.isAttachedToWindow();
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ahm(View view) {
            if (view == null) {
                return;
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    private static float[] ahm(int i, Activity activity, ioy ioyVar) {
        float[] fArrKgy = new float[2];
        if (activity != null && activity.getWindow() != null) {
            View decorView = activity.getWindow().getDecorView();
            int paddingLeft = decorView.getPaddingLeft();
            int paddingTop = decorView.getPaddingTop();
            boolean z = paddingLeft == 0 && paddingTop == 0;
            boolean z2 = com.bytedance.sdk.openadsdk.core.xh.uq().dta() == 1;
            boolean zUq = gbb.uq(activity);
            if (z && ((z2 || zUq) && ahm(activity, i) == 0)) {
                int[] iArrAhm = ahm.ahm(activity, decorView, i, zUq, z2);
                int i2 = iArrAhm[0];
                paddingTop = iArrAhm[1];
                paddingLeft = i2;
            }
            decorView.getWidth();
            decorView.getHeight();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 35 || ioyVar == null || ioyVar.vai() != 100.0f) {
                fArrKgy[0] = decorView.getWidth() - (paddingLeft * 2);
                fArrKgy[1] = decorView.getHeight() - (paddingTop * 2);
            } else {
                fArrKgy[0] = decorView.getWidth() - paddingLeft;
                fArrKgy[1] = decorView.getHeight() - paddingTop;
            }
            fArrKgy[0] = gbb.rz(activity, fArrKgy[0]);
            float fRz = gbb.rz(activity, fArrKgy[1]);
            fArrKgy[1] = fRz;
            if (fArrKgy[0] < 10.0f || fRz < 10.0f) {
                fArrKgy = com.bytedance.sdk.openadsdk.core.gf.ahm.kgy.kgy(activity, gbb.rz(activity, gbb.kgy()), i);
            }
            if (i3 != 26 && i3 != 27) {
                if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                    if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                        if (i == 2) {
                            float f = fArrKgy[0];
                            float f2 = fArrKgy[1];
                            if (f < f2) {
                                fArrKgy[1] = f;
                                fArrKgy[0] = f2;
                            }
                        } else {
                            float f3 = fArrKgy[0];
                            float f4 = fArrKgy[1];
                            if (f3 > f4) {
                                fArrKgy[1] = f3;
                                fArrKgy[0] = f4;
                            }
                        }
                    }
                }
                float f5 = fArrKgy[0];
                float f6 = fArrKgy[1];
                return fArrKgy;
            }
            float f7 = fArrKgy[0];
            float f8 = fArrKgy[1];
        }
        return fArrKgy;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class kgy implements View.OnLayoutChangeListener {
        private int ahm;
        private int kgy;

        public abstract void kgy(int i, int i2);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.kgy && i10 == this.ahm) {
                return;
            }
            this.kgy = i9;
            this.ahm = i10;
            kgy(i9, i10);
        }

        private kgy() {
        }
    }

    private float rz() {
        return gbb.rz(this.ahm, gbb.kus(this.ahm));
    }

    private float uq() {
        return gbb.rz(this.ahm, gbb.twf(this.ahm));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    public void kgy(com.bytedance.sdk.openadsdk.component.reward.kgy.ahm ahmVar, boolean z) {
        float fMin;
        float fMax;
        int iMax;
        int i;
        int iMax2 = 0;
        if (com.bytedance.sdk.openadsdk.core.gf.ahm.kgy.ahm(this.ahm)) {
            float[] fArrKgy = kgy(this.ahm, this.uq, true);
            ahmVar.pxt = (int) fArrKgy[0];
            ahmVar.dpp = (int) fArrKgy[1];
            return;
        }
        kgy();
        float fRz = rz();
        float fUq = uq();
        if (this.uq == 2) {
            fMin = Math.max(fRz, fUq);
            fMax = Math.min(fRz, fUq);
        } else {
            fMin = Math.min(fRz, fUq);
            fMax = Math.max(fRz, fUq);
        }
        int iRz = gbb.rz(this.ahm, gbb.kgy());
        int i2 = this.uq;
        Activity activity = this.ahm;
        if (i2 != 2) {
            if (gbb.uq(activity)) {
                fMax -= iRz;
            }
        } else if (gbb.uq(activity)) {
            fMin -= iRz;
        }
        if (z) {
            ahmVar.pxt = (int) fMin;
            ahmVar.dpp = (int) fMax;
            return;
        }
        int i3 = 20;
        if (this.uq != 2) {
            float f = ahmVar.cc;
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 100.0f) {
                iMax = 0;
                i = 0;
                i3 = 0;
            } else {
                iMax = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i = iMax;
                iMax2 = 20;
            }
        } else {
            float f2 = ahmVar.cc;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == 100.0f) {
                iMax = 0;
                i = 0;
                i3 = 0;
            } else {
                iMax2 = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f2)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                iMax = 20;
                i = 20;
                i3 = iMax2;
            }
        }
        float f3 = iMax2;
        float f4 = i3;
        ahmVar.pxt = (int) ((fMin - f3) - f4);
        float f5 = iMax;
        float f6 = i;
        ahmVar.dpp = (int) ((fMax - f5) - f6);
        com.bytedance.sdk.openadsdk.activity.single.fi fiVar = ahmVar.oyj;
        if (fiVar == null || fiVar.ra == 0) {
            this.ahm.getWindow().getDecorView().setPadding(gbb.ahm(this.ahm, f3), gbb.ahm(this.ahm, f5), gbb.ahm(this.ahm, f4), gbb.ahm(this.ahm, f6));
        }
    }

    public at(Activity activity, ioy ioyVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.reward.kgy.ahm ahmVar) {
        this.kgy = 0;
        this.ahm = activity;
        this.rz = ioyVar;
        this.ct = z;
        if (ahmVar != null) {
            kgy(ahmVar);
            i = ahmVar.sm;
        }
        this.uq = i;
        try {
            this.kgy = gbb.rz(activity, gbb.kgy());
            if (!activity.getWindow().hasFeature(1)) {
                activity.requestWindowFeature(1);
            }
            activity.getWindow().addFlags(16777344);
            if (this.uq != 2 && gbb.uq(activity)) {
                return;
            }
            activity.getWindow().addFlags(1024);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aes6lBG4T9KMRuRenhSlJnbvI5QEuXs=", "B+cjnBfi", 68);
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    public at(com.bytedance.sdk.openadsdk.component.reward.kgy.ahm ahmVar) {
        this(ahmVar.mw, ahmVar.ahm, ahmVar.sm, ahmVar.pft, ahmVar);
    }

    public void kgy(ft ftVar) {
        if (ftVar == null) {
            return;
        }
        ftVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.kgy.at.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = at.this.ahm.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aes6lBG4T9KMRuRenhSlJnbvI5QEuXuD0Q==", "Sfsj", 93);
                }
            }
        }, 300L);
    }

    private void kgy(com.bytedance.sdk.openadsdk.component.reward.kgy.ahm ahmVar) {
        ahmVar.cc = ahmVar.ahm.vai();
        ahmVar.sm = kgy(ahmVar.mw, ahmVar.ahm);
    }

    public static int kgy(Activity activity, ioy ioyVar) {
        if (26 == Build.VERSION.SDK_INT) {
            Resources resources = activity != null ? activity.getResources() : null;
            Configuration configuration = resources != null ? resources.getConfiguration() : null;
            return (configuration == null || configuration.orientation == 1) ? 1 : 2;
        }
        if (ioyVar != null) {
            return ioyVar.tpu();
        }
        return 1;
    }

    private static boolean kgy(int i, int i2) {
        return i == 2 && i2 == 2;
    }

    public void kgy() {
        fpp.kgy(this.ahm, this.uq, this.ct, 1);
    }

    public float[] kgy(int i) {
        boolean zAhm = com.bytedance.sdk.openadsdk.core.gf.ahm.kgy.ahm(this.ahm);
        Activity activity = this.ahm;
        if (zAhm) {
            return kgy(activity, i, true);
        }
        return kgy(i, activity, this.rz);
    }

    public static float[] kgy(int i, Activity activity, ioy ioyVar) {
        return ahm(i, activity, ioyVar);
    }

    public static float[] kgy(Activity activity, int i, boolean z) {
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        if (activity != null && activity.getWindow() != null) {
            View decorView = activity.getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            boolean z2 = com.bytedance.sdk.openadsdk.core.xh.uq().dta() == 1;
            boolean zUq = gbb.uq(activity);
            int iKgy = (int) gbb.kgy();
            boolean z3 = i == 1 || zUq || z2;
            if (width < 10 || height < 10) {
                Point pointAhm = gbb.ahm((Context) activity);
                width = pointAhm.x;
                height = pointAhm.y;
            }
            int iMin = Math.min(width, height);
            if (z3) {
                iMin = Math.max(iMin - iKgy, 0);
            }
            if (z) {
                float f = iMin;
                fArr[0] = gbb.rz(activity, f);
                fArr[1] = gbb.rz(activity, f);
            } else {
                float f2 = iMin;
                fArr[0] = f2;
                fArr[1] = f2;
            }
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ahm(Activity activity, int i) {
        int i2 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (kgy(i, i2)) {
            return Math.abs(gbb.kus(activity) - decorView.getWidth());
        }
        return Math.abs(gbb.twf(activity) - decorView.getHeight());
    }

    public void ahm() {
        gbb.ahm(this.ahm);
        this.ahm.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.kgy.at.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (at.this.ahm.isFinishing()) {
                            return;
                        }
                        at.this.ahm.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.kgy.at.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                gbb.ahm(at.this.ahm);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aes6lBG4T9KMRuRenhSlJnbvI5QEuXuD0g==", "VOAejBCobMq1Q+FUnxiiIVfnOYwgtGjJh08=", 242);
                        com.bytedance.sdk.component.utils.sx.rz("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }
}
