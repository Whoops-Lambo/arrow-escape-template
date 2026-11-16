package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.internal.q0;
import io.p071bidmachine.media3.exoplayer.mediacodec.c;
import io.p071bidmachine.media3.exoplayer.mediacodec.d;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class r9 extends Handler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public r9(q0 q0Var) {
        this.a = 1;
        this.b = q0Var;
    }

    private final void a(Message message) {
        d dVar = (d) this.b;
        int i = message.what;
        c cVar = null;
        if (i == 1) {
            c cVar2 = (c) message.obj;
            try {
                dVar.a.queueInputBuffer(cVar2.a, 0, cVar2.b, cVar2.d, cVar2.e);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = dVar.d;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            cVar = cVar2;
        } else if (i == 2) {
            c cVar3 = (c) message.obj;
            int i2 = cVar3.a;
            MediaCodec.CryptoInfo cryptoInfo = cVar3.c;
            long j = cVar3.d;
            int i3 = cVar3.e;
            try {
                synchronized (d.h) {
                    try {
                        dVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = dVar.d;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            cVar = cVar3;
        } else if (i == 3) {
            dVar.e.c();
        } else if (i != 4) {
            AtomicReference atomicReference3 = dVar.d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                dVar.a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = dVar.d;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (cVar != null) {
            ArrayDeque arrayDeque = d.g;
            synchronized (arrayDeque) {
                arrayDeque.add(cVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        da5 da5Var;
        ArrayDeque arrayDeque;
        Object obj = null;
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) this.b;
                t9Var.getClass();
                int i = message.what;
                if (i == 0) {
                    s9 s9Var = (s9) message.obj;
                    try {
                        t9Var.a.queueInputBuffer(s9Var.a, s9Var.b, s9Var.c, s9Var.e, s9Var.f);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = t9Var.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    obj = s9Var;
                } else if (i == 1) {
                    s9 s9Var2 = (s9) message.obj;
                    int i2 = s9Var2.a;
                    int i3 = s9Var2.b;
                    MediaCodec.CryptoInfo cryptoInfo = s9Var2.d;
                    long j = s9Var2.e;
                    int i4 = s9Var2.f;
                    try {
                        synchronized (t9.h) {
                            t9Var.a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                            break;
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = t9Var.d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    obj = s9Var2;
                } else if (i != 2) {
                    AtomicReference atomicReference3 = t9Var.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    t9Var.e.open();
                }
                if (obj != null) {
                    ArrayDeque arrayDeque2 = t9.g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(obj);
                        break;
                    }
                    return;
                }
                return;
            case 1:
                Set set = lz.a;
                if (set.contains(this)) {
                    return;
                }
                try {
                    if (set.contains(this)) {
                        return;
                    }
                    try {
                        message.getClass();
                        q0 q0Var = (q0) this.b;
                        if (message.what == q0Var.g) {
                            Bundle data = message.getData();
                            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                                q0Var.d(null);
                            } else {
                                q0Var.d(data);
                            }
                            try {
                                q0Var.a.unbindService(q0Var);
                                return;
                            } catch (IllegalArgumentException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        lz.a(this, th);
                        return;
                    }
                    lz.a(this, th);
                    return;
                } catch (Throwable th2) {
                    lz.a(this, th2);
                    return;
                }
            case 2:
                a(message);
                return;
            default:
                ea5 ea5Var = (ea5) this.b;
                ea5Var.getClass();
                int i5 = message.what;
                if (i5 != 1) {
                    if (i5 == 2) {
                        da5Var = (da5) message.obj;
                        int i6 = da5Var.a;
                        MediaCodec.CryptoInfo cryptoInfo2 = da5Var.c;
                        long j2 = da5Var.d;
                        int i7 = da5Var.e;
                        try {
                            if (Build.VERSION.SDK_INT < 31) {
                                synchronized (ea5.h) {
                                    ea5Var.a.queueSecureInputBuffer(i6, 0, cryptoInfo2, j2, i7);
                                }
                            } else {
                                ea5Var.a.queueSecureInputBuffer(i6, 0, cryptoInfo2, j2, i7);
                            }
                            break;
                        } catch (RuntimeException e3) {
                            AtomicReference atomicReference4 = ea5Var.d;
                            while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                            }
                        }
                    } else if (i5 == 3) {
                        ea5Var.e.a();
                    } else if (i5 != 4) {
                        AtomicReference atomicReference5 = ea5Var.d;
                        IllegalStateException illegalStateException2 = new IllegalStateException(String.valueOf(i5));
                        while (!atomicReference5.compareAndSet(null, illegalStateException2) && atomicReference5.get() == null) {
                        }
                    } else {
                        try {
                            ea5Var.a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e4) {
                            AtomicReference atomicReference6 = ea5Var.d;
                            while (!atomicReference6.compareAndSet(null, e4) && atomicReference6.get() == null) {
                            }
                        }
                    }
                    if (obj != null) {
                        arrayDeque = ea5.g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(obj);
                            break;
                        }
                        return;
                    }
                    return;
                }
                da5Var = (da5) message.obj;
                try {
                    ea5Var.a.queueInputBuffer(da5Var.a, 0, da5Var.b, da5Var.d, da5Var.e);
                    break;
                } catch (RuntimeException e5) {
                    AtomicReference atomicReference7 = ea5Var.d;
                    while (!atomicReference7.compareAndSet(null, e5) && atomicReference7.get() == null) {
                    }
                }
                obj = da5Var;
                if (obj != null) {
                    arrayDeque = ea5.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(obj);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }
}
