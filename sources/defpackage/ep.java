package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ep {
    public final String a;
    public final int b;

    public final boolean equals(Object obj) {
        String str;
        ep epVar = obj instanceof ep ? (ep) obj : null;
        return (epVar == null || (str = epVar.a) == null || !str.equalsIgnoreCase(this.a)) ? false : true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }

    public ep(String str) {
        str.getClass();
        this.a = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        this.b = lowerCase;
    }
}
