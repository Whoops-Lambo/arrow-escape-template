package com.farimarwat.grizzly.anrmonitor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/farimarwat/grizzly/anrmonitor/AnrMonitorException;", "", "title", "", "stacktrace", "", "Ljava/lang/StackTraceElement;", "(Ljava/lang/String;[Ljava/lang/StackTraceElement;)V", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnrMonitorException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnrMonitorException(@NotNull String str, @NotNull StackTraceElement[] stackTraceElementArr) {
        super(str);
        str.getClass();
        stackTraceElementArr.getClass();
        setStackTrace(stackTraceElementArr);
    }
}
