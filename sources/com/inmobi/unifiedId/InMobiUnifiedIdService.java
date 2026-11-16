package com.inmobi.unifiedId;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.AbstractC3890an;
import com.inmobi.media.AbstractC4211ma;
import com.inmobi.media.AbstractC4221mk;
import com.inmobi.media.AbstractC4247ni;
import com.inmobi.media.AbstractC4350ra;
import com.inmobi.media.AbstractC4563z4;
import com.inmobi.media.C4378sa;
import com.inmobi.media.C4434ua;
import com.inmobi.media.C4461va;
import com.inmobi.media.C4488wa;
import com.inmobi.media.Cb;
import com.inmobi.media.D7;
import com.inmobi.media.Db;
import com.inmobi.media.Jk;
import com.inmobi.media.Oi;
import com.inmobi.media.Vm;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pp1;
import defpackage.tb5;
import defpackage.wz2;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "Laz2;", "push", "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;Ldy;)Ljava/lang/Object;", "fetchUnifiedIdsInternal", "reset", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiUnifiedIdService {

    @NotNull
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final Mutex b = new pp1();

    @VisibleForTesting
    public static /* synthetic */ void isPushCalled$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, dy dyVar) {
        C4461va c4461va;
        boolean zBooleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        if (dyVar instanceof C4461va) {
            c4461va = (C4461va) dyVar;
            int i = c4461va.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4461va.b = i - Integer.MIN_VALUE;
            } else {
                c4461va = new C4461va(dyVar);
            }
        } else {
            c4461va = new C4461va(dyVar);
        }
        Object obj = c4461va.a;
        int i2 = c4461va.b;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj);
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
        }
        wz2.a0(obj);
        Objects.toString(inMobiUserDataModel);
        Oi oi = Jk.a;
        boolean enabled = ((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            reset();
        }
        if (!enabled || AbstractC3890an.c()) {
            return az2Var;
        }
        Boolean bool = AbstractC4247ni.b;
        boolean zEquals = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = AbstractC4221mk.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                AbstractC4247ni.b = Boolean.valueOf(Cb.a(context, "user_info_store").a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC4247ni.b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            return az2Var;
        }
        D7 d7 = D7.a;
        if (inMobiUserDataModel == null && D7.b == null) {
            zEquals = true;
        } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = D7.b) != null) {
            zEquals = inMobiUserDataModel.equals(inMobiUserDataModel2);
        }
        if (zEquals && a.get()) {
            return az2Var;
        }
        c4461va.b = 1;
        if (D7.a(inMobiUserDataModel, c4461va) != dzVar) {
        }
        a.set(true);
        Vm vm = Vm.a;
        c4461va.b = 2;
        return vm.a((fy) c4461va) == dzVar ? dzVar : az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r8 == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$resetInternal(defpackage.dy r8) {
        /*
            boolean r0 = r8 instanceof com.inmobi.media.C4515xa
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.xa r0 = (com.inmobi.media.C4515xa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            com.inmobi.media.xa r0 = new com.inmobi.media.xa
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.b
            az2 r2 = defpackage.az2.a
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            dz r7 = defpackage.dz.a
            if (r1 == 0) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.wz2.a0(r8)
            goto L5f
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r8)
            return r6
        L34:
            defpackage.wz2.a0(r8)
            goto L49
        L38:
            defpackage.wz2.a0(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.unifiedId.InMobiUnifiedIdService.a
            r8.set(r5)
            r0.b = r4
            java.lang.Object r8 = com.inmobi.media.D7.a(r6, r0)
            if (r8 != r7) goto L49
            goto L5e
        L49:
            com.inmobi.media.Vm r8 = com.inmobi.media.Vm.a
            r0.b = r3
            com.inmobi.media.Oi r8 = com.inmobi.media.Vm.b
            com.inmobi.media.Um r1 = new com.inmobi.media.Um
            r1.<init>(r6)
            java.lang.Object r8 = com.inmobi.media.AbstractC4038g4.a(r8, r1, r0)
            if (r8 != r7) goto L5b
            goto L5c
        L5b:
            r8 = r2
        L5c:
            if (r8 != r7) goto L5f
        L5e:
            return r7
        L5f:
            com.inmobi.media.AbstractC4350ra.b(r6)
            com.inmobi.media.AbstractC4350ra.a(r6)
            com.inmobi.media.AbstractC4350ra.d = r5
            com.inmobi.media.AbstractC4350ra.c = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.access$resetInternal(dy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        if (a(r11, r0) == r8) goto L68;
     */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object fetchUnifiedIdsInternal$media_release(@org.jetbrains.annotations.Nullable com.inmobi.unifiedId.InMobiUnifiedIdInterface r11, @org.jetbrains.annotations.NotNull defpackage.dy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface, dy):java.lang.Object");
    }

    @NotNull
    public final AtomicBoolean isPushCalled() {
        return a;
    }

    public static final void fetchUnifiedIds(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (AbstractC4221mk.c()) {
            tb5.t(AbstractC4211ma.d, null, null, new C4378sa(inMobiUnifiedIdInterface, null), 3);
            return;
        }
        throw new SdkNotInitializedException("InMobiUnifiedIdService");
    }

    public static final void push(@Nullable InMobiUserDataModel inMobiUserDataModel) {
        Objects.toString(inMobiUserDataModel);
        if (AbstractC4221mk.c()) {
            tb5.t(AbstractC4211ma.d, null, null, new C4434ua(inMobiUserDataModel, null), 3);
            return;
        }
        throw new SdkNotInitializedException("InMobiUnifiedIdService");
    }

    public static final void reset() {
        if (AbstractC4221mk.c()) {
            tb5.t(AbstractC4211ma.d, null, null, new C4488wa(null), 3);
            return;
        }
        throw new SdkNotInitializedException("InMobiUnifiedIdService");
    }

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, dy dyVar) {
        JSONObject jSONObjectB = AbstractC4350ra.b();
        boolean zB = AbstractC3890an.b(jSONObjectB);
        dz dzVar = dz.a;
        az2 az2Var = az2.a;
        if (!zB && jSONObjectB != null && AbstractC3890an.c(jSONObjectB)) {
            Object objA = Vm.a(inMobiUnifiedIdInterface, dyVar);
            return objA == dzVar ? objA : az2Var;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (AbstractC3890an.b(jSONObjectB)) {
                if (a.get()) {
                    Object objA2 = Vm.a(inMobiUnifiedIdInterface, dyVar);
                    return objA2 == dzVar ? objA2 : az2Var;
                }
                AbstractC3890an.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            } else {
                AbstractC3890an.a(inMobiUnifiedIdInterface, jSONObjectB, null);
            }
        }
        return az2Var;
    }
}
