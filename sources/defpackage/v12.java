package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.ecffri.arrows.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class v12 extends ConstraintLayout {
    public final ue0 s;
    public int t;
    public final pi1 u;

    public abstract void k();

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.u.k(ColorStateList.valueOf(i));
    }

    public v12(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        pi1 pi1Var = new pi1();
        this.u = pi1Var;
        g42 g42Var = new g42(0.5f);
        qd2 qd2VarE = pi1Var.a.a.e();
        qd2VarE.e = g42Var;
        qd2VarE.f = g42Var;
        qd2VarE.g = g42Var;
        qd2VarE.h = g42Var;
        pi1Var.setShapeAppearanceModel(qd2VarE.a());
        this.u.k(ColorStateList.valueOf(-1));
        pi1 pi1Var2 = this.u;
        WeakHashMap weakHashMap = ViewCompat.a;
        setBackground(pi1Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.y, R.attr.materialClockStyle, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.s = new ue0(this, 23);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = ViewCompat.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            ue0 ue0Var = this.s;
            handler.removeCallbacks(ue0Var);
            handler.post(ue0Var);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            ue0 ue0Var = this.s;
            handler.removeCallbacks(ue0Var);
            handler.post(ue0Var);
        }
    }
}
