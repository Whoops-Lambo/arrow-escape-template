package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzea;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dh4 implements zzea {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzi(int i, int i2) {
        return this.a.sendEmptyMessageDelayed(i, i2);
    }

    public static /* synthetic */ void a(bh4 bh4Var) {
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(bh4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static bh4 c() {
        bh4 bh4Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                bh4Var = arrayList.isEmpty() ? new bh4() : (bh4) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bh4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void b(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean h(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean i(o64 o64Var) {
        return this.a.postDelayed(o64Var, 1000L);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean j(zzdz zzdzVar) {
        bh4 bh4Var = (bh4) zzdzVar;
        Message message = bh4Var.a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        bh4Var.a = null;
        a(bh4Var);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean k(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final Looper zza() {
        return this.a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzb(int i) {
        return this.a.hasMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzh(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl() {
        this.a.removeCallbacksAndMessages(null);
    }

    public dh4(Handler handler) {
        this.a = handler;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final bh4 g(int i) {
        bh4 bh4VarC = c();
        bh4VarC.a = this.a.obtainMessage(i);
        return bh4VarC;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final bh4 l(int i, Object obj) {
        bh4 bh4VarC = c();
        bh4VarC.a = this.a.obtainMessage(i, obj);
        return bh4VarC;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final bh4 zze(int i, int i2, int i3) {
        bh4 bh4VarC = c();
        bh4VarC.a = this.a.obtainMessage(i, i2, i3);
        return bh4VarC;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final bh4 zzf(Object obj) {
        bh4 bh4VarC = c();
        bh4VarC.a = this.a.obtainMessage(31, 0, 0, obj);
        return bh4VarC;
    }
}
