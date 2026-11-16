package com.unity3d.ads.core.log;

import com.singular.sdk.internal.Constants;
import defpackage.d;
import defpackage.sr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH&¢\u0006\u0004\b\u0007\u0010\nJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH&¢\u0006\u0004\b\u000f\u0010\nR\u001c\u0010\u0015\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/log/Logger;", "", "", "message", "Laz2;", "info", "(Ljava/lang/String;)V", "debug", "Lkotlin/Function0;", "fb", "(Lsr0;)V", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "trace", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevelInternal;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)V", "logLevel", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Logger {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                d.u("Super calls with default arguments not supported in this target, function: error");
                return;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                d.u("Super calls with default arguments not supported in this target, function: trace");
                return;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.trace(str, th);
        }
    }

    void debug(@NotNull String message);

    void debug(@NotNull sr0 fb);

    void error(@NotNull String message, @Nullable Throwable e);

    @NotNull
    LogLevelInternal getLogLevel();

    void info(@NotNull String message);

    void setLogLevel(@NotNull LogLevelInternal logLevelInternal);

    void trace(@NotNull String message, @Nullable Throwable e);

    void trace(@NotNull sr0 fb);
}
