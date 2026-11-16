package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rd2 {
    public wx a = new e62();
    public wx b = new e62();
    public wx c = new e62();
    public wx d = new e62();
    public py e = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public py f = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public py g = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public py h = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public uf0 i;
    public uf0 j;
    public uf0 k;
    public uf0 l;

    public static qd2 a(Context context, int i, int i2, d0 d0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(r12.A);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            py pyVarC = c(typedArrayObtainStyledAttributes, 5, d0Var);
            py pyVarC2 = c(typedArrayObtainStyledAttributes, 8, pyVarC);
            py pyVarC3 = c(typedArrayObtainStyledAttributes, 9, pyVarC);
            py pyVarC4 = c(typedArrayObtainStyledAttributes, 7, pyVarC);
            py pyVarC5 = c(typedArrayObtainStyledAttributes, 6, pyVarC);
            qd2 qd2Var = new qd2();
            qd2Var.a = c71.f(i4);
            qd2Var.e = pyVarC2;
            qd2Var.b = c71.f(i5);
            qd2Var.f = pyVarC3;
            qd2Var.c = c71.f(i6);
            qd2Var.g = pyVarC4;
            qd2Var.d = c71.f(i7);
            qd2Var.h = pyVarC5;
            return qd2Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static qd2 b(Context context, AttributeSet attributeSet, int i, int i2) {
        d0 d0Var = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.u, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, d0Var);
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(uf0.class) && this.j.getClass().equals(uf0.class) && this.i.getClass().equals(uf0.class) && this.k.getClass().equals(uf0.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof e62) && (this.a instanceof e62) && (this.c instanceof e62) && (this.d instanceof e62));
    }

    public final qd2 e() {
        qd2 qd2Var = new qd2();
        qd2Var.a = this.a;
        qd2Var.b = this.b;
        qd2Var.c = this.c;
        qd2Var.d = this.d;
        qd2Var.e = this.e;
        qd2Var.f = this.f;
        qd2Var.g = this.g;
        qd2Var.h = this.h;
        qd2Var.i = this.i;
        qd2Var.j = this.j;
        qd2Var.k = this.k;
        qd2Var.l = this.l;
        return qd2Var;
    }

    public rd2() {
        int i = 0;
        this.i = new uf0(i);
        this.j = new uf0(i);
        this.k = new uf0(i);
        this.l = new uf0(i);
    }

    public static py c(TypedArray typedArray, int i, py pyVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new d0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new g42(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return pyVar;
    }
}
