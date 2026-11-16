package io.p071bidmachine.media3.datasource;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class i extends IOException {
    public final int a;

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof i) && ((i) cause).a == 2008) {
                return true;
            }
        }
        return false;
    }

    public i(int i) {
        this.a = i;
    }

    public i(@Nullable Throwable th, int i) {
        super(th);
        this.a = i;
    }

    public i(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.a = i;
    }
}
