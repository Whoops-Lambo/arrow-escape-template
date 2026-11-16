package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.eu;
import defpackage.rd1;
import defpackage.wr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public final OverscrollConfiguration a;
    public final EdgeEffect b;
    public final EdgeEffect c;
    public final EdgeEffect d;
    public final EdgeEffect e;
    public final List f;
    public final EdgeEffect g;
    public final EdgeEffect h;
    public final EdgeEffect i;
    public final EdgeEffect j;
    public final ParcelableSnapshotMutableState k;
    public final boolean l;
    public boolean m;
    public long n;
    public final ParcelableSnapshotMutableState o;
    public boolean p;
    public final wr0 q;
    public final Modifier r;

    @Override // androidx.compose.foundation.OverscrollEffect
    public final void b(long j) {
        this.m = false;
        if (Velocity.a(j) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            EdgeEffectCompat.c(this.d, rd1.p(Velocity.a(j)));
        } else if (Velocity.a(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            EdgeEffectCompat.c(this.e, -rd1.p(Velocity.a(j)));
        }
        if (Velocity.b(j) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            EdgeEffectCompat.c(this.b, rd1.p(Velocity.b(j)));
        } else if (Velocity.b(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            EdgeEffectCompat.c(this.c, -rd1.p(Velocity.b(j)));
        }
        if (j != Velocity.b) {
            k();
        }
        g();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final void f(long j, long j2, Offset offset, int i) {
        boolean z;
        boolean zIsFinished;
        if (i == 1) {
            long jB = offset != null ? offset.a : SizeKt.b(this.n);
            if (Offset.c(j2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                m(j2, jB);
            } else if (Offset.c(j2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                n(j2, jB);
            }
            if (Offset.d(j2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                o(j2, jB);
            } else if (Offset.d(j2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                l(j2, jB);
            }
            z = !Offset.a(j2, Offset.b);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect.isFinished() || Offset.c(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            zIsFinished = false;
        } else {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        }
        EdgeEffect edgeEffect2 = this.e;
        if (!edgeEffect2.isFinished() && Offset.c(j) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            edgeEffect2.onRelease();
            zIsFinished = zIsFinished || edgeEffect2.isFinished();
        }
        EdgeEffect edgeEffect3 = this.b;
        if (!edgeEffect3.isFinished() && Offset.d(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            edgeEffect3.onRelease();
            zIsFinished = zIsFinished || edgeEffect3.isFinished();
        }
        EdgeEffect edgeEffect4 = this.c;
        if (!edgeEffect4.isFinished() && Offset.d(j) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            edgeEffect4.onRelease();
            zIsFinished = zIsFinished || edgeEffect4.isFinished();
        }
        if (zIsFinished || z) {
            k();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean a() {
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (EdgeEffectCompat.b((EdgeEffect) list.get(i)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Modifier getR() {
        return this.r;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    @Override // androidx.compose.foundation.OverscrollEffect
    public final long e(long j, Offset offset) {
        float fO;
        float fM;
        boolean z = this.m;
        EdgeEffect edgeEffect = this.c;
        EdgeEffect edgeEffect2 = this.b;
        EdgeEffect edgeEffect3 = this.e;
        EdgeEffect edgeEffect4 = this.d;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
            long jB = SizeKt.b(this.n);
            if (EdgeEffectCompat.b(edgeEffect4) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                m(Offset.b, jB);
            }
            if (EdgeEffectCompat.b(edgeEffect3) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                n(Offset.b, jB);
            }
            if (EdgeEffectCompat.b(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                o(Offset.b, jB);
            }
            if (EdgeEffectCompat.b(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                l(Offset.b, jB);
            }
            this.m = true;
        }
        long jB2 = offset != null ? offset.a : SizeKt.b(this.n);
        if (Offset.d(j) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fO = 0.0f;
        } else if (EdgeEffectCompat.b(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fO = o(j, jB2);
            if (EdgeEffectCompat.b(edgeEffect2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                edgeEffect2.onRelease();
            }
        } else if (EdgeEffectCompat.b(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fO = 0.0f;
        } else {
            fO = l(j, jB2);
            if (EdgeEffectCompat.b(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                edgeEffect.onRelease();
            }
        }
        if (Offset.c(j) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (EdgeEffectCompat.b(edgeEffect4) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fM = m(j, jB2);
                if (EdgeEffectCompat.b(edgeEffect4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    edgeEffect4.onRelease();
                }
            } else if (EdgeEffectCompat.b(edgeEffect3) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fM = n(j, jB2);
                if (EdgeEffectCompat.b(edgeEffect3) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    edgeEffect3.onRelease();
                }
            }
            f = fM;
        }
        long jA = OffsetKt.a(f, fO);
        if (!Offset.a(jA, Offset.b)) {
            k();
        }
        return jA;
    }

    public final void g() {
        List list = this.f;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            k();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: isEnabled */
    public final boolean getA() {
        return ((Boolean) this.o.getA()).booleanValue();
    }

    public final void k() {
        if (this.l) {
            this.k.setValue(az2.a);
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final void setEnabled(boolean z) {
        boolean z2 = this.p != z;
        this.o.setValue(Boolean.valueOf(z));
        this.p = z;
        if (z2) {
            this.m = false;
            g();
        }
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        context.getClass();
        this.a = overscrollConfiguration;
        EdgeEffect edgeEffectA = EdgeEffectCompat.a(context);
        this.b = edgeEffectA;
        EdgeEffect edgeEffectA2 = EdgeEffectCompat.a(context);
        this.c = edgeEffectA2;
        EdgeEffect edgeEffectA3 = EdgeEffectCompat.a(context);
        this.d = edgeEffectA3;
        EdgeEffect edgeEffectA4 = EdgeEffectCompat.a(context);
        this.e = edgeEffectA4;
        List listZ = eu.z(edgeEffectA3, edgeEffectA, edgeEffectA4, edgeEffectA2);
        this.f = listZ;
        this.g = EdgeEffectCompat.a(context);
        this.h = EdgeEffectCompat.a(context);
        this.i = EdgeEffectCompat.a(context);
        this.j = EdgeEffectCompat.a(context);
        int size = listZ.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) listZ.get(i)).setColor(ColorKt.g(this.a.a));
        }
        this.k = SnapshotStateKt.c(az2.a, SnapshotStateKt.e());
        this.l = true;
        this.n = Size.b;
        this.o = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        Modifier modifier = AndroidOverscrollKt.b;
        modifier.getClass();
        this.r = OnRemeasuredModifierKt.a(modifier, androidEdgeEffectOverscrollEffect$onNewSize$1).N(new DrawOverscrollModifier(this, InspectableValueKt.a()));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // androidx.compose.foundation.OverscrollEffect
    public final Velocity d(long j) {
        float fA;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        float fA2 = Velocity.a(j);
        float fB = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (fA2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            EdgeEffect edgeEffect3 = this.d;
            if (EdgeEffectCompat.b(edgeEffect3) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                EdgeEffectCompat.c(edgeEffect3, rd1.p(Velocity.a(j)));
                fA = Velocity.a(j);
            } else if (Velocity.a(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                edgeEffect = this.e;
                if (EdgeEffectCompat.b(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffectCompat.c(edgeEffect, -rd1.p(Velocity.a(j)));
                    fA = Velocity.a(j);
                } else {
                    fA = 0.0f;
                }
            } else {
                fA = 0.0f;
            }
        } else if (Velocity.a(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            edgeEffect = this.e;
            if (EdgeEffectCompat.b(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                EdgeEffectCompat.c(edgeEffect, -rd1.p(Velocity.a(j)));
                fA = Velocity.a(j);
            } else {
                fA = 0.0f;
            }
        } else {
            fA = 0.0f;
        }
        if (Velocity.b(j) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            EdgeEffect edgeEffect4 = this.b;
            if (EdgeEffectCompat.b(edgeEffect4) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                EdgeEffectCompat.c(edgeEffect4, rd1.p(Velocity.b(j)));
                fB = Velocity.b(j);
            } else if (Velocity.b(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                edgeEffect2 = this.c;
                if (EdgeEffectCompat.b(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffectCompat.c(edgeEffect2, -rd1.p(Velocity.b(j)));
                    fB = Velocity.b(j);
                }
            }
        } else if (Velocity.b(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            edgeEffect2 = this.c;
            if (EdgeEffectCompat.b(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                EdgeEffectCompat.c(edgeEffect2, -rd1.p(Velocity.b(j)));
                fB = Velocity.b(j);
            }
        }
        long jA = VelocityKt.a(fA, fB);
        if (jA != Velocity.b) {
            k();
        }
        return new Velocity(jA);
    }

    public final boolean h(LayoutNodeDrawScope layoutNodeDrawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.d(this.n), (-Size.b(this.n)) + layoutNodeDrawScope.mo7toPx0680j_4(this.a.b.d));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean i(LayoutNodeDrawScope layoutNodeDrawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.b(this.n), layoutNodeDrawScope.mo7toPx0680j_4(this.a.b.b(layoutNodeDrawScope.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean j(LayoutNodeDrawScope layoutNodeDrawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iP = rd1.p(Size.d(this.n));
        float fC = this.a.b.c(layoutNodeDrawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, layoutNodeDrawScope.mo7toPx0680j_4(fC) + (-iP));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final float l(long j, long j2) {
        float fC = Offset.c(j2) / Size.d(this.n);
        return Size.b(this.n) * (-EdgeEffectCompat.d(this.c, -(Offset.d(j) / Size.b(this.n)), 1.0f - fC));
    }

    public final float m(long j, long j2) {
        float fD = Offset.d(j2) / Size.b(this.n);
        return Size.d(this.n) * EdgeEffectCompat.d(this.d, Offset.c(j) / Size.d(this.n), 1.0f - fD);
    }

    public final float n(long j, long j2) {
        return Size.d(this.n) * (-EdgeEffectCompat.d(this.e, -(Offset.c(j) / Size.d(this.n)), Offset.d(j2) / Size.b(this.n)));
    }

    public final float o(long j, long j2) {
        float fC = Offset.c(j2) / Size.d(this.n);
        return Size.b(this.n) * EdgeEffectCompat.d(this.b, Offset.d(j) / Size.b(this.n), fC);
    }
}
