package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int m = 0;
    public DrawableContainerState a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean h;
    public Runnable i;
    public long j;
    public long k;
    public BlockInvalidateCallback l;
    public int e = 255;
    public int g = -1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class BlockInvalidateCallback implements Drawable.Callback {
        public Drawable.Callback a;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class DrawableContainerState extends Drawable.ConstantState {
        public final int A;
        public boolean B;
        public ColorFilter C;
        public boolean D;
        public ColorStateList E;
        public PorterDuff.Mode F;
        public boolean G;
        public boolean H;
        public final StateListDrawableCompat a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray f;
        public final Drawable[] g;
        public final int h;
        public final boolean i;
        public boolean j;
        public Rect k;
        public final boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public int y;
        public final int z;

        public final void a() {
            this.m = true;
            b();
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i = 0; i < this.h; i++) {
                Drawable drawable = this.g[i];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            for (int i = 0; i < this.h; i++) {
                Drawable drawable = this.g[i];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            for (int i = 0; i < this.h; i++) {
                Drawable drawable = this.g[i];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
        }

        public final void b() {
            SparseArray sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f.keyAt(i);
                    Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(i)).newDrawable(this.b);
                    drawableNewDrawable.setLayoutDirection(this.y);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.a);
                    this.g[iKeyAt] = drawableMutate;
                }
                this.f = null;
            }
        }

        public final Drawable c(int i) {
            int iIndexOfKey;
            Drawable[] drawableArr = this.g;
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(iIndexOfKey)).newDrawable(this.b);
            drawableNewDrawable.setLayoutDirection(this.y);
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.a);
            drawableArr[i] = drawableMutate;
            this.f.removeAt(iIndexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return drawableMutate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.e | this.d;
        }

        public DrawableContainerState(StateListDrawableCompat.StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            Resources resources2;
            int i;
            this.i = false;
            this.l = false;
            this.x = true;
            this.z = 0;
            this.A = 0;
            this.a = stateListDrawableCompat;
            if (resources != null) {
                resources2 = resources;
            } else if (stateListState != null) {
                resources2 = stateListState.b;
            } else {
                resources2 = null;
            }
            this.b = resources2;
            if (stateListState != null) {
                i = stateListState.c;
            } else {
                i = 0;
            }
            int i2 = DrawableContainerCompat.m;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.c = i;
            if (stateListState != null) {
                this.d = stateListState.d;
                this.e = stateListState.e;
                this.v = true;
                this.w = true;
                this.i = stateListState.i;
                this.l = stateListState.l;
                this.x = stateListState.x;
                this.y = stateListState.y;
                this.z = stateListState.z;
                this.A = stateListState.A;
                this.B = stateListState.B;
                this.C = stateListState.C;
                this.D = stateListState.D;
                this.E = stateListState.E;
                this.F = stateListState.F;
                this.G = stateListState.G;
                this.H = stateListState.H;
                if (stateListState.c == i) {
                    if (stateListState.j) {
                        this.k = stateListState.k != null ? new Rect(stateListState.k) : null;
                        this.j = true;
                    }
                    if (stateListState.m) {
                        this.n = stateListState.n;
                        this.o = stateListState.o;
                        this.p = stateListState.p;
                        this.q = stateListState.q;
                        this.m = true;
                    }
                }
                if (stateListState.r) {
                    this.s = stateListState.s;
                    this.r = true;
                }
                if (stateListState.t) {
                    this.u = stateListState.u;
                    this.t = true;
                }
                Drawable[] drawableArr = stateListState.g;
                this.g = new Drawable[drawableArr.length];
                this.h = stateListState.h;
                SparseArray sparseArray = stateListState.f;
                if (sparseArray != null) {
                    this.f = sparseArray.clone();
                } else {
                    this.f = new SparseArray(this.h);
                }
                int i3 = this.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    Drawable drawable = drawableArr[i4];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f.put(i4, constantState);
                        } else {
                            this.g[i4] = drawableArr[i4];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j2 = this.j;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.e);
                    this.j = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.a.z)) * this.e) / 255);
                    z2 = true;
                }
            }
            drawable = this.d;
            if (drawable != null) {
                j = this.k;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.d = null;
                        this.k = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.a.A) * this.e) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.i, jUptimeMillis + 16);
                return;
            }
            this.k = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.j = 0L;
        z2 = false;
        drawable = this.d;
        if (drawable != null) {
            j = this.k;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.d = null;
                    this.k = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.a.A) * this.e) / 255);
                }
            }
            if (z) {
            }
        }
        this.k = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        DrawableContainerState drawableContainerState = this.a;
        if (theme == null) {
            drawableContainerState.getClass();
            return;
        }
        drawableContainerState.b();
        int i = drawableContainerState.h;
        Drawable[] drawableArr = drawableContainerState.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                drawableContainerState.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            drawableContainerState.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = drawableContainerState.c;
            drawableContainerState.c = i3;
            if (i4 != i3) {
                drawableContainerState.m = false;
                drawableContainerState.j = false;
            }
        }
    }

    public DrawableContainerState b() {
        return this.a;
    }

    public final void c(Drawable drawable) {
        if (this.l == null) {
            this.l = new BlockInvalidateCallback();
        }
        BlockInvalidateCallback blockInvalidateCallback = this.l;
        blockInvalidateCallback.a = drawable.getCallback();
        drawable.setCallback(blockInvalidateCallback);
        try {
            if (this.a.z <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            DrawableContainerState drawableContainerState = this.a;
            if (drawableContainerState.D) {
                drawable.setColorFilter(drawableContainerState.C);
            } else {
                if (drawableContainerState.G) {
                    drawable.setTintList(drawableContainerState.E);
                }
                DrawableContainerState drawableContainerState2 = this.a;
                if (drawableContainerState2.H) {
                    drawable.setTintMode(drawableContainerState2.F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.B);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            BlockInvalidateCallback blockInvalidateCallback2 = this.l;
            Drawable.Callback callback = blockInvalidateCallback2.a;
            blockInvalidateCallback2.a = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean d(int i) {
        if (i == this.g) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.a.A > 0) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                this.d = drawable2;
                this.k = ((long) this.a.A) + jUptimeMillis;
            } else {
                this.d = null;
                this.k = 0L;
            }
        } else {
            Drawable drawable3 = this.c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            DrawableContainerState drawableContainerState = this.a;
            if (i < drawableContainerState.h) {
                Drawable drawableC = drawableContainerState.c(i);
                this.c = drawableC;
                this.g = i;
                if (drawableC != null) {
                    int i2 = this.a.z;
                    if (i2 > 0) {
                        this.j = jUptimeMillis + ((long) i2);
                    }
                    c(drawableC);
                }
            } else {
                this.c = null;
                this.g = -1;
            }
        } else {
            this.c = null;
            this.g = -1;
        }
        if (this.j != 0 || this.k != 0) {
            Runnable runnable = this.i;
            if (runnable == null) {
                final StateListDrawableCompat stateListDrawableCompat = (StateListDrawableCompat) this;
                this.i = new Runnable() { // from class: androidx.appcompat.graphics.drawable.DrawableContainerCompat.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        StateListDrawableCompat stateListDrawableCompat2 = stateListDrawableCompat;
                        stateListDrawableCompat2.a(true);
                        stateListDrawableCompat2.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(DrawableContainerState drawableContainerState) {
        this.a = drawableContainerState;
        int i = this.g;
        if (i >= 0) {
            Drawable drawableC = drawableContainerState.c(i);
            this.c = drawableC;
            if (drawableC != null) {
                c(drawableC);
            }
        }
        this.d = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        DrawableContainerState drawableContainerState = this.a;
        if (!drawableContainerState.v) {
            drawableContainerState.b();
            drawableContainerState.v = true;
            int i = drawableContainerState.h;
            Drawable[] drawableArr = drawableContainerState.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    drawableContainerState.w = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    drawableContainerState.w = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = drawableContainerState.w;
        }
        if (!z) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState.l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState.l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState.l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState.l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            DrawableContainerState drawableContainerState = this.a;
            if (drawableContainerState.r) {
                return drawableContainerState.s;
            }
            drawableContainerState.b();
            int i = drawableContainerState.h;
            Drawable[] drawableArr = drawableContainerState.g;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            drawableContainerState.s = opacity;
            drawableContainerState.r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        DrawableContainerState drawableContainerState = this.a;
        Rect rect2 = null;
        boolean padding = false;
        if (!drawableContainerState.i) {
            Rect rect3 = drawableContainerState.k;
            if (rect3 != null || drawableContainerState.j) {
                rect2 = rect3;
            } else {
                drawableContainerState.b();
                Rect rect4 = new Rect();
                int i = drawableContainerState.h;
                Drawable[] drawableArr = drawableContainerState.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                drawableContainerState.j = true;
                drawableContainerState.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.B && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState != null) {
            drawableContainerState.r = false;
            drawableContainerState.t = false;
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.B;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState.t) {
            return drawableContainerState.u;
        }
        drawableContainerState.b();
        int i = drawableContainerState.h;
        Drawable[] drawableArr = drawableContainerState.g;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            }
        }
        drawableContainerState.u = z;
        drawableContainerState.t = true;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            DrawableContainerState drawableContainerStateB = b();
            drawableContainerStateB.d();
            e(drawableContainerStateB);
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        DrawableContainerState drawableContainerState = this.a;
        int i2 = this.g;
        int i3 = drawableContainerState.h;
        Drawable[] drawableArr = drawableContainerState.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        drawableContainerState.y = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f && this.e == i) {
            return;
        }
        this.f = true;
        this.e = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.j == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState.B != z) {
            drawableContainerState.B = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.a;
        drawableContainerState.D = true;
        if (drawableContainerState.C != colorFilter) {
            drawableContainerState.C = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        DrawableContainerState drawableContainerState = this.a;
        if (drawableContainerState.x != z) {
            drawableContainerState.x = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.a;
        drawableContainerState.G = true;
        if (drawableContainerState.E != colorStateList) {
            drawableContainerState.E = colorStateList;
            this.c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.a;
        drawableContainerState.H = true;
        if (drawableContainerState.F != mode) {
            drawableContainerState.F = mode;
            this.c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }
}
