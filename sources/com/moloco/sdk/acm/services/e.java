package com.moloco.sdk.acm.services;

import android.content.Context;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.compose.runtime.MutableState;
import com.facebook.internal.j0;
import com.facebook.login.p;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h;
import com.moloco.sdk.internal.ilrd.i;
import com.moloco.sdk.internal.ilrd.j;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.f0;
import com.moloco.sdk.internal.publisher.nativead.model.n;
import com.moloco.sdk.internal.publisher.p0;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v;
import defpackage.a50;
import defpackage.az2;
import defpackage.c91;
import defpackage.dk2;
import defpackage.ep0;
import defpackage.eu;
import defpackage.h42;
import defpackage.if2;
import defpackage.iu;
import defpackage.m32;
import defpackage.n30;
import defpackage.qh1;
import defpackage.qq0;
import defpackage.rh1;
import defpackage.sr0;
import defpackage.vq0;
import io.p071bidmachine.iab.mraid.MraidActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(v vVar, f fVar) {
        this.a = 15;
        this.b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [dy] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.sr0
    public final Object invoke() {
        String str;
        int i = this.a;
        h42 h42Var = if2.a;
        int i2 = 0;
        int i3 = 3;
        az2 az2Var = az2.a;
        String str2 = 0;
        str2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object systemService = ((Context) ((j0) obj).c).getSystemService("power");
                systemService.getClass();
                return (PowerManager) systemService;
            case 1:
                a50 a50Var = (a50) obj;
                try {
                    Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "debug.moloco.internal_logging");
                    objInvoke.getClass();
                    String str3 = (String) objInvoke;
                    try {
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                a50Var.b = Boolean.parseBoolean(str2);
                return az2Var;
            case 2:
                return Boolean.valueOf(((h) obj).a.k());
            case 3:
                i iVar = ((j) obj).b;
                return (iVar == null || (str = iVar.a) == null) ? n30.f() : str;
            case 4:
                return ((y) obj).d.d;
            case 5:
                String str4 = ((y) ((vq0) obj).b).c;
                if (str4 != null) {
                    return new f0(str4);
                }
                return null;
            case 6:
                n nVar = (n) obj;
                return qh1.b0(qh1.b0(qh1.b0(nVar.a, nVar.b), nVar.c), nVar.d);
            case 7:
                return Boolean.valueOf(((q) obj).a.getResources().getConfiguration().smallestScreenWidthDp >= 600);
            case 8:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f.d((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f) obj);
            case 9:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h) obj;
                return ep0.G(new qq0(hVar.g, hVar.e.h, new p0(i3, str2, i3)), hVar.d, h42Var, Boolean.FALSE);
            case 10:
                k kVar = (k) obj;
                return ep0.G(new qq0(kVar.m, kVar.k.l(), new p0(i3, str2, 4)), kVar.d, h42Var, Boolean.FALSE);
            case 11:
                m32 m32Var = (m32) obj;
                c91 c91Var = (c91) m32Var.a;
                if (c91Var != null) {
                    c91Var.cancel(null);
                }
                m32Var.a = null;
                return az2Var;
            case 12:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) obj;
                bVar.c = null;
                bVar.d = null;
                bVar.e = null;
                return az2Var;
            case 13:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a) obj;
                return ep0.G(new qq0(aVar.h, aVar.e.g, new p0(i3, str2, 5)), aVar.c, h42Var, Boolean.FALSE);
            case 14:
                Set set = (Set) ((p) obj).a;
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    iu.N(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a(), arrayList);
                }
                int iU = rh1.U(eu.f(arrayList, 10));
                if (iU < 16) {
                    iU = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    String str5 = (String) obj2;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : set) {
                        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj3).a().contains(str5)) {
                            arrayList2.add(obj3);
                        }
                    }
                    linkedHashMap.put(obj2, arrayList2);
                }
                return linkedHashMap;
            case 15:
                f fVar = (f) obj;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                if (fVar != null) {
                    for (List list : fVar.c) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj4 : list) {
                            String str6 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj4).d;
                            if (str6 == null || dk2.Z(str6)) {
                                arrayList10.add(obj4);
                            }
                        }
                        int size2 = arrayList10.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj5 = arrayList10.get(i4);
                            i4++;
                            m mVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj5).e;
                            if (mVar instanceof l) {
                                u uVar = ((l) mVar).a;
                                iu.N(uVar.d, arrayList3);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar2 = uVar.e;
                                if (aVar2 != null) {
                                    iu.N(aVar2.b, arrayList4);
                                    iu.N(aVar2.c, arrayList5);
                                }
                                iu.N(uVar.f, arrayList8);
                            } else {
                                if (!(mVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k)) {
                                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                                    return null;
                                }
                                iu.N(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) mVar).a, arrayList9);
                            }
                        }
                        arrayList6.add(arrayList8);
                        arrayList7.add(arrayList9);
                    }
                }
                return new g(arrayList3, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a(null, arrayList4, arrayList5), arrayList6, arrayList7);
            case 16:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f) obj;
                fVar2.j.b(fVar2.i);
                fVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a.a);
                return az2Var;
            case 17:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdWebViewRenderer", "Skip button shown callback triggered in MraidAdContainerScreen", null, false, 12, null);
                ((sr0) obj).invoke();
                return az2Var;
            case 18:
                Boolean bool = (Boolean) ((MutableState) obj).getA();
                bool.getClass();
                return bool;
            case 19:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j adShowListener = ((g1) obj).getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.c();
                }
                return az2Var;
            case 20:
                return "handleJsCommand - ".concat((String) obj);
            case 21:
                SparseArray sparseArray = MraidActivity.e;
                return "Exception during showing MraidActivity: " + ((Throwable) obj);
            default:
                SparseArray sparseArray2 = MraidActivity.e;
                return "Exception during showing MraidInterstitial in MraidActivity: " + ((Exception) obj);
        }
    }

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
