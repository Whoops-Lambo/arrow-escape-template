package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vh1 {
    public final Matcher a;
    public final CharSequence b;
    public final uh1 c;
    public th1 d;

    public final List a() {
        if (this.d == null) {
            this.d = new th1(this);
        }
        th1 th1Var = this.d;
        th1Var.getClass();
        return th1Var;
    }

    public vh1(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new uh1(this);
    }
}
