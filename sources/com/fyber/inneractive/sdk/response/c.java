package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.n;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.s0;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, w0 w0Var) {
        f fVar = (f) this.a;
        if (TextUtils.isEmpty(fVar.z) && w0Var != null) {
            fVar.z = w0Var.b;
        }
        if (str == null) {
            str = null;
        } else {
            s0 s0Var = s0.c;
            s0Var.getClass();
            int iIndexOf = str.indexOf(38);
            if (iIndexOf >= 0) {
                StringWriter stringWriter = new StringWriter((int) ((((double) str.length()) * 0.1d) + ((double) str.length())));
                try {
                    s0Var.a(stringWriter, str, iIndexOf);
                } catch (IOException unused) {
                }
                str = stringWriter.toString();
            }
        }
        int i = n.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String strB = o.b(property);
            if (!TextUtils.isEmpty(strB)) {
                str = strB;
            }
        }
        fVar.M = str;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        f fVar = new f();
        this.a = fVar;
        return fVar;
    }
}
