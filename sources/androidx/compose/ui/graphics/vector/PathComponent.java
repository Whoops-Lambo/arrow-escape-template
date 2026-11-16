package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.unity3d.services.UnityAdsConstants;
import defpackage.eu;
import defpackage.gd1;
import defpackage.gg0;
import defpackage.pd1;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PathComponent extends VNode {
    public Brush b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public Brush g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Stroke q;
    public final AndroidPath r;
    public final AndroidPath s;
    public final gd1 t;
    public final PathParser u;

    public final void e() {
        AndroidPath androidPath = this.s;
        androidPath.reset();
        float f = this.k;
        AndroidPath androidPath2 = this.r;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.l == 1.0f) {
            Path.j(androidPath, androidPath2);
            return;
        }
        gd1 gd1Var = this.t;
        ((PathMeasure) gd1Var.getValue()).b(androidPath2);
        float length = ((PathMeasure) gd1Var.getValue()).getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((PathMeasure) gd1Var.getValue()).a(f4, f5, androidPath);
        } else {
            ((PathMeasure) gd1Var.getValue()).a(f4, length, androidPath);
            ((PathMeasure) gd1Var.getValue()).a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, androidPath);
        }
    }

    public final String toString() {
        return this.r.toString();
    }

    public PathComponent() {
        int i = VectorKt.a;
        this.d = gg0.a;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.r = AndroidPath_androidKt.a();
        this.s = AndroidPath_androidKt.a();
        this.t = eu.v(pd1.c, PathComponent$pathMeasure$2.i);
        this.u = new PathParser();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        DrawScope drawScope2;
        Stroke stroke;
        drawScope.getClass();
        if (this.n) {
            PathParser pathParser = this.u;
            pathParser.a.clear();
            AndroidPath androidPath = this.r;
            androidPath.reset();
            List list = this.d;
            list.getClass();
            pathParser.a.addAll(list);
            pathParser.c(androidPath);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        Brush brush = this.b;
        AndroidPath androidPath2 = this.s;
        if (brush != null) {
            drawScope2 = drawScope;
            DrawScope.v(drawScope2, androidPath2, brush, this.c, null, 56);
        } else {
            drawScope2 = drawScope;
        }
        Brush brush2 = this.g;
        if (brush2 != null) {
            Stroke stroke2 = this.q;
            if (!this.o && stroke2 != null) {
                stroke = stroke2;
            } else {
                Stroke stroke3 = new Stroke(this.h, this.i, this.f, this.j, 16);
                this.q = stroke3;
                this.o = false;
                stroke = stroke3;
            }
            DrawScope.v(drawScope2, androidPath2, brush2, this.e, stroke, 48);
        }
    }
}
