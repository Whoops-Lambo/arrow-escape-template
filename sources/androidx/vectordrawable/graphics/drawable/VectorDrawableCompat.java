package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public VectorDrawableCompatState b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class VClipPath extends VPath {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class VFullPath extends VPath {
        public ComplexColorCompat d;
        public float e;
        public ComplexColorCompat f;
        public float g;
        public float h;
        public float i;
        public float j;
        public float k;
        public Paint.Cap l;
        public Paint.Join m;
        public float n;

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            return this.f.b() || this.d.b();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean b(int[] iArr) {
            boolean z;
            ComplexColorCompat complexColorCompat = this.f;
            boolean z2 = true;
            if (complexColorCompat.b()) {
                ColorStateList colorStateList = complexColorCompat.b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != complexColorCompat.c) {
                    complexColorCompat.c = colorForState;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            ComplexColorCompat complexColorCompat2 = this.d;
            if (complexColorCompat2.b()) {
                ColorStateList colorStateList2 = complexColorCompat2.b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != complexColorCompat2.c) {
                    complexColorCompat2.c = colorForState2;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            return z | z2;
        }

        public float getFillAlpha() {
            return this.h;
        }

        @ColorInt
        public int getFillColor() {
            return this.f.c;
        }

        public float getStrokeAlpha() {
            return this.g;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.d.c;
        }

        public float getStrokeWidth() {
            return this.e;
        }

        public float getTrimPathEnd() {
            return this.j;
        }

        public float getTrimPathOffset() {
            return this.k;
        }

        public float getTrimPathStart() {
            return this.i;
        }

        public void setFillAlpha(float f) {
            this.h = f;
        }

        public void setFillColor(int i) {
            this.f.c = i;
        }

        public void setStrokeAlpha(float f) {
            this.g = f;
        }

        public void setStrokeColor(int i) {
            this.d.c = i;
        }

        public void setStrokeWidth(float f) {
            this.e = f;
        }

        public void setTrimPathEnd(float f) {
            this.j = f;
        }

        public void setTrimPathOffset(float f) {
            this.k = f;
        }

        public void setTrimPathStart(float f) {
            this.i = f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class VGroup extends VObject {
        public final Matrix a;
        public final ArrayList b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public String k;

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (((VObject) arrayList.get(i)).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean zB = false;
            while (true) {
                ArrayList arrayList = this.b;
                if (i >= arrayList.size()) {
                    return zB;
                }
                zB |= ((VObject) arrayList.get(i)).b(iArr);
                i++;
            }
        }

        public final void c() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.e);
            matrix.postScale(this.f, this.g);
            matrix.postRotate(this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            matrix.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.k;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                c();
            }
        }

        public VGroup(VGroup vGroup, ArrayMap arrayMap) {
            VPath vClipPath;
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.k = null;
            this.c = vGroup.c;
            this.d = vGroup.d;
            this.e = vGroup.e;
            this.f = vGroup.f;
            this.g = vGroup.g;
            this.h = vGroup.h;
            this.i = vGroup.i;
            String str = vGroup.k;
            this.k = str;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.j);
            ArrayList arrayList = vGroup.b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof VGroup) {
                    this.b.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        VFullPath vFullPath = (VFullPath) obj;
                        VFullPath vFullPath2 = new VFullPath(vFullPath);
                        vFullPath2.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        vFullPath2.g = 1.0f;
                        vFullPath2.h = 1.0f;
                        vFullPath2.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        vFullPath2.j = 1.0f;
                        vFullPath2.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        vFullPath2.l = Paint.Cap.BUTT;
                        vFullPath2.m = Paint.Join.MITER;
                        vFullPath2.n = 4.0f;
                        vFullPath2.d = vFullPath.d;
                        vFullPath2.e = vFullPath.e;
                        vFullPath2.g = vFullPath.g;
                        vFullPath2.f = vFullPath.f;
                        vFullPath2.c = vFullPath.c;
                        vFullPath2.h = vFullPath.h;
                        vFullPath2.i = vFullPath.i;
                        vFullPath2.j = vFullPath.j;
                        vFullPath2.k = vFullPath.k;
                        vFullPath2.l = vFullPath.l;
                        vFullPath2.m = vFullPath.m;
                        vFullPath2.n = vFullPath.n;
                        vClipPath = vFullPath2;
                    } else if (obj instanceof VClipPath) {
                        vClipPath = new VClipPath((VClipPath) obj);
                    } else {
                        e32.i("Unknown object in the tree!");
                        throw null;
                    }
                    this.b.add(vClipPath);
                    Object obj2 = vClipPath.b;
                    if (obj2 != null) {
                        arrayMap.put(obj2, vClipPath);
                    }
                }
            }
        }

        public VGroup() {
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.j = new Matrix();
            this.k = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class VObject {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class VPath extends VObject {
        public PathParser.PathDataNode[] a;
        public String b;
        public int c;

        public PathParser.PathDataNode[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.a(this.a, pathDataNodeArr)) {
                this.a = PathParser.d(pathDataNodeArr);
                return;
            }
            PathParser.PathDataNode[] pathDataNodeArr2 = this.a;
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                pathDataNodeArr2[i].a = pathDataNodeArr[i].a;
                int i2 = 0;
                while (true) {
                    float[] fArr = pathDataNodeArr[i].b;
                    if (i2 < fArr.length) {
                        pathDataNodeArr2[i].b[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public VPath(VPath vPath) {
            this.a = null;
            this.c = 0;
            this.b = vPath.b;
            this.a = PathParser.d(vPath.a);
        }

        public VPath() {
            this.a = null;
            this.c = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class VPathRenderer {
        public static final Matrix p = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final VGroup g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final ArrayMap o;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(VGroup vGroup, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            int i4;
            Matrix matrix2 = vGroup.a;
            ArrayList arrayList = vGroup.b;
            matrix2.set(matrix);
            Matrix matrix3 = vGroup.a;
            matrix3.preConcat(vGroup.j);
            canvas.save();
            char c = 0;
            int i5 = 0;
            while (i5 < arrayList.size()) {
                VObject vObject = (VObject) arrayList.get(i5);
                if (vObject instanceof VGroup) {
                    a((VGroup) vObject, matrix3, canvas, i, i2);
                } else {
                    if (vObject instanceof VPath) {
                        VPath vPath = (VPath) vObject;
                        float f2 = i / this.j;
                        float f3 = i2 / this.k;
                        float fMin = Math.min(f2, f3);
                        Matrix matrix4 = this.c;
                        matrix4.set(matrix3);
                        matrix4.postScale(f2, f3);
                        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                        matrix3.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                        boolean z = c;
                        i3 = i5;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.abs(f4) / fMax : 0.0f;
                        if (fAbs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            Path path = this.a;
                            path.reset();
                            PathParser.PathDataNode[] pathDataNodeArr = vPath.a;
                            if (pathDataNodeArr != null) {
                                PathParser.PathDataNode.b(pathDataNodeArr, path);
                            }
                            Path path2 = this.b;
                            path2.reset();
                            if (vPath instanceof VClipPath) {
                                path2.setFillType(vPath.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix4);
                                canvas.clipPath(path2);
                            } else {
                                VFullPath vFullPath = (VFullPath) vPath;
                                float f5 = vFullPath.i;
                                if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || vFullPath.j != 1.0f) {
                                    float f6 = vFullPath.k;
                                    float f7 = (f5 + f6) % 1.0f;
                                    float f8 = (vFullPath.j + f6) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, z);
                                    float length = this.f.getLength();
                                    float f9 = f7 * length;
                                    float f10 = f8 * length;
                                    path.reset();
                                    PathMeasure pathMeasure = this.f;
                                    if (f9 > f10) {
                                        pathMeasure.getSegment(f9, length, path, true);
                                        PathMeasure pathMeasure2 = this.f;
                                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        pathMeasure2.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, path, true);
                                    } else {
                                        f = 0.0f;
                                        pathMeasure.getSegment(f9, f10, path, true);
                                    }
                                    path.rLineTo(f, f);
                                }
                                path2.addPath(path, matrix4);
                                ComplexColorCompat complexColorCompat = vFullPath.f;
                                float f11 = 255.0f;
                                if (complexColorCompat.a == null && complexColorCompat.c == 0) {
                                    f11 = 255.0f;
                                    i4 = 16777215;
                                } else {
                                    if (this.e == null) {
                                        i4 = 16777215;
                                        Paint paint = new Paint(1);
                                        this.e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    } else {
                                        i4 = 16777215;
                                    }
                                    Paint paint2 = this.e;
                                    Shader shader = complexColorCompat.a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(vFullPath.h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i6 = complexColorCompat.c;
                                        float f12 = vFullPath.h;
                                        PorterDuff.Mode mode = VectorDrawableCompat.j;
                                        paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(vFullPath.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                ComplexColorCompat complexColorCompat2 = vFullPath.d;
                                if (complexColorCompat2.a != null || complexColorCompat2.c != 0) {
                                    if (this.d == null) {
                                        Paint paint3 = new Paint(1);
                                        this.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.d;
                                    Paint.Join join = vFullPath.m;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = vFullPath.l;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(vFullPath.n);
                                    Shader shader2 = complexColorCompat2.a;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(vFullPath.g * f11));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i7 = complexColorCompat2.c;
                                        float f13 = vFullPath.g;
                                        PorterDuff.Mode mode2 = VectorDrawableCompat.j;
                                        paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(vFullPath.e * fMin * fAbs);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                    i5 = i3 + 1;
                    c = 0;
                }
                i3 = i5;
                i5 = i3 + 1;
                c = 0;
            }
            canvas.restore();
        }

        public int getRootAlpha() {
            return this.l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.l = i;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.c = new Matrix();
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.l = 255;
            this.m = null;
            this.n = null;
            ArrayMap arrayMap = new ArrayMap(0);
            this.o = arrayMap;
            this.g = new VGroup(vPathRenderer.g, arrayMap);
            this.a = new Path(vPathRenderer.a);
            this.b = new Path(vPathRenderer.b);
            this.h = vPathRenderer.h;
            this.i = vPathRenderer.i;
            this.j = vPathRenderer.j;
            this.k = vPathRenderer.k;
            this.l = vPathRenderer.l;
            this.m = vPathRenderer.m;
            String str = vPathRenderer.m;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.n = vPathRenderer.n;
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public VPathRenderer() {
            this.c = new Matrix();
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = new ArrayMap(0);
            this.g = new VGroup();
            this.a = new Path();
            this.b = new Path();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class VectorDrawableCompatState extends Drawable.ConstantState {
        public int a;
        public VPathRenderer b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class VectorDrawableDelegateState extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.a = (VectorDrawable) this.a.newDrawable();
            return vectorDrawableCompat;
        }

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.a = (VectorDrawable) this.a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.a = (VectorDrawable) this.a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fAbs4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        VectorDrawableCompatState vectorDrawableCompatState = this.b;
        Bitmap bitmap = vectorDrawableCompatState.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != vectorDrawableCompatState.f.getHeight()) {
            vectorDrawableCompatState.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            vectorDrawableCompatState.k = true;
        }
        boolean z = this.f;
        VectorDrawableCompatState vectorDrawableCompatState2 = this.b;
        if (!z) {
            vectorDrawableCompatState2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(vectorDrawableCompatState2.f);
            VPathRenderer vPathRenderer = vectorDrawableCompatState2.b;
            vPathRenderer.a(vPathRenderer.g, VPathRenderer.p, canvas2, iMin, iMin2);
        } else if (vectorDrawableCompatState2.k || vectorDrawableCompatState2.g != vectorDrawableCompatState2.c || vectorDrawableCompatState2.h != vectorDrawableCompatState2.d || vectorDrawableCompatState2.j != vectorDrawableCompatState2.e || vectorDrawableCompatState2.i != vectorDrawableCompatState2.b.getRootAlpha()) {
            VectorDrawableCompatState vectorDrawableCompatState3 = this.b;
            vectorDrawableCompatState3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(vectorDrawableCompatState3.f);
            VPathRenderer vPathRenderer2 = vectorDrawableCompatState3.b;
            vPathRenderer2.a(vPathRenderer2.g, VPathRenderer.p, canvas3, iMin, iMin2);
            VectorDrawableCompatState vectorDrawableCompatState4 = this.b;
            vectorDrawableCompatState4.g = vectorDrawableCompatState4.c;
            vectorDrawableCompatState4.h = vectorDrawableCompatState4.d;
            vectorDrawableCompatState4.i = vectorDrawableCompatState4.b.getRootAlpha();
            vectorDrawableCompatState4.j = vectorDrawableCompatState4.e;
            vectorDrawableCompatState4.k = false;
        }
        VectorDrawableCompatState vectorDrawableCompatState5 = this.b;
        if (vectorDrawableCompatState5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (vectorDrawableCompatState5.l == null) {
                Paint paint2 = new Paint();
                vectorDrawableCompatState5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            vectorDrawableCompatState5.l.setAlpha(vectorDrawableCompatState5.b.getRootAlpha());
            vectorDrawableCompatState5.l.setColorFilter(colorFilter);
            paint = vectorDrawableCompatState5.l;
        }
        canvas.drawBitmap(vectorDrawableCompatState5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new VectorDrawableDelegateState(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.b;
        vectorDrawableCompatState.b = new VPathRenderer();
        TypedArray typedArrayE = TypedArrayUtils.e(resources, theme, attributeSet, AndroidResources.a);
        VectorDrawableCompatState vectorDrawableCompatState2 = this.b;
        VPathRenderer vPathRenderer = vectorDrawableCompatState2.b;
        int i5 = !TypedArrayUtils.d(xmlPullParser, "tintMode") ? -1 : typedArrayE.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        vectorDrawableCompatState2.d = mode;
        ColorStateList colorStateListB = TypedArrayUtils.b(typedArrayE, xmlPullParser, theme);
        if (colorStateListB != null) {
            vectorDrawableCompatState2.c = colorStateListB;
        }
        boolean z = vectorDrawableCompatState2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayE.getBoolean(5, z);
        }
        vectorDrawableCompatState2.e = z;
        float f = vPathRenderer.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayE.getFloat(7, f);
        }
        vPathRenderer.j = f;
        float f2 = vPathRenderer.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayE.getFloat(8, f2);
        }
        vPathRenderer.k = f2;
        if (vPathRenderer.j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        vPathRenderer.h = typedArrayE.getDimension(3, vPathRenderer.h);
        int i7 = 2;
        float dimension = typedArrayE.getDimension(2, vPathRenderer.i);
        vPathRenderer.i = dimension;
        if (vPathRenderer.h <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = vPathRenderer.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayE.getFloat(4, alpha);
        }
        vPathRenderer.setAlpha(alpha);
        String string = typedArrayE.getString(0);
        if (string != null) {
            vPathRenderer.m = string;
            vPathRenderer.o.put(string, vPathRenderer);
        }
        typedArrayE.recycle();
        vectorDrawableCompatState.a = getChangingConfigurations();
        int i8 = 1;
        vectorDrawableCompatState.k = true;
        VectorDrawableCompatState vectorDrawableCompatState3 = this.b;
        VPathRenderer vPathRenderer2 = vectorDrawableCompatState3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        VGroup vGroup = vPathRenderer2.g;
        ArrayMap arrayMap = vPathRenderer2.o;
        arrayDeque.push(vGroup);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                VGroup vGroup2 = (VGroup) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    VFullPath vFullPath = new VFullPath();
                    vFullPath.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    vFullPath.g = 1.0f;
                    vFullPath.h = 1.0f;
                    vFullPath.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    vFullPath.j = 1.0f;
                    vFullPath.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    vFullPath.l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    vFullPath.m = join2;
                    vFullPath.n = 4.0f;
                    TypedArray typedArrayE2 = TypedArrayUtils.e(resources, theme, attributeSet, AndroidResources.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayE2.getString(0);
                        if (string2 != null) {
                            vFullPath.b = string2;
                        }
                        String string3 = typedArrayE2.getString(2);
                        if (string3 != null) {
                            vFullPath.a = PathParser.c(string3);
                        }
                        vFullPath.f = TypedArrayUtils.c(typedArrayE2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = vFullPath.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayE2.getFloat(12, f3);
                        }
                        vFullPath.h = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayE2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = vFullPath.l;
                        if (i9 == 0) {
                            cap = cap2;
                        } else if (i9 != 1) {
                            cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        vFullPath.l = cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayE2.getInt(9, -1) : -1;
                        Paint.Join join3 = vFullPath.m;
                        if (i10 == 0) {
                            join = join2;
                        } else if (i10 != 1) {
                            join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        vFullPath.m = join;
                        float f4 = vFullPath.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayE2.getFloat(10, f4);
                        }
                        vFullPath.n = f4;
                        vFullPath.d = TypedArrayUtils.c(typedArrayE2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = vFullPath.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayE2.getFloat(11, f5);
                        }
                        vFullPath.g = f5;
                        float f6 = vFullPath.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayE2.getFloat(4, f6);
                        }
                        vFullPath.e = f6;
                        float f7 = vFullPath.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayE2.getFloat(6, f7);
                        }
                        vFullPath.j = f7;
                        float f8 = vFullPath.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayE2.getFloat(7, f8);
                        }
                        vFullPath.k = f8;
                        float f9 = vFullPath.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayE2.getFloat(5, f9);
                        }
                        vFullPath.i = f9;
                        int i11 = vFullPath.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayE2.getInt(13, i11);
                        }
                        vFullPath.c = i11;
                    }
                    typedArrayE2.recycle();
                    vGroup2.b.add(vFullPath);
                    if (vFullPath.getPathName() != null) {
                        arrayMap.put(vFullPath.getPathName(), vFullPath);
                    }
                    vectorDrawableCompatState3.a = vectorDrawableCompatState3.a;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        VClipPath vClipPath = new VClipPath();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayE3 = TypedArrayUtils.e(resources, theme, attributeSet, AndroidResources.d);
                            String string4 = typedArrayE3.getString(0);
                            if (string4 != null) {
                                vClipPath.b = string4;
                            }
                            String string5 = typedArrayE3.getString(1);
                            if (string5 != null) {
                                vClipPath.a = PathParser.c(string5);
                            }
                            vClipPath.c = !TypedArrayUtils.d(xmlPullParser, "fillType") ? 0 : typedArrayE3.getInt(2, 0);
                            typedArrayE3.recycle();
                        }
                        vGroup2.b.add(vClipPath);
                        if (vClipPath.getPathName() != null) {
                            arrayMap.put(vClipPath.getPathName(), vClipPath);
                        }
                        vectorDrawableCompatState3.a = vectorDrawableCompatState3.a;
                    } else if ("group".equals(name)) {
                        VGroup vGroup3 = new VGroup();
                        TypedArray typedArrayE4 = TypedArrayUtils.e(resources, theme, attributeSet, AndroidResources.b);
                        float f10 = vGroup3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = typedArrayE4.getFloat(5, f10);
                        }
                        vGroup3.c = f10;
                        i4 = 1;
                        vGroup3.d = typedArrayE4.getFloat(1, vGroup3.d);
                        vGroup3.e = typedArrayE4.getFloat(2, vGroup3.e);
                        float f11 = vGroup3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayE4.getFloat(3, f11);
                        }
                        vGroup3.f = f11;
                        float f12 = vGroup3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayE4.getFloat(4, f12);
                        }
                        vGroup3.g = f12;
                        float f13 = vGroup3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayE4.getFloat(6, f13);
                        }
                        vGroup3.h = f13;
                        float f14 = vGroup3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayE4.getFloat(7, f14);
                        }
                        vGroup3.i = f14;
                        String string6 = typedArrayE4.getString(0);
                        if (string6 != null) {
                            vGroup3.k = string6;
                        }
                        vGroup3.c();
                        typedArrayE4.recycle();
                        vGroup2.b.add(vGroup3);
                        arrayDeque.push(vGroup3);
                        if (vGroup3.getGroupName() != null) {
                            arrayMap.put(vGroup3.getGroupName(), vGroup3);
                        }
                        vectorDrawableCompatState3.a = vectorDrawableCompatState3.a;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(vectorDrawableCompatState.c, vectorDrawableCompatState.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.b;
        if (vectorDrawableCompatState == null) {
            return false;
        }
        VPathRenderer vPathRenderer = vectorDrawableCompatState.b;
        if (vPathRenderer.n == null) {
            vPathRenderer.n = Boolean.valueOf(vPathRenderer.g.a());
        }
        if (vPathRenderer.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            VectorDrawableCompatState vectorDrawableCompatState = this.b;
            VectorDrawableCompatState vectorDrawableCompatState2 = new VectorDrawableCompatState();
            vectorDrawableCompatState2.c = null;
            vectorDrawableCompatState2.d = j;
            if (vectorDrawableCompatState != null) {
                vectorDrawableCompatState2.a = vectorDrawableCompatState.a;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.b);
                vectorDrawableCompatState2.b = vPathRenderer;
                if (vectorDrawableCompatState.b.e != null) {
                    vPathRenderer.e = new Paint(vectorDrawableCompatState.b.e);
                }
                if (vectorDrawableCompatState.b.d != null) {
                    vectorDrawableCompatState2.b.d = new Paint(vectorDrawableCompatState.b.d);
                }
                vectorDrawableCompatState2.c = vectorDrawableCompatState.c;
                vectorDrawableCompatState2.d = vectorDrawableCompatState.d;
                vectorDrawableCompatState2.e = vectorDrawableCompatState.e;
            }
            this.b = vectorDrawableCompatState2;
            this.e = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.b;
        ColorStateList colorStateList = vectorDrawableCompatState.c;
        if (colorStateList == null || (mode = vectorDrawableCompatState.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        VPathRenderer vPathRenderer = vectorDrawableCompatState.b;
        if (vPathRenderer.n == null) {
            vPathRenderer.n = Boolean.valueOf(vPathRenderer.g.a());
        }
        if (vPathRenderer.n.booleanValue()) {
            boolean zB = vectorDrawableCompatState.b.g.b(iArr);
            vectorDrawableCompatState.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.b;
        if (vectorDrawableCompatState.c != colorStateList) {
            vectorDrawableCompatState.c = colorStateList;
            this.c = a(colorStateList, vectorDrawableCompatState.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.b;
        if (vectorDrawableCompatState.d != mode) {
            vectorDrawableCompatState.d = mode;
            this.c = a(vectorDrawableCompatState.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public VectorDrawableCompat() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        VectorDrawableCompatState vectorDrawableCompatState = new VectorDrawableCompatState();
        vectorDrawableCompatState.c = null;
        vectorDrawableCompatState.d = j;
        vectorDrawableCompatState.b = new VPathRenderer();
        this.b = vectorDrawableCompatState;
    }

    public VectorDrawableCompat(VectorDrawableCompatState vectorDrawableCompatState) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = vectorDrawableCompatState;
        this.c = a(vectorDrawableCompatState.c, vectorDrawableCompatState.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
