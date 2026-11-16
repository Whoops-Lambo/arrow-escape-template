package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class p91 {
    public final String a;

    public static p91 c() {
        return new p91(String.valueOf(','));
    }

    public p91(String str) {
        str.getClass();
        this.a = str;
    }

    public final void a(StringBuilder sb, Iterator it) {
        CharSequence string;
        CharSequence string2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    string = (CharSequence) next;
                } else {
                    string = next.toString();
                }
                sb.append(string);
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        string2 = (CharSequence) next2;
                    } else {
                        string2 = next2.toString();
                    }
                    sb.append(string2);
                }
            }
        } catch (IOException e) {
            d.p(e);
        }
    }

    public final String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
