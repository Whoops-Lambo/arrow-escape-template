package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tj2 extends Writer {
    public final /* synthetic */ int a;
    public final Appendable b;
    public final CharSequence c;

    public tj2(StringBuilder sb) {
        this.a = 1;
        this.c = new xx4();
        this.b = sb;
    }

    private final void d() {
    }

    private final void k() {
    }

    private final void o() {
    }

    private final void q() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((StringBuilder) this.b).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        int i = this.a;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = this.a;
        Appendable appendable = this.b;
        CharSequence charSequence = this.c;
        switch (i3) {
            case 0:
                sj2 sj2Var = (sj2) charSequence;
                sj2Var.a = cArr;
                appendable.append(sj2Var, i, i2 + i);
                break;
            default:
                xx4 xx4Var = (xx4) charSequence;
                xx4Var.a = cArr;
                xx4Var.b = null;
                ((StringBuilder) appendable).append((CharSequence) xx4Var, i, i2 + i);
                break;
        }
    }

    public tj2(Appendable appendable) {
        this.a = 0;
        this.c = new sj2();
        this.b = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 1:
                ((StringBuilder) this.b).append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 1:
                append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        switch (this.a) {
            case 1:
                Objects.requireNonNull(str);
                ((StringBuilder) this.b).append((CharSequence) str, i, i2 + i);
                break;
            default:
                super.write(str, i, i2);
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        switch (this.a) {
            case 0:
                this.b.append((char) i);
                break;
            default:
                ((StringBuilder) this.b).append((char) i);
                break;
        }
    }
}
