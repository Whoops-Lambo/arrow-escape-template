package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.er;
import defpackage.fq2;
import defpackage.fy;
import defpackage.j71;
import defpackage.n30;
import defpackage.wz2;
import defpackage.xa0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class xq {
    public static final xq a = new xq();
    public static final C4297pc b = new C4297pc();
    public static final C4339qq c;

    static {
        Context context = AbstractC4221mk.a;
        c = context != null ? new C4339qq(context, a()) : null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02c2 A[Catch: Exception -> 0x02f7, fq2 -> 0x02f9, TryCatch #25 {fq2 -> 0x02f9, Exception -> 0x02f7, blocks: (B:103:0x027e, B:119:0x02c2, B:121:0x02e3), top: B:182:0x0209 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x034b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0367  */
    /* JADX WARN: Code duplicated, block: B:171:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0 A[PHI: r1 r2 r3 r7 r10 r12 r13 r17 r18 r19 r20 r21
  0x00a0: PHI (r1v30 java.lang.Object) = (r1v4 java.lang.Object), (r1v38 java.lang.Object) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r2v16 ??) = (r2v4 ??), (r2v19 ??) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r3v24 java.lang.String) = (r3v4 java.lang.String), (r3v25 java.lang.String) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r7v8 java.util.Map) = (r7v2 java.util.Map), (r7v13 java.util.Map) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r10v14 ??) = (r10v4 ??), (r10v18 ??) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r12v12 java.lang.String) = (r12v3 java.lang.String), (r12v19 java.lang.String) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r13v8 ??) = (r13v15 ??), (r13v16 ??) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r17v7 java.lang.Object) = (r17v2 java.lang.Object), (r17v8 java.lang.Object) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r18v6 java.lang.Object) = (r18v1 java.lang.Object), (r18v10 java.lang.Object) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r19v6 java.lang.String) = (r19v1 java.lang.String), (r19v7 java.lang.String) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r20v4 java.lang.String) = (r20v1 java.lang.String), (r3v0 java.lang.String) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r21v6 java.lang.String) = (r21v1 java.lang.String), (r21v7 java.lang.String) binds: [B:26:0x0090, B:75:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x01dd A[Catch: fq2 -> 0x0236, Exception -> 0x0241, TryCatch #16 {fq2 -> 0x0236, blocks: (B:90:0x0223, B:91:0x022f, B:77:0x01d9, B:79:0x01dd, B:80:0x01ef), top: B:173:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:83:0x0207  */
    /* JADX WARN: Code duplicated, block: B:87:0x0211 A[Catch: Exception -> 0x02aa, fq2 -> 0x02b2, TRY_LEAVE, TryCatch #3 {Exception -> 0x02aa, blocks: (B:85:0x020b, B:87:0x0211, B:91:0x022f, B:97:0x024c), top: B:171:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0223 A[Catch: fq2 -> 0x0236, Exception -> 0x0241, TRY_ENTER, TRY_LEAVE, TryCatch #16 {fq2 -> 0x0236, blocks: (B:90:0x0223, B:91:0x022f, B:77:0x01d9, B:79:0x01dd, B:80:0x01ef), top: B:173:0x01d9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x02c2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x0223, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [long] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [long] */
    /* JADX WARN: Type inference failed for: r10v13, types: [long] */
    /* JADX WARN: Type inference failed for: r10v14, types: [long] */
    /* JADX WARN: Type inference failed for: r10v15, types: [long] */
    /* JADX WARN: Type inference failed for: r10v16, types: [long] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.inmobi.media.Y9] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.inmobi.media.Y9] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.inmobi.media.Y9] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v19, types: [long] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.inmobi.media.pc] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.inmobi.media.qq, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(String str, Y9 y9, fy fyVar) throws Throwable {
        uq uqVar;
        ?? r6;
        Object obj;
        Object obj2;
        ?? CurrentTimeMillis;
        Map map;
        Object obj3;
        String str2;
        Object objA;
        Object obj4;
        Object objM;
        Of of;
        String str3;
        ?? r10;
        ?? r8;
        ?? r7;
        Of of2;
        ?? r5;
        ?? r2 = y9;
        String mimeTypeFromExtension = "onFailedResponse: ";
        String str4 = "onSuccessfulResponse: ";
        if (fyVar instanceof uq) {
            uq uqVar2 = (uq) fyVar;
            int i = uqVar2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqVar2.i = i - Integer.MIN_VALUE;
                uqVar = uqVar2;
            } else {
                uqVar = new uq(this, fyVar);
            }
        } else {
            uqVar = new uq(this, fyVar);
        }
        Object obj5 = uqVar.g;
        ?? r9 = uqVar.i;
        ?? r13 = 1;
        String str5 = "WebResourceHandler";
        dz dzVar = dz.a;
        if (r9 != 0) {
            try {
                if (r9 == 1) {
                    long j = uqVar.f;
                    String str6 = uqVar.d;
                    map = uqVar.c;
                    Y9 y10 = uqVar.b;
                    String str7 = uqVar.a;
                    wz2.a0(obj5);
                    mimeTypeFromExtension = str6;
                    obj3 = "ResourceCacheMiss";
                    str4 = "networkType";
                    str2 = "latency";
                    objA = obj5;
                    CurrentTimeMillis = j;
                    r2 = y10;
                    obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                    r13 = str7;
                    try {
                        xa0 xa0Var = (xa0) objA;
                        try {
                            str5 = "WebResourceHandler";
                            try {
                                long jMax = ((long) Math.max(1, a().getMaxRetries())) * ((long) a().getTimeout());
                                try {
                                    wq wqVar = new wq(r2, r13, xa0Var, null);
                                    uqVar.a = r13;
                                    uqVar.b = r2;
                                    uqVar.c = map;
                                    uqVar.d = mimeTypeFromExtension;
                                    uqVar.f = CurrentTimeMillis;
                                    uqVar.i = 2;
                                    objM = ep0.M(jMax, wqVar, uqVar);
                                    r2 = r2;
                                    CurrentTimeMillis = CurrentTimeMillis;
                                    r13 = r13;
                                    obj4 = obj3;
                                    if (objM != dzVar) {
                                        r6 = map;
                                        of2 = (Of) objM;
                                        if (r2 != 0) {
                                            ((Z9) r2).c(str5, "Response received for url: " + r13);
                                        }
                                        r5 = b;
                                        uqVar.a = r13;
                                        uqVar.b = r2;
                                        uqVar.c = r6;
                                        uqVar.d = mimeTypeFromExtension;
                                        uqVar.e = of2;
                                        uqVar.f = CurrentTimeMillis;
                                        uqVar.i = 3;
                                        if (r5.a(r13, uqVar) != dzVar) {
                                            of = of2;
                                            str3 = mimeTypeFromExtension;
                                            r2 = r2;
                                            r6 = r6;
                                            obj = uqVar;
                                            CurrentTimeMillis = CurrentTimeMillis;
                                            r13 = r13;
                                            obj4 = obj4;
                                            if (of != null) {
                                                if (AbstractC4391sn.a(of)) {
                                                    if (r2 != 0) {
                                                        ((Z9) r2).c(str5, "onSuccessfulResponse: " + r13);
                                                    }
                                                    mimeTypeFromExtension = str2;
                                                    r6.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - CurrentTimeMillis)));
                                                    r6.put("size", new Long(((long) of.b().c) / 1024));
                                                    str4 = str4;
                                                    r6.put(str4, Y5.o());
                                                    C4111im c4111im = C4111im.a;
                                                    C4111im.b(obj4, r6, EnumC4223mm.SDK);
                                                    j71 j71Var = Tf.a;
                                                    return AbstractC4038g4.a(new ByteArrayInputStream(of.d().toByteArray()), str3);
                                                }
                                            }
                                            obj = obj4;
                                            str4 = str4;
                                            mimeTypeFromExtension = str2;
                                            if (r2 != 0) {
                                                ((Z9) r2).b(str5, mimeTypeFromExtension + r13 + " " + of);
                                            }
                                            obj2 = obj2;
                                            r6.put(obj2, new Short((short) 2194));
                                            r7 = r6;
                                            r8 = obj;
                                            r10 = CurrentTimeMillis;
                                        }
                                    }
                                    return dzVar;
                                } catch (fq2 e) {
                                    e = e;
                                    obj2 = obj2;
                                    obj = obj3;
                                    str4 = str4;
                                    mimeTypeFromExtension = str2;
                                    r6 = map;
                                    r6.put(obj2, new Short((short) 2193));
                                    r7 = r6;
                                    r8 = obj;
                                    r10 = CurrentTimeMillis;
                                    if (r2 != 0) {
                                        ((Z9) r2).a(str5, n30.y("Timeout occurred for url: ", r13), e);
                                        r7 = r6;
                                        r8 = obj;
                                        r10 = CurrentTimeMillis;
                                    }
                                    r7.put(str4, Y5.o());
                                    r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                                    C4111im c4111im2 = C4111im.a;
                                    C4111im.b(r8, r7, EnumC4223mm.SDK);
                                    return null;
                                } catch (Exception e2) {
                                    e = e2;
                                    obj2 = obj2;
                                    obj = obj3;
                                    str4 = str4;
                                    mimeTypeFromExtension = str2;
                                    r6 = map;
                                    r6.put(obj2, new Short((short) 2195));
                                    r7 = r6;
                                    r8 = obj;
                                    r10 = CurrentTimeMillis;
                                    if (r2 != 0) {
                                        ((Z9) r2).a(str5, n30.y("Unhandled exception occurred: ", e.getMessage()), e);
                                        r7 = r6;
                                        r8 = obj;
                                        r10 = CurrentTimeMillis;
                                    }
                                    r7.put(str4, Y5.o());
                                    r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                                    C4111im c4111im3 = C4111im.a;
                                    C4111im.b(r8, r7, EnumC4223mm.SDK);
                                    return null;
                                }
                            } catch (fq2 e3) {
                                e = e3;
                            } catch (Exception e4) {
                                e = e4;
                            }
                        } catch (fq2 e5) {
                            e = e5;
                            str5 = "WebResourceHandler";
                        } catch (Exception e6) {
                            e = e6;
                            str5 = "WebResourceHandler";
                        }
                    } catch (fq2 e7) {
                        e = e7;
                        str5 = "WebResourceHandler";
                    } catch (Exception e8) {
                        e = e8;
                        str5 = "WebResourceHandler";
                    }
                } else {
                    if (r9 == 2) {
                        long j2 = uqVar.f;
                        String str8 = uqVar.d;
                        map = uqVar.c;
                        Y9 y11 = uqVar.b;
                        String str9 = uqVar.a;
                        wz2.a0(obj5);
                        mimeTypeFromExtension = "onFailedResponse: ";
                        mimeTypeFromExtension = str8;
                        obj4 = "ResourceCacheMiss";
                        str4 = "networkType";
                        str2 = "latency";
                        str5 = "WebResourceHandler";
                        CurrentTimeMillis = j2;
                        r2 = y11;
                        objM = obj5;
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        r13 = str9;
                        r6 = map;
                        try {
                            try {
                                of2 = (Of) objM;
                                if (r2 != 0) {
                                    ((Z9) r2).c(str5, "Response received for url: " + r13);
                                }
                                r5 = b;
                                uqVar.a = r13;
                                uqVar.b = r2;
                                uqVar.c = r6;
                                uqVar.d = mimeTypeFromExtension;
                                uqVar.e = of2;
                                uqVar.f = CurrentTimeMillis;
                                uqVar.i = 3;
                                if (r5.a(r13, uqVar) != dzVar) {
                                    of = of2;
                                    str3 = mimeTypeFromExtension;
                                    r2 = r2;
                                    r6 = r6;
                                    obj = uqVar;
                                    CurrentTimeMillis = CurrentTimeMillis;
                                    r13 = r13;
                                    obj4 = obj4;
                                    if (of != null) {
                                        if (AbstractC4391sn.a(of)) {
                                            if (r2 != 0) {
                                                ((Z9) r2).c(str5, "onSuccessfulResponse: " + r13);
                                            }
                                            mimeTypeFromExtension = str2;
                                            r6.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - CurrentTimeMillis)));
                                            r6.put("size", new Long(((long) of.b().c) / 1024));
                                            str4 = str4;
                                            r6.put(str4, Y5.o());
                                            C4111im c4111im4 = C4111im.a;
                                            C4111im.b(obj4, r6, EnumC4223mm.SDK);
                                            j71 j71Var2 = Tf.a;
                                            return AbstractC4038g4.a(new ByteArrayInputStream(of.d().toByteArray()), str3);
                                        }
                                    }
                                    obj = obj4;
                                    str4 = str4;
                                    mimeTypeFromExtension = str2;
                                    if (r2 != 0) {
                                        ((Z9) r2).b(str5, mimeTypeFromExtension + r13 + " " + of);
                                    }
                                    obj2 = obj2;
                                    r6.put(obj2, new Short((short) 2194));
                                    r7 = r6;
                                    r8 = obj;
                                    r10 = CurrentTimeMillis;
                                }
                                return dzVar;
                            } catch (Exception e9) {
                                e = e9;
                                obj2 = obj2;
                                obj = obj4;
                                str4 = str4;
                                mimeTypeFromExtension = str2;
                                r6.put(obj2, new Short((short) 2195));
                                r7 = r6;
                                r8 = obj;
                                r10 = CurrentTimeMillis;
                                if (r2 != 0) {
                                    ((Z9) r2).a(str5, n30.y("Unhandled exception occurred: ", e.getMessage()), e);
                                    r7 = r6;
                                    r8 = obj;
                                    r10 = CurrentTimeMillis;
                                }
                                r7.put(str4, Y5.o());
                                r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                                C4111im c4111im5 = C4111im.a;
                                C4111im.b(r8, r7, EnumC4223mm.SDK);
                                return null;
                            }
                        } catch (fq2 e10) {
                            e = e10;
                            obj2 = obj2;
                            obj = obj4;
                            str4 = str4;
                            mimeTypeFromExtension = str2;
                            r6.put(obj2, new Short((short) 2193));
                            r7 = r6;
                            r8 = obj;
                            r10 = CurrentTimeMillis;
                            if (r2 != 0) {
                                ((Z9) r2).a(str5, n30.y("Timeout occurred for url: ", r13), e);
                                r7 = r6;
                                r8 = obj;
                                r10 = CurrentTimeMillis;
                            }
                            r7.put(str4, Y5.o());
                            r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                            C4111im c4111im6 = C4111im.a;
                            C4111im.b(r8, r7, EnumC4223mm.SDK);
                            return null;
                        }
                    }
                    if (r9 != 3) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = uqVar.f;
                    of = uqVar.e;
                    str3 = uqVar.d;
                    r6 = uqVar.c;
                    Y9 y12 = uqVar.b;
                    String str10 = uqVar.a;
                    try {
                        wz2.a0(obj5);
                        mimeTypeFromExtension = "onFailedResponse: ";
                        r13 = str10;
                        obj4 = "ResourceCacheMiss";
                        str4 = "networkType";
                        str2 = "latency";
                        str5 = "WebResourceHandler";
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        CurrentTimeMillis = j3;
                        r2 = y12;
                        r6 = r6;
                        obj = str10;
                        try {
                            if (of != null) {
                                try {
                                    try {
                                        if (AbstractC4391sn.a(of) && of.d().string(er.a).length() > 0) {
                                            if (r2 != 0) {
                                                ((Z9) r2).c(str5, "onSuccessfulResponse: " + r13);
                                            }
                                            mimeTypeFromExtension = str2;
                                            try {
                                                r6.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - CurrentTimeMillis)));
                                                r6.put("size", new Long(((long) of.b().c) / 1024));
                                                str4 = str4;
                                                try {
                                                    r6.put(str4, Y5.o());
                                                    C4111im c4111im7 = C4111im.a;
                                                    C4111im.b(obj4, r6, EnumC4223mm.SDK);
                                                    j71 j71Var3 = Tf.a;
                                                    return AbstractC4038g4.a(new ByteArrayInputStream(of.d().toByteArray()), str3);
                                                } catch (fq2 e11) {
                                                    e = e11;
                                                    obj = obj4;
                                                    obj2 = obj2;
                                                    r6.put(obj2, new Short((short) 2193));
                                                    r7 = r6;
                                                    r8 = obj;
                                                    r10 = CurrentTimeMillis;
                                                    if (r2 != 0) {
                                                        ((Z9) r2).a(str5, n30.y("Timeout occurred for url: ", r13), e);
                                                        r7 = r6;
                                                        r8 = obj;
                                                        r10 = CurrentTimeMillis;
                                                    }
                                                    r7.put(str4, Y5.o());
                                                    r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                                                    C4111im c4111im8 = C4111im.a;
                                                    C4111im.b(r8, r7, EnumC4223mm.SDK);
                                                    return null;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    obj = obj4;
                                                    obj2 = obj2;
                                                    r6.put(obj2, new Short((short) 2195));
                                                    r7 = r6;
                                                    r8 = obj;
                                                    r10 = CurrentTimeMillis;
                                                    if (r2 != 0) {
                                                        ((Z9) r2).a(str5, n30.y("Unhandled exception occurred: ", e.getMessage()), e);
                                                        r7 = r6;
                                                        r8 = obj;
                                                        r10 = CurrentTimeMillis;
                                                    }
                                                    r7.put(str4, Y5.o());
                                                    r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                                                    C4111im c4111im9 = C4111im.a;
                                                    C4111im.b(r8, r7, EnumC4223mm.SDK);
                                                    return null;
                                                }
                                            } catch (fq2 e13) {
                                                e = e13;
                                                obj = obj4;
                                                str4 = str4;
                                            } catch (Exception e14) {
                                                e = e14;
                                                obj = obj4;
                                                str4 = str4;
                                            }
                                        }
                                    } catch (fq2 e15) {
                                        e = e15;
                                        obj = obj4;
                                        str4 = str4;
                                        mimeTypeFromExtension = str2;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    obj = obj4;
                                    str4 = str4;
                                    mimeTypeFromExtension = str2;
                                }
                            }
                            obj = obj4;
                            str4 = str4;
                            mimeTypeFromExtension = str2;
                            if (r2 != 0) {
                                ((Z9) r2).b(str5, mimeTypeFromExtension + r13 + " " + of);
                            }
                            obj2 = obj2;
                            try {
                                r6.put(obj2, new Short((short) 2194));
                                r7 = r6;
                                r8 = obj;
                                r10 = CurrentTimeMillis;
                            } catch (fq2 e17) {
                                e = e17;
                                r6.put(obj2, new Short((short) 2193));
                                r7 = r6;
                                r8 = obj;
                                r10 = CurrentTimeMillis;
                                if (r2 != 0) {
                                    ((Z9) r2).a(str5, n30.y("Timeout occurred for url: ", r13), e);
                                    r7 = r6;
                                    r8 = obj;
                                    r10 = CurrentTimeMillis;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                r6.put(obj2, new Short((short) 2195));
                                r7 = r6;
                                r8 = obj;
                                r10 = CurrentTimeMillis;
                                if (r2 != 0) {
                                    ((Z9) r2).a(str5, n30.y("Unhandled exception occurred: ", e.getMessage()), e);
                                    r7 = r6;
                                    r8 = obj;
                                    r10 = CurrentTimeMillis;
                                }
                            }
                        } catch (fq2 e19) {
                            e = e19;
                        } catch (Exception e20) {
                            e = e20;
                        }
                    } catch (fq2 e21) {
                        e = e21;
                        r13 = str10;
                        obj = "ResourceCacheMiss";
                        str4 = "networkType";
                        mimeTypeFromExtension = "latency";
                        str5 = "WebResourceHandler";
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        CurrentTimeMillis = j3;
                        r2 = y12;
                        r6.put(obj2, new Short((short) 2193));
                        r7 = r6;
                        r8 = obj;
                        r10 = CurrentTimeMillis;
                        if (r2 != 0) {
                            ((Z9) r2).a(str5, n30.y("Timeout occurred for url: ", r13), e);
                            r7 = r6;
                            r8 = obj;
                            r10 = CurrentTimeMillis;
                        }
                        r7.put(str4, Y5.o());
                        r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                        C4111im c4111im10 = C4111im.a;
                        C4111im.b(r8, r7, EnumC4223mm.SDK);
                        return null;
                    } catch (Exception e22) {
                        e = e22;
                        obj = "ResourceCacheMiss";
                        str4 = "networkType";
                        mimeTypeFromExtension = "latency";
                        str5 = "WebResourceHandler";
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        CurrentTimeMillis = j3;
                        r2 = y12;
                        r6.put(obj2, new Short((short) 2195));
                        r7 = r6;
                        r8 = obj;
                        r10 = CurrentTimeMillis;
                        if (r2 != 0) {
                            ((Z9) r2).a(str5, n30.y("Unhandled exception occurred: ", e.getMessage()), e);
                            r7 = r6;
                            r8 = obj;
                            r10 = CurrentTimeMillis;
                        }
                        r7.put(str4, Y5.o());
                        r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                        C4111im c4111im11 = C4111im.a;
                        C4111im.b(r8, r7, EnumC4223mm.SDK);
                        return null;
                    }
                }
            } catch (fq2 e23) {
                e = e23;
                r6 = "mimeType is ";
                obj = "ResourceCacheMiss";
                str4 = "networkType";
                mimeTypeFromExtension = "latency";
                str5 = "WebResourceHandler";
                obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                CurrentTimeMillis = str;
                r2 = r9;
            } catch (Exception e24) {
                e = e24;
                r6 = "mimeType is ";
                obj = "ResourceCacheMiss";
                str4 = "networkType";
                mimeTypeFromExtension = "latency";
                str5 = "WebResourceHandler";
                obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                CurrentTimeMillis = str;
                r2 = r9;
            }
        } else {
            wz2.a0(obj5);
            ?? r11 = c;
            if (r11 == 0 || r11.a == null) {
                if (r2 == 0) {
                    return null;
                }
                ((Z9) r2).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + r11 + " for URL: " + str);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
            linkedHashMap.put("url", str);
            obj = "ResourceCacheMiss";
            str4 = "networkType";
            CurrentTimeMillis = System.currentTimeMillis();
            try {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                if (AbstractC4038g4.a(fileExtensionFromUrl)) {
                    str2 = "latency";
                    try {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    } catch (fq2 e25) {
                        e = e25;
                        mimeTypeFromExtension = str2;
                        r6 = linkedHashMap;
                        r13 = str;
                        r6.put(obj2, new Short((short) 2193));
                        r7 = r6;
                        r8 = obj;
                        r10 = CurrentTimeMillis;
                        if (r2 != 0) {
                            ((Z9) r2).a(str5, n30.y("Timeout occurred for url: ", r13), e);
                            r7 = r6;
                            r8 = obj;
                            r10 = CurrentTimeMillis;
                        }
                        r7.put(str4, Y5.o());
                        r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                        C4111im c4111im12 = C4111im.a;
                        C4111im.b(r8, r7, EnumC4223mm.SDK);
                        return null;
                    } catch (Exception e26) {
                        e = e26;
                        mimeTypeFromExtension = str2;
                        r6 = linkedHashMap;
                        r6.put(obj2, new Short((short) 2195));
                        r7 = r6;
                        r8 = obj;
                        r10 = CurrentTimeMillis;
                        if (r2 != 0) {
                            ((Z9) r2).a(str5, n30.y("Unhandled exception occurred: ", e.getMessage()), e);
                            r7 = r6;
                            r8 = obj;
                            r10 = CurrentTimeMillis;
                        }
                        r7.put(str4, Y5.o());
                        r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
                        C4111im c4111im13 = C4111im.a;
                        C4111im.b(r8, r7, EnumC4223mm.SDK);
                        return null;
                    }
                } else {
                    str2 = "latency";
                    mimeTypeFromExtension = null;
                }
                if (mimeTypeFromExtension == null || mimeTypeFromExtension.length() == 0) {
                    mimeTypeFromExtension = "text/html";
                }
                if (r2 != 0) {
                    ((Z9) r2).a("WebResourceHandler", "mimeType is " + mimeTypeFromExtension + " for " + ((String) str));
                }
                InputStream inputStreamA = r11.a(str, r2);
                if (inputStreamA != null) {
                    if (r2 != 0) {
                        ((Z9) r2).a("WebResourceHandler", "Found in cache: " + ((String) str));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("url", str);
                    C4111im c4111im14 = C4111im.a;
                    C4111im.b("ResourceCacheHit", linkedHashMap2, EnumC4223mm.SDK);
                    return AbstractC4038g4.a(inputStreamA, mimeTypeFromExtension);
                }
                C4297pc c4297pc = b;
                vq vqVar = new vq(str, r2, null);
                uqVar.a = str;
                uqVar.b = r2;
                uqVar.c = linkedHashMap;
                uqVar.d = mimeTypeFromExtension;
                uqVar.f = CurrentTimeMillis;
                uqVar.i = 1;
                objA = c4297pc.a(str, vqVar, uqVar);
                if (objA != dzVar) {
                    map = linkedHashMap;
                    r13 = str;
                    r2 = r2;
                    CurrentTimeMillis = CurrentTimeMillis;
                    obj3 = obj;
                    xa0 xa0Var2 = (xa0) objA;
                    str5 = "WebResourceHandler";
                    long jMax2 = ((long) Math.max(1, a().getMaxRetries())) * ((long) a().getTimeout());
                    wq wqVar2 = new wq(r2, r13, xa0Var2, null);
                    uqVar.a = r13;
                    uqVar.b = r2;
                    uqVar.c = map;
                    uqVar.d = mimeTypeFromExtension;
                    uqVar.f = CurrentTimeMillis;
                    uqVar.i = 2;
                    objM = ep0.M(jMax2, wqVar2, uqVar);
                    r2 = r2;
                    CurrentTimeMillis = CurrentTimeMillis;
                    r13 = r13;
                    obj4 = obj3;
                    if (objM != dzVar) {
                        r6 = map;
                        of2 = (Of) objM;
                        if (r2 != 0) {
                            ((Z9) r2).c(str5, "Response received for url: " + r13);
                        }
                        r5 = b;
                        uqVar.a = r13;
                        uqVar.b = r2;
                        uqVar.c = r6;
                        uqVar.d = mimeTypeFromExtension;
                        uqVar.e = of2;
                        uqVar.f = CurrentTimeMillis;
                        uqVar.i = 3;
                        if (r5.a(r13, uqVar) != dzVar) {
                            of = of2;
                            str3 = mimeTypeFromExtension;
                            r2 = r2;
                            r6 = r6;
                            obj = uqVar;
                            CurrentTimeMillis = CurrentTimeMillis;
                            r13 = r13;
                            obj4 = obj4;
                            if (of != null) {
                                if (AbstractC4391sn.a(of)) {
                                    if (r2 != 0) {
                                        ((Z9) r2).c(str5, "onSuccessfulResponse: " + r13);
                                    }
                                    mimeTypeFromExtension = str2;
                                    r6.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - CurrentTimeMillis)));
                                    r6.put("size", new Long(((long) of.b().c) / 1024));
                                    str4 = str4;
                                    r6.put(str4, Y5.o());
                                    C4111im c4111im15 = C4111im.a;
                                    C4111im.b(obj4, r6, EnumC4223mm.SDK);
                                    j71 j71Var4 = Tf.a;
                                    return AbstractC4038g4.a(new ByteArrayInputStream(of.d().toByteArray()), str3);
                                }
                            }
                            obj = obj4;
                            str4 = str4;
                            mimeTypeFromExtension = str2;
                            if (r2 != 0) {
                                ((Z9) r2).b(str5, mimeTypeFromExtension + r13 + " " + of);
                            }
                            obj2 = obj2;
                            r6.put(obj2, new Short((short) 2194));
                            r7 = r6;
                            r8 = obj;
                            r10 = CurrentTimeMillis;
                        }
                    }
                }
                return dzVar;
            } catch (fq2 e27) {
                e = e27;
                mimeTypeFromExtension = "latency";
            } catch (Exception e28) {
                e = e28;
                mimeTypeFromExtension = "latency";
            }
        }
        r7.put(str4, Y5.o());
        r7.put(mimeTypeFromExtension, new Long((long) (System.currentTimeMillis() - r10)));
        C4111im c4111im16 = C4111im.a;
        C4111im.b(r8, r7, EnumC4223mm.SDK);
        return null;
    }

    public static AdConfig.WebAssetCacheConfig a() {
        return ((AdConfig) AbstractC4563z4.a.a(AdConfig.class)).getWebAssetCache();
    }

    public static xa0 a(String str, Y9 y9) {
        if (y9 != null) {
            ((Z9) y9).c("WebResourceHandler", n30.y("downloadResourceFile(): ", str));
        }
        return ((C4044ga) If.d.getValue()).a(new Kf(str, null, new Bm(a().getTimeout(), a().getTimeout(), a().getTimeout()), null, new C3943ck(500L, a().getMaxRetries()), false, 42));
    }
}
