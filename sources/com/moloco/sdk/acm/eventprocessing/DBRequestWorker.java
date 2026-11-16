package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.facebook.appevents.n;
import com.facebook.login.p;
import com.ironsource.R6;
import com.moloco.sdk.acm.db.MetricsDb;
import com.moloco.sdk.acm.db.i;
import defpackage.az2;
import defpackage.cm2;
import defpackage.dt1;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.k52;
import defpackage.qh1;
import defpackage.tw0;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.zx0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
public final class DBRequestWorker extends CoroutineWorker {
    public final String a;
    public final i b;
    public final String c;
    public final com.moloco.sdk.acm.http.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.moloco.sdk.acm.http.a] */
    public DBRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = "DBRequestWorker";
        this.b = MetricsDb.a.a(context).c();
        this.c = getInputData().b("url");
        Map mapY = qh1.Y(new dt1("AppKey", getInputData().b("AppKey")), new dt1("AppBundle", getInputData().b("AppBundle")), new dt1("AppVersion", getInputData().b("AppVersion")), new dt1("OS", getInputData().b("OS")), new dt1(R6.G, getInputData().b(R6.G)), new dt1("SdkVersion", getInputData().b("SdkVersion")), new dt1("Mediator", getInputData().b("Mediator")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapY.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        final String str = (String) linkedHashMap.get("SdkVersion");
        final String str2 = (String) linkedHashMap.get(R6.G);
        final String str3 = (String) linkedHashMap.get("AppKey");
        final String str4 = (String) linkedHashMap.get("AppBundle");
        final String str5 = (String) linkedHashMap.get("AppVersion");
        final String str6 = (String) linkedHashMap.get("Mediator");
        this.d = new wr0() { // from class: com.moloco.sdk.acm.http.a
            @Override // defpackage.wr0
            public final Object invoke(Object obj) {
                tw0 tw0Var = (tw0) obj;
                tw0Var.getClass();
                StringBuilder sb = new StringBuilder();
                String str7 = str4;
                if (str7 != null) {
                    sb.append("AppBundle/" + str7 + ';');
                }
                String str8 = str5;
                if (str8 != null) {
                    sb.append("AppVersion/" + str8 + ';');
                }
                String str9 = str3;
                if (str9 != null) {
                    sb.append("AppKey/" + str9 + ';');
                }
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                String str10 = str;
                if (str10 != null) {
                    sb2.append("SdkVersion/" + str10 + ';');
                }
                String str11 = str6;
                if (str11 != null) {
                    sb2.append("Mediator/" + str11 + ';');
                }
                String string2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder("OS/Android;");
                String str12 = str2;
                if (str12 != null) {
                    sb3.append("osv/" + str12 + ';');
                }
                String string3 = sb3.toString();
                tw0Var.j("X-Moloco-App-Info", string);
                tw0Var.j("X-Moloco-Device-Info", string3);
                tw0Var.j("X-Moloco-SDK-Info", string2);
                return az2.a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(dy dyVar) {
        a aVar;
        if (dyVar instanceof a) {
            aVar = (a) dyVar;
            int i = aVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.u = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (fy) dyVar);
            }
        } else {
            aVar = new a(this, (fy) dyVar);
        }
        Object obj = aVar.s;
        int i2 = aVar.u;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                String str = this.c;
                if (str != null) {
                    zx0 zx0Var = com.moloco.sdk.acm.http.b.a;
                    zx0 zx0Var2 = (zx0) com.moloco.sdk.acm.http.c.a.getValue();
                    zx0Var2.getClass();
                    if (com.moloco.sdk.acm.http.b.a == null) {
                        com.moloco.sdk.acm.http.b.a = zx0Var2;
                        com.moloco.sdk.acm.http.b.b = str;
                    }
                    com.moloco.sdk.acm.http.f fVar = (com.moloco.sdk.acm.http.f) com.moloco.sdk.acm.http.b.c.getValue();
                    i iVar = this.b;
                    new n(new n(9));
                    com.moloco.sdk.acm.http.a aVar2 = this.d;
                    fVar.getClass();
                    iVar.getClass();
                    aVar2.getClass();
                    p pVar = new p();
                    pVar.a = fVar;
                    pVar.b = iVar;
                    pVar.c = aVar2;
                    aVar.r = this;
                    aVar.u = 1;
                    Object objM = pVar.M(aVar);
                    dz dzVar = dz.a;
                    if (objM == dzVar) {
                        return dzVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                DBRequestWorker dBRequestWorker = aVar.r;
                wz2.a0(obj);
                ((k52) obj).getClass();
            }
            return ListenableWorker.Result.a();
        } catch (Exception e) {
            cm2 cm2Var = com.moloco.sdk.acm.services.d.a;
            com.moloco.sdk.acm.services.d.c(this.a, "Work Manager failure: " + e.getMessage(), null, 12);
            return new ListenableWorker.Result.Failure();
        }
    }
}
