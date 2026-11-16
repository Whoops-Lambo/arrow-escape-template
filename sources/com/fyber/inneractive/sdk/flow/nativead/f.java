package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {
    public static final String m = IAlog.a(f.class);
    public static final Object n = new Object();
    public final com.fyber.inneractive.sdk.response.nativead.i c;
    public t0 e;
    public d f;
    public final InneractiveAdRequest h;
    public final com.fyber.inneractive.sdk.config.global.r i;
    public final String j;
    public final com.fyber.inneractive.sdk.response.nativead.j k;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final e l = new e(this);

    /* JADX WARN: Code duplicated, block: B:128:0x0206  */
    public final void a() {
        boolean z;
        ArrayList arrayList;
        String str;
        float f;
        String strB;
        String strB2;
        synchronized (n) {
            try {
                if (!this.a.isEmpty()) {
                    Iterator it = this.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            if (!this.b.get() && !this.g.get()) {
                                z = false;
                                break;
                            }
                            break;
                        }
                        if (((c) it.next()).a()) {
                        }
                    }
                }
                z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        IAlog.c("%s : onResourceFinished", m);
        InneractiveAdRequest inneractiveAdRequest = this.h;
        x0 selectedUnitConfig = inneractiveAdRequest != null ? inneractiveAdRequest.getSelectedUnitConfig() : com.fyber.inneractive.sdk.config.a.a(this.k.m);
        com.fyber.inneractive.sdk.config.global.r rVar = this.i;
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        com.fyber.inneractive.sdk.response.nativead.i iVar = this.c;
        String str2 = q.a;
        ArrayList arrayList4 = new ArrayList();
        if (q.a(iVar.d) && (strB2 = q.b(iVar.d)) != null) {
            arrayList4.add(strB2);
        }
        ArrayList arrayList5 = iVar.e;
        if (arrayList5 != null) {
            ArrayList arrayList6 = new ArrayList();
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                com.fyber.inneractive.sdk.response.nativead.g gVar = (com.fyber.inneractive.sdk.response.nativead.g) obj;
                if (gVar != null && gVar.a == 1 && gVar.b == 2) {
                    arrayList6.add(gVar.c);
                }
            }
            int size2 = arrayList6.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList6.get(i2);
                i2++;
                String str3 = (String) obj2;
                if (q.a(str3) && (strB = q.b(str3)) != null) {
                    arrayList4.add(strB);
                }
            }
        }
        arrayList3.addAll(arrayList4);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = iVar.c;
        if (arrayList8 != null && !arrayList8.isEmpty()) {
            arrayList7.addAll(iVar.c);
        }
        ArrayList arrayList9 = iVar.e;
        if (arrayList9 != null) {
            ArrayList arrayList10 = new ArrayList();
            int size3 = arrayList9.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList9.get(i3);
                i3++;
                com.fyber.inneractive.sdk.response.nativead.g gVar2 = (com.fyber.inneractive.sdk.response.nativead.g) obj3;
                if (gVar2 != null && gVar2.a == 1 && gVar2.b == 1) {
                    arrayList10.add(gVar2.c);
                }
            }
            arrayList7.addAll(arrayList10);
        }
        arrayList2.addAll(arrayList7);
        t0 t0Var = this.e;
        ArrayList arrayList11 = this.d;
        com.fyber.inneractive.sdk.response.nativead.h hVar = this.c.b;
        i iVar2 = (hVar == null || (TextUtils.isEmpty(hVar.a) && TextUtils.isEmpty(hVar.c) && hVar.b.isEmpty())) ? null : new i(hVar.a, hVar.c, hVar.b);
        if (iVar2 != null) {
            map.put(NativeAdContent.ViewTag.ROOT, iVar2);
        }
        ArrayList arrayList12 = this.c.a;
        int size4 = arrayList12.size();
        Uri uri = null;
        String str4 = null;
        int i4 = 0;
        t0 t0Var2 = null;
        Float fA = null;
        Float f2 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        while (i4 < size4) {
            t0Var = t0Var;
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) arrayList12.get(i4);
            arrayList12 = arrayList12;
            com.fyber.inneractive.sdk.response.nativead.h hVar2 = fVar.f;
            i4++;
            i iVar3 = (hVar2 == null || (TextUtils.isEmpty(hVar2.a) && TextUtils.isEmpty(hVar2.c) && hVar2.b.isEmpty())) ? null : new i(hVar2.a, hVar2.c, hVar2.b);
            com.fyber.inneractive.sdk.response.nativead.d dVar = fVar.b;
            if (dVar == null || TextUtils.isEmpty(dVar.a)) {
                com.fyber.inneractive.sdk.response.nativead.b bVar = fVar.e;
                if (bVar == null || TextUtils.isEmpty(bVar.a)) {
                    int size5 = arrayList11.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size5) {
                            Object obj4 = arrayList11.get(i5);
                            i5++;
                            g gVar3 = (g) obj4;
                            if (gVar3 != null) {
                                int i6 = size5;
                                int i7 = gVar3.a;
                                arrayList = arrayList11;
                                if (i7 == fVar.a) {
                                    if (i7 == 2) {
                                        uri = gVar3.b;
                                        fA = com.fyber.inneractive.sdk.util.u.a(uri);
                                        if (iVar3 != null) {
                                            map.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar3);
                                        }
                                    } else if (i7 == 4) {
                                        Uri uri3 = gVar3.b;
                                        if (iVar3 != null) {
                                            map.put(NativeAdContent.ViewTag.AD_ICON, iVar3);
                                        }
                                        uri2 = uri3;
                                        arrayList11 = arrayList;
                                    }
                                }
                                size5 = i6;
                                arrayList11 = arrayList;
                            }
                        } else {
                            arrayList = arrayList11;
                            com.fyber.inneractive.sdk.response.nativead.e eVar = fVar.c;
                            if (eVar == null || TextUtils.isEmpty(eVar.a) || t0Var == null) {
                                IAlog.c("%s : handleAsset failed: %d: ", m, Integer.valueOf(fVar.a));
                            } else {
                                if (iVar3 != null) {
                                    map.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar3);
                                }
                                t0Var = t0Var;
                                t0Var2 = t0Var;
                            }
                            i4 = i4;
                            size4 = size4;
                            arrayList11 = arrayList;
                        }
                        t0Var = t0Var;
                        i4 = i4;
                        size4 = size4;
                        arrayList11 = arrayList;
                    }
                } else {
                    String str7 = fVar.e.a;
                    int i8 = fVar.a;
                    if (i8 == 5) {
                        str = NativeAdContent.ViewTag.AD_DESCRIPTION;
                        str5 = str7;
                    } else if (i8 == 6) {
                        if (TextUtils.isEmpty(str7)) {
                            f = -1.0f;
                        } else {
                            try {
                                f = Float.parseFloat(str7);
                            } catch (NumberFormatException unused) {
                                f = -1.0f;
                            }
                        }
                        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            Float fValueOf = Float.valueOf(f);
                            str = NativeAdContent.ViewTag.RATING;
                            f2 = fValueOf;
                        } else {
                            str = null;
                        }
                    } else if (i8 != 7) {
                        str = null;
                    } else {
                        str = NativeAdContent.ViewTag.CTA;
                        str4 = str7;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        map.put(str, iVar3);
                    }
                    arrayList12 = arrayList12;
                    t0Var = t0Var;
                    i4 = i4;
                    size4 = size4;
                }
            } else {
                String str8 = fVar.b.a;
                if (iVar3 != null) {
                    map.put(NativeAdContent.ViewTag.AD_TITLE, iVar3);
                }
                str6 = str8;
            }
        }
        w0 w0Var = new w0(selectedUnitConfig, rVar);
        w0Var.g = str6;
        w0Var.h = str5;
        w0Var.i = str4;
        w0Var.j = null;
        w0Var.k = null;
        w0Var.l = uri2;
        w0Var.m = uri;
        w0Var.o = f2;
        w0Var.p = fA;
        w0Var.s = t0Var2;
        w0Var.t.putAll(map);
        w0Var.u = new j((i) map.get(NativeAdContent.ViewTag.ROOT));
        w0Var.w.addAll(arrayList2);
        w0Var.x.addAll(arrayList3);
        map.clear();
        this.b.set(true);
        w0Var.b = this.k;
        d dVar2 = this.f;
        dVar2.c = w0Var;
        dVar2.f();
    }

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.i = rVar;
        this.k = jVar;
        this.h = inneractiveAdRequest;
        this.c = iVar;
        this.f = dVar;
        this.j = str;
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        String strConcat;
        if (str != null) {
            strConcat = "Failed to load native main media with message ".concat(str);
        } else {
            strConcat = "Failed to load native main media";
        }
        IAlog.f("%sonMainAssetLoadFailed: %s", m, strConcat);
        for (c cVar : this.a) {
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(strDescription));
            d dVar = this.f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.b, dVar.a, "send_failed_native_creatives", dVar.g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }
}
