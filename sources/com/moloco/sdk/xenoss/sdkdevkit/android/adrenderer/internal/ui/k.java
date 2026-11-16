package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.ViewCompat;
import coil.target.ImageViewTarget;
import com.ironsource.R6;
import defpackage.as0;
import defpackage.az2;
import defpackage.fs1;
import defpackage.k21;
import defpackage.q22;
import defpackage.qx0;
import defpackage.sr0;
import defpackage.xl1;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k {

    @NotNull
    public static final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ String c;

        public a(View view, ImageView imageView, String str) {
            this.a = view;
            this.b = imageView;
            this.c = str;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            view.getClass();
            this.a.removeOnAttachStateChangeListener(this);
            boolean zIsHardwareAccelerated = this.b.isHardwareAccelerated();
            if (!zIsHardwareAccelerated) {
                k.b();
            }
            ImageView imageView = this.b;
            q22 q22VarE = xl1.e(imageView.getContext());
            k21 k21Var = new k21(imageView.getContext());
            k21Var.c = this.c;
            k21Var.d = new ImageViewTarget(imageView);
            k21Var.m = null;
            k21Var.n = null;
            k21Var.q = 0;
            k21Var.i = Boolean.valueOf(zIsHardwareAccelerated);
            q22VarE.b(k21Var.a());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            view.getClass();
        }
    }

    public static final void b() {
        if (a.compareAndSet(false, true)) {
            com.moloco.sdk.internal.services.b0 b0VarA = com.moloco.sdk.service_locator.e.b().a();
            com.moloco.sdk.acm.recorder.b.Companion.getClass();
            com.moloco.sdk.acm.recorder.c cVarB = com.moloco.sdk.acm.recorder.a.b();
            com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("software_rendering_detected");
            eVar.a("manufacturer", b0VarA.a);
            eVar.a(R6.B, b0VarA.b);
            eVar.a("os_version", Build.VERSION.RELEASE);
            eVar.a("api_level", String.valueOf(b0VarA.e));
            cVarB.a(eVar);
        }
    }

    @Composable
    public static final void a(@Nullable String str, @NotNull ContentScale contentScale, @NotNull Modifier modifier, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        contentScale.getClass();
        modifier.getClass();
        ComposerImpl composerImplT = composer.t(481470006);
        if ((i & 6) == 0) {
            if (composerImplT.l(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (composerImplT.l(contentScale)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (composerImplT.l(modifier)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && composerImplT.b()) {
            composerImplT.h();
        } else {
            as0 as0Var = ComposerKt.a;
            boolean zIsHardwareAccelerated = ((View) composerImplT.v(AndroidCompositionLocals_androidKt.f)).isHardwareAccelerated();
            composerImplT.B(313993790);
            boolean zM = composerImplT.m(zIsHardwareAccelerated);
            Object objB0 = composerImplT.b0();
            if (zM || objB0 == Composer.Companion.a) {
                objB0 = new qx0(zIsHardwareAccelerated, 4);
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            EffectsKt.g((sr0) objB0, composerImplT);
            k21 k21Var = new k21((Context) composerImplT.v(AndroidCompositionLocals_androidKt.b));
            k21Var.c = str;
            k21Var.i = Boolean.valueOf(zIsHardwareAccelerated);
            fs1.a(k21Var.a(), modifier, contentScale, composerImplT, ((i2 << 15) & 3670016) | (i2 & 896) | 48);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT != null) {
            recomposeScopeImplT.d = new l0(str, contentScale, modifier, i);
        }
    }

    public static final az2 a(String str, ContentScale contentScale, Modifier modifier, int i, Composer composer, int i2) {
        a(str, contentScale, modifier, composer, i | 1);
        return az2.a;
    }

    public static final az2 a(boolean z) {
        if (!z) {
            b();
        }
        return az2.a;
    }

    public static final void a(@NotNull ImageView imageView, @Nullable String str) {
        imageView.getClass();
        if (str != null) {
            Context context = imageView.getContext();
            context.getClass();
            q22 q22VarE = xl1.e(context);
            Context context2 = imageView.getContext();
            context2.getClass();
            k21 k21Var = new k21(context2);
            k21Var.c = str;
            q22VarE.b(k21Var.a());
        }
        WeakHashMap weakHashMap = ViewCompat.a;
        if (imageView.isAttachedToWindow()) {
            boolean zIsHardwareAccelerated = imageView.isHardwareAccelerated();
            if (!zIsHardwareAccelerated) {
                b();
            }
            q22 q22VarE2 = xl1.e(imageView.getContext());
            k21 k21Var2 = new k21(imageView.getContext());
            k21Var2.c = str;
            k21Var2.d = new ImageViewTarget(imageView);
            k21Var2.m = null;
            k21Var2.n = null;
            k21Var2.q = 0;
            k21Var2.i = Boolean.valueOf(zIsHardwareAccelerated);
            q22VarE2.b(k21Var2.a());
            return;
        }
        imageView.addOnAttachStateChangeListener(new a(imageView, imageView, str));
    }
}
