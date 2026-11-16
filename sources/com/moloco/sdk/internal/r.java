package com.moloco.sdk.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.ecffri.arrows.R;
import com.facebook.internal.e1;
import com.moloco.sdk.internal.ortb.model.g1;
import com.moloco.sdk.internal.ortb.model.z0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import defpackage.a6;
import defpackage.as0;
import defpackage.bp0;
import defpackage.cm2;
import defpackage.cs0;
import defpackage.f93;
import defpackage.np1;
import defpackage.ou;
import defpackage.rd1;
import defpackage.s71;
import defpackage.sr0;
import defpackage.tr0;
import defpackage.wr0;
import defpackage.yx2;
import defpackage.zr0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class r {
    public static final cm2 a = new cm2(new f93(9));
    public static final long b = Color.d;
    public static final long c = k0.a;
    public static final long d = DpKt.b(30.0f, 30.0f);

    /* JADX WARN: Type inference failed for: r2v1, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h] */
    public static final e1 b(com.moloco.sdk.internal.ortb.model.d dVar, boolean z) {
        z0 z0Var;
        yx2 yx2Var;
        com.moloco.sdk.internal.ortb.model.l lVar = dVar.b;
        int i = lVar.a;
        com.moloco.sdk.internal.ortb.model.n0 n0Var = dVar.i;
        com.moloco.sdk.internal.ortb.model.h0 h0Var = dVar.j;
        int i2 = 0;
        final zr0 nVar = n0Var == null ? new n(z, lVar, h0Var) : new m(i2, lVar, dVar.m, h0Var);
        final long j = Color.b;
        ?? r2 = new tr0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h
            @Override // defpackage.tr0
            public final Object k0(Context context, Object obj, Integer num, Object obj2, Object obj3, sr0 sr0Var, Object obj4, Object obj5, Object obj6, Object obj7) {
                WebView webView = (WebView) obj;
                np1 np1Var = (np1) obj2;
                wr0 wr0Var = (wr0) obj3;
                sr0 sr0Var2 = (sr0) obj4;
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                webView.getClass();
                np1Var.getClass();
                wr0Var.getClass();
                sr0Var2.getClass();
                ComposeView composeView = new ComposeView(context);
                composeView.setId(R.id.moloco_fullscreen_ad_view_id);
                composeView.setContent(ComposableLambdaKt.c(553564605, new l(webView, np1Var, num.intValue(), wr0Var, sr0Var, sr0Var2, j, nVar, (t) obj5, (Dp) obj6, zBooleanValue, 1), true));
                return composeView;
            }
        };
        if (n0Var != null && (z0Var = n0Var.e) != null && (yx2Var = z0Var.a) != null) {
            i2 = yx2Var.a;
        }
        return new e1(i, r2, i2, new n(z, lVar, null), dVar.k, dVar.l);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q d(long j, long j2, long j3, g1 g1Var, Composer composer) {
        long jB;
        composer.B(129538364);
        as0 as0Var = ComposerKt.a;
        composer.B(-1579260747);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVarA = null;
        String lowerCase = null;
        if (g1Var != null) {
            String str = g1Var.c;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            boolean z = !s71.b(lowerCase, "right");
            Boolean bool = g1Var.b;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            String str2 = g1Var.a;
            if (str2 == null) {
                str2 = "play store";
            }
            Color color = g1Var.d;
            long j4 = color != null ? color.a : j3;
            Color color2 = g1Var.e;
            long j5 = color2 != null ? color2.a : j2;
            Integer num = g1Var.f;
            long jC = num != null ? TextUnitKt.c(num.intValue()) : TextUnit.c;
            Integer num2 = g1Var.g;
            if (num2 != null) {
                float fIntValue = num2.intValue();
                jB = DpKt.b(fIntValue, fIntValue);
            } else {
                jB = j;
            }
            qVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(str2, null, jB, null, j5, z, zBooleanValue, j4, jC, composer, 0, 10);
        }
        composer.J();
        if (qVarA == null) {
            qVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(PainterResources_androidKt.a(composer, R.drawable.moloco_skip), j, null, j2, composer, 0, 4);
        }
        composer.J();
        return qVarA;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s e(com.moloco.sdk.internal.ortb.model.d dVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar;
        z0 z0Var;
        yx2 yx2Var;
        boolean z2 = dVar.d.a;
        com.moloco.sdk.internal.ortb.model.l lVar = dVar.a;
        Boolean bool = lVar == null ? null : Boolean.TRUE;
        int i = 0;
        int i2 = lVar != null ? lVar.a : 0;
        com.moloco.sdk.internal.ortb.model.u uVar = dVar.g;
        int i3 = 1;
        boolean z3 = uVar != null && uVar.a && uVar.b;
        boolean z4 = uVar != null && uVar.a;
        com.moloco.sdk.internal.ortb.model.l lVar2 = dVar.b;
        int i4 = lVar2.a;
        com.moloco.sdk.internal.ortb.model.n0 n0Var = dVar.i;
        int i5 = (n0Var == null || (z0Var = n0Var.e) == null || (yx2Var = z0Var.a) == null) ? 0 : yx2Var.a;
        o oVar2 = new o(dVar, i);
        n nVar = new n(z, lVar2, dVar.j);
        o oVar3 = new o(dVar, i3);
        o oVar4 = new o(dVar, 2);
        a6 a6Var = new a6(i3, dVar, z);
        if (dVar.f) {
            cm2 cm2Var = z.a;
            oVar = null;
        } else {
            oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o) z.a.getValue();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s(z2, bool, i2, i4, i5, z3, z4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(0L, oVar2, nVar, oVar3, oVar4, a6Var, oVar, new o(dVar, 3), new o(dVar, 4), (zr0) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r) null, !z, 1537, (Object) null), dVar.k, dVar.l, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m g(com.moloco.sdk.internal.ortb.model.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        Integer num;
        boolean z;
        boolean z2;
        boolean z3;
        com.moloco.sdk.internal.ortb.model.n0 n0Var;
        int i;
        z0 z0Var;
        yx2 yx2Var;
        dVar.getClass();
        e1 e1VarB = b(dVar, true);
        com.moloco.sdk.internal.ortb.model.b bVar = dVar.d;
        final com.moloco.sdk.internal.ortb.model.f fVar = dVar.c;
        final com.moloco.sdk.internal.ortb.model.n nVar = dVar.h;
        final boolean z4 = dVar.f;
        final int iG = ColorKt.g(bVar.e);
        Color color = bVar.g;
        final Integer numValueOf = color != null ? Integer.valueOf(ColorKt.g(color.a)) : null;
        final int iF = f(bVar.c, bVar.d);
        final int i2 = bVar.b;
        yx2 yx2Var2 = bVar.f;
        final Integer numValueOf2 = yx2Var2 != null ? Integer.valueOf(yx2Var2.a) : null;
        final Integer numValueOf3 = fVar != null ? Integer.valueOf(ColorKt.g(fVar.d)) : null;
        final Integer numValueOf4 = fVar != null ? Integer.valueOf(f(fVar.b, fVar.c)) : null;
        Integer numValueOf5 = fVar != null ? Integer.valueOf(fVar.a) : null;
        Integer numValueOf6 = nVar != null ? Integer.valueOf(f(nVar.b, nVar.c)) : null;
        Integer numValueOf7 = nVar != null ? Integer.valueOf(nVar.a) : null;
        boolean z5 = bVar.a;
        final Integer num2 = numValueOf6;
        com.moloco.sdk.internal.ortb.model.l lVar = dVar.a;
        Boolean bool = lVar == null ? null : Boolean.TRUE;
        int i3 = lVar != null ? lVar.a : 0;
        com.moloco.sdk.internal.ortb.model.u uVar = dVar.g;
        if (uVar != null) {
            num = numValueOf7;
            z = true;
            if (uVar.a && uVar.b) {
                z2 = true;
            }
            if (uVar == null && uVar.a == z) {
                z3 = z;
            } else {
                z3 = false;
            }
            int i4 = dVar.b.a;
            n0Var = dVar.i;
            if (n0Var != null || (z0Var = n0Var.e) == null || (yx2Var = z0Var.a) == null) {
                i = 0;
            } else {
                i = yx2Var.a;
            }
            final Integer num3 = numValueOf5;
            final Integer num4 = num;
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s(z5, bool, i3, i4, i, z2, z3, new zr0() { // from class: com.moloco.sdk.internal.i
                @Override // defpackage.zr0
                public final Object invoke(Object obj, Object obj2) {
                    as0 as0Var;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar;
                    Context context = (Context) obj;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) obj2;
                    context.getClass();
                    tVar.getClass();
                    float f = context.getResources().getDisplayMetrics().density;
                    final int i5 = (int) (i2 * f);
                    Integer num5 = numValueOf2;
                    final int iIntValue = num5 != null ? (int) (num5.intValue() * f) : context.getResources().getDimensionPixelSize(R.dimen.moloco_banner_mute_button_size);
                    final int i6 = iG;
                    final int i7 = iF;
                    final Integer num6 = numValueOf;
                    as0 as0Var2 = new as0() { // from class: com.moloco.sdk.internal.j
                        @Override // defpackage.as0
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Context context2 = (Context) obj3;
                            bp0 bp0Var = (bp0) obj4;
                            bp0 bp0Var2 = (bp0) obj5;
                            context2.getClass();
                            bp0Var.getClass();
                            bp0Var2.getClass();
                            int i8 = iIntValue;
                            int iP = rd1.p(i8 * 0.6f);
                            Integer num7 = num6;
                            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n(context2, bp0Var, bp0Var2, i6, R.drawable.moloco_volume_off, R.drawable.moloco_volume_on, i8, iP, i7, i5, num7 != null ? num7.intValue() : context2.getColor(R.color.moloco_button_background));
                        }
                    };
                    if (fVar != null) {
                        final Integer num7 = numValueOf3;
                        final Integer num8 = numValueOf4;
                        final Integer num9 = num3;
                        as0Var = new as0() { // from class: com.moloco.sdk.internal.k
                            @Override // defpackage.as0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Context context2 = (Context) obj3;
                                bp0 bp0Var = (bp0) obj4;
                                bp0 bp0Var2 = (bp0) obj5;
                                context2.getClass();
                                bp0Var.getClass();
                                bp0Var2.getClass();
                                Integer num10 = num7;
                                num10.getClass();
                                int iIntValue2 = num10.intValue();
                                Integer num11 = num8;
                                num11.getClass();
                                int iIntValue3 = num11.intValue();
                                Integer num12 = num9;
                                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w(context2, bp0Var, bp0Var2, iIntValue2, iIntValue3, (int) ((num12 != null ? num12.intValue() : 0) * context2.getResources().getDisplayMetrics().density));
                            }
                        };
                    } else {
                        as0Var = p.b;
                    }
                    as0 as0Var3 = as0Var;
                    zr0 ouVar = nVar != null ? new ou(1, num2, num4) : q.b;
                    if (z4) {
                        cm2 cm2Var = z.a;
                        oVar = null;
                    } else {
                        oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o) z.a.getValue();
                    }
                    return (View) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((Lifecycle) null, -16777216, as0Var2, as0Var3, (as0) null, ouVar, (cs0) null, oVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r) null, false, (a1) null, (sr0) null, 3345, (Object) null).invoke(context, tVar);
                }
            }, dVar.k, dVar.l, kVar), e1VarB, e1VarB);
        }
        num = numValueOf7;
        z = true;
        z2 = false;
        if (uVar == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        int i5 = dVar.b.a;
        n0Var = dVar.i;
        if (n0Var != null) {
            i = 0;
        } else {
            i = 0;
        }
        final Integer num5 = numValueOf5;
        final Integer num6 = num;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s(z5, bool, i3, i5, i, z2, z3, new zr0() { // from class: com.moloco.sdk.internal.i
            @Override // defpackage.zr0
            public final Object invoke(Object obj, Object obj2) {
                as0 as0Var;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar;
                Context context = (Context) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) obj2;
                context.getClass();
                tVar.getClass();
                float f = context.getResources().getDisplayMetrics().density;
                final int i6 = (int) (i2 * f);
                Integer num7 = numValueOf2;
                final int iIntValue = num7 != null ? (int) (num7.intValue() * f) : context.getResources().getDimensionPixelSize(R.dimen.moloco_banner_mute_button_size);
                final int i7 = iG;
                final int i8 = iF;
                final Integer num8 = numValueOf;
                as0 as0Var2 = new as0() { // from class: com.moloco.sdk.internal.j
                    @Override // defpackage.as0
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        Context context2 = (Context) obj3;
                        bp0 bp0Var = (bp0) obj4;
                        bp0 bp0Var2 = (bp0) obj5;
                        context2.getClass();
                        bp0Var.getClass();
                        bp0Var2.getClass();
                        int i9 = iIntValue;
                        int iP = rd1.p(i9 * 0.6f);
                        Integer num9 = num8;
                        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n(context2, bp0Var, bp0Var2, i7, R.drawable.moloco_volume_off, R.drawable.moloco_volume_on, i9, iP, i8, i6, num9 != null ? num9.intValue() : context2.getColor(R.color.moloco_button_background));
                    }
                };
                if (fVar != null) {
                    final Integer num9 = numValueOf3;
                    final Integer num10 = numValueOf4;
                    final Integer num11 = num5;
                    as0Var = new as0() { // from class: com.moloco.sdk.internal.k
                        @Override // defpackage.as0
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Context context2 = (Context) obj3;
                            bp0 bp0Var = (bp0) obj4;
                            bp0 bp0Var2 = (bp0) obj5;
                            context2.getClass();
                            bp0Var.getClass();
                            bp0Var2.getClass();
                            Integer num12 = num9;
                            num12.getClass();
                            int iIntValue2 = num12.intValue();
                            Integer num13 = num10;
                            num13.getClass();
                            int iIntValue3 = num13.intValue();
                            Integer num14 = num11;
                            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w(context2, bp0Var, bp0Var2, iIntValue2, iIntValue3, (int) ((num14 != null ? num14.intValue() : 0) * context2.getResources().getDisplayMetrics().density));
                        }
                    };
                } else {
                    as0Var = p.b;
                }
                as0 as0Var3 = as0Var;
                zr0 ouVar = nVar != null ? new ou(1, num2, num6) : q.b;
                if (z4) {
                    cm2 cm2Var = z.a;
                    oVar = null;
                } else {
                    oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o) z.a.getValue();
                }
                return (View) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((Lifecycle) null, -16777216, as0Var2, as0Var3, (as0) null, ouVar, (cs0) null, oVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r) null, false, (a1) null, (sr0) null, 3345, (Object) null).invoke(context, tVar);
            }
        }, dVar.k, dVar.l, kVar), e1VarB, e1VarB);
    }

    public static final BiasAlignment a(com.moloco.sdk.internal.ortb.model.e1 e1Var, com.moloco.sdk.internal.ortb.model.o oVar) {
        e1Var.getClass();
        oVar.getClass();
        com.moloco.sdk.internal.ortb.model.o oVar2 = com.moloco.sdk.internal.ortb.model.o.b;
        BiasAlignment biasAlignment = Alignment.Companion.a;
        if (oVar == oVar2 && (e1Var == com.moloco.sdk.internal.ortb.model.e1.b || e1Var == com.moloco.sdk.internal.ortb.model.e1.e)) {
            return biasAlignment;
        }
        if (oVar == oVar2 && e1Var == com.moloco.sdk.internal.ortb.model.e1.c) {
            return Alignment.Companion.b;
        }
        if (oVar == oVar2 && (e1Var == com.moloco.sdk.internal.ortb.model.e1.d || e1Var == com.moloco.sdk.internal.ortb.model.e1.f)) {
            return Alignment.Companion.c;
        }
        com.moloco.sdk.internal.ortb.model.o oVar3 = com.moloco.sdk.internal.ortb.model.o.c;
        if (oVar == oVar3 && (e1Var == com.moloco.sdk.internal.ortb.model.e1.b || e1Var == com.moloco.sdk.internal.ortb.model.e1.e)) {
            return Alignment.Companion.d;
        }
        if (oVar == oVar3 && e1Var == com.moloco.sdk.internal.ortb.model.e1.c) {
            return Alignment.Companion.e;
        }
        if (oVar == oVar3 && (e1Var == com.moloco.sdk.internal.ortb.model.e1.d || e1Var == com.moloco.sdk.internal.ortb.model.e1.f)) {
            return Alignment.Companion.f;
        }
        com.moloco.sdk.internal.ortb.model.o oVar4 = com.moloco.sdk.internal.ortb.model.o.d;
        if (oVar == oVar4 && (e1Var == com.moloco.sdk.internal.ortb.model.e1.b || e1Var == com.moloco.sdk.internal.ortb.model.e1.e)) {
            return Alignment.Companion.g;
        }
        if (oVar == oVar4 && e1Var == com.moloco.sdk.internal.ortb.model.e1.c) {
            return Alignment.Companion.h;
        }
        if (oVar == oVar4 && (e1Var == com.moloco.sdk.internal.ortb.model.e1.d || e1Var == com.moloco.sdk.internal.ortb.model.e1.f)) {
            return Alignment.Companion.i;
        }
        return biasAlignment;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m c(com.moloco.sdk.internal.ortb.model.d dVar) {
        dVar.getClass();
        e1 e1VarB = b(dVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m(e(dVar, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k()), e1VarB, e1VarB);
    }

    public static final int f(com.moloco.sdk.internal.ortb.model.e1 e1Var, com.moloco.sdk.internal.ortb.model.o oVar) {
        int i;
        int i2;
        e1Var.getClass();
        oVar.getClass();
        int i3 = l.a[e1Var.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4 && i3 != 5) {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return 0;
                }
                i = 8388613;
            } else {
                i = 1;
            }
        } else {
            i = 8388611;
        }
        int i4 = l.b[oVar.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    i2 = 80;
                } else {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return 0;
                }
            } else {
                i2 = 16;
            }
        } else {
            i2 = 48;
        }
        return i | i2;
    }
}
