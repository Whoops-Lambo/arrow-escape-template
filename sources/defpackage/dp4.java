package defpackage;

import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzpg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dp4 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public dp4(zznt zzntVar, zzpg zzpgVar, Runnable runnable) {
        this.a = 6;
        this.c = zzpgVar;
        this.b = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[Catch: CancellationException -> 0x0078, ExecutionException -> 0x007a, TryCatch #11 {CancellationException -> 0x0078, ExecutionException -> 0x007a, blocks: (B:17:0x005d, B:19:0x0073, B:32:0x0085, B:34:0x0096, B:36:0x00a2, B:42:0x00b2, B:44:0x00b6, B:26:0x007c, B:47:0x00e3), top: B:163:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2 A[Catch: CancellationException -> 0x0078, ExecutionException -> 0x007a, TRY_LEAVE, TryCatch #11 {CancellationException -> 0x0078, ExecutionException -> 0x007a, blocks: (B:17:0x005d, B:19:0x0073, B:32:0x0085, B:34:0x0096, B:36:0x00a2, B:42:0x00b2, B:44:0x00b6, B:26:0x007c, B:47:0x00e3), top: B:163:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02e1, code lost:
    
        if (r6 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ea, code lost:
    
        r6 = r6 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02eb, code lost:
    
        ((java.lang.Runnable) r25.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f2, code lost:
    
        r25.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02fc, code lost:
    
        r7 = defpackage.tu4.f.b();
        r8 = java.util.logging.Level.SEVERE;
        r0 = java.lang.String.valueOf((java.lang.Runnable) r25.b);
        r11 = new java.lang.StringBuilder(r0.length() + 35);
        r11.append("Exception while executing runnable ");
        r11.append(r0);
        r7.logp(r8, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", r11.toString(), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0328, code lost:
    
        r25.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x032b, code lost:
    
        r25.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x032d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp4.run():void");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    String string = runnable.toString();
                    return jc1.o("SequentialExecutorWorker{running=", string, new StringBuilder(string.length() + 34), "}");
                }
                int i = ((tu4) this.c).e;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                return jc1.o("SequentialExecutorWorker{state=", str, new StringBuilder(str.length() + 32), "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dp4(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ dp4(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public /* synthetic */ dp4(tu4 tu4Var) {
        this.a = 1;
        this.c = tu4Var;
    }
}
