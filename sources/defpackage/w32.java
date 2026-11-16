package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w32 implements Serializable {
    public final Pattern a;

    public w32(String str, int i) {
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.a = patternCompile;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new v32(strPattern, pattern.flags());
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    public static vh1 b(w32 w32Var, String str) {
        w32Var.getClass();
        str.getClass();
        Matcher matcher = w32Var.a.matcher(str);
        matcher.getClass();
        return uu.a(matcher, 0, str);
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final boolean c(String str) {
        str.getClass();
        return this.a.matcher(str).matches();
    }

    public final String d(String str, String str2) {
        str.getClass();
        str2.getClass();
        String strReplaceAll = this.a.matcher(str).replaceAll(str2);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final List f(String str) {
        str.getClass();
        int iEnd = 0;
        dk2.j0(0);
        Matcher matcher = this.a.matcher(str);
        if (!matcher.find()) {
            return eu.y(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(iEnd, str.length()).toString());
        return arrayList;
    }

    public w32(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.a = patternCompile;
    }

    public w32(Pattern pattern) {
        this.a = pattern;
    }
}
