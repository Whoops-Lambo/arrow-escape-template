package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.rd1;
import defpackage.s71;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OutlineResolver {
    public Density a;
    public boolean b;
    public final Outline c;
    public long d;
    public Shape e;
    public AndroidPath f;
    public Path g;
    public boolean h;
    public boolean i;
    public Path j;
    public RoundRect k;
    public float l;
    public long m;
    public long n;
    public boolean o;
    public LayoutDirection p;
    public androidx.compose.ui.graphics.Outline q;

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    public final void a(Canvas canvas) {
        canvas.getClass();
        e();
        Path path = this.g;
        if (path != null) {
            canvas.f(path);
            return;
        }
        float f = this.l;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.g(1, Offset.c(this.m), Offset.d(this.m), Offset.c(this.m) + Size.d(this.n), Offset.d(this.m) + Size.b(this.n));
            return;
        }
        Path pathA = this.j;
        RoundRect roundRect = this.k;
        if (pathA != null) {
            long j = this.m;
            long j2 = this.n;
            if (roundRect != null && RoundRectKt.a(roundRect) && roundRect.a == Offset.c(j) && roundRect.b == Offset.d(j)) {
                if (roundRect.c == Size.d(j2) + Offset.c(j)) {
                    if (roundRect.d != Size.b(j2) + Offset.d(j) || CornerRadius.b(roundRect.e) != f) {
                        float fC = Offset.c(this.m);
                        float fD = Offset.d(this.m);
                        float fD2 = Size.d(this.n) + Offset.c(this.m);
                        float fB = Size.b(this.n) + Offset.d(this.m);
                        float f2 = this.l;
                        long jA = CornerRadiusKt.a(f2, f2);
                        long jA2 = CornerRadiusKt.a(CornerRadius.b(jA), CornerRadius.c(jA));
                        RoundRect roundRect2 = new RoundRect(fC, fD, fD2, fB, jA2, jA2, jA2, jA2);
                        if (pathA == null) {
                            pathA = AndroidPath_androidKt.a();
                        } else {
                            pathA.reset();
                        }
                        pathA.e(roundRect2);
                        this.k = roundRect2;
                        this.j = pathA;
                    }
                } else {
                    float fC2 = Offset.c(this.m);
                    float fD3 = Offset.d(this.m);
                    float fD4 = Size.d(this.n) + Offset.c(this.m);
                    float fB2 = Size.b(this.n) + Offset.d(this.m);
                    float f3 = this.l;
                    long jA3 = CornerRadiusKt.a(f3, f3);
                    long jA4 = CornerRadiusKt.a(CornerRadius.b(jA3), CornerRadius.c(jA3));
                    RoundRect roundRect3 = new RoundRect(fC2, fD3, fD4, fB2, jA4, jA4, jA4, jA4);
                    if (pathA == null) {
                        pathA = AndroidPath_androidKt.a();
                    } else {
                        pathA.reset();
                    }
                    pathA.e(roundRect3);
                    this.k = roundRect3;
                    this.j = pathA;
                }
            } else {
                float fC3 = Offset.c(this.m);
                float fD5 = Offset.d(this.m);
                float fD6 = Size.d(this.n) + Offset.c(this.m);
                float fB3 = Size.b(this.n) + Offset.d(this.m);
                float f4 = this.l;
                long jA5 = CornerRadiusKt.a(f4, f4);
                long jA6 = CornerRadiusKt.a(CornerRadius.b(jA5), CornerRadius.c(jA5));
                RoundRect roundRect4 = new RoundRect(fC3, fD5, fD6, fB3, jA6, jA6, jA6, jA6);
                if (pathA == null) {
                    pathA = AndroidPath_androidKt.a();
                } else {
                    pathA.reset();
                }
                pathA.e(roundRect4);
                this.k = roundRect4;
                this.j = pathA;
            }
        } else {
            float fC4 = Offset.c(this.m);
            float fD7 = Offset.d(this.m);
            float fD8 = Size.d(this.n) + Offset.c(this.m);
            float fB4 = Size.b(this.n) + Offset.d(this.m);
            float f5 = this.l;
            long jA7 = CornerRadiusKt.a(f5, f5);
            long jA8 = CornerRadiusKt.a(CornerRadius.b(jA7), CornerRadius.c(jA7));
            RoundRect roundRect5 = new RoundRect(fC4, fD7, fD8, fB4, jA8, jA8, jA8, jA8);
            if (pathA == null) {
                pathA = AndroidPath_androidKt.a();
            } else {
                pathA.reset();
            }
            pathA.e(roundRect5);
            this.k = roundRect5;
            this.j = pathA;
        }
        canvas.f(pathA);
    }

    public final boolean c(long j) {
        androidx.compose.ui.graphics.Outline outline;
        if (!this.o || (outline = this.q) == null) {
            return true;
        }
        float fC = Offset.c(j);
        float fD = Offset.d(j);
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            Rect rect = ((androidx.compose.ui.graphics.Outline.Rectangle) outline).a;
            if (rect.a <= fC && fC < rect.c && rect.b <= fD && fD < rect.d) {
                return true;
            }
        } else {
            if (!(outline instanceof androidx.compose.ui.graphics.Outline.Rounded)) {
                if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
                    return ShapeContainingUtilKt.a(fC, fD, ((androidx.compose.ui.graphics.Outline.Generic) outline).a);
                }
                e.b();
                return false;
            }
            RoundRect roundRect = ((androidx.compose.ui.graphics.Outline.Rounded) outline).a;
            float f = roundRect.a;
            long j2 = roundRect.f;
            long j3 = roundRect.h;
            long j4 = roundRect.g;
            float f2 = roundRect.d;
            float f3 = roundRect.b;
            float f4 = roundRect.c;
            long j5 = roundRect.e;
            if (fC >= f && fC < f4 && fD >= f3 && fD < f2) {
                if (CornerRadius.b(j2) + CornerRadius.b(j5) <= roundRect.b()) {
                    if (CornerRadius.b(j4) + CornerRadius.b(j3) <= roundRect.b()) {
                        if (CornerRadius.c(j3) + CornerRadius.c(j5) <= roundRect.a()) {
                            if (CornerRadius.c(j4) + CornerRadius.c(j2) <= roundRect.a()) {
                                float fB = CornerRadius.b(j5) + f;
                                float fC2 = CornerRadius.c(j5) + f3;
                                float fB2 = f4 - CornerRadius.b(j2);
                                float fC3 = CornerRadius.c(j2) + f3;
                                float fB3 = f4 - CornerRadius.b(j4);
                                float fC4 = f2 - CornerRadius.c(j4);
                                float fC5 = f2 - CornerRadius.c(j3);
                                float fB4 = CornerRadius.b(j3) + f;
                                if (fC < fB && fD < fC2) {
                                    return ShapeContainingUtilKt.b(fC, fD, roundRect.e, fB, fC2);
                                }
                                if (fC < fB4 && fD > fC5) {
                                    return ShapeContainingUtilKt.b(fC, fD, roundRect.h, fB4, fC5);
                                }
                                if (fC > fB2 && fD < fC3) {
                                    return ShapeContainingUtilKt.b(fC, fD, roundRect.f, fB2, fC3);
                                }
                                if (fC <= fB3 || fD <= fC4) {
                                    return true;
                                }
                                return ShapeContainingUtilKt.b(fC, fD, roundRect.g, fB3, fC4);
                            }
                        }
                    }
                }
                AndroidPath androidPathA = AndroidPath_androidKt.a();
                androidPathA.e(roundRect);
                return ShapeContainingUtilKt.a(fC, fD, androidPathA);
            }
        }
        return false;
    }

    public final void e() {
        if (this.h) {
            this.m = Offset.b;
            long j = this.d;
            this.n = j;
            this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.g = null;
            this.h = false;
            this.i = false;
            boolean z = this.o;
            Outline outline = this.c;
            if (!z || Size.d(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Size.b(this.d) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                outline.setEmpty();
                return;
            }
            this.b = true;
            androidx.compose.ui.graphics.Outline outlineA = this.e.a(this.d, this.p, this.a);
            this.q = outlineA;
            if (outlineA instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                Rect rect = ((androidx.compose.ui.graphics.Outline.Rectangle) outlineA).a;
                float f = rect.a;
                float f2 = rect.b;
                this.m = OffsetKt.a(f, f2);
                this.n = SizeKt.a(rect.d(), rect.c());
                outline.setRect(rd1.p(f), rd1.p(f2), rd1.p(rect.c), rd1.p(rect.d));
                return;
            }
            if (!(outlineA instanceof androidx.compose.ui.graphics.Outline.Rounded)) {
                if (outlineA instanceof androidx.compose.ui.graphics.Outline.Generic) {
                    f(((androidx.compose.ui.graphics.Outline.Generic) outlineA).a);
                    return;
                }
                return;
            }
            RoundRect roundRect = ((androidx.compose.ui.graphics.Outline.Rounded) outlineA).a;
            float fB = CornerRadius.b(roundRect.e);
            float f3 = roundRect.a;
            float f4 = roundRect.b;
            this.m = OffsetKt.a(f3, f4);
            this.n = SizeKt.a(roundRect.b(), roundRect.a());
            if (RoundRectKt.a(roundRect)) {
                this.c.setRoundRect(rd1.p(f3), rd1.p(f4), rd1.p(roundRect.c), rd1.p(roundRect.d), fB);
                this.l = fB;
                return;
            }
            AndroidPath androidPathA = this.f;
            if (androidPathA == null) {
                androidPathA = AndroidPath_androidKt.a();
                this.f = androidPathA;
            }
            androidPathA.reset();
            androidPathA.e(roundRect);
            f(androidPathA);
        }
    }

    public final void f(Path path) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = this.c;
        if (i <= 28 && !path.g()) {
            this.b = false;
            outline.setEmpty();
            this.i = true;
        } else if (!(path instanceof AndroidPath)) {
            d.u("Unable to obtain android.graphics.Path");
            return;
        } else {
            outline.setConvexPath(((AndroidPath) path).a);
            this.i = !outline.canClip();
        }
        this.g = path;
    }

    public OutlineResolver(Density density) {
        density.getClass();
        this.a = density;
        this.b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        long j = Size.b;
        this.d = j;
        this.e = RectangleShapeKt.a;
        this.m = Offset.b;
        this.n = j;
        this.p = LayoutDirection.a;
    }

    public final Outline b() {
        e();
        if (this.o && this.b) {
            return this.c;
        }
        return null;
    }

    public final boolean d(Shape shape, float f, boolean z, float f2, LayoutDirection layoutDirection, Density density) {
        boolean z2;
        shape.getClass();
        layoutDirection.getClass();
        density.getClass();
        this.c.setAlpha(f);
        boolean zB = s71.b(this.e, shape);
        boolean z3 = !zB;
        if (!zB) {
            this.e = shape;
            this.h = true;
        }
        if (!z && f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.o != z2) {
            this.o = z2;
            this.h = true;
        }
        if (this.p != layoutDirection) {
            this.p = layoutDirection;
            this.h = true;
        }
        if (!s71.b(this.a, density)) {
            this.a = density;
            this.h = true;
        }
        return z3;
    }
}
