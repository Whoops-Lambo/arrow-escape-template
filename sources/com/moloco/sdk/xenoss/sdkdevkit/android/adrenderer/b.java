package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.as0;
import defpackage.az2;
import defpackage.zr0;
import io.p071bidmachine.t1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements t {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public final void a(View view) {
        view.getClass();
        Bitmap bitmapA = d.a(this.a);
        if (bitmapA == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(t1.b(null).getResources(), bitmapA);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(t1.b(null).getResources().getDisplayMetrics());
        view.setForeground(bitmapDrawable);
        view.setClickable(false);
        view.setFocusable(false);
        view.setContentDescription("Watermark Overlay");
        view.setTag("Watermark Overlay");
    }

    public final void b(final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        ComposerImpl composerImplT = composer.t(412679763);
        if ((i & 6) == 0) {
            if (composerImplT.l(composableLambdaImpl)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (composerImplT.l(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else {
            as0 as0Var = ComposerKt.a;
            d.b(this.a, ComposableLambdaKt.b(composerImplT, 586795374, new com.moloco.sdk.internal.publisher.nativead.ui.e(composableLambdaImpl, 1)), composerImplT, 48);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT != null) {
            recomposeScopeImplT.d = new zr0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a
                @Override // defpackage.zr0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i5 = i | 1;
                    this.a.b(composableLambdaImpl, (Composer) obj, i5);
                    return az2.a;
                }
            };
        }
    }
}
