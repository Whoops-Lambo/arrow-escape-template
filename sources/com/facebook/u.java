package com.facebook;

import defpackage.ph0;
import defpackage.z61;
import java.security.SecureRandom;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0016\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nB\u0013\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/u;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "a", "com/facebook/t", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class u extends RuntimeException {

    @NotNull
    public static final t a = new t();

    @NotNull
    private static final SecureRandom b = new SecureRandom();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, boolean z) {
        if (z) {
            try {
                ph0 ph0Var = new ph0(str);
                if ((ph0Var.b == null || ph0Var.c == null) ? false : true) {
                    z61.g(ph0Var.a, ph0Var.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    public u(@Nullable String str) {
        super(str);
        if (str != null && a0.r.get() && b.nextInt(100) > 50) {
            com.facebook.internal.b0.a(new s(str, 0), com.facebook.internal.z.ErrorReport);
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public u() {
    }

    public u(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public u(@Nullable Throwable th) {
        super(th);
    }
}
