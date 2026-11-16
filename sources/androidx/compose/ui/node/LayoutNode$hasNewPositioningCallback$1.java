package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import defpackage.dt1;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "mod", "Landroidx/compose/ui/Modifier$Element;", "hasNewCallback", "invoke", "(Landroidx/compose/ui/Modifier$Element;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class LayoutNode$hasNewPositioningCallback$1 extends rc1 implements zr0 {
    public final /* synthetic */ MutableVector i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$hasNewPositioningCallback$1(MutableVector mutableVector) {
        super(2);
        this.i = mutableVector;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Modifier.Element element = (Modifier.Element) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        element.getClass();
        if (zBooleanValue) {
            z = true;
        } else {
            z = false;
            if (element instanceof OnGloballyPositionedModifier) {
                Object obj3 = null;
                MutableVector mutableVector = this.i;
                if (mutableVector != null) {
                    int i = mutableVector.c;
                    if (i > 0) {
                        Object[] objArr = mutableVector.a;
                        int i2 = 0;
                        do {
                            Object obj4 = objArr[i2];
                            if (element.equals(((dt1) obj4).b)) {
                                obj3 = obj4;
                                break;
                            }
                            i2++;
                        } while (i2 < i);
                    }
                    obj3 = (dt1) obj3;
                }
                if (obj3 == null) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
