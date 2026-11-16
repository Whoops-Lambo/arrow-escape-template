package com.farimarwat.grizzly;

import com.farimarwat.grizzly.anrmonitor.AnrMonitor;
import com.farimarwat.grizzly.crashmonitor.CrashMonitor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/farimarwat/grizzly/GrizzlyMonitorImpl;", "Lcom/farimarwat/grizzly/GrizzlyMonitor;", "Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;", "anrMonitor", "Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "crashMonitor", "<init>", "(Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;)V", "Laz2;", "start", "()V", "stop", "Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;", "getAnrMonitor", "()Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;", "setAnrMonitor", "(Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;)V", "Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "getCrashMonitor", "()Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "setCrashMonitor", "(Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;)V", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GrizzlyMonitorImpl implements GrizzlyMonitor {

    @NotNull
    private AnrMonitor anrMonitor;

    @NotNull
    private CrashMonitor crashMonitor;

    @Override // com.farimarwat.grizzly.GrizzlyMonitor
    @NotNull
    public AnrMonitor getAnrMonitor() {
        return this.anrMonitor;
    }

    @Override // com.farimarwat.grizzly.GrizzlyMonitor
    @NotNull
    public CrashMonitor getCrashMonitor() {
        return this.crashMonitor;
    }

    public GrizzlyMonitorImpl(@NotNull AnrMonitor anrMonitor, @NotNull CrashMonitor crashMonitor) {
        anrMonitor.getClass();
        crashMonitor.getClass();
        this.anrMonitor = anrMonitor;
        this.crashMonitor = crashMonitor;
    }

    @Override // com.farimarwat.grizzly.GrizzlyMonitor
    public void setAnrMonitor(@NotNull AnrMonitor anrMonitor) {
        anrMonitor.getClass();
        this.anrMonitor = anrMonitor;
    }

    @Override // com.farimarwat.grizzly.GrizzlyMonitor
    public void setCrashMonitor(@NotNull CrashMonitor crashMonitor) {
        crashMonitor.getClass();
        this.crashMonitor = crashMonitor;
    }

    @Override // com.farimarwat.grizzly.GrizzlyMonitor
    public void start() {
        getCrashMonitor().startMonitor();
        getAnrMonitor().startMonitor();
    }

    @Override // com.farimarwat.grizzly.GrizzlyMonitor
    public void stop() {
        getCrashMonitor().stopMonitor();
        getAnrMonitor().stopMonitor();
    }
}
