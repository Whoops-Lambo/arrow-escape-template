package com.farimarwat.grizzly;

import com.farimarwat.grizzly.anrmonitor.AnrMonitor;
import com.farimarwat.grizzly.crashmonitor.CrashMonitor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/farimarwat/grizzly/GrizzlyMonitor;", "", "Laz2;", "start", "()V", "stop", "Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;", "getAnrMonitor", "()Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;", "setAnrMonitor", "(Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;)V", "anrMonitor", "Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "getCrashMonitor", "()Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "setCrashMonitor", "(Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;)V", "crashMonitor", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GrizzlyMonitor {
    @NotNull
    AnrMonitor getAnrMonitor();

    @NotNull
    CrashMonitor getCrashMonitor();

    void setAnrMonitor(@NotNull AnrMonitor anrMonitor);

    void setCrashMonitor(@NotNull CrashMonitor crashMonitor);

    void start();

    void stop();
}
