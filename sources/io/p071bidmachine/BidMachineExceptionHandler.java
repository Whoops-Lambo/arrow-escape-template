package io.p071bidmachine;

import android.content.Context;
import defpackage.az2;
import io.p071bidmachine.media3.extractor.ts.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/BidMachineExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Landroid/content/Context;", "applicationContext", "baseUncaughtExceptionHandler", "<init>", "(Landroid/content/Context;Ljava/lang/Thread$UncaughtExceptionHandler;)V", "Ljava/lang/Thread;", "thread", "", "throwable", "Laz2;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BidMachineExceptionHandler implements Thread.UncaughtExceptionHandler {

    @NotNull
    private final Context applicationContext;

    @Nullable
    private final Thread.UncaughtExceptionHandler baseUncaughtExceptionHandler;

    public BidMachineExceptionHandler(@NotNull Context context, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        context.getClass();
        this.applicationContext = context;
        this.baseUncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable throwable) {
        az2 az2Var;
        thread.getClass();
        throwable.getClass();
        try {
            Context.saveCrashToFile(throwable, this.applicationContext);
        } catch (Throwable unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.baseUncaughtExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, throwable);
            az2Var = az2.a;
        } else {
            az2Var = null;
        }
        if (az2Var != null) {
            return;
        }
        System.exit(1);
        y.j("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
