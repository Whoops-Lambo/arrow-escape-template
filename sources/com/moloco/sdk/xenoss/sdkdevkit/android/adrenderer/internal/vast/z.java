package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.util.Xml;
import defpackage.ba0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.i9;
import defpackage.nq2;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class z {
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[Catch: all -> 0x0028, TryCatch #2 {all -> 0x0028, blocks: (B:12:0x0024, B:25:0x0060, B:27:0x0064, B:28:0x006a), top: B:42:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:12:0x0024, B:25:0x0060, B:27:0x0064, B:28:0x006a), top: B:42:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, fy fyVar) {
        y yVar;
        StringReader stringReader;
        Throwable th;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0 d0Var;
        Object n0Var;
        if (fyVar instanceof y) {
            yVar = (y) fyVar;
            int i = yVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.u = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, fyVar);
            }
        } else {
            yVar = new y(this, fyVar);
        }
        Object obj = yVar.s;
        int i2 = yVar.u;
        dy dyVar = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                stringReader = yVar.r;
                try {
                    wz2.a0(obj);
                    d0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0) obj;
                    if (d0Var != null) {
                        n0Var = new com.moloco.sdk.internal.o0(d0Var);
                    } else {
                        n0Var = new com.moloco.sdk.internal.n0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.c);
                    }
                    nq2.e(stringReader, null);
                    return n0Var;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        nq2.e(stringReader, th);
                        throw th3;
                    }
                }
            }
            wz2.a0(obj);
            StringReader stringReader2 = new StringReader(str);
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                xmlPullParserNewPullParser.setInput(stringReader2);
                yVar.r = stringReader2;
                yVar.u = 1;
                ba0 ba0Var = xc0.a;
                Object objE = tb5.E(y80.c, new i9(xmlPullParserNewPullParser, dyVar, 20), yVar);
                dz dzVar = dz.a;
                if (objE == dzVar) {
                    return dzVar;
                }
                stringReader = stringReader2;
                obj = objE;
                d0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0) obj;
                if (d0Var != null) {
                    n0Var = new com.moloco.sdk.internal.o0(d0Var);
                } else {
                    n0Var = new com.moloco.sdk.internal.n0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.c);
                }
                nq2.e(stringReader, null);
                return n0Var;
            } catch (Throwable th4) {
                stringReader = stringReader2;
                th = th4;
                throw th;
            }
        } catch (Exception unused) {
            return new com.moloco.sdk.internal.n0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.b);
        }
    }
}
