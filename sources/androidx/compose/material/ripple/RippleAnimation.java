package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Offset;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gv;
import defpackage.kc2;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RippleAnimation {
    public Offset a;
    public final float b;
    public final boolean c;
    public Float d;
    public Float e;
    public Offset f;
    public final Animatable g = AnimatableKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final Animatable h = AnimatableKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final Animatable i = AnimatableKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final gv j = new gv();
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;

    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        Object objJ;
        if (fyVar instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) fyVar;
            int i = rippleAnimation$animate$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.u = i - Integer.MIN_VALUE;
            } else {
                rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, fyVar);
            }
        } else {
            rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, fyVar);
        }
        Object obj = rippleAnimation$animate$1.s;
        int i2 = rippleAnimation$animate$1.u;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(obj);
            rippleAnimation$animate$1.r = this;
            rippleAnimation$animate$1.u = 1;
            Object objJ2 = kc2.j(new RippleAnimation$fadeIn$2(this, null), rippleAnimation$animate$1);
            if (objJ2 != dzVar) {
                objJ2 = az2Var;
            }
            if (objJ2 != dzVar) {
            }
            return dzVar;
        }
        if (i2 == 1) {
            this = rippleAnimation$animate$1.r;
            wz2.a0(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    wz2.a0(obj);
                    return az2Var;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = rippleAnimation$animate$1.r;
            wz2.a0(obj);
        }
        rippleAnimation$animate$1.r = null;
        rippleAnimation$animate$1.u = 3;
        this.getClass();
        objJ = kc2.j(new RippleAnimation$fadeOut$2(this, null), rippleAnimation$animate$1);
        if (objJ != dzVar) {
            objJ = az2Var;
        }
        if (objJ != dzVar) {
            return dzVar;
        }
        return az2Var;
        this.k.setValue(Boolean.TRUE);
        gv gvVar = this.j;
        rippleAnimation$animate$1.r = this;
        rippleAnimation$animate$1.u = 2;
        if (gvVar.m(rippleAnimation$animate$1) != dzVar) {
            rippleAnimation$animate$1.r = null;
            rippleAnimation$animate$1.u = 3;
            this.getClass();
            objJ = kc2.j(new RippleAnimation$fadeOut$2(this, null), rippleAnimation$animate$1);
            if (objJ != dzVar) {
                objJ = az2Var;
            }
            if (objJ != dzVar) {
                return az2Var;
            }
        }
        return dzVar;
    }

    public RippleAnimation(Offset offset, float f, boolean z) {
        this.a = offset;
        this.b = f;
        this.c = z;
        Boolean bool = Boolean.FALSE;
        this.k = SnapshotStateKt.c(bool, StructuralEqualityPolicy.a);
        this.l = SnapshotStateKt.c(bool, StructuralEqualityPolicy.a);
    }
}
