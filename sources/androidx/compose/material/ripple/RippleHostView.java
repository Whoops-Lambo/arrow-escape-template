package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import defpackage.sr0;
import defpackage.ue0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "pressed", "Laz2;", "setRippleState", "(Z)V", "Companion", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RippleHostView extends View {
    public static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] g = new int[0];
    public UnprojectedRipple a;
    public Boolean b;
    public Long c;
    public ue0 d;
    public sr0 e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView$Companion;", "", "", "MinimumRippleStateChangeTime", "J", "", "PressedState", "[I", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final void c() {
        this.e = null;
        ue0 ue0Var = this.d;
        if (ue0Var != null) {
            removeCallbacks(ue0Var);
            ue0 ue0Var2 = this.d;
            ue0Var2.getClass();
            ue0Var2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.a;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(g);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.a;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public final void e(long j, int i, long j2, float f2) {
        UnprojectedRipple unprojectedRipple = this.a;
        if (unprojectedRipple == null) {
            return;
        }
        Integer num = unprojectedRipple.c;
        if (num == null || num.intValue() != i) {
            unprojectedRipple.c = Integer.valueOf(i);
            UnprojectedRipple.MRadiusHelper.a.a(unprojectedRipple, i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jB = Color.b(j2, f2);
        Color color = unprojectedRipple.b;
        if (!(color == null ? false : Color.c(color.a, jB))) {
            unprojectedRipple.b = new Color(jB);
            unprojectedRipple.setColor(ColorStateList.valueOf(ColorKt.g(jB)));
        }
        Rect rectA = RectHelper_androidKt.a(SizeKt.c(j));
        setLeft(rectA.left);
        setTop(rectA.top);
        setRight(rectA.right);
        setBottom(rectA.bottom);
        unprojectedRipple.setBounds(rectA);
    }

    private final void setRippleState(boolean pressed) {
        long jLongValue;
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentAnimationTimeMillis - jLongValue;
        if (!pressed && j < 5) {
            ue0 ue0Var = new ue0(this, 24);
            this.d = ue0Var;
            postDelayed(ue0Var, 50L);
        } else {
            if (pressed) {
                iArr = f;
            } else {
                iArr = g;
            }
            UnprojectedRipple unprojectedRipple = this.a;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m12setRippleState$lambda2(RippleHostView rippleHostView) {
        rippleHostView.getClass();
        UnprojectedRipple unprojectedRipple = rippleHostView.a;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(g);
        }
        rippleHostView.d = null;
    }

    public final void b(PressInteraction.Press press, boolean z, long j, int i, long j2, float f2, sr0 sr0Var) {
        press.getClass();
        long j3 = press.a;
        sr0Var.getClass();
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z);
            setBackground(unprojectedRipple);
            this.a = unprojectedRipple;
            this.b = Boolean.valueOf(z);
        }
        UnprojectedRipple unprojectedRipple2 = this.a;
        unprojectedRipple2.getClass();
        this.e = sr0Var;
        e(j, i, j2, f2);
        if (z) {
            unprojectedRipple2.setHotspot(Offset.c(j3), Offset.d(j3));
        } else {
            unprojectedRipple2.setHotspot(unprojectedRipple2.getBounds().centerX(), unprojectedRipple2.getBounds().centerY());
        }
        setRippleState(true);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        sr0 sr0Var = this.e;
        if (sr0Var != null) {
            sr0Var.invoke();
        }
    }
}
