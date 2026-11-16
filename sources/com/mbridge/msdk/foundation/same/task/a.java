package com.mbridge.msdk.foundation.same.task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements Runnable {
    public static long id;
    public InterfaceC1430a mListener;
    public b mState = b.READY;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC1430a {
        void a(b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public abstract void cancelTask();

    public abstract void pauseTask(boolean z);

    public abstract void runTask();

    private void setState(b bVar) {
        this.mState = bVar;
        InterfaceC1430a interfaceC1430a = this.mListener;
        if (interfaceC1430a != null) {
            interfaceC1430a.a(bVar);
        }
    }

    public final void cancel() {
        b bVar = this.mState;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            setState(bVar2);
            cancelTask();
        }
    }

    public final long getId() {
        return id;
    }

    public b getState() {
        return this.mState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == b.READY) {
                setState(b.RUNNING);
                runTask();
                setState(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setOnStateChangeListener(InterfaceC1430a interfaceC1430a) {
        this.mListener = interfaceC1430a;
    }

    public final void setPause(boolean z) {
        b bVar = this.mState;
        b bVar2 = b.PAUSE;
        if (bVar == bVar2 || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        if (z) {
            setState(bVar2);
        } else {
            setState(b.RUNNING);
        }
        pauseTask(z);
    }

    public a() {
        id++;
    }
}
