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
import defpackage.p32;
import defpackage.wz2;
import defpackage.zx0;
import io.p071bidmachine.t1;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlGetRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "url", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UrlGetRequestWorker extends CoroutineWorker {
    public static final /* synthetic */ KProperty[] a;

    static {
        d02 d02Var = new d02(UrlGetRequestWorker.class);
        p32.a.getClass();
        a = new KProperty[]{d02Var};
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(dy dyVar) throws Throwable {
        a aVar;
        Map mapUnmodifiableMap;
        if (dyVar instanceof a) {
            aVar = (a) dyVar;
            int i = aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.v = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (fy) dyVar);
            }
        } else {
            aVar = new a(this, (fy) dyVar);
        }
        Object objG = aVar.t;
        int i2 = aVar.v;
        if (i2 == 0) {
            wz2.a0(objG);
            zx0 zx0VarA = com.moloco.sdk.service_locator.j.a();
            mapUnmodifiableMap = Collections.unmodifiableMap(getInputData().a);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Sending request to " + c(mapUnmodifiableMap), null, false, 12, null);
            String strC = c(mapUnmodifiableMap);
            aVar.r = this;
            aVar.s = mapUnmodifiableMap;
            aVar.v = 1;
            objG = t1.g(zx0VarA, strC, aVar);
            dz dzVar = dz.a;
            if (objG == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Map map = aVar.s;
            UrlGetRequestWorker urlGetRequestWorker = aVar.r;
            wz2.a0(objG);
            mapUnmodifiableMap = map;
            this = urlGetRequestWorker;
        }
        if (((Boolean) objG).booleanValue()) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "[Success] Sent request to " + c(mapUnmodifiableMap), null, false, 12, null);
            return ListenableWorker.Result.a();
        }
        if (this.getRunAttemptCount() >= 5) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "[Failure] Request to " + c(mapUnmodifiableMap), null, false, 12, null);
            return new ListenableWorker.Result.Failure();
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "[Failure][Retrying] Request to " + c(mapUnmodifiableMap), null, false, 12, null);
        return new ListenableWorker.Result.Retry();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlGetRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(t1.b(context), workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public static final String c(Map map) {
        map.getClass();
        return (String) ep0.s(a[0].getName(), map);
    }
}
