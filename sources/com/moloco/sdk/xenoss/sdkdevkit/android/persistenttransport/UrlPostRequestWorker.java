package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.d02;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fy;
import defpackage.l7;
import defpackage.p32;
import defpackage.rx;
import defpackage.wz2;
import defpackage.zx0;
import io.p071bidmachine.t1;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "url", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UrlPostRequestWorker extends CoroutineWorker {
    public static final /* synthetic */ KProperty[] a;

    static {
        d02 d02Var = new d02(UrlPostRequestWorker.class);
        p32.a.getClass();
        a = new KProperty[]{d02Var};
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(dy dyVar) throws Throwable {
        b bVar;
        Map mapUnmodifiableMap;
        UrlPostRequestWorker urlPostRequestWorker = this;
        if (dyVar instanceof b) {
            bVar = (b) dyVar;
            int i = bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.v = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(urlPostRequestWorker, (fy) dyVar);
            }
        } else {
            bVar = new b(urlPostRequestWorker, (fy) dyVar);
        }
        b bVar2 = bVar;
        Object objH = bVar2.t;
        int i2 = bVar2.v;
        if (i2 == 0) {
            wz2.a0(objH);
            byte[] bArr = null;
            zx0 zx0VarA = com.moloco.sdk.service_locator.j.a();
            mapUnmodifiableMap = Collections.unmodifiableMap(urlPostRequestWorker.getInputData().a);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Sending request to " + c(mapUnmodifiableMap), null, false, 12, null);
            Object obj = urlPostRequestWorker.getInputData().a.get("body");
            if (obj instanceof Byte[]) {
                Byte[] bArr2 = (Byte[]) obj;
                bArr = new byte[bArr2.length];
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    bArr[i3] = bArr2[i3].byteValue();
                }
            }
            byte[] bArr3 = bArr;
            if (bArr3 == null) {
                return new ListenableWorker.Result.Failure();
            }
            String strB = urlPostRequestWorker.getInputData().b("contentType");
            if (strB != null) {
                rx rxVar = rx.e;
                rx rxVarQ = l7.q(strB);
                if (rxVarQ != null) {
                    String strB2 = urlPostRequestWorker.getInputData().b("contentEncoding");
                    String strC = c(mapUnmodifiableMap);
                    bVar2.r = urlPostRequestWorker;
                    bVar2.s = mapUnmodifiableMap;
                    bVar2.v = 1;
                    objH = t1.h(zx0VarA, strC, bArr3, rxVarQ, strB2, bVar2);
                    dz dzVar = dz.a;
                    if (objH == dzVar) {
                        return dzVar;
                    }
                }
            }
            return new ListenableWorker.Result.Failure();
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Map map = bVar2.s;
        UrlPostRequestWorker urlPostRequestWorker2 = bVar2.r;
        wz2.a0(objH);
        mapUnmodifiableMap = map;
        urlPostRequestWorker = urlPostRequestWorker2;
        boolean zBooleanValue = ((Boolean) objH).booleanValue();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Request to " + c(mapUnmodifiableMap) + " was successful: " + zBooleanValue, null, false, 12, null);
        if (zBooleanValue) {
            return ListenableWorker.Result.a();
        }
        return urlPostRequestWorker.getRunAttemptCount() >= 5 ? new ListenableWorker.Result.Failure() : new ListenableWorker.Result.Retry();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlPostRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(t1.b(context), workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public static final String c(Map map) {
        map.getClass();
        return (String) ep0.s(a[0].getName(), map);
    }
}
