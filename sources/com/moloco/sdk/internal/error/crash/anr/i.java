package com.moloco.sdk.internal.error.crash.anr;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.internal.j0;
import com.unity3d.services.UnityAdsConstants;
import defpackage.er;
import defpackage.h00;
import defpackage.nq2;
import defpackage.q9;
import defpackage.vq0;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.mediacodec.j;
import io.p071bidmachine.media3.exoplayer.mediacodec.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {
    public final Context a;

    public String a(String str) {
        InputStream inputStreamOpen = this.a.getAssets().open(str);
        inputStreamOpen.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, er.a), 8192);
        try {
            String strQ = h00.q(bufferedReader);
            bufferedReader.close();
            return strQ;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nq2.e(bufferedReader, th);
                throw th2;
            }
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.j
    public k b(vq0 vq0Var) {
        Context context;
        int i = x.a;
        if (i >= 23) {
            int i2 = 28;
            if (i >= 31 || ((context = this.a) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
                int i3 = f0.i(((n) vq0Var.c).n);
                io.p071bidmachine.media3.common.util.a.s("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(x.C(i3)));
                return new j0(i2, new q9(i3, 4), new q9(i3, 5)).b(vq0Var);
            }
        }
        return new io.p071bidmachine.displays.mapper.a(15).b(vq0Var);
    }

    public com.moloco.sdk.common_adapter_internal.a c() {
        DisplayMetrics displayMetrics;
        Context context = this.a;
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        if (windowManager == null) {
            return new com.moloco.sdk.common_adapter_internal.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            displayMetrics = new DisplayMetrics();
            displayMetrics.density = context.getResources().getDisplayMetrics().density;
            displayMetrics.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
            displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
            displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        } else {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        return new com.moloco.sdk.common_adapter_internal.a(i / f, i, i2, i2 / f, f, displayMetrics.densityDpi);
    }

    public i(Context context, int i) {
        switch (i) {
            case 4:
                this.a = context.getApplicationContext();
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
    }

    public /* synthetic */ i(Context context, byte b) {
        this.a = context;
    }
}
