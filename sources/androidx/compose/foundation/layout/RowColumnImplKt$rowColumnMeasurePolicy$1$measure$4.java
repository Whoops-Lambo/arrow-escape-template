package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.cs0;
import defpackage.k32;
import defpackage.rc1;
import defpackage.wr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4 extends rc1 implements wr0 {
    public final /* synthetic */ List i;
    public final /* synthetic */ Placeable[] j;
    public final /* synthetic */ cs0 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ MeasureScope m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ LayoutOrientation o;
    public final /* synthetic */ RowColumnParentData[] p;
    public final /* synthetic */ CrossAxisAlignment q;
    public final /* synthetic */ int r;
    public final /* synthetic */ k32 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(List list, Placeable[] placeableArr, cs0 cs0Var, int i, MeasureScope measureScope, int[] iArr, LayoutOrientation layoutOrientation, RowColumnParentData[] rowColumnParentDataArr, CrossAxisAlignment crossAxisAlignment, int i2, k32 k32Var) {
        super(1);
        this.i = list;
        this.j = placeableArr;
        this.k = cs0Var;
        this.l = i;
        this.m = measureScope;
        this.n = iArr;
        this.o = layoutOrientation;
        this.p = rowColumnParentDataArr;
        this.q = crossAxisAlignment;
        this.r = i2;
        this.s = k32Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        LayoutOrientation layoutOrientation;
        LayoutOrientation layoutOrientation2;
        Placeable[] placeableArr;
        ((Placeable.PlacementScope) obj).getClass();
        int size = this.i.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        while (true) {
            layoutOrientation = LayoutOrientation.a;
            layoutOrientation2 = this.o;
            placeableArr = this.j;
            if (i2 >= size) {
                break;
            }
            Placeable placeable = placeableArr[i2];
            placeable.getClass();
            iArr[i2] = layoutOrientation2 == layoutOrientation ? placeable.a : placeable.b;
            i2++;
        }
        Integer numValueOf = Integer.valueOf(this.l);
        MeasureScope measureScope = this.m;
        LayoutDirection a = measureScope.getA();
        MeasureScope measureScope2 = this.m;
        cs0 cs0Var = this.k;
        int[] iArr2 = this.n;
        cs0Var.invoke(numValueOf, iArr, a, measureScope2, iArr2);
        int length = placeableArr.length;
        int i3 = 0;
        while (i < length) {
            Placeable placeable2 = placeableArr[i];
            int i4 = i3 + 1;
            placeable2.getClass();
            RowColumnParentData rowColumnParentData = this.p[i3];
            CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.c : null;
            if (crossAxisAlignment == null) {
                crossAxisAlignment = this.q;
            }
            int iA = crossAxisAlignment.a(this.r - (layoutOrientation2 == layoutOrientation ? placeable2.b : placeable2.a), layoutOrientation2 == layoutOrientation ? LayoutDirection.a : measureScope.getA(), placeable2, this.s.a);
            if (layoutOrientation2 == layoutOrientation) {
                Placeable.PlacementScope.c(placeable2, iArr2[i3], iA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                Placeable.PlacementScope.c(placeable2, iA, iArr2[i3], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            i++;
            i3 = i4;
        }
        return az2.a;
    }
}
