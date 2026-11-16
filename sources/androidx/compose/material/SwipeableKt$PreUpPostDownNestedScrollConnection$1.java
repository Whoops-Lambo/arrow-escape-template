package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    public final /* synthetic */ SwipeableState a;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long c(int i, long j, long j2) {
        return i == 1 ? OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a.d(Offset.d(j2))) : Offset.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object d(long j, long j2, fy fyVar) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        if (fyVar instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) fyVar;
            int i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.u = i - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, fyVar);
            }
        } else {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, fyVar);
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.s;
        int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.u;
        if (i2 == 0) {
            wz2.a0(obj);
            float fD = Offset.d(OffsetKt.a(Velocity.a(j2), Velocity.b(j2)));
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.r = j2;
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.u = 1;
            Object objE = this.a.e(fD, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.r;
            wz2.a0(obj);
        }
        return new Velocity(j2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object e(long j, fy fyVar) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        if (fyVar instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) fyVar;
            int i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.u = i - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, fyVar);
            }
        } else {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, fyVar);
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.s;
        int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.u;
        if (i2 == 0) {
            wz2.a0(obj);
            float fD = Offset.d(OffsetKt.a(Velocity.a(j), Velocity.b(j)));
            if (fD < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                SwipeableState swipeableState = this.a;
                if (((Number) swipeableState.e.getA()).floatValue() > swipeableState.k) {
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.r = j;
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.u = 1;
                    Object objE = swipeableState.e(fD, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1);
                    dz dzVar = dz.a;
                    if (objE == dzVar) {
                        return dzVar;
                    }
                } else {
                    j = Velocity.b;
                }
            } else {
                j = Velocity.b;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.r;
            wz2.a0(obj);
        }
        return new Velocity(j);
    }

    public SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState swipeableState) {
        this.a = swipeableState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b(int i, long j) {
        float fD = Offset.d(j);
        if (fD < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i == 1) {
            return OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a.d(fD));
        }
        return Offset.b;
    }
}
