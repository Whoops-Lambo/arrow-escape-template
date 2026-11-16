package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface xf1 {
    boolean d();

    void f(Throwable th);

    boolean g();

    void h(String str);

    default boolean i(int i) {
        char c;
        String str;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return n();
        }
        if (c == '\n') {
            return k();
        }
        if (c == 20) {
            return d();
        }
        if (c == 30) {
            return j();
        }
        if (c == '(') {
            return g();
        }
        if (i == 1) {
            str = "ERROR";
        } else if (i == 2) {
            str = "WARN";
        } else if (i == 3) {
            str = "INFO";
        } else if (i != 4) {
            str = i != 5 ? "null" : "TRACE";
        } else {
            str = "DEBUG";
        }
        dr0.r(str, "] not recognized.", "Level [");
        return false;
    }

    boolean j();

    boolean k();

    boolean n();
}
