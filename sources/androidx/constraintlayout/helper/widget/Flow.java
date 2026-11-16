package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class Flow extends VirtualLayout {
    public final androidx.constraintlayout.core.widgets.Flow k;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(ConstraintWidget constraintWidget, boolean z) {
        androidx.constraintlayout.core.widgets.Flow flow = this.k;
        int i = flow.v0;
        if (i > 0 || flow.w0 > 0) {
            if (z) {
                flow.x0 = flow.w0;
                flow.y0 = i;
            } else {
                flow.x0 = i;
                flow.y0 = flow.w0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        n(this.k, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.k.M0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.k.G0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.k.N0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.k.H0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.k.S0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.k.K0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.k.Q0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.k.E0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.k.O0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.k.I0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.k.P0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.k.J0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.k.V0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.k.W0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        androidx.constraintlayout.core.widgets.Flow flow = this.k;
        flow.t0 = i;
        flow.u0 = i;
        flow.v0 = i;
        flow.w0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.k.u0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.k.x0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.k.y0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.k.t0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.k.T0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.k.L0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.k.R0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.k.F0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.k.U0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.g = null;
        this.h = new HashMap();
        this.c = context;
        super.i(attributeSet);
        androidx.constraintlayout.core.widgets.Flow flow = new androidx.constraintlayout.core.widgets.Flow();
        flow.E0 = -1;
        flow.F0 = -1;
        flow.G0 = -1;
        flow.H0 = -1;
        flow.I0 = -1;
        flow.J0 = -1;
        flow.K0 = 0.5f;
        flow.L0 = 0.5f;
        flow.M0 = 0.5f;
        flow.N0 = 0.5f;
        flow.O0 = 0.5f;
        flow.P0 = 0.5f;
        flow.Q0 = 0;
        flow.R0 = 0;
        flow.S0 = 2;
        flow.T0 = 2;
        flow.U0 = 0;
        flow.V0 = -1;
        flow.W0 = 0;
        flow.X0 = new ArrayList();
        flow.Y0 = null;
        flow.Z0 = null;
        flow.a1 = null;
        flow.c1 = 0;
        this.k = flow;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.k.W0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    androidx.constraintlayout.core.widgets.Flow flow2 = this.k;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow2.t0 = dimensionPixelSize;
                    flow2.u0 = dimensionPixelSize;
                    flow2.v0 = dimensionPixelSize;
                    flow2.w0 = dimensionPixelSize;
                } else if (index == 18) {
                    androidx.constraintlayout.core.widgets.Flow flow3 = this.k;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow3.v0 = dimensionPixelSize2;
                    flow3.x0 = dimensionPixelSize2;
                    flow3.y0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.k.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.k.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.k.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.k.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.k.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.k.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.k.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.k.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.k.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.k.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.k.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.k.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.k.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.k.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.k.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.k.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.k.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.k.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.k.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.k.T0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.k.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.k.R0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.k.V0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.k;
        m();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void n(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (virtualLayout != null) {
            virtualLayout.T(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.A0, virtualLayout.B0);
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
