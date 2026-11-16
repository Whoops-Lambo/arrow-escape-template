package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import defpackage.h50;
import defpackage.nj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class WidgetGroup {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class MeasureResult {
    }

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup widgetGroup = (WidgetGroup) arrayList.get(i);
                if (this.e == widgetGroup.b) {
                    c(this.c, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(LinearSystem linearSystem, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) ((ConstraintWidget) arrayList.get(0)).V;
        linearSystem.t();
        constraintWidgetContainer.c(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConstraintWidget) arrayList.get(i2)).c(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.A0 > 0) {
            Chain.a(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.B0 > 0) {
            Chain.a(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i3);
            MeasureResult measureResult = new MeasureResult();
            new WeakReference(constraintWidget);
            LinearSystem.n(constraintWidget.J);
            LinearSystem.n(constraintWidget.K);
            LinearSystem.n(constraintWidget.L);
            LinearSystem.n(constraintWidget.M);
            LinearSystem.n(constraintWidget.N);
            this.d.add(measureResult);
        }
        if (i == 0) {
            iN = LinearSystem.n(constraintWidgetContainer.J);
            iN2 = LinearSystem.n(constraintWidgetContainer.L);
            linearSystem.t();
        } else {
            iN = LinearSystem.n(constraintWidgetContainer.K);
            iN2 = LinearSystem.n(constraintWidgetContainer.M);
            linearSystem.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, WidgetGroup widgetGroup) {
        int i2 = widgetGroup.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ConstraintWidget constraintWidget = (ConstraintWidget) obj;
            ArrayList arrayList2 = widgetGroup.a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
            if (i == 0) {
                constraintWidget.p0 = i2;
            } else {
                constraintWidget.q0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strL = nj.l(this.b, "] <", sb);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            StringBuilder sbQ = h50.q(strL, " ");
            sbQ.append(((ConstraintWidget) obj).j0);
            strL = sbQ.toString();
        }
        return strL.concat(" >");
    }
}
