package androidx.constraintlayout.helper.widget;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class CircularFlow extends VirtualLayout {
    public static int p;
    public static float q;
    public ConstraintLayout k;
    public float[] l;
    public int[] m;
    public int n;
    public int o;

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.o = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                o(str.substring(i).trim());
                return;
            } else {
                o(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.n = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                p(str.substring(i).trim());
                return;
            } else {
                p(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.l, this.o);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.m, this.n);
    }

    public final void o(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.c == null || (fArr = this.l) == null) {
            return;
        }
        if (this.o + 1 > fArr.length) {
            this.l = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.l[this.o] = Integer.parseInt(str);
        this.o++;
    }

    public final void p(String str) {
        int[] iArr;
        Context context = this.c;
        if (str == null || str.length() == 0 || context == null || (iArr = this.m) == null) {
            return;
        }
        if (this.n + 1 > iArr.length) {
            this.m = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.m[this.n] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.n++;
    }

    public void setDefaultAngle(float f) {
        q = f;
    }

    public void setDefaultRadius(int i) {
        p = i;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }
}
