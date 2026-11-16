package com.farimarwat.grizzly.anrmonitor;

import android.os.Handler;
import android.os.Looper;
import defpackage.n8;
import defpackage.z6;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ%\u0010\u000f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/farimarwat/grizzly/anrmonitor/AnrMonitorImpl;", "Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;", "", "mTicker", "mThreshold", "<init>", "(JJ)V", "Laz2;", "startMonitor", "()V", "stopMonitor", "", "Ljava/lang/StackTraceElement;", "stack", "duration", "handleAnr", "([Ljava/lang/StackTraceElement;J)V", "J", "getMTicker", "()J", "setMTicker", "(J)V", "getMThreshold", "setMThreshold", "mDuration", "getMDuration", "setMDuration", "", "mTester", "I", "getMTester", "()I", "setMTester", "(I)V", "Ljava/lang/Thread;", "mThread", "Ljava/lang/Thread;", "", "running", "Z", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnrMonitorImpl implements AnrMonitor {
    private long mDuration;

    @NotNull
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private int mTester;

    @Nullable
    private Thread mThread;
    private long mThreshold;
    private long mTicker;
    private boolean running;

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public void startMonitor() {
        this.running = true;
        Thread thread = new Thread(new z6(this, 0));
        this.mThread = thread;
        thread.start();
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public long getMDuration() {
        return this.mDuration;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public int getMTester() {
        return this.mTester;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public long getMThreshold() {
        return this.mThreshold;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public long getMTicker() {
        return this.mTicker;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public void setMDuration(long j) {
        this.mDuration = j;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public void setMTester(int i) {
        this.mTester = i;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public void setMThreshold(long j) {
        this.mThreshold = j;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public void setMTicker(long j) {
        this.mTicker = j;
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public void stopMonitor() {
        Thread thread = this.mThread;
        if (thread != null) {
            thread.interrupt();
        }
        this.mThread = null;
    }

    public AnrMonitorImpl(long j, long j2) {
        this.mTicker = j;
        this.mThreshold = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startMonitor$lambda$1(AnrMonitorImpl anrMonitorImpl) throws AnrMonitorException {
        anrMonitorImpl.getClass();
        while (!Thread.currentThread().isInterrupted()) {
            anrMonitorImpl.setMDuration(anrMonitorImpl.getMTicker() + anrMonitorImpl.getMDuration());
            anrMonitorImpl.mHandler.post(new z6(anrMonitorImpl, 1));
            if (anrMonitorImpl.getMDuration() >= anrMonitorImpl.getMThreshold() && anrMonitorImpl.getMTester() == 1) {
                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                stackTrace.getClass();
                anrMonitorImpl.handleAnr(stackTrace, anrMonitorImpl.getMDuration());
            }
            try {
                Thread.sleep(anrMonitorImpl.getMTicker());
                if (anrMonitorImpl.getMTester() == 0) {
                    anrMonitorImpl.setMTester(1);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startMonitor$lambda$1$lambda$0(AnrMonitorImpl anrMonitorImpl) {
        anrMonitorImpl.getClass();
        anrMonitorImpl.setMTester(0);
        anrMonitorImpl.setMDuration(0L);
    }

    @Override // com.farimarwat.grizzly.anrmonitor.AnrMonitor
    public void handleAnr(@NotNull StackTraceElement[] stack, long duration) throws AnrMonitorException {
        String methodName;
        stack.getClass();
        StackTraceElement stackTraceElement = (StackTraceElement) n8.e0(stack);
        if (stackTraceElement != null) {
            methodName = stackTraceElement.getMethodName();
        } else {
            methodName = null;
        }
        throw new AnrMonitorException("Method:" + methodName + " is blocking Main Thread for atleast " + duration, stack);
    }
}
