package com.moloco.sdk.internal.services.events;

import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.b4;
import com.moloco.sdk.c4;
import com.moloco.sdk.d3;
import com.moloco.sdk.d4;
import com.moloco.sdk.e3;
import com.moloco.sdk.g3;
import com.moloco.sdk.h3;
import com.moloco.sdk.i3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.k0;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.internal.services.k;
import com.moloco.sdk.internal.services.l;
import com.moloco.sdk.internal.services.m;
import com.moloco.sdk.internal.services.n;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.j3;
import com.moloco.sdk.k3;
import com.moloco.sdk.l3;
import com.moloco.sdk.m3;
import com.moloco.sdk.n3;
import com.moloco.sdk.o3;
import com.moloco.sdk.p3;
import com.moloco.sdk.r3;
import com.moloco.sdk.t3;
import com.moloco.sdk.u3;
import com.moloco.sdk.v3;
import com.moloco.sdk.w3;
import com.moloco.sdk.x3;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h;
import com.moloco.sdk.y3;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public final s a;
    public final com.moloco.sdk.internal.services.c b;
    public final q c;
    public final com.moloco.sdk.internal.services.g d;
    public final com.moloco.sdk.internal.services.usertracker.c e;
    public final m f;
    public final com.moloco.sdk.internal.services.proto.a g;
    public final e h;

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:49:0x014b  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154  */
    /* JADX WARN: Code duplicated, block: B:53:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x019f  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0215  */
    /* JADX WARN: Code duplicated, block: B:65:0x0222  */
    /* JADX WARN: Code duplicated, block: B:67:0x022a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0230  */
    /* JADX WARN: Code duplicated, block: B:70:0x0238  */
    /* JADX WARN: Code duplicated, block: B:73:0x0283  */
    /* JADX WARN: Code duplicated, block: B:75:0x0287  */
    /* JADX WARN: Code duplicated, block: B:77:0x028b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x013b A[SYNTHETIC] */
    public final Object a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d dVar, fy fyVar) throws Throwable {
        a aVar;
        j3 j3VarM;
        j3 j3Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d dVar2;
        j3 j3Var2;
        c cVar;
        j3 j3Var3;
        k0 k0VarA;
        com.moloco.sdk.internal.services.f fVarA;
        n3 n3VarG;
        h hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar;
        ArrayList arrayList;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar2;
        l3 l3Var;
        com.facebook.appevents.h hVarA;
        w3 w3VarD;
        if (fyVar instanceof a) {
            aVar = (a) fyVar;
            int i = aVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.z = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, fyVar);
            }
        } else {
            aVar = new a(this, fyVar);
        }
        Object obj = aVar.x;
        int i2 = aVar.z;
        if (i2 == 0) {
            wz2.a0(obj);
            j3VarM = d4.m();
            if (this.h.a.b) {
                aVar.r = this;
                aVar.s = dVar;
                aVar.t = j3VarM;
                aVar.u = j3VarM;
                aVar.v = j3VarM;
                aVar.w = j;
                aVar.z = 1;
                Object objA = this.e.a(aVar);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
                dVar2 = dVar;
                j3Var2 = j3VarM;
                j3Var = j3Var2;
                obj = objA;
                cVar = this;
                j3Var3 = j3Var;
            } else {
                j3Var = j3VarM;
            }
            k0VarA = ((n) this.f).a();
            if (k0VarA instanceof k) {
                j3VarM.a(((k) k0VarA).a);
            } else if (!(k0VarA instanceof l)) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            j3VarM.f(j);
            u3 u3VarC = v3.c();
            u3VarC.a();
            j3VarM.k((v3) u3VarC.build());
            fVarA = this.d.a();
            if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f) {
                j3VarM.h((t3) t3.b().build());
            } else if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e) {
                n3VarG = o3.g();
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e) dVar;
                n3VarG.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d.c(eVar.b));
                b4 b4VarD = c4.d();
                b4VarD.b(fVarA.b);
                b4VarD.a(fVarA.d);
                GeneratedMessageLite generatedMessageLiteBuild = b4VarD.build();
                generatedMessageLiteBuild.getClass();
                n3VarG.c((c4) generatedMessageLiteBuild);
                hVar = eVar.d;
                if (hVar != null) {
                    b4 b4VarD2 = c4.d();
                    b4VarD2.b(hVar.a);
                    b4VarD2.a(hVar.b);
                    GeneratedMessageLite generatedMessageLiteBuild2 = b4VarD2.build();
                    generatedMessageLiteBuild2.getClass();
                    n3VarG.e((c4) generatedMessageLiteBuild2);
                }
                gVar = eVar.c;
                if (gVar != null) {
                    n3VarG.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d.c(gVar));
                }
                List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d> list = eVar.e;
                arrayList = new ArrayList(eu.f(list, 10));
                for (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar3 : list) {
                    k3 k3VarE = m3.e();
                    cVar2 = dVar3.a;
                    cVar2.getClass();
                    switch (d.a[cVar2.ordinal()]) {
                        case 1:
                            l3Var = l3.NONE;
                            break;
                        case 2:
                            l3Var = l3.CLOSE;
                            break;
                        case 3:
                            l3Var = l3.SKIP;
                            break;
                        case 4:
                            l3Var = l3.DEC_SKIP;
                            break;
                        case 5:
                            l3Var = l3.MUTE;
                            break;
                        case 6:
                            l3Var = l3.UNMUTE;
                            break;
                        case 7:
                            l3Var = l3.CTA;
                            break;
                        case 8:
                            l3Var = l3.REPLAY;
                            break;
                        case 9:
                            l3Var = l3.AD_BADGE;
                            break;
                        default:
                            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                            return null;
                    }
                    k3VarE.c(l3Var);
                    k3VarE.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d.c(dVar3.b));
                    h hVar2 = dVar3.c;
                    hVar2.getClass();
                    b4 b4VarD3 = c4.d();
                    b4VarD3.b(hVar2.a);
                    b4VarD3.a(hVar2.b);
                    GeneratedMessageLite generatedMessageLiteBuild3 = b4VarD3.build();
                    generatedMessageLiteBuild3.getClass();
                    k3VarE.b((c4) generatedMessageLiteBuild3);
                    arrayList.add((m3) k3VarE.build());
                }
                n3VarG.a(arrayList);
                j3VarM.e((o3) n3VarG.build());
            } else if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) {
                h3 h3VarC = i3.c();
                h3VarC.a(((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) dVar).b);
                j3VarM.d((i3) h3VarC.build());
            } else {
                if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return null;
                }
                j3VarM.c((g3) g3.b().build());
            }
            r rVarA = this.a.a();
            d3 d3VarD = e3.d();
            d3VarD.a(rVarA.b);
            d3VarD.b(rVarA.c);
            j3VarM.b((e3) d3VarD.build());
            b0 b0VarA = this.c.a();
            p3 p3VarF = r3.f();
            String str = Build.VERSION.RELEASE;
            p3VarF.c();
            p3VarF.a(b0VarA.b);
            p3VarF.b();
            p3VarF.d(b0VarA.h);
            j3VarM.g((r3) p3VarF.build());
            hVarA = this.b.a();
            w3VarD = y3.d();
            if (hVarA instanceof com.moloco.sdk.internal.services.a) {
                w3VarD.b(x3.CELLULAR);
                w3VarD.a(((com.moloco.sdk.internal.services.a) hVarA).b);
            } else if (hVarA.equals(com.moloco.sdk.internal.services.b.b)) {
                w3VarD.b(x3.UNKNOWN);
            } else {
                if (hVarA.equals(com.moloco.sdk.internal.services.b.c)) {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return null;
                }
                w3VarD.b(x3.WIFI);
            }
            j3VarM.j((y3) w3VarD.build());
            d4 d4Var = (d4) j3Var.build();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "CustomUserEventBuilderServiceImpl", "Encoding protobuf UserAdInteractionExt: " + d4Var, false, 4, null);
            com.moloco.sdk.internal.services.proto.a aVar2 = this.g;
            d4Var.getClass();
            aVar2.getClass();
            String strEncodeToString = Base64.encodeToString(d4Var.toByteArray(), 10);
            strEncodeToString.getClass();
            MolocoLogger.debug$default(molocoLogger, "CustomUserEventBuilderServiceImpl", "Successfully built userAdInteractionExt as base64 string: ".concat(strEncodeToString), false, 4, null);
            return strEncodeToString;
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = aVar.w;
        j3Var3 = aVar.v;
        j3Var2 = aVar.u;
        j3Var = aVar.t;
        dVar2 = aVar.s;
        cVar = aVar.r;
        wz2.a0(obj);
        j3Var3.i((String) obj);
        j3VarM = j3Var2;
        this = cVar;
        dVar = dVar2;
        k0VarA = ((n) this.f).a();
        if (k0VarA instanceof k) {
            j3VarM.a(((k) k0VarA).a);
        } else if (!(k0VarA instanceof l)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }
        j3VarM.f(j);
        u3 u3VarC2 = v3.c();
        u3VarC2.a();
        j3VarM.k((v3) u3VarC2.build());
        fVarA = this.d.a();
        if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f) {
            j3VarM.h((t3) t3.b().build());
        } else if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e) {
            n3VarG = o3.g();
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e) dVar;
            n3VarG.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d.c(eVar2.b));
            b4 b4VarD4 = c4.d();
            b4VarD4.b(fVarA.b);
            b4VarD4.a(fVarA.d);
            GeneratedMessageLite generatedMessageLiteBuild4 = b4VarD4.build();
            generatedMessageLiteBuild4.getClass();
            n3VarG.c((c4) generatedMessageLiteBuild4);
            hVar = eVar2.d;
            if (hVar != null) {
                b4 b4VarD5 = c4.d();
                b4VarD5.b(hVar.a);
                b4VarD5.a(hVar.b);
                GeneratedMessageLite generatedMessageLiteBuild5 = b4VarD5.build();
                generatedMessageLiteBuild5.getClass();
                n3VarG.e((c4) generatedMessageLiteBuild5);
            }
            gVar = eVar2.c;
            if (gVar != null) {
                n3VarG.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d.c(gVar));
            }
            List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d> list2 = eVar2.e;
            arrayList = new ArrayList(eu.f(list2, 10));
            while (r8.hasNext()) {
                k3 k3VarE2 = m3.e();
                cVar2 = dVar3.a;
                cVar2.getClass();
                switch (d.a[cVar2.ordinal()]) {
                    case 1:
                        l3Var = l3.NONE;
                        break;
                    case 2:
                        l3Var = l3.CLOSE;
                        break;
                    case 3:
                        l3Var = l3.SKIP;
                        break;
                    case 4:
                        l3Var = l3.DEC_SKIP;
                        break;
                    case 5:
                        l3Var = l3.MUTE;
                        break;
                    case 6:
                        l3Var = l3.UNMUTE;
                        break;
                    case 7:
                        l3Var = l3.CTA;
                        break;
                    case 8:
                        l3Var = l3.REPLAY;
                        break;
                    case 9:
                        l3Var = l3.AD_BADGE;
                        break;
                    default:
                        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                        return null;
                }
                k3VarE2.c(l3Var);
                k3VarE2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d.c(dVar3.b));
                h hVar3 = dVar3.c;
                hVar3.getClass();
                b4 b4VarD6 = c4.d();
                b4VarD6.b(hVar3.a);
                b4VarD6.a(hVar3.b);
                GeneratedMessageLite generatedMessageLiteBuild6 = b4VarD6.build();
                generatedMessageLiteBuild6.getClass();
                k3VarE2.b((c4) generatedMessageLiteBuild6);
                arrayList.add((m3) k3VarE2.build());
            }
            n3VarG.a(arrayList);
            j3VarM.e((o3) n3VarG.build());
        } else if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) {
            h3 h3VarC2 = i3.c();
            h3VarC2.a(((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) dVar).b);
            j3VarM.d((i3) h3VarC2.build());
        } else {
            if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            j3VarM.c((g3) g3.b().build());
        }
        r rVarA2 = this.a.a();
        d3 d3VarD2 = e3.d();
        d3VarD2.a(rVarA2.b);
        d3VarD2.b(rVarA2.c);
        j3VarM.b((e3) d3VarD2.build());
        b0 b0VarA2 = this.c.a();
        p3 p3VarF2 = r3.f();
        String str2 = Build.VERSION.RELEASE;
        p3VarF2.c();
        p3VarF2.a(b0VarA2.b);
        p3VarF2.b();
        p3VarF2.d(b0VarA2.h);
        j3VarM.g((r3) p3VarF2.build());
        hVarA = this.b.a();
        w3VarD = y3.d();
        if (hVarA instanceof com.moloco.sdk.internal.services.a) {
            w3VarD.b(x3.CELLULAR);
            w3VarD.a(((com.moloco.sdk.internal.services.a) hVarA).b);
        } else if (hVarA.equals(com.moloco.sdk.internal.services.b.b)) {
            w3VarD.b(x3.UNKNOWN);
        } else {
            if (hVarA.equals(com.moloco.sdk.internal.services.b.c)) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            w3VarD.b(x3.WIFI);
        }
        j3VarM.j((y3) w3VarD.build());
        d4 d4Var2 = (d4) j3Var.build();
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger2, "CustomUserEventBuilderServiceImpl", "Encoding protobuf UserAdInteractionExt: " + d4Var2, false, 4, null);
        com.moloco.sdk.internal.services.proto.a aVar3 = this.g;
        d4Var2.getClass();
        aVar3.getClass();
        String strEncodeToString2 = Base64.encodeToString(d4Var2.toByteArray(), 10);
        strEncodeToString2.getClass();
        MolocoLogger.debug$default(molocoLogger2, "CustomUserEventBuilderServiceImpl", "Successfully built userAdInteractionExt as base64 string: ".concat(strEncodeToString2), false, 4, null);
        return strEncodeToString2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d dVar, String str, fy fyVar) throws Throwable {
        b bVar;
        if (fyVar instanceof b) {
            bVar = (b) fyVar;
            int i = bVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.u = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, fyVar);
            }
        } else {
            bVar = new b(this, fyVar);
        }
        Object objA = bVar.s;
        int i2 = bVar.u;
        if (i2 == 0) {
            wz2.a0(objA);
            if (!this.h.a.a) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "CustomUserEventBuilderServiceImpl", "Event reporting config disabled, UserAdInteractionExt not reporting", false, 4, null);
                return str;
            }
            bVar.r = str;
            bVar.u = 1;
            objA = a(j, dVar, bVar);
            Object obj = dz.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = bVar.r;
            wz2.a0(objA);
        }
        String string = Uri.parse(str).buildUpon().appendQueryParameter("user_ad_interaction_ext", (String) objA).build().toString();
        string.getClass();
        return string;
    }

    public c(s sVar, com.moloco.sdk.internal.services.c cVar, q qVar, com.moloco.sdk.internal.services.g gVar, com.moloco.sdk.internal.services.usertracker.c cVar2, m mVar, com.moloco.sdk.internal.services.proto.a aVar, e eVar) {
        sVar.getClass();
        cVar.getClass();
        qVar.getClass();
        gVar.getClass();
        cVar2.getClass();
        mVar.getClass();
        aVar.getClass();
        eVar.getClass();
        this.a = sVar;
        this.b = cVar;
        this.c = qVar;
        this.d = gVar;
        this.e = cVar2;
        this.f = mVar;
        this.g = aVar;
        this.h = eVar;
    }
}
