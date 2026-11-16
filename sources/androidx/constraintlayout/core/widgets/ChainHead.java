package androidx.constraintlayout.core.widgets;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ChainHead {
    public final ConstraintWidget a;
    public ConstraintWidget b;
    public ConstraintWidget c;
    public ConstraintWidget d;
    public ConstraintWidget e;
    public ConstraintWidget f;
    public ConstraintWidget g;
    public ArrayList h;
    public int i;
    public int j;
    public float k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final int l;
    public final boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    public ChainHead(ConstraintWidget constraintWidget, int i, boolean z) {
        this.a = constraintWidget;
        this.l = i;
        this.m = z;
    }
}
