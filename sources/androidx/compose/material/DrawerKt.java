package androidx.compose.material;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.media3.common.C;
import defpackage.as0;
import defpackage.cg0;
import defpackage.dn;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DrawerKt {
    public static final TweenSpec a = new TweenSpec(256, (Easing) null, 6);

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:108:0x0184  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d A[DONT_INVERT] */
    public static final void a(as0 as0Var, Modifier modifier, DrawerState drawerState, boolean z, Shape shape, float f, long j, long j2, long j3, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        boolean z2;
        Shape shape2;
        float f2;
        long j4;
        long j5;
        int i4;
        int i5;
        int i6;
        Modifier modifier3;
        Object objB0;
        Modifier modifier4;
        RecomposeScopeImpl recomposeScopeImplT;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        as0Var.getClass();
        ComposerImpl composerImplT = composer.t(1305806945);
        if ((i & 14) == 0) {
            i3 = (composerImplT.l(as0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerImplT.l(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                drawerState2 = drawerState;
                if (composerImplT.l(drawerState2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i3 |= i14;
            } else {
                drawerState2 = drawerState;
            }
            if ((i & 7168) == 0) {
                z2 = z;
                if (composerImplT.m(z2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i3 |= i13;
            } else {
                z2 = z;
            }
            if ((57344 & i) == 0) {
                shape2 = shape;
                if (composerImplT.l(shape2)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((458752 & i) == 0) {
                f2 = f;
                if (composerImplT.n(f2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            } else {
                f2 = f;
            }
            if ((3670016 & i) == 0) {
                j4 = j;
                if (composerImplT.q(j4)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            } else {
                j4 = j;
            }
            if ((29360128 & i) == 0) {
                j5 = j2;
                if (composerImplT.q(j5)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            } else {
                j5 = j2;
            }
            i4 = i3;
            if ((234881024 & i) == 0) {
                if (composerImplT.q(j3)) {
                    i8 = C.BUFFER_FLAG_NOT_DEPENDED_ON;
                } else {
                    i8 = 33554432;
                }
                i5 = i4 | i8;
            } else {
                i5 = i4;
            }
            if ((1879048192 & i) != 0) {
                if (composerImplT.l(composableLambdaImpl)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i5 |= i7;
            }
            i6 = i5;
            if ((i6 & 1533916891) == 306783378 || !composerImplT.b()) {
                composerImplT.r0();
                if ((i & 1) != 0 || composerImplT.X()) {
                    if (i15 != 0) {
                        modifier3 = Modifier.Companion.a;
                    }
                    composerImplT.S();
                    composerImplT.B(773894976);
                    composerImplT.B(-492369756);
                    objB0 = composerImplT.b0();
                    if (objB0 == Composer.Companion.a) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.h(cg0.a, composerImplT));
                        composerImplT.C0(compositionScopedCoroutineScopeCanceller);
                        objB0 = compositionScopedCoroutineScopeCanceller;
                    }
                    composerImplT.R(false);
                    dn dnVar = ((CompositionScopedCoroutineScopeCanceller) objB0).a;
                    composerImplT.R(false);
                    BoxWithConstraintsKt.a(SizeKt.d(modifier3), null, ComposableLambdaKt.b(composerImplT, 816674999, new DrawerKt$ModalDrawer$1(drawerState2, z2, i6, j3, shape2, j4, j5, f2, composableLambdaImpl, dnVar, as0Var)), composerImplT, 3072);
                    modifier4 = modifier3;
                } else {
                    composerImplT.h();
                }
                modifier3 = modifier2;
                composerImplT.S();
                composerImplT.B(773894976);
                composerImplT.B(-492369756);
                objB0 = composerImplT.b0();
                if (objB0 == Composer.Companion.a) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.h(cg0.a, composerImplT));
                    composerImplT.C0(compositionScopedCoroutineScopeCanceller2);
                    objB0 = compositionScopedCoroutineScopeCanceller2;
                }
                composerImplT.R(false);
                dn dnVar2 = ((CompositionScopedCoroutineScopeCanceller) objB0).a;
                composerImplT.R(false);
                BoxWithConstraintsKt.a(SizeKt.d(modifier3), null, ComposableLambdaKt.b(composerImplT, 816674999, new DrawerKt$ModalDrawer$1(drawerState2, z2, i6, j3, shape2, j4, j5, f2, composableLambdaImpl, dnVar2, as0Var)), composerImplT, 3072);
                modifier4 = modifier3;
            } else {
                composerImplT.h();
                modifier4 = modifier2;
            }
            recomposeScopeImplT = composerImplT.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new DrawerKt$ModalDrawer$2(as0Var, modifier4, drawerState, z, shape, f, j, j2, j3, composableLambdaImpl, i, i2);
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            drawerState2 = drawerState;
            if (composerImplT.l(drawerState2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i3 |= i14;
        } else {
            drawerState2 = drawerState;
        }
        if ((i & 7168) == 0) {
            z2 = z;
            if (composerImplT.m(z2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i3 |= i13;
        } else {
            z2 = z;
        }
        if ((57344 & i) == 0) {
            shape2 = shape;
            if (composerImplT.l(shape2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        } else {
            shape2 = shape;
        }
        if ((458752 & i) == 0) {
            f2 = f;
            if (composerImplT.n(f2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        } else {
            f2 = f;
        }
        if ((3670016 & i) == 0) {
            j4 = j;
            if (composerImplT.q(j4)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        } else {
            j4 = j;
        }
        if ((29360128 & i) == 0) {
            j5 = j2;
            if (composerImplT.q(j5)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        } else {
            j5 = j2;
        }
        i4 = i3;
        if ((234881024 & i) == 0) {
            if (composerImplT.q(j3)) {
                i8 = C.BUFFER_FLAG_NOT_DEPENDED_ON;
            } else {
                i8 = 33554432;
            }
            i5 = i4 | i8;
        } else {
            i5 = i4;
        }
        if ((1879048192 & i) != 0) {
            if (composerImplT.l(composableLambdaImpl)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i5 |= i7;
        }
        i6 = i5;
        if ((i6 & 1533916891) == 306783378) {
            composerImplT.r0();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.Companion.a;
                } else {
                    modifier3 = modifier2;
                }
            } else if (i15 != 0) {
                modifier3 = Modifier.Companion.a;
            } else {
                modifier3 = modifier2;
            }
            composerImplT.S();
            composerImplT.B(773894976);
            composerImplT.B(-492369756);
            objB0 = composerImplT.b0();
            if (objB0 == Composer.Companion.a) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.h(cg0.a, composerImplT));
                composerImplT.C0(compositionScopedCoroutineScopeCanceller3);
                objB0 = compositionScopedCoroutineScopeCanceller3;
            }
            composerImplT.R(false);
            dn dnVar3 = ((CompositionScopedCoroutineScopeCanceller) objB0).a;
            composerImplT.R(false);
            BoxWithConstraintsKt.a(SizeKt.d(modifier3), null, ComposableLambdaKt.b(composerImplT, 816674999, new DrawerKt$ModalDrawer$1(drawerState2, z2, i6, j3, shape2, j4, j5, f2, composableLambdaImpl, dnVar3, as0Var)), composerImplT, 3072);
            modifier4 = modifier3;
        } else {
            composerImplT.r0();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.Companion.a;
                } else {
                    modifier3 = modifier2;
                }
            } else if (i15 != 0) {
                modifier3 = Modifier.Companion.a;
            } else {
                modifier3 = modifier2;
            }
            composerImplT.S();
            composerImplT.B(773894976);
            composerImplT.B(-492369756);
            objB0 = composerImplT.b0();
            if (objB0 == Composer.Companion.a) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.h(cg0.a, composerImplT));
                composerImplT.C0(compositionScopedCoroutineScopeCanceller4);
                objB0 = compositionScopedCoroutineScopeCanceller4;
            }
            composerImplT.R(false);
            dn dnVar4 = ((CompositionScopedCoroutineScopeCanceller) objB0).a;
            composerImplT.R(false);
            BoxWithConstraintsKt.a(SizeKt.d(modifier3), null, ComposableLambdaKt.b(composerImplT, 816674999, new DrawerKt$ModalDrawer$1(drawerState2, z2, i6, j3, shape2, j4, j5, f2, composableLambdaImpl, dnVar4, as0Var)), composerImplT, 3072);
            modifier4 = modifier3;
        }
        recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new DrawerKt$ModalDrawer$2(as0Var, modifier4, drawerState, z, shape, f, j, j2, j3, composableLambdaImpl, i, i2);
    }

    public static final void b(boolean z, sr0 sr0Var, sr0 sr0Var2, long j, Composer composer, int i) {
        int i2;
        Modifier modifierA;
        int i3;
        int i4;
        int i5;
        int i6;
        ComposerImpl composerImplT = composer.t(1983403750);
        if ((i & 14) == 0) {
            if (composerImplT.m(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.l(sr0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (composerImplT.l(sr0Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (composerImplT.q(j)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && composerImplT.b()) {
            composerImplT.h();
        } else {
            String strA = Strings_androidKt.a(composerImplT, 1);
            composerImplT.B(1010554047);
            Modifier.Companion companion = Modifier.Companion.a;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
            if (z) {
                composerImplT.B(1157296644);
                boolean zL = composerImplT.l(sr0Var);
                Object objB0 = composerImplT.b0();
                if (zL || objB0 == composer$Companion$Empty$1) {
                    objB0 = new DrawerKt$Scrim$dismissDrawer$1$1(sr0Var, null);
                    composerImplT.C0(objB0);
                }
                composerImplT.R(false);
                Modifier modifierA2 = SuspendingPointerInputFilterKt.a(companion, sr0Var, (zr0) objB0);
                composerImplT.B(511388516);
                boolean zL2 = composerImplT.l(strA) | composerImplT.l(sr0Var);
                Object objB1 = composerImplT.b0();
                if (zL2 || objB1 == composer$Companion$Empty$1) {
                    objB1 = new DrawerKt$Scrim$dismissDrawer$2$1(strA, sr0Var);
                    composerImplT.C0(objB1);
                }
                composerImplT.R(false);
                modifierA = SemanticsModifierKt.a(modifierA2, true, (wr0) objB1);
            } else {
                modifierA = companion;
            }
            composerImplT.R(false);
            FillModifier fillModifier = SizeKt.c;
            companion.N(fillModifier);
            Modifier modifierN = fillModifier.N(modifierA);
            Color color = new Color(j);
            composerImplT.B(511388516);
            boolean zL3 = composerImplT.l(color) | composerImplT.l(sr0Var2);
            Object objB2 = composerImplT.b0();
            if (zL3 || objB2 == composer$Companion$Empty$1) {
                objB2 = new DrawerKt$Scrim$1$1(j, sr0Var2);
                composerImplT.C0(objB2);
            }
            composerImplT.R(false);
            CanvasKt.a(modifierN, (wr0) objB2, composerImplT, 0);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new DrawerKt$Scrim$2(z, sr0Var, sr0Var2, j, i);
    }
}
