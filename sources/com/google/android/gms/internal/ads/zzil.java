package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzil extends zzhx {
    public final int b;

    public zzil(zzia zziaVar, int i, int i2) {
        super(b(2008, 1));
        this.b = 1;
    }

    private static int b(int i, int i2) {
        if (i == 2000) {
            return i2 != 1 ? 2000 : 2001;
        }
        return i;
    }

    public static zzil a(IOException iOException, zzia zziaVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzgvh.a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new zzik(iOException, zziaVar);
        }
        return new zzil(iOException, zziaVar, i2, i);
    }

    public zzil(IOException iOException, zzia zziaVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.b = i2;
    }

    public zzil(String str, zzia zziaVar, int i, int i2) {
        super(str, b(i, i2));
        this.b = i2;
    }

    public zzil(String str, @Nullable IOException iOException, zzia zziaVar, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.b = i2;
    }
}
