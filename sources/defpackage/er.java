package defpackage;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class er {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static volatile Charset d;
    public static volatile Charset e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName(C.UTF16LE_NAME).getClass();
        Charset charsetForName2 = Charset.forName("US-ASCII");
        charsetForName2.getClass();
        b = charsetForName2;
        Charset charsetForName3 = Charset.forName(C.ISO88591_NAME);
        charsetForName3.getClass();
        c = charsetForName3;
    }
}
