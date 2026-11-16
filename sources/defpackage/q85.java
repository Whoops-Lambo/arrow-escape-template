package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q85 implements Appendable {
    public int a = 2;
    public final /* synthetic */ Appendable b;

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        int i = this.a;
        Appendable appendable = this.b;
        if (i == 0) {
            appendable.append(":");
            this.a = 2;
        }
        appendable.append(c);
        this.a--;
        return this;
    }

    public q85(Appendable appendable) {
        this.b = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
