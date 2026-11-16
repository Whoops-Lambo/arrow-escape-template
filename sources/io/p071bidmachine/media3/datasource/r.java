package io.p071bidmachine.media3.datasource;

import androidx.annotation.Nullable;
import defpackage.ns1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class r extends i {
    public final k b;
    public final int c;

    private static int b(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public r(k kVar, int i, int i2) {
        super(b(i, i2));
        this.b = kVar;
        this.c = i2;
    }

    public static r c(IOException iOException, k kVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && ns1.B(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new q(iOException, kVar);
        }
        return new r(iOException, kVar, i2, i);
    }

    public r(IOException iOException, k kVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.b = kVar;
        this.c = i2;
    }

    public r(String str, @Nullable IOException iOException, k kVar, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.b = kVar;
        this.c = i2;
    }
}
