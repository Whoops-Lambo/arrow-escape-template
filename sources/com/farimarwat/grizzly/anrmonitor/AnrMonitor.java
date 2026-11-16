package com.farimarwat.grizzly.anrmonitor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\u000bR\u001c\u0010\u0011\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u001a\u001a\u00020\u00158&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/farimarwat/grizzly/anrmonitor/AnrMonitor;", "", "", "Ljava/lang/StackTraceElement;", "stack", "", "duration", "Laz2;", "handleAnr", "([Ljava/lang/StackTraceElement;J)V", "startMonitor", "()V", "stopMonitor", "getMDuration", "()J", "setMDuration", "(J)V", "mDuration", "getMTicker", "setMTicker", "mTicker", "", "getMTester", "()I", "setMTester", "(I)V", "mTester", "getMThreshold", "setMThreshold", "mThreshold", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnrMonitor {
    long getMDuration();

    int getMTester();

    long getMThreshold();

    long getMTicker();

    void handleAnr(@NotNull StackTraceElement[] stack, long duration);

    void setMDuration(long j);

    void setMTester(int i);

    void setMThreshold(long j);

    void setMTicker(long j);

    void startMonitor();

    void stopMonitor();
}
