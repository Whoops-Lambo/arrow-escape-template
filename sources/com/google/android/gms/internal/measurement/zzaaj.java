package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;
import defpackage.al3;
import defpackage.cl3;
import defpackage.uk3;
import defpackage.vk3;
import defpackage.wk3;
import defpackage.zk3;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaaj extends zzaad {
    public static final uk3 b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            vk3.class.getName().equals(d());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        b = new uk3();
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final uk3 a() {
        return b;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final zzzf b() {
        zzzf zzzfVarZza;
        AtomicReference atomicReference = zk3.f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            return ((zzaai) atomicReference.get()).zza("Phlogger");
        }
        for (int i = 7; i >= 0; i--) {
            char cCharAt = "Phlogger".charAt(i);
            if (cCharAt == '$') {
                strReplace = "Phlogger".replace('$', '.');
                break;
            }
            if (cCharAt == '.') {
                break;
            }
        }
        zk3 zk3Var = new zk3(strReplace);
        if (zk3.c || zk3.d) {
            new zzaah();
            zk3Var.b = new cl3(zk3Var.a);
        } else {
            if (zk3.e) {
                zzaaq zzaaqVar = zzaas.h;
                zzzfVarZza = new zzaaq(Level.OFF, zzaaqVar.b, zzaaqVar.c).zza(zk3Var.a);
            } else {
                zzzfVarZza = null;
            }
            zk3Var.b = zzzfVarZza;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = wk3.a;
        concurrentLinkedQueue.offer(zk3Var);
        if (atomicReference.get() != null) {
            while (true) {
                zk3 zk3Var2 = (zk3) concurrentLinkedQueue.poll();
                if (zk3Var2 == null) {
                    break;
                }
                zk3Var2.b = ((zzaai) atomicReference.get()).zza(zk3Var2.a);
            }
            zk3.e();
        }
        return zk3Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final zzaat c() {
        return al3.b;
    }

    public static String d() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
