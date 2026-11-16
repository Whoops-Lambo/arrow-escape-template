package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.dt1;
import defpackage.rx;
import io.p071bidmachine.t1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements j {
    public final l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str, byte[] bArr, rx rxVar, String str2) throws Throwable {
        str.getClass();
        rxVar.getClass();
        if (!t1.m(str)) {
            return;
        }
        try {
            dt1[] dt1VarArr = {new dt1("url", str), new dt1("body", bArr), new dt1("contentType", rxVar.toString()), new dt1("contentEncoding", str2)};
            Data.Builder builder = new Data.Builder();
            for (int i = 0; i < 4; i++) {
                dt1 dt1Var = dt1VarArr[i];
                builder.b((String) dt1Var.a, dt1Var.b);
            }
            Data dataA = builder.a();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to ".concat(str), null, false, 12, null);
            OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(UrlPostRequestWorker.class);
            Constraints.Builder builder3 = new Constraints.Builder();
            builder3.a = NetworkType.b;
            builder2.c.j = builder3.a();
            ((m) this.a).a.a((OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) builder2.d(BackoffPolicy.b, 10000L)).e(dataA)).a()).getClass();
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Failed to enqueue persistent request for url: ".concat(str), e, false, 8, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str) throws Throwable {
        Data dataA;
        str.getClass();
        if (t1.m(str)) {
            try {
                dt1[] dt1VarArr = {new dt1("url", str)};
                Data.Builder builder = new Data.Builder();
                dt1 dt1Var = dt1VarArr[0];
                builder.b((String) dt1Var.a, dt1Var.b);
                dataA = builder.a();
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", e.getMessage() + ". Url: " + str, null, false, 12, null);
                dataA = null;
            }
            if (dataA == null) {
                return;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to ".concat(str), null, false, 12, null);
            OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(UrlGetRequestWorker.class);
            Constraints.Builder builder3 = new Constraints.Builder();
            builder3.a = NetworkType.b;
            builder2.c.j = builder3.a();
            ((m) this.a).a.a((OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) builder2.d(BackoffPolicy.b, 10000L)).e(dataA)).a()).getClass();
        }
    }
}
