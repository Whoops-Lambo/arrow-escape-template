package com.bytedance.adsdk.ugeno.yoga;

import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@com.bytedance.adsdk.ugeno.yoga.kgy.kgy
public abstract class YogaNodeJNIBase extends ra implements Cloneable {
    private YogaNodeJNIBase ahm;

    @com.bytedance.adsdk.ugeno.yoga.kgy.kgy
    private float[] arr;
    private ahm ct;
    protected long kgy;

    @com.bytedance.adsdk.ugeno.yoga.kgy.kgy
    private int mLayoutDirection;
    private Object noq;
    private List<YogaNodeJNIBase> rz;
    private yo uq;
    private boolean yo;

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(float f, float f2) {
        ahm((ra) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.rz;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.ahm(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].kgy;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.kgy, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @com.bytedance.adsdk.ugeno.yoga.kgy.kgy
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.rz;
        if (list == null) {
            e32.i("Cannot replace child. YogaNode does not have children");
            return 0L;
        }
        list.remove(i);
        this.rz.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.ahm = this;
        return yogaNodeJNIBase.kgy;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void ahm(kgy kgyVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.kgy, kgyVar.kgy());
    }

    public boolean at() {
        return this.uq != null;
    }

    @com.bytedance.adsdk.ugeno.yoga.kgy.kgy
    public final float baseline(float f, float f2) {
        return this.ct.kgy(this, f, f2);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void ct(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public float fi() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[1] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public float gf() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[2] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public float noq() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[3] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void nu(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void ra(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase kgy(int i) {
        List<YogaNodeJNIBase> list = this.rz;
        if (list != null) {
            return list.get(i);
        }
        e32.i("YogaNode does not have children");
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    /* JADX INFO: renamed from: uq, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase ahm(int i) {
        List<YogaNodeJNIBase> list = this.rz;
        if (list == null) {
            e32.i("Trying to remove a child of a YogaNode that does not have children");
            return null;
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i);
        yogaNodeJNIBaseRemove.ahm = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.kgy, yogaNodeJNIBaseRemove.kgy);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public float yo() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[4] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.yo = true;
        if (j != 0) {
            this.kgy = j;
        } else {
            e32.i("Failed to allocate native memory");
            throw null;
        }
    }

    @com.bytedance.adsdk.ugeno.yoga.kgy.kgy
    public final long measure(float f, int i, float f2, int i2) {
        if (at()) {
            return this.uq.kgy(this, f, fi.kgy(i), f2, fi.kgy(i2));
        }
        y.j("Measure function isn't defined!");
        return 0L;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void ct() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.kgy);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    /* JADX INFO: renamed from: nu, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase ahm() {
        return this.ahm;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public Object ra() {
        return this.noq;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void at(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void fi(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void gf(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void noq(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void yo(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.kgy, f);
    }

    private void ahm(ra raVar) {
        ra();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void ahm(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void ahm(uq uqVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.kgy, uqVar.kgy(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void rz(kgy kgyVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.kgy, kgyVar.kgy());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void rz(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void rz() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.kgy);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void rz(uq uqVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.kgy, uqVar.kgy(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void uq(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.kgy, f);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void uq() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.kgy);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public int kgy() {
        List<YogaNodeJNIBase> list = this.rz;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(ra raVar, int i) {
        if (raVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) raVar;
            if (yogaNodeJNIBase.ahm == null) {
                if (this.rz == null) {
                    this.rz = new ArrayList(4);
                }
                this.rz.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.ahm = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.kgy, yogaNodeJNIBase.kgy, i);
                return;
            }
            e32.i("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public int kgy(ra raVar) {
        List<YogaNodeJNIBase> list = this.rz;
        if (list == null) {
            return -1;
        }
        return list.indexOf(raVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(rz rzVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.kgy, rzVar.kgy());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(ct ctVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.kgy, ctVar.kgy());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(noq noqVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.kgy, noqVar.kgy());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(kgy kgyVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.kgy, kgyVar.kgy());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(twf twfVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.kgy, twfVar.kgy());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(kus kusVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.kgy, kusVar.kgy());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.kgy, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(uq uqVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.kgy, uqVar.kgy(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(yo yoVar) {
        this.uq = yoVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.kgy, yoVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(boolean z) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.kgy, z);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ra
    public void kgy(Object obj) {
        this.noq = obj;
    }
}
