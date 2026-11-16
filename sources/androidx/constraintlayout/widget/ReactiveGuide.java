package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {
    public int a;
    public int b;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public int getApplyToConstraintSetId() {
        return this.b;
    }

    public int getAttributeId() {
        return this.a;
    }

    public void setApplyToConstraintSetId(int i) {
        this.b = i;
    }

    public void setAttributeId(int i) {
        HashSet<WeakReference> hashSet;
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.a;
        if (i2 != -1 && (hashSet = (HashSet) sharedValues.a.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : hashSet) {
                SharedValues.SharedValuesListener sharedValuesListener = (SharedValues.SharedValuesListener) weakReference.get();
                if (sharedValuesListener == null || sharedValuesListener == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.a = i;
        if (i != -1) {
            HashMap map = sharedValues.a;
            HashSet hashSet2 = (HashSet) map.get(Integer.valueOf(i));
            if (hashSet2 == null) {
                hashSet2 = new HashSet();
                map.put(Integer.valueOf(i), hashSet2);
            }
            hashSet2.add(new WeakReference(this));
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.c = f;
        setLayoutParams(layoutParams);
    }
}
