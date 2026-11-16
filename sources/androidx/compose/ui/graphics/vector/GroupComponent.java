package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.gg0;
import defpackage.sr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GroupComponent extends VNode {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public List d;
    public boolean e;
    public AndroidPath f;
    public PathParser g;
    public sr0 h;
    public String i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;

    public final void e(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ((VNode) arrayList.get(i)).d(null);
                arrayList.remove(i);
            }
        }
        c();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        drawScope.getClass();
        if (this.q) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = Matrix.a();
                this.b = fArrA;
            } else {
                Matrix.d(fArrA);
            }
            Matrix.e(fArrA, this.o + this.k, this.p + this.l);
            double d = (((double) this.j) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f = fArrA[0];
            float f2 = fArrA[4];
            float f3 = (fSin * f2) + (fCos * f);
            float f4 = -fSin;
            float f5 = (f2 * fCos) + (f * f4);
            float f6 = fArrA[1];
            float f7 = fArrA[5];
            float f8 = (fSin * f7) + (fCos * f6);
            float f9 = (f7 * fCos) + (f6 * f4);
            float f10 = fArrA[2];
            float f11 = fArrA[6];
            float f12 = (fSin * f11) + (fCos * f10);
            float f13 = (f11 * fCos) + (f10 * f4);
            float f14 = fArrA[3];
            float f15 = fArrA[7];
            float f16 = (fSin * f15) + (fCos * f14);
            float f17 = (fCos * f15) + (f4 * f14);
            fArrA[0] = f3;
            fArrA[1] = f8;
            fArrA[2] = f12;
            fArrA[3] = f16;
            fArrA[4] = f5;
            fArrA[5] = f9;
            fArrA[6] = f13;
            fArrA[7] = f17;
            float f18 = this.m;
            float f19 = this.n;
            fArrA[0] = f3 * f18;
            fArrA[1] = f8 * f18;
            fArrA[2] = f12 * f18;
            fArrA[3] = f16 * f18;
            fArrA[4] = f5 * f19;
            fArrA[5] = f9 * f19;
            fArrA[6] = f13 * f19;
            fArrA[7] = f17 * f19;
            fArrA[8] = fArrA[8] * 1.0f;
            fArrA[9] = fArrA[9] * 1.0f;
            fArrA[10] = fArrA[10] * 1.0f;
            fArrA[11] = fArrA[11] * 1.0f;
            Matrix.e(fArrA, -this.k, -this.l);
            this.q = false;
        }
        if (this.e) {
            if (!this.d.isEmpty()) {
                PathParser pathParser = this.g;
                if (pathParser == null) {
                    pathParser = new PathParser();
                    this.g = pathParser;
                } else {
                    pathParser.a.clear();
                }
                AndroidPath androidPathA = this.f;
                if (androidPathA == null) {
                    androidPathA = AndroidPath_androidKt.a();
                    this.f = androidPathA;
                } else {
                    androidPathA.reset();
                }
                List list = this.d;
                list.getClass();
                pathParser.a.addAll(list);
                pathParser.c(androidPathA);
            }
            this.e = false;
        }
        CanvasDrawScope$drawContext$1 b = drawScope.getB();
        long jB = b.b();
        b.a().r();
        CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = b.a;
        float[] fArr = this.b;
        if (fArr != null) {
            canvasDrawScopeKt$asDrawTransform$1.getClass();
            canvasDrawScopeKt$asDrawTransform$1.a.a().s(fArr);
        }
        AndroidPath androidPath = this.f;
        if (!this.d.isEmpty() && androidPath != null) {
            canvasDrawScopeKt$asDrawTransform$1.getClass();
            canvasDrawScopeKt$asDrawTransform$1.a.a().f(androidPath);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((VNode) arrayList.get(i)).a(drawScope);
        }
        b.a().n();
        b.c(jB);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    /* JADX INFO: renamed from: b, reason: from getter */
    public final sr0 getH() {
        return this.h;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void d(sr0 sr0Var) {
        this.h = sr0Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((VNode) arrayList.get(i)).d(sr0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.i);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = (VNode) arrayList.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public GroupComponent() {
        int i = VectorKt.a;
        this.d = gg0.a;
        this.e = true;
        this.i = "";
        this.m = 1.0f;
        this.n = 1.0f;
        this.q = true;
    }
}
