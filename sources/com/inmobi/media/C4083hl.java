package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cz;
import defpackage.du;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.lp1;
import defpackage.np1;
import defpackage.ol0;
import defpackage.qh1;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4083hl extends G2 {
    public final cz b;
    public final C4110il c;
    public final lp1 d;
    public final Z9 e;
    public final String f;
    public final C4250nl g;

    @Override // com.inmobi.media.G2
    public final void b() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.G2
    public final Object a(fy fyVar) throws Throwable {
        C3944cl c3944cl;
        List listS0;
        if (fyVar instanceof C3944cl) {
            c3944cl = (C3944cl) fyVar;
            int i = c3944cl.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3944cl.c = i - Integer.MIN_VALUE;
            } else {
                c3944cl = new C3944cl(this, fyVar);
            }
        } else {
            c3944cl = new C3944cl(this, fyVar);
        }
        Object obj = c3944cl.a;
        int i2 = c3944cl.c;
        if (i2 == 0) {
            wz2.a0(obj);
            Z9 z9 = this.e;
            if (z9 != null) {
                z9.a("StaticExperienceManager", "load Called - imageAssets count: " + this.c.a.size());
            }
            Map mapA = AbstractC4446um.a(this.c.b.a);
            C4111im c4111im = C4111im.a;
            C4111im.b("MainImageLoadStarted", mapA, EnumC4223mm.SDK);
            List list = this.c.a;
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Image image = (Image) obj2;
                if (URLUtil.isHttpUrl(image.getUrl()) || URLUtil.isHttpsUrl(image.getUrl())) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                Z9 z10 = this.e;
                if (z10 != null) {
                    z10.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                }
                LinkedHashMap linkedHashMapI0 = qh1.i0(AbstractC4446um.a(this.c.b.a));
                linkedHashMapI0.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2351);
                C4111im c4111im2 = C4111im.a;
                C4111im.b("MainImageLoadFailure", linkedHashMapI0, EnumC4223mm.SDK);
                throw new C3964dd();
            }
            if (arrayList.size() > 1) {
                int iA = Z5.a();
                int iOrdinal = Z4.a().ordinal();
                if (iOrdinal == 2) {
                    listS0 = arrayList;
                    listS0 = du.s0(arrayList, new C4166kl(iA));
                } else if (iOrdinal != 3) {
                    listS0 = arrayList;
                    listS0 = du.s0(arrayList, new C4194ll());
                } else if (iA > 720) {
                    listS0 = arrayList;
                    listS0 = du.s0(arrayList, new C4222ml());
                } else {
                    listS0 = arrayList;
                    listS0 = du.s0(arrayList, new C4138jl(iA));
                }
            }
            listS0 = arrayList;
            ImageView imageView = this.g;
            c3944cl.c = 1;
            Object objA = a(listS0, imageView, c3944cl);
            Object obj3 = dz.a;
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        Z9 z11 = this.e;
        if (z11 != null) {
            z11.a("StaticExperienceManager", "Static Load Success");
        }
        Map mapA2 = AbstractC4446um.a(this.c.b.a);
        C4111im c4111im3 = C4111im.a;
        C4111im.b("MainImageLoadSuccess", mapA2, EnumC4223mm.SDK);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4083hl(Context context, cz czVar, C4110il c4110il, lp1 lp1Var, Z9 z9) {
        super(context);
        context.getClass();
        czVar.getClass();
        c4110il.getClass();
        lp1Var.getClass();
        this.b = czVar;
        this.c = c4110il;
        this.d = lp1Var;
        this.e = z9;
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.f = "Static-Image-".concat(string);
        this.g = new C4250nl(context);
    }

    @Override // com.inmobi.media.G2
    public final void a(np1 np1Var) {
        np1Var.getClass();
    }

    @Override // com.inmobi.media.G2
    public final Object a(FrameLayout frameLayout, C4158kd c4158kd) throws Throwable {
        ba0 ba0Var = xc0.a;
        Object objE = tb5.E(wg1.a, new C3916bl(this, frameLayout, null), c4158kd);
        return objE == dz.a ? objE : az2.a;
    }

    @Override // com.inmobi.media.G2
    public final void a() {
        ViewParent parent = this.g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = Ug.a;
        Ug.b(this.a).cancelTag(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (defpackage.tb5.E(r11, r0, r7) == r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r14, android.widget.ImageView r15, defpackage.fy r16) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.inmobi.media.C3972dl
            if (r1 == 0) goto L16
            r1 = r0
            com.inmobi.media.dl r1 = (com.inmobi.media.C3972dl) r1
            int r3 = r1.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r1.f = r3
        L14:
            r7 = r1
            goto L1c
        L16:
            com.inmobi.media.dl r1 = new com.inmobi.media.dl
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.d
            int r1 = r7.f
            r8 = 2
            r3 = 1
            r9 = 0
            dz r10 = defpackage.dz.a
            if (r1 == 0) goto L44
            if (r1 == r3) goto L36
            if (r1 != r8) goto L30
            defpackage.wz2.a0(r0)
            goto La4
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r0)
            return r9
        L36:
            h32 r1 = r7.c
            android.widget.ImageView r3 = r7.b
            java.util.List r4 = r7.a
            defpackage.wz2.a0(r0)
            r12 = r3
            r3 = r1
            r1 = r4
            r4 = r12
            goto L87
        L44:
            defpackage.wz2.a0(r0)
            com.inmobi.media.Z9 r0 = r13.e
            if (r0 == 0) goto L67
            int r1 = r14.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadImagesIntoImageView - attempting to load "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " images"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "StaticExperienceManager"
            r0.a(r4, r1)
        L67:
            h32 r1 = new h32
            r1.<init>()
            ba0 r0 = defpackage.xc0.a
            cw0 r0 = defpackage.wg1.a
            com.inmobi.media.fl r4 = new com.inmobi.media.fl
            r4.<init>(r13, r9)
            r7.a = r14
            r7.b = r15
            r7.c = r1
            r7.f = r3
            java.lang.Object r0 = defpackage.tb5.E(r0, r4, r7)
            if (r0 != r10) goto L84
            goto La3
        L84:
            r4 = r15
            r3 = r1
            r1 = r14
        L87:
            r5 = r0
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            ba0 r0 = defpackage.xc0.a
            y80 r11 = defpackage.y80.c
            com.inmobi.media.el r0 = new com.inmobi.media.el
            r6 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a = r9
            r7.b = r9
            r7.c = r9
            r7.f = r8
            java.lang.Object r0 = defpackage.tb5.E(r11, r0, r7)
            if (r0 != r10) goto La4
        La3:
            return r10
        La4:
            az2 r0 = defpackage.az2.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4083hl.a(java.util.List, android.widget.ImageView, fy):java.lang.Object");
    }

    public final void a(ImageView imageView, Image image) {
        imageView.setOnClickListener(new ol0(9, this, image));
    }

    public static final void a(C4083hl c4083hl, Image image, View view) {
        Z9 z9 = c4083hl.e;
        if (z9 != null) {
            z9.a("StaticExperienceManager", "Static Click Event");
        }
        tb5.t(c4083hl.b, null, null, new C4055gl(image, c4083hl, null), 3);
    }
}
