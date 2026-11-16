package io.p071bidmachine;

import io.p071bidmachine.core.a;
import io.p071bidmachine.utils.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/bidmachine/AdCridThreadHandler;", "", "", "crid", "<init>", "(Ljava/lang/String;)V", "Laz2;", "destroy", "()V", "Lio/bidmachine/utils/i;", "tag", "Lio/bidmachine/utils/i;", "name", "Ljava/lang/String;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Ljava/lang/Thread;", "thread", "Ljava/lang/Thread;", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdCridThreadHandler {

    @NotNull
    private final String name;

    @NotNull
    private final Runnable runnable;

    @NotNull
    private final i tag;

    @Nullable
    private Thread thread;

    public final void destroy() {
        Thread thread = this.thread;
        if (thread != null) {
            thread.interrupt();
        }
        this.thread = null;
        a.c(this.tag, this.name + " stopped");
    }

    public AdCridThreadHandler(@NotNull String str) {
        str.getClass();
        this.tag = new i("AdCridThreadManager");
        String strConcat = "io.bidmachine.crid.".concat(str);
        this.name = strConcat;
        c0 c0Var = new c0(this, 1);
        this.runnable = c0Var;
        Thread thread = new Thread(c0Var, strConcat);
        thread.start();
        this.thread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$0(AdCridThreadHandler adCridThreadHandler) {
        adCridThreadHandler.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        try {
            a.c(adCridThreadHandler.tag, adCridThreadHandler.name + " started");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException unused) {
            threadCurrentThread.interrupt();
        }
    }
}
